package p465o0Oooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0OOOO0o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p343o0OOO0oo.OooOO0;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f46875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f46876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f46877OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f46878OooO0Oo;

    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o000O0O0 o000o0o1 = o000O0O0.this;
            if (o000o0o1.f46878OooO0Oo) {
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    if (!StringsKt.isBlank(str)) {
                        Function1<? super String, Unit> function1 = o000o0o1.f46876OooO0O0;
                        if (function1 != null) {
                            function1.invoke(str);
                            return;
                        }
                        return;
                    }
                    Function0<Unit> function0 = o000o0o1.f46877OooO0OO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }
    }

    public o000O0O0(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        String strOooOO0o = o00Oo0.OooO0o().OooOO0o();
        int i = OooOO0.f43608OooO00o;
        OooO0O0 oooO0O0 = new OooO0O0(fragmentActivity, strOooOO0o);
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "createWXAPI(fragmentActi…, Sp.key.wechatKey, true)");
        this.f46875OooO00o = oooO0O0;
        LiveEventBus.get("WECHAT_LOGIN").observe(fragmentActivity, new OooO00o());
    }
}
