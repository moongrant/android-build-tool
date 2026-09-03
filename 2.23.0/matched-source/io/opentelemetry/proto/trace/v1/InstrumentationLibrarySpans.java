package io.opentelemetry.proto.trace.v1;

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
public final class InstrumentationLibrarySpans extends GeneratedMessageLite<InstrumentationLibrarySpans, Builder> implements InstrumentationLibrarySpansOrBuilder {
    private static final InstrumentationLibrarySpans DEFAULT_INSTANCE;
    public static final int INSTRUMENTATION_LIBRARY_FIELD_NUMBER = 1;
    private static volatile Parser<InstrumentationLibrarySpans> PARSER = null;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    public static final int SPANS_FIELD_NUMBER = 2;
    private InstrumentationLibrary instrumentationLibrary_;
    private Internal.ProtobufList<Span> spans_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.InstrumentationLibrarySpans$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33177OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f33177OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33177OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<InstrumentationLibrarySpans, Builder> implements InstrumentationLibrarySpansOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(List list) {
            copyOnWrite();
            ((InstrumentationLibrarySpans) this.instance).addAllSpans(list);
        }

        public final void OooO0Oo(InstrumentationLibrary instrumentationLibrary) {
            copyOnWrite();
            ((InstrumentationLibrarySpans) this.instance).setInstrumentationLibrary(instrumentationLibrary);
        }

        public final void OooO0o0(String str) {
            copyOnWrite();
            ((InstrumentationLibrarySpans) this.instance).setSchemaUrl(str);
        }

        private Builder() {
            super(InstrumentationLibrarySpans.DEFAULT_INSTANCE);
        }
    }

    static {
        InstrumentationLibrarySpans instrumentationLibrarySpans = new InstrumentationLibrarySpans();
        DEFAULT_INSTANCE = instrumentationLibrarySpans;
        GeneratedMessageLite.registerDefaultInstance(InstrumentationLibrarySpans.class, instrumentationLibrarySpans);
    }

    private InstrumentationLibrarySpans() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpans(Iterable<? extends Span> iterable) {
        ensureSpansIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.spans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpans(Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.add(span);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstrumentationLibrary() {
        this.instrumentationLibrary_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpans() {
        this.spans_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSpansIsMutable() {
        if (this.spans_.isModifiable()) {
            return;
        }
        this.spans_ = GeneratedMessageLite.mutableCopy(this.spans_);
    }

    public static InstrumentationLibrarySpans getDefaultInstance() {
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

    public static InstrumentationLibrarySpans parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationLibrarySpans parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<InstrumentationLibrarySpans> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpans(int i) {
        ensureSpansIsMutable();
        this.spans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstrumentationLibrary(InstrumentationLibrary instrumentationLibrary) {
        instrumentationLibrary.getClass();
        this.instrumentationLibrary_ = instrumentationLibrary;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpans(int i, Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.set(i, span);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f33177OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new InstrumentationLibrarySpans();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ", new Object[]{"instrumentationLibrary_", "spans_", Span.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<InstrumentationLibrarySpans> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (InstrumentationLibrarySpans.class) {
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

    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    public ByteString getSchemaUrlBytes() {
        return ByteString.copyFromUtf8(this.schemaUrl_);
    }

    public Span getSpans(int i) {
        return this.spans_.get(i);
    }

    public int getSpansCount() {
        return this.spans_.size();
    }

    public List<Span> getSpansList() {
        return this.spans_;
    }

    public SpanOrBuilder getSpansOrBuilder(int i) {
        return this.spans_.get(i);
    }

    public List<? extends SpanOrBuilder> getSpansOrBuilderList() {
        return this.spans_;
    }

    public boolean hasInstrumentationLibrary() {
        return this.instrumentationLibrary_ != null;
    }

    public static Builder newBuilder(InstrumentationLibrarySpans instrumentationLibrarySpans) {
        return DEFAULT_INSTANCE.createBuilder(instrumentationLibrarySpans);
    }

    public static InstrumentationLibrarySpans parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InstrumentationLibrarySpans parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static InstrumentationLibrarySpans parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpans(int i, Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.add(i, span);
    }

    public static InstrumentationLibrarySpans parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static InstrumentationLibrarySpans parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InstrumentationLibrarySpans parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static InstrumentationLibrarySpans parseFrom(InputStream inputStream) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationLibrarySpans parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InstrumentationLibrarySpans parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static InstrumentationLibrarySpans parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstrumentationLibrarySpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
