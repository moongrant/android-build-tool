package com.app.base.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.OooOO0O;
import com.google.protobuf.OooOo00;
import com.google.protobuf.o00oO0o;
import com.google.protobuf.o0OOO0o;
import com.google.protobuf.oo000o;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class HallLogin {

    /* JADX INFO: renamed from: com.app.base.protobuf.HallLogin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final class LoginReply extends GeneratedMessageLite<LoginReply, Builder> implements LoginReplyOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final LoginReply DEFAULT_INSTANCE;
        private static volatile o0OOO0o<LoginReply> PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private String address_ = "";
        private String token_ = "";

        public static final class Builder extends GeneratedMessageLite.OooO00o<LoginReply, Builder> implements LoginReplyOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((LoginReply) this.instance).clearAddress();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((LoginReply) this.instance).clearToken();
                return this;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public String getAddress() {
                return ((LoginReply) this.instance).getAddress();
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public ByteString getAddressBytes() {
                return ((LoginReply) this.instance).getAddressBytes();
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public String getToken() {
                return ((LoginReply) this.instance).getToken();
            }

            @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
            public ByteString getTokenBytes() {
                return ((LoginReply) this.instance).getTokenBytes();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((LoginReply) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                copyOnWrite();
                ((LoginReply) this.instance).setAddressBytes(byteString);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((LoginReply) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((LoginReply) this.instance).setTokenBytes(byteString);
                return this;
            }

            private Builder() {
                super(LoginReply.DEFAULT_INSTANCE);
            }
        }

        static {
            LoginReply loginReply = new LoginReply();
            DEFAULT_INSTANCE = loginReply;
            loginReply.makeImmutable();
        }

        private LoginReply() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.token_ = getDefaultInstance().getToken();
        }

        public static LoginReply getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginReply parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoginReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static o0OOO0o<LoginReply> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            Objects.requireNonNull(str);
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString byteString) {
            this.address_ = OooO00o.OooO0OO(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            Objects.requireNonNull(str);
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(ByteString byteString) {
            this.token_ = OooO00o.OooO0OO(byteString, byteString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LoginReply();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    GeneratedMessageLite.OooOOO oooOOO = (GeneratedMessageLite.OooOOO) obj;
                    LoginReply loginReply = (LoginReply) obj2;
                    this.address_ = oooOOO.OooO0o(!this.address_.isEmpty(), this.address_, !loginReply.address_.isEmpty(), loginReply.address_);
                    this.token_ = oooOOO.OooO0o(!this.token_.isEmpty(), this.token_, true ^ loginReply.token_.isEmpty(), loginReply.token_);
                    return this;
                case 6:
                    OooOO0O oooOO0O = (OooOO0O) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iOooOOoo = oooOO0O.OooOOoo();
                            if (iOooOOoo != 0) {
                                if (iOooOOoo == 10) {
                                    this.address_ = oooOO0O.OooOOo();
                                } else if (iOooOOoo == 18) {
                                    this.token_ = oooOO0O.OooOOo();
                                } else if (!oooOO0O.OooOo0O(iOooOOoo)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LoginReply.class) {
                            if (PARSER == null) {
                                PARSER = new GeneratedMessageLite.OooO0O0(DEFAULT_INSTANCE);
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    throw new UnsupportedOperationException();
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.OooO0O0(this.address_);
        }

        @Override // com.google.protobuf.oo000o
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iOooO0oO = this.address_.isEmpty() ? 0 : 0 + CodedOutputStream.OooO0oO(1, getAddress());
            if (!this.token_.isEmpty()) {
                iOooO0oO += CodedOutputStream.OooO0oO(2, getToken());
            }
            this.memoizedSerializedSize = iOooO0oO;
            return iOooO0oO;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginReplyOrBuilder
        public ByteString getTokenBytes() {
            return ByteString.OooO0O0(this.token_);
        }

        @Override // com.google.protobuf.oo000o
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.address_.isEmpty()) {
                codedOutputStream.OooOOOO(1, getAddress());
            }
            if (this.token_.isEmpty()) {
                return;
            }
            codedOutputStream.OooOOOO(2, getToken());
        }

        public static Builder newBuilder(LoginReply loginReply) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginReply);
        }

        public static LoginReply parseDelimitedFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static LoginReply parseFrom(ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, oooOo00);
        }

        public static LoginReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoginReply parseFrom(byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, oooOo00);
        }

        public static LoginReply parseFrom(InputStream inputStream) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoginReply parseFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static LoginReply parseFrom(OooOO0O oooOO0O) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O);
        }

        public static LoginReply parseFrom(OooOO0O oooOO0O, OooOo00 oooOo00) throws IOException {
            return (LoginReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O, oooOo00);
        }
    }

    public interface LoginReplyOrBuilder extends o00oO0o {
        String getAddress();

        ByteString getAddressBytes();

        @Override // com.google.protobuf.o00oO0o
        /* synthetic */ oo000o getDefaultInstanceForType();

        String getToken();

        ByteString getTokenBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class LoginRequest extends GeneratedMessageLite<LoginRequest, Builder> implements LoginRequestOrBuilder {
        private static final LoginRequest DEFAULT_INSTANCE;
        private static volatile o0OOO0o<LoginRequest> PARSER = null;
        public static final int SIGN_FIELD_NUMBER = 2;
        public static final int USERID_FIELD_NUMBER = 1;
        private String sign_ = "";
        private long userId_;

        public static final class Builder extends GeneratedMessageLite.OooO00o<LoginRequest, Builder> implements LoginRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearSign() {
                copyOnWrite();
                ((LoginRequest) this.instance).clearSign();
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((LoginRequest) this.instance).clearUserId();
                return this;
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public String getSign() {
                return ((LoginRequest) this.instance).getSign();
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public ByteString getSignBytes() {
                return ((LoginRequest) this.instance).getSignBytes();
            }

            @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
            public long getUserId() {
                return ((LoginRequest) this.instance).getUserId();
            }

            public Builder setSign(String str) {
                copyOnWrite();
                ((LoginRequest) this.instance).setSign(str);
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                copyOnWrite();
                ((LoginRequest) this.instance).setSignBytes(byteString);
                return this;
            }

            public Builder setUserId(long j) {
                copyOnWrite();
                ((LoginRequest) this.instance).setUserId(j);
                return this;
            }

            private Builder() {
                super(LoginRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            LoginRequest loginRequest = new LoginRequest();
            DEFAULT_INSTANCE = loginRequest;
            loginRequest.makeImmutable();
        }

        private LoginRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSign() {
            this.sign_ = getDefaultInstance().getSign();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = 0L;
        }

        public static LoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoginRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static o0OOO0o<LoginRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSign(String str) {
            Objects.requireNonNull(str);
            this.sign_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignBytes(ByteString byteString) {
            this.sign_ = OooO00o.OooO0OO(byteString, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(long j) {
            this.userId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            boolean z = false;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new LoginRequest();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    GeneratedMessageLite.OooOOO oooOOO = (GeneratedMessageLite.OooOOO) obj;
                    LoginRequest loginRequest = (LoginRequest) obj2;
                    long j = this.userId_;
                    boolean z2 = j != 0;
                    long j2 = loginRequest.userId_;
                    this.userId_ = oooOOO.OooOO0O(z2, j, j2 != 0, j2);
                    this.sign_ = oooOOO.OooO0o(!this.sign_.isEmpty(), this.sign_, !loginRequest.sign_.isEmpty(), loginRequest.sign_);
                    return this;
                case 6:
                    OooOO0O oooOO0O = (OooOO0O) obj;
                    while (!z) {
                        try {
                            int iOooOOoo = oooOO0O.OooOOoo();
                            if (iOooOOoo != 0) {
                                if (iOooOOoo == 8) {
                                    this.userId_ = oooOO0O.OooOOOo();
                                } else if (iOooOOoo == 18) {
                                    this.sign_ = oooOO0O.OooOOo();
                                } else if (!oooOO0O.OooOo0O(iOooOOoo)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (LoginRequest.class) {
                            if (PARSER == null) {
                                PARSER = new GeneratedMessageLite.OooO0O0(DEFAULT_INSTANCE);
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    throw new UnsupportedOperationException();
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.oo000o
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            long j = this.userId_;
            int iOooO0Oo = j != 0 ? 0 + CodedOutputStream.OooO0Oo(1, j) : 0;
            if (!this.sign_.isEmpty()) {
                iOooO0Oo += CodedOutputStream.OooO0oO(2, getSign());
            }
            this.memoizedSerializedSize = iOooO0Oo;
            return iOooO0Oo;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public String getSign() {
            return this.sign_;
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public ByteString getSignBytes() {
            return ByteString.OooO0O0(this.sign_);
        }

        @Override // com.app.base.protobuf.HallLogin.LoginRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.oo000o
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.OooOOo0(1, j);
            }
            if (this.sign_.isEmpty()) {
                return;
            }
            codedOutputStream.OooOOOO(2, getSign());
        }

        public static Builder newBuilder(LoginRequest loginRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginRequest);
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static LoginRequest parseFrom(ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, oooOo00);
        }

        public static LoginRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoginRequest parseFrom(byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, oooOo00);
        }

        public static LoginRequest parseFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoginRequest parseFrom(InputStream inputStream, OooOo00 oooOo00) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, oooOo00);
        }

        public static LoginRequest parseFrom(OooOO0O oooOO0O) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O);
        }

        public static LoginRequest parseFrom(OooOO0O oooOO0O, OooOo00 oooOo00) throws IOException {
            return (LoginRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, oooOO0O, oooOo00);
        }
    }

    public interface LoginRequestOrBuilder extends o00oO0o {
        @Override // com.google.protobuf.o00oO0o
        /* synthetic */ oo000o getDefaultInstanceForType();

        String getSign();

        ByteString getSignBytes();

        long getUserId();

        /* synthetic */ boolean isInitialized();
    }

    private HallLogin() {
    }

    public static void registerAllExtensions(OooOo00 oooOo00) {
    }
}
