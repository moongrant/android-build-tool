package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class TokenResult {

    @AutoValue.Builder
    public static abstract class OooO00o {
        @NonNull
        public abstract TokenResult OooO00o();

        @NonNull
        public abstract OooO00o OooO0O0(long j);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static OooO00o OooO00o() {
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o();
        oooO00o.OooO0O0(0L);
        return oooO00o;
    }

    @Nullable
    public abstract ResponseCode OooO0O0();

    @Nullable
    public abstract String OooO0OO();

    @NonNull
    public abstract long OooO0Oo();
}
