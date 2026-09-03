package p027Oooo0o;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0000O0O;
import p023Oooo00O.o00O000o;
import p023Oooo00O.o0OO00O;
import p023Oooo00O.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Set<Object> f1993OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f1994OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f1995OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<Object, OooOo> f1996OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public Map<Object, Integer> f1997OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f1998OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f1999OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f2000OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2001OooO0oo;

    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", i = {}, l = {ShopVehicleListModel.VehicleTagType_Vip400}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2002Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oOO00O f2003Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O0O<OooOo> f2004Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oOO00O ooo00o, o0000O0O<OooOo> o0000o0o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2003Oooo0oO = ooo00o;
            this.f2004Oooo0oo = o0000o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f2003Oooo0oO, this.f2004Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oo000o oo000oVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2002Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) this.f2003Oooo0oO.f2011OooO0O0.f1005OooO0Oo.getValue()).booleanValue()) {
                        o0000O0O<OooOo> o0000o0o2 = this.f2004Oooo0oo;
                        oo000oVar = o0000o0o2 instanceof o00O000o ? (o00O000o) o0000o0o2 : o0Oo0oo.f2005OooO00o;
                    } else {
                        oo000oVar = this.f2004Oooo0oo;
                    }
                    oo000o oo000oVar2 = oo000oVar;
                    oOO00O ooo00o = this.f2003Oooo0oO;
                    Oooo0<OooOo, o0OO00O> oooo0 = ooo00o.f2011OooO0O0;
                    OooOo oooOo = new OooOo(ooo00o.f2012OooO0OO);
                    this.f2002Oooo0o = 1;
                    if (Oooo0.OooO0OO(oooo0, oooOo, oo000oVar2, null, this, 12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f2003Oooo0oO.OooO00o(false);
            } catch (CancellationException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public o0OOO0o(@NotNull CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f1994OooO00o = scope;
        this.f1995OooO0O0 = z;
        this.f1996OooO0OO = new LinkedHashMap();
        this.f1997OooO0Oo = MapsKt.emptyMap();
        this.f1999OooO0o0 = -1;
        this.f2000OooO0oO = -1;
        this.f1993OooO = new LinkedHashSet();
    }

    public final int OooO00o(int i, int i2, int i3, long j, boolean z, int i4, int i5, List<o000OO> list) {
        int i6 = this.f2000OooO0oO;
        int iOooO0O0 = 0;
        boolean z2 = z ? i6 > i : i6 < i;
        int i7 = this.f1999OooO0o0;
        boolean z3 = z ? i7 < i : i7 > i;
        if (z2) {
            IntRange intRangeUntil = !z ? RangesKt.until(i6 + 1, i) : RangesKt.until(i + 1, i6);
            int first = intRangeUntil.getFirst();
            int last = intRangeUntil.getLast();
            if (first <= last) {
                while (true) {
                    iOooO0O0 += OooO0O0(list, first, i3);
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            return OooO0OO(j) + i4 + this.f2001OooO0oo + iOooO0O0;
        }
        if (!z3) {
            return i5;
        }
        IntRange intRangeUntil2 = !z ? RangesKt.until(i + 1, i7) : RangesKt.until(i7 + 1, i);
        int first2 = intRangeUntil2.getFirst();
        int last2 = intRangeUntil2.getLast();
        if (first2 <= last2) {
            while (true) {
                i2 += OooO0O0(list, first2, i3);
                if (first2 == last2) {
                    break;
                }
                first2++;
            }
        }
        return OooO0OO(j) + (this.f1998OooO0o - i2);
    }

    public final int OooO0O0(List<o000OO> list, int i, int i2) {
        if (!list.isEmpty() && i >= ((o000OO) CollectionsKt.first((List) list)).f1918OooO0O0 && i <= ((o000OO) CollectionsKt.last((List) list)).f1918OooO0O0) {
            if (i - ((o000OO) CollectionsKt.first((List) list)).f1918OooO0O0 >= ((o000OO) CollectionsKt.last((List) list)).f1918OooO0O0 - i) {
                for (int lastIndex = CollectionsKt.getLastIndex(list); -1 < lastIndex; lastIndex--) {
                    o000OO o000oo2 = list.get(lastIndex);
                    int i3 = o000oo2.f1918OooO0O0;
                    if (i3 == i) {
                        return o000oo2.f1922OooO0o0;
                    }
                    if (i3 < i) {
                        break;
                    }
                }
            } else {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    o000OO o000oo3 = list.get(i4);
                    int i5 = o000oo3.f1918OooO0O0;
                    if (i5 == i) {
                        return o000oo3.f1922OooO0o0;
                    }
                    if (i5 > i) {
                        break;
                    }
                }
            }
        }
        return i2;
    }

    public final int OooO0OO(long j) {
        if (this.f1995OooO0O0) {
            return OooOo.OooO0OO(j);
        }
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        return (int) (j >> 32);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0o.OooOo>] */
    public final void OooO0Oo() {
        this.f1996OooO0OO.clear();
        this.f1997OooO0Oo = MapsKt.emptyMap();
        this.f1999OooO0o0 = -1;
        this.f1998OooO0o = 0;
        this.f2000OooO0oO = -1;
        this.f2001OooO0oo = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<Oooo0o.oOO00O>] */
    public final void OooO0o0(o000OO o000oo2, OooOo oooOo) {
        o000OO o000oo3 = o000oo2;
        OooOo oooOo2 = oooOo;
        while (oooOo2.f1745OooO0O0.size() > o000oo2.OooO0o0()) {
            CollectionsKt.removeLast(oooOo2.f1745OooO0O0);
        }
        while (oooOo2.f1745OooO0O0.size() < o000oo2.OooO0o0()) {
            int size = oooOo2.f1745OooO0O0.size();
            long jOooO0Oo = o000oo3.OooO0Oo(size);
            ?? r6 = oooOo2.f1745OooO0O0;
            long j = oooOo2.f1744OooO00o;
            OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
            r6.add(new oOO00O(Oooo000.OooO00o(((int) (jOooO0Oo >> 32)) - ((int) (j >> 32)), OooOo.OooO0OO(jOooO0Oo) - OooOo.OooO0OO(j)), o000oo3.OooO0OO(size)));
        }
        ?? r2 = oooOo2.f1745OooO0O0;
        int i = 0;
        int size2 = r2.size();
        while (i < size2) {
            oOO00O ooo00o = (oOO00O) r2.get(i);
            long j2 = ooo00o.f2012OooO0OO;
            long j3 = oooOo2.f1744OooO00o;
            OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
            long jOooO00o = o00oO0o.OooO00o(j3, OooOo.OooO0OO(j2), ((int) (j2 >> 32)) + ((int) (j3 >> 32)));
            long jOooO0Oo2 = o000oo3.OooO0Oo(i);
            ooo00o.f2010OooO00o = o000oo3.OooO0OO(i);
            o0000O0O<OooOo> o0000o0oOooO0O0 = o000oo3.OooO0O0(i);
            if (!OooOo.OooO0O0(jOooO00o, jOooO0Oo2)) {
                long j4 = oooOo2.f1744OooO00o;
                ooo00o.f2012OooO0OO = Oooo000.OooO00o(((int) (jOooO0Oo2 >> 32)) - ((int) (j4 >> 32)), OooOo.OooO0OO(jOooO0Oo2) - OooOo.OooO0OO(j4));
                if (o0000o0oOooO0O0 != null) {
                    ooo00o.OooO00o(true);
                    BuildersKt__Builders_commonKt.launch$default(this.f1994OooO00o, null, null, new OooO00o(ooo00o, o0000o0oOooO0O0, null), 3, null);
                }
            }
            i++;
            o000oo3 = o000oo2;
            oooOo2 = oooOo;
        }
    }
}
