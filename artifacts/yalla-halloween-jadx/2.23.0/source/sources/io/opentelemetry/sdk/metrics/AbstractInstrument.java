package io.opentelemetry.sdk.metrics;

import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractInstrument implements Instrument {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InstrumentDescriptor f33216OooO00o;

    public AbstractInstrument(InstrumentDescriptor instrumentDescriptor) {
        this.f33216OooO00o = instrumentDescriptor;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractInstrument) {
            return this.f33216OooO00o.equals(((AbstractInstrument) obj).f33216OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33216OooO00o.hashCode();
    }
}
