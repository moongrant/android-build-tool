package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
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
public final class SummaryDataPoint extends GeneratedMessageLite<SummaryDataPoint, Builder> implements SummaryDataPointOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final SummaryDataPoint DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<SummaryDataPoint> PARSER = null;
    public static final int QUANTILE_VALUES_FIELD_NUMBER = 6;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int SUM_FIELD_NUMBER = 5;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 3;
    private long count_;
    private long startTimeUnixNano_;
    private double sum_;
    private long timeUnixNano_;
    private Internal.ProtobufList<KeyValue> attributes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<StringKeyValue> labels_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ValueAtQuantile> quantileValues_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.SummaryDataPoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32641OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32641OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32641OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SummaryDataPoint, Builder> implements SummaryDataPointOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(KeyValue keyValue) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).addAttributes(keyValue);
        }

        public final void OooO0Oo(ValueAtQuantile valueAtQuantile) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).addQuantileValues(valueAtQuantile);
        }

        public final void OooO0o(long j) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).setStartTimeUnixNano(j);
        }

        public final void OooO0o0(long j) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).setCount(j);
        }

        public final void OooO0oO(double d) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).setSum(d);
        }

        public final void OooO0oo(long j) {
            copyOnWrite();
            ((SummaryDataPoint) this.instance).setTimeUnixNano(j);
        }

        private Builder() {
            super(SummaryDataPoint.DEFAULT_INSTANCE);
        }
    }

    public static final class ValueAtQuantile extends GeneratedMessageLite<ValueAtQuantile, Builder> implements ValueAtQuantileOrBuilder {
        private static final ValueAtQuantile DEFAULT_INSTANCE;
        private static volatile Parser<ValueAtQuantile> PARSER = null;
        public static final int QUANTILE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private double quantile_;
        private double value_;

        public static final class Builder extends GeneratedMessageLite.Builder<ValueAtQuantile, Builder> implements ValueAtQuantileOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public final void OooO0O0(double d) {
                copyOnWrite();
                ((ValueAtQuantile) this.instance).setQuantile(d);
            }

            public final void OooO0Oo(double d) {
                copyOnWrite();
                ((ValueAtQuantile) this.instance).setValue(d);
            }

            private Builder() {
                super(ValueAtQuantile.DEFAULT_INSTANCE);
            }
        }

        static {
            ValueAtQuantile valueAtQuantile = new ValueAtQuantile();
            DEFAULT_INSTANCE = valueAtQuantile;
            GeneratedMessageLite.registerDefaultInstance(ValueAtQuantile.class, valueAtQuantile);
        }

        private ValueAtQuantile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuantile() {
            this.quantile_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        public static ValueAtQuantile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ValueAtQuantile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValueAtQuantile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ValueAtQuantile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuantile(double d) {
            this.quantile_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.f32641OooO00o[methodToInvoke.ordinal()]) {
                case 1:
                    return new ValueAtQuantile();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"quantile_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ValueAtQuantile> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ValueAtQuantile.class) {
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

        public double getQuantile() {
            return this.quantile_;
        }

        public double getValue() {
            return this.value_;
        }

        public static Builder newBuilder(ValueAtQuantile valueAtQuantile) {
            return DEFAULT_INSTANCE.createBuilder(valueAtQuantile);
        }

        public static ValueAtQuantile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValueAtQuantile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ValueAtQuantile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ValueAtQuantile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ValueAtQuantile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ValueAtQuantile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ValueAtQuantile parseFrom(InputStream inputStream) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValueAtQuantile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValueAtQuantile parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ValueAtQuantile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ValueAtQuantile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ValueAtQuantileOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        SummaryDataPoint summaryDataPoint = new SummaryDataPoint();
        DEFAULT_INSTANCE = summaryDataPoint;
        GeneratedMessageLite.registerDefaultInstance(SummaryDataPoint.class, summaryDataPoint);
    }

    private SummaryDataPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends StringKeyValue> iterable) {
        ensureLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQuantileValues(Iterable<? extends ValueAtQuantile> iterable) {
        ensureQuantileValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.quantileValues_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuantileValues(ValueAtQuantile valueAtQuantile) {
        valueAtQuantile.getClass();
        ensureQuantileValuesIsMutable();
        this.quantileValues_.add(valueAtQuantile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuantileValues() {
        this.quantileValues_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeUnixNano() {
        this.startTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSum() {
        this.sum_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeUnixNano() {
        this.timeUnixNano_ = 0L;
    }

    private void ensureAttributesIsMutable() {
        if (this.attributes_.isModifiable()) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
    }

    private void ensureLabelsIsMutable() {
        if (this.labels_.isModifiable()) {
            return;
        }
        this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
    }

    private void ensureQuantileValuesIsMutable() {
        if (this.quantileValues_.isModifiable()) {
            return;
        }
        this.quantileValues_ = GeneratedMessageLite.mutableCopy(this.quantileValues_);
    }

    public static SummaryDataPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SummaryDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SummaryDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SummaryDataPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQuantileValues(int i) {
        ensureQuantileValuesIsMutable();
        this.quantileValues_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuantileValues(int i, ValueAtQuantile valueAtQuantile) {
        valueAtQuantile.getClass();
        ensureQuantileValuesIsMutable();
        this.quantileValues_.set(i, valueAtQuantile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeUnixNano(long j) {
        this.startTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSum(double d) {
        this.sum_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUnixNano(long j) {
        this.timeUnixNano_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32641OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new SummaryDataPoint();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002\u0005\u0003\u0005\u0004\u0005\u0005\u0000\u0006\u001b\u0007\u001b", new Object[]{"labels_", StringKeyValue.class, "startTimeUnixNano_", "timeUnixNano_", "count_", "sum_", "quantileValues_", ValueAtQuantile.class, "attributes_", KeyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SummaryDataPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SummaryDataPoint.class) {
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

    public long getCount() {
        return this.count_;
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

    public ValueAtQuantile getQuantileValues(int i) {
        return this.quantileValues_.get(i);
    }

    public int getQuantileValuesCount() {
        return this.quantileValues_.size();
    }

    public List<ValueAtQuantile> getQuantileValuesList() {
        return this.quantileValues_;
    }

    public ValueAtQuantileOrBuilder getQuantileValuesOrBuilder(int i) {
        return this.quantileValues_.get(i);
    }

    public List<? extends ValueAtQuantileOrBuilder> getQuantileValuesOrBuilderList() {
        return this.quantileValues_;
    }

    public long getStartTimeUnixNano() {
        return this.startTimeUnixNano_;
    }

    public double getSum() {
        return this.sum_;
    }

    public long getTimeUnixNano() {
        return this.timeUnixNano_;
    }

    public static Builder newBuilder(SummaryDataPoint summaryDataPoint) {
        return DEFAULT_INSTANCE.createBuilder(summaryDataPoint);
    }

    public static SummaryDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SummaryDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SummaryDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i, StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuantileValues(int i, ValueAtQuantile valueAtQuantile) {
        valueAtQuantile.getClass();
        ensureQuantileValuesIsMutable();
        this.quantileValues_.add(i, valueAtQuantile);
    }

    public static SummaryDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SummaryDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SummaryDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SummaryDataPoint parseFrom(InputStream inputStream) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SummaryDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SummaryDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SummaryDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SummaryDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
