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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.oo0o0Oo;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class ResourceDescriptor extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f18271OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18272OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18273OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LazyStringList f18274OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f18275OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f18276OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<Integer> f18277OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f18278OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte f18279OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO00o f18269OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ResourceDescriptor f18268OooOOO = new ResourceDescriptor();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO0O0 f18270OooOOOO = new OooO0O0();

    public enum History implements ProtocolMessageEnum {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);

        public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
        public static final int HISTORY_UNSPECIFIED_VALUE = 0;
        public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<History> internalValueMap = new OooO00o();
        private static final History[] VALUES = values();

        public static class OooO00o implements Internal.EnumLiteMap<History> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                if (i == 0) {
                    return History.HISTORY_UNSPECIFIED;
                }
                if (i == 1) {
                    return History.ORIGINALLY_SINGLE_PATTERN;
                }
                if (i == 2) {
                    return History.FUTURE_MULTI_PATTERN;
                }
                History history = History.HISTORY_UNSPECIFIED;
                return null;
            }
        }

        History(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
            return oo0o0Oo.f41301OooO00o.getEnumTypes().get(0);
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
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
            return oo0o0Oo.f41301OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
    }

    public static class OooO00o implements Internal.ListAdapter.Converter<Integer, Style> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final Style convert(Integer num) {
            Style style;
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                style = Style.STYLE_UNSPECIFIED;
            } else if (iIntValue != 1) {
                Style style2 = Style.STYLE_UNSPECIFIED;
                style = null;
            } else {
                style = Style.DECLARATIVE_FRIENDLY;
            }
            return style == null ? Style.UNRECOGNIZED : style;
        }
    }

    public static class OooO0O0 extends AbstractParser<ResourceDescriptor> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ResourceDescriptor(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f18280OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18281OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public LazyStringList f18282OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18283OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18284OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f18285OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f18286OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<Integer> f18287OooOO0O;

        public OooO0OO() {
            this.f18283OooO0o0 = "";
            this.f18282OooO0o = LazyStringArrayList.EMPTY;
            this.f18284OooO0oO = "";
            this.f18285OooO0oo = 0;
            this.f18280OooO = "";
            this.f18286OooOO0 = "";
            this.f18287OooOO0O = Collections.emptyList();
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final ResourceDescriptor buildPartial() {
            ResourceDescriptor resourceDescriptor = new ResourceDescriptor(this);
            resourceDescriptor.f18272OooO0Oo = this.f18283OooO0o0;
            if ((this.f18281OooO0Oo & 1) != 0) {
                this.f18282OooO0o = this.f18282OooO0o.getUnmodifiableView();
                this.f18281OooO0Oo &= -2;
            }
            resourceDescriptor.f18274OooO0o0 = this.f18282OooO0o;
            resourceDescriptor.f18273OooO0o = this.f18284OooO0oO;
            resourceDescriptor.f18275OooO0oO = this.f18285OooO0oo;
            resourceDescriptor.f18276OooO0oo = this.f18280OooO;
            resourceDescriptor.f18271OooO = this.f18286OooOO0;
            if ((this.f18281OooO0Oo & 2) != 0) {
                this.f18287OooOO0O = Collections.unmodifiableList(this.f18287OooOO0O);
                this.f18281OooO0Oo &= -3;
            }
            resourceDescriptor.f18277OooOO0 = this.f18287OooOO0O;
            onBuilt();
            return resourceDescriptor;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18283OooO0o0 = "";
            this.f18282OooO0o = LazyStringArrayList.EMPTY;
            this.f18281OooO0Oo &= -2;
            this.f18284OooO0oO = "";
            this.f18285OooO0oo = 0;
            this.f18280OooO = "";
            this.f18286OooOO0 = "";
            this.f18287OooOO0O = Collections.emptyList();
            this.f18281OooO0Oo &= -3;
        }

        public final void OooO0o(ResourceDescriptor resourceDescriptor) {
            if (resourceDescriptor == ResourceDescriptor.f18268OooOOO) {
                return;
            }
            if (!resourceDescriptor.OooO0o0().isEmpty()) {
                this.f18283OooO0o0 = resourceDescriptor.f18272OooO0Oo;
                onChanged();
            }
            if (!resourceDescriptor.f18274OooO0o0.isEmpty()) {
                if (this.f18282OooO0o.isEmpty()) {
                    this.f18282OooO0o = resourceDescriptor.f18274OooO0o0;
                    this.f18281OooO0Oo &= -2;
                } else {
                    if ((this.f18281OooO0Oo & 1) == 0) {
                        this.f18282OooO0o = new LazyStringArrayList(this.f18282OooO0o);
                        this.f18281OooO0Oo |= 1;
                    }
                    this.f18282OooO0o.addAll(resourceDescriptor.f18274OooO0o0);
                }
                onChanged();
            }
            if (!resourceDescriptor.OooO0O0().isEmpty()) {
                this.f18284OooO0oO = resourceDescriptor.f18273OooO0o;
                onChanged();
            }
            int i = resourceDescriptor.f18275OooO0oO;
            if (i != 0) {
                this.f18285OooO0oo = i;
                onChanged();
            }
            if (!resourceDescriptor.OooO0OO().isEmpty()) {
                this.f18280OooO = resourceDescriptor.f18276OooO0oo;
                onChanged();
            }
            if (!resourceDescriptor.OooO0Oo().isEmpty()) {
                this.f18286OooOO0 = resourceDescriptor.f18271OooO;
                onChanged();
            }
            if (!resourceDescriptor.f18277OooOO0.isEmpty()) {
                if (this.f18287OooOO0O.isEmpty()) {
                    this.f18287OooOO0O = resourceDescriptor.f18277OooOO0;
                    this.f18281OooO0Oo &= -3;
                } else {
                    if ((this.f18281OooO0Oo & 2) == 0) {
                        this.f18287OooOO0O = new ArrayList(this.f18287OooOO0O);
                        this.f18281OooO0Oo |= 2;
                    }
                    this.f18287OooOO0O.addAll(resourceDescriptor.f18277OooOO0);
                }
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
            ResourceDescriptor resourceDescriptor;
            try {
                try {
                    ResourceDescriptor.f18270OooOOOO.getClass();
                    OooO0o(new ResourceDescriptor(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    resourceDescriptor = (ResourceDescriptor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (resourceDescriptor != null) {
                            OooO0o(resourceDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                resourceDescriptor = null;
                if (resourceDescriptor != null) {
                    OooO0o(resourceDescriptor);
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
            ResourceDescriptor resourceDescriptorBuildPartial = buildPartial();
            if (resourceDescriptorBuildPartial.isInitialized()) {
                return resourceDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) resourceDescriptorBuildPartial);
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
            return ResourceDescriptor.f18268OooOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return oo0o0Oo.f41301OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0o0Oo.f41302OooO0O0.ensureFieldAccessorsInitialized(ResourceDescriptor.class, OooO0OO.class);
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
            return ResourceDescriptor.f18268OooOOO;
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
            ResourceDescriptor resourceDescriptorBuildPartial = buildPartial();
            if (resourceDescriptorBuildPartial.isInitialized()) {
                return resourceDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) resourceDescriptorBuildPartial);
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
            if (message instanceof ResourceDescriptor) {
                OooO0o((ResourceDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof ResourceDescriptor) {
                OooO0o((ResourceDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18283OooO0o0 = "";
            this.f18282OooO0o = LazyStringArrayList.EMPTY;
            this.f18284OooO0oO = "";
            this.f18285OooO0oo = 0;
            this.f18280OooO = "";
            this.f18286OooOO0 = "";
            this.f18287OooOO0O = Collections.emptyList();
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
        }
    }

    public enum Style implements ProtocolMessageEnum {
        STYLE_UNSPECIFIED(0),
        DECLARATIVE_FRIENDLY(1),
        UNRECOGNIZED(-1);

        public static final int DECLARATIVE_FRIENDLY_VALUE = 1;
        public static final int STYLE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Style> internalValueMap = new OooO00o();
        private static final Style[] VALUES = values();

        public static class OooO00o implements Internal.EnumLiteMap<Style> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                if (i == 0) {
                    return Style.STYLE_UNSPECIFIED;
                }
                if (i == 1) {
                    return Style.DECLARATIVE_FRIENDLY;
                }
                Style style = Style.STYLE_UNSPECIFIED;
                return null;
            }
        }

        Style(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
            return oo0o0Oo.f41301OooO00o.getEnumTypes().get(1);
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
            OooO00o oooO00o = ResourceDescriptor.f18269OooOOO0;
            return oo0o0Oo.f41301OooO00o.getEnumTypes().get(1).getValues().get(ordinal());
        }
    }

    public ResourceDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18279OooOO0o = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18273OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18273OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18276OooO0oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18276OooO0oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18271OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18271OooO = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f18268OooOOO) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    public final String OooO0o0() {
        Object obj = this.f18272OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18272OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceDescriptor)) {
            return super.equals(obj);
        }
        ResourceDescriptor resourceDescriptor = (ResourceDescriptor) obj;
        return OooO0o0().equals(resourceDescriptor.OooO0o0()) && this.f18274OooO0o0.equals(resourceDescriptor.f18274OooO0o0) && OooO0O0().equals(resourceDescriptor.OooO0O0()) && this.f18275OooO0oO == resourceDescriptor.f18275OooO0oO && OooO0OO().equals(resourceDescriptor.OooO0OO()) && OooO0Oo().equals(resourceDescriptor.OooO0Oo()) && this.f18277OooOO0.equals(resourceDescriptor.f18277OooOO0) && this.unknownFields.equals(resourceDescriptor.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18268OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<ResourceDescriptor> getParserForType() {
        return f18270OooOOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18272OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18272OooO0Oo) + 0 : 0;
        int iOooO00o = 0;
        for (int i2 = 0; i2 < this.f18274OooO0o0.size(); i2++) {
            iOooO00o = o000O0o.OooO00o(this.f18274OooO0o0, i2, iOooO00o);
        }
        int size = (this.f18274OooO0o0.size() * 1) + iComputeStringSize + iOooO00o;
        if (!GeneratedMessageV3.isStringEmpty(this.f18273OooO0o)) {
            size += GeneratedMessageV3.computeStringSize(3, this.f18273OooO0o);
        }
        if (this.f18275OooO0oO != History.HISTORY_UNSPECIFIED.getNumber()) {
            size += CodedOutputStream.computeEnumSize(4, this.f18275OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18276OooO0oo)) {
            size += GeneratedMessageV3.computeStringSize(5, this.f18276OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18271OooO)) {
            size += GeneratedMessageV3.computeStringSize(6, this.f18271OooO);
        }
        int iComputeEnumSizeNoTag = 0;
        for (int i3 = 0; i3 < this.f18277OooOO0.size(); i3++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.f18277OooOO0.get(i3).intValue());
        }
        int iComputeUInt32SizeNoTag = size + iComputeEnumSizeNoTag;
        if (!new Internal.ListAdapter(this.f18277OooOO0, f18269OooOOO0).isEmpty()) {
            iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + CodedOutputStream.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
        }
        this.f18278OooOO0O = iComputeEnumSizeNoTag;
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32SizeNoTag;
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
        int iHashCode = OooO0o0().hashCode() + o0O0O0Oo.OooO00o.OooO00o(oo0o0Oo.f41301OooO00o, 779, 37, 1, 53);
        if (this.f18274OooO0o0.size() > 0) {
            iHashCode = this.f18274OooO0o0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = OooO0Oo().hashCode() + ((((OooO0OO().hashCode() + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o((((OooO0O0().hashCode() + o00Ooo.OooO00o(iHashCode, 37, 3, 53)) * 37) + 4) * 53, this.f18275OooO0oO, 37, 5, 53)) * 37) + 6) * 53);
        if (this.f18277OooOO0.size() > 0) {
            iHashCode2 = o00Ooo.OooO00o(iHashCode2, 37, 10, 53) + this.f18277OooOO0.hashCode();
        }
        int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo0o0Oo.f41302OooO0O0.ensureFieldAccessorsInitialized(ResourceDescriptor.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18279OooOO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18279OooOO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18268OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ResourceDescriptor();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (!GeneratedMessageV3.isStringEmpty(this.f18272OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18272OooO0Oo);
        }
        int iOooO00o = 0;
        while (iOooO00o < this.f18274OooO0o0.size()) {
            iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f18274OooO0o0, iOooO00o, codedOutputStream, 2, iOooO00o, 1);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18273OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18273OooO0o);
        }
        if (this.f18275OooO0oO != History.HISTORY_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18275OooO0oO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18276OooO0oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18276OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18271OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f18271OooO);
        }
        if (new Internal.ListAdapter(this.f18277OooOO0, f18269OooOOO0).size() > 0) {
            codedOutputStream.writeUInt32NoTag(82);
            codedOutputStream.writeUInt32NoTag(this.f18278OooOO0O);
        }
        for (int i = 0; i < this.f18277OooOO0.size(); i++) {
            codedOutputStream.writeEnumNoTag(this.f18277OooOO0.get(i).intValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18268OooOOO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18268OooOOO.toBuilder();
    }

    private ResourceDescriptor() {
        this.f18279OooOO0o = (byte) -1;
        this.f18272OooO0Oo = "";
        this.f18274OooO0o0 = LazyStringArrayList.EMPTY;
        this.f18273OooO0o = "";
        this.f18275OooO0oO = 0;
        this.f18276OooO0oo = "";
        this.f18271OooO = "";
        this.f18277OooOO0 = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    public ResourceDescriptor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18272OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if ((i & 1) == 0) {
                                    this.f18274OooO0o0 = new LazyStringArrayList();
                                    i |= 1;
                                }
                                this.f18274OooO0o0.add(stringRequireUtf8);
                            } else if (tag == 26) {
                                this.f18273OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 32) {
                                this.f18275OooO0oO = codedInputStream.readEnum();
                            } else if (tag == 42) {
                                this.f18276OooO0oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 50) {
                                this.f18271OooO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 80) {
                                int i2 = codedInputStream.readEnum();
                                if ((i & 2) == 0) {
                                    this.f18277OooOO0 = new ArrayList();
                                    i |= 2;
                                }
                                this.f18277OooOO0.add(Integer.valueOf(i2));
                            } else if (tag != 82) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i3 = codedInputStream.readEnum();
                                    if ((i & 2) == 0) {
                                        this.f18277OooOO0 = new ArrayList();
                                        i |= 2;
                                    }
                                    this.f18277OooOO0.add(Integer.valueOf(i3));
                                }
                                codedInputStream.popLimit(iPushLimit);
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
                    this.f18274OooO0o0 = this.f18274OooO0o0.getUnmodifiableView();
                }
                if ((i & 2) != 0) {
                    this.f18277OooOO0 = Collections.unmodifiableList(this.f18277OooOO0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f18274OooO0o0 = this.f18274OooO0o0.getUnmodifiableView();
        }
        if ((i & 2) != 0) {
            this.f18277OooOO0 = Collections.unmodifiableList(this.f18277OooOO0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
