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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import o0O0O0Oo.OooO0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendRule extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final BackendRule f17816OooOOO = new BackendRule();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f17817OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public double f17818OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f17820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f17821OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f17822OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public double f17823OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public double f17824OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17825OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile Object f17826OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte f17827OooOOO0;

    public enum AuthenticationCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);

        private final int value;

        AuthenticationCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public static class OooO00o extends AbstractParser<BackendRule> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BackendRule(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f17828OooO00o;

        static {
            int[] iArr = new int[AuthenticationCase.values().length];
            f17828OooO00o = iArr;
            try {
                iArr[AuthenticationCase.JWT_AUDIENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17828OooO00o[AuthenticationCase.DISABLE_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17828OooO00o[AuthenticationCase.AUTHENTICATION_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double f17829OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17830OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f17831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f17832OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f17833OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double f17834OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public double f17835OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f17836OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f17837OooOO0o;

        public OooO0OO() {
            this.f17830OooO0Oo = 0;
            this.f17831OooO0o = "";
            this.f17833OooO0oO = "";
            this.f17836OooOO0O = 0;
            this.f17837OooOO0o = "";
            BackendRule backendRule = BackendRule.f17816OooOOO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final BackendRule buildPartial() {
            BackendRule backendRule = new BackendRule(this);
            backendRule.f17820OooO0o = this.f17831OooO0o;
            backendRule.f17822OooO0oO = this.f17833OooO0oO;
            backendRule.f17823OooO0oo = this.f17834OooO0oo;
            backendRule.f17818OooO = this.f17829OooO;
            backendRule.f17824OooOO0 = this.f17835OooOO0;
            backendRule.f17825OooOO0O = this.f17836OooOO0O;
            int i = this.f17830OooO0Oo;
            if (i == 7) {
                backendRule.f17821OooO0o0 = this.f17832OooO0o0;
            }
            if (i == 8) {
                backendRule.f17821OooO0o0 = this.f17832OooO0o0;
            }
            backendRule.f17826OooOO0o = this.f17837OooOO0o;
            backendRule.f17819OooO0Oo = this.f17830OooO0Oo;
            onBuilt();
            return backendRule;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f17831OooO0o = "";
            this.f17833OooO0oO = "";
            this.f17834OooO0oo = 0.0d;
            this.f17829OooO = 0.0d;
            this.f17835OooOO0 = 0.0d;
            this.f17836OooOO0O = 0;
            this.f17837OooOO0o = "";
            this.f17830OooO0Oo = 0;
            this.f17832OooO0o0 = null;
        }

        public final void OooO0o(BackendRule backendRule) {
            if (backendRule == BackendRule.f17816OooOOO) {
                return;
            }
            if (!backendRule.OooO0o().isEmpty()) {
                this.f17831OooO0o = backendRule.f17820OooO0o;
                onChanged();
            }
            if (!backendRule.getAddress().isEmpty()) {
                this.f17833OooO0oO = backendRule.f17822OooO0oO;
                onChanged();
            }
            double d = backendRule.f17823OooO0oo;
            if (d != 0.0d) {
                this.f17834OooO0oo = d;
                onChanged();
            }
            double d2 = backendRule.f17818OooO;
            if (d2 != 0.0d) {
                this.f17829OooO = d2;
                onChanged();
            }
            double d3 = backendRule.f17824OooOO0;
            if (d3 != 0.0d) {
                this.f17835OooOO0 = d3;
                onChanged();
            }
            int i = backendRule.f17825OooOO0O;
            if (i != 0) {
                this.f17836OooOO0O = i;
                onChanged();
            }
            if (!backendRule.OooO0o0().isEmpty()) {
                this.f17837OooOO0o = backendRule.f17826OooOO0o;
                onChanged();
            }
            int i2 = OooO0O0.f17828OooO00o[backendRule.OooO0O0().ordinal()];
            if (i2 == 1) {
                this.f17830OooO0Oo = 7;
                this.f17832OooO0o0 = backendRule.f17821OooO0o0;
                onChanged();
            } else if (i2 == 2) {
                boolean zOooO0OO = backendRule.OooO0OO();
                this.f17830OooO0Oo = 8;
                this.f17832OooO0o0 = Boolean.valueOf(zOooO0OO);
                onChanged();
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO mo4023clone() {
            return (OooO0OO) super.mo4023clone();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            BackendRule backendRule;
            try {
                try {
                    BackendRule.f17817OooOOOO.getClass();
                    OooO0o(new BackendRule(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    backendRule = (BackendRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (backendRule != null) {
                            OooO0o(backendRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                backendRule = null;
                if (backendRule != null) {
                    OooO0o(backendRule);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0OO) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            BackendRule backendRuleBuildPartial = buildPartial();
            if (backendRuleBuildPartial.isInitialized()) {
                return backendRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) backendRuleBuildPartial);
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
            return BackendRule.f17816OooOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return OooO0o.f41174OooO0OO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooO0o.f41175OooO0Oo.ensureFieldAccessorsInitialized(BackendRule.class, OooO0OO.class);
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
            return BackendRule.f17816OooOOO;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oO(codedInputStream, extensionRegistryLite);
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
            OooO0oO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            BackendRule backendRuleBuildPartial = buildPartial();
            if (backendRuleBuildPartial.isInitialized()) {
                return backendRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) backendRuleBuildPartial);
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
            if (message instanceof BackendRule) {
                OooO0o((BackendRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f17830OooO0Oo = 0;
            this.f17831OooO0o = "";
            this.f17833OooO0oO = "";
            this.f17836OooOO0O = 0;
            this.f17837OooOO0o = "";
            BackendRule backendRule = BackendRule.f17816OooOOO;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof BackendRule) {
                OooO0o((BackendRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public enum PathTranslation implements ProtocolMessageEnum {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);

        public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
        public static final int CONSTANT_ADDRESS_VALUE = 1;
        public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<PathTranslation> internalValueMap = new OooO00o();
        private static final PathTranslation[] VALUES = values();

        public static class OooO00o implements Internal.EnumLiteMap<PathTranslation> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                if (i == 0) {
                    return PathTranslation.PATH_TRANSLATION_UNSPECIFIED;
                }
                if (i == 1) {
                    return PathTranslation.CONSTANT_ADDRESS;
                }
                if (i == 2) {
                    return PathTranslation.APPEND_PATH_TO_ADDRESS;
                }
                PathTranslation pathTranslation = PathTranslation.PATH_TRANSLATION_UNSPECIFIED;
                return null;
            }
        }

        PathTranslation(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            BackendRule backendRule = BackendRule.f17816OooOOO;
            return OooO0o.f41174OooO0OO.getEnumTypes().get(0);
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            BackendRule backendRule = BackendRule.f17816OooOOO;
            return OooO0o.f41174OooO0OO.getEnumTypes().get(0).getValues().get(ordinal());
        }
    }

    public BackendRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f17819OooO0Oo = 0;
        this.f17827OooOOO0 = (byte) -1;
    }

    public final AuthenticationCase OooO0O0() {
        int i = this.f17819OooO0Oo;
        if (i == 0) {
            return AuthenticationCase.AUTHENTICATION_NOT_SET;
        }
        if (i == 7) {
            return AuthenticationCase.JWT_AUDIENCE;
        }
        if (i != 8) {
            return null;
        }
        return AuthenticationCase.DISABLE_AUTH;
    }

    public final boolean OooO0OO() {
        if (this.f17819OooO0Oo == 8) {
            return ((Boolean) this.f17821OooO0o0).booleanValue();
        }
        return false;
    }

    public final String OooO0Oo() {
        Object obj = this.f17819OooO0Oo == 7 ? this.f17821OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f17819OooO0Oo == 7) {
            this.f17821OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f17820OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17820OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f17826OooOO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17826OooOO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f17816OooOOO) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRule)) {
            return super.equals(obj);
        }
        BackendRule backendRule = (BackendRule) obj;
        if (!OooO0o().equals(backendRule.OooO0o()) || !getAddress().equals(backendRule.getAddress()) || Double.doubleToLongBits(this.f17823OooO0oo) != Double.doubleToLongBits(backendRule.f17823OooO0oo) || Double.doubleToLongBits(this.f17818OooO) != Double.doubleToLongBits(backendRule.f17818OooO) || Double.doubleToLongBits(this.f17824OooOO0) != Double.doubleToLongBits(backendRule.f17824OooOO0) || this.f17825OooOO0O != backendRule.f17825OooOO0O || !OooO0o0().equals(backendRule.OooO0o0()) || !OooO0O0().equals(backendRule.OooO0O0())) {
            return false;
        }
        int i = this.f17819OooO0Oo;
        if (i != 7) {
            if (i == 8 && OooO0OO() != backendRule.OooO0OO()) {
                return false;
            }
        } else if (!OooO0Oo().equals(backendRule.OooO0Oo())) {
            return false;
        }
        return this.unknownFields.equals(backendRule.unknownFields);
    }

    public final String getAddress() {
        Object obj = this.f17822OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17822OooO0oO = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f17816OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<BackendRule> getParserForType() {
        return f17817OooOOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f17820OooO0o) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f17820OooO0o);
        if (!GeneratedMessageV3.isStringEmpty(this.f17822OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f17822OooO0oO);
        }
        if (Double.doubleToRawLongBits(this.f17823OooO0oo) != 0) {
            iComputeStringSize += CodedOutputStream.computeDoubleSize(3, this.f17823OooO0oo);
        }
        if (Double.doubleToRawLongBits(this.f17818OooO) != 0) {
            iComputeStringSize += CodedOutputStream.computeDoubleSize(4, this.f17818OooO);
        }
        if (Double.doubleToRawLongBits(this.f17824OooOO0) != 0) {
            iComputeStringSize += CodedOutputStream.computeDoubleSize(5, this.f17824OooOO0);
        }
        if (this.f17825OooOO0O != PathTranslation.PATH_TRANSLATION_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(6, this.f17825OooOO0O);
        }
        if (this.f17819OooO0Oo == 7) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f17821OooO0o0);
        }
        if (this.f17819OooO0Oo == 8) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(8, ((Boolean) this.f17821OooO0o0).booleanValue());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17826OooOO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.f17826OooOO0o);
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
        int iOooO00o;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode2 = OooO0o0().hashCode() + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o((((Internal.hashLong(Double.doubleToLongBits(this.f17824OooOO0)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17818OooO)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17823OooO0oo)) + ((((getAddress().hashCode() + ((((OooO0o().hashCode() + o0O0O0Oo.OooO00o.OooO00o(OooO0o.f41174OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53, this.f17825OooOO0O, 37, 9, 53);
        int i2 = this.f17819OooO0Oo;
        if (i2 != 7) {
            if (i2 == 8) {
                iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 8, 53);
                iHashCode = Internal.hashBoolean(OooO0OO());
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 7, 53);
        iHashCode = OooO0Oo().hashCode();
        iHashCode2 = iHashCode + iOooO00o;
        int iHashCode4 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OooO0o.f41175OooO0Oo.ensureFieldAccessorsInitialized(BackendRule.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f17827OooOOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f17827OooOOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f17816OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new BackendRule();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f17820OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f17820OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17822OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f17822OooO0oO);
        }
        if (Double.doubleToRawLongBits(this.f17823OooO0oo) != 0) {
            codedOutputStream.writeDouble(3, this.f17823OooO0oo);
        }
        if (Double.doubleToRawLongBits(this.f17818OooO) != 0) {
            codedOutputStream.writeDouble(4, this.f17818OooO);
        }
        if (Double.doubleToRawLongBits(this.f17824OooOO0) != 0) {
            codedOutputStream.writeDouble(5, this.f17824OooOO0);
        }
        if (this.f17825OooOO0O != PathTranslation.PATH_TRANSLATION_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(6, this.f17825OooOO0O);
        }
        if (this.f17819OooO0Oo == 7) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f17821OooO0o0);
        }
        if (this.f17819OooO0Oo == 8) {
            codedOutputStream.writeBool(8, ((Boolean) this.f17821OooO0o0).booleanValue());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17826OooOO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.f17826OooOO0o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f17816OooOOO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f17816OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private BackendRule() {
        this.f17819OooO0Oo = 0;
        this.f17827OooOOO0 = (byte) -1;
        this.f17820OooO0o = "";
        this.f17822OooO0oO = "";
        this.f17825OooOO0O = 0;
        this.f17826OooOO0o = "";
    }

    public BackendRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f17820OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f17822OooO0oO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 25) {
                                this.f17823OooO0oo = codedInputStream.readDouble();
                            } else if (tag == 33) {
                                this.f17818OooO = codedInputStream.readDouble();
                            } else if (tag == 41) {
                                this.f17824OooOO0 = codedInputStream.readDouble();
                            } else if (tag == 48) {
                                this.f17825OooOO0O = codedInputStream.readEnum();
                            } else if (tag == 58) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                this.f17819OooO0Oo = 7;
                                this.f17821OooO0o0 = stringRequireUtf8;
                            } else if (tag == 64) {
                                this.f17821OooO0o0 = Boolean.valueOf(codedInputStream.readBool());
                                this.f17819OooO0Oo = 8;
                            } else if (tag != 74) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f17826OooOO0o = codedInputStream.readStringRequireUtf8();
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
