package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000O extends RecyclerView.o000oOoO {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.o00O0O mScrollListener = new OooO00o();

    public class OooO00o extends RecyclerView.o00O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f10828OooO00o = false;

        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f10828OooO00o) {
                this.f10828OooO00o = false;
                o00000O.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f10828OooO00o = true;
        }
    }

    public class OooO0O0 extends o00oO0o {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o00oO0o
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return o00000O.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.o00oO0o, androidx.recyclerview.widget.RecyclerView.o0ooOOo
        public final void onTargetFound(View view, RecyclerView.o0OOO0o o0ooo0o2, RecyclerView.o0ooOOo.OooO00o oooO00o) {
            o00000O o00000o = o00000O.this;
            RecyclerView recyclerView = o00000o.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = o00000o.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                oooO00o.f10740OooO00o = i;
                oooO00o.f10741OooO0O0 = i2;
                oooO00o.f10742OooO0OO = iCalculateTimeForDeceleration;
                oooO00o.f10745OooO0o0 = decelerateInterpolator;
                oooO00o.f10744OooO0o = true;
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(@NonNull RecyclerView.Oooo000 oooo000, int i, int i2) {
        RecyclerView.o0ooOOo o0oooooCreateScroller;
        int iFindTargetSnapPosition;
        if (!(oooo000 instanceof RecyclerView.o0ooOOo.OooO0O0) || (o0oooooCreateScroller = createScroller(oooo000)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(oooo000, i, i2)) == -1) {
            return false;
        }
        o0oooooCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        oooo000.startSmoothScroll(o0oooooCreateScroller);
        return true;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    @Nullable
    public abstract int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.Oooo000 oooo000, @NonNull View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    @Nullable
    public RecyclerView.o0ooOOo createScroller(@NonNull RecyclerView.Oooo000 oooo000) {
        return createSnapScroller(oooo000);
    }

    @Nullable
    @Deprecated
    public o00oO0o createSnapScroller(@NonNull RecyclerView.Oooo000 oooo000) {
        if (oooo000 instanceof RecyclerView.o0ooOOo.OooO0O0) {
            return new OooO0O0(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Nullable
    @SuppressLint({"UnknownNullness"})
    public abstract View findSnapView(RecyclerView.Oooo000 oooo000);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(RecyclerView.Oooo000 oooo000, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.o000oOoO
    public boolean onFling(int i, int i2) {
        RecyclerView.Oooo000 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2);
    }

    public void snapToTargetExistingView() {
        RecyclerView.Oooo000 layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }
}
