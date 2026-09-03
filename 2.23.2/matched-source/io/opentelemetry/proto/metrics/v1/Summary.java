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
public final class Summary extends GeneratedMessageLite<Summary, Builder> implements SummaryOrBuilder {
    public static final int DATA_POINTS_FIELD_NUMBER = 1;
    private static final Summary DEFAULT_INSTANCE;
    private static volatile Parser<Summary> PARSER;
    private Internal.ProtobufList<SummaryDataPoint> dataPoints_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.Summary$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32640OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32640OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32640OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Summary, Builder> implements SummaryOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((Summary) this.instance).addAllDataPoints(arrayList);
        }

        private Builder() {
            super(Summary.DEFAULT_INSTANCE);
        }
    }

    static {
        Summary summary = new Summary();
        DEFAULT_INSTANCE = summary;
        GeneratedMessageLite.registerDefaultInstance(Summary.class, summary);
    }

    private Summary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataPoints(Iterable<? extends SummaryDataPoint> iterable) {
        ensureDataPointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataPoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(SummaryDataPoint summaryDataPoint) {
        summaryDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(summaryDataPoint);
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

    public static Summary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Summary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Summary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Summary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Summary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataPoints(int i) {
        ensureDataPointsIsMutable();
        this.dataPoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataPoints(int i, SummaryDataPoint summaryDataPoint) {
        summaryDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.set(i, summaryDataPoint);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32640OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Summary();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoints_", SummaryDataPoint.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Summary> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Summary.class) {
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

    public SummaryDataPoint getDataPoints(int i) {
        return this.dataPoints_.get(i);
    }

    public int getDataPointsCount() {
        return this.dataPoints_.size();
    }

    public List<SummaryDataPoint> getDataPointsList() {
        return this.dataPoints_;
    }

    public SummaryDataPointOrBuilder getDataPointsOrBuilder(int i) {
        return this.dataPoints_.get(i);
    }

    public List<? extends SummaryDataPointOrBuilder> getDataPointsOrBuilderList() {
        return this.dataPoints_;
    }

    public static Builder newBuilder(Summary summary) {
        return DEFAULT_INSTANCE.createBuilder(summary);
    }

    public static Summary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Summary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Summary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Summary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataPoints(int i, SummaryDataPoint summaryDataPoint) {
        summaryDataPoint.getClass();
        ensureDataPointsIsMutable();
        this.dataPoints_.add(i, summaryDataPoint);
    }

    public static Summary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Summary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Summary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Summary parseFrom(InputStream inputStream) throws IOException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Summary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Summary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Summary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Summary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
