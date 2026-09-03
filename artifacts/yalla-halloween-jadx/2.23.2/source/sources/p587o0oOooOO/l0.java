package p587o0oOooOO;

import android.view.animation.Animation;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oOo00OO0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftView f56863OooO00o;

    public l0(GiftView giftView) {
        this.f56863OooO00o = giftView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Nullable Animation animation) {
        GiftPropModel giftPropModel = this.f56863OooO00o.f29924OooO0o0;
        if (giftPropModel == null) {
            return;
        }
        giftPropModel.setNewAnimated(true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@Nullable Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@Nullable Animation animation) {
        oOo00OO0 ooo00oo0OooOO0O = o00Ooo.OooOO0O();
        GiftPropModel giftPropModel = this.f56863OooO00o.f29924OooO0o0;
        String giftId = String.valueOf(giftPropModel != null ? Integer.valueOf(giftPropModel.getGiftId()) : null);
        ooo00oo0OooOO0O.getClass();
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        if (ooo00oo0OooOO0O.OooOO0o(giftId)) {
            return;
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Object value = o0O00oO0.OooOOo0().getValue();
        StringBuilder sb = new StringBuilder();
        String str = ooo00oo0OooOO0O.f46403OooO0O0;
        sb.append(str);
        sb.append(value);
        StringBuffer stringBuffer = new StringBuffer(ooo00oo0OooOO0O.OooO0o0(sb.toString(), ""));
        if (stringBuffer.length() > 0) {
            stringBuffer.append(",");
        }
        stringBuffer.append(giftId);
        String str2 = str + o0O00oO0.OooOOo0().getValue();
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ooo00oo0OooOO0O.OooO(str2, string);
    }
}
