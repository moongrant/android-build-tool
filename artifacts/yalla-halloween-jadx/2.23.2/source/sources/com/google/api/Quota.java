package com.google.api;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
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
import o0O0O0Oo.o0OO00O;
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class Quota extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Quota f18234OooO0oO = new Quota();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f18235OooO0oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<QuotaLimit> f18236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public byte f18237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<MetricRule> f18238OooO0o0;

    public static class OooO00o extends AbstractParser<Quota> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Quota(codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18239OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.OooO0O0, Object> f18240OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List<QuotaLimit> f18241OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<MetricRule> f18242OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public RepeatedFieldBuilderV3<MetricRule, MetricRule.OooO0O0, Object> f18243OooO0oo;

        public OooO0O0() {
            this.f18241OooO0o0 = Collections.emptyList();
            this.f18242OooO0oO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooO0oO();
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Quota quota;
            try {
                try {
                    Quota.f18235OooO0oo.getClass();
                    OooO0oo(new Quota(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    quota = (Quota) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (quota != null) {
                            OooO0oo(quota);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                quota = null;
                if (quota != null) {
                    OooO0oo(quota);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Quota buildPartial() {
            Quota quota = new Quota(this);
            int i = this.f18239OooO0Oo;
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18240OooO0o;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.f18241OooO0o0 = Collections.unmodifiableList(this.f18241OooO0o0);
                    this.f18239OooO0Oo &= -2;
                }
                quota.f18236OooO0Oo = this.f18241OooO0o0;
            } else {
                quota.f18236OooO0Oo = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<MetricRule, MetricRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18243OooO0oo;
            if (repeatedFieldBuilderV4 == null) {
                if ((this.f18239OooO0Oo & 2) != 0) {
                    this.f18242OooO0oO = Collections.unmodifiableList(this.f18242OooO0oO);
                    this.f18239OooO0Oo &= -3;
                }
                quota.f18238OooO0o0 = this.f18242OooO0oO;
            } else {
                quota.f18238OooO0o0 = repeatedFieldBuilderV4.build();
            }
            onBuilt();
            return quota;
        }

        public final void OooO0Oo() {
            super.clear();
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.OooO0O0, Object> repeatedFieldBuilderV3 = this.f18240OooO0o;
            if (repeatedFieldBuilderV3 == null) {
                this.f18241OooO0o0 = Collections.emptyList();
                this.f18239OooO0Oo &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<MetricRule, MetricRule.OooO0O0, Object> repeatedFieldBuilderV4 = this.f18243OooO0oo;
            if (repeatedFieldBuilderV4 != null) {
                repeatedFieldBuilderV4.clear();
            } else {
                this.f18242OooO0oO = Collections.emptyList();
                this.f18239OooO0Oo &= -3;
            }
        }

        public final RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.OooO0O0, Object> OooO0o() {
            if (this.f18240OooO0o == null) {
                this.f18240OooO0o = new RepeatedFieldBuilderV3<>(this.f18241OooO0o0, (this.f18239OooO0Oo & 1) != 0, getParentForChildren(), isClean());
                this.f18241OooO0o0 = null;
            }
            return this.f18240OooO0o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 mo4023clone() {
            return (OooO0O0) super.mo4023clone();
        }

        public final RepeatedFieldBuilderV3<MetricRule, MetricRule.OooO0O0, Object> OooO0oO() {
            if (this.f18243OooO0oo == null) {
                this.f18243OooO0oo = new RepeatedFieldBuilderV3<>(this.f18242OooO0oO, (this.f18239OooO0Oo & 2) != 0, getParentForChildren(), isClean());
                this.f18242OooO0oO = null;
            }
            return this.f18243OooO0oo;
        }

        public final void OooO0oo(Quota quota) {
            if (quota == Quota.f18234OooO0oO) {
                return;
            }
            if (this.f18240OooO0o == null) {
                if (!quota.f18236OooO0Oo.isEmpty()) {
                    if (this.f18241OooO0o0.isEmpty()) {
                        this.f18241OooO0o0 = quota.f18236OooO0Oo;
                        this.f18239OooO0Oo &= -2;
                    } else {
                        if ((this.f18239OooO0Oo & 1) == 0) {
                            this.f18241OooO0o0 = new ArrayList(this.f18241OooO0o0);
                            this.f18239OooO0Oo |= 1;
                        }
                        this.f18241OooO0o0.addAll(quota.f18236OooO0Oo);
                    }
                    onChanged();
                }
            } else if (!quota.f18236OooO0Oo.isEmpty()) {
                if (this.f18240OooO0o.isEmpty()) {
                    this.f18240OooO0o.dispose();
                    this.f18240OooO0o = null;
                    this.f18241OooO0o0 = quota.f18236OooO0Oo;
                    this.f18239OooO0Oo &= -2;
                    this.f18240OooO0o = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0o() : null;
                } else {
                    this.f18240OooO0o.addAllMessages(quota.f18236OooO0Oo);
                }
            }
            if (this.f18243OooO0oo == null) {
                if (!quota.f18238OooO0o0.isEmpty()) {
                    if (this.f18242OooO0oO.isEmpty()) {
                        this.f18242OooO0oO = quota.f18238OooO0o0;
                        this.f18239OooO0Oo &= -3;
                    } else {
                        if ((this.f18239OooO0Oo & 2) == 0) {
                            this.f18242OooO0oO = new ArrayList(this.f18242OooO0oO);
                            this.f18239OooO0Oo |= 2;
                        }
                        this.f18242OooO0oO.addAll(quota.f18238OooO0o0);
                    }
                    onChanged();
                }
            } else if (!quota.f18238OooO0o0.isEmpty()) {
                if (this.f18243OooO0oo.isEmpty()) {
                    this.f18243OooO0oo.dispose();
                    this.f18243OooO0oo = null;
                    this.f18242OooO0oO = quota.f18238OooO0o0;
                    this.f18239OooO0Oo &= -3;
                    this.f18243OooO0oo = GeneratedMessageV3.alwaysUseFieldBuilders ? OooO0oO() : null;
                } else {
                    this.f18243OooO0oo.addAllMessages(quota.f18238OooO0o0);
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
            Quota quotaBuildPartial = buildPartial();
            if (quotaBuildPartial.isInitialized()) {
                return quotaBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) quotaBuildPartial);
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
            return Quota.f18234OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o0OO00O.f41266OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o0OO00O.f41267OooO0O0.ensureFieldAccessorsInitialized(Quota.class, OooO0O0.class);
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
            return Quota.f18234OooO0oO;
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
            Quota quotaBuildPartial = buildPartial();
            if (quotaBuildPartial.isInitialized()) {
                return quotaBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) quotaBuildPartial);
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
            if (message instanceof Quota) {
                OooO0oo((Quota) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f18241OooO0o0 = Collections.emptyList();
            this.f18242OooO0oO = Collections.emptyList();
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                OooO0o();
                OooO0oO();
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Quota) {
                OooO0oo((Quota) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public Quota(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18237OooO0o = (byte) -1;
    }

    public static OooO00o OooO0O0() {
        return f18235OooO0oo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 toBuilder() {
        if (this == f18234OooO0oO) {
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
        if (!(obj instanceof Quota)) {
            return super.equals(obj);
        }
        Quota quota = (Quota) obj;
        return this.f18236OooO0Oo.equals(quota.f18236OooO0Oo) && this.f18238OooO0o0.equals(quota.f18238OooO0o0) && this.unknownFields.equals(quota.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18234OooO0oO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Quota> getParserForType() {
        return f18235OooO0oo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.f18236OooO0Oo.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f18236OooO0Oo.get(i2));
        }
        for (int i3 = 0; i3 < this.f18238OooO0o0.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f18238OooO0o0.get(i3));
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
        int iHashCode = o0OO00O.f41266OooO00o.hashCode() + 779;
        if (this.f18236OooO0Oo.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 3, 53) + this.f18236OooO0Oo.hashCode();
        }
        if (this.f18238OooO0o0.size() > 0) {
            iHashCode = o00Ooo.OooO00o(iHashCode, 37, 4, 53) + this.f18238OooO0o0.hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o0OO00O.f41267OooO0O0.ensureFieldAccessorsInitialized(Quota.class, OooO0O0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18237OooO0o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18237OooO0o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18234OooO0oO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Quota();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18236OooO0Oo.size(); i++) {
            codedOutputStream.writeMessage(3, this.f18236OooO0Oo.get(i));
        }
        for (int i2 = 0; i2 < this.f18238OooO0o0.size(); i2++) {
            codedOutputStream.writeMessage(4, this.f18238OooO0o0.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18234OooO0oO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18234OooO0oO.toBuilder();
    }

    private Quota() {
        this.f18237OooO0o = (byte) -1;
        this.f18236OooO0Oo = Collections.emptyList();
        this.f18238OooO0o0 = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0O0(builderParent);
    }

    public Quota(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (tag == 26) {
                                if ((i & 1) == 0) {
                                    this.f18236OooO0Oo = new ArrayList();
                                    i |= 1;
                                }
                                this.f18236OooO0Oo.add((QuotaLimit) codedInputStream.readMessage(QuotaLimit.f18245OooOOOo, extensionRegistryLite));
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 2) == 0) {
                                    this.f18238OooO0o0 = new ArrayList();
                                    i |= 2;
                                }
                                this.f18238OooO0o0.add((MetricRule) codedInputStream.readMessage(MetricRule.f18144OooO0oo, extensionRegistryLite));
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
                    this.f18236OooO0Oo = Collections.unmodifiableList(this.f18236OooO0Oo);
                }
                if ((i & 2) != 0) {
                    this.f18238OooO0o0 = Collections.unmodifiableList(this.f18238OooO0o0);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.f18236OooO0Oo = Collections.unmodifiableList(this.f18236OooO0Oo);
        }
        if ((i & 2) != 0) {
            this.f18238OooO0o0 = Collections.unmodifiableList(this.f18238OooO0o0);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }
}
