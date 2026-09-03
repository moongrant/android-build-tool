package com.google.rpc.context;

import com.app.base.protobuf.OooO0OO;
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
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;
import p325o0O0ooo0.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributeContext extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Resource f20936OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Peer f20937OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Peer f20938OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Peer f20939OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Request f20940OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Response f20941OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Api f20942OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public List<Any> f20943OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte f20944OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final AttributeContext f20935OooOOO0 = new AttributeContext();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f20934OooOOO = new OooO00o();

    public static final class Api extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final Api f20945OooO = new Api();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final OooO00o f20946OooOO0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20947OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f20948OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f20949OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f20950OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public byte f20951OooO0oo;

        public static class OooO00o extends AbstractParser<Api> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Api(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20952OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Object f20953OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20954OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20955OooO0oO;

            public OooO0O0() {
                this.f20952OooO0Oo = "";
                this.f20954OooO0o0 = "";
                this.f20953OooO0o = "";
                this.f20955OooO0oO = "";
                Api api = Api.f20945OooO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Api buildPartial() {
                Api api = new Api(this);
                api.f20947OooO0Oo = this.f20952OooO0Oo;
                api.f20949OooO0o0 = this.f20954OooO0o0;
                api.f20948OooO0o = this.f20953OooO0o;
                api.f20950OooO0oO = this.f20955OooO0oO;
                onBuilt();
                return api;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20952OooO0Oo = "";
                this.f20954OooO0o0 = "";
                this.f20953OooO0o = "";
                this.f20955OooO0oO = "";
            }

            public final void OooO0o(Api api) {
                if (api == Api.f20945OooO) {
                    return;
                }
                if (!api.OooO0Oo().isEmpty()) {
                    this.f20952OooO0Oo = api.f20947OooO0Oo;
                    onChanged();
                }
                if (!api.OooO0O0().isEmpty()) {
                    this.f20954OooO0o0 = api.f20949OooO0o0;
                    onChanged();
                }
                if (!api.OooO0OO().isEmpty()) {
                    this.f20953OooO0o = api.f20948OooO0o;
                    onChanged();
                }
                if (!api.getVersion().isEmpty()) {
                    this.f20955OooO0oO = api.f20950OooO0oO;
                    onChanged();
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Api api;
                try {
                    try {
                        Api.f20946OooOO0.getClass();
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
                return Api.f20945OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42961OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42963OooO0oO.ensureFieldAccessorsInitialized(Api.class, OooO0O0.class);
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
                return Api.f20945OooO;
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
                this.f20952OooO0Oo = "";
                this.f20954OooO0o0 = "";
                this.f20953OooO0o = "";
                this.f20955OooO0oO = "";
                Api api = Api.f20945OooO;
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
            this.f20951OooO0oo = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f20949OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20949OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f20948OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20948OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20947OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20947OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20945OooO) {
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
            return f20945OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Api> getParserForType() {
            return f20946OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20947OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20947OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f20949OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20949OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20948OooO0o)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f20948OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20950OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f20950OooO0oO);
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
            Object obj = this.f20950OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20950OooO0oO = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getVersion().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0O0().hashCode() + ((((OooO0Oo().hashCode() + o000Oo0.OooO00o(o000O.f42961OooO0o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42963OooO0oO.ensureFieldAccessorsInitialized(Api.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20951OooO0oo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20951OooO0oo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20945OooO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Api();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20947OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20947OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20949OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20949OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20948OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20948OooO0o);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20950OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f20950OooO0oO);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20945OooO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20945OooO.toBuilder();
        }

        private Api() {
            this.f20951OooO0oo = (byte) -1;
            this.f20947OooO0Oo = "";
            this.f20949OooO0o0 = "";
            this.f20948OooO0o = "";
            this.f20950OooO0oO = "";
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
                                    this.f20947OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.f20949OooO0o0 = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    this.f20948OooO0o = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f20950OooO0oO = codedInputStream.readStringRequireUtf8();
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
        public static final Auth f20956OooOO0 = new Auth();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f20957OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f20958OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f20960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LazyStringList f20961OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Struct f20962OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public LazyStringList f20963OooO0oo;

        public static class OooO00o extends AbstractParser<Auth> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Auth(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public LazyStringList f20964OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f20965OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public LazyStringList f20966OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f20967OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20968OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Struct f20969OooO0oo;

            public OooO0O0() {
                this.f20967OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20966OooO0o = lazyStringList;
                this.f20968OooO0oO = "";
                this.f20964OooO = lazyStringList;
                Auth auth = Auth.f20956OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Auth buildPartial() {
                Auth auth = new Auth(this);
                auth.f20959OooO0Oo = this.f20967OooO0o0;
                if ((this.f20965OooO0Oo & 1) != 0) {
                    this.f20966OooO0o = this.f20966OooO0o.getUnmodifiableView();
                    this.f20965OooO0Oo &= -2;
                }
                auth.f20961OooO0o0 = this.f20966OooO0o;
                auth.f20960OooO0o = this.f20968OooO0oO;
                auth.f20962OooO0oO = this.f20969OooO0oo;
                if ((this.f20965OooO0Oo & 2) != 0) {
                    this.f20964OooO = this.f20964OooO.getUnmodifiableView();
                    this.f20965OooO0Oo &= -3;
                }
                auth.f20963OooO0oo = this.f20964OooO;
                onBuilt();
                return auth;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20967OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20966OooO0o = lazyStringList;
                int i = this.f20965OooO0Oo & (-2);
                this.f20968OooO0oO = "";
                this.f20969OooO0oo = null;
                this.f20964OooO = lazyStringList;
                this.f20965OooO0Oo = i & (-3);
            }

            public final void OooO0o(Auth auth) {
                if (auth == Auth.f20956OooOO0) {
                    return;
                }
                if (!auth.OooO0Oo().isEmpty()) {
                    this.f20967OooO0o0 = auth.f20959OooO0Oo;
                    onChanged();
                }
                if (!auth.f20961OooO0o0.isEmpty()) {
                    if (this.f20966OooO0o.isEmpty()) {
                        this.f20966OooO0o = auth.f20961OooO0o0;
                        this.f20965OooO0Oo &= -2;
                    } else {
                        if ((this.f20965OooO0Oo & 1) == 0) {
                            this.f20966OooO0o = new LazyStringArrayList(this.f20966OooO0o);
                            this.f20965OooO0Oo |= 1;
                        }
                        this.f20966OooO0o.addAll(auth.f20961OooO0o0);
                    }
                    onChanged();
                }
                if (!auth.OooO0OO().isEmpty()) {
                    this.f20968OooO0oO = auth.f20960OooO0o;
                    onChanged();
                }
                if (auth.f20962OooO0oO != null) {
                    Struct structOooO0O0 = auth.OooO0O0();
                    Struct struct = this.f20969OooO0oo;
                    if (struct != null) {
                        this.f20969OooO0oo = Struct.newBuilder(struct).mergeFrom(structOooO0O0).buildPartial();
                    } else {
                        this.f20969OooO0oo = structOooO0O0;
                    }
                    onChanged();
                }
                if (!auth.f20963OooO0oo.isEmpty()) {
                    if (this.f20964OooO.isEmpty()) {
                        this.f20964OooO = auth.f20963OooO0oo;
                        this.f20965OooO0Oo &= -3;
                    } else {
                        if ((this.f20965OooO0Oo & 2) == 0) {
                            this.f20964OooO = new LazyStringArrayList(this.f20964OooO);
                            this.f20965OooO0Oo |= 2;
                        }
                        this.f20964OooO.addAll(auth.f20963OooO0oo);
                    }
                    onChanged();
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Auth auth;
                try {
                    try {
                        Auth.f20957OooOO0O.getClass();
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
                return Auth.f20956OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42964OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42956OooO.ensureFieldAccessorsInitialized(Auth.class, OooO0O0.class);
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
                return Auth.f20956OooOO0;
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
                this.f20967OooO0o0 = "";
                LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
                this.f20966OooO0o = lazyStringList;
                this.f20968OooO0oO = "";
                this.f20964OooO = lazyStringList;
                Auth auth = Auth.f20956OooOO0;
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
            this.f20958OooO = (byte) -1;
        }

        public final Struct OooO0O0() {
            Struct struct = this.f20962OooO0oO;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public final String OooO0OO() {
            Object obj = this.f20960OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20960OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20959OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20959OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20956OooOO0) {
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
            if (!OooO0Oo().equals(auth.OooO0Oo()) || !this.f20961OooO0o0.equals(auth.f20961OooO0o0) || !OooO0OO().equals(auth.OooO0OO())) {
                return false;
            }
            Struct struct = this.f20962OooO0oO;
            if ((struct != null) != (auth.f20962OooO0oO != null)) {
                return false;
            }
            return (!(struct != null) || OooO0O0().equals(auth.OooO0O0())) && this.f20963OooO0oo.equals(auth.f20963OooO0oo) && this.unknownFields.equals(auth.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20956OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Auth> getParserForType() {
            return f20957OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f20959OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f20959OooO0Oo) + 0 : 0;
            int iOooO0Oo = 0;
            for (int i2 = 0; i2 < this.f20961OooO0o0.size(); i2++) {
                iOooO0Oo = com.app.base.protobuf.OooO0O0.OooO0Oo(this.f20961OooO0o0, i2, iOooO0Oo);
            }
            int size = (this.f20961OooO0o0.size() * 1) + iComputeStringSize + iOooO0Oo;
            if (!GeneratedMessageV3.isStringEmpty(this.f20960OooO0o)) {
                size += GeneratedMessageV3.computeStringSize(3, this.f20960OooO0o);
            }
            if (this.f20962OooO0oO != null) {
                size += CodedOutputStream.computeMessageSize(4, OooO0O0());
            }
            int iOooO0Oo2 = 0;
            for (int i3 = 0; i3 < this.f20963OooO0oo.size(); i3++) {
                iOooO0Oo2 = com.app.base.protobuf.OooO0O0.OooO0Oo(this.f20963OooO0oo, i3, iOooO0Oo2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.f20963OooO0oo.size() * 1) + size + iOooO0Oo2;
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
            int iHashCode = OooO0Oo().hashCode() + o000Oo0.OooO00o(o000O.f42964OooO0oo, 779, 37, 1, 53);
            if (this.f20961OooO0o0.size() > 0) {
                iHashCode = this.f20961OooO0o0.hashCode() + o000000O.OooO00o(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = OooO0OO().hashCode() + o000000O.OooO00o(iHashCode, 37, 3, 53);
            if (this.f20962OooO0oO != null) {
                iHashCode2 = OooO0O0().hashCode() + o000000O.OooO00o(iHashCode2, 37, 4, 53);
            }
            if (this.f20963OooO0oo.size() > 0) {
                iHashCode2 = this.f20963OooO0oo.hashCode() + o000000O.OooO00o(iHashCode2, 37, 5, 53);
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42956OooO.ensureFieldAccessorsInitialized(Auth.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f20958OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20958OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20956OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Auth();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20959OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20959OooO0Oo);
            }
            int iOooO00o = 0;
            while (iOooO00o < this.f20961OooO0o0.size()) {
                iOooO00o = OooO0OO.OooO00o(this.f20961OooO0o0, iOooO00o, codedOutputStream, 2, iOooO00o, 1);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20960OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f20960OooO0o);
            }
            if (this.f20962OooO0oO != null) {
                codedOutputStream.writeMessage(4, OooO0O0());
            }
            int iOooO00o2 = 0;
            while (iOooO00o2 < this.f20963OooO0oo.size()) {
                iOooO00o2 = OooO0OO.OooO00o(this.f20963OooO0oo, iOooO00o2, codedOutputStream, 5, iOooO00o2, 1);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20956OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20956OooOO0.toBuilder();
        }

        private Auth() {
            this.f20958OooO = (byte) -1;
            this.f20959OooO0Oo = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f20961OooO0o0 = lazyStringList;
            this.f20960OooO0o = "";
            this.f20963OooO0oo = lazyStringList;
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
                                    this.f20959OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if ((i & 1) == 0) {
                                        this.f20961OooO0o0 = new LazyStringArrayList();
                                        i |= 1;
                                    }
                                    this.f20961OooO0o0.add(stringRequireUtf8);
                                } else if (tag == 26) {
                                    this.f20960OooO0o = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    Struct struct = this.f20962OooO0oO;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.f20962OooO0oO = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.f20962OooO0oO = builder.buildPartial();
                                    }
                                } else if (tag != 42) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                    if ((i & 2) == 0) {
                                        this.f20963OooO0oo = new LazyStringArrayList();
                                        i |= 2;
                                    }
                                    this.f20963OooO0oo.add(stringRequireUtf9);
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
                        this.f20961OooO0o0 = this.f20961OooO0o0.getUnmodifiableView();
                    }
                    if ((i & 2) != 0) {
                        this.f20963OooO0oo = this.f20963OooO0oo.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) != 0) {
                this.f20961OooO0o0 = this.f20961OooO0o0.getUnmodifiableView();
            }
            if ((i & 2) != 0) {
                this.f20963OooO0oo = this.f20963OooO0oo.getUnmodifiableView();
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
        public Response f20970OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20971OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Peer f20972OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Peer f20973OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Peer f20974OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Request f20975OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Resource f20976OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Api f20977OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public List<Any> f20978OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> f20979OooOOO0;

        public OooO0O0() {
            this.f20978OooOO0o = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AttributeContext buildPartial() {
            AttributeContext attributeContext = new AttributeContext(this);
            int i = this.f20971OooO0Oo;
            attributeContext.f20937OooO0Oo = this.f20973OooO0o0;
            attributeContext.f20939OooO0o0 = this.f20972OooO0o;
            attributeContext.f20938OooO0o = this.f20974OooO0oO;
            attributeContext.f20940OooO0oO = this.f20975OooO0oo;
            attributeContext.f20941OooO0oo = this.f20970OooO;
            attributeContext.f20936OooO = this.f20976OooOO0;
            attributeContext.f20942OooOO0 = this.f20977OooOO0O;
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f20979OooOOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.f20978OooOO0o = Collections.unmodifiableList(this.f20978OooOO0o);
                    this.f20971OooO0Oo &= -2;
                }
                attributeContext.f20943OooOO0O = this.f20978OooOO0o;
            } else {
                attributeContext.f20943OooOO0O = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return attributeContext;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20973OooO0o0 = null;
            this.f20972OooO0o = null;
            this.f20974OooO0oO = null;
            this.f20975OooO0oo = null;
            this.f20970OooO = null;
            this.f20976OooOO0 = null;
            this.f20977OooOO0O = null;
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f20979OooOOO0;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f20978OooOO0o = Collections.emptyList();
                this.f20971OooO0Oo &= -2;
            }
        }

        public final RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> OooO0o() {
            if (this.f20979OooOOO0 == null) {
                this.f20979OooOOO0 = new RepeatedFieldBuilderV3<>(this.f20978OooOO0o, (this.f20971OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f20978OooOO0o = null;
            }
            return this.f20979OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(AttributeContext attributeContext) {
            if (attributeContext == AttributeContext.f20935OooOOO0) {
                return;
            }
            if (attributeContext.f20937OooO0Oo != null) {
                Peer peerOooO0o = attributeContext.OooO0o();
                Peer peer = this.f20973OooO0o0;
                if (peer != null) {
                    Peer.OooO0O0 builder = Peer.f20980OooOO0.toBuilder();
                    builder.OooO0oO(peer);
                    builder.OooO0oO(peerOooO0o);
                    this.f20973OooO0o0 = builder.buildPartial();
                } else {
                    this.f20973OooO0o0 = peerOooO0o;
                }
                onChanged();
            }
            if (attributeContext.f20939OooO0o0 != null) {
                Peer peerOooOO0 = attributeContext.OooOO0();
                Peer peer2 = this.f20972OooO0o;
                if (peer2 != null) {
                    Peer.OooO0O0 builder2 = Peer.f20980OooOO0.toBuilder();
                    builder2.OooO0oO(peer2);
                    builder2.OooO0oO(peerOooOO0);
                    this.f20972OooO0o = builder2.buildPartial();
                } else {
                    this.f20972OooO0o = peerOooOO0;
                }
                onChanged();
            }
            if (attributeContext.f20938OooO0o != null) {
                Peer peerOooO0o0 = attributeContext.OooO0o0();
                Peer peer3 = this.f20974OooO0oO;
                if (peer3 != null) {
                    Peer.OooO0O0 builder3 = Peer.f20980OooOO0.toBuilder();
                    builder3.OooO0oO(peer3);
                    builder3.OooO0oO(peerOooO0o0);
                    this.f20974OooO0oO = builder3.buildPartial();
                } else {
                    this.f20974OooO0oO = peerOooO0o0;
                }
                onChanged();
            }
            if (attributeContext.f20940OooO0oO != null) {
                Request requestOooO0oO = attributeContext.OooO0oO();
                Request request = this.f20975OooO0oo;
                if (request != null) {
                    Request.OooO0O0 builder4 = Request.f20995OooOOo0.toBuilder();
                    builder4.OooO0oO(request);
                    builder4.OooO0oO(requestOooO0oO);
                    this.f20975OooO0oo = builder4.buildPartial();
                } else {
                    this.f20975OooO0oo = requestOooO0oO;
                }
                onChanged();
            }
            if (attributeContext.f20941OooO0oo != null) {
                Response responseOooO = attributeContext.OooO();
                Response response = this.f20970OooO;
                if (response != null) {
                    Response.OooO0O0 builder5 = Response.f21051OooOO0.toBuilder();
                    builder5.OooO0oO(response);
                    builder5.OooO0oO(responseOooO);
                    this.f20970OooO = builder5.buildPartial();
                } else {
                    this.f20970OooO = responseOooO;
                }
                onChanged();
            }
            if (attributeContext.f20936OooO != null) {
                Resource resourceOooO0oo = attributeContext.OooO0oo();
                Resource resource = this.f20976OooOO0;
                if (resource != null) {
                    Resource.OooO0OO builder6 = Resource.f21023OooOOo0.toBuilder();
                    builder6.OooO0oo(resource);
                    builder6.OooO0oo(resourceOooO0oo);
                    this.f20976OooOO0 = builder6.buildPartial();
                } else {
                    this.f20976OooOO0 = resourceOooO0oo;
                }
                onChanged();
            }
            if (attributeContext.f20942OooOO0 != null) {
                Api apiOooO0Oo = attributeContext.OooO0Oo();
                Api api = this.f20977OooOO0O;
                if (api != null) {
                    Api.OooO0O0 builder7 = Api.f20945OooO.toBuilder();
                    builder7.OooO0o(api);
                    builder7.OooO0o(apiOooO0Oo);
                    this.f20977OooOO0O = builder7.buildPartial();
                } else {
                    this.f20977OooOO0O = apiOooO0Oo;
                }
                onChanged();
            }
            if (this.f20979OooOOO0 == null) {
                if (!attributeContext.f20943OooOO0O.isEmpty()) {
                    if (this.f20978OooOO0o.isEmpty()) {
                        this.f20978OooOO0o = attributeContext.f20943OooOO0O;
                        this.f20971OooO0Oo &= -2;
                    } else {
                        if ((this.f20971OooO0Oo & 1) == 0) {
                            this.f20978OooOO0o = new ArrayList(this.f20978OooOO0o);
                            this.f20971OooO0Oo |= 1;
                        }
                        this.f20978OooOO0o.addAll(attributeContext.f20943OooOO0O);
                    }
                    onChanged();
                }
            } else if (!attributeContext.f20943OooOO0O.isEmpty()) {
                if (this.f20979OooOOO0.isEmpty()) {
                    this.f20979OooOOO0.dispose();
                    this.f20979OooOOO0 = null;
                    this.f20978OooOO0o = attributeContext.f20943OooOO0O;
                    this.f20971OooO0Oo &= -2;
                    this.f20979OooOOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f20979OooOOO0.addAllMessages(attributeContext.f20943OooOO0O);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AttributeContext attributeContext;
            try {
                try {
                    AttributeContext.f20934OooOOO.getClass();
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
            return AttributeContext.f20935OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000O.f42957OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42958OooO0O0.ensureFieldAccessorsInitialized(AttributeContext.class, OooO0O0.class);
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
            return AttributeContext.f20935OooOOO0;
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
            this.f20978OooOO0o = Collections.emptyList();
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
        public static final Peer f20980OooOO0 = new Peer();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f20981OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f20982OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f20984OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f20985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f20986OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f20987OooO0oo;

        public static class OooO00o extends AbstractParser<Peer> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Peer(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f20988OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f20989OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public long f20990OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f20991OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f20992OooO0oo;

            public OooO0O0() {
                this.f20988OooO0Oo = "";
                this.f20991OooO0oO = "";
                this.f20992OooO0oo = "";
                Peer peer = Peer.f20980OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Peer buildPartial() {
                Peer peer = new Peer(this);
                peer.f20983OooO0Oo = this.f20988OooO0Oo;
                peer.f20985OooO0o0 = this.f20990OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f20989OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f20993OooO00o);
                }
                peer.f20984OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                peer.f20986OooO0oO = this.f20991OooO0oO;
                peer.f20987OooO0oo = this.f20992OooO0oo;
                onBuilt();
                return peer;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f20988OooO0Oo = "";
                this.f20990OooO0o0 = 0L;
                OooO0o().clear();
                this.f20991OooO0oO = "";
                this.f20992OooO0oo = "";
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f20989OooO0o == null) {
                    this.f20989OooO0o = MapField.newMapField(OooO0OO.f20993OooO00o);
                }
                if (!this.f20989OooO0o.isMutable()) {
                    this.f20989OooO0o = this.f20989OooO0o.copy();
                }
                return this.f20989OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            public final void OooO0oO(Peer peer) {
                if (peer == Peer.f20980OooOO0) {
                    return;
                }
                if (!peer.getIp().isEmpty()) {
                    this.f20988OooO0Oo = peer.f20983OooO0Oo;
                    onChanged();
                }
                long j = peer.f20985OooO0o0;
                if (j != 0) {
                    this.f20990OooO0o0 = j;
                    onChanged();
                }
                OooO0o().mergeFrom(peer.OooO0Oo());
                if (!peer.OooO0O0().isEmpty()) {
                    this.f20991OooO0oO = peer.f20986OooO0oO;
                    onChanged();
                }
                if (!peer.OooO0OO().isEmpty()) {
                    this.f20992OooO0oo = peer.f20987OooO0oo;
                    onChanged();
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Peer peer;
                try {
                    try {
                        Peer.f20981OooOO0O.getClass();
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
                return Peer.f20980OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42959OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42960OooO0Oo.ensureFieldAccessorsInitialized(Peer.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 6) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f20989OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f20993OooO00o) : mapField;
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
                return Peer.f20980OooOO0;
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
                this.f20988OooO0Oo = "";
                this.f20991OooO0oO = "";
                this.f20992OooO0oo = "";
                Peer peer = Peer.f20980OooOO0;
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
            public static final MapEntry<String, String> f20993OooO00o;

            static {
                Descriptors.Descriptor descriptor = o000O.f42962OooO0o0;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f20993OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Peer(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f20982OooO = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f20986OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20986OooO0oO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f20987OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20987OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final MapField<String, String> OooO0Oo() {
            MapField<String, String> mapField = this.f20984OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f20993OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20980OooOO0) {
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
            return getIp().equals(peer.getIp()) && this.f20985OooO0o0 == peer.f20985OooO0o0 && OooO0Oo().equals(peer.OooO0Oo()) && OooO0O0().equals(peer.OooO0O0()) && OooO0OO().equals(peer.OooO0OO()) && this.unknownFields.equals(peer.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20980OooOO0;
        }

        public final String getIp() {
            Object obj = this.f20983OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20983OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Peer> getParserForType() {
            return f20981OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20983OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20983OooO0Oo);
            long j = this.f20985OooO0o0;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(2, j);
            }
            for (Map.Entry<String, String> entry : OooO0Oo().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooO0OO.f20993OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20986OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f20986OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20987OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f20987OooO0oo);
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
            int iHashLong = Internal.hashLong(this.f20985OooO0o0) + ((((getIp().hashCode() + o000Oo0.OooO00o(o000O.f42959OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooO0Oo().getMap().isEmpty()) {
                iHashLong = o000000O.OooO00o(iHashLong, 37, 6, 53) + OooO0Oo().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + ((OooO0OO().hashCode() + ((((OooO0O0().hashCode() + o000000O.OooO00o(iHashLong, 37, 7, 53)) * 37) + 8) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42960OooO0Oo.ensureFieldAccessorsInitialized(Peer.class, OooO0O0.class);
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
            byte b = this.f20982OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f20982OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20980OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Peer();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20983OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20983OooO0Oo);
            }
            long j = this.f20985OooO0o0;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0Oo(), OooO0OO.f20993OooO00o, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.f20986OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f20986OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20987OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.f20987OooO0oo);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20980OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20980OooOO0.toBuilder();
        }

        private Peer() {
            this.f20982OooO = (byte) -1;
            this.f20983OooO0Oo = "";
            this.f20986OooO0oO = "";
            this.f20987OooO0oo = "";
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
                                    this.f20983OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 16) {
                                    this.f20985OooO0o0 = codedInputStream.readInt64();
                                } else if (tag == 50) {
                                    if (!(z2 & true)) {
                                        this.f20984OooO0o = MapField.newMapField(OooO0OO.f20993OooO00o);
                                        z2 |= true;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f20993OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f20984OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                } else if (tag == 58) {
                                    this.f20986OooO0oO = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 66) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f20987OooO0oo = codedInputStream.readStringRequireUtf8();
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
        public volatile Object f20996OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f20997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f20998OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f20999OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public volatile Object f21000OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f21001OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public volatile Object f21002OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Timestamp f21003OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f21004OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public volatile Object f21005OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public volatile Object f21006OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Auth f21007OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public byte f21008OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Request f20995OooOOo0 = new Request();

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f20994OooOOo = new OooO00o();

        public static class OooO00o extends AbstractParser<Request> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Request(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public Object f21009OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f21010OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f21011OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f21012OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Object f21013OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f21014OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public Object f21015OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public Timestamp f21016OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public long f21017OooOO0o;

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public Object f21018OooOOO;

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public Object f21019OooOOO0;

            /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
            public Auth f21020OooOOOO;

            public OooO0O0() {
                this.f21010OooO0Oo = "";
                this.f21012OooO0o0 = "";
                this.f21013OooO0oO = "";
                this.f21014OooO0oo = "";
                this.f21009OooO = "";
                this.f21015OooOO0 = "";
                this.f21019OooOOO0 = "";
                this.f21018OooOOO = "";
                Request request = Request.f20995OooOOo0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Request buildPartial() {
                Request request = new Request(this);
                request.f20997OooO0Oo = this.f21010OooO0Oo;
                request.f20999OooO0o0 = this.f21012OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f21011OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f21021OooO00o);
                }
                request.f20998OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                request.f21000OooO0oO = this.f21013OooO0oO;
                request.f21001OooO0oo = this.f21014OooO0oo;
                request.f20996OooO = this.f21009OooO;
                request.f21002OooOO0 = this.f21015OooOO0;
                request.f21003OooOO0O = this.f21016OooOO0O;
                request.f21004OooOO0o = this.f21017OooOO0o;
                request.f21006OooOOO0 = this.f21019OooOOO0;
                request.f21005OooOOO = this.f21018OooOOO;
                request.f21007OooOOOO = this.f21020OooOOOO;
                onBuilt();
                return request;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f21010OooO0Oo = "";
                this.f21012OooO0o0 = "";
                OooO0o().clear();
                this.f21013OooO0oO = "";
                this.f21014OooO0oo = "";
                this.f21009OooO = "";
                this.f21015OooOO0 = "";
                this.f21016OooOO0O = null;
                this.f21017OooOO0o = 0L;
                this.f21019OooOOO0 = "";
                this.f21018OooOOO = "";
                this.f21020OooOOOO = null;
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f21011OooO0o == null) {
                    this.f21011OooO0o = MapField.newMapField(OooO0OO.f21021OooO00o);
                }
                if (!this.f21011OooO0o.isMutable()) {
                    this.f21011OooO0o = this.f21011OooO0o.copy();
                }
                return this.f21011OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            public final void OooO0oO(Request request) {
                if (request == Request.f20995OooOOo0) {
                    return;
                }
                if (!request.OooO0Oo().isEmpty()) {
                    this.f21010OooO0Oo = request.f20997OooO0Oo;
                    onChanged();
                }
                if (!request.OooO0o0().isEmpty()) {
                    this.f21012OooO0o0 = request.f20999OooO0o0;
                    onChanged();
                }
                OooO0o().mergeFrom(request.OooOO0O());
                if (!request.OooO0o().isEmpty()) {
                    this.f21013OooO0oO = request.f21000OooO0oO;
                    onChanged();
                }
                if (!request.OooO0OO().isEmpty()) {
                    this.f21014OooO0oo = request.f21001OooO0oo;
                    onChanged();
                }
                if (!request.OooO().isEmpty()) {
                    this.f21009OooO = request.f20996OooO;
                    onChanged();
                }
                if (!request.OooO0oo().isEmpty()) {
                    this.f21015OooOO0 = request.f21002OooOO0;
                    onChanged();
                }
                if (request.f21003OooOO0O != null) {
                    Timestamp timestampOooOO0 = request.OooOO0();
                    Timestamp timestamp = this.f21016OooOO0O;
                    if (timestamp != null) {
                        this.f21016OooOO0O = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooOO0).buildPartial();
                    } else {
                        this.f21016OooOO0O = timestampOooOO0;
                    }
                    onChanged();
                }
                long j = request.f21004OooOO0o;
                if (j != 0) {
                    this.f21017OooOO0o = j;
                    onChanged();
                }
                if (!request.OooO0oO().isEmpty()) {
                    this.f21019OooOOO0 = request.f21006OooOOO0;
                    onChanged();
                }
                if (!request.getReason().isEmpty()) {
                    this.f21018OooOOO = request.f21005OooOOO;
                    onChanged();
                }
                if (request.f21007OooOOOO != null) {
                    Auth authOooO0O0 = request.OooO0O0();
                    Auth auth = this.f21020OooOOOO;
                    if (auth != null) {
                        Auth.OooO0O0 builder = Auth.f20956OooOO0.toBuilder();
                        builder.OooO0o(auth);
                        builder.OooO0o(authOooO0O0);
                        this.f21020OooOOOO = builder.buildPartial();
                    } else {
                        this.f21020OooOOOO = authOooO0O0;
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
                        Request.f20994OooOOo.getClass();
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
                return Request.f20995OooOOo0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42965OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42966OooOO0O.ensureFieldAccessorsInitialized(Request.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 3) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f21011OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f21021OooO00o) : mapField;
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
                return Request.f20995OooOOo0;
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
                this.f21010OooO0Oo = "";
                this.f21012OooO0o0 = "";
                this.f21013OooO0oO = "";
                this.f21014OooO0oo = "";
                this.f21009OooO = "";
                this.f21015OooOO0 = "";
                this.f21019OooOOO0 = "";
                this.f21018OooOOO = "";
                Request request = Request.f20995OooOOo0;
            }
        }

        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f21021OooO00o;

            static {
                Descriptors.Descriptor descriptor = o000O.f42967OooOO0o;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f21021OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Request(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f21008OooOOOo = (byte) -1;
        }

        public final String OooO() {
            Object obj = this.f20996OooO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20996OooO = stringUtf8;
            return stringUtf8;
        }

        public final Auth OooO0O0() {
            Auth auth = this.f21007OooOOOO;
            return auth == null ? Auth.f20956OooOO0 : auth;
        }

        public final String OooO0OO() {
            Object obj = this.f21001OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21001OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0Oo() {
            Object obj = this.f20997OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20997OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o() {
            Object obj = this.f21000OooO0oO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21000OooO0oO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o0() {
            Object obj = this.f20999OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f20999OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oO() {
            Object obj = this.f21006OooOOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21006OooOOO0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oo() {
            Object obj = this.f21002OooOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21002OooOO0 = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooOO0() {
            Timestamp timestamp = this.f21003OooOO0O;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooOO0O() {
            MapField<String, String> mapField = this.f20998OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f21021OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f20995OooOOo0) {
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
            Timestamp timestamp = this.f21003OooOO0O;
            if ((timestamp != null) != (request.f21003OooOO0O != null)) {
                return false;
            }
            if (((timestamp != null) && !OooOO0().equals(request.OooOO0())) || this.f21004OooOO0o != request.f21004OooOO0o || !OooO0oO().equals(request.OooO0oO()) || !getReason().equals(request.getReason())) {
                return false;
            }
            Auth auth = this.f21007OooOOOO;
            if ((auth != null) != (request.f21007OooOOOO != null)) {
                return false;
            }
            return (!(auth != null) || OooO0O0().equals(request.OooO0O0())) && this.unknownFields.equals(request.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f20995OooOOo0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Request> getParserForType() {
            return f20994OooOOo;
        }

        public final String getReason() {
            Object obj = this.f21005OooOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21005OooOOO = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20997OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20997OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f20999OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f20999OooO0o0);
            }
            for (Map.Entry<String, String> entry : OooOO0O().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, OooO0OO.f21021OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21000OooO0oO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f21000OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21001OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f21001OooO0oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20996OooO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f20996OooO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21002OooOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f21002OooOO0);
            }
            if (this.f21003OooOO0O != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0());
            }
            long j = this.f21004OooOO0o;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21006OooOOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.f21006OooOOO0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21005OooOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f21005OooOOO);
            }
            if (this.f21007OooOOOO != null) {
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
            int iHashCode = OooO0o0().hashCode() + ((((OooO0Oo().hashCode() + o000Oo0.OooO00o(o000O.f42965OooOO0, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooOO0O().getMap().isEmpty()) {
                iHashCode = o000000O.OooO00o(iHashCode, 37, 3, 53) + OooOO0O().hashCode();
            }
            int iHashCode2 = OooO0oo().hashCode() + ((((OooO().hashCode() + ((((OooO0OO().hashCode() + ((((OooO0o().hashCode() + o000000O.OooO00o(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53);
            if (this.f21003OooOO0O != null) {
                iHashCode2 = o000000O.OooO00o(iHashCode2, 37, 9, 53) + OooOO0().hashCode();
            }
            int iHashCode3 = getReason().hashCode() + ((((OooO0oO().hashCode() + ((((Internal.hashLong(this.f21004OooOO0o) + o000000O.OooO00o(iHashCode2, 37, 10, 53)) * 37) + 11) * 53)) * 37) + 12) * 53);
            if (this.f21007OooOOOO != null) {
                iHashCode3 = OooO0O0().hashCode() + o000000O.OooO00o(iHashCode3, 37, 13, 53);
            }
            int iHashCode4 = this.unknownFields.hashCode() + (iHashCode3 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42966OooOO0O.ensureFieldAccessorsInitialized(Request.class, OooO0O0.class);
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
            byte b = this.f21008OooOOOo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f21008OooOOOo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f20995OooOOo0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Request();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f20997OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20997OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20999OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f20999OooO0o0);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0O(), OooO0OO.f21021OooO00o, 3);
            if (!GeneratedMessageV3.isStringEmpty(this.f21000OooO0oO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.f21000OooO0oO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21001OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.f21001OooO0oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f20996OooO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.f20996OooO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21002OooOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f21002OooOO0);
            }
            if (this.f21003OooOO0O != null) {
                codedOutputStream.writeMessage(9, OooOO0());
            }
            long j = this.f21004OooOO0o;
            if (j != 0) {
                codedOutputStream.writeInt64(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21006OooOOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.f21006OooOOO0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21005OooOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.f21005OooOOO);
            }
            if (this.f21007OooOOOO != null) {
                codedOutputStream.writeMessage(13, OooO0O0());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f20995OooOOo0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f20995OooOOo0.toBuilder();
        }

        private Request() {
            this.f21008OooOOOo = (byte) -1;
            this.f20997OooO0Oo = "";
            this.f20999OooO0o0 = "";
            this.f21000OooO0oO = "";
            this.f21001OooO0oo = "";
            this.f20996OooO = "";
            this.f21002OooOO0 = "";
            this.f21006OooOOO0 = "";
            this.f21005OooOOO = "";
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
                                this.f20997OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.f20999OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 26:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f20998OooO0o = MapField.newMapField(OooO0OO.f21021OooO00o);
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f21021OooO00o.getParserForType(), extensionRegistryLite);
                                this.f20998OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                continue;
                            case 34:
                                this.f21000OooO0oO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 42:
                                this.f21001OooO0oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f20996OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f21002OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                Timestamp timestamp = this.f21003OooOO0O;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                this.f21003OooOO0O = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.f21003OooOO0O = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 80:
                                this.f21004OooOO0o = codedInputStream.readInt64();
                                continue;
                            case 90:
                                this.f21006OooOOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 98:
                                this.f21005OooOOO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 106:
                                Auth auth = this.f21007OooOOOO;
                                Auth.OooO0O0 builder2 = auth != null ? auth.toBuilder() : null;
                                Auth auth2 = (Auth) codedInputStream.readMessage(Auth.f20957OooOO0O, extensionRegistryLite);
                                this.f21007OooOOOO = auth2;
                                if (builder2 != null) {
                                    builder2.OooO0o(auth2);
                                    this.f21007OooOOOO = builder2.buildPartial();
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
        public MapField<String, String> f21024OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f21025OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public volatile Object f21026OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f21027OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public MapField<String, String> f21028OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile Object f21029OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public volatile Object f21030OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Timestamp f21031OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Timestamp f21032OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public volatile Object f21033OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Timestamp f21034OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public volatile Object f21035OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public byte f21036OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final Resource f21023OooOOo0 = new Resource();

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final OooO00o f21022OooOOo = new OooO00o();

        public static class OooO00o extends AbstractParser<Resource> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Resource(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f21037OooO00o;

            static {
                Descriptors.Descriptor descriptor = o000O.f42974OooOOoo;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f21037OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public MapField<String, String> f21038OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f21039OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Object f21040OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f21041OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public MapField<String, String> f21042OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Object f21043OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public Object f21044OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public Timestamp f21045OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public Timestamp f21046OooOO0o;

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public Object f21047OooOOO;

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public Timestamp f21048OooOOO0;

            /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
            public Object f21049OooOOOO;

            public OooO0OO() {
                this.f21039OooO0Oo = "";
                this.f21041OooO0o0 = "";
                this.f21040OooO0o = "";
                this.f21043OooO0oo = "";
                this.f21044OooOO0 = "";
                this.f21047OooOOO = "";
                this.f21049OooOOOO = "";
                Resource resource = Resource.f21023OooOOo0;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Resource resource;
                try {
                    try {
                        Resource.f21022OooOOo.getClass();
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
                resource.f21025OooO0Oo = this.f21039OooO0Oo;
                resource.f21027OooO0o0 = this.f21041OooO0o0;
                resource.f21026OooO0o = this.f21040OooO0o;
                MapField<String, String> mapFieldEmptyMapField = this.f21042OooO0oO;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0o.f21050OooO00o);
                }
                resource.f21028OooO0oO = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                resource.f21029OooO0oo = this.f21043OooO0oo;
                MapField<String, String> mapFieldEmptyMapField2 = this.f21038OooO;
                if (mapFieldEmptyMapField2 == null) {
                    mapFieldEmptyMapField2 = MapField.emptyMapField(OooO0O0.f21037OooO00o);
                }
                resource.f21024OooO = mapFieldEmptyMapField2;
                mapFieldEmptyMapField2.makeImmutable();
                resource.f21030OooOO0 = this.f21044OooOO0;
                resource.f21031OooOO0O = this.f21045OooOO0O;
                resource.f21032OooOO0o = this.f21046OooOO0o;
                resource.f21034OooOOO0 = this.f21048OooOOO0;
                resource.f21033OooOOO = this.f21047OooOOO;
                resource.f21035OooOOOO = this.f21049OooOOOO;
                onBuilt();
                return resource;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f21039OooO0Oo = "";
                this.f21041OooO0o0 = "";
                this.f21040OooO0o = "";
                OooO0oO().clear();
                this.f21043OooO0oo = "";
                OooO0o().clear();
                this.f21044OooOO0 = "";
                this.f21045OooOO0O = null;
                this.f21046OooOO0o = null;
                this.f21048OooOOO0 = null;
                this.f21047OooOOO = "";
                this.f21049OooOOOO = "";
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f21038OooO == null) {
                    this.f21038OooO = MapField.newMapField(OooO0O0.f21037OooO00o);
                }
                if (!this.f21038OooO.isMutable()) {
                    this.f21038OooO = this.f21038OooO.copy();
                }
                return this.f21038OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0OO mo4013clone() {
                return (OooO0OO) super.mo4013clone();
            }

            public final MapField<String, String> OooO0oO() {
                onChanged();
                if (this.f21042OooO0oO == null) {
                    this.f21042OooO0oO = MapField.newMapField(OooO0o.f21050OooO00o);
                }
                if (!this.f21042OooO0oO.isMutable()) {
                    this.f21042OooO0oO = this.f21042OooO0oO.copy();
                }
                return this.f21042OooO0oO;
            }

            public final void OooO0oo(Resource resource) {
                if (resource == Resource.f21023OooOOo0) {
                    return;
                }
                if (!resource.OooO0oO().isEmpty()) {
                    this.f21039OooO0Oo = resource.f21025OooO0Oo;
                    onChanged();
                }
                if (!resource.getName().isEmpty()) {
                    this.f21041OooO0o0 = resource.f21027OooO0o0;
                    onChanged();
                }
                if (!resource.OooO0oo().isEmpty()) {
                    this.f21040OooO0o = resource.f21026OooO0o;
                    onChanged();
                }
                OooO0oO().mergeFrom(resource.OooOO0o());
                if (!resource.OooO().isEmpty()) {
                    this.f21043OooO0oo = resource.f21029OooO0oo;
                    onChanged();
                }
                OooO0o().mergeFrom(resource.OooOO0O());
                if (!resource.OooO0Oo().isEmpty()) {
                    this.f21044OooOO0 = resource.f21030OooOO0;
                    onChanged();
                }
                if (resource.f21031OooOO0O != null) {
                    Timestamp timestampOooO0O0 = resource.OooO0O0();
                    Timestamp timestamp = this.f21045OooOO0O;
                    if (timestamp != null) {
                        this.f21045OooOO0O = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0O0).buildPartial();
                    } else {
                        this.f21045OooOO0O = timestampOooO0O0;
                    }
                    onChanged();
                }
                if (resource.f21032OooOO0o != null) {
                    Timestamp timestampOooOO0 = resource.OooOO0();
                    Timestamp timestamp2 = this.f21046OooOO0o;
                    if (timestamp2 != null) {
                        this.f21046OooOO0o = Timestamp.newBuilder(timestamp2).mergeFrom(timestampOooOO0).buildPartial();
                    } else {
                        this.f21046OooOO0o = timestampOooOO0;
                    }
                    onChanged();
                }
                if (resource.f21034OooOOO0 != null) {
                    Timestamp timestampOooO0OO = resource.OooO0OO();
                    Timestamp timestamp3 = this.f21048OooOOO0;
                    if (timestamp3 != null) {
                        this.f21048OooOOO0 = Timestamp.newBuilder(timestamp3).mergeFrom(timestampOooO0OO).buildPartial();
                    } else {
                        this.f21048OooOOO0 = timestampOooO0OO;
                    }
                    onChanged();
                }
                if (!resource.OooO0o0().isEmpty()) {
                    this.f21047OooOOO = resource.f21033OooOOO;
                    onChanged();
                }
                if (!resource.OooO0o().isEmpty()) {
                    this.f21049OooOOOO = resource.f21035OooOOOO;
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
                return Resource.f21023OooOOo0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42971OooOOOo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42973OooOOo0.ensureFieldAccessorsInitialized(Resource.class, OooO0OO.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i == 4) {
                    MapField<String, String> mapField = this.f21042OooO0oO;
                    return mapField == null ? MapField.emptyMapField(OooO0o.f21050OooO00o) : mapField;
                }
                if (i != 6) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField2 = this.f21038OooO;
                return mapField2 == null ? MapField.emptyMapField(OooO0O0.f21037OooO00o) : mapField2;
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
                return Resource.f21023OooOOo0;
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
                this.f21039OooO0Oo = "";
                this.f21041OooO0o0 = "";
                this.f21040OooO0o = "";
                this.f21043OooO0oo = "";
                this.f21044OooOO0 = "";
                this.f21047OooOOO = "";
                this.f21049OooOOOO = "";
                Resource resource = Resource.f21023OooOOo0;
            }
        }

        public static final class OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final MapEntry<String, String> f21050OooO00o;

            static {
                Descriptors.Descriptor descriptor = o000O.f42972OooOOo;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f21050OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Resource(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f21036OooOOOo = (byte) -1;
        }

        public final String OooO() {
            Object obj = this.f21029OooO0oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21029OooO0oo = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooO0O0() {
            Timestamp timestamp = this.f21031OooOO0O;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final Timestamp OooO0OO() {
            Timestamp timestamp = this.f21034OooOOO0;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final String OooO0Oo() {
            Object obj = this.f21030OooOO0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21030OooOO0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o() {
            Object obj = this.f21035OooOOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21035OooOOOO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0o0() {
            Object obj = this.f21033OooOOO;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21033OooOOO = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oO() {
            Object obj = this.f21025OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21025OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0oo() {
            Object obj = this.f21026OooO0o;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21026OooO0o = stringUtf8;
            return stringUtf8;
        }

        public final Timestamp OooOO0() {
            Timestamp timestamp = this.f21032OooOO0o;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooOO0O() {
            MapField<String, String> mapField = this.f21024OooO;
            return mapField == null ? MapField.emptyMapField(OooO0O0.f21037OooO00o) : mapField;
        }

        public final MapField<String, String> OooOO0o() {
            MapField<String, String> mapField = this.f21028OooO0oO;
            return mapField == null ? MapField.emptyMapField(OooO0o.f21050OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO toBuilder() {
            if (this == f21023OooOOo0) {
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
            Timestamp timestamp = this.f21031OooOO0O;
            if ((timestamp != null) != (resource.f21031OooOO0O != null)) {
                return false;
            }
            if ((timestamp != null) && !OooO0O0().equals(resource.OooO0O0())) {
                return false;
            }
            Timestamp timestamp2 = this.f21032OooOO0o;
            if ((timestamp2 != null) != (resource.f21032OooOO0o != null)) {
                return false;
            }
            if ((timestamp2 != null) && !OooOO0().equals(resource.OooOO0())) {
                return false;
            }
            Timestamp timestamp3 = this.f21034OooOOO0;
            if ((timestamp3 != null) != (resource.f21034OooOOO0 != null)) {
                return false;
            }
            return (!(timestamp3 != null) || OooO0OO().equals(resource.OooO0OO())) && OooO0o0().equals(resource.OooO0o0()) && OooO0o().equals(resource.OooO0o()) && this.unknownFields.equals(resource.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f21023OooOOo0;
        }

        public final String getName() {
            Object obj = this.f21027OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21027OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Resource> getParserForType() {
            return f21022OooOOo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f21025OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f21025OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f21027OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f21027OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21026OooO0o)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f21026OooO0o);
            }
            for (Map.Entry<String, String> entry : OooOO0o().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, OooO0o.f21050OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21029OooO0oo)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f21029OooO0oo);
            }
            for (Map.Entry<String, String> entry2 : OooOO0O().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, OooO0O0.f21037OooO00o.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21030OooOO0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f21030OooOO0);
            }
            if (this.f21031OooOO0O != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, OooO0O0());
            }
            if (this.f21032OooOO0o != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, OooOO0());
            }
            if (this.f21034OooOOO0 != null) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooO0OO());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21033OooOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.f21033OooOOO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21035OooOOOO)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f21035OooOOOO);
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
            int iHashCode = OooO0oo().hashCode() + ((((getName().hashCode() + ((((OooO0oO().hashCode() + o000Oo0.OooO00o(o000O.f42971OooOOOo, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
            if (!OooOO0o().getMap().isEmpty()) {
                iHashCode = OooOO0o().hashCode() + o000000O.OooO00o(iHashCode, 37, 4, 53);
            }
            int iHashCode2 = OooO().hashCode() + o000000O.OooO00o(iHashCode, 37, 5, 53);
            if (!OooOO0O().getMap().isEmpty()) {
                iHashCode2 = OooOO0O().hashCode() + o000000O.OooO00o(iHashCode2, 37, 6, 53);
            }
            int iHashCode3 = OooO0Oo().hashCode() + o000000O.OooO00o(iHashCode2, 37, 7, 53);
            if (this.f21031OooOO0O != null) {
                iHashCode3 = OooO0O0().hashCode() + o000000O.OooO00o(iHashCode3, 37, 8, 53);
            }
            if (this.f21032OooOO0o != null) {
                iHashCode3 = OooOO0().hashCode() + o000000O.OooO00o(iHashCode3, 37, 9, 53);
            }
            if (this.f21034OooOOO0 != null) {
                iHashCode3 = OooO0OO().hashCode() + o000000O.OooO00o(iHashCode3, 37, 10, 53);
            }
            int iHashCode4 = this.unknownFields.hashCode() + ((OooO0o().hashCode() + ((((OooO0o0().hashCode() + o000000O.OooO00o(iHashCode3, 37, 11, 53)) * 37) + 12) * 53)) * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42973OooOOo0.ensureFieldAccessorsInitialized(Resource.class, OooO0OO.class);
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
            byte b = this.f21036OooOOOo;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f21036OooOOOo = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f21023OooOOo0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Resource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f21025OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f21025OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21027OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f21027OooO0o0);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21026OooO0o)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.f21026OooO0o);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0o(), OooO0o.f21050OooO00o, 4);
            if (!GeneratedMessageV3.isStringEmpty(this.f21029OooO0oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.f21029OooO0oo);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooOO0O(), OooO0O0.f21037OooO00o, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.f21030OooOO0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.f21030OooOO0);
            }
            if (this.f21031OooOO0O != null) {
                codedOutputStream.writeMessage(8, OooO0O0());
            }
            if (this.f21032OooOO0o != null) {
                codedOutputStream.writeMessage(9, OooOO0());
            }
            if (this.f21034OooOOO0 != null) {
                codedOutputStream.writeMessage(10, OooO0OO());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21033OooOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.f21033OooOOO);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21035OooOOOO)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.f21035OooOOOO);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f21023OooOOo0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f21023OooOOo0.toBuilder();
        }

        private Resource() {
            this.f21036OooOOOo = (byte) -1;
            this.f21025OooO0Oo = "";
            this.f21027OooO0o0 = "";
            this.f21026OooO0o = "";
            this.f21029OooO0oo = "";
            this.f21030OooOO0 = "";
            this.f21033OooOOO = "";
            this.f21035OooOOOO = "";
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
                                    this.f21025OooO0Oo = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 18:
                                    this.f21027OooO0o0 = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 26:
                                    this.f21026OooO0o = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 34:
                                    if ((i & 1) == 0) {
                                        this.f21028OooO0oO = MapField.newMapField(OooO0o.f21050OooO00o);
                                        i |= 1;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0o.f21050OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f21028OooO0oO.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                    continue;
                                case 42:
                                    this.f21029OooO0oo = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 50:
                                    if ((i & 2) == 0) {
                                        this.f21024OooO = MapField.newMapField(OooO0O0.f21037OooO00o);
                                        i |= 2;
                                    }
                                    MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(OooO0O0.f21037OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f21024OooO.getMutableMap().put(mapEntry2.getKey(), mapEntry2.getValue());
                                    continue;
                                case 58:
                                    this.f21030OooOO0 = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 66:
                                    Timestamp timestamp = this.f21031OooOO0O;
                                    builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f21031OooOO0O = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.f21031OooOO0O = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    Timestamp timestamp3 = this.f21032OooOO0o;
                                    builder = timestamp3 != null ? timestamp3.toBuilder() : null;
                                    Timestamp timestamp4 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f21032OooOO0o = timestamp4;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp4);
                                        this.f21032OooOO0o = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 82:
                                    Timestamp timestamp5 = this.f21034OooOOO0;
                                    builder = timestamp5 != null ? timestamp5.toBuilder() : null;
                                    Timestamp timestamp6 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.f21034OooOOO0 = timestamp6;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp6);
                                        this.f21034OooOOO0 = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    this.f21033OooOOO = codedInputStream.readStringRequireUtf8();
                                    continue;
                                case 98:
                                    this.f21035OooOOOO = codedInputStream.readStringRequireUtf8();
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
        public static final Response f21051OooOO0 = new Response();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final OooO00o f21052OooOO0O = new OooO00o();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte f21053OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f21054OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MapField<String, String> f21055OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f21056OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Timestamp f21057OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Duration f21058OooO0oo;

        public static class OooO00o extends AbstractParser<Response> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Response(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f21059OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MapField<String, String> f21060OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public long f21061OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public Timestamp f21062OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public Duration f21063OooO0oo;

            public OooO0O0() {
                Response response = Response.f21051OooOO0;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Response buildPartial() {
                Response response = new Response(this);
                response.f21054OooO0Oo = this.f21059OooO0Oo;
                response.f21056OooO0o0 = this.f21061OooO0o0;
                MapField<String, String> mapFieldEmptyMapField = this.f21060OooO0o;
                if (mapFieldEmptyMapField == null) {
                    mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f21064OooO00o);
                }
                response.f21055OooO0o = mapFieldEmptyMapField;
                mapFieldEmptyMapField.makeImmutable();
                response.f21057OooO0oO = this.f21062OooO0oO;
                response.f21058OooO0oo = this.f21063OooO0oo;
                onBuilt();
                return response;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f21059OooO0Oo = 0L;
                this.f21061OooO0o0 = 0L;
                OooO0o().clear();
                this.f21062OooO0oO = null;
                this.f21063OooO0oo = null;
            }

            public final MapField<String, String> OooO0o() {
                onChanged();
                if (this.f21060OooO0o == null) {
                    this.f21060OooO0o = MapField.newMapField(OooO0OO.f21064OooO00o);
                }
                if (!this.f21060OooO0o.isMutable()) {
                    this.f21060OooO0o = this.f21060OooO0o.copy();
                }
                return this.f21060OooO0o;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            public final void OooO0oO(Response response) {
                if (response == Response.f21051OooOO0) {
                    return;
                }
                long j = response.f21054OooO0Oo;
                if (j != 0) {
                    this.f21059OooO0Oo = j;
                    onChanged();
                }
                long j2 = response.f21056OooO0o0;
                if (j2 != 0) {
                    this.f21061OooO0o0 = j2;
                    onChanged();
                }
                OooO0o().mergeFrom(response.OooO0Oo());
                if (response.f21057OooO0oO != null) {
                    Timestamp timestampOooO0OO = response.OooO0OO();
                    Timestamp timestamp = this.f21062OooO0oO;
                    if (timestamp != null) {
                        this.f21062OooO0oO = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0OO).buildPartial();
                    } else {
                        this.f21062OooO0oO = timestampOooO0OO;
                    }
                    onChanged();
                }
                if (response.f21058OooO0oo != null) {
                    Duration durationOooO0O0 = response.OooO0O0();
                    Duration duration = this.f21063OooO0oo;
                    if (duration != null) {
                        this.f21063OooO0oo = Duration.newBuilder(duration).mergeFrom(durationOooO0O0).buildPartial();
                    } else {
                        this.f21063OooO0oo = durationOooO0O0;
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
                        Response.f21052OooOO0O.getClass();
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
                return Response.f21051OooOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o000O.f42969OooOOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o000O.f42968OooOOO.ensureFieldAccessorsInitialized(Response.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final MapField internalGetMapField(int i) {
                if (i != 3) {
                    throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
                }
                MapField<String, String> mapField = this.f21060OooO0o;
                return mapField == null ? MapField.emptyMapField(OooO0OO.f21064OooO00o) : mapField;
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
                return Response.f21051OooOO0;
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
                Response response = Response.f21051OooOO0;
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
            public static final MapEntry<String, String> f21064OooO00o;

            static {
                Descriptors.Descriptor descriptor = o000O.f42970OooOOOO;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f21064OooO00o = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }
        }

        public Response(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f21053OooO = (byte) -1;
        }

        public final Duration OooO0O0() {
            Duration duration = this.f21058OooO0oo;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public final Timestamp OooO0OO() {
            Timestamp timestamp = this.f21057OooO0oO;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public final MapField<String, String> OooO0Oo() {
            MapField<String, String> mapField = this.f21055OooO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f21064OooO00o) : mapField;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f21051OooOO0) {
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
            if (this.f21054OooO0Oo != response.f21054OooO0Oo || this.f21056OooO0o0 != response.f21056OooO0o0 || !OooO0Oo().equals(response.OooO0Oo())) {
                return false;
            }
            Timestamp timestamp = this.f21057OooO0oO;
            if ((timestamp != null) != (response.f21057OooO0oO != null)) {
                return false;
            }
            if ((timestamp != null) && !OooO0OO().equals(response.OooO0OO())) {
                return false;
            }
            Duration duration = this.f21058OooO0oo;
            if ((duration != null) != (response.f21058OooO0oo != null)) {
                return false;
            }
            return (!(duration != null) || OooO0O0().equals(response.OooO0O0())) && this.unknownFields.equals(response.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f21051OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Response> getParserForType() {
            return f21052OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.f21054OooO0Oo;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.f21056OooO0o0;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            for (Map.Entry<String, String> entry : OooO0Oo().getMap().entrySet()) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(3, OooO0OO.f21064OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (this.f21057OooO0oO != null) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(4, OooO0OO());
            }
            if (this.f21058OooO0oo != null) {
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
            int iHashLong = Internal.hashLong(this.f21056OooO0o0) + ((((Internal.hashLong(this.f21054OooO0Oo) + o000Oo0.OooO00o(o000O.f42969OooOOO0, 779, 37, 1, 53)) * 37) + 2) * 53);
            if (!OooO0Oo().getMap().isEmpty()) {
                iHashLong = o000000O.OooO00o(iHashLong, 37, 3, 53) + OooO0Oo().hashCode();
            }
            if (this.f21057OooO0oO != null) {
                iHashLong = o000000O.OooO00o(iHashLong, 37, 4, 53) + OooO0OO().hashCode();
            }
            if (this.f21058OooO0oo != null) {
                iHashLong = o000000O.OooO00o(iHashLong, 37, 5, 53) + OooO0O0().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O.f42968OooOOO.ensureFieldAccessorsInitialized(Response.class, OooO0O0.class);
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
            byte b = this.f21053OooO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f21053OooO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f21051OooOO0.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Response();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.f21054OooO0Oo;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.f21056OooO0o0;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0Oo(), OooO0OO.f21064OooO00o, 3);
            if (this.f21057OooO0oO != null) {
                codedOutputStream.writeMessage(4, OooO0OO());
            }
            if (this.f21058OooO0oo != null) {
                codedOutputStream.writeMessage(5, OooO0O0());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f21051OooOO0;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f21051OooOO0.toBuilder();
        }

        private Response() {
            this.f21053OooO = (byte) -1;
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
                                    this.f21054OooO0Oo = codedInputStream.readInt64();
                                } else if (tag == 16) {
                                    this.f21056OooO0o0 = codedInputStream.readInt64();
                                } else if (tag != 26) {
                                    if (tag == 34) {
                                        Timestamp timestamp = this.f21057OooO0oO;
                                        Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                        Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                        this.f21057OooO0oO = timestamp2;
                                        if (builder != null) {
                                            builder.mergeFrom(timestamp2);
                                            this.f21057OooO0oO = builder.buildPartial();
                                        }
                                    } else if (tag != 42) {
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        Duration duration = this.f21058OooO0oo;
                                        Duration.Builder builder2 = duration != null ? duration.toBuilder() : null;
                                        Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                        this.f21058OooO0oo = duration2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(duration2);
                                            this.f21058OooO0oo = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    boolean z3 = (z2 ? 1 : 0) & true;
                                    z2 = z2;
                                    if (!z3) {
                                        this.f21055OooO0o = MapField.newMapField(OooO0OO.f21064OooO00o);
                                        z2 = (z2 ? 1 : 0) | true;
                                    }
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f21064OooO00o.getParserForType(), extensionRegistryLite);
                                    this.f21055OooO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
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
        this.f20944OooOO0o = (byte) -1;
    }

    public final Response OooO() {
        Response response = this.f20941OooO0oo;
        return response == null ? Response.f21051OooOO0 : response;
    }

    public final Api OooO0Oo() {
        Api api = this.f20942OooOO0;
        return api == null ? Api.f20945OooO : api;
    }

    public final Peer OooO0o() {
        Peer peer = this.f20937OooO0Oo;
        return peer == null ? Peer.f20980OooOO0 : peer;
    }

    public final Peer OooO0o0() {
        Peer peer = this.f20938OooO0o;
        return peer == null ? Peer.f20980OooOO0 : peer;
    }

    public final Request OooO0oO() {
        Request request = this.f20940OooO0oO;
        return request == null ? Request.f20995OooOOo0 : request;
    }

    public final Resource OooO0oo() {
        Resource resource = this.f20936OooO;
        return resource == null ? Resource.f21023OooOOo0 : resource;
    }

    public final Peer OooOO0() {
        Peer peer = this.f20939OooO0o0;
        return peer == null ? Peer.f20980OooOO0 : peer;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f20935OooOOO0) {
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
        Peer peer = this.f20937OooO0Oo;
        if ((peer != null) != (attributeContext.f20937OooO0Oo != null)) {
            return false;
        }
        if ((peer != null) && !OooO0o().equals(attributeContext.OooO0o())) {
            return false;
        }
        Peer peer2 = this.f20939OooO0o0;
        if ((peer2 != null) != (attributeContext.f20939OooO0o0 != null)) {
            return false;
        }
        if ((peer2 != null) && !OooOO0().equals(attributeContext.OooOO0())) {
            return false;
        }
        Peer peer3 = this.f20938OooO0o;
        if ((peer3 != null) != (attributeContext.f20938OooO0o != null)) {
            return false;
        }
        if ((peer3 != null) && !OooO0o0().equals(attributeContext.OooO0o0())) {
            return false;
        }
        Request request = this.f20940OooO0oO;
        if ((request != null) != (attributeContext.f20940OooO0oO != null)) {
            return false;
        }
        if ((request != null) && !OooO0oO().equals(attributeContext.OooO0oO())) {
            return false;
        }
        Response response = this.f20941OooO0oo;
        if ((response != null) != (attributeContext.f20941OooO0oo != null)) {
            return false;
        }
        if ((response != null) && !OooO().equals(attributeContext.OooO())) {
            return false;
        }
        Resource resource = this.f20936OooO;
        if ((resource != null) != (attributeContext.f20936OooO != null)) {
            return false;
        }
        if ((resource != null) && !OooO0oo().equals(attributeContext.OooO0oo())) {
            return false;
        }
        Api api = this.f20942OooOO0;
        if ((api != null) != (attributeContext.f20942OooOO0 != null)) {
            return false;
        }
        return (!(api != null) || OooO0Oo().equals(attributeContext.OooO0Oo())) && this.f20943OooOO0O.equals(attributeContext.f20943OooOO0O) && this.unknownFields.equals(attributeContext.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20935OooOOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AttributeContext> getParserForType() {
        return f20934OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = this.f20939OooO0o0 != null ? CodedOutputStream.computeMessageSize(1, OooOO0()) + 0 : 0;
        if (this.f20938OooO0o != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, OooO0o0());
        }
        if (this.f20940OooO0oO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, OooO0oO());
        }
        if (this.f20941OooO0oo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, OooO());
        }
        if (this.f20936OooO != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(5, OooO0oo());
        }
        if (this.f20942OooOO0 != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(6, OooO0Oo());
        }
        if (this.f20937OooO0Oo != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, OooO0o());
        }
        for (int i2 = 0; i2 < this.f20943OooOO0O.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(8, this.f20943OooOO0O.get(i2));
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
        int iHashCode = o000O.f42957OooO00o.hashCode() + 779;
        if (this.f20937OooO0Oo != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 7, 53) + OooO0o().hashCode();
        }
        if (this.f20939OooO0o0 != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 1, 53) + OooOO0().hashCode();
        }
        if (this.f20938OooO0o != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 2, 53) + OooO0o0().hashCode();
        }
        if (this.f20940OooO0oO != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 3, 53) + OooO0oO().hashCode();
        }
        if (this.f20941OooO0oo != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 4, 53) + OooO().hashCode();
        }
        if (this.f20936OooO != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 5, 53) + OooO0oo().hashCode();
        }
        if (this.f20942OooOO0 != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 6, 53) + OooO0Oo().hashCode();
        }
        if (this.f20943OooOO0O.size() > 0) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 8, 53) + this.f20943OooOO0O.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000O.f42958OooO0O0.ensureFieldAccessorsInitialized(AttributeContext.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20944OooOO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20944OooOO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20935OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AttributeContext();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20939OooO0o0 != null) {
            codedOutputStream.writeMessage(1, OooOO0());
        }
        if (this.f20938OooO0o != null) {
            codedOutputStream.writeMessage(2, OooO0o0());
        }
        if (this.f20940OooO0oO != null) {
            codedOutputStream.writeMessage(3, OooO0oO());
        }
        if (this.f20941OooO0oo != null) {
            codedOutputStream.writeMessage(4, OooO());
        }
        if (this.f20936OooO != null) {
            codedOutputStream.writeMessage(5, OooO0oo());
        }
        if (this.f20942OooOO0 != null) {
            codedOutputStream.writeMessage(6, OooO0Oo());
        }
        if (this.f20937OooO0Oo != null) {
            codedOutputStream.writeMessage(7, OooO0o());
        }
        for (int i = 0; i < this.f20943OooOO0O.size(); i++) {
            codedOutputStream.writeMessage(8, this.f20943OooOO0O.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20935OooOOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20935OooOOO0.toBuilder();
    }

    private AttributeContext() {
        this.f20944OooOO0o = (byte) -1;
        this.f20943OooOO0O = Collections.emptyList();
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
                                Peer peer = this.f20939OooO0o0;
                                Peer.OooO0O0 builder = peer != null ? peer.toBuilder() : null;
                                Peer peer2 = (Peer) codedInputStream.readMessage(Peer.f20981OooOO0O, extensionRegistryLite);
                                this.f20939OooO0o0 = peer2;
                                if (builder != null) {
                                    builder.OooO0oO(peer2);
                                    this.f20939OooO0o0 = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                Peer peer3 = this.f20938OooO0o;
                                Peer.OooO0O0 builder2 = peer3 != null ? peer3.toBuilder() : null;
                                Peer peer4 = (Peer) codedInputStream.readMessage(Peer.f20981OooOO0O, extensionRegistryLite);
                                this.f20938OooO0o = peer4;
                                if (builder2 != null) {
                                    builder2.OooO0oO(peer4);
                                    this.f20938OooO0o = builder2.buildPartial();
                                }
                            } else if (tag == 26) {
                                Request request = this.f20940OooO0oO;
                                Request.OooO0O0 builder3 = request != null ? request.toBuilder() : null;
                                Request request2 = (Request) codedInputStream.readMessage(Request.f20994OooOOo, extensionRegistryLite);
                                this.f20940OooO0oO = request2;
                                if (builder3 != null) {
                                    builder3.OooO0oO(request2);
                                    this.f20940OooO0oO = builder3.buildPartial();
                                }
                            } else if (tag == 34) {
                                Response response = this.f20941OooO0oo;
                                Response.OooO0O0 builder4 = response != null ? response.toBuilder() : null;
                                Response response2 = (Response) codedInputStream.readMessage(Response.f21052OooOO0O, extensionRegistryLite);
                                this.f20941OooO0oo = response2;
                                if (builder4 != null) {
                                    builder4.OooO0oO(response2);
                                    this.f20941OooO0oo = builder4.buildPartial();
                                }
                            } else if (tag == 42) {
                                Resource resource = this.f20936OooO;
                                Resource.OooO0OO builder5 = resource != null ? resource.toBuilder() : null;
                                Resource resource2 = (Resource) codedInputStream.readMessage(Resource.f21022OooOOo, extensionRegistryLite);
                                this.f20936OooO = resource2;
                                if (builder5 != null) {
                                    builder5.OooO0oo(resource2);
                                    this.f20936OooO = builder5.buildPartial();
                                }
                            } else if (tag == 50) {
                                Api api = this.f20942OooOO0;
                                Api.OooO0O0 builder6 = api != null ? api.toBuilder() : null;
                                Api api2 = (Api) codedInputStream.readMessage(Api.f20946OooOO0, extensionRegistryLite);
                                this.f20942OooOO0 = api2;
                                if (builder6 != null) {
                                    builder6.OooO0o(api2);
                                    this.f20942OooOO0 = builder6.buildPartial();
                                }
                            } else if (tag == 58) {
                                Peer peer5 = this.f20937OooO0Oo;
                                Peer.OooO0O0 builder7 = peer5 != null ? peer5.toBuilder() : null;
                                Peer peer6 = (Peer) codedInputStream.readMessage(Peer.f20981OooOO0O, extensionRegistryLite);
                                this.f20937OooO0Oo = peer6;
                                if (builder7 != null) {
                                    builder7.OooO0oO(peer6);
                                    this.f20937OooO0Oo = builder7.buildPartial();
                                }
                            } else if (tag != 66) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.f20943OooOO0O = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.f20943OooOO0O.add((Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
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
                    this.f20943OooOO0O = Collections.unmodifiableList(this.f20943OooOO0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((z2 ? 1 : 0) & true) {
            this.f20943OooOO0O = Collections.unmodifiableList(this.f20943OooOO0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
