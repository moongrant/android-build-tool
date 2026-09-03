package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooOOO;
import com.qiniu.android.storage.Configuration;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import p649o0ooOoO.v;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static OooOO0 sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.OooO00o mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.OooO0O0 mConstraintSet;
    private int mConstraintSetId;
    private OooO0OO mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.OooO0o mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    OooO0O0 mMeasurer;
    private v mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f5001OooO00o;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f5001OooO00o = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5001OooO00o[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5001OooO00o[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5001OooO00o[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooO0O0 implements o0O0O00.OooO0O0.InterfaceC0443OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ConstraintLayout f5002OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5003OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5004OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f5005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5006OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5007OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f5008OooO0oO;

        public OooO0O0(ConstraintLayout constraintLayout) {
            this.f5002OooO00o = constraintLayout;
        }

        public static boolean OooO0OO(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // o0O0O00.OooO0O0.InterfaceC0443OooO0O0
        public final void OooO00o() {
            ConstraintLayout constraintLayout = this.f5002OooO00o;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f5185OooO0o0 != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f5185OooO0o0.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.f4997o00ooo;
                        constraintWidget.f4412o0OoOo0 = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.f4997o00ooo;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f4390OoooOOO[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.o000oOoO(constraintWidget.OooOo0O());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.f4997o00ooo;
                        if (constraintWidget3.f4390OoooOOO[1] != dimensionBehaviour2) {
                            constraintWidget3.OoooO00(layoutParams2.f4997o00ooo.OooOOOo());
                        }
                        layoutParams2.f4997o00ooo.f4412o0OoOo0 = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i2)).getClass();
                }
            }
        }

        @Override // o0O0O00.OooO0O0.InterfaceC0443OooO0O0
        @SuppressLint({"WrongCall"})
        public final void OooO0O0(ConstraintWidget constraintWidget, o0O0O00.OooO0O0.OooO00o oooO00o) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            int i;
            boolean z;
            int baseline;
            int i2;
            int childMeasureSpec;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f4412o0OoOo0 == 8 && !constraintWidget.f4378Oooo00o) {
                oooO00o.f41101OooO0o0 = 0;
                oooO00o.f41100OooO0o = 0;
                oooO00o.f41102OooO0oO = 0;
                return;
            }
            if (constraintWidget.f4391OoooOOo == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO00o.f41096OooO00o;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = oooO00o.f41097OooO0O0;
            int i3 = oooO00o.f41098OooO0OO;
            int i4 = oooO00o.f41099OooO0Oo;
            int i5 = this.f5003OooO0O0 + this.f5004OooO0OO;
            int i6 = this.f5005OooO0Oo;
            View view = (View) constraintWidget.f4403Ooooooo;
            int[] iArr = OooO00o.f5001OooO00o;
            int i7 = iArr[dimensionBehaviour.ordinal()];
            ConstraintAnchor constraintAnchor = constraintWidget.f4383Oooo0oO;
            ConstraintAnchor constraintAnchor2 = constraintWidget.f4382Oooo0o0;
            if (i7 != 1) {
                if (i7 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5006OooO0o, i6, -2);
                } else if (i7 == 3) {
                    int i8 = this.f5006OooO0o;
                    int i9 = constraintAnchor2 != null ? constraintAnchor2.f4340OooO0oO + 0 : 0;
                    if (constraintAnchor != null) {
                        i9 += constraintAnchor.f4340OooO0oO;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
                } else if (i7 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5006OooO0o, i6, -2);
                    boolean z2 = constraintWidget.f4364OooOo00 == 1;
                    int i10 = oooO00o.f41104OooOO0;
                    if (i10 == 1 || i10 == 2) {
                        if (oooO00o.f41104OooOO0 == 2 || !z2 || (z2 && (view.getMeasuredHeight() == constraintWidget.OooOOOo())) || (view instanceof Placeholder) || constraintWidget.Oooo000()) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.OooOo0O(), Pow2.MAX_POW2);
                        }
                    }
                }
                iMakeMeasureSpec = childMeasureSpec;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2);
            }
            int i11 = iArr[dimensionBehaviour2.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, Pow2.MAX_POW2);
            } else if (i11 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5008OooO0oO, i5, -2);
            } else if (i11 == 3) {
                int i12 = this.f5008OooO0oO;
                int i13 = constraintAnchor2 != null ? constraintWidget.f4381Oooo0o.f4340OooO0oO + 0 : 0;
                if (constraintAnchor != null) {
                    i13 += constraintWidget.f4384Oooo0oo.f4340OooO0oO;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i5 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5008OooO0oO, i5, -2);
                boolean z3 = constraintWidget.f4363OooOo0 == 1;
                int i14 = oooO00o.f41104OooOO0;
                if (i14 == 1 || i14 == 2) {
                    if (oooO00o.f41104OooOO0 == 2 || !z3 || (z3 && (view.getMeasuredWidth() == constraintWidget.OooOo0O())) || (view instanceof Placeholder) || constraintWidget.Oooo00O()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.OooOOOo(), Pow2.MAX_POW2);
                    }
                }
            }
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = (androidx.constraintlayout.core.widgets.OooO0o) constraintWidget.f4391OoooOOo;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (oooO0o != null && androidx.constraintlayout.core.widgets.OooOO0O.OooO0O0(constraintLayout.mOptimizationLevel, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == constraintWidget.OooOo0O() && view.getMeasuredWidth() < oooO0o.OooOo0O() && view.getMeasuredHeight() == constraintWidget.OooOOOo() && view.getMeasuredHeight() < oooO0o.OooOOOo() && view.getBaseline() == constraintWidget.f4398OooooOO && !constraintWidget.OooOooo()) {
                if (OooO0OO(constraintWidget.f4379Oooo0O0, iMakeMeasureSpec, constraintWidget.OooOo0O()) && OooO0OO(constraintWidget.f4380Oooo0OO, iMakeMeasureSpec2, constraintWidget.OooOOOo())) {
                    oooO00o.f41101OooO0o0 = constraintWidget.OooOo0O();
                    oooO00o.f41100OooO0o = constraintWidget.OooOOOo();
                    oooO00o.f41102OooO0oO = constraintWidget.f4398OooooOO;
                    return;
                }
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z4 = dimensionBehaviour == dimensionBehaviour3;
            boolean z5 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z6 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z7 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z8 = z4 && constraintWidget.f4394OoooOoo > 0.0f;
            boolean z9 = z5 && constraintWidget.f4394OoooOoo > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i15 = oooO00o.f41104OooOO0;
            if (i15 != 1 && i15 != 2 && z4 && constraintWidget.f4364OooOo00 == 0 && z5 && constraintWidget.f4363OooOo0 == 0) {
                i2 = -1;
                baseline = 0;
                z = false;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof VirtualLayout) && (constraintWidget instanceof OooOOO)) {
                    ((VirtualLayout) view).OooOo0((OooOOO) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.f4379Oooo0O0 = iMakeMeasureSpec;
                constraintWidget.f4380Oooo0OO = iMakeMeasureSpec2;
                constraintWidget.f4350OooO0oO = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i16 = constraintWidget.f4366OooOo0o;
                iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                int i17 = constraintWidget.f4362OooOo;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                int i18 = constraintWidget.f4367OooOoO;
                iMax2 = i18 > 0 ? Math.max(i18, measuredHeight) : measuredHeight;
                int i19 = constraintWidget.f4369OooOoOO;
                if (i19 > 0) {
                    iMax2 = Math.min(i19, iMax2);
                }
                if (!androidx.constraintlayout.core.widgets.OooOO0O.OooO0O0(constraintLayout.mOptimizationLevel, 1)) {
                    if (z8 && z6) {
                        iMax = (int) ((iMax2 * constraintWidget.f4394OoooOoo) + 0.5f);
                    } else if (z9 && z7) {
                        iMax2 = (int) ((iMax / constraintWidget.f4394OoooOoo) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    z = false;
                } else {
                    if (measuredWidth != iMax) {
                        i = Pow2.MAX_POW2;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Pow2.MAX_POW2);
                    } else {
                        i = Pow2.MAX_POW2;
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, i) : iMakeMeasureSpec2;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    constraintWidget.f4379Oooo0O0 = iMakeMeasureSpec;
                    constraintWidget.f4380Oooo0OO = iMakeMeasureSpec3;
                    z = false;
                    constraintWidget.f4350OooO0oO = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                }
                i2 = -1;
            }
            boolean z10 = baseline != i2 ? true : z;
            oooO00o.f41095OooO = (iMax == oooO00o.f41098OooO0OO && iMax2 == oooO00o.f41099OooO0Oo) ? z : true;
            boolean z11 = layoutParams.f4984Ooooo0o ? true : z10;
            if (z11 && baseline != -1 && constraintWidget.f4398OooooOO != baseline) {
                oooO00o.f41095OooO = true;
            }
            oooO00o.f41101OooO0o0 = iMax;
            oooO00o.f41100OooO0o = iMax2;
            oooO00o.f41103OooO0oo = z11;
            oooO00o.f41102OooO0oO = baseline;
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static OooOO0 getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new OooOO0();
        }
        return sSharedValues;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f4997o00ooo;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.mLayoutWidget;
        oooO0o.f4403Ooooooo = this;
        OooO0O0 oooO0O0 = this.mMeasurer;
        oooO0o.f4501o0O0O00 = oooO0O0;
        oooO0o.f4502o0OO00O.f41088OooO0o = oooO0O0;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == OooO.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == OooO.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == OooO.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == OooO.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == OooO.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == OooO.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == OooO.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.OooO0O0 oooO0O1 = new androidx.constraintlayout.widget.OooO0O0();
                        this.mConstraintSet = oooO0O1;
                        oooO0O1.OooOO0(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.mLayoutWidget;
        oooO0o2.f4492o00000Oo = this.mOptimizationLevel;
        androidx.constraintlayout.core.OooO0OO.f4242OooOOOo = oooO0o2.OooooOO(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.Oooo00o();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f4405o00O0O = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.mConstraintSet;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(this);
        }
        this.mLayoutWidget.f60308o0OOO0o.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i4);
                if (constraintHelper.isInEditMode()) {
                    constraintHelper.setIds(constraintHelper.f4928OooO0oo);
                }
                oo0o0Oo.OooO0O0 oooO0O1 = constraintHelper.f4927OooO0oO;
                if (oooO0O1 != null) {
                    oooO0O1.OooO0O0();
                    for (int i5 = 0; i5 < constraintHelper.f4926OooO0o0; i5++) {
                        int i6 = constraintHelper.f4924OooO0Oo[i5];
                        View viewById = getViewById(i6);
                        if (viewById == null) {
                            Integer numValueOf = Integer.valueOf(i6);
                            HashMap<Integer, String> map = constraintHelper.f4930OooOO0O;
                            String str = map.get(numValueOf);
                            int iOooOO0O = constraintHelper.OooOO0O(this, str);
                            if (iOooOO0O != 0) {
                                constraintHelper.f4924OooO0Oo[i5] = iOooOO0O;
                                map.put(Integer.valueOf(iOooOO0O), str);
                                viewById = getViewById(iOooOO0O);
                            }
                        }
                        if (viewById != null) {
                            constraintHelper.f4927OooO0oO.OooO00o(getViewWidget(viewById));
                        }
                    }
                    constraintHelper.f4927OooO0oO.OooO0OO();
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            if (childAt3 instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt3;
                if (placeholder.f5183OooO0Oo == -1 && !placeholder.isInEditMode()) {
                    placeholder.setVisibility(placeholder.f5184OooO0o);
                }
                View viewFindViewById = findViewById(placeholder.f5183OooO0Oo);
                placeholder.f5185OooO0o0 = viewFindViewById;
                if (viewFindViewById != null) {
                    ((LayoutParams) viewFindViewById.getLayoutParams()).f4987OooooOo = true;
                    placeholder.f5185OooO0o0.setVisibility(0);
                    placeholder.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt4 = getChildAt(i8);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt5 = getChildAt(i9);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.OooO00o(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f4984Ooooo0o = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f4984Ooooo0o = true;
            layoutParams2.f4997o00ooo.f4377Oooo00O = true;
        }
        constraintWidget.OooOOO(type2).OooO0O0(constraintWidget2.OooOOO(type), layoutParams.f4960OooOooO, layoutParams.f4958OooOoo, true);
        constraintWidget.f4377Oooo00O = true;
        constraintWidget.OooOOO(ConstraintAnchor.Type.TOP).OooOO0();
        constraintWidget.OooOOO(ConstraintAnchor.Type.BOTTOM).OooOO0();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i;
        layoutParams.OooO00o();
        constraintWidget.f4412o0OoOo0 = view.getVisibility();
        if (layoutParams.f4987OooooOo) {
            constraintWidget.f4378Oooo00o = true;
            constraintWidget.f4412o0OoOo0 = 8;
        }
        constraintWidget.f4403Ooooooo = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).OooOOOo(constraintWidget, this.mLayoutWidget.f4500o000OOo);
        }
        if (layoutParams.f4985OooooO0) {
            androidx.constraintlayout.core.widgets.OooOO0 oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget;
            int i2 = layoutParams.f4994o00Oo0;
            int i3 = layoutParams.f4995o00Ooo;
            float f = layoutParams.f4996o00o0O;
            if (f != -1.0f) {
                if (f > -1.0f) {
                    oooOO1.f4508o0OOO0o = f;
                    oooOO1.f4509o0Oo0oo = -1;
                    oooOO1.f4507o0OO00O = -1;
                    return;
                }
                return;
            }
            if (i2 != -1) {
                if (i2 > -1) {
                    oooOO1.f4508o0OOO0o = -1.0f;
                    oooOO1.f4509o0Oo0oo = i2;
                    oooOO1.f4507o0OO00O = -1;
                    return;
                }
                return;
            }
            if (i3 == -1 || i3 <= -1) {
                return;
            }
            oooOO1.f4508o0OOO0o = -1.0f;
            oooOO1.f4509o0Oo0oo = -1;
            oooOO1.f4507o0OO00O = i3;
            return;
        }
        int i4 = layoutParams.f4989Oooooo0;
        int i5 = layoutParams.f4988Oooooo;
        int i6 = layoutParams.f4990OoooooO;
        int i7 = layoutParams.f4991Ooooooo;
        int i8 = layoutParams.f4998o0OoOo0;
        int i9 = layoutParams.f4999ooOO;
        float f2 = layoutParams.f4993o00O0O;
        int i10 = layoutParams.f4946OooOOOo;
        if (i10 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i10);
            if (constraintWidget6 != null) {
                float f3 = layoutParams.f4947OooOOo;
                int i11 = layoutParams.f4948OooOOo0;
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                constraintWidget.OooOoOO(type, constraintWidget6, type, i11, 0);
                constraintWidget.f4376Oooo000 = f3;
            }
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i4);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.OooOoOO(type2, constraintWidget7, type2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                constraintWidget.OooOoOO(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i6);
                if (constraintWidget8 != null) {
                    constraintWidget.OooOoOO(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.OooOoOO(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i12 = layoutParams.f4931OooO;
            if (i12 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i12);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                    constraintWidget.OooOoOO(type4, constraintWidget9, type4, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f4950OooOo);
                }
            } else {
                int i13 = layoutParams.f4940OooOO0;
                if (i13 != -1 && (constraintWidget4 = sparseArray.get(i13)) != null) {
                    constraintWidget.OooOoOO(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f4950OooOo);
                }
            }
            int i14 = layoutParams.f4941OooOO0O;
            if (i14 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i14);
                if (constraintWidget10 != null) {
                    constraintWidget.OooOoOO(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4955OooOoO);
                }
            } else {
                int i15 = layoutParams.f4942OooOO0o;
                if (i15 != -1 && (constraintWidget5 = sparseArray.get(i15)) != null) {
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.OooOoOO(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4955OooOoO);
                }
            }
            int i16 = layoutParams.f4944OooOOO0;
            if (i16 != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i16, ConstraintAnchor.Type.BASELINE);
            } else {
                int i17 = layoutParams.f4943OooOOO;
                if (i17 != -1) {
                    setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i17, ConstraintAnchor.Type.TOP);
                } else {
                    int i18 = layoutParams.f4945OooOOOO;
                    if (i18 != -1) {
                        setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i18, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                constraintWidget.f4400Oooooo = f2;
            }
            float f4 = layoutParams.f4964Oooo000;
            if (f4 >= 0.0f) {
                constraintWidget.f4402OoooooO = f4;
            }
        }
        if (z && ((i = layoutParams.f4973OoooO) != -1 || layoutParams.f4977OoooOO0 != -1)) {
            int i19 = layoutParams.f4977OoooOO0;
            constraintWidget.f4396Ooooo0o = i;
            constraintWidget.f4397OooooO0 = i19;
        }
        if (layoutParams.f4982OoooOoo) {
            constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.o000oOoO(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.f4978OoooOOO) {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.OooOOO(ConstraintAnchor.Type.LEFT).f4340OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget.OooOOO(ConstraintAnchor.Type.RIGHT).f4340OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget.OoooO0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.o000oOoO(0);
        }
        if (layoutParams.f4983Ooooo00) {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.OoooO00(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f4979OoooOOo) {
                constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.OooOOO(ConstraintAnchor.Type.TOP).f4340OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget.OooOOO(ConstraintAnchor.Type.BOTTOM).f4340OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget.OoooO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.OoooO00(0);
        }
        constraintWidget.Oooo0oO(layoutParams.f4965Oooo00O);
        float f5 = layoutParams.f4966Oooo00o;
        float[] fArr = constraintWidget.f4411o00ooo;
        fArr[0] = f5;
        fArr[1] = layoutParams.f4963Oooo0;
        constraintWidget.f4407o00Ooo = layoutParams.f4967Oooo0O0;
        constraintWidget.f4408o00o0O = layoutParams.f4968Oooo0OO;
        int i20 = layoutParams.f4981OoooOoO;
        if (i20 >= 0 && i20 <= 3) {
            constraintWidget.f4361OooOOoo = i20;
        }
        constraintWidget.OoooO0O(layoutParams.f4970Oooo0o0, layoutParams.f4974OoooO0, layoutParams.f4971Oooo0oO, layoutParams.f4962Oooo);
        constraintWidget.OoooOO0(layoutParams.f4969Oooo0o, layoutParams.f4976OoooO0O, layoutParams.f4972Oooo0oo, layoutParams.f4975OoooO00);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).OooOOo(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(v vVar) {
        this.mLayoutWidget.f4486o000000.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f4492o00000Oo;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f4354OooOO0o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f4354OooOO0o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f4354OooOO0o = "parent";
            }
        }
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.mLayoutWidget;
        if (oooO0o.f4405o00O0O == null) {
            oooO0o.f4405o00O0O = oooO0o.f4354OooOO0o;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f4405o00O0O);
        }
        for (ConstraintWidget constraintWidget : this.mLayoutWidget.f60308o0OOO0o) {
            View view = (View) constraintWidget.f4403Ooooooo;
            if (view != null) {
                if (constraintWidget.f4354OooOO0o == null && (id = view.getId()) != -1) {
                    constraintWidget.f4354OooOO0o = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.f4405o00O0O == null) {
                    constraintWidget.f4405o00O0O = constraintWidget.f4354OooOO0o;
                    Log.v(TAG, " setDebugName " + constraintWidget.f4405o00O0O);
                }
            }
        }
        this.mLayoutWidget.OooOOoo(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f4997o00ooo;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f4997o00ooo;
        }
        return null;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & Configuration.BLOCK_SIZE) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.OooO00o(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f4997o00ooo;
            if ((childAt.getVisibility() != 8 || layoutParams.f4985OooooO0 || layoutParams.f4986OooooOO || zIsInEditMode) && !layoutParams.f4987OooooOo) {
                int iOooOo0o = constraintWidget.OooOo0o();
                int iOooOo = constraintWidget.OooOo();
                int iOooOo0O = constraintWidget.OooOo0O() + iOooOo0o;
                int iOooOOOo = constraintWidget.OooOOOo() + iOooOo;
                childAt.layout(iOooOo0o, iOooOo, iOooOo0O, iOooOOOo);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iOooOo0o, iOooOo, iOooOo0O, iOooOOOo);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).OooOOo0();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f4500o000OOo = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.mLayoutWidget;
                oooO0o.f4503o0Oo0oo.OooO0OO(oooO0o);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int iOooOo0O = this.mLayoutWidget.OooOo0O();
        int iOooOOOo = this.mLayoutWidget.OooOOOo();
        androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, iOooOo0O, iOooOOOo, oooO0o2.f4493o00000o0, oooO0o2.f4497o0000Ooo);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.OooOO0)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.OooOO0 oooOO1 = new androidx.constraintlayout.core.widgets.OooOO0();
            layoutParams.f4997o00ooo = oooOO1;
            layoutParams.f4985OooooO0 = true;
            oooOO1.OoooOoO(layoutParams.f4992o000oOoO);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.OooOo00();
            ((LayoutParams) view.getLayoutParams()).f4986OooooOO = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f60308o0OOO0o.remove(viewWidget);
        viewWidget.Oooo00o();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.OooO00o(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i5 = oooO0O0.f5007OooO0o0;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + oooO0O0.f5005OooO0Oo, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(androidx.constraintlayout.core.widgets.OooO0o oooO0o, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        OooO0O0 oooO0O0 = this.mMeasurer;
        oooO0O0.f5003OooO0O0 = iMax;
        oooO0O0.f5004OooO0OO = iMax2;
        oooO0O0.f5005OooO0Oo = paddingWidth;
        oooO0O0.f5007OooO0o0 = i4;
        oooO0O0.f5006OooO0o = i2;
        oooO0O0.f5008OooO0oO = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(oooO0o, mode, i5, mode2, i6);
        oooO0o.Ooooo0o(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.OooO0O0 oooO0O0) {
        this.mConstraintSet = oooO0O0;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(OooO0OO oooO0OO) {
        androidx.constraintlayout.widget.OooO00o oooO00o = this.mConstraintLayoutSpec;
        if (oooO00o != null) {
            oooO00o.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.mLayoutWidget;
        oooO0o.f4492o00000Oo = i;
        androidx.constraintlayout.core.OooO0OO.f4242OooOOOo = oooO0o.OooooOO(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[PHI: r2
      0x0053: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.OooO0o oooO0o, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i5 = oooO0O0.f5007OooO0o0;
        int i6 = oooO0O0.f5005OooO0Oo;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i3 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            } else {
                i4 = 0;
            }
        } else if (i3 != 1073741824) {
            i4 = 0;
        } else {
            i4 = Math.min(this.mMaxHeight - i5, i4);
        }
        if (i2 != oooO0o.OooOo0O() || i4 != oooO0o.OooOOOo()) {
            oooO0o.f4502o0OO00O.f41086OooO0OO = true;
        }
        oooO0o.f4396Ooooo0o = 0;
        oooO0o.f4397OooooO0 = 0;
        int i7 = this.mMaxWidth - i6;
        int[] iArr = oooO0o.f4373OooOooo;
        iArr[0] = i7;
        iArr[1] = this.mMaxHeight - i5;
        oooO0o.f4399OooooOo = 0;
        oooO0o.f4401Oooooo0 = 0;
        oooO0o.OoooO0(dimensionBehaviour);
        oooO0o.o000oOoO(i2);
        oooO0o.OoooO(dimensionBehaviour2);
        oooO0o.OoooO00(i4);
        int i8 = this.mMinWidth - i6;
        if (i8 < 0) {
            oooO0o.f4399OooooOo = 0;
        } else {
            oooO0o.f4399OooooOo = i8;
        }
        int i9 = this.mMinHeight - i5;
        if (i9 < 0) {
            oooO0o.f4401Oooooo0 = 0;
        } else {
            oooO0o.f4401Oooooo0 = i9;
        }
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.OooO00o oooO00o = this.mConstraintLayoutSpec;
        if (oooO00o != null) {
            oooO00o.OooO0O0(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.OooO0o();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new OooO0O0(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f4931OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f4932OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f4933OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f4934OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f4935OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f4936OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f4937OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f4938OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f4939OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f4940OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f4941OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f4942OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f4943OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f4944OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f4945OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f4946OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public float f4947OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f4948OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f4949OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f4950OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f4951OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f4952OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f4953OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f4954OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f4955OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f4956OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f4957OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final int f4958OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f4959OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final int f4960OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public float f4961OooOooo;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f4962Oooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public float f4963Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public float f4964Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public String f4965Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public float f4966Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f4967Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f4968Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f4969Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f4970Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f4971Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f4972Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f4973OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public float f4974OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f4975OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public float f4976OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f4977OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public boolean f4978OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public boolean f4979OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public String f4980OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f4981OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public boolean f4982OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public boolean f4983Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public boolean f4984Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public boolean f4985OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public boolean f4986OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public boolean f4987OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f4988Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f4989Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f4990OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int f4991Ooooooo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f4992o000oOoO;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public float f4993o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public int f4994o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public int f4995o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public float f4996o00o0O;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public ConstraintWidget f4997o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public int f4998o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public int f4999ooOO;

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final SparseIntArray f5000OooO00o;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f5000OooO00o = sparseIntArray;
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(OooO.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4932OooO00o = -1;
            this.f4933OooO0O0 = -1;
            this.f4934OooO0OO = -1.0f;
            this.f4935OooO0Oo = true;
            this.f4937OooO0o0 = -1;
            this.f4936OooO0o = -1;
            this.f4938OooO0oO = -1;
            this.f4939OooO0oo = -1;
            this.f4931OooO = -1;
            this.f4940OooOO0 = -1;
            this.f4941OooOO0O = -1;
            this.f4942OooOO0o = -1;
            this.f4944OooOOO0 = -1;
            this.f4943OooOOO = -1;
            this.f4945OooOOOO = -1;
            this.f4946OooOOOo = -1;
            this.f4948OooOOo0 = 0;
            this.f4947OooOOo = 0.0f;
            this.f4949OooOOoo = -1;
            this.f4952OooOo00 = -1;
            this.f4951OooOo0 = -1;
            this.f4953OooOo0O = -1;
            this.f4954OooOo0o = Integer.MIN_VALUE;
            this.f4950OooOo = Integer.MIN_VALUE;
            this.f4956OooOoO0 = Integer.MIN_VALUE;
            this.f4955OooOoO = Integer.MIN_VALUE;
            this.f4957OooOoOO = Integer.MIN_VALUE;
            this.f4959OooOoo0 = Integer.MIN_VALUE;
            this.f4958OooOoo = Integer.MIN_VALUE;
            this.f4960OooOooO = 0;
            this.f4961OooOooo = 0.5f;
            this.f4964Oooo000 = 0.5f;
            this.f4965Oooo00O = null;
            this.f4966Oooo00o = -1.0f;
            this.f4963Oooo0 = -1.0f;
            this.f4967Oooo0O0 = 0;
            this.f4968Oooo0OO = 0;
            this.f4970Oooo0o0 = 0;
            this.f4969Oooo0o = 0;
            this.f4971Oooo0oO = 0;
            this.f4972Oooo0oo = 0;
            this.f4962Oooo = 0;
            this.f4975OoooO00 = 0;
            this.f4974OoooO0 = 1.0f;
            this.f4976OoooO0O = 1.0f;
            this.f4973OoooO = -1;
            this.f4977OoooOO0 = -1;
            this.f4992o000oOoO = -1;
            this.f4978OoooOOO = false;
            this.f4979OoooOOo = false;
            this.f4980OoooOo0 = null;
            this.f4981OoooOoO = 0;
            this.f4982OoooOoo = true;
            this.f4983Ooooo00 = true;
            this.f4984Ooooo0o = false;
            this.f4985OooooO0 = false;
            this.f4986OooooOO = false;
            this.f4987OooooOo = false;
            this.f4989Oooooo0 = -1;
            this.f4988Oooooo = -1;
            this.f4990OoooooO = -1;
            this.f4991Ooooooo = -1;
            this.f4998o0OoOo0 = Integer.MIN_VALUE;
            this.f4999ooOO = Integer.MIN_VALUE;
            this.f4993o00O0O = 0.5f;
            this.f4997o00ooo = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = OooO00o.f5000OooO00o.get(index);
                switch (i2) {
                    case 1:
                        this.f4992o000oOoO = typedArrayObtainStyledAttributes.getInt(index, this.f4992o000oOoO);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4946OooOOOo);
                        this.f4946OooOOOo = resourceId;
                        if (resourceId == -1) {
                            this.f4946OooOOOo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f4948OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4948OooOOo0);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f4947OooOOo) % 360.0f;
                        this.f4947OooOOo = f;
                        if (f < 0.0f) {
                            this.f4947OooOOo = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f4932OooO00o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4932OooO00o);
                        break;
                    case 6:
                        this.f4933OooO0O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4933OooO0O0);
                        break;
                    case 7:
                        this.f4934OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f4934OooO0OO);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4937OooO0o0);
                        this.f4937OooO0o0 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f4937OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4936OooO0o);
                        this.f4936OooO0o = resourceId3;
                        if (resourceId3 == -1) {
                            this.f4936OooO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4938OooO0oO);
                        this.f4938OooO0oO = resourceId4;
                        if (resourceId4 == -1) {
                            this.f4938OooO0oO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4939OooO0oo);
                        this.f4939OooO0oo = resourceId5;
                        if (resourceId5 == -1) {
                            this.f4939OooO0oo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4931OooO);
                        this.f4931OooO = resourceId6;
                        if (resourceId6 == -1) {
                            this.f4931OooO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4940OooOO0);
                        this.f4940OooOO0 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f4940OooOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4941OooOO0O);
                        this.f4941OooOO0O = resourceId8;
                        if (resourceId8 == -1) {
                            this.f4941OooOO0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4942OooOO0o);
                        this.f4942OooOO0o = resourceId9;
                        if (resourceId9 == -1) {
                            this.f4942OooOO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4944OooOOO0);
                        this.f4944OooOOO0 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f4944OooOOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4949OooOOoo);
                        this.f4949OooOOoo = resourceId11;
                        if (resourceId11 == -1) {
                            this.f4949OooOOoo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4952OooOo00);
                        this.f4952OooOo00 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f4952OooOo00 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4951OooOo0);
                        this.f4951OooOo0 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f4951OooOo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4953OooOo0O);
                        this.f4953OooOo0O = resourceId14;
                        if (resourceId14 == -1) {
                            this.f4953OooOo0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f4954OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4954OooOo0o);
                        break;
                    case 22:
                        this.f4950OooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4950OooOo);
                        break;
                    case 23:
                        this.f4956OooOoO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4956OooOoO0);
                        break;
                    case 24:
                        this.f4955OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4955OooOoO);
                        break;
                    case 25:
                        this.f4957OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4957OooOoOO);
                        break;
                    case 26:
                        this.f4959OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4959OooOoo0);
                        break;
                    case 27:
                        this.f4978OoooOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f4978OoooOOO);
                        break;
                    case 28:
                        this.f4979OoooOOo = typedArrayObtainStyledAttributes.getBoolean(index, this.f4979OoooOOo);
                        break;
                    case 29:
                        this.f4961OooOooo = typedArrayObtainStyledAttributes.getFloat(index, this.f4961OooOooo);
                        break;
                    case 30:
                        this.f4964Oooo000 = typedArrayObtainStyledAttributes.getFloat(index, this.f4964Oooo000);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f4970Oooo0o0 = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f4969Oooo0o = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f4971Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4971Oooo0oO);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4971Oooo0oO) == -2) {
                                this.f4971Oooo0oO = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f4962Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4962Oooo);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4962Oooo) == -2) {
                                this.f4962Oooo = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f4974OoooO0 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f4974OoooO0));
                        this.f4970Oooo0o0 = 2;
                        break;
                    case 36:
                        try {
                            this.f4972Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4972Oooo0oo);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4972Oooo0oo) == -2) {
                                this.f4972Oooo0oo = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f4975OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4975OoooO00);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4975OoooO00) == -2) {
                                this.f4975OoooO00 = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f4976OoooO0O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f4976OoooO0O));
                        this.f4969Oooo0o = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.OooO0O0.OooOOO(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f4966Oooo00o = typedArrayObtainStyledAttributes.getFloat(index, this.f4966Oooo00o);
                                break;
                            case 46:
                                this.f4963Oooo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4963Oooo0);
                                break;
                            case 47:
                                this.f4967Oooo0O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f4968Oooo0OO = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f4973OoooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4973OoooO);
                                break;
                            case 50:
                                this.f4977OoooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4977OoooOO0);
                                break;
                            case 51:
                                this.f4980OoooOo0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4943OooOOO);
                                this.f4943OooOOO = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f4943OooOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4945OooOOOO);
                                this.f4945OooOOOO = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f4945OooOOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f4960OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4960OooOooO);
                                break;
                            case 55:
                                this.f4958OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4958OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.OooO0O0.OooOOO0(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.OooO0O0.OooOOO0(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f4981OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f4981OoooOoO);
                                        break;
                                    case 67:
                                        this.f4935OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f4935OooO0Oo);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            OooO00o();
        }

        public final void OooO00o() {
            this.f4985OooooO0 = false;
            this.f4982OoooOoo = true;
            this.f4983Ooooo00 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f4978OoooOOO) {
                this.f4982OoooOoo = false;
                if (this.f4970Oooo0o0 == 0) {
                    this.f4970Oooo0o0 = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f4979OoooOOo) {
                this.f4983Ooooo00 = false;
                if (this.f4969Oooo0o == 0) {
                    this.f4969Oooo0o = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f4982OoooOoo = false;
                if (i == 0 && this.f4970Oooo0o0 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f4978OoooOOO = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f4983Ooooo00 = false;
                if (i2 == 0 && this.f4969Oooo0o == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f4979OoooOOo = true;
                }
            }
            if (this.f4934OooO0OO == -1.0f && this.f4932OooO00o == -1 && this.f4933OooO0O0 == -1) {
                return;
            }
            this.f4985OooooO0 = true;
            this.f4982OoooOoo = true;
            this.f4983Ooooo00 = true;
            if (!(this.f4997o00ooo instanceof androidx.constraintlayout.core.widgets.OooOO0)) {
                this.f4997o00ooo = new androidx.constraintlayout.core.widgets.OooOO0();
            }
            ((androidx.constraintlayout.core.widgets.OooOO0) this.f4997o00ooo).OoooOoO(this.f4992o000oOoO);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f4990OoooooO = -1;
            this.f4991Ooooooo = -1;
            this.f4989Oooooo0 = -1;
            this.f4988Oooooo = -1;
            this.f4998o0OoOo0 = this.f4954OooOo0o;
            this.f4999ooOO = this.f4956OooOoO0;
            float f = this.f4961OooOooo;
            this.f4993o00O0O = f;
            int i8 = this.f4932OooO00o;
            this.f4994o00Oo0 = i8;
            int i9 = this.f4933OooO0O0;
            this.f4995o00Ooo = i9;
            float f2 = this.f4934OooO0OO;
            this.f4996o00o0O = f2;
            if (z2) {
                int i10 = this.f4949OooOOoo;
                if (i10 != -1) {
                    this.f4990OoooooO = i10;
                } else {
                    int i11 = this.f4952OooOo00;
                    if (i11 != -1) {
                        this.f4991Ooooooo = i11;
                    } else {
                        i2 = this.f4951OooOo0;
                        if (i2 != -1) {
                            this.f4988Oooooo = i2;
                            z = true;
                        }
                        i3 = this.f4953OooOo0O;
                        if (i3 != -1) {
                            this.f4989Oooooo0 = i3;
                            z = true;
                        }
                        i4 = this.f4957OooOoOO;
                        if (i4 != Integer.MIN_VALUE) {
                            this.f4999ooOO = i4;
                        }
                        i5 = this.f4959OooOoo0;
                        if (i5 != Integer.MIN_VALUE) {
                            this.f4998o0OoOo0 = i5;
                        }
                        if (z) {
                            this.f4993o00O0O = 1.0f - f;
                        }
                        if (this.f4985OooooO0 && this.f4992o000oOoO == 1 && this.f4935OooO0Oo) {
                            if (f2 != -1.0f) {
                                this.f4996o00o0O = 1.0f - f2;
                                this.f4994o00Oo0 = -1;
                                this.f4995o00Ooo = -1;
                            } else if (i8 != -1) {
                                this.f4995o00Ooo = i8;
                                this.f4994o00Oo0 = -1;
                                this.f4996o00o0O = -1.0f;
                            } else if (i9 != -1) {
                                this.f4994o00Oo0 = i9;
                                this.f4995o00Ooo = -1;
                                this.f4996o00o0O = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.f4951OooOo0;
                if (i2 != -1) {
                    this.f4988Oooooo = i2;
                    z = true;
                }
                i3 = this.f4953OooOo0O;
                if (i3 != -1) {
                    this.f4989Oooooo0 = i3;
                    z = true;
                }
                i4 = this.f4957OooOoOO;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4999ooOO = i4;
                }
                i5 = this.f4959OooOoo0;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4998o0OoOo0 = i5;
                }
                if (z) {
                    this.f4993o00O0O = 1.0f - f;
                }
                if (this.f4985OooooO0) {
                    if (f2 != -1.0f) {
                        this.f4996o00o0O = 1.0f - f2;
                        this.f4994o00Oo0 = -1;
                        this.f4995o00Ooo = -1;
                    } else if (i8 != -1) {
                        this.f4995o00Ooo = i8;
                        this.f4994o00Oo0 = -1;
                        this.f4996o00o0O = -1.0f;
                    } else if (i9 != -1) {
                        this.f4994o00Oo0 = i9;
                        this.f4995o00Ooo = -1;
                        this.f4996o00o0O = -1.0f;
                    }
                }
            } else {
                int i12 = this.f4949OooOOoo;
                if (i12 != -1) {
                    this.f4988Oooooo = i12;
                }
                int i13 = this.f4952OooOo00;
                if (i13 != -1) {
                    this.f4989Oooooo0 = i13;
                }
                int i14 = this.f4951OooOo0;
                if (i14 != -1) {
                    this.f4990OoooooO = i14;
                }
                int i15 = this.f4953OooOo0O;
                if (i15 != -1) {
                    this.f4991Ooooooo = i15;
                }
                int i16 = this.f4957OooOoOO;
                if (i16 != Integer.MIN_VALUE) {
                    this.f4998o0OoOo0 = i16;
                }
                int i17 = this.f4959OooOoo0;
                if (i17 != Integer.MIN_VALUE) {
                    this.f4999ooOO = i17;
                }
            }
            if (this.f4951OooOo0 == -1 && this.f4953OooOo0O == -1 && this.f4952OooOo00 == -1 && this.f4949OooOOoo == -1) {
                int i18 = this.f4938OooO0oO;
                if (i18 != -1) {
                    this.f4990OoooooO = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f4939OooO0oo;
                    if (i19 != -1) {
                        this.f4991Ooooooo = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f4937OooO0o0;
                if (i20 != -1) {
                    this.f4989Oooooo0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f4936OooO0o;
                if (i21 != -1) {
                    this.f4988Oooooo = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams() {
            super(-2, -2);
            this.f4932OooO00o = -1;
            this.f4933OooO0O0 = -1;
            this.f4934OooO0OO = -1.0f;
            this.f4935OooO0Oo = true;
            this.f4937OooO0o0 = -1;
            this.f4936OooO0o = -1;
            this.f4938OooO0oO = -1;
            this.f4939OooO0oo = -1;
            this.f4931OooO = -1;
            this.f4940OooOO0 = -1;
            this.f4941OooOO0O = -1;
            this.f4942OooOO0o = -1;
            this.f4944OooOOO0 = -1;
            this.f4943OooOOO = -1;
            this.f4945OooOOOO = -1;
            this.f4946OooOOOo = -1;
            this.f4948OooOOo0 = 0;
            this.f4947OooOOo = 0.0f;
            this.f4949OooOOoo = -1;
            this.f4952OooOo00 = -1;
            this.f4951OooOo0 = -1;
            this.f4953OooOo0O = -1;
            this.f4954OooOo0o = Integer.MIN_VALUE;
            this.f4950OooOo = Integer.MIN_VALUE;
            this.f4956OooOoO0 = Integer.MIN_VALUE;
            this.f4955OooOoO = Integer.MIN_VALUE;
            this.f4957OooOoOO = Integer.MIN_VALUE;
            this.f4959OooOoo0 = Integer.MIN_VALUE;
            this.f4958OooOoo = Integer.MIN_VALUE;
            this.f4960OooOooO = 0;
            this.f4961OooOooo = 0.5f;
            this.f4964Oooo000 = 0.5f;
            this.f4965Oooo00O = null;
            this.f4966Oooo00o = -1.0f;
            this.f4963Oooo0 = -1.0f;
            this.f4967Oooo0O0 = 0;
            this.f4968Oooo0OO = 0;
            this.f4970Oooo0o0 = 0;
            this.f4969Oooo0o = 0;
            this.f4971Oooo0oO = 0;
            this.f4972Oooo0oo = 0;
            this.f4962Oooo = 0;
            this.f4975OoooO00 = 0;
            this.f4974OoooO0 = 1.0f;
            this.f4976OoooO0O = 1.0f;
            this.f4973OoooO = -1;
            this.f4977OoooOO0 = -1;
            this.f4992o000oOoO = -1;
            this.f4978OoooOOO = false;
            this.f4979OoooOOo = false;
            this.f4980OoooOo0 = null;
            this.f4981OoooOoO = 0;
            this.f4982OoooOoo = true;
            this.f4983Ooooo00 = true;
            this.f4984Ooooo0o = false;
            this.f4985OooooO0 = false;
            this.f4986OooooOO = false;
            this.f4987OooooOo = false;
            this.f4989Oooooo0 = -1;
            this.f4988Oooooo = -1;
            this.f4990OoooooO = -1;
            this.f4991Ooooooo = -1;
            this.f4998o0OoOo0 = Integer.MIN_VALUE;
            this.f4999ooOO = Integer.MIN_VALUE;
            this.f4993o00O0O = 0.5f;
            this.f4997o00ooo = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4932OooO00o = -1;
            this.f4933OooO0O0 = -1;
            this.f4934OooO0OO = -1.0f;
            this.f4935OooO0Oo = true;
            this.f4937OooO0o0 = -1;
            this.f4936OooO0o = -1;
            this.f4938OooO0oO = -1;
            this.f4939OooO0oo = -1;
            this.f4931OooO = -1;
            this.f4940OooOO0 = -1;
            this.f4941OooOO0O = -1;
            this.f4942OooOO0o = -1;
            this.f4944OooOOO0 = -1;
            this.f4943OooOOO = -1;
            this.f4945OooOOOO = -1;
            this.f4946OooOOOo = -1;
            this.f4948OooOOo0 = 0;
            this.f4947OooOOo = 0.0f;
            this.f4949OooOOoo = -1;
            this.f4952OooOo00 = -1;
            this.f4951OooOo0 = -1;
            this.f4953OooOo0O = -1;
            this.f4954OooOo0o = Integer.MIN_VALUE;
            this.f4950OooOo = Integer.MIN_VALUE;
            this.f4956OooOoO0 = Integer.MIN_VALUE;
            this.f4955OooOoO = Integer.MIN_VALUE;
            this.f4957OooOoOO = Integer.MIN_VALUE;
            this.f4959OooOoo0 = Integer.MIN_VALUE;
            this.f4958OooOoo = Integer.MIN_VALUE;
            this.f4960OooOooO = 0;
            this.f4961OooOooo = 0.5f;
            this.f4964Oooo000 = 0.5f;
            this.f4965Oooo00O = null;
            this.f4966Oooo00o = -1.0f;
            this.f4963Oooo0 = -1.0f;
            this.f4967Oooo0O0 = 0;
            this.f4968Oooo0OO = 0;
            this.f4970Oooo0o0 = 0;
            this.f4969Oooo0o = 0;
            this.f4971Oooo0oO = 0;
            this.f4972Oooo0oo = 0;
            this.f4962Oooo = 0;
            this.f4975OoooO00 = 0;
            this.f4974OoooO0 = 1.0f;
            this.f4976OoooO0O = 1.0f;
            this.f4973OoooO = -1;
            this.f4977OoooOO0 = -1;
            this.f4992o000oOoO = -1;
            this.f4978OoooOOO = false;
            this.f4979OoooOOo = false;
            this.f4980OoooOo0 = null;
            this.f4981OoooOoO = 0;
            this.f4982OoooOoo = true;
            this.f4983Ooooo00 = true;
            this.f4984Ooooo0o = false;
            this.f4985OooooO0 = false;
            this.f4986OooooOO = false;
            this.f4987OooooOo = false;
            this.f4989Oooooo0 = -1;
            this.f4988Oooooo = -1;
            this.f4990OoooooO = -1;
            this.f4991Ooooooo = -1;
            this.f4998o0OoOo0 = Integer.MIN_VALUE;
            this.f4999ooOO = Integer.MIN_VALUE;
            this.f4993o00O0O = 0.5f;
            this.f4997o00ooo = new ConstraintWidget();
        }
    }
}
