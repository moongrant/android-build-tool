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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0O0O0Oo.o0Oo0oo;
import p037OoooOo0.o000O0o;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Monitoring extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Monitoring f18184OooO0oO = new Monitoring();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f18185OooO0oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<MonitoringDestination> f18186OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public byte f18187OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<MonitoringDestination> f18188OooO0o0;

    public static final class MonitoringDestination extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final MonitoringDestination f18189OooO0oO = new MonitoringDestination();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f18190OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f18191OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f18192OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LazyStringList f18193OooO0o0;

        public static class OooO00o extends AbstractParser<MonitoringDestination> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MonitoringDestination(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18194OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public LazyStringList f18195OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f18196OooO0o0;

            public OooO0O0() {
                this.f18196OooO0o0 = "";
                this.f18195OooO0o = LazyStringArrayList.EMPTY;
                MonitoringDestination monitoringDestination = MonitoringDestination.f18189OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final MonitoringDestination buildPartial() {
                MonitoringDestination monitoringDestination = new MonitoringDestination(this);
                monitoringDestination.f18191OooO0Oo = this.f18196OooO0o0;
                if ((this.f18194OooO0Oo & 1) != 0) {
                    this.f18195OooO0o = this.f18195OooO0o.getUnmodifiableView();
                    this.f18194OooO0Oo &= -2;
                }
                monitoringDestination.f18193OooO0o0 = this.f18195OooO0o;
                onBuilt();
                return monitoringDestination;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f18196OooO0o0 = "";
                this.f18195OooO0o = LazyStringArrayList.EMPTY;
                this.f18194OooO0Oo &= -2;
            }

            public final void OooO0o(MonitoringDestination monitoringDestination) {
                if (monitoringDestination == MonitoringDestination.f18189OooO0oO) {
                    return;
                }
                if (!monitoringDestination.OooO0O0().isEmpty()) {
                    this.f18196OooO0o0 = monitoringDestination.f18191OooO0Oo;
                    onChanged();
                }
                if (!monitoringDestination.f18193OooO0o0.isEmpty()) {
                    if (this.f18195OooO0o.isEmpty()) {
                        this.f18195OooO0o = monitoringDestination.f18193OooO0o0;
                        this.f18194OooO0Oo &= -2;
                    } else {
                        if ((this.f18194OooO0Oo & 1) == 0) {
                            this.f18195OooO0o = new LazyStringArrayList(this.f18195OooO0o);
                            this.f18194OooO0Oo |= 1;
                        }
                        this.f18195OooO0o.addAll(monitoringDestination.f18193OooO0o0);
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
                MonitoringDestination monitoringDestination;
                try {
                    try {
                        MonitoringDestination.f18190OooO0oo.getClass();
                        OooO0o(new MonitoringDestination(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        monitoringDestination = (MonitoringDestination) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (monitoringDestination != null) {
                                OooO0o(monitoringDestination);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    monitoringDestination = null;
                    if (monitoringDestination != null) {
                        OooO0o(monitoringDestination);
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
                MonitoringDestination monitoringDestinationBuildPartial = buildPartial();
                if (monitoringDestinationBuildPartial.isInitialized()) {
                    return monitoringDestinationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoringDestinationBuildPartial);
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
                return MonitoringDestination.f18189OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o0Oo0oo.f41285OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o0Oo0oo.f41286OooO0Oo.ensureFieldAccessorsInitialized(MonitoringDestination.class, OooO0O0.class);
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
                return MonitoringDestination.f18189OooO0oO;
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
                MonitoringDestination monitoringDestinationBuildPartial = buildPartial();
                if (monitoringDestinationBuildPartial.isInitialized()) {
                    return monitoringDestinationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoringDestinationBuildPartial);
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

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18196OooO0o0 = "";
                this.f18195OooO0o = LazyStringArrayList.EMPTY;
                MonitoringDestination monitoringDestination = MonitoringDestination.f18189OooO0oO;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof MonitoringDestination) {
                    OooO0o((MonitoringDestination) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof MonitoringDestination) {
                    OooO0o((MonitoringDestination) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public MonitoringDestination(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f18192OooO0o = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f18191OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f18191OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f18189OooO0oO) {
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
            if (!(obj instanceof MonitoringDestination)) {
                return super.equals(obj);
            }
            MonitoringDestination monitoringDestination = (MonitoringDestination) obj;
            return OooO0O0().equals(monitoringDestination.OooO0O0()) && this.f18193OooO0o0.equals(monitoringDestination.f18193OooO0o0) && this.unknownFields.equals(monitoringDestination.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f18189OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<MonitoringDestination> getParserForType() {
            return f18190OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f18191OooO0Oo) ? GeneratedMessageV3.computeStringSize(1, this.f18191OooO0Oo) + 0 : 0;
            int iOooO00o = 0;
            for (int i2 = 0; i2 < this.f18193OooO0o0.size(); i2++) {
                iOooO00o = o000O0o.OooO00o(this.f18193OooO0o0, i2, iOooO00o);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + (this.f18193OooO0o0.size() * 1) + iComputeStringSize + iOooO00o;
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
            int iHashCode = OooO0O0().hashCode() + o0O0O0Oo.OooO00o.OooO00o(o0Oo0oo.f41285OooO0OO, 779, 37, 1, 53);
            if (this.f18193OooO0o0.size() > 0) {
                iHashCode = this.f18193OooO0o0.hashCode() + o00Ooo.OooO00o(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0Oo0oo.f41286OooO0Oo.ensureFieldAccessorsInitialized(MonitoringDestination.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f18192OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f18192OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f18189OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MonitoringDestination();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f18191OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18191OooO0Oo);
            }
            int iOooO00o = 0;
            while (iOooO00o < this.f18193OooO0o0.size()) {
                iOooO00o = com.app.base.protobuf.OooO0O0.OooO00o(this.f18193OooO0o0, iOooO00o, codedOutputStream, 2, iOooO00o, 1);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f18189OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f18189OooO0oO.toBuilder();
        }

        private MonitoringDestination() {
            this.f18192OooO0o = (byte) -1;
            this.f18191OooO0Oo = "";
            this.f18193OooO0o0 = LazyStringArrayList.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public MonitoringDestination(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.f18191OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!(z2 & true)) {
                                        this.f18193OooO0o0 = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.f18193OooO0o0.add(stringRequireUtf8);
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
                        this.f18193OooO0o0 = this.f18193OooO0o0.getUnmodifiableView();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f18193OooO0o0 = this.f18193OooO0o0.getUnmodifiableView();
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public static class OooO00o extends AbstractParser<Monitoring> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Monitoring(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18197OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> f18198OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List<MonitoringDestination> f18199OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<MonitoringDestination> f18200OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> f18201OooO0oo;

        public OooO0O0() {
            this.f18199OooO0o0 = Collections.emptyList();
            this.f18200OooO0oO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0oO();
                OooO0o();
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Monitoring monitoring;
            try {
                try {
                    Monitoring.f18185OooO0oo.getClass();
                    OooO0oo(new Monitoring(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    monitoring = (Monitoring) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (monitoring != null) {
                            OooO0oo(monitoring);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                monitoring = null;
                if (monitoring != null) {
                    OooO0oo(monitoring);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Monitoring buildPartial() {
            Monitoring monitoring = new Monitoring(this);
            int i = this.f18197OooO0Oo;
            RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18198OooO0o;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.f18199OooO0o0 = Collections.unmodifiableList(this.f18199OooO0o0);
                    this.f18197OooO0Oo &= -2;
                }
                monitoring.f18186OooO0Oo = this.f18199OooO0o0;
            } else {
                monitoring.f18186OooO0Oo = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18201OooO0oo;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f18197OooO0Oo & 2) != 0) {
                    this.f18200OooO0oO = Collections.unmodifiableList(this.f18200OooO0oO);
                    this.f18197OooO0Oo &= -3;
                }
                monitoring.f18188OooO0o0 = this.f18200OooO0oO;
            } else {
                monitoring.f18188OooO0o0 = repeatedFieldBuilderV4.build();
            }
            onBuilt();
            return monitoring;
        }

        public final void OooO0Oo() {
            super.clear();
            RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18198OooO0o;
            if (repeatedFieldBuilderV3 == null) {
                this.f18199OooO0o0 = Collections.emptyList();
                this.f18197OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18201OooO0oo;
            if (repeatedFieldBuilderV4 != null) {
                repeatedFieldBuilderV4.clear();
            } else {
                this.f18200OooO0oO = Collections.emptyList();
                this.f18197OooO0Oo &= -3;
            }
        }

        public final RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> OooO0o() {
            if (this.f18201OooO0oo == null) {
                this.f18201OooO0oo = new RepeatedFieldBuilderV3<>(this.f18200OooO0oO, (this.f18197OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18200OooO0oO = null;
            }
            return this.f18201OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final RepeatedFieldBuilderV3<MonitoringDestination, MonitoringDestination.OooO0O0, Object> OooO0oO() {
            if (this.f18198OooO0o == null) {
                this.f18198OooO0o = new RepeatedFieldBuilderV3<>(this.f18199OooO0o0, (this.f18197OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18199OooO0o0 = null;
            }
            return this.f18198OooO0o;
        }

        public final void OooO0oo(Monitoring monitoring) {
            if (monitoring == Monitoring.f18184OooO0oO) {
                return;
            }
            if (this.f18198OooO0o == null) {
                if (!monitoring.f18186OooO0Oo.isEmpty()) {
                    if (this.f18199OooO0o0.isEmpty()) {
                        this.f18199OooO0o0 = monitoring.f18186OooO0Oo;
                        this.f18197OooO0Oo &= -2;
                    } else {
                        if ((this.f18197OooO0Oo & 1) == 0) {
                            this.f18199OooO0o0 = new ArrayList(this.f18199OooO0o0);
                            this.f18197OooO0Oo |= 1;
                        }
                        this.f18199OooO0o0.addAll(monitoring.f18186OooO0Oo);
                    }
                    onChanged();
                }
            } else if (!monitoring.f18186OooO0Oo.isEmpty()) {
                if (this.f18198OooO0o.isEmpty()) {
                    this.f18198OooO0o.dispose();
                    this.f18198OooO0o = null;
                    this.f18199OooO0o0 = monitoring.f18186OooO0Oo;
                    this.f18197OooO0Oo &= -2;
                    this.f18198OooO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f18198OooO0o.addAllMessages(monitoring.f18186OooO0Oo);
                }
            }
            if (this.f18201OooO0oo == null) {
                if (!monitoring.f18188OooO0o0.isEmpty()) {
                    if (this.f18200OooO0oO.isEmpty()) {
                        this.f18200OooO0oO = monitoring.f18188OooO0o0;
                        this.f18197OooO0Oo &= -3;
                    } else {
                        if ((this.f18197OooO0Oo & 2) == 0) {
                            this.f18200OooO0oO = new ArrayList(this.f18200OooO0oO);
                            this.f18197OooO0Oo |= 2;
                        }
                        this.f18200OooO0oO.addAll(monitoring.f18188OooO0o0);
                    }
                    onChanged();
                }
            } else if (!monitoring.f18188OooO0o0.isEmpty()) {
                if (this.f18201OooO0oo.isEmpty()) {
                    this.f18201OooO0oo.dispose();
                    this.f18201OooO0oo = null;
                    this.f18200OooO0oO = monitoring.f18188OooO0o0;
                    this.f18197OooO0Oo &= -3;
                    this.f18201OooO0oo = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18201OooO0oo.addAllMessages(monitoring.f18188OooO0o0);
                }
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final Message build() {
            Monitoring monitoringBuildPartial = buildPartial();
            if (monitoringBuildPartial.isInitialized()) {
                return monitoringBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoringBuildPartial);
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
            return Monitoring.f18184OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0Oo0oo.f41283OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0Oo0oo.f41284OooO0O0.ensureFieldAccessorsInitialized(Monitoring.class, OooO0O0.class);
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
            return Monitoring.f18184OooO0oO;
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
            Monitoring monitoringBuildPartial = buildPartial();
            if (monitoringBuildPartial.isInitialized()) {
                return monitoringBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitoringBuildPartial);
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
            if (message instanceof Monitoring) {
                OooO0oo((Monitoring) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18199OooO0o0 = Collections.emptyList();
            this.f18200OooO0oO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0oO();
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Monitoring) {
                OooO0oo((Monitoring) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public Monitoring(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18187OooO0o = (byte) -1;
    }

    public static OooO00o OooO0OO() {
        return f18185OooO0oo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18184OooO0oO) {
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
        if (!(obj instanceof Monitoring)) {
            return super.equals(obj);
        }
        Monitoring monitoring = (Monitoring) obj;
        return this.f18186OooO0Oo.equals(monitoring.f18186OooO0Oo) && this.f18188OooO0o0.equals(monitoring.f18188OooO0o0) && this.unknownFields.equals(monitoring.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18184OooO0oO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Monitoring> getParserForType() {
        return f18185OooO0oo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.f18186OooO0Oo.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f18186OooO0Oo.get(i2));
        }
        for (int i3 = 0; i3 < this.f18188OooO0o0.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f18188OooO0o0.get(i3));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
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
        int iHashCode = o0Oo0oo.f41283OooO00o.hashCode() + 779;
        if (this.f18186OooO0Oo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 1, 53) + this.f18186OooO0Oo.hashCode();
        }
        if (this.f18188OooO0o0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 2, 53) + this.f18188OooO0o0.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0Oo0oo.f41284OooO0O0.ensureFieldAccessorsInitialized(Monitoring.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18187OooO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18187OooO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18184OooO0oO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Monitoring();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18186OooO0Oo.size(); i++) {
            codedOutputStream.writeMessage(1, this.f18186OooO0Oo.get(i));
        }
        for (int i2 = 0; i2 < this.f18188OooO0o0.size(); i2++) {
            codedOutputStream.writeMessage(2, this.f18188OooO0o0.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18184OooO0oO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18184OooO0oO.toBuilder();
    }

    private Monitoring() {
        this.f18187OooO0o = (byte) -1;
        this.f18186OooO0Oo = Collections.emptyList();
        this.f18188OooO0o0 = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public Monitoring(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                if ((i & 1) == 0) {
                                    this.f18186OooO0Oo = new ArrayList();
                                    i |= 1;
                                }
                                this.f18186OooO0Oo.add((MonitoringDestination) codedInputStream.readMessage(MonitoringDestination.f18190OooO0oo, extensionRegistryLite));
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 2) == 0) {
                                    this.f18188OooO0o0 = new ArrayList();
                                    i |= 2;
                                }
                                this.f18188OooO0o0.add((MonitoringDestination) codedInputStream.readMessage(MonitoringDestination.f18190OooO0oo, extensionRegistryLite));
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
                    this.f18186OooO0Oo = Collections.unmodifiableList(this.f18186OooO0Oo);
                }
                if ((i & 2) != 0) {
                    this.f18188OooO0o0 = Collections.unmodifiableList(this.f18188OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f18186OooO0Oo = Collections.unmodifiableList(this.f18186OooO0Oo);
        }
        if ((i & 2) != 0) {
            this.f18188OooO0o0 = Collections.unmodifiableList(this.f18188OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
