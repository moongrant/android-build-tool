package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14622OooO0o0;

    public GooglePlayServicesRepairableException(int i, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.f14622OooO0o0 = i;
    }

    public int getConnectionStatusCode() {
        return this.f14622OooO0o0;
    }
}
