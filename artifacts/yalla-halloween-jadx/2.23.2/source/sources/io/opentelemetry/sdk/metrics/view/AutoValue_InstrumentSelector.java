package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.compat.Predicate;
import io.opentelemetry.sdk.metrics.common.InstrumentType;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstrumentSelector extends InstrumentSelector {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InstrumentType f32881OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Predicate<String> f32882OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MeterSelector f32883OooO0OO;

    public static final class Builder extends InstrumentSelector.Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InstrumentType f32884OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Predicate<String> f32885OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public MeterSelector f32886OooO0OO;

        @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector.Builder
        public final InstrumentSelector OooO00o() {
            Predicate<String> predicate;
            MeterSelector meterSelector;
            InstrumentType instrumentType = this.f32884OooO00o;
            if (instrumentType != null && (predicate = this.f32885OooO0O0) != null && (meterSelector = this.f32886OooO0OO) != null) {
                return new AutoValue_InstrumentSelector(instrumentType, predicate, meterSelector);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f32884OooO00o == null) {
                sb.append(" instrumentType");
            }
            if (this.f32885OooO0O0 == null) {
                sb.append(" instrumentNameFilter");
            }
            if (this.f32886OooO0OO == null) {
                sb.append(" meterSelector");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector.Builder
        public final InstrumentSelector.Builder OooO0O0(Predicate<String> predicate) {
            this.f32885OooO0O0 = predicate;
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector.Builder
        public final InstrumentSelector.Builder OooO0OO(InstrumentType instrumentType) {
            if (instrumentType == null) {
                throw new NullPointerException("Null instrumentType");
            }
            this.f32884OooO00o = instrumentType;
            return this;
        }
    }

    public AutoValue_InstrumentSelector() {
        throw null;
    }

    public AutoValue_InstrumentSelector(InstrumentType instrumentType, Predicate predicate, MeterSelector meterSelector) {
        this.f32881OooO00o = instrumentType;
        this.f32882OooO0O0 = predicate;
        this.f32883OooO0OO = meterSelector;
    }

    @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector
    public final Predicate<String> OooO0O0() {
        return this.f32882OooO0O0;
    }

    @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector
    public final InstrumentType OooO0OO() {
        return this.f32881OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.view.InstrumentSelector
    public final MeterSelector OooO0Oo() {
        return this.f32883OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentSelector)) {
            return false;
        }
        InstrumentSelector instrumentSelector = (InstrumentSelector) obj;
        return this.f32881OooO00o.equals(instrumentSelector.OooO0OO()) && this.f32882OooO0O0.equals(instrumentSelector.OooO0O0()) && this.f32883OooO0OO.equals(instrumentSelector.OooO0Oo());
    }

    public final int hashCode() {
        return ((((this.f32881OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f32882OooO0O0.hashCode()) * 1000003) ^ this.f32883OooO0OO.hashCode();
    }

    public final String toString() {
        return "InstrumentSelector{instrumentType=" + this.f32881OooO00o + ", instrumentNameFilter=" + this.f32882OooO0O0 + ", meterSelector=" + this.f32883OooO0OO + "}";
    }
}
