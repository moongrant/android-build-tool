package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.ShopVehicleListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f55718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f55720OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(ShopVehicleListModel shopVehicleListModel, Function0<Unit> function0, int i) {
        super(2);
        this.f55718OooO0Oo = shopVehicleListModel;
        this.f55720OooO0o0 = function0;
        this.f55719OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55719OooO0o | 1);
        z2.OooO0Oo(this.f55718OooO0Oo, this.f55720OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
