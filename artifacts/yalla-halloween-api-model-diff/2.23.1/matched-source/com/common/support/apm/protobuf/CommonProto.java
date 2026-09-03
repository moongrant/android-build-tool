package com.common.support.apm.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonProto {

    /* JADX INFO: renamed from: com.common.support.apm.protobuf.CommonProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class AnyValue extends GeneratedMessageLite<AnyValue, Builder> implements AnyValueOrBuilder {
        public static final int BOOLVALUE_FIELD_NUMBER = 2;
        private static final AnyValue DEFAULT_INSTANCE;
        public static final int DOUBLEVALUE_FIELD_NUMBER = 4;
        public static final int INTVALUE_FIELD_NUMBER = 3;
        private static volatile Parser<AnyValue> PARSER = null;
        public static final int STRINGVALUE_FIELD_NUMBER = 1;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends GeneratedMessageLite.Builder<AnyValue, Builder> implements AnyValueOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((AnyValue) this.instance).clearBoolValue();
                return this;
            }

            public Builder clearDoubleValue() {
                copyOnWrite();
                ((AnyValue) this.instance).clearDoubleValue();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((AnyValue) this.instance).clearIntValue();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((AnyValue) this.instance).clearStringValue();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((AnyValue) this.instance).clearValue();
                return this;
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public boolean getBoolValue() {
                return ((AnyValue) this.instance).getBoolValue();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public double getDoubleValue() {
                return ((AnyValue) this.instance).getDoubleValue();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public long getIntValue() {
                return ((AnyValue) this.instance).getIntValue();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public String getStringValue() {
                return ((AnyValue) this.instance).getStringValue();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public ByteString getStringValueBytes() {
                return ((AnyValue) this.instance).getStringValueBytes();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
            public ValueCase getValueCase() {
                return ((AnyValue) this.instance).getValueCase();
            }

            public Builder setBoolValue(boolean z) {
                copyOnWrite();
                ((AnyValue) this.instance).setBoolValue(z);
                return this;
            }

            public Builder setDoubleValue(double d) {
                copyOnWrite();
                ((AnyValue) this.instance).setDoubleValue(d);
                return this;
            }

            public Builder setIntValue(long j) {
                copyOnWrite();
                ((AnyValue) this.instance).setIntValue(j);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((AnyValue) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                copyOnWrite();
                ((AnyValue) this.instance).setStringValueBytes(byteString);
                return this;
            }

            private Builder() {
                super(AnyValue.DEFAULT_INSTANCE);
            }
        }

        public enum ValueCase {
            STRINGVALUE(1),
            BOOLVALUE(2),
            INTVALUE(3),
            DOUBLEVALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 1) {
                    return STRINGVALUE;
                }
                if (i == 2) {
                    return BOOLVALUE;
                }
                if (i == 3) {
                    return INTVALUE;
                }
                if (i != 4) {
                    return null;
                }
                return DOUBLEVALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
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
        public void clearBoolValue() {
            if (this.valueCase_ == 2) {
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
        public void setBoolValue(boolean z) {
            this.valueCase_ = 2;
            this.value_ = Boolean.valueOf(z);
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
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new AnyValue();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000", new Object[]{"value_", "valueCase_"});
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

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public boolean getBoolValue() {
            if (this.valueCase_ == 2) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public double getDoubleValue() {
            if (this.valueCase_ == 4) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public long getIntValue() {
            if (this.valueCase_ == 3) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public String getStringValue() {
            return this.valueCase_ == 1 ? (String) this.value_ : "";
        }

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public ByteString getStringValueBytes() {
            return ByteString.copyFromUtf8(this.valueCase_ == 1 ? (String) this.value_ : "");
        }

        @Override // com.common.support.apm.protobuf.CommonProto.AnyValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
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

    public interface AnyValueOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolValue();

        double getDoubleValue();

        long getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        AnyValue.ValueCase getValueCase();
    }

    public static final class StringArray extends GeneratedMessageLite<StringArray, Builder> implements StringArrayOrBuilder {
        private static final StringArray DEFAULT_INSTANCE;
        private static volatile Parser<StringArray> PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> values_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<StringArray, Builder> implements StringArrayOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllValues(Iterable<String> iterable) {
                copyOnWrite();
                ((StringArray) this.instance).addAllValues(iterable);
                return this;
            }

            public Builder addValues(String str) {
                copyOnWrite();
                ((StringArray) this.instance).addValues(str);
                return this;
            }

            public Builder addValuesBytes(ByteString byteString) {
                copyOnWrite();
                ((StringArray) this.instance).addValuesBytes(byteString);
                return this;
            }

            public Builder clearValues() {
                copyOnWrite();
                ((StringArray) this.instance).clearValues();
                return this;
            }

            @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
            public String getValues(int i) {
                return ((StringArray) this.instance).getValues(i);
            }

            @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
            public ByteString getValuesBytes(int i) {
                return ((StringArray) this.instance).getValuesBytes(i);
            }

            @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
            public int getValuesCount() {
                return ((StringArray) this.instance).getValuesCount();
            }

            @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
            public List<String> getValuesList() {
                return Collections.unmodifiableList(((StringArray) this.instance).getValuesList());
            }

            public Builder setValues(int i, String str) {
                copyOnWrite();
                ((StringArray) this.instance).setValues(i, str);
                return this;
            }

            private Builder() {
                super(StringArray.DEFAULT_INSTANCE);
            }
        }

        static {
            StringArray stringArray = new StringArray();
            DEFAULT_INSTANCE = stringArray;
            GeneratedMessageLite.registerDefaultInstance(StringArray.class, stringArray);
        }

        private StringArray() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValues(Iterable<String> iterable) {
            ensureValuesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.values_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValues(String str) {
            str.getClass();
            ensureValuesIsMutable();
            this.values_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValuesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureValuesIsMutable();
            this.values_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValues() {
            this.values_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureValuesIsMutable() {
            if (this.values_.isModifiable()) {
                return;
            }
            this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
        }

        public static StringArray getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StringArray parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StringArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringArray parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StringArray> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValues(int i, String str) {
            str.getClass();
            ensureValuesIsMutable();
            this.values_.set(i, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringArray();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"values_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StringArray> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StringArray.class) {
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

        @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
        public String getValues(int i) {
            return this.values_.get(i);
        }

        @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
        public ByteString getValuesBytes(int i) {
            return ByteString.copyFromUtf8(this.values_.get(i));
        }

        @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
        public int getValuesCount() {
            return this.values_.size();
        }

        @Override // com.common.support.apm.protobuf.CommonProto.StringArrayOrBuilder
        public List<String> getValuesList() {
            return this.values_;
        }

        public static Builder newBuilder(StringArray stringArray) {
            return DEFAULT_INSTANCE.createBuilder(stringArray);
        }

        public static StringArray parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringArray) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringArray parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StringArray parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StringArray parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StringArray parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StringArray parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StringArray parseFrom(InputStream inputStream) throws IOException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringArray parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringArray parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StringArray parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringArray) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StringArrayOrBuilder extends MessageLiteOrBuilder {
        String getValues(int i);

        ByteString getValuesBytes(int i);

        int getValuesCount();

        List<String> getValuesList();
    }

    private CommonProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
