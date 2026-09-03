package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import p285o0O0O0o.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
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
    public abstract OooOOO OooO00o();

    @Nullable
    public abstract ClientType OooO0O0();
}
