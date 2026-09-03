package p436o0OoOOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p384o0OOoo0O.o000oOoO;
import p429o0OoOO.o00Ooo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<RechargeMenuCreateOrderModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47064OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o0000 o0000Var) {
        super(1);
        this.f47064OooO0Oo = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
        RechargeMenuCreateOrderModel it = rechargeMenuCreateOrderModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO00o.OooO0O0("102023");
        o0000 o0000Var = this.f47064OooO0Oo;
        FragmentActivity fragmentActivity = o0000Var.f47023OooO00o;
        boolean z = true;
        if (!o00Ooo.OooO0O0(fragmentActivity)) {
            String strOooO0OO = o0000.OooO0OO(o000000.google_play_useless);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (!o0000Var.f47033OooOO0o) {
            o0000Var.f47033OooOO0o = true;
            o0000.OooO0oO(o0000Var, null, 3);
            o0000Var.OooO0o0().createOrder(it).observe(fragmentActivity, new o000oOoO(new o000OO(o0000Var, it), new o0000O(o0000Var, it), new o0000OO0(o0000Var), true));
        }
        return Unit.INSTANCE;
    }
}
