package com.yalla.yalla.ui.screen.user.vip;

import android.os.Bundle;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.screen.main.VipSettingScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p464o0Oooo.o000000O;
import p526o0o0OOO0.oo0oOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PersonalVipModel f30206OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(PersonalVipModel personalVipModel) {
        super(0);
        this.f30206OooO0Oo = personalVipModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105043");
        Bundle bundleOooO00o = o00Ooo.OooO00o();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0().getValue();
        bundleOooO00o.putBoolean(VipSettingScreen.HideVip, !(pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()));
        PersonalVipModel personalVipModel = this.f30206OooO0Oo;
        bundleOooO00o.putBoolean(VipSettingScreen.ShowPremiumFirst, personalVipModel.getShowPremiumFirst());
        bundleOooO00o.putBoolean(VipSettingScreen.InvisibleVisitor, personalVipModel.getStealthVisit());
        oo0oOO0.OooO0o0(VipSettingScreen.INSTANCE, bundleOooO00o, false, null, 12);
        return Unit.INSTANCE;
    }
}
