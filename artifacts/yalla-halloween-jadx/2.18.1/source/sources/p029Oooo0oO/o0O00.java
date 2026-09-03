package p029Oooo0oO;

import androidx.appcompat.widget.o00000O0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00 extends Lambda implements Function1<Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2415Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2416Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(o00OOOOo o00ooooo2, CoroutineScope coroutineScope) {
        super(1);
        this.f2415Oooo0o = o00ooooo2;
        this.f2416Oooo0oO = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integer num) {
        int iIntValue = num.intValue();
        boolean z = iIntValue >= 0 && iIntValue < this.f2415Oooo0o.OooO0o().OooO00o();
        o00OOOOo o00ooooo2 = this.f2415Oooo0o;
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(this.f2416Oooo0oO, null, null, new o0O000o0(o00ooooo2, iIntValue, null), 3, null);
            return Boolean.TRUE;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
        sbOooO00o.append(o00ooooo2.OooO0o().OooO00o());
        sbOooO00o.append(')');
        throw new IllegalArgumentException(sbOooO00o.toString().toString());
    }
}
