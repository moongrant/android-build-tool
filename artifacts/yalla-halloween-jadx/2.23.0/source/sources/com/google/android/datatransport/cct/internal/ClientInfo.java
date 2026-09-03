package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    @Nullable
    public abstract p189o00o0O0.OooO0O0 OooO00o();

    @Nullable
    public abstract ClientType OooO0O0();
}
