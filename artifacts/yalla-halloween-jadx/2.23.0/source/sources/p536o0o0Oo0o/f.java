package p536o0o0Oo0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f54930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f54931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserOutFitVM f54932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54934OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.f54930OooO0Oo = shopVehicleListModel;
        this.f54932OooO0o0 = userOutFitVM;
        this.f54931OooO0o = o0o0ooo0;
        this.f54933OooO0oO = lifecycleOwner;
        this.f54934OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        j.OooO0OO(this.f54930OooO0Oo, this.f54932OooO0o0, this.f54931OooO0o, this.f54933OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54934OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
