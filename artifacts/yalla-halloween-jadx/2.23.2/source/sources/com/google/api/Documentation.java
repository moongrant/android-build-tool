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
import o0O0O0Oo.OooOo;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Documentation extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Documentation f17972OooOO0O = new Documentation();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f17973OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f17974OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f17975OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<DocumentationRule> f17976OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<Page> f17977OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f17978OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f17979OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f17980OooOO0;

    public static class OooO00o extends AbstractParser<Documentation> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Documentation(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> f17981OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<Page> f17983OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f17984OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> f17985OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public List<DocumentationRule> f17986OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f17987OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f17988OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f17989OooOO0o;

        public OooO0O0() {
            this.f17984OooO0o0 = "";
            this.f17983OooO0o = Collections.emptyList();
            this.f17986OooO0oo = Collections.emptyList();
            this.f17987OooOO0 = "";
            this.f17988OooOO0O = "";
            this.f17989OooOO0o = "";
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
                    Documentation.f17973OooOO0o.getClass();
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
            documentation.f17975OooO0Oo = this.f17984OooO0o0;
            RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17985OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f17982OooO0Oo & 1) != 0) {
                    this.f17983OooO0o = Collections.unmodifiableList(this.f17983OooO0o);
                    this.f17982OooO0Oo &= -2;
                }
                documentation.f17977OooO0o0 = this.f17983OooO0o;
            } else {
                documentation.f17977OooO0o0 = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f17981OooO;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f17982OooO0Oo & 2) != 0) {
                    this.f17986OooO0oo = Collections.unmodifiableList(this.f17986OooO0oo);
                    this.f17982OooO0Oo &= -3;
                }
                documentation.f17976OooO0o = this.f17986OooO0oo;
            } else {
                documentation.f17976OooO0o = repeatedFieldBuilderV4.build();
            }
            documentation.f17978OooO0oO = this.f17987OooOO0;
            documentation.f17979OooO0oo = this.f17988OooOO0O;
            documentation.f17974OooO = this.f17989OooOO0o;
            onBuilt();
            return documentation;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f17984OooO0o0 = "";
            RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17985OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                this.f17983OooO0o = Collections.emptyList();
                this.f17982OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f17981OooO;
            if (repeatedFieldBuilderV4 == null) {
                this.f17986OooO0oo = Collections.emptyList();
                this.f17982OooO0Oo &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            this.f17987OooOO0 = "";
            this.f17988OooOO0O = "";
            this.f17989OooOO0o = "";
        }

        public final RepeatedFieldBuilderV3<Page, Page.OooO0O0, Object> OooO0o() {
            if (this.f17985OooO0oO == null) {
                this.f17985OooO0oO = new RepeatedFieldBuilderV3<>(this.f17983OooO0o, (this.f17982OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f17983OooO0o = null;
            }
            return this.f17985OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final RepeatedFieldBuilderV3<DocumentationRule, DocumentationRule.OooO0O0, Object> OooO0oO() {
            if (this.f17981OooO == null) {
                this.f17981OooO = new RepeatedFieldBuilderV3<>(this.f17986OooO0oo, (this.f17982OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f17986OooO0oo = null;
            }
            return this.f17981OooO;
        }

        public final void OooO0oo(Documentation documentation) {
            if (documentation == Documentation.f17972OooOO0O) {
                return;
            }
            if (!documentation.OooO0o().isEmpty()) {
                this.f17984OooO0o0 = documentation.f17975OooO0Oo;
                onChanged();
            }
            if (this.f17985OooO0oO == null) {
                if (!documentation.f17977OooO0o0.isEmpty()) {
                    if (this.f17983OooO0o.isEmpty()) {
                        this.f17983OooO0o = documentation.f17977OooO0o0;
                        this.f17982OooO0Oo &= -2;
                    } else {
                        if ((this.f17982OooO0Oo & 1) == 0) {
                            this.f17983OooO0o = new ArrayList(this.f17983OooO0o);
                            this.f17982OooO0Oo |= 1;
                        }
                        this.f17983OooO0o.addAll(documentation.f17977OooO0o0);
                    }
                    onChanged();
                }
            } else if (!documentation.f17977OooO0o0.isEmpty()) {
                if (this.f17985OooO0oO.isEmpty()) {
                    this.f17985OooO0oO.dispose();
                    this.f17985OooO0oO = null;
                    this.f17983OooO0o = documentation.f17977OooO0o0;
                    this.f17982OooO0Oo &= -2;
                    this.f17985OooO0oO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f17985OooO0oO.addAllMessages(documentation.f17977OooO0o0);
                }
            }
            if (this.f17981OooO == null) {
                if (!documentation.f17976OooO0o.isEmpty()) {
                    if (this.f17986OooO0oo.isEmpty()) {
                        this.f17986OooO0oo = documentation.f17976OooO0o;
                        this.f17982OooO0Oo &= -3;
                    } else {
                        if ((this.f17982OooO0Oo & 2) == 0) {
                            this.f17986OooO0oo = new ArrayList(this.f17986OooO0oo);
                            this.f17982OooO0Oo |= 2;
                        }
                        this.f17986OooO0oo.addAll(documentation.f17976OooO0o);
                    }
                    onChanged();
                }
            } else if (!documentation.f17976OooO0o.isEmpty()) {
                if (this.f17981OooO.isEmpty()) {
                    this.f17981OooO.dispose();
                    this.f17981OooO = null;
                    this.f17986OooO0oo = documentation.f17976OooO0o;
                    this.f17982OooO0Oo &= -3;
                    this.f17981OooO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f17981OooO.addAllMessages(documentation.f17976OooO0o);
                }
            }
            if (!documentation.OooO0OO().isEmpty()) {
                this.f17987OooOO0 = documentation.f17978OooO0oO;
                onChanged();
            }
            if (!documentation.OooO0o0().isEmpty()) {
                this.f17988OooOO0O = documentation.f17979OooO0oo;
                onChanged();
            }
            if (!documentation.OooO0Oo().isEmpty()) {
                this.f17989OooOO0o = documentation.f17974OooO;
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
            return Documentation.f17972OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return OooOo.f41198OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOo.f41199OooO0O0.ensureFieldAccessorsInitialized(Documentation.class, OooO0O0.class);
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
            return Documentation.f17972OooOO0O;
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
            this.f17984OooO0o0 = "";
            this.f17983OooO0o = Collections.emptyList();
            this.f17986OooO0oo = Collections.emptyList();
            this.f17987OooOO0 = "";
            this.f17988OooOO0O = "";
            this.f17989OooOO0o = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooO0oO();
            }
        }
    }

    public Documentation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f17980OooOO0 = (byte) -1;
    }

    public static OooO00o OooO0oO() {
        return f17973OooOO0o;
    }

    public final String OooO0OO() {
        Object obj = this.f17978OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17978OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f17974OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17974OooO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o() {
        Object obj = this.f17975OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17975OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0o0() {
        Object obj = this.f17979OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f17979OooO0oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f17972OooOO0O) {
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
        return OooO0o().equals(documentation.OooO0o()) && this.f17977OooO0o0.equals(documentation.f17977OooO0o0) && this.f17976OooO0o.equals(documentation.f17976OooO0o) && OooO0OO().equals(documentation.OooO0OO()) && OooO0o0().equals(documentation.OooO0o0()) && OooO0Oo().equals(documentation.OooO0Oo()) && this.unknownFields.equals(documentation.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f17972OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Documentation> getParserForType() {
        return f17973OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f17975OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f17975OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f17974OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f17974OooO);
        }
        for (int i2 = 0; i2 < this.f17976OooO0o.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.f17976OooO0o.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17978OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f17978OooO0oO);
        }
        for (int i3 = 0; i3 < this.f17977OooO0o0.size(); i3++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.f17977OooO0o0.get(i3));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17979OooO0oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f17979OooO0oo);
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
        int iHashCode = OooO0o().hashCode() + o0O0O0Oo.OooO00o.OooO00o(OooOo.f41198OooO00o, 779, 37, 1, 53);
        if (this.f17977OooO0o0.size() > 0) {
            iHashCode = this.f17977OooO0o0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 5, 53);
        }
        if (this.f17976OooO0o.size() > 0) {
            iHashCode = this.f17976OooO0o.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0Oo().hashCode() + ((((OooO0o0().hashCode() + ((((OooO0OO().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 4, 53)) * 37) + 6) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OooOo.f41199OooO0O0.ensureFieldAccessorsInitialized(Documentation.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f17980OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f17980OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f17972OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Documentation();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f17975OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f17975OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17974OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f17974OooO);
        }
        for (int i = 0; i < this.f17976OooO0o.size(); i++) {
            codedOutputStream.writeMessage(3, this.f17976OooO0o.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17978OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f17978OooO0oO);
        }
        for (int i2 = 0; i2 < this.f17977OooO0o0.size(); i2++) {
            codedOutputStream.writeMessage(5, this.f17977OooO0o0.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f17979OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f17979OooO0oo);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f17972OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f17972OooOO0O.toBuilder();
    }

    private Documentation() {
        this.f17980OooOO0 = (byte) -1;
        this.f17975OooO0Oo = "";
        this.f17977OooO0o0 = Collections.emptyList();
        this.f17976OooO0o = Collections.emptyList();
        this.f17978OooO0oO = "";
        this.f17979OooO0oo = "";
        this.f17974OooO = "";
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
                                this.f17975OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f17974OooO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                if ((i & 2) == 0) {
                                    this.f17976OooO0o = new ArrayList();
                                    i |= 2;
                                }
                                this.f17976OooO0o.add((DocumentationRule) codedInputStream.readMessage(DocumentationRule.f17990OooO, extensionRegistryLite));
                            } else if (tag == 34) {
                                this.f17978OooO0oO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 42) {
                                if ((i & 1) == 0) {
                                    this.f17977OooO0o0 = new ArrayList();
                                    i |= 1;
                                }
                                this.f17977OooO0o0.add((Page) codedInputStream.readMessage(Page.f18207OooO, extensionRegistryLite));
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f17979OooO0oo = codedInputStream.readStringRequireUtf8();
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
                    this.f17976OooO0o = Collections.unmodifiableList(this.f17976OooO0o);
                }
                if ((i & 1) != 0) {
                    this.f17977OooO0o0 = Collections.unmodifiableList(this.f17977OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 2) != 0) {
            this.f17976OooO0o = Collections.unmodifiableList(this.f17976OooO0o);
        }
        if ((i & 1) != 0) {
            this.f17977OooO0o0 = Collections.unmodifiableList(this.f17977OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
