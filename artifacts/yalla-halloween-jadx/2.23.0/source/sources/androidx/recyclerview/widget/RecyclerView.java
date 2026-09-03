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
import androidx.appcompat.widget.o0000O0;
import androidx.core.view.ViewCompat;
import androidx.core.view.o0000OO0;
import androidx.core.view.o000O0Oo;
import androidx.customview.view.AbsSavedState;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoavkit2.ZegoConstants;
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
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jctools.util.Pow2;
import p037OoooOo0.o000Oo0;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.o0000Ooo, androidx.core.view.o0Oo0oo {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final o0Oo0oo sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    o000000 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    androidx.recyclerview.widget.OooO00o mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private OooOOOO mChildDrawingOrderCallback;
    androidx.recyclerview.widget.OooO0o mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.o000oOoO mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private o0OoOo0 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.OooO0O0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<OooOo> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    Oooo000 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
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
    final List<o0O0O00> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.o000oOoO.OooO0O0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final o00Ooo mRecycler;
    oo000o mRecyclerListener;
    final List<oo000o> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private o00O0O mScrollListener;
    private List<o00O0O> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.o0OO00O mScrollingChildHelper;
    final o0OOO0o mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final oo0o0Oo mViewFlinger;
    private final o00000OO.OooO0O0 mViewInfoProcessCallback;
    final o00000OO mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }
    }

    public static abstract class ItemAnimator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0O0 f7625OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO00o> f7626OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f7627OooO0OO = 120;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f7628OooO0Oo = 120;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f7630OooO0o0 = 250;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f7629OooO0o = 250;

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
            public int f7631OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f7632OooO0O0;

            @NonNull
            public final void OooO00o(@NonNull o0O0O00 o0o0o00) {
                View view = o0o0o00.itemView;
                this.f7631OooO00o = view.getLeft();
                this.f7632OooO0O0 = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void OooO0o0(o0O0O00 o0o0o00) {
            int i = o0o0o00.mFlags & 14;
            if (!o0o0o00.isInvalid() && (i & 4) == 0) {
                o0o0o00.getOldPosition();
                o0o0o00.getAbsoluteAdapterPosition();
            }
        }

        public final void OooO() {
            ArrayList<OooO00o> arrayList = this.f7626OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).OooO00o();
            }
            arrayList.clear();
        }

        public abstract boolean OooO00o(@NonNull o0O0O00 o0o0o00, @Nullable OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0O0(@NonNull o0O0O00 o0o0o00, @NonNull o0O0O00 o0o0o01, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0OO(@NonNull o0O0O00 o0o0o00, @NonNull OooO0OO oooO0OO, @Nullable OooO0OO oooO0OO2);

        public abstract boolean OooO0Oo(@NonNull o0O0O00 o0o0o00, @NonNull OooO0OO oooO0OO, @NonNull OooO0OO oooO0OO2);

        public abstract boolean OooO0o(@NonNull o0O0O00 o0o0o00);

        public boolean OooO0oO(@NonNull o0O0O00 o0o0o00, @NonNull List<Object> list) {
            return OooO0o(o0o0o00);
        }

        public final void OooO0oo(@NonNull o0O0O00 o0o0o00) {
            OooO0O0 oooO0O0 = this.f7625OooO00o;
            if (oooO0O0 != null) {
                OooOo00 oooOo00 = (OooOo00) oooO0O0;
                oooOo00.getClass();
                o0o0o00.setIsRecyclable(true);
                if (o0o0o00.mShadowedHolder != null && o0o0o00.mShadowingHolder == null) {
                    o0o0o00.mShadowedHolder = null;
                }
                o0o0o00.mShadowingHolder = null;
                if (o0o0o00.shouldBeKeptAsChild()) {
                    return;
                }
                View view = o0o0o00.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.removeAnimatingView(view) || !o0o0o00.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(o0o0o00.itemView, false);
            }
        }

        public abstract void OooOO0(@NonNull o0O0O00 o0o0o00);

        public abstract void OooOO0O();

        public abstract boolean OooOO0o();

        public abstract void OooOOO0();
    }

    public class OooO implements androidx.recyclerview.widget.OooO0o.OooO0O0 {
        public OooO() {
        }

        public final int OooO00o() {
            return RecyclerView.this.getChildCount();
        }

        public final void OooO0O0(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
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
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            ItemAnimator itemAnimator = recyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.OooOOO0();
            }
            recyclerView.mPostedAnimatorRunner = false;
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

    public class OooOO0 implements androidx.recyclerview.widget.OooO00o.InterfaceC0160OooO00o {
        public OooOO0() {
        }

        public final void OooO00o(androidx.recyclerview.widget.OooO00o.OooO0O0 oooO0O0) {
            int i = oooO0O0.f7497OooO00o;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, oooO0O0.f7498OooO0O0, oooO0O0.f7500OooO0Oo);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, oooO0O0.f7498OooO0O0, oooO0O0.f7500OooO0Oo);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, oooO0O0.f7498OooO0O0, oooO0O0.f7500OooO0Oo, oooO0O0.f7499OooO0OO);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, oooO0O0.f7498OooO0O0, oooO0O0.f7500OooO0Oo, 1);
            }
        }
    }

    public static /* synthetic */ class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f7642OooO00o;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f7642OooO00o = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7642OooO00o[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class OooOOO {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
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
    }

    public static abstract class OooOo {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).OooO00o(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2) {
            onDrawOver(canvas, recyclerView);
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
        boolean mAutoMeasure;
        androidx.recyclerview.widget.OooO0o mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.OooO0O0 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        o0ooOOo mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
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
                Oooo000 oooo000 = Oooo000.this;
                return oooo000.getWidth() - oooo000.getPaddingRight();
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
                Oooo000 oooo000 = Oooo000.this;
                return oooo000.getHeight() - oooo000.getPaddingBottom();
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
            public int f7646OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f7647OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public boolean f7648OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f7649OooO0Oo;
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
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo000 = this.mRecyclerView.mViewInfoStore.f7771OooO00o;
                o00000OO.OooO00o orDefault = oooo000.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = o00000OO.OooO00o.OooO00o();
                    oooo000.put(childViewHolderInt, orDefault);
                }
                orDefault.f7774OooO00o |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
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
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this.mRecyclerView, sb));
                }
                if (iOooOO0 != i) {
                    this.mRecyclerView.mLayout.moveView(iOooOO0, i);
                }
            } else {
                this.mChildHelper.OooO00o(view, i, false);
                layoutParams.f7634OooO0o = true;
                o0ooOOo o0ooooo = this.mSmoothScroller;
                if (o0ooooo != null && o0ooooo.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f7636OooO0oO) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f7636OooO0oO = false;
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
        /* JADX WARN: Code duplicated, block: B:8:0x0011 A[PHI: r3
          0x0011: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x000f, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
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
            } else if (i3 == -1) {
                i3 = iMax;
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
                i3 = iMax;
            } else {
                i3 = 0;
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO0O.OooO0o.RecyclerView, i, i2);
            oooO0o.f7646OooO00o = typedArrayObtainStyledAttributes.getInt(o000OO0O.OooO0o.RecyclerView_android_orientation, 1);
            oooO0o.f7647OooO0O0 = typedArrayObtainStyledAttributes.getInt(o000OO0O.OooO0o.RecyclerView_spanCount, 1);
            oooO0o.f7648OooO0OO = typedArrayObtainStyledAttributes.getBoolean(o000OO0O.OooO0o.RecyclerView_reverseLayout, false);
            oooO0o.f7649OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(o000OO0O.OooO0o.RecyclerView_stackFromEnd, false);
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
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                o00ooo2.OooOO0O(childViewHolderInt);
            } else {
                detachViewAt(i);
                o00ooo2.OooOO0o(view);
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo000 = this.mRecyclerView.mViewInfoStore.f7771OooO00o;
                o00000OO.OooO00o orDefault = oooo000.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = o00000OO.OooO00o.OooO00o();
                    oooo000.put(childViewHolderInt, orDefault);
                }
                orDefault.f7774OooO00o |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.OooO0OO(childViewHolderInt);
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

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, o0OOO0o o0ooo0o2, OooO0OO oooO0OO) {
        }

        @SuppressLint({"UnknownNullness"})
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

        @SuppressLint({"UnknownNullness"})
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
                o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f7674OooO0oO || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
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
            return ((LayoutParams) view.getLayoutParams()).f7635OooO0o0.bottom;
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
            Rect rect = ((LayoutParams) view.getLayoutParams()).f7635OooO0o0;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f7635OooO0o0;
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            return ViewCompat.OooO.OooO0Oo(recyclerView);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f7635OooO0o0.left;
        }

        @Px
        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            return ViewCompat.OooO0o.OooO0Oo(recyclerView);
        }

        @Px
        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            return ((LayoutParams) view.getLayoutParams()).f7635OooO0o0.right;
        }

        public int getRowCountForAccessibility(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f7635OooO0o0.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f7635OooO0o0;
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
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.OooO0Oo(childViewHolderInt);
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
            o0ooOOo o0ooooo = this.mSmoothScroller;
            return o0ooooo != null && o0ooooo.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.OooO0O0(view) && this.mVerticalBoundCheck.OooO0O0(view);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f7635OooO0o0;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f7635OooO0o0;
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

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(o0000O.o0Oo0oo o0oo0oo2) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, o0oo0oo2);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
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

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(o0OOO0o o0ooo0o2) {
        }

        public void onMeasure(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(o0ooOOo o0ooooo) {
            if (this.mSmoothScroller == o0ooooo) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            ArrayList<o0O0O00> arrayList;
            int size = o00ooo2.f7658OooO00o.size();
            int i = size - 1;
            while (true) {
                arrayList = o00ooo2.f7658OooO00o;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
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
                    o0O0O00 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    o00ooo2.OooOO0O(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<o0O0O00> arrayList2 = o00ooo2.f7659OooO0O0;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull o00Ooo o00ooo2) {
            removeView(view);
            o00ooo2.OooOO0(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull o00Ooo o00ooo2) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            o00ooo2.OooOO0(childAt);
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

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
            OooO oooO = (OooO) oooO0o.f7507OooO00o;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (oooO0o.f7508OooO0O0.OooO0o(iIndexOfChild)) {
                oooO0o.OooOOO0(view);
            }
            oooO.OooO0O0(iIndexOfChild);
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

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, o00Ooo o00ooo2, o0OOO0o o0ooo0o2) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), Pow2.MAX_POW2));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.OooOOOO();
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
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
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
            this.mWidthMode = Pow2.MAX_POW2;
            this.mHeightMode = Pow2.MAX_POW2;
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

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, o0OOO0o o0ooo0o2, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(o0ooOOo o0ooooo) {
            o0ooOOo o0ooooo2 = this.mSmoothScroller;
            if (o0ooooo2 != null && o0ooooo != o0ooooo2 && o0ooooo2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = o0ooooo;
            o0ooooo.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            o0ooOOo o0ooooo = this.mSmoothScroller;
            if (o0ooooo != null) {
                o0ooooo.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, o00Ooo o00ooo2) {
            onDetachedFromWindow(recyclerView);
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

        public void onInitializeAccessibilityNodeInfo(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                o0oo0oo2.OooO00o(8192);
                o0oo0oo2.OooOOOO(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                o0oo0oo2.OooO00o(4096);
                o0oo0oo2.OooOOOO(true);
            }
            o0oo0oo2.OooOO0O(o0000O.o0Oo0oo.OooO0OO.OooO00o(getRowCountForAccessibility(o00ooo2, o0ooo0o2), getColumnCountForAccessibility(o00ooo2, o0ooo0o2), getSelectionModeForAccessibility(o00ooo2, o0ooo0o2), isLayoutHierarchical(o00ooo2, o0ooo0o2)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, o0000O.o0Oo0oo o0oo0oo2) {
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, o0oo0oo2);
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull o0OOO0o o0ooo0o2, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008f A[PHI: r9
          0x008f: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:27:0x007f, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull o00Ooo o00ooo2, @NonNull o0OOO0o o0ooo0o2, int i, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                } else {
                    i2 = paddingTop;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
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
        /* JADX WARN: Code duplicated, block: B:14:0x0020  */
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
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Parcelable f7650OooO0o;

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
            this.f7650OooO0o = parcel.readParcelable(classLoader == null ? Oooo000.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5532OooO0Oo, i);
            parcel.writeParcelable(this.f7650OooO0o, 0);
        }
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
        public final SparseArray<OooO00o> f7651OooO00o = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7652OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Set<Adapter<?>> f7653OooO0OO = Collections.newSetFromMap(new IdentityHashMap());

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final ArrayList<o0O0O00> f7654OooO00o = new ArrayList<>();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f7655OooO0O0 = 5;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f7656OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public long f7657OooO0Oo = 0;
        }

        public final OooO00o OooO00o(int i) {
            SparseArray<OooO00o> sparseArray = this.f7651OooO00o;
            OooO00o oooO00o = sparseArray.get(i);
            if (oooO00o != null) {
                return oooO00o;
            }
            OooO00o oooO00o2 = new OooO00o();
            sparseArray.put(i, oooO00o2);
            return oooO00o2;
        }
    }

    public final class o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList<o0O0O00> f7658OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList<o0O0O00> f7659OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<o0O0O00> f7660OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<o0O0O00> f7661OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7662OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7663OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o00Oo0 f7664OooO0oO;

        public o00Ooo() {
            ArrayList<o0O0O00> arrayList = new ArrayList<>();
            this.f7658OooO00o = arrayList;
            this.f7659OooO0O0 = null;
            this.f7660OooO0OO = new ArrayList<>();
            this.f7661OooO0Oo = Collections.unmodifiableList(arrayList);
            this.f7663OooO0o0 = 2;
            this.f7662OooO0o = 2;
        }

        public static void OooO0o0(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    OooO0o0((ViewGroup) childAt, true);
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

        public final void OooO(int i) {
            ArrayList<o0O0O00> arrayList = this.f7660OooO0OO;
            OooO00o(arrayList.get(i), true);
            arrayList.remove(i);
        }

        public final void OooO00o(@NonNull o0O0O00 o0o0o00, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(o0o0o00);
            View view = o0o0o00.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            o000000 o000000Var = recyclerView.mAccessibilityDelegate;
            if (o000000Var != null) {
                o000000.OooO00o oooO00o = o000000Var.f7760OooO0O0;
                ViewCompat.OooOOOO(view, oooO00o instanceof o000000.OooO00o ? (androidx.core.view.OooO00o) oooO00o.f7762OooO0O0.remove(view) : null);
            }
            if (z) {
                oo000o oo000oVar = recyclerView.mRecyclerListener;
                if (oo000oVar != null) {
                    oo000oVar.OooO00o();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).OooO00o();
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(o0o0o00);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.OooO0Oo(o0o0o00);
                }
            }
            o0o0o00.mBindingAdapter = null;
            o0o0o00.mOwnerRecyclerView = null;
            o00Oo0 o00oo0OooO0OO = OooO0OO();
            o00oo0OooO0OO.getClass();
            int itemViewType = o0o0o00.getItemViewType();
            ArrayList<o0O0O00> arrayList = o00oo0OooO0OO.OooO00o(itemViewType).f7654OooO00o;
            if (o00oo0OooO0OO.f7651OooO00o.get(itemViewType).f7655OooO0O0 <= arrayList.size()) {
                p054o0000OOo.OooO0o.OooO00o(o0o0o00.itemView);
            } else {
                o0o0o00.resetInternal();
                arrayList.add(o0o0o00);
            }
        }

        public final int OooO0O0(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.OooO0O0()) {
                return !recyclerView.mState.f7674OooO0oO ? i : recyclerView.mAdapterHelper.OooO0o(i, 0);
            }
            StringBuilder sbOooO00o = o0000O0.OooO00o("invalid position ", i, ". State item count is ");
            sbOooO00o.append(recyclerView.mState.OooO0O0());
            sbOooO00o.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }

        public final o00Oo0 OooO0OO() {
            if (this.f7664OooO0oO == null) {
                this.f7664OooO0oO = new o00Oo0();
                OooO0o();
            }
            return this.f7664OooO0oO;
        }

        @NonNull
        public final View OooO0Oo(int i) {
            return OooOOO0(Long.MAX_VALUE, i).itemView;
        }

        public final void OooO0o() {
            if (this.f7664OooO0oO != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                o00Oo0 o00oo1 = this.f7664OooO0oO;
                o00oo1.f7653OooO0OO.add(recyclerView.mAdapter);
            }
        }

        public final void OooO0oO(Adapter<?> adapter, boolean z) {
            o00Oo0 o00oo1 = this.f7664OooO0oO;
            if (o00oo1 == null) {
                return;
            }
            Set<Adapter<?>> set = o00oo1.f7653OooO0OO;
            set.remove(adapter);
            if (set.size() != 0 || z) {
                return;
            }
            int i = 0;
            while (true) {
                SparseArray<o00Oo0.OooO00o> sparseArray = o00oo1.f7651OooO00o;
                if (i >= sparseArray.size()) {
                    return;
                }
                ArrayList<o0O0O00> arrayList = sparseArray.get(sparseArray.keyAt(i)).f7654OooO00o;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    p054o0000OOo.OooO0o.OooO00o(arrayList.get(i2).itemView);
                }
                i++;
            }
        }

        public final void OooO0oo() {
            ArrayList<o0O0O00> arrayList = this.f7660OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                OooO(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O0 = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = oooO0O0.f7792OooO0OO;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                oooO0O0.f7793OooO0Oo = 0;
            }
        }

        public final void OooOO0(@NonNull View view) {
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            OooOO0O(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.OooOO0(childViewHolderInt);
        }

        public final void OooOO0O(o0O0O00 o0o0o00) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean zIsScrap = o0o0o00.isScrap();
            boolean z5 = false;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || o0o0o00.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(o0o0o00.isScrap());
                sb.append(" isAttached:");
                sb.append(o0o0o00.itemView.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (o0o0o00.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(o0o0o00);
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb2));
            }
            if (o0o0o00.shouldIgnore()) {
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = o0o0o00.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.mAdapter;
            if ((adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(o0o0o00)) || o0o0o00.isRecyclable()) {
                if (this.f7662OooO0o <= 0 || o0o0o00.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    ArrayList<o0O0O00> arrayList = this.f7660OooO0OO;
                    int size = arrayList.size();
                    if (size >= this.f7662OooO0o && size > 0) {
                        OooO(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
                        int i = o0o0o00.mPosition;
                        if (oooO0O0.f7792OooO0OO == null) {
                            z3 = false;
                            break;
                        }
                        int i2 = oooO0O0.f7793OooO0Oo * 2;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                z3 = false;
                                break;
                            } else {
                                if (oooO0O0.f7792OooO0OO[i3] == i) {
                                    z3 = true;
                                    break;
                                }
                                i3 += 2;
                            }
                        }
                        if (!z3) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                                int i4 = arrayList.get(size).mPosition;
                                androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O1 = recyclerView.mPrefetchRegistry;
                                if (oooO0O1.f7792OooO0OO == null) {
                                    z4 = false;
                                    break;
                                    break;
                                }
                                int i5 = oooO0O1.f7793OooO0Oo * 2;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        z4 = false;
                                        break;
                                    } else {
                                        if (oooO0O1.f7792OooO0OO[i6] == i4) {
                                            z4 = true;
                                            break;
                                        }
                                        i6 += 2;
                                    }
                                }
                            } while (z4);
                            size++;
                        }
                    }
                    arrayList.add(size, o0o0o00);
                    z = true;
                }
                if (!z) {
                    OooO00o(o0o0o00, true);
                    z5 = true;
                }
                z2 = z5;
                z5 = z;
            } else {
                z2 = false;
            }
            recyclerView.mViewInfoStore.OooO0Oo(o0o0o00);
            if (z5 || z2 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            p054o0000OOo.OooO0o.OooO00o(o0o0o00.itemView);
            o0o0o00.mBindingAdapter = null;
            o0o0o00.mOwnerRecyclerView = null;
        }

        public final void OooOO0o(View view) {
            o0O0O00 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f7659OooO0O0 == null) {
                    this.f7659OooO0O0 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f7659OooO0O0.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f7658OooO00o.add(childViewHolderInt);
        }

        public final void OooOOO(o0O0O00 o0o0o00) {
            if (o0o0o00.mInChangeScrap) {
                this.f7659OooO0O0.remove(o0o0o00);
            } else {
                this.f7658OooO00o.remove(o0o0o00);
            }
            o0o0o00.mScrapContainer = null;
            o0o0o00.mInChangeScrap = false;
            o0o0o00.clearReturnedFromScrapFlag();
        }

        /* JADX WARN: Code duplicated, block: B:114:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:116:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:119:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:121:0x0201  */
        /* JADX WARN: Code duplicated, block: B:125:0x0219  */
        /* JADX WARN: Code duplicated, block: B:172:0x02fb A[EDGE_INSN: B:172:0x02fb->B:173:0x02fc BREAK  A[LOOP:6: B:167:0x02e3->B:171:0x02f8]] */
        /* JADX WARN: Code duplicated, block: B:212:0x03b0  */
        /* JADX WARN: Code duplicated, block: B:218:0x03d5  */
        /* JADX WARN: Code duplicated, block: B:220:0x03db  */
        /* JADX WARN: Code duplicated, block: B:224:0x03e7  */
        /* JADX WARN: Code duplicated, block: B:226:0x0403  */
        /* JADX WARN: Code duplicated, block: B:228:0x0411  */
        /* JADX WARN: Code duplicated, block: B:232:0x0419  */
        /* JADX WARN: Code duplicated, block: B:234:0x041c  */
        /* JADX WARN: Code duplicated, block: B:238:0x043d  */
        /* JADX WARN: Code duplicated, block: B:241:0x044d  */
        /* JADX WARN: Code duplicated, block: B:243:0x0457  */
        /* JADX WARN: Code duplicated, block: B:244:0x045c  */
        /* JADX WARN: Code duplicated, block: B:248:0x0462  */
        /* JADX WARN: Code duplicated, block: B:250:0x0468  */
        /* JADX WARN: Code duplicated, block: B:253:0x0472  */
        /* JADX WARN: Code duplicated, block: B:255:0x0476  */
        /* JADX WARN: Code duplicated, block: B:256:0x047b  */
        /* JADX WARN: Code duplicated, block: B:258:0x0482 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:262:0x048e  */
        /* JADX WARN: Code duplicated, block: B:265:0x0495  */
        /* JADX WARN: Code duplicated, block: B:269:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:270:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:272:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:273:0x04be  */
        /* JADX WARN: Code duplicated, block: B:276:0x04c5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:288:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:294:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:298:0x0193 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0081 A[EDGE_INSN: B:35:0x0081->B:36:0x0082 BREAK  A[LOOP:0: B:14:0x0025->B:20:0x003f]] */
        /* JADX WARN: Code duplicated, block: B:42:0x008f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0096  */
        /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:71:0x010a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0112  */
        /* JADX WARN: Code duplicated, block: B:75:0x0120 A[EDGE_INSN: B:75:0x0120->B:93:0x0194 BREAK  A[LOOP:1: B:43:0x0094->B:56:0x00c0]] */
        /* JADX WARN: Code duplicated, block: B:76:0x012e  */
        /* JADX WARN: Code duplicated, block: B:78:0x0142  */
        /* JADX WARN: Code duplicated, block: B:80:0x0157  */
        /* JADX WARN: Code duplicated, block: B:82:0x016c  */
        /* JADX WARN: Code duplicated, block: B:84:0x0173  */
        /* JADX WARN: Code duplicated, block: B:94:0x0196  */
        /* JADX WARN: Code duplicated, block: B:96:0x019c  */
        /* JADX WARN: Code duplicated, block: B:97:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:99:0x01a5  */
        /* JADX WARN: Instruction removed from duplicated block: B:78:0x0142, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:80:0x0157, please report this as an issue */
        @Nullable
        public final o0O0O00 OooOOO0(long j, int i) {
            o0O0O00 o0o0o00CreateViewHolder;
            boolean z;
            ArrayList<o0O0O00> arrayList;
            ArrayList<o0O0O00> arrayList2;
            androidx.core.view.OooO00o oooO00o;
            int itemViewType;
            long nanoTime;
            long j2;
            boolean z2;
            boolean z3;
            View view;
            boolean z4;
            o000000 o000000Var;
            o000000.OooO00o oooO00o2;
            View.AccessibilityDelegate accessibilityDelegateOooO0Oo;
            long j3;
            boolean z5;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            int iOooO0o;
            RecyclerView recyclerViewFindNestedRecyclerView;
            o0O0O00 o0o0o00Remove;
            int size;
            int i2;
            androidx.recyclerview.widget.OooO0o oooO0o;
            ArrayList arrayList3;
            int size2;
            int i3;
            View view2;
            int size3;
            int i4;
            o0O0O00 o0o0o00;
            androidx.recyclerview.widget.OooO0o oooO0o2;
            int iIndexOfChild;
            androidx.recyclerview.widget.OooO0o.OooO00o oooO00o3;
            int iOooOO0;
            o0O0O00 childViewHolderInt;
            int i5;
            boolean z6;
            int size4;
            int iOooO0o2;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.mState.OooO0O0()) {
                StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("Invalid item position ", i, "(", i, "). Item count:");
                sbOooO00o.append(recyclerView.mState.OooO0O0());
                sbOooO00o.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbOooO00o.toString());
            }
            boolean z7 = false;
            if (recyclerView.mState.f7674OooO0oO) {
                ArrayList<o0O0O00> arrayList4 = this.f7659OooO0O0;
                if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            if (recyclerView.mAdapter.hasStableIds() && (iOooO0o2 = recyclerView.mAdapterHelper.OooO0o(i, 0)) > 0 && iOooO0o2 < recyclerView.mAdapter.getItemCount()) {
                                long itemId = recyclerView.mAdapter.getItemId(iOooO0o2);
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size4) {
                                        o0o0o00CreateViewHolder = null;
                                        break;
                                    }
                                    o0O0O00 o0o0o01 = this.f7659OooO0O0.get(i7);
                                    if (!o0o0o01.wasReturnedFromScrap() && o0o0o01.getItemId() == itemId) {
                                        o0o0o01.addFlags(32);
                                        o0o0o00CreateViewHolder = o0o0o01;
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                o0o0o00CreateViewHolder = null;
                                break;
                            }
                        } else {
                            o0o0o00CreateViewHolder = this.f7659OooO0O0.get(i6);
                            if (!o0o0o00CreateViewHolder.wasReturnedFromScrap() && o0o0o00CreateViewHolder.getLayoutPosition() == i) {
                                o0o0o00CreateViewHolder.addFlags(32);
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    o0o0o00CreateViewHolder = null;
                    break;
                }
                if (o0o0o00CreateViewHolder != null) {
                    z = true;
                }
                arrayList = this.f7660OooO0OO;
                arrayList2 = this.f7658OooO00o;
                if (o0o0o00CreateViewHolder == null) {
                    size = arrayList2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            oooO0o = recyclerView.mChildHelper;
                            arrayList3 = oooO0o.f7509OooO0OO;
                            size2 = arrayList3.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    view2 = null;
                                    break;
                                }
                                view2 = (View) arrayList3.get(i3);
                                ((OooO) oooO0o.f7507OooO00o).getClass();
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                                if (childViewHolderInt.getLayoutPosition() != i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                    break;
                                }
                                i3++;
                            }
                            if (view2 != null) {
                                size3 = arrayList.size();
                                i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        o0o0o00CreateViewHolder = null;
                                        break;
                                    }
                                    o0o0o00 = arrayList.get(i4);
                                    if (o0o0o00.isInvalid() && o0o0o00.getLayoutPosition() == i && !o0o0o00.isAttachedToTransitionOverlay()) {
                                        arrayList.remove(i4);
                                    } else {
                                        i4++;
                                    }
                                }
                            } else {
                                o0o0o00CreateViewHolder = RecyclerView.getChildViewHolderInt(view2);
                                oooO0o2 = recyclerView.mChildHelper;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                                if (iIndexOfChild >= 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                                }
                                oooO00o3 = oooO0o2.f7508OooO0O0;
                                if (oooO00o3.OooO0Oo(iIndexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                                }
                                oooO00o3.OooO00o(iIndexOfChild);
                                oooO0o2.OooOOO0(view2);
                                iOooOO0 = recyclerView.mChildHelper.OooOO0(view2);
                                if (iOooOO0 != -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(o0o0o00CreateViewHolder);
                                    throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb));
                                }
                                recyclerView.mChildHelper.OooO0OO(iOooOO0);
                                OooOO0o(view2);
                                o0o0o00CreateViewHolder.addFlags(8224);
                                break;
                            }
                        } else {
                            o0o0o00 = arrayList2.get(i2);
                            if (!o0o0o00.wasReturnedFromScrap() || o0o0o00.getLayoutPosition() != i || o0o0o00.isInvalid() || (!recyclerView.mState.f7674OooO0oO && o0o0o00.isRemoved())) {
                                i2++;
                            } else {
                                o0o0o00.addFlags(32);
                            }
                        }
                        o0o0o00CreateViewHolder = o0o0o00;
                        break;
                    }
                    if (o0o0o00CreateViewHolder != null) {
                        if (o0o0o00CreateViewHolder.isRemoved()) {
                            z6 = recyclerView.mState.f7674OooO0oO;
                        } else {
                            i5 = o0o0o00CreateViewHolder.mPosition;
                            if (i5 >= 0 || i5 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb2.append(o0o0o00CreateViewHolder);
                                throw new IndexOutOfBoundsException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb2));
                            }
                            z6 = (recyclerView.mState.f7674OooO0oO || recyclerView.mAdapter.getItemViewType(o0o0o00CreateViewHolder.mPosition) == o0o0o00CreateViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || o0o0o00CreateViewHolder.getItemId() == recyclerView.mAdapter.getItemId(o0o0o00CreateViewHolder.mPosition));
                        }
                        if (z6) {
                            z = true;
                        } else {
                            o0o0o00CreateViewHolder.addFlags(4);
                            if (o0o0o00CreateViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(o0o0o00CreateViewHolder.itemView, false);
                                o0o0o00CreateViewHolder.unScrap();
                            } else if (o0o0o00CreateViewHolder.wasReturnedFromScrap()) {
                                o0o0o00CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            OooOO0O(o0o0o00CreateViewHolder);
                            o0o0o00CreateViewHolder = null;
                        }
                    }
                }
                if (o0o0o00CreateViewHolder == null) {
                    iOooO0o = recyclerView.mAdapterHelper.OooO0o(i, 0);
                    if (iOooO0o >= 0 || iOooO0o >= recyclerView.mAdapter.getItemCount()) {
                        StringBuilder sbOooO00o2 = p041Ooooo0o.o00000.OooO00o("Inconsistency detected. Invalid item position ", i, "(offset:", iOooO0o, ").state:");
                        sbOooO00o2.append(recyclerView.mState.OooO0O0());
                        sbOooO00o2.append(recyclerView.exceptionLabel());
                        throw new IndexOutOfBoundsException(sbOooO00o2.toString());
                    }
                    int itemViewType2 = recyclerView.mAdapter.getItemViewType(iOooO0o);
                    if (recyclerView.mAdapter.hasStableIds()) {
                        long itemId2 = recyclerView.mAdapter.getItemId(iOooO0o);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        o0o0o00CreateViewHolder = arrayList.get(size6);
                                        if (o0o0o00CreateViewHolder.getItemId() != itemId2 || o0o0o00CreateViewHolder.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else {
                                            if (itemViewType2 == o0o0o00CreateViewHolder.getItemViewType()) {
                                                arrayList.remove(size6);
                                                break;
                                            }
                                            OooO(size6);
                                        }
                                    }
                                    o0o0o00CreateViewHolder = null;
                                    break;
                                }
                            }
                            o0O0O00 o0o0o02 = arrayList2.get(size5);
                            if (o0o0o02.getItemId() == itemId2 && !o0o0o02.wasReturnedFromScrap()) {
                                if (itemViewType2 == o0o0o02.getItemViewType()) {
                                    o0o0o02.addFlags(32);
                                    if (o0o0o02.isRemoved() && !recyclerView.mState.f7674OooO0oO) {
                                        o0o0o02.setFlags(2, 14);
                                    }
                                    o0o0o00CreateViewHolder = o0o0o02;
                                    break;
                                }
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(o0o0o02.itemView, false);
                                o0O0O00 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(o0o0o02.itemView);
                                childViewHolderInt2.mScrapContainer = null;
                                childViewHolderInt2.mInChangeScrap = false;
                                childViewHolderInt2.clearReturnedFromScrapFlag();
                                OooOO0O(childViewHolderInt2);
                            }
                            size5--;
                        }
                        if (o0o0o00CreateViewHolder != null) {
                            o0o0o00CreateViewHolder.mPosition = iOooO0o;
                            z = true;
                        }
                    }
                    if (o0o0o00CreateViewHolder == null) {
                        o00Oo0.OooO00o oooO00o4 = OooO0OO().f7651OooO00o.get(itemViewType2);
                        if (oooO00o4 == null) {
                            o0o0o00Remove = null;
                            break;
                        }
                        ArrayList<o0O0O00> arrayList5 = oooO00o4.f7654OooO00o;
                        if (!arrayList5.isEmpty()) {
                            int size7 = arrayList5.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    o0o0o00Remove = null;
                                    break;
                                }
                                if (!arrayList5.get(size7).isAttachedToTransitionOverlay()) {
                                    o0o0o00Remove = arrayList5.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            o0o0o00Remove = null;
                            break;
                        }
                        if (o0o0o00Remove != null) {
                            o0o0o00Remove.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view3 = o0o0o00Remove.itemView;
                                if (view3 instanceof ViewGroup) {
                                    OooO0o0((ViewGroup) view3, false);
                                }
                            }
                        }
                        o0o0o00CreateViewHolder = o0o0o00Remove;
                    }
                    if (o0o0o00CreateViewHolder == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j4 = this.f7664OooO0oO.OooO00o(itemViewType2).f7656OooO0OO;
                            if (!(j4 == 0 || j4 + nanoTime2 < j)) {
                                return null;
                            }
                        }
                        o0o0o00CreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(o0o0o00CreateViewHolder.itemView)) != null) {
                            o0o0o00CreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        o00Oo0.OooO00o OooO00o2 = this.f7664OooO0oO.OooO00o(itemViewType2);
                        long j5 = OooO00o2.f7656OooO0OO;
                        if (j5 != 0) {
                            nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                        }
                        OooO00o2.f7656OooO0OO = nanoTime3;
                    }
                }
                if (z && !recyclerView.mState.f7674OooO0oO && o0o0o00CreateViewHolder.hasAnyOfTheFlags(8192)) {
                    o0o0o00CreateViewHolder.setFlags(0, 8192);
                    if (recyclerView.mState.f7676OooOO0) {
                        ItemAnimator.OooO0o0(o0o0o00CreateViewHolder);
                        ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                        o0o0o00CreateViewHolder.getUnmodifiedPayloads();
                        itemAnimator.getClass();
                        ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                        oooO0OO.OooO00o(o0o0o00CreateViewHolder);
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(o0o0o00CreateViewHolder, oooO0OO);
                    }
                }
                if (recyclerView.mState.f7674OooO0oO || !o0o0o00CreateViewHolder.isBound()) {
                    if (o0o0o00CreateViewHolder.isBound() || o0o0o00CreateViewHolder.needsUpdate() || o0o0o00CreateViewHolder.isInvalid()) {
                        int iOooO0o3 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                        oooO00o = null;
                        o0o0o00CreateViewHolder.mBindingAdapter = null;
                        o0o0o00CreateViewHolder.mOwnerRecyclerView = recyclerView;
                        itemViewType = o0o0o00CreateViewHolder.getItemViewType();
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j3 = this.f7664OooO0oO.OooO00o(itemViewType).f7657OooO0Oo;
                            if (j3 != 0 || j3 + nanoTime4 < j) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                            }
                        }
                        recyclerView.mAdapter.bindViewHolder(o0o0o00CreateViewHolder, iOooO0o3);
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        o00Oo0.OooO00o OooO00o3 = this.f7664OooO0oO.OooO00o(o0o0o00CreateViewHolder.getItemViewType());
                        j2 = OooO00o3.f7657OooO0Oo;
                        if (j2 != 0) {
                            nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                        }
                        OooO00o3.f7657OooO0Oo = nanoTime;
                        if (recyclerView.isAccessibilityEnabled()) {
                            view = o0o0o00CreateViewHolder.itemView;
                            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                            if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                                z4 = true;
                                ViewCompat.OooO0o.OooOOoo(view, 1);
                            } else {
                                z4 = true;
                            }
                            o000000Var = recyclerView.mAccessibilityDelegate;
                            if (o000000Var != null) {
                                oooO00o2 = o000000Var.f7760OooO0O0;
                                if (oooO00o2 instanceof o000000.OooO00o) {
                                    oooO00o2.getClass();
                                    accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                                    if (accessibilityDelegateOooO0Oo != null) {
                                        if (accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o) {
                                            oooO00o = ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o;
                                        } else {
                                            oooO00o = new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                                        }
                                    }
                                    if (oooO00o != null && oooO00o != oooO00o2) {
                                        oooO00o2.f7762OooO0O0.put(view, oooO00o);
                                    }
                                }
                                ViewCompat.OooOOOO(view, oooO00o2);
                            }
                            z2 = z4;
                        } else {
                            z2 = true;
                        }
                        if (recyclerView.mState.f7674OooO0oO) {
                            o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                        }
                        z3 = z2;
                    }
                    layoutParams = o0o0o00CreateViewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                        o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                        o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f7633OooO0Oo = o0o0o00CreateViewHolder;
                    if (z && z2) {
                        z7 = z3;
                    }
                    layoutParams2.f7636OooO0oO = z7;
                    return o0o0o00CreateViewHolder;
                }
                o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                z3 = true;
                z2 = false;
                layoutParams = o0o0o00CreateViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.f7633OooO0Oo = o0o0o00CreateViewHolder;
                if (z) {
                    z7 = z3;
                }
                layoutParams2.f7636OooO0oO = z7;
                return o0o0o00CreateViewHolder;
            }
            o0o0o00CreateViewHolder = null;
            z = false;
            arrayList = this.f7660OooO0OO;
            arrayList2 = this.f7658OooO00o;
            if (o0o0o00CreateViewHolder == null) {
                size = arrayList2.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        o0o0o00 = arrayList2.get(i2);
                        if (o0o0o00.wasReturnedFromScrap()) {
                        }
                        i2++;
                    } else {
                        oooO0o = recyclerView.mChildHelper;
                        arrayList3 = oooO0o.f7509OooO0OO;
                        size2 = arrayList3.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList3.get(i3);
                            ((OooO) oooO0o.f7507OooO00o).getClass();
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                            if (childViewHolderInt.getLayoutPosition() != i) {
                            }
                            i3++;
                        }
                        if (view2 != null) {
                            size3 = arrayList.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size3) {
                                    o0o0o00CreateViewHolder = null;
                                    break;
                                }
                                o0o0o00 = arrayList.get(i4);
                                if (o0o0o00.isInvalid()) {
                                }
                                i4++;
                            }
                        } else {
                            o0o0o00CreateViewHolder = RecyclerView.getChildViewHolderInt(view2);
                            oooO0o2 = recyclerView.mChildHelper;
                            iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                            }
                            oooO00o3 = oooO0o2.f7508OooO0O0;
                            if (oooO00o3.OooO0Oo(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            oooO00o3.OooO00o(iIndexOfChild);
                            oooO0o2.OooOOO0(view2);
                            iOooOO0 = recyclerView.mChildHelper.OooOO0(view2);
                            if (iOooOO0 != -1) {
                                StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb3.append(o0o0o00CreateViewHolder);
                                throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb3));
                            }
                            recyclerView.mChildHelper.OooO0OO(iOooOO0);
                            OooOO0o(view2);
                            o0o0o00CreateViewHolder.addFlags(8224);
                            break;
                        }
                        if (o0o0o00CreateViewHolder != null) {
                            if (o0o0o00CreateViewHolder.isRemoved()) {
                                i5 = o0o0o00CreateViewHolder.mPosition;
                                if (i5 >= 0) {
                                }
                                StringBuilder sb4 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb4.append(o0o0o00CreateViewHolder);
                                throw new IndexOutOfBoundsException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb4));
                            }
                            z6 = recyclerView.mState.f7674OooO0oO;
                            if (z6) {
                                o0o0o00CreateViewHolder.addFlags(4);
                                if (o0o0o00CreateViewHolder.isScrap()) {
                                    recyclerView.removeDetachedView(o0o0o00CreateViewHolder.itemView, false);
                                    o0o0o00CreateViewHolder.unScrap();
                                } else if (o0o0o00CreateViewHolder.wasReturnedFromScrap()) {
                                    o0o0o00CreateViewHolder.clearReturnedFromScrapFlag();
                                }
                                OooOO0O(o0o0o00CreateViewHolder);
                                o0o0o00CreateViewHolder = null;
                            } else {
                                z = true;
                            }
                        }
                    }
                    o0o0o00CreateViewHolder = o0o0o00;
                    if (o0o0o00CreateViewHolder != null) {
                        if (o0o0o00CreateViewHolder.isRemoved()) {
                            i5 = o0o0o00CreateViewHolder.mPosition;
                            if (i5 >= 0) {
                            }
                            StringBuilder sb5 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb5.append(o0o0o00CreateViewHolder);
                            throw new IndexOutOfBoundsException(androidx.compose.foundation.layout.OooO00o.OooO0O0(recyclerView, sb5));
                        }
                        z6 = recyclerView.mState.f7674OooO0oO;
                        if (z6) {
                            o0o0o00CreateViewHolder.addFlags(4);
                            if (o0o0o00CreateViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(o0o0o00CreateViewHolder.itemView, false);
                                o0o0o00CreateViewHolder.unScrap();
                            } else if (o0o0o00CreateViewHolder.wasReturnedFromScrap()) {
                                o0o0o00CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            OooOO0O(o0o0o00CreateViewHolder);
                            o0o0o00CreateViewHolder = null;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            if (o0o0o00CreateViewHolder == null) {
                iOooO0o = recyclerView.mAdapterHelper.OooO0o(i, 0);
                if (iOooO0o >= 0) {
                }
                StringBuilder sbOooO00o3 = p041Ooooo0o.o00000.OooO00o("Inconsistency detected. Invalid item position ", i, "(offset:", iOooO0o, ").state:");
                sbOooO00o3.append(recyclerView.mState.OooO0O0());
                sbOooO00o3.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbOooO00o3.toString());
            }
            if (z) {
                o0o0o00CreateViewHolder.setFlags(0, 8192);
                if (recyclerView.mState.f7676OooOO0) {
                    ItemAnimator.OooO0o0(o0o0o00CreateViewHolder);
                    ItemAnimator itemAnimator2 = recyclerView.mItemAnimator;
                    o0o0o00CreateViewHolder.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    ItemAnimator.OooO0OO oooO0OO2 = new ItemAnimator.OooO0OO();
                    oooO0OO2.OooO00o(o0o0o00CreateViewHolder);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(o0o0o00CreateViewHolder, oooO0OO2);
                }
            }
            if (recyclerView.mState.f7674OooO0oO) {
                if (o0o0o00CreateViewHolder.isBound()) {
                    int iOooO0o4 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                    oooO00o = null;
                    o0o0o00CreateViewHolder.mBindingAdapter = null;
                    o0o0o00CreateViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = o0o0o00CreateViewHolder.getItemViewType();
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.f7664OooO0oO.OooO00o(itemViewType).f7657OooO0Oo;
                        if (j3 != 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            z3 = true;
                            z2 = false;
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(o0o0o00CreateViewHolder, iOooO0o4);
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    o00Oo0.OooO00o OooO00o4 = this.f7664OooO0oO.OooO00o(o0o0o00CreateViewHolder.getItemViewType());
                    j2 = OooO00o4.f7657OooO0Oo;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    OooO00o4.f7657OooO0Oo = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = o0o0o00CreateViewHolder.itemView;
                        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                            z4 = true;
                            ViewCompat.OooO0o.OooOOoo(view, 1);
                        } else {
                            z4 = true;
                        }
                        o000000Var = recyclerView.mAccessibilityDelegate;
                        if (o000000Var != null) {
                            oooO00o2 = o000000Var.f7760OooO0O0;
                            if (oooO00o2 instanceof o000000.OooO00o) {
                                oooO00o2.getClass();
                                accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                                if (accessibilityDelegateOooO0Oo != null) {
                                    if (accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o) {
                                        oooO00o = ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o;
                                    } else {
                                        oooO00o = new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                                    }
                                }
                                if (oooO00o != null) {
                                    oooO00o2.f7762OooO0O0.put(view, oooO00o);
                                }
                            }
                            ViewCompat.OooOOOO(view, oooO00o2);
                        }
                        z2 = z4;
                    } else {
                        z2 = true;
                    }
                    if (recyclerView.mState.f7674OooO0oO) {
                        o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                    }
                    z3 = z2;
                } else {
                    int iOooO0o5 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                    oooO00o = null;
                    o0o0o00CreateViewHolder.mBindingAdapter = null;
                    o0o0o00CreateViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = o0o0o00CreateViewHolder.getItemViewType();
                    long nanoTime6 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.f7664OooO0oO.OooO00o(itemViewType).f7657OooO0Oo;
                        if (j3 != 0) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            z3 = true;
                            z2 = false;
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(o0o0o00CreateViewHolder, iOooO0o5);
                    nanoTime = recyclerView.getNanoTime() - nanoTime6;
                    o00Oo0.OooO00o OooO00o5 = this.f7664OooO0oO.OooO00o(o0o0o00CreateViewHolder.getItemViewType());
                    j2 = OooO00o5.f7657OooO0Oo;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    OooO00o5.f7657OooO0Oo = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view = o0o0o00CreateViewHolder.itemView;
                        WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
                        if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                            z4 = true;
                            ViewCompat.OooO0o.OooOOoo(view, 1);
                        } else {
                            z4 = true;
                        }
                        o000000Var = recyclerView.mAccessibilityDelegate;
                        if (o000000Var != null) {
                            oooO00o2 = o000000Var.f7760OooO0O0;
                            if (oooO00o2 instanceof o000000.OooO00o) {
                                oooO00o2.getClass();
                                accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                                if (accessibilityDelegateOooO0Oo != null) {
                                    if (accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o) {
                                        oooO00o = ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o;
                                    } else {
                                        oooO00o = new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                                    }
                                }
                                if (oooO00o != null) {
                                    oooO00o2.f7762OooO0O0.put(view, oooO00o);
                                }
                            }
                            ViewCompat.OooOOOO(view, oooO00o2);
                        }
                        z2 = z4;
                    } else {
                        z2 = true;
                    }
                    if (recyclerView.mState.f7674OooO0oO) {
                        o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                    }
                    z3 = z2;
                }
            } else if (o0o0o00CreateViewHolder.isBound()) {
                int iOooO0o6 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                oooO00o = null;
                o0o0o00CreateViewHolder.mBindingAdapter = null;
                o0o0o00CreateViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = o0o0o00CreateViewHolder.getItemViewType();
                long nanoTime7 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.f7664OooO0oO.OooO00o(itemViewType).f7657OooO0Oo;
                    if (j3 != 0) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        z3 = true;
                        z2 = false;
                    }
                }
                recyclerView.mAdapter.bindViewHolder(o0o0o00CreateViewHolder, iOooO0o6);
                nanoTime = recyclerView.getNanoTime() - nanoTime7;
                o00Oo0.OooO00o OooO00o6 = this.f7664OooO0oO.OooO00o(o0o0o00CreateViewHolder.getItemViewType());
                j2 = OooO00o6.f7657OooO0Oo;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                OooO00o6.f7657OooO0Oo = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = o0o0o00CreateViewHolder.itemView;
                    WeakHashMap<View, o000O0Oo> weakHashMap4 = ViewCompat.f5334OooO00o;
                    if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                        z4 = true;
                        ViewCompat.OooO0o.OooOOoo(view, 1);
                    } else {
                        z4 = true;
                    }
                    o000000Var = recyclerView.mAccessibilityDelegate;
                    if (o000000Var != null) {
                        oooO00o2 = o000000Var.f7760OooO0O0;
                        if (oooO00o2 instanceof o000000.OooO00o) {
                            oooO00o2.getClass();
                            accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                            if (accessibilityDelegateOooO0Oo != null) {
                                if (accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o) {
                                    oooO00o = ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o;
                                } else {
                                    oooO00o = new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                                }
                            }
                            if (oooO00o != null) {
                                oooO00o2.f7762OooO0O0.put(view, oooO00o);
                            }
                        }
                        ViewCompat.OooOOOO(view, oooO00o2);
                    }
                    z2 = z4;
                } else {
                    z2 = true;
                }
                if (recyclerView.mState.f7674OooO0oO) {
                    o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                }
                z3 = z2;
            } else {
                int iOooO0o7 = recyclerView.mAdapterHelper.OooO0o(i, 0);
                oooO00o = null;
                o0o0o00CreateViewHolder.mBindingAdapter = null;
                o0o0o00CreateViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = o0o0o00CreateViewHolder.getItemViewType();
                long nanoTime8 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.f7664OooO0oO.OooO00o(itemViewType).f7657OooO0Oo;
                    if (j3 != 0) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        z3 = true;
                        z2 = false;
                    }
                }
                recyclerView.mAdapter.bindViewHolder(o0o0o00CreateViewHolder, iOooO0o7);
                nanoTime = recyclerView.getNanoTime() - nanoTime8;
                o00Oo0.OooO00o OooO00o7 = this.f7664OooO0oO.OooO00o(o0o0o00CreateViewHolder.getItemViewType());
                j2 = OooO00o7.f7657OooO0Oo;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                OooO00o7.f7657OooO0Oo = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view = o0o0o00CreateViewHolder.itemView;
                    WeakHashMap<View, o000O0Oo> weakHashMap5 = ViewCompat.f5334OooO00o;
                    if (ViewCompat.OooO0o.OooO0OO(view) == 0) {
                        z4 = true;
                        ViewCompat.OooO0o.OooOOoo(view, 1);
                    } else {
                        z4 = true;
                    }
                    o000000Var = recyclerView.mAccessibilityDelegate;
                    if (o000000Var != null) {
                        oooO00o2 = o000000Var.f7760OooO0O0;
                        if (oooO00o2 instanceof o000000.OooO00o) {
                            oooO00o2.getClass();
                            accessibilityDelegateOooO0Oo = ViewCompat.OooO0Oo(view);
                            if (accessibilityDelegateOooO0Oo != null) {
                                if (accessibilityDelegateOooO0Oo instanceof androidx.core.view.OooO00o.C0122OooO00o) {
                                    oooO00o = ((androidx.core.view.OooO00o.C0122OooO00o) accessibilityDelegateOooO0Oo).f5328OooO00o;
                                } else {
                                    oooO00o = new androidx.core.view.OooO00o(accessibilityDelegateOooO0Oo);
                                }
                            }
                            if (oooO00o != null) {
                                oooO00o2.f7762OooO0O0.put(view, oooO00o);
                            }
                        }
                        ViewCompat.OooOOOO(view, oooO00o2);
                    }
                    z2 = z4;
                } else {
                    z2 = true;
                }
                if (recyclerView.mState.f7674OooO0oO) {
                    o0o0o00CreateViewHolder.mPreLayoutPosition = i;
                }
                z3 = z2;
            }
            layoutParams = o0o0o00CreateViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                o0o0o00CreateViewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.f7633OooO0Oo = o0o0o00CreateViewHolder;
            if (z) {
                z7 = z3;
            }
            layoutParams2.f7636OooO0oO = z7;
            return o0o0o00CreateViewHolder;
        }

        public final void OooOOOO() {
            Oooo000 oooo000 = RecyclerView.this.mLayout;
            this.f7662OooO0o = this.f7663OooO0o0 + (oooo000 != null ? oooo000.mPrefetchMaxCountObserved : 0);
            ArrayList<o0O0O00> arrayList = this.f7660OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7662OooO0o; size--) {
                OooO(size);
            }
        }
    }

    public class o00oO0o extends OooOOO {
        public o00oO0o() {
        }

        public final void OooO00o() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOO0(recyclerView, runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f7672OooO0o = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.OooO0oO()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                oooO00o.getClass();
            } else {
                ArrayList<androidx.recyclerview.widget.OooO00o.OooO0O0> arrayList = oooO00o.f7492OooO0O0;
                arrayList.add(oooO00o.OooO0oo(4, i, i2, obj));
                oooO00o.f7495OooO0o |= 4;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                oooO00o.getClass();
            } else {
                ArrayList<androidx.recyclerview.widget.OooO00o.OooO0O0> arrayList = oooO00o.f7492OooO0O0;
                arrayList.add(oooO00o.OooO0oo(1, i, i2, null));
                oooO00o.f7495OooO0o |= 1;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            oooO00o.getClass();
            boolean z = false;
            if (i != i2) {
                if (i3 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                ArrayList<androidx.recyclerview.widget.OooO00o.OooO0O0> arrayList = oooO00o.f7492OooO0O0;
                arrayList.add(oooO00o.OooO0oo(8, i, i2, null));
                oooO00o.f7495OooO0o |= 8;
                if (arrayList.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                OooO00o();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.OooO00o oooO00o = recyclerView.mAdapterHelper;
            boolean z = false;
            if (i2 < 1) {
                oooO00o.getClass();
            } else {
                ArrayList<androidx.recyclerview.widget.OooO00o.OooO0O0> arrayList = oooO00o.f7492OooO0O0;
                arrayList.add(oooO00o.OooO0oo(2, i, i2, null));
                oooO00o.f7495OooO0o |= 2;
                if (arrayList.size() == 1) {
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
            recyclerView.requestLayout();
        }
    }

    public static abstract class o0O0O00 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends o0O0O00> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        o0O0O00 mShadowedHolder = null;
        o0O0O00 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        o00Ooo mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public o0O0O00(@NonNull View view) {
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
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        public final Adapter<? extends o0O0O00> getBindingAdapter() {
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
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
                ((LayoutParams) this.itemView.getLayoutParams()).f7634OooO0o = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbOooO0O0.append(Integer.toHexString(hashCode()));
            sbOooO0O0.append(" position=");
            sbOooO0O0.append(this.mPosition);
            sbOooO0O0.append(" id=");
            sbOooO0O0.append(this.mItemId);
            sbOooO0O0.append(", oldPos=");
            sbOooO0O0.append(this.mOldPosition);
            sbOooO0O0.append(", pLpos:");
            sbOooO0O0.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbOooO0O0.toString());
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
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
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
            this.mScrapContainer.OooOOO(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static abstract class o0OO00O {
    }

    public static class o0OOO0o {

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7678OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f7679OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public long f7680OooOOO0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7668OooO00o = -1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7669OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7670OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7671OooO0Oo = 1;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7673OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7672OooO0o = false;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f7674OooO0oO = false;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7675OooO0oo = false;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f7667OooO = false;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f7676OooOO0 = false;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f7677OooOO0O = false;

        public final void OooO00o(int i) {
            if ((this.f7671OooO0Oo & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f7671OooO0Oo));
        }

        public final int OooO0O0() {
            return this.f7674OooO0oO ? this.f7669OooO0O0 - this.f7670OooO0OO : this.f7673OooO0o0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f7668OooO00o);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.f7673OooO0o0);
            sb.append(", mIsMeasuring=");
            sb.append(this.f7667OooO);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f7669OooO0O0);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f7670OooO0OO);
            sb.append(", mStructureChanged=");
            sb.append(this.f7672OooO0o);
            sb.append(", mInPreLayout=");
            sb.append(this.f7674OooO0oO);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f7676OooOO0);
            sb.append(", mRunPredictiveAnimations=");
            return androidx.compose.animation.OooO0o.OooO00o(sb, this.f7677OooOO0O, '}');
        }
    }

    public static class o0Oo0oo extends EdgeEffectFactory {
    }

    public interface o0OoOo0 {
        void OooO00o(boolean z);

        void OooO0O0(@NonNull MotionEvent motionEvent);

        boolean OooO0OO(@NonNull MotionEvent motionEvent);
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
            public int f7684OooO0Oo = -1;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f7685OooO0o = false;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f7687OooO0oO = 0;

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int f7681OooO00o = 0;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int f7682OooO0O0 = 0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f7683OooO0OO = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Interpolator f7686OooO0o0 = null;

            public final void OooO00o(RecyclerView recyclerView) {
                int i = this.f7684OooO0Oo;
                if (i >= 0) {
                    this.f7684OooO0Oo = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f7685OooO0o = false;
                    return;
                }
                if (!this.f7685OooO0o) {
                    this.f7687OooO0oO = 0;
                    return;
                }
                Interpolator interpolator = this.f7686OooO0o0;
                if (interpolator != null && this.f7683OooO0OO < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f7683OooO0OO;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.OooO0OO(this.f7681OooO00o, this.f7682OooO0O0, interpolator, i2);
                int i3 = this.f7687OooO0oO + 1;
                this.f7687OooO0oO = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f7685OooO0o = false;
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
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + OooO0O0.class.getCanonicalName());
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
                if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
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
                boolean z = oooO00o.f7684OooO0Oo >= 0;
                oooO00o.OooO00o(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.OooO0O0();
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
            oo0o0Oo oo0o0oo = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(oo0o0oo);
            oo0o0oo.f7690OooO0o.abortAnimation();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oooo000;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f7668OooO00o = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.OooO0O0();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f7668OooO00o = -1;
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

    public class oo0o0Oo implements Runnable {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f7688OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7689OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OverScroller f7690OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7691OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Interpolator f7692OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f7693OooO0oo;

        public oo0o0Oo() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f7692OooO0oO = interpolator;
            this.f7693OooO0oo = false;
            this.f7688OooO = false;
            this.f7690OooO0o = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void OooO00o(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f7691OooO0o0 = 0;
            this.f7689OooO0Oo = 0;
            Interpolator interpolator = this.f7692OooO0oO;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f7692OooO0oO = interpolator2;
                this.f7690OooO0o = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f7690OooO0o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            OooO0O0();
        }

        public final void OooO0O0() {
            if (this.f7693OooO0oo) {
                this.f7688OooO = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOOO0(recyclerView, this);
        }

        public final void OooO0OO(int i, int i2, @Nullable Interpolator interpolator, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
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
            if (this.f7692OooO0oO != interpolator) {
                this.f7692OooO0oO = interpolator;
                this.f7690OooO0o = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f7691OooO0o0 = 0;
            this.f7689OooO0Oo = 0;
            recyclerView.setScrollState(2);
            this.f7690OooO0o.startScroll(0, 0, i, i2, i4);
            OooO0O0();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f7690OooO0o.abortAnimation();
                return;
            }
            this.f7688OooO = false;
            this.f7693OooO0oo = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f7690OooO0o;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f7689OooO0Oo;
                int i7 = currY - this.f7691OooO0o0;
                this.f7689OooO0Oo = currX;
                this.f7691OooO0o0 = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i6);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i7);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    int i10 = iConsumeFlingInHorizontalStretch - i8;
                    int i11 = iConsumeFlingInVerticalStretch - i9;
                    o0ooOOo o0ooooo = recyclerView.mLayout.mSmoothScroller;
                    if (o0ooooo != null && !o0ooooo.isPendingInitialRun() && o0ooooo.isRunning()) {
                        int iOooO0O0 = recyclerView.mState.OooO0O0();
                        if (iOooO0O0 == 0) {
                            o0ooooo.stop();
                        } else if (o0ooooo.getTargetPosition() >= iOooO0O0) {
                            o0ooooo.setTargetPosition(iOooO0O0 - 1);
                            o0ooooo.onAnimation(i8, i9);
                        } else {
                            o0ooooo.onAnimation(i8, i9);
                        }
                    }
                    i3 = i9;
                    i4 = i8;
                    i = i10;
                    i2 = i11;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i2 = iConsumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i12 = i - iArr6[0];
                int i13 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    recyclerView.dispatchOnScrolled(i4, i3);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                o0ooOOo o0ooooo2 = recyclerView.mLayout.mSmoothScroller;
                if ((o0ooooo2 != null && o0ooooo2.isPendingInitialRun()) || !z) {
                    OooO0O0();
                    androidx.recyclerview.widget.o000oOoO o000oooo2 = recyclerView.mGapWorker;
                    if (o000oooo2 != null) {
                        o000oooo2.OooO00o(recyclerView, i4, i3);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i5, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.o000oOoO.OooO0O0 oooO0O0 = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = oooO0O0.f7792OooO0OO;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        oooO0O0.f7793OooO0Oo = 0;
                    }
                }
            }
            o0ooOOo o0ooooo3 = recyclerView.mLayout.mSmoothScroller;
            if (o0ooooo3 != null && o0ooooo3.isPendingInitialRun()) {
                o0ooooo3.onAnimation(0, 0);
            }
            this.f7693OooO0oo = false;
            if (!this.f7688OooO) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOO0(recyclerView, this);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new OooO0OO();
        sDefaultEdgeEffectFactory = new o0Oo0oo();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(o0O0O00 o0o0o00) {
        View view = o0o0o00.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.OooOOO(getChildViewHolder(view));
        if (o0o0o00.isTmpDetached()) {
            this.mChildHelper.OooO0O0(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.mChildHelper.OooO00o(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            oooO0o.f7508OooO0O0.OooO0oo(iIndexOfChild);
            oooO0o.OooO(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull o0O0O00 o0o0o00, @NonNull o0O0O00 o0o0o01, @NonNull ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2, boolean z, boolean z2) {
        o0o0o00.setIsRecyclable(false);
        if (z) {
            addAnimatingView(o0o0o00);
        }
        if (o0o0o00 != o0o0o01) {
            if (z2) {
                addAnimatingView(o0o0o01);
            }
            o0o0o00.mShadowedHolder = o0o0o01;
            addAnimatingView(o0o0o00);
            this.mRecycler.OooOOO(o0o0o00);
            o0o0o01.setIsRecyclable(false);
            o0o0o01.mShadowingHolder = o0o0o00;
        }
        if (this.mItemAnimator.OooO0O0(o0o0o00, o0o0o01, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull o0O0O00 o0o0o00) {
        WeakReference<RecyclerView> weakReference = o0o0o00.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == o0o0o00.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            o0o0o00.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && androidx.core.widget.OooO.OooO00o(edgeEffect) != 0.0f) {
            int iRound = Math.round(androidx.core.widget.OooO.OooO0O0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || androidx.core.widget.OooO.OooO00o(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(androidx.core.widget.OooO.OooO0O0(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(Oooo000.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
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
        accessibilityEventObtain.setEventType(2048);
        o0000O.OooO0O0.OooO0O0(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.OooO00o(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f7667OooO = false;
        startInterceptRequestLayout();
        o00000OO o00000oo2 = this.mViewInfoStore;
        o00000oo2.f7771OooO00o.clear();
        o00000oo2.f7772OooO0O0.OooO0Oo();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f7675OooO0oo = o0ooo0o2.f7676OooOO0 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        o0ooo0o2.f7674OooO0oO = o0ooo0o2.f7677OooOO0O;
        o0ooo0o2.f7673OooO0o0 = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f7676OooOO0) {
            int iOooO0o0 = this.mChildHelper.OooO0o0();
            for (int i = 0; i < iOooO0o0; i++) {
                o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator itemAnimator = this.mItemAnimator;
                    ItemAnimator.OooO0o0(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo000 = this.mViewInfoStore.f7771OooO00o;
                    o00000OO.OooO00o orDefault = oooo000.getOrDefault(childViewHolderInt, null);
                    if (orDefault == null) {
                        orDefault = o00000OO.OooO00o.OooO00o();
                        oooo000.put(childViewHolderInt, orDefault);
                    }
                    orDefault.f7775OooO0O0 = oooO0OO;
                    orDefault.f7774OooO00o |= 4;
                    if (this.mState.f7675OooO0oo && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f7772OooO0O0.OooO(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f7677OooOO0O) {
            saveOldPositions();
            o0OOO0o o0ooo0o3 = this.mState;
            boolean z = o0ooo0o3.f7672OooO0o;
            o0ooo0o3.f7672OooO0o = false;
            this.mLayout.onLayoutChildren(this.mRecycler, o0ooo0o3);
            this.mState.f7672OooO0o = z;
            for (int i2 = 0; i2 < this.mChildHelper.OooO0o0(); i2++) {
                o0O0O00 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i2));
                if (!childViewHolderInt2.shouldIgnore()) {
                    o00000OO.OooO00o orDefault2 = this.mViewInfoStore.f7771OooO00o.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault2 == null || (orDefault2.f7774OooO00o & 4) == 0) ? false : true)) {
                        ItemAnimator.OooO0o0(childViewHolderInt2);
                        boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        ItemAnimator itemAnimator2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        itemAnimator2.getClass();
                        ItemAnimator.OooO0OO oooO0OO2 = new ItemAnimator.OooO0OO();
                        oooO0OO2.OooO00o(childViewHolderInt2);
                        if (zHasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, oooO0OO2);
                        } else {
                            p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo001 = this.mViewInfoStore.f7771OooO00o;
                            o00000OO.OooO00o orDefault3 = oooo001.getOrDefault(childViewHolderInt2, null);
                            if (orDefault3 == null) {
                                orDefault3 = o00000OO.OooO00o.OooO00o();
                                oooo001.put(childViewHolderInt2, orDefault3);
                            }
                            orDefault3.f7774OooO00o |= 2;
                            orDefault3.f7775OooO0O0 = oooO0OO2;
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
        this.mState.f7671OooO0Oo = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.OooO00o(6);
        this.mAdapterHelper.OooO0OO();
        this.mState.f7673OooO0o0 = this.mAdapter.getItemCount();
        this.mState.f7670OooO0OO = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f7650OooO0o;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f7674OooO0oO = false;
        this.mLayout.onLayoutChildren(this.mRecycler, o0ooo0o2);
        o0OOO0o o0ooo0o3 = this.mState;
        o0ooo0o3.f7672OooO0o = false;
        o0ooo0o3.f7676OooOO0 = o0ooo0o3.f7676OooOO0 && this.mItemAnimator != null;
        o0ooo0o3.f7671OooO0Oo = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.OooO00o(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        o0OOO0o o0ooo0o2 = this.mState;
        o0ooo0o2.f7671OooO0Oo = 1;
        if (o0ooo0o2.f7676OooOO0) {
            for (int iOooO0o0 = this.mChildHelper.OooO0o0() - 1; iOooO0o0 >= 0; iOooO0o0--) {
                o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(iOooO0o0));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    ItemAnimator.OooO0OO oooO0OO = new ItemAnimator.OooO0OO();
                    oooO0OO.OooO00o(childViewHolderInt);
                    o0O0O00 o0o0o00 = (o0O0O00) this.mViewInfoStore.f7772OooO0O0.OooO0oO(changedHolderKey, null);
                    if (o0o0o00 == null || o0o0o00.shouldIgnore()) {
                        this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                    } else {
                        o00000OO.OooO00o orDefault = this.mViewInfoStore.f7771OooO00o.getOrDefault(o0o0o00, null);
                        boolean z = (orDefault == null || (orDefault.f7774OooO00o & 1) == 0) ? false : true;
                        o00000OO.OooO00o orDefault2 = this.mViewInfoStore.f7771OooO00o.getOrDefault(childViewHolderInt, null);
                        boolean z2 = (orDefault2 == null || (orDefault2.f7774OooO00o & 1) == 0) ? false : true;
                        if (z && o0o0o00 == childViewHolderInt) {
                            this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                        } else {
                            ItemAnimator.OooO0OO oooO0OOOooO0O0 = this.mViewInfoStore.OooO0O0(o0o0o00, 4);
                            this.mViewInfoStore.OooO00o(childViewHolderInt, oooO0OO);
                            ItemAnimator.OooO0OO oooO0OOOooO0O1 = this.mViewInfoStore.OooO0O0(childViewHolderInt, 8);
                            if (oooO0OOOooO0O0 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, o0o0o00);
                            } else {
                                animateChange(o0o0o00, childViewHolderInt, oooO0OOOooO0O0, oooO0OOOooO0O1, z, z2);
                            }
                        }
                    }
                }
            }
            o00000OO o00000oo2 = this.mViewInfoStore;
            o00000OO.OooO0O0 oooO0O0 = this.mViewInfoProcessCallback;
            p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo000 = o00000oo2.f7771OooO00o;
            int i = oooo000.f38816OooO0o;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                o0O0O00 o0o0o00OooO0oo = oooo000.OooO0oo(i);
                o00000OO.OooO00o oooO00oOooOO0 = oooo000.OooOO0(i);
                int i2 = oooO00oOooOO0.f7774OooO00o;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(o0o0o00OooO0oo.itemView, recyclerView.mRecycler);
                } else if ((i2 & 1) != 0) {
                    ItemAnimator.OooO0OO oooO0OO2 = oooO00oOooOO0.f7775OooO0O0;
                    if (oooO0OO2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(o0o0o00OooO0oo.itemView, recyclerView2.mRecycler);
                    } else {
                        ItemAnimator.OooO0OO oooO0OO3 = oooO00oOooOO0.f7776OooO0OO;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mRecycler.OooOOO(o0o0o00OooO0oo);
                        recyclerView3.animateDisappearance(o0o0o00OooO0oo, oooO0OO2, oooO0OO3);
                    }
                } else if ((i2 & 14) == 14) {
                    RecyclerView.this.animateAppearance(o0o0o00OooO0oo, oooO00oOooOO0.f7775OooO0O0, oooO00oOooOO0.f7776OooO0OO);
                } else if ((i2 & 12) == 12) {
                    ItemAnimator.OooO0OO oooO0OO4 = oooO00oOooOO0.f7775OooO0O0;
                    ItemAnimator.OooO0OO oooO0OO5 = oooO00oOooOO0.f7776OooO0OO;
                    OooO0o oooO0o = (OooO0o) oooO0O0;
                    oooO0o.getClass();
                    o0o0o00OooO0oo.setIsRecyclable(false);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.OooO0O0(o0o0o00OooO0oo, o0o0o00OooO0oo, oooO0OO4, oooO0OO5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else if (recyclerView4.mItemAnimator.OooO0Oo(o0o0o00OooO0oo, oooO0OO4, oooO0OO5)) {
                        recyclerView4.postAnimationRunner();
                    }
                } else if ((i2 & 4) != 0) {
                    ItemAnimator.OooO0OO oooO0OO6 = oooO00oOooOO0.f7775OooO0O0;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    recyclerView5.mRecycler.OooOOO(o0o0o00OooO0oo);
                    recyclerView5.animateDisappearance(o0o0o00OooO0oo, oooO0OO6, null);
                } else if ((i2 & 8) != 0) {
                    RecyclerView.this.animateAppearance(o0o0o00OooO0oo, oooO00oOooOO0.f7775OooO0O0, oooO00oOooOO0.f7776OooO0OO);
                }
                oooO00oOooOO0.f7774OooO00o = 0;
                oooO00oOooOO0.f7775OooO0O0 = null;
                oooO00oOooOO0.f7776OooO0OO = null;
                o00000OO.OooO00o.f7773OooO0Oo.OooO00o(oooO00oOooOO0);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        o0OOO0o o0ooo0o3 = this.mState;
        o0ooo0o3.f7669OooO0O0 = o0ooo0o3.f7673OooO0o0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        o0ooo0o3.f7676OooOO0 = false;
        o0ooo0o3.f7677OooOO0O = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<o0O0O00> arrayList = this.mRecycler.f7659OooO0O0;
        if (arrayList != null) {
            arrayList.clear();
        }
        Oooo000 oooo001 = this.mLayout;
        if (oooo001.mPrefetchMaxObservedInInitialPrefetch) {
            oooo001.mPrefetchMaxCountObserved = 0;
            oooo001.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.OooOOOO();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        o00000OO o00000oo3 = this.mViewInfoStore;
        o00000oo3.f7771OooO00o.clear();
        o00000oo3.f7772OooO0O0.OooO0Oo();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        o0OoOo0 o0oooo0 = this.mInterceptingOnItemTouchListener;
        if (o0oooo0 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        o0oooo0.OooO0O0(motionEvent);
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
            o0OoOo0 o0oooo0 = this.mOnItemTouchListeners.get(i);
            if (o0oooo0.OooO0OO(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = o0oooo0;
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
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i3));
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
        o0O0O00 o0o0o00FindViewHolderForAdapterPosition;
        o0OOO0o o0ooo0o2 = this.mState;
        int i = o0ooo0o2.f7678OooOO0o;
        if (i == -1) {
            i = 0;
        }
        int iOooO0O0 = o0ooo0o2.OooO0O0();
        for (int i2 = i; i2 < iOooO0O0; i2++) {
            o0O0O00 o0o0o00FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (o0o0o00FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (o0o0o00FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return o0o0o00FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iOooO0O0, i);
        do {
            iMin--;
            if (iMin < 0 || (o0o0o00FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!o0o0o00FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return o0o0o00FindViewHolderForAdapterPosition.itemView;
    }

    public static o0O0O00 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f7633OooO0Oo;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f7635OooO0o0;
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

    private androidx.core.view.o0OO00O getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.o0OO00O(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    private void handleMissingPreInfoForChangeError(long j, o0O0O00 o0o0o00, o0O0O00 o0o0o01) {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != o0o0o00 && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(o0o0o00);
                    throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(o0o0o00);
                throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + o0o0o01 + " cannot be found but it is necessary for " + o0o0o00 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0Oo(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, sb));
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
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i3);
        androidx.recyclerview.widget.o000oOoO o000oooo2 = this.mGapWorker;
        if (o000oooo2 != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            o000oooo2.OooO00o(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
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
            oooO00o.OooOO0o(oooO00o.f7492OooO0O0);
            oooO00o.OooOO0o(oooO00o.f7493OooO0OO);
            oooO00o.f7495OooO0o = 0;
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
        this.mState.f7676OooOO0 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        o0OOO0o o0ooo0o2 = this.mState;
        if (o0ooo0o2.f7676OooOO0 && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        o0ooo0o2.f7677OooOO0O = z2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 >= 0.0f) {
            if (f2 > 0.0f) {
                ensureRightGlow();
                androidx.core.widget.OooO.OooO0O0(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
            } else {
                z = false;
            }
            if (f4 < 0.0f) {
                ensureTopGlow();
                androidx.core.widget.OooO.OooO0O0(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                ensureBottomGlow();
                androidx.core.widget.OooO.OooO0O0(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
        ensureLeftGlow();
        androidx.core.widget.OooO.OooO0O0(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        z = true;
        if (f4 < 0.0f) {
            ensureTopGlow();
            androidx.core.widget.OooO.OooO0O0(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            androidx.core.widget.OooO.OooO0O0(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
        } else {
            z2 = z;
        }
        if (z2) {
        }
        WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
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
        o0O0O00 o0o0o00FindViewHolderForItemId = (this.mState.f7680OooOOO0 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f7680OooOOO0);
        if (o0o0o00FindViewHolderForItemId != null && !this.mChildHelper.OooOO0O(o0o0o00FindViewHolderForItemId.itemView) && o0o0o00FindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = o0o0o00FindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.OooO0o0() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f7679OooOOO;
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.OooO.OooO00o(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.OooO.OooO00o(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fOooO0O0 = androidx.core.widget.OooO.OooO0O0(this.mRightGlow, width, height);
                    if (androidx.core.widget.OooO.OooO00o(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fOooO0O0;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.OooO.OooO0O0(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.OooO.OooO00o(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.OooO.OooO00o(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.OooO.OooO00o(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fOooO0O0 = androidx.core.widget.OooO.OooO0O0(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.OooO.OooO00o(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fOooO0O0;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -androidx.core.widget.OooO.OooO0O0(this.mTopGlow, -height, width);
                if (androidx.core.widget.OooO.OooO00o(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f7634OooO0o) {
                Rect rect = this.mTempRect;
                int i = rect.left;
                Rect rect2 = layoutParams2.f7635OooO0o0;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
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
        o0ooo0o2.f7680OooOOO0 = -1L;
        o0ooo0o2.f7678OooOO0o = -1;
        o0ooo0o2.f7679OooOOO = -1;
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
        o0O0O00 o0o0o00FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (o0o0o00FindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f7680OooOOO0 = this.mAdapter.hasStableIds() ? o0o0o00FindContainingViewHolder.getItemId() : -1L;
        o0OOO0o o0ooo0o2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = o0o0o00FindContainingViewHolder.isRemoved() ? o0o0o00FindContainingViewHolder.mOldPosition : o0o0o00FindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        o0ooo0o2.f7678OooOO0o = absoluteAdapterPosition;
        this.mState.f7679OooOOO = getDeepestFocusedViewWithId(o0o0o00FindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        oooO00o.OooOO0o(oooO00o.f7492OooO0O0);
        oooO00o.OooOO0o(oooO00o.f7493OooO0OO);
        int i = 0;
        oooO00o.f7495OooO0o = 0;
        Adapter<?> adapter3 = this.mAdapter;
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
        o00ooo2.f7658OooO00o.clear();
        o00ooo2.OooO0oo();
        o00ooo2.OooO0oO(adapter3, true);
        o00Oo0 o00oo0OooO0OO = o00ooo2.OooO0OO();
        if (adapter3 != null) {
            o00oo0OooO0OO.f7652OooO0O0--;
        }
        if (!z && o00oo0OooO0OO.f7652OooO0O0 == 0) {
            while (true) {
                SparseArray<o00Oo0.OooO00o> sparseArray = o00oo0OooO0OO.f7651OooO00o;
                if (i >= sparseArray.size()) {
                    break;
                }
                o00Oo0.OooO00o oooO00oValueAt = sparseArray.valueAt(i);
                Iterator<o0O0O00> it = oooO00oValueAt.f7654OooO00o.iterator();
                while (it.hasNext()) {
                    p054o0000OOo.OooO0o.OooO00o(it.next().itemView);
                }
                oooO00oValueAt.f7654OooO00o.clear();
                i++;
            }
        }
        if (adapter4 != null) {
            o00oo0OooO0OO.f7652OooO0O0++;
        } else {
            o00oo0OooO0OO.getClass();
        }
        o00ooo2.OooO0o();
        this.mState.f7672OooO0o = true;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < androidx.core.widget.OooO.OooO00o(edgeEffect) * ((float) i2);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.OooO.OooO00o(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            androidx.core.widget.OooO.OooO0O0(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.OooO.OooO00o(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.OooO.OooO0O0(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.OooO.OooO00o(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.OooO.OooO0O0(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.OooO.OooO00o(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        androidx.core.widget.OooO.OooO0O0(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        oo0o0Oo oo0o0oo = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(oo0o0oo);
        oo0o0oo.f7690OooO0o.abortAnimation();
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
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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

    public void addOnItemTouchListener(@NonNull o0OoOo0 o0oooo0) {
        this.mOnItemTouchListeners.add(o0oooo0);
    }

    public void addOnScrollListener(@NonNull o00O0O o00o0o2) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(o00o0o2);
    }

    public void addRecyclerListener(@NonNull oo000o oo000oVar) {
        o000OO.OooOOO0.OooO0O0(oo000oVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(oo000oVar);
    }

    public void animateAppearance(@NonNull o0O0O00 o0o0o00, @Nullable ItemAnimator.OooO0OO oooO0OO, @NonNull ItemAnimator.OooO0OO oooO0OO2) {
        o0o0o00.setIsRecyclable(false);
        if (this.mItemAnimator.OooO00o(o0o0o00, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull o0O0O00 o0o0o00, @NonNull ItemAnimator.OooO0OO oooO0OO, @Nullable ItemAnimator.OooO0OO oooO0OO2) {
        addAnimatingView(o0o0o00);
        o0o0o00.setIsRecyclable(false);
        if (this.mItemAnimator.OooO0OO(o0o0o00, oooO0OO, oooO0OO2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, o00OO.OooO00o(str)));
        }
        throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(o0O0O00 o0o0o00) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.OooO0oO(o0o0o00, o0o0o00.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).clearOldPosition();
        }
        ArrayList<o0O0O00> arrayList2 = o00ooo2.f7658OooO00o;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.get(i3).clearOldPosition();
        }
        ArrayList<o0O0O00> arrayList3 = o00ooo2.f7659OooO0O0;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o00ooo2.f7659OooO0O0.get(i4).clearOldPosition();
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = p063o0000oO.o00000O0.f34291OooO00o;
            o0000oO.o00000O0.OooO00o.OooO00o(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            o0000oO.o00000O0.OooO00o.OooO0O0();
            return;
        }
        if (this.mAdapterHelper.OooO0oO()) {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            int i2 = oooO00o.f7495OooO0o;
            if ((4 & i2) != 0) {
                if (!((i2 & 11) != 0)) {
                    int i3 = p063o0000oO.o00000O0.f34291OooO00o;
                    o0000oO.o00000O0.OooO00o.OooO00o(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
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
                    o0000oO.o00000O0.OooO00o.OooO0O0();
                    return;
                }
            }
            if (oooO00o.OooO0oO()) {
                int i4 = p063o0000oO.o00000O0.f34291OooO00o;
                o0000oO.o00000O0.OooO00o.OooO00o(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                o0000oO.o00000O0.OooO00o.OooO0O0();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        setMeasuredDimension(Oooo000.chooseSize(i, paddingRight, ViewCompat.OooO0o.OooO0o0(this)), Oooo000.chooseSize(i2, getPaddingBottom() + getPaddingTop(), ViewCompat.OooO0o.OooO0Oo(this)));
    }

    public void dispatchChildAttached(View view) {
        o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
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
        o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
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
        this.mState.f7667OooO = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f7671OooO0Oo == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
            if (!oooO00o.f7493OooO0OO.isEmpty() && !oooO00o.f7492OooO0O0.isEmpty()) {
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
        return getScrollingChildHelper().OooO0OO(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO0o0(i, i2, i3, i4, iArr);
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
            o0O0O00 o0o0o00 = this.mPendingAccessibilityImportanceChange.get(size);
            if (o0o0o00.itemView.getParent() == this && !o0o0o00.shouldIgnore() && (i = o0o0o00.mPendingAccessibilityState) != -1) {
                View view = o0o0o00.itemView;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOoo(view, i);
                o0o0o00.mPendingAccessibilityState = -1;
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
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
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
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        ((o0Oo0oo) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((o0Oo0oo) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((o0Oo0oo) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((o0Oo0oo) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return ZegoConstants.ZegoVideoDataAuxPublishingStream + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(o0OOO0o o0ooo0o2) {
        if (getScrollState() != 2) {
            o0ooo0o2.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f7690OooO0o;
        overScroller.getFinalX();
        overScroller.getCurrX();
        o0ooo0o2.getClass();
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
    public o0O0O00 findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public o0O0O00 findViewHolderForAdapterPosition(int i) {
        o0O0O00 o0o0o00 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                o0o0o00 = childViewHolderInt;
            }
        }
        return o0o0o00;
    }

    public o0O0O00 findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        o0O0O00 o0o0o00 = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iOooO0oo = this.mChildHelper.OooO0oo();
            for (int i = 0; i < iOooO0oo; i++) {
                o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    o0o0o00 = childViewHolderInt;
                }
            }
        }
        return o0o0o00;
    }

    @Nullable
    public o0O0O00 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Nullable
    @Deprecated
    public o0O0O00 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
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
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || androidx.core.widget.OooO.OooO00o(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || androidx.core.widget.OooO.OooO00o(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                    this.mRightGlow.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
            }
            iMax = i;
            i = 0;
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || androidx.core.widget.OooO.OooO00o(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || androidx.core.widget.OooO.OooO00o(edgeEffect4) == 0.0f) {
                    i3 = i2;
                    i2 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                    this.mBottomGlow.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
            }
            i3 = 0;
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.OooO00o(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            o000oOoO o000oooo2 = this.mOnFlingListener;
            if (o000oooo2 != null && o000oooo2.onFling(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.OooO00o(iMax2, Math.max(-i9, Math.min(i3, i9)));
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
        throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            return oooo000.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(o0O0O00 o0o0o00) {
        if (o0o0o00.hasAnyOfTheFlags(524) || !o0o0o00.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.OooO00o oooO00o = this.mAdapterHelper;
        int i = o0o0o00.mPosition;
        ArrayList<androidx.recyclerview.widget.OooO00o.OooO0O0> arrayList = oooO00o.f7492OooO0O0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.OooO00o.OooO0O0 oooO0O0 = arrayList.get(i2);
            int i3 = oooO0O0.f7497OooO00o;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = oooO0O0.f7498OooO0O0;
                    if (i4 <= i) {
                        int i5 = oooO0O0.f7500OooO0Oo;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = oooO0O0.f7498OooO0O0;
                    if (i6 == i) {
                        i = oooO0O0.f7500OooO0Oo;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (oooO0O0.f7500OooO0Oo <= i) {
                            i++;
                        }
                    }
                }
            } else if (oooO0O0.f7498OooO0O0 <= i) {
                i += oooO0O0.f7500OooO0Oo;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        Oooo000 oooo000 = this.mLayout;
        return oooo000 != null ? oooo000.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(o0O0O00 o0o0o00) {
        return this.mAdapter.hasStableIds() ? o0o0o00.getItemId() : o0o0o00.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        o0O0O00 childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public o0O0O00 getChildViewHolder(@NonNull View view) {
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
        boolean z = layoutParams.f7634OooO0o;
        Rect rect = layoutParams.f7635OooO0o0;
        if (!z) {
            return rect;
        }
        if (this.mState.f7674OooO0oO && (layoutParams.OooO0O0() || layoutParams.f7633OooO0Oo.isInvalid())) {
            return rect;
        }
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
        layoutParams.f7634OooO0o = false;
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
        return this.mRecycler.OooO0OO();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().OooO0oo(0);
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
            throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.Oooo0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(o000OO0O.OooO0O0.fastscroll_default_thickness), resources.getDimensionPixelSize(o000OO0O.OooO0O0.fastscroll_minimum_range), resources.getDimensionPixelOffset(o000OO0O.OooO0O0.fastscroll_margin));
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
        return getScrollingChildHelper().f5447OooO0Oo;
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
            ((LayoutParams) this.mChildHelper.OooO0oO(i).getLayoutParams()).f7634OooO0o = true;
        }
        ArrayList<o0O0O00> arrayList = this.mRecycler.f7660OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) arrayList.get(i2).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f7634OooO0o = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i = 0; i < iOooO0oo; i++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        o00Ooo o00ooo2 = this.mRecycler;
        ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0O0O00 o0o0o00 = arrayList.get(i2);
            if (o0o0o00 != null) {
                o0o0o00.addFlags(6);
                o0o0o00.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            o00ooo2.OooO0oo();
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
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f7672OooO0o = true;
            }
        }
        ArrayList<o0O0O00> arrayList = this.mRecycler.f7660OooO0OO;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o0O0O00 o0o0o00 = arrayList.get(i4);
            if (o0o0o00 != null && o0o0o00.mPosition >= i) {
                o0o0o00.offsetPosition(i2, false);
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
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f7672OooO0o = true;
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        o00ooo2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o0O0O00 o0o0o00 = arrayList.get(i12);
            if (o0o0o00 != null && (i8 = o0o0o00.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    o0o0o00.offsetPosition(i2 - i, false);
                } else {
                    o0o0o00.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iOooO0oo = this.mChildHelper.OooO0oo();
        for (int i4 = 0; i4 < iOooO0oo; i4++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f7672OooO0o = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f7672OooO0o = true;
                }
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            o0O0O00 o0o0o00 = arrayList.get(size);
            if (o0o0o00 != null) {
                int i6 = o0o0o00.mPosition;
                if (i6 >= i3) {
                    o0o0o00.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    o0o0o00.addFlags(8);
                    o00ooo2.OooO(size);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.OooO0o();
        Oooo000 oooo000 = this.mLayout;
        if (oooo000 != null) {
            oooo000.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.o000oOoO> threadLocal = androidx.recyclerview.widget.o000oOoO.f7785OooO0oo;
            androidx.recyclerview.widget.o000oOoO o000oooo2 = threadLocal.get();
            this.mGapWorker = o000oooo2;
            if (o000oooo2 == null) {
                this.mGapWorker = new androidx.recyclerview.widget.o000oOoO();
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                Display displayOooO0O0 = ViewCompat.OooO.OooO0O0(this);
                if (isInEditMode() || displayOooO0O0 == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayOooO0O0.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.o000oOoO o000oooo3 = this.mGapWorker;
                o000oooo3.f7787OooO0o = (long) (1.0E9f / refreshRate);
                threadLocal.set(o000oooo3);
            }
            this.mGapWorker.f7786OooO0Oo.add(this);
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
        this.mViewInfoStore.getClass();
        while (o00000OO.OooO00o.f7773OooO0Oo.OooO0O0() != null) {
        }
        o00Ooo o00ooo2 = this.mRecycler;
        int i = 0;
        while (true) {
            ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
            if (i >= arrayList.size()) {
                break;
            }
            p054o0000OOo.OooO0o.OooO00o(arrayList.get(i).itemView);
            i++;
        }
        o00ooo2.OooO0oO(RecyclerView.this.mAdapter, false);
        int i2 = p054o0000OOo.OooO0o.f34137OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(this, "<this>");
        int i3 = 0;
        while (true) {
            if (!(i3 < getChildCount())) {
                if (!ALLOW_THREAD_GAP_WORK || (o000oooo2 = this.mGapWorker) == null) {
                    return;
                }
                o000oooo2.f7786OooO0Oo.remove(this);
                this.mGapWorker = null;
                return;
            }
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList<p054o0000OOo.OooO> arrayList2 = p054o0000OOo.OooO0o.OooO0O0(childAt).f34139OooO00o;
            for (int lastIndex = CollectionsKt.getLastIndex(arrayList2); -1 < lastIndex; lastIndex--) {
                arrayList2.get(lastIndex).onRelease();
            }
            i3 = i4;
        }
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

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & Configuration.BLOCK_SIZE) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
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
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
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
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
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
        int i5 = p063o0000oO.o00000O0.f34291OooO00o;
        o0000oO.o00000O0.OooO00o.OooO00o(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        o0000oO.o00000O0.OooO00o.OooO0O0();
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
            if (this.mState.f7671OooO0Oo == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f7667OooO = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Pow2.MAX_POW2));
                this.mState.f7667OooO = true;
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
            if (o0ooo0o2.f7677OooOO0O) {
                o0ooo0o2.f7674OooO0oO = true;
            } else {
                this.mAdapterHelper.OooO0OO();
                this.mState.f7674OooO0oO = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f7677OooOO0O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.f7673OooO0o0 = adapter.getItemCount();
        } else {
            this.mState.f7673OooO0o0 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f7674OooO0oO = false;
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
        super.onRestoreInstanceState(savedState.f5532OooO0Oo);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f7650OooO0o = savedState2.f7650OooO0o;
        } else {
            Oooo000 oooo000 = this.mLayout;
            if (oooo000 != null) {
                savedState.f7650OooO0o = oooo000.onSaveInstanceState();
            } else {
                savedState.f7650OooO0o = null;
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

    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[PHI: r0
      0x00dc: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
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
            float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
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
            if (this.mScrollState == 1) {
                int[] iArr3 = this.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                    int[] iArr4 = this.mReusableIntPair;
                    iReleaseHorizontalGlow -= iArr4[0];
                    iReleaseVerticalGlow -= iArr4[1];
                    int[] iArr5 = this.mNestedOffsets;
                    int i2 = iArr5[0];
                    int[] iArr6 = this.mScrollOffset;
                    iArr5[0] = i2 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i3 = iReleaseVerticalGlow;
                int[] iArr7 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr7[0];
                this.mLastTouchY = y2 - iArr7[1];
                if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? i3 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.o000oOoO o000oooo2 = this.mGapWorker;
                if (o000oooo2 != null && (iReleaseHorizontalGlow != 0 || i3 != 0)) {
                    o000oooo2.OooO00o(this, iReleaseHorizontalGlow, i3);
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
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOO0(this, runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(o0O0O00 o0o0o00, ItemAnimator.OooO0OO oooO0OO) {
        o0o0o00.setFlags(0, 8192);
        if (this.mState.f7675OooO0oo && o0o0o00.isUpdated() && !o0o0o00.isRemoved() && !o0o0o00.shouldIgnore()) {
            this.mViewInfoStore.f7772OooO0O0.OooO(getChangedHolderKey(o0o0o00), o0o0o00);
        }
        p188o00o0O.Oooo000<o0O0O00, o00000OO.OooO00o> oooo000 = this.mViewInfoStore.f7771OooO00o;
        o00000OO.OooO00o orDefault = oooo000.getOrDefault(o0o0o00, null);
        if (orDefault == null) {
            orDefault = o00000OO.OooO00o.OooO00o();
            oooo000.put(o0o0o00, orDefault);
        }
        orDefault.f7775OooO0O0 = oooO0OO;
        orDefault.f7774OooO00o |= 4;
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
        o00Ooo o00ooo2 = this.mRecycler;
        o00ooo2.f7658OooO00o.clear();
        o00ooo2.OooO0oo();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public boolean removeAnimatingView(View view) {
        boolean z;
        startInterceptRequestLayout();
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        OooO oooO = (OooO) oooO0o.f7507OooO00o;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild != -1) {
            androidx.recyclerview.widget.OooO0o.OooO00o oooO00o = oooO0o.f7508OooO0O0;
            if (oooO00o.OooO0Oo(iIndexOfChild)) {
                oooO00o.OooO0o(iIndexOfChild);
                oooO0o.OooOOO0(view);
                oooO.OooO0O0(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
                this.mRecycler.OooOOO(childViewHolderInt);
                this.mRecycler.OooOO0O(childViewHolderInt);
            }
            stopInterceptRequestLayout(!z);
            return z;
        }
        oooO0o.OooOOO0(view);
        z = true;
        if (z) {
            o0O0O00 childViewHolderInt2 = getChildViewHolderInt(view);
            this.mRecycler.OooOOO(childViewHolderInt2);
            this.mRecycler.OooOO0O(childViewHolderInt2);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, sb));
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

    public void removeOnItemTouchListener(@NonNull o0OoOo0 o0oooo0) {
        this.mOnItemTouchListeners.remove(o0oooo0);
        if (this.mInterceptingOnItemTouchListener == o0oooo0) {
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
        o0O0O00 o0o0o00;
        int iOooO0o0 = this.mChildHelper.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            View viewOooO0Oo = this.mChildHelper.OooO0Oo(i);
            o0O0O00 childViewHolder = getChildViewHolder(viewOooO0Oo);
            if (childViewHolder != null && (o0o0o00 = childViewHolder.mShadowingHolder) != null) {
                View view = o0o0o00.itemView;
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
            this.mOnItemTouchListeners.get(i).OooO00o(z);
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
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i));
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
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
                }
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
        int i3 = p063o0000oO.o00000O0.f34291OooO00o;
        o0000oO.o00000O0.OooO00o.OooO00o(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        o0000oO.o00000O0.OooO00o.OooO0O0();
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
        ViewCompat.OooOOOO(this, o000000Var);
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
    public boolean setChildImportantForAccessibilityInternal(o0O0O00 o0o0o00, int i) {
        if (isComputingLayout()) {
            o0o0o00.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(o0o0o00);
            return false;
        }
        View view = o0o0o00.itemView;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
        edgeEffectFactory.getClass();
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
            this.mItemAnimator.f7625OooO00o = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f7625OooO00o = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        o00Ooo o00ooo2 = this.mRecycler;
        o00ooo2.f7663OooO0o0 = i;
        o00ooo2.OooOOOO();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable Oooo000 oooo000) {
        androidx.recyclerview.widget.OooO0o.OooO0O0 oooO0O0;
        RecyclerView recyclerView;
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
            o00Ooo o00ooo2 = this.mRecycler;
            o00ooo2.f7658OooO00o.clear();
            o00ooo2.OooO0oo();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            o00Ooo o00ooo3 = this.mRecycler;
            o00ooo3.f7658OooO00o.clear();
            o00ooo3.OooO0oo();
        }
        androidx.recyclerview.widget.OooO0o oooO0o = this.mChildHelper;
        oooO0o.f7508OooO0O0.OooO0oO();
        ArrayList arrayList = oooO0o.f7509OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            oooO0O0 = oooO0o.f7507OooO00o;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            OooO oooO = (OooO) oooO0O0;
            oooO.getClass();
            o0O0O00 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            arrayList.remove(size);
        }
        OooO oooO2 = (OooO) oooO0O0;
        int iOooO00o = oooO2.OooO00o();
        int i = 0;
        while (true) {
            recyclerView = RecyclerView.this;
            if (i >= iOooO00o) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.mLayout = oooo000;
        if (oooo000 != null) {
            if (oooo000.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oooo000);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.compose.foundation.layout.OooO00o.OooO0O0(oooo000.mRecyclerView, sb));
            }
            oooo000.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.OooOOOO();
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
        getScrollingChildHelper().OooO(z);
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
        RecyclerView recyclerView = RecyclerView.this;
        o00ooo2.OooO0oO(recyclerView.mAdapter, false);
        o00Oo0 o00oo2 = o00ooo2.f7664OooO0oO;
        if (o00oo2 != null) {
            o00oo2.f7652OooO0O0--;
        }
        o00ooo2.f7664OooO0oO = o00oo1;
        if (o00oo1 != null && recyclerView.getAdapter() != null) {
            o00ooo2.f7664OooO0oO.f7652OooO0O0++;
        }
        o00ooo2.OooO0o();
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

    public void setViewCacheExtension(@Nullable o0OO00O o0oo00o2) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iOooO00o = accessibilityEvent != null ? o0000O.OooO0O0.OooO00o(accessibilityEvent) : 0;
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
        return getScrollingChildHelper().OooOO0(i, 0);
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
        getScrollingChildHelper().OooOO0O(0);
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
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
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
            o0O0O00 childViewHolderInt = getChildViewHolderInt(viewOooO0oO);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) viewOooO0oO.getLayoutParams()).f7634OooO0o = true;
            }
        }
        o00Ooo o00ooo2 = this.mRecycler;
        ArrayList<o0O0O00> arrayList = o00ooo2.f7660OooO0OO;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            o0O0O00 o0o0o00 = arrayList.get(size);
            if (o0o0o00 != null && (i3 = o0o0o00.mPosition) >= i && i3 < i5) {
                o0o0o00.addFlags(2);
                o00ooo2.OooO(size);
            }
        }
    }

    public static abstract class Adapter<VH extends o0O0O00> {
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
                int i2 = p063o0000oO.o00000O0.f34291OooO00o;
                o0000oO.o00000O0.OooO00o.OooO00o(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f7634OooO0o = true;
                }
                int i3 = p063o0000oO.o00000O0.f34291OooO00o;
                o0000oO.o00000O0.OooO00o.OooO0O0();
            }
        }

        public boolean canRestoreState() {
            int i = OooOO0O.f7642OooO00o[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                int i2 = p063o0000oO.o00000O0.f34291OooO00o;
                o0000oO.o00000O0.OooO00o.OooO00o(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                o0000oO.o00000O0.OooO00o.OooO0O0();
                return vh;
            } catch (Throwable th) {
                int i3 = p063o0000oO.o00000O0.f34291OooO00o;
                o0000oO.o00000O0.OooO00o.OooO0O0();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends o0O0O00> adapter, @NonNull o0O0O00 o0o0o00, int i) {
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
        this(context, attributeSet, o000OO0O.OooO00o.recyclerViewStyle);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().OooO0o(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public o0O0O00 findViewHolderForPosition(int i, boolean z) {
        int iOooO0oo = this.mChildHelper.OooO0oo();
        o0O0O00 o0o0o00 = null;
        for (int i2 = 0; i2 < iOooO0oo; i2++) {
            o0O0O00 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.OooO0oO(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        if (this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        o0o0o00 = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                } else {
                    if (this.mChildHelper.OooOO0O(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    o0o0o00 = childViewHolderInt;
                }
            }
        }
        return o0o0o00;
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
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.OooOO0();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new oo0o0Oo();
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
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = o0000OO0.f5420OooO00o;
            fOooO00o = o0000OO0.OooO00o.OooO00o(viewConfiguration);
        } else {
            fOooO00o = o0000OO0.OooO00o(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fOooO00o;
        if (i2 >= 26) {
            fOooO00o2 = o0000OO0.OooO00o.OooO0O0(viewConfiguration);
        } else {
            fOooO00o2 = o0000OO0.OooO00o(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fOooO00o2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f7625OooO00o = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (ViewCompat.OooO0o.OooO0OO(this) == 0) {
            ViewCompat.OooO0o.OooOOoo(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new o000000(this));
        int[] iArr = o000OO0O.OooO0o.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(o000OO0O.OooO0o.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(o000OO0O.OooO0o.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(o000OO0O.OooO0o.RecyclerView_android_clipToPadding, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o000OO0O.OooO0o.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(o000OO0O.OooO0o.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(o000OO0O.OooO0o.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(o000OO0O.OooO0o.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(o000OO0O.OooO0o.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.OooOOO(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        int i3 = p054o0000OOo.OooO0o.f34137OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(p054o0000OOo.OooO0o.f34138OooO0O0, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().OooO0OO(i, i2, iArr, iArr2, i3);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().OooO0oo(i);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().OooOO0(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().OooOO0O(i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0O0O00 f7633OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Rect f7635OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f7636OooO0oO;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7635OooO0o0 = new Rect();
            this.f7634OooO0o = true;
            this.f7636OooO0oO = false;
        }

        public final int OooO00o() {
            return this.f7633OooO0Oo.getLayoutPosition();
        }

        public final boolean OooO0O0() {
            return this.f7633OooO0Oo.isUpdated();
        }

        public final boolean OooO0OO() {
            return this.f7633OooO0Oo.isRemoved();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f7635OooO0o0 = new Rect();
            this.f7634OooO0o = true;
            this.f7636OooO0oO = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7635OooO0o0 = new Rect();
            this.f7634OooO0o = true;
            this.f7636OooO0oO = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7635OooO0o0 = new Rect();
            this.f7634OooO0o = true;
            this.f7636OooO0oO = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f7635OooO0o0 = new Rect();
            this.f7634OooO0o = true;
            this.f7636OooO0oO = false;
        }
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().OooO0o(i, i2, i3, i4, iArr, i5, iArr2);
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
            this.mViewFlinger.OooO0OO(i, i2, interpolator, i3);
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
        throw new IllegalStateException(androidx.compose.foundation.layout.OooO00o.OooO0O0(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
