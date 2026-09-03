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
import p102o000oo0.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class RoomTreasureBox {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001croom/room_treasure_box.proto\u0012\broomuser\"\u007f\n\u0011TreasureBoxNotify\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u0015\n\rroomboxIsOpen\u0018\u0002 \u0001(\u0005\u0012\u0015\n\rroomboxTimeId\u0018\u0003 \u0001(\u0005\u0012\u0016\n\u000eroomboxPercent\u0018\u0004 \u0001(\u0005\u0012\u0014\n\froomboxLevel\u0018\u0005 \u0001(\u0005\"M\n\u0018TreasureBoxDrawUserModel\u0012\u000e\n\u0006userId\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bnickName\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007headUrl\u0018\u0003 \u0001(\t\"\u009b\u0001\n\u001dTreasureBoxDrawAwardUserModel\u0012\u000e\n\u0006userId\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bnickName\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007headUrl\u0018\u0003 \u0001(\t\u0012\u0012\n\nawardImage\u0018\u0004 \u0001(\t\u0012\u0011\n\tawardType\u0018\u0005 \u0001(\u0005\u0012\f\n\u0004Nums\u0018\u0006 \u0001(\u0005\u0012\u0012\n\nDynamicUrl\u0018\u0007 \u0001(\t\"¹\u0001\n\u0015TreasureBoxDrawNotify\u0012\u0015\n\rroomboxTimeId\u0018\u0001 \u0001(\u0005\u0012\u0014\n\froomboxLevel\u0018\u0002 \u0001(\u0005\u00126\n\nroomboxTop\u0018\u0003 \u0001(\u000b2\".roomuser.TreasureBoxDrawUserModel\u0012;\n\nawardUsers\u0018\u0004 \u0003(\u000b2'.roomuser.TreasureBoxDrawAwardUserModelB-\n\u001acom.app.base.protobuf.roomB\u000fRoomTreasureBoxb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_roomuser_TreasureBoxDrawAwardUserModel_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_TreasureBoxDrawAwardUserModel_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_TreasureBoxDrawNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_TreasureBoxDrawNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_TreasureBoxDrawUserModel_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_TreasureBoxDrawUserModel_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_roomuser_TreasureBoxNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_roomuser_TreasureBoxNotify_fieldAccessorTable;

    public static final class TreasureBoxDrawAwardUserModel extends GeneratedMessageV3 implements TreasureBoxDrawAwardUserModelOrBuilder {
        public static final int AWARDIMAGE_FIELD_NUMBER = 4;
        public static final int AWARDTYPE_FIELD_NUMBER = 5;
        public static final int DYNAMICURL_FIELD_NUMBER = 7;
        public static final int HEADURL_FIELD_NUMBER = 3;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        public static final int NUMS_FIELD_NUMBER = 6;
        public static final int USERID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object awardImage_;
        private int awardType_;
        private volatile Object dynamicUrl_;
        private volatile Object headUrl_;
        private byte memoizedIsInitialized;
        private volatile Object nickName_;
        private int nums_;
        private long userId_;
        private static final TreasureBoxDrawAwardUserModel DEFAULT_INSTANCE = new TreasureBoxDrawAwardUserModel();
        private static final Parser<TreasureBoxDrawAwardUserModel> PARSER = new AbstractParser<TreasureBoxDrawAwardUserModel>() { // from class: com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModel.1
            @Override // com.google.protobuf.Parser
            public TreasureBoxDrawAwardUserModel parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TreasureBoxDrawAwardUserModel(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureBoxDrawAwardUserModelOrBuilder {
            private Object awardImage_;
            private int awardType_;
            private Object dynamicUrl_;
            private Object headUrl_;
            private Object nickName_;
            private int nums_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawAwardUserModel_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAwardImage() {
                this.awardImage_ = TreasureBoxDrawAwardUserModel.getDefaultInstance().getAwardImage();
                onChanged();
                return this;
            }

            public Builder clearAwardType() {
                this.awardType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDynamicUrl() {
                this.dynamicUrl_ = TreasureBoxDrawAwardUserModel.getDefaultInstance().getDynamicUrl();
                onChanged();
                return this;
            }

            public Builder clearHeadUrl() {
                this.headUrl_ = TreasureBoxDrawAwardUserModel.getDefaultInstance().getHeadUrl();
                onChanged();
                return this;
            }

            public Builder clearNickName() {
                this.nickName_ = TreasureBoxDrawAwardUserModel.getDefaultInstance().getNickName();
                onChanged();
                return this;
            }

            public Builder clearNums() {
                this.nums_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public String getAwardImage() {
                Object obj = this.awardImage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.awardImage_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public ByteString getAwardImageBytes() {
                Object obj = this.awardImage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.awardImage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public int getAwardType() {
                return this.awardType_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawAwardUserModel_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public String getDynamicUrl() {
                Object obj = this.dynamicUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.dynamicUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public ByteString getDynamicUrlBytes() {
                Object obj = this.dynamicUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.dynamicUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public String getHeadUrl() {
                Object obj = this.headUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public ByteString getHeadUrlBytes() {
                Object obj = this.headUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public String getNickName() {
                Object obj = this.nickName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public ByteString getNickNameBytes() {
                Object obj = this.nickName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public int getNums() {
                return this.nums_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawAwardUserModel_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawAwardUserModel.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAwardImage(String str) {
                str.getClass();
                this.awardImage_ = str;
                onChanged();
                return this;
            }

            public Builder setAwardImageBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.awardImage_ = byteString;
                onChanged();
                return this;
            }

            public Builder setAwardType(int i) {
                this.awardType_ = i;
                onChanged();
                return this;
            }

            public Builder setDynamicUrl(String str) {
                str.getClass();
                this.dynamicUrl_ = str;
                onChanged();
                return this;
            }

            public Builder setDynamicUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.dynamicUrl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHeadUrl(String str) {
                str.getClass();
                this.headUrl_ = str;
                onChanged();
                return this;
            }

            public Builder setHeadUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.headUrl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setNickName(String str) {
                str.getClass();
                this.nickName_ = str;
                onChanged();
                return this;
            }

            public Builder setNickNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.nickName_ = byteString;
                onChanged();
                return this;
            }

            public Builder setNums(int i) {
                this.nums_ = i;
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
                this.nickName_ = "";
                this.headUrl_ = "";
                this.awardImage_ = "";
                this.dynamicUrl_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawAwardUserModel build() {
                TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModelBuildPartial = buildPartial();
                if (treasureBoxDrawAwardUserModelBuildPartial.isInitialized()) {
                    return treasureBoxDrawAwardUserModelBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) treasureBoxDrawAwardUserModelBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawAwardUserModel buildPartial() {
                TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = new TreasureBoxDrawAwardUserModel(this, 0);
                treasureBoxDrawAwardUserModel.userId_ = this.userId_;
                treasureBoxDrawAwardUserModel.nickName_ = this.nickName_;
                treasureBoxDrawAwardUserModel.headUrl_ = this.headUrl_;
                treasureBoxDrawAwardUserModel.awardImage_ = this.awardImage_;
                treasureBoxDrawAwardUserModel.awardType_ = this.awardType_;
                treasureBoxDrawAwardUserModel.nums_ = this.nums_;
                treasureBoxDrawAwardUserModel.dynamicUrl_ = this.dynamicUrl_;
                onBuilt();
                return treasureBoxDrawAwardUserModel;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TreasureBoxDrawAwardUserModel getDefaultInstanceForType() {
                return TreasureBoxDrawAwardUserModel.getDefaultInstance();
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
                this.userId_ = 0L;
                this.nickName_ = "";
                this.headUrl_ = "";
                this.awardImage_ = "";
                this.awardType_ = 0;
                this.nums_ = 0;
                this.dynamicUrl_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TreasureBoxDrawAwardUserModel) {
                    return mergeFrom((TreasureBoxDrawAwardUserModel) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.nickName_ = "";
                this.headUrl_ = "";
                this.awardImage_ = "";
                this.dynamicUrl_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel) {
                if (treasureBoxDrawAwardUserModel == TreasureBoxDrawAwardUserModel.getDefaultInstance()) {
                    return this;
                }
                if (treasureBoxDrawAwardUserModel.getUserId() != 0) {
                    setUserId(treasureBoxDrawAwardUserModel.getUserId());
                }
                if (!treasureBoxDrawAwardUserModel.getNickName().isEmpty()) {
                    this.nickName_ = treasureBoxDrawAwardUserModel.nickName_;
                    onChanged();
                }
                if (!treasureBoxDrawAwardUserModel.getHeadUrl().isEmpty()) {
                    this.headUrl_ = treasureBoxDrawAwardUserModel.headUrl_;
                    onChanged();
                }
                if (!treasureBoxDrawAwardUserModel.getAwardImage().isEmpty()) {
                    this.awardImage_ = treasureBoxDrawAwardUserModel.awardImage_;
                    onChanged();
                }
                if (treasureBoxDrawAwardUserModel.getAwardType() != 0) {
                    setAwardType(treasureBoxDrawAwardUserModel.getAwardType());
                }
                if (treasureBoxDrawAwardUserModel.getNums() != 0) {
                    setNums(treasureBoxDrawAwardUserModel.getNums());
                }
                if (!treasureBoxDrawAwardUserModel.getDynamicUrl().isEmpty()) {
                    this.dynamicUrl_ = treasureBoxDrawAwardUserModel.dynamicUrl_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) treasureBoxDrawAwardUserModel).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = null;
                try {
                    try {
                        TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel2 = (TreasureBoxDrawAwardUserModel) TreasureBoxDrawAwardUserModel.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (treasureBoxDrawAwardUserModel2 != null) {
                            mergeFrom(treasureBoxDrawAwardUserModel2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel3 = (TreasureBoxDrawAwardUserModel) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            treasureBoxDrawAwardUserModel = treasureBoxDrawAwardUserModel3;
                            if (treasureBoxDrawAwardUserModel != null) {
                                mergeFrom(treasureBoxDrawAwardUserModel);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (treasureBoxDrawAwardUserModel != null) {
                        mergeFrom(treasureBoxDrawAwardUserModel);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ TreasureBoxDrawAwardUserModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawAwardUserModel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawAwardUserModel_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TreasureBoxDrawAwardUserModel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TreasureBoxDrawAwardUserModel> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TreasureBoxDrawAwardUserModel)) {
                return super.equals(obj);
            }
            TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = (TreasureBoxDrawAwardUserModel) obj;
            return getUserId() == treasureBoxDrawAwardUserModel.getUserId() && getNickName().equals(treasureBoxDrawAwardUserModel.getNickName()) && getHeadUrl().equals(treasureBoxDrawAwardUserModel.getHeadUrl()) && getAwardImage().equals(treasureBoxDrawAwardUserModel.getAwardImage()) && getAwardType() == treasureBoxDrawAwardUserModel.getAwardType() && getNums() == treasureBoxDrawAwardUserModel.getNums() && getDynamicUrl().equals(treasureBoxDrawAwardUserModel.getDynamicUrl()) && this.unknownFields.equals(treasureBoxDrawAwardUserModel.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public String getAwardImage() {
            Object obj = this.awardImage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.awardImage_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public ByteString getAwardImageBytes() {
            Object obj = this.awardImage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.awardImage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public int getAwardType() {
            return this.awardType_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public String getDynamicUrl() {
            Object obj = this.dynamicUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dynamicUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public ByteString getDynamicUrlBytes() {
            Object obj = this.dynamicUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dynamicUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public String getHeadUrl() {
            Object obj = this.headUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public ByteString getHeadUrlBytes() {
            Object obj = this.headUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public String getNickName() {
            Object obj = this.nickName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public ByteString getNickNameBytes() {
            Object obj = this.nickName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public int getNums() {
            return this.nums_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TreasureBoxDrawAwardUserModel> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.userId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(2, this.nickName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.headUrl_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(3, this.headUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.awardImage_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(4, this.awardImage_);
            }
            int i2 = this.awardType_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i2);
            }
            int i3 = this.nums_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(6, i3);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dynamicUrl_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(7, this.dynamicUrl_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawAwardUserModelOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getDynamicUrl().hashCode() + ((((getNums() + ((((getAwardType() + ((((getAwardImage().hashCode() + ((((getHeadUrl().hashCode() + ((((getNickName().hashCode() + ((((Internal.hashLong(getUserId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawAwardUserModel_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawAwardUserModel.class, Builder.class);
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
            return new TreasureBoxDrawAwardUserModel();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.headUrl_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.headUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.awardImage_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.awardImage_);
            }
            int i = this.awardType_;
            if (i != 0) {
                codedOutputStream.writeInt32(5, i);
            }
            int i2 = this.nums_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(6, i2);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.dynamicUrl_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.dynamicUrl_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ TreasureBoxDrawAwardUserModel(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(treasureBoxDrawAwardUserModel);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private TreasureBoxDrawAwardUserModel(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TreasureBoxDrawAwardUserModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TreasureBoxDrawAwardUserModel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TreasureBoxDrawAwardUserModel() {
            this.memoizedIsInitialized = (byte) -1;
            this.nickName_ = "";
            this.headUrl_ = "";
            this.awardImage_ = "";
            this.dynamicUrl_ = "";
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private TreasureBoxDrawAwardUserModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag == 18) {
                                this.nickName_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 26) {
                                this.headUrl_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 34) {
                                this.awardImage_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 40) {
                                this.awardType_ = codedInputStream.readInt32();
                            } else if (tag == 48) {
                                this.nums_ = codedInputStream.readInt32();
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.dynamicUrl_ = codedInputStream.readStringRequireUtf8();
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

        public static TreasureBoxDrawAwardUserModel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TreasureBoxDrawAwardUserModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawAwardUserModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TreasureBoxDrawAwardUserModelOrBuilder extends MessageOrBuilder {
        String getAwardImage();

        ByteString getAwardImageBytes();

        int getAwardType();

        String getDynamicUrl();

        ByteString getDynamicUrlBytes();

        String getHeadUrl();

        ByteString getHeadUrlBytes();

        String getNickName();

        ByteString getNickNameBytes();

        int getNums();

        long getUserId();
    }

    public static final class TreasureBoxDrawNotify extends GeneratedMessageV3 implements TreasureBoxDrawNotifyOrBuilder {
        public static final int AWARDUSERS_FIELD_NUMBER = 4;
        private static final TreasureBoxDrawNotify DEFAULT_INSTANCE = new TreasureBoxDrawNotify();
        private static final Parser<TreasureBoxDrawNotify> PARSER = new AbstractParser<TreasureBoxDrawNotify>() { // from class: com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotify.1
            @Override // com.google.protobuf.Parser
            public TreasureBoxDrawNotify parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TreasureBoxDrawNotify(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int ROOMBOXLEVEL_FIELD_NUMBER = 2;
        public static final int ROOMBOXTIMEID_FIELD_NUMBER = 1;
        public static final int ROOMBOXTOP_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private List<TreasureBoxDrawAwardUserModel> awardUsers_;
        private byte memoizedIsInitialized;
        private int roomboxLevel_;
        private int roomboxTimeId_;
        private TreasureBoxDrawUserModel roomboxTop_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureBoxDrawNotifyOrBuilder {
            private RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> awardUsersBuilder_;
            private List<TreasureBoxDrawAwardUserModel> awardUsers_;
            private int bitField0_;
            private int roomboxLevel_;
            private int roomboxTimeId_;
            private SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> roomboxTopBuilder_;
            private TreasureBoxDrawUserModel roomboxTop_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            private void ensureAwardUsersIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.awardUsers_ = new ArrayList(this.awardUsers_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> getAwardUsersFieldBuilder() {
                if (this.awardUsersBuilder_ == null) {
                    this.awardUsersBuilder_ = new RepeatedFieldBuilderV3<>(this.awardUsers_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.awardUsers_ = null;
                }
                return this.awardUsersBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawNotify_descriptor;
            }

            private SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> getRoomboxTopFieldBuilder() {
                if (this.roomboxTopBuilder_ == null) {
                    this.roomboxTopBuilder_ = new SingleFieldBuilderV3<>(getRoomboxTop(), getParentForChildren(), isClean());
                    this.roomboxTop_ = null;
                }
                return this.roomboxTopBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAwardUsersFieldBuilder();
                }
            }

            public Builder addAllAwardUsers(Iterable<? extends TreasureBoxDrawAwardUserModel> iterable) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAwardUsersIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.awardUsers_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAwardUsers(TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    treasureBoxDrawAwardUserModel.getClass();
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.add(treasureBoxDrawAwardUserModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(treasureBoxDrawAwardUserModel);
                }
                return this;
            }

            public TreasureBoxDrawAwardUserModel.Builder addAwardUsersBuilder() {
                return (TreasureBoxDrawAwardUserModel.Builder) getAwardUsersFieldBuilder().addBuilder(TreasureBoxDrawAwardUserModel.getDefaultInstance());
            }

            public Builder clearAwardUsers() {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.awardUsers_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearRoomboxLevel() {
                this.roomboxLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomboxTimeId() {
                this.roomboxTimeId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomboxTop() {
                if (this.roomboxTopBuilder_ == null) {
                    this.roomboxTop_ = null;
                    onChanged();
                } else {
                    this.roomboxTop_ = null;
                    this.roomboxTopBuilder_ = null;
                }
                return this;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public TreasureBoxDrawAwardUserModel getAwardUsers(int i) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.awardUsers_.get(i) : (TreasureBoxDrawAwardUserModel) repeatedFieldBuilderV3.getMessage(i);
            }

            public TreasureBoxDrawAwardUserModel.Builder getAwardUsersBuilder(int i) {
                return (TreasureBoxDrawAwardUserModel.Builder) getAwardUsersFieldBuilder().getBuilder(i);
            }

            public List<TreasureBoxDrawAwardUserModel.Builder> getAwardUsersBuilderList() {
                return getAwardUsersFieldBuilder().getBuilderList();
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public int getAwardUsersCount() {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.awardUsers_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public List<TreasureBoxDrawAwardUserModel> getAwardUsersList() {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.awardUsers_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public TreasureBoxDrawAwardUserModelOrBuilder getAwardUsersOrBuilder(int i) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.awardUsers_.get(i) : (TreasureBoxDrawAwardUserModelOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public List<? extends TreasureBoxDrawAwardUserModelOrBuilder> getAwardUsersOrBuilderList() {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.awardUsers_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawNotify_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public int getRoomboxLevel() {
                return this.roomboxLevel_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public int getRoomboxTimeId() {
                return this.roomboxTimeId_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public TreasureBoxDrawUserModel getRoomboxTop() {
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TreasureBoxDrawUserModel) singleFieldBuilderV3.getMessage();
                }
                TreasureBoxDrawUserModel treasureBoxDrawUserModel = this.roomboxTop_;
                return treasureBoxDrawUserModel == null ? TreasureBoxDrawUserModel.getDefaultInstance() : treasureBoxDrawUserModel;
            }

            public TreasureBoxDrawUserModel.Builder getRoomboxTopBuilder() {
                onChanged();
                return (TreasureBoxDrawUserModel.Builder) getRoomboxTopFieldBuilder().getBuilder();
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public TreasureBoxDrawUserModelOrBuilder getRoomboxTopOrBuilder() {
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TreasureBoxDrawUserModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TreasureBoxDrawUserModel treasureBoxDrawUserModel = this.roomboxTop_;
                return treasureBoxDrawUserModel == null ? TreasureBoxDrawUserModel.getDefaultInstance() : treasureBoxDrawUserModel;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
            public boolean hasRoomboxTop() {
                return (this.roomboxTopBuilder_ == null && this.roomboxTop_ == null) ? false : true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawNotify.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeRoomboxTop(TreasureBoxDrawUserModel treasureBoxDrawUserModel) {
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 == null) {
                    TreasureBoxDrawUserModel treasureBoxDrawUserModel2 = this.roomboxTop_;
                    if (treasureBoxDrawUserModel2 != null) {
                        this.roomboxTop_ = TreasureBoxDrawUserModel.newBuilder(treasureBoxDrawUserModel2).mergeFrom(treasureBoxDrawUserModel).buildPartial();
                    } else {
                        this.roomboxTop_ = treasureBoxDrawUserModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(treasureBoxDrawUserModel);
                }
                return this;
            }

            public Builder removeAwardUsers(int i) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setAwardUsers(int i, TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    treasureBoxDrawAwardUserModel.getClass();
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.set(i, treasureBoxDrawAwardUserModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, treasureBoxDrawAwardUserModel);
                }
                return this;
            }

            public Builder setRoomboxLevel(int i) {
                this.roomboxLevel_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomboxTimeId(int i) {
                this.roomboxTimeId_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomboxTop(TreasureBoxDrawUserModel treasureBoxDrawUserModel) {
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 == null) {
                    treasureBoxDrawUserModel.getClass();
                    this.roomboxTop_ = treasureBoxDrawUserModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(treasureBoxDrawUserModel);
                }
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                this.awardUsers_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawNotify build() {
                TreasureBoxDrawNotify treasureBoxDrawNotifyBuildPartial = buildPartial();
                if (treasureBoxDrawNotifyBuildPartial.isInitialized()) {
                    return treasureBoxDrawNotifyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) treasureBoxDrawNotifyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawNotify buildPartial() {
                TreasureBoxDrawNotify treasureBoxDrawNotify = new TreasureBoxDrawNotify(this, 0);
                treasureBoxDrawNotify.roomboxTimeId_ = this.roomboxTimeId_;
                treasureBoxDrawNotify.roomboxLevel_ = this.roomboxLevel_;
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 == null) {
                    treasureBoxDrawNotify.roomboxTop_ = this.roomboxTop_;
                } else {
                    treasureBoxDrawNotify.roomboxTop_ = (TreasureBoxDrawUserModel) singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    treasureBoxDrawNotify.awardUsers_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.awardUsers_ = Collections.unmodifiableList(this.awardUsers_);
                        this.bitField0_ &= -2;
                    }
                    treasureBoxDrawNotify.awardUsers_ = this.awardUsers_;
                }
                onBuilt();
                return treasureBoxDrawNotify;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TreasureBoxDrawNotify getDefaultInstanceForType() {
                return TreasureBoxDrawNotify.getDefaultInstance();
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

            public TreasureBoxDrawAwardUserModel.Builder addAwardUsersBuilder(int i) {
                return (TreasureBoxDrawAwardUserModel.Builder) getAwardUsersFieldBuilder().addBuilder(i, TreasureBoxDrawAwardUserModel.getDefaultInstance());
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
                this.roomboxTimeId_ = 0;
                this.roomboxLevel_ = 0;
                if (this.roomboxTopBuilder_ == null) {
                    this.roomboxTop_ = null;
                } else {
                    this.roomboxTop_ = null;
                    this.roomboxTopBuilder_ = null;
                }
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.awardUsers_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.awardUsers_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setRoomboxTop(TreasureBoxDrawUserModel.Builder builder) {
                SingleFieldBuilderV3<TreasureBoxDrawUserModel, TreasureBoxDrawUserModel.Builder, TreasureBoxDrawUserModelOrBuilder> singleFieldBuilderV3 = this.roomboxTopBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.roomboxTop_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder addAwardUsers(int i, TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    treasureBoxDrawAwardUserModel.getClass();
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.add(i, treasureBoxDrawAwardUserModel);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, treasureBoxDrawAwardUserModel);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TreasureBoxDrawNotify) {
                    return mergeFrom((TreasureBoxDrawNotify) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAwardUsers(int i, TreasureBoxDrawAwardUserModel.Builder builder) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(TreasureBoxDrawNotify treasureBoxDrawNotify) {
                if (treasureBoxDrawNotify == TreasureBoxDrawNotify.getDefaultInstance()) {
                    return this;
                }
                if (treasureBoxDrawNotify.getRoomboxTimeId() != 0) {
                    setRoomboxTimeId(treasureBoxDrawNotify.getRoomboxTimeId());
                }
                if (treasureBoxDrawNotify.getRoomboxLevel() != 0) {
                    setRoomboxLevel(treasureBoxDrawNotify.getRoomboxLevel());
                }
                if (treasureBoxDrawNotify.hasRoomboxTop()) {
                    mergeRoomboxTop(treasureBoxDrawNotify.getRoomboxTop());
                }
                if (this.awardUsersBuilder_ == null) {
                    if (!treasureBoxDrawNotify.awardUsers_.isEmpty()) {
                        if (this.awardUsers_.isEmpty()) {
                            this.awardUsers_ = treasureBoxDrawNotify.awardUsers_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAwardUsersIsMutable();
                            this.awardUsers_.addAll(treasureBoxDrawNotify.awardUsers_);
                        }
                        onChanged();
                    }
                } else if (!treasureBoxDrawNotify.awardUsers_.isEmpty()) {
                    if (!this.awardUsersBuilder_.isEmpty()) {
                        this.awardUsersBuilder_.addAllMessages(treasureBoxDrawNotify.awardUsers_);
                    } else {
                        this.awardUsersBuilder_.dispose();
                        this.awardUsersBuilder_ = null;
                        this.awardUsers_ = treasureBoxDrawNotify.awardUsers_;
                        this.bitField0_ &= -2;
                        this.awardUsersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAwardUsersFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((GeneratedMessageV3) treasureBoxDrawNotify).unknownFields);
                onChanged();
                return this;
            }

            public Builder addAwardUsers(TreasureBoxDrawAwardUserModel.Builder builder) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAwardUsers(int i, TreasureBoxDrawAwardUserModel.Builder builder) {
                RepeatedFieldBuilderV3<TreasureBoxDrawAwardUserModel, TreasureBoxDrawAwardUserModel.Builder, TreasureBoxDrawAwardUserModelOrBuilder> repeatedFieldBuilderV3 = this.awardUsersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAwardUsersIsMutable();
                    this.awardUsers_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TreasureBoxDrawNotify treasureBoxDrawNotify = null;
                try {
                    try {
                        TreasureBoxDrawNotify treasureBoxDrawNotify2 = (TreasureBoxDrawNotify) TreasureBoxDrawNotify.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (treasureBoxDrawNotify2 != null) {
                            mergeFrom(treasureBoxDrawNotify2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TreasureBoxDrawNotify treasureBoxDrawNotify3 = (TreasureBoxDrawNotify) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            treasureBoxDrawNotify = treasureBoxDrawNotify3;
                            if (treasureBoxDrawNotify != null) {
                                mergeFrom(treasureBoxDrawNotify);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (treasureBoxDrawNotify != null) {
                        mergeFrom(treasureBoxDrawNotify);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ TreasureBoxDrawNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawNotify getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawNotify_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TreasureBoxDrawNotify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxDrawNotify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TreasureBoxDrawNotify> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TreasureBoxDrawNotify)) {
                return super.equals(obj);
            }
            TreasureBoxDrawNotify treasureBoxDrawNotify = (TreasureBoxDrawNotify) obj;
            if (getRoomboxTimeId() == treasureBoxDrawNotify.getRoomboxTimeId() && getRoomboxLevel() == treasureBoxDrawNotify.getRoomboxLevel() && hasRoomboxTop() == treasureBoxDrawNotify.hasRoomboxTop()) {
                return (!hasRoomboxTop() || getRoomboxTop().equals(treasureBoxDrawNotify.getRoomboxTop())) && getAwardUsersList().equals(treasureBoxDrawNotify.getAwardUsersList()) && this.unknownFields.equals(treasureBoxDrawNotify.unknownFields);
            }
            return false;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public TreasureBoxDrawAwardUserModel getAwardUsers(int i) {
            return this.awardUsers_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public int getAwardUsersCount() {
            return this.awardUsers_.size();
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public List<TreasureBoxDrawAwardUserModel> getAwardUsersList() {
            return this.awardUsers_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public TreasureBoxDrawAwardUserModelOrBuilder getAwardUsersOrBuilder(int i) {
            return this.awardUsers_.get(i);
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public List<? extends TreasureBoxDrawAwardUserModelOrBuilder> getAwardUsersOrBuilderList() {
            return this.awardUsers_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TreasureBoxDrawNotify> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public int getRoomboxLevel() {
            return this.roomboxLevel_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public int getRoomboxTimeId() {
            return this.roomboxTimeId_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public TreasureBoxDrawUserModel getRoomboxTop() {
            TreasureBoxDrawUserModel treasureBoxDrawUserModel = this.roomboxTop_;
            return treasureBoxDrawUserModel == null ? TreasureBoxDrawUserModel.getDefaultInstance() : treasureBoxDrawUserModel;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public TreasureBoxDrawUserModelOrBuilder getRoomboxTopOrBuilder() {
            return getRoomboxTop();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.roomboxTimeId_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
            int i3 = this.roomboxLevel_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            if (this.roomboxTop_ != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, getRoomboxTop());
            }
            for (int i4 = 0; i4 < this.awardUsers_.size(); i4++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.awardUsers_.get(i4));
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawNotifyOrBuilder
        public boolean hasRoomboxTop() {
            return this.roomboxTop_ != null;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int roomboxLevel = getRoomboxLevel() + ((((getRoomboxTimeId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (hasRoomboxTop()) {
                roomboxLevel = o00Ooo.OooO00o(roomboxLevel, 37, 3, 53) + getRoomboxTop().hashCode();
            }
            if (getAwardUsersCount() > 0) {
                roomboxLevel = o00Ooo.OooO00o(roomboxLevel, 37, 4, 53) + getAwardUsersList().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (roomboxLevel * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawNotify.class, Builder.class);
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
            return new TreasureBoxDrawNotify();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.roomboxTimeId_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.roomboxLevel_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            if (this.roomboxTop_ != null) {
                codedOutputStream.writeMessage(3, getRoomboxTop());
            }
            for (int i3 = 0; i3 < this.awardUsers_.size(); i3++) {
                codedOutputStream.writeMessage(4, this.awardUsers_.get(i3));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ TreasureBoxDrawNotify(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(TreasureBoxDrawNotify treasureBoxDrawNotify) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(treasureBoxDrawNotify);
        }

        public static TreasureBoxDrawNotify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private TreasureBoxDrawNotify(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TreasureBoxDrawNotify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawNotify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TreasureBoxDrawNotify getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static TreasureBoxDrawNotify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TreasureBoxDrawNotify() {
            this.memoizedIsInitialized = (byte) -1;
            this.awardUsers_ = Collections.emptyList();
        }

        public static TreasureBoxDrawNotify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static TreasureBoxDrawNotify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TreasureBoxDrawNotify parseFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TreasureBoxDrawNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.roomboxTimeId_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.roomboxLevel_ = codedInputStream.readInt32();
                            } else if (tag == 26) {
                                TreasureBoxDrawUserModel treasureBoxDrawUserModel = this.roomboxTop_;
                                TreasureBoxDrawUserModel.Builder builder = treasureBoxDrawUserModel != null ? treasureBoxDrawUserModel.toBuilder() : null;
                                TreasureBoxDrawUserModel treasureBoxDrawUserModel2 = (TreasureBoxDrawUserModel) codedInputStream.readMessage(TreasureBoxDrawUserModel.parser(), extensionRegistryLite);
                                this.roomboxTop_ = treasureBoxDrawUserModel2;
                                if (builder != null) {
                                    builder.mergeFrom(treasureBoxDrawUserModel2);
                                    this.roomboxTop_ = builder.buildPartial();
                                }
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.awardUsers_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.awardUsers_.add((TreasureBoxDrawAwardUserModel) codedInputStream.readMessage(TreasureBoxDrawAwardUserModel.parser(), extensionRegistryLite));
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
                        this.awardUsers_ = Collections.unmodifiableList(this.awardUsers_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.awardUsers_ = Collections.unmodifiableList(this.awardUsers_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static TreasureBoxDrawNotify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawNotify parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TreasureBoxDrawNotify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TreasureBoxDrawNotifyOrBuilder extends MessageOrBuilder {
        TreasureBoxDrawAwardUserModel getAwardUsers(int i);

        int getAwardUsersCount();

        List<TreasureBoxDrawAwardUserModel> getAwardUsersList();

        TreasureBoxDrawAwardUserModelOrBuilder getAwardUsersOrBuilder(int i);

        List<? extends TreasureBoxDrawAwardUserModelOrBuilder> getAwardUsersOrBuilderList();

        int getRoomboxLevel();

        int getRoomboxTimeId();

        TreasureBoxDrawUserModel getRoomboxTop();

        TreasureBoxDrawUserModelOrBuilder getRoomboxTopOrBuilder();

        boolean hasRoomboxTop();
    }

    public static final class TreasureBoxDrawUserModel extends GeneratedMessageV3 implements TreasureBoxDrawUserModelOrBuilder {
        public static final int HEADURL_FIELD_NUMBER = 3;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object headUrl_;
        private byte memoizedIsInitialized;
        private volatile Object nickName_;
        private long userId_;
        private static final TreasureBoxDrawUserModel DEFAULT_INSTANCE = new TreasureBoxDrawUserModel();
        private static final Parser<TreasureBoxDrawUserModel> PARSER = new AbstractParser<TreasureBoxDrawUserModel>() { // from class: com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModel.1
            @Override // com.google.protobuf.Parser
            public TreasureBoxDrawUserModel parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TreasureBoxDrawUserModel(codedInputStream, extensionRegistryLite, 0);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureBoxDrawUserModelOrBuilder {
            private Object headUrl_;
            private Object nickName_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawUserModel_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearHeadUrl() {
                this.headUrl_ = TreasureBoxDrawUserModel.getDefaultInstance().getHeadUrl();
                onChanged();
                return this;
            }

            public Builder clearNickName() {
                this.nickName_ = TreasureBoxDrawUserModel.getDefaultInstance().getNickName();
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
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawUserModel_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
            public String getHeadUrl() {
                Object obj = this.headUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
            public ByteString getHeadUrlBytes() {
                Object obj = this.headUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
            public String getNickName() {
                Object obj = this.nickName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nickName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
            public ByteString getNickNameBytes() {
                Object obj = this.nickName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nickName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawUserModel_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawUserModel.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHeadUrl(String str) {
                str.getClass();
                this.headUrl_ = str;
                onChanged();
                return this;
            }

            public Builder setHeadUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.headUrl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setNickName(String str) {
                str.getClass();
                this.nickName_ = str;
                onChanged();
                return this;
            }

            public Builder setNickNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.nickName_ = byteString;
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
                this.nickName_ = "";
                this.headUrl_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawUserModel build() {
                TreasureBoxDrawUserModel treasureBoxDrawUserModelBuildPartial = buildPartial();
                if (treasureBoxDrawUserModelBuildPartial.isInitialized()) {
                    return treasureBoxDrawUserModelBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) treasureBoxDrawUserModelBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxDrawUserModel buildPartial() {
                TreasureBoxDrawUserModel treasureBoxDrawUserModel = new TreasureBoxDrawUserModel(this, 0);
                treasureBoxDrawUserModel.userId_ = this.userId_;
                treasureBoxDrawUserModel.nickName_ = this.nickName_;
                treasureBoxDrawUserModel.headUrl_ = this.headUrl_;
                onBuilt();
                return treasureBoxDrawUserModel;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TreasureBoxDrawUserModel getDefaultInstanceForType() {
                return TreasureBoxDrawUserModel.getDefaultInstance();
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
                this.userId_ = 0L;
                this.nickName_ = "";
                this.headUrl_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.nickName_ = "";
                this.headUrl_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TreasureBoxDrawUserModel) {
                    return mergeFrom((TreasureBoxDrawUserModel) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TreasureBoxDrawUserModel treasureBoxDrawUserModel) {
                if (treasureBoxDrawUserModel == TreasureBoxDrawUserModel.getDefaultInstance()) {
                    return this;
                }
                if (treasureBoxDrawUserModel.getUserId() != 0) {
                    setUserId(treasureBoxDrawUserModel.getUserId());
                }
                if (!treasureBoxDrawUserModel.getNickName().isEmpty()) {
                    this.nickName_ = treasureBoxDrawUserModel.nickName_;
                    onChanged();
                }
                if (!treasureBoxDrawUserModel.getHeadUrl().isEmpty()) {
                    this.headUrl_ = treasureBoxDrawUserModel.headUrl_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) treasureBoxDrawUserModel).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TreasureBoxDrawUserModel treasureBoxDrawUserModel = null;
                try {
                    try {
                        TreasureBoxDrawUserModel treasureBoxDrawUserModel2 = (TreasureBoxDrawUserModel) TreasureBoxDrawUserModel.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (treasureBoxDrawUserModel2 != null) {
                            mergeFrom(treasureBoxDrawUserModel2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TreasureBoxDrawUserModel treasureBoxDrawUserModel3 = (TreasureBoxDrawUserModel) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            treasureBoxDrawUserModel = treasureBoxDrawUserModel3;
                            if (treasureBoxDrawUserModel != null) {
                                mergeFrom(treasureBoxDrawUserModel);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (treasureBoxDrawUserModel != null) {
                        mergeFrom(treasureBoxDrawUserModel);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ TreasureBoxDrawUserModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawUserModel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawUserModel_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TreasureBoxDrawUserModel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxDrawUserModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TreasureBoxDrawUserModel> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TreasureBoxDrawUserModel)) {
                return super.equals(obj);
            }
            TreasureBoxDrawUserModel treasureBoxDrawUserModel = (TreasureBoxDrawUserModel) obj;
            return getUserId() == treasureBoxDrawUserModel.getUserId() && getNickName().equals(treasureBoxDrawUserModel.getNickName()) && getHeadUrl().equals(treasureBoxDrawUserModel.getHeadUrl()) && this.unknownFields.equals(treasureBoxDrawUserModel.unknownFields);
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
        public String getHeadUrl() {
            Object obj = this.headUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
        public ByteString getHeadUrlBytes() {
            Object obj = this.headUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
        public String getNickName() {
            Object obj = this.nickName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.nickName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
        public ByteString getNickNameBytes() {
            Object obj = this.nickName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nickName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TreasureBoxDrawUserModel> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.userId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(2, this.nickName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.headUrl_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(3, this.headUrl_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxDrawUserModelOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getHeadUrl().hashCode() + ((((getNickName().hashCode() + ((((Internal.hashLong(getUserId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxDrawUserModel_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxDrawUserModel.class, Builder.class);
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
            return new TreasureBoxDrawUserModel();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.nickName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.nickName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.headUrl_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.headUrl_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ TreasureBoxDrawUserModel(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(TreasureBoxDrawUserModel treasureBoxDrawUserModel) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(treasureBoxDrawUserModel);
        }

        public static TreasureBoxDrawUserModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private TreasureBoxDrawUserModel(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TreasureBoxDrawUserModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawUserModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TreasureBoxDrawUserModel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static TreasureBoxDrawUserModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TreasureBoxDrawUserModel() {
            this.memoizedIsInitialized = (byte) -1;
            this.nickName_ = "";
            this.headUrl_ = "";
        }

        public static TreasureBoxDrawUserModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static TreasureBoxDrawUserModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TreasureBoxDrawUserModel parseFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private TreasureBoxDrawUserModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.userId_ = codedInputStream.readInt64();
                            } else if (tag == 18) {
                                this.nickName_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.headUrl_ = codedInputStream.readStringRequireUtf8();
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

        public static TreasureBoxDrawUserModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxDrawUserModel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TreasureBoxDrawUserModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxDrawUserModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TreasureBoxDrawUserModelOrBuilder extends MessageOrBuilder {
        String getHeadUrl();

        ByteString getHeadUrlBytes();

        String getNickName();

        ByteString getNickNameBytes();

        long getUserId();
    }

    public static final class TreasureBoxNotify extends GeneratedMessageV3 implements TreasureBoxNotifyOrBuilder {
        private static final TreasureBoxNotify DEFAULT_INSTANCE = new TreasureBoxNotify();
        private static final Parser<TreasureBoxNotify> PARSER = new AbstractParser<TreasureBoxNotify>() { // from class: com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotify.1
            @Override // com.google.protobuf.Parser
            public TreasureBoxNotify parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TreasureBoxNotify(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int ROOMBOXISOPEN_FIELD_NUMBER = 2;
        public static final int ROOMBOXLEVEL_FIELD_NUMBER = 5;
        public static final int ROOMBOXPERCENT_FIELD_NUMBER = 4;
        public static final int ROOMBOXTIMEID_FIELD_NUMBER = 3;
        public static final int ROOMID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long roomId_;
        private int roomboxIsOpen_;
        private int roomboxLevel_;
        private int roomboxPercent_;
        private int roomboxTimeId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureBoxNotifyOrBuilder {
            private long roomId_;
            private int roomboxIsOpen_;
            private int roomboxLevel_;
            private int roomboxPercent_;
            private int roomboxTimeId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxNotify_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearRoomId() {
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRoomboxIsOpen() {
                this.roomboxIsOpen_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomboxLevel() {
                this.roomboxLevel_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomboxPercent() {
                this.roomboxPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRoomboxTimeId() {
                this.roomboxTimeId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxNotify_descriptor;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
            public int getRoomboxIsOpen() {
                return this.roomboxIsOpen_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
            public int getRoomboxLevel() {
                return this.roomboxLevel_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
            public int getRoomboxPercent() {
                return this.roomboxPercent_;
            }

            @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
            public int getRoomboxTimeId() {
                return this.roomboxTimeId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RoomTreasureBox.internal_static_roomuser_TreasureBoxNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxNotify.class, Builder.class);
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

            public Builder setRoomboxIsOpen(int i) {
                this.roomboxIsOpen_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomboxLevel(int i) {
                this.roomboxLevel_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomboxPercent(int i) {
                this.roomboxPercent_ = i;
                onChanged();
                return this;
            }

            public Builder setRoomboxTimeId(int i) {
                this.roomboxTimeId_ = i;
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
            public TreasureBoxNotify build() {
                TreasureBoxNotify treasureBoxNotifyBuildPartial = buildPartial();
                if (treasureBoxNotifyBuildPartial.isInitialized()) {
                    return treasureBoxNotifyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) treasureBoxNotifyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TreasureBoxNotify buildPartial() {
                TreasureBoxNotify treasureBoxNotify = new TreasureBoxNotify(this, 0);
                treasureBoxNotify.roomId_ = this.roomId_;
                treasureBoxNotify.roomboxIsOpen_ = this.roomboxIsOpen_;
                treasureBoxNotify.roomboxTimeId_ = this.roomboxTimeId_;
                treasureBoxNotify.roomboxPercent_ = this.roomboxPercent_;
                treasureBoxNotify.roomboxLevel_ = this.roomboxLevel_;
                onBuilt();
                return treasureBoxNotify;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TreasureBoxNotify getDefaultInstanceForType() {
                return TreasureBoxNotify.getDefaultInstance();
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
                this.roomboxIsOpen_ = 0;
                this.roomboxTimeId_ = 0;
                this.roomboxPercent_ = 0;
                this.roomboxLevel_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TreasureBoxNotify) {
                    return mergeFrom((TreasureBoxNotify) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TreasureBoxNotify treasureBoxNotify) {
                if (treasureBoxNotify == TreasureBoxNotify.getDefaultInstance()) {
                    return this;
                }
                if (treasureBoxNotify.getRoomId() != 0) {
                    setRoomId(treasureBoxNotify.getRoomId());
                }
                if (treasureBoxNotify.getRoomboxIsOpen() != 0) {
                    setRoomboxIsOpen(treasureBoxNotify.getRoomboxIsOpen());
                }
                if (treasureBoxNotify.getRoomboxTimeId() != 0) {
                    setRoomboxTimeId(treasureBoxNotify.getRoomboxTimeId());
                }
                if (treasureBoxNotify.getRoomboxPercent() != 0) {
                    setRoomboxPercent(treasureBoxNotify.getRoomboxPercent());
                }
                if (treasureBoxNotify.getRoomboxLevel() != 0) {
                    setRoomboxLevel(treasureBoxNotify.getRoomboxLevel());
                }
                mergeUnknownFields(((GeneratedMessageV3) treasureBoxNotify).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TreasureBoxNotify treasureBoxNotify = null;
                try {
                    try {
                        TreasureBoxNotify treasureBoxNotify2 = (TreasureBoxNotify) TreasureBoxNotify.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (treasureBoxNotify2 != null) {
                            mergeFrom(treasureBoxNotify2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TreasureBoxNotify treasureBoxNotify3 = (TreasureBoxNotify) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            treasureBoxNotify = treasureBoxNotify3;
                            if (treasureBoxNotify != null) {
                                mergeFrom(treasureBoxNotify);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (treasureBoxNotify != null) {
                        mergeFrom(treasureBoxNotify);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ TreasureBoxNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static TreasureBoxNotify getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxNotify_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TreasureBoxNotify parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxNotify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TreasureBoxNotify> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TreasureBoxNotify)) {
                return super.equals(obj);
            }
            TreasureBoxNotify treasureBoxNotify = (TreasureBoxNotify) obj;
            return getRoomId() == treasureBoxNotify.getRoomId() && getRoomboxIsOpen() == treasureBoxNotify.getRoomboxIsOpen() && getRoomboxTimeId() == treasureBoxNotify.getRoomboxTimeId() && getRoomboxPercent() == treasureBoxNotify.getRoomboxPercent() && getRoomboxLevel() == treasureBoxNotify.getRoomboxLevel() && this.unknownFields.equals(treasureBoxNotify.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TreasureBoxNotify> getParserForType() {
            return PARSER;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
        public int getRoomboxIsOpen() {
            return this.roomboxIsOpen_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
        public int getRoomboxLevel() {
            return this.roomboxLevel_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
        public int getRoomboxPercent() {
            return this.roomboxPercent_;
        }

        @Override // com.app.base.protobuf.room.RoomTreasureBox.TreasureBoxNotifyOrBuilder
        public int getRoomboxTimeId() {
            return this.roomboxTimeId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j) : 0;
            int i2 = this.roomboxIsOpen_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i2);
            }
            int i3 = this.roomboxTimeId_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(3, i3);
            }
            int i4 = this.roomboxPercent_;
            if (i4 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(4, i4);
            }
            int i5 = this.roomboxLevel_;
            if (i5 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i5);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
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
            int iHashCode = this.unknownFields.hashCode() + ((getRoomboxLevel() + ((((getRoomboxPercent() + ((((getRoomboxTimeId() + ((((getRoomboxIsOpen() + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RoomTreasureBox.internal_static_roomuser_TreasureBoxNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureBoxNotify.class, Builder.class);
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
            return new TreasureBoxNotify();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            int i = this.roomboxIsOpen_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i2 = this.roomboxTimeId_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            int i3 = this.roomboxPercent_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(4, i3);
            }
            int i4 = this.roomboxLevel_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(5, i4);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ TreasureBoxNotify(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(TreasureBoxNotify treasureBoxNotify) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(treasureBoxNotify);
        }

        public static TreasureBoxNotify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private TreasureBoxNotify(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TreasureBoxNotify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxNotify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TreasureBoxNotify getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static TreasureBoxNotify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private TreasureBoxNotify() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TreasureBoxNotify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static TreasureBoxNotify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private TreasureBoxNotify(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.roomboxIsOpen_ = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    this.roomboxTimeId_ = codedInputStream.readInt32();
                                } else if (tag == 32) {
                                    this.roomboxPercent_ = codedInputStream.readInt32();
                                } else if (tag != 40) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.roomboxLevel_ = codedInputStream.readInt32();
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

        public static TreasureBoxNotify parseFrom(InputStream inputStream) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TreasureBoxNotify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TreasureBoxNotify parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TreasureBoxNotify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TreasureBoxNotify) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TreasureBoxNotifyOrBuilder extends MessageOrBuilder {
        long getRoomId();

        int getRoomboxIsOpen();

        int getRoomboxLevel();

        int getRoomboxPercent();

        int getRoomboxTimeId();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_roomuser_TreasureBoxNotify_descriptor = descriptor2;
        internal_static_roomuser_TreasureBoxNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"RoomId", "RoomboxIsOpen", "RoomboxTimeId", "RoomboxPercent", "RoomboxLevel"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_roomuser_TreasureBoxDrawUserModel_descriptor = descriptor3;
        internal_static_roomuser_TreasureBoxDrawUserModel_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"UserId", "NickName", "HeadUrl"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_roomuser_TreasureBoxDrawAwardUserModel_descriptor = descriptor4;
        internal_static_roomuser_TreasureBoxDrawAwardUserModel_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"UserId", "NickName", "HeadUrl", "AwardImage", "AwardType", "Nums", "DynamicUrl"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_roomuser_TreasureBoxDrawNotify_descriptor = descriptor5;
        internal_static_roomuser_TreasureBoxDrawNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"RoomboxTimeId", "RoomboxLevel", "RoomboxTop", "AwardUsers"});
    }

    private RoomTreasureBox() {
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
