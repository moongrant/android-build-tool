package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
public final class o00oO0o<Key, Value> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Channel<Integer> f10439OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O000 f10440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f10441OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f10442OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f10444OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10445OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f10446OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f10447OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Channel<Integer> f10448OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f10449OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final OooOo f10450OooOO0o;

    @SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,397:1\n107#2,10:398\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n*L\n391#1:398,10\n*E\n"})
    public static final class OooO00o<Key, Value> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Mutex f10451OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o00oO0o<Key, Value> f10452OooO0O0;

        public OooO00o(@NotNull o00O000 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f10451OooO00o = MutexKt.Mutex$default(false, 1, null);
            this.f10452OooO0O0 = new o00oO0o<>(config);
        }
    }

    public /* synthetic */ class OooO0O0 {
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

    public o00oO0o(o00O000 o00o001) {
        this.f10440OooO00o = o00o001;
        ArrayList arrayList = new ArrayList();
        this.f10441OooO0O0 = arrayList;
        this.f10442OooO0OO = arrayList;
        this.f10439OooO = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f10448OooOO0 = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f10449OooOO0O = new LinkedHashMap();
        OooOo oooOo = new OooOo();
        oooOo.OooO0OO(LoadType.REFRESH, OooOOO0.OooO0O0.f10270OooO0O0);
        this.f10450OooOO0o = oooOo;
    }

    @NotNull
    public final o000000<Key, Value> OooO00o(@Nullable o00000.OooO00o oooO00o) {
        Integer numValueOf;
        int i;
        ArrayList arrayList = this.f10442OooO0OO;
        List list = CollectionsKt.toList(arrayList);
        o00O000 o00o001 = this.f10440OooO00o;
        if (oooO00o != null) {
            int iOooO0Oo = OooO0Oo();
            int i2 = -this.f10443OooO0Oo;
            int lastIndex = CollectionsKt.getLastIndex(arrayList) - this.f10443OooO0Oo;
            int i3 = i2;
            while (true) {
                i = oooO00o.f10382OooO0o0;
                if (i3 >= i) {
                    break;
                }
                iOooO0Oo += i3 > lastIndex ? o00o001.f35505OooO00o : ((o0O0O00.OooO0O0.OooO0OO) arrayList.get(this.f10443OooO0Oo + i3)).f10459OooO0Oo.size();
                i3++;
            }
            int i4 = iOooO0Oo + oooO00o.f10381OooO0o;
            if (i < i2) {
                i4 -= o00o001.f35505OooO00o;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new o000000<>(list, numValueOf, o00o001, OooO0Oo());
    }

    public final void OooO0O0(@NotNull Oooo000.OooO00o<Value> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int iOooO00o = event.OooO00o();
        ArrayList arrayList = this.f10442OooO0OO;
        if (!(iOooO00o <= arrayList.size())) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + event.OooO00o()).toString());
        }
        LinkedHashMap linkedHashMap = this.f10449OooOO0O;
        LoadType loadType = event.f10292OooO00o;
        linkedHashMap.remove(loadType);
        this.f10450OooOO0o.OooO0OO(loadType, OooOOO0.OooO0OO.f10272OooO0OO);
        int i = OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        ArrayList arrayList2 = this.f10441OooO0O0;
        int i2 = event.f10295OooO0Oo;
        if (i == 2) {
            int iOooO00o2 = event.OooO00o();
            for (int i3 = 0; i3 < iOooO00o2; i3++) {
                arrayList2.remove(0);
            }
            this.f10443OooO0Oo -= event.OooO00o();
            this.f10445OooO0o0 = i2 != Integer.MIN_VALUE ? i2 : 0;
            int i4 = this.f10446OooO0oO + 1;
            this.f10446OooO0oO = i4;
            this.f10439OooO.mo5733trySendJP2dKIU(Integer.valueOf(i4));
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("cannot drop " + loadType);
        }
        int iOooO00o3 = event.OooO00o();
        for (int i5 = 0; i5 < iOooO00o3; i5++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        this.f10444OooO0o = i2 != Integer.MIN_VALUE ? i2 : 0;
        int i6 = this.f10447OooO0oo + 1;
        this.f10447OooO0oo = i6;
        this.f10448OooOO0.mo5733trySendJP2dKIU(Integer.valueOf(i6));
    }

    @Nullable
    public final Oooo000.OooO00o<Value> OooO0OO(@NotNull LoadType loadType, @NotNull o00000 hint) {
        int iOooO0Oo;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
        o00O000 o00o001 = this.f10440OooO00o;
        Oooo000.OooO00o<Value> oooO00o = null;
        if (o00o001.f35510OooO0o0 == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f10442OooO0OO;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        int size = 0;
        while (it.hasNext()) {
            size += ((o0O0O00.OooO0O0.OooO0OO) it.next()).f10459OooO0Oo.size();
        }
        int i2 = o00o001.f35510OooO0o0;
        if (size <= i2) {
            return null;
        }
        if (!(loadType != LoadType.REFRESH)) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < arrayList.size()) {
            Iterator it2 = arrayList.iterator();
            int size2 = 0;
            while (it2.hasNext()) {
                size2 += ((o0O0O00.OooO0O0.OooO0OO) it2.next()).f10459OooO0Oo.size();
            }
            if (size2 - i4 <= i2) {
                break;
            }
            int[] iArr = OooO0O0.$EnumSwitchMapping$0;
            int size3 = iArr[loadType.ordinal()] == 2 ? ((o0O0O00.OooO0O0.OooO0OO) arrayList.get(i3)).f10459OooO0Oo.size() : ((o0O0O00.OooO0O0.OooO0OO) arrayList.get(CollectionsKt.getLastIndex(arrayList) - i3)).f10459OooO0Oo.size();
            if (((iArr[loadType.ordinal()] == 2 ? hint.f10377OooO00o : hint.f10378OooO0O0) - i4) - size3 < o00o001.f35506OooO0O0) {
                break;
            }
            i4 += size3;
            i3++;
        }
        if (i3 != 0) {
            int[] iArr2 = OooO0O0.$EnumSwitchMapping$0;
            int lastIndex = iArr2[loadType.ordinal()] == 2 ? -this.f10443OooO0Oo : (CollectionsKt.getLastIndex(arrayList) - this.f10443OooO0Oo) - (i3 - 1);
            int lastIndex2 = iArr2[loadType.ordinal()] == 2 ? (i3 - 1) - this.f10443OooO0Oo : CollectionsKt.getLastIndex(arrayList) - this.f10443OooO0Oo;
            if (o00o001.f35507OooO0OO) {
                if (loadType == LoadType.PREPEND) {
                    iOooO0Oo = OooO0Oo();
                } else {
                    iOooO0Oo = o00o001.f35507OooO0OO ? this.f10444OooO0o : 0;
                }
                i = iOooO0Oo + i4;
            }
            oooO00o = new Oooo000.OooO00o<>(loadType, lastIndex, lastIndex2, i);
        }
        return oooO00o;
    }

    public final int OooO0Oo() {
        if (this.f10440OooO00o.f35507OooO0OO) {
            return this.f10445OooO0o0;
        }
        return 0;
    }

    @NotNull
    public final Oooo000.OooO0O0 OooO0o(@NotNull o0O0O00.OooO0O0.OooO0OO oooO0OO, @NotNull LoadType loadType) {
        int size;
        Intrinsics.checkNotNullParameter(oooO0OO, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int[] iArr = OooO0O0.$EnumSwitchMapping$0;
        int i = iArr[loadType.ordinal()];
        if (i == 1) {
            size = 0;
        } else if (i == 2) {
            size = 0 - this.f10443OooO0Oo;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            size = (this.f10442OooO0OO.size() - this.f10443OooO0Oo) - 1;
        }
        List pages = CollectionsKt.listOf(new o000000O(size, oooO0OO.f10459OooO0Oo));
        int i2 = iArr[loadType.ordinal()];
        o00O000 o00o001 = this.f10440OooO00o;
        OooOo oooOo = this.f10450OooOO0o;
        if (i2 == 1) {
            Oooo000.OooO0O0<Object> oooO0O0 = Oooo000.OooO0O0.f10296OooO0oO;
            return Oooo000.OooO0O0.OooO00o.OooO00o(pages, OooO0Oo(), o00o001.f35507OooO0OO ? this.f10444OooO0o : 0, oooOo.OooO0Oo(), null);
        }
        if (i2 == 2) {
            Oooo000.OooO0O0<Object> oooO0O1 = Oooo000.OooO0O0.f10296OooO0oO;
            int iOooO0Oo = OooO0Oo();
            OooOOO sourceLoadStates = oooOo.OooO0Oo();
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new Oooo000.OooO0O0(LoadType.PREPEND, pages, iOooO0Oo, -1, sourceLoadStates, null);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Oooo000.OooO0O0<Object> oooO0O2 = Oooo000.OooO0O0.f10296OooO0oO;
        int i3 = o00o001.f35507OooO0OO ? this.f10444OooO0o : 0;
        OooOOO sourceLoadStates2 = oooOo.OooO0Oo();
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(sourceLoadStates2, "sourceLoadStates");
        return new Oooo000.OooO0O0(LoadType.APPEND, pages, -1, i3, sourceLoadStates2, null);
    }

    @CheckResult
    public final boolean OooO0o0(int i, @NotNull LoadType loadType, @NotNull o0O0O00.OooO0O0.OooO0OO<Key, Value> page) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int i2 = OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        ArrayList arrayList = this.f10441OooO0O0;
        ArrayList arrayList2 = this.f10442OooO0OO;
        if (i2 != 1) {
            LinkedHashMap linkedHashMap = this.f10449OooOO0O;
            if (i2 != 2) {
                if (i2 == 3) {
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (i != this.f10447OooO0oo) {
                        return false;
                    }
                    arrayList.add(page);
                    int iCoerceAtLeast = page.f10463OooO0oo;
                    if (iCoerceAtLeast == Integer.MIN_VALUE) {
                        iCoerceAtLeast = RangesKt.coerceAtLeast((this.f10440OooO00o.f35507OooO0OO ? this.f10444OooO0o : 0) - page.f10459OooO0Oo.size(), 0);
                    }
                    this.f10444OooO0o = iCoerceAtLeast != Integer.MIN_VALUE ? iCoerceAtLeast : 0;
                    linkedHashMap.remove(LoadType.APPEND);
                }
            } else {
                if (!(!arrayList2.isEmpty())) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (i != this.f10446OooO0oO) {
                    return false;
                }
                arrayList.add(0, page);
                this.f10443OooO0Oo++;
                int iCoerceAtLeast2 = page.f10462OooO0oO;
                if (iCoerceAtLeast2 == Integer.MIN_VALUE) {
                    iCoerceAtLeast2 = RangesKt.coerceAtLeast(OooO0Oo() - page.f10459OooO0Oo.size(), 0);
                }
                this.f10445OooO0o0 = iCoerceAtLeast2 != Integer.MIN_VALUE ? iCoerceAtLeast2 : 0;
                linkedHashMap.remove(LoadType.PREPEND);
            }
        } else {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (!(i == 0)) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            arrayList.add(page);
            this.f10443OooO0Oo = 0;
            int i3 = page.f10463OooO0oo;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f10444OooO0o = i3;
            int i4 = page.f10462OooO0oO;
            this.f10445OooO0o0 = i4 != Integer.MIN_VALUE ? i4 : 0;
        }
        return true;
    }
}
