package io.opentelemetry.sdk.metrics.common;

import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstrumentDescriptor extends C$AutoValue_InstrumentDescriptor {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @LazyInit
    public volatile transient int f33243OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @LazyInit
    public volatile transient boolean f33244OooO0oO;

    @Override // io.opentelemetry.sdk.metrics.common.C$AutoValue_InstrumentDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_InstrumentDescriptor) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // io.opentelemetry.sdk.metrics.common.C$AutoValue_InstrumentDescriptor, io.opentelemetry.sdk.metrics.common.InstrumentDescriptor
    public final int hashCode() {
        if (!this.f33244OooO0oO) {
            synchronized (this) {
                if (!this.f33244OooO0oO) {
                    this.f33243OooO0o = super.hashCode();
                    this.f33244OooO0oO = true;
                }
            }
        }
        return this.f33243OooO0o;
    }
}
