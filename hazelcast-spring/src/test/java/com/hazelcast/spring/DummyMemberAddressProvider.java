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

import com.hazelcast.instance.EndpointQualifier;
import com.hazelcast.cluster.Address;
import com.hazelcast.spi.MemberAddressProvider;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Properties;

public class DummyMemberAddressProvider implements MemberAddressProvider {

    private final Properties properties;

    public DummyMemberAddressProvider(Properties properties) {
        this.properties = properties;
    }

    @Override
    public InetSocketAddress getBindAddress() {
        try {
            return new Address("localhost", 1234).getInetSocketAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InetSocketAddress getPublicAddress() {
        try {
            return new Address("localhost", 1234).getInetSocketAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InetSocketAddress getBindAddress(EndpointQualifier qualifier) {
        return getBindAddress();
    }

    @Override
    public InetSocketAddress getPublicAddress(EndpointQualifier qualifier) {
        return getPublicAddress();
    }

    public Properties getProperties() {
        return properties;
    }
}
