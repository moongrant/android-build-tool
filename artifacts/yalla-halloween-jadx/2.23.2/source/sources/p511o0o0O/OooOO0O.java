package p511o0o0O;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f50922OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        super(0);
        this.f50922OooO0Oo = giftCustomMadeWebManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_enter_bottom_alpha);
        Intrinsics.checkNotNullExpressionValue(animationLoadAnimation, "loadAnimation(...)");
        this.f50922OooO0Oo.f27525OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
