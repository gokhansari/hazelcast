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

package com.hazelcast.spring;

import com.hazelcast.map.MapStore;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class DummyStore implements MapStore {

    @Override
    public void store(Object key, Object value) {
        // not implemented
    }

    @Override
    public void storeAll(Map map) {
        // not implemented
    }

    @Override
    public void delete(Object key) {
        // not implemented
    }

    @Override
    public void deleteAll(Collection keys) {
        // not implemented
    }

    @Override
    public Object load(Object key) {
        // not implemented
        return null;
    }

    @Override
    public Map loadAll(Collection keys) {
        // not implemented
        return null;
    }

    @Override
    public Set loadAllKeys() {
        // not implemented
        return null;
    }
}
