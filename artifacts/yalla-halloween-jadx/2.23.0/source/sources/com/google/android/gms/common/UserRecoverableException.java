package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class UserRecoverableException extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Intent f14642OooO0Oo;

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.f14642OooO0Oo = intent;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.f14642OooO0Oo);
    }
}
