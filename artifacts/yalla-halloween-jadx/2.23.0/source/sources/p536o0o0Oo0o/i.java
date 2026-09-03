package p536o0o0Oo0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.ShopVehicleListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f54937OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54938OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f54939OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ShopVehicleListModel shopVehicleListModel, Function0<Unit> function0, int i) {
        super(2);
        this.f54937OooO0Oo = shopVehicleListModel;
        this.f54939OooO0o0 = function0;
        this.f54938OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54938OooO0o | 1);
        j.OooO0Oo(this.f54937OooO0Oo, this.f54939OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
