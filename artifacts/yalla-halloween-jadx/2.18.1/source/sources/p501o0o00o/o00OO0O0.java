package p501o0o00o;

import android.content.Context;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0O0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumLevel f41510Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(PremiumLevel premiumLevel) {
        super(0);
        this.f41510Oooo0o = premiumLevel;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        oooO00o.OooO00o(contextOooO0O0, this.f41510Oooo0o);
        return null;
    }
}
