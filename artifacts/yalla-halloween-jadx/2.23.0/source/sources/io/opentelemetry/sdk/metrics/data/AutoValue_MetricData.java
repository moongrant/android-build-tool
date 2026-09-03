package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MetricData extends MetricData {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f33281OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Resource f33282OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InstrumentationLibraryInfo f33283OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f33284OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final String f33285OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final MetricDataType f33286OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Data<?> f33287OooOOO0;

    public AutoValue_MetricData(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, String str, String str2, String str3, MetricDataType metricDataType, Data<?> data) {
        if (resource == null) {
            throw new NullPointerException("Null resource");
        }
        this.f33282OooO0oO = resource;
        if (instrumentationLibraryInfo == null) {
            throw new NullPointerException("Null instrumentationLibraryInfo");
        }
        this.f33283OooO0oo = instrumentationLibraryInfo;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f33281OooO = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f33284OooOO0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f33285OooOO0O = str3;
        if (metricDataType == null) {
            throw new NullPointerException("Null type");
        }
        this.f33286OooOO0o = metricDataType;
        this.f33287OooOOO0 = data;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final InstrumentationLibraryInfo OooO() {
        return this.f33283OooO0oo;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final Data<?> OooO0oO() {
        return this.f33287OooOOO0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final String OooO0oo() {
        return this.f33284OooOO0;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final String OooOO0() {
        return this.f33281OooO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final Resource OooOO0O() {
        return this.f33282OooO0oO;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final MetricDataType OooOO0o() {
        return this.f33286OooOO0o;
    }

    @Override // io.opentelemetry.sdk.metrics.data.MetricData
    public final String OooOOO0() {
        return this.f33285OooOO0O;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricData)) {
            return false;
        }
        MetricData metricData = (MetricData) obj;
        return this.f33282OooO0oO.equals(metricData.OooOO0O()) && this.f33283OooO0oo.equals(metricData.OooO()) && this.f33281OooO.equals(metricData.OooOO0()) && this.f33284OooOO0.equals(metricData.OooO0oo()) && this.f33285OooOO0O.equals(metricData.OooOOO0()) && this.f33286OooOO0o.equals(metricData.OooOO0o()) && this.f33287OooOOO0.equals(metricData.OooO0oO());
    }

    public final int hashCode() {
        return ((((((((((((this.f33282OooO0oO.hashCode() ^ 1000003) * 1000003) ^ this.f33283OooO0oo.hashCode()) * 1000003) ^ this.f33281OooO.hashCode()) * 1000003) ^ this.f33284OooOO0.hashCode()) * 1000003) ^ this.f33285OooOO0O.hashCode()) * 1000003) ^ this.f33286OooOO0o.hashCode()) * 1000003) ^ this.f33287OooOOO0.hashCode();
    }

    public final String toString() {
        return "MetricData{resource=" + this.f33282OooO0oO + ", instrumentationLibraryInfo=" + this.f33283OooO0oo + ", name=" + this.f33281OooO + ", description=" + this.f33284OooOO0 + ", unit=" + this.f33285OooOO0O + ", type=" + this.f33286OooOO0o + ", data=" + this.f33287OooOOO0 + "}";
    }
}
