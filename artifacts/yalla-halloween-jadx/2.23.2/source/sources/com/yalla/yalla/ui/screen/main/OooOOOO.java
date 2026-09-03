package com.yalla.yalla.ui.screen.main;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.VipSettingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipSettingVM f28650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f28651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f28652OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(VipSettingVM vipSettingVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f28650OooO0Oo = vipSettingVM;
        this.f28652OooO0o0 = o0ooo0o1;
        this.f28651OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VipSettingVM vipSettingVM = this.f28650OooO0Oo;
        vipSettingVM.setInvisibleVisitor(zBooleanValue);
        o00OO0O0<ApiResult<String>> o00oo0o0ChangeInvisibleVisitor = vipSettingVM.changeInvisibleVisitor(zBooleanValue);
        o0oOO.OooO0O0(o00oo0o0ChangeInvisibleVisitor, this.f28652OooO0o0, false, 6);
        o00O0O.OooO0Oo(o00oo0o0ChangeInvisibleVisitor, this.f28651OooO0o, false, null, null, OooOOO.f28648OooO0Oo, 14);
        return Unit.INSTANCE;
    }
}
