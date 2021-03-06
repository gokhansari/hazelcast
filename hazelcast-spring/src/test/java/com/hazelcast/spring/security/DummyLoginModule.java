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

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.util.Map;

public class DummyLoginModule implements LoginModule {

    @Override
    public boolean abort() throws LoginException {
        return false;
    }

    @Override
    public boolean commit() throws LoginException {
        return false;
    }

    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
    }

    @Override
    public boolean login() throws LoginException {
        return false;
    }

    @Override
    public boolean logout() throws LoginException {
        return false;
    }
}
