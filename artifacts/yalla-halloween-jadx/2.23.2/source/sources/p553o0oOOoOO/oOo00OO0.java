package p553o0oOOoOO;

import com.yalla.yalla.model.vip.VipWelfareModel;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipVm f56143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ VipWelfareModel f56144OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(VipVm vipVm, VipWelfareModel vipWelfareModel) {
        super(1);
        this.f56143OooO0Oo = vipVm;
        this.f56144OooO0o0 = vipWelfareModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        VipVm vipVm = this.f56143OooO0Oo;
        vipVm.setCurrentUserWelfareModel(this.f56144OooO0o0);
        vipVm.getShowBuyDialog().setValue(Boolean.TRUE);
        OooO00o.OooO0OO("105131", MapsKt.mapOf(TuplesKt.to("shopid", Integer.valueOf(iIntValue)), TuplesKt.to("source", 2)));
        return Unit.INSTANCE;
    }
}
