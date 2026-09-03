package com.app.base.protobuf.room;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O00.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public final class RoomMike {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014room/room_mike.proto\u0012\broomuser\u001a\u000froom/room.proto\"=\n\u000fMicApplyRequest\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0002 \u0001(\u0003\u0012\n\n\u0002op\u0018\u0003 \u0001(\u0005\"\u0085\u0001\n\rMicApplyReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\"\n\u0005users\u0018\u0002 \u0003(\u000b2\u0013.roomuser.UserModel\u0012\u0016\n\u000eapplyListEmpty\u0018\u0003 \u0001(\b\u0012\n\n\u0002op\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006roomId\u0018\u0005 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0006 \u0001(\u0003\"5\n\u0013MicApplyListRequest\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0002 \u0001(\u0003\"X\n\u0011MicApplyListReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\"\n\u0005users\u0018\u0002 \u0003(\u000b2\u0013.roomuser.UserModel\u0012\u0011\n\tlistEmpty\u0018\u0003 \u0001(\b\"]\n\u0017MicApplyListInOutNotify\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012!\n\u0004user\u0018\u0002 \u0001(\u000b2\u0013.roomuser.UserModel\u0012\u000f\n\u0007inOrOut\u0018\u0003 \u0001(\u0005\"e\n\u0019MicInviteFromApplyRequest\u0012\u000e\n\u0006target\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006roomId\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0003 \u0001(\u0003\u0012\u0018\n\u0010fromApplyMicList\u0018\u0004 \u0001(\b\"\u008b\u0001\n\u0017MicInviteFromApplyReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006roomId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\ntargetRole\u0018\u0003 \u0001(\u0005\u0012$\n\u0007inviter\u0018\u0004 \u0001(\u000b2\u0013.roomuser.UserModel\u0012\u0018\n\u0010fromApplyMicList\u0018\u0005 \u0001(\b\"|\n\u001eMicUpFromMicApplyInviteRequest\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007inviter\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007yesOrNo\u0018\u0004 \u0001(\u0005\u0012\u0018\n\u0010fromApplyMicList\u0018\u0005 \u0001(\b\"[\n\u001cMicUpFromMicApplyInviteReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bmicOrder\u0018\u0002 \u0001(\u0005\u0012\u000b\n\u0003url\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006userId\u0018\u0004 \u0001(\u0003\"G\n\u0019MicApplySwitchOpenRequest\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0002 \u0001(\u0003\u0012\n\n\u0002op\u0018\u0003 \u0001(\u0003\"i\n\u0017MicApplySwitchOpenReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006roomId\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006status\u0018\u0003 \u0001(\u0005\u0012 \n\u0003who\u0018\u0004 \u0001(\u000b2\u0013.roomuser.UserModel\"K\n\u001dAllowAdminOpenMicApplyRequest\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006userId\u0018\u0002 \u0001(\u0003\u0012\n\n\u0002op\u0018\u0003 \u0001(\u0003\"K\n\u001bAllowAdminOpenMicApplyReply\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006roomId\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006status\u0018\u0003 \u0001(\u0005B&\n\u001acom.app.base.protobuf.roomB\bRoomMikeb\u0006proto3"}, new Descriptors.FileDescriptor[]{Room.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_roomuser_AllowAdminOpenMicApplyReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_AllowAdminOpenMicApplyReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_AllowAdminOpenMicApplyRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_AllowAdminOpenMicApplyRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplyListInOutNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplyListInOutNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplyListReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplyListReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplyListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplyListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplyReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplyReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplyRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplyRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplySwitchOpenReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplySwitchOpenReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicApplySwitchOpenRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicApplySwitchOpenRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicInviteFromApplyReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicInviteFromApplyReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicInviteFromApplyRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicInviteFromApplyRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicUpFromMicApplyInviteReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicUpFromMicApplyInviteReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_MicUpFromMicApplyInviteRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_MicUpFromMicApplyInviteRequest_fieldAccessorTable;

    public static final class AllowAdminOpenMicApplyReply extends GeneratedMessageV3 implements AllowAdminOpenMicApplyReplyOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final AllowAdminOpenMicApplyReply DEFAULT_INSTANCE = new AllowAdminOpenMicApplyReply();
        private static final Parser<AllowAdminOpenMicApplyReply> PARSER = new AbstractParser<AllowAdminOpenMicApplyReply>() { // from class: com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReply.1
            @Override // com.google.protobuf.Parser
            public AllowAdminOpenMicApplyReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AllowAdminOpenMicApplyReply(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;
        private long roomId_;
        private int status_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AllowAdminOpenMicApplyReplyOrBuilder {
            private int code_;
            private long roomId_;
            private int status_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyReply_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
            public int getStatus() {
                return this.status_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowAdminOpenMicApplyReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setStatus(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AllowAdminOpenMicApplyReply build() {
                AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReplyBuildPartial = buildPartial();
                if (allowAdminOpenMicApplyReplyBuildPartial.isInitialized()) {
                    return allowAdminOpenMicApplyReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) allowAdminOpenMicApplyReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AllowAdminOpenMicApplyReply buildPartial() {
                AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply = new AllowAdminOpenMicApplyReply(this, 0);
                allowAdminOpenMicApplyReply.code_ = this.code_;
                allowAdminOpenMicApplyReply.roomId_ = this.roomId_;
                allowAdminOpenMicApplyReply.status_ = this.status_;
                onBuilt();
                return allowAdminOpenMicApplyReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AllowAdminOpenMicApplyReply getDefaultInstanceForType() {
                return AllowAdminOpenMicApplyReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.roomId_ = 0L;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AllowAdminOpenMicApplyReply) {
                    return mergeFrom((AllowAdminOpenMicApplyReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply) {
                if (allowAdminOpenMicApplyReply == AllowAdminOpenMicApplyReply.getDefaultInstance()) {
                    return this;
                }
                if (allowAdminOpenMicApplyReply.getCode() != 0) {
                    setCode(allowAdminOpenMicApplyReply.getCode());
                }
                if (allowAdminOpenMicApplyReply.getRoomId() != 0) {
                    setRoomId(allowAdminOpenMicApplyReply.getRoomId());
                }
                if (allowAdminOpenMicApplyReply.getStatus() != 0) {
                    setStatus(allowAdminOpenMicApplyReply.getStatus());
                }
                mergeUnknownFields(((GeneratedMessageV3) allowAdminOpenMicApplyReply).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply = null;
                try {
                    try {
                        AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply2 = (AllowAdminOpenMicApplyReply) AllowAdminOpenMicApplyReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (allowAdminOpenMicApplyReply2 != null) {
                            mergeFrom(allowAdminOpenMicApplyReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply3 = (AllowAdminOpenMicApplyReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            allowAdminOpenMicApplyReply = allowAdminOpenMicApplyReply3;
                            if (allowAdminOpenMicApplyReply != null) {
                                mergeFrom(allowAdminOpenMicApplyReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (allowAdminOpenMicApplyReply != null) {
                        mergeFrom(allowAdminOpenMicApplyReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ AllowAdminOpenMicApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AllowAdminOpenMicApplyReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AllowAdminOpenMicApplyReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllowAdminOpenMicApplyReply)) {
                return super.equals(obj);
            }
            AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply = (AllowAdminOpenMicApplyReply) obj;
            return getCode() == allowAdminOpenMicApplyReply.getCode() && getRoomId() == allowAdminOpenMicApplyReply.getRoomId() && getStatus() == allowAdminOpenMicApplyReply.getStatus() && this.unknownFields.equals(allowAdminOpenMicApplyReply.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AllowAdminOpenMicApplyReply> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
            long j = this.roomId_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j);
            }
            int i3 = this.status_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyReplyOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getStatus() + ((((Internal.hashLong(getRoomId()) + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowAdminOpenMicApplyReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AllowAdminOpenMicApplyReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            int i2 = this.status_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ AllowAdminOpenMicApplyReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(allowAdminOpenMicApplyReply);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private AllowAdminOpenMicApplyReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AllowAdminOpenMicApplyReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AllowAdminOpenMicApplyReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AllowAdminOpenMicApplyReply() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AllowAdminOpenMicApplyReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private AllowAdminOpenMicApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.code_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.status_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static AllowAdminOpenMicApplyReply parseFrom(InputStream inputStream) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AllowAdminOpenMicApplyReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AllowAdminOpenMicApplyReplyOrBuilder extends MessageOrBuilder {
        int getCode();

        long getRoomId();

        int getStatus();
    }

    public static final class AllowAdminOpenMicApplyRequest extends GeneratedMessageV3 implements AllowAdminOpenMicApplyRequestOrBuilder {
        public static final int OP_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long op_;
        private long roomId_;
        private long userId_;
        private static final AllowAdminOpenMicApplyRequest DEFAULT_INSTANCE = new AllowAdminOpenMicApplyRequest();
        private static final Parser<AllowAdminOpenMicApplyRequest> PARSER = new AbstractParser<AllowAdminOpenMicApplyRequest>() { // from class: com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequest.1
            @Override // com.google.protobuf.Parser
            public AllowAdminOpenMicApplyRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AllowAdminOpenMicApplyRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AllowAdminOpenMicApplyRequestOrBuilder {
            private long op_;
            private long roomId_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearOp() {
                this.op_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
            public long getOp() {
                return this.op_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowAdminOpenMicApplyRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setOp(long j) {
                this.op_ = j;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AllowAdminOpenMicApplyRequest build() {
                AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequestBuildPartial = buildPartial();
                if (allowAdminOpenMicApplyRequestBuildPartial.isInitialized()) {
                    return allowAdminOpenMicApplyRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) allowAdminOpenMicApplyRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AllowAdminOpenMicApplyRequest buildPartial() {
                AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest = new AllowAdminOpenMicApplyRequest(this, 0);
                allowAdminOpenMicApplyRequest.roomId_ = this.roomId_;
                allowAdminOpenMicApplyRequest.userId_ = this.userId_;
                allowAdminOpenMicApplyRequest.op_ = this.op_;
                onBuilt();
                return allowAdminOpenMicApplyRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AllowAdminOpenMicApplyRequest getDefaultInstanceForType() {
                return AllowAdminOpenMicApplyRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                this.userId_ = 0L;
                this.op_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AllowAdminOpenMicApplyRequest) {
                    return mergeFrom((AllowAdminOpenMicApplyRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest) {
                if (allowAdminOpenMicApplyRequest == AllowAdminOpenMicApplyRequest.getDefaultInstance()) {
                    return this;
                }
                if (allowAdminOpenMicApplyRequest.getRoomId() != 0) {
                    setRoomId(allowAdminOpenMicApplyRequest.getRoomId());
                }
                if (allowAdminOpenMicApplyRequest.getUserId() != 0) {
                    setUserId(allowAdminOpenMicApplyRequest.getUserId());
                }
                if (allowAdminOpenMicApplyRequest.getOp() != 0) {
                    setOp(allowAdminOpenMicApplyRequest.getOp());
                }
                mergeUnknownFields(((GeneratedMessageV3) allowAdminOpenMicApplyRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest = null;
                try {
                    try {
                        AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest2 = (AllowAdminOpenMicApplyRequest) AllowAdminOpenMicApplyRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (allowAdminOpenMicApplyRequest2 != null) {
                            mergeFrom(allowAdminOpenMicApplyRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest3 = (AllowAdminOpenMicApplyRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            allowAdminOpenMicApplyRequest = allowAdminOpenMicApplyRequest3;
                            if (allowAdminOpenMicApplyRequest != null) {
                                mergeFrom(allowAdminOpenMicApplyRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (allowAdminOpenMicApplyRequest != null) {
                        mergeFrom(allowAdminOpenMicApplyRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ AllowAdminOpenMicApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AllowAdminOpenMicApplyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AllowAdminOpenMicApplyRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AllowAdminOpenMicApplyRequest)) {
                return super.equals(obj);
            }
            AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest = (AllowAdminOpenMicApplyRequest) obj;
            return getRoomId() == allowAdminOpenMicApplyRequest.getRoomId() && getUserId() == allowAdminOpenMicApplyRequest.getUserId() && getOp() == allowAdminOpenMicApplyRequest.getOp() && this.unknownFields.equals(allowAdminOpenMicApplyRequest.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
        public long getOp() {
            return this.op_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AllowAdminOpenMicApplyRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            long j3 = this.op_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(3, j3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.AllowAdminOpenMicApplyRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(getOp()) + ((((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_AllowAdminOpenMicApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AllowAdminOpenMicApplyRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AllowAdminOpenMicApplyRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            long j3 = this.op_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(3, j3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ AllowAdminOpenMicApplyRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(AllowAdminOpenMicApplyRequest allowAdminOpenMicApplyRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(allowAdminOpenMicApplyRequest);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private AllowAdminOpenMicApplyRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AllowAdminOpenMicApplyRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AllowAdminOpenMicApplyRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AllowAdminOpenMicApplyRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private AllowAdminOpenMicApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag == 16) {
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.op_ = codedInputStream.readInt64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static AllowAdminOpenMicApplyRequest parseFrom(InputStream inputStream) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AllowAdminOpenMicApplyRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowAdminOpenMicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AllowAdminOpenMicApplyRequestOrBuilder extends MessageOrBuilder {
        long getOp();

        long getRoomId();

        long getUserId();
    }

    public static final class MicApplyListInOutNotify extends GeneratedMessageV3 implements MicApplyListInOutNotifyOrBuilder {
        public static final int INOROUT_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int inOrOut_;
        private byte memoizedIsInitialized;
        private long roomId_;
        private Room.UserModel user_;
        private static final MicApplyListInOutNotify DEFAULT_INSTANCE = new MicApplyListInOutNotify();
        private static final Parser<MicApplyListInOutNotify> PARSER = new AbstractParser<MicApplyListInOutNotify>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotify.1
            @Override // com.google.protobuf.Parser
            public MicApplyListInOutNotify parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplyListInOutNotify(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplyListInOutNotifyOrBuilder {
            private int inOrOut_;
            private long roomId_;
            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> userBuilder_;
            private Room.UserModel user_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplyListInOutNotify_descriptor;
            }

            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> getUserFieldBuilder() {
                if (this.userBuilder_ == null) {
                    this.userBuilder_ = new SingleFieldBuilderV3<>(getUser(), getParentForChildren(), isClean());
                    this.user_ = null;
                }
                return this.userBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearInOrOut() {
                this.inOrOut_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUser() {
                if (this.userBuilder_ == null) {
                    this.user_ = null;
                    onChanged();
                } else {
                    this.user_ = null;
                    this.userBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplyListInOutNotify_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
            public int getInOrOut() {
                return this.inOrOut_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
            public Room.UserModel getUser() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModel) singleFieldBuilderV3.getMessage();
                }
                Room.UserModel userModel = this.user_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            public Room.UserModel.Builder getUserBuilder() {
                onChanged();
                return (Room.UserModel.Builder) getUserFieldBuilder().getBuilder();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
            public Room.UserModelOrBuilder getUserOrBuilder() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Room.UserModel userModel = this.user_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
            public boolean hasUser() {
                return (this.userBuilder_ == null && this.user_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplyListInOutNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListInOutNotify.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeUser(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Room.UserModel userModel2 = this.user_;
                    if (userModel2 != null) {
                        this.user_ = Room.UserModel.newBuilder(userModel2).mergeFrom(userModel).buildPartial();
                    } else {
                        this.user_ = userModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(userModel);
                }
                return this;
            }

            public Builder setInOrOut(int i) {
                this.inOrOut_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUser(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userModel.getClass();
                    this.user_ = userModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(userModel);
                }
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListInOutNotify build() {
                MicApplyListInOutNotify micApplyListInOutNotifyBuildPartial = buildPartial();
                if (micApplyListInOutNotifyBuildPartial.isInitialized()) {
                    return micApplyListInOutNotifyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplyListInOutNotifyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListInOutNotify buildPartial() {
                MicApplyListInOutNotify micApplyListInOutNotify = new MicApplyListInOutNotify(this, 0);
                micApplyListInOutNotify.roomId_ = this.roomId_;
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    micApplyListInOutNotify.user_ = this.user_;
                } else {
                    micApplyListInOutNotify.user_ = (Room.UserModel) singleFieldBuilderV3.build();
                }
                micApplyListInOutNotify.inOrOut_ = this.inOrOut_;
                onBuilt();
                return micApplyListInOutNotify;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplyListInOutNotify getDefaultInstanceForType() {
                return MicApplyListInOutNotify.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                if (this.userBuilder_ == null) {
                    this.user_ = null;
                } else {
                    this.user_ = null;
                    this.userBuilder_ = null;
                }
                this.inOrOut_ = 0;
                return this;
            }

            public Builder setUser(Room.UserModel.Builder builder) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.user_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplyListInOutNotify) {
                    return mergeFrom((MicApplyListInOutNotify) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicApplyListInOutNotify micApplyListInOutNotify) {
                if (micApplyListInOutNotify == MicApplyListInOutNotify.getDefaultInstance()) {
                    return this;
                }
                if (micApplyListInOutNotify.getRoomId() != 0) {
                    setRoomId(micApplyListInOutNotify.getRoomId());
                }
                if (micApplyListInOutNotify.hasUser()) {
                    mergeUser(micApplyListInOutNotify.getUser());
                }
                if (micApplyListInOutNotify.getInOrOut() != 0) {
                    setInOrOut(micApplyListInOutNotify.getInOrOut());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplyListInOutNotify).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplyListInOutNotify micApplyListInOutNotify = null;
                try {
                    try {
                        MicApplyListInOutNotify micApplyListInOutNotify2 = (MicApplyListInOutNotify) MicApplyListInOutNotify.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplyListInOutNotify2 != null) {
                            mergeFrom(micApplyListInOutNotify2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplyListInOutNotify micApplyListInOutNotify3 = (MicApplyListInOutNotify) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplyListInOutNotify = micApplyListInOutNotify3;
                            if (micApplyListInOutNotify != null) {
                                mergeFrom(micApplyListInOutNotify);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplyListInOutNotify != null) {
                        mergeFrom(micApplyListInOutNotify);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplyListInOutNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplyListInOutNotify getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplyListInOutNotify_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplyListInOutNotify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplyListInOutNotify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplyListInOutNotify> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplyListInOutNotify)) {
                return super.equals(obj);
            }
            MicApplyListInOutNotify micApplyListInOutNotify = (MicApplyListInOutNotify) obj;
            if (getRoomId() == micApplyListInOutNotify.getRoomId() && hasUser() == micApplyListInOutNotify.hasUser()) {
                return (!hasUser() || getUser().equals(micApplyListInOutNotify.getUser())) && getInOrOut() == micApplyListInOutNotify.getInOrOut() && this.unknownFields.equals(micApplyListInOutNotify.unknownFields);
            }
            return false;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
        public int getInOrOut() {
            return this.inOrOut_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplyListInOutNotify> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            if (this.user_ != null) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(2, getUser());
            }
            int i2 = this.inOrOut_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(3, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
        public Room.UserModel getUser() {
            Room.UserModel userModel = this.user_;
            return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
        public Room.UserModelOrBuilder getUserOrBuilder() {
            return getUser();
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListInOutNotifyOrBuilder
        public boolean hasUser() {
            return this.user_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashLong = Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (hasUser()) {
                iHashLong = getUser().hashCode() + o000000O.OooO00o(iHashLong, 37, 2, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + ((getInOrOut() + o000000O.OooO00o(iHashLong, 37, 3, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplyListInOutNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListInOutNotify.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplyListInOutNotify();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (this.user_ != null) {
                codedOutputStream.writeMessage(2, getUser());
            }
            int i = this.inOrOut_;
            if (i != 0) {
                codedOutputStream.writeInt32(3, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplyListInOutNotify(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplyListInOutNotify micApplyListInOutNotify) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplyListInOutNotify);
        }

        public static MicApplyListInOutNotify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplyListInOutNotify(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyListInOutNotify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListInOutNotify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplyListInOutNotify getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplyListInOutNotify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplyListInOutNotify() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyListInOutNotify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplyListInOutNotify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicApplyListInOutNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag == 18) {
                                Room.UserModel userModel = this.user_;
                                Room.UserModel.Builder builder = userModel != null ? userModel.toBuilder() : null;
                                Room.UserModel userModel2 = (Room.UserModel) codedInputStream.readMessage(Room.UserModel.parser(), extensionRegistryLite);
                                this.user_ = userModel2;
                                if (builder != null) {
                                    builder.mergeFrom(userModel2);
                                    this.user_ = builder.buildPartial();
                                }
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.inOrOut_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicApplyListInOutNotify parseFrom(InputStream inputStream) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicApplyListInOutNotify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListInOutNotify parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplyListInOutNotify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListInOutNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplyListInOutNotifyOrBuilder extends MessageOrBuilder {
        int getInOrOut();

        long getRoomId();

        Room.UserModel getUser();

        Room.UserModelOrBuilder getUserOrBuilder();

        boolean hasUser();
    }

    public static final class MicApplyListReply extends GeneratedMessageV3 implements MicApplyListReplyOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int LISTEMPTY_FIELD_NUMBER = 3;
        public static final int USERS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int code_;
        private boolean listEmpty_;
        private byte memoizedIsInitialized;
        private List<Room.UserModel> users_;
        private static final MicApplyListReply DEFAULT_INSTANCE = new MicApplyListReply();
        private static final Parser<MicApplyListReply> PARSER = new AbstractParser<MicApplyListReply>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplyListReply.1
            @Override // com.google.protobuf.Parser
            public MicApplyListReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplyListReply(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplyListReplyOrBuilder {
            private int bitField0_;
            private int code_;
            private boolean listEmpty_;
            private RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> usersBuilder_;
            private List<Room.UserModel> users_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            private void ensureUsersIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.users_ = new ArrayList(this.users_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplyListReply_descriptor;
            }

            private RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> getUsersFieldBuilder() {
                if (this.usersBuilder_ == null) {
                    this.usersBuilder_ = new RepeatedFieldBuilderV3<>(this.users_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.users_ = null;
                }
                return this.usersBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUsersFieldBuilder();
                }
            }

            public Builder addAllUsers(Iterable<? extends Room.UserModel> iterable) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.users_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addUsers(Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.add(userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(userModel);
                }
                return this;
            }

            public Room.UserModel.Builder addUsersBuilder() {
                return (Room.UserModel.Builder) getUsersFieldBuilder().addBuilder(Room.UserModel.getDefaultInstance());
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearListEmpty() {
                this.listEmpty_ = false;
                onChanged();
                return this;
            }

            public Builder clearUsers() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.users_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplyListReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public boolean getListEmpty() {
                return this.listEmpty_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public Room.UserModel getUsers(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.get(i) : (Room.UserModel) repeatedFieldBuilderV3.getMessage(i);
            }

            public Room.UserModel.Builder getUsersBuilder(int i) {
                return (Room.UserModel.Builder) getUsersFieldBuilder().getBuilder(i);
            }

            public List<Room.UserModel.Builder> getUsersBuilderList() {
                return getUsersFieldBuilder().getBuilderList();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public int getUsersCount() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public List<Room.UserModel> getUsersList() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.users_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public Room.UserModelOrBuilder getUsersOrBuilder(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.get(i) : (Room.UserModelOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
            public List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.users_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplyListReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeUsers(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setListEmpty(boolean z) {
                this.listEmpty_ = z;
                onChanged();
                return this;
            }

            public Builder setUsers(int i, Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.set(i, userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, userModel);
                }
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                this.users_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListReply build() {
                MicApplyListReply micApplyListReplyBuildPartial = buildPartial();
                if (micApplyListReplyBuildPartial.isInitialized()) {
                    return micApplyListReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplyListReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListReply buildPartial() {
                MicApplyListReply micApplyListReply = new MicApplyListReply(this, 0);
                micApplyListReply.code_ = this.code_;
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    micApplyListReply.users_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.users_ = Collections.unmodifiableList(this.users_);
                        this.bitField0_ &= -2;
                    }
                    micApplyListReply.users_ = this.users_;
                }
                micApplyListReply.listEmpty_ = this.listEmpty_;
                onBuilt();
                return micApplyListReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplyListReply getDefaultInstanceForType() {
                return MicApplyListReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Room.UserModel.Builder addUsersBuilder(int i) {
                return (Room.UserModel.Builder) getUsersFieldBuilder().addBuilder(i, Room.UserModel.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.users_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.listEmpty_ = false;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.users_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addUsers(int i, Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.add(i, userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, userModel);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplyListReply) {
                    return mergeFrom((MicApplyListReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setUsers(int i, Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(MicApplyListReply micApplyListReply) {
                if (micApplyListReply == MicApplyListReply.getDefaultInstance()) {
                    return this;
                }
                if (micApplyListReply.getCode() != 0) {
                    setCode(micApplyListReply.getCode());
                }
                if (this.usersBuilder_ == null) {
                    if (!micApplyListReply.users_.isEmpty()) {
                        if (this.users_.isEmpty()) {
                            this.users_ = micApplyListReply.users_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUsersIsMutable();
                            this.users_.addAll(micApplyListReply.users_);
                        }
                        onChanged();
                    }
                } else if (!micApplyListReply.users_.isEmpty()) {
                    if (!this.usersBuilder_.isEmpty()) {
                        this.usersBuilder_.addAllMessages(micApplyListReply.users_);
                    } else {
                        this.usersBuilder_.dispose();
                        this.usersBuilder_ = null;
                        this.users_ = micApplyListReply.users_;
                        this.bitField0_ &= -2;
                        this.usersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUsersFieldBuilder() : null;
                    }
                }
                if (micApplyListReply.getListEmpty()) {
                    setListEmpty(micApplyListReply.getListEmpty());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplyListReply).unknownFields);
                onChanged();
                return this;
            }

            public Builder addUsers(Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUsers(int i, Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplyListReply micApplyListReply = null;
                try {
                    try {
                        MicApplyListReply micApplyListReply2 = (MicApplyListReply) MicApplyListReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplyListReply2 != null) {
                            mergeFrom(micApplyListReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplyListReply micApplyListReply3 = (MicApplyListReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplyListReply = micApplyListReply3;
                            if (micApplyListReply != null) {
                                mergeFrom(micApplyListReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplyListReply != null) {
                        mergeFrom(micApplyListReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplyListReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplyListReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplyListReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplyListReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplyListReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplyListReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplyListReply)) {
                return super.equals(obj);
            }
            MicApplyListReply micApplyListReply = (MicApplyListReply) obj;
            return getCode() == micApplyListReply.getCode() && getUsersList().equals(micApplyListReply.getUsersList()) && getListEmpty() == micApplyListReply.getListEmpty() && this.unknownFields.equals(micApplyListReply.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public boolean getListEmpty() {
            return this.listEmpty_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplyListReply> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
            for (int i3 = 0; i3 < this.users_.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.users_.get(i3));
            }
            boolean z = this.listEmpty_;
            if (z) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public Room.UserModel getUsers(int i) {
            return this.users_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public int getUsersCount() {
            return this.users_.size();
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public List<Room.UserModel> getUsersList() {
            return this.users_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public Room.UserModelOrBuilder getUsersOrBuilder(int i) {
            return this.users_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListReplyOrBuilder
        public List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList() {
            return this.users_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int code = getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getUsersCount() > 0) {
                code = getUsersList().hashCode() + o000000O.OooO00o(code, 37, 2, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashBoolean(getListEmpty()) + o000000O.OooO00o(code, 37, 3, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplyListReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplyListReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            for (int i2 = 0; i2 < this.users_.size(); i2++) {
                codedOutputStream.writeMessage(2, this.users_.get(i2));
            }
            boolean z = this.listEmpty_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplyListReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplyListReply micApplyListReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplyListReply);
        }

        public static MicApplyListReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplyListReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyListReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplyListReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplyListReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplyListReply() {
            this.memoizedIsInitialized = (byte) -1;
            this.users_ = Collections.emptyList();
        }

        public static MicApplyListReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplyListReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MicApplyListReply parseFrom(InputStream inputStream) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MicApplyListReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.code_ = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                if (!(z2 & true)) {
                                    this.users_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.users_.add((Room.UserModel) codedInputStream.readMessage(Room.UserModel.parser(), extensionRegistryLite));
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.listEmpty_ = codedInputStream.readBool();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.users_ = Collections.unmodifiableList(this.users_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.users_ = Collections.unmodifiableList(this.users_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static MicApplyListReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplyListReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplyListReplyOrBuilder extends MessageOrBuilder {
        int getCode();

        boolean getListEmpty();

        Room.UserModel getUsers(int i);

        int getUsersCount();

        List<Room.UserModel> getUsersList();

        Room.UserModelOrBuilder getUsersOrBuilder(int i);

        List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList();
    }

    public static final class MicApplyListRequest extends GeneratedMessageV3 implements MicApplyListRequestOrBuilder {
        private static final MicApplyListRequest DEFAULT_INSTANCE = new MicApplyListRequest();
        private static final Parser<MicApplyListRequest> PARSER = new AbstractParser<MicApplyListRequest>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplyListRequest.1
            @Override // com.google.protobuf.Parser
            public MicApplyListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplyListRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long roomId_;
        private long userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplyListRequestOrBuilder {
            private long roomId_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplyListRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplyListRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyListRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplyListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListRequest build() {
                MicApplyListRequest micApplyListRequestBuildPartial = buildPartial();
                if (micApplyListRequestBuildPartial.isInitialized()) {
                    return micApplyListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplyListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyListRequest buildPartial() {
                MicApplyListRequest micApplyListRequest = new MicApplyListRequest(this, 0);
                micApplyListRequest.roomId_ = this.roomId_;
                micApplyListRequest.userId_ = this.userId_;
                onBuilt();
                return micApplyListRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplyListRequest getDefaultInstanceForType() {
                return MicApplyListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                this.userId_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplyListRequest) {
                    return mergeFrom((MicApplyListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicApplyListRequest micApplyListRequest) {
                if (micApplyListRequest == MicApplyListRequest.getDefaultInstance()) {
                    return this;
                }
                if (micApplyListRequest.getRoomId() != 0) {
                    setRoomId(micApplyListRequest.getRoomId());
                }
                if (micApplyListRequest.getUserId() != 0) {
                    setUserId(micApplyListRequest.getUserId());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplyListRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplyListRequest micApplyListRequest = null;
                try {
                    try {
                        MicApplyListRequest micApplyListRequest2 = (MicApplyListRequest) MicApplyListRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplyListRequest2 != null) {
                            mergeFrom(micApplyListRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplyListRequest micApplyListRequest3 = (MicApplyListRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplyListRequest = micApplyListRequest3;
                            if (micApplyListRequest != null) {
                                mergeFrom(micApplyListRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplyListRequest != null) {
                        mergeFrom(micApplyListRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplyListRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplyListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplyListRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplyListRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplyListRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplyListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplyListRequest)) {
                return super.equals(obj);
            }
            MicApplyListRequest micApplyListRequest = (MicApplyListRequest) obj;
            return getRoomId() == micApplyListRequest.getRoomId() && getUserId() == micApplyListRequest.getUserId() && this.unknownFields.equals(micApplyListRequest.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplyListRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyListRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplyListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyListRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplyListRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplyListRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplyListRequest micApplyListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplyListRequest);
        }

        public static MicApplyListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplyListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplyListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplyListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplyListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyListRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplyListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicApplyListRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.roomId_ = codedInputStream.readInt64();
                                } else if (tag != 16) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.userId_ = codedInputStream.readInt64();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
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

        public static MicApplyListRequest parseFrom(InputStream inputStream) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicApplyListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyListRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplyListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplyListRequestOrBuilder extends MessageOrBuilder {
        long getRoomId();

        long getUserId();
    }

    public static final class MicApplyReply extends GeneratedMessageV3 implements MicApplyReplyOrBuilder {
        public static final int APPLYLISTEMPTY_FIELD_NUMBER = 3;
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 4;
        public static final int ROOMID_FIELD_NUMBER = 5;
        public static final int USERID_FIELD_NUMBER = 6;
        public static final int USERS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean applyListEmpty_;
        private int code_;
        private byte memoizedIsInitialized;
        private int op_;
        private long roomId_;
        private long userId_;
        private List<Room.UserModel> users_;
        private static final MicApplyReply DEFAULT_INSTANCE = new MicApplyReply();
        private static final Parser<MicApplyReply> PARSER = new AbstractParser<MicApplyReply>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplyReply.1
            @Override // com.google.protobuf.Parser
            public MicApplyReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplyReply(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplyReplyOrBuilder {
            private boolean applyListEmpty_;
            private int bitField0_;
            private int code_;
            private int op_;
            private long roomId_;
            private long userId_;
            private RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> usersBuilder_;
            private List<Room.UserModel> users_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            private void ensureUsersIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.users_ = new ArrayList(this.users_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplyReply_descriptor;
            }

            private RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> getUsersFieldBuilder() {
                if (this.usersBuilder_ == null) {
                    this.usersBuilder_ = new RepeatedFieldBuilderV3<>(this.users_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.users_ = null;
                }
                return this.usersBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUsersFieldBuilder();
                }
            }

            public Builder addAllUsers(Iterable<? extends Room.UserModel> iterable) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.users_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addUsers(Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.add(userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(userModel);
                }
                return this;
            }

            public Room.UserModel.Builder addUsersBuilder() {
                return (Room.UserModel.Builder) getUsersFieldBuilder().addBuilder(Room.UserModel.getDefaultInstance());
            }

            public Builder clearApplyListEmpty() {
                this.applyListEmpty_ = false;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOp() {
                this.op_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUsers() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.users_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public boolean getApplyListEmpty() {
                return this.applyListEmpty_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplyReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public int getOp() {
                return this.op_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public Room.UserModel getUsers(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.get(i) : (Room.UserModel) repeatedFieldBuilderV3.getMessage(i);
            }

            public Room.UserModel.Builder getUsersBuilder(int i) {
                return (Room.UserModel.Builder) getUsersFieldBuilder().getBuilder(i);
            }

            public List<Room.UserModel.Builder> getUsersBuilderList() {
                return getUsersFieldBuilder().getBuilderList();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public int getUsersCount() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public List<Room.UserModel> getUsersList() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.users_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public Room.UserModelOrBuilder getUsersOrBuilder(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.users_.get(i) : (Room.UserModelOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
            public List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList() {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.users_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeUsers(int i) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setApplyListEmpty(boolean z) {
                this.applyListEmpty_ = z;
                onChanged();
                return this;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setOp(int i) {
                this.op_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public Builder setUsers(int i, Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.set(i, userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, userModel);
                }
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                this.users_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyReply build() {
                MicApplyReply micApplyReplyBuildPartial = buildPartial();
                if (micApplyReplyBuildPartial.isInitialized()) {
                    return micApplyReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplyReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyReply buildPartial() {
                MicApplyReply micApplyReply = new MicApplyReply(this, 0);
                micApplyReply.code_ = this.code_;
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    micApplyReply.users_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.users_ = Collections.unmodifiableList(this.users_);
                        this.bitField0_ &= -2;
                    }
                    micApplyReply.users_ = this.users_;
                }
                micApplyReply.applyListEmpty_ = this.applyListEmpty_;
                micApplyReply.op_ = this.op_;
                micApplyReply.roomId_ = this.roomId_;
                micApplyReply.userId_ = this.userId_;
                onBuilt();
                return micApplyReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplyReply getDefaultInstanceForType() {
                return MicApplyReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Room.UserModel.Builder addUsersBuilder(int i) {
                return (Room.UserModel.Builder) getUsersFieldBuilder().addBuilder(i, Room.UserModel.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.users_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.applyListEmpty_ = false;
                this.op_ = 0;
                this.roomId_ = 0L;
                this.userId_ = 0L;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.users_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addUsers(int i, Room.UserModel userModel) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    userModel.getClass();
                    ensureUsersIsMutable();
                    this.users_.add(i, userModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, userModel);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplyReply) {
                    return mergeFrom((MicApplyReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setUsers(int i, Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(MicApplyReply micApplyReply) {
                if (micApplyReply == MicApplyReply.getDefaultInstance()) {
                    return this;
                }
                if (micApplyReply.getCode() != 0) {
                    setCode(micApplyReply.getCode());
                }
                if (this.usersBuilder_ == null) {
                    if (!micApplyReply.users_.isEmpty()) {
                        if (this.users_.isEmpty()) {
                            this.users_ = micApplyReply.users_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUsersIsMutable();
                            this.users_.addAll(micApplyReply.users_);
                        }
                        onChanged();
                    }
                } else if (!micApplyReply.users_.isEmpty()) {
                    if (!this.usersBuilder_.isEmpty()) {
                        this.usersBuilder_.addAllMessages(micApplyReply.users_);
                    } else {
                        this.usersBuilder_.dispose();
                        this.usersBuilder_ = null;
                        this.users_ = micApplyReply.users_;
                        this.bitField0_ &= -2;
                        this.usersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getUsersFieldBuilder() : null;
                    }
                }
                if (micApplyReply.getApplyListEmpty()) {
                    setApplyListEmpty(micApplyReply.getApplyListEmpty());
                }
                if (micApplyReply.getOp() != 0) {
                    setOp(micApplyReply.getOp());
                }
                if (micApplyReply.getRoomId() != 0) {
                    setRoomId(micApplyReply.getRoomId());
                }
                if (micApplyReply.getUserId() != 0) {
                    setUserId(micApplyReply.getUserId());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplyReply).unknownFields);
                onChanged();
                return this;
            }

            public Builder addUsers(Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUsers(int i, Room.UserModel.Builder builder) {
                RepeatedFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> repeatedFieldBuilderV3 = this.usersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureUsersIsMutable();
                    this.users_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplyReply micApplyReply = null;
                try {
                    try {
                        MicApplyReply micApplyReply2 = (MicApplyReply) MicApplyReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplyReply2 != null) {
                            mergeFrom(micApplyReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplyReply micApplyReply3 = (MicApplyReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplyReply = micApplyReply3;
                            if (micApplyReply != null) {
                                mergeFrom(micApplyReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplyReply != null) {
                        mergeFrom(micApplyReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplyReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplyReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplyReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplyReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplyReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplyReply)) {
                return super.equals(obj);
            }
            MicApplyReply micApplyReply = (MicApplyReply) obj;
            return getCode() == micApplyReply.getCode() && getUsersList().equals(micApplyReply.getUsersList()) && getApplyListEmpty() == micApplyReply.getApplyListEmpty() && getOp() == micApplyReply.getOp() && getRoomId() == micApplyReply.getRoomId() && getUserId() == micApplyReply.getUserId() && this.unknownFields.equals(micApplyReply.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public boolean getApplyListEmpty() {
            return this.applyListEmpty_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public int getOp() {
            return this.op_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplyReply> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
            for (int i3 = 0; i3 < this.users_.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.users_.get(i3));
            }
            boolean z = this.applyListEmpty_;
            if (z) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, z);
            }
            int i4 = this.op_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i4);
            }
            long j = this.roomId_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public Room.UserModel getUsers(int i) {
            return this.users_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public int getUsersCount() {
            return this.users_.size();
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public List<Room.UserModel> getUsersList() {
            return this.users_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public Room.UserModelOrBuilder getUsersOrBuilder(int i) {
            return this.users_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyReplyOrBuilder
        public List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList() {
            return this.users_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int code = getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (getUsersCount() > 0) {
                code = getUsersList().hashCode() + o000000O.OooO00o(code, 37, 2, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getOp() + ((((Internal.hashBoolean(getApplyListEmpty()) + o000000O.OooO00o(code, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplyReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            for (int i2 = 0; i2 < this.users_.size(); i2++) {
                codedOutputStream.writeMessage(2, this.users_.get(i2));
            }
            boolean z = this.applyListEmpty_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            int i3 = this.op_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(4, i3);
            }
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(5, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(6, j2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplyReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplyReply micApplyReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplyReply);
        }

        public static MicApplyReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplyReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplyReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplyReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplyReply() {
            this.memoizedIsInitialized = (byte) -1;
            this.users_ = Collections.emptyList();
        }

        public static MicApplyReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplyReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MicApplyReply parseFrom(InputStream inputStream) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MicApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (tag == 8) {
                                this.code_ = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                if (!(z2 & true)) {
                                    this.users_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.users_.add((Room.UserModel) codedInputStream.readMessage(Room.UserModel.parser(), extensionRegistryLite));
                            } else if (tag == 24) {
                                this.applyListEmpty_ = codedInputStream.readBool();
                            } else if (tag == 32) {
                                this.op_ = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.userId_ = codedInputStream.readInt64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.users_ = Collections.unmodifiableList(this.users_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.users_ = Collections.unmodifiableList(this.users_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static MicApplyReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplyReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplyReplyOrBuilder extends MessageOrBuilder {
        boolean getApplyListEmpty();

        int getCode();

        int getOp();

        long getRoomId();

        long getUserId();

        Room.UserModel getUsers(int i);

        int getUsersCount();

        List<Room.UserModel> getUsersList();

        Room.UserModelOrBuilder getUsersOrBuilder(int i);

        List<? extends Room.UserModelOrBuilder> getUsersOrBuilderList();
    }

    public static final class MicApplyRequest extends GeneratedMessageV3 implements MicApplyRequestOrBuilder {
        public static final int OP_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int op_;
        private long roomId_;
        private long userId_;
        private static final MicApplyRequest DEFAULT_INSTANCE = new MicApplyRequest();
        private static final Parser<MicApplyRequest> PARSER = new AbstractParser<MicApplyRequest>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplyRequest.1
            @Override // com.google.protobuf.Parser
            public MicApplyRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplyRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplyRequestOrBuilder {
            private int op_;
            private long roomId_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplyRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearOp() {
                this.op_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplyRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
            public int getOp() {
                return this.op_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setOp(int i) {
                this.op_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyRequest build() {
                MicApplyRequest micApplyRequestBuildPartial = buildPartial();
                if (micApplyRequestBuildPartial.isInitialized()) {
                    return micApplyRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplyRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplyRequest buildPartial() {
                MicApplyRequest micApplyRequest = new MicApplyRequest(this, 0);
                micApplyRequest.roomId_ = this.roomId_;
                micApplyRequest.userId_ = this.userId_;
                micApplyRequest.op_ = this.op_;
                onBuilt();
                return micApplyRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplyRequest getDefaultInstanceForType() {
                return MicApplyRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                this.userId_ = 0L;
                this.op_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplyRequest) {
                    return mergeFrom((MicApplyRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicApplyRequest micApplyRequest) {
                if (micApplyRequest == MicApplyRequest.getDefaultInstance()) {
                    return this;
                }
                if (micApplyRequest.getRoomId() != 0) {
                    setRoomId(micApplyRequest.getRoomId());
                }
                if (micApplyRequest.getUserId() != 0) {
                    setUserId(micApplyRequest.getUserId());
                }
                if (micApplyRequest.getOp() != 0) {
                    setOp(micApplyRequest.getOp());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplyRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplyRequest micApplyRequest = null;
                try {
                    try {
                        MicApplyRequest micApplyRequest2 = (MicApplyRequest) MicApplyRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplyRequest2 != null) {
                            mergeFrom(micApplyRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplyRequest micApplyRequest3 = (MicApplyRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplyRequest = micApplyRequest3;
                            if (micApplyRequest != null) {
                                mergeFrom(micApplyRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplyRequest != null) {
                        mergeFrom(micApplyRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplyRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplyRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplyRequest)) {
                return super.equals(obj);
            }
            MicApplyRequest micApplyRequest = (MicApplyRequest) obj;
            return getRoomId() == micApplyRequest.getRoomId() && getUserId() == micApplyRequest.getUserId() && getOp() == micApplyRequest.getOp() && this.unknownFields.equals(micApplyRequest.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
        public int getOp() {
            return this.op_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplyRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            int i2 = this.op_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(3, i2);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplyRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getOp() + ((((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplyRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplyRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            int i = this.op_;
            if (i != 0) {
                codedOutputStream.writeInt32(3, i);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplyRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplyRequest micApplyRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplyRequest);
        }

        public static MicApplyRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplyRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplyRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplyRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplyRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplyRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag == 16) {
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.op_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicApplyRequest parseFrom(InputStream inputStream) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicApplyRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplyRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplyRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplyRequestOrBuilder extends MessageOrBuilder {
        int getOp();

        long getRoomId();

        long getUserId();
    }

    public static final class MicApplySwitchOpenReply extends GeneratedMessageV3 implements MicApplySwitchOpenReplyOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final MicApplySwitchOpenReply DEFAULT_INSTANCE = new MicApplySwitchOpenReply();
        private static final Parser<MicApplySwitchOpenReply> PARSER = new AbstractParser<MicApplySwitchOpenReply>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReply.1
            @Override // com.google.protobuf.Parser
            public MicApplySwitchOpenReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplySwitchOpenReply(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 3;
        public static final int WHO_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;
        private long roomId_;
        private int status_;
        private Room.UserModel who_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplySwitchOpenReplyOrBuilder {
            private int code_;
            private long roomId_;
            private int status_;
            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> whoBuilder_;
            private Room.UserModel who_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenReply_descriptor;
            }

            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> getWhoFieldBuilder() {
                if (this.whoBuilder_ == null) {
                    this.whoBuilder_ = new SingleFieldBuilderV3<>(getWho(), getParentForChildren(), isClean());
                    this.who_ = null;
                }
                return this.whoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWho() {
                if (this.whoBuilder_ == null) {
                    this.who_ = null;
                    onChanged();
                } else {
                    this.who_ = null;
                    this.whoBuilder_ = null;
                }
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public int getStatus() {
                return this.status_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public Room.UserModel getWho() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModel) singleFieldBuilderV3.getMessage();
                }
                Room.UserModel userModel = this.who_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            public Room.UserModel.Builder getWhoBuilder() {
                onChanged();
                return (Room.UserModel.Builder) getWhoFieldBuilder().getBuilder();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public Room.UserModelOrBuilder getWhoOrBuilder() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Room.UserModel userModel = this.who_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
            public boolean hasWho() {
                return (this.whoBuilder_ == null && this.who_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplySwitchOpenReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeWho(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Room.UserModel userModel2 = this.who_;
                    if (userModel2 != null) {
                        this.who_ = Room.UserModel.newBuilder(userModel2).mergeFrom(userModel).buildPartial();
                    } else {
                        this.who_ = userModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(userModel);
                }
                return this;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setStatus(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public Builder setWho(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userModel.getClass();
                    this.who_ = userModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(userModel);
                }
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplySwitchOpenReply build() {
                MicApplySwitchOpenReply micApplySwitchOpenReplyBuildPartial = buildPartial();
                if (micApplySwitchOpenReplyBuildPartial.isInitialized()) {
                    return micApplySwitchOpenReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplySwitchOpenReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplySwitchOpenReply buildPartial() {
                MicApplySwitchOpenReply micApplySwitchOpenReply = new MicApplySwitchOpenReply(this, 0);
                micApplySwitchOpenReply.code_ = this.code_;
                micApplySwitchOpenReply.roomId_ = this.roomId_;
                micApplySwitchOpenReply.status_ = this.status_;
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    micApplySwitchOpenReply.who_ = this.who_;
                } else {
                    micApplySwitchOpenReply.who_ = (Room.UserModel) singleFieldBuilderV3.build();
                }
                onBuilt();
                return micApplySwitchOpenReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplySwitchOpenReply getDefaultInstanceForType() {
                return MicApplySwitchOpenReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.roomId_ = 0L;
                this.status_ = 0;
                if (this.whoBuilder_ == null) {
                    this.who_ = null;
                } else {
                    this.who_ = null;
                    this.whoBuilder_ = null;
                }
                return this;
            }

            public Builder setWho(Room.UserModel.Builder builder) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.whoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.who_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplySwitchOpenReply) {
                    return mergeFrom((MicApplySwitchOpenReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicApplySwitchOpenReply micApplySwitchOpenReply) {
                if (micApplySwitchOpenReply == MicApplySwitchOpenReply.getDefaultInstance()) {
                    return this;
                }
                if (micApplySwitchOpenReply.getCode() != 0) {
                    setCode(micApplySwitchOpenReply.getCode());
                }
                if (micApplySwitchOpenReply.getRoomId() != 0) {
                    setRoomId(micApplySwitchOpenReply.getRoomId());
                }
                if (micApplySwitchOpenReply.getStatus() != 0) {
                    setStatus(micApplySwitchOpenReply.getStatus());
                }
                if (micApplySwitchOpenReply.hasWho()) {
                    mergeWho(micApplySwitchOpenReply.getWho());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplySwitchOpenReply).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplySwitchOpenReply micApplySwitchOpenReply = null;
                try {
                    try {
                        MicApplySwitchOpenReply micApplySwitchOpenReply2 = (MicApplySwitchOpenReply) MicApplySwitchOpenReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplySwitchOpenReply2 != null) {
                            mergeFrom(micApplySwitchOpenReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplySwitchOpenReply micApplySwitchOpenReply3 = (MicApplySwitchOpenReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplySwitchOpenReply = micApplySwitchOpenReply3;
                            if (micApplySwitchOpenReply != null) {
                                mergeFrom(micApplySwitchOpenReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplySwitchOpenReply != null) {
                        mergeFrom(micApplySwitchOpenReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplySwitchOpenReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplySwitchOpenReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplySwitchOpenReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplySwitchOpenReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplySwitchOpenReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplySwitchOpenReply)) {
                return super.equals(obj);
            }
            MicApplySwitchOpenReply micApplySwitchOpenReply = (MicApplySwitchOpenReply) obj;
            if (getCode() == micApplySwitchOpenReply.getCode() && getRoomId() == micApplySwitchOpenReply.getRoomId() && getStatus() == micApplySwitchOpenReply.getStatus() && hasWho() == micApplySwitchOpenReply.hasWho()) {
                return (!hasWho() || getWho().equals(micApplySwitchOpenReply.getWho())) && this.unknownFields.equals(micApplySwitchOpenReply.unknownFields);
            }
            return false;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplySwitchOpenReply> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
            long j = this.roomId_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(2, j);
            }
            int i3 = this.status_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i3);
            }
            if (this.who_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getWho());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public Room.UserModel getWho() {
            Room.UserModel userModel = this.who_;
            return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public Room.UserModelOrBuilder getWhoOrBuilder() {
            return getWho();
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenReplyOrBuilder
        public boolean hasWho() {
            return this.who_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int status = getStatus() + ((((Internal.hashLong(getRoomId()) + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
            if (hasWho()) {
                status = getWho().hashCode() + o000000O.OooO00o(status, 37, 4, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (status * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplySwitchOpenReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplySwitchOpenReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplySwitchOpenReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            int i2 = this.status_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            if (this.who_ != null) {
                codedOutputStream.writeMessage(4, getWho());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplySwitchOpenReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplySwitchOpenReply micApplySwitchOpenReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplySwitchOpenReply);
        }

        public static MicApplySwitchOpenReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplySwitchOpenReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplySwitchOpenReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplySwitchOpenReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplySwitchOpenReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplySwitchOpenReply() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplySwitchOpenReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplySwitchOpenReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicApplySwitchOpenReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.code_ = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.roomId_ = codedInputStream.readInt64();
                                } else if (tag == 24) {
                                    this.status_ = codedInputStream.readInt32();
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Room.UserModel userModel = this.who_;
                                    Room.UserModel.Builder builder = userModel != null ? userModel.toBuilder() : null;
                                    Room.UserModel userModel2 = (Room.UserModel) codedInputStream.readMessage(Room.UserModel.parser(), extensionRegistryLite);
                                    this.who_ = userModel2;
                                    if (builder != null) {
                                        builder.mergeFrom(userModel2);
                                        this.who_ = builder.buildPartial();
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicApplySwitchOpenReply parseFrom(InputStream inputStream) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicApplySwitchOpenReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplySwitchOpenReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplySwitchOpenReplyOrBuilder extends MessageOrBuilder {
        int getCode();

        long getRoomId();

        int getStatus();

        Room.UserModel getWho();

        Room.UserModelOrBuilder getWhoOrBuilder();

        boolean hasWho();
    }

    public static final class MicApplySwitchOpenRequest extends GeneratedMessageV3 implements MicApplySwitchOpenRequestOrBuilder {
        public static final int OP_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long op_;
        private long roomId_;
        private long userId_;
        private static final MicApplySwitchOpenRequest DEFAULT_INSTANCE = new MicApplySwitchOpenRequest();
        private static final Parser<MicApplySwitchOpenRequest> PARSER = new AbstractParser<MicApplySwitchOpenRequest>() { // from class: com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequest.1
            @Override // com.google.protobuf.Parser
            public MicApplySwitchOpenRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicApplySwitchOpenRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicApplySwitchOpenRequestOrBuilder {
            private long op_;
            private long roomId_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearOp() {
                this.op_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
            public long getOp() {
                return this.op_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicApplySwitchOpenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplySwitchOpenRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setOp(long j) {
                this.op_ = j;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplySwitchOpenRequest build() {
                MicApplySwitchOpenRequest micApplySwitchOpenRequestBuildPartial = buildPartial();
                if (micApplySwitchOpenRequestBuildPartial.isInitialized()) {
                    return micApplySwitchOpenRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micApplySwitchOpenRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicApplySwitchOpenRequest buildPartial() {
                MicApplySwitchOpenRequest micApplySwitchOpenRequest = new MicApplySwitchOpenRequest(this, 0);
                micApplySwitchOpenRequest.roomId_ = this.roomId_;
                micApplySwitchOpenRequest.userId_ = this.userId_;
                micApplySwitchOpenRequest.op_ = this.op_;
                onBuilt();
                return micApplySwitchOpenRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicApplySwitchOpenRequest getDefaultInstanceForType() {
                return MicApplySwitchOpenRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                this.userId_ = 0L;
                this.op_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicApplySwitchOpenRequest) {
                    return mergeFrom((MicApplySwitchOpenRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicApplySwitchOpenRequest micApplySwitchOpenRequest) {
                if (micApplySwitchOpenRequest == MicApplySwitchOpenRequest.getDefaultInstance()) {
                    return this;
                }
                if (micApplySwitchOpenRequest.getRoomId() != 0) {
                    setRoomId(micApplySwitchOpenRequest.getRoomId());
                }
                if (micApplySwitchOpenRequest.getUserId() != 0) {
                    setUserId(micApplySwitchOpenRequest.getUserId());
                }
                if (micApplySwitchOpenRequest.getOp() != 0) {
                    setOp(micApplySwitchOpenRequest.getOp());
                }
                mergeUnknownFields(((GeneratedMessageV3) micApplySwitchOpenRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicApplySwitchOpenRequest micApplySwitchOpenRequest = null;
                try {
                    try {
                        MicApplySwitchOpenRequest micApplySwitchOpenRequest2 = (MicApplySwitchOpenRequest) MicApplySwitchOpenRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micApplySwitchOpenRequest2 != null) {
                            mergeFrom(micApplySwitchOpenRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicApplySwitchOpenRequest micApplySwitchOpenRequest3 = (MicApplySwitchOpenRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micApplySwitchOpenRequest = micApplySwitchOpenRequest3;
                            if (micApplySwitchOpenRequest != null) {
                                mergeFrom(micApplySwitchOpenRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micApplySwitchOpenRequest != null) {
                        mergeFrom(micApplySwitchOpenRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicApplySwitchOpenRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicApplySwitchOpenRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicApplySwitchOpenRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicApplySwitchOpenRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicApplySwitchOpenRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicApplySwitchOpenRequest)) {
                return super.equals(obj);
            }
            MicApplySwitchOpenRequest micApplySwitchOpenRequest = (MicApplySwitchOpenRequest) obj;
            return getRoomId() == micApplySwitchOpenRequest.getRoomId() && getUserId() == micApplySwitchOpenRequest.getUserId() && getOp() == micApplySwitchOpenRequest.getOp() && this.unknownFields.equals(micApplySwitchOpenRequest.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
        public long getOp() {
            return this.op_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicApplySwitchOpenRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            long j3 = this.op_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(3, j3);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicApplySwitchOpenRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(getOp()) + ((((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicApplySwitchOpenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicApplySwitchOpenRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicApplySwitchOpenRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            long j3 = this.op_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(3, j3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicApplySwitchOpenRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicApplySwitchOpenRequest micApplySwitchOpenRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micApplySwitchOpenRequest);
        }

        public static MicApplySwitchOpenRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicApplySwitchOpenRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplySwitchOpenRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicApplySwitchOpenRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicApplySwitchOpenRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicApplySwitchOpenRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicApplySwitchOpenRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicApplySwitchOpenRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicApplySwitchOpenRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag == 16) {
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.op_ = codedInputStream.readInt64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicApplySwitchOpenRequest parseFrom(InputStream inputStream) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicApplySwitchOpenRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicApplySwitchOpenRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicApplySwitchOpenRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicApplySwitchOpenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicApplySwitchOpenRequestOrBuilder extends MessageOrBuilder {
        long getOp();

        long getRoomId();

        long getUserId();
    }

    public static final class MicInviteFromApplyReply extends GeneratedMessageV3 implements MicInviteFromApplyReplyOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int FROMAPPLYMICLIST_FIELD_NUMBER = 5;
        public static final int INVITER_FIELD_NUMBER = 4;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TARGETROLE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int code_;
        private boolean fromApplyMicList_;
        private Room.UserModel inviter_;
        private byte memoizedIsInitialized;
        private int roomId_;
        private int targetRole_;
        private static final MicInviteFromApplyReply DEFAULT_INSTANCE = new MicInviteFromApplyReply();
        private static final Parser<MicInviteFromApplyReply> PARSER = new AbstractParser<MicInviteFromApplyReply>() { // from class: com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReply.1
            @Override // com.google.protobuf.Parser
            public MicInviteFromApplyReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicInviteFromApplyReply(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicInviteFromApplyReplyOrBuilder {
            private int code_;
            private boolean fromApplyMicList_;
            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> inviterBuilder_;
            private Room.UserModel inviter_;
            private int roomId_;
            private int targetRole_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyReply_descriptor;
            }

            private SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> getInviterFieldBuilder() {
                if (this.inviterBuilder_ == null) {
                    this.inviterBuilder_ = new SingleFieldBuilderV3<>(getInviter(), getParentForChildren(), isClean());
                    this.inviter_ = null;
                }
                return this.inviterBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFromApplyMicList() {
                this.fromApplyMicList_ = false;
                onChanged();
                return this;
            }

            public Builder clearInviter() {
                if (this.inviterBuilder_ == null) {
                    this.inviter_ = null;
                    onChanged();
                } else {
                    this.inviter_ = null;
                    this.inviterBuilder_ = null;
                }
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTargetRole() {
                this.targetRole_ = 0;
                onChanged();
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public boolean getFromApplyMicList() {
                return this.fromApplyMicList_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public Room.UserModel getInviter() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModel) singleFieldBuilderV3.getMessage();
                }
                Room.UserModel userModel = this.inviter_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            public Room.UserModel.Builder getInviterBuilder() {
                onChanged();
                return (Room.UserModel.Builder) getInviterFieldBuilder().getBuilder();
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public Room.UserModelOrBuilder getInviterOrBuilder() {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Room.UserModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Room.UserModel userModel = this.inviter_;
                return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public int getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public int getTargetRole() {
                return this.targetRole_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
            public boolean hasInviter() {
                return (this.inviterBuilder_ == null && this.inviter_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicInviteFromApplyReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeInviter(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Room.UserModel userModel2 = this.inviter_;
                    if (userModel2 != null) {
                        this.inviter_ = Room.UserModel.newBuilder(userModel2).mergeFrom(userModel).buildPartial();
                    } else {
                        this.inviter_ = userModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(userModel);
                }
                return this;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setFromApplyMicList(boolean z) {
                this.fromApplyMicList_ = z;
                onChanged();
                return this;
            }

            public Builder setInviter(Room.UserModel userModel) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userModel.getClass();
                    this.inviter_ = userModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(userModel);
                }
                return this;
            }

            public Builder setRoomId(int i) {
                this.roomId_ = i;
                onChanged();
                return this;
            }

            public Builder setTargetRole(int i) {
                this.targetRole_ = i;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicInviteFromApplyReply build() {
                MicInviteFromApplyReply micInviteFromApplyReplyBuildPartial = buildPartial();
                if (micInviteFromApplyReplyBuildPartial.isInitialized()) {
                    return micInviteFromApplyReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micInviteFromApplyReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicInviteFromApplyReply buildPartial() {
                MicInviteFromApplyReply micInviteFromApplyReply = new MicInviteFromApplyReply(this, 0);
                micInviteFromApplyReply.code_ = this.code_;
                micInviteFromApplyReply.roomId_ = this.roomId_;
                micInviteFromApplyReply.targetRole_ = this.targetRole_;
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    micInviteFromApplyReply.inviter_ = this.inviter_;
                } else {
                    micInviteFromApplyReply.inviter_ = (Room.UserModel) singleFieldBuilderV3.build();
                }
                micInviteFromApplyReply.fromApplyMicList_ = this.fromApplyMicList_;
                onBuilt();
                return micInviteFromApplyReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicInviteFromApplyReply getDefaultInstanceForType() {
                return MicInviteFromApplyReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.roomId_ = 0;
                this.targetRole_ = 0;
                if (this.inviterBuilder_ == null) {
                    this.inviter_ = null;
                } else {
                    this.inviter_ = null;
                    this.inviterBuilder_ = null;
                }
                this.fromApplyMicList_ = false;
                return this;
            }

            public Builder setInviter(Room.UserModel.Builder builder) {
                SingleFieldBuilderV3<Room.UserModel, Room.UserModel.Builder, Room.UserModelOrBuilder> singleFieldBuilderV3 = this.inviterBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.inviter_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicInviteFromApplyReply) {
                    return mergeFrom((MicInviteFromApplyReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicInviteFromApplyReply micInviteFromApplyReply) {
                if (micInviteFromApplyReply == MicInviteFromApplyReply.getDefaultInstance()) {
                    return this;
                }
                if (micInviteFromApplyReply.getCode() != 0) {
                    setCode(micInviteFromApplyReply.getCode());
                }
                if (micInviteFromApplyReply.getRoomId() != 0) {
                    setRoomId(micInviteFromApplyReply.getRoomId());
                }
                if (micInviteFromApplyReply.getTargetRole() != 0) {
                    setTargetRole(micInviteFromApplyReply.getTargetRole());
                }
                if (micInviteFromApplyReply.hasInviter()) {
                    mergeInviter(micInviteFromApplyReply.getInviter());
                }
                if (micInviteFromApplyReply.getFromApplyMicList()) {
                    setFromApplyMicList(micInviteFromApplyReply.getFromApplyMicList());
                }
                mergeUnknownFields(((GeneratedMessageV3) micInviteFromApplyReply).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicInviteFromApplyReply micInviteFromApplyReply = null;
                try {
                    try {
                        MicInviteFromApplyReply micInviteFromApplyReply2 = (MicInviteFromApplyReply) MicInviteFromApplyReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micInviteFromApplyReply2 != null) {
                            mergeFrom(micInviteFromApplyReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicInviteFromApplyReply micInviteFromApplyReply3 = (MicInviteFromApplyReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micInviteFromApplyReply = micInviteFromApplyReply3;
                            if (micInviteFromApplyReply != null) {
                                mergeFrom(micInviteFromApplyReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micInviteFromApplyReply != null) {
                        mergeFrom(micInviteFromApplyReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicInviteFromApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicInviteFromApplyReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicInviteFromApplyReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicInviteFromApplyReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicInviteFromApplyReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicInviteFromApplyReply)) {
                return super.equals(obj);
            }
            MicInviteFromApplyReply micInviteFromApplyReply = (MicInviteFromApplyReply) obj;
            if (getCode() == micInviteFromApplyReply.getCode() && getRoomId() == micInviteFromApplyReply.getRoomId() && getTargetRole() == micInviteFromApplyReply.getTargetRole() && hasInviter() == micInviteFromApplyReply.hasInviter()) {
                return (!hasInviter() || getInviter().equals(micInviteFromApplyReply.getInviter())) && getFromApplyMicList() == micInviteFromApplyReply.getFromApplyMicList() && this.unknownFields.equals(micInviteFromApplyReply.unknownFields);
            }
            return false;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public boolean getFromApplyMicList() {
            return this.fromApplyMicList_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public Room.UserModel getInviter() {
            Room.UserModel userModel = this.inviter_;
            return userModel == null ? Room.UserModel.getDefaultInstance() : userModel;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public Room.UserModelOrBuilder getInviterOrBuilder() {
            return getInviter();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicInviteFromApplyReply> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public int getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
            int i3 = this.roomId_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            int i4 = this.targetRole_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
            }
            if (this.inviter_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, getInviter());
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(5, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public int getTargetRole() {
            return this.targetRole_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyReplyOrBuilder
        public boolean hasInviter() {
            return this.inviter_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int targetRole = getTargetRole() + ((((getRoomId() + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
            if (hasInviter()) {
                targetRole = getInviter().hashCode() + o000000O.OooO00o(targetRole, 37, 4, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashBoolean(getFromApplyMicList()) + o000000O.OooO00o(targetRole, 37, 5, 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicInviteFromApplyReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicInviteFromApplyReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicInviteFromApplyReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.roomId_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            int i3 = this.targetRole_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            if (this.inviter_ != null) {
                codedOutputStream.writeMessage(4, getInviter());
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                codedOutputStream.writeBool(5, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicInviteFromApplyReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicInviteFromApplyReply micInviteFromApplyReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micInviteFromApplyReply);
        }

        public static MicInviteFromApplyReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicInviteFromApplyReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicInviteFromApplyReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicInviteFromApplyReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicInviteFromApplyReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicInviteFromApplyReply() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicInviteFromApplyReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicInviteFromApplyReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicInviteFromApplyReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.code_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.roomId_ = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.targetRole_ = codedInputStream.readInt32();
                            } else if (tag == 34) {
                                Room.UserModel userModel = this.inviter_;
                                Room.UserModel.Builder builder = userModel != null ? userModel.toBuilder() : null;
                                Room.UserModel userModel2 = (Room.UserModel) codedInputStream.readMessage(Room.UserModel.parser(), extensionRegistryLite);
                                this.inviter_ = userModel2;
                                if (builder != null) {
                                    builder.mergeFrom(userModel2);
                                    this.inviter_ = builder.buildPartial();
                                }
                            } else if (tag != 40) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.fromApplyMicList_ = codedInputStream.readBool();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicInviteFromApplyReply parseFrom(InputStream inputStream) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicInviteFromApplyReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicInviteFromApplyReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicInviteFromApplyReplyOrBuilder extends MessageOrBuilder {
        int getCode();

        boolean getFromApplyMicList();

        Room.UserModel getInviter();

        Room.UserModelOrBuilder getInviterOrBuilder();

        int getRoomId();

        int getTargetRole();

        boolean hasInviter();
    }

    public static final class MicInviteFromApplyRequest extends GeneratedMessageV3 implements MicInviteFromApplyRequestOrBuilder {
        public static final int FROMAPPLYMICLIST_FIELD_NUMBER = 4;
        public static final int ROOMID_FIELD_NUMBER = 2;
        public static final int TARGET_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private boolean fromApplyMicList_;
        private byte memoizedIsInitialized;
        private long roomId_;
        private long target_;
        private long userId_;
        private static final MicInviteFromApplyRequest DEFAULT_INSTANCE = new MicInviteFromApplyRequest();
        private static final Parser<MicInviteFromApplyRequest> PARSER = new AbstractParser<MicInviteFromApplyRequest>() { // from class: com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequest.1
            @Override // com.google.protobuf.Parser
            public MicInviteFromApplyRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicInviteFromApplyRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicInviteFromApplyRequestOrBuilder {
            private boolean fromApplyMicList_;
            private long roomId_;
            private long target_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearFromApplyMicList() {
                this.fromApplyMicList_ = false;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTarget() {
                this.target_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
            public boolean getFromApplyMicList() {
                return this.fromApplyMicList_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
            public long getTarget() {
                return this.target_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicInviteFromApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicInviteFromApplyRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setFromApplyMicList(boolean z) {
                this.fromApplyMicList_ = z;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setTarget(long j) {
                this.target_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicInviteFromApplyRequest build() {
                MicInviteFromApplyRequest micInviteFromApplyRequestBuildPartial = buildPartial();
                if (micInviteFromApplyRequestBuildPartial.isInitialized()) {
                    return micInviteFromApplyRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micInviteFromApplyRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicInviteFromApplyRequest buildPartial() {
                MicInviteFromApplyRequest micInviteFromApplyRequest = new MicInviteFromApplyRequest(this, 0);
                micInviteFromApplyRequest.target_ = this.target_;
                micInviteFromApplyRequest.roomId_ = this.roomId_;
                micInviteFromApplyRequest.userId_ = this.userId_;
                micInviteFromApplyRequest.fromApplyMicList_ = this.fromApplyMicList_;
                onBuilt();
                return micInviteFromApplyRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicInviteFromApplyRequest getDefaultInstanceForType() {
                return MicInviteFromApplyRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.target_ = 0L;
                this.roomId_ = 0L;
                this.userId_ = 0L;
                this.fromApplyMicList_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicInviteFromApplyRequest) {
                    return mergeFrom((MicInviteFromApplyRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicInviteFromApplyRequest micInviteFromApplyRequest) {
                if (micInviteFromApplyRequest == MicInviteFromApplyRequest.getDefaultInstance()) {
                    return this;
                }
                if (micInviteFromApplyRequest.getTarget() != 0) {
                    setTarget(micInviteFromApplyRequest.getTarget());
                }
                if (micInviteFromApplyRequest.getRoomId() != 0) {
                    setRoomId(micInviteFromApplyRequest.getRoomId());
                }
                if (micInviteFromApplyRequest.getUserId() != 0) {
                    setUserId(micInviteFromApplyRequest.getUserId());
                }
                if (micInviteFromApplyRequest.getFromApplyMicList()) {
                    setFromApplyMicList(micInviteFromApplyRequest.getFromApplyMicList());
                }
                mergeUnknownFields(((GeneratedMessageV3) micInviteFromApplyRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicInviteFromApplyRequest micInviteFromApplyRequest = null;
                try {
                    try {
                        MicInviteFromApplyRequest micInviteFromApplyRequest2 = (MicInviteFromApplyRequest) MicInviteFromApplyRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micInviteFromApplyRequest2 != null) {
                            mergeFrom(micInviteFromApplyRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicInviteFromApplyRequest micInviteFromApplyRequest3 = (MicInviteFromApplyRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micInviteFromApplyRequest = micInviteFromApplyRequest3;
                            if (micInviteFromApplyRequest != null) {
                                mergeFrom(micInviteFromApplyRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micInviteFromApplyRequest != null) {
                        mergeFrom(micInviteFromApplyRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicInviteFromApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicInviteFromApplyRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicInviteFromApplyRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicInviteFromApplyRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicInviteFromApplyRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicInviteFromApplyRequest)) {
                return super.equals(obj);
            }
            MicInviteFromApplyRequest micInviteFromApplyRequest = (MicInviteFromApplyRequest) obj;
            return getTarget() == micInviteFromApplyRequest.getTarget() && getRoomId() == micInviteFromApplyRequest.getRoomId() && getUserId() == micInviteFromApplyRequest.getUserId() && getFromApplyMicList() == micInviteFromApplyRequest.getFromApplyMicList() && this.unknownFields.equals(micInviteFromApplyRequest.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
        public boolean getFromApplyMicList() {
            return this.fromApplyMicList_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicInviteFromApplyRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.target_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.roomId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            long j3 = this.userId_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(3, j3);
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                iComputeInt64Size += CodedOutputStream.computeBoolSize(4, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
        public long getTarget() {
            return this.target_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicInviteFromApplyRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashBoolean(getFromApplyMicList()) + ((((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((Internal.hashLong(getTarget()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicInviteFromApplyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicInviteFromApplyRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicInviteFromApplyRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.target_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.roomId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            long j3 = this.userId_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(3, j3);
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicInviteFromApplyRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicInviteFromApplyRequest micInviteFromApplyRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micInviteFromApplyRequest);
        }

        public static MicInviteFromApplyRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicInviteFromApplyRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicInviteFromApplyRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicInviteFromApplyRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicInviteFromApplyRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicInviteFromApplyRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicInviteFromApplyRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicInviteFromApplyRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicInviteFromApplyRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.target_ = codedInputStream.readInt64();
                            } else if (tag == 16) {
                                this.roomId_ = codedInputStream.readInt64();
                            } else if (tag == 24) {
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag != 32) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.fromApplyMicList_ = codedInputStream.readBool();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicInviteFromApplyRequest parseFrom(InputStream inputStream) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicInviteFromApplyRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicInviteFromApplyRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicInviteFromApplyRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicInviteFromApplyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicInviteFromApplyRequestOrBuilder extends MessageOrBuilder {
        boolean getFromApplyMicList();

        long getRoomId();

        long getTarget();

        long getUserId();
    }

    public static final class MicUpFromMicApplyInviteReply extends GeneratedMessageV3 implements MicUpFromMicApplyInviteReplyOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int MICORDER_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;
        private int micOrder_;
        private volatile Object url_;
        private long userId_;
        private static final MicUpFromMicApplyInviteReply DEFAULT_INSTANCE = new MicUpFromMicApplyInviteReply();
        private static final Parser<MicUpFromMicApplyInviteReply> PARSER = new AbstractParser<MicUpFromMicApplyInviteReply>() { // from class: com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReply.1
            @Override // com.google.protobuf.Parser
            public MicUpFromMicApplyInviteReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicUpFromMicApplyInviteReply(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicUpFromMicApplyInviteReplyOrBuilder {
            private int code_;
            private int micOrder_;
            private Object url_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteReply_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMicOrder() {
                this.micOrder_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = MicUpFromMicApplyInviteReply.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteReply_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
            public int getMicOrder() {
                return this.micOrder_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicUpFromMicApplyInviteReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(int i) {
                this.code_ = i;
                onChanged();
                return this;
            }

            public Builder setMicOrder(int i) {
                this.micOrder_ = i;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                this.url_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicUpFromMicApplyInviteReply build() {
                MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReplyBuildPartial = buildPartial();
                if (micUpFromMicApplyInviteReplyBuildPartial.isInitialized()) {
                    return micUpFromMicApplyInviteReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micUpFromMicApplyInviteReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicUpFromMicApplyInviteReply buildPartial() {
                MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply = new MicUpFromMicApplyInviteReply(this, 0);
                micUpFromMicApplyInviteReply.code_ = this.code_;
                micUpFromMicApplyInviteReply.micOrder_ = this.micOrder_;
                micUpFromMicApplyInviteReply.url_ = this.url_;
                micUpFromMicApplyInviteReply.userId_ = this.userId_;
                onBuilt();
                return micUpFromMicApplyInviteReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicUpFromMicApplyInviteReply getDefaultInstanceForType() {
                return MicUpFromMicApplyInviteReply.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.micOrder_ = 0;
                this.url_ = "";
                this.userId_ = 0L;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.url_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicUpFromMicApplyInviteReply) {
                    return mergeFrom((MicUpFromMicApplyInviteReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply) {
                if (micUpFromMicApplyInviteReply == MicUpFromMicApplyInviteReply.getDefaultInstance()) {
                    return this;
                }
                if (micUpFromMicApplyInviteReply.getCode() != 0) {
                    setCode(micUpFromMicApplyInviteReply.getCode());
                }
                if (micUpFromMicApplyInviteReply.getMicOrder() != 0) {
                    setMicOrder(micUpFromMicApplyInviteReply.getMicOrder());
                }
                if (!micUpFromMicApplyInviteReply.getUrl().isEmpty()) {
                    this.url_ = micUpFromMicApplyInviteReply.url_;
                    onChanged();
                }
                if (micUpFromMicApplyInviteReply.getUserId() != 0) {
                    setUserId(micUpFromMicApplyInviteReply.getUserId());
                }
                mergeUnknownFields(((GeneratedMessageV3) micUpFromMicApplyInviteReply).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply = null;
                try {
                    try {
                        MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply2 = (MicUpFromMicApplyInviteReply) MicUpFromMicApplyInviteReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micUpFromMicApplyInviteReply2 != null) {
                            mergeFrom(micUpFromMicApplyInviteReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply3 = (MicUpFromMicApplyInviteReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micUpFromMicApplyInviteReply = micUpFromMicApplyInviteReply3;
                            if (micUpFromMicApplyInviteReply != null) {
                                mergeFrom(micUpFromMicApplyInviteReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micUpFromMicApplyInviteReply != null) {
                        mergeFrom(micUpFromMicApplyInviteReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicUpFromMicApplyInviteReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicUpFromMicApplyInviteReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicUpFromMicApplyInviteReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicUpFromMicApplyInviteReply)) {
                return super.equals(obj);
            }
            MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply = (MicUpFromMicApplyInviteReply) obj;
            return getCode() == micUpFromMicApplyInviteReply.getCode() && getMicOrder() == micUpFromMicApplyInviteReply.getMicOrder() && getUrl().equals(micUpFromMicApplyInviteReply.getUrl()) && getUserId() == micUpFromMicApplyInviteReply.getUserId() && this.unknownFields.equals(micUpFromMicApplyInviteReply.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
        public int getMicOrder() {
            return this.micOrder_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicUpFromMicApplyInviteReply> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.code_;
            int iComputeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
            int i3 = this.micOrder_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.url_);
            }
            long j = this.userId_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteReplyOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashLong(getUserId()) + ((((getUrl().hashCode() + ((((getMicOrder() + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteReply_fieldAccessorTable.ensureFieldAccessorsInitialized(MicUpFromMicApplyInviteReply.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicUpFromMicApplyInviteReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.code_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.micOrder_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.url_);
            }
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicUpFromMicApplyInviteReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicUpFromMicApplyInviteReply micUpFromMicApplyInviteReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micUpFromMicApplyInviteReply);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicUpFromMicApplyInviteReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicUpFromMicApplyInviteReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicUpFromMicApplyInviteReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicUpFromMicApplyInviteReply() {
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
        }

        public static MicUpFromMicApplyInviteReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(InputStream inputStream) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MicUpFromMicApplyInviteReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.code_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.micOrder_ = codedInputStream.readInt32();
                            } else if (tag == 26) {
                                this.url_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 32) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.userId_ = codedInputStream.readInt64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicUpFromMicApplyInviteReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicUpFromMicApplyInviteReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicUpFromMicApplyInviteReplyOrBuilder extends MessageOrBuilder {
        int getCode();

        int getMicOrder();

        String getUrl();

        ByteString getUrlBytes();

        long getUserId();
    }

    public static final class MicUpFromMicApplyInviteRequest extends GeneratedMessageV3 implements MicUpFromMicApplyInviteRequestOrBuilder {
        public static final int FROMAPPLYMICLIST_FIELD_NUMBER = 5;
        public static final int INVITER_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 2;
        public static final int YESORNO_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private boolean fromApplyMicList_;
        private long inviter_;
        private byte memoizedIsInitialized;
        private long roomId_;
        private long userId_;
        private int yesOrNo_;
        private static final MicUpFromMicApplyInviteRequest DEFAULT_INSTANCE = new MicUpFromMicApplyInviteRequest();
        private static final Parser<MicUpFromMicApplyInviteRequest> PARSER = new AbstractParser<MicUpFromMicApplyInviteRequest>() { // from class: com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequest.1
            @Override // com.google.protobuf.Parser
            public MicUpFromMicApplyInviteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MicUpFromMicApplyInviteRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MicUpFromMicApplyInviteRequestOrBuilder {
            private boolean fromApplyMicList_;
            private long inviter_;
            private long roomId_;
            private long userId_;
            private int yesOrNo_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearFromApplyMicList() {
                this.fromApplyMicList_ = false;
                onChanged();
                return this;
            }

            public Builder clearInviter() {
                this.inviter_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearYesOrNo() {
                this.yesOrNo_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteRequest_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
            public boolean getFromApplyMicList() {
                return this.fromApplyMicList_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
            public long getInviter() {
                return this.inviter_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
            public int getYesOrNo() {
                return this.yesOrNo_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicUpFromMicApplyInviteRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setFromApplyMicList(boolean z) {
                this.fromApplyMicList_ = z;
                onChanged();
                return this;
            }

            public Builder setInviter(long j) {
                this.inviter_ = j;
                onChanged();
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                onChanged();
                return this;
            }

            public Builder setYesOrNo(int i) {
                this.yesOrNo_ = i;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicUpFromMicApplyInviteRequest build() {
                MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequestBuildPartial = buildPartial();
                if (micUpFromMicApplyInviteRequestBuildPartial.isInitialized()) {
                    return micUpFromMicApplyInviteRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) micUpFromMicApplyInviteRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MicUpFromMicApplyInviteRequest buildPartial() {
                MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest = new MicUpFromMicApplyInviteRequest(this, 0);
                micUpFromMicApplyInviteRequest.roomId_ = this.roomId_;
                micUpFromMicApplyInviteRequest.userId_ = this.userId_;
                micUpFromMicApplyInviteRequest.inviter_ = this.inviter_;
                micUpFromMicApplyInviteRequest.yesOrNo_ = this.yesOrNo_;
                micUpFromMicApplyInviteRequest.fromApplyMicList_ = this.fromApplyMicList_;
                onBuilt();
                return micUpFromMicApplyInviteRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MicUpFromMicApplyInviteRequest getDefaultInstanceForType() {
                return MicUpFromMicApplyInviteRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.roomId_ = 0L;
                this.userId_ = 0L;
                this.inviter_ = 0L;
                this.yesOrNo_ = 0;
                this.fromApplyMicList_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4013clone() {
                return (Builder) super.mo4013clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MicUpFromMicApplyInviteRequest) {
                    return mergeFrom((MicUpFromMicApplyInviteRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest) {
                if (micUpFromMicApplyInviteRequest == MicUpFromMicApplyInviteRequest.getDefaultInstance()) {
                    return this;
                }
                if (micUpFromMicApplyInviteRequest.getRoomId() != 0) {
                    setRoomId(micUpFromMicApplyInviteRequest.getRoomId());
                }
                if (micUpFromMicApplyInviteRequest.getUserId() != 0) {
                    setUserId(micUpFromMicApplyInviteRequest.getUserId());
                }
                if (micUpFromMicApplyInviteRequest.getInviter() != 0) {
                    setInviter(micUpFromMicApplyInviteRequest.getInviter());
                }
                if (micUpFromMicApplyInviteRequest.getYesOrNo() != 0) {
                    setYesOrNo(micUpFromMicApplyInviteRequest.getYesOrNo());
                }
                if (micUpFromMicApplyInviteRequest.getFromApplyMicList()) {
                    setFromApplyMicList(micUpFromMicApplyInviteRequest.getFromApplyMicList());
                }
                mergeUnknownFields(((GeneratedMessageV3) micUpFromMicApplyInviteRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest = null;
                try {
                    try {
                        MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest2 = (MicUpFromMicApplyInviteRequest) MicUpFromMicApplyInviteRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (micUpFromMicApplyInviteRequest2 != null) {
                            mergeFrom(micUpFromMicApplyInviteRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest3 = (MicUpFromMicApplyInviteRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            micUpFromMicApplyInviteRequest = micUpFromMicApplyInviteRequest3;
                            if (micUpFromMicApplyInviteRequest != null) {
                                mergeFrom(micUpFromMicApplyInviteRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (micUpFromMicApplyInviteRequest != null) {
                        mergeFrom(micUpFromMicApplyInviteRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ MicUpFromMicApplyInviteRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MicUpFromMicApplyInviteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MicUpFromMicApplyInviteRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicUpFromMicApplyInviteRequest)) {
                return super.equals(obj);
            }
            MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest = (MicUpFromMicApplyInviteRequest) obj;
            return getRoomId() == micUpFromMicApplyInviteRequest.getRoomId() && getUserId() == micUpFromMicApplyInviteRequest.getUserId() && getInviter() == micUpFromMicApplyInviteRequest.getInviter() && getYesOrNo() == micUpFromMicApplyInviteRequest.getYesOrNo() && getFromApplyMicList() == micUpFromMicApplyInviteRequest.getFromApplyMicList() && this.unknownFields.equals(micUpFromMicApplyInviteRequest.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
        public boolean getFromApplyMicList() {
            return this.fromApplyMicList_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
        public long getInviter() {
            return this.inviter_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MicUpFromMicApplyInviteRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.userId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            long j3 = this.inviter_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(3, j3);
            }
            int i2 = this.yesOrNo_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(4, i2);
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                iComputeInt64Size += CodedOutputStream.computeBoolSize(5, z);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.app.base.protobuf.room.RoomMike.MicUpFromMicApplyInviteRequestOrBuilder
        public int getYesOrNo() {
            return this.yesOrNo_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((Internal.hashBoolean(getFromApplyMicList()) + ((((getYesOrNo() + ((((Internal.hashLong(getInviter()) + ((((Internal.hashLong(getUserId()) + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomMike.internal_static_roomuser_MicUpFromMicApplyInviteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MicUpFromMicApplyInviteRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MicUpFromMicApplyInviteRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.userId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            long j3 = this.inviter_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(3, j3);
            }
            int i = this.yesOrNo_;
            if (i != 0) {
                codedOutputStream.writeInt32(4, i);
            }
            boolean z = this.fromApplyMicList_;
            if (z) {
                codedOutputStream.writeBool(5, z);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ MicUpFromMicApplyInviteRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(MicUpFromMicApplyInviteRequest micUpFromMicApplyInviteRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(micUpFromMicApplyInviteRequest);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private MicUpFromMicApplyInviteRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicUpFromMicApplyInviteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MicUpFromMicApplyInviteRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MicUpFromMicApplyInviteRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private MicUpFromMicApplyInviteRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.roomId_ = codedInputStream.readInt64();
                                } else if (tag == 16) {
                                    this.userId_ = codedInputStream.readInt64();
                                } else if (tag == 24) {
                                    this.inviter_ = codedInputStream.readInt64();
                                } else if (tag == 32) {
                                    this.yesOrNo_ = codedInputStream.readInt32();
                                } else if (tag != 40) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.fromApplyMicList_ = codedInputStream.readBool();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
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

        public static MicUpFromMicApplyInviteRequest parseFrom(InputStream inputStream) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MicUpFromMicApplyInviteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MicUpFromMicApplyInviteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MicUpFromMicApplyInviteRequestOrBuilder extends MessageOrBuilder {
        boolean getFromApplyMicList();

        long getInviter();

        long getRoomId();

        long getUserId();

        int getYesOrNo();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_roomuser_MicApplyRequest_descriptor = descriptor2;
        internal_static_roomuser_MicApplyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RoomId", "UserId", "Op"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_roomuser_MicApplyReply_descriptor = descriptor3;
        internal_static_roomuser_MicApplyReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Code", "Users", "ApplyListEmpty", "Op", "RoomId", "UserId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_roomuser_MicApplyListRequest_descriptor = descriptor4;
        internal_static_roomuser_MicApplyListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"RoomId", "UserId"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_roomuser_MicApplyListReply_descriptor = descriptor5;
        internal_static_roomuser_MicApplyListReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Code", "Users", "ListEmpty"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_roomuser_MicApplyListInOutNotify_descriptor = descriptor6;
        internal_static_roomuser_MicApplyListInOutNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"RoomId", "User", "InOrOut"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_roomuser_MicInviteFromApplyRequest_descriptor = descriptor7;
        internal_static_roomuser_MicInviteFromApplyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Target", "RoomId", "UserId", "FromApplyMicList"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_roomuser_MicInviteFromApplyReply_descriptor = descriptor8;
        internal_static_roomuser_MicInviteFromApplyReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Code", "RoomId", "TargetRole", "Inviter", "FromApplyMicList"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_roomuser_MicUpFromMicApplyInviteRequest_descriptor = descriptor9;
        internal_static_roomuser_MicUpFromMicApplyInviteRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"RoomId", "UserId", "Inviter", "YesOrNo", "FromApplyMicList"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_roomuser_MicUpFromMicApplyInviteReply_descriptor = descriptor10;
        internal_static_roomuser_MicUpFromMicApplyInviteReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Code", "MicOrder", "Url", "UserId"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_roomuser_MicApplySwitchOpenRequest_descriptor = descriptor11;
        internal_static_roomuser_MicApplySwitchOpenRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"RoomId", "UserId", "Op"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_roomuser_MicApplySwitchOpenReply_descriptor = descriptor12;
        internal_static_roomuser_MicApplySwitchOpenReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Code", "RoomId", "Status", "Who"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_roomuser_AllowAdminOpenMicApplyRequest_descriptor = descriptor13;
        internal_static_roomuser_AllowAdminOpenMicApplyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"RoomId", "UserId", "Op"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_roomuser_AllowAdminOpenMicApplyReply_descriptor = descriptor14;
        internal_static_roomuser_AllowAdminOpenMicApplyReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Code", "RoomId", "Status"});
        Room.getDescriptor();
    }

    private RoomMike() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
