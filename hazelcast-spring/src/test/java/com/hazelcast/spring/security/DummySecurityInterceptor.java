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

package com.hazelcast.spring.security;

import com.hazelcast.security.Credentials;
import com.hazelcast.security.Parameters;
import com.hazelcast.security.SecurityInterceptor;

import java.security.AccessControlException;

public class DummySecurityInterceptor implements SecurityInterceptor {

    @Override
    public void before(Credentials credentials, String objectType, String objectName,
                       String methodName, Parameters parameters) throws AccessControlException {
    }

    @Override
    public void after(Credentials credentials, String objectType, String objectName, String methodName, Parameters parameters) {
    }
}
