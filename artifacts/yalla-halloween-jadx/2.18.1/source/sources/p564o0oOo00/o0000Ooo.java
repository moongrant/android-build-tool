package p564o0oOo00;

import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f45147Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(VehicleMineActivity vehicleMineActivity) {
        super(0);
        this.f45147Oooo0o = vehicleMineActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Me_store_user_Vehicles_Mine_open");
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        VehicleMineActivity vehicleMineActivity = this.f45147Oooo0o;
        Objects.requireNonNull(vehicleMineActivity);
        oooO00o.OooO00o(vehicleMineActivity, PremiumLevel.Premium3);
        return Unit.INSTANCE;
    }
}
