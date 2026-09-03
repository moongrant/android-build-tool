package p027Oooo0o;

import androidx.appcompat.widget.o00000O0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1965Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f1966Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o000O00O o000o00o2, CoroutineScope coroutineScope) {
        super(1);
        this.f1965Oooo0o = o000o00o2;
        this.f1966Oooo0oO = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integer num) {
        int iIntValue = num.intValue();
        boolean z = iIntValue >= 0 && iIntValue < this.f1965Oooo0o.OooO0oO().OooO00o();
        o000O00O o000o00o2 = this.f1965Oooo0o;
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(this.f1966Oooo0oO, null, null, new o00O000o(o000o00o2, iIntValue, null), 3, null);
            return Boolean.TRUE;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
        sbOooO00o.append(o000o00o2.OooO0oO().OooO00o());
        sbOooO00o.append(')');
        throw new IllegalArgumentException(sbOooO00o.toString().toString());
    }
}
