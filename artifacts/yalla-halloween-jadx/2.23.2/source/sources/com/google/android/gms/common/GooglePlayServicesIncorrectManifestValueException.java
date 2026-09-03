package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import p046Oooooo0.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        super(i, o0O00o0.OooO00o("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, " but found ", i, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
