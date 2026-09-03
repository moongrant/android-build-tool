package p381o0OOoOo0;

import android.app.Activity;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f43261OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Activity activity) {
        super(0);
        this.f43261OooO0Oo = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f26673Oooo0oO;
        PremiumActivity.OooO00o.OooO00o(this.f43261OooO0Oo, PremiumLevel.Premium1);
        return Unit.INSTANCE;
    }
}
