package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.common.v1.KeyValueOrBuilder;
import io.opentelemetry.proto.common.v1.StringKeyValue;
import io.opentelemetry.proto.common.v1.StringKeyValueOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Exemplar extends GeneratedMessageLite<Exemplar, Builder> implements ExemplarOrBuilder {
    public static final int AS_DOUBLE_FIELD_NUMBER = 3;
    public static final int AS_INT_FIELD_NUMBER = 6;
    private static final Exemplar DEFAULT_INSTANCE;
    public static final int FILTERED_ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int FILTERED_LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<Exemplar> PARSER = null;
    public static final int SPAN_ID_FIELD_NUMBER = 4;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int TRACE_ID_FIELD_NUMBER = 5;
    private ByteString spanId_;
    private long timeUnixNano_;
    private ByteString traceId_;
    private Object value_;
    private int valueCase_ = 0;
    private Internal.ProtobufList<KeyValue> filteredAttributes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<StringKeyValue> filteredLabels_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.Exemplar$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32622OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32622OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32622OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Exemplar, Builder> implements ExemplarOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(KeyValue keyValue) {
            copyOnWrite();
            ((Exemplar) this.instance).addFilteredAttributes(keyValue);
        }

        public final void OooO0Oo(long j) {
            copyOnWrite();
            ((Exemplar) this.instance).setTimeUnixNano(j);
        }

        private Builder() {
            super(Exemplar.DEFAULT_INSTANCE);
        }
    }

    public enum ValueCase {
        AS_DOUBLE(3),
        AS_INT(6),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }
    }

    static {
        Exemplar exemplar = new Exemplar();
        DEFAULT_INSTANCE = exemplar;
        GeneratedMessageLite.registerDefaultInstance(Exemplar.class, exemplar);
    }

    private Exemplar() {
        ByteString byteString = ByteString.EMPTY;
        this.spanId_ = byteString;
        this.traceId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilteredAttributes(Iterable<? extends KeyValue> iterable) {
        ensureFilteredAttributesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.filteredAttributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilteredLabels(Iterable<? extends StringKeyValue> iterable) {
        ensureFilteredLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.filteredLabels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureFilteredAttributesIsMutable();
        this.filteredAttributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.add(stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsDouble() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsInt() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilteredAttributes() {
        this.filteredAttributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilteredLabels() {
        this.filteredLabels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpanId() {
        this.spanId_ = getDefaultInstance().getSpanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUnixNano() {
        this.timeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    private void ensureFilteredAttributesIsMutable() {
        if (this.filteredAttributes_.isModifiable()) {
            return;
        }
        this.filteredAttributes_ = GeneratedMessageLite.mutableCopy(this.filteredAttributes_);
    }

    private void ensureFilteredLabelsIsMutable() {
        if (this.filteredLabels_.isModifiable()) {
            return;
        }
        this.filteredLabels_ = GeneratedMessageLite.mutableCopy(this.filteredLabels_);
    }

    public static Exemplar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exemplar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilteredAttributes(int i) {
        ensureFilteredAttributesIsMutable();
        this.filteredAttributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilteredLabels(int i) {
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsDouble(double d) {
        this.valueCase_ = 3;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsInt(long j) {
        this.valueCase_ = 6;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilteredAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureFilteredAttributesIsMutable();
        this.filteredAttributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilteredLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.set(i, stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpanId(ByteString byteString) {
        byteString.getClass();
        this.spanId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUnixNano(long j) {
        this.timeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(ByteString byteString) {
        byteString.getClass();
        this.traceId_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32622OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Exemplar();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u001b\u0002\u0005\u00033\u0000\u0004\n\u0005\n\u0006A\u0000\u0007\u001b", new Object[]{"value_", "valueCase_", "filteredLabels_", StringKeyValue.class, "timeUnixNano_", "spanId_", "traceId_", "filteredAttributes_", KeyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exemplar> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exemplar.class) {
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

    public double getAsDouble() {
        if (this.valueCase_ == 3) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public long getAsInt() {
        if (this.valueCase_ == 6) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public KeyValue getFilteredAttributes(int i) {
        return this.filteredAttributes_.get(i);
    }

    public int getFilteredAttributesCount() {
        return this.filteredAttributes_.size();
    }

    public List<KeyValue> getFilteredAttributesList() {
        return this.filteredAttributes_;
    }

    public KeyValueOrBuilder getFilteredAttributesOrBuilder(int i) {
        return this.filteredAttributes_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getFilteredAttributesOrBuilderList() {
        return this.filteredAttributes_;
    }

    @Deprecated
    public StringKeyValue getFilteredLabels(int i) {
        return this.filteredLabels_.get(i);
    }

    @Deprecated
    public int getFilteredLabelsCount() {
        return this.filteredLabels_.size();
    }

    @Deprecated
    public List<StringKeyValue> getFilteredLabelsList() {
        return this.filteredLabels_;
    }

    @Deprecated
    public StringKeyValueOrBuilder getFilteredLabelsOrBuilder(int i) {
        return this.filteredLabels_.get(i);
    }

    @Deprecated
    public List<? extends StringKeyValueOrBuilder> getFilteredLabelsOrBuilderList() {
        return this.filteredLabels_;
    }

    public ByteString getSpanId() {
        return this.spanId_;
    }

    public long getTimeUnixNano() {
        return this.timeUnixNano_;
    }

    public ByteString getTraceId() {
        return this.traceId_;
    }

    public ValueCase getValueCase() {
        int i = this.valueCase_;
        if (i == 0) {
            return ValueCase.VALUE_NOT_SET;
        }
        if (i == 3) {
            return ValueCase.AS_DOUBLE;
        }
        if (i != 6) {
            return null;
        }
        return ValueCase.AS_INT;
    }

    public static Builder newBuilder(Exemplar exemplar) {
        return DEFAULT_INSTANCE.createBuilder(exemplar);
    }

    public static Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureFilteredAttributesIsMutable();
        this.filteredAttributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.add(i, stringKeyValue);
    }

    public static Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exemplar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exemplar parseFrom(InputStream inputStream) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
