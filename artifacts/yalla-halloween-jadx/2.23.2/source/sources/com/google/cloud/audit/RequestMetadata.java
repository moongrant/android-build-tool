package com.google.cloud.audit;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.rpc.context.AttributeContext;
import java.io.IOException;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestMetadata extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final RequestMetadata f18497OooOO0 = new RequestMetadata();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f18498OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte f18499OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AttributeContext.Request f18503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AttributeContext.Peer f18504OooO0oo;

    public static class OooO00o extends AbstractParser<RequestMetadata> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RequestMetadata(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f18505OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18506OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18507OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AttributeContext.Request f18508OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public AttributeContext.Peer f18509OooO0oo;

        public OooO0O0() {
            this.f18505OooO0Oo = "";
            this.f18507OooO0o0 = "";
            this.f18506OooO0o = "";
            RequestMetadata requestMetadata = RequestMetadata.f18497OooOO0;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final RequestMetadata buildPartial() {
            RequestMetadata requestMetadata = new RequestMetadata(this);
            requestMetadata.f18500OooO0Oo = this.f18505OooO0Oo;
            requestMetadata.f18502OooO0o0 = this.f18507OooO0o0;
            requestMetadata.f18501OooO0o = this.f18506OooO0o;
            requestMetadata.f18503OooO0oO = this.f18508OooO0oO;
            requestMetadata.f18504OooO0oo = this.f18509OooO0oo;
            onBuilt();
            return requestMetadata;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18505OooO0Oo = "";
            this.f18507OooO0o0 = "";
            this.f18506OooO0o = "";
            this.f18508OooO0oO = null;
            this.f18509OooO0oo = null;
        }

        public final void OooO0o(RequestMetadata requestMetadata) {
            if (requestMetadata == RequestMetadata.f18497OooOO0) {
                return;
            }
            if (!requestMetadata.OooO0O0().isEmpty()) {
                this.f18505OooO0Oo = requestMetadata.f18500OooO0Oo;
                onChanged();
            }
            if (!requestMetadata.OooO0Oo().isEmpty()) {
                this.f18507OooO0o0 = requestMetadata.f18502OooO0o0;
                onChanged();
            }
            if (!requestMetadata.OooO0OO().isEmpty()) {
                this.f18506OooO0o = requestMetadata.f18501OooO0o;
                onChanged();
            }
            if (requestMetadata.f18503OooO0oO != null) {
                AttributeContext.Request requestOooO0o = requestMetadata.OooO0o();
                AttributeContext.Request request = this.f18508OooO0oO;
                if (request != null) {
                    AttributeContext.Request.OooO0O0 builder = AttributeContext.Request.f20522OooOOo0.toBuilder();
                    builder.OooO0oO(request);
                    builder.OooO0oO(requestOooO0o);
                    this.f18508OooO0oO = builder.buildPartial();
                } else {
                    this.f18508OooO0oO = requestOooO0o;
                }
                onChanged();
            }
            if (requestMetadata.f18504OooO0oo != null) {
                AttributeContext.Peer peerOooO0o0 = requestMetadata.OooO0o0();
                AttributeContext.Peer peer = this.f18509OooO0oo;
                if (peer != null) {
                    AttributeContext.Peer.OooO0O0 builder2 = AttributeContext.Peer.f20507OooOO0.toBuilder();
                    builder2.OooO0oO(peer);
                    builder2.OooO0oO(peerOooO0o0);
                    this.f18509OooO0oo = builder2.buildPartial();
                } else {
                    this.f18509OooO0oo = peerOooO0o0;
                }
                onChanged();
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            RequestMetadata requestMetadata;
            try {
                try {
                    RequestMetadata.f18498OooOO0O.getClass();
                    OooO0o(new RequestMetadata(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    requestMetadata = (RequestMetadata) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (requestMetadata != null) {
                            OooO0o(requestMetadata);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                requestMetadata = null;
                if (requestMetadata != null) {
                    OooO0o(requestMetadata);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            RequestMetadata requestMetadataBuildPartial = buildPartial();
            if (requestMetadataBuildPartial.isInitialized()) {
                return requestMetadataBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestMetadataBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0O0) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return RequestMetadata.f18497OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return p282o0O0O0o.OooO0O0.f41313OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return p282o0O0O0o.OooO0O0.f41314OooO0oo.ensureFieldAccessorsInitialized(RequestMetadata.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0O0) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (OooO0O0) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return RequestMetadata.f18497OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (OooO0O0) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (OooO0O0) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            RequestMetadata requestMetadataBuildPartial = buildPartial();
            if (requestMetadataBuildPartial.isInitialized()) {
                return requestMetadataBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestMetadataBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof RequestMetadata) {
                OooO0o((RequestMetadata) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18505OooO0Oo = "";
            this.f18507OooO0o0 = "";
            this.f18506OooO0o = "";
            RequestMetadata requestMetadata = RequestMetadata.f18497OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof RequestMetadata) {
                OooO0o((RequestMetadata) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public RequestMetadata(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18499OooO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18500OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18500OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18501OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18501OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18502OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18502OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final AttributeContext.Request OooO0o() {
        AttributeContext.Request request = this.f18503OooO0oO;
        return request == null ? AttributeContext.Request.f20522OooOOo0 : request;
    }

    public final AttributeContext.Peer OooO0o0() {
        AttributeContext.Peer peer = this.f18504OooO0oo;
        return peer == null ? AttributeContext.Peer.f20507OooOO0 : peer;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18497OooOO0) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0o(this);
        return oooO0O0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestMetadata)) {
            return super.equals(obj);
        }
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        if (!OooO0O0().equals(requestMetadata.OooO0O0()) || !OooO0Oo().equals(requestMetadata.OooO0Oo()) || !OooO0OO().equals(requestMetadata.OooO0OO())) {
            return false;
        }
        AttributeContext.Request request = this.f18503OooO0oO;
        if ((request != null) != (requestMetadata.f18503OooO0oO != null)) {
            return false;
        }
        if ((request != null) && !OooO0o().equals(requestMetadata.OooO0o())) {
            return false;
        }
        AttributeContext.Peer peer = this.f18504OooO0oo;
        if ((peer != null) != (requestMetadata.f18504OooO0oo != null)) {
            return false;
        }
        return (!(peer != null) || OooO0o0().equals(requestMetadata.OooO0o0())) && this.unknownFields.equals(requestMetadata.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18497OooOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<RequestMetadata> getParserForType() {
        return f18498OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f18500OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f18500OooO0Oo);
        if (!GeneratedMessageV3.isStringEmpty(this.f18502OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18502OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18501OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18501OooO0o);
        }
        if (this.f18503OooO0oO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(7, OooO0o());
        }
        if (this.f18504OooO0oo != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, OooO0o0());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = OooO0OO().hashCode() + ((((OooO0Oo().hashCode() + ((((OooO0O0().hashCode() + o0O0O0Oo.OooO00o.OooO00o(p282o0O0O0o.OooO0O0.f41313OooO0oO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (this.f18503OooO0oO != null) {
            iHashCode = OooO0o().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 7, 53);
        }
        if (this.f18504OooO0oo != null) {
            iHashCode = OooO0o0().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 8, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return p282o0O0O0o.OooO0O0.f41314OooO0oo.ensureFieldAccessorsInitialized(RequestMetadata.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18499OooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18499OooO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18497OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RequestMetadata();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18500OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18500OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18502OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18502OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18501OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18501OooO0o);
        }
        if (this.f18503OooO0oO != null) {
            codedOutputStream.writeMessage(7, OooO0o());
        }
        if (this.f18504OooO0oo != null) {
            codedOutputStream.writeMessage(8, OooO0o0());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18497OooOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18497OooOO0.toBuilder();
    }

    private RequestMetadata() {
        this.f18499OooO = (byte) -1;
        this.f18500OooO0Oo = "";
        this.f18502OooO0o0 = "";
        this.f18501OooO0o = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public RequestMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.f18500OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f18502OooO0o0 = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 26) {
                                if (tag == 58) {
                                    AttributeContext.Request request = this.f18503OooO0oO;
                                    AttributeContext.Request.OooO0O0 builder = request != null ? request.toBuilder() : null;
                                    AttributeContext.Request request2 = (AttributeContext.Request) codedInputStream.readMessage(AttributeContext.Request.f20521OooOOo, extensionRegistryLite);
                                    this.f18503OooO0oO = request2;
                                    if (builder != null) {
                                        builder.OooO0oO(request2);
                                        this.f18503OooO0oO = builder.buildPartial();
                                    }
                                } else if (tag != 66) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    AttributeContext.Peer peer = this.f18504OooO0oo;
                                    AttributeContext.Peer.OooO0O0 builder2 = peer != null ? peer.toBuilder() : null;
                                    AttributeContext.Peer peer2 = (AttributeContext.Peer) codedInputStream.readMessage(AttributeContext.Peer.f20508OooOO0O, extensionRegistryLite);
                                    this.f18504OooO0oo = peer2;
                                    if (builder2 != null) {
                                        builder2.OooO0oO(peer2);
                                        this.f18504OooO0oo = builder2.buildPartial();
                                    }
                                }
                            } else {
                                this.f18501OooO0o = codedInputStream.readStringRequireUtf8();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (UninitializedMessageException e2) {
                    throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
