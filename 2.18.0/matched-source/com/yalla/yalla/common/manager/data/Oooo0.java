package com.yalla.yalla.common.manager.data;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import p518o0o0O000.o00000OO;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f20642OooO0O0 = new Oooo0(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f20643OooO0OO = new Oooo0(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20644OooO00o;

    public /* synthetic */ Oooo0(int i) {
        this.f20644OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20644OooO00o) {
            case 0:
                SharedMainMessageManager.m276_get_userDot_$lambda11$lambda7((Boolean) obj);
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                String strOooO0O0 = o00000OO.OooO0O0(o00000OO.OooO0O0(it, "RoomId", String.valueOf(oooO00o.OooO00o().f43344OooO0Oo.getValue())), "IsOwner", String.valueOf(oooO00o.OooO00o().OooOOo0()));
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                webPageInfo.OooO0Oo(strOooO0O0);
                webPageInfo.f21235OoooO = false;
                o00OO000.f43171OooO00o.OooOOO(webPageInfo);
                break;
        }
    }
}
