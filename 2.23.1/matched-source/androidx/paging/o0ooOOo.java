package androidx.paging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPagePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagePresenter.kt\nandroidx/paging/PagePresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,375:1\n1#2:376\n1360#3:377\n1446#3,5:378\n12774#4,2:383\n*S KotlinDebug\n*F\n+ 1 PagePresenter.kt\nandroidx/paging/PagePresenter\n*L\n80#1:377\n80#1:378,5\n245#1:383,2\n*E\n"})
public final class o0ooOOo<T> implements o000Oo0<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o0ooOOo<Object> f10513OooO0o0 = new o0ooOOo<>(Oooo000.OooO0O0.f10296OooO0oO);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o000000O<T>> f10514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10515OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f10516OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10517OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0ooOOo(@NotNull List<o000000O<T>> pages, int i, int i2) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f10514OooO00o = CollectionsKt.toMutableList((Collection) pages);
        Iterator<T> it = pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((o000000O) it.next()).f10389OooO0O0.size();
        }
        this.f10515OooO0O0 = size;
        this.f10516OooO0OO = i;
        this.f10517OooO0Oo = i2;
    }

    @Override // p101o000oo.o000Oo0
    public final int OooO00o() {
        return this.f10515OooO0O0;
    }

    @Override // p101o000oo.o000Oo0
    public final int OooO0O0() {
        return this.f10516OooO0OO;
    }

    @Override // p101o000oo.o000Oo0
    public final int OooO0OO() {
        return this.f10517OooO0Oo;
    }

    @Override // p101o000oo.o000Oo0
    @NotNull
    public final T OooO0Oo(int i) {
        List<o000000O<T>> list = this.f10514OooO00o;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = list.get(i2).f10389OooO0O0.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return list.get(i2).f10389OooO0O0.get(i);
    }

    public final int OooO0o(IntRange intRange) {
        boolean z;
        Iterator<o000000O<T>> it = this.f10514OooO00o.iterator();
        int size = 0;
        while (it.hasNext()) {
            o000000O<T> next = it.next();
            int[] iArr = next.f10388OooO00o;
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
                size += next.f10389OooO0O0.size();
                it.remove();
            }
        }
        return size;
    }

    @NotNull
    public final o00000.OooO00o OooO0o0(int i) {
        List<o000000O<T>> list;
        IntRange indices;
        int iIntValue = i - this.f10516OooO0OO;
        boolean z = false;
        int i2 = 0;
        while (true) {
            list = this.f10514OooO00o;
            if (iIntValue < list.get(i2).f10389OooO0O0.size() || i2 >= CollectionsKt.getLastIndex(list)) {
                break;
            }
            iIntValue -= list.get(i2).f10389OooO0O0.size();
            i2++;
        }
        o000000O<T> o000000o2 = list.get(i2);
        int i3 = i - this.f10516OooO0OO;
        int size = ((getSize() - i) - this.f10517OooO0Oo) - 1;
        Integer numMinOrNull = ArraysKt.minOrNull(((o000000O) CollectionsKt.first((List) list)).f10388OooO00o);
        Intrinsics.checkNotNull(numMinOrNull);
        int iIntValue2 = numMinOrNull.intValue();
        Integer numMaxOrNull = ArraysKt.maxOrNull(((o000000O) CollectionsKt.last((List) list)).f10388OooO00o);
        Intrinsics.checkNotNull(numMaxOrNull);
        int iIntValue3 = numMaxOrNull.intValue();
        int i4 = o000000o2.f10390OooO0OO;
        List<Integer> list2 = o000000o2.f10391OooO0Oo;
        if (list2 != null && (indices = CollectionsKt.getIndices(list2)) != null && indices.contains(iIntValue)) {
            z = true;
        }
        if (z) {
            iIntValue = list2.get(iIntValue).intValue();
        }
        return new o00000.OooO00o(i4, iIntValue, i3, size, iIntValue2, iIntValue3);
    }

    @Override // p101o000oo.o000Oo0
    public final int getSize() {
        return this.f10516OooO0OO + this.f10515OooO0O0 + this.f10517OooO0Oo;
    }

    @NotNull
    public final String toString() {
        int i = this.f10515OooO0O0;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(OooO0Oo(i2));
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.f10516OooO0OO);
        sb.append(" placeholders), ");
        sb.append(strJoinToString$default);
        sb.append(", (");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f10517OooO0Oo, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(@NotNull Oooo000.OooO0O0<T> insertEvent) {
        this(insertEvent.f10298OooO0O0, insertEvent.f10299OooO0OO, insertEvent.f10300OooO0Oo);
        Intrinsics.checkNotNullParameter(insertEvent, "insertEvent");
    }
}
