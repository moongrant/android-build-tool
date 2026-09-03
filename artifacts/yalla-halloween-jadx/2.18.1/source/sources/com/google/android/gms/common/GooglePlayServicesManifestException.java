package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f15122Oooo0o;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.f15122Oooo0o = i;
    }

    public int getActualVersion() {
        return this.f15122Oooo0o;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
