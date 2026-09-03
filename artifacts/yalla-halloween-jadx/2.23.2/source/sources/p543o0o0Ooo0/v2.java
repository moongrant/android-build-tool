package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f55700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f55701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f55702OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f55703OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f55704OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.f55700OooO0Oo = shopVehicleListModel;
        this.f55702OooO0o0 = userOutFitVM;
        this.f55701OooO0o = o0ooo0o1;
        this.f55703OooO0oO = lifecycleOwner;
        this.f55704OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        z2.OooO0OO(this.f55700OooO0Oo, this.f55702OooO0o0, this.f55701OooO0o, this.f55703OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55704OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
