package io.opentelemetry.proto.common.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class AnyValue extends GeneratedMessageLite<AnyValue, Builder> implements AnyValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 5;
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    private static final AnyValue DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int KVLIST_VALUE_FIELD_NUMBER = 6;
    private static volatile Parser<AnyValue> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.common.v1.AnyValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32609OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32609OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32609OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AnyValue, Builder> implements AnyValueOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayValue arrayValue) {
            copyOnWrite();
            ((AnyValue) this.instance).setArrayValue(arrayValue);
        }

        public final void OooO0Oo(boolean z) {
            copyOnWrite();
            ((AnyValue) this.instance).setBoolValue(z);
        }

        public final void OooO0o(long j) {
            copyOnWrite();
            ((AnyValue) this.instance).setIntValue(j);
        }

        public final void OooO0o0(double d) {
            copyOnWrite();
            ((AnyValue) this.instance).setDoubleValue(d);
        }

        public final void OooO0oO(String str) {
            copyOnWrite();
            ((AnyValue) this.instance).setStringValue(str);
        }

        private Builder() {
            super(AnyValue.DEFAULT_INSTANCE);
        }
    }

    public enum ValueCase {
        STRING_VALUE(1),
        BOOL_VALUE(2),
        INT_VALUE(3),
        DOUBLE_VALUE(4),
        ARRAY_VALUE(5),
        KVLIST_VALUE(6),
        BYTES_VALUE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }
    }

    static {
        AnyValue anyValue = new AnyValue();
        DEFAULT_INSTANCE = anyValue;
        GeneratedMessageLite.registerDefaultInstance(AnyValue.class, anyValue);
    }

    private AnyValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrayValue() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        if (this.valueCase_ == 7) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKvlistValue() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueCase_ == 1) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static AnyValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        if (this.valueCase_ != 5 || this.value_ == ArrayValue.getDefaultInstance()) {
            this.value_ = arrayValue;
        } else {
            this.value_ = ArrayValue.newBuilder((ArrayValue) this.value_).mergeFrom(arrayValue).buildPartial();
        }
        this.valueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKvlistValue(KeyValueList keyValueList) {
        keyValueList.getClass();
        if (this.valueCase_ != 6 || this.value_ == KeyValueList.getDefaultInstance()) {
            this.value_ = keyValueList;
        } else {
            this.value_ = KeyValueList.newBuilder((KeyValueList) this.value_).mergeFrom(keyValueList).buildPartial();
        }
        this.valueCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AnyValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnyValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AnyValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.value_ = arrayValue;
        this.valueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(ByteString byteString) {
        byteString.getClass();
        this.valueCase_ = 7;
        this.value_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d) {
        this.valueCase_ = 4;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(long j) {
        this.valueCase_ = 3;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKvlistValue(KeyValueList keyValueList) {
        keyValueList.getClass();
        this.value_ = keyValueList;
        this.valueCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.valueCase_ = 1;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
        this.valueCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32609OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new AnyValue();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000\u0005<\u0000\u0006<\u0000\u0007=\u0000", new Object[]{"value_", "valueCase_", ArrayValue.class, KeyValueList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AnyValue> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AnyValue.class) {
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

    public ArrayValue getArrayValue() {
        return this.valueCase_ == 5 ? (ArrayValue) this.value_ : ArrayValue.getDefaultInstance();
    }

    public boolean getBoolValue() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public ByteString getBytesValue() {
        return this.valueCase_ == 7 ? (ByteString) this.value_ : ByteString.EMPTY;
    }

    public double getDoubleValue() {
        if (this.valueCase_ == 4) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public long getIntValue() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public KeyValueList getKvlistValue() {
        return this.valueCase_ == 6 ? (KeyValueList) this.value_ : KeyValueList.getDefaultInstance();
    }

    public String getStringValue() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public ByteString getStringValueBytes() {
        return ByteString.copyFromUtf8(this.valueCase_ == 1 ? (String) this.value_ : "");
    }

    public ValueCase getValueCase() {
        switch (this.valueCase_) {
            case 0:
                return ValueCase.VALUE_NOT_SET;
            case 1:
                return ValueCase.STRING_VALUE;
            case 2:
                return ValueCase.BOOL_VALUE;
            case 3:
                return ValueCase.INT_VALUE;
            case 4:
                return ValueCase.DOUBLE_VALUE;
            case 5:
                return ValueCase.ARRAY_VALUE;
            case 6:
                return ValueCase.KVLIST_VALUE;
            case 7:
                return ValueCase.BYTES_VALUE;
            default:
                return null;
        }
    }

    public boolean hasArrayValue() {
        return this.valueCase_ == 5;
    }

    public boolean hasKvlistValue() {
        return this.valueCase_ == 6;
    }

    public static Builder newBuilder(AnyValue anyValue) {
        return DEFAULT_INSTANCE.createBuilder(anyValue);
    }

    public static AnyValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AnyValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AnyValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AnyValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AnyValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnyValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AnyValue parseFrom(InputStream inputStream) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnyValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AnyValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AnyValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
