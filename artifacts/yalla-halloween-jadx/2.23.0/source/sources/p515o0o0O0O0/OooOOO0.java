package p515o0o0O0O0;

import android.app.Activity;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f51782OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Activity activity) {
        super(0);
        this.f51782OooO0Oo = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity.OooO00o.OooO00o(this.f51782OooO0Oo, PremiumLevel.Premium0);
        return null;
    }
}
