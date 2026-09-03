package io.opentelemetry.proto.metrics.v1;

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
public final class Metric extends GeneratedMessageLite<Metric, Builder> implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int GAUGE_FIELD_NUMBER = 5;
    public static final int HISTOGRAM_FIELD_NUMBER = 9;
    public static final int INT_GAUGE_FIELD_NUMBER = 4;
    public static final int INT_HISTOGRAM_FIELD_NUMBER = 8;
    public static final int INT_SUM_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Metric> PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 11;
    public static final int SUM_FIELD_NUMBER = 7;
    public static final int UNIT_FIELD_NUMBER = 3;
    private Object data_;
    private int dataCase_ = 0;
    private String name_ = "";
    private String description_ = "";
    private String unit_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.Metric$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33169OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33169OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33169OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Metric, Builder> implements MetricOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO(String str) {
            copyOnWrite();
            ((Metric) this.instance).setUnit(str);
        }

        public final void OooO0O0(String str) {
            copyOnWrite();
            ((Metric) this.instance).setDescription(str);
        }

        public final void OooO0Oo(Gauge gauge) {
            copyOnWrite();
            ((Metric) this.instance).setGauge(gauge);
        }

        public final void OooO0o(String str) {
            copyOnWrite();
            ((Metric) this.instance).setName(str);
        }

        public final void OooO0o0(Histogram histogram) {
            copyOnWrite();
            ((Metric) this.instance).setHistogram(histogram);
        }

        public final void OooO0oO(Sum sum) {
            copyOnWrite();
            ((Metric) this.instance).setSum(sum);
        }

        public final void OooO0oo(Summary summary) {
            copyOnWrite();
            ((Metric) this.instance).setSummary(summary);
        }

        private Builder() {
            super(Metric.DEFAULT_INSTANCE);
        }
    }

    public enum DataCase {
        INT_GAUGE(4),
        GAUGE(5),
        INT_SUM(6),
        SUM(7),
        INT_HISTOGRAM(8),
        HISTOGRAM(9),
        SUMMARY(11),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }
    }

    static {
        Metric metric = new Metric();
        DEFAULT_INSTANCE = metric;
        GeneratedMessageLite.registerDefaultInstance(Metric.class, metric);
    }

    private Metric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGauge() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistogram() {
        if (this.dataCase_ == 9) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntGauge() {
        if (this.dataCase_ == 4) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntHistogram() {
        if (this.dataCase_ == 8) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntSum() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSum() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        if (this.dataCase_ == 11) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static Metric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGauge(Gauge gauge) {
        gauge.getClass();
        if (this.dataCase_ != 5 || this.data_ == Gauge.getDefaultInstance()) {
            this.data_ = gauge;
        } else {
            this.data_ = Gauge.newBuilder((Gauge) this.data_).mergeFrom(gauge).buildPartial();
        }
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHistogram(Histogram histogram) {
        histogram.getClass();
        if (this.dataCase_ != 9 || this.data_ == Histogram.getDefaultInstance()) {
            this.data_ = histogram;
        } else {
            this.data_ = Histogram.newBuilder((Histogram) this.data_).mergeFrom(histogram).buildPartial();
        }
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntGauge(IntGauge intGauge) {
        intGauge.getClass();
        if (this.dataCase_ != 4 || this.data_ == IntGauge.getDefaultInstance()) {
            this.data_ = intGauge;
        } else {
            this.data_ = IntGauge.newBuilder((IntGauge) this.data_).mergeFrom(intGauge).buildPartial();
        }
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntHistogram(IntHistogram intHistogram) {
        intHistogram.getClass();
        if (this.dataCase_ != 8 || this.data_ == IntHistogram.getDefaultInstance()) {
            this.data_ = intHistogram;
        } else {
            this.data_ = IntHistogram.newBuilder((IntHistogram) this.data_).mergeFrom(intHistogram).buildPartial();
        }
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntSum(IntSum intSum) {
        intSum.getClass();
        if (this.dataCase_ != 6 || this.data_ == IntSum.getDefaultInstance()) {
            this.data_ = intSum;
        } else {
            this.data_ = IntSum.newBuilder((IntSum) this.data_).mergeFrom(intSum).buildPartial();
        }
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSum(Sum sum) {
        sum.getClass();
        if (this.dataCase_ != 7 || this.data_ == Sum.getDefaultInstance()) {
            this.data_ = sum;
        } else {
            this.data_ = Sum.newBuilder((Sum) this.data_).mergeFrom(sum).buildPartial();
        }
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSummary(Summary summary) {
        summary.getClass();
        if (this.dataCase_ != 11 || this.data_ == Summary.getDefaultInstance()) {
            this.data_ = summary;
        } else {
            this.data_ = Summary.newBuilder((Summary) this.data_).mergeFrom(summary).buildPartial();
        }
        this.dataCase_ = 11;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Metric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGauge(Gauge gauge) {
        gauge.getClass();
        this.data_ = gauge;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistogram(Histogram histogram) {
        histogram.getClass();
        this.data_ = histogram;
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntGauge(IntGauge intGauge) {
        intGauge.getClass();
        this.data_ = intGauge;
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntHistogram(IntHistogram intHistogram) {
        intHistogram.getClass();
        this.data_ = intHistogram;
        this.dataCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntSum(IntSum intSum) {
        intSum.getClass();
        this.data_ = intSum;
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSum(Sum sum) {
        sum.getClass();
        this.data_ = sum;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(Summary summary) {
        summary.getClass();
        this.data_ = summary;
        this.dataCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.unit_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33169OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Metric();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\u000b<\u0000", new Object[]{"data_", "dataCase_", "name_", "description_", "unit_", IntGauge.class, Gauge.class, IntSum.class, Sum.class, IntHistogram.class, Histogram.class, Summary.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Metric> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Metric.class) {
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

    public DataCase getDataCase() {
        int i = this.dataCase_;
        if (i == 0) {
            return DataCase.DATA_NOT_SET;
        }
        if (i == 11) {
            return DataCase.SUMMARY;
        }
        switch (i) {
            case 4:
                return DataCase.INT_GAUGE;
            case 5:
                return DataCase.GAUGE;
            case 6:
                return DataCase.INT_SUM;
            case 7:
                return DataCase.SUM;
            case 8:
                return DataCase.INT_HISTOGRAM;
            case 9:
                return DataCase.HISTOGRAM;
            default:
                return null;
        }
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public Gauge getGauge() {
        return this.dataCase_ == 5 ? (Gauge) this.data_ : Gauge.getDefaultInstance();
    }

    public Histogram getHistogram() {
        return this.dataCase_ == 9 ? (Histogram) this.data_ : Histogram.getDefaultInstance();
    }

    @Deprecated
    public IntGauge getIntGauge() {
        return this.dataCase_ == 4 ? (IntGauge) this.data_ : IntGauge.getDefaultInstance();
    }

    @Deprecated
    public IntHistogram getIntHistogram() {
        return this.dataCase_ == 8 ? (IntHistogram) this.data_ : IntHistogram.getDefaultInstance();
    }

    @Deprecated
    public IntSum getIntSum() {
        return this.dataCase_ == 6 ? (IntSum) this.data_ : IntSum.getDefaultInstance();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Sum getSum() {
        return this.dataCase_ == 7 ? (Sum) this.data_ : Sum.getDefaultInstance();
    }

    public Summary getSummary() {
        return this.dataCase_ == 11 ? (Summary) this.data_ : Summary.getDefaultInstance();
    }

    public String getUnit() {
        return this.unit_;
    }

    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8(this.unit_);
    }

    public boolean hasGauge() {
        return this.dataCase_ == 5;
    }

    public boolean hasHistogram() {
        return this.dataCase_ == 9;
    }

    @Deprecated
    public boolean hasIntGauge() {
        return this.dataCase_ == 4;
    }

    @Deprecated
    public boolean hasIntHistogram() {
        return this.dataCase_ == 8;
    }

    @Deprecated
    public boolean hasIntSum() {
        return this.dataCase_ == 6;
    }

    public boolean hasSum() {
        return this.dataCase_ == 7;
    }

    public boolean hasSummary() {
        return this.dataCase_ == 11;
    }

    public static Builder newBuilder(Metric metric) {
        return DEFAULT_INSTANCE.createBuilder(metric);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
