package p432o0OoOOOo;

import com.yalla.yalla.data.db.table.PayOrder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45951OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(PayOrder payOrder, o00OOOOo o00ooooo2) {
        super(0);
        this.f45950OooO0Oo = o00ooooo2;
        this.f45951OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o00OOOOo o00ooooo2 = this.f45950OooO0Oo;
        o00OOOOo.OooO0oO(o00ooooo2, o00ooooo2.f45920OooO00o.getString(oO00OOo0.Validating_your_purchase), 2);
        PayOrder payOrder = this.f45951OooO0o0;
        if (payOrder.getIsConsume()) {
            o00OOOOo.OooO00o(payOrder, o00ooooo2);
            return null;
        }
        o00OOOOo.OooO0OO(payOrder, o00ooooo2);
        return null;
    }
}
