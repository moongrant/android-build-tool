package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oO.oo00o;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LOooo0oO/oo00o;", "", "it", "", "invoke", "(LOooo0oO/oo00o;ILo000oOoO/oOO00O;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class LazyGridDslKt$itemsIndexed$10 extends Lambda implements Function4<oo00o, Integer, oOO00O, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(oo00o oo00oVar, Integer num, oOO00O ooo00o, Integer num2) {
        int i;
        oo00o items = oo00oVar;
        int iIntValue = num.intValue();
        oOO00O ooo00o2 = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 14) == 0) {
            i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
        }
        if ((i & 731) != 146 || !ooo00o2.OooOo0()) {
            throw null;
        }
        ooo00o2.OooOoo0();
        return Unit.INSTANCE;
    }
}
