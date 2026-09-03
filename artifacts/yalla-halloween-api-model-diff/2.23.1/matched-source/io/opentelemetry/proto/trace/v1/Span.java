package io.opentelemetry.proto.trace.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Span extends GeneratedMessageLite<Span, Builder> implements SpanOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 9;
    private static final Span DEFAULT_INSTANCE;
    public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 10;
    public static final int DROPPED_EVENTS_COUNT_FIELD_NUMBER = 12;
    public static final int DROPPED_LINKS_COUNT_FIELD_NUMBER = 14;
    public static final int END_TIME_UNIX_NANO_FIELD_NUMBER = 8;
    public static final int EVENTS_FIELD_NUMBER = 11;
    public static final int KIND_FIELD_NUMBER = 6;
    public static final int LINKS_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 5;
    public static final int PARENT_SPAN_ID_FIELD_NUMBER = 4;
    private static volatile Parser<Span> PARSER = null;
    public static final int SPAN_ID_FIELD_NUMBER = 2;
    public static final int START_TIME_UNIX_NANO_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 15;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    public static final int TRACE_STATE_FIELD_NUMBER = 3;
    private Internal.ProtobufList<KeyValue> attributes_;
    private int droppedAttributesCount_;
    private int droppedEventsCount_;
    private int droppedLinksCount_;
    private long endTimeUnixNano_;
    private Internal.ProtobufList<Event> events_;
    private int kind_;
    private Internal.ProtobufList<Link> links_;
    private String name_;
    private ByteString parentSpanId_;
    private ByteString spanId_;
    private long startTimeUnixNano_;
    private Status status_;
    private ByteString traceId_;
    private String traceState_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.trace.v1.Span$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32644OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32644OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32644OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Span, Builder> implements SpanOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO(SpanKind spanKind) {
            copyOnWrite();
            ((Span) this.instance).setKind(spanKind);
        }

        public final void OooO0O0(KeyValue keyValue) {
            copyOnWrite();
            ((Span) this.instance).addAttributes(keyValue);
        }

        public final void OooO0Oo(Event event) {
            copyOnWrite();
            ((Span) this.instance).addEvents(event);
        }

        public final void OooO0o(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedEventsCount(i);
        }

        public final void OooO0o0(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedAttributesCount(i);
        }

        public final void OooO0oO(int i) {
            copyOnWrite();
            ((Span) this.instance).setDroppedLinksCount(i);
        }

        public final void OooO0oo(long j) {
            copyOnWrite();
            ((Span) this.instance).setEndTimeUnixNano(j);
        }

        public final void OooOO0(String str) {
            copyOnWrite();
            ((Span) this.instance).setName(str);
        }

        public final void OooOO0O(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setParentSpanId(byteString);
        }

        public final void OooOO0o(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setSpanId(byteString);
        }

        public final void OooOOO(Status status) {
            copyOnWrite();
            ((Span) this.instance).setStatus(status);
        }

        public final void OooOOO0(long j) {
            copyOnWrite();
            ((Span) this.instance).setStartTimeUnixNano(j);
        }

        public final void OooOOOO(ByteString byteString) {
            copyOnWrite();
            ((Span) this.instance).setTraceId(byteString);
        }

        private Builder() {
            super(Span.DEFAULT_INSTANCE);
        }
    }

    public static final class Event extends GeneratedMessageLite<Event, Builder> implements EventOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 3;
        private static final Event DEFAULT_INSTANCE;
        public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Event> PARSER = null;
        public static final int TIME_UNIX_NANO_FIELD_NUMBER = 1;
        private int droppedAttributesCount_;
        private long timeUnixNano_;
        private String name_ = "";
        private Internal.ProtobufList<KeyValue> attributes_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<Event, Builder> implements EventOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public final void OooO0O0(KeyValue keyValue) {
                copyOnWrite();
                ((Event) this.instance).addAttributes(keyValue);
            }

            public final void OooO0Oo(int i) {
                copyOnWrite();
                ((Event) this.instance).setDroppedAttributesCount(i);
            }

            public final void OooO0o(long j) {
                copyOnWrite();
                ((Event) this.instance).setTimeUnixNano(j);
            }

            public final void OooO0o0(String str) {
                copyOnWrite();
                ((Event) this.instance).setName(str);
            }

            private Builder() {
                super(Event.DEFAULT_INSTANCE);
            }
        }

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            GeneratedMessageLite.registerDefaultInstance(Event.class, event);
        }

        private Event() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
            ensureAttributesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDroppedAttributesCount() {
            this.droppedAttributesCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
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

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Event> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttributes(int i) {
            ensureAttributesIsMutable();
            this.attributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.set(i, keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDroppedAttributesCount(int i) {
            this.droppedAttributesCount_ = i;
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
        public void setTimeUnixNano(long j) {
            this.timeUnixNano_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.f32644OooO00o[methodToInvoke.ordinal()]) {
                case 1:
                    return new Event();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0005\u0002Ȉ\u0003\u001b\u0004\u000b", new Object[]{"timeUnixNano_", "name_", "attributes_", KeyValue.class, "droppedAttributesCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Event> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Event.class) {
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

        public int getDroppedAttributesCount() {
            return this.droppedAttributesCount_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public long getTimeUnixNano() {
            return this.timeUnixNano_;
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.createBuilder(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(i, keyValue);
        }

        public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EventOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Link extends GeneratedMessageLite<Link, Builder> implements LinkOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 4;
        private static final Link DEFAULT_INSTANCE;
        public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 5;
        private static volatile Parser<Link> PARSER = null;
        public static final int SPAN_ID_FIELD_NUMBER = 2;
        public static final int TRACE_ID_FIELD_NUMBER = 1;
        public static final int TRACE_STATE_FIELD_NUMBER = 3;
        private Internal.ProtobufList<KeyValue> attributes_;
        private int droppedAttributesCount_;
        private ByteString spanId_;
        private ByteString traceId_;
        private String traceState_;

        public static final class Builder extends GeneratedMessageLite.Builder<Link, Builder> implements LinkOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public final void OooO0O0(KeyValue keyValue) {
                copyOnWrite();
                ((Link) this.instance).addAttributes(keyValue);
            }

            private Builder() {
                super(Link.DEFAULT_INSTANCE);
            }
        }

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.registerDefaultInstance(Link.class, link);
        }

        private Link() {
            ByteString byteString = ByteString.EMPTY;
            this.traceId_ = byteString;
            this.spanId_ = byteString;
            this.traceState_ = "";
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
            ensureAttributesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttributes() {
            this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDroppedAttributesCount() {
            this.droppedAttributesCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpanId() {
            this.spanId_ = getDefaultInstance().getSpanId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceId() {
            this.traceId_ = getDefaultInstance().getTraceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTraceState() {
            this.traceState_ = getDefaultInstance().getTraceState();
        }

        private void ensureAttributesIsMutable() {
            if (this.attributes_.isModifiable()) {
                return;
            }
            this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttributes(int i) {
            ensureAttributesIsMutable();
            this.attributes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.set(i, keyValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDroppedAttributesCount(int i) {
            this.droppedAttributesCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpanId(ByteString byteString) {
            byteString.getClass();
            this.spanId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceId(ByteString byteString) {
            byteString.getClass();
            this.traceId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceState(String str) {
            str.getClass();
            this.traceState_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTraceStateBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.traceState_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = 0;
            switch (AnonymousClass1.f32644OooO00o[methodToInvoke.ordinal()]) {
                case 1:
                    return new Link();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\n\u0002\n\u0003Ȉ\u0004\u001b\u0005\u000b", new Object[]{"traceId_", "spanId_", "traceState_", "attributes_", KeyValue.class, "droppedAttributesCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Link> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Link.class) {
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

        public int getDroppedAttributesCount() {
            return this.droppedAttributesCount_;
        }

        public ByteString getSpanId() {
            return this.spanId_;
        }

        public ByteString getTraceId() {
            return this.traceId_;
        }

        public String getTraceState() {
            return this.traceState_;
        }

        public ByteString getTraceStateBytes() {
            return ByteString.copyFromUtf8(this.traceState_);
        }

        public static Builder newBuilder(Link link) {
            return DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttributes(int i, KeyValue keyValue) {
            keyValue.getClass();
            ensureAttributesIsMutable();
            this.attributes_.add(i, keyValue);
        }

        public static Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Link parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Link parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LinkOrBuilder extends MessageLiteOrBuilder {
    }

    public enum SpanKind implements Internal.EnumLite {
        SPAN_KIND_UNSPECIFIED(0),
        SPAN_KIND_INTERNAL(1),
        SPAN_KIND_SERVER(2),
        SPAN_KIND_CLIENT(3),
        SPAN_KIND_PRODUCER(4),
        SPAN_KIND_CONSUMER(5),
        UNRECOGNIZED(-1);

        public static final int SPAN_KIND_CLIENT_VALUE = 3;
        public static final int SPAN_KIND_CONSUMER_VALUE = 5;
        public static final int SPAN_KIND_INTERNAL_VALUE = 1;
        public static final int SPAN_KIND_PRODUCER_VALUE = 4;
        public static final int SPAN_KIND_SERVER_VALUE = 2;
        public static final int SPAN_KIND_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<SpanKind> internalValueMap = new Internal.EnumLiteMap<SpanKind>() { // from class: io.opentelemetry.proto.trace.v1.Span.SpanKind.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return SpanKind.OooO00o(i);
            }
        };
        private final int value;

        public static final class SpanKindVerifier implements Internal.EnumVerifier {
            static {
                new SpanKindVerifier();
            }

            private SpanKindVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return SpanKind.OooO00o(i) != null;
            }
        }

        SpanKind(int i) {
            this.value = i;
        }

        public static SpanKind OooO00o(int i) {
            if (i == 0) {
                return SPAN_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return SPAN_KIND_INTERNAL;
            }
            if (i == 2) {
                return SPAN_KIND_SERVER;
            }
            if (i == 3) {
                return SPAN_KIND_CLIENT;
            }
            if (i == 4) {
                return SPAN_KIND_PRODUCER;
            }
            if (i != 5) {
                return null;
            }
            return SPAN_KIND_CONSUMER;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Span span = new Span();
        DEFAULT_INSTANCE = span;
        GeneratedMessageLite.registerDefaultInstance(Span.class, span);
    }

    private Span() {
        ByteString byteString = ByteString.EMPTY;
        this.traceId_ = byteString;
        this.spanId_ = byteString;
        this.traceState_ = "";
        this.parentSpanId_ = byteString;
        this.name_ = "";
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
        this.events_ = GeneratedMessageLite.emptyProtobufList();
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends Event> iterable) {
        ensureEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedAttributesCount() {
        this.droppedAttributesCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedEventsCount() {
        this.droppedEventsCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedLinksCount() {
        this.droppedLinksCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimeUnixNano() {
        this.endTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentSpanId() {
        this.parentSpanId_ = getDefaultInstance().getParentSpanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpanId() {
        this.spanId_ = getDefaultInstance().getSpanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeUnixNano() {
        this.startTimeUnixNano_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceState() {
        this.traceState_ = getDefaultInstance().getTraceState();
    }

    private void ensureAttributesIsMutable() {
        if (this.attributes_.isModifiable()) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
    }

    private void ensureEventsIsMutable() {
        if (this.events_.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(this.events_);
    }

    private void ensureLinksIsMutable() {
        if (this.links_.isModifiable()) {
            return;
        }
        this.links_ = GeneratedMessageLite.mutableCopy(this.links_);
    }

    public static Span getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = Status.newBuilder(this.status_).mergeFrom(status).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Span parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Span) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Span parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Span> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i) {
        ensureEventsIsMutable();
        this.events_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i) {
        ensureLinksIsMutable();
        this.links_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedAttributesCount(int i) {
        this.droppedAttributesCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedEventsCount(int i) {
        this.droppedEventsCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedLinksCount(int i) {
        this.droppedLinksCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeUnixNano(long j) {
        this.endTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.set(i, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(SpanKind spanKind) {
        this.kind_ = spanKind.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.set(i, link);
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
    public void setParentSpanId(ByteString byteString) {
        byteString.getClass();
        this.parentSpanId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpanId(ByteString byteString) {
        byteString.getClass();
        this.spanId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeUnixNano(long j) {
        this.startTimeUnixNano_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(ByteString byteString) {
        byteString.getClass();
        this.traceId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceState(String str) {
        str.getClass();
        this.traceState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceStateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.traceState_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32644OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Span();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0003\u0000\u0001\n\u0002\n\u0003Ȉ\u0004\n\u0005Ȉ\u0006\f\u0007\u0005\b\u0005\t\u001b\n\u000b\u000b\u001b\f\u000b\r\u001b\u000e\u000b\u000f\t", new Object[]{"traceId_", "spanId_", "traceState_", "parentSpanId_", "name_", "kind_", "startTimeUnixNano_", "endTimeUnixNano_", "attributes_", KeyValue.class, "droppedAttributesCount_", "events_", Event.class, "droppedEventsCount_", "links_", Link.class, "droppedLinksCount_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Span> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Span.class) {
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

    public int getDroppedAttributesCount() {
        return this.droppedAttributesCount_;
    }

    public int getDroppedEventsCount() {
        return this.droppedEventsCount_;
    }

    public int getDroppedLinksCount() {
        return this.droppedLinksCount_;
    }

    public long getEndTimeUnixNano() {
        return this.endTimeUnixNano_;
    }

    public Event getEvents(int i) {
        return this.events_.get(i);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<Event> getEventsList() {
        return this.events_;
    }

    public EventOrBuilder getEventsOrBuilder(int i) {
        return this.events_.get(i);
    }

    public List<? extends EventOrBuilder> getEventsOrBuilderList() {
        return this.events_;
    }

    public SpanKind getKind() {
        SpanKind spanKindOooO00o = SpanKind.OooO00o(this.kind_);
        return spanKindOooO00o == null ? SpanKind.UNRECOGNIZED : spanKindOooO00o;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public Link getLinks(int i) {
        return this.links_.get(i);
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int i) {
        return this.links_.get(i);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public ByteString getParentSpanId() {
        return this.parentSpanId_;
    }

    public ByteString getSpanId() {
        return this.spanId_;
    }

    public long getStartTimeUnixNano() {
        return this.startTimeUnixNano_;
    }

    public Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    public ByteString getTraceId() {
        return this.traceId_;
    }

    public String getTraceState() {
        return this.traceState_;
    }

    public ByteString getTraceStateBytes() {
        return ByteString.copyFromUtf8(this.traceState_);
    }

    public boolean hasStatus() {
        return this.status_ != null;
    }

    public static Builder newBuilder(Span span) {
        return DEFAULT_INSTANCE.createBuilder(span);
    }

    public static Span parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Span) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Span parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Span parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i, Event event) {
        event.getClass();
        ensureEventsIsMutable();
        this.events_.add(i, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(i, link);
    }

    public static Span parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Span parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Span parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Span parseFrom(InputStream inputStream) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Span parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Span parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Span parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Span) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
