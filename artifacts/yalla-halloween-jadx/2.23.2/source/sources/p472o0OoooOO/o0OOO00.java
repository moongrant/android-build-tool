package p472o0OoooOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OOOO.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p349o0OOOOoO.o00O0O;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f47910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f47911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f47912OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f47913OooO0Oo;

    public o0OOO00(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        String strOooOO0o = o00Ooo.OooO0o().OooOO0o();
        int i = o00O0O.f42850OooO00o;
        OooO0O0 oooO0O0 = new OooO0O0(fragmentActivity, strOooOO0o);
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "createWXAPI(...)");
        this.f47910OooO00o = oooO0O0;
        LiveEventBus.get("WECHAT_LOGIN").observe(fragmentActivity, new o0OO(this, 0));
    }
}
