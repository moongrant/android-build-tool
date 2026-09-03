package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.common.v1.InstrumentationLibrary;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class InstrumentationLibraryMetrics extends GeneratedMessageLite<InstrumentationLibraryMetrics, Builder> implements InstrumentationLibraryMetricsOrBuilder {
    private static final InstrumentationLibraryMetrics DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_LIBRARY_FIELD_NUMBER = 1;
    public static final int METRICS_FIELD_NUMBER = 2;
    private static volatile Parser<InstrumentationLibraryMetrics> PARSER = null;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    private InstrumentationLibrary instrumentationLibrary_;
    private Internal.ProtobufList<Metric> metrics_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.InstrumentationLibraryMetrics$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32629OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32629OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32629OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<InstrumentationLibraryMetrics, Builder> implements InstrumentationLibraryMetricsOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(Iterable iterable) {
            copyOnWrite();
            ((InstrumentationLibraryMetrics) this.instance).addAllMetrics(iterable);
        }

        public final void OooO0Oo(InstrumentationLibrary instrumentationLibrary) {
            copyOnWrite();
            ((InstrumentationLibraryMetrics) this.instance).setInstrumentationLibrary(instrumentationLibrary);
        }

        public final void OooO0o0(String str) {
            copyOnWrite();
            ((InstrumentationLibraryMetrics) this.instance).setSchemaUrl(str);
        }

        private Builder() {
            super(InstrumentationLibraryMetrics.DEFAULT_INSTANCE);
        }
    }

    static {
        InstrumentationLibraryMetrics instrumentationLibraryMetrics = new InstrumentationLibraryMetrics();
        DEFAULT_INSTANCE = instrumentationLibraryMetrics;
        GeneratedMessageLite.registerDefaultInstance(InstrumentationLibraryMetrics.class, instrumentationLibraryMetrics);
    }

    private InstrumentationLibraryMetrics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends Metric> iterable) {
        ensureMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(Metric metric) {
        metric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrumentationLibrary() {
        this.instrumentationLibrary_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    private void ensureMetricsIsMutable() {
        if (this.metrics_.isModifiable()) {
            return;
        }
        this.metrics_ = GeneratedMessageLite.mutableCopy(this.metrics_);
    }

    public static InstrumentationLibraryMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstrumentationLibrary(InstrumentationLibrary instrumentationLibrary) {
        instrumentationLibrary.getClass();
        InstrumentationLibrary instrumentationLibrary2 = this.instrumentationLibrary_;
        if (instrumentationLibrary2 == null || instrumentationLibrary2 == InstrumentationLibrary.getDefaultInstance()) {
            this.instrumentationLibrary_ = instrumentationLibrary;
        } else {
            this.instrumentationLibrary_ = InstrumentationLibrary.newBuilder(this.instrumentationLibrary_).mergeFrom(instrumentationLibrary).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static InstrumentationLibraryMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationLibraryMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<InstrumentationLibraryMetrics> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrumentationLibrary(InstrumentationLibrary instrumentationLibrary) {
        instrumentationLibrary.getClass();
        this.instrumentationLibrary_ = instrumentationLibrary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i, Metric metric) {
        metric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, metric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrl(String str) {
        str.getClass();
        this.schemaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schemaUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32629OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new InstrumentationLibraryMetrics();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ", new Object[]{"instrumentationLibrary_", "metrics_", Metric.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<InstrumentationLibraryMetrics> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (InstrumentationLibraryMetrics.class) {
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

    public InstrumentationLibrary getInstrumentationLibrary() {
        InstrumentationLibrary instrumentationLibrary = this.instrumentationLibrary_;
        return instrumentationLibrary == null ? InstrumentationLibrary.getDefaultInstance() : instrumentationLibrary;
    }

    public Metric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    public MetricOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    public boolean hasInstrumentationLibrary() {
        return this.instrumentationLibrary_ != null;
    }

    public static Builder newBuilder(InstrumentationLibraryMetrics instrumentationLibraryMetrics) {
        return DEFAULT_INSTANCE.createBuilder(instrumentationLibraryMetrics);
    }

    public static InstrumentationLibraryMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InstrumentationLibraryMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static InstrumentationLibraryMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i, Metric metric) {
        metric.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, metric);
    }

    public static InstrumentationLibraryMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static InstrumentationLibraryMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InstrumentationLibraryMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static InstrumentationLibraryMetrics parseFrom(InputStream inputStream) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationLibraryMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InstrumentationLibraryMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static InstrumentationLibraryMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibraryMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
