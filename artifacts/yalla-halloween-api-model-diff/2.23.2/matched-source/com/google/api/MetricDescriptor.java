package com.google.api;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.o0ooOOo;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class MetricDescriptor extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final MetricDescriptor f18107OooOOOo = new MetricDescriptor();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO00o f18108OooOOo0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f18109OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18110OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<LabelDescriptor> f18111OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18112OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f18113OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f18114OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile Object f18115OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile Object f18116OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MetricDescriptorMetadata f18117OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public LazyStringList f18118OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f18119OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte f18120OooOOOO;

    public static final class MetricDescriptorMetadata extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18123OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Duration f18124OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Duration f18125OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte f18126OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final MetricDescriptorMetadata f18122OooO0oo = new MetricDescriptorMetadata();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f18121OooO = new OooO00o();

        public static class OooO00o extends AbstractParser<MetricDescriptorMetadata> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MetricDescriptorMetadata(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18127OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Duration f18128OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Duration f18129OooO0o0;

            public OooO0O0() {
                this.f18127OooO0Oo = 0;
                MetricDescriptorMetadata metricDescriptorMetadata = MetricDescriptorMetadata.f18122OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final MetricDescriptorMetadata buildPartial() {
                MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata(this);
                metricDescriptorMetadata.f18123OooO0Oo = this.f18127OooO0Oo;
                metricDescriptorMetadata.f18125OooO0o0 = this.f18129OooO0o0;
                metricDescriptorMetadata.f18124OooO0o = this.f18128OooO0o;
                onBuilt();
                return metricDescriptorMetadata;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f18127OooO0Oo = 0;
                this.f18129OooO0o0 = null;
                this.f18128OooO0o = null;
            }

            public final void OooO0o(MetricDescriptorMetadata metricDescriptorMetadata) {
                if (metricDescriptorMetadata == MetricDescriptorMetadata.f18122OooO0oo) {
                    return;
                }
                int i = metricDescriptorMetadata.f18123OooO0Oo;
                if (i != 0) {
                    this.f18127OooO0Oo = i;
                    onChanged();
                }
                if (metricDescriptorMetadata.f18125OooO0o0 != null) {
                    Duration durationOooO0OO = metricDescriptorMetadata.OooO0OO();
                    Duration duration = this.f18129OooO0o0;
                    if (duration != null) {
                        this.f18129OooO0o0 = Duration.newBuilder(duration).mergeFrom(durationOooO0OO).buildPartial();
                    } else {
                        this.f18129OooO0o0 = durationOooO0OO;
                    }
                    onChanged();
                }
                if (metricDescriptorMetadata.f18124OooO0o != null) {
                    Duration durationOooO0O0 = metricDescriptorMetadata.OooO0O0();
                    Duration duration2 = this.f18128OooO0o;
                    if (duration2 != null) {
                        this.f18128OooO0o = Duration.newBuilder(duration2).mergeFrom(durationOooO0O0).buildPartial();
                    } else {
                        this.f18128OooO0o = durationOooO0O0;
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
                MetricDescriptorMetadata metricDescriptorMetadata;
                try {
                    try {
                        MetricDescriptorMetadata.f18121OooO.getClass();
                        OooO0o(new MetricDescriptorMetadata(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        metricDescriptorMetadata = (MetricDescriptorMetadata) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (metricDescriptorMetadata != null) {
                                OooO0o(metricDescriptorMetadata);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    metricDescriptorMetadata = null;
                    if (metricDescriptorMetadata != null) {
                        OooO0o(metricDescriptorMetadata);
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
                MetricDescriptorMetadata metricDescriptorMetadataBuildPartial = buildPartial();
                if (metricDescriptorMetadataBuildPartial.isInitialized()) {
                    return metricDescriptorMetadataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDescriptorMetadataBuildPartial);
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
                return MetricDescriptorMetadata.f18122OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o0ooOOo.f41292OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o0ooOOo.f41293OooO0Oo.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, OooO0O0.class);
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
                return MetricDescriptorMetadata.f18122OooO0oo;
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

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18127OooO0Oo = 0;
                MetricDescriptorMetadata metricDescriptorMetadata = MetricDescriptorMetadata.f18122OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                MetricDescriptorMetadata metricDescriptorMetadataBuildPartial = buildPartial();
                if (metricDescriptorMetadataBuildPartial.isInitialized()) {
                    return metricDescriptorMetadataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDescriptorMetadataBuildPartial);
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
                if (message instanceof MetricDescriptorMetadata) {
                    OooO0o((MetricDescriptorMetadata) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof MetricDescriptorMetadata) {
                    OooO0o((MetricDescriptorMetadata) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public MetricDescriptorMetadata(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f18126OooO0oO = (byte) -1;
        }

        public final Duration OooO0O0() {
            Duration duration = this.f18124OooO0o;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public final Duration OooO0OO() {
            Duration duration = this.f18125OooO0o0;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f18122OooO0oo) {
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
            if (!(obj instanceof MetricDescriptorMetadata)) {
                return super.equals(obj);
            }
            MetricDescriptorMetadata metricDescriptorMetadata = (MetricDescriptorMetadata) obj;
            if (this.f18123OooO0Oo != metricDescriptorMetadata.f18123OooO0Oo) {
                return false;
            }
            Duration duration = this.f18125OooO0o0;
            if ((duration != null) != (metricDescriptorMetadata.f18125OooO0o0 != null)) {
                return false;
            }
            if ((duration != null) && !OooO0OO().equals(metricDescriptorMetadata.OooO0OO())) {
                return false;
            }
            Duration duration2 = this.f18124OooO0o;
            if ((duration2 != null) != (metricDescriptorMetadata.f18124OooO0o != null)) {
                return false;
            }
            return (!(duration2 != null) || OooO0O0().equals(metricDescriptorMetadata.OooO0O0())) && this.unknownFields.equals(metricDescriptorMetadata.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f18122OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<MetricDescriptorMetadata> getParserForType() {
            return f18121OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = this.f18123OooO0Oo != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.f18123OooO0Oo) : 0;
            if (this.f18125OooO0o0 != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, OooO0OO());
            }
            if (this.f18124OooO0o != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, OooO0O0());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
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
            int iOooO00o = o0O0O0Oo.OooO00o.OooO00o(o0ooOOo.f41292OooO0OO, 779, 37, 1, 53) + this.f18123OooO0Oo;
            if (this.f18125OooO0o0 != null) {
                iOooO00o = o00Ooo.OooO00o(iOooO00o, 37, 2, 53) + OooO0OO().hashCode();
            }
            if (this.f18124OooO0o != null) {
                iOooO00o = o00Ooo.OooO00o(iOooO00o, 37, 3, 53) + OooO0O0().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (iOooO00o * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0ooOOo.f41293OooO0Oo.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f18126OooO0oO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f18126OooO0oO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f18122OooO0oo.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MetricDescriptorMetadata();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f18123OooO0Oo != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.f18123OooO0Oo);
            }
            if (this.f18125OooO0o0 != null) {
                codedOutputStream.writeMessage(2, OooO0OO());
            }
            if (this.f18124OooO0o != null) {
                codedOutputStream.writeMessage(3, OooO0O0());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f18122OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f18122OooO0oo.toBuilder();
        }

        private MetricDescriptorMetadata() {
            this.f18126OooO0oO = (byte) -1;
            this.f18123OooO0Oo = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public MetricDescriptorMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Duration.Builder builder;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag != 8) {
                                        if (tag == 18) {
                                            Duration duration = this.f18125OooO0o0;
                                            builder = duration != null ? duration.toBuilder() : null;
                                            Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                            this.f18125OooO0o0 = duration2;
                                            if (builder != null) {
                                                builder.mergeFrom(duration2);
                                                this.f18125OooO0o0 = builder.buildPartial();
                                            }
                                        } else if (tag != 26) {
                                            if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                            }
                                        } else {
                                            Duration duration3 = this.f18124OooO0o;
                                            builder = duration3 != null ? duration3.toBuilder() : null;
                                            Duration duration4 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                            this.f18124OooO0o = duration4;
                                            if (builder != null) {
                                                builder.mergeFrom(duration4);
                                                this.f18124OooO0o = builder.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.f18123OooO0Oo = codedInputStream.readEnum();
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
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public enum MetricKind implements ProtocolMessageEnum {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        public static final int CUMULATIVE_VALUE = 3;
        public static final int DELTA_VALUE = 2;
        public static final int GAUGE_VALUE = 1;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<MetricKind> internalValueMap = new OooO00o();
        private static final MetricKind[] VALUES = values();

        public static class OooO00o implements Internal.EnumLiteMap<MetricKind> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                if (i == 0) {
                    return MetricKind.METRIC_KIND_UNSPECIFIED;
                }
                if (i == 1) {
                    return MetricKind.GAUGE;
                }
                if (i == 2) {
                    return MetricKind.DELTA;
                }
                if (i == 3) {
                    return MetricKind.CUMULATIVE;
                }
                MetricKind metricKind = MetricKind.METRIC_KIND_UNSPECIFIED;
                return null;
            }
        }

        MetricKind(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            MetricDescriptor metricDescriptor = MetricDescriptor.f18107OooOOOo;
            return o0ooOOo.f41290OooO00o.getEnumTypes().get(0);
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
            MetricDescriptor metricDescriptor = MetricDescriptor.f18107OooOOOo;
            return o0ooOOo.f41290OooO00o.getEnumTypes().get(0).getValues().get(ordinal());
        }
    }

    public static class OooO00o extends AbstractParser<MetricDescriptor> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new MetricDescriptor(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f18130OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18131OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18132OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18133OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<LabelDescriptor> f18134OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> f18135OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f18136OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f18137OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f18138OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public MetricDescriptorMetadata f18139OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f18140OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f18141OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public LazyStringList f18142OooOOOo;

        public OooO0O0() {
            this.f18133OooO0o0 = "";
            this.f18132OooO0o = "";
            this.f18134OooO0oO = Collections.emptyList();
            this.f18130OooO = 0;
            this.f18136OooOO0 = 0;
            this.f18137OooOO0O = "";
            this.f18138OooOO0o = "";
            this.f18140OooOOO0 = "";
            this.f18141OooOOOO = 0;
            this.f18142OooOOOo = LazyStringArrayList.EMPTY;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final MetricDescriptor buildPartial() {
            MetricDescriptor metricDescriptor = new MetricDescriptor(this);
            metricDescriptor.f18110OooO0Oo = this.f18133OooO0o0;
            metricDescriptor.f18112OooO0o0 = this.f18132OooO0o;
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18135OooO0oo;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18131OooO0Oo & 1) != 0) {
                    this.f18134OooO0oO = Collections.unmodifiableList(this.f18134OooO0oO);
                    this.f18131OooO0Oo &= -2;
                }
                metricDescriptor.f18111OooO0o = this.f18134OooO0oO;
            } else {
                metricDescriptor.f18111OooO0o = repeatedFieldBuilderV3.build();
            }
            metricDescriptor.f18113OooO0oO = this.f18130OooO;
            metricDescriptor.f18114OooO0oo = this.f18136OooOO0;
            metricDescriptor.f18109OooO = this.f18137OooOO0O;
            metricDescriptor.f18115OooOO0 = this.f18138OooOO0o;
            metricDescriptor.f18116OooOO0O = this.f18140OooOOO0;
            metricDescriptor.f18117OooOO0o = this.f18139OooOOO;
            metricDescriptor.f18119OooOOO0 = this.f18141OooOOOO;
            if ((this.f18131OooO0Oo & 2) != 0) {
                this.f18142OooOOOo = this.f18142OooOOOo.getUnmodifiableView();
                this.f18131OooO0Oo &= -3;
            }
            metricDescriptor.f18118OooOOO = this.f18142OooOOOo;
            onBuilt();
            return metricDescriptor;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18133OooO0o0 = "";
            this.f18132OooO0o = "";
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18135OooO0oo;
            if (repeatedFieldBuilderV3 == null) {
                this.f18134OooO0oO = Collections.emptyList();
                this.f18131OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.f18130OooO = 0;
            this.f18136OooOO0 = 0;
            this.f18137OooOO0O = "";
            this.f18138OooOO0o = "";
            this.f18140OooOOO0 = "";
            this.f18139OooOOO = null;
            this.f18141OooOOOO = 0;
            this.f18142OooOOOo = LazyStringArrayList.EMPTY;
            this.f18131OooO0Oo &= -3;
        }

        public final RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.OooO0O0, Object> OooO0o() {
            if (this.f18135OooO0oo == null) {
                this.f18135OooO0oo = new RepeatedFieldBuilderV3<>(this.f18134OooO0oO, (this.f18131OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18134OooO0oO = null;
            }
            return this.f18135OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final void OooO0oO(MetricDescriptor metricDescriptor) {
            if (metricDescriptor == MetricDescriptor.f18107OooOOOo) {
                return;
            }
            if (!metricDescriptor.getName().isEmpty()) {
                this.f18133OooO0o0 = metricDescriptor.f18110OooO0Oo;
                onChanged();
            }
            if (!metricDescriptor.OooO0Oo().isEmpty()) {
                this.f18132OooO0o = metricDescriptor.f18112OooO0o0;
                onChanged();
            }
            if (this.f18135OooO0oo == null) {
                if (!metricDescriptor.f18111OooO0o.isEmpty()) {
                    if (this.f18134OooO0oO.isEmpty()) {
                        this.f18134OooO0oO = metricDescriptor.f18111OooO0o;
                        this.f18131OooO0Oo &= -2;
                    } else {
                        if ((this.f18131OooO0Oo & 1) == 0) {
                            this.f18134OooO0oO = new ArrayList(this.f18134OooO0oO);
                            this.f18131OooO0Oo |= 1;
                        }
                        this.f18134OooO0oO.addAll(metricDescriptor.f18111OooO0o);
                    }
                    onChanged();
                }
            } else if (!metricDescriptor.f18111OooO0o.isEmpty()) {
                if (this.f18135OooO0oo.isEmpty()) {
                    this.f18135OooO0oo.dispose();
                    this.f18135OooO0oo = null;
                    this.f18134OooO0oO = metricDescriptor.f18111OooO0o;
                    this.f18131OooO0Oo &= -2;
                    this.f18135OooO0oo = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18135OooO0oo.addAllMessages(metricDescriptor.f18111OooO0o);
                }
            }
            int i = metricDescriptor.f18113OooO0oO;
            if (i != 0) {
                this.f18130OooO = i;
                onChanged();
            }
            int i2 = metricDescriptor.f18114OooO0oo;
            if (i2 != 0) {
                this.f18136OooOO0 = i2;
                onChanged();
            }
            if (!metricDescriptor.getUnit().isEmpty()) {
                this.f18137OooOO0O = metricDescriptor.f18109OooO;
                onChanged();
            }
            if (!metricDescriptor.getDescription().isEmpty()) {
                this.f18138OooOO0o = metricDescriptor.f18115OooOO0;
                onChanged();
            }
            if (!metricDescriptor.OooO0O0().isEmpty()) {
                this.f18140OooOOO0 = metricDescriptor.f18116OooOO0O;
                onChanged();
            }
            if (metricDescriptor.f18117OooOO0o != null) {
                MetricDescriptorMetadata metricDescriptorMetadataOooO0OO = metricDescriptor.OooO0OO();
                MetricDescriptorMetadata metricDescriptorMetadata = this.f18139OooOOO;
                if (metricDescriptorMetadata != null) {
                    MetricDescriptorMetadata.OooO0O0 builder = MetricDescriptorMetadata.f18122OooO0oo.toBuilder();
                    builder.OooO0o(metricDescriptorMetadata);
                    builder.OooO0o(metricDescriptorMetadataOooO0OO);
                    this.f18139OooOOO = builder.buildPartial();
                } else {
                    this.f18139OooOOO = metricDescriptorMetadataOooO0OO;
                }
                onChanged();
            }
            int i3 = metricDescriptor.f18119OooOOO0;
            if (i3 != 0) {
                this.f18141OooOOOO = i3;
                onChanged();
            }
            if (!metricDescriptor.f18118OooOOO.isEmpty()) {
                if (this.f18142OooOOOo.isEmpty()) {
                    this.f18142OooOOOo = metricDescriptor.f18118OooOOO;
                    this.f18131OooO0Oo &= -3;
                } else {
                    if ((this.f18131OooO0Oo & 2) == 0) {
                        this.f18142OooOOOo = new LazyStringArrayList(this.f18142OooOOOo);
                        this.f18131OooO0Oo |= 2;
                    }
                    this.f18142OooOOOo.addAll(metricDescriptor.f18118OooOOO);
                }
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            MetricDescriptor metricDescriptor;
            try {
                try {
                    MetricDescriptor.f18108OooOOo0.getClass();
                    OooO0oO(new MetricDescriptor(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    metricDescriptor = (MetricDescriptor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (metricDescriptor != null) {
                            OooO0oO(metricDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                metricDescriptor = null;
                if (metricDescriptor != null) {
                    OooO0oO(metricDescriptor);
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
            MetricDescriptor metricDescriptorBuildPartial = buildPartial();
            if (metricDescriptorBuildPartial.isInitialized()) {
                return metricDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDescriptorBuildPartial);
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
            return MetricDescriptor.f18107OooOOOo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0ooOOo.f41290OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0ooOOo.f41291OooO0O0.ensureFieldAccessorsInitialized(MetricDescriptor.class, OooO0O0.class);
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
            return MetricDescriptor.f18107OooOOOo;
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
            MetricDescriptor metricDescriptorBuildPartial = buildPartial();
            if (metricDescriptorBuildPartial.isInitialized()) {
                return metricDescriptorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDescriptorBuildPartial);
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
            if (message instanceof MetricDescriptor) {
                OooO0oO((MetricDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof MetricDescriptor) {
                OooO0oO((MetricDescriptor) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18133OooO0o0 = "";
            this.f18132OooO0o = "";
            this.f18134OooO0oO = Collections.emptyList();
            this.f18130OooO = 0;
            this.f18136OooOO0 = 0;
            this.f18137OooOO0O = "";
            this.f18138OooOO0o = "";
            this.f18140OooOOO0 = "";
            this.f18141OooOOOO = 0;
            this.f18142OooOOOo = LazyStringArrayList.EMPTY;
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }
    }

    public enum ValueType implements ProtocolMessageEnum {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final int DOUBLE_VALUE = 3;
        public static final int INT64_VALUE = 2;
        public static final int MONEY_VALUE = 6;
        public static final int STRING_VALUE = 4;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = new OooO00o();
        private static final ValueType[] VALUES = values();

        public static class OooO00o implements Internal.EnumLiteMap<ValueType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                switch (i) {
                    case 0:
                        return ValueType.VALUE_TYPE_UNSPECIFIED;
                    case 1:
                        return ValueType.BOOL;
                    case 2:
                        return ValueType.INT64;
                    case 3:
                        return ValueType.DOUBLE;
                    case 4:
                        return ValueType.STRING;
                    case 5:
                        return ValueType.DISTRIBUTION;
                    case 6:
                        return ValueType.MONEY;
                    default:
                        ValueType valueType = ValueType.VALUE_TYPE_UNSPECIFIED;
                        return null;
                }
            }
        }

        ValueType(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            MetricDescriptor metricDescriptor = MetricDescriptor.f18107OooOOOo;
            return o0ooOOo.f41290OooO00o.getEnumTypes().get(1);
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
            MetricDescriptor metricDescriptor = MetricDescriptor.f18107OooOOOo;
            return o0ooOOo.f41290OooO00o.getEnumTypes().get(1).getValues().get(ordinal());
        }
    }

    public MetricDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18120OooOOOO = (byte) -1;
    }

    public static OooO00o OooO0o0() {
        return f18108OooOOo0;
    }

    public final String OooO0O0() {
        Object obj = this.f18116OooOO0O;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18116OooOO0O = stringUtf8;
        return stringUtf8;
    }

    public final MetricDescriptorMetadata OooO0OO() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.f18117OooOO0o;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.f18122OooO0oo : metricDescriptorMetadata;
    }

    public final String OooO0Oo() {
        Object obj = this.f18112OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18112OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18107OooOOOo) {
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
        if (!(obj instanceof MetricDescriptor)) {
            return super.equals(obj);
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
        if (!getName().equals(metricDescriptor.getName()) || !OooO0Oo().equals(metricDescriptor.OooO0Oo()) || !this.f18111OooO0o.equals(metricDescriptor.f18111OooO0o) || this.f18113OooO0oO != metricDescriptor.f18113OooO0oO || this.f18114OooO0oo != metricDescriptor.f18114OooO0oo || !getUnit().equals(metricDescriptor.getUnit()) || !getDescription().equals(metricDescriptor.getDescription()) || !OooO0O0().equals(metricDescriptor.OooO0O0())) {
            return false;
        }
        MetricDescriptorMetadata metricDescriptorMetadata = this.f18117OooOO0o;
        if ((metricDescriptorMetadata != null) != (metricDescriptor.f18117OooOO0o != null)) {
            return false;
        }
        return (!(metricDescriptorMetadata != null) || OooO0OO().equals(metricDescriptor.OooO0OO())) && this.f18119OooOOO0 == metricDescriptor.f18119OooOOO0 && this.f18118OooOOO.equals(metricDescriptor.f18118OooOOO) && this.unknownFields.equals(metricDescriptor.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18107OooOOOo;
    }

    public final String getDescription() {
        Object obj = this.f18115OooOO0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18115OooOO0 = stringUtf8;
        return stringUtf8;
    }

    public final String getName() {
        Object obj = this.f18110OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18110OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<MetricDescriptor> getParserForType() {
        return f18108OooOOo0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18110OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18110OooO0Oo) + 0 : 0;
        for (int i2 = 0; i2 < this.f18111OooO0o.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.f18111OooO0o.get(i2));
        }
        if (this.f18113OooO0oO != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.f18113OooO0oO);
        }
        if (this.f18114OooO0oo != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.f18114OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18109OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18109OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18115OooOO0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f18115OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18116OooOO0O)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.f18116OooOO0O);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18112OooO0o0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f18112OooO0o0);
        }
        if (this.f18117OooOO0o != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooO0OO());
        }
        if (this.f18119OooOOO0 != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(12, this.f18119OooOOO0);
        }
        int iOooO00o = 0;
        for (int i3 = 0; i3 < this.f18118OooOOO.size(); i3++) {
            iOooO00o = o000O0o.OooO00o(this.f18118OooOOO, i3, iOooO00o);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + (this.f18118OooOOO.size() * 1) + iComputeStringSize + iOooO00o;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final String getUnit() {
        Object obj = this.f18109OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18109OooO = stringUtf8;
        return stringUtf8;
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
        int iHashCode = OooO0Oo().hashCode() + ((((getName().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o0ooOOo.f41290OooO00o, 779, 37, 1, 53)) * 37) + 8) * 53);
        if (this.f18111OooO0o.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 2, 53) + this.f18111OooO0o.hashCode();
        }
        int iHashCode2 = OooO0O0().hashCode() + ((((getDescription().hashCode() + ((((getUnit().hashCode() + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(o00Ooo.OooO00o(iHashCode, 37, 3, 53), this.f18113OooO0oO, 37, 4, 53), this.f18114OooO0oo, 37, 5, 53)) * 37) + 6) * 53)) * 37) + 7) * 53);
        if (this.f18117OooOO0o != null) {
            iHashCode2 = OooO0OO().hashCode() + o00Ooo.OooO00o(iHashCode2, 37, 10, 53);
        }
        int iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 12, 53) + this.f18119OooOOO0;
        if (this.f18118OooOOO.size() > 0) {
            iOooO00o = o00Ooo.OooO00o(iOooO00o, 37, 13, 53) + this.f18118OooOOO.hashCode();
        }
        int iHashCode3 = this.unknownFields.hashCode() + (iOooO00o * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0ooOOo.f41291OooO0O0.ensureFieldAccessorsInitialized(MetricDescriptor.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18120OooOOOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18120OooOOOO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18107OooOOOo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MetricDescriptor();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18110OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18110OooO0Oo);
        }
        for (int i = 0; i < this.f18111OooO0o.size(); i++) {
            codedOutputStream.writeMessage(2, this.f18111OooO0o.get(i));
        }
        if (this.f18113OooO0oO != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(3, this.f18113OooO0oO);
        }
        if (this.f18114OooO0oo != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.f18114OooO0oo);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18109OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18109OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18115OooOO0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f18115OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18116OooOO0O)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.f18116OooOO0O);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18112OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f18112OooO0o0);
        }
        if (this.f18117OooOO0o != null) {
            codedOutputStream.writeMessage(10, OooO0OO());
        }
        if (this.f18119OooOOO0 != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(12, this.f18119OooOOO0);
        }
        int iOooO00o = 0;
        while (iOooO00o < this.f18118OooOOO.size()) {
            iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f18118OooOOO, iOooO00o, codedOutputStream, 13, iOooO00o, 1);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18107OooOOOo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18107OooOOOo.toBuilder();
    }

    private MetricDescriptor() {
        this.f18120OooOOOO = (byte) -1;
        this.f18110OooO0Oo = "";
        this.f18112OooO0o0 = "";
        this.f18111OooO0o = Collections.emptyList();
        this.f18113OooO0oO = 0;
        this.f18114OooO0oo = 0;
        this.f18109OooO = "";
        this.f18115OooOO0 = "";
        this.f18116OooOO0O = "";
        this.f18119OooOOO0 = 0;
        this.f18118OooOOO = LazyStringArrayList.EMPTY;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public MetricDescriptor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        switch (tag) {
                            case 0:
                                break;
                            case 10:
                                this.f18110OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                if ((i & 1) == 0) {
                                    this.f18111OooO0o = new ArrayList();
                                    i |= 1;
                                }
                                this.f18111OooO0o.add((LabelDescriptor) codedInputStream.readMessage(LabelDescriptor.f18059OooO, extensionRegistryLite));
                                continue;
                            case 24:
                                this.f18113OooO0oO = codedInputStream.readEnum();
                                continue;
                            case 32:
                                this.f18114OooO0oo = codedInputStream.readEnum();
                                continue;
                            case 42:
                                this.f18109OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f18115OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.f18116OooOO0O = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 66:
                                this.f18112OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 82:
                                MetricDescriptorMetadata metricDescriptorMetadata = this.f18117OooOO0o;
                                MetricDescriptorMetadata.OooO0O0 builder = metricDescriptorMetadata != null ? metricDescriptorMetadata.toBuilder() : null;
                                MetricDescriptorMetadata metricDescriptorMetadata2 = (MetricDescriptorMetadata) codedInputStream.readMessage(MetricDescriptorMetadata.f18121OooO, extensionRegistryLite);
                                this.f18117OooOO0o = metricDescriptorMetadata2;
                                if (builder != null) {
                                    builder.OooO0o(metricDescriptorMetadata2);
                                    this.f18117OooOO0o = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 96:
                                this.f18119OooOOO0 = codedInputStream.readEnum();
                                continue;
                            case 106:
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if ((i & 2) == 0) {
                                    this.f18118OooOOO = new LazyStringArrayList();
                                    i |= 2;
                                }
                                this.f18118OooOOO.add(stringRequireUtf8);
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
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
                if ((i & 1) != 0) {
                    this.f18111OooO0o = Collections.unmodifiableList(this.f18111OooO0o);
                }
                if ((i & 2) != 0) {
                    this.f18118OooOOO = this.f18118OooOOO.getUnmodifiableView();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f18111OooO0o = Collections.unmodifiableList(this.f18111OooO0o);
        }
        if ((i & 2) != 0) {
            this.f18118OooOOO = this.f18118OooOOO.getUnmodifiableView();
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
