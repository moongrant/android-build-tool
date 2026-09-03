package io.opentelemetry.sdk.metrics.common;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class InstrumentDescriptor {
    public static InstrumentDescriptor OooO00o(String str, String str2, String str3, InstrumentType instrumentType, InstrumentValueType instrumentValueType) {
        return new AutoValue_InstrumentDescriptor(str, str2, str3, instrumentType, instrumentValueType);
    }

    public abstract String OooO0O0();

    public abstract String OooO0OO();

    public abstract InstrumentType OooO0Oo();

    public abstract InstrumentValueType OooO0o();

    public abstract String OooO0o0();

    @Memoized
    public abstract int hashCode();
}
