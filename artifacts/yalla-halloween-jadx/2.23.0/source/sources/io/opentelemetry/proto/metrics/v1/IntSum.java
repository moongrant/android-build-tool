package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class IntSum extends GeneratedMessageLite<IntSum, Builder> implements IntSumOrBuilder {
    public static final int AGGREGATION_TEMPORALITY_FIELD_NUMBER = 2;
    public static final int DATA_POINTS_FIELD_NUMBER = 1;
    private static final IntSum DEFAULT_INSTANCE;
    public static final int IS_MONOTONIC_FIELD_NUMBER = 3;
    private static volatile Parser<IntSum> PARSER;
    private int aggregationTemporality_;
    private Internal.ProtobufList<IntDataPoint> dataPoints_ = GeneratedMessageLite.emptyProtobufList();
    private boolean isMonotonic_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.IntSum$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33168OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33168OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33168OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<IntSum, Builder> implements IntSumOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(IntSum.DEFAULT_INSTANCE);
        }
    }

    static {
        IntSum intSum = new IntSum();
        DEFAULT_INSTANCE = intSum;
        GeneratedMessageLite.registerDefaultInstance(IntSum.class, intSum);
    }

    private IntSum() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataPoints(Iterable<? extends IntDataPoint> iterable) {
        ensureDataPointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataPoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(IntDataPoint intDataPoint) {
        intDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(intDataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregationTemporality() {
        this.aggregationTemporality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataPoints() {
        this.dataPoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMonotonic() {
        this.isMonotonic_ = false;
    }

    private void ensureDataPointsIsMutable() {
        if (this.dataPoints_.isModifiable()) {
            return;
        }
        this.dataPoints_ = GeneratedMessageLite.mutableCopy(this.dataPoints_);
    }

    public static IntSum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IntSum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntSum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntSum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IntSum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataPoints(int i) {
        ensureDataPointsIsMutable();
        this.dataPoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregationTemporality(AggregationTemporality aggregationTemporality) {
        this.aggregationTemporality_ = aggregationTemporality.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregationTemporalityValue(int i) {
        this.aggregationTemporality_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataPoints(int i, IntDataPoint intDataPoint) {
        intDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.set(i, intDataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMonotonic(boolean z) {
        this.isMonotonic_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33168OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new IntSum();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\u0007", new Object[]{"dataPoints_", IntDataPoint.class, "aggregationTemporality_", "isMonotonic_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IntSum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IntSum.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public AggregationTemporality getAggregationTemporality() {
        AggregationTemporality aggregationTemporalityOooO00o = AggregationTemporality.OooO00o(this.aggregationTemporality_);
        return aggregationTemporalityOooO00o == null ? AggregationTemporality.UNRECOGNIZED : aggregationTemporalityOooO00o;
    }

    public int getAggregationTemporalityValue() {
        return this.aggregationTemporality_;
    }

    public IntDataPoint getDataPoints(int i) {
        return this.dataPoints_.get(i);
    }

    public int getDataPointsCount() {
        return this.dataPoints_.size();
    }

    public List<IntDataPoint> getDataPointsList() {
        return this.dataPoints_;
    }

    public IntDataPointOrBuilder getDataPointsOrBuilder(int i) {
        return this.dataPoints_.get(i);
    }

    public List<? extends IntDataPointOrBuilder> getDataPointsOrBuilderList() {
        return this.dataPoints_;
    }

    public boolean getIsMonotonic() {
        return this.isMonotonic_;
    }

    public static Builder newBuilder(IntSum intSum) {
        return DEFAULT_INSTANCE.createBuilder(intSum);
    }

    public static IntSum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntSum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntSum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IntSum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(int i, IntDataPoint intDataPoint) {
        intDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(i, intDataPoint);
    }

    public static IntSum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IntSum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IntSum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IntSum parseFrom(InputStream inputStream) throws IOException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntSum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntSum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IntSum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntSum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
