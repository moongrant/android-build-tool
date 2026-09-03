package p534o0o0OOo0;

import OooO00o.OooO00o;
import android.widget.TextView;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p058o0000OoO.OooO;
import p617o0oo0o.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0o0o extends Lambda implements Function1<AccountBindInfo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f43619Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f43619Oooo0o = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindInfo accountBindInfo) {
        AccountBindInfo accountBindInfo2 = accountBindInfo;
        TurnOnLoginProtectionActivity turnOnLoginProtectionActivity = this.f43619Oooo0o;
        int i = TurnOnLoginProtectionActivity.f21879OooooO0;
        TextView textView = turnOnLoginProtectionActivity.OooOoo().f50631OooO0OO;
        TurnOnLoginProtectionActivity turnOnLoginProtectionActivity2 = this.f43619Oooo0o;
        String strValueOf = String.valueOf(accountBindInfo2 != null ? accountBindInfo2.getIsPh() : null);
        if (turnOnLoginProtectionActivity2.f21880OoooOoo == null) {
            Pair<String, String> pairOooO00o = Oooo000.OooO00o(strValueOf, turnOnLoginProtectionActivity2);
            if (!StringsKt.isBlank(pairOooO00o.getFirst())) {
                turnOnLoginProtectionActivity2.f21880OoooOoo = pairOooO00o;
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("(\u202d+");
                sbOooO0o0.append(pairOooO00o.getFirst());
                sbOooO0o0.append(' ');
                strValueOf = OooO.OooO00o(sbOooO0o0, pairOooO00o.getSecond(), "\u202c)");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            Pair<String, String> pair = turnOnLoginProtectionActivity2.f21880OoooOoo;
            sb.append(pair != null ? pair.getFirst() : null);
            Pair<String, String> pair2 = turnOnLoginProtectionActivity2.f21880OoooOoo;
            sb.append(pair2 != null ? pair2.getSecond() : null);
            if (Intrinsics.areEqual(sb.toString(), strValueOf)) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("(\u202d+");
                Pair<String, String> pair3 = turnOnLoginProtectionActivity2.f21880OoooOoo;
                sbOooO0o1.append(pair3 != null ? pair3.getFirst() : null);
                sbOooO0o1.append(' ');
                Pair<String, String> pair4 = turnOnLoginProtectionActivity2.f21880OoooOoo;
                strValueOf = OooO.OooO00o(sbOooO0o1, pair4 != null ? pair4.getSecond() : null, "\u202c)");
            }
        }
        textView.setText(strValueOf);
        this.f43619Oooo0o.OooOoo().f50630OooO0O0.setClickable(true);
        return Unit.INSTANCE;
    }
}
