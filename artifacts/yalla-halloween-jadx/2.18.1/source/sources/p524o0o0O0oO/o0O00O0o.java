package p524o0o0O0oO;

import OooO00o.OooO00o;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.user.VipActivity;
import java.util.Objects;
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
public final class o0O00O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f43030Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(o0O0000O o0o0000o2) {
        super(1);
        this.f43030Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00000 o00000VarOooOO0O = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O);
        StringBuilder sb = new StringBuilder();
        sb.append("vipRedDot_CustomRoomTheme_Hide4Main");
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        sb.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O.OooO0o(sb.toString(), true);
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        MutableLiveData<Boolean> vipRedDot_CustomRoomTheme = sharedMainMessageManager.getVipRedDot_CustomRoomTheme();
        Boolean bool = Boolean.FALSE;
        vipRedDot_CustomRoomTheme.postValue(bool);
        o00000 o00000VarOooOO0O2 = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O2);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("vipRedDot_ExclusiveBubble_Hide4Main");
        sbOooO0o0.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O2.OooO0o(sbOooO0o0.toString(), true);
        sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool);
        o00000 o00000VarOooOO0O3 = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O3);
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("vipRedDot_IncognitoAccess_Hide4Main");
        sbOooO0o1.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O3.OooO0o(sbOooO0o1.toString(), true);
        sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool);
        o0O00000.OooO0OO("Me_VIP");
        this.f43030Oooo0o.f43023OooO0o0.f49535OooO0OO.OooO0OO(false);
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
        VipActivity.f23570OoooOOo.OooO00o(this.f43030Oooo0o.f43021OooO0Oo, VipLevel.Vip0);
        OooOo.OooO0O0("105018");
        return Unit.INSTANCE;
    }
}
