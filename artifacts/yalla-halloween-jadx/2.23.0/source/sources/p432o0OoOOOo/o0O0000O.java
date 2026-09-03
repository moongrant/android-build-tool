package p432o0OoOOOo;

import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p377o0OOoOo.o0000OO0;
import p427o0OoOO00.oo000o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends Lambda implements Function1<RechargeMenuCreateOrderModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45948OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(o00OOOOo o00ooooo2) {
        super(1);
        this.f45948OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
        RechargeMenuCreateOrderModel it = rechargeMenuCreateOrderModel;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO000.OooO00o("102023");
        o00OOOOo o00ooooo2 = this.f45948OooO0Oo;
        FragmentActivity fragmentActivity = o00ooooo2.f45920OooO00o;
        boolean z = true;
        if (!oo000o.OooO0O0(fragmentActivity)) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.google_play_useless);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (!o00ooooo2.f45930OooOO0o) {
            o00ooooo2.f45930OooOO0o = true;
            o00OOOOo.OooO0oO(o00ooooo2, null, 3);
            o00ooooo2.OooO0o0().createOrder(it).observe(fragmentActivity, new o0000OO0(new o0oOOo(o00ooooo2, it), new o0O0o(o00ooooo2, it), new o0(o00ooooo2), true));
        }
        return Unit.INSTANCE;
    }
}
