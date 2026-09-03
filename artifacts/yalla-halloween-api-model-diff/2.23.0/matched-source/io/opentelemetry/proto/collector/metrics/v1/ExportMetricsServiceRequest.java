package io.opentelemetry.proto.collector.metrics.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.metrics.v1.ResourceMetrics;
import io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ExportMetricsServiceRequest extends GeneratedMessageLite<ExportMetricsServiceRequest, Builder> implements ExportMetricsServiceRequestOrBuilder {
    private static final ExportMetricsServiceRequest DEFAULT_INSTANCE;
    private static volatile Parser<ExportMetricsServiceRequest> PARSER = null;
    public static final int RESOURCE_METRICS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ResourceMetrics> resourceMetrics_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33138OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33138OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33138OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ExportMetricsServiceRequest, Builder> implements ExportMetricsServiceRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((ExportMetricsServiceRequest) this.instance).addAllResourceMetrics(arrayList);
        }

        private Builder() {
            super(ExportMetricsServiceRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        ExportMetricsServiceRequest exportMetricsServiceRequest = new ExportMetricsServiceRequest();
        DEFAULT_INSTANCE = exportMetricsServiceRequest;
        GeneratedMessageLite.registerDefaultInstance(ExportMetricsServiceRequest.class, exportMetricsServiceRequest);
    }

    private ExportMetricsServiceRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResourceMetrics(Iterable<? extends ResourceMetrics> iterable) {
        ensureResourceMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.resourceMetrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceMetrics(ResourceMetrics resourceMetrics) {
        resourceMetrics.getClass();
        ensureResourceMetricsIsMutable();
        this.resourceMetrics_.add(resourceMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceMetrics() {
        this.resourceMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureResourceMetricsIsMutable() {
        if (this.resourceMetrics_.isModifiable()) {
            return;
        }
        this.resourceMetrics_ = GeneratedMessageLite.mutableCopy(this.resourceMetrics_);
    }

    public static ExportMetricsServiceRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExportMetricsServiceRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportMetricsServiceRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExportMetricsServiceRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResourceMetrics(int i) {
        ensureResourceMetricsIsMutable();
        this.resourceMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceMetrics(int i, ResourceMetrics resourceMetrics) {
        resourceMetrics.getClass();
        ensureResourceMetricsIsMutable();
        this.resourceMetrics_.set(i, resourceMetrics);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33138OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new ExportMetricsServiceRequest();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"resourceMetrics_", ResourceMetrics.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExportMetricsServiceRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExportMetricsServiceRequest.class) {
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

    public ResourceMetrics getResourceMetrics(int i) {
        return this.resourceMetrics_.get(i);
    }

    public int getResourceMetricsCount() {
        return this.resourceMetrics_.size();
    }

    public List<ResourceMetrics> getResourceMetricsList() {
        return this.resourceMetrics_;
    }

    public ResourceMetricsOrBuilder getResourceMetricsOrBuilder(int i) {
        return this.resourceMetrics_.get(i);
    }

    public List<? extends ResourceMetricsOrBuilder> getResourceMetricsOrBuilderList() {
        return this.resourceMetrics_;
    }

    public static Builder newBuilder(ExportMetricsServiceRequest exportMetricsServiceRequest) {
        return DEFAULT_INSTANCE.createBuilder(exportMetricsServiceRequest);
    }

    public static ExportMetricsServiceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExportMetricsServiceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExportMetricsServiceRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceMetrics(int i, ResourceMetrics resourceMetrics) {
        resourceMetrics.getClass();
        ensureResourceMetricsIsMutable();
        this.resourceMetrics_.add(i, resourceMetrics);
    }

    public static ExportMetricsServiceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExportMetricsServiceRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExportMetricsServiceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExportMetricsServiceRequest parseFrom(InputStream inputStream) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportMetricsServiceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExportMetricsServiceRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExportMetricsServiceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportMetricsServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
