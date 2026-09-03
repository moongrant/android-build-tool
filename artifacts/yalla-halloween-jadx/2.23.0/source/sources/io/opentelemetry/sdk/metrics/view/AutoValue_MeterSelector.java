package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.compat.Predicate;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MeterSelector extends MeterSelector {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Predicate<String> f33421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Predicate<String> f33422OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Predicate<String> f33423OooO0OO;

    public static final class Builder extends MeterSelector.Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Predicate<String> f33424OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Predicate<String> f33425OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Predicate<String> f33426OooO0OO;
    }

    public AutoValue_MeterSelector() {
        throw null;
    }

    public AutoValue_MeterSelector(Predicate predicate, Predicate predicate2, Predicate predicate3) {
        this.f33421OooO00o = predicate;
        this.f33422OooO0O0 = predicate2;
        this.f33423OooO0OO = predicate3;
    }

    @Override // io.opentelemetry.sdk.metrics.view.MeterSelector
    public final Predicate<String> OooO00o() {
        return this.f33421OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.view.MeterSelector
    public final Predicate<String> OooO0O0() {
        return this.f33423OooO0OO;
    }

    @Override // io.opentelemetry.sdk.metrics.view.MeterSelector
    public final Predicate<String> OooO0OO() {
        return this.f33422OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeterSelector)) {
            return false;
        }
        MeterSelector meterSelector = (MeterSelector) obj;
        return this.f33421OooO00o.equals(meterSelector.OooO00o()) && this.f33422OooO0O0.equals(meterSelector.OooO0OO()) && this.f33423OooO0OO.equals(meterSelector.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f33421OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f33422OooO0O0.hashCode()) * 1000003) ^ this.f33423OooO0OO.hashCode();
    }

    public final String toString() {
        return "MeterSelector{nameFilter=" + this.f33421OooO00o + ", versionFilter=" + this.f33422OooO0O0 + ", schemaUrlFilter=" + this.f33423OooO0OO + "}";
    }
}
