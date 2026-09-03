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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import o000O00.o000000O;
import p320o0O0oo0o.o000O00O;
import p320o0O0oo0o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class JwtLocation extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f18527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f18528OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f18529OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte f18530OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final JwtLocation f18526OooO0oo = new JwtLocation();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f18525OooO = new OooO00o();

    public enum InCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);

        private final int value;

        InCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public static class OooO00o extends AbstractParser<JwtLocation> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new JwtLocation(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18531OooO00o;

        static {
            int[] iArr = new int[InCase.values().length];
            f18531OooO00o = iArr;
            try {
                iArr[InCase.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18531OooO00o[InCase.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18531OooO00o[InCase.IN_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18532OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f18533OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f18534OooO0o0;

        public OooO0OO() {
            this.f18532OooO0Oo = 0;
            this.f18533OooO0o = "";
            JwtLocation jwtLocation = JwtLocation.f18526OooO0oo;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final JwtLocation buildPartial() {
            JwtLocation jwtLocation = new JwtLocation(this);
            int i = this.f18532OooO0Oo;
            if (i == 1) {
                jwtLocation.f18529OooO0o0 = this.f18534OooO0o0;
            }
            if (i == 2) {
                jwtLocation.f18529OooO0o0 = this.f18534OooO0o0;
            }
            jwtLocation.f18528OooO0o = this.f18533OooO0o;
            jwtLocation.f18527OooO0Oo = this.f18532OooO0Oo;
            onBuilt();
            return jwtLocation;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f18533OooO0o = "";
            this.f18532OooO0Oo = 0;
            this.f18534OooO0o0 = null;
        }

        public final void OooO0o(JwtLocation jwtLocation) {
            if (jwtLocation == JwtLocation.f18526OooO0oo) {
                return;
            }
            if (!jwtLocation.OooO0o0().isEmpty()) {
                this.f18533OooO0o = jwtLocation.f18528OooO0o;
                onChanged();
            }
            int i = OooO0O0.f18531OooO00o[jwtLocation.OooO0OO().ordinal()];
            if (i == 1) {
                this.f18532OooO0Oo = 1;
                this.f18534OooO0o0 = jwtLocation.f18529OooO0o0;
                onChanged();
            } else if (i == 2) {
                this.f18532OooO0Oo = 2;
                this.f18534OooO0o0 = jwtLocation.f18529OooO0o0;
                onChanged();
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
            JwtLocation jwtLocation;
            try {
                try {
                    JwtLocation.f18525OooO.getClass();
                    OooO0o(new JwtLocation(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    jwtLocation = (JwtLocation) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (jwtLocation != null) {
                            OooO0o(jwtLocation);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                jwtLocation = null;
                if (jwtLocation != null) {
                    OooO0o(jwtLocation);
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
            JwtLocation jwtLocationBuildPartial = buildPartial();
            if (jwtLocationBuildPartial.isInitialized()) {
                return jwtLocationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) jwtLocationBuildPartial);
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
            return JwtLocation.f18526OooO0oo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000O00O.f42716OooO0o0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O00O.f42715OooO0o.ensureFieldAccessorsInitialized(JwtLocation.class, OooO0OO.class);
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
            return JwtLocation.f18526OooO0oo;
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
            JwtLocation jwtLocationBuildPartial = buildPartial();
            if (jwtLocationBuildPartial.isInitialized()) {
                return jwtLocationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) jwtLocationBuildPartial);
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
            this.f18532OooO0Oo = 0;
            this.f18533OooO0o = "";
            JwtLocation jwtLocation = JwtLocation.f18526OooO0oo;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof JwtLocation) {
                OooO0o((JwtLocation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof JwtLocation) {
                OooO0o((JwtLocation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public JwtLocation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f18527OooO0Oo = 0;
        this.f18530OooO0oO = (byte) -1;
    }

    public final String OooO0O0() {
        Object obj = this.f18527OooO0Oo == 1 ? this.f18529OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18527OooO0Oo == 1) {
            this.f18529OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    public final InCase OooO0OO() {
        int i = this.f18527OooO0Oo;
        if (i == 0) {
            return InCase.IN_NOT_SET;
        }
        if (i == 1) {
            return InCase.HEADER;
        }
        if (i != 2) {
            return null;
        }
        return InCase.QUERY;
    }

    public final String OooO0Oo() {
        Object obj = this.f18527OooO0Oo == 2 ? this.f18529OooO0o0 : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.f18527OooO0Oo == 2) {
            this.f18529OooO0o0 = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f18526OooO0oo) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    public final String OooO0o0() {
        Object obj = this.f18528OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f18528OooO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JwtLocation)) {
            return super.equals(obj);
        }
        JwtLocation jwtLocation = (JwtLocation) obj;
        if (!OooO0o0().equals(jwtLocation.OooO0o0()) || !OooO0OO().equals(jwtLocation.OooO0OO())) {
            return false;
        }
        int i = this.f18527OooO0Oo;
        if (i != 1) {
            if (i == 2 && !OooO0Oo().equals(jwtLocation.OooO0Oo())) {
                return false;
            }
        } else if (!OooO0O0().equals(jwtLocation.OooO0O0())) {
            return false;
        }
        return this.unknownFields.equals(jwtLocation.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f18526OooO0oo;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<JwtLocation> getParserForType() {
        return f18525OooO;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = this.f18527OooO0Oo == 1 ? 0 + GeneratedMessageV3.computeStringSize(1, this.f18529OooO0o0) : 0;
        if (this.f18527OooO0Oo == 2) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.f18529OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18528OooO0o)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f18528OooO0o);
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
        int iHashCode2 = OooO0o0().hashCode() + o000Oo0.OooO00o(o000O00O.f42716OooO0o0, 779, 37, 3, 53);
        int i2 = this.f18527OooO0Oo;
        if (i2 != 1) {
            if (i2 == 2) {
                iOooO00o = o000000O.OooO00o(iHashCode2, 37, 2, 53);
                iHashCode = OooO0Oo().hashCode();
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
        return o000O00O.f42715OooO0o.ensureFieldAccessorsInitialized(JwtLocation.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f18530OooO0oO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f18530OooO0oO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f18526OooO0oo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new JwtLocation();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18527OooO0Oo == 1) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f18529OooO0o0);
        }
        if (this.f18527OooO0Oo == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.f18529OooO0o0);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.f18528OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.f18528OooO0o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f18526OooO0oo;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f18526OooO0oo.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private JwtLocation() {
        this.f18527OooO0Oo = 0;
        this.f18530OooO0oO = (byte) -1;
        this.f18528OooO0o = "";
    }

    public JwtLocation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                this.f18527OooO0Oo = 1;
                                this.f18529OooO0o0 = stringRequireUtf8;
                            } else if (tag == 18) {
                                String stringRequireUtf9 = codedInputStream.readStringRequireUtf8();
                                this.f18527OooO0Oo = 2;
                                this.f18529OooO0o0 = stringRequireUtf9;
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f18528OooO0o = codedInputStream.readStringRequireUtf8();
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
