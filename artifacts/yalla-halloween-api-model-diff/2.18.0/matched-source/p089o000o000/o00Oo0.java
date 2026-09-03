package p089o000o000;

import androidx.annotation.VisibleForTesting;
import androidx.paging.LoadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting(otherwise = 2)
public final class o00Oo0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f29050OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f29051OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o00O<T>> f29052OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0000Ooo f29053OooO0Oo = new o0000Ooo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f29054OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000000O f29055OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            iArr[LoadType.REFRESH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void OooO00o(@NotNull o0000O0O<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f29054OooO0o = true;
        int i = 0;
        if (event instanceof o0000O0O.OooO0O0) {
            o0000O0O.OooO0O0 oooO0O0 = (o0000O0O.OooO0O0) event;
            this.f29053OooO0Oo.OooO0OO(oooO0O0.f28763OooO0o0);
            this.f29055OooO0o0 = oooO0O0.f28762OooO0o;
            int i2 = OooO00o.$EnumSwitchMapping$0[oooO0O0.f28758OooO00o.ordinal()];
            if (i2 == 1) {
                this.f29050OooO00o = oooO0O0.f28760OooO0OO;
                Iterator<Integer> it = RangesKt.downTo(oooO0O0.f28759OooO0O0.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    this.f29052OooO0OO.addFirst(oooO0O0.f28759OooO0O0.get(((IntIterator) it).nextInt()));
                }
                return;
            }
            if (i2 == 2) {
                this.f29051OooO0O0 = oooO0O0.f28761OooO0Oo;
                this.f29052OooO0OO.addAll(oooO0O0.f28759OooO0O0);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                this.f29052OooO0OO.clear();
                this.f29051OooO0O0 = oooO0O0.f28761OooO0Oo;
                this.f29050OooO00o = oooO0O0.f28760OooO0OO;
                this.f29052OooO0OO.addAll(oooO0O0.f28759OooO0O0);
                return;
            }
        }
        if (event instanceof o0000O0O.OooO00o) {
            o0000O0O.OooO00o oooO00o = (o0000O0O.OooO00o) event;
            this.f29053OooO0Oo.OooO0O0(oooO00o.f28752OooO00o, o000000.OooO0OO.f28718OooO0OO);
            int i3 = OooO00o.$EnumSwitchMapping$0[oooO00o.f28752OooO00o.ordinal()];
            if (i3 == 1) {
                this.f29050OooO00o = oooO00o.f28755OooO0Oo;
                int iOooO00o = oooO00o.OooO00o();
                while (i < iOooO00o) {
                    this.f29052OooO0OO.removeFirst();
                    i++;
                }
                return;
            }
            if (i3 != 2) {
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f29051OooO0O0 = oooO00o.f28755OooO0Oo;
            int iOooO00o2 = oooO00o.OooO00o();
            while (i < iOooO00o2) {
                this.f29052OooO0OO.removeLast();
                i++;
            }
            return;
        }
        if (event instanceof o0000O0O.OooO0OO) {
            o0000O0O.OooO0OO oooO0OO = (o0000O0O.OooO0OO) event;
            this.f29053OooO0Oo.OooO0OO(oooO0OO.f28764OooO00o);
            this.f29055OooO0o0 = oooO0OO.f28765OooO0O0;
        } else if (event instanceof o0000O0O.OooO0o) {
            o0000O0O.OooO0o oooO0o = (o0000O0O.OooO0o) event;
            o000000O o000000o2 = oooO0o.f28767OooO0O0;
            if (o000000o2 != null) {
                this.f29053OooO0Oo.OooO0OO(o000000o2);
            }
            o000000O o000000o3 = oooO0o.f28768OooO0OO;
            if (o000000o3 != null) {
                this.f29055OooO0o0 = o000000o3;
            }
            this.f29052OooO0OO.clear();
            this.f29051OooO0O0 = 0;
            this.f29050OooO00o = 0;
            this.f29052OooO0OO.add(new o00O<>(0, oooO0o.f28766OooO00o));
        }
    }

    @NotNull
    public final List<o0000O0O<T>> OooO0O0() {
        if (!this.f29054OooO0o) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        o000000O o000000oOooO0Oo = this.f29053OooO0Oo.OooO0Oo();
        if (!this.f29052OooO0OO.isEmpty()) {
            arrayList.add(o0000O0O.OooO0O0.f28756OooO0oO.OooO00o(CollectionsKt.toList(this.f29052OooO0OO), this.f29050OooO00o, this.f29051OooO0O0, o000000oOooO0Oo, this.f29055OooO0o0));
        } else {
            arrayList.add(new o0000O0O.OooO0OO(o000000oOooO0Oo, this.f29055OooO0o0));
        }
        return arrayList;
    }
}
