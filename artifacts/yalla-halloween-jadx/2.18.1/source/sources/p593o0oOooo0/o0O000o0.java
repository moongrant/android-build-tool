package p593o0oOooo0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.vm.main.VipSettingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0o0000.o000oOoO;
import p484o0o000OO.OooOOOO;
import p571o0oOo0o.oo00o;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipSettingVM f47449Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47450Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47451Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f47449Oooo0o = vipSettingVM;
        this.f47450Oooo0oO = oo0oo0oo;
        this.f47451Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f47449Oooo0o.setHideVip(zBooleanValue);
        OooOOOO<ApiResult<String>> oooOOOOChangeVipShowState = this.f47449Oooo0o.changeVipShowState(zBooleanValue);
        oo00o.OooO0O0(oooOOOOChangeVipShowState, this.f47450Oooo0oO);
        o000oOoO.OooO0Oo(oooOOOOChangeVipShowState, this.f47451Oooo0oo, o0O000Oo.f47448Oooo0o);
        return Unit.INSTANCE;
    }
}
