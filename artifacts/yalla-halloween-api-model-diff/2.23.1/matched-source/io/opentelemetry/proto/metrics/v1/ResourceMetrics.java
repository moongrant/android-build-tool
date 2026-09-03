package io.opentelemetry.proto.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.resource.v1.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceMetrics extends GeneratedMessageLite<ResourceMetrics, Builder> implements ResourceMetricsOrBuilder {
    private static final ResourceMetrics DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_LIBRARY_METRICS_FIELD_NUMBER = 2;
    private static volatile Parser<ResourceMetrics> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    private Resource resource_;
    private Internal.ProtobufList<InstrumentationLibraryMetrics> instrumentationLibraryMetrics_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.metrics.v1.ResourceMetrics$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32635OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32635OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32635OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceMetrics, Builder> implements ResourceMetricsOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((ResourceMetrics) this.instance).addAllInstrumentationLibraryMetrics(arrayList);
        }

        public final void OooO0Oo(Resource resource) {
            copyOnWrite();
            ((ResourceMetrics) this.instance).setResource(resource);
        }

        public final void OooO0o0(String str) {
            copyOnWrite();
            ((ResourceMetrics) this.instance).setSchemaUrl(str);
        }

        private Builder() {
            super(ResourceMetrics.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceMetrics resourceMetrics = new ResourceMetrics();
        DEFAULT_INSTANCE = resourceMetrics;
        GeneratedMessageLite.registerDefaultInstance(ResourceMetrics.class, resourceMetrics);
    }

    private ResourceMetrics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInstrumentationLibraryMetrics(Iterable<? extends InstrumentationLibraryMetrics> iterable) {
        ensureInstrumentationLibraryMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.instrumentationLibraryMetrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstrumentationLibraryMetrics(InstrumentationLibraryMetrics instrumentationLibraryMetrics) {
        instrumentationLibraryMetrics.getClass();
        ensureInstrumentationLibraryMetricsIsMutable();
        this.instrumentationLibraryMetrics_.add(instrumentationLibraryMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrumentationLibraryMetrics() {
        this.instrumentationLibraryMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    private void ensureInstrumentationLibraryMetricsIsMutable() {
        if (this.instrumentationLibraryMetrics_.isModifiable()) {
            return;
        }
        this.instrumentationLibraryMetrics_ = GeneratedMessageLite.mutableCopy(this.instrumentationLibraryMetrics_);
    }

    public static ResourceMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
            this.resource_ = resource;
        } else {
            this.resource_ = Resource.newBuilder(this.resource_).mergeFrom(resource).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResourceMetrics> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInstrumentationLibraryMetrics(int i) {
        ensureInstrumentationLibraryMetricsIsMutable();
        this.instrumentationLibraryMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrumentationLibraryMetrics(int i, InstrumentationLibraryMetrics instrumentationLibraryMetrics) {
        instrumentationLibraryMetrics.getClass();
        ensureInstrumentationLibraryMetricsIsMutable();
        this.instrumentationLibraryMetrics_.set(i, instrumentationLibraryMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
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
        switch (AnonymousClass1.f32635OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceMetrics();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ", new Object[]{"resource_", "instrumentationLibraryMetrics_", InstrumentationLibraryMetrics.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResourceMetrics> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResourceMetrics.class) {
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

    public InstrumentationLibraryMetrics getInstrumentationLibraryMetrics(int i) {
        return this.instrumentationLibraryMetrics_.get(i);
    }

    public int getInstrumentationLibraryMetricsCount() {
        return this.instrumentationLibraryMetrics_.size();
    }

    public List<InstrumentationLibraryMetrics> getInstrumentationLibraryMetricsList() {
        return this.instrumentationLibraryMetrics_;
    }

    public InstrumentationLibraryMetricsOrBuilder getInstrumentationLibraryMetricsOrBuilder(int i) {
        return this.instrumentationLibraryMetrics_.get(i);
    }

    public List<? extends InstrumentationLibraryMetricsOrBuilder> getInstrumentationLibraryMetricsOrBuilderList() {
        return this.instrumentationLibraryMetrics_;
    }

    public Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    public boolean hasResource() {
        return this.resource_ != null;
    }

    public static Builder newBuilder(ResourceMetrics resourceMetrics) {
        return DEFAULT_INSTANCE.createBuilder(resourceMetrics);
    }

    public static ResourceMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstrumentationLibraryMetrics(int i, InstrumentationLibraryMetrics instrumentationLibraryMetrics) {
        instrumentationLibraryMetrics.getClass();
        ensureInstrumentationLibraryMetricsIsMutable();
        this.instrumentationLibraryMetrics_.add(i, instrumentationLibraryMetrics);
    }

    public static ResourceMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResourceMetrics parseFrom(InputStream inputStream) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
