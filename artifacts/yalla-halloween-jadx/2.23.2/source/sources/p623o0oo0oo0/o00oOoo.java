package p623o0oo0oo0;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o00oOoo extends o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LazyListState f57649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<o00O00o0, oo00o, Integer> f57650OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f57651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final State f57652OooO0Oo;

    public o00oOoo() {
        throw null;
    }

    public o00oOoo(LazyListState lazyListState, Function2 snapOffsetForItem) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapOffsetForItem, "snapOffsetForItem");
        this.f57649OooO00o = lazyListState;
        this.f57650OooO0O0 = snapOffsetForItem;
        this.f57651OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.f57652OooO0Oo = SnapshotStateKt.derivedStateOf(new o00O0000(this));
    }

    public final float OooO() {
        Object next;
        LazyListState lazyListState = this.f57649OooO00o;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((LazyListItemInfo) next).getOffset();
                do {
                    Object next3 = it.next();
                    int offset2 = ((LazyListItemInfo) next3).getOffset();
                    if (offset > offset2) {
                        next = next3;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return -1.0f;
        }
        Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                int size = lazyListItemInfo2.getSize() + lazyListItemInfo2.getOffset();
                do {
                    Object next4 = it2.next();
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next4;
                    int size2 = lazyListItemInfo3.getSize() + lazyListItemInfo3.getOffset();
                    if (size < size2) {
                        next2 = next4;
                        size = size2;
                    }
                } while (it2.hasNext());
            }
        }
        LazyListItemInfo lazyListItemInfo4 = (LazyListItemInfo) next2;
        if (lazyListItemInfo4 == null) {
            return -1.0f;
        }
        int iMax = Math.max(lazyListItemInfo.getSize() + lazyListItemInfo.getOffset(), lazyListItemInfo4.getSize() + lazyListItemInfo4.getOffset()) - Math.min(lazyListItemInfo.getOffset(), lazyListItemInfo4.getOffset());
        if (iMax == 0) {
            return -1.0f;
        }
        LazyListLayoutInfo layoutInfo2 = lazyListState.getLayoutInfo();
        int offset3 = 0;
        if (layoutInfo2.getVisibleItemsInfo().size() >= 2) {
            LazyListItemInfo lazyListItemInfo5 = layoutInfo2.getVisibleItemsInfo().get(0);
            offset3 = layoutInfo2.getVisibleItemsInfo().get(1).getOffset() - (lazyListItemInfo5.getOffset() + lazyListItemInfo5.getSize());
        }
        return (iMax + offset3) / layoutInfo.getVisibleItemsInfo().size();
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final boolean OooO00o() {
        LazyListState lazyListState = this.f57649OooO00o;
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            if (lazyListItemInfo.getIndex() < lazyListState.getLayoutInfo().getTotalItemsCount() - 1) {
                return true;
            }
            if (lazyListItemInfo.getSize() + lazyListItemInfo.getOffset() > OooO0o()) {
                return true;
            }
        }
        return false;
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final boolean OooO0O0() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) this.f57649OooO00o.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return false;
        }
        return lazyListItemInfo.getIndex() > 0 || lazyListItemInfo.getOffset() < 0;
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final int OooO0OO(@NotNull DecayAnimationSpec decayAnimationSpec, float f, float f2) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        oo00o oo00oVarOooO0o0 = OooO0o0();
        if (oo00oVarOooO0o0 == null) {
            return -1;
        }
        float fOooO = OooO();
        if (fOooO <= 0.0f) {
            return oo00oVarOooO0o0.OooO00o();
        }
        int iOooO0Oo = OooO0Oo(oo00oVarOooO0o0.OooO00o());
        int iOooO0Oo2 = OooO0Oo(oo00oVarOooO0o0.OooO00o() + 1);
        float fAbs = Math.abs(f);
        LazyListState lazyListState = this.f57649OooO00o;
        if (fAbs < 0.5f) {
            return RangesKt.coerceIn(Math.abs(iOooO0Oo) < Math.abs(iOooO0Oo2) ? oo00oVarOooO0o0.OooO00o() : oo00oVarOooO0o0.OooO00o() + 1, 0, lazyListState.getLayoutInfo().getTotalItemsCount() - 1);
        }
        float fCoerceIn = RangesKt.coerceIn(DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f), -f2, f2);
        double d = fOooO;
        return RangesKt.coerceIn(oo00oVarOooO0o0.OooO00o() + MathKt.roundToInt((((double) (f < 0.0f ? RangesKt.coerceAtMost(fCoerceIn + iOooO0Oo2, 0.0f) : RangesKt.coerceAtLeast(fCoerceIn + iOooO0Oo, 0.0f))) / d) - (((double) iOooO0Oo) / d)), 0, lazyListState.getLayoutInfo().getTotalItemsCount() - 1);
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final int OooO0Oo(int i) {
        Object next;
        Iterator it = SequencesKt.map(CollectionsKt.asSequence(this.f57649OooO00o.getLayoutInfo().getVisibleItemsInfo()), o0O0ooO.f57653OooO0Oo).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((oo00o) next).OooO00o() == i));
        oo00o oo00oVar = (oo00o) next;
        Function2<o00O00o0, oo00o, Integer> function2 = this.f57650OooO0O0;
        if (oo00oVar != null) {
            return oo00oVar.OooO0O0() - function2.invoke(this, oo00oVar).intValue();
        }
        oo00o oo00oVarOooO0o0 = OooO0o0();
        if (oo00oVarOooO0o0 == null) {
            return 0;
        }
        return (oo00oVarOooO0o0.OooO0O0() + MathKt.roundToInt(OooO() * (i - oo00oVarOooO0o0.OooO00o()))) - function2.invoke(this, oo00oVarOooO0o0).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p623o0oo0oo0.o00O00o0
    public final int OooO0o() {
        return this.f57649OooO00o.getLayoutInfo().getViewportEndOffset() - ((Number) this.f57651OooO0OO.getValue()).intValue();
    }

    @Override // p623o0oo0oo0.o00O00o0
    @Nullable
    public final oo00o OooO0o0() {
        return (oo00o) this.f57652OooO0Oo.getValue();
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final void OooO0oO() {
    }

    @Override // p623o0oo0oo0.o00O00o0
    public final int OooO0oo() {
        return this.f57649OooO00o.getLayoutInfo().getTotalItemsCount();
    }
}
