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

package com.hazelcast.spring.context;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.concurrent.Callable;

@SpringAware
public class SomeTransactionalTask implements Callable<Void>, Serializable {

    @Transactional
    public Void call() throws Exception {
        return null;
    }
}
