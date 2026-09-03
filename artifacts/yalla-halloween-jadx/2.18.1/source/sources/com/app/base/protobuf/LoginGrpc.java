package com.app.base.protobuf;

import io.grpc.MethodDescriptor;
import io.grpc.OooO0O0;
import io.grpc.OooO0OO;
import io.grpc.o00O0O;
import io.grpc.o0OoOo0;
import io.grpc.stub.annotations.RpcMethod;
import p639o0ooO0o0.o000O0;
import p639o0ooO0o0.o000O00O;
import p639o0ooO0o0.o000O0O0;
import p639o0ooO0o0.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class LoginGrpc {
    private static final int METHODID_LOGIN = 0;
    public static final String SERVICE_NAME = "login.Login";
    private static volatile MethodDescriptor<HallLogin.LoginRequest, HallLogin.LoginReply> getLoginMethod;
    private static volatile o00O0O serviceDescriptor;

    public static final class LoginBlockingStub extends o000O00O<LoginBlockingStub> {
        public HallLogin.LoginReply login(HallLogin.LoginRequest loginRequest) {
            return (HallLogin.LoginReply) o000O0.OooO0OO(getChannel(), LoginGrpc.getLoginMethod(), getCallOptions(), loginRequest);
        }

        private LoginBlockingStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p639o0ooO0o0.o000O00O
        public LoginBlockingStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new LoginBlockingStub(oooO0OO, oooO0O0);
        }

        private LoginBlockingStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    public static final class LoginFutureStub extends o000O00O<LoginFutureStub> {
        public com.google.common.util.concurrent.OooO0OO<HallLogin.LoginReply> login(HallLogin.LoginRequest loginRequest) {
            return o000O0.OooO0o0(getChannel().OooO00o(LoginGrpc.getLoginMethod(), getCallOptions()));
        }

        private LoginFutureStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p639o0ooO0o0.o000O00O
        public LoginFutureStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new LoginFutureStub(oooO0OO, oooO0O0);
        }

        private LoginFutureStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    public static abstract class LoginImplBase {
        public final o0OoOo0 bindService() {
            o0OoOo0.OooO0O0 oooO0O0 = new o0OoOo0.OooO0O0(LoginGrpc.getServiceDescriptor());
            MethodDescriptor<HallLogin.LoginRequest, HallLogin.LoginReply> loginMethod = LoginGrpc.getLoginMethod();
            new MethodHandlers(this, 0);
            oooO0O0.OooO00o(loginMethod, new o000OO0O.OooO00o());
            return oooO0O0.OooO0O0();
        }

        public void login(HallLogin.LoginRequest loginRequest, o000O0O0<HallLogin.LoginReply> o000o0o1) {
            o000OO0O.OooO00o(LoginGrpc.getLoginMethod(), o000o0o1);
        }
    }

    public static final class LoginStub extends o000O00O<LoginStub> {
        public void login(HallLogin.LoginRequest loginRequest, o000O0O0<HallLogin.LoginReply> o000o0o1) {
            o000O0.OooO0O0(getChannel().OooO00o(LoginGrpc.getLoginMethod(), getCallOptions()), o000o0o1);
        }

        private LoginStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p639o0ooO0o0.o000O00O
        public LoginStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new LoginStub(oooO0OO, oooO0O0);
        }

        private LoginStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    private LoginGrpc() {
    }

    @RpcMethod(fullMethodName = "login.Login/Login", methodType = MethodDescriptor.MethodType.UNARY, requestType = HallLogin.LoginRequest.class, responseType = HallLogin.LoginReply.class)
    public static MethodDescriptor<HallLogin.LoginRequest, HallLogin.LoginReply> getLoginMethod() {
        MethodDescriptor<HallLogin.LoginRequest, HallLogin.LoginReply> methodDescriptorOooO00o = getLoginMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (LoginGrpc.class) {
                methodDescriptorOooO00o = getLoginMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26351OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26352OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "Login");
                    oooO00oOooO0O0.f26353OooO0o0 = true;
                    HallLogin.LoginRequest defaultInstance = HallLogin.LoginRequest.getDefaultInstance();
                    int i = p637o0ooO0Oo.o000OO0O.f48860OooO00o;
                    oooO00oOooO0O0.f26349OooO00o = new o0ooO0Oo.o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26350OooO0O0 = new o0ooO0Oo.o000OO0O.OooO00o(HallLogin.LoginReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getLoginMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    public static o00O0O getServiceDescriptor() {
        o00O0O o00o0o2 = serviceDescriptor;
        if (o00o0o2 == null) {
            synchronized (LoginGrpc.class) {
                o00o0o2 = serviceDescriptor;
                if (o00o0o2 == null) {
                    o00O0O.OooO00o OooO00o2 = o00O0O.OooO00o(SERVICE_NAME);
                    OooO00o2.OooO00o(getLoginMethod());
                    o00O0O o00o0o3 = new o00O0O(OooO00o2);
                    serviceDescriptor = o00o0o3;
                    o00o0o2 = o00o0o3;
                }
            }
        }
        return o00o0o2;
    }

    public static LoginBlockingStub newBlockingStub(OooO0OO oooO0OO) {
        return new LoginBlockingStub(oooO0OO);
    }

    public static LoginFutureStub newFutureStub(OooO0OO oooO0OO) {
        return new LoginFutureStub(oooO0OO);
    }

    public static LoginStub newStub(OooO0OO oooO0OO) {
        return new LoginStub(oooO0OO);
    }

    public static final class MethodHandlers<Req, Resp> {
        private final int methodId;
        private final LoginImplBase serviceImpl;

        public MethodHandlers(LoginImplBase loginImplBase, int i) {
            this.serviceImpl = loginImplBase;
            this.methodId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void invoke(Req req, o000O0O0<Resp> o000o0o1) {
            if (this.methodId != 0) {
                throw new AssertionError();
            }
            this.serviceImpl.login((HallLogin.LoginRequest) req, o000o0o1);
        }

        public o000O0O0<Req> invoke(o000O0O0<Resp> o000o0o1) {
            throw new AssertionError();
        }
    }
}
