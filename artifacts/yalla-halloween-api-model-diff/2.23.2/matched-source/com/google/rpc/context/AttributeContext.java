package com.google.rpc.context;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;
import p328o0O0oooO.oo0O;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributeContext extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Resource f20463OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Peer f20464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Peer f20465OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Peer f20466OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Request f20467OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Response f20468OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Api f20469OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public List<Any> f20470OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte f20471OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final AttributeContext f20462OooOOO0 = new AttributeContext();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f20461OooOOO = new OooO00o();

    public static final class Api extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final Api f20472OooO = new Api();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final OooO00o f20473OooOO0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20474OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f20475OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f20476OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f20477OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public byte f20478OooO0oo;

        public static class OooO00o extends AbstractParser<Api> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Api(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20479OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Object f20480OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20481OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20482OooO0oO;

            public OooO0O0() {
                this.f20479OooO0Oo = "";
                this.f20481OooO0o0 = "";
                this.f20480OooO0o = "";
                this.f20482OooO0oO = "";
                Api api = Api.f20472OooO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Api buildPartial() {
                Api api = new Api(this);
                api.f20474OooO0Oo = this.f20479OooO0Oo;
                api.f20476OooO0o0 = this.f20481OooO0o0;
                api.f20475OooO0o = this.f20480OooO0o;
                api.f20477OooO0oO = this.f20482OooO0oO;
                onBuilt();
                return api;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20479OooO0Oo = "";
                this.f20481OooO0o0 = "";
                this.f20480OooO0o = "";
                this.f20482OooO0oO = "";
            }

            public final void OooO0o(Api api) {
                if (api == Api.f20472OooO) {
                    return;
                }
                if (!api.OooO0Oo().isEmpty()) {
                    this.f20479OooO0Oo = api.f20474OooO0Oo;
                    onChanged();
                }
                if (!api.OooO0O0().isEmpty()) {
                    this.f20481OooO0o0 = api.f20476OooO0o0;
                    onChanged();
                }
                if (!api.OooO0OO().isEmpty()) {
                    this.f20480OooO0o = api.f20475OooO0o;
                    onChanged();
                }
                if (!api.getVersion().isEmpty()) {
                    this.f20482OooO0oO = api.f20477OooO0oO;
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
                Api api;
                try {
                    try {
                        Api.f20473OooOO0.getClass();
                        OooO0o(new Api(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        api = (Api) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (api != null) {
                                OooO0o(api);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    api = null;
                    if (api != null) {
                        OooO0o(api);
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
                Api apiBuildPartial = buildPartial();
                if (apiBuildPartial.isInitialized()) {
                    return apiBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) apiBuildPartial);
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
                return Api.f20472OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42098OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42100OooO0oO.ensureFieldAccessorsInitialized(Api.class, OooO0O0.class);
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
                return Api.f20472OooO;
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
                Api apiBuildPartial = buildPartial();
                if (apiBuildPartial.isInitialized()) {
                    return apiBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) apiBuildPartial);
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
                if (message instanceof Api) {
                    OooO0o((Api) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f20479OooO0Oo = "";
                this.f20481OooO0o0 = "";
                this.f20480OooO0o = "";
                this.f20482OooO0oO = "";
                Api api = Api.f20472OooO;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Api) {
                    OooO0o((Api) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public Api(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20478OooO0oo = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f20476OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20476OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f20475OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20475OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20474OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20474OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20472OooO) {
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
            if (!(obj instanceof Api)) {
                return super.equals(obj);
            }
            Api api = (Api) obj;
            return OooO0Oo().equals(api.OooO0Oo()) && OooO0O0().equals(api.OooO0O0()) && OooO0OO().equals(api.OooO0OO()) && getVersion().equals(api.getVersion()) && this.unknownFields.equals(api.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20472OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Api> getParserForType() {
            return f20473OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20474OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20474OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f20476OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20476OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20475OooO0o)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f20475OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20477OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f20477OooO0oO);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public final String getVersion() {
            Object obj = this.f20477OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20477OooO0oO = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getVersion().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0O0().hashCode() + ((((OooO0Oo().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42098OooO0o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42100OooO0oO.ensureFieldAccessorsInitialized(Api.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20478OooO0oo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20478OooO0oo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20472OooO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Api();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20474OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20474OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20476OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20476OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20475OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20475OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20477OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f20477OooO0oO);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20472OooO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20472OooO.toBuilder();
        }

        private Api() {
            this.f20478OooO0oo = (byte) -1;
            this.f20474OooO0Oo = "";
            this.f20476OooO0o0 = "";
            this.f20475OooO0o = "";
            this.f20477OooO0oO = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public Api(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.f20474OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.f20476OooO0o0 = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    this.f20475OooO0o = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f20477OooO0oO = codedInputStream.readStringRequireUtf8();
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

    public static final class Auth extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final Auth f20483OooOO0 = new Auth();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f20484OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f20485OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20486OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f20487OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LazyStringList f20488OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Struct f20489OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public LazyStringList f20490OooO0oo;

        public static class OooO00o extends AbstractParser<Auth> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Auth(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public LazyStringList f20491OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f20492OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public LazyStringList f20493OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20494OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20495OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Struct f20496OooO0oo;

            public OooO0O0() {
                this.f20494OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20493OooO0o = lazyStringList;
                this.f20495OooO0oO = "";
                this.f20491OooO = lazyStringList;
                Auth auth = Auth.f20483OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Auth buildPartial() {
                Auth auth = new Auth(this);
                auth.f20486OooO0Oo = this.f20494OooO0o0;
                if ((this.f20492OooO0Oo & 1) != 0) {
                    this.f20493OooO0o = this.f20493OooO0o.getUnmodifiableView();
                    this.f20492OooO0Oo &= -2;
                }
                auth.f20488OooO0o0 = this.f20493OooO0o;
                auth.f20487OooO0o = this.f20495OooO0oO;
                auth.f20489OooO0oO = this.f20496OooO0oo;
                if ((this.f20492OooO0Oo & 2) != 0) {
                    this.f20491OooO = this.f20491OooO.getUnmodifiableView();
                    this.f20492OooO0Oo &= -3;
                }
                auth.f20490OooO0oo = this.f20491OooO;
                onBuilt();
                return auth;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20494OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20493OooO0o = lazyStringList;
                int i = this.f20492OooO0Oo & (-2);
                this.f20495OooO0oO = "";
                this.f20496OooO0oo = null;
                this.f20491OooO = lazyStringList;
                this.f20492OooO0Oo = i & (-3);
            }

            public final void OooO0o(Auth auth) {
                if (auth == Auth.f20483OooOO0) {
                    return;
                }
                if (!auth.OooO0Oo().isEmpty()) {
                    this.f20494OooO0o0 = auth.f20486OooO0Oo;
                    onChanged();
                }
                if (!auth.f20488OooO0o0.isEmpty()) {
                    if (this.f20493OooO0o.isEmpty()) {
                        this.f20493OooO0o = auth.f20488OooO0o0;
                        this.f20492OooO0Oo &= -2;
                    } else {
                        if ((this.f20492OooO0Oo & 1) == 0) {
                            this.f20493OooO0o = new LazyStringArrayList(this.f20493OooO0o);
                            this.f20492OooO0Oo |= 1;
                        }
                        this.f20493OooO0o.addAll(auth.f20488OooO0o0);
                    }
                    onChanged();
                }
                if (!auth.OooO0OO().isEmpty()) {
                    this.f20495OooO0oO = auth.f20487OooO0o;
                    onChanged();
                }
                if (auth.f20489OooO0oO != null) {
                    Struct structOooO0O0 = auth.OooO0O0();
                    Struct struct = this.f20496OooO0oo;
                    if (struct != null) {
                        this.f20496OooO0oo = Struct.newBuilder(struct).mergeFrom(structOooO0O0).buildPartial();
                    } else {
                        this.f20496OooO0oo = structOooO0O0;
                    }
                    onChanged();
                }
                if (!auth.f20490OooO0oo.isEmpty()) {
                    if (this.f20491OooO.isEmpty()) {
                        this.f20491OooO = auth.f20490OooO0oo;
                        this.f20492OooO0Oo &= -3;
                    } else {
                        if ((this.f20492OooO0Oo & 2) == 0) {
                            this.f20491OooO = new LazyStringArrayList(this.f20491OooO);
                            this.f20492OooO0Oo |= 2;
                        }
                        this.f20491OooO.addAll(auth.f20490OooO0oo);
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
                Auth auth;
                try {
                    try {
                        Auth.f20484OooOO0O.getClass();
                        OooO0o(new Auth(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        auth = (Auth) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (auth != null) {
                                OooO0o(auth);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    auth = null;
                    if (auth != null) {
                        OooO0o(auth);
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
                Auth authBuildPartial = buildPartial();
                if (authBuildPartial.isInitialized()) {
                    return authBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) authBuildPartial);
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
                return Auth.f20483OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42101OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42093OooO.ensureFieldAccessorsInitialized(Auth.class, OooO0O0.class);
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
                return Auth.f20483OooOO0;
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
                Auth authBuildPartial = buildPartial();
                if (authBuildPartial.isInitialized()) {
                    return authBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) authBuildPartial);
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
                if (message instanceof Auth) {
                    OooO0o((Auth) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f20494OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20493OooO0o = lazyStringList;
                this.f20495OooO0oO = "";
                this.f20491OooO = lazyStringList;
                Auth auth = Auth.f20483OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Auth) {
                    OooO0o((Auth) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public Auth(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20485OooO = (byte) -1;
        }

        public final Struct OooO0O0() {
            Struct struct = this.f20489OooO0oO;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public final String OooO0OO() {
            Object obj = this.f20487OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20487OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20486OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20486OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20483OooOO0) {
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
            if (!(obj instanceof Auth)) {
                return super.equals(obj);
            }
            Auth auth = (Auth) obj;
            if (!OooO0Oo().equals(auth.OooO0Oo()) || !this.f20488OooO0o0.equals(auth.f20488OooO0o0) || !OooO0OO().equals(auth.OooO0OO())) {
                return false;
            }
            Struct struct = this.f20489OooO0oO;
            if ((struct != null) != (auth.f20489OooO0oO != null)) {
                return false;
            }
            return (!(struct != null) || OooO0O0().equals(auth.OooO0O0())) && this.f20490OooO0oo.equals(auth.f20490OooO0oo) && this.unknownFields.equals(auth.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20483OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Auth> getParserForType() {
            return f20484OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f20486OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f20486OooO0Oo) + 0 : 0;
            int iOooO00o = 0;
            for (int i2 = 0; i2 < this.f20488OooO0o0.size(); i2++) {
                iOooO00o = o000O0o.OooO00o(this.f20488OooO0o0, i2, iOooO00o);
            }
            int size = (this.f20488OooO0o0.size() * 1) + iComputeStringSize + iOooO00o;
            if (!GeneratedMessageV3.isStringEmpty(this.f20487OooO0o)) {
                size += GeneratedMessageV3.computeStringSize(3, this.f20487OooO0o);
            }
            if (this.f20489OooO0oO != null) {
                size += CodedOutputStream.computeMessageSize(4, OooO0O0());
            }
            int iOooO00o2 = 0;
            for (int i3 = 0; i3 < this.f20490OooO0oo.size(); i3++) {
                iOooO00o2 = o000O0o.OooO00o(this.f20490OooO0oo, i3, iOooO00o2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.f20490OooO0oo.size() * 1) + size + iOooO00o2;
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
            int iHashCode = OooO0Oo().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42101OooO0oo, 779, 37, 1, 53);
            if (this.f20488OooO0o0.size() > 0) {
                iHashCode = this.f20488OooO0o0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = OooO0OO().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 3, 53);
            if (this.f20489OooO0oO != null) {
                iHashCode2 = OooO0O0().hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 4, 53);
            }
            if (this.f20490OooO0oo.size() > 0) {
                iHashCode2 = this.f20490OooO0oo.hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 5, 53);
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42093OooO.ensureFieldAccessorsInitialized(Auth.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20485OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20485OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20483OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Auth();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20486OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20486OooO0Oo);
            }
            int iOooO00o = 0;
            while (iOooO00o < this.f20488OooO0o0.size()) {
                iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f20488OooO0o0, iOooO00o, codedOutputStream, 2, iOooO00o, 1);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20487OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20487OooO0o);
            }
            if (this.f20489OooO0oO != null) {
                codedOutputStream.writeMessage(4, OooO0O0());
            }
            int iOooO00o2 = 0;
            while (iOooO00o2 < this.f20490OooO0oo.size()) {
                iOooO00o2 = com.app.base.protobuf.OooO0O0.OooO00o(this.f20490OooO0oo, iOooO00o2, codedOutputStream, 5, iOooO00o2, 1);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20483OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20483OooOO0.toBuilder();
        }

        private Auth() {
            this.f20485OooO = (byte) -1;
            this.f20486OooO0Oo = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f20488OooO0o0 = lazyStringList;
            this.f20487OooO0o = "";
            this.f20490OooO0oo = lazyStringList;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public Auth(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f20486OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if ((i & 1) == 0) {
                                        this.f20488OooO0o0 = new LazyStringArrayList();
                                        i |= 1;
                                    }
                                    this.f20488OooO0o0.add(stringRequireUtf8);
                                } else if (tag == 26) {
                                    this.f20487OooO0o = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    Struct struct = this.f20489OooO0oO;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.f20489OooO0oO = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.f20489OooO0oO = builder.buildPartial();
                                    }
                                } else if (tag != 42) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                    if ((i & 2) == 0) {
                                        this.f20490OooO0oo = new LazyStringArrayList();
                                        i |= 2;
                                    }
                                    this.f20490OooO0oo.add(stringRequireUtf9);
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e3) {
                        throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) != 0) {
                        this.f20488OooO0o0 = this.f20488OooO0o0.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.f20490OooO0oo = this.f20490OooO0oo.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) != 0) {
                this.f20488OooO0o0 = this.f20488OooO0o0.getUnmodifiableView();
            }
            if ((i & 2) != 0) {
                this.f20490OooO0oo = this.f20490OooO0oo.getUnmodifiableView();
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public static class OooO00o extends AbstractParser<AttributeContext> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AttributeContext(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Response f20497OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20498OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Peer f20499OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Peer f20500OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Peer f20501OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Request f20502OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Resource f20503OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Api f20504OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public List<Any> f20505OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> f20506OooOOO0;

        public OooO0O0() {
            this.f20505OooOO0o = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AttributeContext buildPartial() {
            AttributeContext attributeContext = new AttributeContext(this);
            int i = this.f20498OooO0Oo;
            attributeContext.f20464OooO0Oo = this.f20500OooO0o0;
            attributeContext.f20466OooO0o0 = this.f20499OooO0o;
            attributeContext.f20465OooO0o = this.f20501OooO0oO;
            attributeContext.f20467OooO0oO = this.f20502OooO0oo;
            attributeContext.f20468OooO0oo = this.f20497OooO;
            attributeContext.f20463OooO = this.f20503OooOO0;
            attributeContext.f20469OooOO0 = this.f20504OooOO0O;
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f20506OooOOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.f20505OooOO0o = Collections.unmodifiableList(this.f20505OooOO0o);
                    this.f20498OooO0Oo &= -2;
                }
                attributeContext.f20470OooOO0O = this.f20505OooOO0o;
            } else {
                attributeContext.f20470OooOO0O = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return attributeContext;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20500OooO0o0 = null;
            this.f20499OooO0o = null;
            this.f20501OooO0oO = null;
            this.f20502OooO0oo = null;
            this.f20497OooO = null;
            this.f20503OooOO0 = null;
            this.f20504OooOO0O = null;
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f20506OooOOO0;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f20505OooOO0o = Collections.emptyList();
                this.f20498OooO0Oo &= -2;
            }
        }

        public final RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> OooO0o() {
            if (this.f20506OooOOO0 == null) {
                this.f20506OooOOO0 = new RepeatedFieldBuilderV3<>(this.f20505OooOO0o, (this.f20498OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f20505OooOO0o = null;
            }
            return this.f20506OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final void OooO0oO(AttributeContext attributeContext) {
            if (attributeContext == AttributeContext.f20462OooOOO0) {
                return;
            }
            if (attributeContext.f20464OooO0Oo != null) {
                Peer peerOooO0o = attributeContext.OooO0o();
                Peer peer = this.f20500OooO0o0;
                if (peer != null) {
                    Peer.OooO0O0 builder = Peer.f20507OooOO0.toBuilder();
                    builder.OooO0oO(peer);
                    builder.OooO0oO(peerOooO0o);
                    this.f20500OooO0o0 = builder.buildPartial();
                } else {
                    this.f20500OooO0o0 = peerOooO0o;
                }
                onChanged();
            }
            if (attributeContext.f20466OooO0o0 != null) {
                Peer peerOooOO0 = attributeContext.OooOO0();
                Peer peer2 = this.f20499OooO0o;
                if (peer2 != null) {
                    Peer.OooO0O0 builder2 = Peer.f20507OooOO0.toBuilder();
                    builder2.OooO0oO(peer2);
                    builder2.OooO0oO(peerOooOO0);
                    this.f20499OooO0o = builder2.buildPartial();
                } else {
                    this.f20499OooO0o = peerOooOO0;
                }
                onChanged();
            }
            if (attributeContext.f20465OooO0o != null) {
                Peer peerOooO0o0 = attributeContext.OooO0o0();
                Peer peer3 = this.f20501OooO0oO;
                if (peer3 != null) {
                    Peer.OooO0O0 builder3 = Peer.f20507OooOO0.toBuilder();
                    builder3.OooO0oO(peer3);
                    builder3.OooO0oO(peerOooO0o0);
                    this.f20501OooO0oO = builder3.buildPartial();
                } else {
                    this.f20501OooO0oO = peerOooO0o0;
                }
                onChanged();
            }
            if (attributeContext.f20467OooO0oO != null) {
                Request requestOooO0oO = attributeContext.OooO0oO();
                Request request = this.f20502OooO0oo;
                if (request != null) {
                    Request.OooO0O0 builder4 = Request.f20522OooOOo0.toBuilder();
                    builder4.OooO0oO(request);
                    builder4.OooO0oO(requestOooO0oO);
                    this.f20502OooO0oo = builder4.buildPartial();
                } else {
                    this.f20502OooO0oo = requestOooO0oO;
                }
                onChanged();
            }
            if (attributeContext.f20468OooO0oo != null) {
                Response responseOooO = attributeContext.OooO();
                Response response = this.f20497OooO;
                if (response != null) {
                    Response.OooO0O0 builder5 = Response.f20578OooOO0.toBuilder();
                    builder5.OooO0oO(response);
                    builder5.OooO0oO(responseOooO);
                    this.f20497OooO = builder5.buildPartial();
                } else {
                    this.f20497OooO = responseOooO;
                }
                onChanged();
            }
            if (attributeContext.f20463OooO != null) {
                Resource resourceOooO0oo = attributeContext.OooO0oo();
                Resource resource = this.f20503OooOO0;
                if (resource != null) {
                    Resource.OooO0OO builder6 = Resource.f20550OooOOo0.toBuilder();
                    builder6.OooO0oo(resource);
                    builder6.OooO0oo(resourceOooO0oo);
                    this.f20503OooOO0 = builder6.buildPartial();
                } else {
                    this.f20503OooOO0 = resourceOooO0oo;
                }
                onChanged();
            }
            if (attributeContext.f20469OooOO0 != null) {
                Api apiOooO0Oo = attributeContext.OooO0Oo();
                Api api = this.f20504OooOO0O;
                if (api != null) {
                    Api.OooO0O0 builder7 = Api.f20472OooO.toBuilder();
                    builder7.OooO0o(api);
                    builder7.OooO0o(apiOooO0Oo);
                    this.f20504OooOO0O = builder7.buildPartial();
                } else {
                    this.f20504OooOO0O = apiOooO0Oo;
                }
                onChanged();
            }
            if (this.f20506OooOOO0 == null) {
                if (!attributeContext.f20470OooOO0O.isEmpty()) {
                    if (this.f20505OooOO0o.isEmpty()) {
                        this.f20505OooOO0o = attributeContext.f20470OooOO0O;
                        this.f20498OooO0Oo &= -2;
                    } else {
                        if ((this.f20498OooO0Oo & 1) == 0) {
                            this.f20505OooOO0o = new ArrayList(this.f20505OooOO0o);
                            this.f20498OooO0Oo |= 1;
                        }
                        this.f20505OooOO0o.addAll(attributeContext.f20470OooOO0O);
                    }
                    onChanged();
                }
            } else if (!attributeContext.f20470OooOO0O.isEmpty()) {
                if (this.f20506OooOOO0.isEmpty()) {
                    this.f20506OooOOO0.dispose();
                    this.f20506OooOOO0 = null;
                    this.f20505OooOO0o = attributeContext.f20470OooOO0O;
                    this.f20498OooO0Oo &= -2;
                    this.f20506OooOOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f20506OooOOO0.addAllMessages(attributeContext.f20470OooOO0O);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AttributeContext attributeContext;
            try {
                try {
                    AttributeContext.f20461OooOOO.getClass();
                    OooO0oO(new AttributeContext(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    attributeContext = (AttributeContext) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (attributeContext != null) {
                            OooO0oO(attributeContext);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                attributeContext = null;
                if (attributeContext != null) {
                    OooO0oO(attributeContext);
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
            AttributeContext attributeContextBuildPartial = buildPartial();
            if (attributeContextBuildPartial.isInitialized()) {
                return attributeContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) attributeContextBuildPartial);
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
            return AttributeContext.f20462OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return oo0O.f42094OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42095OooO0O0.ensureFieldAccessorsInitialized(AttributeContext.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
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
            return AttributeContext.f20462OooOOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
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
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            AttributeContext attributeContextBuildPartial = buildPartial();
            if (attributeContextBuildPartial.isInitialized()) {
                return attributeContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) attributeContextBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
            OooO0Oo();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f20505OooOO0o = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof AttributeContext) {
                OooO0oO((AttributeContext) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof AttributeContext) {
                OooO0oO((AttributeContext) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public static final class Peer extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final Peer f20507OooOO0 = new Peer();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f20508OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f20509OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20510OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f20511OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f20512OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f20513OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f20514OooO0oo;

        public static class OooO00o extends AbstractParser<Peer> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Peer(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20515OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f20516OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public long f20517OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20518OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f20519OooO0oo;

            public OooO0O0() {
                this.f20515OooO0Oo = "";
                this.f20518OooO0oO = "";
                this.f20519OooO0oo = "";
                Peer peer = Peer.f20507OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Peer buildPartial() {
                Peer peer = new Peer(this);
                peer.f20510OooO0Oo = this.f20515OooO0Oo;
                peer.f20512OooO0o0 = this.f20517OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f20516OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f20520OooO00o);
                }
                peer.f20511OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                peer.f20513OooO0oO = this.f20518OooO0oO;
                peer.f20514OooO0oo = this.f20519OooO0oo;
                onBuilt();
                return peer;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20515OooO0Oo = "";
                this.f20517OooO0o0 = 0L;
                OooO0o().clear();
                this.f20518OooO0oO = "";
                this.f20519OooO0oo = "";
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f20516OooO0o == null) {
                    this.f20516OooO0o = MapField.newMapField(OooO0OO.f20520OooO00o);
                }
                if (!this.f20516OooO0o.isMutable()) {
                    this.f20516OooO0o = this.f20516OooO0o.copy();
                }
                return this.f20516OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            public final void OooO0oO(Peer peer) {
                if (peer == Peer.f20507OooOO0) {
                    return;
                }
                if (!peer.getIp().isEmpty()) {
                    this.f20515OooO0Oo = peer.f20510OooO0Oo;
                    onChanged();
                }
                long j = peer.f20512OooO0o0;
                if (j != 0) {
                    this.f20517OooO0o0 = j;
                    onChanged();
                }
                OooO0o().mergeFrom(peer.OooO0Oo());
                if (!peer.OooO0O0().isEmpty()) {
                    this.f20518OooO0oO = peer.f20513OooO0oO;
                    onChanged();
                }
                if (!peer.OooO0OO().isEmpty()) {
                    this.f20519OooO0oo = peer.f20514OooO0oo;
                    onChanged();
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Peer peer;
                try {
                    try {
                        Peer.f20508OooOO0O.getClass();
                        OooO0oO(new Peer(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        peer = (Peer) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (peer != null) {
                                OooO0oO(peer);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    peer = null;
                    if (peer != null) {
                        OooO0oO(peer);
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
                Peer peerBuildPartial = buildPartial();
                if (peerBuildPartial.isInitialized()) {
                    return peerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) peerBuildPartial);
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
                return Peer.f20507OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42096OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42097OooO0Oo.ensureFieldAccessorsInitialized(Peer.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 6) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f20516OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f20520OooO00o) : mapField;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMutableMapField(int i) {
                if (i == 6) {
                    return OooO0o();
                }
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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
                return Peer.f20507OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                Peer peerBuildPartial = buildPartial();
                if (peerBuildPartial.isInitialized()) {
                    return peerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) peerBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Peer) {
                    OooO0oO((Peer) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f20515OooO0Oo = "";
                this.f20518OooO0oO = "";
                this.f20519OooO0oo = "";
                Peer peer = Peer.f20507OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Peer) {
                    OooO0oO((Peer) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f20520OooO00o;

            static {
                Descriptors.Descriptor descriptor = oo0O.f42099OooO0o0;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20520OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Peer(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20509OooO = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f20513OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20513OooO0oO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f20514OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20514OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final MapField<String, String> OooO0Oo() {
            MapField<String, String> mapField = this.f20511OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f20520OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20507OooOO0) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0oO(this);
            return oooO0O0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Peer)) {
                return super.equals(obj);
            }
            Peer peer = (Peer) obj;
            return getIp().equals(peer.getIp()) && this.f20512OooO0o0 == peer.f20512OooO0o0 && OooO0Oo().equals(peer.OooO0Oo()) && OooO0O0().equals(peer.OooO0O0()) && OooO0OO().equals(peer.OooO0OO()) && this.unknownFields.equals(peer.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20507OooOO0;
        }

        public final String getIp() {
            Object obj = this.f20510OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20510OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Peer> getParserForType() {
            return f20508OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20510OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20510OooO0Oo);
            long j = this.f20512OooO0o0;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(2, j);
            }
            for (Map.Entry<String, String> entry : OooO0Oo().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooO0OO.f20520OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20513OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f20513OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20514OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f20514OooO0oo);
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
            int iHashLong = Internal.hashLong(this.f20512OooO0o0) + ((((getIp().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42096OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooO0Oo().getMap().isEmpty()) {
                iHashLong = o00Ooo.OooO00o(iHashLong, 37, 6, 53) + OooO0Oo().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + ((OooO0OO().hashCode() + ((((OooO0O0().hashCode() + o00Ooo.OooO00o(iHashLong, 37, 7, 53)) * 37) + 8) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42097OooO0Oo.ensureFieldAccessorsInitialized(Peer.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final MapField internalGetMapField(int i) {
            if (i == 6) {
                return OooO0Oo();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20509OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20509OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20507OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Peer();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20510OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20510OooO0Oo);
            }
            long j = this.f20512OooO0o0;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0Oo(), OooO0OO.f20520OooO00o, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.f20513OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20513OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20514OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.f20514OooO0oo);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20507OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20507OooOO0.toBuilder();
        }

        private Peer() {
            this.f20509OooO = (byte) -1;
            this.f20510OooO0Oo = "";
            this.f20513OooO0oO = "";
            this.f20514OooO0oo = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Peer(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.f20510OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 16) {
                                    this.f20512OooO0o0 = codedInputStream.readInt64();
                                } else if (tag == 50) {
                                    if (!(z2 & true)) {
                                        this.f20511OooO0o = MapField.newMapField(OooO0OO.f20520OooO00o);
                                        z2 |= true;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f20520OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f20511OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                } else if (tag == 58) {
                                    this.f20513OooO0oO = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 66) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f20514OooO0oo = codedInputStream.readStringRequireUtf8();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e3) {
                        throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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

    public static final class Request extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public volatile Object f20523OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20524OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f20525OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f20526OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f20527OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f20528OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public volatile Object f20529OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Timestamp f20530OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f20531OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public volatile Object f20532OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public volatile Object f20533OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Auth f20534OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public byte f20535OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Request f20522OooOOo0 = new Request();

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f20521OooOOo = new OooO00o();

        public static class OooO00o extends AbstractParser<Request> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Request(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public Object f20536OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20537OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f20538OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20539OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20540OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f20541OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public Object f20542OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public Timestamp f20543OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public long f20544OooOO0o;

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public Object f20545OooOOO;

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public Object f20546OooOOO0;

            /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
            public Auth f20547OooOOOO;

            public OooO0O0() {
                this.f20537OooO0Oo = "";
                this.f20539OooO0o0 = "";
                this.f20540OooO0oO = "";
                this.f20541OooO0oo = "";
                this.f20536OooO = "";
                this.f20542OooOO0 = "";
                this.f20546OooOOO0 = "";
                this.f20545OooOOO = "";
                Request request = Request.f20522OooOOo0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Request buildPartial() {
                Request request = new Request(this);
                request.f20524OooO0Oo = this.f20537OooO0Oo;
                request.f20526OooO0o0 = this.f20539OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f20538OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f20548OooO00o);
                }
                request.f20525OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                request.f20527OooO0oO = this.f20540OooO0oO;
                request.f20528OooO0oo = this.f20541OooO0oo;
                request.f20523OooO = this.f20536OooO;
                request.f20529OooOO0 = this.f20542OooOO0;
                request.f20530OooOO0O = this.f20543OooOO0O;
                request.f20531OooOO0o = this.f20544OooOO0o;
                request.f20533OooOOO0 = this.f20546OooOOO0;
                request.f20532OooOOO = this.f20545OooOOO;
                request.f20534OooOOOO = this.f20547OooOOOO;
                onBuilt();
                return request;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20537OooO0Oo = "";
                this.f20539OooO0o0 = "";
                OooO0o().clear();
                this.f20540OooO0oO = "";
                this.f20541OooO0oo = "";
                this.f20536OooO = "";
                this.f20542OooOO0 = "";
                this.f20543OooOO0O = null;
                this.f20544OooOO0o = 0L;
                this.f20546OooOOO0 = "";
                this.f20545OooOOO = "";
                this.f20547OooOOOO = null;
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f20538OooO0o == null) {
                    this.f20538OooO0o = MapField.newMapField(OooO0OO.f20548OooO00o);
                }
                if (!this.f20538OooO0o.isMutable()) {
                    this.f20538OooO0o = this.f20538OooO0o.copy();
                }
                return this.f20538OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            public final void OooO0oO(Request request) {
                if (request == Request.f20522OooOOo0) {
                    return;
                }
                if (!request.OooO0Oo().isEmpty()) {
                    this.f20537OooO0Oo = request.f20524OooO0Oo;
                    onChanged();
                }
                if (!request.OooO0o0().isEmpty()) {
                    this.f20539OooO0o0 = request.f20526OooO0o0;
                    onChanged();
                }
                OooO0o().mergeFrom(request.OooOO0O());
                if (!request.OooO0o().isEmpty()) {
                    this.f20540OooO0oO = request.f20527OooO0oO;
                    onChanged();
                }
                if (!request.OooO0OO().isEmpty()) {
                    this.f20541OooO0oo = request.f20528OooO0oo;
                    onChanged();
                }
                if (!request.OooO().isEmpty()) {
                    this.f20536OooO = request.f20523OooO;
                    onChanged();
                }
                if (!request.OooO0oo().isEmpty()) {
                    this.f20542OooOO0 = request.f20529OooOO0;
                    onChanged();
                }
                if (request.f20530OooOO0O != null) {
                    Timestamp timestampOooOO0 = request.OooOO0();
                    Timestamp timestamp = this.f20543OooOO0O;
                    if (timestamp != null) {
                        this.f20543OooOO0O = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooOO0).buildPartial();
                    } else {
                        this.f20543OooOO0O = timestampOooOO0;
                    }
                    onChanged();
                }
                long j = request.f20531OooOO0o;
                if (j != 0) {
                    this.f20544OooOO0o = j;
                    onChanged();
                }
                if (!request.OooO0oO().isEmpty()) {
                    this.f20546OooOOO0 = request.f20533OooOOO0;
                    onChanged();
                }
                if (!request.getReason().isEmpty()) {
                    this.f20545OooOOO = request.f20532OooOOO;
                    onChanged();
                }
                if (request.f20534OooOOOO != null) {
                    Auth authOooO0O0 = request.OooO0O0();
                    Auth auth = this.f20547OooOOOO;
                    if (auth != null) {
                        Auth.OooO0O0 builder = Auth.f20483OooOO0.toBuilder();
                        builder.OooO0o(auth);
                        builder.OooO0o(authOooO0O0);
                        this.f20547OooOOOO = builder.buildPartial();
                    } else {
                        this.f20547OooOOOO = authOooO0O0;
                    }
                    onChanged();
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Request request;
                try {
                    try {
                        Request.f20521OooOOo.getClass();
                        OooO0oO(new Request(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        request = (Request) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (request != null) {
                                OooO0oO(request);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    request = null;
                    if (request != null) {
                        OooO0oO(request);
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
                Request requestBuildPartial = buildPartial();
                if (requestBuildPartial.isInitialized()) {
                    return requestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
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
                return Request.f20522OooOOo0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42102OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42103OooOO0O.ensureFieldAccessorsInitialized(Request.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 3) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f20538OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f20548OooO00o) : mapField;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMutableMapField(int i) {
                if (i == 3) {
                    return OooO0o();
                }
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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
                return Request.f20522OooOOo0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                Request requestBuildPartial = buildPartial();
                if (requestBuildPartial.isInitialized()) {
                    return requestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Request) {
                    OooO0oO((Request) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Request) {
                    OooO0oO((Request) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f20537OooO0Oo = "";
                this.f20539OooO0o0 = "";
                this.f20540OooO0oO = "";
                this.f20541OooO0oo = "";
                this.f20536OooO = "";
                this.f20542OooOO0 = "";
                this.f20546OooOOO0 = "";
                this.f20545OooOOO = "";
                Request request = Request.f20522OooOOo0;
            }
        }

        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f20548OooO00o;

            static {
                Descriptors.Descriptor descriptor = oo0O.f42104OooOO0o;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20548OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Request(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20535OooOOOo = (byte) -1;
        }

        public final String OooO() {
            Object obj = this.f20523OooO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20523OooO = stringUtf8;
            return stringUtf8;
        }

        public final Auth OooO0O0() {
            Auth auth = this.f20534OooOOOO;
            return auth == null ? Auth.f20483OooOO0 : auth;
        }

        public final String OooO0OO() {
            Object obj = this.f20528OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20528OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20524OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20524OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o() {
            Object obj = this.f20527OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20527OooO0oO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o0() {
            Object obj = this.f20526OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20526OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oO() {
            Object obj = this.f20533OooOOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20533OooOOO0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oo() {
            Object obj = this.f20529OooOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20529OooOO0 = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooOO0() {
            Timestamp timestamp = this.f20530OooOO0O;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooOO0O() {
            MapField<String, String> mapField = this.f20525OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f20548OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20522OooOOo0) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0oO(this);
            return oooO0O0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return super.equals(obj);
            }
            Request request = (Request) obj;
            if (!OooO0Oo().equals(request.OooO0Oo()) || !OooO0o0().equals(request.OooO0o0()) || !OooOO0O().equals(request.OooOO0O()) || !OooO0o().equals(request.OooO0o()) || !OooO0OO().equals(request.OooO0OO()) || !OooO().equals(request.OooO()) || !OooO0oo().equals(request.OooO0oo())) {
                return false;
            }
            Timestamp timestamp = this.f20530OooOO0O;
            if ((timestamp != null) != (request.f20530OooOO0O != null)) {
                return false;
            }
            if (((timestamp != null) && !OooOO0().equals(request.OooOO0())) || this.f20531OooOO0o != request.f20531OooOO0o || !OooO0oO().equals(request.OooO0oO()) || !getReason().equals(request.getReason())) {
                return false;
            }
            Auth auth = this.f20534OooOOOO;
            if ((auth != null) != (request.f20534OooOOOO != null)) {
                return false;
            }
            return (!(auth != null) || OooO0O0().equals(request.OooO0O0())) && this.unknownFields.equals(request.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20522OooOOo0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Request> getParserForType() {
            return f20521OooOOo;
        }

        public final String getReason() {
            Object obj = this.f20532OooOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20532OooOOO = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20524OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20524OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f20526OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20526OooO0o0);
            }
            for (Map.Entry<String, String> entry : OooOO0O().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, OooO0OO.f20548OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20527OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f20527OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20528OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f20528OooO0oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20523OooO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f20523OooO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20529OooOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f20529OooOO0);
            }
            if (this.f20530OooOO0O != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0());
            }
            long j = this.f20531OooOO0o;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20533OooOOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.f20533OooOOO0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20532OooOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f20532OooOOO);
            }
            if (this.f20534OooOOOO != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(13, OooO0O0());
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
            int iHashCode = OooO0o0().hashCode() + ((((OooO0Oo().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42102OooOO0, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooOO0O().getMap().isEmpty()) {
                iHashCode = o00Ooo.OooO00o(iHashCode, 37, 3, 53) + OooOO0O().hashCode();
            }
            int iHashCode2 = OooO0oo().hashCode() + ((((OooO().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0o().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53);
            if (this.f20530OooOO0O != null) {
                iHashCode2 = o00Ooo.OooO00o(iHashCode2, 37, 9, 53) + OooOO0().hashCode();
            }
            int iHashCode3 = getReason().hashCode() + ((((OooO0oO().hashCode() + ((((Internal.hashLong(this.f20531OooOO0o) + o00Ooo.OooO00o(iHashCode2, 37, 10, 53)) * 37) + 11) * 53)) * 37) + 12) * 53);
            if (this.f20534OooOOOO != null) {
                iHashCode3 = OooO0O0().hashCode() + o00Ooo.OooO00o(iHashCode3, 37, 13, 53);
            }
            int iHashCode4 = this.unknownFields.hashCode() + (iHashCode3 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42103OooOO0O.ensureFieldAccessorsInitialized(Request.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final MapField internalGetMapField(int i) {
            if (i == 3) {
                return OooOO0O();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20535OooOOOo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20535OooOOOo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20522OooOOo0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Request();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20524OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20524OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20526OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20526OooO0o0);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0O(), OooO0OO.f20548OooO00o, 3);
            if (!GeneratedMessageV3.isStringEmpty(this.f20527OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f20527OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20528OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.f20528OooO0oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20523OooO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.f20523OooO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20529OooOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20529OooOO0);
            }
            if (this.f20530OooOO0O != null) {
                codedOutputStream.writeMessage(9, OooOO0());
            }
            long j = this.f20531OooOO0o;
            if (j != 0) {
                codedOutputStream.writeInt64(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20533OooOOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.f20533OooOOO0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20532OooOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.f20532OooOOO);
            }
            if (this.f20534OooOOOO != null) {
                codedOutputStream.writeMessage(13, OooO0O0());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20522OooOOo0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20522OooOOo0.toBuilder();
        }

        private Request() {
            this.f20535OooOOOo = (byte) -1;
            this.f20524OooO0Oo = "";
            this.f20526OooO0o0 = "";
            this.f20527OooO0oO = "";
            this.f20528OooO0oo = "";
            this.f20523OooO = "";
            this.f20529OooOO0 = "";
            this.f20533OooOOO0 = "";
            this.f20532OooOOO = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Request(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 10:
                                this.f20524OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.f20526OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 26:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f20525OooO0o = MapField.newMapField(OooO0OO.f20548OooO00o);
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f20548OooO00o.getParserForType(), extensionRegistryLite);
                                this.f20525OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                continue;
                            case 34:
                                this.f20527OooO0oO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 42:
                                this.f20528OooO0oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f20523OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f20529OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                Timestamp timestamp = this.f20530OooOO0O;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                this.f20530OooOO0O = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.f20530OooOO0O = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 80:
                                this.f20531OooOO0o = codedInputStream.readInt64();
                                continue;
                            case 90:
                                this.f20533OooOOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 98:
                                this.f20532OooOOO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 106:
                                Auth auth = this.f20534OooOOOO;
                                Auth.OooO0O0 builder2 = auth != null ? auth.toBuilder() : null;
                                Auth auth2 = (Auth) codedInputStream.readMessage(Auth.f20484OooOO0O, extensionRegistryLite);
                                this.f20534OooOOOO = auth2;
                                if (builder2 != null) {
                                    builder2.OooO0o(auth2);
                                    this.f20534OooOOOO = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
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

    public static final class Resource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public MapField<String, String> f20551OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20552OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f20553OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f20554OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MapField<String, String> f20555OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f20556OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public volatile Object f20557OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Timestamp f20558OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Timestamp f20559OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public volatile Object f20560OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Timestamp f20561OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public volatile Object f20562OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public byte f20563OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Resource f20550OooOOo0 = new Resource();

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f20549OooOOo = new OooO00o();

        public static class OooO00o extends AbstractParser<Resource> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Resource(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f20564OooO00o;

            static {
                Descriptors.Descriptor descriptor = oo0O.f42111OooOOoo;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20564OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public MapField<String, String> f20565OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20566OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Object f20567OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20568OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public MapField<String, String> f20569OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f20570OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public Object f20571OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public Timestamp f20572OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public Timestamp f20573OooOO0o;

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public Object f20574OooOOO;

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public Timestamp f20575OooOOO0;

            /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
            public Object f20576OooOOOO;

            public OooO0OO() {
                this.f20566OooO0Oo = "";
                this.f20568OooO0o0 = "";
                this.f20567OooO0o = "";
                this.f20570OooO0oo = "";
                this.f20571OooOO0 = "";
                this.f20574OooOOO = "";
                this.f20576OooOOOO = "";
                Resource resource = Resource.f20550OooOOo0;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Resource resource;
                try {
                    try {
                        Resource.f20549OooOOo.getClass();
                        OooO0oo(new Resource(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        resource = (Resource) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (resource != null) {
                                OooO0oo(resource);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    resource = null;
                    if (resource != null) {
                        OooO0oo(resource);
                    }
                    throw th;
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Resource buildPartial() {
                Resource resource = new Resource(this);
                resource.f20552OooO0Oo = this.f20566OooO0Oo;
                resource.f20554OooO0o0 = this.f20568OooO0o0;
                resource.f20553OooO0o = this.f20567OooO0o;
                MapField<String, String> mapFieldEmptyMapField = this.f20569OooO0oO;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0o.f20577OooO00o);
                }
                resource.f20555OooO0oO = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                resource.f20556OooO0oo = this.f20570OooO0oo;
                MapField<String, String> mapFieldEmptyMapField2 = this.f20565OooO;
                if (mapFieldEmptyMapField2 == null) {
                    mapFieldEmptyMapField2 = MapField.emptyMapField(OooO0O0.f20564OooO00o);
                }
                resource.f20551OooO = mapFieldEmptyMapField2;
                mapFieldEmptyMapField2.makeImmutable();
                resource.f20557OooOO0 = this.f20571OooOO0;
                resource.f20558OooOO0O = this.f20572OooOO0O;
                resource.f20559OooOO0o = this.f20573OooOO0o;
                resource.f20561OooOOO0 = this.f20575OooOOO0;
                resource.f20560OooOOO = this.f20574OooOOO;
                resource.f20562OooOOOO = this.f20576OooOOOO;
                onBuilt();
                return resource;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20566OooO0Oo = "";
                this.f20568OooO0o0 = "";
                this.f20567OooO0o = "";
                OooO0oO().clear();
                this.f20570OooO0oo = "";
                OooO0o().clear();
                this.f20571OooOO0 = "";
                this.f20572OooOO0O = null;
                this.f20573OooOO0o = null;
                this.f20575OooOOO0 = null;
                this.f20574OooOOO = "";
                this.f20576OooOOOO = "";
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f20565OooO == null) {
                    this.f20565OooO = MapField.newMapField(OooO0O0.f20564OooO00o);
                }
                if (!this.f20565OooO.isMutable()) {
                    this.f20565OooO = this.f20565OooO.copy();
                }
                return this.f20565OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0OO mo4023clone() {
                return (OooO0OO) super.mo4023clone();
            }

            public final MapField<String, String> OooO0oO() {
                onChanged();
                if (this.f20569OooO0oO == null) {
                    this.f20569OooO0oO = MapField.newMapField(OooO0o.f20577OooO00o);
                }
                if (!this.f20569OooO0oO.isMutable()) {
                    this.f20569OooO0oO = this.f20569OooO0oO.copy();
                }
                return this.f20569OooO0oO;
            }

            public final void OooO0oo(Resource resource) {
                if (resource == Resource.f20550OooOOo0) {
                    return;
                }
                if (!resource.OooO0oO().isEmpty()) {
                    this.f20566OooO0Oo = resource.f20552OooO0Oo;
                    onChanged();
                }
                if (!resource.getName().isEmpty()) {
                    this.f20568OooO0o0 = resource.f20554OooO0o0;
                    onChanged();
                }
                if (!resource.OooO0oo().isEmpty()) {
                    this.f20567OooO0o = resource.f20553OooO0o;
                    onChanged();
                }
                OooO0oO().mergeFrom(resource.OooOO0o());
                if (!resource.OooO().isEmpty()) {
                    this.f20570OooO0oo = resource.f20556OooO0oo;
                    onChanged();
                }
                OooO0o().mergeFrom(resource.OooOO0O());
                if (!resource.OooO0Oo().isEmpty()) {
                    this.f20571OooOO0 = resource.f20557OooOO0;
                    onChanged();
                }
                if (resource.f20558OooOO0O != null) {
                    Timestamp timestampOooO0O0 = resource.OooO0O0();
                    Timestamp timestamp = this.f20572OooOO0O;
                    if (timestamp != null) {
                        this.f20572OooOO0O = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0O0).buildPartial();
                    } else {
                        this.f20572OooOO0O = timestampOooO0O0;
                    }
                    onChanged();
                }
                if (resource.f20559OooOO0o != null) {
                    Timestamp timestampOooOO0 = resource.OooOO0();
                    Timestamp timestamp2 = this.f20573OooOO0o;
                    if (timestamp2 != null) {
                        this.f20573OooOO0o = Timestamp.newBuilder(timestamp2).mergeFrom(timestampOooOO0).buildPartial();
                    } else {
                        this.f20573OooOO0o = timestampOooOO0;
                    }
                    onChanged();
                }
                if (resource.f20561OooOOO0 != null) {
                    Timestamp timestampOooO0OO = resource.OooO0OO();
                    Timestamp timestamp3 = this.f20575OooOOO0;
                    if (timestamp3 != null) {
                        this.f20575OooOOO0 = Timestamp.newBuilder(timestamp3).mergeFrom(timestampOooO0OO).buildPartial();
                    } else {
                        this.f20575OooOOO0 = timestampOooO0OO;
                    }
                    onChanged();
                }
                if (!resource.OooO0o0().isEmpty()) {
                    this.f20574OooOOO = resource.f20560OooOOO;
                    onChanged();
                }
                if (!resource.OooO0o().isEmpty()) {
                    this.f20576OooOOOO = resource.f20562OooOOOO;
                    onChanged();
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0OO) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message build() {
                Resource resourceBuildPartial = buildPartial();
                if (resourceBuildPartial.isInitialized()) {
                    return resourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resourceBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (OooO0OO) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0OO) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return Resource.f20550OooOOo0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42108OooOOOo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42110OooOOo0.ensureFieldAccessorsInitialized(Resource.class, OooO0OO.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i == 4) {
                    MapField<String, String> mapField = this.f20569OooO0oO;
                    return mapField == null ? MapField.emptyMapField(OooO0o.f20577OooO00o) : mapField;
                }
                if (i != 6) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField2 = this.f20565OooO;
                return mapField2 == null ? MapField.emptyMapField(OooO0O0.f20564OooO00o) : mapField2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMutableMapField(int i) {
                if (i == 4) {
                    return OooO0oO();
                }
                if (i == 6) {
                    return OooO0o();
                }
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0OO) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (OooO0OO) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0OO) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0OO) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (OooO0OO) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0OO) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return Resource.f20550OooOOo0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0OO) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (OooO0OO) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0OO) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0OO) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                Resource resourceBuildPartial = buildPartial();
                if (resourceBuildPartial.isInitialized()) {
                    return resourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resourceBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Resource) {
                    OooO0oo((Resource) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Resource) {
                    OooO0oo((Resource) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f20566OooO0Oo = "";
                this.f20568OooO0o0 = "";
                this.f20567OooO0o = "";
                this.f20570OooO0oo = "";
                this.f20571OooOO0 = "";
                this.f20574OooOOO = "";
                this.f20576OooOOOO = "";
                Resource resource = Resource.f20550OooOOo0;
            }
        }

        public static final class OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f20577OooO00o;

            static {
                Descriptors.Descriptor descriptor = oo0O.f42109OooOOo;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20577OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Resource(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20563OooOOOo = (byte) -1;
        }

        public final String OooO() {
            Object obj = this.f20556OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20556OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooO0O0() {
            Timestamp timestamp = this.f20558OooOO0O;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final Timestamp OooO0OO() {
            Timestamp timestamp = this.f20561OooOOO0;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final String OooO0Oo() {
            Object obj = this.f20557OooOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20557OooOO0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o() {
            Object obj = this.f20562OooOOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20562OooOOOO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o0() {
            Object obj = this.f20560OooOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20560OooOOO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oO() {
            Object obj = this.f20552OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20552OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oo() {
            Object obj = this.f20553OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20553OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooOO0() {
            Timestamp timestamp = this.f20559OooOO0o;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooOO0O() {
            MapField<String, String> mapField = this.f20551OooO;
            return mapField == null ? MapField.emptyMapField(OooO0O0.f20564OooO00o) : mapField;
        }

        public final MapField<String, String> OooOO0o() {
            MapField<String, String> mapField = this.f20555OooO0oO;
            return mapField == null ? MapField.emptyMapField(OooO0o.f20577OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO toBuilder() {
            if (this == f20550OooOOo0) {
                return new OooO0OO();
            }
            OooO0OO oooO0OO = new OooO0OO();
            oooO0OO.OooO0oo(this);
            return oooO0OO;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return super.equals(obj);
            }
            Resource resource = (Resource) obj;
            if (!OooO0oO().equals(resource.OooO0oO()) || !getName().equals(resource.getName()) || !OooO0oo().equals(resource.OooO0oo()) || !OooOO0o().equals(resource.OooOO0o()) || !OooO().equals(resource.OooO()) || !OooOO0O().equals(resource.OooOO0O()) || !OooO0Oo().equals(resource.OooO0Oo())) {
                return false;
            }
            Timestamp timestamp = this.f20558OooOO0O;
            if ((timestamp != null) != (resource.f20558OooOO0O != null)) {
                return false;
            }
            if ((timestamp != null) && !OooO0O0().equals(resource.OooO0O0())) {
                return false;
            }
            Timestamp timestamp2 = this.f20559OooOO0o;
            if ((timestamp2 != null) != (resource.f20559OooOO0o != null)) {
                return false;
            }
            if ((timestamp2 != null) && !OooOO0().equals(resource.OooOO0())) {
                return false;
            }
            Timestamp timestamp3 = this.f20561OooOOO0;
            if ((timestamp3 != null) != (resource.f20561OooOOO0 != null)) {
                return false;
            }
            return (!(timestamp3 != null) || OooO0OO().equals(resource.OooO0OO())) && OooO0o0().equals(resource.OooO0o0()) && OooO0o().equals(resource.OooO0o()) && this.unknownFields.equals(resource.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20550OooOOo0;
        }

        public final String getName() {
            Object obj = this.f20554OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20554OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Resource> getParserForType() {
            return f20549OooOOo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20552OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20552OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f20554OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20554OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20553OooO0o)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f20553OooO0o);
            }
            for (Map.Entry<String, String> entry : OooOO0o().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, OooO0o.f20577OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20556OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f20556OooO0oo);
            }
            for (Map.Entry<String, String> entry2 : OooOO0O().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooO0O0.f20564OooO00o.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20557OooOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f20557OooOO0);
            }
            if (this.f20558OooOO0O != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, OooO0O0());
            }
            if (this.f20559OooOO0o != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0());
            }
            if (this.f20561OooOOO0 != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooO0OO());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20560OooOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.f20560OooOOO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20562OooOOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f20562OooOOOO);
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
            int iHashCode = OooO0oo().hashCode() + ((((getName().hashCode() + ((((OooO0oO().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42108OooOOOo, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
            if (!OooOO0o().getMap().isEmpty()) {
                iHashCode = OooOO0o().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 4, 53);
            }
            int iHashCode2 = OooO().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 5, 53);
            if (!OooOO0O().getMap().isEmpty()) {
                iHashCode2 = OooOO0O().hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 6, 53);
            }
            int iHashCode3 = OooO0Oo().hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 7, 53);
            if (this.f20558OooOO0O != null) {
                iHashCode3 = OooO0O0().hashCode() + o00Ooo.OooO00o(iHashCode3, 37, 8, 53);
            }
            if (this.f20559OooOO0o != null) {
                iHashCode3 = OooOO0().hashCode() + o00Ooo.OooO00o(iHashCode3, 37, 9, 53);
            }
            if (this.f20561OooOOO0 != null) {
                iHashCode3 = OooO0OO().hashCode() + o00Ooo.OooO00o(iHashCode3, 37, 10, 53);
            }
            int iHashCode4 = this.unknownFields.hashCode() + ((OooO0o().hashCode() + ((((OooO0o0().hashCode() + o00Ooo.OooO00o(iHashCode3, 37, 11, 53)) * 37) + 12) * 53)) * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42110OooOOo0.ensureFieldAccessorsInitialized(Resource.class, OooO0OO.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final MapField internalGetMapField(int i) {
            if (i == 4) {
                return OooOO0o();
            }
            if (i == 6) {
                return OooOO0O();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20563OooOOOo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20563OooOOOo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20550OooOOo0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Resource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20552OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20552OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20554OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20554OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20553OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20553OooO0o);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0o(), OooO0o.f20577OooO00o, 4);
            if (!GeneratedMessageV3.isStringEmpty(this.f20556OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.f20556OooO0oo);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0O(), OooO0O0.f20564OooO00o, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.f20557OooOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20557OooOO0);
            }
            if (this.f20558OooOO0O != null) {
                codedOutputStream.writeMessage(8, OooO0O0());
            }
            if (this.f20559OooOO0o != null) {
                codedOutputStream.writeMessage(9, OooOO0());
            }
            if (this.f20561OooOOO0 != null) {
                codedOutputStream.writeMessage(10, OooO0OO());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20560OooOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.f20560OooOOO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20562OooOOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.f20562OooOOOO);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20550OooOOo0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20550OooOOo0.toBuilder();
        }

        private Resource() {
            this.f20563OooOOOo = (byte) -1;
            this.f20552OooO0Oo = "";
            this.f20554OooO0o0 = "";
            this.f20553OooO0o = "";
            this.f20556OooO0oo = "";
            this.f20557OooOO0 = "";
            this.f20560OooOOO = "";
            this.f20562OooOOOO = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0OO(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Resource(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Timestamp.Builder builder;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.f20552OooO0Oo = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 18:
                                    this.f20554OooO0o0 = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 26:
                                    this.f20553OooO0o = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 34:
                                    if ((i & 1) == 0) {
                                        this.f20555OooO0oO = MapField.newMapField(OooO0o.f20577OooO00o);
                                        i |= 1;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0o.f20577OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f20555OooO0oO.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                    continue;
                                case 42:
                                    this.f20556OooO0oo = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 50:
                                    if ((i & 2) == 0) {
                                        this.f20551OooO = MapField.newMapField(OooO0O0.f20564OooO00o);
                                        i |= 2;
                                    }
                                    MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(OooO0O0.f20564OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f20551OooO.getMutableMap().put(mapEntry2.getKey(), mapEntry2.getValue());
                                    continue;
                                case 58:
                                    this.f20557OooOO0 = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 66:
                                    Timestamp timestamp = this.f20558OooOO0O;
                                    builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f20558OooOO0O = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.f20558OooOO0O = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    Timestamp timestamp3 = this.f20559OooOO0o;
                                    builder = timestamp3 != null ? timestamp3.toBuilder() : null;
                                    Timestamp timestamp4 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f20559OooOO0o = timestamp4;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp4);
                                        this.f20559OooOO0o = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 82:
                                    Timestamp timestamp5 = this.f20561OooOOO0;
                                    builder = timestamp5 != null ? timestamp5.toBuilder() : null;
                                    Timestamp timestamp6 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f20561OooOOO0 = timestamp6;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp6);
                                        this.f20561OooOOO0 = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    this.f20560OooOOO = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 98:
                                    this.f20562OooOOOO = codedInputStream.readStringRequireUtf8();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e3) {
                        throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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

    public static final class Response extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final Response f20578OooOO0 = new Response();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f20579OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f20580OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f20581OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f20582OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f20583OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Timestamp f20584OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Duration f20585OooO0oo;

        public static class OooO00o extends AbstractParser<Response> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Response(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f20586OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f20587OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public long f20588OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Timestamp f20589OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Duration f20590OooO0oo;

            public OooO0O0() {
                Response response = Response.f20578OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Response buildPartial() {
                Response response = new Response(this);
                response.f20581OooO0Oo = this.f20586OooO0Oo;
                response.f20583OooO0o0 = this.f20588OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f20587OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f20591OooO00o);
                }
                response.f20582OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                response.f20584OooO0oO = this.f20589OooO0oO;
                response.f20585OooO0oo = this.f20590OooO0oo;
                onBuilt();
                return response;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20586OooO0Oo = 0L;
                this.f20588OooO0o0 = 0L;
                OooO0o().clear();
                this.f20589OooO0oO = null;
                this.f20590OooO0oo = null;
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f20587OooO0o == null) {
                    this.f20587OooO0o = MapField.newMapField(OooO0OO.f20591OooO00o);
                }
                if (!this.f20587OooO0o.isMutable()) {
                    this.f20587OooO0o = this.f20587OooO0o.copy();
                }
                return this.f20587OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            public final void OooO0oO(Response response) {
                if (response == Response.f20578OooOO0) {
                    return;
                }
                long j = response.f20581OooO0Oo;
                if (j != 0) {
                    this.f20586OooO0Oo = j;
                    onChanged();
                }
                long j2 = response.f20583OooO0o0;
                if (j2 != 0) {
                    this.f20588OooO0o0 = j2;
                    onChanged();
                }
                OooO0o().mergeFrom(response.OooO0Oo());
                if (response.f20584OooO0oO != null) {
                    Timestamp timestampOooO0OO = response.OooO0OO();
                    Timestamp timestamp = this.f20589OooO0oO;
                    if (timestamp != null) {
                        this.f20589OooO0oO = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0OO).buildPartial();
                    } else {
                        this.f20589OooO0oO = timestampOooO0OO;
                    }
                    onChanged();
                }
                if (response.f20585OooO0oo != null) {
                    Duration durationOooO0O0 = response.OooO0O0();
                    Duration duration = this.f20590OooO0oo;
                    if (duration != null) {
                        this.f20590OooO0oo = Duration.newBuilder(duration).mergeFrom(durationOooO0O0).buildPartial();
                    } else {
                        this.f20590OooO0oo = durationOooO0O0;
                    }
                    onChanged();
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Response response;
                try {
                    try {
                        Response.f20579OooOO0O.getClass();
                        OooO0oO(new Response(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        response = (Response) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (response != null) {
                                OooO0oO(response);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    response = null;
                    if (response != null) {
                        OooO0oO(response);
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
                Response responseBuildPartial = buildPartial();
                if (responseBuildPartial.isInitialized()) {
                    return responseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
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
                return Response.f20578OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0O.f42106OooOOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0O.f42105OooOOO.ensureFieldAccessorsInitialized(Response.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 3) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f20587OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f20591OooO00o) : mapField;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMutableMapField(int i) {
                if (i == 3) {
                    return OooO0o();
                }
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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
                return Response.f20578OooOO0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
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

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                Response response = Response.f20578OooOO0;
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
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                Response responseBuildPartial = buildPartial();
                if (responseBuildPartial.isInitialized()) {
                    return responseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
                OooO0Oo();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0oo(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Response) {
                    OooO0oO((Response) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Response) {
                    OooO0oO((Response) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f20591OooO00o;

            static {
                Descriptors.Descriptor descriptor = oo0O.f42107OooOOOO;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20591OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Response(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20580OooO = (byte) -1;
        }

        public final Duration OooO0O0() {
            Duration duration = this.f20585OooO0oo;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public final Timestamp OooO0OO() {
            Timestamp timestamp = this.f20584OooO0oO;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooO0Oo() {
            MapField<String, String> mapField = this.f20582OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f20591OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20578OooOO0) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0oO(this);
            return oooO0O0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return super.equals(obj);
            }
            Response response = (Response) obj;
            if (this.f20581OooO0Oo != response.f20581OooO0Oo || this.f20583OooO0o0 != response.f20583OooO0o0 || !OooO0Oo().equals(response.OooO0Oo())) {
                return false;
            }
            Timestamp timestamp = this.f20584OooO0oO;
            if ((timestamp != null) != (response.f20584OooO0oO != null)) {
                return false;
            }
            if ((timestamp != null) && !OooO0OO().equals(response.OooO0OO())) {
                return false;
            }
            Duration duration = this.f20585OooO0oo;
            if ((duration != null) != (response.f20585OooO0oo != null)) {
                return false;
            }
            return (!(duration != null) || OooO0O0().equals(response.OooO0O0())) && this.unknownFields.equals(response.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20578OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Response> getParserForType() {
            return f20579OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.f20581OooO0Oo;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.f20583OooO0o0;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            for (Map.Entry<String, String> entry : OooO0Oo().getMap().entrySet()) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(3, OooO0OO.f20591OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (this.f20584OooO0oO != null) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(4, OooO0OO());
            }
            if (this.f20585OooO0oo != null) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(5, OooO0O0());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
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
            int iHashLong = Internal.hashLong(this.f20583OooO0o0) + ((((Internal.hashLong(this.f20581OooO0Oo) + o0O0O0Oo.OooO00o.OooO00o(oo0O.f42106OooOOO0, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooO0Oo().getMap().isEmpty()) {
                iHashLong = o00Ooo.OooO00o(iHashLong, 37, 3, 53) + OooO0Oo().hashCode();
            }
            if (this.f20584OooO0oO != null) {
                iHashLong = o00Ooo.OooO00o(iHashLong, 37, 4, 53) + OooO0OO().hashCode();
            }
            if (this.f20585OooO0oo != null) {
                iHashLong = o00Ooo.OooO00o(iHashLong, 37, 5, 53) + OooO0O0().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0O.f42105OooOOO.ensureFieldAccessorsInitialized(Response.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final MapField internalGetMapField(int i) {
            if (i == 3) {
                return OooO0Oo();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20580OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20580OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20578OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Response();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.f20581OooO0Oo;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.f20583OooO0o0;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0Oo(), OooO0OO.f20591OooO00o, 3);
            if (this.f20584OooO0oO != null) {
                codedOutputStream.writeMessage(4, OooO0OO());
            }
            if (this.f20585OooO0oo != null) {
                codedOutputStream.writeMessage(5, OooO0O0());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20578OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20578OooOO0.toBuilder();
        }

        private Response() {
            this.f20580OooO = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Response(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f20581OooO0Oo = codedInputStream.readInt64();
                                } else if (tag == 16) {
                                    this.f20583OooO0o0 = codedInputStream.readInt64();
                                } else if (tag != 26) {
                                    if (tag == 34) {
                                        Timestamp timestamp = this.f20584OooO0oO;
                                        Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                        Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                        this.f20584OooO0oO = timestamp2;
                                        if (builder != null) {
                                            builder.mergeFrom(timestamp2);
                                            this.f20584OooO0oO = builder.buildPartial();
                                        }
                                    } else if (tag != 42) {
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        Duration duration = this.f20585OooO0oo;
                                        Duration.Builder builder2 = duration != null ? duration.toBuilder() : null;
                                        Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                        this.f20585OooO0oo = duration2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(duration2);
                                            this.f20585OooO0oo = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.f20582OooO0o = MapField.newMapField(OooO0OO.f20591OooO00o);
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f20591OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f20582OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e3) {
                        throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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

    public AttributeContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f20471OooOO0o = (byte) -1;
    }

    public final Response OooO() {
        Response response = this.f20468OooO0oo;
        return response == null ? Response.f20578OooOO0 : response;
    }

    public final Api OooO0Oo() {
        Api api = this.f20469OooOO0;
        return api == null ? Api.f20472OooO : api;
    }

    public final Peer OooO0o() {
        Peer peer = this.f20464OooO0Oo;
        return peer == null ? Peer.f20507OooOO0 : peer;
    }

    public final Peer OooO0o0() {
        Peer peer = this.f20465OooO0o;
        return peer == null ? Peer.f20507OooOO0 : peer;
    }

    public final Request OooO0oO() {
        Request request = this.f20467OooO0oO;
        return request == null ? Request.f20522OooOOo0 : request;
    }

    public final Resource OooO0oo() {
        Resource resource = this.f20463OooO;
        return resource == null ? Resource.f20550OooOOo0 : resource;
    }

    public final Peer OooOO0() {
        Peer peer = this.f20466OooO0o0;
        return peer == null ? Peer.f20507OooOO0 : peer;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f20462OooOOO0) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttributeContext)) {
            return super.equals(obj);
        }
        AttributeContext attributeContext = (AttributeContext) obj;
        Peer peer = this.f20464OooO0Oo;
        if ((peer != null) != (attributeContext.f20464OooO0Oo != null)) {
            return false;
        }
        if ((peer != null) && !OooO0o().equals(attributeContext.OooO0o())) {
            return false;
        }
        Peer peer2 = this.f20466OooO0o0;
        if ((peer2 != null) != (attributeContext.f20466OooO0o0 != null)) {
            return false;
        }
        if ((peer2 != null) && !OooOO0().equals(attributeContext.OooOO0())) {
            return false;
        }
        Peer peer3 = this.f20465OooO0o;
        if ((peer3 != null) != (attributeContext.f20465OooO0o != null)) {
            return false;
        }
        if ((peer3 != null) && !OooO0o0().equals(attributeContext.OooO0o0())) {
            return false;
        }
        Request request = this.f20467OooO0oO;
        if ((request != null) != (attributeContext.f20467OooO0oO != null)) {
            return false;
        }
        if ((request != null) && !OooO0oO().equals(attributeContext.OooO0oO())) {
            return false;
        }
        Response response = this.f20468OooO0oo;
        if ((response != null) != (attributeContext.f20468OooO0oo != null)) {
            return false;
        }
        if ((response != null) && !OooO().equals(attributeContext.OooO())) {
            return false;
        }
        Resource resource = this.f20463OooO;
        if ((resource != null) != (attributeContext.f20463OooO != null)) {
            return false;
        }
        if ((resource != null) && !OooO0oo().equals(attributeContext.OooO0oo())) {
            return false;
        }
        Api api = this.f20469OooOO0;
        if ((api != null) != (attributeContext.f20469OooOO0 != null)) {
            return false;
        }
        return (!(api != null) || OooO0Oo().equals(attributeContext.OooO0Oo())) && this.f20470OooOO0O.equals(attributeContext.f20470OooOO0O) && this.unknownFields.equals(attributeContext.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20462OooOOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AttributeContext> getParserForType() {
        return f20461OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = this.f20466OooO0o0 != null ? CodedOutputStream.computeMessageSize(1, OooOO0()) + 0 : 0;
        if (this.f20465OooO0o != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, OooO0o0());
        }
        if (this.f20467OooO0oO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, OooO0oO());
        }
        if (this.f20468OooO0oo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, OooO());
        }
        if (this.f20463OooO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(5, OooO0oo());
        }
        if (this.f20469OooOO0 != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(6, OooO0Oo());
        }
        if (this.f20464OooO0Oo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, OooO0o());
        }
        for (int i2 = 0; i2 < this.f20470OooOO0O.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(8, this.f20470OooOO0O.get(i2));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
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
        int iHashCode = oo0O.f42094OooO00o.hashCode() + 779;
        if (this.f20464OooO0Oo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 7, 53) + OooO0o().hashCode();
        }
        if (this.f20466OooO0o0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 1, 53) + OooOO0().hashCode();
        }
        if (this.f20465OooO0o != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 2, 53) + OooO0o0().hashCode();
        }
        if (this.f20467OooO0oO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 3, 53) + OooO0oO().hashCode();
        }
        if (this.f20468OooO0oo != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 4, 53) + OooO().hashCode();
        }
        if (this.f20463OooO != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 5, 53) + OooO0oo().hashCode();
        }
        if (this.f20469OooOO0 != null) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 6, 53) + OooO0Oo().hashCode();
        }
        if (this.f20470OooOO0O.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 8, 53) + this.f20470OooOO0O.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo0O.f42095OooO0O0.ensureFieldAccessorsInitialized(AttributeContext.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20471OooOO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20471OooOO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20462OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AttributeContext();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20466OooO0o0 != null) {
            codedOutputStream.writeMessage(1, OooOO0());
        }
        if (this.f20465OooO0o != null) {
            codedOutputStream.writeMessage(2, OooO0o0());
        }
        if (this.f20467OooO0oO != null) {
            codedOutputStream.writeMessage(3, OooO0oO());
        }
        if (this.f20468OooO0oo != null) {
            codedOutputStream.writeMessage(4, OooO());
        }
        if (this.f20463OooO != null) {
            codedOutputStream.writeMessage(5, OooO0oo());
        }
        if (this.f20469OooOO0 != null) {
            codedOutputStream.writeMessage(6, OooO0Oo());
        }
        if (this.f20464OooO0Oo != null) {
            codedOutputStream.writeMessage(7, OooO0o());
        }
        for (int i = 0; i < this.f20470OooOO0O.size(); i++) {
            codedOutputStream.writeMessage(8, this.f20470OooOO0O.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20462OooOOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20462OooOOO0.toBuilder();
    }

    private AttributeContext() {
        this.f20471OooOO0o = (byte) -1;
        this.f20470OooOO0O = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public AttributeContext(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                Peer peer = this.f20466OooO0o0;
                                Peer.OooO0O0 builder = peer != null ? peer.toBuilder() : null;
                                Peer peer2 = (Peer) codedInputStream.readMessage(Peer.f20508OooOO0O, extensionRegistryLite);
                                this.f20466OooO0o0 = peer2;
                                if (builder != null) {
                                    builder.OooO0oO(peer2);
                                    this.f20466OooO0o0 = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                Peer peer3 = this.f20465OooO0o;
                                Peer.OooO0O0 builder2 = peer3 != null ? peer3.toBuilder() : null;
                                Peer peer4 = (Peer) codedInputStream.readMessage(Peer.f20508OooOO0O, extensionRegistryLite);
                                this.f20465OooO0o = peer4;
                                if (builder2 != null) {
                                    builder2.OooO0oO(peer4);
                                    this.f20465OooO0o = builder2.buildPartial();
                                }
                            } else if (tag == 26) {
                                Request request = this.f20467OooO0oO;
                                Request.OooO0O0 builder3 = request != null ? request.toBuilder() : null;
                                Request request2 = (Request) codedInputStream.readMessage(Request.f20521OooOOo, extensionRegistryLite);
                                this.f20467OooO0oO = request2;
                                if (builder3 != null) {
                                    builder3.OooO0oO(request2);
                                    this.f20467OooO0oO = builder3.buildPartial();
                                }
                            } else if (tag == 34) {
                                Response response = this.f20468OooO0oo;
                                Response.OooO0O0 builder4 = response != null ? response.toBuilder() : null;
                                Response response2 = (Response) codedInputStream.readMessage(Response.f20579OooOO0O, extensionRegistryLite);
                                this.f20468OooO0oo = response2;
                                if (builder4 != null) {
                                    builder4.OooO0oO(response2);
                                    this.f20468OooO0oo = builder4.buildPartial();
                                }
                            } else if (tag == 42) {
                                Resource resource = this.f20463OooO;
                                Resource.OooO0OO builder5 = resource != null ? resource.toBuilder() : null;
                                Resource resource2 = (Resource) codedInputStream.readMessage(Resource.f20549OooOOo, extensionRegistryLite);
                                this.f20463OooO = resource2;
                                if (builder5 != null) {
                                    builder5.OooO0oo(resource2);
                                    this.f20463OooO = builder5.buildPartial();
                                }
                            } else if (tag == 50) {
                                Api api = this.f20469OooOO0;
                                Api.OooO0O0 builder6 = api != null ? api.toBuilder() : null;
                                Api api2 = (Api) codedInputStream.readMessage(Api.f20473OooOO0, extensionRegistryLite);
                                this.f20469OooOO0 = api2;
                                if (builder6 != null) {
                                    builder6.OooO0o(api2);
                                    this.f20469OooOO0 = builder6.buildPartial();
                                }
                            } else if (tag == 58) {
                                Peer peer5 = this.f20464OooO0Oo;
                                Peer.OooO0O0 builder7 = peer5 != null ? peer5.toBuilder() : null;
                                Peer peer6 = (Peer) codedInputStream.readMessage(Peer.f20508OooOO0O, extensionRegistryLite);
                                this.f20464OooO0Oo = peer6;
                                if (builder7 != null) {
                                    builder7.OooO0oO(peer6);
                                    this.f20464OooO0Oo = builder7.buildPartial();
                                }
                            } else if (tag != 66) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f20470OooOO0O = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f20470OooOO0O.add((Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
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
                if ((z2 ? 1 : 0) & true) {
                    this.f20470OooOO0O = Collections.unmodifiableList(this.f20470OooOO0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((z2 ? 1 : 0) & true) {
            this.f20470OooOO0O = Collections.unmodifiableList(this.f20470OooOO0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
