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
import o0O0O0Oo.o0OOO0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class MonitoredResourceDescriptor extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final MonitoredResourceDescriptor f18159OooOO0O = new MonitoredResourceDescriptor();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f18160OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f18161OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18165OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<LabelDescriptor> f18166OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte f18167OooOO0;

    public static class OooO00o extends AbstractParser<MonitoredResourceDescriptor> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new MonitoredResourceDescriptor(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public List<LabelDescriptor> f18168OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18170OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18171OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18172OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18173OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> f18174OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f18175OooOO0O;

        public OooO0O0() {
            this.f18171OooO0o0 = "";
            this.f18170OooO0o = "";
            this.f18172OooO0oO = "";
            this.f18173OooO0oo = "";
            this.f18168OooO = Collections.emptyList();
            this.f18175OooOO0O = 0;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final MonitoredResourceDescriptor buildPartial() {
            MonitoredResourceDescriptor monitoredResourceDescriptor = new MonitoredResourceDescriptor(this);
            monitoredResourceDescriptor.f18162OooO0Oo = this.f18171OooO0o0;
            monitoredResourceDescriptor.f18164OooO0o0 = this.f18170OooO0o;
            monitoredResourceDescriptor.f18163OooO0o = this.f18172OooO0oO;
            monitoredResourceDescriptor.f18165OooO0oO = this.f18173OooO0oo;
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18174OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18169OooO0Oo & 1) != 0) {
                    this.f18168OooO = Collections.unmodifiableList(this.f18168OooO);
                    this.f18169OooO0Oo &= -2;
                }
                monitoredResourceDescriptor.f18166OooO0oo = this.f18168OooO;
            } else {
                monitoredResourceDescriptor.f18166OooO0oo = repeatedFieldBuilderV3.build();
            }
            monitoredResourceDescriptor.f18161OooO = this.f18175OooOO0O;
            onBuilt();
            return monitoredResourceDescriptor;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18171OooO0o0 = "";
            this.f18170OooO0o = "";
            this.f18172OooO0oO = "";
            this.f18173OooO0oo = "";
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18174OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                this.f18168OooO = Collections.emptyList();
                this.f18169OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18175OooOO0O = 0;
        }

        public final RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> OooO0o() {
            if (this.f18174OooOO0 == null) {
                this.f18174OooOO0 = new RepeatedFieldBuilderV3<>(this.f18168OooO, (this.f18169OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18168OooO = null;
            }
            return this.f18174OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final void OooO0oO(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            if (monitoredResourceDescriptor == MonitoredResourceDescriptor.f18159OooOO0O) {
                return;
            }
            if (!monitoredResourceDescriptor.getName().isEmpty()) {
                this.f18171OooO0o0 = monitoredResourceDescriptor.f18162OooO0Oo;
                onChanged();
            }
            if (!monitoredResourceDescriptor.OooO0OO().isEmpty()) {
                this.f18170OooO0o = monitoredResourceDescriptor.f18164OooO0o0;
                onChanged();
            }
            if (!monitoredResourceDescriptor.OooO0O0().isEmpty()) {
                this.f18172OooO0oO = monitoredResourceDescriptor.f18163OooO0o;
                onChanged();
            }
            if (!monitoredResourceDescriptor.getDescription().isEmpty()) {
                this.f18173OooO0oo = monitoredResourceDescriptor.f18165OooO0oO;
                onChanged();
            }
            if (this.f18174OooOO0 == null) {
                if (!monitoredResourceDescriptor.f18166OooO0oo.isEmpty()) {
                    if (this.f18168OooO.isEmpty()) {
                        this.f18168OooO = monitoredResourceDescriptor.f18166OooO0oo;
                        this.f18169OooO0Oo &= -2;
                    } else {
                        if ((this.f18169OooO0Oo & 1) == 0) {
                            this.f18168OooO = new ArrayList(this.f18168OooO);
                            this.f18169OooO0Oo |= 1;
                        }
                        this.f18168OooO.addAll(monitoredResourceDescriptor.f18166OooO0oo);
                    }
                    onChanged();
                }
            } else if (!monitoredResourceDescriptor.f18166OooO0oo.isEmpty()) {
                if (this.f18174OooOO0.isEmpty()) {
                    this.f18174OooOO0.dispose();
                    this.f18174OooOO0 = null;
                    this.f18168OooO = monitoredResourceDescriptor.f18166OooO0oo;
                    this.f18169OooO0Oo &= -2;
                    this.f18174OooOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18174OooOO0.addAllMessages(monitoredResourceDescriptor.f18166OooO0oo);
                }
            }
            int i = monitoredResourceDescriptor.f18161OooO;
            if (i != 0) {
                this.f18175OooOO0O = i;
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            MonitoredResourceDescriptor monitoredResourceDescriptor;
            try {
                try {
                    MonitoredResourceDescriptor.f18160OooOO0o.getClass();
                    OooO0oO(new MonitoredResourceDescriptor(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    monitoredResourceDescriptor = (MonitoredResourceDescriptor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (monitoredResourceDescriptor != null) {
                            OooO0oO(monitoredResourceDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                monitoredResourceDescriptor = null;
                if (monitoredResourceDescriptor != null) {
                    OooO0oO(monitoredResourceDescriptor);
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
            MonitoredResourceDescriptor monitoredResourceDescriptorBuildPartial = buildPartial();
            if (monitoredResourceDescriptorBuildPartial.isInitialized()) {
                return monitoredResourceDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoredResourceDescriptorBuildPartial);
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
            return MonitoredResourceDescriptor.f18159OooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0OOO0o.f41275OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0OOO0o.f41276OooO0O0.ensureFieldAccessorsInitialized(MonitoredResourceDescriptor.class, OooO0O0.class);
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
            return MonitoredResourceDescriptor.f18159OooOO0O;
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
            MonitoredResourceDescriptor monitoredResourceDescriptorBuildPartial = buildPartial();
            if (monitoredResourceDescriptorBuildPartial.isInitialized()) {
                return monitoredResourceDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoredResourceDescriptorBuildPartial);
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
            if (message instanceof MonitoredResourceDescriptor) {
                OooO0oO((MonitoredResourceDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof MonitoredResourceDescriptor) {
                OooO0oO((MonitoredResourceDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18171OooO0o0 = "";
            this.f18170OooO0o = "";
            this.f18172OooO0oO = "";
            this.f18173OooO0oo = "";
            this.f18168OooO = Collections.emptyList();
            this.f18175OooOO0O = 0;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public MonitoredResourceDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18167OooOO0 = (byte) -1;
    }

    public static OooO00o OooO0Oo() {
        return f18160OooOO0o;
    }

    public final String OooO0O0() {
        Object obj = this.f18163OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18163OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18164OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18164OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18159OooOO0O) {
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
        if (!(obj instanceof MonitoredResourceDescriptor)) {
            return super.equals(obj);
        }
        MonitoredResourceDescriptor monitoredResourceDescriptor = (MonitoredResourceDescriptor) obj;
        return getName().equals(monitoredResourceDescriptor.getName()) && OooO0OO().equals(monitoredResourceDescriptor.OooO0OO()) && OooO0O0().equals(monitoredResourceDescriptor.OooO0O0()) && getDescription().equals(monitoredResourceDescriptor.getDescription()) && this.f18166OooO0oo.equals(monitoredResourceDescriptor.f18166OooO0oo) && this.f18161OooO == monitoredResourceDescriptor.f18161OooO && this.unknownFields.equals(monitoredResourceDescriptor.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18159OooOO0O;
    }

    public final String getDescription() {
        Object obj = this.f18165OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18165OooO0oO = stringUtf8;
        return stringUtf8;
    }

    public final String getName() {
        Object obj = this.f18162OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18162OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<MonitoredResourceDescriptor> getParserForType() {
        return f18160OooOO0o;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18164OooO0o0) ? GeneratedMessageV3.computeStringSize(1, this.f18164OooO0o0) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18163OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18163OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18165OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18165OooO0oO);
        }
        for (int i2 = 0; i2 < this.f18166OooO0oo.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.f18166OooO0oo.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18162OooO0Oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18162OooO0Oo);
        }
        if (this.f18161OooO != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(7, this.f18161OooO);
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
        int iHashCode = getDescription().hashCode() + ((((OooO0O0().hashCode() + ((((OooO0OO().hashCode() + ((((getName().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o0OOO0o.f41275OooO00o, 779, 37, 5, 53)) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (this.f18166OooO0oo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 4, 53) + this.f18166OooO0oo.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((o00Ooo.OooO00o(iHashCode, 37, 7, 53) + this.f18161OooO) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0OOO0o.f41276OooO0O0.ensureFieldAccessorsInitialized(MonitoredResourceDescriptor.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18167OooOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18167OooOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18159OooOO0O.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MonitoredResourceDescriptor();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18164OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18164OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18163OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18163OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18165OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18165OooO0oO);
        }
        for (int i = 0; i < this.f18166OooO0oo.size(); i++) {
            codedOutputStream.writeMessage(4, this.f18166OooO0oo.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18162OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18162OooO0Oo);
        }
        if (this.f18161OooO != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(7, this.f18161OooO);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18159OooOO0O;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18159OooOO0O.toBuilder();
    }

    private MonitoredResourceDescriptor() {
        this.f18167OooOO0 = (byte) -1;
        this.f18162OooO0Oo = "";
        this.f18164OooO0o0 = "";
        this.f18163OooO0o = "";
        this.f18165OooO0oO = "";
        this.f18166OooO0oo = Collections.emptyList();
        this.f18161OooO = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public MonitoredResourceDescriptor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18164OooO0o0 = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f18163OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                this.f18165OooO0oO = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 34) {
                                if (!(z2 & true)) {
                                    this.f18166OooO0oo = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18166OooO0oo.add((LabelDescriptor) codedInputStream.readMessage(LabelDescriptor.f18059OooO, extensionRegistryLite));
                            } else if (tag == 42) {
                                this.f18162OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 56) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f18161OooO = codedInputStream.readEnum();
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
                    this.f18166OooO0oo = Collections.unmodifiableList(this.f18166OooO0oo);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18166OooO0oo = Collections.unmodifiableList(this.f18166OooO0oo);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
