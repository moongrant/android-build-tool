package p023Oooo00O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o0000OO0> f1177OooO00o;

    public o00OOO0(o0O0O00 o0o0o00, float f, float f2) {
        IntRange intRangeUntil = RangesKt.until(0, o0o0o00.OooO0O0());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(new o0000OO0(f, f2, o0o0o00.OooO00o(((IntIterator) it).nextInt())));
        }
        this.f1177OooO00o = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<Oooo00O.o0000OO0>] */
    @Override // p023Oooo00O.o000000
    public final o000OO get(int i) {
        return (o0000OO0) this.f1177OooO00o.get(i);
    }
}
