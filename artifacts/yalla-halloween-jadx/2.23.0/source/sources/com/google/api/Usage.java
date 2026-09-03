package com.google.api;

import com.app.base.protobuf.OooO0OO;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O00.o000000O;
import p320o0O0oo0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class Usage extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public LazyStringList f18880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18881OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<UsageRule> f18882OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte f18883OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Usage f18879OooO0oo = new Usage();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f18878OooO = new OooO00o();

    public static class OooO00o extends AbstractParser<Usage> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Usage(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18884OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<UsageRule> f18885OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LazyStringList f18886OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<UsageRule, UsageRule.OooO0O0, Object> f18887OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18888OooO0oo;

        public OooO0O0() {
            this.f18886OooO0o0 = LazyStringArrayList.EMPTY;
            this.f18885OooO0o = Collections.emptyList();
            this.f18888OooO0oo = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Usage buildPartial() {
            Usage usage = new Usage(this);
            if ((this.f18884OooO0Oo & 1) != 0) {
                this.f18886OooO0o0 = this.f18886OooO0o0.getUnmodifiableView();
                this.f18884OooO0Oo &= -2;
            }
            usage.f18880OooO0Oo = this.f18886OooO0o0;
            RepeatedFieldBuilderV3<UsageRule, UsageRule.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18887OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18884OooO0Oo & 2) != 0) {
                    this.f18885OooO0o = Collections.unmodifiableList(this.f18885OooO0o);
                    this.f18884OooO0Oo &= -3;
                }
                usage.f18882OooO0o0 = this.f18885OooO0o;
            } else {
                usage.f18882OooO0o0 = repeatedFieldBuilderV3.build();
            }
            usage.f18881OooO0o = this.f18888OooO0oo;
            onBuilt();
            return usage;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18886OooO0o0 = LazyStringArrayList.EMPTY;
            this.f18884OooO0Oo &= -2;
            RepeatedFieldBuilderV3<UsageRule, UsageRule.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18887OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                this.f18885OooO0o = Collections.emptyList();
                this.f18884OooO0Oo &= -3;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18888OooO0oo = "";
        }

        public final RepeatedFieldBuilderV3<UsageRule, UsageRule.OooO0O0, Object> OooO0o() {
            if (this.f18887OooO0oO == null) {
                this.f18887OooO0oO = new RepeatedFieldBuilderV3<>(this.f18885OooO0o, (this.f18884OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18885OooO0o = null;
            }
            return this.f18887OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(Usage usage) {
            if (usage == Usage.f18879OooO0oo) {
                return;
            }
            if (!usage.f18880OooO0Oo.isEmpty()) {
                if (this.f18886OooO0o0.isEmpty()) {
                    this.f18886OooO0o0 = usage.f18880OooO0Oo;
                    this.f18884OooO0Oo &= -2;
                } else {
                    if ((this.f18884OooO0Oo & 1) == 0) {
                        this.f18886OooO0o0 = new LazyStringArrayList(this.f18886OooO0o0);
                        this.f18884OooO0Oo |= 1;
                    }
                    this.f18886OooO0o0.addAll(usage.f18880OooO0Oo);
                }
                onChanged();
            }
            if (this.f18887OooO0oO == null) {
                if (!usage.f18882OooO0o0.isEmpty()) {
                    if (this.f18885OooO0o.isEmpty()) {
                        this.f18885OooO0o = usage.f18882OooO0o0;
                        this.f18884OooO0Oo &= -3;
                    } else {
                        if ((this.f18884OooO0Oo & 2) == 0) {
                            this.f18885OooO0o = new ArrayList(this.f18885OooO0o);
                            this.f18884OooO0Oo |= 2;
                        }
                        this.f18885OooO0o.addAll(usage.f18882OooO0o0);
                    }
                    onChanged();
                }
            } else if (!usage.f18882OooO0o0.isEmpty()) {
                if (this.f18887OooO0oO.isEmpty()) {
                    this.f18887OooO0oO.dispose();
                    this.f18887OooO0oO = null;
                    this.f18885OooO0o = usage.f18882OooO0o0;
                    this.f18884OooO0Oo &= -3;
                    this.f18887OooO0oO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18887OooO0oO.addAllMessages(usage.f18882OooO0o0);
                }
            }
            if (!usage.OooO0O0().isEmpty()) {
                this.f18888OooO0oo = usage.f18881OooO0o;
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Usage usage;
            try {
                try {
                    Usage.f18878OooO.getClass();
                    OooO0oO(new Usage(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    usage = (Usage) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (usage != null) {
                            OooO0oO(usage);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                usage = null;
                if (usage != null) {
                    OooO0oO(usage);
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
            Usage usageBuildPartial = buildPartial();
            if (usageBuildPartial.isInitialized()) {
                return usageBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) usageBuildPartial);
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
            return Usage.f18879OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return oo0oOO0.f42834OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0oOO0.f42835OooO0O0.ensureFieldAccessorsInitialized(Usage.class, OooO0O0.class);
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
            return Usage.f18879OooO0oo;
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
            Usage usageBuildPartial = buildPartial();
            if (usageBuildPartial.isInitialized()) {
                return usageBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) usageBuildPartial);
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
            if (message instanceof Usage) {
                OooO0oO((Usage) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18886OooO0o0 = LazyStringArrayList.EMPTY;
            this.f18885OooO0o = Collections.emptyList();
            this.f18888OooO0oo = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Usage) {
                OooO0oO((Usage) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public Usage(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18883OooO0oO = (byte) -1;
    }

    public static OooO00o OooO0OO() {
        return f18878OooO;
    }

    public final String OooO0O0() {
        Object obj = this.f18881OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18881OooO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18879OooO0oo) {
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
        if (!(obj instanceof Usage)) {
            return super.equals(obj);
        }
        Usage usage = (Usage) obj;
        return this.f18880OooO0Oo.equals(usage.f18880OooO0Oo) && this.f18882OooO0o0.equals(usage.f18882OooO0o0) && OooO0O0().equals(usage.OooO0O0()) && this.unknownFields.equals(usage.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18879OooO0oo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Usage> getParserForType() {
        return f18878OooO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < this.f18880OooO0Oo.size(); i2++) {
            iOooO0Oo = com.app.base.protobuf.OooO0O0.OooO0Oo(this.f18880OooO0Oo, i2, iOooO0Oo);
        }
        int size = (this.f18880OooO0Oo.size() * 1) + iOooO0Oo + 0;
        for (int i3 = 0; i3 < this.f18882OooO0o0.size(); i3++) {
            size += CodedOutputStream.computeMessageSize(6, this.f18882OooO0o0.get(i3));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18881OooO0o)) {
            size += GeneratedMessageV3.computeStringSize(7, this.f18881OooO0o);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size;
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
        int iHashCode = oo0oOO0.f42834OooO00o.hashCode() + 779;
        if (this.f18880OooO0Oo.size() > 0) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 1, 53) + this.f18880OooO0Oo.hashCode();
        }
        if (this.f18882OooO0o0.size() > 0) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 6, 53) + this.f18882OooO0o0.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0O0().hashCode() + o000000O.OooO00o(iHashCode, 37, 7, 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo0oOO0.f42835OooO0O0.ensureFieldAccessorsInitialized(Usage.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18883OooO0oO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18883OooO0oO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18879OooO0oo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Usage();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int iOooO00o = 0;
        while (iOooO00o < this.f18880OooO0Oo.size()) {
            iOooO00o = OooO0OO.OooO00o(this.f18880OooO0Oo, iOooO00o, codedOutputStream, 1, iOooO00o, 1);
        }
        for (int i = 0; i < this.f18882OooO0o0.size(); i++) {
            codedOutputStream.writeMessage(6, this.f18882OooO0o0.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18881OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f18881OooO0o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18879OooO0oo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18879OooO0oo.toBuilder();
    }

    private Usage() {
        this.f18883OooO0oO = (byte) -1;
        this.f18880OooO0Oo = LazyStringArrayList.EMPTY;
        this.f18882OooO0o0 = Collections.emptyList();
        this.f18881OooO0o = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public Usage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if ((i & 1) == 0) {
                                        this.f18880OooO0Oo = new LazyStringArrayList();
                                        i |= 1;
                                    }
                                    this.f18880OooO0Oo.add(stringRequireUtf8);
                                } else if (tag == 50) {
                                    if ((i & 2) == 0) {
                                        this.f18882OooO0o0 = new ArrayList();
                                        i |= 2;
                                    }
                                    this.f18882OooO0o0.add((UsageRule) codedInputStream.readMessage(UsageRule.f18889OooO, extensionRegistryLite));
                                } else if (tag != 58) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f18881OooO0o = codedInputStream.readStringRequireUtf8();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (UninitializedMessageException e3) {
                    throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 1) != 0) {
                    this.f18880OooO0Oo = this.f18880OooO0Oo.getUnmodifiableView();
                }
                if ((i & 2) != 0) {
                    this.f18882OooO0o0 = Collections.unmodifiableList(this.f18882OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f18880OooO0Oo = this.f18880OooO0Oo.getUnmodifiableView();
        }
        if ((i & 2) != 0) {
            this.f18882OooO0o0 = Collections.unmodifiableList(this.f18882OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
