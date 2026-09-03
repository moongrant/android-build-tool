package p537o0o0OoO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.VipModel;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function1<ItemVipModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f55358OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ VipModel f55359OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55360OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, VipModel vipModel) {
        super(1);
        this.f55358OooO0Oo = appCompatActivity;
        this.f55360OooO0o0 = lifecycleOwner;
        this.f55359OooO0o = vipModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ItemVipModel itemVipModel) {
        ItemVipModel item = itemVipModel;
        Intrinsics.checkNotNullParameter(item, "item");
        o0OO000.OooO0O0("105106", MapsKt.mapOf(TuplesKt.to("button", Integer.valueOf(item.getPrivilegeId()))));
        AppCompatActivity appCompatActivity = this.f55358OooO0Oo;
        if (appCompatActivity != null) {
            int kaVipLv = this.f55359OooO0o.getKaVipLv();
            int privilegeId = item.getPrivilegeId();
            o00O000o.f44503OooOOOO.observe(this.f55360OooO0o0, new o0O00oO0.OooOo(new o0O0OOO0(kaVipLv, appCompatActivity, privilegeId)));
        }
        return Unit.INSTANCE;
    }
}
