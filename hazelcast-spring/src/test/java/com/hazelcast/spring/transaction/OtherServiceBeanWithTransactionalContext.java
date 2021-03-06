/*
* Copyright 2020 Hazelcast Inc.
*
* Licensed under the Hazelcast Community License (the "License"); you may not use
* this file except in compliance with the License. You may obtain a copy of the
* License at
*
* http://hazelcast.com/hazelcast-community-license
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OF ANY KIND, either express or implied. See the License for the
* specific language governing permissions and limitations under the License.
*/

package com.hazelcast.spring.transaction;

import com.hazelcast.transaction.TransactionalTaskContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OtherServiceBeanWithTransactionalContext {

    TransactionalTaskContext transactionalContext;

    public OtherServiceBeanWithTransactionalContext(TransactionalTaskContext transactionalContext) {
        this.transactionalContext = transactionalContext;
    }

    @Transactional
    public void put(DummyObject object) {
        transactionalContext.getMap("dummyObjectMap").put(object.getId(), object);
    }

    @Transactional
    public void putWithException(DummyObject object) {
        put(object);
        throw new RuntimeException("oops, let's rollback in " + this.getClass().getSimpleName() + "!");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void putInNewTransaction(DummyObject object) {
        put(object);
    }
}
