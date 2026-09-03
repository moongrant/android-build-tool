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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import o0O0O0Oo.OooOOO;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class ContextRule extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ContextRule f17875OooOO0 = new ContextRule();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f17876OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte f17877OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f17878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public LazyStringList f17879OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LazyStringList f17880OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LazyStringList f17881OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public LazyStringList f17882OooO0oo;

    public static class OooO00o extends AbstractParser<ContextRule> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ContextRule(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public LazyStringList f17883OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17884OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public LazyStringList f17885OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f17886OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public LazyStringList f17887OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public LazyStringList f17888OooO0oo;

        public OooO0O0() {
            this.f17886OooO0o0 = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f17885OooO0o = lazyStringList;
            this.f17887OooO0oO = lazyStringList;
            this.f17888OooO0oo = lazyStringList;
            this.f17883OooO = lazyStringList;
            ContextRule contextRule = ContextRule.f17875OooOO0;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final ContextRule buildPartial() {
            ContextRule contextRule = new ContextRule(this);
            contextRule.f17878OooO0Oo = this.f17886OooO0o0;
            if ((this.f17884OooO0Oo & 1) != 0) {
                this.f17885OooO0o = this.f17885OooO0o.getUnmodifiableView();
                this.f17884OooO0Oo &= -2;
            }
            contextRule.f17880OooO0o0 = this.f17885OooO0o;
            if ((this.f17884OooO0Oo & 2) != 0) {
                this.f17887OooO0oO = this.f17887OooO0oO.getUnmodifiableView();
                this.f17884OooO0Oo &= -3;
            }
            contextRule.f17879OooO0o = this.f17887OooO0oO;
            if ((this.f17884OooO0Oo & 4) != 0) {
                this.f17888OooO0oo = this.f17888OooO0oo.getUnmodifiableView();
                this.f17884OooO0Oo &= -5;
            }
            contextRule.f17881OooO0oO = this.f17888OooO0oo;
            if ((this.f17884OooO0Oo & 8) != 0) {
                this.f17883OooO = this.f17883OooO.getUnmodifiableView();
                this.f17884OooO0Oo &= -9;
            }
            contextRule.f17882OooO0oo = this.f17883OooO;
            onBuilt();
            return contextRule;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f17886OooO0o0 = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f17885OooO0o = lazyStringList;
            int i = this.f17884OooO0Oo & (-2);
            this.f17887OooO0oO = lazyStringList;
            this.f17888OooO0oo = lazyStringList;
            this.f17883OooO = lazyStringList;
            this.f17884OooO0Oo = i & (-3) & (-5) & (-9);
        }

        public final void OooO0o(ContextRule contextRule) {
            if (contextRule == ContextRule.f17875OooOO0) {
                return;
            }
            if (!contextRule.OooO0O0().isEmpty()) {
                this.f17886OooO0o0 = contextRule.f17878OooO0Oo;
                onChanged();
            }
            if (!contextRule.f17880OooO0o0.isEmpty()) {
                if (this.f17885OooO0o.isEmpty()) {
                    this.f17885OooO0o = contextRule.f17880OooO0o0;
                    this.f17884OooO0Oo &= -2;
                } else {
                    if ((this.f17884OooO0Oo & 1) == 0) {
                        this.f17885OooO0o = new LazyStringArrayList(this.f17885OooO0o);
                        this.f17884OooO0Oo |= 1;
                    }
                    this.f17885OooO0o.addAll(contextRule.f17880OooO0o0);
                }
                onChanged();
            }
            if (!contextRule.f17879OooO0o.isEmpty()) {
                if (this.f17887OooO0oO.isEmpty()) {
                    this.f17887OooO0oO = contextRule.f17879OooO0o;
                    this.f17884OooO0Oo &= -3;
                } else {
                    if ((this.f17884OooO0Oo & 2) == 0) {
                        this.f17887OooO0oO = new LazyStringArrayList(this.f17887OooO0oO);
                        this.f17884OooO0Oo |= 2;
                    }
                    this.f17887OooO0oO.addAll(contextRule.f17879OooO0o);
                }
                onChanged();
            }
            if (!contextRule.f17881OooO0oO.isEmpty()) {
                if (this.f17888OooO0oo.isEmpty()) {
                    this.f17888OooO0oo = contextRule.f17881OooO0oO;
                    this.f17884OooO0Oo &= -5;
                } else {
                    if ((this.f17884OooO0Oo & 4) == 0) {
                        this.f17888OooO0oo = new LazyStringArrayList(this.f17888OooO0oo);
                        this.f17884OooO0Oo |= 4;
                    }
                    this.f17888OooO0oo.addAll(contextRule.f17881OooO0oO);
                }
                onChanged();
            }
            if (!contextRule.f17882OooO0oo.isEmpty()) {
                if (this.f17883OooO.isEmpty()) {
                    this.f17883OooO = contextRule.f17882OooO0oo;
                    this.f17884OooO0Oo &= -9;
                } else {
                    if ((this.f17884OooO0Oo & 8) == 0) {
                        this.f17883OooO = new LazyStringArrayList(this.f17883OooO);
                        this.f17884OooO0Oo |= 8;
                    }
                    this.f17883OooO.addAll(contextRule.f17882OooO0oo);
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
            ContextRule contextRule;
            try {
                try {
                    ContextRule.f17876OooOO0O.getClass();
                    OooO0o(new ContextRule(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    contextRule = (ContextRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (contextRule != null) {
                            OooO0o(contextRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                contextRule = null;
                if (contextRule != null) {
                    OooO0o(contextRule);
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
            ContextRule contextRuleBuildPartial = buildPartial();
            if (contextRuleBuildPartial.isInitialized()) {
                return contextRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextRuleBuildPartial);
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
            return ContextRule.f17875OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return OooOOO.f41188OooO0OO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOOO.f41189OooO0Oo.ensureFieldAccessorsInitialized(ContextRule.class, OooO0O0.class);
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
            return ContextRule.f17875OooOO0;
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
            ContextRule contextRuleBuildPartial = buildPartial();
            if (contextRuleBuildPartial.isInitialized()) {
                return contextRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextRuleBuildPartial);
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
            if (message instanceof ContextRule) {
                OooO0o((ContextRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f17886OooO0o0 = "";
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            this.f17885OooO0o = lazyStringList;
            this.f17887OooO0oO = lazyStringList;
            this.f17888OooO0oo = lazyStringList;
            this.f17883OooO = lazyStringList;
            ContextRule contextRule = ContextRule.f17875OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof ContextRule) {
                OooO0o((ContextRule) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public ContextRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f17877OooO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f17878OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17878OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f17875OooOO0) {
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
        if (!(obj instanceof ContextRule)) {
            return super.equals(obj);
        }
        ContextRule contextRule = (ContextRule) obj;
        return OooO0O0().equals(contextRule.OooO0O0()) && this.f17880OooO0o0.equals(contextRule.f17880OooO0o0) && this.f17879OooO0o.equals(contextRule.f17879OooO0o) && this.f17881OooO0oO.equals(contextRule.f17881OooO0oO) && this.f17882OooO0oo.equals(contextRule.f17882OooO0oo) && this.unknownFields.equals(contextRule.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f17875OooOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<ContextRule> getParserForType() {
        return f17876OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f17878OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f17878OooO0Oo) + 0 : 0;
        int iOooO00o = 0;
        for (int i2 = 0; i2 < this.f17880OooO0o0.size(); i2++) {
            iOooO00o = o000O0o.OooO00o(this.f17880OooO0o0, i2, iOooO00o);
        }
        int size = (this.f17880OooO0o0.size() * 1) + iComputeStringSize + iOooO00o;
        int iOooO00o2 = 0;
        for (int i3 = 0; i3 < this.f17879OooO0o.size(); i3++) {
            iOooO00o2 = o000O0o.OooO00o(this.f17879OooO0o, i3, iOooO00o2);
        }
        int size2 = (this.f17879OooO0o.size() * 1) + size + iOooO00o2;
        int iOooO00o3 = 0;
        for (int i4 = 0; i4 < this.f17881OooO0oO.size(); i4++) {
            iOooO00o3 = o000O0o.OooO00o(this.f17881OooO0oO, i4, iOooO00o3);
        }
        int size3 = (this.f17881OooO0oO.size() * 1) + size2 + iOooO00o3;
        int iOooO00o4 = 0;
        for (int i5 = 0; i5 < this.f17882OooO0oo.size(); i5++) {
            iOooO00o4 = o000O0o.OooO00o(this.f17882OooO0oo, i5, iOooO00o4);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + (this.f17882OooO0oo.size() * 1) + size3 + iOooO00o4;
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
        int iHashCode = OooO0O0().hashCode() + o0O0O0Oo.OooO00o.OooO00o(OooOOO.f41188OooO0OO, 779, 37, 1, 53);
        if (this.f17880OooO0o0.size() > 0) {
            iHashCode = this.f17880OooO0o0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
        }
        if (this.f17879OooO0o.size() > 0) {
            iHashCode = this.f17879OooO0o.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 3, 53);
        }
        if (this.f17881OooO0oO.size() > 0) {
            iHashCode = this.f17881OooO0oO.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 4, 53);
        }
        if (this.f17882OooO0oo.size() > 0) {
            iHashCode = this.f17882OooO0oo.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OooOOO.f41189OooO0Oo.ensureFieldAccessorsInitialized(ContextRule.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f17877OooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f17877OooO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f17875OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ContextRule();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f17878OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f17878OooO0Oo);
        }
        int iOooO00o = 0;
        while (iOooO00o < this.f17880OooO0o0.size()) {
            iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f17880OooO0o0, iOooO00o, codedOutputStream, 2, iOooO00o, 1);
        }
        int iOooO00o2 = 0;
        while (iOooO00o2 < this.f17879OooO0o.size()) {
            iOooO00o2 = com.app.base.protobuf.OooO0O0.OooO00o(this.f17879OooO0o, iOooO00o2, codedOutputStream, 3, iOooO00o2, 1);
        }
        int iOooO00o3 = 0;
        while (iOooO00o3 < this.f17881OooO0oO.size()) {
            iOooO00o3 = com.app.base.protobuf.OooO0O0.OooO00o(this.f17881OooO0oO, iOooO00o3, codedOutputStream, 4, iOooO00o3, 1);
        }
        int iOooO00o4 = 0;
        while (iOooO00o4 < this.f17882OooO0oo.size()) {
            iOooO00o4 = com.app.base.protobuf.OooO0O0.OooO00o(this.f17882OooO0oo, iOooO00o4, codedOutputStream, 5, iOooO00o4, 1);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f17875OooOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f17875OooOO0.toBuilder();
    }

    private ContextRule() {
        this.f17877OooO = (byte) -1;
        this.f17878OooO0Oo = "";
        LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
        this.f17880OooO0o0 = lazyStringList;
        this.f17879OooO0o = lazyStringList;
        this.f17881OooO0oO = lazyStringList;
        this.f17882OooO0oo = lazyStringList;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public ContextRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f17878OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if ((i & 1) == 0) {
                                    this.f17880OooO0o0 = new LazyStringArrayList();
                                    i |= 1;
                                }
                                this.f17880OooO0o0.add(stringRequireUtf8);
                            } else if (tag == 26) {
                                String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                if ((i & 2) == 0) {
                                    this.f17879OooO0o = new LazyStringArrayList();
                                    i |= 2;
                                }
                                this.f17879OooO0o.add(stringRequireUtf9);
                            } else if (tag == 34) {
                                String stringRequireUtf10 = codedInputStream.readStringRequireUtf8();
                                if ((i & 4) == 0) {
                                    this.f17881OooO0oO = new LazyStringArrayList();
                                    i |= 4;
                                }
                                this.f17881OooO0oO.add(stringRequireUtf10);
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                String stringRequireUtf11 = codedInputStream.readStringRequireUtf8();
                                if ((i & 8) == 0) {
                                    this.f17882OooO0oo = new LazyStringArrayList();
                                    i |= 8;
                                }
                                this.f17882OooO0oo.add(stringRequireUtf11);
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
                if ((i & 1) != 0) {
                    this.f17880OooO0o0 = this.f17880OooO0o0.getUnmodifiableView();
                }
                if ((i & 2) != 0) {
                    this.f17879OooO0o = this.f17879OooO0o.getUnmodifiableView();
                }
                if ((i & 4) != 0) {
                    this.f17881OooO0oO = this.f17881OooO0oO.getUnmodifiableView();
                }
                if ((i & 8) != 0) {
                    this.f17882OooO0oo = this.f17882OooO0oo.getUnmodifiableView();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f17880OooO0o0 = this.f17880OooO0o0.getUnmodifiableView();
        }
        if ((i & 2) != 0) {
            this.f17879OooO0o = this.f17879OooO0o.getUnmodifiableView();
        }
        if ((i & 4) != 0) {
            this.f17881OooO0oO = this.f17881OooO0oO.getUnmodifiableView();
        }
        if ((i & 8) != 0) {
            this.f17882OooO0oo = this.f17882OooO0oo.getUnmodifiableView();
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
