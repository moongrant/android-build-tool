package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.common.v1.StringKeyValue;
import io.opentelemetry.proto.common.v1.StringKeyValueOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class IntExemplar extends GeneratedMessageLite<IntExemplar, Builder> implements IntExemplarOrBuilder {
    private static final IntExemplar DEFAULT_INSTANCE;
    public static final int FILTERED_LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<IntExemplar> PARSER = null;
    public static final int SPAN_ID_FIELD_NUMBER = 4;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int TRACE_ID_FIELD_NUMBER = 5;
    public static final int VALUE_FIELD_NUMBER = 3;
    private Internal.ProtobufList<StringKeyValue> filteredLabels_ = GeneratedMessageLite.emptyProtobufList();
    private ByteString spanId_;
    private long timeUnixNano_;
    private ByteString traceId_;
    private long value_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.IntExemplar$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32631OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32631OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32631OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<IntExemplar, Builder> implements IntExemplarOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(IntExemplar.DEFAULT_INSTANCE);
        }
    }

    static {
        IntExemplar intExemplar = new IntExemplar();
        DEFAULT_INSTANCE = intExemplar;
        GeneratedMessageLite.registerDefaultInstance(IntExemplar.class, intExemplar);
    }

    private IntExemplar() {
        ByteString byteString = ByteString.EMPTY;
        this.spanId_ = byteString;
        this.traceId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilteredLabels(Iterable<? extends StringKeyValue> iterable) {
        ensureFilteredLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.filteredLabels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.add(stringKeyValue);
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
        this.value_ = 0L;
    }

    private void ensureFilteredLabelsIsMutable() {
        if (this.filteredLabels_.isModifiable()) {
            return;
        }
        this.filteredLabels_ = GeneratedMessageLite.mutableCopy(this.filteredLabels_);
    }

    public static IntExemplar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IntExemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntExemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IntExemplar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilteredLabels(int i) {
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.remove(i);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32631OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new IntExemplar();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0005\u0003\u000e\u0004\n\u0005\n", new Object[]{"filteredLabels_", StringKeyValue.class, "timeUnixNano_", "value_", "spanId_", "traceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IntExemplar> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IntExemplar.class) {
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

    public StringKeyValue getFilteredLabels(int i) {
        return this.filteredLabels_.get(i);
    }

    public int getFilteredLabelsCount() {
        return this.filteredLabels_.size();
    }

    public List<StringKeyValue> getFilteredLabelsList() {
        return this.filteredLabels_;
    }

    public StringKeyValueOrBuilder getFilteredLabelsOrBuilder(int i) {
        return this.filteredLabels_.get(i);
    }

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

    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder(IntExemplar intExemplar) {
        return DEFAULT_INSTANCE.createBuilder(intExemplar);
    }

    public static IntExemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntExemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IntExemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilteredLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureFilteredLabelsIsMutable();
        this.filteredLabels_.add(i, stringKeyValue);
    }

    public static IntExemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IntExemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IntExemplar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IntExemplar parseFrom(InputStream inputStream) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntExemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntExemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IntExemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntExemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
