package oO0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p176o00OoooO.oO00o000;
import p426o0OoO0Oo.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OoO.OooO0O0 f52745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f52746OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f52747OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f52748OooO0Oo;

    public o00Ooo(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        String strOooOO0o = p497o0o00Oo.OooOOO0.OooO0o().OooOO0o();
        o0O0O00 o0o0o00 = o0OO00O.f39846OooO00o;
        o0OoO.OooO0O0 oooO0O0 = new o0OoO.OooO0O0(fragmentActivity, strOooOO0o);
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "createWXAPI(fragmentActi…, Sp.key.wechatKey, true)");
        this.f52745OooO00o = oooO0O0;
        LiveEventBus.get("WECHAT_LOGIN").observe(fragmentActivity, new oO00o000(this, 1));
    }
}
