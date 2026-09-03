package com.yalla.yalla.ui.screen.main;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.VipSettingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipSettingVM f29175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f29176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f29177OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(VipSettingVM vipSettingVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f29175OooO0Oo = vipSettingVM;
        this.f29177OooO0o0 = o0o0ooo0;
        this.f29176OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VipSettingVM vipSettingVM = this.f29175OooO0Oo;
        vipSettingVM.setHideVip(zBooleanValue);
        o0OO00O<ApiResult<String>> o0oo00oChangeVipShowState = vipSettingVM.changeVipShowState(zBooleanValue);
        v0.OooO0O0(o0oo00oChangeVipShowState, this.f29177OooO0o0, false, 6);
        o000O000.OooO0Oo(o0oo00oChangeVipShowState, this.f29176OooO0o, false, null, null, OooO0OO.f29174OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
