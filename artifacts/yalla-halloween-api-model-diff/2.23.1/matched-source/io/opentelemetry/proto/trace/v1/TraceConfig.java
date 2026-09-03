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
public final class TraceConfig extends GeneratedMessageLite<TraceConfig, Builder> implements TraceConfigOrBuilder {
    public static final int CONSTANT_SAMPLER_FIELD_NUMBER = 1;
    private static final TraceConfig DEFAULT_INSTANCE;
    public static final int MAX_NUMBER_OF_ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int MAX_NUMBER_OF_ATTRIBUTES_PER_LINK_FIELD_NUMBER = 8;
    public static final int MAX_NUMBER_OF_ATTRIBUTES_PER_TIMED_EVENT_FIELD_NUMBER = 6;
    public static final int MAX_NUMBER_OF_LINKS_FIELD_NUMBER = 7;
    public static final int MAX_NUMBER_OF_TIMED_EVENTS_FIELD_NUMBER = 5;
    private static volatile Parser<TraceConfig> PARSER = null;
    public static final int RATE_LIMITING_SAMPLER_FIELD_NUMBER = 3;
    public static final int TRACE_ID_RATIO_BASED_FIELD_NUMBER = 2;
    private long maxNumberOfAttributesPerLink_;
    private long maxNumberOfAttributesPerTimedEvent_;
    private long maxNumberOfAttributes_;
    private long maxNumberOfLinks_;
    private long maxNumberOfTimedEvents_;
    private int samplerCase_ = 0;
    private Object sampler_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.TraceConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32646OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32646OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32646OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TraceConfig, Builder> implements TraceConfigOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(TraceConfig.DEFAULT_INSTANCE);
        }
    }

    public enum SamplerCase {
        CONSTANT_SAMPLER(1),
        TRACE_ID_RATIO_BASED(2),
        RATE_LIMITING_SAMPLER(3),
        SAMPLER_NOT_SET(0);

        private final int value;

        SamplerCase(int i) {
            this.value = i;
        }
    }

    static {
        TraceConfig traceConfig = new TraceConfig();
        DEFAULT_INSTANCE = traceConfig;
        GeneratedMessageLite.registerDefaultInstance(TraceConfig.class, traceConfig);
    }

    private TraceConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstantSampler() {
        if (this.samplerCase_ == 1) {
            this.samplerCase_ = 0;
            this.sampler_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxNumberOfAttributes() {
        this.maxNumberOfAttributes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxNumberOfAttributesPerLink() {
        this.maxNumberOfAttributesPerLink_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxNumberOfAttributesPerTimedEvent() {
        this.maxNumberOfAttributesPerTimedEvent_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxNumberOfLinks() {
        this.maxNumberOfLinks_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxNumberOfTimedEvents() {
        this.maxNumberOfTimedEvents_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRateLimitingSampler() {
        if (this.samplerCase_ == 3) {
            this.samplerCase_ = 0;
            this.sampler_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampler() {
        this.samplerCase_ = 0;
        this.sampler_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceIdRatioBased() {
        if (this.samplerCase_ == 2) {
            this.samplerCase_ = 0;
            this.sampler_ = null;
        }
    }

    public static TraceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConstantSampler(ConstantSampler constantSampler) {
        constantSampler.getClass();
        if (this.samplerCase_ != 1 || this.sampler_ == ConstantSampler.getDefaultInstance()) {
            this.sampler_ = constantSampler;
        } else {
            this.sampler_ = ConstantSampler.newBuilder((ConstantSampler) this.sampler_).mergeFrom(constantSampler).buildPartial();
        }
        this.samplerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRateLimitingSampler(RateLimitingSampler rateLimitingSampler) {
        rateLimitingSampler.getClass();
        if (this.samplerCase_ != 3 || this.sampler_ == RateLimitingSampler.getDefaultInstance()) {
            this.sampler_ = rateLimitingSampler;
        } else {
            this.sampler_ = RateLimitingSampler.newBuilder((RateLimitingSampler) this.sampler_).mergeFrom(rateLimitingSampler).buildPartial();
        }
        this.samplerCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceIdRatioBased(TraceIdRatioBased traceIdRatioBased) {
        traceIdRatioBased.getClass();
        if (this.samplerCase_ != 2 || this.sampler_ == TraceIdRatioBased.getDefaultInstance()) {
            this.sampler_ = traceIdRatioBased;
        } else {
            this.sampler_ = TraceIdRatioBased.newBuilder((TraceIdRatioBased) this.sampler_).mergeFrom(traceIdRatioBased).buildPartial();
        }
        this.samplerCase_ = 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TraceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConstantSampler(ConstantSampler constantSampler) {
        constantSampler.getClass();
        this.sampler_ = constantSampler;
        this.samplerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxNumberOfAttributes(long j) {
        this.maxNumberOfAttributes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxNumberOfAttributesPerLink(long j) {
        this.maxNumberOfAttributesPerLink_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxNumberOfAttributesPerTimedEvent(long j) {
        this.maxNumberOfAttributesPerTimedEvent_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxNumberOfLinks(long j) {
        this.maxNumberOfLinks_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxNumberOfTimedEvents(long j) {
        this.maxNumberOfTimedEvents_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRateLimitingSampler(RateLimitingSampler rateLimitingSampler) {
        rateLimitingSampler.getClass();
        this.sampler_ = rateLimitingSampler;
        this.samplerCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdRatioBased(TraceIdRatioBased traceIdRatioBased) {
        traceIdRatioBased.getClass();
        this.sampler_ = traceIdRatioBased;
        this.samplerCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32646OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceConfig();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002", new Object[]{"sampler_", "samplerCase_", ConstantSampler.class, TraceIdRatioBased.class, RateLimitingSampler.class, "maxNumberOfAttributes_", "maxNumberOfTimedEvents_", "maxNumberOfAttributesPerTimedEvent_", "maxNumberOfLinks_", "maxNumberOfAttributesPerLink_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TraceConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TraceConfig.class) {
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

    public ConstantSampler getConstantSampler() {
        return this.samplerCase_ == 1 ? (ConstantSampler) this.sampler_ : ConstantSampler.getDefaultInstance();
    }

    public long getMaxNumberOfAttributes() {
        return this.maxNumberOfAttributes_;
    }

    public long getMaxNumberOfAttributesPerLink() {
        return this.maxNumberOfAttributesPerLink_;
    }

    public long getMaxNumberOfAttributesPerTimedEvent() {
        return this.maxNumberOfAttributesPerTimedEvent_;
    }

    public long getMaxNumberOfLinks() {
        return this.maxNumberOfLinks_;
    }

    public long getMaxNumberOfTimedEvents() {
        return this.maxNumberOfTimedEvents_;
    }

    public RateLimitingSampler getRateLimitingSampler() {
        return this.samplerCase_ == 3 ? (RateLimitingSampler) this.sampler_ : RateLimitingSampler.getDefaultInstance();
    }

    public SamplerCase getSamplerCase() {
        int i = this.samplerCase_;
        if (i == 0) {
            return SamplerCase.SAMPLER_NOT_SET;
        }
        if (i == 1) {
            return SamplerCase.CONSTANT_SAMPLER;
        }
        if (i == 2) {
            return SamplerCase.TRACE_ID_RATIO_BASED;
        }
        if (i != 3) {
            return null;
        }
        return SamplerCase.RATE_LIMITING_SAMPLER;
    }

    public TraceIdRatioBased getTraceIdRatioBased() {
        return this.samplerCase_ == 2 ? (TraceIdRatioBased) this.sampler_ : TraceIdRatioBased.getDefaultInstance();
    }

    public boolean hasConstantSampler() {
        return this.samplerCase_ == 1;
    }

    public boolean hasRateLimitingSampler() {
        return this.samplerCase_ == 3;
    }

    public boolean hasTraceIdRatioBased() {
        return this.samplerCase_ == 2;
    }

    public static Builder newBuilder(TraceConfig traceConfig) {
        return DEFAULT_INSTANCE.createBuilder(traceConfig);
    }

    public static TraceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TraceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TraceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TraceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TraceConfig parseFrom(InputStream inputStream) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TraceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TraceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TraceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
