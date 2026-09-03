package p616o0oo0oO;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 extends Lambda implements Function0<o000O00O> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f57098OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(o000OO o000oo2) {
        super(0);
        this.f57098OooO0Oo = o000oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o000O00O invoke() {
        o000OO o000oo2 = this.f57098OooO0Oo;
        Object obj = null;
        for (Object obj2 : SequencesKt.map(CollectionsKt.asSequence(o000oo2.f57103OooO00o.getLayoutInfo().getVisibleItemsInfo()), o0000O0O.f57099OooO0Oo)) {
            o000O00O o000o00o2 = (o000O00O) obj2;
            if (o000o00o2.OooO0O0() <= o000oo2.f57104OooO0O0.invoke(o000oo2, o000o00o2).intValue()) {
                obj = obj2;
            }
        }
        return (o000O00O) obj;
    }
}
