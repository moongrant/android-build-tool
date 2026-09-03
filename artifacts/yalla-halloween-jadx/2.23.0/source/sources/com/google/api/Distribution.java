package com.google.api;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O00.o000000O;
import p069o0000ooO.o000000;
import p320o0O0oo0o.o00;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class Distribution extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Internal.LongList f18379OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f18380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f18381OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f18382OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Range f18383OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public BucketOptions f18384OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f18385OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public List<Exemplar> f18386OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte f18387OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Distribution f18378OooOOO0 = new Distribution();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f18377OooOOO = new OooO00o();

    public static final class BucketOptions extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final BucketOptions f18388OooO0oO = new BucketOptions();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f18389OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18390OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f18391OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18392OooO0o0;

        public static final class Explicit extends GeneratedMessageV3 implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public static final Explicit f18393OooO0oO = new Explicit();

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final OooO00o f18394OooO0oo = new OooO00o();

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Internal.DoubleList f18395OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public byte f18396OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f18397OooO0o0;

            public static class OooO00o extends AbstractParser<Explicit> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Explicit(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f18398OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public Internal.DoubleList f18399OooO0o0;

                public OooO0O0() {
                    Explicit explicit = Explicit.f18393OooO0oO;
                    this.f18399OooO0o0 = GeneratedMessageV3.emptyDoubleList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Explicit buildPartial() {
                    Explicit explicit = new Explicit(this);
                    if ((this.f18398OooO0Oo & 1) != 0) {
                        this.f18399OooO0o0.makeImmutable();
                        this.f18398OooO0Oo &= -2;
                    }
                    explicit.f18395OooO0Oo = this.f18399OooO0o0;
                    onBuilt();
                    return explicit;
                }

                public final void OooO0Oo() {
                    super.clear();
                    Explicit explicit = Explicit.f18393OooO0oO;
                    this.f18399OooO0o0 = GeneratedMessageV3.emptyDoubleList();
                    this.f18398OooO0Oo &= -2;
                }

                public final void OooO0o(Explicit explicit) {
                    if (explicit == Explicit.f18393OooO0oO) {
                        return;
                    }
                    if (!explicit.f18395OooO0Oo.isEmpty()) {
                        if (this.f18399OooO0o0.isEmpty()) {
                            this.f18399OooO0o0 = explicit.f18395OooO0Oo;
                            this.f18398OooO0Oo &= -2;
                        } else {
                            if ((this.f18398OooO0Oo & 1) == 0) {
                                this.f18399OooO0o0 = GeneratedMessageV3.mutableCopy(this.f18399OooO0o0);
                                this.f18398OooO0Oo |= 1;
                            }
                            this.f18399OooO0o0.addAll(explicit.f18395OooO0Oo);
                        }
                        onChanged();
                    }
                    onChanged();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
                public final OooO0O0 mo4013clone() {
                    return (OooO0O0) super.mo4013clone();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0022  */
                public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Explicit explicit;
                    try {
                        try {
                            Explicit.f18394OooO0oo.getClass();
                            OooO0o(new Explicit(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e) {
                            explicit = (Explicit) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                if (explicit != null) {
                                    OooO0o(explicit);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        explicit = null;
                        if (explicit != null) {
                            OooO0o(explicit);
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
                    Explicit explicitBuildPartial = buildPartial();
                    if (explicitBuildPartial.isInitialized()) {
                        return explicitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) explicitBuildPartial);
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
                    return Explicit.f18393OooO0oO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return o00.f42695OooOO0O;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return o00.f42696OooOO0o.ensureFieldAccessorsInitialized(Explicit.class, OooO0O0.class);
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
                    return Explicit.f18393OooO0oO;
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
                    Explicit explicitBuildPartial = buildPartial();
                    if (explicitBuildPartial.isInitialized()) {
                        return explicitBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) explicitBuildPartial);
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
                    Explicit explicit = Explicit.f18393OooO0oO;
                    this.f18399OooO0o0 = GeneratedMessageV3.emptyDoubleList();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final AbstractMessage.Builder mergeFrom(Message message) {
                    if (message instanceof Explicit) {
                        OooO0o((Explicit) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Message.Builder mergeFrom(Message message) {
                    if (message instanceof Explicit) {
                        OooO0o((Explicit) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }
            }

            public Explicit(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.f18397OooO0o0 = -1;
                this.f18396OooO0o = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f18393OooO0oO) {
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
                if (!(obj instanceof Explicit)) {
                    return super.equals(obj);
                }
                Explicit explicit = (Explicit) obj;
                return this.f18395OooO0Oo.equals(explicit.f18395OooO0Oo) && this.unknownFields.equals(explicit.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f18393OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Explicit> getParserForType() {
                return f18394OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int size = this.f18395OooO0Oo.size() * 8;
                int iComputeInt32SizeNoTag = size + 0;
                if (!this.f18395OooO0Oo.isEmpty()) {
                    iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(size);
                }
                this.f18397OooO0o0 = size;
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32SizeNoTag;
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
                int iHashCode = o00.f42695OooOO0O.hashCode() + 779;
                if (this.f18395OooO0Oo.size() > 0) {
                    iHashCode = o000000O.OooO00o(iHashCode, 37, 1, 53) + this.f18395OooO0Oo.hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42696OooOO0o.ensureFieldAccessorsInitialized(Explicit.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f18396OooO0o;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f18396OooO0o = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f18393OooO0oO.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Explicit();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (this.f18395OooO0Oo.size() > 0) {
                    codedOutputStream.writeUInt32NoTag(10);
                    codedOutputStream.writeUInt32NoTag(this.f18397OooO0o0);
                }
                for (int i = 0; i < this.f18395OooO0Oo.size(); i++) {
                    codedOutputStream.writeDoubleNoTag(this.f18395OooO0Oo.getDouble(i));
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f18393OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f18393OooO0oO.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new OooO0O0(builderParent);
            }

            private Explicit() {
                this.f18397OooO0o0 = -1;
                this.f18396OooO0o = (byte) -1;
                this.f18395OooO0Oo = GeneratedMessageV3.emptyDoubleList();
            }

            public Explicit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    if (tag == 9) {
                                        if (!(z2 & true)) {
                                            this.f18395OooO0Oo = GeneratedMessageV3.newDoubleList();
                                            z2 |= true;
                                        }
                                        this.f18395OooO0Oo.addDouble(codedInputStream.readDouble());
                                    } else if (tag != 10) {
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f18395OooO0Oo = GeneratedMessageV3.newDoubleList();
                                            z2 |= true;
                                        }
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f18395OooO0Oo.addDouble(codedInputStream.readDouble());
                                        }
                                        codedInputStream.popLimit(iPushLimit);
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
                            this.f18395OooO0Oo.makeImmutable();
                        }
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f18395OooO0Oo.makeImmutable();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }
        }

        public static final class Exponential extends GeneratedMessageV3 implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18402OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public double f18403OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f18404OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public byte f18405OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final Exponential f18401OooO0oo = new Exponential();

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public static final OooO00o f18400OooO = new OooO00o();

            public static class OooO00o extends AbstractParser<Exponential> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Exponential(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f18406OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public double f18407OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public double f18408OooO0o0;

                public OooO0O0() {
                    Exponential exponential = Exponential.f18401OooO0oo;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Exponential buildPartial() {
                    Exponential exponential = new Exponential(this);
                    exponential.f18402OooO0Oo = this.f18406OooO0Oo;
                    exponential.f18404OooO0o0 = this.f18408OooO0o0;
                    exponential.f18403OooO0o = this.f18407OooO0o;
                    onBuilt();
                    return exponential;
                }

                public final void OooO0Oo() {
                    super.clear();
                    this.f18406OooO0Oo = 0;
                    this.f18408OooO0o0 = 0.0d;
                    this.f18407OooO0o = 0.0d;
                }

                public final void OooO0o(Exponential exponential) {
                    if (exponential == Exponential.f18401OooO0oo) {
                        return;
                    }
                    int i = exponential.f18402OooO0Oo;
                    if (i != 0) {
                        this.f18406OooO0Oo = i;
                        onChanged();
                    }
                    double d = exponential.f18404OooO0o0;
                    if (d != 0.0d) {
                        this.f18408OooO0o0 = d;
                        onChanged();
                    }
                    double d2 = exponential.f18403OooO0o;
                    if (d2 != 0.0d) {
                        this.f18407OooO0o = d2;
                        onChanged();
                    }
                    onChanged();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
                public final OooO0O0 mo4013clone() {
                    return (OooO0O0) super.mo4013clone();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0022  */
                public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Exponential exponential;
                    try {
                        try {
                            Exponential.f18400OooO.getClass();
                            OooO0o(new Exponential(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e) {
                            exponential = (Exponential) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                if (exponential != null) {
                                    OooO0o(exponential);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        exponential = null;
                        if (exponential != null) {
                            OooO0o(exponential);
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
                    Exponential exponentialBuildPartial = buildPartial();
                    if (exponentialBuildPartial.isInitialized()) {
                        return exponentialBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) exponentialBuildPartial);
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
                    return Exponential.f18401OooO0oo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return o00.f42685OooO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return o00.f42694OooOO0.ensureFieldAccessorsInitialized(Exponential.class, OooO0O0.class);
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
                    return Exponential.f18401OooO0oo;
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

                public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    Exponential exponential = Exponential.f18401OooO0oo;
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
                    Exponential exponentialBuildPartial = buildPartial();
                    if (exponentialBuildPartial.isInitialized()) {
                        return exponentialBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) exponentialBuildPartial);
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
                    if (message instanceof Exponential) {
                        OooO0o((Exponential) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Message.Builder mergeFrom(Message message) {
                    if (message instanceof Exponential) {
                        OooO0o((Exponential) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }
            }

            public Exponential(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.f18405OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f18401OooO0oo) {
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
                if (!(obj instanceof Exponential)) {
                    return super.equals(obj);
                }
                Exponential exponential = (Exponential) obj;
                return this.f18402OooO0Oo == exponential.f18402OooO0Oo && Double.doubleToLongBits(this.f18404OooO0o0) == Double.doubleToLongBits(exponential.f18404OooO0o0) && Double.doubleToLongBits(this.f18403OooO0o) == Double.doubleToLongBits(exponential.f18403OooO0o) && this.unknownFields.equals(exponential.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f18401OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Exponential> getParserForType() {
                return f18400OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.f18402OooO0Oo;
                int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.f18404OooO0o0) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.f18404OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f18403OooO0o) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.f18403OooO0o);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
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
                int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f18403OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f18404OooO0o0)) + o000000.OooO00o(o000Oo0.OooO00o(o00.f42685OooO, 779, 37, 1, 53), this.f18402OooO0Oo, 37, 2, 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42694OooOO0.ensureFieldAccessorsInitialized(Exponential.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f18405OooO0oO;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f18405OooO0oO = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f18401OooO0oo.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Exponential();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.f18402OooO0Oo;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.f18404OooO0o0) != 0) {
                    codedOutputStream.writeDouble(2, this.f18404OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f18403OooO0o) != 0) {
                    codedOutputStream.writeDouble(3, this.f18403OooO0o);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f18401OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f18401OooO0oo.toBuilder();
            }

            private Exponential() {
                this.f18405OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new OooO0O0(builderParent);
            }

            public Exponential(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f18402OooO0Oo = codedInputStream.readInt32();
                                } else if (tag == 17) {
                                    this.f18404OooO0o0 = codedInputStream.readDouble();
                                } else if (tag != 25) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f18403OooO0o = codedInputStream.readDouble();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (UninitializedMessageException e2) {
                            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static final class Linear extends GeneratedMessageV3 implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18411OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public double f18412OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f18413OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public byte f18414OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final Linear f18410OooO0oo = new Linear();

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public static final OooO00o f18409OooO = new OooO00o();

            public static class OooO00o extends AbstractParser<Linear> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Linear(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f18415OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public double f18416OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public double f18417OooO0o0;

                public OooO0O0() {
                    Linear linear = Linear.f18410OooO0oo;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Linear buildPartial() {
                    Linear linear = new Linear(this);
                    linear.f18411OooO0Oo = this.f18415OooO0Oo;
                    linear.f18413OooO0o0 = this.f18417OooO0o0;
                    linear.f18412OooO0o = this.f18416OooO0o;
                    onBuilt();
                    return linear;
                }

                public final void OooO0Oo() {
                    super.clear();
                    this.f18415OooO0Oo = 0;
                    this.f18417OooO0o0 = 0.0d;
                    this.f18416OooO0o = 0.0d;
                }

                public final void OooO0o(Linear linear) {
                    if (linear == Linear.f18410OooO0oo) {
                        return;
                    }
                    int i = linear.f18411OooO0Oo;
                    if (i != 0) {
                        this.f18415OooO0Oo = i;
                        onChanged();
                    }
                    double d = linear.f18413OooO0o0;
                    if (d != 0.0d) {
                        this.f18417OooO0o0 = d;
                        onChanged();
                    }
                    double d2 = linear.f18412OooO0o;
                    if (d2 != 0.0d) {
                        this.f18416OooO0o = d2;
                        onChanged();
                    }
                    onChanged();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
                public final OooO0O0 mo4013clone() {
                    return (OooO0O0) super.mo4013clone();
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0022  */
                public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Linear linear;
                    try {
                        try {
                            Linear.f18409OooO.getClass();
                            OooO0o(new Linear(codedInputStream, extensionRegistryLite));
                        } catch (InvalidProtocolBufferException e) {
                            linear = (Linear) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                if (linear != null) {
                                    OooO0o(linear);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        linear = null;
                        if (linear != null) {
                            OooO0o(linear);
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
                    Linear linearBuildPartial = buildPartial();
                    if (linearBuildPartial.isInitialized()) {
                        return linearBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) linearBuildPartial);
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
                    return Linear.f18410OooO0oo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return o00.f42692OooO0oO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return o00.f42693OooO0oo.ensureFieldAccessorsInitialized(Linear.class, OooO0O0.class);
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
                    return Linear.f18410OooO0oo;
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

                public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    Linear linear = Linear.f18410OooO0oo;
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
                    Linear linearBuildPartial = buildPartial();
                    if (linearBuildPartial.isInitialized()) {
                        return linearBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) linearBuildPartial);
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
                    if (message instanceof Linear) {
                        OooO0o((Linear) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Message.Builder mergeFrom(Message message) {
                    if (message instanceof Linear) {
                        OooO0o((Linear) message);
                    } else {
                        super.mergeFrom(message);
                    }
                    return this;
                }
            }

            public Linear(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.f18414OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f18410OooO0oo) {
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
                if (!(obj instanceof Linear)) {
                    return super.equals(obj);
                }
                Linear linear = (Linear) obj;
                return this.f18411OooO0Oo == linear.f18411OooO0Oo && Double.doubleToLongBits(this.f18413OooO0o0) == Double.doubleToLongBits(linear.f18413OooO0o0) && Double.doubleToLongBits(this.f18412OooO0o) == Double.doubleToLongBits(linear.f18412OooO0o) && this.unknownFields.equals(linear.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f18410OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Linear> getParserForType() {
                return f18409OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.f18411OooO0Oo;
                int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.f18413OooO0o0) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.f18413OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f18412OooO0o) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.f18412OooO0o);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
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
                int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f18412OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f18413OooO0o0)) + o000000.OooO00o(o000Oo0.OooO00o(o00.f42692OooO0oO, 779, 37, 1, 53), this.f18411OooO0Oo, 37, 2, 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42693OooO0oo.ensureFieldAccessorsInitialized(Linear.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f18414OooO0oO;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f18414OooO0oO = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f18410OooO0oo.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Linear();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.f18411OooO0Oo;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.f18413OooO0o0) != 0) {
                    codedOutputStream.writeDouble(2, this.f18413OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f18412OooO0o) != 0) {
                    codedOutputStream.writeDouble(3, this.f18412OooO0o);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f18410OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f18410OooO0oo.toBuilder();
            }

            private Linear() {
                this.f18414OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new OooO0O0(builderParent);
            }

            public Linear(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f18411OooO0Oo = codedInputStream.readInt32();
                                } else if (tag == 17) {
                                    this.f18413OooO0o0 = codedInputStream.readDouble();
                                } else if (tag != 25) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f18412OooO0o = codedInputStream.readDouble();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (UninitializedMessageException e2) {
                            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static class OooO00o extends AbstractParser<BucketOptions> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new BucketOptions(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18418OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public GeneratedMessageV3 f18419OooO0o0;

            public OooO0O0() {
                this.f18418OooO0Oo = 0;
                BucketOptions bucketOptions = BucketOptions.f18388OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final BucketOptions buildPartial() {
                BucketOptions bucketOptions = new BucketOptions(this);
                int i = this.f18418OooO0Oo;
                if (i == 1) {
                    bucketOptions.f18392OooO0o0 = this.f18419OooO0o0;
                }
                if (i == 2) {
                    bucketOptions.f18392OooO0o0 = this.f18419OooO0o0;
                }
                if (i == 3) {
                    bucketOptions.f18392OooO0o0 = this.f18419OooO0o0;
                }
                bucketOptions.f18390OooO0Oo = i;
                onBuilt();
                return bucketOptions;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                BucketOptions bucketOptions;
                try {
                    try {
                        BucketOptions.f18389OooO0oo.getClass();
                        OooO0o0(new BucketOptions(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        bucketOptions = (BucketOptions) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (bucketOptions != null) {
                                OooO0o0(bucketOptions);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bucketOptions = null;
                    if (bucketOptions != null) {
                        OooO0o0(bucketOptions);
                    }
                    throw th;
                }
            }

            public final void OooO0o0(BucketOptions bucketOptions) {
                GeneratedMessageV3 generatedMessageV3;
                Linear linear;
                GeneratedMessageV3 generatedMessageV4;
                Exponential exponential;
                GeneratedMessageV3 generatedMessageV5;
                Explicit explicit;
                if (bucketOptions == BucketOptions.f18388OooO0oO) {
                    return;
                }
                int i = OooO0O0.f18431OooO00o[bucketOptions.OooO0o0().ordinal()];
                if (i == 1) {
                    Linear linearOooO0Oo = bucketOptions.OooO0Oo();
                    if (this.f18418OooO0Oo != 1 || (generatedMessageV3 = this.f18419OooO0o0) == (linear = Linear.f18410OooO0oo)) {
                        this.f18419OooO0o0 = linearOooO0Oo;
                    } else {
                        Linear.OooO0O0 builder = linear.toBuilder();
                        builder.OooO0o((Linear) generatedMessageV3);
                        builder.OooO0o(linearOooO0Oo);
                        this.f18419OooO0o0 = builder.buildPartial();
                    }
                    onChanged();
                    this.f18418OooO0Oo = 1;
                } else if (i == 2) {
                    Exponential exponentialOooO0OO = bucketOptions.OooO0OO();
                    if (this.f18418OooO0Oo != 2 || (generatedMessageV4 = this.f18419OooO0o0) == (exponential = Exponential.f18401OooO0oo)) {
                        this.f18419OooO0o0 = exponentialOooO0OO;
                    } else {
                        Exponential.OooO0O0 builder2 = exponential.toBuilder();
                        builder2.OooO0o((Exponential) generatedMessageV4);
                        builder2.OooO0o(exponentialOooO0OO);
                        this.f18419OooO0o0 = builder2.buildPartial();
                    }
                    onChanged();
                    this.f18418OooO0Oo = 2;
                } else if (i == 3) {
                    Explicit explicitOooO0O0 = bucketOptions.OooO0O0();
                    if (this.f18418OooO0Oo != 3 || (generatedMessageV5 = this.f18419OooO0o0) == (explicit = Explicit.f18393OooO0oO)) {
                        this.f18419OooO0o0 = explicitOooO0O0;
                    } else {
                        Explicit.OooO0O0 builder3 = explicit.toBuilder();
                        builder3.OooO0o((Explicit) generatedMessageV5);
                        builder3.OooO0o(explicitOooO0O0);
                        this.f18419OooO0o0 = builder3.buildPartial();
                    }
                    onChanged();
                    this.f18418OooO0Oo = 3;
                }
                onChanged();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (OooO0O0) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message build() {
                BucketOptions bucketOptionsBuildPartial = buildPartial();
                if (bucketOptionsBuildPartial.isInitialized()) {
                    return bucketOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bucketOptionsBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clear() {
                super.clear();
                this.f18418OooO0Oo = 0;
                this.f18419OooO0o0 = null;
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
                return BucketOptions.f18388OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o00.f42691OooO0o0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42690OooO0o.ensureFieldAccessorsInitialized(BucketOptions.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
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
                return BucketOptions.f18388OooO0oO;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0O0) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18418OooO0Oo = 0;
                BucketOptions bucketOptions = BucketOptions.f18388OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                BucketOptions bucketOptionsBuildPartial = buildPartial();
                if (bucketOptionsBuildPartial.isInitialized()) {
                    return bucketOptionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bucketOptionsBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clear() {
                super.clear();
                this.f18418OooO0Oo = 0;
                this.f18419OooO0o0 = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof BucketOptions) {
                    OooO0o0((BucketOptions) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clear() {
                super.clear();
                this.f18418OooO0Oo = 0;
                this.f18419OooO0o0 = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof BucketOptions) {
                    OooO0o0((BucketOptions) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite.Builder clear() {
                super.clear();
                this.f18418OooO0Oo = 0;
                this.f18419OooO0o0 = null;
                return this;
            }
        }

        public enum OptionsCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);

            private final int value;

            OptionsCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                return this.value;
            }
        }

        public BucketOptions(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f18390OooO0Oo = 0;
            this.f18391OooO0o = (byte) -1;
        }

        public final Explicit OooO0O0() {
            return this.f18390OooO0Oo == 3 ? (Explicit) this.f18392OooO0o0 : Explicit.f18393OooO0oO;
        }

        public final Exponential OooO0OO() {
            return this.f18390OooO0Oo == 2 ? (Exponential) this.f18392OooO0o0 : Exponential.f18401OooO0oo;
        }

        public final Linear OooO0Oo() {
            return this.f18390OooO0Oo == 1 ? (Linear) this.f18392OooO0o0 : Linear.f18410OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f18388OooO0oO) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o0(this);
            return oooO0O0;
        }

        public final OptionsCase OooO0o0() {
            int i = this.f18390OooO0Oo;
            if (i == 0) {
                return OptionsCase.OPTIONS_NOT_SET;
            }
            if (i == 1) {
                return OptionsCase.LINEAR_BUCKETS;
            }
            if (i == 2) {
                return OptionsCase.EXPONENTIAL_BUCKETS;
            }
            if (i != 3) {
                return null;
            }
            return OptionsCase.EXPLICIT_BUCKETS;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BucketOptions)) {
                return super.equals(obj);
            }
            BucketOptions bucketOptions = (BucketOptions) obj;
            if (!OooO0o0().equals(bucketOptions.OooO0o0())) {
                return false;
            }
            int i = this.f18390OooO0Oo;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !OooO0O0().equals(bucketOptions.OooO0O0())) {
                        return false;
                    }
                } else if (!OooO0OO().equals(bucketOptions.OooO0OO())) {
                    return false;
                }
            } else if (!OooO0Oo().equals(bucketOptions.OooO0Oo())) {
                return false;
            }
            return this.unknownFields.equals(bucketOptions.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f18388OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<BucketOptions> getParserForType() {
            return f18389OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = this.f18390OooO0Oo == 1 ? 0 + CodedOutputStream.computeMessageSize(1, (Linear) this.f18392OooO0o0) : 0;
            if (this.f18390OooO0Oo == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (Exponential) this.f18392OooO0o0);
            }
            if (this.f18390OooO0Oo == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (Explicit) this.f18392OooO0o0);
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
            int iOooO00o;
            int iHashCode;
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode2 = o00.f42691OooO0o0.hashCode() + 779;
            int i2 = this.f18390OooO0Oo;
            if (i2 == 1) {
                iOooO00o = o000000O.OooO00o(iHashCode2, 37, 1, 53);
                iHashCode = OooO0Oo().hashCode();
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        iOooO00o = o000000O.OooO00o(iHashCode2, 37, 3, 53);
                        iHashCode = OooO0O0().hashCode();
                    }
                    int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                iOooO00o = o000000O.OooO00o(iHashCode2, 37, 2, 53);
                iHashCode = OooO0OO().hashCode();
            }
            iHashCode2 = iOooO00o + iHashCode;
            int iHashCode4 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00.f42690OooO0o.ensureFieldAccessorsInitialized(BucketOptions.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f18391OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f18391OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f18388OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BucketOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f18390OooO0Oo == 1) {
                codedOutputStream.writeMessage(1, (Linear) this.f18392OooO0o0);
            }
            if (this.f18390OooO0Oo == 2) {
                codedOutputStream.writeMessage(2, (Exponential) this.f18392OooO0o0);
            }
            if (this.f18390OooO0Oo == 3) {
                codedOutputStream.writeMessage(3, (Explicit) this.f18392OooO0o0);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f18388OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f18388OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        private BucketOptions() {
            this.f18390OooO0Oo = 0;
            this.f18391OooO0o = (byte) -1;
        }

        public BucketOptions(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    Linear.OooO0O0 builder = this.f18390OooO0Oo == 1 ? ((Linear) this.f18392OooO0o0).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Linear.f18409OooO, extensionRegistryLite);
                                    this.f18392OooO0o0 = message;
                                    if (builder != null) {
                                        builder.OooO0o((Linear) message);
                                        this.f18392OooO0o0 = builder.buildPartial();
                                    }
                                    this.f18390OooO0Oo = 1;
                                } else if (tag == 18) {
                                    Exponential.OooO0O0 builder2 = this.f18390OooO0Oo == 2 ? ((Exponential) this.f18392OooO0o0).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(Exponential.f18400OooO, extensionRegistryLite);
                                    this.f18392OooO0o0 = message2;
                                    if (builder2 != null) {
                                        builder2.OooO0o((Exponential) message2);
                                        this.f18392OooO0o0 = builder2.buildPartial();
                                    }
                                    this.f18390OooO0Oo = 2;
                                } else if (tag != 26) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Explicit.OooO0O0 builder3 = this.f18390OooO0Oo == 3 ? ((Explicit) this.f18392OooO0o0).toBuilder() : null;
                                    MessageLite message3 = codedInputStream.readMessage(Explicit.f18394OooO0oo, extensionRegistryLite);
                                    this.f18392OooO0o0 = message3;
                                    if (builder3 != null) {
                                        builder3.OooO0o((Explicit) message3);
                                        this.f18392OooO0o0 = builder3.buildPartial();
                                    }
                                    this.f18390OooO0Oo = 3;
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
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public static final class Exemplar extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f18422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<Any> f18423OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Timestamp f18424OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte f18425OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final Exemplar f18421OooO0oo = new Exemplar();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f18420OooO = new OooO00o();

        public static class OooO00o extends AbstractParser<Exemplar> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Exemplar(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f18426OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Timestamp f18427OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f18428OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public List<Any> f18429OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> f18430OooO0oo;

            public OooO0O0() {
                this.f18429OooO0oO = Collections.emptyList();
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    OooO0o();
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Exemplar buildPartial() {
                Exemplar exemplar = new Exemplar(this);
                int i = this.f18426OooO0Oo;
                exemplar.f18422OooO0Oo = this.f18428OooO0o0;
                exemplar.f18424OooO0o0 = this.f18427OooO0o;
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f18430OooO0oo;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) != 0) {
                        this.f18429OooO0oO = Collections.unmodifiableList(this.f18429OooO0oO);
                        this.f18426OooO0Oo &= -2;
                    }
                    exemplar.f18423OooO0o = this.f18429OooO0oO;
                } else {
                    exemplar.f18423OooO0o = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return exemplar;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f18428OooO0o0 = 0.0d;
                this.f18427OooO0o = null;
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f18430OooO0oo;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                } else {
                    this.f18429OooO0oO = Collections.emptyList();
                    this.f18426OooO0Oo &= -2;
                }
            }

            public final RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> OooO0o() {
                if (this.f18430OooO0oo == null) {
                    this.f18430OooO0oo = new RepeatedFieldBuilderV3<>(this.f18429OooO0oO, (this.f18426OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                    this.f18429OooO0oO = null;
                }
                return this.f18430OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            public final void OooO0oO(Exemplar exemplar) {
                if (exemplar == Exemplar.f18421OooO0oo) {
                    return;
                }
                double d = exemplar.f18422OooO0Oo;
                if (d != 0.0d) {
                    this.f18428OooO0o0 = d;
                    onChanged();
                }
                if (exemplar.f18424OooO0o0 != null) {
                    Timestamp timestampOooO0O0 = exemplar.OooO0O0();
                    Timestamp timestamp = this.f18427OooO0o;
                    if (timestamp != null) {
                        this.f18427OooO0o = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0O0).buildPartial();
                    } else {
                        this.f18427OooO0o = timestampOooO0O0;
                    }
                    onChanged();
                }
                if (this.f18430OooO0oo == null) {
                    if (!exemplar.f18423OooO0o.isEmpty()) {
                        if (this.f18429OooO0oO.isEmpty()) {
                            this.f18429OooO0oO = exemplar.f18423OooO0o;
                            this.f18426OooO0Oo &= -2;
                        } else {
                            if ((this.f18426OooO0Oo & 1) == 0) {
                                this.f18429OooO0oO = new ArrayList(this.f18429OooO0oO);
                                this.f18426OooO0Oo |= 1;
                            }
                            this.f18429OooO0oO.addAll(exemplar.f18423OooO0o);
                        }
                        onChanged();
                    }
                } else if (!exemplar.f18423OooO0o.isEmpty()) {
                    if (this.f18430OooO0oo.isEmpty()) {
                        this.f18430OooO0oo.dispose();
                        this.f18430OooO0oo = null;
                        this.f18429OooO0oO = exemplar.f18423OooO0o;
                        this.f18426OooO0Oo &= -2;
                        this.f18430OooO0oo = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                    } else {
                        this.f18430OooO0oo.addAllMessages(exemplar.f18423OooO0o);
                    }
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Exemplar exemplar;
                try {
                    try {
                        Exemplar.f18420OooO.getClass();
                        OooO0oO(new Exemplar(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        exemplar = (Exemplar) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (exemplar != null) {
                                OooO0oO(exemplar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    exemplar = null;
                    if (exemplar != null) {
                        OooO0oO(exemplar);
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
                Exemplar exemplarBuildPartial = buildPartial();
                if (exemplarBuildPartial.isInitialized()) {
                    return exemplarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) exemplarBuildPartial);
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
                return Exemplar.f18421OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o00.f42698OooOOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42697OooOOO.ensureFieldAccessorsInitialized(Exemplar.class, OooO0O0.class);
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
                return Exemplar.f18421OooO0oo;
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
                Exemplar exemplarBuildPartial = buildPartial();
                if (exemplarBuildPartial.isInitialized()) {
                    return exemplarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) exemplarBuildPartial);
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

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18429OooO0oO = Collections.emptyList();
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    OooO0o();
                }
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Exemplar) {
                    OooO0oO((Exemplar) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Exemplar) {
                    OooO0oO((Exemplar) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }
        }

        public Exemplar(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f18425OooO0oO = (byte) -1;
        }

        public final Timestamp OooO0O0() {
            Timestamp timestamp = this.f18424OooO0o0;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f18421OooO0oo) {
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
            if (!(obj instanceof Exemplar)) {
                return super.equals(obj);
            }
            Exemplar exemplar = (Exemplar) obj;
            if (Double.doubleToLongBits(this.f18422OooO0Oo) != Double.doubleToLongBits(exemplar.f18422OooO0Oo)) {
                return false;
            }
            Timestamp timestamp = this.f18424OooO0o0;
            if ((timestamp != null) != (exemplar.f18424OooO0o0 != null)) {
                return false;
            }
            return (!(timestamp != null) || OooO0O0().equals(exemplar.OooO0O0())) && this.f18423OooO0o.equals(exemplar.f18423OooO0o) && this.unknownFields.equals(exemplar.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f18421OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Exemplar> getParserForType() {
            return f18420OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.f18422OooO0Oo) != 0 ? CodedOutputStream.computeDoubleSize(1, this.f18422OooO0Oo) + 0 : 0;
            if (this.f18424OooO0o0 != null) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(2, OooO0O0());
            }
            for (int i2 = 0; i2 < this.f18423OooO0o.size(); i2++) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(3, this.f18423OooO0o.get(i2));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeDoubleSize;
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
            int iHashLong = Internal.hashLong(Double.doubleToLongBits(this.f18422OooO0Oo)) + o000Oo0.OooO00o(o00.f42698OooOOO0, 779, 37, 1, 53);
            if (this.f18424OooO0o0 != null) {
                iHashLong = OooO0O0().hashCode() + o000000O.OooO00o(iHashLong, 37, 2, 53);
            }
            if (this.f18423OooO0o.size() > 0) {
                iHashLong = this.f18423OooO0o.hashCode() + o000000O.OooO00o(iHashLong, 37, 3, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00.f42697OooOOO.ensureFieldAccessorsInitialized(Exemplar.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f18425OooO0oO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f18425OooO0oO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f18421OooO0oo.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Exemplar();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Double.doubleToRawLongBits(this.f18422OooO0Oo) != 0) {
                codedOutputStream.writeDouble(1, this.f18422OooO0Oo);
            }
            if (this.f18424OooO0o0 != null) {
                codedOutputStream.writeMessage(2, OooO0O0());
            }
            for (int i = 0; i < this.f18423OooO0o.size(); i++) {
                codedOutputStream.writeMessage(3, this.f18423OooO0o.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f18421OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f18421OooO0oo.toBuilder();
        }

        private Exemplar() {
            this.f18425OooO0oO = (byte) -1;
            this.f18423OooO0o = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public Exemplar(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 9) {
                                this.f18422OooO0Oo = codedInputStream.readDouble();
                            } else if (tag == 18) {
                                Timestamp timestamp = this.f18424OooO0o0;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                this.f18424OooO0o0 = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.f18424OooO0o0 = builder.buildPartial();
                                }
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f18423OooO0o = new ArrayList();
                                    z2 |= true;
                                }
                                this.f18423OooO0o.add((Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f18423OooO0o = Collections.unmodifiableList(this.f18423OooO0o);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f18423OooO0o = Collections.unmodifiableList(this.f18423OooO0o);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public static class OooO00o extends AbstractParser<Distribution> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Distribution(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18431OooO00o;

        static {
            int[] iArr = new int[BucketOptions.OptionsCase.values().length];
            f18431OooO00o = iArr;
            try {
                iArr[BucketOptions.OptionsCase.LINEAR_BUCKETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18431OooO00o[BucketOptions.OptionsCase.EXPONENTIAL_BUCKETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18431OooO00o[BucketOptions.OptionsCase.EXPLICIT_BUCKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18431OooO00o[BucketOptions.OptionsCase.OPTIONS_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public BucketOptions f18432OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18433OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f18434OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f18435OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public double f18436OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Range f18437OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Internal.LongList f18438OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<Exemplar> f18439OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> f18440OooOO0o;

        public OooO0OO() {
            Distribution distribution = Distribution.f18378OooOOO0;
            this.f18438OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f18439OooOO0O = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Distribution buildPartial() {
            Distribution distribution = new Distribution(this);
            int i = this.f18433OooO0Oo;
            distribution.f18380OooO0Oo = this.f18435OooO0o0;
            distribution.f18382OooO0o0 = this.f18434OooO0o;
            distribution.f18381OooO0o = this.f18436OooO0oO;
            distribution.f18383OooO0oO = this.f18437OooO0oo;
            distribution.f18384OooO0oo = this.f18432OooO;
            if ((i & 1) != 0) {
                this.f18438OooOO0.makeImmutable();
                this.f18433OooO0Oo &= -2;
            }
            distribution.f18379OooO = this.f18438OooOO0;
            RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18440OooOO0o;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f18433OooO0Oo & 2) != 0) {
                    this.f18439OooOO0O = Collections.unmodifiableList(this.f18439OooOO0O);
                    this.f18433OooO0Oo &= -3;
                }
                distribution.f18386OooOO0O = this.f18439OooOO0O;
            } else {
                distribution.f18386OooOO0O = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return distribution;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18435OooO0o0 = 0L;
            this.f18434OooO0o = 0.0d;
            this.f18436OooO0oO = 0.0d;
            this.f18437OooO0oo = null;
            this.f18432OooO = null;
            Distribution distribution = Distribution.f18378OooOOO0;
            this.f18438OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f18433OooO0Oo &= -2;
            RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18440OooOO0o;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f18439OooOO0O = Collections.emptyList();
                this.f18433OooO0Oo &= -3;
            }
        }

        public final RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> OooO0o() {
            if (this.f18440OooOO0o == null) {
                this.f18440OooOO0o = new RepeatedFieldBuilderV3<>(this.f18439OooOO0O, (this.f18433OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18439OooOO0O = null;
            }
            return this.f18440OooOO0o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO mo4013clone() {
            return (OooO0OO) super.mo4013clone();
        }

        public final void OooO0oO(Distribution distribution) {
            if (distribution == Distribution.f18378OooOOO0) {
                return;
            }
            long j = distribution.f18380OooO0Oo;
            if (j != 0) {
                this.f18435OooO0o0 = j;
                onChanged();
            }
            double d = distribution.f18382OooO0o0;
            if (d != 0.0d) {
                this.f18434OooO0o = d;
                onChanged();
            }
            double d2 = distribution.f18381OooO0o;
            if (d2 != 0.0d) {
                this.f18436OooO0oO = d2;
                onChanged();
            }
            if (distribution.f18383OooO0oO != null) {
                Range rangeOooO0Oo = distribution.OooO0Oo();
                Range range = this.f18437OooO0oo;
                if (range != null) {
                    Range.OooO0O0 builder = Range.f18441OooO0oO.toBuilder();
                    builder.OooO0o0(range);
                    builder.OooO0o0(rangeOooO0Oo);
                    this.f18437OooO0oo = builder.buildPartial();
                } else {
                    this.f18437OooO0oo = rangeOooO0Oo;
                }
                onChanged();
            }
            if (distribution.f18384OooO0oo != null) {
                BucketOptions bucketOptionsOooO0OO = distribution.OooO0OO();
                BucketOptions bucketOptions = this.f18432OooO;
                if (bucketOptions != null) {
                    BucketOptions.OooO0O0 builder2 = BucketOptions.f18388OooO0oO.toBuilder();
                    builder2.OooO0o0(bucketOptions);
                    builder2.OooO0o0(bucketOptionsOooO0OO);
                    this.f18432OooO = builder2.buildPartial();
                } else {
                    this.f18432OooO = bucketOptionsOooO0OO;
                }
                onChanged();
            }
            if (!distribution.f18379OooO.isEmpty()) {
                if (this.f18438OooOO0.isEmpty()) {
                    this.f18438OooOO0 = distribution.f18379OooO;
                    this.f18433OooO0Oo &= -2;
                } else {
                    if ((this.f18433OooO0Oo & 1) == 0) {
                        this.f18438OooOO0 = GeneratedMessageV3.mutableCopy(this.f18438OooOO0);
                        this.f18433OooO0Oo |= 1;
                    }
                    this.f18438OooOO0.addAll(distribution.f18379OooO);
                }
                onChanged();
            }
            if (this.f18440OooOO0o == null) {
                if (!distribution.f18386OooOO0O.isEmpty()) {
                    if (this.f18439OooOO0O.isEmpty()) {
                        this.f18439OooOO0O = distribution.f18386OooOO0O;
                        this.f18433OooO0Oo &= -3;
                    } else {
                        if ((this.f18433OooO0Oo & 2) == 0) {
                            this.f18439OooOO0O = new ArrayList(this.f18439OooOO0O);
                            this.f18433OooO0Oo |= 2;
                        }
                        this.f18439OooOO0O.addAll(distribution.f18386OooOO0O);
                    }
                    onChanged();
                }
            } else if (!distribution.f18386OooOO0O.isEmpty()) {
                if (this.f18440OooOO0o.isEmpty()) {
                    this.f18440OooOO0o.dispose();
                    this.f18440OooOO0o = null;
                    this.f18439OooOO0O = distribution.f18386OooOO0O;
                    this.f18433OooO0Oo &= -3;
                    this.f18440OooOO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18440OooOO0o.addAllMessages(distribution.f18386OooOO0O);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Distribution distribution;
            try {
                try {
                    Distribution.f18377OooOOO.getClass();
                    OooO0oO(new Distribution(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    distribution = (Distribution) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (distribution != null) {
                            OooO0oO(distribution);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                distribution = null;
                if (distribution != null) {
                    OooO0oO(distribution);
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
            Distribution distributionBuildPartial = buildPartial();
            if (distributionBuildPartial.isInitialized()) {
                return distributionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) distributionBuildPartial);
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
            return Distribution.f18378OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00.f42686OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00.f42687OooO0O0.ensureFieldAccessorsInitialized(Distribution.class, OooO0OO.class);
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
            return Distribution.f18378OooOOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            OooO0oo(codedInputStream, extensionRegistryLite);
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
            OooO0oo(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (OooO0OO) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            Distribution distributionBuildPartial = buildPartial();
            if (distributionBuildPartial.isInitialized()) {
                return distributionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) distributionBuildPartial);
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
            if (message instanceof Distribution) {
                OooO0oO((Distribution) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            Distribution distribution = Distribution.f18378OooOOO0;
            this.f18438OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f18439OooOO0O = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Distribution) {
                OooO0oO((Distribution) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public static final class Range extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final Range f18441OooO0oO = new Range();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f18442OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f18443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f18444OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f18445OooO0o0;

        public static class OooO00o extends AbstractParser<Range> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Range(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public double f18446OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f18447OooO0o0;

            public OooO0O0() {
                Range range = Range.f18441OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Range buildPartial() {
                Range range = new Range(this);
                range.f18443OooO0Oo = this.f18446OooO0Oo;
                range.f18445OooO0o0 = this.f18447OooO0o0;
                onBuilt();
                return range;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Range range;
                try {
                    try {
                        Range.f18442OooO0oo.getClass();
                        OooO0o0(new Range(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        range = (Range) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (range != null) {
                                OooO0o0(range);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    range = null;
                    if (range != null) {
                        OooO0o0(range);
                    }
                    throw th;
                }
            }

            public final void OooO0o0(Range range) {
                if (range == Range.f18441OooO0oO) {
                    return;
                }
                double d = range.f18443OooO0Oo;
                if (d != 0.0d) {
                    this.f18446OooO0Oo = d;
                    onChanged();
                }
                double d2 = range.f18445OooO0o0;
                if (d2 != 0.0d) {
                    this.f18447OooO0o0 = d2;
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
                Range rangeBuildPartial = buildPartial();
                if (rangeBuildPartial.isInitialized()) {
                    return rangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clear() {
                super.clear();
                this.f18446OooO0Oo = 0.0d;
                this.f18447OooO0o0 = 0.0d;
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
                return Range.f18441OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return o00.f42688OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return o00.f42689OooO0Oo.ensureFieldAccessorsInitialized(Range.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
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
                return Range.f18441OooO0oO;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
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

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                Range range = Range.f18441OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (OooO0O0) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (OooO0O0) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                Range rangeBuildPartial = buildPartial();
                if (rangeBuildPartial.isInitialized()) {
                    return rangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rangeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clear() {
                super.clear();
                this.f18446OooO0Oo = 0.0d;
                this.f18447OooO0o0 = 0.0d;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof Range) {
                    OooO0o0((Range) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clear() {
                super.clear();
                this.f18446OooO0Oo = 0.0d;
                this.f18447OooO0o0 = 0.0d;
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof Range) {
                    OooO0o0((Range) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite.Builder clear() {
                super.clear();
                this.f18446OooO0Oo = 0.0d;
                this.f18447OooO0o0 = 0.0d;
                return this;
            }
        }

        public Range(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f18444OooO0o = (byte) -1;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f18441OooO0oO) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o0(this);
            return oooO0O0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return super.equals(obj);
            }
            Range range = (Range) obj;
            return Double.doubleToLongBits(this.f18443OooO0Oo) == Double.doubleToLongBits(range.f18443OooO0Oo) && Double.doubleToLongBits(this.f18445OooO0o0) == Double.doubleToLongBits(range.f18445OooO0o0) && this.unknownFields.equals(range.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f18441OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Range> getParserForType() {
            return f18442OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.f18443OooO0Oo) != 0 ? 0 + CodedOutputStream.computeDoubleSize(1, this.f18443OooO0Oo) : 0;
            if (Double.doubleToRawLongBits(this.f18445OooO0o0) != 0) {
                iComputeDoubleSize += CodedOutputStream.computeDoubleSize(2, this.f18445OooO0o0);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeDoubleSize;
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
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f18445OooO0o0)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f18443OooO0Oo)) + o000Oo0.OooO00o(o00.f42688OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00.f42689OooO0Oo.ensureFieldAccessorsInitialized(Range.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f18444OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f18444OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f18441OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Range();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Double.doubleToRawLongBits(this.f18443OooO0Oo) != 0) {
                codedOutputStream.writeDouble(1, this.f18443OooO0Oo);
            }
            if (Double.doubleToRawLongBits(this.f18445OooO0o0) != 0) {
                codedOutputStream.writeDouble(2, this.f18445OooO0o0);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f18441OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f18441OooO0oO.toBuilder();
        }

        private Range() {
            this.f18444OooO0o = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public Range(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 9) {
                                    this.f18443OooO0Oo = codedInputStream.readDouble();
                                } else if (tag != 17) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f18445OooO0o0 = codedInputStream.readDouble();
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
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public Distribution(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18385OooOO0 = -1;
        this.f18387OooOO0o = (byte) -1;
    }

    public final BucketOptions OooO0OO() {
        BucketOptions bucketOptions = this.f18384OooO0oo;
        return bucketOptions == null ? BucketOptions.f18388OooO0oO : bucketOptions;
    }

    public final Range OooO0Oo() {
        Range range = this.f18383OooO0oO;
        return range == null ? Range.f18441OooO0oO : range;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f18378OooOOO0) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0oO(this);
        return oooO0OO;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Distribution)) {
            return super.equals(obj);
        }
        Distribution distribution = (Distribution) obj;
        if (this.f18380OooO0Oo != distribution.f18380OooO0Oo || Double.doubleToLongBits(this.f18382OooO0o0) != Double.doubleToLongBits(distribution.f18382OooO0o0) || Double.doubleToLongBits(this.f18381OooO0o) != Double.doubleToLongBits(distribution.f18381OooO0o)) {
            return false;
        }
        Range range = this.f18383OooO0oO;
        if ((range != null) != (distribution.f18383OooO0oO != null)) {
            return false;
        }
        if ((range != null) && !OooO0Oo().equals(distribution.OooO0Oo())) {
            return false;
        }
        BucketOptions bucketOptions = this.f18384OooO0oo;
        if ((bucketOptions != null) != (distribution.f18384OooO0oo != null)) {
            return false;
        }
        return (!(bucketOptions != null) || OooO0OO().equals(distribution.OooO0OO())) && this.f18379OooO.equals(distribution.f18379OooO) && this.f18386OooOO0O.equals(distribution.f18386OooOO0O) && this.unknownFields.equals(distribution.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18378OooOOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Distribution> getParserForType() {
        return f18377OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f18380OooO0Oo;
        int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) + 0 : 0;
        if (Double.doubleToRawLongBits(this.f18382OooO0o0) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(2, this.f18382OooO0o0);
        }
        if (Double.doubleToRawLongBits(this.f18381OooO0o) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(3, this.f18381OooO0o);
        }
        if (this.f18383OooO0oO != null) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(4, OooO0Oo());
        }
        if (this.f18384OooO0oo != null) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(6, OooO0OO());
        }
        int iComputeInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < this.f18379OooO.size(); i2++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(this.f18379OooO.getLong(i2));
        }
        int iComputeMessageSize = iComputeInt64Size + iComputeInt64SizeNoTag;
        if (!this.f18379OooO.isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt64SizeNoTag);
        }
        this.f18385OooOO0 = iComputeInt64SizeNoTag;
        for (int i3 = 0; i3 < this.f18386OooOO0O.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(10, this.f18386OooOO0O.get(i3));
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
        int iHashLong = Internal.hashLong(Double.doubleToLongBits(this.f18381OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f18382OooO0o0)) + ((((Internal.hashLong(this.f18380OooO0Oo) + o000Oo0.OooO00o(o00.f42686OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (this.f18383OooO0oO != null) {
            iHashLong = OooO0Oo().hashCode() + o000000O.OooO00o(iHashLong, 37, 4, 53);
        }
        if (this.f18384OooO0oo != null) {
            iHashLong = OooO0OO().hashCode() + o000000O.OooO00o(iHashLong, 37, 6, 53);
        }
        if (this.f18379OooO.size() > 0) {
            iHashLong = this.f18379OooO.hashCode() + o000000O.OooO00o(iHashLong, 37, 7, 53);
        }
        if (this.f18386OooOO0O.size() > 0) {
            iHashLong = this.f18386OooOO0O.hashCode() + o000000O.OooO00o(iHashLong, 37, 10, 53);
        }
        int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00.f42687OooO0O0.ensureFieldAccessorsInitialized(Distribution.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18387OooOO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18387OooOO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18378OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Distribution();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        long j = this.f18380OooO0Oo;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (Double.doubleToRawLongBits(this.f18382OooO0o0) != 0) {
            codedOutputStream.writeDouble(2, this.f18382OooO0o0);
        }
        if (Double.doubleToRawLongBits(this.f18381OooO0o) != 0) {
            codedOutputStream.writeDouble(3, this.f18381OooO0o);
        }
        if (this.f18383OooO0oO != null) {
            codedOutputStream.writeMessage(4, OooO0Oo());
        }
        if (this.f18384OooO0oo != null) {
            codedOutputStream.writeMessage(6, OooO0OO());
        }
        if (this.f18379OooO.size() > 0) {
            codedOutputStream.writeUInt32NoTag(58);
            codedOutputStream.writeUInt32NoTag(this.f18385OooOO0);
        }
        for (int i = 0; i < this.f18379OooO.size(); i++) {
            codedOutputStream.writeInt64NoTag(this.f18379OooO.getLong(i));
        }
        for (int i2 = 0; i2 < this.f18386OooOO0O.size(); i2++) {
            codedOutputStream.writeMessage(10, this.f18386OooOO0O.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18378OooOOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18378OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private Distribution() {
        this.f18385OooOO0 = -1;
        this.f18387OooOO0o = (byte) -1;
        this.f18379OooO = GeneratedMessageV3.emptyLongList();
        this.f18386OooOO0O = Collections.emptyList();
    }

    public Distribution(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.f18380OooO0Oo = codedInputStream.readInt64();
                            } else if (tag == 17) {
                                this.f18382OooO0o0 = codedInputStream.readDouble();
                            } else if (tag != 25) {
                                if (tag == 34) {
                                    Range range = this.f18383OooO0oO;
                                    Range.OooO0O0 builder = range != null ? range.toBuilder() : null;
                                    Range range2 = (Range) codedInputStream.readMessage(Range.f18442OooO0oo, extensionRegistryLite);
                                    this.f18383OooO0oO = range2;
                                    if (builder != null) {
                                        builder.OooO0o0(range2);
                                        this.f18383OooO0oO = builder.buildPartial();
                                    }
                                } else if (tag == 50) {
                                    BucketOptions bucketOptions = this.f18384OooO0oo;
                                    BucketOptions.OooO0O0 builder2 = bucketOptions != null ? bucketOptions.toBuilder() : null;
                                    BucketOptions bucketOptions2 = (BucketOptions) codedInputStream.readMessage(BucketOptions.f18389OooO0oo, extensionRegistryLite);
                                    this.f18384OooO0oo = bucketOptions2;
                                    if (builder2 != null) {
                                        builder2.OooO0o0(bucketOptions2);
                                        this.f18384OooO0oo = builder2.buildPartial();
                                    }
                                } else if (tag == 56) {
                                    int i2 = (i == true ? 1 : 0) & 1;
                                    i = i;
                                    if (i2 == 0) {
                                        this.f18379OooO = GeneratedMessageV3.newLongList();
                                        i = (i == true ? 1 : 0) | 1;
                                    }
                                    this.f18379OooO.addLong(codedInputStream.readInt64());
                                } else if (tag == 58) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    int i3 = (i == true ? 1 : 0) & 1;
                                    i = i;
                                    if (i3 == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                                        i = i;
                                        this.f18379OooO = GeneratedMessageV3.newLongList();
                                        i = (i == true ? 1 : 0) | 1;
                                    }
                                    i = i;
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f18379OooO.addLong(codedInputStream.readInt64());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag != 82) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i4 = (i == true ? 1 : 0) & 2;
                                    i = i;
                                    if (i4 == 0) {
                                        this.f18386OooOO0O = new ArrayList();
                                        i = (i == true ? 1 : 0) | 2;
                                    }
                                    this.f18386OooOO0O.add((Exemplar) codedInputStream.readMessage(Exemplar.f18420OooO, extensionRegistryLite));
                                }
                            } else {
                                this.f18381OooO0o = codedInputStream.readDouble();
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
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.f18379OooO.makeImmutable();
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.f18386OooOO0O = Collections.unmodifiableList(this.f18386OooOO0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.f18379OooO.makeImmutable();
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.f18386OooOO0O = Collections.unmodifiableList(this.f18386OooOO0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
