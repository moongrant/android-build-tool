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
public final class RateLimitingSampler extends GeneratedMessageLite<RateLimitingSampler, Builder> implements RateLimitingSamplerOrBuilder {
    private static final RateLimitingSampler DEFAULT_INSTANCE;
    private static volatile Parser<RateLimitingSampler> PARSER = null;
    public static final int QPS_FIELD_NUMBER = 1;
    private long qps_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.RateLimitingSampler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33178OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33178OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33178OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RateLimitingSampler, Builder> implements RateLimitingSamplerOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(RateLimitingSampler.DEFAULT_INSTANCE);
        }
    }

    static {
        RateLimitingSampler rateLimitingSampler = new RateLimitingSampler();
        DEFAULT_INSTANCE = rateLimitingSampler;
        GeneratedMessageLite.registerDefaultInstance(RateLimitingSampler.class, rateLimitingSampler);
    }

    private RateLimitingSampler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQps() {
        this.qps_ = 0L;
    }

    public static RateLimitingSampler getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RateLimitingSampler parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitingSampler parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RateLimitingSampler> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQps(long j) {
        this.qps_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33178OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new RateLimitingSampler();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"qps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RateLimitingSampler> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RateLimitingSampler.class) {
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

    public long getQps() {
        return this.qps_;
    }

    public static Builder newBuilder(RateLimitingSampler rateLimitingSampler) {
        return DEFAULT_INSTANCE.createBuilder(rateLimitingSampler);
    }

    public static RateLimitingSampler parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitingSampler parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RateLimitingSampler parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RateLimitingSampler parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RateLimitingSampler parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RateLimitingSampler parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RateLimitingSampler parseFrom(InputStream inputStream) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitingSampler parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitingSampler parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RateLimitingSampler parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitingSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
