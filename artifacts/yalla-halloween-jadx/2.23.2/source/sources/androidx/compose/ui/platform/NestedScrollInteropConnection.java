package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "interruptOngoingScrolls", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "Landroidx/core/view/o0OO00O;", "nestedScrollChildHelper", "Landroidx/core/view/o0OO00O;", "", "consumedScrollCache", "[I", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    @NotNull
    private final int[] consumedScrollCache;

    @NotNull
    private final androidx.core.view.o0OO00O nestedScrollChildHelper;

    @NotNull
    private final View view;

    public NestedScrollInteropConnection(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        androidx.core.view.o0OO00O o0oo00o2 = new androidx.core.view.o0OO00O(view);
        o0oo00o2.OooO(true);
        this.nestedScrollChildHelper = o0oo00o2;
        this.consumedScrollCache = new int[2];
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo00(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.OooO0oo(0)) {
            this.nestedScrollChildHelper.OooOO0O(0);
        }
        if (this.nestedScrollChildHelper.OooO0oo(1)) {
            this.nestedScrollChildHelper.OooOO0O(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo333onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.OooO00o(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m4000getXimpl(j2)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m4001getYimpl(j2)), true)) {
            j2 = Velocity.INSTANCE.m4011getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m3991boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo334onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.nestedScrollChildHelper.OooOO0(NestedScrollInteropConnectionKt.m3137getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m3139toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.OooO0o(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1447getXimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1448getYimpl(consumed)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1447getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1448getYimpl(available)), null, NestedScrollInteropConnectionKt.m3139toViewTypeGyEprt8(source), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m3138toOffsetUv8p0NA(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo335onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        if (!this.nestedScrollChildHelper.OooO0O0(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m4000getXimpl(j)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m4001getYimpl(j)))) {
            j = Velocity.INSTANCE.m4011getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m3991boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo336onPreScrollOzD1aCk(long available, int source) {
        if (!this.nestedScrollChildHelper.OooOO0(NestedScrollInteropConnectionKt.m3137getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m3139toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.OooO0OO(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1447getXimpl(available)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1448getYimpl(available)), this.consumedScrollCache, null, NestedScrollInteropConnectionKt.m3139toViewTypeGyEprt8(source));
        return NestedScrollInteropConnectionKt.m3138toOffsetUv8p0NA(this.consumedScrollCache, available);
    }
}
