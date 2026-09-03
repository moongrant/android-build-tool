package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import com.yalla.yalla.common.ui.view.VipState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p593o0oOooo0.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f23354Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(VipActivity vipActivity) {
        super(0);
        this.f23354Oooo0o = vipActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Me_VIP_install");
        Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
        Pair<Integer, Integer> value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO().getValue();
        boolean z = false;
        if (value != null && value.getFirst().intValue() == VipState.Vip.getValue()) {
            z = true;
        }
        bundleOooO00o.putBoolean("VIP_CHECK", !z);
        VipActivity vipActivity = this.f23354Oooo0o;
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
        bundleOooO00o.putBoolean("SHOW_PREMIUM_FIRST", vipActivity.Oooo000().getPersonalKaVipModel().getShowPremiumFirst());
        bundleOooO00o.putBoolean("InvisibleVisitor", this.f23354Oooo0o.Oooo000().getPersonalKaVipModel().getStealthVisit());
        o000O.OooO00o(o0OoOoOo.f47469OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
