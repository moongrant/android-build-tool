package androidx.compose.foundation.pager;

import androidx.compose.animation.core.OooO0OO;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#R+\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000b¨\u0006$"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "initialPage", "", "initialScrollOffset", "(II)V", "<set-?>", "currentPage", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "firstVisiblePage", "getFirstVisiblePage", "setFirstVisiblePage", "firstVisiblePage$delegate", "hadFirstNotEmptyLayout", "", "lastKnownFirstPageKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPosition", "", "index", "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n75#2:111\n108#2,2:112\n75#2:114\n108#2,2:115\n75#2:117\n108#2,2:118\n1#3:120\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n34#1:111\n34#1:112,2\n35#1:114\n35#1:115,2\n37#1:117\n37#1:118,2\n*E\n"})
public final class PagerScrollPosition {

    /* JADX INFO: renamed from: currentPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState currentPage;

    /* JADX INFO: renamed from: firstVisiblePage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState firstVisiblePage;
    private boolean hadFirstNotEmptyLayout;

    @Nullable
    private Object lastKnownFirstPageKey;

    @NotNull
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX INFO: renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    public PagerScrollPosition() {
        int i = 0;
        this(i, i, 3, null);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setIntValue(i);
    }

    private final void update(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(OooO0OO.OooO00o("Index should be non-negative (", index, ')').toString());
        }
        setFirstVisiblePage(index);
        this.nearestRangeState.update(index);
        setScrollOffset(scrollOffset);
    }

    public final int getCurrentPage() {
        return this.currentPage.getIntValue();
    }

    public final int getFirstVisiblePage() {
        return this.firstVisiblePage.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final void requestPosition(int index, int scrollOffset) {
        update(index, scrollOffset);
        this.lastKnownFirstPageKey = null;
    }

    public final void setCurrentPage(int i) {
        this.currentPage.setIntValue(i);
    }

    public final void setFirstVisiblePage(int i) {
        this.firstVisiblePage.setIntValue(i);
    }

    public final void updateFromMeasureResult(@NotNull PagerMeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        MeasuredPage firstVisiblePage = measureResult.getFirstVisiblePage();
        this.lastKnownFirstPageKey = firstVisiblePage != null ? firstVisiblePage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getPagesCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisiblePageOffset = measureResult.getFirstVisiblePageOffset();
            if (!(((float) firstVisiblePageOffset) >= 0.0f)) {
                throw new IllegalStateException(OooO0OO.OooO00o("scrollOffset should be non-negative (", firstVisiblePageOffset, ')').toString());
            }
            MeasuredPage firstVisiblePage2 = measureResult.getFirstVisiblePage();
            update(firstVisiblePage2 != null ? firstVisiblePage2.getIndex() : 0, firstVisiblePageOffset);
            PageInfo closestPageToSnapPosition = measureResult.getClosestPageToSnapPosition();
            if (closestPageToSnapPosition != null) {
                setCurrentPage(closestPageToSnapPosition.getIndex());
            }
        }
    }

    public PagerScrollPosition(int i, int i2) {
        this.firstVisiblePage = SnapshotIntStateKt.mutableIntStateOf(i);
        this.currentPage = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
