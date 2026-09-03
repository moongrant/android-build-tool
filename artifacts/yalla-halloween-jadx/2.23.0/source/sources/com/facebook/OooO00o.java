package com.facebook;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f10557OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10558OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj, Object obj2) {
        this.f10556OooO0Oo = i;
        this.f10558OooO0o0 = obj;
        this.f10557OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10556OooO0Oo;
        Object obj = this.f10557OooO0o;
        Object obj2 = this.f10558OooO0o0;
        switch (i) {
            case 0:
                AccessTokenManager.m4031refreshCurrentAccessToken$lambda0((AccessTokenManager) obj2, (AccessToken.AccessTokenRefreshCallback) obj);
                break;
            default:
                Triple triple = (Triple) obj;
                Intrinsics.checkNotNullParameter(triple, "$triple");
                View decorView = ((Window) obj2).getDecorView();
                Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).removeView((View) triple.getSecond());
                break;
        }
    }
}
