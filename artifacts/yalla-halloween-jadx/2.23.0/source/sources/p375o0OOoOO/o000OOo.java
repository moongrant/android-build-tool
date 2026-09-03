package p375o0OOoOO;

import android.app.Activity;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f44055OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(Activity activity) {
        super(0);
        this.f44055OooO0Oo = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity.OooO00o.OooO00o(this.f44055OooO0Oo, PremiumLevel.Premium1);
        return Unit.INSTANCE;
    }
}
