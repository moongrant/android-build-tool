package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.yalla.yalla.common.manager.googlepay.PayError;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f5002Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f5003Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f5004Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f5005Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f5006OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f5007OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5008OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f5009OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int[] f5010OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable f5011OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f5012OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f5013OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f5014OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f5015OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int[] f5016o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void OooO0o(Canvas canvas, int i) {
        this.f5011OoooOOO.setBounds(getPaddingLeft() + this.f5015OoooOoo, i, (getWidth() - getPaddingRight()) - this.f5015OoooOoo, this.f5013OoooOo0 + i);
        this.f5011OoooOOO.draw(canvas);
    }

    public final void OooO0oO(Canvas canvas, int i) {
        this.f5011OoooOOO.setBounds(i, getPaddingTop() + this.f5015OoooOoo, this.f5012OoooOOo + i, (getHeight() - getPaddingBottom()) - this.f5015OoooOoo);
        this.f5011OoooOOO.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f5002Oooo;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooOO0O(int i) {
        if (i == 0) {
            return (this.f5014OoooOoO & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f5014OoooOoO & 4) != 0;
        }
        if ((this.f5014OoooOoO & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f5004Oooo0oO < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f5004Oooo0oO;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f5004Oooo0oO == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5005Oooo0oo;
        if (this.f5002Oooo == 1 && (i = this.f5008OoooO00 & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5007OoooO0) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5007OoooO0;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5004Oooo0oO;
    }

    public Drawable getDividerDrawable() {
        return this.f5011OoooOOO;
    }

    public int getDividerPadding() {
        return this.f5015OoooOoo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f5012OoooOOo;
    }

    @GravityInt
    public int getGravity() {
        return this.f5008OoooO00;
    }

    public int getOrientation() {
        return this.f5002Oooo;
    }

    public int getShowDividers() {
        return this.f5014OoooOoO;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5009OoooO0O;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f5011OoooOOO == null) {
            return;
        }
        int i2 = 0;
        if (this.f5002Oooo == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && OooOO0O(i2)) {
                    OooO0o(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f5013OoooOo0);
                }
                i2++;
            }
            if (OooOO0O(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f5013OoooOo0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                }
                OooO0o(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zOooO0O0 = o000O00O.OooO0O0(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && OooOO0O(i2)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                OooO0oO(canvas, zOooO0O0 ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f5012OoooOOo);
            }
            i2++;
        }
        if (OooOO0O(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (zOooO0O0) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.f5012OoooOOo;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zOooO0O0) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f5012OoooOOo;
                right = left - i;
            }
            OooO0oO(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        int i15 = 5;
        if (this.f5002Oooo == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f5008OoooO00;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            if (i18 != 16) {
                paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f5007OoooO0;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f5007OoooO0) / 2);
            }
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, ViewCompat.OooO.OooO0Oo(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i15) {
                            i13 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft2;
                        } else {
                            i11 = paddingRight - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        if (OooOO0O(i20)) {
                            paddingTop += this.f5013OoooOo0;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        int i23 = i22 + 0;
                        childAt.layout(i13, i23, measuredWidth + i13, measuredHeight2 + i23);
                        i20 += 0;
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0 + i22;
                    } else {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i13 = i11 - i12;
                    if (OooOO0O(i20)) {
                        paddingTop += this.f5013OoooOo0;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    int i25 = i24 + 0;
                    childAt.layout(i13, i25, measuredWidth + i13, measuredHeight2 + i25);
                    i20 += 0;
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0 + i24;
                }
                i20++;
                i14 = 8;
                i15 = 5;
            }
            return;
        }
        boolean zOooO0O0 = o000O00O.OooO0O0(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i4 - i2;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.f5008OoooO00;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z2 = this.f5003Oooo0o;
        int[] iArr = this.f5010OoooOO0;
        int[] iArr2 = this.f5016o000oOoO;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, ViewCompat.OooO.OooO0Oo(this));
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f5007OoooO0;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f5007OoooO0) / 2);
        }
        if (zOooO0O0) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i30 = paddingLeft;
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i6 * i31) + i5;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i30 += 0;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (z2) {
                        i7 = i5;
                        i8 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) layoutParams2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                        if (i9 < 0) {
                            i9 = i29;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (OooOO0O(i32)) {
                            i30 += this.f5012OoooOOo;
                        }
                        int i33 = i30 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        int i34 = i33 + 0;
                        childAt2.layout(i34, measuredHeight, measuredWidth2 + i34, measuredHeight3 + measuredHeight);
                        i31 += 0;
                        i30 = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + i33;
                    } else {
                        i7 = i5;
                        i8 = virtualChildCount2;
                    }
                    i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    if (i9 < 0) {
                        i9 = i29;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (OooOO0O(i32)) {
                        i30 += this.f5012OoooOOo;
                    }
                    int i35 = i30 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    int i36 = i35 + 0;
                    childAt2.layout(i36, measuredHeight, measuredWidth2 + i36, measuredHeight3 + measuredHeight);
                    i31 += 0;
                    i30 = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + i35;
                }
                i31++;
                i5 = i7;
                virtualChildCount2 = i8;
                i29 = i29;
            }
            i7 = i5;
            i8 = virtualChildCount2;
            i31++;
            i5 = i7;
            virtualChildCount2 = i8;
            i29 = i29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:158:0x0306  */
    /* JADX WARN: Code duplicated, block: B:219:0x049a  */
    /* JADX WARN: Code duplicated, block: B:220:0x049f  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:224:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:236:0x0509  */
    /* JADX WARN: Code duplicated, block: B:245:0x054c  */
    /* JADX WARN: Code duplicated, block: B:251:0x055b  */
    /* JADX WARN: Code duplicated, block: B:254:0x0563 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0565  */
    /* JADX WARN: Code duplicated, block: B:257:0x056e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0572  */
    /* JADX WARN: Code duplicated, block: B:286:0x0605  */
    /* JADX WARN: Code duplicated, block: B:288:0x060b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0611  */
    /* JADX WARN: Code duplicated, block: B:291:0x0619  */
    /* JADX WARN: Code duplicated, block: B:292:0x061c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0624  */
    /* JADX WARN: Code duplicated, block: B:295:0x0632  */
    /* JADX WARN: Code duplicated, block: B:320:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:325:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:327:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:375:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:377:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:381:0x082c  */
    /* JADX WARN: Code duplicated, block: B:389:0x083e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0870  */
    /* JADX WARN: Code duplicated, block: B:395:0x0875  */
    /* JADX WARN: Code duplicated, block: B:398:0x0897  */
    /* JADX WARN: Code duplicated, block: B:400:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:402:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:404:0x08be  */
    /* JADX WARN: Code duplicated, block: B:405:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:443:0x08d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int i3;
        float f;
        int i4;
        int iCombineMeasuredStates;
        int i5;
        int i6;
        int i7;
        char c2;
        View childAt;
        int i8;
        int i9;
        int baseline;
        int i10;
        int iMakeMeasureSpec;
        int i11;
        int i12;
        View childAt2;
        LayoutParams layoutParams;
        int i13;
        int i14;
        View childAt3;
        LayoutParams layoutParams2;
        int i15;
        int i16;
        float f2;
        int i17;
        int i18;
        int i19;
        int iMax;
        int i20;
        int i21;
        boolean z;
        boolean z2;
        LayoutParams layoutParams3;
        int measuredWidth;
        boolean z3;
        int i22;
        boolean z4;
        int i23;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i24;
        int i25;
        boolean z6;
        boolean z7;
        int i26;
        int i27;
        LayoutParams layoutParams4;
        boolean z8;
        int i28;
        boolean z9;
        int iMax2;
        int i29 = this.f5002Oooo;
        int i30 = -2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 8;
        float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int i33 = 1073741824;
        int i34 = 0;
        if (i29 == 1) {
            this.f5007OoooO0 = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i35 = this.f5004Oooo0oO;
            boolean z10 = this.f5006OoooO;
            int i36 = 0;
            int i37 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            boolean z11 = false;
            boolean z12 = true;
            boolean z13 = false;
            int i38 = 0;
            while (i36 < virtualChildCount) {
                View childAt4 = getChildAt(i36);
                if (childAt4 == null) {
                    this.f5007OoooO0 += i34;
                } else {
                    if (childAt4.getVisibility() == i32) {
                        i36 += 0;
                    } else {
                        if (OooOO0O(i36)) {
                            this.f5007OoooO0 += this.f5013OoooOo0;
                        }
                        LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) layoutParams5).weight;
                        f4 += f5;
                        if (mode2 == i33 && ((LinearLayout.LayoutParams) layoutParams5).height == 0 && f5 > f3) {
                            int i39 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i39, ((LinearLayout.LayoutParams) layoutParams5).topMargin + i39 + ((LinearLayout.LayoutParams) layoutParams5).bottomMargin);
                            i35 = i35;
                            layoutParams4 = layoutParams5;
                            z8 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) layoutParams5).height != 0 || f5 <= f3) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) layoutParams5).height = i30;
                                i27 = 0;
                            }
                            int i40 = f4 == f3 ? this.f5007OoooO0 : 0;
                            layoutParams4 = layoutParams5;
                            measureChildWithMargins(childAt4, i, 0, i2, i40);
                            if (i27 != i31) {
                                ((LinearLayout.LayoutParams) layoutParams4).height = i27;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i41 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin + 0);
                            if (z10) {
                                iMax3 = Math.max(measuredHeight2, iMax3);
                            }
                            z8 = z11;
                        }
                        if (i35 >= 0 && i35 == i36 + 1) {
                            this.f5005Oooo0oo = this.f5007OoooO0;
                        }
                        if (i36 < i35 && ((LinearLayout.LayoutParams) layoutParams4).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i28 = mode;
                        if (i28 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i42 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i42;
                        iMax2 = Math.max(i37, measuredWidth2);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(i38, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((LinearLayout.LayoutParams) layoutParams4).width == -1;
                        if (((LinearLayout.LayoutParams) layoutParams4).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            if (!z9) {
                                i42 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i42);
                        } else {
                            int i43 = iMax5;
                            if (!z9) {
                                i42 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i42);
                            iMax5 = i43;
                        }
                        i36 += 0;
                        z11 = z8;
                        z12 = z14;
                        i38 = iCombineMeasuredStates2;
                    }
                    i36++;
                    mode = i28;
                    i37 = iMax2;
                    i35 = i35;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i34 = 0;
                    i30 = -2;
                    i31 = Integer.MIN_VALUE;
                    i32 = 8;
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    i33 = 1073741824;
                }
                i35 = i35;
                mode2 = mode2;
                i28 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i37;
                i36++;
                mode = i28;
                i37 = iMax2;
                i35 = i35;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i34 = 0;
                i30 = -2;
                i31 = Integer.MIN_VALUE;
                i32 = 8;
                f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                i33 = 1073741824;
            }
            int i44 = mode2;
            int i45 = mode;
            int i46 = virtualChildCount;
            int iMax6 = i37;
            int i47 = iMax3;
            int iMax7 = iMax4;
            int i48 = iMax5;
            int iCombineMeasuredStates3 = i38;
            if (this.f5007OoooO0 > 0 && OooOO0O(i46)) {
                this.f5007OoooO0 += this.f5013OoooOo0;
            }
            int i49 = i44;
            if (z10 && (i49 == Integer.MIN_VALUE || i49 == 0)) {
                int i50 = 0;
                this.f5007OoooO0 = 0;
                int i51 = 0;
                while (i51 < i46) {
                    View childAt5 = getChildAt(i51);
                    if (childAt5 == null) {
                        this.f5007OoooO0 += i50;
                    } else if (childAt5.getVisibility() == 8) {
                        i51 += 0;
                    } else {
                        LayoutParams layoutParams6 = (LayoutParams) childAt5.getLayoutParams();
                        int i52 = this.f5007OoooO0;
                        this.f5007OoooO0 = Math.max(i52, i52 + i47 + ((LinearLayout.LayoutParams) layoutParams6).topMargin + ((LinearLayout.LayoutParams) layoutParams6).bottomMargin + 0);
                    }
                    i51++;
                    i50 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f5007OoooO0;
            this.f5007OoooO0 = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i53 = (16777215 & iResolveSizeAndState) - this.f5007OoooO0;
            if (z11 || (i53 != 0 && f4 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                float f6 = this.f5009OoooO0O;
                if (f6 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f4 = f6;
                }
                this.f5007OoooO0 = 0;
                int i54 = 0;
                while (i54 < i46) {
                    View childAt6 = getChildAt(i54);
                    if (childAt6.getVisibility() != 8) {
                        LayoutParams layoutParams7 = (LayoutParams) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) layoutParams7).weight;
                        if (f7 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            int i55 = (int) ((i53 * f7) / f4);
                            f4 -= f7;
                            int i56 = i53 - i55;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin, ((LinearLayout.LayoutParams) layoutParams7).width);
                            if (((LinearLayout.LayoutParams) layoutParams7).height == 0) {
                                i26 = 1073741824;
                                if (i49 == 1073741824) {
                                    if (i55 <= 0) {
                                        i55 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i55, 1073741824));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                i53 = i56;
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i55;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i53 = i56;
                        }
                        int i57 = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i57;
                        iMax6 = Math.max(iMax6, measuredWidth3);
                        if (i45 != 1073741824) {
                            i24 = i53;
                            i25 = -1;
                            z6 = ((LinearLayout.LayoutParams) layoutParams7).width == -1;
                            if (!z6) {
                                i57 = measuredWidth3;
                            }
                            iMax7 = Math.max(iMax7, i57);
                            if (z12 || ((LinearLayout.LayoutParams) layoutParams7).width != i25) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i58 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i58, childAt6.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin + 0);
                            z12 = z7;
                            i53 = i24;
                        } else {
                            i24 = i53;
                            i25 = -1;
                        }
                        if (!z6) {
                            i57 = measuredWidth3;
                        }
                        iMax7 = Math.max(iMax7, i57);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i59 = this.f5007OoooO0;
                        this.f5007OoooO0 = Math.max(i59, childAt6.getMeasuredHeight() + i59 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin + 0);
                        z12 = z7;
                        i53 = i24;
                    }
                    i54++;
                    i49 = i49;
                }
                this.f5007OoooO0 = getPaddingBottom() + getPaddingTop() + this.f5007OoooO0;
            } else {
                iMax7 = Math.max(iMax7, i48);
                if (z10 && i49 != 1073741824) {
                    for (int i60 = 0; i60 < i46; i60++) {
                        View childAt7 = getChildAt(i60);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt7.getLayoutParams())).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i47, 1073741824));
                        }
                    }
                }
            }
            int i61 = iMax6;
            if (z12 || i45 == 1073741824) {
                iMax7 = i61;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax7, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i62 = 0; i62 < i46; i62++) {
                    View childAt8 = getChildAt(i62);
                    if (childAt8.getVisibility() != 8) {
                        LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams8).width == -1) {
                            int i63 = ((LinearLayout.LayoutParams) layoutParams8).height;
                            ((LinearLayout.LayoutParams) layoutParams8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) layoutParams8).height = i63;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f5007OoooO0 = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f5010OoooOO0 == null || this.f5016o000oOoO == null) {
            this.f5010OoooOO0 = new int[4];
            this.f5016o000oOoO = new int[4];
        }
        int[] iArr = this.f5010OoooOO0;
        int[] iArr2 = this.f5016o000oOoO;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f5003Oooo0o;
        boolean z16 = this.f5006OoooO;
        boolean z17 = mode3 == 1073741824;
        int iMax8 = 0;
        float f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int i64 = 0;
        int i65 = 0;
        int iMax9 = 0;
        int i66 = 0;
        int iMax10 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = false;
        while (i65 < virtualChildCount2) {
            View childAt9 = getChildAt(i65);
            if (childAt9 == null) {
                this.f5007OoooO0 += 0;
                i15 = iMax8;
                i16 = i64;
            } else {
                i15 = iMax8;
                i16 = i64;
                if (childAt9.getVisibility() == 8) {
                    i65 += 0;
                } else {
                    if (OooOO0O(i65)) {
                        this.f5007OoooO0 += this.f5012OoooOOo;
                    }
                    LayoutParams layoutParams9 = (LayoutParams) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) layoutParams9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams9).width == 0 && f9 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (z17) {
                            this.f5007OoooO0 = ((LinearLayout.LayoutParams) layoutParams9).leftMargin + ((LinearLayout.LayoutParams) layoutParams9).rightMargin + this.f5007OoooO0;
                        } else {
                            int i67 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i67, ((LinearLayout.LayoutParams) layoutParams9).leftMargin + i67 + ((LinearLayout.LayoutParams) layoutParams9).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            layoutParams3 = layoutParams9;
                            i19 = i15;
                            iMax = i16;
                            i21 = i65;
                            z = z16;
                            z2 = z15;
                        } else {
                            layoutParams3 = layoutParams9;
                            i19 = i15;
                            iMax = i16;
                            i21 = i65;
                            i22 = 1073741824;
                            z = z16;
                            z2 = z15;
                            z3 = true;
                        }
                        if (mode4 == i22 && ((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z4 = true;
                            z20 = true;
                        } else {
                            z4 = false;
                        }
                        i23 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i23;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i68 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i68 < 0) {
                                i68 = this.f5008OoooO00;
                            }
                            int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                            iArr[i69] = Math.max(iArr[i69], baseline2);
                            iArr2[i69] = Math.max(iArr2[i69], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(iMax10, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) layoutParams3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams3).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            if (z4) {
                                measuredHeight = i23;
                            }
                            iMax8 = Math.max(i19, measuredHeight);
                        } else {
                            int i70 = i19;
                            if (z4) {
                                measuredHeight = i23;
                            }
                            iMax = Math.max(iMax, measuredHeight);
                            iMax8 = i70;
                        }
                        i65 = i21 + 0;
                        iMax10 = iMax11;
                        i66 = iCombineMeasuredStates4;
                        z18 = z3;
                        z19 = z5;
                        f8 = f10;
                        i64 = iMax;
                    } else {
                        int i71 = i65;
                        if (((LinearLayout.LayoutParams) layoutParams9).width == 0) {
                            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            if (f9 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                ((LinearLayout.LayoutParams) layoutParams9).width = -2;
                                i17 = 0;
                            }
                            if (f10 == f2) {
                                i18 = this.f5007OoooO0;
                            } else {
                                i18 = 0;
                            }
                            i19 = i15;
                            iMax = i16;
                            i20 = i17;
                            i21 = i71;
                            z = z16;
                            z2 = z15;
                            measureChildWithMargins(childAt9, i, i18, i2, 0);
                            if (i20 != Integer.MIN_VALUE) {
                                layoutParams3 = layoutParams9;
                                ((LinearLayout.LayoutParams) layoutParams3).width = i20;
                            } else {
                                layoutParams3 = layoutParams9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z17) {
                                this.f5007OoooO0 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0 + this.f5007OoooO0;
                            } else {
                                int i72 = this.f5007OoooO0;
                                this.f5007OoooO0 = Math.max(i72, i72 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0);
                            }
                            if (z) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        i17 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i18 = this.f5007OoooO0;
                        } else {
                            i18 = 0;
                        }
                        i19 = i15;
                        iMax = i16;
                        i20 = i17;
                        i21 = i71;
                        z = z16;
                        z2 = z15;
                        measureChildWithMargins(childAt9, i, i18, i2, 0);
                        if (i20 != Integer.MIN_VALUE) {
                            layoutParams3 = layoutParams9;
                            ((LinearLayout.LayoutParams) layoutParams3).width = i20;
                        } else {
                            layoutParams3 = layoutParams9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z17) {
                            this.f5007OoooO0 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0 + this.f5007OoooO0;
                        } else {
                            int i73 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i73, i73 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0);
                        }
                        if (z) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z3 = z18;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i23 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i23;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i66, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax12 = Math.max(iMax10, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (z4) {
                            measuredHeight = i23;
                        }
                        iMax8 = Math.max(i19, measuredHeight);
                    } else {
                        int i74 = i19;
                        if (z4) {
                            measuredHeight = i23;
                        }
                        iMax = Math.max(iMax, measuredHeight);
                        iMax8 = i74;
                    }
                    i65 = i21 + 0;
                    iMax10 = iMax12;
                    i66 = iCombineMeasuredStates5;
                    z18 = z3;
                    z19 = z5;
                    f8 = f10;
                    i64 = iMax;
                }
                i65++;
                z16 = z;
                z15 = z2;
            }
            z2 = z15;
            iMax8 = i15;
            i64 = i16;
            z = z16;
            i65++;
            z16 = z;
            z15 = z2;
        }
        boolean z21 = z16;
        boolean z22 = z15;
        int i75 = i64;
        int i76 = iMax8;
        int iMax13 = i75;
        if (this.f5007OoooO0 > 0 && OooOO0O(virtualChildCount2)) {
            this.f5007OoooO0 += this.f5012OoooOOo;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] != -1) {
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                i13 = 0;
                this.f5007OoooO0 = 0;
                i14 = 0;
                while (i14 < virtualChildCount2) {
                    childAt3 = getChildAt(i14);
                    if (childAt3 == null) {
                        this.f5007OoooO0 += i13;
                    } else if (childAt3.getVisibility() == 8) {
                        i14 += 0;
                    } else {
                        layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                        if (z17) {
                            this.f5007OoooO0 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + this.f5007OoooO0;
                        } else {
                            int i77 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i77, i77 + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0);
                        }
                    }
                    i14++;
                    i13 = 0;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f5007OoooO0;
            this.f5007OoooO0 = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.f5007OoooO0;
            if (!z18 || (i3 != 0 && f8 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                f = this.f5009OoooO0O;
                if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f5007OoooO0 = 0;
                i4 = i3;
                iCombineMeasuredStates = i66;
                int iMax14 = -1;
                i5 = 0;
                while (i5 < virtualChildCount2) {
                    childAt = getChildAt(i5);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        virtualChildCount2 = virtualChildCount2;
                        i8 = i4;
                    } else {
                        LayoutParams layoutParams10 = (LayoutParams) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) layoutParams10).weight;
                        if (f11 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            int i78 = (int) ((i4 * f11) / f8);
                            float f12 = f8 - f11;
                            int i79 = i4 - i78;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin, ((LinearLayout.LayoutParams) layoutParams10).height);
                            if (((LinearLayout.LayoutParams) layoutParams10).width == 0) {
                                i10 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i78 <= 0) {
                                        i78 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f8 = f12;
                                i8 = i79;
                            } else {
                                i10 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i78;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i8 = i79;
                        } else {
                            i8 = i4;
                        }
                        if (z17) {
                            this.f5007OoooO0 = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin + 0 + this.f5007OoooO0;
                        } else {
                            int i80 = this.f5007OoooO0;
                            this.f5007OoooO0 = Math.max(i80, childAt.getMeasuredWidth() + i80 + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin + 0);
                        }
                        boolean z23 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                        int i81 = ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i81;
                        iMax14 = Math.max(iMax14, measuredHeight4);
                        if (!z23) {
                            i81 = measuredHeight4;
                        }
                        iMax13 = Math.max(iMax13, i81);
                        if (z19) {
                            i9 = -1;
                            boolean z24 = ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i9) {
                                int i82 = ((LinearLayout.LayoutParams) layoutParams10).gravity;
                                if (i82 < 0) {
                                    i82 = this.f5008OoooO00;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                iArr[i83] = Math.max(iArr[i83], baseline);
                                iArr2[i83] = Math.max(iArr2[i83], measuredHeight4 - baseline);
                            }
                            z19 = z24;
                            f8 = f8;
                        } else {
                            i9 = -1;
                        }
                        if (!z22) {
                        }
                        z19 = z24;
                        f8 = f8;
                    }
                    i5++;
                    virtualChildCount2 = virtualChildCount2;
                    i4 = i8;
                }
                i6 = i2;
                i7 = virtualChildCount2;
                this.f5007OoooO0 = getPaddingRight() + getPaddingLeft() + this.f5007OoooO0;
                if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c2 = 3;
                    if (iArr[3] == -1) {
                        iMax10 = iMax14;
                    }
                    if (z19 || mode4 == 1073741824) {
                        iMax13 = iMax10;
                    }
                    setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                    if (z20) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        i11 = i7;
                        for (i12 = 0; i12 < i11; i12++) {
                            childAt2 = getChildAt(i12);
                            if (childAt2.getVisibility() != 8) {
                                layoutParams = (LayoutParams) childAt2.getLayoutParams();
                                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                                    int i84 = ((LinearLayout.LayoutParams) layoutParams).width;
                                    ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((LinearLayout.LayoutParams) layoutParams).width = i84;
                                }
                            }
                        }
                    }
                }
                c2 = 3;
                iMax10 = Math.max(iMax14, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                if (z19) {
                    iMax13 = iMax10;
                } else {
                    iMax13 = iMax10;
                }
                setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                if (z20) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    i11 = i7;
                    while (i12 < i11) {
                        childAt2 = getChildAt(i12);
                        if (childAt2.getVisibility() != 8) {
                            layoutParams = (LayoutParams) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                                int i85 = ((LinearLayout.LayoutParams) layoutParams).width;
                                ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((LinearLayout.LayoutParams) layoutParams).width = i85;
                            }
                        }
                    }
                }
            }
            iMax13 = Math.max(iMax13, i76);
            if (z21 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt10 = getChildAt(i86);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt10.getLayoutParams())).weight > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = i2;
            i7 = virtualChildCount2;
            iCombineMeasuredStates = i66;
            if (z19) {
                iMax13 = iMax10;
            } else {
                iMax13 = iMax10;
            }
            setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i11 = i7;
                while (i12 < i11) {
                    childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        layoutParams = (LayoutParams) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            int i87 = ((LinearLayout.LayoutParams) layoutParams).width;
                            ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) layoutParams).width = i87;
                        }
                    }
                }
            }
        }
        c = 3;
        iMax10 = Math.max(iMax10, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z21) {
            i13 = 0;
            this.f5007OoooO0 = 0;
            i14 = 0;
            while (i14 < virtualChildCount2) {
                childAt3 = getChildAt(i14);
                if (childAt3 == null) {
                    this.f5007OoooO0 += i13;
                } else if (childAt3.getVisibility() == 8) {
                    i14 += 0;
                } else {
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (z17) {
                        this.f5007OoooO0 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + this.f5007OoooO0;
                    } else {
                        int i710 = this.f5007OoooO0;
                        this.f5007OoooO0 = Math.max(i710, i710 + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0);
                    }
                }
                i14++;
                i13 = 0;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f5007OoooO0;
        this.f5007OoooO0 = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.f5007OoooO0;
        if (z18) {
            f = this.f5009OoooO0O;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f5007OoooO0 = 0;
            i4 = i3;
            iCombineMeasuredStates = i66;
            int iMax15 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    virtualChildCount2 = virtualChildCount2;
                    i8 = i4;
                } else {
                    virtualChildCount2 = virtualChildCount2;
                    i8 = i4;
                }
                i5++;
                virtualChildCount2 = virtualChildCount2;
                i4 = i8;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f5007OoooO0 = getPaddingRight() + getPaddingLeft() + this.f5007OoooO0;
            if (iArr[1] != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            iMax10 = Math.max(iMax15, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        } else {
            f = this.f5009OoooO0O;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f5007OoooO0 = 0;
            i4 = i3;
            iCombineMeasuredStates = i66;
            int iMax16 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    virtualChildCount2 = virtualChildCount2;
                    i8 = i4;
                } else {
                    virtualChildCount2 = virtualChildCount2;
                    i8 = i4;
                }
                i5++;
                virtualChildCount2 = virtualChildCount2;
                i4 = i8;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f5007OoooO0 = getPaddingRight() + getPaddingLeft() + this.f5007OoooO0;
            if (iArr[1] != -1) {
                c2 = 3;
            } else {
                c2 = 3;
            }
            iMax10 = Math.max(iMax16, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z19) {
            iMax13 = iMax10;
        } else {
            iMax13 = iMax10;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i11 = i7;
            while (i12 < i11) {
                childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                        int i88 = ((LinearLayout.LayoutParams) layoutParams).width;
                        ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) layoutParams).width = i88;
                    }
                }
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f5003Oooo0o = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f5004Oooo0oO = i;
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("base aligned child index out of range (0, ");
        sbOooO0o0.append(getChildCount());
        sbOooO0o0.append(")");
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5011OoooOOO) {
            return;
        }
        this.f5011OoooOOO = drawable;
        if (drawable != null) {
            this.f5012OoooOOo = drawable.getIntrinsicWidth();
            this.f5013OoooOo0 = drawable.getIntrinsicHeight();
        } else {
            this.f5012OoooOOo = 0;
            this.f5013OoooOo0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f5015OoooOoo = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.f5008OoooO00 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5008OoooO00 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f5008OoooO00;
        if ((8388615 & i3) != i2) {
            this.f5008OoooO00 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f5006OoooO = z;
    }

    public void setOrientation(int i) {
        if (this.f5002Oooo != i) {
            this.f5002Oooo = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f5014OoooOoO) {
            requestLayout();
        }
        this.f5014OoooOoO = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f5008OoooO00;
        if ((i3 & 112) != i2) {
            this.f5008OoooO00 = i2 | (i3 & PayError.ERROR_PARAMS_IS_NULL);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f5009OoooO0O = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        this.f5003Oooo0o = true;
        this.f5004Oooo0oO = -1;
        this.f5005Oooo0oo = 0;
        this.f5008OoooO00 = 8388659;
        int[] iArr = OooOo00.OooOOOO.LinearLayoutCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        int i2 = typedArrayObtainStyledAttributes.getInt(OooOo00.OooOOOO.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(OooOo00.OooOOOO.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f5009OoooO0O = typedArrayObtainStyledAttributes.getFloat(OooOo00.OooOOOO.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f5004Oooo0oO = typedArrayObtainStyledAttributes.getInt(OooOo00.OooOOOO.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f5006OoooO = typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = OooOo00.OooOOOO.LinearLayoutCompat_divider;
        if (typedArrayObtainStyledAttributes.hasValue(i4) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            drawable = p012OooOo0.OooOO0O.OooO0O0(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(i4);
        }
        setDividerDrawable(drawable);
        this.f5014OoooOoO = typedArrayObtainStyledAttributes.getInt(OooOo00.OooOOOO.LinearLayoutCompat_showDividers, 0);
        this.f5015OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.LinearLayoutCompat_dividerPadding, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
