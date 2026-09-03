package io.opentelemetry.exporter.otlp.internal;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class ProtoFieldInfo {
    public static ProtoFieldInfo OooO00o(int i, int i2, String str) {
        return new AutoValue_ProtoFieldInfo(i, i2, CodedOutputStream.OooO00o((i << 3) | 0), str);
    }

    public abstract int OooO0O0();

    public abstract String OooO0OO();

    public abstract int OooO0Oo();

    public abstract int OooO0o0();
}
