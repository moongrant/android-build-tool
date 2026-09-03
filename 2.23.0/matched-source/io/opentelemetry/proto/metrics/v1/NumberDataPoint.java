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
public final class NumberDataPoint extends GeneratedMessageLite<NumberDataPoint, Builder> implements NumberDataPointOrBuilder {
    public static final int AS_DOUBLE_FIELD_NUMBER = 4;
    public static final int AS_INT_FIELD_NUMBER = 6;
    public static final int ATTRIBUTES_FIELD_NUMBER = 7;
    private static final NumberDataPoint DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 5;
    public static final int LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<NumberDataPoint> PARSER = null;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 3;
    private long startTimeUnixNano_;
    private long timeUnixNano_;
    private Object value_;
    private int valueCase_ = 0;
    private Internal.ProtobufList<KeyValue> attributes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<StringKeyValue> labels_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Exemplar> exemplars_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.NumberDataPoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33170OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33170OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33170OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NumberDataPoint, Builder> implements NumberDataPointOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(KeyValue keyValue) {
            copyOnWrite();
            ((NumberDataPoint) this.instance).addAttributes(keyValue);
        }

        public final void OooO0Oo(double d) {
            copyOnWrite();
            ((NumberDataPoint) this.instance).setAsDouble(d);
        }

        public final void OooO0o(long j) {
            copyOnWrite();
            ((NumberDataPoint) this.instance).setStartTimeUnixNano(j);
        }

        public final void OooO0o0(long j) {
            copyOnWrite();
            ((NumberDataPoint) this.instance).setAsInt(j);
        }

        public final void OooO0oO(long j) {
            copyOnWrite();
            ((NumberDataPoint) this.instance).setTimeUnixNano(j);
        }

        private Builder() {
            super(NumberDataPoint.DEFAULT_INSTANCE);
        }
    }

    public enum ValueCase {
        AS_DOUBLE(4),
        AS_INT(6),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }
    }

    static {
        NumberDataPoint numberDataPoint = new NumberDataPoint();
        DEFAULT_INSTANCE = numberDataPoint;
        GeneratedMessageLite.registerDefaultInstance(NumberDataPoint.class, numberDataPoint);
    }

    private NumberDataPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends StringKeyValue> iterable) {
        ensureLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsDouble() {
        if (this.valueCase_ == 4) {
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
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
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
        this.valueCase_ = 0;
        this.value_ = null;
    }

    private void ensureAttributesIsMutable() {
        if (this.attributes_.isModifiable()) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
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

    public static NumberDataPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NumberDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NumberDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NumberDataPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
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
    public void setAsDouble(double d) {
        this.valueCase_ = 4;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAsInt(long j) {
        this.valueCase_ = 6;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33170OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new NumberDataPoint();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002\u0005\u0003\u0005\u00043\u0000\u0005\u001b\u0006A\u0000\u0007\u001b", new Object[]{"value_", "valueCase_", "labels_", StringKeyValue.class, "startTimeUnixNano_", "timeUnixNano_", "exemplars_", Exemplar.class, "attributes_", KeyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NumberDataPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NumberDataPoint.class) {
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
        if (this.valueCase_ == 4) {
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

    public KeyValue getAttributes(int i) {
        return this.attributes_.get(i);
    }

    public int getAttributesCount() {
        return this.attributes_.size();
    }

    public List<KeyValue> getAttributesList() {
        return this.attributes_;
    }

    public KeyValueOrBuilder getAttributesOrBuilder(int i) {
        return this.attributes_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
        return this.attributes_;
    }

    public Exemplar getExemplars(int i) {
        return this.exemplars_.get(i);
    }

    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public ExemplarOrBuilder getExemplarsOrBuilder(int i) {
        return this.exemplars_.get(i);
    }

    public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    @Deprecated
    public StringKeyValue getLabels(int i) {
        return this.labels_.get(i);
    }

    @Deprecated
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Deprecated
    public List<StringKeyValue> getLabelsList() {
        return this.labels_;
    }

    @Deprecated
    public StringKeyValueOrBuilder getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    @Deprecated
    public List<? extends StringKeyValueOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public long getStartTimeUnixNano() {
        return this.startTimeUnixNano_;
    }

    public long getTimeUnixNano() {
        return this.timeUnixNano_;
    }

    public ValueCase getValueCase() {
        int i = this.valueCase_;
        if (i == 0) {
            return ValueCase.VALUE_NOT_SET;
        }
        if (i == 4) {
            return ValueCase.AS_DOUBLE;
        }
        if (i != 6) {
            return null;
        }
        return ValueCase.AS_INT;
    }

    public static Builder newBuilder(NumberDataPoint numberDataPoint) {
        return DEFAULT_INSTANCE.createBuilder(numberDataPoint);
    }

    public static NumberDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NumberDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NumberDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, stringKeyValue);
    }

    public static NumberDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NumberDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NumberDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NumberDataPoint parseFrom(InputStream inputStream) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NumberDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NumberDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NumberDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NumberDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
