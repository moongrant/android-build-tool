package io.grpc;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f26364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f26365OooO0O0;

    public OooOO0(OooO0OO oooO0OO, OooO oooO) {
        this.f26364OooO00o = oooO0OO;
        o0OOOO0o.OooOOOO.OooOO0(oooO, "interceptor");
        this.f26365OooO0O0 = oooO;
    }

    @Override // io.grpc.OooO0OO
    public final <ReqT, RespT> OooO0o<ReqT, RespT> OooO00o(MethodDescriptor<ReqT, RespT> methodDescriptor, OooO0O0 oooO0O0) {
        return this.f26365OooO0O0.OooO00o();
    }
}
