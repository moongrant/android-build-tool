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
public final class IntDataPoint extends GeneratedMessageLite<IntDataPoint, Builder> implements IntDataPointOrBuilder {
    private static final IntDataPoint DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 5;
    public static final int LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<IntDataPoint> PARSER = null;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 4;
    private long startTimeUnixNano_;
    private long timeUnixNano_;
    private long value_;
    private Internal.ProtobufList<StringKeyValue> labels_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<IntExemplar> exemplars_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.IntDataPoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32627OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32627OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32627OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<IntDataPoint, Builder> implements IntDataPointOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        private Builder() {
            super(IntDataPoint.DEFAULT_INSTANCE);
        }
    }

    static {
        IntDataPoint intDataPoint = new IntDataPoint();
        DEFAULT_INSTANCE = intDataPoint;
        GeneratedMessageLite.registerDefaultInstance(IntDataPoint.class, intDataPoint);
    }

    private IntDataPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends IntExemplar> iterable) {
        ensureExemplarsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends StringKeyValue> iterable) {
        ensureLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(IntExemplar intExemplar) {
        intExemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(intExemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeUnixNano() {
        this.startTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUnixNano() {
        this.timeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    private void ensureExemplarsIsMutable() {
        if (this.exemplars_.isModifiable()) {
            return;
        }
        this.exemplars_ = GeneratedMessageLite.mutableCopy(this.exemplars_);
    }

    private void ensureLabelsIsMutable() {
        if (this.labels_.isModifiable()) {
            return;
        }
        this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
    }

    public static IntDataPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IntDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IntDataPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i, IntExemplar intExemplar) {
        intExemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, intExemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeUnixNano(long j) {
        this.startTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUnixNano(long j) {
        this.timeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32627OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new IntDataPoint();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u0005\u0003\u0005\u0004\u000e\u0005\u001b", new Object[]{"labels_", StringKeyValue.class, "startTimeUnixNano_", "timeUnixNano_", "value_", "exemplars_", IntExemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IntDataPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IntDataPoint.class) {
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

    public IntExemplar getExemplars(int i) {
        return this.exemplars_.get(i);
    }

    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public List<IntExemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public IntExemplarOrBuilder getExemplarsOrBuilder(int i) {
        return this.exemplars_.get(i);
    }

    public List<? extends IntExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public StringKeyValue getLabels(int i) {
        return this.labels_.get(i);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<StringKeyValue> getLabelsList() {
        return this.labels_;
    }

    public StringKeyValueOrBuilder getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public List<? extends StringKeyValueOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public long getStartTimeUnixNano() {
        return this.startTimeUnixNano_;
    }

    public long getTimeUnixNano() {
        return this.timeUnixNano_;
    }

    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder(IntDataPoint intDataPoint) {
        return DEFAULT_INSTANCE.createBuilder(intDataPoint);
    }

    public static IntDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IntDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(int i, IntExemplar intExemplar) {
        intExemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, intExemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, stringKeyValue);
    }

    public static IntDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IntDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IntDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IntDataPoint parseFrom(InputStream inputStream) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IntDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IntDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
