package com.app.base.protobuf;

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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class HallLogin {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000blogin.proto\u0012\u0005login\u001a\u000bempty.proto\",\n\fLoginRequest\u0012\u000e\n\u0006userId\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004sign\u0018\u0002 \u0001(\t\",\n\nLoginReply\u0012\u000f\n\u0007address\u0018\u0001 \u0001(\t\u0012\r\n\u0005token\u0018\u0002 \u0001(\t2:\n\u0005Login\u00121\n\u0005Login\u0012\u0013.login.LoginRequest\u001a\u0011.login.LoginReply\"\u0000B\"\n\u0015com.app.base.protobufB\tHallLoginb\u0006proto3"}, new Descriptors.FileDescriptor[]{MessageEmpty.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_login_LoginReply_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_LoginReply_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_login_LoginRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_LoginRequest_fieldAccessorTable;

    public static final class LoginReply extends GeneratedMessageV3 implements LoginReplyOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final LoginReply DEFAULT_INSTANCE = new LoginReply();
        private static final Parser<LoginReply> PARSER = new AbstractParser<LoginReply>() { // from class: com.app.base.protobuf.HallLogin.LoginReply.1
            @Override // com.google.protobuf.Parser
            public LoginReply parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new LoginReply(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int TOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object address_;
        private byte memoizedIsInitialized;
        private volatile Object token_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoginReplyOrBuilder {
            private Object address_;
            private Object token_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return HallLogin.internal_static_login_LoginReply_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAddress() {
                this.address_ = LoginReply.getDefaultInstance().getAddress();
                onChanged();
                return this;
            }

            public Builder clearToken() {
                this.token_ = LoginReply.getDefaultInstance().getToken();
                onChanged();
                return this;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public String getAddress() {
                Object obj = this.address_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.address_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public ByteString getAddressBytes() {
                Object obj = this.address_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.address_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return HallLogin.internal_static_login_LoginReply_descriptor;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public String getToken() {
                Object obj = this.token_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HallLogin.internal_static_login_LoginReply_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginReply.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAddress(String str) {
                str.getClass();
                this.address_ = str;
                onChanged();
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.address_ = byteString;
                onChanged();
                return this;
            }

            public Builder setToken(String str) {
                str.getClass();
                this.token_ = str;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.token_ = byteString;
                onChanged();
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private Builder() {
                this.address_ = "";
                this.token_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginReply build() {
                LoginReply loginReplyBuildPartial = buildPartial();
                if (loginReplyBuildPartial.isInitialized()) {
                    return loginReplyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loginReplyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginReply buildPartial() {
                LoginReply loginReply = new LoginReply(this, 0);
                loginReply.address_ = this.address_;
                loginReply.token_ = this.token_;
                onBuilt();
                return loginReply;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LoginReply getDefaultInstanceForType() {
                return LoginReply.getDefaultInstance();
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
                this.address_ = "";
                this.token_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.address_ = "";
                this.token_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoginReply) {
                    return mergeFrom((LoginReply) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoginReply loginReply) {
                if (loginReply == LoginReply.getDefaultInstance()) {
                    return this;
                }
                if (!loginReply.getAddress().isEmpty()) {
                    this.address_ = loginReply.address_;
                    onChanged();
                }
                if (!loginReply.getToken().isEmpty()) {
                    this.token_ = loginReply.token_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) loginReply).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                LoginReply loginReply = null;
                try {
                    try {
                        LoginReply loginReply2 = (LoginReply) LoginReply.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (loginReply2 != null) {
                            mergeFrom(loginReply2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        LoginReply loginReply3 = (LoginReply) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            loginReply = loginReply3;
                            if (loginReply != null) {
                                mergeFrom(loginReply);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (loginReply != null) {
                        mergeFrom(loginReply);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ LoginReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static LoginReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HallLogin.internal_static_login_LoginReply_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoginReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoginReply> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoginReply)) {
                return super.equals(obj);
            }
            LoginReply loginReply = (LoginReply) obj;
            return getAddress().equals(loginReply.getAddress()) && getToken().equals(loginReply.getToken()) && this.unknownFields.equals(loginReply.unknownFields);
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public String getAddress() {
            Object obj = this.address_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.address_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public ByteString getAddressBytes() {
            Object obj = this.address_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.address_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoginReply> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = GeneratedMessageV3.isStringEmpty(this.address_) ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.address_);
            if (!GeneratedMessageV3.isStringEmpty(this.token_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.token_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.token_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iHashCode = this.unknownFields.hashCode() + ((getToken().hashCode() + ((((getAddress().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HallLogin.internal_static_login_LoginReply_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginReply.class, Builder.class);
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
            return new LoginReply();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.address_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.address_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.token_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.token_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ LoginReply(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(LoginReply loginReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginReply);
        }

        public static LoginReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private LoginReply(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoginReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoginReply getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static LoginReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LoginReply() {
            this.memoizedIsInitialized = (byte) -1;
            this.address_ = "";
            this.token_ = "";
        }

        public static LoginReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static LoginReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoginReply parseFrom(InputStream inputStream) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private LoginReply(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.address_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.token_ = codedInputStream.readStringRequireUtf8();
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

        public static LoginReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginReply parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoginReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginReply) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LoginReplyOrBuilder extends MessageOrBuilder {
        String getAddress();

        ByteString getAddressBytes();

        String getToken();

        ByteString getTokenBytes();
    }

    public static final class LoginRequest extends GeneratedMessageV3 implements LoginRequestOrBuilder {
        private static final LoginRequest DEFAULT_INSTANCE = new LoginRequest();
        private static final Parser<LoginRequest> PARSER = new AbstractParser<LoginRequest>() { // from class: com.app.base.protobuf.HallLogin.LoginRequest.1
            @Override // com.google.protobuf.Parser
            public LoginRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new LoginRequest(codedInputStream, extensionRegistryLite, 0);
            }
        };
        public static final int SIGN_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object sign_;
        private long userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoginRequestOrBuilder {
            private Object sign_;
            private long userId_;

            public /* synthetic */ Builder(int i) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return HallLogin.internal_static_login_LoginRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearSign() {
                this.sign_ = LoginRequest.getDefaultInstance().getSign();
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
                return HallLogin.internal_static_login_LoginRequest_descriptor;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public String getSign() {
                Object obj = this.sign_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sign_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public ByteString getSignBytes() {
                Object obj = this.sign_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sign_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HallLogin.internal_static_login_LoginRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setSign(String str) {
                str.getClass();
                this.sign_ = str;
                onChanged();
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sign_ = byteString;
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
                this.sign_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginRequest build() {
                LoginRequest loginRequestBuildPartial = buildPartial();
                if (loginRequestBuildPartial.isInitialized()) {
                    return loginRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loginRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginRequest buildPartial() {
                LoginRequest loginRequest = new LoginRequest(this, 0);
                loginRequest.userId_ = this.userId_;
                loginRequest.sign_ = this.sign_;
                onBuilt();
                return loginRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LoginRequest getDefaultInstanceForType() {
                return LoginRequest.getDefaultInstance();
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
                this.sign_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sign_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4023clone() {
                return (Builder) super.mo4023clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoginRequest) {
                    return mergeFrom((LoginRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoginRequest loginRequest) {
                if (loginRequest == LoginRequest.getDefaultInstance()) {
                    return this;
                }
                if (loginRequest.getUserId() != 0) {
                    setUserId(loginRequest.getUserId());
                }
                if (!loginRequest.getSign().isEmpty()) {
                    this.sign_ = loginRequest.sign_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) loginRequest).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                LoginRequest loginRequest = null;
                try {
                    try {
                        LoginRequest loginRequest2 = (LoginRequest) LoginRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (loginRequest2 != null) {
                            mergeFrom(loginRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        LoginRequest loginRequest3 = (LoginRequest) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            loginRequest = loginRequest3;
                            if (loginRequest != null) {
                                mergeFrom(loginRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (loginRequest != null) {
                        mergeFrom(loginRequest);
                    }
                    throw th;
                }
            }
        }

        public /* synthetic */ LoginRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) {
            this(codedInputStream, extensionRegistryLite);
        }

        public static LoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HallLogin.internal_static_login_LoginRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoginRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoginRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoginRequest)) {
                return super.equals(obj);
            }
            LoginRequest loginRequest = (LoginRequest) obj;
            return getUserId() == loginRequest.getUserId() && getSign().equals(loginRequest.getSign()) && this.unknownFields.equals(loginRequest.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoginRequest> getParserForType() {
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
            if (!GeneratedMessageV3.isStringEmpty(this.sign_)) {
                iComputeInt64Size += GeneratedMessageV3.computeStringSize(2, this.sign_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public String getSign() {
            Object obj = this.sign_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sign_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public ByteString getSignBytes() {
            Object obj = this.sign_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sign_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = this.unknownFields.hashCode() + ((getSign().hashCode() + ((((Internal.hashLong(getUserId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HallLogin.internal_static_login_LoginRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginRequest.class, Builder.class);
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
            return new LoginRequest();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.sign_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.sign_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public /* synthetic */ LoginRequest(GeneratedMessageV3.Builder builder, int i) {
            this(builder);
        }

        public static Builder newBuilder(LoginRequest loginRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginRequest);
        }

        public static LoginRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        private LoginRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoginRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        public static LoginRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LoginRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.sign_ = "";
        }

        public static LoginRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        public static LoginRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoginRequest parseFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private LoginRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.userId_ = codedInputStream.readInt64();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sign_ = codedInputStream.readStringRequireUtf8();
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

        public static LoginRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoginRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LoginRequestOrBuilder extends MessageOrBuilder {
        String getSign();

        ByteString getSignBytes();

        long getUserId();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_login_LoginRequest_descriptor = descriptor2;
        internal_static_login_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"UserId", "Sign"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_login_LoginReply_descriptor = descriptor3;
        internal_static_login_LoginReply_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Address", "Token"});
        MessageEmpty.getDescriptor();
    }

    private HallLogin() {
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
