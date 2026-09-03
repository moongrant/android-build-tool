package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n*L\n223#1:284,2\n*E\n"})
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f10245OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10246OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o000000O<T>> f10247OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOo f10248OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f10249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOOO f10250OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o(@NotNull Oooo000<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f10249OooO0o = true;
        boolean z = event instanceof Oooo000.OooO0O0;
        int i = 0;
        ArrayDeque<o000000O<T>> arrayDeque = this.f10247OooO0OO;
        OooOo oooOo = this.f10248OooO0Oo;
        if (z) {
            Oooo000.OooO0O0 oooO0O0 = (Oooo000.OooO0O0) event;
            oooOo.OooO0O0(oooO0O0.f10302OooO0o0);
            this.f10250OooO0o0 = oooO0O0.f10301OooO0o;
            int i2 = OooO00o.$EnumSwitchMapping$0[oooO0O0.f10297OooO00o.ordinal()];
            int i3 = oooO0O0.f10299OooO0OO;
            List<o000000O<T>> list = oooO0O0.f10298OooO0O0;
            if (i2 == 1) {
                this.f10245OooO00o = i3;
                Iterator<Integer> it = RangesKt.downTo(list.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    arrayDeque.addFirst(list.get(((IntIterator) it).nextInt()));
                }
                return;
            }
            int i4 = oooO0O0.f10300OooO0Oo;
            if (i2 == 2) {
                this.f10246OooO0O0 = i4;
                arrayDeque.addAll(list);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                arrayDeque.clear();
                this.f10246OooO0O0 = i4;
                this.f10245OooO00o = i3;
                arrayDeque.addAll(list);
                return;
            }
        }
        if (event instanceof Oooo000.OooO00o) {
            Oooo000.OooO00o oooO00o = (Oooo000.OooO00o) event;
            oooOo.OooO0OO(oooO00o.f10292OooO00o, OooOOO0.OooO0OO.f10272OooO0OO);
            int i5 = OooO00o.$EnumSwitchMapping$0[oooO00o.f10292OooO00o.ordinal()];
            int i6 = oooO00o.f10295OooO0Oo;
            if (i5 == 1) {
                this.f10245OooO00o = i6;
                int iOooO00o = oooO00o.OooO00o();
                while (i < iOooO00o) {
                    arrayDeque.removeFirst();
                    i++;
                }
                return;
            }
            if (i5 != 2) {
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f10246OooO0O0 = i6;
            int iOooO00o2 = oooO00o.OooO00o();
            while (i < iOooO00o2) {
                arrayDeque.removeLast();
                i++;
            }
            return;
        }
        if (event instanceof Oooo000.OooO0OO) {
            Oooo000.OooO0OO oooO0OO = (Oooo000.OooO0OO) event;
            oooOo.OooO0O0(oooO0OO.f10303OooO00o);
            this.f10250OooO0o0 = oooO0OO.f10304OooO0O0;
        } else if (event instanceof Oooo000.OooO0o) {
            Oooo000.OooO0o oooO0o = (Oooo000.OooO0o) event;
            OooOOO oooOOO = oooO0o.f10306OooO0O0;
            if (oooOOO != null) {
                oooOo.OooO0O0(oooOOO);
            }
            OooOOO oooOOO2 = oooO0o.f10307OooO0OO;
            if (oooOOO2 != null) {
                this.f10250OooO0o0 = oooOOO2;
            }
            arrayDeque.clear();
            this.f10246OooO0O0 = 0;
            this.f10245OooO00o = 0;
            arrayDeque.add(new o000000O<>(0, oooO0o.f10305OooO00o));
        }
    }

    @NotNull
    public final List<Oooo000<T>> OooO0O0() {
        if (!this.f10249OooO0o) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        OooOOO oooOOOOooO0Oo = this.f10248OooO0Oo.OooO0Oo();
        ArrayDeque<o000000O<T>> arrayDeque = this.f10247OooO0OO;
        if (!arrayDeque.isEmpty()) {
            Oooo000.OooO0O0<Object> oooO0O0 = Oooo000.OooO0O0.f10296OooO0oO;
            arrayList.add(Oooo000.OooO0O0.OooO00o.OooO00o(CollectionsKt.toList(arrayDeque), this.f10245OooO00o, this.f10246OooO0O0, oooOOOOooO0Oo, this.f10250OooO0o0));
        } else {
            arrayList.add(new Oooo000.OooO0OO(oooOOOOooO0Oo, this.f10250OooO0o0));
        }
        return arrayList;
    }
}
