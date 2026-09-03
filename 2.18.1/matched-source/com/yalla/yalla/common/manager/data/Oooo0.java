package com.yalla.yalla.common.manager.data;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import p516o0o0O000.o00000OO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f20622OooO0O0 = new Oooo0(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ Oooo0 f20623OooO0OO = new Oooo0(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20624OooO00o;

    public /* synthetic */ Oooo0(int i) {
        this.f20624OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20624OooO00o) {
            case 0:
                SharedMainMessageManager.m276_get_userDot_$lambda11$lambda7((Boolean) obj);
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                String strOooO0O0 = o00000OO.OooO0O0(o00000OO.OooO0O0(it, "RoomId", String.valueOf(oooO00o.OooO00o().f43319OooO0Oo.getValue())), "IsOwner", String.valueOf(oooO00o.OooO00o().OooOOo0()));
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                webPageInfo.OooO0Oo(strOooO0O0);
                webPageInfo.f21221OoooO00 = false;
                o00O.f43140OooO00o.OooOOO(webPageInfo);
                break;
        }
    }
}
