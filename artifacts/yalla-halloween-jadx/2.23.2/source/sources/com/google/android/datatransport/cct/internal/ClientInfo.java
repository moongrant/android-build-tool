package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import p236o00oOoo0.o000O00;

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
    public abstract o000O00 OooO00o();

    @Nullable
    public abstract ClientType OooO0O0();
}
