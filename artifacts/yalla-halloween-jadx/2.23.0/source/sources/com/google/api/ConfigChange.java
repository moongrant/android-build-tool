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
import p320o0O0oo0o.o000O0O0;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigChange extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ConfigChange f18329OooOO0 = new ConfigChange();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f18330OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte f18331OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18332OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18333OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18334OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f18335OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<Advice> f18336OooO0oo;

    public static class OooO00o extends AbstractParser<ConfigChange> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ConfigChange(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public List<Advice> f18337OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18338OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18339OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18340OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f18341OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f18342OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Advice, Advice.OooO0O0, Object> f18343OooOO0;

        public OooO0O0() {
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = 0;
            this.f18337OooO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final ConfigChange buildPartial() {
            ConfigChange configChange = new ConfigChange(this);
            configChange.f18332OooO0Oo = this.f18340OooO0o0;
            configChange.f18334OooO0o0 = this.f18339OooO0o;
            configChange.f18333OooO0o = this.f18341OooO0oO;
            configChange.f18335OooO0oO = this.f18342OooO0oo;
            RepeatedFieldBuilderV3<Advice, Advice.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18343OooOO0;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18338OooO0Oo & 1) != 0) {
                    this.f18337OooO = Collections.unmodifiableList(this.f18337OooO);
                    this.f18338OooO0Oo &= -2;
                }
                configChange.f18336OooO0oo = this.f18337OooO;
            } else {
                configChange.f18336OooO0oo = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return configChange;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = 0;
            RepeatedFieldBuilderV3<Advice, Advice.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18343OooOO0;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f18337OooO = Collections.emptyList();
                this.f18338OooO0Oo &= -2;
            }
        }

        public final RepeatedFieldBuilderV3<Advice, Advice.OooO0O0, Object> OooO0o() {
            if (this.f18343OooOO0 == null) {
                this.f18343OooOO0 = new RepeatedFieldBuilderV3<>(this.f18337OooO, (this.f18338OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18337OooO = null;
            }
            return this.f18343OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(ConfigChange configChange) {
            if (configChange == ConfigChange.f18329OooOO0) {
                return;
            }
            if (!configChange.OooO0OO().isEmpty()) {
                this.f18340OooO0o0 = configChange.f18332OooO0Oo;
                onChanged();
            }
            if (!configChange.OooO0o0().isEmpty()) {
                this.f18339OooO0o = configChange.f18334OooO0o0;
                onChanged();
            }
            if (!configChange.OooO0Oo().isEmpty()) {
                this.f18341OooO0oO = configChange.f18333OooO0o;
                onChanged();
            }
            int i = configChange.f18335OooO0oO;
            if (i != 0) {
                this.f18342OooO0oo = i;
                onChanged();
            }
            if (this.f18343OooOO0 == null) {
                if (!configChange.f18336OooO0oo.isEmpty()) {
                    if (this.f18337OooO.isEmpty()) {
                        this.f18337OooO = configChange.f18336OooO0oo;
                        this.f18338OooO0Oo &= -2;
                    } else {
                        if ((this.f18338OooO0Oo & 1) == 0) {
                            this.f18337OooO = new ArrayList(this.f18337OooO);
                            this.f18338OooO0Oo |= 1;
                        }
                        this.f18337OooO.addAll(configChange.f18336OooO0oo);
                    }
                    onChanged();
                }
            } else if (!configChange.f18336OooO0oo.isEmpty()) {
                if (this.f18343OooOO0.isEmpty()) {
                    this.f18343OooOO0.dispose();
                    this.f18343OooOO0 = null;
                    this.f18337OooO = configChange.f18336OooO0oo;
                    this.f18338OooO0Oo &= -2;
                    this.f18343OooOO0 = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18343OooOO0.addAllMessages(configChange.f18336OooO0oo);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            ConfigChange configChange;
            try {
                try {
                    ConfigChange.f18330OooOO0O.getClass();
                    OooO0oO(new ConfigChange(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    configChange = (ConfigChange) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (configChange != null) {
                            OooO0oO(configChange);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                configChange = null;
                if (configChange != null) {
                    OooO0oO(configChange);
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
            ConfigChange configChangeBuildPartial = buildPartial();
            if (configChangeBuildPartial.isInitialized()) {
                return configChangeBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) configChangeBuildPartial);
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
            return ConfigChange.f18329OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000O0O0.f42723OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O0O0.f42724OooO0O0.ensureFieldAccessorsInitialized(ConfigChange.class, OooO0O0.class);
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
            return ConfigChange.f18329OooOO0;
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
            ConfigChange configChangeBuildPartial = buildPartial();
            if (configChangeBuildPartial.isInitialized()) {
                return configChangeBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) configChangeBuildPartial);
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
            if (message instanceof ConfigChange) {
                OooO0oO((ConfigChange) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof ConfigChange) {
                OooO0oO((ConfigChange) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18340OooO0o0 = "";
            this.f18339OooO0o = "";
            this.f18341OooO0oO = "";
            this.f18342OooO0oo = 0;
            this.f18337OooO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public ConfigChange(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18331OooO = (byte) -1;
    }

    public final String OooO0OO() {
        Object obj = this.f18332OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18332OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18333OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18333OooO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18329OooOO0) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    public final String OooO0o0() {
        Object obj = this.f18334OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18334OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfigChange)) {
            return super.equals(obj);
        }
        ConfigChange configChange = (ConfigChange) obj;
        return OooO0OO().equals(configChange.OooO0OO()) && OooO0o0().equals(configChange.OooO0o0()) && OooO0Oo().equals(configChange.OooO0Oo()) && this.f18335OooO0oO == configChange.f18335OooO0oO && this.f18336OooO0oo.equals(configChange.f18336OooO0oo) && this.unknownFields.equals(configChange.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18329OooOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<ConfigChange> getParserForType() {
        return f18330OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18332OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18332OooO0Oo) + 0 : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.f18334OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18334OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18333OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18333OooO0o);
        }
        if (this.f18335OooO0oO != ChangeType.CHANGE_TYPE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.f18335OooO0oO);
        }
        for (int i2 = 0; i2 < this.f18336OooO0oo.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.f18336OooO0oo.get(i2));
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
        int iHashCode = ((((OooO0Oo().hashCode() + ((((OooO0o0().hashCode() + ((((OooO0OO().hashCode() + o000Oo0.OooO00o(o000O0O0.f42723OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53) + this.f18335OooO0oO;
        if (this.f18336OooO0oo.size() > 0) {
            iHashCode = this.f18336OooO0oo.hashCode() + o000000O.OooO00o(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000O0O0.f42724OooO0O0.ensureFieldAccessorsInitialized(ConfigChange.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18331OooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18331OooO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18329OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ConfigChange();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18332OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18332OooO0Oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18334OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18334OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18333OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18333OooO0o);
        }
        if (this.f18335OooO0oO != ChangeType.CHANGE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18335OooO0oO);
        }
        for (int i = 0; i < this.f18336OooO0oo.size(); i++) {
            codedOutputStream.writeMessage(5, this.f18336OooO0oo.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18329OooOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18329OooOO0.toBuilder();
    }

    private ConfigChange() {
        this.f18331OooO = (byte) -1;
        this.f18332OooO0Oo = "";
        this.f18334OooO0o0 = "";
        this.f18333OooO0o = "";
        this.f18335OooO0oO = 0;
        this.f18336OooO0oo = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public ConfigChange(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18332OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.f18334OooO0o0 = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                this.f18333OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 32) {
                                this.f18335OooO0oO = codedInputStream.readEnum();
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f18336OooO0oo = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18336OooO0oo.add((Advice) codedInputStream.readMessage(Advice.f18234OooO0oO, extensionRegistryLite));
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
                    this.f18336OooO0oo = Collections.unmodifiableList(this.f18336OooO0oo);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18336OooO0oo = Collections.unmodifiableList(this.f18336OooO0oo);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
