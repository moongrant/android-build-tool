package io.opentelemetry.sdk.metrics.internal.descriptor;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.internal.descriptor.$AutoValue_MetricDescriptor, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
abstract class C$AutoValue_MetricDescriptor extends MetricDescriptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33365OooO0OO;

    public C$AutoValue_MetricDescriptor(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f33363OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f33364OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f33365OooO0OO = str3;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor
    public final String OooO0O0() {
        return this.f33364OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor
    public final String OooO0OO() {
        return this.f33363OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor
    public final String OooO0Oo() {
        return this.f33365OooO0OO;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricDescriptor)) {
            return false;
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
        return this.f33363OooO00o.equals(metricDescriptor.OooO0OO()) && this.f33364OooO0O0.equals(metricDescriptor.OooO0O0()) && this.f33365OooO0OO.equals(metricDescriptor.OooO0Oo());
    }

    public int hashCode() {
        return ((((this.f33363OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f33364OooO0O0.hashCode()) * 1000003) ^ this.f33365OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricDescriptor{name=");
        sb.append(this.f33363OooO00o);
        sb.append(", description=");
        sb.append(this.f33364OooO0O0);
        sb.append(", unit=");
        return o0O00o0.OooO0O0(sb, this.f33365OooO0OO, "}");
    }
}
