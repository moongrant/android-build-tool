package com.google.type;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;
import p324o0O0ooo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneNumber extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f21162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f21163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f21164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte f21165OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final PhoneNumber f21161OooO0oo = new PhoneNumber();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f21160OooO = new OooO00o();

    public enum KindCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        E164_NUMBER(1),
        SHORT_CODE(2),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public static class OooO00o extends AbstractParser<PhoneNumber> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new PhoneNumber(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21166OooO00o;

        static {
            int[] iArr = new int[KindCase.values().length];
            f21166OooO00o = iArr;
            try {
                iArr[KindCase.E164_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21166OooO00o[KindCase.SHORT_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21166OooO00o[KindCase.KIND_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f21167OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f21168OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f21169OooO0o0;

        public OooO0OO() {
            this.f21167OooO0Oo = 0;
            this.f21168OooO0o = "";
            PhoneNumber phoneNumber = PhoneNumber.f21161OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final PhoneNumber buildPartial() {
            PhoneNumber phoneNumber = new PhoneNumber(this);
            int i = this.f21167OooO0Oo;
            if (i == 1) {
                phoneNumber.f21164OooO0o0 = this.f21169OooO0o0;
            }
            if (i == 2) {
                phoneNumber.f21164OooO0o0 = this.f21169OooO0o0;
            }
            phoneNumber.f21163OooO0o = this.f21168OooO0o;
            phoneNumber.f21162OooO0Oo = this.f21167OooO0Oo;
            onBuilt();
            return phoneNumber;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f21168OooO0o = "";
            this.f21167OooO0Oo = 0;
            this.f21169OooO0o0 = null;
        }

        public final void OooO0o(PhoneNumber phoneNumber) {
            Object obj;
            ShortCode shortCode;
            if (phoneNumber == PhoneNumber.f21161OooO0oo) {
                return;
            }
            if (!phoneNumber.OooO0OO().isEmpty()) {
                this.f21168OooO0o = phoneNumber.f21163OooO0o;
                onChanged();
            }
            int i = OooO0O0.f21166OooO00o[phoneNumber.OooO0Oo().ordinal()];
            if (i == 1) {
                this.f21167OooO0Oo = 1;
                this.f21169OooO0o0 = phoneNumber.f21164OooO0o0;
                onChanged();
            } else if (i == 2) {
                ShortCode shortCodeOooO0o0 = phoneNumber.OooO0o0();
                if (this.f21167OooO0Oo != 2 || (obj = this.f21169OooO0o0) == (shortCode = ShortCode.f21170OooO0oO)) {
                    this.f21169OooO0o0 = shortCodeOooO0o0;
                } else {
                    ShortCode.OooO0O0 builder = shortCode.toBuilder();
                    builder.OooO0o0((ShortCode) obj);
                    builder.OooO0o0(shortCodeOooO0o0);
                    this.f21169OooO0o0 = builder.buildPartial();
                }
                onChanged();
                this.f21167OooO0Oo = 2;
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
            PhoneNumber phoneNumber;
            try {
                try {
                    PhoneNumber.f21160OooO.getClass();
                    OooO0o(new PhoneNumber(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    phoneNumber = (PhoneNumber) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (phoneNumber != null) {
                            OooO0o(phoneNumber);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                phoneNumber = null;
                if (phoneNumber != null) {
                    OooO0o(phoneNumber);
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
            PhoneNumber phoneNumberBuildPartial = buildPartial();
            if (phoneNumberBuildPartial.isInitialized()) {
                return phoneNumberBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) phoneNumberBuildPartial);
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
            return PhoneNumber.f21161OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return oo0oOO0.f42952OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0oOO0.f42953OooO0O0.ensureFieldAccessorsInitialized(PhoneNumber.class, OooO0OO.class);
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
            return PhoneNumber.f21161OooO0oo;
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

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public final MessageLite build() {
            PhoneNumber phoneNumberBuildPartial = buildPartial();
            if (phoneNumberBuildPartial.isInitialized()) {
                return phoneNumberBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) phoneNumberBuildPartial);
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

        public OooO0OO(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.f21167OooO0Oo = 0;
            this.f21168OooO0o = "";
            PhoneNumber phoneNumber = PhoneNumber.f21161OooO0oo;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof PhoneNumber) {
                OooO0o((PhoneNumber) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof PhoneNumber) {
                OooO0o((PhoneNumber) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public static final class ShortCode extends GeneratedMessageV3 implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final ShortCode f21170OooO0oO = new ShortCode();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final OooO00o f21171OooO0oo = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile Object f21172OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f21173OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile Object f21174OooO0o0;

        public static class OooO00o extends AbstractParser<ShortCode> {
            @Override // com.google.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ShortCode(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class OooO0O0 extends GeneratedMessageV3.Builder<OooO0O0> implements MessageOrBuilder {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Object f21175OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Object f21176OooO0o0;

            public OooO0O0() {
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
                ShortCode shortCode = ShortCode.f21170OooO0oO;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
            public final ShortCode buildPartial() {
                ShortCode shortCode = new ShortCode(this);
                shortCode.f21172OooO0Oo = this.f21175OooO0Oo;
                shortCode.f21174OooO0o0 = this.f21176OooO0o0;
                onBuilt();
                return shortCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
            public final OooO0O0 mo4013clone() {
                return (OooO0O0) super.mo4013clone();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            public final void OooO0o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ShortCode shortCode;
                try {
                    try {
                        ShortCode.f21171OooO0oo.getClass();
                        OooO0o0(new ShortCode(codedInputStream, extensionRegistryLite));
                    } catch (InvalidProtocolBufferException e) {
                        shortCode = (ShortCode) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            if (shortCode != null) {
                                OooO0o0(shortCode);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    shortCode = null;
                    if (shortCode != null) {
                        OooO0o0(shortCode);
                    }
                    throw th;
                }
            }

            public final void OooO0o0(ShortCode shortCode) {
                if (shortCode == ShortCode.f21170OooO0oO) {
                    return;
                }
                if (!shortCode.OooO0OO().isEmpty()) {
                    this.f21175OooO0Oo = shortCode.f21172OooO0Oo;
                    onChanged();
                }
                if (!shortCode.OooO0O0().isEmpty()) {
                    this.f21176OooO0o0 = shortCode.f21174OooO0o0;
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
                ShortCode shortCodeBuildPartial = buildPartial();
                if (shortCodeBuildPartial.isInitialized()) {
                    return shortCodeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shortCodeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder clear() {
                super.clear();
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
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
                return ShortCode.f21170OooO0oO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public final Descriptors.Descriptor getDescriptorForType() {
                return oo0oOO0.f42954OooO0OO;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return oo0oOO0.f42955OooO0Oo.ensureFieldAccessorsInitialized(ShortCode.class, OooO0O0.class);
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
                return ShortCode.f21170OooO0oO;
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

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite build() {
                ShortCode shortCodeBuildPartial = buildPartial();
                if (shortCodeBuildPartial.isInitialized()) {
                    return shortCodeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shortCodeBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final GeneratedMessageV3.Builder clear() {
                super.clear();
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                OooO0o(codedInputStream, extensionRegistryLite);
                return this;
            }

            public OooO0O0(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
                ShortCode shortCode = ShortCode.f21170OooO0oO;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final AbstractMessage.Builder mergeFrom(Message message) {
                if (message instanceof ShortCode) {
                    OooO0o0((ShortCode) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder clear() {
                super.clear();
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Message.Builder mergeFrom(Message message) {
                if (message instanceof ShortCode) {
                    OooO0o0((ShortCode) message);
                } else {
                    super.mergeFrom(message);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public final MessageLite.Builder clear() {
                super.clear();
                this.f21175OooO0Oo = "";
                this.f21176OooO0o0 = "";
                return this;
            }
        }

        public ShortCode(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.f21173OooO0o = (byte) -1;
        }

        public final String OooO0O0() {
            Object obj = this.f21174OooO0o0;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21174OooO0o0 = stringUtf8;
            return stringUtf8;
        }

        public final String OooO0OO() {
            Object obj = this.f21172OooO0Oo;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.f21172OooO0Oo = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
        public final OooO0O0 toBuilder() {
            if (this == f21170OooO0oO) {
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
            if (!(obj instanceof ShortCode)) {
                return super.equals(obj);
            }
            ShortCode shortCode = (ShortCode) obj;
            return OooO0OO().equals(shortCode.OooO0OO()) && OooO0O0().equals(shortCode.OooO0O0()) && this.unknownFields.equals(shortCode.unknownFields);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final Message getDefaultInstanceForType() {
            return f21170OooO0oO;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Parser<ShortCode> getParserForType() {
            return f21171OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f21172OooO0Oo) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f21172OooO0Oo);
            if (!GeneratedMessageV3.isStringEmpty(this.f21174OooO0o0)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f21174OooO0o0);
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
            int iHashCode = this.unknownFields.hashCode() + ((OooO0O0().hashCode() + ((((OooO0OO().hashCode() + o000Oo0.OooO00o(oo0oOO0.f42954OooO0OO, 779, 37, 1, 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return oo0oOO0.f42955OooO0Oo.ensureFieldAccessorsInitialized(ShortCode.class, OooO0O0.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f21173OooO0o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f21173OooO0o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final Message.Builder newBuilderForType() {
            return f21170OooO0oO.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ShortCode();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.f21172OooO0Oo)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.f21172OooO0Oo);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.f21174OooO0o0)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.f21174OooO0o0);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return f21170OooO0oO;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public final MessageLite.Builder newBuilderForType() {
            return f21170OooO0oO.toBuilder();
        }

        private ShortCode() {
            this.f21173OooO0o = (byte) -1;
            this.f21172OooO0Oo = "";
            this.f21174OooO0o0 = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new OooO0O0(builderParent);
        }

        public ShortCode(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.f21172OooO0Oo = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f21174OooO0o0 = codedInputStream.readStringRequireUtf8();
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

    public PhoneNumber(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f21162OooO0Oo = 0;
        this.f21165OooO0oO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f21162OooO0Oo == 1 ? this.f21164OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f21162OooO0Oo == 1) {
            this.f21164OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final String OooO0OO() {
        Object obj = this.f21163OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f21163OooO0o = stringUtf8;
        return stringUtf8;
    }

    public final KindCase OooO0Oo() {
        int i = this.f21162OooO0Oo;
        if (i == 0) {
            return KindCase.KIND_NOT_SET;
        }
        if (i == 1) {
            return KindCase.E164_NUMBER;
        }
        if (i != 2) {
            return null;
        }
        return KindCase.SHORT_CODE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f21161OooO0oo) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    public final ShortCode OooO0o0() {
        return this.f21162OooO0Oo == 2 ? (ShortCode) this.f21164OooO0o0 : ShortCode.f21170OooO0oO;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneNumber)) {
            return super.equals(obj);
        }
        PhoneNumber phoneNumber = (PhoneNumber) obj;
        if (!OooO0OO().equals(phoneNumber.OooO0OO()) || !OooO0Oo().equals(phoneNumber.OooO0Oo())) {
            return false;
        }
        int i = this.f21162OooO0Oo;
        if (i != 1) {
            if (i == 2 && !OooO0o0().equals(phoneNumber.OooO0o0())) {
                return false;
            }
        } else if (!OooO0O0().equals(phoneNumber.OooO0O0())) {
            return false;
        }
        return this.unknownFields.equals(phoneNumber.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f21161OooO0oo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<PhoneNumber> getParserForType() {
        return f21160OooO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = this.f21162OooO0Oo == 1 ? 0 + GeneratedMessageV3.computeStringSize(1, this.f21164OooO0o0) : 0;
        if (this.f21162OooO0Oo == 2) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, (ShortCode) this.f21164OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f21163OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f21163OooO0o);
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
        int iOooO00o;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode2 = OooO0OO().hashCode() + o000Oo0.OooO00o(oo0oOO0.f42952OooO00o, 779, 37, 3, 53);
        int i2 = this.f21162OooO0Oo;
        if (i2 != 1) {
            if (i2 == 2) {
                iOooO00o = o000000O.OooO00o(iHashCode2, 37, 2, 53);
                iHashCode = OooO0o0().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iOooO00o = o000000O.OooO00o(iHashCode2, 37, 1, 53);
        iHashCode = OooO0O0().hashCode();
        iHashCode2 = iHashCode + iOooO00o;
        int iHashCode4 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oo0oOO0.f42953OooO0O0.ensureFieldAccessorsInitialized(PhoneNumber.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f21165OooO0oO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f21165OooO0oO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f21161OooO0oo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PhoneNumber();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21162OooO0Oo == 1) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f21164OooO0o0);
        }
        if (this.f21162OooO0Oo == 2) {
            codedOutputStream.writeMessage(2, (ShortCode) this.f21164OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f21163OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f21163OooO0o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f21161OooO0oo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f21161OooO0oo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private PhoneNumber() {
        this.f21162OooO0Oo = 0;
        this.f21165OooO0oO = (byte) -1;
        this.f21163OooO0o = "";
    }

    public PhoneNumber(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                if (tag == 10) {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    this.f21162OooO0Oo = 1;
                                    this.f21164OooO0o0 = stringRequireUtf8;
                                } else if (tag == 18) {
                                    ShortCode.OooO0O0 builder = this.f21162OooO0Oo == 2 ? ((ShortCode) this.f21164OooO0o0).toBuilder() : null;
                                    MessageLite message = codedInputStream.readMessage(ShortCode.f21171OooO0oo, extensionRegistryLite);
                                    this.f21164OooO0o0 = message;
                                    if (builder != null) {
                                        builder.OooO0o0((ShortCode) message);
                                        this.f21164OooO0o0 = builder.buildPartial();
                                    }
                                    this.f21162OooO0Oo = 2;
                                } else if (tag != 26) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f21163OooO0o = codedInputStream.readStringRequireUtf8();
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
