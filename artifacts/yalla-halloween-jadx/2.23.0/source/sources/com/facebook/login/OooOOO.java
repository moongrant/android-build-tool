package com.facebook.login;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements LoginClient.OnCompletedListener, o00O0OOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f10700OooO00o;

    public /* synthetic */ OooOOO(Object obj) {
        this.f10700OooO00o = obj;
    }

    @Override // com.facebook.login.LoginClient.OnCompletedListener
    public final void onCompleted(LoginClient.Result result) {
        LoginFragment.m4171onCreate$lambda0((LoginFragment) this.f10700OooO00o, result);
    }
}
