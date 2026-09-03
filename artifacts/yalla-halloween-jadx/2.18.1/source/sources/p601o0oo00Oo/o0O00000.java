package p601o0oo00Oo;

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

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00000 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0O00000 f48166Oooo0o = new o0O00000();

    public o0O00000() {
        super(0);
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
        oooO00o.OooO00o(contextOooO0O0, PremiumLevel.Premium0);
        return null;
    }
}
