package p491o0o00O0o;

import android.widget.TextView;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p023Oooo00o.oO00OOOo;
import p590o0oOooo0.oOo00o00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 extends Lambda implements Function1<AccountBindInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f49046OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f49046OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindInfo accountBindInfo) {
        AccountBindInfo accountBindInfo2 = accountBindInfo;
        int i = TurnOnLoginProtectionActivity.f24879OooOo0O;
        TurnOnLoginProtectionActivity turnOnLoginProtectionActivity = this.f49046OooO0Oo;
        TextView textView = turnOnLoginProtectionActivity.OooOo().f44284OooO0OO;
        String strValueOf = String.valueOf(accountBindInfo2 != null ? accountBindInfo2.getIsPh() : null);
        Pair<String, String> pair = turnOnLoginProtectionActivity.f24880OooOOoo;
        if (pair == null) {
            Pair<String, String> pairOooO00o = oOo00o00.OooO00o(turnOnLoginProtectionActivity, strValueOf);
            if (!StringsKt.isBlank(pairOooO00o.getFirst())) {
                turnOnLoginProtectionActivity.f24880OooOOoo = pairOooO00o;
                strValueOf = "(\u202d+" + ((Object) pairOooO00o.getFirst()) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) pairOooO00o.getSecond()) + "\u202c)";
            }
        } else {
            String first = pair.getFirst();
            Pair<String, String> pair2 = turnOnLoginProtectionActivity.f24880OooOOoo;
            if (Intrinsics.areEqual(first + (pair2 != null ? pair2.getSecond() : null), strValueOf)) {
                Pair<String, String> pair3 = turnOnLoginProtectionActivity.f24880OooOOoo;
                String first2 = pair3 != null ? pair3.getFirst() : null;
                Pair<String, String> pair4 = turnOnLoginProtectionActivity.f24880OooOOoo;
                strValueOf = oO00OOOo.OooO00o("(\u202d+", first2, ZegoConstants.ZegoVideoDataAuxPublishingStream, pair4 != null ? pair4.getSecond() : null, "\u202c)");
            }
        }
        textView.setText(strValueOf);
        turnOnLoginProtectionActivity.OooOo().f44283OooO0O0.setClickable(true);
        return Unit.INSTANCE;
    }
}
