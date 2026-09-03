package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.umeng.analytics.pro.o;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p042Ooooo0o.o000O0Oo;
import p072o000O0o0.o0000O0;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements o000O0O0.o0OO00O, o000O0O0.Oooo0 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator;
    public o000000 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public androidx.recyclerview.widget.OooO00o mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private OooOOOO mChildDrawingOrderCallback;
    public androidx.recyclerview.widget.OooO0o mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    public boolean mEnableFastScroller;

    @VisibleForTesting
    public boolean mFirstLayoutComplete;
    public androidx.recyclerview.widget.o000oOoO mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private o0OoOo0 mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public ItemAnimator mItemAnimator;
    private ItemAnimator.OooO0O0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<OooOo> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    public Oooo000 mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final o00oO0o mObserver;
    private List<Oooo0> mOnChildAttachStateListeners;
    private o000oOoO mOnFlingListener;
    private final ArrayList<o0OoOo0> mOnItemTouchListeners;

    @VisibleForTesting
    public final List<oo0o0Oo> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public androidx.recyclerview.widget.o000oOoO.OooO0O0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final o00Ooo mRecycler;
    public oo000o mRecyclerListener;
    public final List<oo000o> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private o00O0O mScrollListener;
    private List<o00O0O> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private o000O0O0.o000oOoO mScrollingChildHelper;
    public final o0OOO0o mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final o0OO00O mViewFlinger;
    private final o00000OO.OooO0O0 mViewInfoProcessCallback;
    public final o00000OO mViewInfoStore;

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        public final EdgeEffect OooO00o(@NonNull RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0O0 f9008OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<OooO00o> f9009OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f9010OooO0OO = 120;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f9011OooO0Oo = 120;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f9013OooO0o0 = 250;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f9012OooO0o = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface OooO00o {
            void OooO00o();
        }

        public interface OooO0O0 {
        }

        public static class OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f9014OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f9015OooO0O0;

            @NonNull
            public final OooO0OO OooO00o(@NonNull oo0o0Oo oo0o0oo) {
                View view = oo0o0oo.itemView;
                this.f9014OooO00o = view.getLeft();
                this.f9015OooO0O0 = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int OooO0o0(oo0o0Oo oo0o0oo) {
            int i = oo0o0oo.mFlags & 14;
            if (oo0o0oo.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = oo0o0oo.getOldPosition();
            int absoluteAdapterPosition = oo0o0oo.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | oo0o0Oo.FLAG_MOVED;
        }

        public final void OooO() {
            int size = this.f9009OooO0O0.size();
            for (int i = 0; i < size; i++) {
                this.f9009OooO0O0.get(i).OooO00o();
            }
            this.f9009OooO0O0.clear();
        }

        public abstract boolean OooO00o(@NonNull oo0o0Oo oo0o0oo, @Nullable OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0O0(@NonNull oo0o0Oo oo0o0oo, @NonNull oo0o0Oo oo0o0oo2, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0OO(@NonNull oo0o0Oo oo0o0oo, @NonNull OooO0OO oooO0OO, @Nullable OooO0OO oooO0OO2);

        public abstract boolean OooO0Oo(@NonNull oo0o0Oo oo0o0oo, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0o(@NonNull oo0o0Oo oo0o0oo);

        public boolean OooO0oO(@NonNull oo0o0Oo oo0o0oo, @NonNull List<Object> list) {
            return OooO0o(oo0o0oo);
        }

        public final void OooO0oo(@NonNull oo0o0Oo oo0o0oo) {
            OooO0O0 oooO0O0 = this.f9008OooO00o;
            if (oooO0O0 != null) {
                OooOo00 oooOo00 = (OooOo00) oooO0O0;
                Objects.requireNonNull(oooOo00);
                oo0o0oo.setIsRecyclable(true);
                if (oo0o0oo.mShadowedHolder != null && oo0o0oo.mShadowingHolder == null) {
                    oo0o0oo.mShadowedHolder = null;
                }
                oo0o0oo.mShadowingHolder = null;
                if (oo0o0oo.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(oo0o0oo.itemView) || !oo0o0oo.isTmpDetached()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(oo0o0oo.itemView, false);
            }
        }

        public abstract void OooOO0(@NonNull oo0o0Oo oo0o0oo);

        public abstract void OooOO0O();

        public abstract boolean OooOO0o();

        public abstract void OooOOO0();
    }

    public class OooO implements androidx.recyclerview.widget.OooO0o.OooO0O0 {
        public OooO() {
        }

        public final View OooO00o(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public final int OooO0O0() {
            return RecyclerView.this.getChildCount();
        }

        public final int OooO0OO(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public final void OooO0Oo(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.OooOOO0();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public class OooO0OO implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class OooO0o implements o00000OO.OooO0O0 {
        public OooO0o() {
        }
    }

    public class OooOO0 implements androidx.recyclerview.widget.OooO00o.InterfaceC0062OooO00o {
        public OooOO0() {
        }

        public final void OooO00o(androidx.recyclerview.widget.OooO00o.OooO0O0 oooO0O0) {
            int i = oooO0O0.f8879OooO00o;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo, oooO0O0.f8881OooO0OO);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo, 1);
            }
        }

        public final oo0o0Oo OooO0O0(int i) {
            oo0o0Oo oo0o0ooFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (oo0o0ooFindViewHolderForPosition == null || RecyclerView.this.mChildHelper.OooOO0O(oo0o0ooFindViewHolderForPosition.itemView)) {
                return null;
            }
            return oo0o0ooFindViewHolderForPosition;
        }

        public final void OooO0OO(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }
    }

    public static /* synthetic */ class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f9025OooO00o;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f9025OooO00o = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9025OooO00o[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class OooOOO {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    public static class OooOOO0 extends Observable<OooOOO> {
        public final boolean OooO00o() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void OooO0O0() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void OooO0OO(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public final void OooO0Oo(int i, int i2, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public final void OooO0o(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public final void OooO0o0(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public final void OooO0oO() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((OooOOO) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public interface OooOOOO {
        int OooO00o(int i, int i2);
    }

    public static abstract class OooOo {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).OooO00o(), recyclerView);
        }
    }

    public class OooOo00 implements ItemAnimator.OooO0O0 {
        public OooOo00() {
        }
    }

    public interface Oooo0 {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    public static abstract class Oooo000 {
        public boolean mAutoMeasure;
        public androidx.recyclerview.widget.OooO0o mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.OooO0O0 mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;

        @Nullable
        public o0ooOOo mSmoothScroller;
        public ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.OooO0O0 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class OooO00o implements ViewBoundsCheck.OooO0O0 {
            public OooO00o() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO00o(View view) {
                return Oooo000.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0O0() {
                return Oooo000.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0OO() {
                return Oooo000.this.getWidth() - Oooo000.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final View OooO0Oo(int i) {
                return Oooo000.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0o0(View view) {
                return Oooo000.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        public class OooO0O0 implements ViewBoundsCheck.OooO0O0 {
            public OooO0O0() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO00o(View view) {
                return Oooo000.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0O0() {
                return Oooo000.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0OO() {
                return Oooo000.this.getHeight() - Oooo000.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final View OooO0Oo(int i) {
                return Oooo000.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.OooO0O0
            public final int OooO0o0(View view) {
                return Oooo000.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface OooO0OO {
        }

        public static class OooO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f9029OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f9030OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public boolean f9031OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f9032OooO0Oo;
        }

        public Oooo000() {
            OooO00o oooO00o = new OooO00o();
            this.mHorizontalBoundCheckCallback = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            this.mVerticalBoundCheckCallback = oooO0O0;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(oooO00o);
            this.mVerticalBoundCheck = new ViewBoundsCheck(oooO0O0);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.OooO00o(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0o0(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.OooO0O0(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iOooOO0 = this.mChildHelper.OooOO0(view);
                if (i == -1) {
                    i = this.mChildHelper.OooO0o0();
                }
                if (iOooOO0 == -1) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sbOooO0o0.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this.mRecyclerView, sbOooO0o0));
                }
                if (iOooOO0 != i) {
                    this.mRecyclerView.mLayout.moveView(iOooOO0, i);
                }
            } else {
                this.mChildHelper.OooO00o(view, i, false);
                layoutParams.f9019Oooo0oo = true;
                o0ooOOo o0ooooo2 = this.mSmoothScroller;
                if (o0ooooo2 != null && o0ooooo2.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f9016Oooo) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f9016Oooo = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, @NonNull View view) {
            this.mChildHelper.OooO0OO(i);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        /* JADX WARN: Code duplicated, block: B:8:0x0011  */
        @Deprecated
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 >= 0) {
                i5 = 1073741824;
            } else {
                if (i3 == -1) {
                    i5 = 1073741824;
                } else if (i3 == -2) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i3 = 0;
                }
                i3 = iMax;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static OooO0o getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            OooO0o oooO0o = new OooO0o();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090o000o00O.o00O0O.RecyclerView, i, i2);
            oooO0o.f9029OooO00o = typedArrayObtainStyledAttributes.getInt(p090o000o00O.o00O0O.RecyclerView_android_orientation, 1);
            oooO0o.f9030OooO0O0 = typedArrayObtainStyledAttributes.getInt(p090o000o00O.o00O0O.RecyclerView_spanCount, 1);
            oooO0o.f9031OooO0OO = typedArrayObtainStyledAttributes.getBoolean(p090o000o00O.o00O0O.RecyclerView_reverseLayout, false);
            oooO0o.f9032OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(p090o000o00O.o00O0O.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return oooO0o;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(o00Ooo o00ooo2, int i, View view) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                o00ooo2.OooOO0(childViewHolderInt);
            } else {
                detachViewAt(i);
                o00ooo2.OooOO0O(view);
                this.mRecyclerView.mViewInfoStore.OooO0o0(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.OooO00o(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0o0(childViewHolderInt);
            }
            this.mChildHelper.OooO0O0(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, o0OOO0o o0ooo0o2, OooO0OO oooO0OO) {
        }

        public void collectInitialPrefetchPositions(int i, OooO0OO oooO0OO) {
        }

        public int computeHorizontalScrollExtent(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull o00Ooo o00ooo2) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(o00ooo2, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull o00Ooo o00ooo2) {
            scrapOrRecycleView(o00ooo2, this.mChildHelper.OooOO0(view), view);
        }

        public void detachAndScrapViewAt(int i, @NonNull o00Ooo o00ooo2) {
            scrapOrRecycleView(o00ooo2, i, getChildAt(i));
        }

        public void detachView(@NonNull View view) {
            int iOooOO0 = this.mChildHelper.OooOO0(view);
            if (iOooOO0 >= 0) {
                detachViewInternal(iOooOO0, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, o00Ooo o00ooo2) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, o00ooo2);
        }

        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.OooOO0(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.OooOO0O(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f9063OooO0oO || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO.bottom;
        }

        @Nullable
        public View getChildAt(int i) {
            androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
            if (oooO0o != null) {
                return oooO0o.OooO0Oo(i);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
            if (oooO0o != null) {
                return oooO0o.OooO0o0();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.OooOO0O(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO.OooO0Oo(recyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO.left;
        }

        @Px
        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO0o.OooO0Oo(recyclerView);
        }

        @Px
        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO0o.OooO0o0(recyclerView);
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO.OooO0o0(recyclerView);
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooO.OooO0o(recyclerView);
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).OooO00o();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO.right;
        }

        public int getRowCountForAccessibility(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(this.mRecyclerView, OooO00o.OooO00o.OooO0o0("View should be fully attached to be ignored")));
            }
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.OooO0o(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            o0ooOOo o0ooooo2 = this.mSmoothScroller;
            return o0ooooo2 != null && o0ooooo2.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.OooO0O0(view) && this.mVerticalBoundCheck.OooO0O0(view);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f9018Oooo0oO;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f9018Oooo0oO;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, o00Ooo o00ooo2) {
            onDetachedFromWindow(recyclerView);
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(o0000OO0 o0000oo1) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, o0000oo1);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, o0000OO0 o0000oo1) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, o0000oo1);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, @NonNull o0000OO0 o0000oo1) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onLayoutChildren(o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(o0OOO0o o0ooo0o2) {
        }

        public void onMeasure(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(o0ooOOo o0ooooo2) {
            if (this.mSmoothScroller == o0ooooo2) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.OooOO0o(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull o00Ooo o00ooo2) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, o00ooo2);
                }
            }
        }

        public void removeAndRecycleScrapInt(o00Ooo o00ooo2) {
            int size = o00ooo2.f9040OooO00o.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = o00ooo2.f9040OooO00o.get(i).itemView;
                oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.OooOO0(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    oo0o0Oo childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    o00ooo2.OooOO0(childViewHolderInt2);
                }
            }
            o00ooo2.f9040OooO00o.clear();
            ArrayList<oo0o0Oo> arrayList = o00ooo2.f9041OooO0O0;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull o00Ooo o00ooo2) {
            removeView(view);
            o00ooo2.OooO(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull o00Ooo o00ooo2) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            o00ooo2.OooO(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
            int iOooO0OO = ((OooO) oooO0o.f8889OooO00o).OooO0OO(view);
            if (iOooO0OO < 0) {
                return;
            }
            if (oooO0o.f8890OooO0O0.OooO0o(iOooO0OO)) {
                oooO0o.OooOOO0(view);
            }
            ((OooO) oooO0o.f8889OooO00o).OooO0Oo(iOooO0OO);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.OooOO0o(i);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.OooOOO();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i5, i6, i3, i4);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, o0OOO0o o0ooo0o2, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(o0ooOOo o0ooooo2) {
            o0ooOOo o0ooooo3 = this.mSmoothScroller;
            if (o0ooooo3 != null && o0ooooo2 != o0ooooo3 && o0ooooo3.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = o0ooooo2;
            o0ooooo2.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            o0ooOOo o0ooooo2 = this.mSmoothScroller;
            if (o0ooooo2 != null) {
                o0ooooo2.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void onInitializeAccessibilityEvent(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull o0000OO0 o0000oo1) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                o0000oo1.OooO00o(8192);
                o0000oo1.OoooOoO(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                o0000oo1.OooO00o(4096);
                o0000oo1.OoooOoO(true);
            }
            o0000oo1.Oooo00o(o0000OO0.OooO0O0.OooO00o(getRowCountForAccessibility(o00ooo2, o0ooo0o2), getColumnCountForAccessibility(o00ooo2, o0ooo0o2), isLayoutHierarchical(o00ooo2, o0ooo0o2), getSelectionModeForAccessibility(o00ooo2, o0ooo0o2)));
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r8
          0x0071: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:22:0x005e, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, int i, @Nullable Bundle bundle) {
            int height;
            int width;
            int i2;
            int i3;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i2 = height;
                    i3 = width;
                } else {
                    i2 = height;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i2 = height;
                    i3 = width;
                } else {
                    i2 = height;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else {
                if (i4 != -1) {
                    if (i4 == -2) {
                        i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                    } else {
                        i2 = 0;
                        i4 = 0;
                    }
                }
                i4 = iMax;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public static abstract class o000oOoO {
        public abstract boolean onFling(int i, int i2);
    }

    public static abstract class o00O0O {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class o00Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SparseArray<OooO00o> f9034OooO00o = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9035OooO0O0 = 0;

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final ArrayList<oo0o0Oo> f9036OooO00o = new ArrayList<>();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f9037OooO0O0 = 5;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f9038OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f9039OooO0Oo = 0;
        }

        public final OooO00o OooO00o(int i) {
            OooO00o oooO00o = this.f9034OooO00o.get(i);
            if (oooO00o != null) {
                return oooO00o;
            }
            OooO00o oooO00o2 = new OooO00o();
            this.f9034OooO00o.put(i, oooO00o2);
            return oooO00o2;
        }
    }

    public final class o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<oo0o0Oo> f9040OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<oo0o0Oo> f9041OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<oo0o0Oo> f9042OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<oo0o0Oo> f9043OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f9044OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9045OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o00Oo0 f9046OooO0oO;

        public o00Ooo() {
            ArrayList<oo0o0Oo> arrayList = new ArrayList<>();
            this.f9040OooO00o = arrayList;
            this.f9041OooO0O0 = null;
            this.f9042OooO0OO = new ArrayList<>();
            this.f9043OooO0Oo = Collections.unmodifiableList(arrayList);
            this.f9045OooO0o0 = 2;
            this.f9044OooO0o = 2;
        }

        public final void OooO(@NonNull View view) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            OooOO0(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.OooOO0(childViewHolderInt);
        }

        /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        public final void OooO00o(@NonNull oo0o0Oo oo0o0oo, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(oo0o0oo);
            View view = oo0o0oo.itemView;
            o000000 o000000Var = RecyclerView.this.mAccessibilityDelegate;
            if (o000000Var != null) {
                o000000.OooO00o oooO00o = o000000Var.f9142OooO0o0;
                ViewCompat.OooOo0o(view, oooO00o instanceof o000000.OooO00o ? (androidx.core.view.OooO00o) oooO00o.f9144OooO0o0.remove(view) : null);
            }
            if (z) {
                oo000o oo000oVar = RecyclerView.this.mRecyclerListener;
                if (oo000oVar != null) {
                    oo000oVar.OooO00o();
                }
                int size = RecyclerView.this.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    RecyclerView.this.mRecyclerListeners.get(i).OooO00o();
                }
                Adapter adapter = RecyclerView.this.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(oo0o0oo);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.OooO0o(oo0o0oo);
                }
            }
            oo0o0oo.mBindingAdapter = null;
            oo0o0oo.mOwnerRecyclerView = null;
            o00Oo0 o00oo0OooO0Oo = OooO0Oo();
            Objects.requireNonNull(o00oo0OooO0Oo);
            int itemViewType = oo0o0oo.getItemViewType();
            ArrayList<oo0o0Oo> arrayList = o00oo0OooO0Oo.OooO00o(itemViewType).f9036OooO00o;
            if (o00oo0OooO0Oo.f9034OooO00o.get(itemViewType).f9037OooO0O0 <= arrayList.size()) {
                return;
            }
            oo0o0oo.resetInternal();
            arrayList.add(oo0o0oo);
        }

        public final void OooO0O0() {
            this.f9040OooO00o.clear();
            OooO0oO();
        }

        public final int OooO0OO(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.OooO0O0()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.mState.f9063OooO0oO ? i : recyclerView.mAdapterHelper.OooO0o(i, 0);
            }
            StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("invalid position ", i, ". State item count is ");
            sbOooO00o.append(RecyclerView.this.mState.OooO0O0());
            throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sbOooO00o));
        }

        public final o00Oo0 OooO0Oo() {
            if (this.f9046OooO0oO == null) {
                this.f9046OooO0oO = new o00Oo0();
            }
            return this.f9046OooO0oO;
        }

        public final void OooO0o(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    OooO0o((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        @NonNull
        public final View OooO0o0(int i) {
            return OooOO0o(i, Long.MAX_VALUE).itemView;
        }

        public final void OooO0oO() {
            for (int size = this.f9042OooO0OO.size() - 1; size >= 0; size--) {
                OooO0oo(size);
            }
            this.f9042OooO0OO.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O0 = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = oooO0O0.f9174OooO0OO;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                oooO0O0.f9175OooO0Oo = 0;
            }
        }

        public final void OooO0oo(int i) {
            OooO00o(this.f9042OooO0OO.get(i), true);
            this.f9042OooO0OO.remove(i);
        }

        public final void OooOO0(oo0o0Oo oo0o0oo) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (oo0o0oo.isScrap() || oo0o0oo.itemView.getParent() != null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Scrapped or attached views may not be recycled. isScrap:");
                sbOooO0o0.append(oo0o0oo.isScrap());
                sbOooO0o0.append(" isAttached:");
                sbOooO0o0.append(oo0o0oo.itemView.getParent() != null);
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sbOooO0o0));
            }
            if (oo0o0oo.isTmpDetached()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(oo0o0oo);
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb));
            }
            if (oo0o0oo.shouldIgnore()) {
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, OooO00o.OooO00o.OooO0o0("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = oo0o0oo.doesTransientStatePreventRecycling();
            Adapter adapter = RecyclerView.this.mAdapter;
            if ((adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(oo0o0oo)) || oo0o0oo.isRecyclable()) {
                if (this.f9044OooO0o <= 0 || oo0o0oo.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f9042OooO0OO.size();
                    if (size >= this.f9044OooO0o && size > 0) {
                        OooO0oo(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.OooO0OO(oo0o0oo.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.mPrefetchRegistry.OooO0OO(this.f9042OooO0OO.get(size).mPosition));
                        size++;
                    }
                    this.f9042OooO0OO.add(size, oo0o0oo);
                    z = true;
                }
                if (z) {
                    z2 = z;
                } else {
                    OooO00o(oo0o0oo, true);
                }
                RecyclerView.this.mViewInfoStore.OooO0o(oo0o0oo);
                if (z && !z3 && zDoesTransientStatePreventRecycling) {
                    oo0o0oo.mBindingAdapter = null;
                    oo0o0oo.mOwnerRecyclerView = null;
                    return;
                }
                return;
            }
            z2 = false;
            z = z2;
            z3 = false;
            RecyclerView.this.mViewInfoStore.OooO0o(oo0o0oo);
            if (z) {
            }
        }

        public final void OooOO0O(View view) {
            oo0o0Oo childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f9041OooO0O0 == null) {
                    this.f9041OooO0O0 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f9041OooO0O0.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, OooO00o.OooO00o.OooO0o0("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f9040OooO00o.add(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:114:0x0210  */
        /* JADX WARN: Code duplicated, block: B:116:0x021a  */
        /* JADX WARN: Code duplicated, block: B:117:0x0225  */
        /* JADX WARN: Code duplicated, block: B:119:0x022b  */
        /* JADX WARN: Code duplicated, block: B:121:0x0233  */
        /* JADX WARN: Code duplicated, block: B:126:0x0255  */
        /* JADX WARN: Code duplicated, block: B:212:0x0409  */
        /* JADX WARN: Code duplicated, block: B:218:0x0434  */
        /* JADX WARN: Code duplicated, block: B:220:0x043a  */
        /* JADX WARN: Code duplicated, block: B:224:0x0446  */
        /* JADX WARN: Code duplicated, block: B:226:0x0462  */
        /* JADX WARN: Code duplicated, block: B:228:0x0470  */
        /* JADX WARN: Code duplicated, block: B:232:0x0478  */
        /* JADX WARN: Code duplicated, block: B:234:0x047b  */
        /* JADX WARN: Code duplicated, block: B:238:0x049e  */
        /* JADX WARN: Code duplicated, block: B:241:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:243:0x04bb  */
        /* JADX WARN: Code duplicated, block: B:247:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:249:0x04cc  */
        /* JADX WARN: Code duplicated, block: B:251:0x04d5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:256:0x04e7  */
        /* JADX WARN: Code duplicated, block: B:260:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:261:0x0500  */
        /* JADX WARN: Code duplicated, block: B:263:0x0508  */
        /* JADX WARN: Code duplicated, block: B:264:0x0516  */
        /* JADX WARN: Code duplicated, block: B:267:0x051c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:279:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:284:0x0105 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:289:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x008c A[EDGE_INSN: B:35:0x008c->B:36:0x008d BREAK  A[LOOP:0: B:14:0x0028->B:20:0x0042]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0096  */
        /* JADX WARN: Code duplicated, block: B:44:0x009f  */
        /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:68:0x0108  */
        /* JADX WARN: Code duplicated, block: B:70:0x011a  */
        /* JADX WARN: Code duplicated, block: B:72:0x0122  */
        /* JADX WARN: Code duplicated, block: B:74:0x0134 A[EDGE_INSN: B:74:0x0134->B:93:0x01ba BREAK  A[LOOP:1: B:43:0x009d->B:55:0x00cc]] */
        /* JADX WARN: Code duplicated, block: B:75:0x0145  */
        /* JADX WARN: Code duplicated, block: B:77:0x015e  */
        /* JADX WARN: Code duplicated, block: B:79:0x0175  */
        /* JADX WARN: Code duplicated, block: B:81:0x018c  */
        /* JADX WARN: Code duplicated, block: B:83:0x0195  */
        /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:97:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:99:0x01cd  */
        /* JADX WARN: Instruction removed from duplicated block: B:77:0x015e, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:79:0x0175, please report this as an issue */
        /* JADX WARN: Type inference failed for: r10v27, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList, java.util.List<android.view.View>] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Nullable
        public final oo0o0Oo OooOO0o(int i, long j) {
            oo0o0Oo childViewHolderInt;
            boolean z;
            int itemViewType;
            long nanoTime;
            long j2;
            View view;
            o000000 o000000Var;
            o000000.OooO00o oooO00o;
            androidx.core.view.OooO00o oooO00oOooO0oO;
            long j3;
            boolean z2;
            boolean z3;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            int iOooO0o;
            RecyclerView recyclerViewFindNestedRecyclerView;
            oo0o0Oo oo0o0ooRemove;
            int size;
            int i2;
            androidx.recyclerview.widget.OooO0o oooO0o;
            int size2;
            int i3;
            View view2;
            int size3;
            int i4;
            oo0o0Oo oo0o0oo;
            androidx.recyclerview.widget.OooO0o oooO0o2;
            int iOooO0OO;
            int iOooOO0;
            oo0o0Oo childViewHolderInt2;
            int i5;
            boolean z4;
            int size4;
            int iOooO0o2;
            if (i < 0 || i >= RecyclerView.this.mState.OooO0O0()) {
                StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Invalid item position ", i, "(", i, "). Item count:");
                sbOooO0O0.append(RecyclerView.this.mState.OooO0O0());
                throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sbOooO0O0));
            }
            int i6 = 32;
            boolean z5 = false;
            if (RecyclerView.this.mState.f9063OooO0oO) {
                ArrayList<oo0o0Oo> arrayList = this.f9041OooO0O0;
                if (arrayList != null && (size4 = arrayList.size()) != 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            if (RecyclerView.this.mAdapter.hasStableIds() && (iOooO0o2 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0)) > 0 && iOooO0o2 < RecyclerView.this.mAdapter.getItemCount()) {
                                long itemId = RecyclerView.this.mAdapter.getItemId(iOooO0o2);
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        childViewHolderInt = null;
                                        break;
                                    }
                                    oo0o0Oo oo0o0oo2 = this.f9041OooO0O0.get(i8);
                                    if (!oo0o0oo2.wasReturnedFromScrap() && oo0o0oo2.getItemId() == itemId) {
                                        oo0o0oo2.addFlags(32);
                                        childViewHolderInt = oo0o0oo2;
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                childViewHolderInt = null;
                                break;
                            }
                        } else {
                            childViewHolderInt = this.f9041OooO0O0.get(i7);
                            if (!childViewHolderInt.wasReturnedFromScrap() && childViewHolderInt.getLayoutPosition() == i) {
                                childViewHolderInt.addFlags(32);
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    childViewHolderInt = null;
                    break;
                }
                z = childViewHolderInt != null;
                if (childViewHolderInt == null) {
                    size = this.f9040OooO00o.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            oooO0o = RecyclerView.this.mChildHelper;
                            size2 = oooO0o.f8891OooO0OO.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) oooO0o.f8891OooO0OO.get(i3);
                                Objects.requireNonNull((OooO) oooO0o.f8889OooO00o);
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                                if (childViewHolderInt2.getLayoutPosition() != i && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                    break;
                                }
                                i3++;
                            }
                            if (view2 != null) {
                                size3 = this.f9042OooO0OO.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        childViewHolderInt = null;
                                        break;
                                    }
                                    oo0o0oo = this.f9042OooO0OO.get(i4);
                                    if (oo0o0oo.isInvalid() && oo0o0oo.getLayoutPosition() == i && !oo0o0oo.isAttachedToTransitionOverlay()) {
                                        this.f9042OooO0OO.remove(i4);
                                    } else {
                                        i4++;
                                    }
                                }
                            } else {
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                oooO0o2 = RecyclerView.this.mChildHelper;
                                iOooO0OO = ((OooO) oooO0o2.f8889OooO00o).OooO0OO(view2);
                                if (iOooO0OO >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                if (oooO0o2.f8890OooO0O0.OooO0Oo(iOooO0OO)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                oooO0o2.f8890OooO0O0.OooO00o(iOooO0OO);
                                oooO0o2.OooOOO0(view2);
                                iOooOO0 = RecyclerView.this.mChildHelper.OooOO0(view2);
                                if (iOooOO0 != -1) {
                                    RecyclerView.this.mChildHelper.OooO0OO(iOooOO0);
                                    OooOO0O(view2);
                                    childViewHolderInt.addFlags(8224);
                                    break;
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("layout index should not be -1 after unhiding a view:");
                                sb.append(childViewHolderInt);
                                throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb));
                            }
                        } else {
                            oo0o0oo = this.f9040OooO00o.get(i2);
                            if (!oo0o0oo.wasReturnedFromScrap() || oo0o0oo.getLayoutPosition() != i || oo0o0oo.isInvalid() || (!RecyclerView.this.mState.f9063OooO0oO && oo0o0oo.isRemoved())) {
                                i2++;
                            } else {
                                oo0o0oo.addFlags(32);
                            }
                        }
                        childViewHolderInt = oo0o0oo;
                        break;
                    }
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isRemoved()) {
                            z4 = RecyclerView.this.mState.f9063OooO0oO;
                        } else {
                            i5 = childViewHolderInt.mPosition;
                            if (i5 >= 0 || i5 >= RecyclerView.this.mAdapter.getItemCount()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Inconsistency detected. Invalid view holder adapter position");
                                sb2.append(childViewHolderInt);
                                throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb2));
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            z4 = (recyclerView.mState.f9063OooO0oO || recyclerView.mAdapter.getItemViewType(childViewHolderInt.mPosition) == childViewHolderInt.getItemViewType()) && (!RecyclerView.this.mAdapter.hasStableIds() || childViewHolderInt.getItemId() == RecyclerView.this.mAdapter.getItemId(childViewHolderInt.mPosition));
                        }
                        if (z4) {
                            z = true;
                        } else {
                            childViewHolderInt.addFlags(4);
                            if (childViewHolderInt.isScrap()) {
                                RecyclerView.this.removeDetachedView(childViewHolderInt.itemView, false);
                                childViewHolderInt.unScrap();
                            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                                childViewHolderInt.clearReturnedFromScrapFlag();
                            }
                            OooOO0(childViewHolderInt);
                            childViewHolderInt = null;
                        }
                    }
                }
                if (childViewHolderInt == null) {
                    iOooO0o = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                    if (iOooO0o >= 0 || iOooO0o >= RecyclerView.this.mAdapter.getItemCount()) {
                        StringBuilder sbOooO0O1 = o000O0Oo.OooO0O0("Inconsistency detected. Invalid item position ", i, "(offset:", iOooO0o, ").state:");
                        sbOooO0O1.append(RecyclerView.this.mState.OooO0O0());
                        throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sbOooO0O1));
                    }
                    int itemViewType2 = RecyclerView.this.mAdapter.getItemViewType(iOooO0o);
                    if (RecyclerView.this.mAdapter.hasStableIds()) {
                        long itemId2 = RecyclerView.this.mAdapter.getItemId(iOooO0o);
                        int size5 = this.f9040OooO00o.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = this.f9042OooO0OO.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        childViewHolderInt = this.f9042OooO0OO.get(size6);
                                        if (childViewHolderInt.getItemId() != itemId2 || childViewHolderInt.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else {
                                            if (itemViewType2 == childViewHolderInt.getItemViewType()) {
                                                this.f9042OooO0OO.remove(size6);
                                                break;
                                            }
                                            OooO0oo(size6);
                                        }
                                    }
                                    childViewHolderInt = null;
                                    break;
                                }
                            }
                            oo0o0Oo oo0o0oo3 = this.f9040OooO00o.get(size5);
                            if (oo0o0oo3.getItemId() == itemId2 && !oo0o0oo3.wasReturnedFromScrap()) {
                                if (itemViewType2 == oo0o0oo3.getItemViewType()) {
                                    oo0o0oo3.addFlags(i6);
                                    if (oo0o0oo3.isRemoved() && !RecyclerView.this.mState.f9063OooO0oO) {
                                        oo0o0oo3.setFlags(2, 14);
                                    }
                                    childViewHolderInt = oo0o0oo3;
                                    break;
                                }
                                this.f9040OooO00o.remove(size5);
                                RecyclerView.this.removeDetachedView(oo0o0oo3.itemView, false);
                                oo0o0Oo childViewHolderInt3 = RecyclerView.getChildViewHolderInt(oo0o0oo3.itemView);
                                childViewHolderInt3.mScrapContainer = null;
                                childViewHolderInt3.mInChangeScrap = false;
                                childViewHolderInt3.clearReturnedFromScrapFlag();
                                OooOO0(childViewHolderInt3);
                            }
                            size5--;
                            i6 = 32;
                        }
                        if (childViewHolderInt != null) {
                            childViewHolderInt.mPosition = iOooO0o;
                            z = true;
                        }
                    }
                    if (childViewHolderInt == null) {
                        o00Oo0.OooO00o oooO00o2 = OooO0Oo().f9034OooO00o.get(itemViewType2);
                        if (oooO00o2 != null && !oooO00o2.f9036OooO00o.isEmpty()) {
                            ArrayList<oo0o0Oo> arrayList2 = oooO00o2.f9036OooO00o;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    oo0o0ooRemove = null;
                                    break;
                                }
                                if (!arrayList2.get(size7).isAttachedToTransitionOverlay()) {
                                    oo0o0ooRemove = arrayList2.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            oo0o0ooRemove = null;
                            break;
                        }
                        if (oo0o0ooRemove != null) {
                            oo0o0ooRemove.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = oo0o0ooRemove.itemView;
                                if (view3 instanceof ViewGroup) {
                                    OooO0o((ViewGroup) view3, false);
                                }
                            }
                        }
                        childViewHolderInt = oo0o0ooRemove;
                    }
                    if (childViewHolderInt == null) {
                        long nanoTime2 = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j4 = this.f9046OooO0oO.OooO00o(itemViewType2).f9038OooO0OO;
                            if (!(j4 == 0 || j4 + nanoTime2 < j)) {
                                return null;
                            }
                        }
                        RecyclerView recyclerView2 = RecyclerView.this;
                        oo0o0Oo oo0o0ooCreateViewHolder = recyclerView2.mAdapter.createViewHolder(recyclerView2, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(oo0o0ooCreateViewHolder.itemView)) != null) {
                            oo0o0ooCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        long nanoTime3 = RecyclerView.this.getNanoTime() - nanoTime2;
                        o00Oo0.OooO00o OooO00o2 = this.f9046OooO0oO.OooO00o(itemViewType2);
                        long j5 = OooO00o2.f9038OooO0OO;
                        if (j5 != 0) {
                            nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                        }
                        OooO00o2.f9038OooO0OO = nanoTime3;
                        childViewHolderInt = oo0o0ooCreateViewHolder;
                    }
                }
                if (z && !RecyclerView.this.mState.f9063OooO0oO && childViewHolderInt.hasAnyOfTheFlags(8192)) {
                    childViewHolderInt.setFlags(0, 8192);
                    if (RecyclerView.this.mState.f9065OooOO0) {
                        ItemAnimator.OooO0o0(childViewHolderInt);
                        ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
                        childViewHolderInt.getUnmodifiedPayloads();
                        Objects.requireNonNull(itemAnimator);
                        ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                        oooO0OO.OooO00o(childViewHolderInt);
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, oooO0OO);
                    }
                }
                if (RecyclerView.this.mState.f9063OooO0oO || !childViewHolderInt.isBound()) {
                    if (childViewHolderInt.isBound() || childViewHolderInt.needsUpdate() || childViewHolderInt.isInvalid()) {
                        int iOooO0o3 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                        childViewHolderInt.mBindingAdapter = null;
                        childViewHolderInt.mOwnerRecyclerView = RecyclerView.this;
                        itemViewType = childViewHolderInt.getItemViewType();
                        long nanoTime4 = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j3 = this.f9046OooO0oO.OooO00o(itemViewType).f9039OooO0Oo;
                            if (j3 != 0 || j3 + nanoTime4 < j) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                        RecyclerView.this.mAdapter.bindViewHolder(childViewHolderInt, iOooO0o3);
                        nanoTime = RecyclerView.this.getNanoTime() - nanoTime4;
                        o00Oo0.OooO00o OooO00o3 = this.f9046OooO0oO.OooO00o(childViewHolderInt.getItemViewType());
                        j2 = OooO00o3.f9039OooO0Oo;
                        if (j2 != 0) {
                            nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                        }
                        OooO00o3.f9039OooO0Oo = nanoTime;
                        if (RecyclerView.this.isAccessibilityEnabled()) {
                            view = childViewHolderInt.itemView;
                            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                            if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                                ViewCompat.OooO0o.OooOOoo(view, 1);
                            }
                            o000000Var = RecyclerView.this.mAccessibilityDelegate;
                            if (o000000Var != null) {
                                oooO00o = o000000Var.f9142OooO0o0;
                                if (oooO00o instanceof o000000.OooO00o) {
                                    Objects.requireNonNull(oooO00o);
                                    oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                                    if (oooO00oOooO0oO != null && oooO00oOooO0oO != oooO00o) {
                                        oooO00o.f9144OooO0o0.put(view, oooO00oOooO0oO);
                                    }
                                }
                                ViewCompat.OooOo0o(view, oooO00o);
                            }
                        }
                        if (RecyclerView.this.mState.f9063OooO0oO) {
                            childViewHolderInt.mPreLayoutPosition = i;
                        }
                    }
                    layoutParams = childViewHolderInt.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        childViewHolderInt.itemView.setLayoutParams(layoutParams2);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                        childViewHolderInt.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f9017Oooo0o = childViewHolderInt;
                    if (z && z3) {
                        z5 = true;
                    }
                    layoutParams2.f9016Oooo = z5;
                    return childViewHolderInt;
                }
                childViewHolderInt.mPreLayoutPosition = i;
                layoutParams = childViewHolderInt.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                    childViewHolderInt.itemView.setLayoutParams(layoutParams2);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                    childViewHolderInt.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.f9017Oooo0o = childViewHolderInt;
                if (z) {
                    z5 = true;
                }
                layoutParams2.f9016Oooo = z5;
                return childViewHolderInt;
            }
            childViewHolderInt = null;
            if (childViewHolderInt == null) {
                size = this.f9040OooO00o.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        oo0o0oo = this.f9040OooO00o.get(i2);
                        if (oo0o0oo.wasReturnedFromScrap()) {
                        }
                        i2++;
                    } else {
                        oooO0o = RecyclerView.this.mChildHelper;
                        size2 = oooO0o.f8891OooO0OO.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) oooO0o.f8891OooO0OO.get(i3);
                            Objects.requireNonNull((OooO) oooO0o.f8889OooO00o);
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                            if (childViewHolderInt2.getLayoutPosition() != i) {
                            }
                            i3++;
                        }
                        if (view2 != null) {
                            size3 = this.f9042OooO0OO.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size3) {
                                    childViewHolderInt = null;
                                    break;
                                }
                                oo0o0oo = this.f9042OooO0OO.get(i4);
                                if (oo0o0oo.isInvalid()) {
                                }
                                i4++;
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                            oooO0o2 = RecyclerView.this.mChildHelper;
                            iOooO0OO = ((OooO) oooO0o2.f8889OooO00o).OooO0OO(view2);
                            if (iOooO0OO >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                            }
                            if (oooO0o2.f8890OooO0O0.OooO0Oo(iOooO0OO)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            oooO0o2.f8890OooO0O0.OooO00o(iOooO0OO);
                            oooO0o2.OooOOO0(view2);
                            iOooOO0 = RecyclerView.this.mChildHelper.OooOO0(view2);
                            if (iOooOO0 != -1) {
                                RecyclerView.this.mChildHelper.OooO0OO(iOooOO0);
                                OooOO0O(view2);
                                childViewHolderInt.addFlags(8224);
                                break;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("layout index should not be -1 after unhiding a view:");
                            sb3.append(childViewHolderInt);
                            throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb3));
                        }
                        if (childViewHolderInt != null) {
                            if (childViewHolderInt.isRemoved()) {
                                i5 = childViewHolderInt.mPosition;
                                if (i5 >= 0) {
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Inconsistency detected. Invalid view holder adapter position");
                                sb4.append(childViewHolderInt);
                                throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb4));
                            }
                            z4 = RecyclerView.this.mState.f9063OooO0oO;
                            if (z4) {
                                childViewHolderInt.addFlags(4);
                                if (childViewHolderInt.isScrap()) {
                                    RecyclerView.this.removeDetachedView(childViewHolderInt.itemView, false);
                                    childViewHolderInt.unScrap();
                                } else if (childViewHolderInt.wasReturnedFromScrap()) {
                                    childViewHolderInt.clearReturnedFromScrapFlag();
                                }
                                OooOO0(childViewHolderInt);
                                childViewHolderInt = null;
                            } else {
                                z = true;
                            }
                        }
                    }
                    childViewHolderInt = oo0o0oo;
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isRemoved()) {
                            i5 = childViewHolderInt.mPosition;
                            if (i5 >= 0) {
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(childViewHolderInt);
                            throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sb5));
                        }
                        z4 = RecyclerView.this.mState.f9063OooO0oO;
                        if (z4) {
                            childViewHolderInt.addFlags(4);
                            if (childViewHolderInt.isScrap()) {
                                RecyclerView.this.removeDetachedView(childViewHolderInt.itemView, false);
                                childViewHolderInt.unScrap();
                            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                                childViewHolderInt.clearReturnedFromScrapFlag();
                            }
                            OooOO0(childViewHolderInt);
                            childViewHolderInt = null;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            if (childViewHolderInt == null) {
                iOooO0o = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                if (iOooO0o >= 0) {
                }
                StringBuilder sbOooO0O2 = o000O0Oo.OooO0O0("Inconsistency detected. Invalid item position ", i, "(offset:", iOooO0o, ").state:");
                sbOooO0O2.append(RecyclerView.this.mState.OooO0O0());
                throw new IndexOutOfBoundsException(Oooo0.OooOO0O.OooO00o(RecyclerView.this, sbOooO0O2));
            }
            if (z) {
                childViewHolderInt.setFlags(0, 8192);
                if (RecyclerView.this.mState.f9065OooOO0) {
                    ItemAnimator.OooO0o0(childViewHolderInt);
                    ItemAnimator itemAnimator2 = RecyclerView.this.mItemAnimator;
                    childViewHolderInt.getUnmodifiedPayloads();
                    Objects.requireNonNull(itemAnimator2);
                    ItemAnimator.OooO0OO oooO0OO2 = new ItemAnimator.OooO0OO();
                    oooO0OO2.OooO00o(childViewHolderInt);
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(childViewHolderInt, oooO0OO2);
                }
            }
            if (RecyclerView.this.mState.f9063OooO0oO) {
                if (childViewHolderInt.isBound()) {
                    int iOooO0o4 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                    childViewHolderInt.mBindingAdapter = null;
                    childViewHolderInt.mOwnerRecyclerView = RecyclerView.this;
                    itemViewType = childViewHolderInt.getItemViewType();
                    long nanoTime5 = RecyclerView.this.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.f9046OooO0oO.OooO00o(itemViewType).f9039OooO0Oo;
                        if (j3 != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        z3 = z2;
                    }
                    RecyclerView.this.mAdapter.bindViewHolder(childViewHolderInt, iOooO0o4);
                    nanoTime = RecyclerView.this.getNanoTime() - nanoTime5;
                    o00Oo0.OooO00o OooO00o4 = this.f9046OooO0oO.OooO00o(childViewHolderInt.getItemViewType());
                    j2 = OooO00o4.f9039OooO0Oo;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    OooO00o4.f9039OooO0Oo = nanoTime;
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolderInt.itemView;
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                            ViewCompat.OooO0o.OooOOoo(view, 1);
                        }
                        o000000Var = RecyclerView.this.mAccessibilityDelegate;
                        if (o000000Var != null) {
                            oooO00o = o000000Var.f9142OooO0o0;
                            if (oooO00o instanceof o000000.OooO00o) {
                                Objects.requireNonNull(oooO00o);
                                oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                                if (oooO00oOooO0oO != null) {
                                    oooO00o.f9144OooO0o0.put(view, oooO00oOooO0oO);
                                }
                            }
                            ViewCompat.OooOo0o(view, oooO00o);
                        }
                    }
                    if (RecyclerView.this.mState.f9063OooO0oO) {
                        childViewHolderInt.mPreLayoutPosition = i;
                    }
                } else {
                    int iOooO0o5 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                    childViewHolderInt.mBindingAdapter = null;
                    childViewHolderInt.mOwnerRecyclerView = RecyclerView.this;
                    itemViewType = childViewHolderInt.getItemViewType();
                    long nanoTime6 = RecyclerView.this.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.f9046OooO0oO.OooO00o(itemViewType).f9039OooO0Oo;
                        if (j3 != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                        }
                    }
                    RecyclerView.this.mAdapter.bindViewHolder(childViewHolderInt, iOooO0o5);
                    nanoTime = RecyclerView.this.getNanoTime() - nanoTime6;
                    o00Oo0.OooO00o OooO00o5 = this.f9046OooO0oO.OooO00o(childViewHolderInt.getItemViewType());
                    j2 = OooO00o5.f9039OooO0Oo;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    OooO00o5.f9039OooO0Oo = nanoTime;
                    if (RecyclerView.this.isAccessibilityEnabled()) {
                        view = childViewHolderInt.itemView;
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                            ViewCompat.OooO0o.OooOOoo(view, 1);
                        }
                        o000000Var = RecyclerView.this.mAccessibilityDelegate;
                        if (o000000Var != null) {
                            oooO00o = o000000Var.f9142OooO0o0;
                            if (oooO00o instanceof o000000.OooO00o) {
                                Objects.requireNonNull(oooO00o);
                                oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                                if (oooO00oOooO0oO != null) {
                                    oooO00o.f9144OooO0o0.put(view, oooO00oOooO0oO);
                                }
                            }
                            ViewCompat.OooOo0o(view, oooO00o);
                        }
                    }
                    if (RecyclerView.this.mState.f9063OooO0oO) {
                        childViewHolderInt.mPreLayoutPosition = i;
                    }
                }
            } else if (childViewHolderInt.isBound()) {
                int iOooO0o6 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                childViewHolderInt.mBindingAdapter = null;
                childViewHolderInt.mOwnerRecyclerView = RecyclerView.this;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime7 = RecyclerView.this.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.f9046OooO0oO.OooO00o(itemViewType).f9039OooO0Oo;
                    if (j3 != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                    }
                }
                RecyclerView.this.mAdapter.bindViewHolder(childViewHolderInt, iOooO0o6);
                nanoTime = RecyclerView.this.getNanoTime() - nanoTime7;
                o00Oo0.OooO00o OooO00o6 = this.f9046OooO0oO.OooO00o(childViewHolderInt.getItemViewType());
                j2 = OooO00o6.f9039OooO0Oo;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                OooO00o6.f9039OooO0Oo = nanoTime;
                if (RecyclerView.this.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap4 = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                        ViewCompat.OooO0o.OooOOoo(view, 1);
                    }
                    o000000Var = RecyclerView.this.mAccessibilityDelegate;
                    if (o000000Var != null) {
                        oooO00o = o000000Var.f9142OooO0o0;
                        if (oooO00o instanceof o000000.OooO00o) {
                            Objects.requireNonNull(oooO00o);
                            oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                            if (oooO00oOooO0oO != null) {
                                oooO00o.f9144OooO0o0.put(view, oooO00oOooO0oO);
                            }
                        }
                        ViewCompat.OooOo0o(view, oooO00o);
                    }
                }
                if (RecyclerView.this.mState.f9063OooO0oO) {
                    childViewHolderInt.mPreLayoutPosition = i;
                }
            } else {
                int iOooO0o7 = RecyclerView.this.mAdapterHelper.OooO0o(i, 0);
                childViewHolderInt.mBindingAdapter = null;
                childViewHolderInt.mOwnerRecyclerView = RecyclerView.this;
                itemViewType = childViewHolderInt.getItemViewType();
                long nanoTime8 = RecyclerView.this.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.f9046OooO0oO.OooO00o(itemViewType).f9039OooO0Oo;
                    if (j3 != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                    }
                }
                RecyclerView.this.mAdapter.bindViewHolder(childViewHolderInt, iOooO0o7);
                nanoTime = RecyclerView.this.getNanoTime() - nanoTime8;
                o00Oo0.OooO00o OooO00o7 = this.f9046OooO0oO.OooO00o(childViewHolderInt.getItemViewType());
                j2 = OooO00o7.f9039OooO0Oo;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                OooO00o7.f9039OooO0Oo = nanoTime;
                if (RecyclerView.this.isAccessibilityEnabled()) {
                    view = childViewHolderInt.itemView;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap5 = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                        ViewCompat.OooO0o.OooOOoo(view, 1);
                    }
                    o000000Var = RecyclerView.this.mAccessibilityDelegate;
                    if (o000000Var != null) {
                        oooO00o = o000000Var.f9142OooO0o0;
                        if (oooO00o instanceof o000000.OooO00o) {
                            Objects.requireNonNull(oooO00o);
                            oooO00oOooO0oO = ViewCompat.OooO0oO(view);
                            if (oooO00oOooO0oO != null) {
                                oooO00o.f9144OooO0o0.put(view, oooO00oOooO0oO);
                            }
                        }
                        ViewCompat.OooOo0o(view, oooO00o);
                    }
                }
                if (RecyclerView.this.mState.f9063OooO0oO) {
                    childViewHolderInt.mPreLayoutPosition = i;
                }
            }
            layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(layoutParams2);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.f9017Oooo0o = childViewHolderInt;
            if (z) {
                z5 = true;
            }
            layoutParams2.f9016Oooo = z5;
            return childViewHolderInt;
        }

        public final void OooOOO() {
            Oooo000 oooo000 = RecyclerView.this.mLayout;
            this.f9044OooO0o = this.f9045OooO0o0 + (oooo000 != null ? oooo000.mPrefetchMaxCountObserved : 0);
            for (int size = this.f9042OooO0OO.size() - 1; size >= 0 && this.f9042OooO0OO.size() > this.f9044OooO0o; size--) {
                OooO0oo(size);
            }
        }

        public final void OooOOO0(oo0o0Oo oo0o0oo) {
            if (oo0o0oo.mInChangeScrap) {
                this.f9041OooO0O0.remove(oo0o0oo);
            } else {
                this.f9040OooO00o.remove(oo0o0oo);
            }
            oo0o0oo.mScrapContainer = null;
            oo0o0oo.mInChangeScrap = false;
            oo0o0oo.clearReturnedFromScrapFlag();
        }
    }

    public class o00oO0o extends OooOOO {
        public o00oO0o() {
        }

        public final void OooO00o() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOO0(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f9061OooO0o = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.OooO0oO()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(oooO00o);
            boolean z = false;
            if (i2 >= 1) {
                oooO00o.f8874OooO0O0.add(oooO00o.OooO0oo(4, i, i2, obj));
                oooO00o.f8877OooO0o |= 4;
                if (oooO00o.f8874OooO0O0.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(oooO00o);
            boolean z = false;
            if (i2 >= 1) {
                oooO00o.f8874OooO0O0.add(oooO00o.OooO0oo(1, i, i2, null));
                oooO00o.f8877OooO0o |= 1;
                if (oooO00o.f8874OooO0O0.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(oooO00o);
            boolean z = false;
            if (i != i2) {
                if (i3 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                oooO00o.f8874OooO0O0.add(oooO00o.OooO0oo(8, i, i2, null));
                oooO00o.f8877OooO0o |= 8;
                if (oooO00o.f8874OooO0O0.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(oooO00o);
            boolean z = false;
            if (i2 >= 1) {
                oooO00o.f8874OooO0O0.add(oooO00o.OooO0oo(2, i, i2, null));
                oooO00o.f8877OooO0o |= 2;
                if (oooO00o.f8874OooO0O0.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    public class o0OO00O implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Interpolator f9049Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f9050Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f9051Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public OverScroller f9052Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f9053OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f9054OoooO00;

        public o0OO00O() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f9049Oooo = interpolator;
            this.f9054OoooO00 = false;
            this.f9053OoooO0 = false;
            this.f9052Oooo0oo = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void OooO00o() {
            if (this.f9054OoooO00) {
                this.f9053OoooO0 = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOOO0(recyclerView, this);
        }

        public final void OooO0O0(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f9049Oooo != interpolator) {
                this.f9049Oooo = interpolator;
                this.f9052Oooo0oo = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f9051Oooo0oO = 0;
            this.f9050Oooo0o = 0;
            RecyclerView.this.setScrollState(2);
            this.f9052Oooo0oo.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f9052Oooo0oo.computeScrollOffset();
            }
            OooO00o();
        }

        public final void OooO0OO() {
            RecyclerView.this.removeCallbacks(this);
            this.f9052Oooo0oo.abortAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                OooO0OO();
                return;
            }
            this.f9053OoooO0 = false;
            this.f9054OoooO00 = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f9052Oooo0oo;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f9050Oooo0o;
                int i5 = currY - this.f9051Oooo0oO;
                this.f9050Oooo0o = currX;
                this.f9051Oooo0oO = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    o0ooOOo o0ooooo2 = recyclerView4.mLayout.mSmoothScroller;
                    if (o0ooooo2 != null && !o0ooooo2.isPendingInitialRun() && o0ooooo2.isRunning()) {
                        int iOooO0O0 = RecyclerView.this.mState.OooO0O0();
                        if (iOooO0O0 == 0) {
                            o0ooooo2.stop();
                        } else if (o0ooooo2.getTargetPosition() >= iOooO0O0) {
                            o0ooooo2.setTargetPosition(iOooO0O0 - 1);
                            o0ooooo2.onAnimation(i2, i);
                        } else {
                            o0ooooo2.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                o0ooOOo o0ooooo3 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((o0ooooo3 != null && o0ooooo3.isPendingInitialRun()) || !z) {
                    OooO00o();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.o000oOoO o000oooo2 = recyclerView7.mGapWorker;
                    if (o000oooo2 != null) {
                        o000oooo2.OooO00o(recyclerView7, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O0 = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = oooO0O0.f9174OooO0OO;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        oooO0O0.f9175OooO0Oo = 0;
                    }
                }
            }
            o0ooOOo o0ooooo4 = RecyclerView.this.mLayout.mSmoothScroller;
            if (o0ooooo4 != null && o0ooooo4.isPendingInitialRun()) {
                o0ooooo4.onAnimation(0, 0);
            }
            this.f9054OoooO00 = false;
            if (!this.f9053OoooO0) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            } else {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView8 = RecyclerView.this;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(recyclerView8, this);
            }
        }
    }

    public static class o0OOO0o {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f9067OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f9068OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public long f9069OooOOO0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f9057OooO00o = -1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9058OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f9059OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9060OooO0Oo = 1;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9062OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f9061OooO0o = false;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f9063OooO0oO = false;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f9064OooO0oo = false;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f9056OooO = false;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f9065OooOO0 = false;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f9066OooOO0O = false;

        public final void OooO00o(int i) {
            if ((this.f9060OooO0Oo & i) != 0) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Layout state should be one of ");
            sbOooO0o0.append(Integer.toBinaryString(i));
            sbOooO0o0.append(" but it is ");
            sbOooO0o0.append(Integer.toBinaryString(this.f9060OooO0Oo));
            throw new IllegalStateException(sbOooO0o0.toString());
        }

        public final int OooO0O0() {
            return this.f9063OooO0oO ? this.f9058OooO0O0 - this.f9059OooO0OO : this.f9062OooO0o0;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("State{mTargetPosition=");
            sbOooO0o0.append(this.f9057OooO00o);
            sbOooO0o0.append(", mData=");
            sbOooO0o0.append((Object) null);
            sbOooO0o0.append(", mItemCount=");
            sbOooO0o0.append(this.f9062OooO0o0);
            sbOooO0o0.append(", mIsMeasuring=");
            sbOooO0o0.append(this.f9056OooO);
            sbOooO0o0.append(", mPreviousLayoutItemCount=");
            sbOooO0o0.append(this.f9058OooO0O0);
            sbOooO0o0.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sbOooO0o0.append(this.f9059OooO0OO);
            sbOooO0o0.append(", mStructureChanged=");
            sbOooO0o0.append(this.f9061OooO0o);
            sbOooO0o0.append(", mInPreLayout=");
            sbOooO0o0.append(this.f9063OooO0oO);
            sbOooO0o0.append(", mRunSimpleAnimations=");
            sbOooO0o0.append(this.f9065OooOO0);
            sbOooO0o0.append(", mRunPredictiveAnimations=");
            return Oooo000.Oooo0.OooO0O0(sbOooO0o0, this.f9066OooOO0O, '}');
        }
    }

    public static abstract class o0Oo0oo {
    }

    public interface o0OoOo0 {
        void OooO00o(@NonNull MotionEvent motionEvent);

        boolean OooO0O0(@NonNull MotionEvent motionEvent);

        void OooO0OO(boolean z);
    }

    public static abstract class o0ooOOo {
        private Oooo000 mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final OooO00o mRecyclingAction = new OooO00o();

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f9073OooO0Oo = -1;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f9074OooO0o = false;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f9076OooO0oO = 0;

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f9070OooO00o = 0;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f9071OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f9072OooO0OO = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Interpolator f9075OooO0o0 = null;

            public final void OooO00o(RecyclerView recyclerView) {
                int i = this.f9073OooO0Oo;
                if (i >= 0) {
                    this.f9073OooO0Oo = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f9074OooO0o = false;
                    return;
                }
                if (!this.f9074OooO0o) {
                    this.f9076OooO0oO = 0;
                    return;
                }
                Interpolator interpolator = this.f9075OooO0o0;
                if (interpolator != null && this.f9072OooO0OO < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f9072OooO0OO;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.OooO0O0(this.f9070OooO00o, this.f9071OooO0O0, i2, interpolator);
                int i3 = this.f9076OooO0oO + 1;
                this.f9076OooO0oO = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f9074OooO0o = false;
            }

            public final void OooO0O0(@Px int i, @Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.f9070OooO00o = i;
                this.f9071OooO0O0 = i2;
                this.f9072OooO0OO = i3;
                this.f9075OooO0o0 = interpolator;
                this.f9074OooO0o = true;
            }
        }

        public interface OooO0O0 {
            @Nullable
            PointF computeScrollVectorForPosition(int i);
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof OooO0O0) {
                return ((OooO0O0) layoutManager).computeScrollVectorForPosition(i);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sbOooO0o0.append(OooO0O0.class.getCanonicalName());
            Log.w(RecyclerView.TAG, sbOooO0o0.toString());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public Oooo000 getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || pointFComputeScrollVectorForPosition.y != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.OooO00o(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                OooO00o oooO00o = this.mRecyclingAction;
                boolean z = oooO00o.f9073OooO0Oo >= 0;
                oooO00o.OooO00o(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.OooO00o();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(@Px int i, @Px int i2, @NonNull o0OOO0o o0ooo0o2, @NonNull OooO00o oooO00o);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull o0OOO0o o0ooo0o2, @NonNull OooO00o oooO00o);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, Oooo000 oooo000) {
            recyclerView.mViewFlinger.OooO0OO();
            if (this.mStarted) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("An instance of ");
                sbOooO0o0.append(getClass().getSimpleName());
                sbOooO0o0.append(" was started more than once. Each instance of");
                sbOooO0o0.append(getClass().getSimpleName());
                sbOooO0o0.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, sbOooO0o0.toString());
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oooo000;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f9057OooO00o = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.OooO00o();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f9057OooO00o = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public interface oo000o {
        void OooO00o();
    }

    public static abstract class oo0o0Oo {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        public Adapter<? extends oo0o0Oo> mBindingAdapter;
        public int mFlags;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public oo0o0Oo mShadowedHolder = null;
        public oo0o0Oo mShadowingHolder = null;
        public List<Object> mPayloads = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        public o00Ooo mScrapContainer = null;
        public boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        public int mPendingAccessibilityState = -1;

        public oo0o0Oo(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO0o.OooO(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends oo0o0Oo> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (!ViewCompat.OooO0o.OooO(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f9019Oooo0oo = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.OooO0o.OooO0OO(view);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(o00Ooo o00ooo2, boolean z) {
            this.mScrapContainer = o00ooo2;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbOooO00o = p708oo000o.Oooo0.OooO00o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbOooO00o.append(Integer.toHexString(hashCode()));
            sbOooO00o.append(" position=");
            sbOooO00o.append(this.mPosition);
            sbOooO00o.append(" id=");
            sbOooO00o.append(this.mItemId);
            sbOooO00o.append(", oldPos=");
            sbOooO00o.append(this.mOldPosition);
            sbOooO00o.append(", pLpos:");
            sbOooO00o.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbOooO00o.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" not recyclable(");
                sbOooO0o0.append(this.mIsRecyclableCount);
                sbOooO0o0.append(")");
                sb.append(sbOooO0o0.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.OooOOO0(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new OooO0OO();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(oo0o0Oo oo0o0oo) {
        View view = oo0o0oo.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.OooOOO0(getChildViewHolder(view));
        if (oo0o0oo.isTmpDetached()) {
            this.mChildHelper.OooO0O0(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.mChildHelper.OooO00o(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        int iOooO0OO = ((OooO) oooO0o.f8889OooO00o).OooO0OO(view);
        if (iOooO0OO >= 0) {
            oooO0o.f8890OooO0O0.OooO0oo(iOooO0OO);
            oooO0o.OooO(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull oo0o0Oo oo0o0oo, @NonNull oo0o0Oo oo0o0oo2, @NonNull ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2, boolean z, boolean z2) {
        oo0o0oo.setIsRecyclable(false);
        if (z) {
            addAnimatingView(oo0o0oo);
        }
        if (oo0o0oo != oo0o0oo2) {
            if (z2) {
                addAnimatingView(oo0o0oo2);
            }
            oo0o0oo.mShadowedHolder = oo0o0oo2;
            addAnimatingView(oo0o0oo);
            this.mRecycler.OooOOO0(oo0o0oo);
            oo0o0oo2.setIsRecyclable(false);
            oo0o0oo2.mShadowingHolder = oo0o0oo;
        }
        if (this.mItemAnimator.OooO0O0(oo0o0oo, oo0o0oo2, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull oo0o0Oo oo0o0oo) {
        WeakReference<RecyclerView> weakReference = oo0o0oo.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == oo0o0oo.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            oo0o0oo.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(Oooo000.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((Oooo000) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(oo0o0Oo.FLAG_MOVED);
        o0000O0.OooO0O0(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.OooO00o(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f9056OooO = false;
        startInterceptRequestLayout();
        o00000OO o00000oo2 = this.mViewInfoStore;
        o00000oo2.f9153OooO00o.clear();
        o00000oo2.f9154OooO0O0.OooO0Oo();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f9064OooO0oo = o0ooo0o2.f9065OooOO0 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        o0ooo0o2.f9063OooO0oO = o0ooo0o2.f9066OooOO0O;
        o0ooo0o2.f9062OooO0o0 = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f9065OooOO0) {
            int iOooO0o0 = this.mChildHelper.OooO0o0();
            for (int i = 0; i < iOooO0o0; i++) {
                oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator itemAnimator = this.mItemAnimator;
                    ItemAnimator.OooO0o0(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    Objects.requireNonNull(itemAnimator);
                    ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    this.mViewInfoStore.OooO0OO(childViewHolderInt, oooO0OO);
                    if (this.mState.f9064OooO0oo && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f9154OooO0O0.OooOO0o(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f9066OooOO0O) {
            saveOldPositions();
            o0OOO0o o0ooo0o3 = this.mState;
            boolean z = o0ooo0o3.f9061OooO0o;
            o0ooo0o3.f9061OooO0o = false;
            this.mLayout.onLayoutChildren(this.mRecycler, o0ooo0o3);
            this.mState.f9061OooO0o = z;
            for (int i2 = 0; i2 < this.mChildHelper.OooO0o0(); i2++) {
                oo0o0Oo childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i2));
                if (!childViewHolderInt2.shouldIgnore()) {
                    o00000OO.OooO00o orDefault = this.mViewInfoStore.f9153OooO00o.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.f9156OooO00o & 4) == 0) ? false : true)) {
                        ItemAnimator.OooO0o0(childViewHolderInt2);
                        boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        ItemAnimator itemAnimator2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        Objects.requireNonNull(itemAnimator2);
                        ItemAnimator.OooO0OO oooO0OO2 = new ItemAnimator.OooO0OO();
                        oooO0OO2.OooO00o(childViewHolderInt2);
                        if (zHasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, oooO0OO2);
                        } else {
                            o00000OO o00000oo3 = this.mViewInfoStore;
                            o00000OO.OooO00o orDefault2 = o00000oo3.f9153OooO00o.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = o00000OO.OooO00o.OooO00o();
                                o00000oo3.f9153OooO00o.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.f9156OooO00o |= 2;
                            orDefault2.f9157OooO0O0 = oooO0OO2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f9060OooO0Oo = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.OooO00o(6);
        this.mAdapterHelper.OooO0OO();
        this.mState.f9062OooO0o0 = this.mAdapter.getItemCount();
        this.mState.f9059OooO0OO = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f9033Oooo0oo;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f9063OooO0oO = false;
        this.mLayout.onLayoutChildren(this.mRecycler, o0ooo0o2);
        o0OOO0o o0ooo0o3 = this.mState;
        o0ooo0o3.f9061OooO0o = false;
        o0ooo0o3.f9065OooOO0 = o0ooo0o3.f9065OooOO0 && this.mItemAnimator != null;
        o0ooo0o3.f9060OooO0Oo = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.OooO00o(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f9060OooO0Oo = 1;
        if (o0ooo0o2.f9065OooOO0) {
            for (int iOooO0o0 = this.mChildHelper.OooO0o0() - 1; iOooO0o0 >= 0; iOooO0o0--) {
                oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(iOooO0o0));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    Objects.requireNonNull(this.mItemAnimator);
                    ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    oo0o0Oo oo0o0ooOooO = this.mViewInfoStore.f9154OooO0O0.OooO(changedHolderKey, null);
                    if (oo0o0ooOooO == null || oo0o0ooOooO.shouldIgnore()) {
                        this.mViewInfoStore.OooO0O0(childViewHolderInt, oooO0OO);
                    } else {
                        o00000OO.OooO00o orDefault = this.mViewInfoStore.f9153OooO00o.getOrDefault(oo0o0ooOooO, null);
                        boolean z = (orDefault == null || (orDefault.f9156OooO00o & 1) == 0) ? false : true;
                        o00000OO.OooO00o orDefault2 = this.mViewInfoStore.f9153OooO00o.getOrDefault(childViewHolderInt, null);
                        boolean z2 = (orDefault2 == null || (orDefault2.f9156OooO00o & 1) == 0) ? false : true;
                        if (z && oo0o0ooOooO == childViewHolderInt) {
                            this.mViewInfoStore.OooO0O0(childViewHolderInt, oooO0OO);
                        } else {
                            ItemAnimator.OooO0OO OooO0Oo2 = this.mViewInfoStore.OooO0Oo(oo0o0ooOooO, 4);
                            this.mViewInfoStore.OooO0O0(childViewHolderInt, oooO0OO);
                            ItemAnimator.OooO0OO OooO0Oo3 = this.mViewInfoStore.OooO0Oo(childViewHolderInt, 8);
                            if (OooO0Oo2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, oo0o0ooOooO);
                            } else {
                                animateChange(oo0o0ooOooO, childViewHolderInt, OooO0Oo2, OooO0Oo3, z, z2);
                            }
                        }
                    }
                }
            }
            o00000OO o00000oo2 = this.mViewInfoStore;
            o00000OO.OooO0O0 oooO0O0 = this.mViewInfoProcessCallback;
            int i = o00000oo2.f9153OooO00o.f421Oooo0oo;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                oo0o0Oo oo0o0ooOooO2 = o00000oo2.f9153OooO00o.OooO(i);
                o00000OO.OooO00o oooO00oOooOO0O = o00000oo2.f9153OooO00o.OooOO0O(i);
                int i2 = oooO00oOooOO0O.f9156OooO00o;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(oo0o0ooOooO2.itemView, recyclerView.mRecycler);
                } else if ((i2 & 1) != 0) {
                    ItemAnimator.OooO0OO oooO0OO2 = oooO00oOooOO0O.f9157OooO0O0;
                    if (oooO0OO2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(oo0o0ooOooO2.itemView, recyclerView2.mRecycler);
                    } else {
                        ItemAnimator.OooO0OO oooO0OO3 = oooO00oOooOO0O.f9158OooO0OO;
                        OooO0o oooO0o = (OooO0o) oooO0O0;
                        RecyclerView.this.mRecycler.OooOOO0(oo0o0ooOooO2);
                        RecyclerView.this.animateDisappearance(oo0o0ooOooO2, oooO0OO2, oooO0OO3);
                    }
                } else if ((i2 & 14) == 14) {
                    RecyclerView.this.animateAppearance(oo0o0ooOooO2, oooO00oOooOO0O.f9157OooO0O0, oooO00oOooOO0O.f9158OooO0OO);
                } else if ((i2 & 12) == 12) {
                    ItemAnimator.OooO0OO oooO0OO4 = oooO00oOooOO0O.f9157OooO0O0;
                    ItemAnimator.OooO0OO oooO0OO5 = oooO00oOooOO0O.f9158OooO0OO;
                    OooO0o oooO0o2 = (OooO0o) oooO0O0;
                    Objects.requireNonNull(oooO0o2);
                    oo0o0ooOooO2.setIsRecyclable(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    if (recyclerView3.mDataSetHasChangedAfterLayout) {
                        if (recyclerView3.mItemAnimator.OooO0O0(oo0o0ooOooO2, oo0o0ooOooO2, oooO0OO4, oooO0OO5)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else if (recyclerView3.mItemAnimator.OooO0Oo(oo0o0ooOooO2, oooO0OO4, oooO0OO5)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if ((i2 & 4) != 0) {
                    ItemAnimator.OooO0OO oooO0OO6 = oooO00oOooOO0O.f9157OooO0O0;
                    OooO0o oooO0o3 = (OooO0o) oooO0O0;
                    RecyclerView.this.mRecycler.OooOOO0(oo0o0ooOooO2);
                    RecyclerView.this.animateDisappearance(oo0o0ooOooO2, oooO0OO6, null);
                } else if ((i2 & 8) != 0) {
                    RecyclerView.this.animateAppearance(oo0o0ooOooO2, oooO00oOooOO0O.f9157OooO0O0, oooO00oOooOO0O.f9158OooO0OO);
                }
                o00000OO.OooO00o.OooO0O0(oooO00oOooOO0O);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        o0OOO0o o0ooo0o3 = this.mState;
        o0ooo0o3.f9058OooO0O0 = o0ooo0o3.f9062OooO0o0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        o0ooo0o3.f9065OooOO0 = false;
        o0ooo0o3.f9066OooOO0O = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<oo0o0Oo> arrayList = this.mRecycler.f9041OooO0O0;
        if (arrayList != null) {
            arrayList.clear();
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000.mPrefetchMaxObservedInInitialPrefetch) {
            oooo000.mPrefetchMaxCountObserved = 0;
            oooo000.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.OooOOO();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        o00000OO o00000oo3 = this.mViewInfoStore;
        o00000oo3.f9153OooO00o.clear();
        o00000oo3.f9154OooO0O0.OooO0Oo();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        o0OoOo0 o0oooo1 = this.mInterceptingOnItemTouchListener;
        if (o0oooo1 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        o0oooo1.OooO00o(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            o0OoOo0 o0oooo1 = this.mOnItemTouchListeners.get(i);
            if (o0oooo1.OooO0O0(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = o0oooo1;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        if (iOooO0o0 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iOooO0o0; i3++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        oo0o0Oo oo0o0ooFindViewHolderForAdapterPosition;
        o0OOO0o o0ooo0o2 = this.mState;
        int i = o0ooo0o2.f9067OooOO0o;
        if (i == -1) {
            i = 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        for (int i2 = i; i2 < iOooO0O0; i2++) {
            oo0o0Oo oo0o0ooFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (oo0o0ooFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (oo0o0ooFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return oo0o0ooFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iOooO0O0, i);
        do {
            iMin--;
            if (iMin < 0 || (oo0o0ooFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!oo0o0ooFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return oo0o0ooFindViewHolderForAdapterPosition.itemView;
    }

    public static oo0o0Oo getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f9017Oooo0o;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f9018Oooo0oO;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private o000O0O0.o000oOoO getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new o000O0O0.o000oOoO(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, oo0o0Oo oo0o0oo, oo0o0Oo oo0o0oo2) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != oo0o0oo && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(oo0o0oo);
                    throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(oo0o0oo);
                throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + oo0o0oo2 + " cannot be found but it is necessary for " + oo0o0oo + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int i = Build.VERSION.SDK_INT;
        if ((i >= 26 ? ViewCompat.OooOo.OooO0O0(this) : 0) != 0 || i < 26) {
            return;
        }
        ViewCompat.OooOo.OooOO0o(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.OooO0o(new OooO());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(this, sb));
    }

    private void nestedScrollByInternal(int i, int i2, @Nullable MotionEvent motionEvent, int i3) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = oooo000.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        startNestedScroll(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? i : 0, zCanScrollVertically ? i2 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            i -= iArr2[0];
            i2 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? i : 0, zCanScrollVertically ? i2 : 0, motionEvent, i3);
        androidx.recyclerview.widget.o000oOoO o000oooo2 = this.mGapWorker;
        if (o000oooo2 != null && (i != 0 || i2 != 0)) {
            o000oooo2.OooO00o(this, i, i2);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            oooO00o.OooOO0o(oooO00o.f8874OooO0O0);
            oooO00o.OooOO0o(oooO00o.f8875OooO0OO);
            oooO00o.f8877OooO0o = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.OooOO0();
        } else {
            this.mAdapterHelper.OooO0OO();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f9065OooOO0 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        o0OOO0o o0ooo0o2 = this.mState;
        if (o0ooo0o2.f9065OooOO0 && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        o0ooo0o2.f9066OooOO0O = z2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                ensureRightGlow();
                androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                ensureTopGlow();
                androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                ensureBottomGlow();
                androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return;
            }
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        ensureLeftGlow();
        androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            ensureTopGlow();
            androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            ensureBottomGlow();
            androidx.core.widget.OooOO0.OooO00o.OooO00o(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.OooOO0O(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.OooO0o0() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        oo0o0Oo oo0o0ooFindViewHolderForItemId = (this.mState.f9069OooOOO0 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f9069OooOOO0);
        if (oo0o0ooFindViewHolderForItemId != null && !this.mChildHelper.OooOO0O(oo0o0ooFindViewHolderForItemId.itemView) && oo0o0ooFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = oo0o0ooFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.OooO0o0() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f9068OooOOO;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f9019Oooo0oo) {
                Rect rect = layoutParams2.f9018Oooo0oO;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f9069OooOOO0 = -1L;
        o0ooo0o2.f9067OooOO0o = -1;
        o0ooo0o2.f9068OooOOO = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        oo0o0Oo oo0o0ooFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (oo0o0ooFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f9069OooOOO0 = this.mAdapter.hasStableIds() ? oo0o0ooFindContainingViewHolder.getItemId() : -1L;
        o0OOO0o o0ooo0o2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = oo0o0ooFindContainingViewHolder.isRemoved() ? oo0o0ooFindContainingViewHolder.mOldPosition : oo0o0ooFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        o0ooo0o2.f9067OooOO0o = absoluteAdapterPosition;
        this.mState.f9068OooOOO = getDeepestFocusedViewWithId(oo0o0ooFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        oooO00o.OooOO0o(oooO00o.f8874OooO0O0);
        oooO00o.OooOO0o(oooO00o.f8875OooO0OO);
        oooO00o.f8877OooO0o = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.onAdapterChanged(adapter3, this.mAdapter);
        }
        o00Ooo o00ooo2 = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        o00ooo2.OooO0O0();
        o00Oo0 o00oo0OooO0Oo = o00ooo2.OooO0Oo();
        Objects.requireNonNull(o00oo0OooO0Oo);
        if (adapter3 != null) {
            o00oo0OooO0Oo.f9035OooO0O0--;
        }
        if (!z && o00oo0OooO0Oo.f9035OooO0O0 == 0) {
            for (int i = 0; i < o00oo0OooO0Oo.f9034OooO00o.size(); i++) {
                o00oo0OooO0Oo.f9034OooO00o.valueAt(i).f9036OooO00o.clear();
            }
        }
        if (adapter4 != null) {
            o00oo0OooO0Oo.f9035OooO0O0++;
        }
        this.mState.f9061OooO0o = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.OooO0OO();
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOO0O(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null || !oooo000.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull OooOo oooOo, int i) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(oooOo);
        } else {
            this.mItemDecorations.add(i, oooOo);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull Oooo0 oooo0) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(oooo0);
    }

    public void addOnItemTouchListener(@NonNull o0OoOo0 o0oooo1) {
        this.mOnItemTouchListeners.add(o0oooo1);
    }

    public void addOnScrollListener(@NonNull o00O0O o00o0o2) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(o00o0o2);
    }

    public void addRecyclerListener(@NonNull oo000o oo000oVar) {
        o000OO0O.OooOOO0.OooO00o(oo000oVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(oo000oVar);
    }

    public void animateAppearance(@NonNull oo0o0Oo oo0o0oo, @Nullable ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2) {
        oo0o0oo.setIsRecyclable(false);
        if (this.mItemAnimator.OooO00o(oo0o0oo, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull oo0o0Oo oo0o0oo, @NonNull ItemAnimator.OooO0OO oooO0OO, @Nullable ItemAnimator.OooO0OO oooO0OO2) {
        addAnimatingView(oo0o0oo);
        oo0o0oo.setIsRecyclable(false);
        if (this.mItemAnimator.OooO0OO(oo0o0oo, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0(str)));
        }
        throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(oo0o0Oo oo0o0oo) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.OooO0oO(oo0o0oo, oo0o0oo.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00ooo2.f9042OooO0OO.get(i2).clearOldPosition();
        }
        int size2 = o00ooo2.f9040OooO00o.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o00ooo2.f9040OooO00o.get(i3).clearOldPosition();
        }
        ArrayList<oo0o0Oo> arrayList = o00ooo2.f9041OooO0O0;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o00ooo2.f9041OooO0O0.get(i4).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<Oooo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<o00O0O> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null && oooo000.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = o000O00O.OooOo.f28095OooO00o;
            o000O00O.OooOo.OooO00o.OooO00o(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            o000O00O.OooOo.OooO00o.OooO0O0();
            return;
        }
        if (this.mAdapterHelper.OooO0oO()) {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            int i2 = oooO00o.f8877OooO0o;
            if ((4 & i2) != 0) {
                if (!((11 & i2) != 0)) {
                    int i3 = o000O00O.OooOo.f28095OooO00o;
                    o000O00O.OooOo.OooO00o.OooO00o(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.OooOO0();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.OooO0O0();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    o000O00O.OooOo.OooO00o.OooO0O0();
                    return;
                }
            }
            if (oooO00o.OooO0oO()) {
                int i4 = o000O00O.OooOo.f28095OooO00o;
                o000O00O.OooOo.OooO00o.OooO00o(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                o000O00O.OooOo.OooO00o.OooO0O0();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        setMeasuredDimension(Oooo000.chooseSize(i, paddingRight, ViewCompat.OooO0o.OooO0o0(this)), Oooo000.chooseSize(i2, getPaddingBottom() + getPaddingTop(), ViewCompat.OooO0o.OooO0Oo(this)));
    }

    public void dispatchChildAttached(View view) {
        oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<Oooo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<Oooo0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        boolean z = false;
        this.mState.f9056OooO = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f9060OooO0Oo == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            if (!oooO00o.f8875OooO0OO.isEmpty() && !oooO00o.f8874OooO0O0.isEmpty()) {
                z = true;
            }
            if (z || z2 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().OooO0O0(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO0o(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        o00O0O o00o0o2 = this.mScrollListener;
        if (o00o0o2 != null) {
            o00o0o2.onScrollStateChanged(this, i);
        }
        List<o00O0O> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        o00O0O o00o0o2 = this.mScrollListener;
        if (o00o0o2 != null) {
            o00o0o2.onScrolled(this, i, i2);
        }
        List<o00O0O> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            oo0o0Oo oo0o0oo = this.mPendingAccessibilityImportanceChange.get(size);
            if (oo0o0oo.itemView.getParent() == this && !oo0o0oo.shouldIgnore() && (i = oo0o0oo.mPendingAccessibilityState) != -1) {
                View view = oo0o0oo.itemView;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(view, i);
                oo0o0oo.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.OooOO0o()) ? z : true) {
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectOooO00o = this.mEdgeEffectFactory.OooO00o(this);
        this.mBottomGlow = edgeEffectOooO00o;
        if (this.mClipToPadding) {
            edgeEffectOooO00o.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectOooO00o.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectOooO00o = this.mEdgeEffectFactory.OooO00o(this);
        this.mLeftGlow = edgeEffectOooO00o;
        if (this.mClipToPadding) {
            edgeEffectOooO00o.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectOooO00o.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectOooO00o = this.mEdgeEffectFactory.OooO00o(this);
        this.mRightGlow = edgeEffectOooO00o;
        if (this.mClipToPadding) {
            edgeEffectOooO00o.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectOooO00o.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectOooO00o = this.mEdgeEffectFactory.OooO00o(this);
        this.mTopGlow = edgeEffectOooO00o;
        if (this.mClipToPadding) {
            edgeEffectOooO00o.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectOooO00o.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sbOooO0o0.append(super.toString());
        sbOooO0o0.append(", adapter:");
        sbOooO0o0.append(this.mAdapter);
        sbOooO0o0.append(", layout:");
        sbOooO0o0.append(this.mLayout);
        sbOooO0o0.append(", context:");
        sbOooO0o0.append(getContext());
        return sbOooO0o0.toString();
    }

    public final void fillRemainingScrollValues(o0OOO0o o0ooo0o2) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(o0ooo0o2);
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f9052Oooo0oo;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(o0ooo0o2);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int iOooO0o0 = this.mChildHelper.OooO0o0() - 1; iOooO0o0 >= 0; iOooO0o0--) {
            View viewOooO0Oo = this.mChildHelper.OooO0Oo(iOooO0o0);
            float translationX = viewOooO0Oo.getTranslationX();
            float translationY = viewOooO0Oo.getTranslationY();
            if (f >= viewOooO0Oo.getLeft() + translationX && f <= viewOooO0Oo.getRight() + translationX && f2 >= viewOooO0Oo.getTop() + translationY && f2 <= viewOooO0Oo.getBottom() + translationY) {
                return viewOooO0Oo;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public oo0o0Oo findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public oo0o0Oo findViewHolderForAdapterPosition(int i) {
        oo0o0Oo oo0o0oo = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                oo0o0oo = childViewHolderInt;
            }
        }
        return oo0o0oo;
    }

    public oo0o0Oo findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        oo0o0Oo oo0o0oo = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iOooO0oo = this.mChildHelper.OooO0oo();
            for (int i = 0; i < iOooO0oo; i++) {
                oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    oo0o0oo = childViewHolderInt;
                }
            }
        }
        return oo0o0oo;
    }

    @Nullable
    public oo0o0Oo findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Nullable
    @Deprecated
    public oo0o0Oo findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public boolean fling(int i, int i2) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = oooo000.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i3 = (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) ? 0 : i;
        int i4 = (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            o000oOoO o000oooo2 = this.mOnFlingListener;
            if (o000oooo2 != null && o000oooo2.onFling(i3, i4)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i5 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i6, Math.min(i4, i6));
                o0OO00O o0oo00o2 = this.mViewFlinger;
                RecyclerView.this.setScrollState(2);
                o0oo00o2.f9051Oooo0oO = 0;
                o0oo00o2.f9050Oooo0o = 0;
                Interpolator interpolator = o0oo00o2.f9049Oooo;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    o0oo00o2.f9049Oooo = interpolator2;
                    o0oo00o2.f9052Oooo0oo = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                }
                o0oo00o2.f9052Oooo0oo.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                o0oo00o2.OooO00o();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            return oooo000.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            return oooo000.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(oo0o0Oo oo0o0oo) {
        if (oo0o0oo.hasAnyOfTheFlags(524) || !oo0o0oo.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        int i = oo0o0oo.mPosition;
        int size = oooO00o.f8874OooO0O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.OooO00o.OooO0O0 oooO0O0 = oooO00o.f8874OooO0O0.get(i2);
            int i3 = oooO0O0.f8879OooO00o;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = oooO0O0.f8880OooO0O0;
                    if (i4 <= i) {
                        int i5 = oooO0O0.f8882OooO0Oo;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = oooO0O0.f8880OooO0O0;
                    if (i6 == i) {
                        i = oooO0O0.f8882OooO0Oo;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (oooO0O0.f8882OooO0Oo <= i) {
                            i++;
                        }
                    }
                }
            } else if (oooO0O0.f8880OooO0O0 <= i) {
                i += oooO0O0.f8882OooO0Oo;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        Oooo000 oooo000 = this.mLayout;
        return oooo000 != null ? oooo000.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(oo0o0Oo oo0o0oo) {
        return this.mAdapter.hasStableIds() ? oo0o0oo.getItemId() : oo0o0oo.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        OooOOOO oooOOOO = this.mChildDrawingOrderCallback;
        return oooOOOO == null ? super.getChildDrawingOrder(i, i2) : oooOOOO.OooO00o(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        oo0o0Oo childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public oo0o0Oo getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public o000000 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f9019Oooo0oo) {
            return layoutParams.f9018Oooo0oO;
        }
        if (this.mState.f9063OooO0oO && (layoutParams.OooO0O0() || layoutParams.f9017Oooo0o.isInvalid())) {
            return layoutParams.f9018Oooo0oO;
        }
        Rect rect = layoutParams.f9018Oooo0oO;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f9019Oooo0oo = false;
        return rect;
    }

    @NonNull
    public OooOo getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public Oooo000 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public o000oOoO getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public o00Oo0 getRecycledViewPool() {
        return this.mRecycler.OooO0Oo();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().OooO(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.OooO0oO();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.OooO00o(new OooOO0());
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.Oooo0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p090o000o00O.o000oOoO.fastscroll_default_thickness), resources.getDimensionPixelSize(p090o000o00O.o000oOoO.fastscroll_minimum_range), resources.getDimensionPixelOffset(p090o000o00O.o000oOoO.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.OooOO0o();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f28126OooO0Oo;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            ((LayoutParams) this.mChildHelper.OooO0oO(i).getLayoutParams()).f9019Oooo0oo = true;
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) o00ooo2.f9042OooO0OO.get(i2).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f9019Oooo0oo = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        for (int i2 = 0; i2 < size; i2++) {
            oo0o0Oo oo0o0oo = o00ooo2.f9042OooO0OO.get(i2);
            if (oo0o0oo != null) {
                oo0o0oo.addFlags(6);
                oo0o0oo.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            o00ooo2.OooO0oO();
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(@Px int i) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            this.mChildHelper.OooO0Oo(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@Px int i) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i2 = 0; i2 < iOooO0o0; i2++) {
            this.mChildHelper.OooO0Oo(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i3 = 0; i3 < iOooO0oo; i3++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f9061OooO0o = true;
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        for (int i4 = 0; i4 < size; i4++) {
            oo0o0Oo oo0o0oo = o00ooo2.f9042OooO0OO.get(i4);
            if (oo0o0oo != null && oo0o0oo.mPosition >= i) {
                oo0o0oo.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iOooO0oo; i11++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f9061OooO0o = true;
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = o00ooo2.f9042OooO0OO.size();
        for (int i12 = 0; i12 < size; i12++) {
            oo0o0Oo oo0o0oo = o00ooo2.f9042OooO0OO.get(i12);
            if (oo0o0oo != null && (i8 = oo0o0oo.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    oo0o0oo.offsetPosition(i2 - i, false);
                } else {
                    oo0o0oo.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i4 = 0; i4 < iOooO0oo; i4++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f9061OooO0o = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f9061OooO0o = true;
                }
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            oo0o0Oo oo0o0oo = o00ooo2.f9042OooO0OO.get(size);
            if (oo0o0oo != null) {
                int i6 = oo0o0oo.mPosition;
                if (i6 >= i3) {
                    oo0o0oo.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    oo0o0oo.addFlags(8);
                    o00ooo2.OooO0oo(size);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.o000oOoO> threadLocal = androidx.recyclerview.widget.o000oOoO.f9167OoooO00;
            androidx.recyclerview.widget.o000oOoO o000oooo2 = threadLocal.get();
            this.mGapWorker = o000oooo2;
            if (o000oooo2 == null) {
                this.mGapWorker = new androidx.recyclerview.widget.o000oOoO();
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                Display displayOooO0O0 = ViewCompat.OooO.OooO0O0(this);
                float f = 60.0f;
                if (!isInEditMode() && displayOooO0O0 != null) {
                    float refreshRate = displayOooO0O0.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                androidx.recyclerview.widget.o000oOoO o000oooo3 = this.mGapWorker;
                o000oooo3.f9171Oooo0oo = (long) (1.0E9f / f);
                threadLocal.set(o000oooo3);
            }
            this.mGapWorker.f9169Oooo0o.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.o000oOoO o000oooo2;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.OooOO0O();
        }
        stopScroll();
        this.mIsAttached = false;
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        Objects.requireNonNull(this.mViewInfoStore);
        while (o00000OO.OooO00o.f9155OooO0Oo.OooO0O0() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (o000oooo2 = this.mGapWorker) == null) {
            return;
        }
        o000oooo2.f9169Oooo0o.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
            } else {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || axisValue != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oooo000.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error processing scroll; pointer index for id ");
                sbOooO0o0.append(this.mScrollPointerId);
                sbOooO0o0.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbOooO0o0.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = o000O00O.OooOo.f28095OooO00o;
        o000O00O.OooOo.OooO00o.OooO00o(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        o000O00O.OooOo.OooO00o.OooO0O0();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oooo000.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f9060OooO0Oo == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f9056OooO = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f9056OooO = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            o0OOO0o o0ooo0o2 = this.mState;
            if (o0ooo0o2.f9066OooOO0O) {
                o0ooo0o2.f9063OooO0oO = true;
            } else {
                this.mAdapterHelper.OooO0OO();
                this.mState.f9063OooO0oO = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f9066OooOO0O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.f9062OooO0o0 = adapter.getItemCount();
        } else {
            this.mState.f9062OooO0o0 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f9063OooO0oO = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f9033Oooo0oo = savedState2.f9033Oooo0oo;
        } else {
            Oooo000 oooo000 = this.mLayout;
            if (oooo000 != null) {
                savedState.f9033Oooo0oo = oooo000.onSaveInstanceState();
            } else {
                savedState.f9033Oooo0oo = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@Px int i, @Px int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00db A[PHI: r0
      0x00db: PHI (r0v38 int) = (r0v26 int), (r0v42 int) binds: [B:41:0x00c4, B:45:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = oooo000.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (zCanScrollVertically) {
                i = zCanScrollHorizontally;
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            i = zCanScrollHorizontally;
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.addMovement(motionEventObtain);
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if ((f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error processing scroll; pointer index for id ");
                sbOooO0o0.append(this.mScrollPointerId);
                sbOooO0o0.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sbOooO0o0.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.mLastTouchX - x2;
            int iMax2 = this.mLastTouchY - y2;
            if (this.mScrollState != 1) {
                if (zCanScrollHorizontally) {
                    iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                    if (iMax != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (zCanScrollVertically) {
                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                    if (iMax2 != 0) {
                        z = true;
                    }
                }
                if (z) {
                    setScrollState(1);
                }
            }
            int i2 = iMax;
            int i3 = iMax2;
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (dispatchNestedPreScroll(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, iArr3, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    i2 -= iArr4[0];
                    i3 -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i4 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i4 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i5 = i3;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr7[0];
                this.mLastTouchY = y2 - iArr7[1];
                if (scrollByInternal(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i5 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.o000oOoO o000oooo2 = this.mGapWorker;
                if (o000oooo2 != null && (i2 != 0 || i5 != 0)) {
                    o000oooo2.OooO00o(this, i2, i5);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOO0(this, runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(oo0o0Oo oo0o0oo, ItemAnimator.OooO0OO oooO0OO) {
        oo0o0oo.setFlags(0, 8192);
        if (this.mState.f9064OooO0oo && oo0o0oo.isUpdated() && !oo0o0oo.isRemoved() && !oo0o0oo.shouldIgnore()) {
            this.mViewInfoStore.f9154OooO0O0.OooOO0o(getChangedHolderKey(oo0o0oo), oo0o0oo);
        }
        this.mViewInfoStore.OooO0OO(oo0o0oo, oooO0OO);
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.OooOO0O();
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.OooO0O0();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        int iOooO0OO = ((OooO) oooO0o.f8889OooO00o).OooO0OO(view);
        boolean z = true;
        if (iOooO0OO == -1) {
            oooO0o.OooOOO0(view);
        } else if (oooO0o.f8890OooO0O0.OooO0Oo(iOooO0OO)) {
            oooO0o.f8890OooO0O0.OooO0o(iOooO0OO);
            oooO0o.OooOOO0(view);
            ((OooO) oooO0o.f8889OooO00o).OooO0Oo(iOooO0OO);
        } else {
            z = false;
        }
        if (z) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.OooOOO0(childViewHolderInt);
            this.mRecycler.OooOO0(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@NonNull OooOo oooOo) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oooOo);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull Oooo0 oooo0) {
        List<Oooo0> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(oooo0);
    }

    public void removeOnItemTouchListener(@NonNull o0OoOo0 o0oooo1) {
        this.mOnItemTouchListeners.remove(o0oooo1);
        if (this.mInterceptingOnItemTouchListener == o0oooo1) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull o00O0O o00o0o2) {
        List<o00O0O> list = this.mScrollListeners;
        if (list != null) {
            list.remove(o00o0o2);
        }
    }

    public void removeRecyclerListener(@NonNull oo000o oo000oVar) {
        this.mRecyclerListeners.remove(oo000oVar);
    }

    public void repositionShadowingViews() {
        oo0o0Oo oo0o0oo;
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            View viewOooO0Oo = this.mChildHelper.OooO0Oo(i);
            oo0o0Oo childViewHolder = getChildViewHolder(viewOooO0Oo);
            if (childViewHolder != null && (oo0o0oo = childViewHolder.mShadowingHolder) != null) {
                View view = oo0o0oo.itemView;
                int left = viewOooO0Oo.getLeft();
                int top = viewOooO0Oo.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).OooO0OO(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = oooo000.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i12 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !o000O0O0.Oooo000.OooO00o(motionEvent, o.a.q)) {
                pullGlows(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = o000O00O.OooOo.f28095OooO00o;
        o000O00O.OooOo.OooO00o.OooO00o(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        o000O00O.OooOo.OooO00o.OooO0O0();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oooo000.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable o000000 o000000Var) {
        this.mAccessibilityDelegate = o000000Var;
        ViewCompat.OooOo0o(this, o000000Var);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable OooOOOO oooOOOO) {
        if (oooOOOO == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = oooOOOO;
        setChildrenDrawingOrderEnabled(oooOOOO != null);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(oo0o0Oo oo0o0oo, int i) {
        if (isComputingLayout()) {
            oo0o0oo.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(oo0o0oo);
            return false;
        }
        View view = oo0o0oo.itemView;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(view, i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Objects.requireNonNull(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.OooOO0O();
            this.mItemAnimator.f9008OooO00o = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f9008OooO00o = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        o00Ooo o00ooo2 = this.mRecycler;
        o00ooo2.f9045OooO0o0 = i;
        o00ooo2.OooOOO();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    public void setLayoutManager(@Nullable Oooo000 oooo000) {
        if (oooo000 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.OooOO0O();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.OooO0O0();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.OooO0O0();
        }
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        androidx.recyclerview.widget.OooO0o.OooO00o oooO00o = oooO0o.f8890OooO0O0;
        oooO00o.f8892OooO00o = 0L;
        androidx.recyclerview.widget.OooO0o.OooO00o oooO00o2 = oooO00o.f8893OooO0O0;
        if (oooO00o2 != null) {
            oooO00o2.OooO0oO();
        }
        int size = oooO0o.f8891OooO0OO.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.OooO0o.OooO0O0 oooO0O0 = oooO0o.f8889OooO00o;
            View view = (View) oooO0o.f8891OooO0OO.get(size);
            OooO oooO = (OooO) oooO0O0;
            Objects.requireNonNull(oooO);
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            oooO0o.f8891OooO0OO.remove(size);
        }
        OooO oooO2 = (OooO) oooO0o.f8889OooO00o;
        int iOooO0O0 = oooO2.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            View viewOooO00o = oooO2.OooO00o(i);
            RecyclerView.this.dispatchChildDetached(viewOooO00o);
            viewOooO00o.clearAnimation();
        }
        RecyclerView.this.removeAllViews();
        this.mLayout = oooo000;
        if (oooo000 != null) {
            if (oooo000.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(oooo000);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(Oooo0.OooOO0O.OooO00o(oooo000.mRecyclerView, sb));
            }
            oooo000.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.OooOOO();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().OooOO0(z);
    }

    public void setOnFlingListener(@Nullable o000oOoO o000oooo2) {
        this.mOnFlingListener = o000oooo2;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable o00O0O o00o0o2) {
        this.mScrollListener = o00o0o2;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable o00Oo0 o00oo1) {
        o00Ooo o00ooo2 = this.mRecycler;
        o00Oo0 o00oo2 = o00ooo2.f9046OooO0oO;
        if (o00oo2 != null) {
            o00oo2.f9035OooO0O0--;
        }
        o00ooo2.f9046OooO0oO = o00oo1;
        if (o00oo1 == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        o00ooo2.f9046OooO0oO.f9035OooO0O0++;
    }

    @Deprecated
    public void setRecyclerListener(@Nullable oo000o oo000oVar) {
        this.mRecyclerListener = oo000oVar;
    }

    void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable o0Oo0oo o0oo0oo2) {
        Objects.requireNonNull(this.mRecycler);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iOooO00o = accessibilityEvent != null ? o0000O0.OooO00o(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iOooO00o != 0 ? iOooO00o : 0;
        return true;
    }

    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oooo000.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().OooOO0o(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().OooOOO0(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iOooO0oo; i6++) {
            View viewOooO0oO = this.mChildHelper.OooO0oO(i6);
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(viewOooO0oO);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) viewOooO0oO.getLayoutParams()).f9019Oooo0oo = true;
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int size = o00ooo2.f9042OooO0OO.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            oo0o0Oo oo0o0oo = o00ooo2.f9042OooO0OO.get(size);
            if (oo0o0oo != null && (i3 = oo0o0oo.mPosition) >= i && i3 < i5) {
                oo0o0oo.addFlags(2);
                o00ooo2.OooO0oo(size);
            }
        }
    }

    public static abstract class Adapter<VH extends oo0o0Oo> {
        private final OooOOO0 mObservable = new OooOOO0();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = o000O00O.OooOo.f28095OooO00o;
                o000O00O.OooOo.OooO00o.OooO00o(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f9019Oooo0oo = true;
                }
                int i3 = o000O00O.OooOo.f28095OooO00o;
                o000O00O.OooOo.OooO00o.OooO0O0();
            }
        }

        public boolean canRestoreState() {
            int i = OooOO0O.f9025OooO00o[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                int i2 = o000O00O.OooOo.f28095OooO00o;
                o000O00O.OooOo.OooO00o.OooO00o(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                o000O00O.OooOo.OooO00o.OooO0O0();
                return vh;
            } catch (Throwable th) {
                int i3 = o000O00O.OooOo.f28095OooO00o;
                o000O00O.OooOo.OooO00o.OooO0O0();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends oo0o0Oo> adapter, @NonNull oo0o0Oo oo0o0oo, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.OooO00o();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.OooO0O0();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.OooO0Oo(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.OooO0o0(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.OooO0OO(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.OooO0Oo(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.OooO0o0(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.OooO0o(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.OooO0o(i, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull OooOOO oooOOO) {
            this.mObservable.registerObserver(oooOOO);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.OooO0oO();
        }

        public void unregisterAdapterDataObserver(@NonNull OooOOO oooOOO) {
            this.mObservable.unregisterObserver(oooOOO);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.OooO0Oo(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.OooO0Oo(i, i2, obj);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p090o000o00O.Oooo0.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().OooO0Oo(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().OooO0oO(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public oo0o0Oo findViewHolderForPosition(int i, boolean z) {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        oo0o0Oo oo0o0oo = null;
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            oo0o0Oo childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        if (this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        oo0o0oo = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                } else {
                    if (this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    oo0o0oo = childViewHolderInt;
                }
            }
        }
        return oo0o0oo;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Parcelable f9033Oooo0oo;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9033Oooo0oo = parcel.readParcelable(classLoader == null ? Oooo000.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeParcelable(this.f9033Oooo0oo, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        float fOooO00o;
        float fOooO00o2;
        super(context, attributeSet, i);
        this.mObserver = new o00oO0o();
        this.mRecycler = new o00Ooo();
        this.mViewInfoStore = new o00000OO();
        this.mUpdateChildViewsRunnable = new OooO00o();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new EdgeEffectFactory();
        this.mItemAnimator = new androidx.recyclerview.widget.OooOO0();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new o0OO00O();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.o000oOoO.OooO0O0() : null;
        this.mState = new o0OOO0o();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new OooOo00();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new OooO0O0();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new OooO0o();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        Method method = o000O0O0.o000OOo.f28122OooO00o;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            fOooO00o = o000O0O0.o000OOo.OooO00o.OooO00o(viewConfiguration);
        } else {
            fOooO00o = o000O0O0.o000OOo.OooO00o(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fOooO00o;
        if (i2 >= 26) {
            fOooO00o2 = o000O0O0.o000OOo.OooO00o.OooO0O0(viewConfiguration);
        } else {
            fOooO00o2 = o000O0O0.o000OOo.OooO00o(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fOooO00o2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f9008OooO00o = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new o000000(this));
        int[] iArr = p090o000o00O.o00O0O.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(p090o000o00O.o00O0O.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(p090o000o00O.o00O0O.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(p090o000o00O.o00O0O.RecyclerView_android_clipToPadding, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(p090o000o00O.o00O0O.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p090o000o00O.o00O0O.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(p090o000o00O.o00O0O.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p090o000o00O.o00O0O.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(p090o000o00O.o00O0O.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.OooOo0O(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().OooO(i);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().OooOO0o(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().OooOOO0(i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f9016Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oo0o0Oo f9017Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Rect f9018Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f9019Oooo0oo;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9018Oooo0oO = new Rect();
            this.f9019Oooo0oo = true;
            this.f9016Oooo = false;
        }

        public final int OooO00o() {
            return this.f9017Oooo0o.getLayoutPosition();
        }

        public final boolean OooO0O0() {
            return this.f9017Oooo0o.isUpdated();
        }

        public final boolean OooO0OO() {
            return this.f9017Oooo0o.isRemoved();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f9018Oooo0oO = new Rect();
            this.f9019Oooo0oo = true;
            this.f9016Oooo = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9018Oooo0oO = new Rect();
            this.f9019Oooo0oo = true;
            this.f9016Oooo = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9018Oooo0oO = new Rect();
            this.f9019Oooo0oo = true;
            this.f9016Oooo = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f9018Oooo0oO = new Rect();
            this.f9019Oooo0oo = true;
            this.f9016Oooo = false;
        }
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().OooO0oO(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oooo000.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.OooO0O0(i, i2, i3, interpolator);
            return;
        }
        scrollBy(i, i2);
    }

    public void addItemDecoration(@NonNull OooOo oooOo) {
        addItemDecoration(oooOo, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            return oooo000.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(Oooo0.OooOO0O.OooO00o(this, OooO00o.OooO00o.OooO0o0("RecyclerView has no LayoutManager")));
    }
}
