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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Sum extends GeneratedMessageLite<Sum, Builder> implements SumOrBuilder {
    public static final int AGGREGATION_TEMPORALITY_FIELD_NUMBER = 2;
    public static final int DATA_POINTS_FIELD_NUMBER = 1;
    private static final Sum DEFAULT_INSTANCE;
    public static final int IS_MONOTONIC_FIELD_NUMBER = 3;
    private static volatile Parser<Sum> PARSER;
    private int aggregationTemporality_;
    private Internal.ProtobufList<NumberDataPoint> dataPoints_ = GeneratedMessageLite.emptyProtobufList();
    private boolean isMonotonic_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.Sum$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32636OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32636OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32636OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Sum, Builder> implements SumOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((Sum) this.instance).addAllDataPoints(arrayList);
        }

        public final void OooO0Oo(AggregationTemporality aggregationTemporality) {
            copyOnWrite();
            ((Sum) this.instance).setAggregationTemporality(aggregationTemporality);
        }

        public final void OooO0o0(boolean z) {
            copyOnWrite();
            ((Sum) this.instance).setIsMonotonic(z);
        }

        private Builder() {
            super(Sum.DEFAULT_INSTANCE);
        }
    }

    static {
        Sum sum = new Sum();
        DEFAULT_INSTANCE = sum;
        GeneratedMessageLite.registerDefaultInstance(Sum.class, sum);
    }

    private Sum() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataPoints(Iterable<? extends NumberDataPoint> iterable) {
        ensureDataPointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataPoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(NumberDataPoint numberDataPoint) {
        numberDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(numberDataPoint);
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

    public static Sum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sum> parser() {
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
    public void setDataPoints(int i, NumberDataPoint numberDataPoint) {
        numberDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.set(i, numberDataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMonotonic(boolean z) {
        this.isMonotonic_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32636OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Sum();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\u0007", new Object[]{"dataPoints_", NumberDataPoint.class, "aggregationTemporality_", "isMonotonic_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sum> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Sum.class) {
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

    public NumberDataPoint getDataPoints(int i) {
        return this.dataPoints_.get(i);
    }

    public int getDataPointsCount() {
        return this.dataPoints_.size();
    }

    public List<NumberDataPoint> getDataPointsList() {
        return this.dataPoints_;
    }

    public NumberDataPointOrBuilder getDataPointsOrBuilder(int i) {
        return this.dataPoints_.get(i);
    }

    public List<? extends NumberDataPointOrBuilder> getDataPointsOrBuilderList() {
        return this.dataPoints_;
    }

    public boolean getIsMonotonic() {
        return this.isMonotonic_;
    }

    public static Builder newBuilder(Sum sum) {
        return DEFAULT_INSTANCE.createBuilder(sum);
    }

    public static Sum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(int i, NumberDataPoint numberDataPoint) {
        numberDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(i, numberDataPoint);
    }

    public static Sum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sum parseFrom(InputStream inputStream) throws IOException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sum parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
