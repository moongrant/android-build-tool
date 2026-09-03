package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @Nullable
    public abstract ResponseCode OooO00o();

    @Nullable
    public abstract String OooO0O0();

    @NonNull
    public abstract long OooO0OO();
}
