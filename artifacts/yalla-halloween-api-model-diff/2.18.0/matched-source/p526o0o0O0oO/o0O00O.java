package p526o0o0O0oO;

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
import p393o0OOooOo.o0O00000;
import p499o0o00Oo.OooOOO0;
import p500o0o00Oo0.OooOOO;
import p501o0o00OoO.o00000;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O000 f43049Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(o0O000 o0o001) {
        super(1);
        this.f43049Oooo = o0o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
        o00000 o00000VarOooOO0O = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O);
        StringBuilder sb = new StringBuilder();
        sb.append("vipRedDot_CustomRoomTheme_Hide4Main");
        OooOOO oooOOO = OooOOO.f41235OooO00o;
        sb.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O.OooO0o(sb.toString(), true);
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        MutableLiveData<Boolean> vipRedDot_CustomRoomTheme = sharedMainMessageManager.getVipRedDot_CustomRoomTheme();
        Boolean bool = Boolean.FALSE;
        vipRedDot_CustomRoomTheme.postValue(bool);
        o00000 o00000VarOooOO0O2 = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O2);
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Main");
        sbOooO0O0.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O2.OooO0o(sbOooO0O0.toString(), true);
        sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool);
        o00000 o00000VarOooOO0O3 = OooOOO0.OooOO0O();
        Objects.requireNonNull(o00000VarOooOO0O3);
        StringBuilder sbOooO0O1 = OooO00o.OooO0O0("vipRedDot_IncognitoAccess_Hide4Main");
        sbOooO0O1.append(oooOOO.OooOo().getValue());
        o00000VarOooOO0O3.OooO0o(sbOooO0O1.toString(), true);
        sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool);
        o0O00000.OooO0OO("Me_VIP");
        this.f43049Oooo.f43040OooO0o0.f49472OooO0OO.OooO0OO(false);
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23589OoooOoo;
        VipActivity.f23589OoooOoo.OooO00o(this.f43049Oooo.f43038OooO0Oo, VipLevel.Vip0);
        OooOo.OooO0O0("105018");
        return Unit.INSTANCE;
    }
}
