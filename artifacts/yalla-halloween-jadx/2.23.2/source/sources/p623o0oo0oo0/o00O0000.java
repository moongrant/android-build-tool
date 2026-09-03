package p623o0oo0oo0;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0000 extends Lambda implements Function0<oo00o> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f57642OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o00oOoo o00oooo2) {
        super(0);
        this.f57642OooO0Oo = o00oooo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final oo00o invoke() {
        o00oOoo o00oooo2 = this.f57642OooO0Oo;
        Object obj = null;
        for (Object obj2 : SequencesKt.map(CollectionsKt.asSequence(o00oooo2.f57649OooO00o.getLayoutInfo().getVisibleItemsInfo()), o0O0ooO.f57653OooO0Oo)) {
            oo00o oo00oVar = (oo00o) obj2;
            if (oo00oVar.OooO0O0() <= o00oooo2.f57650OooO0O0.invoke(o00oooo2, oo00oVar).intValue()) {
                obj = obj2;
            }
        }
        return (oo00o) obj;
    }
}
