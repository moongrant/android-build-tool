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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Map;
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;
import p320o0O0oo0o.o00O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class QuotaLimit extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final QuotaLimit f18720OooOOOO = new QuotaLimit();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO00o f18721OooOOOo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile Object f18722OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Object f18723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f18724OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Object f18725OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f18726OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f18727OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile Object f18728OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile Object f18729OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MapField<String, Long> f18730OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public byte f18731OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile Object f18732OooOOO0;

    public static class OooO00o extends AbstractParser<QuotaLimit> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new QuotaLimit(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f18733OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f18734OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f18735OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18736OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f18737OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f18738OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f18739OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f18740OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public MapField<String, Long> f18741OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f18742OooOOO0;

        public OooO0O0() {
            this.f18734OooO0Oo = "";
            this.f18736OooO0o0 = "";
            this.f18733OooO = "";
            this.f18739OooOO0 = "";
            this.f18740OooOO0O = "";
            this.f18742OooOOO0 = "";
            QuotaLimit quotaLimit = QuotaLimit.f18720OooOOOO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final QuotaLimit buildPartial() {
            QuotaLimit quotaLimit = new QuotaLimit(this);
            quotaLimit.f18723OooO0Oo = this.f18734OooO0Oo;
            quotaLimit.f18725OooO0o0 = this.f18736OooO0o0;
            quotaLimit.f18724OooO0o = this.f18735OooO0o;
            quotaLimit.f18726OooO0oO = this.f18737OooO0oO;
            quotaLimit.f18727OooO0oo = this.f18738OooO0oo;
            quotaLimit.f18722OooO = this.f18733OooO;
            quotaLimit.f18728OooOO0 = this.f18739OooOO0;
            quotaLimit.f18729OooOO0O = this.f18740OooOO0O;
            MapField<String, Long> mapFieldEmptyMapField = this.f18741OooOO0o;
            if (mapFieldEmptyMapField == null) {
                mapFieldEmptyMapField = MapField.emptyMapField(OooO0OO.f18743OooO00o);
            }
            quotaLimit.f18730OooOO0o = mapFieldEmptyMapField;
            mapFieldEmptyMapField.makeImmutable();
            quotaLimit.f18732OooOOO0 = this.f18742OooOOO0;
            onBuilt();
            return quotaLimit;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18734OooO0Oo = "";
            this.f18736OooO0o0 = "";
            this.f18735OooO0o = 0L;
            this.f18737OooO0oO = 0L;
            this.f18738OooO0oo = 0L;
            this.f18733OooO = "";
            this.f18739OooOO0 = "";
            this.f18740OooOO0O = "";
            OooO0o().clear();
            this.f18742OooOOO0 = "";
        }

        public final MapField<String, Long> OooO0o() {
            onChanged();
            if (this.f18741OooOO0o == null) {
                this.f18741OooOO0o = MapField.newMapField(OooO0OO.f18743OooO00o);
            }
            if (!this.f18741OooOO0o.isMutable()) {
                this.f18741OooOO0o = this.f18741OooOO0o.copy();
            }
            return this.f18741OooOO0o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4013clone() {
            return (OooO0O0) super.mo4013clone();
        }

        public final void OooO0oO(QuotaLimit quotaLimit) {
            if (quotaLimit == QuotaLimit.f18720OooOOOO) {
                return;
            }
            if (!quotaLimit.getName().isEmpty()) {
                this.f18734OooO0Oo = quotaLimit.f18723OooO0Oo;
                onChanged();
            }
            if (!quotaLimit.getDescription().isEmpty()) {
                this.f18736OooO0o0 = quotaLimit.f18725OooO0o0;
                onChanged();
            }
            long j = quotaLimit.f18724OooO0o;
            if (j != 0) {
                this.f18735OooO0o = j;
                onChanged();
            }
            long j2 = quotaLimit.f18726OooO0oO;
            if (j2 != 0) {
                this.f18737OooO0oO = j2;
                onChanged();
            }
            long j3 = quotaLimit.f18727OooO0oo;
            if (j3 != 0) {
                this.f18738OooO0oo = j3;
                onChanged();
            }
            if (!quotaLimit.OooO0OO().isEmpty()) {
                this.f18733OooO = quotaLimit.f18722OooO;
                onChanged();
            }
            if (!quotaLimit.OooO0Oo().isEmpty()) {
                this.f18739OooOO0 = quotaLimit.f18728OooOO0;
                onChanged();
            }
            if (!quotaLimit.getUnit().isEmpty()) {
                this.f18740OooOO0O = quotaLimit.f18729OooOO0O;
                onChanged();
            }
            OooO0o().mergeFrom(quotaLimit.OooO0o0());
            if (!quotaLimit.OooO0O0().isEmpty()) {
                this.f18742OooOOO0 = quotaLimit.f18732OooOOO0;
                onChanged();
            }
            onChanged();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            QuotaLimit quotaLimit;
            try {
                try {
                    QuotaLimit.f18721OooOOOo.getClass();
                    OooO0oO(new QuotaLimit(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    quotaLimit = (QuotaLimit) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (quotaLimit != null) {
                            OooO0oO(quotaLimit);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                quotaLimit = null;
                if (quotaLimit != null) {
                    OooO0oO(quotaLimit);
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
            QuotaLimit quotaLimitBuildPartial = buildPartial();
            if (quotaLimitBuildPartial.isInitialized()) {
                return quotaLimitBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) quotaLimitBuildPartial);
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
            return QuotaLimit.f18720OooOOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00O0O0.f42791OooO0o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00O0O0.f42793OooO0oO.ensureFieldAccessorsInitialized(QuotaLimit.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final MapField internalGetMapField(int i) {
            if (i != 10) {
                throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
            }
            MapField<String, Long> mapField = this.f18741OooOO0o;
            return mapField == null ? MapField.emptyMapField(OooO0OO.f18743OooO00o) : mapField;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final MapField internalGetMutableMapField(int i) {
            if (i == 10) {
                return OooO0o();
            }
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
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
            return QuotaLimit.f18720OooOOOO;
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
            QuotaLimit quotaLimitBuildPartial = buildPartial();
            if (quotaLimitBuildPartial.isInitialized()) {
                return quotaLimitBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) quotaLimitBuildPartial);
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
            if (message instanceof QuotaLimit) {
                OooO0oO((QuotaLimit) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof QuotaLimit) {
                OooO0oO((QuotaLimit) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18734OooO0Oo = "";
            this.f18736OooO0o0 = "";
            this.f18733OooO = "";
            this.f18739OooOO0 = "";
            this.f18740OooOO0O = "";
            this.f18742OooOOO0 = "";
            QuotaLimit quotaLimit = QuotaLimit.f18720OooOOOO;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final MapEntry<String, Long> f18743OooO00o = MapEntry.newDefaultInstance(o00O0O0.f42794OooO0oo, WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    public QuotaLimit(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18731OooOOO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18732OooOOO0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18732OooOOO0 = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f18722OooO;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18722OooO = stringUtf8;
        return stringUtf8;
    }

    public final String OooO0Oo() {
        Object obj = this.f18728OooOO0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18728OooOO0 = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18720OooOOOO) {
            return new OooO0O0();
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO0oO(this);
        return oooO0O0;
    }

    public final MapField<String, Long> OooO0o0() {
        MapField<String, Long> mapField = this.f18730OooOO0o;
        return mapField == null ? MapField.emptyMapField(OooO0OO.f18743OooO00o) : mapField;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuotaLimit)) {
            return super.equals(obj);
        }
        QuotaLimit quotaLimit = (QuotaLimit) obj;
        return getName().equals(quotaLimit.getName()) && getDescription().equals(quotaLimit.getDescription()) && this.f18724OooO0o == quotaLimit.f18724OooO0o && this.f18726OooO0oO == quotaLimit.f18726OooO0oO && this.f18727OooO0oo == quotaLimit.f18727OooO0oo && OooO0OO().equals(quotaLimit.OooO0OO()) && OooO0Oo().equals(quotaLimit.OooO0Oo()) && getUnit().equals(quotaLimit.getUnit()) && OooO0o0().equals(quotaLimit.OooO0o0()) && OooO0O0().equals(quotaLimit.OooO0O0()) && this.unknownFields.equals(quotaLimit.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18720OooOOOO;
    }

    public final String getDescription() {
        Object obj = this.f18725OooO0o0;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18725OooO0o0 = stringUtf8;
        return stringUtf8;
    }

    public final String getName() {
        Object obj = this.f18723OooO0Oo;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18723OooO0Oo = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<QuotaLimit> getParserForType() {
        return f18721OooOOOo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f18725OooO0o0) ? 0 : 0 + GeneratedMessageV3.computeStringSize(2, this.f18725OooO0o0);
        long j = this.f18724OooO0o;
        if (j != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(3, j);
        }
        long j2 = this.f18726OooO0oO;
        if (j2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(4, j2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18722OooO)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.f18722OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18723OooO0Oo)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.f18723OooO0Oo);
        }
        long j3 = this.f18727OooO0oo;
        if (j3 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(7, j3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18728OooOO0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f18728OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18729OooOO0O)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.f18729OooOO0O);
        }
        for (Map.Entry<String, Long> entry : OooO0o0().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, OooO0OO.f18743OooO00o.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18732OooOOO0)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.f18732OooOOO0);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final String getUnit() {
        Object obj = this.f18729OooOO0O;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18729OooOO0O = stringUtf8;
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
        int iHashCode = getUnit().hashCode() + ((((OooO0Oo().hashCode() + ((((OooO0OO().hashCode() + ((((Internal.hashLong(this.f18727OooO0oo) + ((((Internal.hashLong(this.f18726OooO0oO) + ((((Internal.hashLong(this.f18724OooO0o) + ((((getDescription().hashCode() + ((((getName().hashCode() + o000Oo0.OooO00o(o00O0O0.f42791OooO0o, 779, 37, 6, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 7) * 53)) * 37) + 5) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53);
        if (!OooO0o0().getMap().isEmpty()) {
            iHashCode = o000000O.OooO00o(iHashCode, 37, 10, 53) + OooO0o0().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((OooO0O0().hashCode() + o000000O.OooO00o(iHashCode, 37, 12, 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00O0O0.f42793OooO0oO.ensureFieldAccessorsInitialized(QuotaLimit.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final MapField internalGetMapField(int i) {
        if (i == 10) {
            return OooO0o0();
        }
        throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Invalid map field number: ", i));
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18731OooOOO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18731OooOOO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18720OooOOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new QuotaLimit();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f18725OooO0o0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18725OooO0o0);
        }
        long j = this.f18724OooO0o;
        if (j != 0) {
            codedOutputStream.writeInt64(3, j);
        }
        long j2 = this.f18726OooO0oO;
        if (j2 != 0) {
            codedOutputStream.writeInt64(4, j2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18722OooO)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.f18722OooO);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18723OooO0Oo)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.f18723OooO0Oo);
        }
        long j3 = this.f18727OooO0oo;
        if (j3 != 0) {
            codedOutputStream.writeInt64(7, j3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18728OooOO0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.f18728OooOO0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18729OooOO0O)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.f18729OooOO0O);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, OooO0o0(), OooO0OO.f18743OooO00o, 10);
        if (!GeneratedMessageV3.isStringEmpty(this.f18732OooOOO0)) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.f18732OooOOO0);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18720OooOOOO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18720OooOOOO.toBuilder();
    }

    private QuotaLimit() {
        this.f18731OooOOO = (byte) -1;
        this.f18723OooO0Oo = "";
        this.f18725OooO0o0 = "";
        this.f18722OooO = "";
        this.f18728OooOO0 = "";
        this.f18729OooOO0O = "";
        this.f18732OooOOO0 = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuotaLimit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        switch (tag) {
                            case 0:
                                break;
                            case 18:
                                this.f18725OooO0o0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.f18724OooO0o = codedInputStream.readInt64();
                                continue;
                            case 32:
                                this.f18726OooO0oO = codedInputStream.readInt64();
                                continue;
                            case 42:
                                this.f18722OooO = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.f18723OooO0Oo = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 56:
                                this.f18727OooO0oo = codedInputStream.readInt64();
                                continue;
                            case 66:
                                this.f18728OooOO0 = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 74:
                                this.f18729OooOO0O = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 82:
                                if (!(z2 & true)) {
                                    this.f18730OooOO0o = MapField.newMapField(OooO0OO.f18743OooO00o);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(OooO0OO.f18743OooO00o.getParserForType(), extensionRegistryLite);
                                this.f18730OooOO0o.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                continue;
                            case 98:
                                this.f18732OooOOO0 = codedInputStream.readStringRequireUtf8();
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
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
