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
import o000O00.o000000O;
import p069o0000ooO.o000000;
import p320o0O0oo0o.o000Oo0;
import p324o0O0ooo.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTime extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final DateTime f21085OooOOO = new DateTime();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f21086OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f21087OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f21088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f21089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f21090OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21091OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f21092OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f21093OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21094OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21095OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte f21096OooOOO0;

    public static class OooO00o extends AbstractParser<DateTime> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new DateTime(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21097OooO00o;

        static {
            int[] iArr = new int[TimeOffsetCase.values().length];
            f21097OooO00o = iArr;
            try {
                iArr[TimeOffsetCase.UTC_OFFSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21097OooO00o[TimeOffsetCase.TIME_ZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21097OooO00o[TimeOffsetCase.TIMEOFFSET_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f21098OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f21099OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f21100OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public GeneratedMessageV3 f21101OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f21102OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f21103OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f21104OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f21105OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f21106OooOO0o;

        public OooO0OO() {
            this.f21099OooO0Oo = 0;
            DateTime dateTime = DateTime.f21085OooOOO;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final DateTime buildPartial() {
            DateTime dateTime = new DateTime(this);
            dateTime.f21089OooO0o = this.f21100OooO0o;
            dateTime.f21091OooO0oO = this.f21102OooO0oO;
            dateTime.f21092OooO0oo = this.f21103OooO0oo;
            dateTime.f21087OooO = this.f21098OooO;
            dateTime.f21093OooOO0 = this.f21104OooOO0;
            dateTime.f21094OooOO0O = this.f21105OooOO0O;
            dateTime.f21095OooOO0o = this.f21106OooOO0o;
            int i = this.f21099OooO0Oo;
            if (i == 8) {
                dateTime.f21090OooO0o0 = this.f21101OooO0o0;
            }
            if (i == 9) {
                dateTime.f21090OooO0o0 = this.f21101OooO0o0;
            }
            dateTime.f21088OooO0Oo = i;
            onBuilt();
            return dateTime;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f21100OooO0o = 0;
            this.f21102OooO0oO = 0;
            this.f21103OooO0oo = 0;
            this.f21098OooO = 0;
            this.f21104OooOO0 = 0;
            this.f21105OooOO0O = 0;
            this.f21106OooOO0o = 0;
            this.f21099OooO0Oo = 0;
            this.f21101OooO0o0 = null;
        }

        public final void OooO0o(DateTime dateTime) {
            GeneratedMessageV3 generatedMessageV3;
            TimeZone timeZone;
            if (dateTime == DateTime.f21085OooOOO) {
                return;
            }
            int i = dateTime.f21089OooO0o;
            if (i != 0) {
                this.f21100OooO0o = i;
                onChanged();
            }
            int i2 = dateTime.f21091OooO0oO;
            if (i2 != 0) {
                this.f21102OooO0oO = i2;
                onChanged();
            }
            int i3 = dateTime.f21092OooO0oo;
            if (i3 != 0) {
                this.f21103OooO0oo = i3;
                onChanged();
            }
            int i4 = dateTime.f21087OooO;
            if (i4 != 0) {
                this.f21098OooO = i4;
                onChanged();
            }
            int i5 = dateTime.f21093OooOO0;
            if (i5 != 0) {
                this.f21104OooOO0 = i5;
                onChanged();
            }
            int i6 = dateTime.f21094OooOO0O;
            if (i6 != 0) {
                this.f21105OooOO0O = i6;
                onChanged();
            }
            int i7 = dateTime.f21095OooOO0o;
            if (i7 != 0) {
                this.f21106OooOO0o = i7;
                onChanged();
            }
            int i8 = OooO0O0.f21097OooO00o[dateTime.OooO0O0().ordinal()];
            if (i8 == 1) {
                Duration durationOooO0Oo = dateTime.OooO0Oo();
                if (this.f21099OooO0Oo != 8 || this.f21101OooO0o0 == Duration.getDefaultInstance()) {
                    this.f21101OooO0o0 = durationOooO0Oo;
                } else {
                    this.f21101OooO0o0 = Duration.newBuilder((Duration) this.f21101OooO0o0).mergeFrom(durationOooO0Oo).buildPartial();
                }
                onChanged();
                this.f21099OooO0Oo = 8;
            } else if (i8 == 2) {
                TimeZone timeZoneOooO0OO = dateTime.OooO0OO();
                if (this.f21099OooO0Oo != 9 || (generatedMessageV3 = this.f21101OooO0o0) == (timeZone = TimeZone.f21225OooO0oO)) {
                    this.f21101OooO0o0 = timeZoneOooO0OO;
                } else {
                    TimeZone.OooO0O0 builder = timeZone.toBuilder();
                    builder.OooO0o0((TimeZone) generatedMessageV3);
                    builder.OooO0o0(timeZoneOooO0OO);
                    this.f21101OooO0o0 = builder.buildPartial();
                }
                onChanged();
                this.f21099OooO0Oo = 9;
            }
            onChanged();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
        public final OooO0OO mo4013clone() {
            return (OooO0OO) super.mo4013clone();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        public final void OooO0oO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            DateTime dateTime;
            try {
                try {
                    DateTime.f21086OooOOOO.getClass();
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
            return DateTime.f21085OooOOO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o00O00o0.f42927OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o00O00o0.f42928OooO0O0.ensureFieldAccessorsInitialized(DateTime.class, OooO0OO.class);
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
            return DateTime.f21085OooOOO;
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
            this.f21099OooO0Oo = 0;
            DateTime dateTime = DateTime.f21085OooOOO;
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
        this.f21088OooO0Oo = 0;
        this.f21096OooOOO0 = (byte) -1;
    }

    public final TimeOffsetCase OooO0O0() {
        int i = this.f21088OooO0Oo;
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
        return this.f21088OooO0Oo == 9 ? (TimeZone) this.f21090OooO0o0 : TimeZone.f21225OooO0oO;
    }

    public final Duration OooO0Oo() {
        return this.f21088OooO0Oo == 8 ? (Duration) this.f21090OooO0o0 : Duration.getDefaultInstance();
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f21085OooOOO) {
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
        if (this.f21089OooO0o != dateTime.f21089OooO0o || this.f21091OooO0oO != dateTime.f21091OooO0oO || this.f21092OooO0oo != dateTime.f21092OooO0oo || this.f21087OooO != dateTime.f21087OooO || this.f21093OooOO0 != dateTime.f21093OooOO0 || this.f21094OooOO0O != dateTime.f21094OooOO0O || this.f21095OooOO0o != dateTime.f21095OooOO0o || !OooO0O0().equals(dateTime.OooO0O0())) {
            return false;
        }
        int i = this.f21088OooO0Oo;
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
        return f21085OooOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<DateTime> getParserForType() {
        return f21086OooOOOO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.f21089OooO0o;
        int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
        int i3 = this.f21091OooO0oO;
        if (i3 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.f21092OooO0oo;
        if (i4 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
        }
        int i5 = this.f21087OooO;
        if (i5 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i5);
        }
        int i6 = this.f21093OooOO0;
        if (i6 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i6);
        }
        int i7 = this.f21094OooOO0O;
        if (i7 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i7);
        }
        int i8 = this.f21095OooOO0o;
        if (i8 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(7, i8);
        }
        if (this.f21088OooO0Oo == 8) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(8, (Duration) this.f21090OooO0o0);
        }
        if (this.f21088OooO0Oo == 9) {
            iComputeInt32Size += CodedOutputStream.computeMessageSize(9, (TimeZone) this.f21090OooO0o0);
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
        int iOooO00o2 = o000000.OooO00o(o000000.OooO00o(o000000.OooO00o(o000000.OooO00o(o000000.OooO00o(o000000.OooO00o(o000Oo0.OooO00o(o00O00o0.f42927OooO00o, 779, 37, 1, 53), this.f21089OooO0o, 37, 2, 53), this.f21091OooO0oO, 37, 3, 53), this.f21092OooO0oo, 37, 4, 53), this.f21087OooO, 37, 5, 53), this.f21093OooOO0, 37, 6, 53), this.f21094OooOO0O, 37, 7, 53) + this.f21095OooOO0o;
        int i2 = this.f21088OooO0Oo;
        if (i2 != 8) {
            if (i2 == 9) {
                iOooO00o = o000000O.OooO00o(iOooO00o2, 37, 9, 53);
                iHashCode = OooO0OO().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iOooO00o2 * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }
        iOooO00o = o000000O.OooO00o(iOooO00o2, 37, 8, 53);
        iHashCode = OooO0Oo().hashCode();
        iOooO00o2 = iOooO00o + iHashCode;
        int iHashCode3 = this.unknownFields.hashCode() + (iOooO00o2 * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o00O00o0.f42928OooO0O0.ensureFieldAccessorsInitialized(DateTime.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f21096OooOOO0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f21096OooOOO0 = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f21085OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DateTime();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f21089OooO0o;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f21091OooO0oO;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        int i3 = this.f21092OooO0oo;
        if (i3 != 0) {
            codedOutputStream.writeInt32(3, i3);
        }
        int i4 = this.f21087OooO;
        if (i4 != 0) {
            codedOutputStream.writeInt32(4, i4);
        }
        int i5 = this.f21093OooOO0;
        if (i5 != 0) {
            codedOutputStream.writeInt32(5, i5);
        }
        int i6 = this.f21094OooOO0O;
        if (i6 != 0) {
            codedOutputStream.writeInt32(6, i6);
        }
        int i7 = this.f21095OooOO0o;
        if (i7 != 0) {
            codedOutputStream.writeInt32(7, i7);
        }
        if (this.f21088OooO0Oo == 8) {
            codedOutputStream.writeMessage(8, (Duration) this.f21090OooO0o0);
        }
        if (this.f21088OooO0Oo == 9) {
            codedOutputStream.writeMessage(9, (TimeZone) this.f21090OooO0o0);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f21085OooOOO;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f21085OooOOO.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private DateTime() {
        this.f21088OooO0Oo = 0;
        this.f21096OooOOO0 = (byte) -1;
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
                                this.f21089OooO0o = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f21091OooO0oO = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f21092OooO0oo = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.f21087OooO = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.f21093OooOO0 = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.f21094OooOO0O = codedInputStream.readInt32();
                            } else if (tag != 56) {
                                if (tag == 66) {
                                    Duration.Builder builder = this.f21088OooO0Oo == 8 ? ((Duration) this.f21090OooO0o0).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                    this.f21090OooO0o0 = message;
                                    if (builder != null) {
                                        builder.mergeFrom((Duration) message);
                                        this.f21090OooO0o0 = builder.buildPartial();
                                    }
                                    this.f21088OooO0Oo = 8;
                                } else if (tag != 74) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    TimeZone.OooO0O0 builder2 = this.f21088OooO0Oo == 9 ? ((TimeZone) this.f21090OooO0o0).toBuilder() : null;
                                    MessageLite message2 = codedInputStream.readMessage(TimeZone.f21226OooO0oo, extensionRegistryLite);
                                    this.f21090OooO0o0 = message2;
                                    if (builder2 != null) {
                                        builder2.OooO0o0((TimeZone) message2);
                                        this.f21090OooO0o0 = builder2.buildPartial();
                                    }
                                    this.f21088OooO0Oo = 9;
                                }
                            } else {
                                this.f21095OooOO0o = codedInputStream.readInt32();
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
