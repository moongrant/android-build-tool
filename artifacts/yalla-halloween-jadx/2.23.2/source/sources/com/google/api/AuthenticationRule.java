package com.google.api;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.OooO0OO;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRule extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final AuthenticationRule f17796OooO = new AuthenticationRule();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f17797OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f17798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f17799OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OAuthRequirements f17800OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public List<AuthRequirement> f17801OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte f17802OooO0oo;

    public static class OooO00o extends AbstractParser<AuthenticationRule> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuthenticationRule(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<AuthRequirement, AuthRequirement.OooO0O0, Object> f17803OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17804OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OAuthRequirements f17805OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f17806OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f17807OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public List<AuthRequirement> f17808OooO0oo;

        public OooO0O0() {
            this.f17806OooO0o0 = "";
            this.f17808OooO0oo = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AuthenticationRule buildPartial() {
            AuthenticationRule authenticationRule = new AuthenticationRule(this);
            authenticationRule.f17798OooO0Oo = this.f17806OooO0o0;
            authenticationRule.f17800OooO0o0 = this.f17805OooO0o;
            authenticationRule.f17799OooO0o = this.f17807OooO0oO;
            RepeatedFieldBuilderV3<AuthRequirement, AuthRequirement.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17803OooO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f17804OooO0Oo & 1) != 0) {
                    this.f17808OooO0oo = Collections.unmodifiableList(this.f17808OooO0oo);
                    this.f17804OooO0Oo &= -2;
                }
                authenticationRule.f17801OooO0oO = this.f17808OooO0oo;
            } else {
                authenticationRule.f17801OooO0oO = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return authenticationRule;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f17806OooO0o0 = "";
            this.f17805OooO0o = null;
            this.f17807OooO0oO = false;
            RepeatedFieldBuilderV3<AuthRequirement, AuthRequirement.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17803OooO;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f17808OooO0oo = Collections.emptyList();
                this.f17804OooO0Oo &= -2;
            }
        }

        public final RepeatedFieldBuilderV3<AuthRequirement, AuthRequirement.OooO0O0, Object> OooO0o() {
            if (this.f17803OooO == null) {
                this.f17803OooO = new RepeatedFieldBuilderV3<>(this.f17808OooO0oo, (this.f17804OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f17808OooO0oo = null;
            }
            return this.f17803OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final void OooO0oO(AuthenticationRule authenticationRule) {
            if (authenticationRule == AuthenticationRule.f17796OooO) {
                return;
            }
            if (!authenticationRule.OooO0OO().isEmpty()) {
                this.f17806OooO0o0 = authenticationRule.f17798OooO0Oo;
                onChanged();
            }
            if (authenticationRule.f17800OooO0o0 != null) {
                OAuthRequirements oAuthRequirementsOooO0O0 = authenticationRule.OooO0O0();
                OAuthRequirements oAuthRequirements = this.f17805OooO0o;
                if (oAuthRequirements != null) {
                    OAuthRequirements.OooO0O0 builder = OAuthRequirements.f18202OooO0o.toBuilder();
                    builder.OooO0o0(oAuthRequirements);
                    builder.OooO0o0(oAuthRequirementsOooO0O0);
                    this.f17805OooO0o = builder.buildPartial();
                } else {
                    this.f17805OooO0o = oAuthRequirementsOooO0O0;
                }
                onChanged();
            }
            boolean z = authenticationRule.f17799OooO0o;
            if (z) {
                this.f17807OooO0oO = z;
                onChanged();
            }
            if (this.f17803OooO == null) {
                if (!authenticationRule.f17801OooO0oO.isEmpty()) {
                    if (this.f17808OooO0oo.isEmpty()) {
                        this.f17808OooO0oo = authenticationRule.f17801OooO0oO;
                        this.f17804OooO0Oo &= -2;
                    } else {
                        if ((this.f17804OooO0Oo & 1) == 0) {
                            this.f17808OooO0oo = new ArrayList(this.f17808OooO0oo);
                            this.f17804OooO0Oo |= 1;
                        }
                        this.f17808OooO0oo.addAll(authenticationRule.f17801OooO0oO);
                    }
                    onChanged();
                }
            } else if (!authenticationRule.f17801OooO0oO.isEmpty()) {
                if (this.f17803OooO.isEmpty()) {
                    this.f17803OooO.dispose();
                    this.f17803OooO = null;
                    this.f17808OooO0oo = authenticationRule.f17801OooO0oO;
                    this.f17804OooO0Oo &= -2;
                    this.f17803OooO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f17803OooO.addAllMessages(authenticationRule.f17801OooO0oO);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AuthenticationRule authenticationRule;
            try {
                try {
                    AuthenticationRule.f17797OooOO0.getClass();
                    OooO0oO(new AuthenticationRule(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    authenticationRule = (AuthenticationRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (authenticationRule != null) {
                            OooO0oO(authenticationRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                authenticationRule = null;
                if (authenticationRule != null) {
                    OooO0oO(authenticationRule);
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
            AuthenticationRule authenticationRuleBuildPartial = buildPartial();
            if (authenticationRuleBuildPartial.isInitialized()) {
                return authenticationRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authenticationRuleBuildPartial);
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
            return AuthenticationRule.f17796OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return OooO0OO.f41162OooO0OO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooO0OO.f41163OooO0Oo.ensureFieldAccessorsInitialized(AuthenticationRule.class, OooO0O0.class);
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
            return AuthenticationRule.f17796OooO;
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
            AuthenticationRule authenticationRuleBuildPartial = buildPartial();
            if (authenticationRuleBuildPartial.isInitialized()) {
                return authenticationRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authenticationRuleBuildPartial);
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
            if (message instanceof AuthenticationRule) {
                OooO0oO((AuthenticationRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f17806OooO0o0 = "";
            this.f17808OooO0oo = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof AuthenticationRule) {
                OooO0oO((AuthenticationRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public AuthenticationRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f17802OooO0oo = (byte) -1;
    }

    public final OAuthRequirements OooO0O0() {
        OAuthRequirements oAuthRequirements = this.f17800OooO0o0;
        return oAuthRequirements == null ? OAuthRequirements.f18202OooO0o : oAuthRequirements;
    }

    public final String OooO0OO() {
        Object obj = this.f17798OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17798OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f17796OooO) {
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
        if (!(obj instanceof AuthenticationRule)) {
            return super.equals(obj);
        }
        AuthenticationRule authenticationRule = (AuthenticationRule) obj;
        if (!OooO0OO().equals(authenticationRule.OooO0OO())) {
            return false;
        }
        OAuthRequirements oAuthRequirements = this.f17800OooO0o0;
        if ((oAuthRequirements != null) != (authenticationRule.f17800OooO0o0 != null)) {
            return false;
        }
        return (!(oAuthRequirements != null) || OooO0O0().equals(authenticationRule.OooO0O0())) && this.f17799OooO0o == authenticationRule.f17799OooO0o && this.f17801OooO0oO.equals(authenticationRule.f17801OooO0oO) && this.unknownFields.equals(authenticationRule.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f17796OooO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AuthenticationRule> getParserForType() {
        return f17797OooOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f17798OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f17798OooO0Oo) + 0 : 0;
        if (this.f17800OooO0o0 != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, OooO0O0());
        }
        boolean z = this.f17799OooO0o;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(5, z);
        }
        for (int i2 = 0; i2 < this.f17801OooO0oO.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(7, this.f17801OooO0oO.get(i2));
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
        int iHashCode = OooO0OO().hashCode() + o0O0O0Oo.OooO00o.OooO00o(OooO0OO.f41162OooO0OO, 779, 37, 1, 53);
        if (this.f17800OooO0o0 != null) {
            iHashCode = OooO0O0().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
        }
        int iHashBoolean = Internal.hashBoolean(this.f17799OooO0o) + o00Ooo.OooO00o(iHashCode, 37, 5, 53);
        if (this.f17801OooO0oO.size() > 0) {
            iHashBoolean = this.f17801OooO0oO.hashCode() + o00Ooo.OooO00o(iHashBoolean, 37, 7, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashBoolean * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OooO0OO.f41163OooO0Oo.ensureFieldAccessorsInitialized(AuthenticationRule.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f17802OooO0oo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f17802OooO0oo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f17796OooO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuthenticationRule();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f17798OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f17798OooO0Oo);
        }
        if (this.f17800OooO0o0 != null) {
            codedOutputStream.writeMessage(2, OooO0O0());
        }
        boolean z = this.f17799OooO0o;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        for (int i = 0; i < this.f17801OooO0oO.size(); i++) {
            codedOutputStream.writeMessage(7, this.f17801OooO0oO.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f17796OooO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f17796OooO.toBuilder();
    }

    private AuthenticationRule() {
        this.f17802OooO0oo = (byte) -1;
        this.f17798OooO0Oo = "";
        this.f17801OooO0oO = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public AuthenticationRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f17798OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                OAuthRequirements oAuthRequirements = this.f17800OooO0o0;
                                OAuthRequirements.OooO0O0 builder = oAuthRequirements != null ? oAuthRequirements.toBuilder() : null;
                                OAuthRequirements oAuthRequirements2 = (OAuthRequirements) codedInputStream.readMessage(OAuthRequirements.f18203OooO0oO, extensionRegistryLite);
                                this.f17800OooO0o0 = oAuthRequirements2;
                                if (builder != null) {
                                    builder.OooO0o0(oAuthRequirements2);
                                    this.f17800OooO0o0 = builder.buildPartial();
                                }
                            } else if (tag == 40) {
                                this.f17799OooO0o = codedInputStream.readBool();
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f17801OooO0oO = new ArrayList();
                                    z2 |= true;
                                }
                                this.f17801OooO0oO.add((AuthRequirement) codedInputStream.readMessage(AuthRequirement.f17780OooO0oo, extensionRegistryLite));
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
                if (z2 & true) {
                    this.f17801OooO0oO = Collections.unmodifiableList(this.f17801OooO0oO);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f17801OooO0oO = Collections.unmodifiableList(this.f17801OooO0oO);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
