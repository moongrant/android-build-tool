package p089o000o000;

import androidx.paging.LoadType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O<T> implements o0000O00<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o000O<Object> f28758OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f28759OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00O<T>> f28760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f28761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f28762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f28763OooO0Oo;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.REFRESH.ordinal()] = 1;
            iArr[LoadType.PREPEND.ordinal()] = 2;
            iArr[LoadType.APPEND.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        o0000O0O.OooO0O0.OooO00o oooO00o = o0000O0O.OooO0O0.f28737OooO0oO;
        o0000O0O.OooO0O0<Object> insertEvent = o0000O0O.OooO0O0.f28738OooO0oo;
        Intrinsics.checkNotNullParameter(insertEvent, "insertEvent");
        f28758OooO0o = new o000O<>(insertEvent.f28740OooO0O0, insertEvent.f28741OooO0OO, insertEvent.f28742OooO0Oo);
    }

    public o000O(@NotNull List<o00O<T>> pages, int i, int i2) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f28760OooO00o = CollectionsKt.toMutableList((Collection) pages);
        this.f28761OooO0O0 = OooO0oO(pages);
        this.f28762OooO0OO = i;
        this.f28763OooO0Oo = i2;
    }

    public final int OooO() {
        Integer numMaxOrNull = ArraysKt.maxOrNull(((o00O) CollectionsKt.last((List) this.f28760OooO00o)).f28897OooO00o);
        Intrinsics.checkNotNull(numMaxOrNull);
        return numMaxOrNull.intValue();
    }

    @Override // p089o000o000.o0000O00
    public final int OooO00o() {
        return this.f28761OooO0O0;
    }

    @Override // p089o000o000.o0000O00
    public final int OooO0O0() {
        return this.f28762OooO0OO;
    }

    @Override // p089o000o000.o0000O00
    public final int OooO0OO() {
        return this.f28763OooO0Oo;
    }

    @Override // p089o000o000.o0000O00
    @NotNull
    public final T OooO0Oo(int i) {
        int size = this.f28760OooO00o.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.f28760OooO00o.get(i2).f28898OooO0O0.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.f28760OooO00o.get(i2).f28898OooO0O0.get(i);
    }

    public final int OooO0o(IntRange intRange) {
        boolean z;
        Iterator<o00O<T>> it = this.f28760OooO00o.iterator();
        int size = 0;
        while (it.hasNext()) {
            o00O<T> next = it.next();
            int[] iArr = next.f28897OooO00o;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (intRange.contains(iArr[i])) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                size += next.f28898OooO0O0.size();
                it.remove();
            }
        }
        return size;
    }

    @NotNull
    public final o00OO0O0.OooO00o OooO0o0(int i) {
        IntRange indices;
        int iIntValue = i - this.f28762OooO0OO;
        boolean z = false;
        int i2 = 0;
        while (iIntValue >= this.f28760OooO00o.get(i2).f28898OooO0O0.size() && i2 < CollectionsKt.getLastIndex(this.f28760OooO00o)) {
            iIntValue -= this.f28760OooO00o.get(i2).f28898OooO0O0.size();
            i2++;
        }
        o00O<T> o00o2 = this.f28760OooO00o.get(i2);
        int i3 = i - this.f28762OooO0OO;
        int size = ((getSize() - i) - this.f28763OooO0Oo) - 1;
        int iOooO0oo = OooO0oo();
        int iOooO = OooO();
        int i4 = o00o2.f28899OooO0OO;
        List<Integer> list = o00o2.f28900OooO0Oo;
        if (list != null && (indices = CollectionsKt.getIndices(list)) != null && indices.contains(iIntValue)) {
            z = true;
        }
        if (z) {
            iIntValue = o00o2.f28900OooO0Oo.get(iIntValue).intValue();
        }
        return new o00OO0O0.OooO00o(i4, iIntValue, i3, size, iOooO0oo, iOooO);
    }

    public final int OooO0oO(List<o00O<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((o00O) it.next()).f28898OooO0O0.size();
        }
        return size;
    }

    public final int OooO0oo() {
        Integer numMinOrNull = ArraysKt.minOrNull(((o00O) CollectionsKt.first((List) this.f28760OooO00o)).f28897OooO00o);
        Intrinsics.checkNotNull(numMinOrNull);
        return numMinOrNull.intValue();
    }

    @Override // p089o000o000.o0000O00
    public final int getSize() {
        return this.f28762OooO0OO + this.f28761OooO0O0 + this.f28763OooO0Oo;
    }

    @NotNull
    public final String toString() {
        int i = this.f28761OooO0O0;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(OooO0Oo(i2));
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("[(");
        sbOooO0o0.append(this.f28762OooO0OO);
        sbOooO0o0.append(" placeholders), ");
        sbOooO0o0.append(strJoinToString$default);
        sbOooO0o0.append(", (");
        return o0ooOOo.OooO00o(sbOooO0o0, this.f28763OooO0Oo, " placeholders)]");
    }
}
