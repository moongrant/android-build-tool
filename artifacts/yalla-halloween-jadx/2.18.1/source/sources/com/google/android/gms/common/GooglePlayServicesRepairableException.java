package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f15123Oooo0oO;

    public GooglePlayServicesRepairableException(int i, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.f15123Oooo0oO = i;
    }

    public int getConnectionStatusCode() {
        return this.f15123Oooo0oO;
    }
}
