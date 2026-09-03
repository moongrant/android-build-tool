package com.yalla.yalla.ui.screen.user.vip;

import android.os.Bundle;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.screen.main.VipSettingScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o000oOoO;
import p475o0Ooooo0.o0O00oO0;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PersonalVipModel f29662OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(PersonalVipModel personalVipModel) {
        super(0);
        this.f29662OooO0Oo = personalVipModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("105043");
        Bundle bundleOooO00o = o000oOoO.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
        bundleOooO00o.putBoolean(VipSettingScreen.HideVip, !(pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()));
        PersonalVipModel personalVipModel = this.f29662OooO0Oo;
        bundleOooO00o.putBoolean(VipSettingScreen.ShowPremiumFirst, personalVipModel.getShowPremiumFirst());
        bundleOooO00o.putBoolean(VipSettingScreen.InvisibleVisitor, personalVipModel.getStealthVisit());
        o00O00.OooO0o0(VipSettingScreen.INSTANCE, bundleOooO00o, false, null, 12);
        return Unit.INSTANCE;
    }
}
