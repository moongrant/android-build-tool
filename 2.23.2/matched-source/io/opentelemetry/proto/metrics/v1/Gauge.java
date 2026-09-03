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
public final class Gauge extends GeneratedMessageLite<Gauge, Builder> implements GaugeOrBuilder {
    public static final int DATA_POINTS_FIELD_NUMBER = 1;
    private static final Gauge DEFAULT_INSTANCE;
    private static volatile Parser<Gauge> PARSER;
    private Internal.ProtobufList<NumberDataPoint> dataPoints_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.Gauge$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32626OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32626OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32626OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Gauge, Builder> implements GaugeOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((Gauge) this.instance).addAllDataPoints(arrayList);
        }

        private Builder() {
            super(Gauge.DEFAULT_INSTANCE);
        }
    }

    static {
        Gauge gauge = new Gauge();
        DEFAULT_INSTANCE = gauge;
        GeneratedMessageLite.registerDefaultInstance(Gauge.class, gauge);
    }

    private Gauge() {
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
    public void clearDataPoints() {
        this.dataPoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataPointsIsMutable() {
        if (this.dataPoints_.isModifiable()) {
            return;
        }
        this.dataPoints_ = GeneratedMessageLite.mutableCopy(this.dataPoints_);
    }

    public static Gauge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Gauge parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Gauge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Gauge parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Gauge> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataPoints(int i) {
        ensureDataPointsIsMutable();
        this.dataPoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataPoints(int i, NumberDataPoint numberDataPoint) {
        numberDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.set(i, numberDataPoint);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32626OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Gauge();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoints_", NumberDataPoint.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Gauge> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Gauge.class) {
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

    public static Builder newBuilder(Gauge gauge) {
        return DEFAULT_INSTANCE.createBuilder(gauge);
    }

    public static Gauge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Gauge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Gauge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Gauge parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(int i, NumberDataPoint numberDataPoint) {
        numberDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(i, numberDataPoint);
    }

    public static Gauge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Gauge parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Gauge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Gauge parseFrom(InputStream inputStream) throws IOException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Gauge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Gauge parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Gauge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Gauge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
