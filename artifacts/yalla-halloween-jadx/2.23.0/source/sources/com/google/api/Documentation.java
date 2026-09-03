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
import p320o0O0oo0o.o000Oo0;
import p320o0O0oo0o.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class Documentation extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Documentation f18448OooOO0O = new Documentation();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f18449OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f18450OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<DocumentationRule> f18452OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Page> f18453OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f18455OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f18456OooOO0;

    public static class OooO00o extends AbstractParser<Documentation> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Documentation(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> f18457OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18458OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<Page> f18459OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18460OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> f18461OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public List<DocumentationRule> f18462OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f18463OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f18464OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f18465OooOO0o;

        public OooO0O0() {
            this.f18460OooO0o0 = "";
            this.f18459OooO0o = Collections.emptyList();
            this.f18462OooO0oo = Collections.emptyList();
            this.f18463OooOO0 = "";
            this.f18464OooOO0O = "";
            this.f18465OooOO0o = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooO0oO();
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Documentation documentation;
            try {
                try {
                    Documentation.f18449OooOO0o.getClass();
                    OooO0oo(new Documentation(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    documentation = (Documentation) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (documentation != null) {
                            OooO0oo(documentation);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                documentation = null;
                if (documentation != null) {
                    OooO0oo(documentation);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Documentation buildPartial() {
            Documentation documentation = new Documentation(this);
            documentation.f18451OooO0Oo = this.f18460OooO0o0;
            RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18461OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18458OooO0Oo & 1) != 0) {
                    this.f18459OooO0o = Collections.unmodifiableList(this.f18459OooO0o);
                    this.f18458OooO0Oo &= -2;
                }
                documentation.f18453OooO0o0 = this.f18459OooO0o;
            } else {
                documentation.f18453OooO0o0 = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18457OooO;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f18458OooO0Oo & 2) != 0) {
                    this.f18462OooO0oo = Collections.unmodifiableList(this.f18462OooO0oo);
                    this.f18458OooO0Oo &= -3;
                }
                documentation.f18452OooO0o = this.f18462OooO0oo;
            } else {
                documentation.f18452OooO0o = repeatedFieldBuilderV4.build();
            }
            documentation.f18454OooO0oO = this.f18463OooOO0;
            documentation.f18455OooO0oo = this.f18464OooOO0O;
            documentation.f18450OooO = this.f18465OooOO0o;
            onBuilt();
            return documentation;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18460OooO0o0 = "";
            RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18461OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                this.f18459OooO0o = Collections.emptyList();
                this.f18458OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18457OooO;
            if (repeatedFieldBuilderV4 == null) {
                this.f18462OooO0oo = Collections.emptyList();
                this.f18458OooO0Oo &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            this.f18463OooOO0 = "";
            this.f18464OooOO0O = "";
            this.f18465OooOO0o = "";
        }

        public final RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> OooO0o() {
            if (this.f18461OooO0oO == null) {
                this.f18461OooO0oO = new RepeatedFieldBuilderV3<>(this.f18459OooO0o, (this.f18458OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18459OooO0o = null;
            }
            return this.f18461OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> OooO0oO() {
            if (this.f18457OooO == null) {
                this.f18457OooO = new RepeatedFieldBuilderV3<>(this.f18462OooO0oo, (this.f18458OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18462OooO0oo = null;
            }
            return this.f18457OooO;
        }

        public final void OooO0oo(Documentation documentation) {
            if (documentation == Documentation.f18448OooOO0O) {
                return;
            }
            if (!documentation.OooO0o().isEmpty()) {
                this.f18460OooO0o0 = documentation.f18451OooO0Oo;
                onChanged();
            }
            if (this.f18461OooO0oO == null) {
                if (!documentation.f18453OooO0o0.isEmpty()) {
                    if (this.f18459OooO0o.isEmpty()) {
                        this.f18459OooO0o = documentation.f18453OooO0o0;
                        this.f18458OooO0Oo &= -2;
                    } else {
                        if ((this.f18458OooO0Oo & 1) == 0) {
                            this.f18459OooO0o = new ArrayList(this.f18459OooO0o);
                            this.f18458OooO0Oo |= 1;
                        }
                        this.f18459OooO0o.addAll(documentation.f18453OooO0o0);
                    }
                    onChanged();
                }
            } else if (!documentation.f18453OooO0o0.isEmpty()) {
                if (this.f18461OooO0oO.isEmpty()) {
                    this.f18461OooO0oO.dispose();
                    this.f18461OooO0oO = null;
                    this.f18459OooO0o = documentation.f18453OooO0o0;
                    this.f18458OooO0Oo &= -2;
                    this.f18461OooO0oO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18461OooO0oO.addAllMessages(documentation.f18453OooO0o0);
                }
            }
            if (this.f18457OooO == null) {
                if (!documentation.f18452OooO0o.isEmpty()) {
                    if (this.f18462OooO0oo.isEmpty()) {
                        this.f18462OooO0oo = documentation.f18452OooO0o;
                        this.f18458OooO0Oo &= -3;
                    } else {
                        if ((this.f18458OooO0Oo & 2) == 0) {
                            this.f18462OooO0oo = new ArrayList(this.f18462OooO0oo);
                            this.f18458OooO0Oo |= 2;
                        }
                        this.f18462OooO0oo.addAll(documentation.f18452OooO0o);
                    }
                    onChanged();
                }
            } else if (!documentation.f18452OooO0o.isEmpty()) {
                if (this.f18457OooO.isEmpty()) {
                    this.f18457OooO.dispose();
                    this.f18457OooO = null;
                    this.f18462OooO0oo = documentation.f18452OooO0o;
                    this.f18458OooO0Oo &= -3;
                    this.f18457OooO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f18457OooO.addAllMessages(documentation.f18452OooO0o);
                }
            }
            if (!documentation.OooO0OO().isEmpty()) {
                this.f18463OooOO0 = documentation.f18454OooO0oO;
                onChanged();
            }
            if (!documentation.OooO0o0().isEmpty()) {
                this.f18464OooOO0O = documentation.f18455OooO0oo;
                onChanged();
            }
            if (!documentation.OooO0Oo().isEmpty()) {
                this.f18465OooOO0o = documentation.f18450OooO;
                onChanged();
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            Documentation documentationBuildPartial = buildPartial();
            if (documentationBuildPartial.isInitialized()) {
                return documentationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) documentationBuildPartial);
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
            return Documentation.f18448OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00O0000.f42766OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00O0000.f42767OooO0O0.ensureFieldAccessorsInitialized(Documentation.class, OooO0O0.class);
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
            return Documentation.f18448OooOO0O;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO(codedInputStream, extensionRegistryLite);
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
            OooO(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            Documentation documentationBuildPartial = buildPartial();
            if (documentationBuildPartial.isInitialized()) {
                return documentationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) documentationBuildPartial);
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
            if (message instanceof Documentation) {
                OooO0oo((Documentation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Documentation) {
                OooO0oo((Documentation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18460OooO0o0 = "";
            this.f18459OooO0o = Collections.emptyList();
            this.f18462OooO0oo = Collections.emptyList();
            this.f18463OooOO0 = "";
            this.f18464OooOO0O = "";
            this.f18465OooOO0o = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooO0oO();
            }
        }
    }

    public Documentation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18456OooOO0 = (byte) -1;
    }

    public static OooO00o OooO0oO() {
        return f18449OooOO0o;
    }

    public final String OooO0OO() {
        Object obj = this.f18454OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18454OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18450OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18450OooO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f18451OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18451OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f18455OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18455OooO0oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18448OooOO0O) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oo(this);
        return oooO0O0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Documentation)) {
            return super.equals(obj);
        }
        Documentation documentation = (Documentation) obj;
        return OooO0o().equals(documentation.OooO0o()) && this.f18453OooO0o0.equals(documentation.f18453OooO0o0) && this.f18452OooO0o.equals(documentation.f18452OooO0o) && OooO0OO().equals(documentation.OooO0OO()) && OooO0o0().equals(documentation.OooO0o0()) && OooO0Oo().equals(documentation.OooO0Oo()) && this.unknownFields.equals(documentation.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18448OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Documentation> getParserForType() {
        return f18449OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18451OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18451OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18450OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18450OooO);
        }
        for (int i2 = 0; i2 < this.f18452OooO0o.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.f18452OooO0o.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18454OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f18454OooO0oO);
        }
        for (int i3 = 0; i3 < this.f18453OooO0o0.size(); i3++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.f18453OooO0o0.get(i3));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18455OooO0oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f18455OooO0oo);
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
        int iHashCode = OooO0o().hashCode() + o000Oo0.OooO00o(o00O0000.f42766OooO00o, 779, 37, 1, 53);
        if (this.f18453OooO0o0.size() > 0) {
            iHashCode = this.f18453OooO0o0.hashCode() + o000000O.OooO00o(iHashCode, 37, 5, 53);
        }
        if (this.f18452OooO0o.size() > 0) {
            iHashCode = this.f18452OooO0o.hashCode() + o000000O.OooO00o(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0Oo().hashCode() + ((((OooO0o0().hashCode() + ((((OooO0OO().hashCode() + o000000O.OooO00o(iHashCode, 37, 4, 53)) * 37) + 6) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00O0000.f42767OooO0O0.ensureFieldAccessorsInitialized(Documentation.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18456OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18456OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18448OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Documentation();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18451OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18451OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18450OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18450OooO);
        }
        for (int i = 0; i < this.f18452OooO0o.size(); i++) {
            codedOutputStream.writeMessage(3, this.f18452OooO0o.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18454OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f18454OooO0oO);
        }
        for (int i2 = 0; i2 < this.f18453OooO0o0.size(); i2++) {
            codedOutputStream.writeMessage(5, this.f18453OooO0o0.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18455OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f18455OooO0oo);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18448OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18448OooOO0O.toBuilder();
    }

    private Documentation() {
        this.f18456OooOO0 = (byte) -1;
        this.f18451OooO0Oo = "";
        this.f18453OooO0o0 = Collections.emptyList();
        this.f18452OooO0o = Collections.emptyList();
        this.f18454OooO0oO = "";
        this.f18455OooO0oo = "";
        this.f18450OooO = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public Documentation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18451OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f18450OooO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                if ((i & 2) == 0) {
                                    this.f18452OooO0o = new ArrayList();
                                    i |= 2;
                                }
                                this.f18452OooO0o.add((DocumentationRule) codedInputStream.readMessage(DocumentationRule.f18466OooO, extensionRegistryLite));
                            } else if (tag == 34) {
                                this.f18454OooO0oO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 42) {
                                if ((i & 1) == 0) {
                                    this.f18453OooO0o0 = new ArrayList();
                                    i |= 1;
                                }
                                this.f18453OooO0o0.add((Page) codedInputStream.readMessage(Page.f18683OooO, extensionRegistryLite));
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f18455OooO0oo = codedInputStream.readStringRequireUtf8();
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
                if ((i & 2) != 0) {
                    this.f18452OooO0o = Collections.unmodifiableList(this.f18452OooO0o);
                }
                if ((i & 1) != 0) {
                    this.f18453OooO0o0 = Collections.unmodifiableList(this.f18453OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 2) != 0) {
            this.f18452OooO0o = Collections.unmodifiableList(this.f18452OooO0o);
        }
        if ((i & 1) != 0) {
            this.f18453OooO0o0 = Collections.unmodifiableList(this.f18453OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
