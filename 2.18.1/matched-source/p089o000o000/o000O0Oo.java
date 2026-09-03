package p089o000o000;

import androidx.annotation.CheckResult;
import androidx.paging.LoadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo<Key, Value> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Channel<Integer> f28856OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0000 f28857OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00O00o0.OooO0O0.OooO0OO<Key, Value>> f28858OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<o00O00o0.OooO0O0.OooO0OO<Key, Value>> f28859OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f28860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f28861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f28862OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f28863OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f28864OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Channel<Integer> f28865OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Map<LoadType, o00OO0O0> f28866OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public o0000Ooo f28867OooOO0o;

    public static final class OooO00o<Key, Value> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Mutex f28868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o000O0Oo<Key, Value> f28869OooO0O0;

        public OooO00o(@NotNull o00O0000 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f28868OooO00o = MutexKt.Mutex$default(false, 1, null);
            this.f28869OooO0O0 = new o000O0Oo<>(config);
        }
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

    public o000O0Oo(o00O0000 o00o0001) {
        this.f28857OooO00o = o00o0001;
        ArrayList arrayList = new ArrayList();
        this.f28858OooO0O0 = arrayList;
        this.f28859OooO0OO = arrayList;
        this.f28856OooO = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f28865OooOO0 = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f28866OooOO0O = new LinkedHashMap();
        o0000Ooo o0000ooo = new o0000Ooo();
        o0000ooo.OooO0O0(LoadType.REFRESH, o000000.OooO0O0.f28697OooO0O0);
        this.f28867OooOO0o = o0000ooo;
    }

    public final void OooO(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f28862OooO0o0 = i;
    }

    @NotNull
    public final o00O0<Key, Value> OooO00o(@Nullable o00OO0O0.OooO00o oooO00o) {
        Integer numValueOf;
        List list = CollectionsKt.toList(this.f28859OooO0OO);
        if (oooO00o != null) {
            int iOooO0o0 = OooO0o0();
            int i = -this.f28860OooO0Oo;
            int lastIndex = CollectionsKt.getLastIndex(this.f28859OooO0OO) - this.f28860OooO0Oo;
            int i2 = oooO00o.f29030OooO0o0;
            int i3 = i;
            while (i3 < i2) {
                iOooO0o0 += i3 > lastIndex ? this.f28857OooO00o.f28925OooO00o : ((o00O00o0.OooO0O0.OooO0OO) this.f28859OooO0OO.get(this.f28860OooO0Oo + i3)).f28948OooO00o.size();
                i3++;
            }
            int i4 = iOooO0o0 + oooO00o.f29029OooO0o;
            if (oooO00o.f29030OooO0o0 < i) {
                i4 -= this.f28857OooO00o.f28925OooO00o;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new o00O0<>(list, numValueOf, this.f28857OooO00o, OooO0o0());
    }

    public final void OooO0O0(@NotNull o0000O0O.OooO00o<Value> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event.OooO00o() <= this.f28859OooO0OO.size())) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("invalid drop count. have ");
            sbOooO0o0.append(this.f28859OooO0OO.size());
            sbOooO0o0.append(" but wanted to drop ");
            sbOooO0o0.append(event.OooO00o());
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        this.f28866OooOO0O.remove(event.f28733OooO00o);
        this.f28867OooOO0o.OooO0O0(event.f28733OooO00o, o000000.OooO0OO.f28699OooO0OO);
        int i = OooO0O0.$EnumSwitchMapping$0[event.f28733OooO00o.ordinal()];
        if (i == 2) {
            int iOooO00o = event.OooO00o();
            for (int i2 = 0; i2 < iOooO00o; i2++) {
                this.f28858OooO0O0.remove(0);
            }
            this.f28860OooO0Oo -= event.OooO00o();
            OooO(event.f28736OooO0Oo);
            int i3 = this.f28863OooO0oO + 1;
            this.f28863OooO0oO = i3;
            this.f28856OooO.mo2017trySendJP2dKIU(Integer.valueOf(i3));
            return;
        }
        if (i != 3) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("cannot drop ");
            sbOooO0o1.append(event.f28733OooO00o);
            throw new IllegalArgumentException(sbOooO0o1.toString());
        }
        int iOooO00o2 = event.OooO00o();
        for (int i4 = 0; i4 < iOooO00o2; i4++) {
            this.f28858OooO0O0.remove(this.f28859OooO0OO.size() - 1);
        }
        OooO0oo(event.f28736OooO0Oo);
        int i5 = this.f28864OooO0oo + 1;
        this.f28864OooO0oo = i5;
        this.f28865OooOO0.mo2017trySendJP2dKIU(Integer.valueOf(i5));
    }

    @Nullable
    public final o0000O0O.OooO00o<Value> OooO0OO(@NotNull LoadType loadType, @NotNull o00OO0O0 hint) {
        int size;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
        o0000O0O.OooO00o<Value> oooO00o = null;
        if (this.f28857OooO00o.f28930OooO0o0 == Integer.MAX_VALUE || this.f28859OooO0OO.size() <= 2 || OooO0o() <= this.f28857OooO00o.f28930OooO0o0) {
            return null;
        }
        int iOooO0o0 = 0;
        if (!(loadType != LoadType.REFRESH)) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < this.f28859OooO0OO.size() && OooO0o() - i2 > this.f28857OooO00o.f28930OooO0o0) {
            int[] iArr = OooO0O0.$EnumSwitchMapping$0;
            if (iArr[loadType.ordinal()] == 2) {
                size = ((o00O00o0.OooO0O0.OooO0OO) this.f28859OooO0OO.get(i)).f28948OooO00o.size();
            } else {
                List<o00O00o0.OooO0O0.OooO0OO<Key, Value>> list = this.f28859OooO0OO;
                size = ((o00O00o0.OooO0O0.OooO0OO) list.get(CollectionsKt.getLastIndex(list) - i)).f28948OooO00o.size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? hint.f29025OooO00o : hint.f29026OooO0O0) - i2) - size < this.f28857OooO00o.f28926OooO0O0) {
                break;
            }
            i2 += size;
            i++;
        }
        if (i != 0) {
            int[] iArr2 = OooO0O0.$EnumSwitchMapping$0;
            int lastIndex = iArr2[loadType.ordinal()] == 2 ? -this.f28860OooO0Oo : (CollectionsKt.getLastIndex(this.f28859OooO0OO) - this.f28860OooO0Oo) - (i - 1);
            int lastIndex2 = iArr2[loadType.ordinal()] == 2 ? (i - 1) - this.f28860OooO0Oo : CollectionsKt.getLastIndex(this.f28859OooO0OO) - this.f28860OooO0Oo;
            if (this.f28857OooO00o.f28927OooO0OO) {
                iOooO0o0 = (loadType == LoadType.PREPEND ? OooO0o0() : OooO0Oo()) + i2;
            }
            oooO00o = new o0000O0O.OooO00o<>(loadType, lastIndex, lastIndex2, iOooO0o0);
        }
        return oooO00o;
    }

    public final int OooO0Oo() {
        if (this.f28857OooO00o.f28927OooO0OO) {
            return this.f28861OooO0o;
        }
        return 0;
    }

    public final int OooO0o() {
        Iterator it = this.f28859OooO0OO.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((o00O00o0.OooO0O0.OooO0OO) it.next()).f28948OooO00o.size();
        }
        return size;
    }

    public final int OooO0o0() {
        if (this.f28857OooO00o.f28927OooO0OO) {
            return this.f28862OooO0o0;
        }
        return 0;
    }

    @CheckResult
    public final boolean OooO0oO(int i, @NotNull LoadType loadType, @NotNull o00O00o0.OooO0O0.OooO0OO<Key, Value> page) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int i2 = OooO0O0.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (!(!this.f28859OooO0OO.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (i != this.f28864OooO0oo) {
                        return false;
                    }
                    this.f28858OooO0O0.add(page);
                    int iCoerceAtLeast = page.f28952OooO0o0;
                    if (iCoerceAtLeast == Integer.MIN_VALUE) {
                        iCoerceAtLeast = RangesKt.coerceAtLeast(OooO0Oo() - page.f28948OooO00o.size(), 0);
                    }
                    OooO0oo(iCoerceAtLeast);
                    this.f28866OooOO0O.remove(LoadType.APPEND);
                }
            } else {
                if (!(!this.f28859OooO0OO.isEmpty())) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (i != this.f28863OooO0oO) {
                    return false;
                }
                this.f28858OooO0O0.add(0, page);
                this.f28860OooO0Oo++;
                int iCoerceAtLeast2 = page.f28951OooO0Oo;
                if (iCoerceAtLeast2 == Integer.MIN_VALUE) {
                    iCoerceAtLeast2 = RangesKt.coerceAtLeast(OooO0o0() - page.f28948OooO00o.size(), 0);
                }
                OooO(iCoerceAtLeast2);
                this.f28866OooOO0O.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.f28859OooO0OO.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (!(i == 0)) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this.f28858OooO0O0.add(page);
            this.f28860OooO0Oo = 0;
            OooO0oo(page.f28952OooO0o0);
            OooO(page.f28951OooO0Oo);
        }
        return true;
    }

    public final void OooO0oo(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f28861OooO0o = i;
    }

    @NotNull
    public final o0000O0O<Value> OooOO0(@NotNull o00O00o0.OooO0O0.OooO0OO<Key, Value> oooO0OO, @NotNull LoadType loadType) {
        Intrinsics.checkNotNullParameter(oooO0OO, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int[] iArr = OooO0O0.$EnumSwitchMapping$0;
        int i = iArr[loadType.ordinal()];
        int size = 0;
        if (i != 1) {
            if (i == 2) {
                size = 0 - this.f28860OooO0Oo;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.f28859OooO0OO.size() - this.f28860OooO0Oo) - 1;
            }
        }
        List pages = CollectionsKt.listOf(new o00O(size, oooO0OO.f28948OooO00o));
        int i2 = iArr[loadType.ordinal()];
        if (i2 == 1) {
            return o0000O0O.OooO0O0.f28737OooO0oO.OooO00o(pages, OooO0o0(), OooO0Oo(), this.f28867OooOO0o.OooO0Oo(), null);
        }
        if (i2 == 2) {
            o0000O0O.OooO0O0.OooO00o oooO00o = o0000O0O.OooO0O0.f28737OooO0oO;
            int iOooO0o0 = OooO0o0();
            o000000O sourceLoadStates = this.f28867OooOO0o.OooO0Oo();
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new o0000O0O.OooO0O0(LoadType.PREPEND, pages, iOooO0o0, -1, sourceLoadStates, null);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        o0000O0O.OooO0O0.OooO00o oooO00o2 = o0000O0O.OooO0O0.f28737OooO0oO;
        int iOooO0Oo = OooO0Oo();
        o000000O sourceLoadStates2 = this.f28867OooOO0o.OooO0Oo();
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(sourceLoadStates2, "sourceLoadStates");
        return new o0000O0O.OooO0O0(LoadType.APPEND, pages, -1, iOooO0Oo, sourceLoadStates2, null);
    }
}
