package p553o0oOOoOO;

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
import o0oo0000.OooO00o;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000 extends Lambda implements Function1<ItemVipModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f56021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ VipModel f56022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f56023OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, VipModel vipModel) {
        super(1);
        this.f56021OooO0Oo = appCompatActivity;
        this.f56023OooO0o0 = lifecycleOwner;
        this.f56022OooO0o = vipModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ItemVipModel itemVipModel) {
        ItemVipModel item = itemVipModel;
        Intrinsics.checkNotNullParameter(item, "item");
        OooO00o.OooO0OO("105106", MapsKt.mapOf(TuplesKt.to("button", Integer.valueOf(item.getPrivilegeId()))));
        AppCompatActivity appCompatActivity = this.f56021OooO0Oo;
        if (appCompatActivity != null) {
            int kaVipLv = this.f56022OooO0o.getKaVipLv();
            int privilegeId = item.getPrivilegeId();
            o00000OO.f56672OooOOOO.observe(this.f56023OooO0o0, new oO0000o0.OooOo(new oO0Oo0oo(kaVipLv, appCompatActivity, privilegeId)));
        }
        return Unit.INSTANCE;
    }
}
