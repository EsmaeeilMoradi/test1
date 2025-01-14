/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.android.contactsbind;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import com.android.contacts.logging.Logger;
import com.android.contacts.util.DeviceLocalAccountTypeFactory;
/**
 * Creates default bindings for overlays.
 */
public class ObjectFactory {
    public static Logger getLogger() {
        return null;
    }
    public static DeviceLocalAccountTypeFactory getDeviceLocalAccountTypeFactory(Context context) {
        return new DeviceLocalAccountTypeFactory.Default(context);
    }
    public static Fragment getAssistantFragment() {
        return null;
    }
    public static Uri getWelcomeUri() {
        return null;
    }
}