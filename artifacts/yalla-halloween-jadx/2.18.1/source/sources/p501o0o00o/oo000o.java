package p501o0o00o;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41531Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(GiftBlindWebManager giftBlindWebManager) {
        super(0);
        this.f41531Oooo0o = giftBlindWebManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), R.anim.easy_dialog_anim_enter_bottom_alpha);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(getApplica…_anim_enter_bottom_alpha)");
        this.f41531Oooo0o.f20887OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
