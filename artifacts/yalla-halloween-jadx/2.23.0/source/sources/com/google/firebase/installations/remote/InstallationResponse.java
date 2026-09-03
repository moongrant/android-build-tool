package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @Nullable
    public abstract TokenResult OooO00o();

    @Nullable
    public abstract String OooO0O0();

    @Nullable
    public abstract String OooO0OO();

    @Nullable
    public abstract ResponseCode OooO0Oo();

    @Nullable
    public abstract String OooO0o0();
}
