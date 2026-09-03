package io.opentelemetry.proto.trace.v1;

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

/* JADX INFO: loaded from: classes5.dex */
public final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 3;
    private static final Status DEFAULT_INSTANCE;
    public static final int DEPRECATED_CODE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int code_;
    private int deprecatedCode_;
    private String message_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.Status$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33181OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33181OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33181OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(StatusCode statusCode) {
            copyOnWrite();
            ((Status) this.instance).setCode(statusCode);
        }

        @Deprecated
        public final void OooO0Oo(DeprecatedStatusCode deprecatedStatusCode) {
            copyOnWrite();
            ((Status) this.instance).setDeprecatedCode(deprecatedStatusCode);
        }

        public final void OooO0o0(String str) {
            copyOnWrite();
            ((Status) this.instance).setMessage(str);
        }

        private Builder() {
            super(Status.DEFAULT_INSTANCE);
        }
    }

    public enum DeprecatedStatusCode implements Internal.EnumLite {
        DEPRECATED_STATUS_CODE_OK(0),
        DEPRECATED_STATUS_CODE_CANCELLED(1),
        DEPRECATED_STATUS_CODE_UNKNOWN_ERROR(2),
        DEPRECATED_STATUS_CODE_INVALID_ARGUMENT(3),
        DEPRECATED_STATUS_CODE_DEADLINE_EXCEEDED(4),
        DEPRECATED_STATUS_CODE_NOT_FOUND(5),
        DEPRECATED_STATUS_CODE_ALREADY_EXISTS(6),
        DEPRECATED_STATUS_CODE_PERMISSION_DENIED(7),
        DEPRECATED_STATUS_CODE_RESOURCE_EXHAUSTED(8),
        DEPRECATED_STATUS_CODE_FAILED_PRECONDITION(9),
        DEPRECATED_STATUS_CODE_ABORTED(10),
        DEPRECATED_STATUS_CODE_OUT_OF_RANGE(11),
        DEPRECATED_STATUS_CODE_UNIMPLEMENTED(12),
        DEPRECATED_STATUS_CODE_INTERNAL_ERROR(13),
        DEPRECATED_STATUS_CODE_UNAVAILABLE(14),
        DEPRECATED_STATUS_CODE_DATA_LOSS(15),
        DEPRECATED_STATUS_CODE_UNAUTHENTICATED(16),
        UNRECOGNIZED(-1);

        public static final int DEPRECATED_STATUS_CODE_ABORTED_VALUE = 10;
        public static final int DEPRECATED_STATUS_CODE_ALREADY_EXISTS_VALUE = 6;
        public static final int DEPRECATED_STATUS_CODE_CANCELLED_VALUE = 1;
        public static final int DEPRECATED_STATUS_CODE_DATA_LOSS_VALUE = 15;
        public static final int DEPRECATED_STATUS_CODE_DEADLINE_EXCEEDED_VALUE = 4;
        public static final int DEPRECATED_STATUS_CODE_FAILED_PRECONDITION_VALUE = 9;
        public static final int DEPRECATED_STATUS_CODE_INTERNAL_ERROR_VALUE = 13;
        public static final int DEPRECATED_STATUS_CODE_INVALID_ARGUMENT_VALUE = 3;
        public static final int DEPRECATED_STATUS_CODE_NOT_FOUND_VALUE = 5;
        public static final int DEPRECATED_STATUS_CODE_OK_VALUE = 0;
        public static final int DEPRECATED_STATUS_CODE_OUT_OF_RANGE_VALUE = 11;
        public static final int DEPRECATED_STATUS_CODE_PERMISSION_DENIED_VALUE = 7;
        public static final int DEPRECATED_STATUS_CODE_RESOURCE_EXHAUSTED_VALUE = 8;
        public static final int DEPRECATED_STATUS_CODE_UNAUTHENTICATED_VALUE = 16;
        public static final int DEPRECATED_STATUS_CODE_UNAVAILABLE_VALUE = 14;
        public static final int DEPRECATED_STATUS_CODE_UNIMPLEMENTED_VALUE = 12;
        public static final int DEPRECATED_STATUS_CODE_UNKNOWN_ERROR_VALUE = 2;
        private static final Internal.EnumLiteMap<DeprecatedStatusCode> internalValueMap = new Internal.EnumLiteMap<DeprecatedStatusCode>() { // from class: io.opentelemetry.proto.trace.v1.Status.DeprecatedStatusCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return DeprecatedStatusCode.OooO00o(i);
            }
        };
        private final int value;

        public static final class DeprecatedStatusCodeVerifier implements Internal.EnumVerifier {
            static {
                new DeprecatedStatusCodeVerifier();
            }

            private DeprecatedStatusCodeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return DeprecatedStatusCode.OooO00o(i) != null;
            }
        }

        DeprecatedStatusCode(int i) {
            this.value = i;
        }

        public static DeprecatedStatusCode OooO00o(int i) {
            switch (i) {
                case 0:
                    return DEPRECATED_STATUS_CODE_OK;
                case 1:
                    return DEPRECATED_STATUS_CODE_CANCELLED;
                case 2:
                    return DEPRECATED_STATUS_CODE_UNKNOWN_ERROR;
                case 3:
                    return DEPRECATED_STATUS_CODE_INVALID_ARGUMENT;
                case 4:
                    return DEPRECATED_STATUS_CODE_DEADLINE_EXCEEDED;
                case 5:
                    return DEPRECATED_STATUS_CODE_NOT_FOUND;
                case 6:
                    return DEPRECATED_STATUS_CODE_ALREADY_EXISTS;
                case 7:
                    return DEPRECATED_STATUS_CODE_PERMISSION_DENIED;
                case 8:
                    return DEPRECATED_STATUS_CODE_RESOURCE_EXHAUSTED;
                case 9:
                    return DEPRECATED_STATUS_CODE_FAILED_PRECONDITION;
                case 10:
                    return DEPRECATED_STATUS_CODE_ABORTED;
                case 11:
                    return DEPRECATED_STATUS_CODE_OUT_OF_RANGE;
                case 12:
                    return DEPRECATED_STATUS_CODE_UNIMPLEMENTED;
                case 13:
                    return DEPRECATED_STATUS_CODE_INTERNAL_ERROR;
                case 14:
                    return DEPRECATED_STATUS_CODE_UNAVAILABLE;
                case 15:
                    return DEPRECATED_STATUS_CODE_DATA_LOSS;
                case 16:
                    return DEPRECATED_STATUS_CODE_UNAUTHENTICATED;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum StatusCode implements Internal.EnumLite {
        STATUS_CODE_UNSET(0),
        STATUS_CODE_OK(1),
        STATUS_CODE_ERROR(2),
        UNRECOGNIZED(-1);

        public static final int STATUS_CODE_ERROR_VALUE = 2;
        public static final int STATUS_CODE_OK_VALUE = 1;
        public static final int STATUS_CODE_UNSET_VALUE = 0;
        private static final Internal.EnumLiteMap<StatusCode> internalValueMap = new Internal.EnumLiteMap<StatusCode>() { // from class: io.opentelemetry.proto.trace.v1.Status.StatusCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return StatusCode.OooO00o(i);
            }
        };
        private final int value;

        public static final class StatusCodeVerifier implements Internal.EnumVerifier {
            static {
                new StatusCodeVerifier();
            }

            private StatusCodeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return StatusCode.OooO00o(i) != null;
            }
        }

        StatusCode(int i) {
            this.value = i;
        }

        public static StatusCode OooO00o(int i) {
            if (i == 0) {
                return STATUS_CODE_UNSET;
            }
            if (i == 1) {
                return STATUS_CODE_OK;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_CODE_ERROR;
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
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedCode() {
        this.deprecatedCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(StatusCode statusCode) {
        this.code_ = statusCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedCode(DeprecatedStatusCode deprecatedStatusCode) {
        this.deprecatedCode_ = deprecatedStatusCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedCodeValue(int i) {
        this.deprecatedCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33181OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new Object[]{"deprecatedCode_", "message_", "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Status> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Status.class) {
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

    public StatusCode getCode() {
        StatusCode statusCodeOooO00o = StatusCode.OooO00o(this.code_);
        return statusCodeOooO00o == null ? StatusCode.UNRECOGNIZED : statusCodeOooO00o;
    }

    public int getCodeValue() {
        return this.code_;
    }

    @Deprecated
    public DeprecatedStatusCode getDeprecatedCode() {
        DeprecatedStatusCode deprecatedStatusCodeOooO00o = DeprecatedStatusCode.OooO00o(this.deprecatedCode_);
        return deprecatedStatusCodeOooO00o == null ? DeprecatedStatusCode.UNRECOGNIZED : deprecatedStatusCodeOooO00o;
    }

    @Deprecated
    public int getDeprecatedCodeValue() {
        return this.deprecatedCode_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public static Builder newBuilder(Status status) {
        return DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
