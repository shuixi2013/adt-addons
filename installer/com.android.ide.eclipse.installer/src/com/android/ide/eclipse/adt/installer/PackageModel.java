/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.eclipse.adt.installer;

import com.android.sdklib.internal.repository.Package;
import com.android.sdklib.internal.repository.PlatformToolPackage;
import com.android.sdklib.internal.repository.ToolPackage;

public class PackageModel {

    private Package mPackage;

    private boolean mRequired;

    private boolean mRecommended;

    private boolean mEnabled;

    private boolean installed = false;

    public PackageModel(Package mPackage, boolean mRequired, boolean mRecommended) {
        this.mPackage = mPackage;
        this.mRequired = mRequired;
        this.mRecommended = mRecommended;
        this.mEnabled = mRequired || mRecommended;
    }

    public Package getPackage() {
        return mPackage;
    }

    public void setPackage(Package mPackage) {
        this.mPackage = mPackage;
    }

    public boolean isRequired() {
        return mRequired;
    }

    public boolean isRecommended() {
        return mRecommended;
    }

    public boolean isEnabled() {
        return mEnabled;
    }

    public void setEnabled(boolean mEnabled) {
        this.mEnabled = mEnabled;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

}
