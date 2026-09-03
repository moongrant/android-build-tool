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
import o000O00.o000000O;
import p320o0O0oo0o.o000O00O;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthProvider extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AuthProvider f18238OooOO0O = new AuthProvider();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f18239OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<JwtLocation> f18240OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18243OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18244OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f18245OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f18246OooOO0;

    public static class OooO00o extends AbstractParser<AuthProvider> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuthProvider(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f18247OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18248OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18249OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18250OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18251OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18252OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public List<JwtLocation> f18253OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public RepeatedFieldBuilderV3<JwtLocation, JwtLocation.OooO0OO, Object> f18254OooOO0O;

        public OooO0O0() {
            this.f18250OooO0o0 = "";
            this.f18249OooO0o = "";
            this.f18251OooO0oO = "";
            this.f18252OooO0oo = "";
            this.f18247OooO = "";
            this.f18253OooOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final AuthProvider buildPartial() {
            AuthProvider authProvider = new AuthProvider(this);
            authProvider.f18241OooO0Oo = this.f18250OooO0o0;
            authProvider.f18243OooO0o0 = this.f18249OooO0o;
            authProvider.f18242OooO0o = this.f18251OooO0oO;
            authProvider.f18244OooO0oO = this.f18252OooO0oo;
            authProvider.f18245OooO0oo = this.f18247OooO;
            RepeatedFieldBuilderV3<JwtLocation, JwtLocation.OooO0OO, Object> repeatedFieldBuilderV3 = this.f18254OooOO0O;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18248OooO0Oo & 1) != 0) {
                    this.f18253OooOO0 = Collections.unmodifiableList(this.f18253OooOO0);
                    this.f18248OooO0Oo &= -2;
                }
                authProvider.f18240OooO = this.f18253OooOO0;
            } else {
                authProvider.f18240OooO = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return authProvider;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18250OooO0o0 = "";
            this.f18249OooO0o = "";
            this.f18251OooO0oO = "";
            this.f18252OooO0oo = "";
            this.f18247OooO = "";
            RepeatedFieldBuilderV3<JwtLocation, JwtLocation.OooO0OO, Object> repeatedFieldBuilderV3 = this.f18254OooOO0O;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f18253OooOO0 = Collections.emptyList();
                this.f18248OooO0Oo &= -2;
            }
        }

        public final RepeatedFieldBuilderV3<JwtLocation, JwtLocation.OooO0OO, Object> OooO0o() {
            if (this.f18254OooOO0O == null) {
                this.f18254OooOO0O = new RepeatedFieldBuilderV3<>(this.f18253OooOO0, (this.f18248OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18253OooOO0 = null;
            }
            return this.f18254OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(AuthProvider authProvider) {
            if (authProvider == AuthProvider.f18238OooOO0O) {
                return;
            }
            if (!authProvider.OooO0Oo().isEmpty()) {
                this.f18250OooO0o0 = authProvider.f18241OooO0Oo;
                onChanged();
            }
            if (!authProvider.OooO0o0().isEmpty()) {
                this.f18249OooO0o = authProvider.f18243OooO0o0;
                onChanged();
            }
            if (!authProvider.OooO0o().isEmpty()) {
                this.f18251OooO0oO = authProvider.f18242OooO0o;
                onChanged();
            }
            if (!authProvider.OooO0O0().isEmpty()) {
                this.f18252OooO0oo = authProvider.f18244OooO0oO;
                onChanged();
            }
            if (!authProvider.OooO0OO().isEmpty()) {
                this.f18247OooO = authProvider.f18245OooO0oo;
                onChanged();
            }
            if (this.f18254OooOO0O == null) {
                if (!authProvider.f18240OooO.isEmpty()) {
                    if (this.f18253OooOO0.isEmpty()) {
                        this.f18253OooOO0 = authProvider.f18240OooO;
                        this.f18248OooO0Oo &= -2;
                    } else {
                        if ((this.f18248OooO0Oo & 1) == 0) {
                            this.f18253OooOO0 = new ArrayList(this.f18253OooOO0);
                            this.f18248OooO0Oo |= 1;
                        }
                        this.f18253OooOO0.addAll(authProvider.f18240OooO);
                    }
                    onChanged();
                }
            } else if (!authProvider.f18240OooO.isEmpty()) {
                if (this.f18254OooOO0O.isEmpty()) {
                    this.f18254OooOO0O.dispose();
                    this.f18254OooOO0O = null;
                    this.f18253OooOO0 = authProvider.f18240OooO;
                    this.f18248OooO0Oo &= -2;
                    this.f18254OooOO0O = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18254OooOO0O.addAllMessages(authProvider.f18240OooO);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AuthProvider authProvider;
            try {
                try {
                    AuthProvider.f18239OooOO0o.getClass();
                    OooO0oO(new AuthProvider(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    authProvider = (AuthProvider) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (authProvider != null) {
                            OooO0oO(authProvider);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                authProvider = null;
                if (authProvider != null) {
                    OooO0oO(authProvider);
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
            AuthProvider authProviderBuildPartial = buildPartial();
            if (authProviderBuildPartial.isInitialized()) {
                return authProviderBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authProviderBuildPartial);
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
            return AuthProvider.f18238OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000O00O.f42717OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O00O.f42718OooO0oo.ensureFieldAccessorsInitialized(AuthProvider.class, OooO0O0.class);
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
            return AuthProvider.f18238OooOO0O;
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
            AuthProvider authProviderBuildPartial = buildPartial();
            if (authProviderBuildPartial.isInitialized()) {
                return authProviderBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) authProviderBuildPartial);
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
            if (message instanceof AuthProvider) {
                OooO0oO((AuthProvider) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof AuthProvider) {
                OooO0oO((AuthProvider) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18250OooO0o0 = "";
            this.f18249OooO0o = "";
            this.f18251OooO0oO = "";
            this.f18252OooO0oo = "";
            this.f18247OooO = "";
            this.f18253OooOO0 = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public AuthProvider(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18246OooOO0 = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18244OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18244OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18245OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18245OooO0oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18241OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18241OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f18242OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18242OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f18243OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18243OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18238OooOO0O) {
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
        if (!(obj instanceof AuthProvider)) {
            return super.equals(obj);
        }
        AuthProvider authProvider = (AuthProvider) obj;
        return OooO0Oo().equals(authProvider.OooO0Oo()) && OooO0o0().equals(authProvider.OooO0o0()) && OooO0o().equals(authProvider.OooO0o()) && OooO0O0().equals(authProvider.OooO0O0()) && OooO0OO().equals(authProvider.OooO0OO()) && this.f18240OooO.equals(authProvider.f18240OooO) && this.unknownFields.equals(authProvider.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18238OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<AuthProvider> getParserForType() {
        return f18239OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18241OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18241OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18243OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18243OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18242OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18242OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18244OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f18244OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18245OooO0oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18245OooO0oo);
        }
        for (int i2 = 0; i2 < this.f18240OooO.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.f18240OooO.get(i2));
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
        int iHashCode = OooO0OO().hashCode() + ((((OooO0O0().hashCode() + ((((OooO0o().hashCode() + ((((OooO0o0().hashCode() + ((((OooO0Oo().hashCode() + o000Oo0.OooO00o(o000O00O.f42717OooO0oO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (this.f18240OooO.size() > 0) {
            iHashCode = this.f18240OooO.hashCode() + o000000O.OooO00o(iHashCode, 37, 6, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000O00O.f42718OooO0oo.ensureFieldAccessorsInitialized(AuthProvider.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18246OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18246OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18238OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuthProvider();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18241OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18241OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18243OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18243OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18242OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18242OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18244OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f18244OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18245OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18245OooO0oo);
        }
        for (int i = 0; i < this.f18240OooO.size(); i++) {
            codedOutputStream.writeMessage(6, this.f18240OooO.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18238OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18238OooOO0O.toBuilder();
    }

    private AuthProvider() {
        this.f18246OooOO0 = (byte) -1;
        this.f18241OooO0Oo = "";
        this.f18243OooO0o0 = "";
        this.f18242OooO0o = "";
        this.f18244OooO0oO = "";
        this.f18245OooO0oo = "";
        this.f18240OooO = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public AuthProvider(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18241OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f18243OooO0o0 = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                this.f18242OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 34) {
                                this.f18244OooO0oO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 42) {
                                this.f18245OooO0oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f18240OooO = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18240OooO.add((JwtLocation) codedInputStream.readMessage(JwtLocation.f18525OooO, extensionRegistryLite));
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
                    this.f18240OooO = Collections.unmodifiableList(this.f18240OooO);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18240OooO = Collections.unmodifiableList(this.f18240OooO);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
