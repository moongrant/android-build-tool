package io.opentelemetry.proto.trace.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class TraceIdRatioBased extends GeneratedMessageLite<TraceIdRatioBased, Builder> implements TraceIdRatioBasedOrBuilder {
    private static final TraceIdRatioBased DEFAULT_INSTANCE;
    private static volatile Parser<TraceIdRatioBased> PARSER = null;
    public static final int SAMPLINGRATIO_FIELD_NUMBER = 1;
    private double samplingRatio_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.TraceIdRatioBased$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32650OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32650OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32650OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TraceIdRatioBased, Builder> implements TraceIdRatioBasedOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(TraceIdRatioBased.DEFAULT_INSTANCE);
        }
    }

    static {
        TraceIdRatioBased traceIdRatioBased = new TraceIdRatioBased();
        DEFAULT_INSTANCE = traceIdRatioBased;
        GeneratedMessageLite.registerDefaultInstance(TraceIdRatioBased.class, traceIdRatioBased);
    }

    private TraceIdRatioBased() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSamplingRatio() {
        this.samplingRatio_ = 0.0d;
    }

    public static TraceIdRatioBased getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceIdRatioBased parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceIdRatioBased parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TraceIdRatioBased> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSamplingRatio(double d) {
        this.samplingRatio_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32650OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceIdRatioBased();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"samplingRatio_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TraceIdRatioBased> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TraceIdRatioBased.class) {
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

    public double getSamplingRatio() {
        return this.samplingRatio_;
    }

    public static Builder newBuilder(TraceIdRatioBased traceIdRatioBased) {
        return DEFAULT_INSTANCE.createBuilder(traceIdRatioBased);
    }

    public static TraceIdRatioBased parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceIdRatioBased parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TraceIdRatioBased parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TraceIdRatioBased parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TraceIdRatioBased parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceIdRatioBased parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TraceIdRatioBased parseFrom(InputStream inputStream) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceIdRatioBased parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceIdRatioBased parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TraceIdRatioBased parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceIdRatioBased) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
