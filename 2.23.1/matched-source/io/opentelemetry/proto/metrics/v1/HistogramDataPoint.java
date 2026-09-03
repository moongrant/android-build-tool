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
public final class HistogramDataPoint extends GeneratedMessageLite<HistogramDataPoint, Builder> implements HistogramDataPointOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 9;
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final HistogramDataPoint DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 8;
    public static final int EXPLICIT_BOUNDS_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 1;
    private static volatile Parser<HistogramDataPoint> PARSER = null;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 2;
    public static final int SUM_FIELD_NUMBER = 5;
    public static final int TIME_UNIX_NANO_FIELD_NUMBER = 3;
    private long count_;
    private long startTimeUnixNano_;
    private double sum_;
    private long timeUnixNano_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private int explicitBoundsMemoizedSerializedSize = -1;
    private Internal.ProtobufList<KeyValue> attributes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<StringKeyValue> labels_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.LongList bucketCounts_ = GeneratedMessageLite.emptyLongList();
    private Internal.DoubleList explicitBounds_ = GeneratedMessageLite.emptyDoubleList();
    private Internal.ProtobufList<Exemplar> exemplars_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.HistogramDataPoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32625OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32625OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32625OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HistogramDataPoint, Builder> implements HistogramDataPointOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO(long j) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).setTimeUnixNano(j);
        }

        public final void OooO0O0(List list) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).addAllBucketCounts(list);
        }

        public final void OooO0Oo(List list) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).addAllExplicitBounds(list);
        }

        public final void OooO0o(long j) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).setCount(j);
        }

        public final void OooO0o0(KeyValue keyValue) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).addAttributes(keyValue);
        }

        public final void OooO0oO(long j) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).setStartTimeUnixNano(j);
        }

        public final void OooO0oo(double d) {
            copyOnWrite();
            ((HistogramDataPoint) this.instance).setSum(d);
        }

        private Builder() {
            super(HistogramDataPoint.DEFAULT_INSTANCE);
        }
    }

    static {
        HistogramDataPoint histogramDataPoint = new HistogramDataPoint();
        DEFAULT_INSTANCE = histogramDataPoint;
        GeneratedMessageLite.registerDefaultInstance(HistogramDataPoint.class, histogramDataPoint);
    }

    private HistogramDataPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bucketCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExplicitBounds(Iterable<? extends Double> iterable) {
        ensureExplicitBoundsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.explicitBounds_);
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
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExplicitBounds(double d) {
        ensureExplicitBoundsIsMutable();
        this.explicitBounds_.addDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(StringKeyValue stringKeyValue) {
        stringKeyValue.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(stringKeyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplicitBounds() {
        this.explicitBounds_ = GeneratedMessageLite.emptyDoubleList();
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

    private void ensureBucketCountsIsMutable() {
        if (this.bucketCounts_.isModifiable()) {
            return;
        }
        this.bucketCounts_ = GeneratedMessageLite.mutableCopy(this.bucketCounts_);
    }

    private void ensureExemplarsIsMutable() {
        if (this.exemplars_.isModifiable()) {
            return;
        }
        this.exemplars_ = GeneratedMessageLite.mutableCopy(this.exemplars_);
    }

    private void ensureExplicitBoundsIsMutable() {
        if (this.explicitBounds_.isModifiable()) {
            return;
        }
        this.explicitBounds_ = GeneratedMessageLite.mutableCopy(this.explicitBounds_);
    }

    private void ensureLabelsIsMutable() {
        if (this.labels_.isModifiable()) {
            return;
        }
        this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
    }

    public static HistogramDataPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HistogramDataPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistogramDataPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HistogramDataPoint> parser() {
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
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplicitBounds(int i, double d) {
        ensureExplicitBoundsIsMutable();
        this.explicitBounds_.setDouble(i, d);
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
        switch (AnonymousClass1.f32625OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new HistogramDataPoint();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u001b\u0002\u0005\u0003\u0005\u0004\u0005\u0005\u0000\u0006(\u0007#\b\u001b\t\u001b", new Object[]{"labels_", StringKeyValue.class, "startTimeUnixNano_", "timeUnixNano_", "count_", "sum_", "bucketCounts_", "explicitBounds_", "exemplars_", Exemplar.class, "attributes_", KeyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HistogramDataPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HistogramDataPoint.class) {
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

    public long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    public long getCount() {
        return this.count_;
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

    public double getExplicitBounds(int i) {
        return this.explicitBounds_.getDouble(i);
    }

    public int getExplicitBoundsCount() {
        return this.explicitBounds_.size();
    }

    public List<Double> getExplicitBoundsList() {
        return this.explicitBounds_;
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

    public double getSum() {
        return this.sum_;
    }

    public long getTimeUnixNano() {
        return this.timeUnixNano_;
    }

    public static Builder newBuilder(HistogramDataPoint histogramDataPoint) {
        return DEFAULT_INSTANCE.createBuilder(histogramDataPoint);
    }

    public static HistogramDataPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistogramDataPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HistogramDataPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static HistogramDataPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HistogramDataPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HistogramDataPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HistogramDataPoint parseFrom(InputStream inputStream) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistogramDataPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistogramDataPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HistogramDataPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistogramDataPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
