package com.google.type;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import p102o000oo0.o00Ooo;
import p329o0O0oooo.o00OOO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTime extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final DateTime f20612OooOOO = new DateTime();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f20613OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f20614OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f20615OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f20616OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f20617OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f20618OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f20619OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f20620OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f20621OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f20622OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte f20623OooOOO0;

    public static class OooO00o extends AbstractParser<DateTime> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new DateTime(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20624OooO00o;

        static {
            int[] iArr = new int[TimeOffsetCase.values().length];
            f20624OooO00o = iArr;
            try {
                iArr[TimeOffsetCase.UTC_OFFSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20624OooO00o[TimeOffsetCase.TIME_ZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20624OooO00o[TimeOffsetCase.TIMEOFFSET_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f20625OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20626OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f20627OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public GeneratedMessageV3 f20628OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f20629OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f20630OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f20631OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f20632OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f20633OooOO0o;

        public OooO0OO() {
            this.f20626OooO0Oo = 0;
            DateTime dateTime = DateTime.f20612OooOOO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final DateTime buildPartial() {
            DateTime dateTime = new DateTime(this);
            dateTime.f20616OooO0o = this.f20627OooO0o;
            dateTime.f20618OooO0oO = this.f20629OooO0oO;
            dateTime.f20619OooO0oo = this.f20630OooO0oo;
            dateTime.f20614OooO = this.f20625OooO;
            dateTime.f20620OooOO0 = this.f20631OooOO0;
            dateTime.f20621OooOO0O = this.f20632OooOO0O;
            dateTime.f20622OooOO0o = this.f20633OooOO0o;
            int i = this.f20626OooO0Oo;
            if (i == 8) {
                dateTime.f20617OooO0o0 = this.f20628OooO0o0;
            }
            if (i == 9) {
                dateTime.f20617OooO0o0 = this.f20628OooO0o0;
            }
            dateTime.f20615OooO0Oo = i;
            onBuilt();
            return dateTime;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20627OooO0o = 0;
            this.f20629OooO0oO = 0;
            this.f20630OooO0oo = 0;
            this.f20625OooO = 0;
            this.f20631OooOO0 = 0;
            this.f20632OooOO0O = 0;
            this.f20633OooOO0o = 0;
            this.f20626OooO0Oo = 0;
            this.f20628OooO0o0 = null;
        }

        public final void OooO0o(DateTime dateTime) {
            GeneratedMessageV3 generatedMessageV3;
            TimeZone timeZone;
            if (dateTime == DateTime.f20612OooOOO) {
                return;
            }
            int i = dateTime.f20616OooO0o;
            if (i != 0) {
                this.f20627OooO0o = i;
                onChanged();
            }
            int i2 = dateTime.f20618OooO0oO;
            if (i2 != 0) {
                this.f20629OooO0oO = i2;
                onChanged();
            }
            int i3 = dateTime.f20619OooO0oo;
            if (i3 != 0) {
                this.f20630OooO0oo = i3;
                onChanged();
            }
            int i4 = dateTime.f20614OooO;
            if (i4 != 0) {
                this.f20625OooO = i4;
                onChanged();
            }
            int i5 = dateTime.f20620OooOO0;
            if (i5 != 0) {
                this.f20631OooOO0 = i5;
                onChanged();
            }
            int i6 = dateTime.f20621OooOO0O;
            if (i6 != 0) {
                this.f20632OooOO0O = i6;
                onChanged();
            }
            int i7 = dateTime.f20622OooOO0o;
            if (i7 != 0) {
                this.f20633OooOO0o = i7;
                onChanged();
            }
            int i8 = OooO0O0.f20624OooO00o[dateTime.OooO0O0().ordinal()];
            if (i8 == 1) {
                Duration durationOooO0Oo = dateTime.OooO0Oo();
                if (this.f20626OooO0Oo != 8 || this.f20628OooO0o0 == Duration.getDefaultInstance()) {
                    this.f20628OooO0o0 = durationOooO0Oo;
                } else {
                    this.f20628OooO0o0 = Duration.newBuilder((Duration) this.f20628OooO0o0).mergeFrom(durationOooO0Oo).buildPartial();
                }
                onChanged();
                this.f20626OooO0Oo = 8;
            } else if (i8 == 2) {
                TimeZone timeZoneOooO0OO = dateTime.OooO0OO();
                if (this.f20626OooO0Oo != 9 || (generatedMessageV3 = this.f20628OooO0o0) == (timeZone = TimeZone.f20752OooO0oO)) {
                    this.f20628OooO0o0 = timeZoneOooO0OO;
                } else {
                    TimeZone.OooO0O0 builder = timeZone.toBuilder();
                    builder.OooO0o0((TimeZone) generatedMessageV3);
                    builder.OooO0o0(timeZoneOooO0OO);
                    this.f20628OooO0o0 = builder.buildPartial();
                }
                onChanged();
                this.f20626OooO0Oo = 9;
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
            DateTime dateTime;
            try {
                try {
                    DateTime.f20613OooOOOO.getClass();
                    OooO0o(new DateTime(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    dateTime = (DateTime) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (dateTime != null) {
                            OooO0o(dateTime);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dateTime = null;
                if (dateTime != null) {
                    OooO0o(dateTime);
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
            DateTime dateTimeBuildPartial = buildPartial();
            if (dateTimeBuildPartial.isInitialized()) {
                return dateTimeBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dateTimeBuildPartial);
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
            return DateTime.f20612OooOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00OOO0O.f42122OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00OOO0O.f42123OooO0O0.ensureFieldAccessorsInitialized(DateTime.class, OooO0OO.class);
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
            return DateTime.f20612OooOOO;
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

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f20626OooO0Oo = 0;
            DateTime dateTime = DateTime.f20612OooOOO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            DateTime dateTimeBuildPartial = buildPartial();
            if (dateTimeBuildPartial.isInitialized()) {
                return dateTimeBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dateTimeBuildPartial);
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
            if (message instanceof DateTime) {
                OooO0o((DateTime) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof DateTime) {
                OooO0o((DateTime) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public enum TimeOffsetCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);

        private final int value;

        TimeOffsetCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public DateTime(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f20615OooO0Oo = 0;
        this.f20623OooOOO0 = (byte) -1;
    }

    public final TimeOffsetCase OooO0O0() {
        int i = this.f20615OooO0Oo;
        if (i == 0) {
            return TimeOffsetCase.TIMEOFFSET_NOT_SET;
        }
        if (i == 8) {
            return TimeOffsetCase.UTC_OFFSET;
        }
        if (i != 9) {
            return null;
        }
        return TimeOffsetCase.TIME_ZONE;
    }

    public final TimeZone OooO0OO() {
        return this.f20615OooO0Oo == 9 ? (TimeZone) this.f20617OooO0o0 : TimeZone.f20752OooO0oO;
    }

    public final Duration OooO0Oo() {
        return this.f20615OooO0Oo == 8 ? (Duration) this.f20617OooO0o0 : Duration.getDefaultInstance();
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f20612OooOOO) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return super.equals(obj);
        }
        DateTime dateTime = (DateTime) obj;
        if (this.f20616OooO0o != dateTime.f20616OooO0o || this.f20618OooO0oO != dateTime.f20618OooO0oO || this.f20619OooO0oo != dateTime.f20619OooO0oo || this.f20614OooO != dateTime.f20614OooO || this.f20620OooOO0 != dateTime.f20620OooOO0 || this.f20621OooOO0O != dateTime.f20621OooOO0O || this.f20622OooOO0o != dateTime.f20622OooOO0o || !OooO0O0().equals(dateTime.OooO0O0())) {
            return false;
        }
        int i = this.f20615OooO0Oo;
        if (i != 8) {
            if (i == 9 && !OooO0OO().equals(dateTime.OooO0OO())) {
                return false;
            }
        } else if (!OooO0Oo().equals(dateTime.OooO0Oo())) {
            return false;
        }
        return this.unknownFields.equals(dateTime.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20612OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<DateTime> getParserForType() {
        return f20613OooOOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.f20616OooO0o;
        int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
        int i3 = this.f20618OooO0oO;
        if (i3 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.f20619OooO0oo;
        if (i4 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
        }
        int i5 = this.f20614OooO;
        if (i5 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i5);
        }
        int i6 = this.f20620OooOO0;
        if (i6 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i6);
        }
        int i7 = this.f20621OooOO0O;
        if (i7 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i7);
        }
        int i8 = this.f20622OooOO0o;
        if (i8 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i8);
        }
        if (this.f20615OooO0Oo == 8) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(8, (Duration) this.f20617OooO0o0);
        }
        if (this.f20615OooO0Oo == 9) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (TimeZone) this.f20617OooO0o0);
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
        int iOooO00o;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iOooO00o2 = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(o0O0O0Oo.OooO00o.OooO00o(o00OOO0O.f42122OooO00o, 779, 37, 1, 53), this.f20616OooO0o, 37, 2, 53), this.f20618OooO0oO, 37, 3, 53), this.f20619OooO0oo, 37, 4, 53), this.f20614OooO, 37, 5, 53), this.f20620OooOO0, 37, 6, 53), this.f20621OooOO0O, 37, 7, 53) + this.f20622OooOO0o;
        int i2 = this.f20615OooO0Oo;
        if (i2 != 8) {
            if (i2 == 9) {
                iOooO00o = o00Ooo.OooO00o(iOooO00o2, 37, 9, 53);
                iHashCode = OooO0OO().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iOooO00o2 * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }
        iOooO00o = o00Ooo.OooO00o(iOooO00o2, 37, 8, 53);
        iHashCode = OooO0Oo().hashCode();
        iOooO00o2 = iOooO00o + iHashCode;
        int iHashCode3 = this.unknownFields.hashCode() + (iOooO00o2 * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00OOO0O.f42123OooO0O0.ensureFieldAccessorsInitialized(DateTime.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20623OooOOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20623OooOOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20612OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DateTime();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20616OooO0o;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f20618OooO0oO;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        int i3 = this.f20619OooO0oo;
        if (i3 != 0) {
            codedOutputStream.writeInt32(3, i3);
        }
        int i4 = this.f20614OooO;
        if (i4 != 0) {
            codedOutputStream.writeInt32(4, i4);
        }
        int i5 = this.f20620OooOO0;
        if (i5 != 0) {
            codedOutputStream.writeInt32(5, i5);
        }
        int i6 = this.f20621OooOO0O;
        if (i6 != 0) {
            codedOutputStream.writeInt32(6, i6);
        }
        int i7 = this.f20622OooOO0o;
        if (i7 != 0) {
            codedOutputStream.writeInt32(7, i7);
        }
        if (this.f20615OooO0Oo == 8) {
            codedOutputStream.writeMessage(8, (Duration) this.f20617OooO0o0);
        }
        if (this.f20615OooO0Oo == 9) {
            codedOutputStream.writeMessage(9, (TimeZone) this.f20617OooO0o0);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20612OooOOO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20612OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private DateTime() {
        this.f20615OooO0Oo = 0;
        this.f20623OooOOO0 = (byte) -1;
    }

    public DateTime(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.f20616OooO0o = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f20618OooO0oO = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f20619OooO0oo = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.f20614OooO = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.f20620OooOO0 = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.f20621OooOO0O = codedInputStream.readInt32();
                            } else if (tag != 56) {
                                if (tag == 66) {
                                    Duration.Builder builder = this.f20615OooO0Oo == 8 ? ((Duration) this.f20617OooO0o0).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    this.f20617OooO0o0 = message;
                                    if (builder != null) {
                                        builder.mergeFrom((Duration) message);
                                        this.f20617OooO0o0 = builder.buildPartial();
                                    }
                                    this.f20615OooO0Oo = 8;
                                } else if (tag != 74) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    TimeZone.OooO0O0 builder2 = this.f20615OooO0Oo == 9 ? ((TimeZone) this.f20617OooO0o0).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(TimeZone.f20753OooO0oo, extensionRegistryLite);
                                    this.f20617OooO0o0 = message2;
                                    if (builder2 != null) {
                                        builder2.OooO0o0((TimeZone) message2);
                                        this.f20617OooO0o0 = builder2.buildPartial();
                                    }
                                    this.f20615OooO0Oo = 9;
                                }
                            } else {
                                this.f20622OooOO0o = codedInputStream.readInt32();
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
