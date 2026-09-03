package io.opentelemetry.sdk.metrics.view;

import com.google.auto.value.AutoValue;
import io.opentelemetry.compat.Predicate;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.internal.view.StringPredicates;
import javax.annotation.concurrent.Immutable;
import p172o00OooOo.o000O0O0;

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
        o000O0O0 o000o0o1 = StringPredicates.f33403OooO00o;
        builder.f33419OooO0O0 = o000o0o1;
        AutoValue_MeterSelector.Builder builder2 = new AutoValue_MeterSelector.Builder();
        builder2.f33424OooO00o = o000o0o1;
        builder2.f33425OooO0O0 = o000o0o1;
        builder2.f33426OooO0OO = o000o0o1;
        builder.f33420OooO0OO = new AutoValue_MeterSelector(o000o0o1, o000o0o1, o000o0o1);
        return builder;
    }

    public abstract Predicate<String> OooO0O0();

    public abstract InstrumentType OooO0OO();

    public abstract MeterSelector OooO0Oo();
}
