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
import androidx.constraintlayout.core.widgets.OooO0o;
import androidx.constraintlayout.core.widgets.OooOO0;
import androidx.constraintlayout.core.widgets.OooOO0O;
import androidx.constraintlayout.core.widgets.OooOOO;
import com.umeng.analytics.pro.bl;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p061o0000o0.OooOo;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000O000;
import p065o0000oO0.o000O0o;

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
    private static androidx.constraintlayout.widget.OooO0O0 sSharedValues;
    public SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    public o000O000 mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.OooO00o mConstraintSet;
    private int mConstraintSetId;
    private o000O0o mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public OooO0o mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    public OooO0O0 mMeasurer;
    private o0000OOO.OooO0O0 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f7567OooO00o;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f7567OooO00o = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7567OooO00o[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7567OooO00o[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7567OooO00o[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooO0O0 implements OooOo.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ConstraintLayout f7568OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7569OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7570OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7571OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7572OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7573OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7574OooO0oO;

        public OooO0O0(ConstraintLayout constraintLayout) {
            this.f7568OooO00o = constraintLayout;
        }

        @Override // o0000o0.OooOo.OooO0O0
        public final void OooO00o() {
            int childCount = this.f7568OooO00o.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f7568OooO00o.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f7725Oooo0oO != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f7725Oooo0oO.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.f7563o00ooo;
                        constraintWidget.f6969o0OoOo0 = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.f7563o00ooo;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f6947OoooOOO[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.Ooooo00(constraintWidget.OooOoO0());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.f7563o00ooo;
                        if (constraintWidget3.f6947OoooOOO[1] != dimensionBehaviour2) {
                            constraintWidget3.OoooOO0(layoutParams2.f7563o00ooo.OooOOo());
                        }
                        layoutParams2.f7563o00ooo.f6969o0OoOo0 = 8;
                    }
                }
            }
            int size = this.f7568OooO00o.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull((ConstraintHelper) this.f7568OooO00o.mConstraintHelpers.get(i2));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:119:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:121:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:126:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:128:0x01be  */
        /* JADX WARN: Code duplicated, block: B:129:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:136:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:142:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:148:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:153:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:155:0x01f0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:156:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:167:0x0211  */
        /* JADX WARN: Code duplicated, block: B:169:0x0215  */
        /* JADX WARN: Code duplicated, block: B:172:0x0223  */
        /* JADX WARN: Code duplicated, block: B:175:0x023d  */
        /* JADX WARN: Code duplicated, block: B:176:0x0242  */
        /* JADX WARN: Code duplicated, block: B:179:0x0247  */
        /* JADX WARN: Code duplicated, block: B:182:0x024f  */
        /* JADX WARN: Code duplicated, block: B:183:0x0256  */
        /* JADX WARN: Code duplicated, block: B:186:0x025d  */
        /* JADX WARN: Code duplicated, block: B:189:0x026e  */
        /* JADX WARN: Code duplicated, block: B:191:0x0272 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:193:0x027d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:194:0x027f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:197:0x028a A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:200:0x0291  */
        /* JADX WARN: Code duplicated, block: B:202:0x0295  */
        /* JADX WARN: Code duplicated, block: B:203:0x029a  */
        /* JADX WARN: Code duplicated, block: B:205:0x029e  */
        /* JADX WARN: Code duplicated, block: B:208:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:209:0x02bf  */
        /* JADX WARN: Code duplicated, block: B:216:0x02cb  */
        /* JADX WARN: Code duplicated, block: B:219:0x02d2  */
        @Override // o0000o0.OooOo.OooO0O0
        @SuppressLint({"WrongCall"})
        public final void OooO0O0(ConstraintWidget constraintWidget, OooOo.OooO00o oooO00o) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMakeMeasureSpec3;
            OooO0o oooO0o;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z;
            boolean z2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            LayoutParams layoutParams;
            int i;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int iMin;
            int i3;
            int i4;
            int iMin2;
            int i5;
            int iMakeMeasureSpec4;
            int baseline;
            int i6;
            boolean z7;
            boolean z8;
            boolean z9;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f6969o0OoOo0 == 8 && !constraintWidget.f6935Oooo00o) {
                oooO00o.f27843OooO0o0 = 0;
                oooO00o.f27842OooO0o = 0;
                oooO00o.f27844OooO0oO = 0;
                return;
            }
            if (constraintWidget.f6948OoooOOo == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = oooO00o.f27838OooO00o;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = oooO00o.f27839OooO0O0;
            int i7 = oooO00o.f27840OooO0OO;
            int i8 = oooO00o.f27841OooO0Oo;
            int i9 = this.f7569OooO0O0 + this.f7570OooO0OO;
            int i10 = this.f7571OooO0Oo;
            View view = (View) constraintWidget.f6960Ooooooo;
            int[] iArr = OooO00o.f7567OooO00o;
            int i11 = iArr[dimensionBehaviour3.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else if (i11 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7572OooO0o, i10, -2);
            } else if (i11 == 3) {
                int i12 = this.f7572OooO0o;
                ConstraintAnchor constraintAnchor = constraintWidget.f6939Oooo0o0;
                int i13 = constraintAnchor != null ? constraintAnchor.f6897OooO0oO + 0 : 0;
                ConstraintAnchor constraintAnchor2 = constraintWidget.f6940Oooo0oO;
                if (constraintAnchor2 != null) {
                    i13 += constraintAnchor2.f6897OooO0oO;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i10 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f7572OooO0o, i10, -2);
                boolean z10 = constraintWidget.f6921OooOo00 == 1;
                int i14 = oooO00o.f27846OooOO0;
                if (i14 == 1 || i14 == 2) {
                    if (oooO00o.f27846OooOO0 == 2 || !z10 || (z10 && (view.getMeasuredHeight() == constraintWidget.OooOOo())) || (view instanceof Placeholder) || constraintWidget.Oooo0()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.OooOoO0(), 1073741824);
                    }
                }
            }
            int i15 = iArr[dimensionBehaviour4.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7574OooO0oO, i9, -2);
            } else {
                if (i15 != 3) {
                    if (i15 != 4) {
                        iMakeMeasureSpec3 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f7574OooO0oO, i9, -2);
                        boolean z11 = constraintWidget.f6920OooOo0 == 1;
                        int i16 = oooO00o.f27846OooOO0;
                        if (i16 == 1 || i16 == 2) {
                            if (oooO00o.f27846OooOO0 == 2 || !z11 || (z11 && (view.getMeasuredWidth() == constraintWidget.OooOoO0())) || (view instanceof Placeholder) || constraintWidget.Oooo0O0()) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.OooOOo(), 1073741824);
                            }
                        }
                    }
                    oooO0o = (OooO0o) constraintWidget.f6948OoooOOo;
                    if (oooO0o != null && OooOO0O.OooO0O0(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.OooOoO0() && view.getMeasuredWidth() < oooO0o.OooOoO0() && view.getMeasuredHeight() == constraintWidget.OooOOo() && view.getMeasuredHeight() < oooO0o.OooOOo() && view.getBaseline() == constraintWidget.f6955OooooOO && !constraintWidget.Oooo00o()) {
                        if (OooO0OO(constraintWidget.f6936Oooo0O0, iMakeMeasureSpec, constraintWidget.OooOoO0()) || !OooO0OO(constraintWidget.f6937Oooo0OO, iMakeMeasureSpec3, constraintWidget.OooOOo())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            oooO00o.f27843OooO0o0 = constraintWidget.OooOoO0();
                            oooO00o.f27842OooO0o = constraintWidget.OooOOo();
                            oooO00o.f27844OooO0oO = constraintWidget.f6955OooooOO;
                            return;
                        }
                    }
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if (dimensionBehaviour4 != dimensionBehaviour2 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour3 != dimensionBehaviour2 || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z || constraintWidget.f6951OoooOoo <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z2 || constraintWidget.f6951OoooOoo <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    i = oooO00o.f27846OooOO0;
                    if (i == 1 && i != 2 && z && constraintWidget.f6921OooOo00 == 0 && z2 && constraintWidget.f6920OooOo0 == 0) {
                        i6 = -1;
                        baseline = 0;
                        iMin = 0;
                        iMin2 = 0;
                    } else {
                        if ((view instanceof VirtualLayout) || !(constraintWidget instanceof OooOOO)) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        } else {
                            ((VirtualLayout) view).OooOo0((OooOOO) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec3);
                        }
                        constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec;
                        constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                        constraintWidget.f6907OooO0oO = false;
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        i2 = constraintWidget.f6923OooOo0o;
                        if (i2 > 0) {
                            iMin = Math.max(i2, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i3 = constraintWidget.f6919OooOo;
                        if (i3 > 0) {
                            iMin = Math.min(i3, iMin);
                        }
                        i4 = constraintWidget.f6924OooOoO;
                        if (i4 > 0) {
                            iMin2 = Math.max(i4, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i5 = constraintWidget.f6926OooOoOO;
                        if (i5 > 0) {
                            iMin2 = Math.min(i5, iMin2);
                        }
                        if (!OooOO0O.OooO0O0(ConstraintLayout.this.mOptimizationLevel, 1)) {
                            if (!z5 && z3) {
                                iMin = (int) ((iMin2 * constraintWidget.f6951OoooOoo) + 0.5f);
                            } else if (z6 && z4) {
                                iMin2 = (int) ((iMin / constraintWidget.f6951OoooOoo) + 0.5f);
                            }
                        }
                        if (measuredWidth == iMin || measuredHeight != iMin2) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec4 = iMakeMeasureSpec;
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                            }
                            iMakeMeasureSpec4 = iMakeMeasureSpec;
                            view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                            constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec4;
                            constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                            constraintWidget.f6907OooO0oO = false;
                            int measuredWidth2 = view.getMeasuredWidth();
                            int measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            iMin = measuredWidth2;
                            iMin2 = measuredHeight2;
                            i6 = -1;
                        } else {
                            baseline = baseline2;
                            i6 = -1;
                        }
                    }
                    if (baseline != i6) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (iMin == oooO00o.f27840OooO0OO || iMin2 != oooO00o.f27841OooO0Oo) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    oooO00o.f27837OooO = z8;
                    if (layoutParams.f7550Ooooo0o) {
                        z7 = true;
                    }
                    if (z7 && baseline != -1 && constraintWidget.f6955OooooOO != baseline) {
                        oooO00o.f27837OooO = true;
                    }
                    oooO00o.f27843OooO0o0 = iMin;
                    oooO00o.f27842OooO0o = iMin2;
                    oooO00o.f27845OooO0oo = z7;
                    oooO00o.f27844OooO0oO = baseline;
                }
                int i17 = this.f7574OooO0oO;
                int i18 = constraintWidget.f6939Oooo0o0 != null ? constraintWidget.f6938Oooo0o.f6897OooO0oO + 0 : 0;
                if (constraintWidget.f6940Oooo0oO != null) {
                    i18 += constraintWidget.f6941Oooo0oo.f6897OooO0oO;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i9 + i18, -1);
            }
            iMakeMeasureSpec3 = iMakeMeasureSpec2;
            oooO0o = (OooO0o) constraintWidget.f6948OoooOOo;
            if (oooO0o != null) {
                if (OooO0OO(constraintWidget.f6936Oooo0O0, iMakeMeasureSpec, constraintWidget.OooOoO0())) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    oooO00o.f27843OooO0o0 = constraintWidget.OooOoO0();
                    oooO00o.f27842OooO0o = constraintWidget.OooOOo();
                    oooO00o.f27844OooO0oO = constraintWidget.f6955OooooOO;
                    return;
                }
            }
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour3 == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (dimensionBehaviour4 == dimensionBehaviour) {
                z2 = true;
            } else {
                z2 = false;
            }
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (view == null) {
                return;
            }
            layoutParams = (LayoutParams) view.getLayoutParams();
            i = oooO00o.f27846OooOO0;
            if (i == 1) {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                }
                constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec;
                constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                constraintWidget.f6907OooO0oO = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline3 = view.getBaseline();
                i2 = constraintWidget.f6923OooOo0o;
                if (i2 > 0) {
                    iMin = Math.max(i2, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i3 = constraintWidget.f6919OooOo;
                if (i3 > 0) {
                    iMin = Math.min(i3, iMin);
                }
                i4 = constraintWidget.f6924OooOoO;
                if (i4 > 0) {
                    iMin2 = Math.max(i4, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i5 = constraintWidget.f6926OooOoOO;
                if (i5 > 0) {
                    iMin2 = Math.min(i5, iMin2);
                }
                if (!OooOO0O.OooO0O0(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z5) {
                        if (z6) {
                            iMin2 = (int) ((iMin / constraintWidget.f6951OoooOoo) + 0.5f);
                        }
                    } else if (z6) {
                        iMin2 = (int) ((iMin / constraintWidget.f6951OoooOoo) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec4 = iMakeMeasureSpec;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    iMakeMeasureSpec4 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec4;
                    constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                    constraintWidget.f6907OooO0oO = false;
                    int measuredWidth3 = view.getMeasuredWidth();
                    int measuredHeight3 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth3;
                    iMin2 = measuredHeight3;
                    i6 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec4 = iMakeMeasureSpec;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    iMakeMeasureSpec4 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec4;
                    constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                    constraintWidget.f6907OooO0oO = false;
                    int measuredWidth4 = view.getMeasuredWidth();
                    int measuredHeight4 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth4;
                    iMin2 = measuredHeight4;
                    i6 = -1;
                }
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                }
                constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec;
                constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                constraintWidget.f6907OooO0oO = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline4 = view.getBaseline();
                i2 = constraintWidget.f6923OooOo0o;
                if (i2 > 0) {
                    iMin = Math.max(i2, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i3 = constraintWidget.f6919OooOo;
                if (i3 > 0) {
                    iMin = Math.min(i3, iMin);
                }
                i4 = constraintWidget.f6924OooOoO;
                if (i4 > 0) {
                    iMin2 = Math.max(i4, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i5 = constraintWidget.f6926OooOoOO;
                if (i5 > 0) {
                    iMin2 = Math.min(i5, iMin2);
                }
                if (!OooOO0O.OooO0O0(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z5) {
                        if (z6) {
                            iMin2 = (int) ((iMin / constraintWidget.f6951OoooOoo) + 0.5f);
                        }
                    } else if (z6) {
                        iMin2 = (int) ((iMin / constraintWidget.f6951OoooOoo) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec4 = iMakeMeasureSpec;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    iMakeMeasureSpec4 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec4;
                    constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                    constraintWidget.f6907OooO0oO = false;
                    int measuredWidth5 = view.getMeasuredWidth();
                    int measuredHeight5 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth5;
                    iMin2 = measuredHeight5;
                    i6 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec4 = iMakeMeasureSpec;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                    }
                    iMakeMeasureSpec4 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    constraintWidget.f6936Oooo0O0 = iMakeMeasureSpec4;
                    constraintWidget.f6937Oooo0OO = iMakeMeasureSpec3;
                    constraintWidget.f6907OooO0oO = false;
                    int measuredWidth6 = view.getMeasuredWidth();
                    int measuredHeight6 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth6;
                    iMin2 = measuredHeight6;
                    i6 = -1;
                }
            }
            if (baseline != i6) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (iMin == oooO00o.f27840OooO0OO) {
                z8 = true;
            } else {
                z8 = true;
            }
            oooO00o.f27837OooO = z8;
            if (layoutParams.f7550Ooooo0o) {
                z7 = true;
            }
            if (z7) {
                oooO00o.f27837OooO = true;
            }
            oooO00o.f27843OooO0o0 = iMin;
            oooO00o.f27842OooO0o = iMin2;
            oooO00o.f27845OooO0oo = z7;
            oooO00o.f27844OooO0oO = baseline;
        }

        public final boolean OooO0OO(int i, int i2, int i3) {
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
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new OooO0o();
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

    public static androidx.constraintlayout.widget.OooO0O0 getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new androidx.constraintlayout.widget.OooO0O0();
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
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f7563o00ooo;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        OooO0o oooO0o = this.mLayoutWidget;
        oooO0o.f6960Ooooooo = this;
        oooO0o.oo000o(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == o000O00.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == o000O00.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == o000O00.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == o000O00.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == o000O00.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == o000O00.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == o000O00.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
                        this.mConstraintSet = oooO00o;
                        oooO00o.OooOO0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.o00oO0o(this.mOptimizationLevel);
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
        String str;
        int iOooOO0O;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.Oooo0OO();
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
                    getTargetWidget(childAt.getId()).f6962o00O0O = resourceName;
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
        androidx.constraintlayout.widget.OooO00o oooO00o = this.mConstraintSet;
        if (oooO00o != null) {
            oooO00o.OooO0OO(this);
        }
        this.mLayoutWidget.OooooOo();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i4);
                if (constraintHelper.isInEditMode()) {
                    constraintHelper.setIds(constraintHelper.f7495OoooO00);
                }
                p058o0000OoO.OooOO0O oooOO0O = constraintHelper.f7489Oooo;
                if (oooOO0O != null) {
                    oooOO0O.OooO00o();
                    for (int i5 = 0; i5 < constraintHelper.f7491Oooo0oO; i5++) {
                        int i6 = constraintHelper.f7490Oooo0o[i5];
                        View viewById = getViewById(i6);
                        if (viewById == null && (iOooOO0O = constraintHelper.OooOO0O(this, (str = constraintHelper.f7493OoooO.get(Integer.valueOf(i6))))) != 0) {
                            constraintHelper.f7490Oooo0o[i5] = iOooOO0O;
                            constraintHelper.f7493OoooO.put(Integer.valueOf(iOooOO0O), str);
                            viewById = getViewById(iOooOO0O);
                        }
                        if (viewById != null) {
                            constraintHelper.f7489Oooo.OooO0O0(getViewWidget(viewById));
                        }
                    }
                    constraintHelper.f7489Oooo.OooO0OO();
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            if (childAt3 instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt3;
                if (placeholder.f7724Oooo0o == -1 && !placeholder.isInEditMode()) {
                    placeholder.setVisibility(placeholder.f7726Oooo0oo);
                }
                View viewFindViewById = findViewById(placeholder.f7724Oooo0o);
                placeholder.f7725Oooo0oO = viewFindViewById;
                if (viewFindViewById != null) {
                    ((LayoutParams) viewFindViewById.getLayoutParams()).f7553OooooOo = true;
                    placeholder.f7725Oooo0oO.setVisibility(0);
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
                this.mLayoutWidget.OooO0O0(viewWidget2);
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
        layoutParams.f7550Ooooo0o = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f7550Ooooo0o = true;
            layoutParams2.f7563o00ooo.f6934Oooo00O = true;
        }
        constraintWidget.OooOOOO(type2).OooO0O0(constraintWidget2.OooOOOO(type), layoutParams.f7526OooOooO, layoutParams.f7524OooOoo, true);
        constraintWidget.f6934Oooo00O = true;
        constraintWidget.OooOOOO(ConstraintAnchor.Type.TOP).OooOO0O();
        constraintWidget.OooOOOO(ConstraintAnchor.Type.BOTTOM).OooOO0O();
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
        constraintWidget.f6969o0OoOo0 = view.getVisibility();
        if (layoutParams.f7553OooooOo) {
            constraintWidget.f6935Oooo00o = true;
            constraintWidget.f6969o0OoOo0 = 8;
        }
        constraintWidget.f6960Ooooooo = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).OooOOOo(constraintWidget, this.mLayoutWidget.f7057o000OOo);
        }
        if (layoutParams.f7551OooooO0) {
            OooOO0 oooOO1 = (OooOO0) constraintWidget;
            int i2 = layoutParams.f7560o00Oo0;
            int i3 = layoutParams.f7561o00Ooo;
            float f = layoutParams.f7562o00o0O;
            if (f != -1.0f) {
                if (f > -1.0f) {
                    oooOO1.f7065o0OOO0o = f;
                    oooOO1.f7066o0Oo0oo = -1;
                    oooOO1.f7064o0OO00O = -1;
                    return;
                }
                return;
            }
            if (i2 != -1) {
                if (i2 > -1) {
                    oooOO1.f7065o0OOO0o = -1.0f;
                    oooOO1.f7066o0Oo0oo = i2;
                    oooOO1.f7064o0OO00O = -1;
                    return;
                }
                return;
            }
            if (i3 == -1 || i3 <= -1) {
                return;
            }
            oooOO1.f7065o0OOO0o = -1.0f;
            oooOO1.f7066o0Oo0oo = -1;
            oooOO1.f7064o0OO00O = i3;
            return;
        }
        int i4 = layoutParams.f7555Oooooo0;
        int i5 = layoutParams.f7554Oooooo;
        int i6 = layoutParams.f7556OoooooO;
        int i7 = layoutParams.f7557Ooooooo;
        int i8 = layoutParams.f7564o0OoOo0;
        int i9 = layoutParams.f7565ooOO;
        float f2 = layoutParams.f7559o00O0O;
        int i10 = layoutParams.f7512OooOOOo;
        if (i10 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i10);
            if (constraintWidget6 != null) {
                float f3 = layoutParams.f7513OooOOo;
                int i11 = layoutParams.f7514OooOOo0;
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                constraintWidget.OooOooO(type, constraintWidget6, type, i11, 0);
                constraintWidget.f6933Oooo000 = f3;
            }
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i4);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                    constraintWidget.OooOooO(type2, constraintWidget7, type2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                constraintWidget.OooOooO(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i6);
                if (constraintWidget8 != null) {
                    constraintWidget.OooOooO(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.OooOooO(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i12 = layoutParams.f7497OooO;
            if (i12 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i12);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                    constraintWidget.OooOooO(type4, constraintWidget9, type4, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f7516OooOo);
                }
            } else {
                int i13 = layoutParams.f7506OooOO0;
                if (i13 != -1 && (constraintWidget4 = sparseArray.get(i13)) != null) {
                    constraintWidget.OooOooO(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f7516OooOo);
                }
            }
            int i14 = layoutParams.f7507OooOO0O;
            if (i14 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i14);
                if (constraintWidget10 != null) {
                    constraintWidget.OooOooO(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f7521OooOoO);
                }
            } else {
                int i15 = layoutParams.f7508OooOO0o;
                if (i15 != -1 && (constraintWidget5 = sparseArray.get(i15)) != null) {
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.OooOooO(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f7521OooOoO);
                }
            }
            int i16 = layoutParams.f7510OooOOO0;
            if (i16 != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i16, ConstraintAnchor.Type.BASELINE);
            } else {
                int i17 = layoutParams.f7509OooOOO;
                if (i17 != -1) {
                    setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i17, ConstraintAnchor.Type.TOP);
                } else {
                    int i18 = layoutParams.f7511OooOOOO;
                    if (i18 != -1) {
                        setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i18, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                constraintWidget.f6957Oooooo = f2;
            }
            float f4 = layoutParams.f7530Oooo000;
            if (f4 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                constraintWidget.f6959OoooooO = f4;
            }
        }
        if (z && ((i = layoutParams.f7539OoooO) != -1 || layoutParams.f7543OoooOO0 != -1)) {
            int i19 = layoutParams.f7543OoooOO0;
            constraintWidget.f6953Ooooo0o = i;
            constraintWidget.f6954OooooO0 = i19;
        }
        if (layoutParams.f7548OoooOoo) {
            constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.Ooooo00(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.f7544OoooOOO) {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.OooOOOO(ConstraintAnchor.Type.LEFT).f6897OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget.OooOOOO(ConstraintAnchor.Type.RIGHT).f6897OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget.o000oOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.Ooooo00(0);
        }
        if (layoutParams.f7549Ooooo00) {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.OoooOO0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f7545OoooOOo) {
                constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.OooOOOO(ConstraintAnchor.Type.TOP).f6897OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget.OooOOOO(ConstraintAnchor.Type.BOTTOM).f6897OooO0oO = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget.OoooOoO(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.OoooOO0(0);
        }
        constraintWidget.OoooO0(layoutParams.f7531Oooo00O);
        float f5 = layoutParams.f7532Oooo00o;
        float[] fArr = constraintWidget.f6968o00ooo;
        fArr[0] = f5;
        fArr[1] = layoutParams.f7529Oooo0;
        constraintWidget.f6964o00Ooo = layoutParams.f7533Oooo0O0;
        constraintWidget.f6965o00o0O = layoutParams.f7534Oooo0OO;
        int i20 = layoutParams.f7547OoooOoO;
        if (i20 >= 0 && i20 <= 3) {
            constraintWidget.f6918OooOOoo = i20;
        }
        constraintWidget.OoooOOO(layoutParams.f7536Oooo0o0, layoutParams.f7537Oooo0oO, layoutParams.f7528Oooo, layoutParams.f7540OoooO0);
        constraintWidget.OoooOoo(layoutParams.f7535Oooo0o, layoutParams.f7538Oooo0oo, layoutParams.f7541OoooO00, layoutParams.f7542OoooO0O);
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
                        paint.setColor(bl.a);
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

    public void fillMetrics(o0000OOO.OooO0O0 oooO0O0) {
        Objects.requireNonNull(this.mLayoutWidget.f7043o000000);
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
        return this.mLayoutWidget.f7049o00000Oo;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f6911OooOO0o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f6911OooOO0o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f6911OooOO0o = "parent";
            }
        }
        OooO0o oooO0o = this.mLayoutWidget;
        if (oooO0o.f6962o00O0O == null) {
            oooO0o.f6962o00O0O = oooO0o.f6911OooOO0o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" setDebugName ");
            sbOooO0o0.append(this.mLayoutWidget.f6962o00O0O);
            Log.v(TAG, sbOooO0o0.toString());
        }
        for (ConstraintWidget constraintWidget : this.mLayoutWidget.f27656o0OOO0o) {
            View view = (View) constraintWidget.f6960Ooooooo;
            if (view != null) {
                if (constraintWidget.f6911OooOO0o == null && (id = view.getId()) != -1) {
                    constraintWidget.f6911OooOO0o = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.f6962o00O0O == null) {
                    constraintWidget.f6962o00O0O = constraintWidget.f6911OooOO0o;
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(" setDebugName ");
                    sbOooO0o1.append(constraintWidget.f6962o00O0O);
                    Log.v(TAG, sbOooO0o1.toString());
                }
            }
        }
        this.mLayoutWidget.OooOo0O(sb);
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
            return ((LayoutParams) view.getLayoutParams()).f7563o00ooo;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f7563o00ooo;
        }
        return null;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new o000O000(getContext(), this, i);
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
            ConstraintWidget constraintWidget = layoutParams.f7563o00ooo;
            if ((childAt.getVisibility() != 8 || layoutParams.f7551OooooO0 || layoutParams.f7552OooooOO || zIsInEditMode) && !layoutParams.f7553OooooOo) {
                int iOooOoO = constraintWidget.OooOoO();
                int iOooOoOO = constraintWidget.OooOoOO();
                int iOooOoO0 = constraintWidget.OooOoO0() + iOooOoO;
                int iOooOOo = constraintWidget.OooOOo() + iOooOoOO;
                childAt.layout(iOooOoO, iOooOoOO, iOooOoO0, iOooOOo);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iOooOoO, iOooOoOO, iOooOoO0, iOooOOo);
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
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f7057o000OOo = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.o00oO0O();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int iOooOoO0 = this.mLayoutWidget.OooOoO0();
        int iOooOOo = this.mLayoutWidget.OooOOo();
        OooO0o oooO0o = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, iOooOoO0, iOooOOo, oooO0o.f7050o00000o0, oooO0o.f7054o0000Ooo);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof OooOO0)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            OooOO0 oooOO1 = new OooOO0();
            layoutParams.f7563o00ooo = oooOO1;
            layoutParams.f7551OooooO0 = true;
            oooOO1.OooooOo(layoutParams.f7558o000oOoO);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.OooOo00();
            ((LayoutParams) view.getLayoutParams()).f7552OooooOO = true;
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
        this.mLayoutWidget.f27656o0OOO0o.remove(viewWidget);
        viewWidget.Oooo0OO();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new o000O000(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i5 = oooO0O0.f7573OooO0o0;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + oooO0O0.f7571OooO0Oo, i, 0);
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

    public void resolveSystem(OooO0o oooO0o, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        OooO0O0 oooO0O0 = this.mMeasurer;
        oooO0O0.f7569OooO0O0 = iMax;
        oooO0O0.f7570OooO0OO = iMax2;
        oooO0O0.f7571OooO0Oo = paddingWidth;
        oooO0O0.f7573OooO0o0 = i4;
        oooO0O0.f7572OooO0o = i2;
        oooO0O0.f7574OooO0oO = i3;
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
        oooO0o.o00Ooo(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.OooO00o oooO00o) {
        this.mConstraintSet = oooO00o;
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

    public void setOnConstraintsChanged(o000O0o o000o0o2) {
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.o00oO0o(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(OooO0o oooO0o, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        OooO0O0 oooO0O0 = this.mMeasurer;
        int i5 = oooO0O0.f7573OooO0o0;
        int i6 = oooO0O0.f7571OooO0Oo;
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
        if (i2 != oooO0o.OooOoO0() || i4 != oooO0o.OooOOo()) {
            oooO0o.f7059o0OO00O.f27851OooO0OO = true;
        }
        oooO0o.f6953Ooooo0o = 0;
        oooO0o.f6954OooooO0 = 0;
        int i7 = this.mMaxWidth - i6;
        int[] iArr = oooO0o.f6930OooOooo;
        iArr[0] = i7;
        iArr[1] = this.mMaxHeight - i5;
        oooO0o.OoooOo0(0);
        oooO0o.OoooOOo(0);
        oooO0o.o000oOoO(dimensionBehaviour);
        oooO0o.Ooooo00(i2);
        oooO0o.OoooOoO(dimensionBehaviour2);
        oooO0o.OoooOO0(i4);
        oooO0o.OoooOo0(this.mMinWidth - i6);
        oooO0o.OoooOOo(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        o000O000 o000o001 = this.mConstraintLayoutSpec;
        if (o000o001 != null) {
            o000o001.OooO0O0(i, i2, i3);
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
        this.mLayoutWidget = new OooO0o();
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
        this.mLayoutWidget = new OooO0o();
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
        this.mLayoutWidget = new OooO0o();
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
        public int f7497OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7498OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7499OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f7500OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7501OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7502OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7503OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7504OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f7505OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f7506OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f7507OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f7508OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f7509OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7510OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f7511OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f7512OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public float f7513OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f7514OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f7515OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f7516OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f7517OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f7518OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f7519OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f7520OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f7521OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f7522OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f7523OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f7524OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f7525OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f7526OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public float f7527OooOooo;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f7528Oooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public float f7529Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public float f7530Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public String f7531Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public float f7532Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f7533Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f7534Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f7535Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f7536Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f7537Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f7538Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f7539OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public float f7540OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f7541OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public float f7542OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f7543OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public boolean f7544OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public boolean f7545OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public String f7546OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f7547OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public boolean f7548OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public boolean f7549Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public boolean f7550Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public boolean f7551OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public boolean f7552OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public boolean f7553OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f7554Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f7555Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f7556OoooooO;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int f7557Ooooooo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f7558o000oOoO;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public float f7559o00O0O;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public int f7560o00Oo0;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public int f7561o00Ooo;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public float f7562o00o0O;

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public ConstraintWidget f7563o00ooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public int f7564o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public int f7565ooOO;

        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final SparseIntArray f7566OooO00o;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f7566OooO00o = sparseIntArray;
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(o000O00.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7498OooO00o = -1;
            this.f7499OooO0O0 = -1;
            this.f7500OooO0OO = -1.0f;
            this.f7501OooO0Oo = true;
            this.f7503OooO0o0 = -1;
            this.f7502OooO0o = -1;
            this.f7504OooO0oO = -1;
            this.f7505OooO0oo = -1;
            this.f7497OooO = -1;
            this.f7506OooOO0 = -1;
            this.f7507OooOO0O = -1;
            this.f7508OooOO0o = -1;
            this.f7510OooOOO0 = -1;
            this.f7509OooOOO = -1;
            this.f7511OooOOOO = -1;
            this.f7512OooOOOo = -1;
            this.f7514OooOOo0 = 0;
            this.f7513OooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7515OooOOoo = -1;
            this.f7518OooOo00 = -1;
            this.f7517OooOo0 = -1;
            this.f7519OooOo0O = -1;
            this.f7520OooOo0o = Integer.MIN_VALUE;
            this.f7516OooOo = Integer.MIN_VALUE;
            this.f7522OooOoO0 = Integer.MIN_VALUE;
            this.f7521OooOoO = Integer.MIN_VALUE;
            this.f7523OooOoOO = Integer.MIN_VALUE;
            this.f7525OooOoo0 = Integer.MIN_VALUE;
            this.f7524OooOoo = Integer.MIN_VALUE;
            this.f7526OooOooO = 0;
            this.f7527OooOooo = 0.5f;
            this.f7530Oooo000 = 0.5f;
            this.f7531Oooo00O = null;
            this.f7532Oooo00o = -1.0f;
            this.f7529Oooo0 = -1.0f;
            this.f7533Oooo0O0 = 0;
            this.f7534Oooo0OO = 0;
            this.f7536Oooo0o0 = 0;
            this.f7535Oooo0o = 0;
            this.f7537Oooo0oO = 0;
            this.f7538Oooo0oo = 0;
            this.f7528Oooo = 0;
            this.f7541OoooO00 = 0;
            this.f7540OoooO0 = 1.0f;
            this.f7542OoooO0O = 1.0f;
            this.f7539OoooO = -1;
            this.f7543OoooOO0 = -1;
            this.f7558o000oOoO = -1;
            this.f7544OoooOOO = false;
            this.f7545OoooOOo = false;
            this.f7546OoooOo0 = null;
            this.f7547OoooOoO = 0;
            this.f7548OoooOoo = true;
            this.f7549Ooooo00 = true;
            this.f7550Ooooo0o = false;
            this.f7551OooooO0 = false;
            this.f7552OooooOO = false;
            this.f7553OooooOo = false;
            this.f7555Oooooo0 = -1;
            this.f7554Oooooo = -1;
            this.f7556OoooooO = -1;
            this.f7557Ooooooo = -1;
            this.f7564o0OoOo0 = Integer.MIN_VALUE;
            this.f7565ooOO = Integer.MIN_VALUE;
            this.f7559o00O0O = 0.5f;
            this.f7563o00ooo = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = OooO00o.f7566OooO00o.get(index);
                switch (i2) {
                    case 1:
                        this.f7558o000oOoO = typedArrayObtainStyledAttributes.getInt(index, this.f7558o000oOoO);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7512OooOOOo);
                        this.f7512OooOOOo = resourceId;
                        if (resourceId == -1) {
                            this.f7512OooOOOo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f7514OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7514OooOOo0);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f7513OooOOo) % 360.0f;
                        this.f7513OooOOo = f;
                        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            this.f7513OooOOo = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f7498OooO00o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7498OooO00o);
                        break;
                    case 6:
                        this.f7499OooO0O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7499OooO0O0);
                        break;
                    case 7:
                        this.f7500OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f7500OooO0OO);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7503OooO0o0);
                        this.f7503OooO0o0 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f7503OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7502OooO0o);
                        this.f7502OooO0o = resourceId3;
                        if (resourceId3 == -1) {
                            this.f7502OooO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7504OooO0oO);
                        this.f7504OooO0oO = resourceId4;
                        if (resourceId4 == -1) {
                            this.f7504OooO0oO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7505OooO0oo);
                        this.f7505OooO0oo = resourceId5;
                        if (resourceId5 == -1) {
                            this.f7505OooO0oo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7497OooO);
                        this.f7497OooO = resourceId6;
                        if (resourceId6 == -1) {
                            this.f7497OooO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7506OooOO0);
                        this.f7506OooOO0 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f7506OooOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7507OooOO0O);
                        this.f7507OooOO0O = resourceId8;
                        if (resourceId8 == -1) {
                            this.f7507OooOO0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7508OooOO0o);
                        this.f7508OooOO0o = resourceId9;
                        if (resourceId9 == -1) {
                            this.f7508OooOO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7510OooOOO0);
                        this.f7510OooOOO0 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f7510OooOOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7515OooOOoo);
                        this.f7515OooOOoo = resourceId11;
                        if (resourceId11 == -1) {
                            this.f7515OooOOoo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7518OooOo00);
                        this.f7518OooOo00 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f7518OooOo00 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7517OooOo0);
                        this.f7517OooOo0 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f7517OooOo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7519OooOo0O);
                        this.f7519OooOo0O = resourceId14;
                        if (resourceId14 == -1) {
                            this.f7519OooOo0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f7520OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7520OooOo0o);
                        break;
                    case 22:
                        this.f7516OooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7516OooOo);
                        break;
                    case 23:
                        this.f7522OooOoO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7522OooOoO0);
                        break;
                    case 24:
                        this.f7521OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7521OooOoO);
                        break;
                    case 25:
                        this.f7523OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7523OooOoOO);
                        break;
                    case 26:
                        this.f7525OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7525OooOoo0);
                        break;
                    case 27:
                        this.f7544OoooOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7544OoooOOO);
                        break;
                    case 28:
                        this.f7545OoooOOo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7545OoooOOo);
                        break;
                    case 29:
                        this.f7527OooOooo = typedArrayObtainStyledAttributes.getFloat(index, this.f7527OooOooo);
                        break;
                    case 30:
                        this.f7530Oooo000 = typedArrayObtainStyledAttributes.getFloat(index, this.f7530Oooo000);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f7536Oooo0o0 = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f7535Oooo0o = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f7537Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7537Oooo0oO);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f7537Oooo0oO) == -2) {
                                this.f7537Oooo0oO = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f7528Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7528Oooo);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f7528Oooo) == -2) {
                                this.f7528Oooo = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f7540OoooO0 = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, typedArrayObtainStyledAttributes.getFloat(index, this.f7540OoooO0));
                        this.f7536Oooo0o0 = 2;
                        break;
                    case 36:
                        try {
                            this.f7538Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7538Oooo0oo);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f7538Oooo0oo) == -2) {
                                this.f7538Oooo0oo = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f7541OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7541OoooO00);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f7541OoooO00) == -2) {
                                this.f7541OoooO00 = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f7542OoooO0O = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, typedArrayObtainStyledAttributes.getFloat(index, this.f7542OoooO0O));
                        this.f7535Oooo0o = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.OooO00o.OooOOO(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f7532Oooo00o = typedArrayObtainStyledAttributes.getFloat(index, this.f7532Oooo00o);
                                break;
                            case 46:
                                this.f7529Oooo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7529Oooo0);
                                break;
                            case 47:
                                this.f7533Oooo0O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f7534Oooo0OO = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f7539OoooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7539OoooO);
                                break;
                            case 50:
                                this.f7543OoooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f7543OoooOO0);
                                break;
                            case 51:
                                this.f7546OoooOo0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7509OooOOO);
                                this.f7509OooOOO = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f7509OooOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7511OooOOOO);
                                this.f7511OooOOOO = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f7511OooOOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f7526OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7526OooOooO);
                                break;
                            case 55:
                                this.f7524OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f7524OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.OooO00o.OooOOO0(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.OooO00o.OooOOO0(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f7547OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f7547OoooOoO);
                                        break;
                                    case 67:
                                        this.f7501OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7501OooO0Oo);
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
            this.f7551OooooO0 = false;
            this.f7548OoooOoo = true;
            this.f7549Ooooo00 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f7544OoooOOO) {
                this.f7548OoooOoo = false;
                if (this.f7536Oooo0o0 == 0) {
                    this.f7536Oooo0o0 = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f7545OoooOOo) {
                this.f7549Ooooo00 = false;
                if (this.f7535Oooo0o == 0) {
                    this.f7535Oooo0o = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f7548OoooOoo = false;
                if (i == 0 && this.f7536Oooo0o0 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f7544OoooOOO = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f7549Ooooo00 = false;
                if (i2 == 0 && this.f7535Oooo0o == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f7545OoooOOo = true;
                }
            }
            if (this.f7500OooO0OO == -1.0f && this.f7498OooO00o == -1 && this.f7499OooO0O0 == -1) {
                return;
            }
            this.f7551OooooO0 = true;
            this.f7548OoooOoo = true;
            this.f7549Ooooo00 = true;
            if (!(this.f7563o00ooo instanceof OooOO0)) {
                this.f7563o00ooo = new OooOO0();
            }
            ((OooOO0) this.f7563o00ooo).OooooOo(this.f7558o000oOoO);
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
            this.f7556OoooooO = -1;
            this.f7557Ooooooo = -1;
            this.f7555Oooooo0 = -1;
            this.f7554Oooooo = -1;
            this.f7564o0OoOo0 = this.f7520OooOo0o;
            this.f7565ooOO = this.f7522OooOoO0;
            float f = this.f7527OooOooo;
            this.f7559o00O0O = f;
            int i8 = this.f7498OooO00o;
            this.f7560o00Oo0 = i8;
            int i9 = this.f7499OooO0O0;
            this.f7561o00Ooo = i9;
            float f2 = this.f7500OooO0OO;
            this.f7562o00o0O = f2;
            if (z2) {
                int i10 = this.f7515OooOOoo;
                if (i10 != -1) {
                    this.f7556OoooooO = i10;
                } else {
                    int i11 = this.f7518OooOo00;
                    if (i11 != -1) {
                        this.f7557Ooooooo = i11;
                    } else {
                        i2 = this.f7517OooOo0;
                        if (i2 != -1) {
                            this.f7554Oooooo = i2;
                            z = true;
                        }
                        i3 = this.f7519OooOo0O;
                        if (i3 != -1) {
                            this.f7555Oooooo0 = i3;
                            z = true;
                        }
                        i4 = this.f7523OooOoOO;
                        if (i4 != Integer.MIN_VALUE) {
                            this.f7565ooOO = i4;
                        }
                        i5 = this.f7525OooOoo0;
                        if (i5 != Integer.MIN_VALUE) {
                            this.f7564o0OoOo0 = i5;
                        }
                        if (z) {
                            this.f7559o00O0O = 1.0f - f;
                        }
                        if (this.f7551OooooO0 && this.f7558o000oOoO == 1 && this.f7501OooO0Oo) {
                            if (f2 != -1.0f) {
                                this.f7562o00o0O = 1.0f - f2;
                                this.f7560o00Oo0 = -1;
                                this.f7561o00Ooo = -1;
                            } else if (i8 != -1) {
                                this.f7561o00Ooo = i8;
                                this.f7560o00Oo0 = -1;
                                this.f7562o00o0O = -1.0f;
                            } else if (i9 != -1) {
                                this.f7560o00Oo0 = i9;
                                this.f7561o00Ooo = -1;
                                this.f7562o00o0O = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.f7517OooOo0;
                if (i2 != -1) {
                    this.f7554Oooooo = i2;
                    z = true;
                }
                i3 = this.f7519OooOo0O;
                if (i3 != -1) {
                    this.f7555Oooooo0 = i3;
                    z = true;
                }
                i4 = this.f7523OooOoOO;
                if (i4 != Integer.MIN_VALUE) {
                    this.f7565ooOO = i4;
                }
                i5 = this.f7525OooOoo0;
                if (i5 != Integer.MIN_VALUE) {
                    this.f7564o0OoOo0 = i5;
                }
                if (z) {
                    this.f7559o00O0O = 1.0f - f;
                }
                if (this.f7551OooooO0) {
                    if (f2 != -1.0f) {
                        this.f7562o00o0O = 1.0f - f2;
                        this.f7560o00Oo0 = -1;
                        this.f7561o00Ooo = -1;
                    } else if (i8 != -1) {
                        this.f7561o00Ooo = i8;
                        this.f7560o00Oo0 = -1;
                        this.f7562o00o0O = -1.0f;
                    } else if (i9 != -1) {
                        this.f7560o00Oo0 = i9;
                        this.f7561o00Ooo = -1;
                        this.f7562o00o0O = -1.0f;
                    }
                }
            } else {
                int i12 = this.f7515OooOOoo;
                if (i12 != -1) {
                    this.f7554Oooooo = i12;
                }
                int i13 = this.f7518OooOo00;
                if (i13 != -1) {
                    this.f7555Oooooo0 = i13;
                }
                int i14 = this.f7517OooOo0;
                if (i14 != -1) {
                    this.f7556OoooooO = i14;
                }
                int i15 = this.f7519OooOo0O;
                if (i15 != -1) {
                    this.f7557Ooooooo = i15;
                }
                int i16 = this.f7523OooOoOO;
                if (i16 != Integer.MIN_VALUE) {
                    this.f7564o0OoOo0 = i16;
                }
                int i17 = this.f7525OooOoo0;
                if (i17 != Integer.MIN_VALUE) {
                    this.f7565ooOO = i17;
                }
            }
            if (this.f7517OooOo0 == -1 && this.f7519OooOo0O == -1 && this.f7518OooOo00 == -1 && this.f7515OooOOoo == -1) {
                int i18 = this.f7504OooO0oO;
                if (i18 != -1) {
                    this.f7556OoooooO = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f7505OooO0oo;
                    if (i19 != -1) {
                        this.f7557Ooooooo = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f7503OooO0o0;
                if (i20 != -1) {
                    this.f7555Oooooo0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f7502OooO0o;
                if (i21 != -1) {
                    this.f7554Oooooo = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams() {
            super(-2, -2);
            this.f7498OooO00o = -1;
            this.f7499OooO0O0 = -1;
            this.f7500OooO0OO = -1.0f;
            this.f7501OooO0Oo = true;
            this.f7503OooO0o0 = -1;
            this.f7502OooO0o = -1;
            this.f7504OooO0oO = -1;
            this.f7505OooO0oo = -1;
            this.f7497OooO = -1;
            this.f7506OooOO0 = -1;
            this.f7507OooOO0O = -1;
            this.f7508OooOO0o = -1;
            this.f7510OooOOO0 = -1;
            this.f7509OooOOO = -1;
            this.f7511OooOOOO = -1;
            this.f7512OooOOOo = -1;
            this.f7514OooOOo0 = 0;
            this.f7513OooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7515OooOOoo = -1;
            this.f7518OooOo00 = -1;
            this.f7517OooOo0 = -1;
            this.f7519OooOo0O = -1;
            this.f7520OooOo0o = Integer.MIN_VALUE;
            this.f7516OooOo = Integer.MIN_VALUE;
            this.f7522OooOoO0 = Integer.MIN_VALUE;
            this.f7521OooOoO = Integer.MIN_VALUE;
            this.f7523OooOoOO = Integer.MIN_VALUE;
            this.f7525OooOoo0 = Integer.MIN_VALUE;
            this.f7524OooOoo = Integer.MIN_VALUE;
            this.f7526OooOooO = 0;
            this.f7527OooOooo = 0.5f;
            this.f7530Oooo000 = 0.5f;
            this.f7531Oooo00O = null;
            this.f7532Oooo00o = -1.0f;
            this.f7529Oooo0 = -1.0f;
            this.f7533Oooo0O0 = 0;
            this.f7534Oooo0OO = 0;
            this.f7536Oooo0o0 = 0;
            this.f7535Oooo0o = 0;
            this.f7537Oooo0oO = 0;
            this.f7538Oooo0oo = 0;
            this.f7528Oooo = 0;
            this.f7541OoooO00 = 0;
            this.f7540OoooO0 = 1.0f;
            this.f7542OoooO0O = 1.0f;
            this.f7539OoooO = -1;
            this.f7543OoooOO0 = -1;
            this.f7558o000oOoO = -1;
            this.f7544OoooOOO = false;
            this.f7545OoooOOo = false;
            this.f7546OoooOo0 = null;
            this.f7547OoooOoO = 0;
            this.f7548OoooOoo = true;
            this.f7549Ooooo00 = true;
            this.f7550Ooooo0o = false;
            this.f7551OooooO0 = false;
            this.f7552OooooOO = false;
            this.f7553OooooOo = false;
            this.f7555Oooooo0 = -1;
            this.f7554Oooooo = -1;
            this.f7556OoooooO = -1;
            this.f7557Ooooooo = -1;
            this.f7564o0OoOo0 = Integer.MIN_VALUE;
            this.f7565ooOO = Integer.MIN_VALUE;
            this.f7559o00O0O = 0.5f;
            this.f7563o00ooo = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7498OooO00o = -1;
            this.f7499OooO0O0 = -1;
            this.f7500OooO0OO = -1.0f;
            this.f7501OooO0Oo = true;
            this.f7503OooO0o0 = -1;
            this.f7502OooO0o = -1;
            this.f7504OooO0oO = -1;
            this.f7505OooO0oo = -1;
            this.f7497OooO = -1;
            this.f7506OooOO0 = -1;
            this.f7507OooOO0O = -1;
            this.f7508OooOO0o = -1;
            this.f7510OooOOO0 = -1;
            this.f7509OooOOO = -1;
            this.f7511OooOOOO = -1;
            this.f7512OooOOOo = -1;
            this.f7514OooOOo0 = 0;
            this.f7513OooOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7515OooOOoo = -1;
            this.f7518OooOo00 = -1;
            this.f7517OooOo0 = -1;
            this.f7519OooOo0O = -1;
            this.f7520OooOo0o = Integer.MIN_VALUE;
            this.f7516OooOo = Integer.MIN_VALUE;
            this.f7522OooOoO0 = Integer.MIN_VALUE;
            this.f7521OooOoO = Integer.MIN_VALUE;
            this.f7523OooOoOO = Integer.MIN_VALUE;
            this.f7525OooOoo0 = Integer.MIN_VALUE;
            this.f7524OooOoo = Integer.MIN_VALUE;
            this.f7526OooOooO = 0;
            this.f7527OooOooo = 0.5f;
            this.f7530Oooo000 = 0.5f;
            this.f7531Oooo00O = null;
            this.f7532Oooo00o = -1.0f;
            this.f7529Oooo0 = -1.0f;
            this.f7533Oooo0O0 = 0;
            this.f7534Oooo0OO = 0;
            this.f7536Oooo0o0 = 0;
            this.f7535Oooo0o = 0;
            this.f7537Oooo0oO = 0;
            this.f7538Oooo0oo = 0;
            this.f7528Oooo = 0;
            this.f7541OoooO00 = 0;
            this.f7540OoooO0 = 1.0f;
            this.f7542OoooO0O = 1.0f;
            this.f7539OoooO = -1;
            this.f7543OoooOO0 = -1;
            this.f7558o000oOoO = -1;
            this.f7544OoooOOO = false;
            this.f7545OoooOOo = false;
            this.f7546OoooOo0 = null;
            this.f7547OoooOoO = 0;
            this.f7548OoooOoo = true;
            this.f7549Ooooo00 = true;
            this.f7550Ooooo0o = false;
            this.f7551OooooO0 = false;
            this.f7552OooooOO = false;
            this.f7553OooooOo = false;
            this.f7555Oooooo0 = -1;
            this.f7554Oooooo = -1;
            this.f7556OoooooO = -1;
            this.f7557Ooooooo = -1;
            this.f7564o0OoOo0 = Integer.MIN_VALUE;
            this.f7565ooOO = Integer.MIN_VALUE;
            this.f7559o00O0O = 0.5f;
            this.f7563o00ooo = new ConstraintWidget();
        }
    }
}
