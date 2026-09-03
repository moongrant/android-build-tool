package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class UserRecoverableException extends Exception {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Intent f15143Oooo0o;

    public UserRecoverableException(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.f15143Oooo0o = intent;
    }

    @NonNull
    public Intent getIntent() {
        return new Intent(this.f15143Oooo0o);
    }
}
