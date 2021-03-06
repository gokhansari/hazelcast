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

import com.hazelcast.spi.discovery.DiscoveryNode;
import com.hazelcast.spi.discovery.DiscoveryStrategy;
import com.hazelcast.spi.partitiongroup.PartitionGroupStrategy;

import java.util.Collections;
import java.util.Map;

public class DummyDiscoveryStrategy implements DiscoveryStrategy {

    @Override
    public void start() {
    }

    @Override
    public Iterable<DiscoveryNode> discoverNodes() {
        return null;
    }

    @Override
    public void destroy() {
    }

    @Override
    public PartitionGroupStrategy getPartitionGroupStrategy() {
        return null;
    }

    @Override
    public Map<String, String> discoverLocalMetadata() {
        return Collections.emptyMap();
    }
}
