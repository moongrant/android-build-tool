package p524o0o0O0oO;

import android.view.View;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o00000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f43092Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(o0O0000O o0o0000o2) {
        super(1);
        this.f43092Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00000 o00000VarOooOO0O = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O);
        StringBuilder sb = new StringBuilder();
        sb.append("premiumRedDot_MomentEdit_Hide4Main");
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        sb.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O.OooO0o(sb.toString(), true);
        SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boolean.FALSE);
        this.f43092Oooo0o.f43023OooO0o0.f49535OooO0OO.OooO0OO(false);
        o0O00000.OooO0OO("Me_aristocracy");
        Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        PremiumActivity.f23360o0ooOOo.OooO00o(this.f43092Oooo0o.f43021OooO0Oo, PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(value.getSecond().intValue())));
        OooOo.OooO0O0("105017");
        return Unit.INSTANCE;
    }
}
