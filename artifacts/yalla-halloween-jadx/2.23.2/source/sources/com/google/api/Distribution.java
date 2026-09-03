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
import o0O0O0Oo.OooOo00;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Distribution extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Internal.LongList f17903OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f17904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f17905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f17906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Range f17907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public BucketOptions f17908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f17909OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public List<Exemplar> f17910OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte f17911OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Distribution f17902OooOOO0 = new Distribution();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f17901OooOOO = new OooO00o();

    public static final class BucketOptions extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final BucketOptions f17912OooO0oO = new BucketOptions();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f17913OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17914OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f17915OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f17916OooO0o0;

        public static final class Explicit extends GeneratedMessageV3 implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public static final Explicit f17917OooO0oO = new Explicit();

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final OooO00o f17918OooO0oo = new OooO00o();

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Internal.DoubleList f17919OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public byte f17920OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f17921OooO0o0;

            public static class OooO00o extends AbstractParser<Explicit> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Explicit(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f17922OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public Internal.DoubleList f17923OooO0o0;

                public OooO0O0() {
                    Explicit explicit = Explicit.f17917OooO0oO;
                    this.f17923OooO0o0 = GeneratedMessageV3.emptyDoubleList();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Explicit buildPartial() {
                    Explicit explicit = new Explicit(this);
                    if ((this.f17922OooO0Oo & 1) != 0) {
                        this.f17923OooO0o0.makeImmutable();
                        this.f17922OooO0Oo &= -2;
                    }
                    explicit.f17919OooO0Oo = this.f17923OooO0o0;
                    onBuilt();
                    return explicit;
                }

                public final void OooO0Oo() {
                    super.clear();
                    Explicit explicit = Explicit.f17917OooO0oO;
                    this.f17923OooO0o0 = GeneratedMessageV3.emptyDoubleList();
                    this.f17922OooO0Oo &= -2;
                }

                public final void OooO0o(Explicit explicit) {
                    if (explicit == Explicit.f17917OooO0oO) {
                        return;
                    }
                    if (!explicit.f17919OooO0Oo.isEmpty()) {
                        if (this.f17923OooO0o0.isEmpty()) {
                            this.f17923OooO0o0 = explicit.f17919OooO0Oo;
                            this.f17922OooO0Oo &= -2;
                        } else {
                            if ((this.f17922OooO0Oo & 1) == 0) {
                                this.f17923OooO0o0 = GeneratedMessageV3.mutableCopy(this.f17923OooO0o0);
                                this.f17922OooO0Oo |= 1;
                            }
                            this.f17923OooO0o0.addAll(explicit.f17919OooO0Oo);
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
                    Explicit explicit;
                    try {
                        try {
                            Explicit.f17918OooO0oo.getClass();
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
                    return Explicit.f17917OooO0oO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return OooOo00.f41215OooOO0O;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OooOo00.f41216OooOO0o.ensureFieldAccessorsInitialized(Explicit.class, OooO0O0.class);
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
                    return Explicit.f17917OooO0oO;
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
                    Explicit explicit = Explicit.f17917OooO0oO;
                    this.f17923OooO0o0 = GeneratedMessageV3.emptyDoubleList();
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
                this.f17921OooO0o0 = -1;
                this.f17920OooO0o = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f17917OooO0oO) {
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
                return this.f17919OooO0Oo.equals(explicit.f17919OooO0Oo) && this.unknownFields.equals(explicit.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f17917OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Explicit> getParserForType() {
                return f17918OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int size = this.f17919OooO0Oo.size() * 8;
                int iComputeInt32SizeNoTag = size + 0;
                if (!this.f17919OooO0Oo.isEmpty()) {
                    iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(size);
                }
                this.f17921OooO0o0 = size;
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
                int iHashCode = OooOo00.f41215OooOO0O.hashCode() + 779;
                if (this.f17919OooO0Oo.size() > 0) {
                    iHashCode = o00Ooo.OooO00o(iHashCode, 37, 1, 53) + this.f17919OooO0Oo.hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41216OooOO0o.ensureFieldAccessorsInitialized(Explicit.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f17920OooO0o;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f17920OooO0o = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f17917OooO0oO.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Explicit();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (this.f17919OooO0Oo.size() > 0) {
                    codedOutputStream.writeUInt32NoTag(10);
                    codedOutputStream.writeUInt32NoTag(this.f17921OooO0o0);
                }
                for (int i = 0; i < this.f17919OooO0Oo.size(); i++) {
                    codedOutputStream.writeDoubleNoTag(this.f17919OooO0Oo.getDouble(i));
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f17917OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f17917OooO0oO.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new OooO0O0(builderParent);
            }

            private Explicit() {
                this.f17921OooO0o0 = -1;
                this.f17920OooO0o = (byte) -1;
                this.f17919OooO0Oo = GeneratedMessageV3.emptyDoubleList();
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
                                            this.f17919OooO0Oo = GeneratedMessageV3.newDoubleList();
                                            z2 |= true;
                                        }
                                        this.f17919OooO0Oo.addDouble(codedInputStream.readDouble());
                                    } else if (tag != 10) {
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                        if (!(z2 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f17919OooO0Oo = GeneratedMessageV3.newDoubleList();
                                            z2 |= true;
                                        }
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.f17919OooO0Oo.addDouble(codedInputStream.readDouble());
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
                            this.f17919OooO0Oo.makeImmutable();
                        }
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f17919OooO0Oo.makeImmutable();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }
        }

        public static final class Exponential extends GeneratedMessageV3 implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f17926OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public double f17927OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f17928OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public byte f17929OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final Exponential f17925OooO0oo = new Exponential();

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public static final OooO00o f17924OooO = new OooO00o();

            public static class OooO00o extends AbstractParser<Exponential> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Exponential(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f17930OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public double f17931OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public double f17932OooO0o0;

                public OooO0O0() {
                    Exponential exponential = Exponential.f17925OooO0oo;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Exponential buildPartial() {
                    Exponential exponential = new Exponential(this);
                    exponential.f17926OooO0Oo = this.f17930OooO0Oo;
                    exponential.f17928OooO0o0 = this.f17932OooO0o0;
                    exponential.f17927OooO0o = this.f17931OooO0o;
                    onBuilt();
                    return exponential;
                }

                public final void OooO0Oo() {
                    super.clear();
                    this.f17930OooO0Oo = 0;
                    this.f17932OooO0o0 = 0.0d;
                    this.f17931OooO0o = 0.0d;
                }

                public final void OooO0o(Exponential exponential) {
                    if (exponential == Exponential.f17925OooO0oo) {
                        return;
                    }
                    int i = exponential.f17926OooO0Oo;
                    if (i != 0) {
                        this.f17930OooO0Oo = i;
                        onChanged();
                    }
                    double d = exponential.f17928OooO0o0;
                    if (d != 0.0d) {
                        this.f17932OooO0o0 = d;
                        onChanged();
                    }
                    double d2 = exponential.f17927OooO0o;
                    if (d2 != 0.0d) {
                        this.f17931OooO0o = d2;
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
                    Exponential exponential;
                    try {
                        try {
                            Exponential.f17924OooO.getClass();
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
                    return Exponential.f17925OooO0oo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return OooOo00.f41205OooO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OooOo00.f41214OooOO0.ensureFieldAccessorsInitialized(Exponential.class, OooO0O0.class);
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
                    return Exponential.f17925OooO0oo;
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
                    Exponential exponential = Exponential.f17925OooO0oo;
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
                this.f17929OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f17925OooO0oo) {
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
                return this.f17926OooO0Oo == exponential.f17926OooO0Oo && Double.doubleToLongBits(this.f17928OooO0o0) == Double.doubleToLongBits(exponential.f17928OooO0o0) && Double.doubleToLongBits(this.f17927OooO0o) == Double.doubleToLongBits(exponential.f17927OooO0o) && this.unknownFields.equals(exponential.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f17925OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Exponential> getParserForType() {
                return f17924OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.f17926OooO0Oo;
                int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.f17928OooO0o0) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.f17928OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f17927OooO0o) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.f17927OooO0o);
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
                int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f17927OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17928OooO0o0)) + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(o0O0O0Oo.OooO00o.OooO00o(OooOo00.f41205OooO, 779, 37, 1, 53), this.f17926OooO0Oo, 37, 2, 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41214OooOO0.ensureFieldAccessorsInitialized(Exponential.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f17929OooO0oO;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f17929OooO0oO = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f17925OooO0oo.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Exponential();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.f17926OooO0Oo;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.f17928OooO0o0) != 0) {
                    codedOutputStream.writeDouble(2, this.f17928OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f17927OooO0o) != 0) {
                    codedOutputStream.writeDouble(3, this.f17927OooO0o);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f17925OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f17925OooO0oo.toBuilder();
            }

            private Exponential() {
                this.f17929OooO0oO = (byte) -1;
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
                                    this.f17926OooO0Oo = codedInputStream.readInt32();
                                } else if (tag == 17) {
                                    this.f17928OooO0o0 = codedInputStream.readDouble();
                                } else if (tag != 25) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f17927OooO0o = codedInputStream.readDouble();
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
            public int f17935OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public double f17936OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f17937OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public byte f17938OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final Linear f17934OooO0oo = new Linear();

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public static final OooO00o f17933OooO = new OooO00o();

            public static class OooO00o extends AbstractParser<Linear> {
                @Override // com.google.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Linear(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f17939OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public double f17940OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public double f17941OooO0o0;

                public OooO0O0() {
                    Linear linear = Linear.f17934OooO0oo;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
                public final Linear buildPartial() {
                    Linear linear = new Linear(this);
                    linear.f17935OooO0Oo = this.f17939OooO0Oo;
                    linear.f17937OooO0o0 = this.f17941OooO0o0;
                    linear.f17936OooO0o = this.f17940OooO0o;
                    onBuilt();
                    return linear;
                }

                public final void OooO0Oo() {
                    super.clear();
                    this.f17939OooO0Oo = 0;
                    this.f17941OooO0o0 = 0.0d;
                    this.f17940OooO0o = 0.0d;
                }

                public final void OooO0o(Linear linear) {
                    if (linear == Linear.f17934OooO0oo) {
                        return;
                    }
                    int i = linear.f17935OooO0Oo;
                    if (i != 0) {
                        this.f17939OooO0Oo = i;
                        onChanged();
                    }
                    double d = linear.f17937OooO0o0;
                    if (d != 0.0d) {
                        this.f17941OooO0o0 = d;
                        onChanged();
                    }
                    double d2 = linear.f17936OooO0o;
                    if (d2 != 0.0d) {
                        this.f17940OooO0o = d2;
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
                    Linear linear;
                    try {
                        try {
                            Linear.f17933OooO.getClass();
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
                    return Linear.f17934OooO0oo;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public final Descriptors.Descriptor getDescriptorForType() {
                    return OooOo00.f41212OooO0oO;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OooOo00.f41213OooO0oo.ensureFieldAccessorsInitialized(Linear.class, OooO0O0.class);
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
                    return Linear.f17934OooO0oo;
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
                    Linear linear = Linear.f17934OooO0oo;
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
                this.f17938OooO0oO = (byte) -1;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 toBuilder() {
                if (this == f17934OooO0oo) {
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
                return this.f17935OooO0Oo == linear.f17935OooO0Oo && Double.doubleToLongBits(this.f17937OooO0o0) == Double.doubleToLongBits(linear.f17937OooO0o0) && Double.doubleToLongBits(this.f17936OooO0o) == Double.doubleToLongBits(linear.f17936OooO0o) && this.unknownFields.equals(linear.unknownFields);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final Message getDefaultInstanceForType() {
                return f17934OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Parser<Linear> getParserForType() {
                return f17933OooO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.f17935OooO0Oo;
                int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.f17937OooO0o0) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.f17937OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f17936OooO0o) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.f17936OooO0o);
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
                int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f17936OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17937OooO0o0)) + androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(o0O0O0Oo.OooO00o.OooO00o(OooOo00.f41212OooO0oO, 779, 37, 1, 53), this.f17935OooO0Oo, 37, 2, 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41213OooO0oo.ensureFieldAccessorsInitialized(Linear.class, OooO0O0.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f17938OooO0oO;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f17938OooO0oO = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final Message.Builder newBuilderForType() {
                return f17934OooO0oo.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Linear();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i = this.f17935OooO0Oo;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.f17937OooO0o0) != 0) {
                    codedOutputStream.writeDouble(2, this.f17937OooO0o0);
                }
                if (Double.doubleToRawLongBits(this.f17936OooO0o) != 0) {
                    codedOutputStream.writeDouble(3, this.f17936OooO0o);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public final MessageLite getDefaultInstanceForType() {
                return f17934OooO0oo;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public final MessageLite.Builder newBuilderForType() {
                return f17934OooO0oo.toBuilder();
            }

            private Linear() {
                this.f17938OooO0oO = (byte) -1;
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
                                    this.f17935OooO0Oo = codedInputStream.readInt32();
                                } else if (tag == 17) {
                                    this.f17937OooO0o0 = codedInputStream.readDouble();
                                } else if (tag != 25) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f17936OooO0o = codedInputStream.readDouble();
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
            public int f17942OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public GeneratedMessageV3 f17943OooO0o0;

            public OooO0O0() {
                this.f17942OooO0Oo = 0;
                BucketOptions bucketOptions = BucketOptions.f17912OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final BucketOptions buildPartial() {
                BucketOptions bucketOptions = new BucketOptions(this);
                int i = this.f17942OooO0Oo;
                if (i == 1) {
                    bucketOptions.f17916OooO0o0 = this.f17943OooO0o0;
                }
                if (i == 2) {
                    bucketOptions.f17916OooO0o0 = this.f17943OooO0o0;
                }
                if (i == 3) {
                    bucketOptions.f17916OooO0o0 = this.f17943OooO0o0;
                }
                bucketOptions.f17914OooO0Oo = i;
                onBuilt();
                return bucketOptions;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                BucketOptions bucketOptions;
                try {
                    try {
                        BucketOptions.f17913OooO0oo.getClass();
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
                if (bucketOptions == BucketOptions.f17912OooO0oO) {
                    return;
                }
                int i = OooO0O0.f17955OooO00o[bucketOptions.OooO0o0().ordinal()];
                if (i == 1) {
                    Linear linearOooO0Oo = bucketOptions.OooO0Oo();
                    if (this.f17942OooO0Oo != 1 || (generatedMessageV3 = this.f17943OooO0o0) == (linear = Linear.f17934OooO0oo)) {
                        this.f17943OooO0o0 = linearOooO0Oo;
                    } else {
                        Linear.OooO0O0 builder = linear.toBuilder();
                        builder.OooO0o((Linear) generatedMessageV3);
                        builder.OooO0o(linearOooO0Oo);
                        this.f17943OooO0o0 = builder.buildPartial();
                    }
                    onChanged();
                    this.f17942OooO0Oo = 1;
                } else if (i == 2) {
                    Exponential exponentialOooO0OO = bucketOptions.OooO0OO();
                    if (this.f17942OooO0Oo != 2 || (generatedMessageV4 = this.f17943OooO0o0) == (exponential = Exponential.f17925OooO0oo)) {
                        this.f17943OooO0o0 = exponentialOooO0OO;
                    } else {
                        Exponential.OooO0O0 builder2 = exponential.toBuilder();
                        builder2.OooO0o((Exponential) generatedMessageV4);
                        builder2.OooO0o(exponentialOooO0OO);
                        this.f17943OooO0o0 = builder2.buildPartial();
                    }
                    onChanged();
                    this.f17942OooO0Oo = 2;
                } else if (i == 3) {
                    Explicit explicitOooO0O0 = bucketOptions.OooO0O0();
                    if (this.f17942OooO0Oo != 3 || (generatedMessageV5 = this.f17943OooO0o0) == (explicit = Explicit.f17917OooO0oO)) {
                        this.f17943OooO0o0 = explicitOooO0O0;
                    } else {
                        Explicit.OooO0O0 builder3 = explicit.toBuilder();
                        builder3.OooO0o((Explicit) generatedMessageV5);
                        builder3.OooO0o(explicitOooO0O0);
                        this.f17943OooO0o0 = builder3.buildPartial();
                    }
                    onChanged();
                    this.f17942OooO0Oo = 3;
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
                this.f17942OooO0Oo = 0;
                this.f17943OooO0o0 = null;
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
                return BucketOptions.f17912OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return OooOo00.f41211OooO0o0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41210OooO0o.ensureFieldAccessorsInitialized(BucketOptions.class, OooO0O0.class);
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
                return BucketOptions.f17912OooO0oO;
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
                this.f17942OooO0Oo = 0;
                BucketOptions bucketOptions = BucketOptions.f17912OooO0oO;
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
                this.f17942OooO0Oo = 0;
                this.f17943OooO0o0 = null;
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
                this.f17942OooO0Oo = 0;
                this.f17943OooO0o0 = null;
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
                this.f17942OooO0Oo = 0;
                this.f17943OooO0o0 = null;
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
            this.f17914OooO0Oo = 0;
            this.f17915OooO0o = (byte) -1;
        }

        public final Explicit OooO0O0() {
            return this.f17914OooO0Oo == 3 ? (Explicit) this.f17916OooO0o0 : Explicit.f17917OooO0oO;
        }

        public final Exponential OooO0OO() {
            return this.f17914OooO0Oo == 2 ? (Exponential) this.f17916OooO0o0 : Exponential.f17925OooO0oo;
        }

        public final Linear OooO0Oo() {
            return this.f17914OooO0Oo == 1 ? (Linear) this.f17916OooO0o0 : Linear.f17934OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f17912OooO0oO) {
                return new OooO0O0();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.OooO0o0(this);
            return oooO0O0;
        }

        public final OptionsCase OooO0o0() {
            int i = this.f17914OooO0Oo;
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
            int i = this.f17914OooO0Oo;
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
            return f17912OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<BucketOptions> getParserForType() {
            return f17913OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = this.f17914OooO0Oo == 1 ? 0 + CodedOutputStream.computeMessageSize(1, (Linear) this.f17916OooO0o0) : 0;
            if (this.f17914OooO0Oo == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (Exponential) this.f17916OooO0o0);
            }
            if (this.f17914OooO0Oo == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (Explicit) this.f17916OooO0o0);
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
            int iHashCode2 = OooOo00.f41211OooO0o0.hashCode() + 779;
            int i2 = this.f17914OooO0Oo;
            if (i2 == 1) {
                iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 1, 53);
                iHashCode = OooO0Oo().hashCode();
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 3, 53);
                        iHashCode = OooO0O0().hashCode();
                    }
                    int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                iOooO00o = o00Ooo.OooO00o(iHashCode2, 37, 2, 53);
                iHashCode = OooO0OO().hashCode();
            }
            iHashCode2 = iOooO00o + iHashCode;
            int iHashCode4 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOo00.f41210OooO0o.ensureFieldAccessorsInitialized(BucketOptions.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f17915OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f17915OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f17912OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BucketOptions();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.f17914OooO0Oo == 1) {
                codedOutputStream.writeMessage(1, (Linear) this.f17916OooO0o0);
            }
            if (this.f17914OooO0Oo == 2) {
                codedOutputStream.writeMessage(2, (Exponential) this.f17916OooO0o0);
            }
            if (this.f17914OooO0Oo == 3) {
                codedOutputStream.writeMessage(3, (Explicit) this.f17916OooO0o0);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f17912OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f17912OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        private BucketOptions() {
            this.f17914OooO0Oo = 0;
            this.f17915OooO0o = (byte) -1;
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
                                    Linear.OooO0O0 builder = this.f17914OooO0Oo == 1 ? ((Linear) this.f17916OooO0o0).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Linear.f17933OooO, extensionRegistryLite);
                                    this.f17916OooO0o0 = message;
                                    if (builder != null) {
                                        builder.OooO0o((Linear) message);
                                        this.f17916OooO0o0 = builder.buildPartial();
                                    }
                                    this.f17914OooO0Oo = 1;
                                } else if (tag == 18) {
                                    Exponential.OooO0O0 builder2 = this.f17914OooO0Oo == 2 ? ((Exponential) this.f17916OooO0o0).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(Exponential.f17924OooO, extensionRegistryLite);
                                    this.f17916OooO0o0 = message2;
                                    if (builder2 != null) {
                                        builder2.OooO0o((Exponential) message2);
                                        this.f17916OooO0o0 = builder2.buildPartial();
                                    }
                                    this.f17914OooO0Oo = 2;
                                } else if (tag != 26) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Explicit.OooO0O0 builder3 = this.f17914OooO0Oo == 3 ? ((Explicit) this.f17916OooO0o0).toBuilder() : null;
                                    MessageLite message3 = codedInputStream.readMessage(Explicit.f17918OooO0oo, extensionRegistryLite);
                                    this.f17916OooO0o0 = message3;
                                    if (builder3 != null) {
                                        builder3.OooO0o((Explicit) message3);
                                        this.f17916OooO0o0 = builder3.buildPartial();
                                    }
                                    this.f17914OooO0Oo = 3;
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
        public double f17946OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<Any> f17947OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Timestamp f17948OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public byte f17949OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final Exemplar f17945OooO0oo = new Exemplar();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO00o f17944OooO = new OooO00o();

        public static class OooO00o extends AbstractParser<Exemplar> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Exemplar(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f17950OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Timestamp f17951OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f17952OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public List<Any> f17953OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> f17954OooO0oo;

            public OooO0O0() {
                this.f17953OooO0oO = Collections.emptyList();
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    OooO0o();
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Exemplar buildPartial() {
                Exemplar exemplar = new Exemplar(this);
                int i = this.f17950OooO0Oo;
                exemplar.f17946OooO0Oo = this.f17952OooO0o0;
                exemplar.f17948OooO0o0 = this.f17951OooO0o;
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f17954OooO0oo;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i & 1) != 0) {
                        this.f17953OooO0oO = Collections.unmodifiableList(this.f17953OooO0oO);
                        this.f17950OooO0Oo &= -2;
                    }
                    exemplar.f17947OooO0o = this.f17953OooO0oO;
                } else {
                    exemplar.f17947OooO0o = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return exemplar;
            }

            public final void OooO0Oo() {
                super.clear();
                this.f17952OooO0o0 = 0.0d;
                this.f17951OooO0o = null;
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.f17954OooO0oo;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                } else {
                    this.f17953OooO0oO = Collections.emptyList();
                    this.f17950OooO0Oo &= -2;
                }
            }

            public final RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> OooO0o() {
                if (this.f17954OooO0oo == null) {
                    this.f17954OooO0oo = new RepeatedFieldBuilderV3<>(this.f17953OooO0oO, (this.f17950OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                    this.f17953OooO0oO = null;
                }
                return this.f17954OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            public final void OooO0oO(Exemplar exemplar) {
                if (exemplar == Exemplar.f17945OooO0oo) {
                    return;
                }
                double d = exemplar.f17946OooO0Oo;
                if (d != 0.0d) {
                    this.f17952OooO0o0 = d;
                    onChanged();
                }
                if (exemplar.f17948OooO0o0 != null) {
                    Timestamp timestampOooO0O0 = exemplar.OooO0O0();
                    Timestamp timestamp = this.f17951OooO0o;
                    if (timestamp != null) {
                        this.f17951OooO0o = Timestamp.newBuilder(timestamp).mergeFrom(timestampOooO0O0).buildPartial();
                    } else {
                        this.f17951OooO0o = timestampOooO0O0;
                    }
                    onChanged();
                }
                if (this.f17954OooO0oo == null) {
                    if (!exemplar.f17947OooO0o.isEmpty()) {
                        if (this.f17953OooO0oO.isEmpty()) {
                            this.f17953OooO0oO = exemplar.f17947OooO0o;
                            this.f17950OooO0Oo &= -2;
                        } else {
                            if ((this.f17950OooO0Oo & 1) == 0) {
                                this.f17953OooO0oO = new ArrayList(this.f17953OooO0oO);
                                this.f17950OooO0Oo |= 1;
                            }
                            this.f17953OooO0oO.addAll(exemplar.f17947OooO0o);
                        }
                        onChanged();
                    }
                } else if (!exemplar.f17947OooO0o.isEmpty()) {
                    if (this.f17954OooO0oo.isEmpty()) {
                        this.f17954OooO0oo.dispose();
                        this.f17954OooO0oo = null;
                        this.f17953OooO0oO = exemplar.f17947OooO0o;
                        this.f17950OooO0Oo &= -2;
                        this.f17954OooO0oo = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                    } else {
                        this.f17954OooO0oo.addAllMessages(exemplar.f17947OooO0o);
                    }
                }
                onChanged();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Exemplar exemplar;
                try {
                    try {
                        Exemplar.f17944OooO.getClass();
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
                return Exemplar.f17945OooO0oo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return OooOo00.f41218OooOOO0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41217OooOOO.ensureFieldAccessorsInitialized(Exemplar.class, OooO0O0.class);
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
                return Exemplar.f17945OooO0oo;
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
                this.f17953OooO0oO = Collections.emptyList();
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
            this.f17949OooO0oO = (byte) -1;
        }

        public final Timestamp OooO0O0() {
            Timestamp timestamp = this.f17948OooO0o0;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f17945OooO0oo) {
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
            if (Double.doubleToLongBits(this.f17946OooO0Oo) != Double.doubleToLongBits(exemplar.f17946OooO0Oo)) {
                return false;
            }
            Timestamp timestamp = this.f17948OooO0o0;
            if ((timestamp != null) != (exemplar.f17948OooO0o0 != null)) {
                return false;
            }
            return (!(timestamp != null) || OooO0O0().equals(exemplar.OooO0O0())) && this.f17947OooO0o.equals(exemplar.f17947OooO0o) && this.unknownFields.equals(exemplar.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f17945OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Exemplar> getParserForType() {
            return f17944OooO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.f17946OooO0Oo) != 0 ? CodedOutputStream.computeDoubleSize(1, this.f17946OooO0Oo) + 0 : 0;
            if (this.f17948OooO0o0 != null) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(2, OooO0O0());
            }
            for (int i2 = 0; i2 < this.f17947OooO0o.size(); i2++) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(3, this.f17947OooO0o.get(i2));
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
            int iHashLong = Internal.hashLong(Double.doubleToLongBits(this.f17946OooO0Oo)) + o0O0O0Oo.OooO00o.OooO00o(OooOo00.f41218OooOOO0, 779, 37, 1, 53);
            if (this.f17948OooO0o0 != null) {
                iHashLong = OooO0O0().hashCode() + o00Ooo.OooO00o(iHashLong, 37, 2, 53);
            }
            if (this.f17947OooO0o.size() > 0) {
                iHashLong = this.f17947OooO0o.hashCode() + o00Ooo.OooO00o(iHashLong, 37, 3, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOo00.f41217OooOOO.ensureFieldAccessorsInitialized(Exemplar.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f17949OooO0oO;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f17949OooO0oO = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f17945OooO0oo.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Exemplar();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Double.doubleToRawLongBits(this.f17946OooO0Oo) != 0) {
                codedOutputStream.writeDouble(1, this.f17946OooO0Oo);
            }
            if (this.f17948OooO0o0 != null) {
                codedOutputStream.writeMessage(2, OooO0O0());
            }
            for (int i = 0; i < this.f17947OooO0o.size(); i++) {
                codedOutputStream.writeMessage(3, this.f17947OooO0o.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f17945OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f17945OooO0oo.toBuilder();
        }

        private Exemplar() {
            this.f17949OooO0oO = (byte) -1;
            this.f17947OooO0o = Collections.emptyList();
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
                                this.f17946OooO0Oo = codedInputStream.readDouble();
                            } else if (tag == 18) {
                                Timestamp timestamp = this.f17948OooO0o0;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                this.f17948OooO0o0 = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.f17948OooO0o0 = builder.buildPartial();
                                }
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f17947OooO0o = new ArrayList();
                                    z2 |= true;
                                }
                                this.f17947OooO0o.add((Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
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
                        this.f17947OooO0o = Collections.unmodifiableList(this.f17947OooO0o);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f17947OooO0o = Collections.unmodifiableList(this.f17947OooO0o);
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
        public static final /* synthetic */ int[] f17955OooO00o;

        static {
            int[] iArr = new int[BucketOptions.OptionsCase.values().length];
            f17955OooO00o = iArr;
            try {
                iArr[BucketOptions.OptionsCase.LINEAR_BUCKETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17955OooO00o[BucketOptions.OptionsCase.EXPONENTIAL_BUCKETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17955OooO00o[BucketOptions.OptionsCase.EXPLICIT_BUCKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17955OooO00o[BucketOptions.OptionsCase.OPTIONS_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public BucketOptions f17956OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17957OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f17958OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f17959OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public double f17960OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Range f17961OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Internal.LongList f17962OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public List<Exemplar> f17963OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> f17964OooOO0o;

        public OooO0OO() {
            Distribution distribution = Distribution.f17902OooOOO0;
            this.f17962OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f17963OooOO0O = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Distribution buildPartial() {
            Distribution distribution = new Distribution(this);
            int i = this.f17957OooO0Oo;
            distribution.f17904OooO0Oo = this.f17959OooO0o0;
            distribution.f17906OooO0o0 = this.f17958OooO0o;
            distribution.f17905OooO0o = this.f17960OooO0oO;
            distribution.f17907OooO0oO = this.f17961OooO0oo;
            distribution.f17908OooO0oo = this.f17956OooO;
            if ((i & 1) != 0) {
                this.f17962OooOO0.makeImmutable();
                this.f17957OooO0Oo &= -2;
            }
            distribution.f17903OooO = this.f17962OooOO0;
            RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17964OooOO0o;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.f17957OooO0Oo & 2) != 0) {
                    this.f17963OooOO0O = Collections.unmodifiableList(this.f17963OooOO0O);
                    this.f17957OooO0Oo &= -3;
                }
                distribution.f17910OooOO0O = this.f17963OooOO0O;
            } else {
                distribution.f17910OooOO0O = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return distribution;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f17959OooO0o0 = 0L;
            this.f17958OooO0o = 0.0d;
            this.f17960OooO0oO = 0.0d;
            this.f17961OooO0oo = null;
            this.f17956OooO = null;
            Distribution distribution = Distribution.f17902OooOOO0;
            this.f17962OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f17957OooO0Oo &= -2;
            RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> repeatedFieldBuilderV3 = this.f17964OooOO0o;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.clear();
            } else {
                this.f17963OooOO0O = Collections.emptyList();
                this.f17957OooO0Oo &= -3;
            }
        }

        public final RepeatedFieldBuilderV3<Exemplar, Exemplar.OooO0O0, Object> OooO0o() {
            if (this.f17964OooOO0o == null) {
                this.f17964OooOO0o = new RepeatedFieldBuilderV3<>(this.f17963OooOO0O, (this.f17957OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f17963OooOO0O = null;
            }
            return this.f17964OooOO0o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO mo4023clone() {
            return (OooO0OO) super.mo4023clone();
        }

        public final void OooO0oO(Distribution distribution) {
            if (distribution == Distribution.f17902OooOOO0) {
                return;
            }
            long j = distribution.f17904OooO0Oo;
            if (j != 0) {
                this.f17959OooO0o0 = j;
                onChanged();
            }
            double d = distribution.f17906OooO0o0;
            if (d != 0.0d) {
                this.f17958OooO0o = d;
                onChanged();
            }
            double d2 = distribution.f17905OooO0o;
            if (d2 != 0.0d) {
                this.f17960OooO0oO = d2;
                onChanged();
            }
            if (distribution.f17907OooO0oO != null) {
                Range rangeOooO0Oo = distribution.OooO0Oo();
                Range range = this.f17961OooO0oo;
                if (range != null) {
                    Range.OooO0O0 builder = Range.f17965OooO0oO.toBuilder();
                    builder.OooO0o0(range);
                    builder.OooO0o0(rangeOooO0Oo);
                    this.f17961OooO0oo = builder.buildPartial();
                } else {
                    this.f17961OooO0oo = rangeOooO0Oo;
                }
                onChanged();
            }
            if (distribution.f17908OooO0oo != null) {
                BucketOptions bucketOptionsOooO0OO = distribution.OooO0OO();
                BucketOptions bucketOptions = this.f17956OooO;
                if (bucketOptions != null) {
                    BucketOptions.OooO0O0 builder2 = BucketOptions.f17912OooO0oO.toBuilder();
                    builder2.OooO0o0(bucketOptions);
                    builder2.OooO0o0(bucketOptionsOooO0OO);
                    this.f17956OooO = builder2.buildPartial();
                } else {
                    this.f17956OooO = bucketOptionsOooO0OO;
                }
                onChanged();
            }
            if (!distribution.f17903OooO.isEmpty()) {
                if (this.f17962OooOO0.isEmpty()) {
                    this.f17962OooOO0 = distribution.f17903OooO;
                    this.f17957OooO0Oo &= -2;
                } else {
                    if ((this.f17957OooO0Oo & 1) == 0) {
                        this.f17962OooOO0 = GeneratedMessageV3.mutableCopy(this.f17962OooOO0);
                        this.f17957OooO0Oo |= 1;
                    }
                    this.f17962OooOO0.addAll(distribution.f17903OooO);
                }
                onChanged();
            }
            if (this.f17964OooOO0o == null) {
                if (!distribution.f17910OooOO0O.isEmpty()) {
                    if (this.f17963OooOO0O.isEmpty()) {
                        this.f17963OooOO0O = distribution.f17910OooOO0O;
                        this.f17957OooO0Oo &= -3;
                    } else {
                        if ((this.f17957OooO0Oo & 2) == 0) {
                            this.f17963OooOO0O = new ArrayList(this.f17963OooOO0O);
                            this.f17957OooO0Oo |= 2;
                        }
                        this.f17963OooOO0O.addAll(distribution.f17910OooOO0O);
                    }
                    onChanged();
                }
            } else if (!distribution.f17910OooOO0O.isEmpty()) {
                if (this.f17964OooOO0o.isEmpty()) {
                    this.f17964OooOO0o.dispose();
                    this.f17964OooOO0o = null;
                    this.f17963OooOO0O = distribution.f17910OooOO0O;
                    this.f17957OooO0Oo &= -3;
                    this.f17964OooOO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f17964OooOO0o.addAllMessages(distribution.f17910OooOO0O);
                }
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Distribution distribution;
            try {
                try {
                    Distribution.f17901OooOOO.getClass();
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
            return Distribution.f17902OooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return OooOo00.f41206OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOo00.f41207OooO0O0.ensureFieldAccessorsInitialized(Distribution.class, OooO0OO.class);
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
            return Distribution.f17902OooOOO0;
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
            Distribution distribution = Distribution.f17902OooOOO0;
            this.f17962OooOO0 = GeneratedMessageV3.emptyLongList();
            this.f17963OooOO0O = Collections.emptyList();
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
        public static final Range f17965OooO0oO = new Range();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f17966OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f17967OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f17968OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f17969OooO0o0;

        public static class OooO00o extends AbstractParser<Range> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Range(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public double f17970OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public double f17971OooO0o0;

            public OooO0O0() {
                Range range = Range.f17965OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final Range buildPartial() {
                Range range = new Range(this);
                range.f17967OooO0Oo = this.f17970OooO0Oo;
                range.f17969OooO0o0 = this.f17971OooO0o0;
                onBuilt();
                return range;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4023clone() {
                return (OooO0O0) super.mo4023clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Range range;
                try {
                    try {
                        Range.f17966OooO0oo.getClass();
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
                if (range == Range.f17965OooO0oO) {
                    return;
                }
                double d = range.f17967OooO0Oo;
                if (d != 0.0d) {
                    this.f17970OooO0Oo = d;
                    onChanged();
                }
                double d2 = range.f17969OooO0o0;
                if (d2 != 0.0d) {
                    this.f17971OooO0o0 = d2;
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
                this.f17970OooO0Oo = 0.0d;
                this.f17971OooO0o0 = 0.0d;
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
                return Range.f17965OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return OooOo00.f41208OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OooOo00.f41209OooO0Oo.ensureFieldAccessorsInitialized(Range.class, OooO0O0.class);
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
                return Range.f17965OooO0oO;
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
                Range range = Range.f17965OooO0oO;
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
                this.f17970OooO0Oo = 0.0d;
                this.f17971OooO0o0 = 0.0d;
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
                this.f17970OooO0Oo = 0.0d;
                this.f17971OooO0o0 = 0.0d;
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
                this.f17970OooO0Oo = 0.0d;
                this.f17971OooO0o0 = 0.0d;
                return this;
            }
        }

        public Range(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f17968OooO0o = (byte) -1;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f17965OooO0oO) {
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
            return Double.doubleToLongBits(this.f17967OooO0Oo) == Double.doubleToLongBits(range.f17967OooO0Oo) && Double.doubleToLongBits(this.f17969OooO0o0) == Double.doubleToLongBits(range.f17969OooO0o0) && this.unknownFields.equals(range.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f17965OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<Range> getParserForType() {
            return f17966OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.f17967OooO0Oo) != 0 ? 0 + CodedOutputStream.computeDoubleSize(1, this.f17967OooO0Oo) : 0;
            if (Double.doubleToRawLongBits(this.f17969OooO0o0) != 0) {
                iComputeDoubleSize += CodedOutputStream.computeDoubleSize(2, this.f17969OooO0o0);
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
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(Double.doubleToLongBits(this.f17969OooO0o0)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17967OooO0Oo)) + o0O0O0Oo.OooO00o.OooO00o(OooOo00.f41208OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OooOo00.f41209OooO0Oo.ensureFieldAccessorsInitialized(Range.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f17968OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f17968OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f17965OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Range();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (Double.doubleToRawLongBits(this.f17967OooO0Oo) != 0) {
                codedOutputStream.writeDouble(1, this.f17967OooO0Oo);
            }
            if (Double.doubleToRawLongBits(this.f17969OooO0o0) != 0) {
                codedOutputStream.writeDouble(2, this.f17969OooO0o0);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f17965OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f17965OooO0oO.toBuilder();
        }

        private Range() {
            this.f17968OooO0o = (byte) -1;
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
                                    this.f17967OooO0Oo = codedInputStream.readDouble();
                                } else if (tag != 17) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f17969OooO0o0 = codedInputStream.readDouble();
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
        this.f17909OooOO0 = -1;
        this.f17911OooOO0o = (byte) -1;
    }

    public final BucketOptions OooO0OO() {
        BucketOptions bucketOptions = this.f17908OooO0oo;
        return bucketOptions == null ? BucketOptions.f17912OooO0oO : bucketOptions;
    }

    public final Range OooO0Oo() {
        Range range = this.f17907OooO0oO;
        return range == null ? Range.f17965OooO0oO : range;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f17902OooOOO0) {
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
        if (this.f17904OooO0Oo != distribution.f17904OooO0Oo || Double.doubleToLongBits(this.f17906OooO0o0) != Double.doubleToLongBits(distribution.f17906OooO0o0) || Double.doubleToLongBits(this.f17905OooO0o) != Double.doubleToLongBits(distribution.f17905OooO0o)) {
            return false;
        }
        Range range = this.f17907OooO0oO;
        if ((range != null) != (distribution.f17907OooO0oO != null)) {
            return false;
        }
        if ((range != null) && !OooO0Oo().equals(distribution.OooO0Oo())) {
            return false;
        }
        BucketOptions bucketOptions = this.f17908OooO0oo;
        if ((bucketOptions != null) != (distribution.f17908OooO0oo != null)) {
            return false;
        }
        return (!(bucketOptions != null) || OooO0OO().equals(distribution.OooO0OO())) && this.f17903OooO.equals(distribution.f17903OooO) && this.f17910OooOO0O.equals(distribution.f17910OooOO0O) && this.unknownFields.equals(distribution.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f17902OooOOO0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Distribution> getParserForType() {
        return f17901OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f17904OooO0Oo;
        int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) + 0 : 0;
        if (Double.doubleToRawLongBits(this.f17906OooO0o0) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(2, this.f17906OooO0o0);
        }
        if (Double.doubleToRawLongBits(this.f17905OooO0o) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(3, this.f17905OooO0o);
        }
        if (this.f17907OooO0oO != null) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(4, OooO0Oo());
        }
        if (this.f17908OooO0oo != null) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(6, OooO0OO());
        }
        int iComputeInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < this.f17903OooO.size(); i2++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(this.f17903OooO.getLong(i2));
        }
        int iComputeMessageSize = iComputeInt64Size + iComputeInt64SizeNoTag;
        if (!this.f17903OooO.isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt64SizeNoTag);
        }
        this.f17909OooOO0 = iComputeInt64SizeNoTag;
        for (int i3 = 0; i3 < this.f17910OooOO0O.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(10, this.f17910OooOO0O.get(i3));
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
        int iHashLong = Internal.hashLong(Double.doubleToLongBits(this.f17905OooO0o)) + ((((Internal.hashLong(Double.doubleToLongBits(this.f17906OooO0o0)) + ((((Internal.hashLong(this.f17904OooO0Oo) + o0O0O0Oo.OooO00o.OooO00o(OooOo00.f41206OooO00o, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (this.f17907OooO0oO != null) {
            iHashLong = OooO0Oo().hashCode() + o00Ooo.OooO00o(iHashLong, 37, 4, 53);
        }
        if (this.f17908OooO0oo != null) {
            iHashLong = OooO0OO().hashCode() + o00Ooo.OooO00o(iHashLong, 37, 6, 53);
        }
        if (this.f17903OooO.size() > 0) {
            iHashLong = this.f17903OooO.hashCode() + o00Ooo.OooO00o(iHashLong, 37, 7, 53);
        }
        if (this.f17910OooOO0O.size() > 0) {
            iHashLong = this.f17910OooOO0O.hashCode() + o00Ooo.OooO00o(iHashLong, 37, 10, 53);
        }
        int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OooOo00.f41207OooO0O0.ensureFieldAccessorsInitialized(Distribution.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f17911OooOO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f17911OooOO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f17902OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Distribution();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        long j = this.f17904OooO0Oo;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (Double.doubleToRawLongBits(this.f17906OooO0o0) != 0) {
            codedOutputStream.writeDouble(2, this.f17906OooO0o0);
        }
        if (Double.doubleToRawLongBits(this.f17905OooO0o) != 0) {
            codedOutputStream.writeDouble(3, this.f17905OooO0o);
        }
        if (this.f17907OooO0oO != null) {
            codedOutputStream.writeMessage(4, OooO0Oo());
        }
        if (this.f17908OooO0oo != null) {
            codedOutputStream.writeMessage(6, OooO0OO());
        }
        if (this.f17903OooO.size() > 0) {
            codedOutputStream.writeUInt32NoTag(58);
            codedOutputStream.writeUInt32NoTag(this.f17909OooOO0);
        }
        for (int i = 0; i < this.f17903OooO.size(); i++) {
            codedOutputStream.writeInt64NoTag(this.f17903OooO.getLong(i));
        }
        for (int i2 = 0; i2 < this.f17910OooOO0O.size(); i2++) {
            codedOutputStream.writeMessage(10, this.f17910OooOO0O.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f17902OooOOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f17902OooOOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private Distribution() {
        this.f17909OooOO0 = -1;
        this.f17911OooOO0o = (byte) -1;
        this.f17903OooO = GeneratedMessageV3.emptyLongList();
        this.f17910OooOO0O = Collections.emptyList();
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
                                this.f17904OooO0Oo = codedInputStream.readInt64();
                            } else if (tag == 17) {
                                this.f17906OooO0o0 = codedInputStream.readDouble();
                            } else if (tag != 25) {
                                if (tag == 34) {
                                    Range range = this.f17907OooO0oO;
                                    Range.OooO0O0 builder = range != null ? range.toBuilder() : null;
                                    Range range2 = (Range) codedInputStream.readMessage(Range.f17966OooO0oo, extensionRegistryLite);
                                    this.f17907OooO0oO = range2;
                                    if (builder != null) {
                                        builder.OooO0o0(range2);
                                        this.f17907OooO0oO = builder.buildPartial();
                                    }
                                } else if (tag == 50) {
                                    BucketOptions bucketOptions = this.f17908OooO0oo;
                                    BucketOptions.OooO0O0 builder2 = bucketOptions != null ? bucketOptions.toBuilder() : null;
                                    BucketOptions bucketOptions2 = (BucketOptions) codedInputStream.readMessage(BucketOptions.f17913OooO0oo, extensionRegistryLite);
                                    this.f17908OooO0oo = bucketOptions2;
                                    if (builder2 != null) {
                                        builder2.OooO0o0(bucketOptions2);
                                        this.f17908OooO0oo = builder2.buildPartial();
                                    }
                                } else if (tag == 56) {
                                    int i2 = (i == true ? 1 : 0) & 1;
                                    i = i;
                                    if (i2 == 0) {
                                        this.f17903OooO = GeneratedMessageV3.newLongList();
                                        i = (i == true ? 1 : 0) | 1;
                                    }
                                    this.f17903OooO.addLong(codedInputStream.readInt64());
                                } else if (tag == 58) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    int i3 = (i == true ? 1 : 0) & 1;
                                    i = i;
                                    if (i3 == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                                        i = i;
                                        this.f17903OooO = GeneratedMessageV3.newLongList();
                                        i = (i == true ? 1 : 0) | 1;
                                    }
                                    i = i;
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f17903OooO.addLong(codedInputStream.readInt64());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag != 82) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i4 = (i == true ? 1 : 0) & 2;
                                    i = i;
                                    if (i4 == 0) {
                                        this.f17910OooOO0O = new ArrayList();
                                        i = (i == true ? 1 : 0) | 2;
                                    }
                                    this.f17910OooOO0O.add((Exemplar) codedInputStream.readMessage(Exemplar.f17944OooO, extensionRegistryLite));
                                }
                            } else {
                                this.f17905OooO0o = codedInputStream.readDouble();
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
                    this.f17903OooO.makeImmutable();
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.f17910OooOO0O = Collections.unmodifiableList(this.f17910OooOO0O);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.f17903OooO.makeImmutable();
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.f17910OooOO0O = Collections.unmodifiableList(this.f17910OooOO0O);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
