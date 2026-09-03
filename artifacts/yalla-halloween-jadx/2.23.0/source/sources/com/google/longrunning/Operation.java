package com.google.longrunning;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
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
import com.google.rpc.Status;
import java.io.IOException;
import o000O00.o000000O;
import p320o0O0oo0o.o000Oo0;
import p322o0O0ooO0.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class Operation extends GeneratedMessageV3 implements MessageOrBuilder {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Operation f20784OooOO0 = new Operation();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f20785OooOO0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte f20786OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f20787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile Object f20788OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f20789OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Any f20790OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f20791OooO0oo;

    public static class OooO00o extends AbstractParser<Operation> {
        @Override // com.google.protobuf.Parser
        public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Operation(codedInputStream, extensionRegistryLite);
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20792OooO00o;

        static {
            int[] iArr = new int[ResultCase.values().length];
            f20792OooO00o = iArr;
            try {
                iArr[ResultCase.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20792OooO00o[ResultCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20792OooO00o[ResultCase.RESULT_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class OooO0OO extends GeneratedMessageV3.Builder<OooO0OO> implements MessageOrBuilder {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f20793OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f20794OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public GeneratedMessageV3 f20795OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Any f20796OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f20797OooO0oo;

        public OooO0OO() {
            this.f20793OooO0Oo = 0;
            this.f20794OooO0o = "";
            Operation operation = Operation.f20784OooOO0;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final Operation buildPartial() {
            Operation operation = new Operation(this);
            operation.f20788OooO0o = this.f20794OooO0o;
            operation.f20790OooO0oO = this.f20796OooO0oO;
            operation.f20791OooO0oo = this.f20797OooO0oo;
            int i = this.f20793OooO0Oo;
            if (i == 4) {
                operation.f20789OooO0o0 = this.f20795OooO0o0;
            }
            if (i == 5) {
                operation.f20789OooO0o0 = this.f20795OooO0o0;
            }
            operation.f20787OooO0Oo = i;
            onBuilt();
            return operation;
        }

        public final void OooO0Oo() {
            super.clear();
            this.f20794OooO0o = "";
            this.f20796OooO0oO = null;
            this.f20797OooO0oo = false;
            this.f20793OooO0Oo = 0;
            this.f20795OooO0o0 = null;
        }

        public final void OooO0o(Operation operation) {
            GeneratedMessageV3 generatedMessageV3;
            Status status;
            if (operation == Operation.f20784OooOO0) {
                return;
            }
            if (!operation.getName().isEmpty()) {
                this.f20794OooO0o = operation.f20788OooO0o;
                onChanged();
            }
            if (operation.f20790OooO0oO != null) {
                Any anyOooO0OO = operation.OooO0OO();
                Any any = this.f20796OooO0oO;
                if (any != null) {
                    this.f20796OooO0oO = Any.newBuilder(any).mergeFrom(anyOooO0OO).buildPartial();
                } else {
                    this.f20796OooO0oO = anyOooO0OO;
                }
                onChanged();
            }
            boolean z = operation.f20791OooO0oo;
            if (z) {
                this.f20797OooO0oo = z;
                onChanged();
            }
            int i = OooO0O0.f20792OooO00o[operation.OooO0o0().ordinal()];
            if (i == 1) {
                Status statusOooO0O0 = operation.OooO0O0();
                if (this.f20793OooO0Oo != 4 || (generatedMessageV3 = this.f20795OooO0o0) == (status = Status.f20924OooO0oo)) {
                    this.f20795OooO0o0 = statusOooO0O0;
                } else {
                    Status.OooO0O0 builder = status.toBuilder();
                    builder.OooO0oO((Status) generatedMessageV3);
                    builder.OooO0oO(statusOooO0O0);
                    this.f20795OooO0o0 = builder.buildPartial();
                }
                onChanged();
                this.f20793OooO0Oo = 4;
            } else if (i == 2) {
                Any anyOooO0Oo = operation.OooO0Oo();
                if (this.f20793OooO0Oo != 5 || this.f20795OooO0o0 == Any.getDefaultInstance()) {
                    this.f20795OooO0o0 = anyOooO0Oo;
                } else {
                    this.f20795OooO0o0 = Any.newBuilder((Any) this.f20795OooO0o0).mergeFrom(anyOooO0Oo).buildPartial();
                }
                onChanged();
                this.f20793OooO0Oo = 5;
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
            Operation operation;
            try {
                try {
                    Operation.f20785OooOO0O.getClass();
                    OooO0o(new Operation(codedInputStream, extensionRegistryLite));
                } catch (InvalidProtocolBufferException e) {
                    operation = (Operation) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        if (operation != null) {
                            OooO0o(operation);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                operation = null;
                if (operation != null) {
                    OooO0o(operation);
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
            Operation operationBuildPartial = buildPartial();
            if (operationBuildPartial.isInitialized()) {
                return operationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) operationBuildPartial);
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
            return Operation.f20784OooOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public final Descriptors.Descriptor getDescriptorForType() {
            return o000O0O0.f42872OooO00o;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return o000O0O0.f42873OooO0O0.ensureFieldAccessorsInitialized(Operation.class, OooO0OO.class);
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
            return Operation.f20784OooOO0;
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
            Operation operationBuildPartial = buildPartial();
            if (operationBuildPartial.isInitialized()) {
                return operationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) operationBuildPartial);
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
            this.f20793OooO0Oo = 0;
            this.f20794OooO0o = "";
            Operation operation = Operation.f20784OooOO0;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final AbstractMessage.Builder mergeFrom(Message message) {
            if (message instanceof Operation) {
                OooO0o((Operation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Message.Builder mergeFrom(Message message) {
            if (message instanceof Operation) {
                OooO0o((Operation) message);
            } else {
                super.mergeFrom(message);
            }
            return this;
        }
    }

    public enum ResultCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);

        private final int value;

        ResultCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            return this.value;
        }
    }

    public Operation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.f20787OooO0Oo = 0;
        this.f20786OooO = (byte) -1;
    }

    public final Status OooO0O0() {
        return this.f20787OooO0Oo == 4 ? (Status) this.f20789OooO0o0 : Status.f20924OooO0oo;
    }

    public final Any OooO0OO() {
        Any any = this.f20790OooO0oO;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public final Any OooO0Oo() {
        return this.f20787OooO0Oo == 5 ? (Any) this.f20789OooO0o0 : Any.getDefaultInstance();
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final OooO0OO toBuilder() {
        if (this == f20784OooOO0) {
            return new OooO0OO();
        }
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.OooO0o(this);
        return oooO0OO;
    }

    public final ResultCase OooO0o0() {
        int i = this.f20787OooO0Oo;
        if (i == 0) {
            return ResultCase.RESULT_NOT_SET;
        }
        if (i == 4) {
            return ResultCase.ERROR;
        }
        if (i != 5) {
            return null;
        }
        return ResultCase.RESPONSE;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Operation)) {
            return super.equals(obj);
        }
        Operation operation = (Operation) obj;
        if (!getName().equals(operation.getName())) {
            return false;
        }
        Any any = this.f20790OooO0oO;
        if ((any != null) != (operation.f20790OooO0oO != null)) {
            return false;
        }
        if (((any != null) && !OooO0OO().equals(operation.OooO0OO())) || this.f20791OooO0oo != operation.f20791OooO0oo || !OooO0o0().equals(operation.OooO0o0())) {
            return false;
        }
        int i = this.f20787OooO0Oo;
        if (i != 4) {
            if (i == 5 && !OooO0Oo().equals(operation.OooO0Oo())) {
                return false;
            }
        } else if (!OooO0O0().equals(operation.OooO0O0())) {
            return false;
        }
        return this.unknownFields.equals(operation.unknownFields);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return f20784OooOO0;
    }

    public final String getName() {
        Object obj = this.f20788OooO0o;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.f20788OooO0o = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Parser<Operation> getParserForType() {
        return f20785OooOO0O;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.f20788OooO0o) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.f20788OooO0o);
        if (this.f20790OooO0oO != null) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, OooO0OO());
        }
        boolean z = this.f20791OooO0oo;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(3, z);
        }
        if (this.f20787OooO0Oo == 4) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, (Status) this.f20789OooO0o0);
        }
        if (this.f20787OooO0Oo == 5) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, (Any) this.f20789OooO0o0);
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
        int iHashCode2 = getName().hashCode() + o000Oo0.OooO00o(o000O0O0.f42872OooO00o, 779, 37, 1, 53);
        if (this.f20790OooO0oO != null) {
            iHashCode2 = OooO0OO().hashCode() + o000000O.OooO00o(iHashCode2, 37, 2, 53);
        }
        int iHashBoolean = Internal.hashBoolean(this.f20791OooO0oo) + o000000O.OooO00o(iHashCode2, 37, 3, 53);
        int i2 = this.f20787OooO0Oo;
        if (i2 != 4) {
            if (i2 == 5) {
                iOooO00o = o000000O.OooO00o(iHashBoolean, 37, 5, 53);
                iHashCode = OooO0Oo().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iOooO00o = o000000O.OooO00o(iHashBoolean, 37, 4, 53);
        iHashCode = OooO0O0().hashCode();
        iHashBoolean = iHashCode + iOooO00o;
        int iHashCode4 = this.unknownFields.hashCode() + (iHashBoolean * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return o000O0O0.f42873OooO0O0.ensureFieldAccessorsInitialized(Operation.class, OooO0OO.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.f20786OooO;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f20786OooO = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final Message.Builder newBuilderForType() {
        return f20784OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Operation();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.f20788OooO0o)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.f20788OooO0o);
        }
        if (this.f20790OooO0oO != null) {
            codedOutputStream.writeMessage(2, OooO0OO());
        }
        boolean z = this.f20791OooO0oo;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if (this.f20787OooO0Oo == 4) {
            codedOutputStream.writeMessage(4, (Status) this.f20789OooO0o0);
        }
        if (this.f20787OooO0Oo == 5) {
            codedOutputStream.writeMessage(5, (Any) this.f20789OooO0o0);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return f20784OooOO0;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public final MessageLite.Builder newBuilderForType() {
        return f20784OooOO0.toBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public final Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new OooO0OO(builderParent);
    }

    private Operation() {
        this.f20787OooO0Oo = 0;
        this.f20786OooO = (byte) -1;
        this.f20788OooO0o = "";
    }

    public Operation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag != 10) {
                            if (tag == 18) {
                                Any any = this.f20790OooO0oO;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.f20790OooO0oO = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.f20790OooO0oO = builder.buildPartial();
                                }
                            } else if (tag == 24) {
                                this.f20791OooO0oo = codedInputStream.readBool();
                            } else if (tag == 34) {
                                Status.OooO0O0 builder2 = this.f20787OooO0Oo == 4 ? ((Status) this.f20789OooO0o0).toBuilder() : null;
                                MessageLite message = codedInputStream.readMessage(Status.f20923OooO, extensionRegistryLite);
                                this.f20789OooO0o0 = message;
                                if (builder2 != null) {
                                    builder2.OooO0oO((Status) message);
                                    this.f20789OooO0o0 = builder2.buildPartial();
                                }
                                this.f20787OooO0Oo = 4;
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                Any.Builder builder3 = this.f20787OooO0Oo == 5 ? ((Any) this.f20789OooO0o0).toBuilder() : null;
                                MessageLite message2 = codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.f20789OooO0o0 = message2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((Any) message2);
                                    this.f20789OooO0o0 = builder3.buildPartial();
                                }
                                this.f20787OooO0Oo = 5;
                            }
                        } else {
                            this.f20788OooO0o = codedInputStream.readStringRequireUtf8();
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
