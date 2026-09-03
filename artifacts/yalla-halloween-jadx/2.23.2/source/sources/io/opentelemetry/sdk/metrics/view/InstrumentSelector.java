package io.opentelemetry.sdk.metrics.view;

import com.google.auto.value.AutoValue;
import io.opentelemetry.compat.Predicate;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.internal.view.StringPredicates;
import javax.annotation.concurrent.Immutable;
import p087o000o00.OooOo;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class InstrumentSelector {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract InstrumentSelector OooO00o();

        public abstract Builder OooO0O0(Predicate<String> predicate);

        public abstract Builder OooO0OO(InstrumentType instrumentType);
    }

    public static Builder OooO00o() {
        AutoValue_InstrumentSelector.Builder builder = new AutoValue_InstrumentSelector.Builder();
        OooOo oooOo = StringPredicates.f32869OooO00o;
        builder.f32885OooO0O0 = oooOo;
        AutoValue_MeterSelector.Builder builder2 = new AutoValue_MeterSelector.Builder();
        builder2.f32890OooO00o = oooOo;
        builder2.f32891OooO0O0 = oooOo;
        builder2.f32892OooO0OO = oooOo;
        builder.f32886OooO0OO = new AutoValue_MeterSelector(oooOo, oooOo, oooOo);
        return builder;
    }

    public abstract Predicate<String> OooO0O0();

    public abstract InstrumentType OooO0OO();

    public abstract MeterSelector OooO0Oo();
}
