package io.opentelemetry.sdk.metrics.internal.descriptor;

import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MetricDescriptor extends C$AutoValue_MetricDescriptor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @LazyInit
    public volatile transient int f33366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @LazyInit
    public volatile transient boolean f33367OooO0o0;

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.C$AutoValue_MetricDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_MetricDescriptor) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.C$AutoValue_MetricDescriptor
    public final int hashCode() {
        if (!this.f33367OooO0o0) {
            synchronized (this) {
                if (!this.f33367OooO0o0) {
                    this.f33366OooO0Oo = super.hashCode();
                    this.f33367OooO0o0 = true;
                }
            }
        }
        return this.f33366OooO0Oo;
    }
}
