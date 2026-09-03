package io.opentelemetry.proto.collector.trace.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import io.opentelemetry.proto.trace.v1.ResourceSpans;
import io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ExportTraceServiceRequest extends GeneratedMessageLite<ExportTraceServiceRequest, Builder> implements ExportTraceServiceRequestOrBuilder {
    private static final ExportTraceServiceRequest DEFAULT_INSTANCE;
    private static volatile Parser<ExportTraceServiceRequest> PARSER = null;
    public static final int RESOURCE_SPANS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ResourceSpans> resourceSpans_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32604OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32604OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32604OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ExportTraceServiceRequest, Builder> implements ExportTraceServiceRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(ArrayList arrayList) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addAllResourceSpans(arrayList);
        }

        private Builder() {
            super(ExportTraceServiceRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        ExportTraceServiceRequest exportTraceServiceRequest = new ExportTraceServiceRequest();
        DEFAULT_INSTANCE = exportTraceServiceRequest;
        GeneratedMessageLite.registerDefaultInstance(ExportTraceServiceRequest.class, exportTraceServiceRequest);
    }

    private ExportTraceServiceRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResourceSpans(Iterable<? extends ResourceSpans> iterable) {
        ensureResourceSpansIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.resourceSpans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceSpans(ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.add(resourceSpans);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceSpans() {
        this.resourceSpans_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureResourceSpansIsMutable() {
        if (this.resourceSpans_.isModifiable()) {
            return;
        }
        this.resourceSpans_ = GeneratedMessageLite.mutableCopy(this.resourceSpans_);
    }

    public static ExportTraceServiceRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExportTraceServiceRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExportTraceServiceRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResourceSpans(int i) {
        ensureResourceSpansIsMutable();
        this.resourceSpans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceSpans(int i, ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.set(i, resourceSpans);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32604OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new ExportTraceServiceRequest();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"resourceSpans_", ResourceSpans.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExportTraceServiceRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExportTraceServiceRequest.class) {
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

    public ResourceSpans getResourceSpans(int i) {
        return this.resourceSpans_.get(i);
    }

    public int getResourceSpansCount() {
        return this.resourceSpans_.size();
    }

    public List<ResourceSpans> getResourceSpansList() {
        return this.resourceSpans_;
    }

    public ResourceSpansOrBuilder getResourceSpansOrBuilder(int i) {
        return this.resourceSpans_.get(i);
    }

    public List<? extends ResourceSpansOrBuilder> getResourceSpansOrBuilderList() {
        return this.resourceSpans_;
    }

    public static Builder newBuilder(ExportTraceServiceRequest exportTraceServiceRequest) {
        return DEFAULT_INSTANCE.createBuilder(exportTraceServiceRequest);
    }

    public static ExportTraceServiceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExportTraceServiceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExportTraceServiceRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceSpans(int i, ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.add(i, resourceSpans);
    }

    public static ExportTraceServiceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExportTraceServiceRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExportTraceServiceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExportTraceServiceRequest parseFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExportTraceServiceRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExportTraceServiceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
