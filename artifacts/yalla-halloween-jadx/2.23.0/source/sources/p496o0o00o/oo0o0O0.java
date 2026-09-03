package p496o0o00o;

import android.content.Intent;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49199OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(PremiumActivity premiumActivity) {
        super(0);
        this.f49199OooO0Oo = premiumActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PremiumActivity premiumActivity = this.f49199OooO0Oo;
        premiumActivity.startActivity(new Intent(premiumActivity, (Class<?>) AristocracyPresentationActivity.class));
        return Unit.INSTANCE;
    }
}
