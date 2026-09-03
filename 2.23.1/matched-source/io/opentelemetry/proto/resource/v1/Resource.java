package io.opentelemetry.proto.resource.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    private static final Resource DEFAULT_INSTANCE;
    public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<Resource> PARSER;
    private Internal.ProtobufList<KeyValue> attributes_ = GeneratedMessageLite.emptyProtobufList();
    private int droppedAttributesCount_;

    /* JADX INFO: renamed from: io.opentelemetry.proto.resource.v1.Resource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32639OooO00o;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f32639OooO00o = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32639OooO00o[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Resource, Builder> implements ResourceOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final void OooO0O0(KeyValue keyValue) {
            copyOnWrite();
            ((Resource) this.instance).addAttributes(keyValue);
        }

        private Builder() {
            super(Resource.DEFAULT_INSTANCE);
        }
    }

    static {
        Resource resource = new Resource();
        DEFAULT_INSTANCE = resource;
        GeneratedMessageLite.registerDefaultInstance(Resource.class, resource);
    }

    private Resource() {
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

    private void ensureAttributesIsMutable() {
        if (this.attributes_.isModifiable()) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(this.attributes_);
    }

    public static Resource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Resource> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 0;
        switch (AnonymousClass1.f32639OooO00o[methodToInvoke.ordinal()]) {
            case 1:
                return new Resource();
            case 2:
                return new Builder(i);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"attributes_", KeyValue.class, "droppedAttributesCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Resource> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Resource.class) {
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

    public static Builder newBuilder(Resource resource) {
        return DEFAULT_INSTANCE.createBuilder(resource);
    }

    public static Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    public static Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Resource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Resource parseFrom(InputStream inputStream) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Resource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
