package p436o0OoOOo;

import com.yalla.yalla.data.db.table.PayOrder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f47063OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(PayOrder payOrder, o0000 o0000Var) {
        super(0);
        this.f47062OooO0Oo = o0000Var;
        this.f47063OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o0000 o0000Var = this.f47062OooO0Oo;
        o0000.OooO0oO(o0000Var, o0000Var.f47023OooO00o.getString(o000000.Validating_your_purchase), 2);
        PayOrder payOrder = this.f47063OooO0o0;
        if (payOrder.getIsConsume()) {
            o0000.OooO00o(payOrder, o0000Var);
            return null;
        }
        o0000.OooO0OO(payOrder, o0000Var);
        return null;
    }
}
