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
public final class o0O00O0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipSettingVM f47453Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47454Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47455Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(VipSettingVM vipSettingVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(1);
        this.f47453Oooo0o = vipSettingVM;
        this.f47454Oooo0oO = oo0oo0oo;
        this.f47455Oooo0oo = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.f47453Oooo0o.setShowPremiumFirst(zBooleanValue);
        OooOOOO<ApiResult<String>> oooOOOOChangeShowPremiumFirst = this.f47453Oooo0o.changeShowPremiumFirst(zBooleanValue);
        oo00o.OooO0O0(oooOOOOChangeShowPremiumFirst, this.f47454Oooo0oO);
        o000oOoO.OooO0Oo(oooOOOOChangeShowPremiumFirst, this.f47455Oooo0oo, o0OoO00O.f47468Oooo0o);
        return Unit.INSTANCE;
    }
}
