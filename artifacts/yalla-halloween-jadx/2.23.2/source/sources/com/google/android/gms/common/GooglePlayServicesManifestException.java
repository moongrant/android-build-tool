package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f14145OooO0Oo;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.f14145OooO0Oo = i;
    }

    public int getActualVersion() {
        return this.f14145OooO0Oo;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
