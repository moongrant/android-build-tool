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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationInfo extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AuthenticationInfo f18945OooOO0O = new AuthenticationInfo();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f18946OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f18947OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18948OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Struct f18949OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18950OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18951OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<ServiceAccountDelegationInfo> f18952OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f18953OooOO0;

    public static class OooO00o extends AbstractParser<AuthenticationInfo> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuthenticationInfo(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public List<ServiceAccountDelegationInfo> f18954OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18955OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18956OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18957OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Struct f18958OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18959OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.OooO0OO, Object> f18960OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f18961OooOO0O;

        public OooO0O0() {
            this.f18957OooO0o0 = "";
            this.f18956OooO0o = "";
            this.f18959OooO0oo = "";
            this.f18954OooO = Collections.emptyList();
            this.f18961OooOO0O = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AuthenticationInfo buildPartial() {
            AuthenticationInfo authenticationInfo = new AuthenticationInfo(this);
            authenticationInfo.f18948OooO0Oo = this.f18957OooO0o0;
            authenticationInfo.f18950OooO0o0 = this.f18956OooO0o;
            authenticationInfo.f18949OooO0o = this.f18958OooO0oO;
            authenticationInfo.f18951OooO0oO = this.f18959OooO0oo;
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.OooO0OO, Object> repeatedFieldBuilderV3 = this.f18960OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18955OooO0Oo & 1) != 0) {
                    this.f18954OooO = Collections.unmodifiableList(this.f18954OooO);
                    this.f18955OooO0Oo &= -2;
                }
                authenticationInfo.f18952OooO0oo = this.f18954OooO;
            } else {
                authenticationInfo.f18952OooO0oo = repeatedFieldBuilderV3.build();
            }
            authenticationInfo.f18947OooO = this.f18961OooOO0O;
            onBuilt();
            return authenticationInfo;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18957OooO0o0 = "";
            this.f18956OooO0o = "";
            this.f18958OooO0oO = null;
            this.f18959OooO0oo = "";
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.OooO0OO, Object> repeatedFieldBuilderV3 = this.f18960OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                this.f18954OooO = Collections.emptyList();
                this.f18955OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18961OooOO0O = "";
        }

        public final RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.OooO0OO, Object> OooO0o() {
            if (this.f18960OooOO0 == null) {
                this.f18960OooOO0 = new RepeatedFieldBuilderV3<>(this.f18954OooO, (this.f18955OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18954OooO = null;
            }
            return this.f18960OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(AuthenticationInfo authenticationInfo) {
            if (authenticationInfo == AuthenticationInfo.f18945OooOO0O) {
                return;
            }
            if (!authenticationInfo.OooO0OO().isEmpty()) {
                this.f18957OooO0o0 = authenticationInfo.f18948OooO0Oo;
                onChanged();
            }
            if (!authenticationInfo.OooO0O0().isEmpty()) {
                this.f18956OooO0o = authenticationInfo.f18950OooO0o0;
                onChanged();
            }
            if (authenticationInfo.f18949OooO0o != null) {
                Struct structOooO0o = authenticationInfo.OooO0o();
                Struct struct = this.f18958OooO0oO;
                if (struct != null) {
                    this.f18958OooO0oO = Struct.newBuilder(struct).mergeFrom(structOooO0o).buildPartial();
                } else {
                    this.f18958OooO0oO = structOooO0o;
                }
                onChanged();
            }
            if (!authenticationInfo.OooO0o0().isEmpty()) {
                this.f18959OooO0oo = authenticationInfo.f18951OooO0oO;
                onChanged();
            }
            if (this.f18960OooOO0 == null) {
                if (!authenticationInfo.f18952OooO0oo.isEmpty()) {
                    if (this.f18954OooO.isEmpty()) {
                        this.f18954OooO = authenticationInfo.f18952OooO0oo;
                        this.f18955OooO0Oo &= -2;
                    } else {
                        if ((this.f18955OooO0Oo & 1) == 0) {
                            this.f18954OooO = new ArrayList(this.f18954OooO);
                            this.f18955OooO0Oo |= 1;
                        }
                        this.f18954OooO.addAll(authenticationInfo.f18952OooO0oo);
                    }
                    onChanged();
                }
            } else if (!authenticationInfo.f18952OooO0oo.isEmpty()) {
                if (this.f18960OooOO0.isEmpty()) {
                    this.f18960OooOO0.dispose();
                    this.f18960OooOO0 = null;
                    this.f18954OooO = authenticationInfo.f18952OooO0oo;
                    this.f18955OooO0Oo &= -2;
                    this.f18960OooOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18960OooOO0.addAllMessages(authenticationInfo.f18952OooO0oo);
                }
            }
            if (!authenticationInfo.OooO0Oo().isEmpty()) {
                this.f18961OooOO0O = authenticationInfo.f18947OooO;
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AuthenticationInfo authenticationInfo;
            try {
                try {
                    AuthenticationInfo.f18946OooOO0o.getClass();
                    OooO0oO(new AuthenticationInfo(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    authenticationInfo = (AuthenticationInfo) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (authenticationInfo != null) {
                            OooO0oO(authenticationInfo);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                authenticationInfo = null;
                if (authenticationInfo != null) {
                    OooO0oO(authenticationInfo);
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
            AuthenticationInfo authenticationInfoBuildPartial = buildPartial();
            if (authenticationInfoBuildPartial.isInitialized()) {
                return authenticationInfoBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authenticationInfoBuildPartial);
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
            return AuthenticationInfo.f18945OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0O0O0o0.OooO00o.f41927OooO0OO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0O0O0o0.OooO00o.f41928OooO0Oo.ensureFieldAccessorsInitialized(AuthenticationInfo.class, OooO0O0.class);
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
            return AuthenticationInfo.f18945OooOO0O;
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
            AuthenticationInfo authenticationInfoBuildPartial = buildPartial();
            if (authenticationInfoBuildPartial.isInitialized()) {
                return authenticationInfoBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authenticationInfoBuildPartial);
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
            if (message instanceof AuthenticationInfo) {
                OooO0oO((AuthenticationInfo) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof AuthenticationInfo) {
                OooO0oO((AuthenticationInfo) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18957OooO0o0 = "";
            this.f18956OooO0o = "";
            this.f18959OooO0oo = "";
            this.f18954OooO = Collections.emptyList();
            this.f18961OooOO0O = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public AuthenticationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18953OooOO0 = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18950OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18950OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18948OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18948OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18947OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18947OooO = stringUtf8;
        return stringUtf8;
    }

    public final Struct OooO0o() {
        Struct struct = this.f18949OooO0o;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public final String OooO0o0() {
        Object obj = this.f18951OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18951OooO0oO = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18945OooOO0O) {
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
        if (!(obj instanceof AuthenticationInfo)) {
            return super.equals(obj);
        }
        AuthenticationInfo authenticationInfo = (AuthenticationInfo) obj;
        if (!OooO0OO().equals(authenticationInfo.OooO0OO()) || !OooO0O0().equals(authenticationInfo.OooO0O0())) {
            return false;
        }
        Struct struct = this.f18949OooO0o;
        if ((struct != null) != (authenticationInfo.f18949OooO0o != null)) {
            return false;
        }
        return (!(struct != null) || OooO0o().equals(authenticationInfo.OooO0o())) && OooO0o0().equals(authenticationInfo.OooO0o0()) && this.f18952OooO0oo.equals(authenticationInfo.f18952OooO0oo) && OooO0Oo().equals(authenticationInfo.OooO0Oo()) && this.unknownFields.equals(authenticationInfo.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18945OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AuthenticationInfo> getParserForType() {
        return f18946OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18948OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18948OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18950OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18950OooO0o0);
        }
        if (this.f18949OooO0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, OooO0o());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18951OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18951OooO0oO);
        }
        for (int i2 = 0; i2 < this.f18952OooO0oo.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.f18952OooO0oo.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18947OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f18947OooO);
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
        int iHashCode = OooO0O0().hashCode() + ((((OooO0OO().hashCode() + o000Oo0.OooO00o(o0O0O0o0.OooO00o.f41927OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53);
        if (this.f18949OooO0o != null) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 4, 53) + OooO0o().hashCode();
        }
        int iHashCode2 = OooO0o0().hashCode() + o000000O.OooO00o(iHashCode, 37, 5, 53);
        if (this.f18952OooO0oo.size() > 0) {
            iHashCode2 = this.f18952OooO0oo.hashCode() + o000000O.OooO00o(iHashCode2, 37, 6, 53);
        }
        int iHashCode3 = this.unknownFields.hashCode() + ((OooO0Oo().hashCode() + o000000O.OooO00o(iHashCode2, 37, 8, 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0O0O0o0.OooO00o.f41928OooO0Oo.ensureFieldAccessorsInitialized(AuthenticationInfo.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18953OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18953OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18945OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuthenticationInfo();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18948OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18948OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18950OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18950OooO0o0);
        }
        if (this.f18949OooO0o != null) {
            codedOutputStream.writeMessage(4, OooO0o());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18951OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18951OooO0oO);
        }
        for (int i = 0; i < this.f18952OooO0oo.size(); i++) {
            codedOutputStream.writeMessage(6, this.f18952OooO0oo.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18947OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f18947OooO);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18945OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18945OooOO0O.toBuilder();
    }

    private AuthenticationInfo() {
        this.f18953OooOO0 = (byte) -1;
        this.f18948OooO0Oo = "";
        this.f18950OooO0o0 = "";
        this.f18951OooO0oO = "";
        this.f18952OooO0oo = Collections.emptyList();
        this.f18947OooO = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public AuthenticationInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.f18948OooO0Oo = codedInputStream.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.f18950OooO0o0 = codedInputStream.readStringRequireUtf8();
                        } else if (tag == 34) {
                            Struct struct = this.f18949OooO0o;
                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.f18949OooO0o = struct2;
                            if (builder != null) {
                                builder.mergeFrom(struct2);
                                this.f18949OooO0o = builder.buildPartial();
                            }
                        } else if (tag == 42) {
                            this.f18951OooO0oO = codedInputStream.readStringRequireUtf8();
                        } else if (tag == 50) {
                            if (!(z2 & true)) {
                                this.f18952OooO0oo = new ArrayList();
                                z2 |= true;
                            }
                            this.f18952OooO0oo.add((ServiceAccountDelegationInfo) codedInputStream.readMessage(ServiceAccountDelegationInfo.f18994OooO, extensionRegistryLite));
                        } else if (tag != 66) {
                            if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                        } else {
                            this.f18947OooO = codedInputStream.readStringRequireUtf8();
                        }
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
                if (z2 & true) {
                    this.f18952OooO0oo = Collections.unmodifiableList(this.f18952OooO0oo);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18952OooO0oo = Collections.unmodifiableList(this.f18952OooO0oo);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
