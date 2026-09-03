package p474o0o00;

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
import p023Oooo00o.oO00Oo00;
import p579o0oOoo.oO0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function1<AccountBindInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f47345OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f47345OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindInfo accountBindInfo) {
        AccountBindInfo accountBindInfo2 = accountBindInfo;
        int i = TurnOnLoginProtectionActivity.f25334OooOo0O;
        TurnOnLoginProtectionActivity turnOnLoginProtectionActivity = this.f47345OooO0Oo;
        TextView textView = turnOnLoginProtectionActivity.OooOo().f57710OooO0OO;
        String strValueOf = String.valueOf(accountBindInfo2 != null ? accountBindInfo2.getIsPh() : null);
        Pair<String, String> pair = turnOnLoginProtectionActivity.f25335OooOOoo;
        if (pair == null) {
            Pair<String, String> pairOooO00o = oO0Oo.OooO00o(turnOnLoginProtectionActivity, strValueOf);
            if (!StringsKt.isBlank(pairOooO00o.getFirst())) {
                turnOnLoginProtectionActivity.f25335OooOOoo = pairOooO00o;
                strValueOf = "(\u202d+" + ((Object) pairOooO00o.getFirst()) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) pairOooO00o.getSecond()) + "\u202c)";
            }
        } else {
            String first = pair.getFirst();
            Pair<String, String> pair2 = turnOnLoginProtectionActivity.f25335OooOOoo;
            if (Intrinsics.areEqual(first + (pair2 != null ? pair2.getSecond() : null), strValueOf)) {
                Pair<String, String> pair3 = turnOnLoginProtectionActivity.f25335OooOOoo;
                String first2 = pair3 != null ? pair3.getFirst() : null;
                Pair<String, String> pair4 = turnOnLoginProtectionActivity.f25335OooOOoo;
                strValueOf = oO00Oo00.OooO00o("(\u202d+", first2, ZegoConstants.ZegoVideoDataAuxPublishingStream, pair4 != null ? pair4.getSecond() : null, "\u202c)");
            }
        }
        textView.setText(strValueOf);
        turnOnLoginProtectionActivity.OooOo().f57709OooO0O0.setClickable(true);
        return Unit.INSTANCE;
    }
}
