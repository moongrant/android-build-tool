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
import p320o0O0oo0o.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class LogDescriptor extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final LogDescriptor f18544OooO = new LogDescriptor();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f18545OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<LabelDescriptor> f18548OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile Object f18549OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte f18550OooO0oo;

    public static class OooO00o extends AbstractParser<LogDescriptor> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LogDescriptor(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f18551OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18552OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<LabelDescriptor> f18553OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18554OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> f18555OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Object f18556OooO0oo;

        public OooO0O0() {
            this.f18554OooO0o0 = "";
            this.f18553OooO0o = Collections.emptyList();
            this.f18556OooO0oo = "";
            this.f18551OooO = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final LogDescriptor buildPartial() {
            LogDescriptor logDescriptor = new LogDescriptor(this);
            logDescriptor.f18546OooO0Oo = this.f18554OooO0o0;
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18555OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18552OooO0Oo & 1) != 0) {
                    this.f18553OooO0o = Collections.unmodifiableList(this.f18553OooO0o);
                    this.f18552OooO0Oo &= -2;
                }
                logDescriptor.f18548OooO0o0 = this.f18553OooO0o;
            } else {
                logDescriptor.f18548OooO0o0 = repeatedFieldBuilderV3.build();
            }
            logDescriptor.f18547OooO0o = this.f18556OooO0oo;
            logDescriptor.f18549OooO0oO = this.f18551OooO;
            onBuilt();
            return logDescriptor;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18554OooO0o0 = "";
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18555OooO0oO;
            if (repeatedFieldBuilderV3 == null) {
                this.f18553OooO0o = Collections.emptyList();
                this.f18552OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18556OooO0oo = "";
            this.f18551OooO = "";
        }

        public final RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> OooO0o() {
            if (this.f18555OooO0oO == null) {
                this.f18555OooO0oO = new RepeatedFieldBuilderV3<>(this.f18553OooO0o, (this.f18552OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18553OooO0o = null;
            }
            return this.f18555OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(LogDescriptor logDescriptor) {
            if (logDescriptor == LogDescriptor.f18544OooO) {
                return;
            }
            if (!logDescriptor.getName().isEmpty()) {
                this.f18554OooO0o0 = logDescriptor.f18546OooO0Oo;
                onChanged();
            }
            if (this.f18555OooO0oO == null) {
                if (!logDescriptor.f18548OooO0o0.isEmpty()) {
                    if (this.f18553OooO0o.isEmpty()) {
                        this.f18553OooO0o = logDescriptor.f18548OooO0o0;
                        this.f18552OooO0Oo &= -2;
                    } else {
                        if ((this.f18552OooO0Oo & 1) == 0) {
                            this.f18553OooO0o = new ArrayList(this.f18553OooO0o);
                            this.f18552OooO0Oo |= 1;
                        }
                        this.f18553OooO0o.addAll(logDescriptor.f18548OooO0o0);
                    }
                    onChanged();
                }
            } else if (!logDescriptor.f18548OooO0o0.isEmpty()) {
                if (this.f18555OooO0oO.isEmpty()) {
                    this.f18555OooO0oO.dispose();
                    this.f18555OooO0oO = null;
                    this.f18553OooO0o = logDescriptor.f18548OooO0o0;
                    this.f18552OooO0Oo &= -2;
                    this.f18555OooO0oO = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18555OooO0oO.addAllMessages(logDescriptor.f18548OooO0o0);
                }
            }
            if (!logDescriptor.getDescription().isEmpty()) {
                this.f18556OooO0oo = logDescriptor.f18547OooO0o;
                onChanged();
            }
            if (!logDescriptor.OooO0O0().isEmpty()) {
                this.f18551OooO = logDescriptor.f18549OooO0oO;
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            LogDescriptor logDescriptor;
            try {
                try {
                    LogDescriptor.f18545OooOO0.getClass();
                    OooO0oO(new LogDescriptor(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    logDescriptor = (LogDescriptor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (logDescriptor != null) {
                            OooO0oO(logDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                logDescriptor = null;
                if (logDescriptor != null) {
                    OooO0oO(logDescriptor);
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
            LogDescriptor logDescriptorBuildPartial = buildPartial();
            if (logDescriptorBuildPartial.isInitialized()) {
                return logDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) logDescriptorBuildPartial);
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
            return LogDescriptor.f18544OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00O00OO.f42778OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00O00OO.f42779OooO0O0.ensureFieldAccessorsInitialized(LogDescriptor.class, OooO0O0.class);
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
            return LogDescriptor.f18544OooO;
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
            LogDescriptor logDescriptorBuildPartial = buildPartial();
            if (logDescriptorBuildPartial.isInitialized()) {
                return logDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) logDescriptorBuildPartial);
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
            if (message instanceof LogDescriptor) {
                OooO0oO((LogDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18554OooO0o0 = "";
            this.f18553OooO0o = Collections.emptyList();
            this.f18556OooO0oo = "";
            this.f18551OooO = "";
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof LogDescriptor) {
                OooO0oO((LogDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public LogDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18550OooO0oo = (byte) -1;
    }

    public static OooO00o OooO0OO() {
        return f18545OooOO0;
    }

    public final String OooO0O0() {
        Object obj = this.f18549OooO0oO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18549OooO0oO = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18544OooO) {
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
        if (!(obj instanceof LogDescriptor)) {
            return super.equals(obj);
        }
        LogDescriptor logDescriptor = (LogDescriptor) obj;
        return getName().equals(logDescriptor.getName()) && this.f18548OooO0o0.equals(logDescriptor.f18548OooO0o0) && getDescription().equals(logDescriptor.getDescription()) && OooO0O0().equals(logDescriptor.OooO0O0()) && this.unknownFields.equals(logDescriptor.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18544OooO;
    }

    public final String getDescription() {
        Object obj = this.f18547OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18547OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final String getName() {
        Object obj = this.f18546OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18546OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<LogDescriptor> getParserForType() {
        return f18545OooOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18546OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18546OooO0Oo) + 0 : 0;
        for (int i2 = 0; i2 < this.f18548OooO0o0.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.f18548OooO0o0.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18547OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18547OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18549OooO0oO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f18549OooO0oO);
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
        int iHashCode = getName().hashCode() + o000Oo0.OooO00o(o00O00OO.f42778OooO00o, 779, 37, 1, 53);
        if (this.f18548OooO0o0.size() > 0) {
            iHashCode = this.f18548OooO0o0.hashCode() + o000000O.OooO00o(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0O0().hashCode() + ((((getDescription().hashCode() + o000000O.OooO00o(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00O00OO.f42779OooO0O0.ensureFieldAccessorsInitialized(LogDescriptor.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18550OooO0oo;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18550OooO0oo = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18544OooO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new LogDescriptor();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18546OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18546OooO0Oo);
        }
        for (int i = 0; i < this.f18548OooO0o0.size(); i++) {
            codedOutputStream.writeMessage(2, this.f18548OooO0o0.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18547OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18547OooO0o);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18549OooO0oO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.f18549OooO0oO);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18544OooO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18544OooO.toBuilder();
    }

    private LogDescriptor() {
        this.f18550OooO0oo = (byte) -1;
        this.f18546OooO0Oo = "";
        this.f18548OooO0o0 = Collections.emptyList();
        this.f18547OooO0o = "";
        this.f18549OooO0oO = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public LogDescriptor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.f18546OooO0Oo = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 18) {
                                if (!(z2 & true)) {
                                    this.f18548OooO0o0 = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18548OooO0o0.add((LabelDescriptor) codedInputStream.readMessage(LabelDescriptor.f18535OooO, extensionRegistryLite));
                            } else if (tag == 26) {
                                this.f18547OooO0o = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f18549OooO0oO = codedInputStream.readStringRequireUtf8();
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
                if (z2 & true) {
                    this.f18548OooO0o0 = Collections.unmodifiableList(this.f18548OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.f18548OooO0o0 = Collections.unmodifiableList(this.f18548OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
