package io.opentelemetry.proto.trace.v1;

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
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceSpans extends GeneratedMessageLite<ResourceSpans, Builder> implements ResourceSpansOrBuilder {
    private static final ResourceSpans DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_LIBRARY_SPANS_FIELD_NUMBER = 2;
    private static volatile Parser<ResourceSpans> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    private Resource resource_;
    private Internal.ProtobufList<InstrumentationLibrarySpans> instrumentationLibrarySpans_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.ResourceSpans$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33179OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33179OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33179OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceSpans, Builder> implements ResourceSpansOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(InstrumentationLibrarySpans instrumentationLibrarySpans) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addInstrumentationLibrarySpans(instrumentationLibrarySpans);
        }

        public final void OooO0Oo(Resource resource) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setResource(resource);
        }

        public final void OooO0o0(String str) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setSchemaUrl(str);
        }

        private Builder() {
            super(ResourceSpans.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceSpans resourceSpans = new ResourceSpans();
        DEFAULT_INSTANCE = resourceSpans;
        GeneratedMessageLite.registerDefaultInstance(ResourceSpans.class, resourceSpans);
    }

    private ResourceSpans() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInstrumentationLibrarySpans(Iterable<? extends InstrumentationLibrarySpans> iterable) {
        ensureInstrumentationLibrarySpansIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.instrumentationLibrarySpans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstrumentationLibrarySpans(InstrumentationLibrarySpans instrumentationLibrarySpans) {
        instrumentationLibrarySpans.getClass();
        ensureInstrumentationLibrarySpansIsMutable();
        this.instrumentationLibrarySpans_.add(instrumentationLibrarySpans);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrumentationLibrarySpans() {
        this.instrumentationLibrarySpans_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    private void ensureInstrumentationLibrarySpansIsMutable() {
        if (this.instrumentationLibrarySpans_.isModifiable()) {
            return;
        }
        this.instrumentationLibrarySpans_ = GeneratedMessageLite.mutableCopy(this.instrumentationLibrarySpans_);
    }

    public static ResourceSpans getDefaultInstance() {
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

    public static ResourceSpans parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSpans parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ResourceSpans> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInstrumentationLibrarySpans(int i) {
        ensureInstrumentationLibrarySpansIsMutable();
        this.instrumentationLibrarySpans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrumentationLibrarySpans(int i, InstrumentationLibrarySpans instrumentationLibrarySpans) {
        instrumentationLibrarySpans.getClass();
        ensureInstrumentationLibrarySpansIsMutable();
        this.instrumentationLibrarySpans_.set(i, instrumentationLibrarySpans);
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
        switch (AnonymousClass1.f33179OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceSpans();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ", new Object[]{"resource_", "instrumentationLibrarySpans_", InstrumentationLibrarySpans.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ResourceSpans> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ResourceSpans.class) {
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

    public InstrumentationLibrarySpans getInstrumentationLibrarySpans(int i) {
        return this.instrumentationLibrarySpans_.get(i);
    }

    public int getInstrumentationLibrarySpansCount() {
        return this.instrumentationLibrarySpans_.size();
    }

    public List<InstrumentationLibrarySpans> getInstrumentationLibrarySpansList() {
        return this.instrumentationLibrarySpans_;
    }

    public InstrumentationLibrarySpansOrBuilder getInstrumentationLibrarySpansOrBuilder(int i) {
        return this.instrumentationLibrarySpans_.get(i);
    }

    public List<? extends InstrumentationLibrarySpansOrBuilder> getInstrumentationLibrarySpansOrBuilderList() {
        return this.instrumentationLibrarySpans_;
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

    public static Builder newBuilder(ResourceSpans resourceSpans) {
        return DEFAULT_INSTANCE.createBuilder(resourceSpans);
    }

    public static ResourceSpans parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceSpans parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ResourceSpans parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstrumentationLibrarySpans(int i, InstrumentationLibrarySpans instrumentationLibrarySpans) {
        instrumentationLibrarySpans.getClass();
        ensureInstrumentationLibrarySpansIsMutable();
        this.instrumentationLibrarySpans_.add(i, instrumentationLibrarySpans);
    }

    public static ResourceSpans parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ResourceSpans parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceSpans parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ResourceSpans parseFrom(InputStream inputStream) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSpans parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ResourceSpans parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ResourceSpans parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
