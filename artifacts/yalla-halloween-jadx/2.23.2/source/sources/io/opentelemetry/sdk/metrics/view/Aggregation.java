package io.opentelemetry.sdk.metrics.view;

import com.yalla.yalla.data.db.model.NewFriendsOld;
import io.opentelemetry.compat.Function;
import io.opentelemetry.sdk.internal.ThrottlingLogger;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.aggregator.HistogramAggregatorFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Aggregation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThrottlingLogger f32875OooO00o = new ThrottlingLogger(Logger.getLogger(Aggregation.class.getName()));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final List<Double> f32876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Aggregation f32877OooO0OO;

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.view.Aggregation$1, reason: invalid class name */
    class AnonymousClass1 extends Aggregation {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function f32878OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f32879OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function function, String str) {
            super(0);
            this.f32878OooO0Oo = function;
            this.f32879OooO0o0 = str;
        }

        @Override // io.opentelemetry.sdk.metrics.view.Aggregation
        public final AggregatorFactory OooO00o(InstrumentDescriptor instrumentDescriptor) {
            return (AggregatorFactory) this.f32878OooO0Oo.apply(instrumentDescriptor);
        }

        public final String toString() {
            return this.f32879OooO0o0;
        }
    }

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.view.Aggregation$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32880OooO00o;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            f32880OooO00o = iArr;
            try {
                iArr[InstrumentType.COUNTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32880OooO00o[InstrumentType.UP_DOWN_COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32880OooO00o[InstrumentType.OBSERVABLE_SUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32880OooO00o[InstrumentType.OBSERVABLE_UP_DOWN_SUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32880OooO00o[InstrumentType.HISTOGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32880OooO00o[InstrumentType.OBSERVABLE_GAUGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        final List<Double> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(Double.valueOf(5.0d), Double.valueOf(10.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d), Double.valueOf(250.0d), Double.valueOf(500.0d), Double.valueOf(750.0d), Double.valueOf(1000.0d), Double.valueOf(2500.0d), Double.valueOf(5000.0d), Double.valueOf(7500.0d), Double.valueOf(10000.0d)));
        f32876OooO0O0 = listUnmodifiableList;
        new AnonymousClass1(new OooO0O0(), "none");
        f32877OooO0OO = new AnonymousClass1(new OooO0OO(), NewFriendsOld.State_Default);
        final AggregationTemporality aggregationTemporality = AggregationTemporality.CUMULATIVE;
        OooO0O0(aggregationTemporality);
        new AnonymousClass1(new OooO0o(), "lastValue");
        new AnonymousClass1(new Function() { // from class: io.opentelemetry.sdk.metrics.view.OooO
            @Override // io.opentelemetry.compat.Function
            public final Object apply(Object obj) {
                ThrottlingLogger throttlingLogger = Aggregation.f32875OooO00o;
                return new HistogramAggregatorFactory(aggregationTemporality, listUnmodifiableList);
            }
        }, "explicitBucketHistogram");
    }

    private Aggregation() {
    }

    public /* synthetic */ Aggregation(int i) {
        this();
    }

    public static Aggregation OooO0O0(final AggregationTemporality aggregationTemporality) {
        return new AnonymousClass1(new Function() { // from class: io.opentelemetry.sdk.metrics.view.OooO00o
            @Override // io.opentelemetry.compat.Function
            public final Object apply(Object obj) {
                ThrottlingLogger throttlingLogger = Aggregation.f32875OooO00o;
                return io.opentelemetry.sdk.metrics.internal.aggregator.OooO00o.OooO0O0(aggregationTemporality);
            }
        }, "sum");
    }

    public abstract AggregatorFactory OooO00o(InstrumentDescriptor instrumentDescriptor);
}
