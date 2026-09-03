package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes5.dex */
public enum AggregationTemporality implements Internal.EnumLite {
    AGGREGATION_TEMPORALITY_UNSPECIFIED(0),
    AGGREGATION_TEMPORALITY_DELTA(1),
    AGGREGATION_TEMPORALITY_CUMULATIVE(2),
    UNRECOGNIZED(-1);

    public static final int AGGREGATION_TEMPORALITY_CUMULATIVE_VALUE = 2;
    public static final int AGGREGATION_TEMPORALITY_DELTA_VALUE = 1;
    public static final int AGGREGATION_TEMPORALITY_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<AggregationTemporality> internalValueMap = new Internal.EnumLiteMap<AggregationTemporality>() { // from class: io.opentelemetry.proto.metrics.v1.AggregationTemporality.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i) {
            return AggregationTemporality.OooO00o(i);
        }
    };
    private final int value;

    public static final class AggregationTemporalityVerifier implements Internal.EnumVerifier {
        static {
            new AggregationTemporalityVerifier();
        }

        private AggregationTemporalityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return AggregationTemporality.OooO00o(i) != null;
        }
    }

    AggregationTemporality(int i) {
        this.value = i;
    }

    public static AggregationTemporality OooO00o(int i) {
        if (i == 0) {
            return AGGREGATION_TEMPORALITY_UNSPECIFIED;
        }
        if (i == 1) {
            return AGGREGATION_TEMPORALITY_DELTA;
        }
        if (i != 2) {
            return null;
        }
        return AGGREGATION_TEMPORALITY_CUMULATIVE;
    }

    @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
