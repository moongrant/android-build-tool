package p520o0o0O0oo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53373OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        super(0);
        this.f53373OooO0Oo = giftCustomMadeWebManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oO000o00.easy_dialog_anim_enter_bottom_alpha);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(getApplica…_anim_enter_bottom_alpha)");
        this.f53373OooO0Oo.f27997OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
