package p539o0o0OoOO;

import android.view.animation.Animation;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000OO;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
public final class p1 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftView f55643OooO00o;

    public p1(GiftView giftView) {
        this.f55643OooO00o = giftView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@Nullable Animation animation) {
        GiftPropModel giftPropModel = this.f55643OooO00o.f30469OooO0o0;
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
        o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
        GiftPropModel giftPropModel = this.f55643OooO00o.f30469OooO0o0;
        String giftId = String.valueOf(giftPropModel != null ? Integer.valueOf(giftPropModel.getGiftId()) : null);
        o00000ooOooOO0O.getClass();
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        if (o00000ooOooOO0O.OooOO0o(giftId)) {
            return;
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Object value = o000000O.OooOOo0().getValue();
        StringBuilder sb = new StringBuilder();
        String str = o00000ooOooOO0O.f45212OooO0O0;
        sb.append(str);
        sb.append(value);
        StringBuffer stringBuffer = new StringBuffer(o00000ooOooOO0O.OooO0o0(sb.toString(), ""));
        if (stringBuffer.length() > 0) {
            stringBuffer.append(",");
        }
        stringBuffer.append(giftId);
        String str2 = str + o000000O.OooOOo0().getValue();
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "content.toString()");
        o00000ooOooOO0O.OooO(str2, string);
    }
}
