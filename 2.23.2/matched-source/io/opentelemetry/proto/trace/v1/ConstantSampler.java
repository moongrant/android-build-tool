package io.opentelemetry.proto.trace.v1;

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

/* JADX INFO: loaded from: classes5.dex */
public final class ConstantSampler extends GeneratedMessageLite<ConstantSampler, Builder> implements ConstantSamplerOrBuilder {
    public static final int DECISION_FIELD_NUMBER = 1;
    private static final ConstantSampler DEFAULT_INSTANCE;
    private static volatile Parser<ConstantSampler> PARSER;
    private int decision_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.ConstantSampler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32643OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32643OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32643OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ConstantSampler, Builder> implements ConstantSamplerOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(ConstantSampler.DEFAULT_INSTANCE);
        }
    }

    public enum ConstantDecision implements Internal.EnumLite {
        ALWAYS_OFF(0),
        ALWAYS_ON(1),
        ALWAYS_PARENT(2),
        UNRECOGNIZED(-1);

        public static final int ALWAYS_OFF_VALUE = 0;
        public static final int ALWAYS_ON_VALUE = 1;
        public static final int ALWAYS_PARENT_VALUE = 2;
        private static final Internal.EnumLiteMap<ConstantDecision> internalValueMap = new Internal.EnumLiteMap<ConstantDecision>() { // from class: io.opentelemetry.proto.trace.v1.ConstantSampler.ConstantDecision.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return ConstantDecision.OooO00o(i);
            }
        };
        private final int value;

        public static final class ConstantDecisionVerifier implements Internal.EnumVerifier {
            static {
                new ConstantDecisionVerifier();
            }

            private ConstantDecisionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return ConstantDecision.OooO00o(i) != null;
            }
        }

        ConstantDecision(int i) {
            this.value = i;
        }

        public static ConstantDecision OooO00o(int i) {
            if (i == 0) {
                return ALWAYS_OFF;
            }
            if (i == 1) {
                return ALWAYS_ON;
            }
            if (i != 2) {
                return null;
            }
            return ALWAYS_PARENT;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        ConstantSampler constantSampler = new ConstantSampler();
        DEFAULT_INSTANCE = constantSampler;
        GeneratedMessageLite.registerDefaultInstance(ConstantSampler.class, constantSampler);
    }

    private ConstantSampler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecision() {
        this.decision_ = 0;
    }

    public static ConstantSampler getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConstantSampler parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConstantSampler parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ConstantSampler> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecision(ConstantDecision constantDecision) {
        this.decision_ = constantDecision.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecisionValue(int i) {
        this.decision_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32643OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new ConstantSampler();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"decision_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConstantSampler> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ConstantSampler.class) {
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

    public ConstantDecision getDecision() {
        ConstantDecision constantDecisionOooO00o = ConstantDecision.OooO00o(this.decision_);
        return constantDecisionOooO00o == null ? ConstantDecision.UNRECOGNIZED : constantDecisionOooO00o;
    }

    public int getDecisionValue() {
        return this.decision_;
    }

    public static Builder newBuilder(ConstantSampler constantSampler) {
        return DEFAULT_INSTANCE.createBuilder(constantSampler);
    }

    public static ConstantSampler parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConstantSampler parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConstantSampler parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ConstantSampler parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConstantSampler parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConstantSampler parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConstantSampler parseFrom(InputStream inputStream) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConstantSampler parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConstantSampler parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConstantSampler parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConstantSampler) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
