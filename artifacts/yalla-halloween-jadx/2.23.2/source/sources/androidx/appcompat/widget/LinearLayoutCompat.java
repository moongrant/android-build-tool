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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2892OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f2894OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f2895OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f2896OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2897OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f2898OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f2899OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f2900OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Drawable f2901OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f2902OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f2903OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f2904OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f2905OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f2906OooOOo0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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
        this.f2901OooOOO.setBounds(getPaddingLeft() + this.f2905OooOOo, i, (getWidth() - getPaddingRight()) - this.f2905OooOOo, this.f2904OooOOOo + i);
        this.f2901OooOOO.draw(canvas);
    }

    public final void OooO0oO(Canvas canvas, int i) {
        this.f2901OooOOO.setBounds(i, getPaddingTop() + this.f2905OooOOo, this.f2903OooOOOO + i, (getHeight() - getPaddingBottom()) - this.f2905OooOOo);
        this.f2901OooOOO.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f2896OooO0oO;
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
            return (this.f2906OooOOo0 & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2906OooOOo0 & 4) != 0;
        }
        if ((this.f2906OooOOo0 & 2) == 0) {
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
        if (this.f2895OooO0o0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2895OooO0o0;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2895OooO0o0 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iOooO00o = this.f2894OooO0o;
        if (this.f2896OooO0oO == 1 && (i = this.f2897OooO0oo & 112) != 48) {
            if (i == 16) {
                iOooO00o = OooO00o.OooO00o(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f2892OooO, 2, iOooO00o);
            } else if (i == 80) {
                iOooO00o = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2892OooO;
            }
        }
        return iOooO00o + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2895OooO0o0;
    }

    public Drawable getDividerDrawable() {
        return this.f2901OooOOO;
    }

    public int getDividerPadding() {
        return this.f2905OooOOo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f2903OooOOOO;
    }

    @GravityInt
    public int getGravity() {
        return this.f2897OooO0oo;
    }

    public int getOrientation() {
        return this.f2896OooO0oO;
    }

    public int getShowDividers() {
        return this.f2906OooOOo0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2898OooOO0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f2901OooOOO == null) {
            return;
        }
        int i2 = 0;
        if (this.f2896OooO0oO == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && OooOO0O(i2)) {
                    OooO0o(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f2904OooOOOo);
                }
                i2++;
            }
            if (OooOO0O(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f2904OooOOOo;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                }
                OooO0o(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zOooO00o = o0O0ooO.OooO00o(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && OooOO0O(i2)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                OooO0oO(canvas, zOooO00o ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f2903OooOOOO);
            }
            i2++;
        }
        if (OooOO0O(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (zOooO00o) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.f2903OooOOOO;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zOooO00o) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f2903OooOOOO;
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

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iOooO00o;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int iOooO00o2;
        int i11;
        int iOooO00o3;
        int iOooO00o4;
        int i12;
        int i13;
        int i14 = 8;
        int i15 = 5;
        int i16 = 1;
        if (this.f2896OooO0oO == 1) {
            int paddingLeft = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.f2897OooO0oo;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                iOooO00o3 = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f2892OooO;
            } else {
                iOooO00o3 = OooO00o.OooO00o(i4 - i2, this.f2892OooO, 2, getPaddingTop());
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt == null) {
                    iOooO00o3 += 0;
                } else if (childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, ViewCompat.OooO.OooO0Oo(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i15) {
                            i13 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        } else {
                            iOooO00o4 = paddingRight - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        if (OooOO0O(i21)) {
                            iOooO00o3 += this.f2904OooOOOo;
                        }
                        int i23 = iOooO00o3 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        int i24 = i23 + 0;
                        childAt.layout(i13, i24, measuredWidth + i13, measuredHeight + i24);
                        i21 += 0;
                        iOooO00o3 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0 + i23;
                    } else {
                        iOooO00o4 = OooO00o.OooO00o(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i13 = iOooO00o4 - i12;
                    if (OooOO0O(i21)) {
                        iOooO00o3 += this.f2904OooOOOo;
                    }
                    int i25 = iOooO00o3 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    int i26 = i25 + 0;
                    childAt.layout(i13, i26, measuredWidth + i13, measuredHeight + i26);
                    i21 += 0;
                    iOooO00o3 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0 + i25;
                }
                i21++;
                i14 = 8;
                i15 = 5;
            }
            return;
        }
        boolean zOooO00o = o0O0ooO.OooO00o(this);
        int paddingTop = getPaddingTop();
        int i27 = i4 - i2;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f2897OooO0oo;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z2 = this.f2893OooO0Oo;
        int[] iArr = this.f2900OooOO0o;
        int[] iArr2 = this.f2902OooOOO0;
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, ViewCompat.OooO.OooO0Oo(this));
        if (absoluteGravity2 != 1) {
            iOooO00o = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f2892OooO;
        } else {
            iOooO00o = OooO00o.OooO00o(i3 - i, this.f2892OooO, 2, getPaddingLeft());
        }
        if (zOooO00o) {
            i5 = virtualChildCount2 - 1;
            i16 = -1;
        } else {
            i5 = 0;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i16 * i31) + i5;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                iOooO00o += 0;
                i6 = i5;
            } else {
                i6 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (z2) {
                        i7 = i30;
                        i8 = i16;
                        baseline = ((LinearLayout.LayoutParams) layoutParams2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                        if (i9 < 0) {
                            i9 = i7;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            iOooO00o2 = (OooO00o.OooO00o(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        } else if (i10 != 48) {
                            i11 = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop;
                            if (baseline != -1) {
                                iOooO00o2 = (iArr[1] - baseline) + i11;
                            } else {
                                iOooO00o2 = i11;
                            }
                        } else if (i10 != 80) {
                            iOooO00o2 = paddingTop;
                        } else {
                            iOooO00o2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                            if (baseline != -1) {
                                iOooO00o2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (OooOO0O(i32)) {
                            iOooO00o += this.f2903OooOOOO;
                        }
                        int i33 = iOooO00o + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        int i34 = i33 + 0;
                        childAt2.layout(i34, iOooO00o2, measuredWidth2 + i34, measuredHeight2 + iOooO00o2);
                        i31 += 0;
                        iOooO00o = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + i33;
                    } else {
                        i7 = i30;
                        i8 = i16;
                    }
                    i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    if (i9 < 0) {
                        i9 = i7;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        iOooO00o2 = (OooO00o.OooO00o(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    } else if (i10 != 48) {
                        i11 = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop;
                        if (baseline != -1) {
                            iOooO00o2 = (iArr[1] - baseline) + i11;
                        } else {
                            iOooO00o2 = i11;
                        }
                    } else if (i10 != 80) {
                        iOooO00o2 = paddingTop;
                    } else {
                        iOooO00o2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        if (baseline != -1) {
                            iOooO00o2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (OooOO0O(i32)) {
                        iOooO00o += this.f2903OooOOOO;
                    }
                    int i35 = iOooO00o + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    int i36 = i35 + 0;
                    childAt2.layout(i36, iOooO00o2, measuredWidth2 + i36, measuredHeight2 + iOooO00o2);
                    i31 += 0;
                    iOooO00o = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + i35;
                }
                i31++;
                i5 = i6;
                i16 = i8;
                virtualChildCount2 = virtualChildCount2;
                i30 = i7;
                z2 = z2;
            }
            i7 = i30;
            i8 = i16;
            i31++;
            i5 = i6;
            i16 = i8;
            virtualChildCount2 = virtualChildCount2;
            i30 = i7;
            z2 = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:158:0x0307  */
    /* JADX WARN: Code duplicated, block: B:219:0x049e  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:223:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:228:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:230:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x050e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0551  */
    /* JADX WARN: Code duplicated, block: B:251:0x0563  */
    /* JADX WARN: Code duplicated, block: B:254:0x056b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x056d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0579  */
    /* JADX WARN: Code duplicated, block: B:259:0x057d  */
    /* JADX WARN: Code duplicated, block: B:286:0x060f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0615  */
    /* JADX WARN: Code duplicated, block: B:289:0x061b  */
    /* JADX WARN: Code duplicated, block: B:291:0x0623  */
    /* JADX WARN: Code duplicated, block: B:292:0x0626  */
    /* JADX WARN: Code duplicated, block: B:294:0x062e  */
    /* JADX WARN: Code duplicated, block: B:295:0x063c  */
    /* JADX WARN: Code duplicated, block: B:319:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:321:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:324:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:326:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:374:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:376:0x0808  */
    /* JADX WARN: Code duplicated, block: B:380:0x0837  */
    /* JADX WARN: Code duplicated, block: B:388:0x084a  */
    /* JADX WARN: Code duplicated, block: B:395:0x0881  */
    /* JADX WARN: Code duplicated, block: B:398:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:400:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:402:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:404:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:405:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:443:0x08de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int iMax;
        int i3;
        float f;
        int iCombineMeasuredStates;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        int iMax2;
        View childAt;
        int i8;
        int i9;
        int i10;
        int i11;
        int baseline;
        int i12;
        int iMakeMeasureSpec;
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
        int i20;
        int i21;
        int i22;
        boolean z;
        boolean z2;
        LayoutParams layoutParams3;
        int measuredWidth;
        boolean z3;
        int i23;
        boolean z4;
        int i24;
        int measuredHeight;
        boolean z5;
        int iMax3;
        int iMax4;
        int baseline2;
        int i25;
        int i26;
        boolean z6;
        boolean z7;
        int i27;
        int i28;
        boolean z8;
        LayoutParams layoutParams4;
        boolean z9;
        int i29;
        boolean z10;
        int iCombineMeasuredStates2;
        int i30 = this.f2896OooO0oO;
        int i31 = -2;
        int i32 = Integer.MIN_VALUE;
        int i33 = 8;
        int i34 = Pow2.MAX_POW2;
        float f3 = 0.0f;
        int i35 = 0;
        boolean z11 = true;
        if (i30 == 1) {
            this.f2892OooO = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i36 = this.f2895OooO0o0;
            boolean z12 = this.f2899OooOO0O;
            boolean z13 = true;
            int i37 = 0;
            int iMax5 = 0;
            int i38 = 0;
            int iMax6 = 0;
            int iMax7 = 0;
            int i39 = 0;
            boolean z14 = false;
            boolean z15 = false;
            float f4 = 0.0f;
            while (i37 < virtualChildCount) {
                View childAt4 = getChildAt(i37);
                if (childAt4 == null) {
                    this.f2892OooO += i35;
                } else {
                    if (childAt4.getVisibility() == i33) {
                        i37 += 0;
                    } else {
                        if (OooOO0O(i37)) {
                            this.f2892OooO += this.f2904OooOOOo;
                        }
                        LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) layoutParams5).weight;
                        f4 += f5;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) layoutParams5).height == 0 && f5 > f3) {
                            int i40 = this.f2892OooO;
                            this.f2892OooO = Math.max(i40, ((LinearLayout.LayoutParams) layoutParams5).topMargin + i40 + ((LinearLayout.LayoutParams) layoutParams5).bottomMargin);
                            layoutParams4 = layoutParams5;
                            z9 = true;
                            z8 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) layoutParams5).height != 0 || f5 <= f3) {
                                i28 = i32;
                            } else {
                                ((LinearLayout.LayoutParams) layoutParams5).height = i31;
                                i28 = 0;
                            }
                            int i41 = f4 == f3 ? this.f2892OooO : 0;
                            z8 = true;
                            layoutParams4 = layoutParams5;
                            measureChildWithMargins(childAt4, i, 0, i2, i41);
                            if (i28 != i32) {
                                ((LinearLayout.LayoutParams) layoutParams4).height = i28;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i42 = this.f2892OooO;
                            this.f2892OooO = Math.max(i42, i42 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin + 0);
                            if (z12) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                            z9 = z14;
                        }
                        if (i36 >= 0 && i36 == i37 + 1) {
                            this.f2894OooO0o = this.f2892OooO;
                        }
                        if (i37 < i36 && ((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i29 = mode;
                        if (i29 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams4).width != -1) {
                            z10 = false;
                        } else {
                            z10 = z8;
                            z15 = z10;
                        }
                        int i43 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i43;
                        int iMax8 = Math.max(i39, measuredWidth2);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(i38, childAt4.getMeasuredState());
                        boolean z16 = (z13 && ((LinearLayout.LayoutParams) layoutParams4).width == -1) ? z8 : false;
                        if (((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                            if (!z10) {
                                i43 = measuredWidth2;
                            }
                            iMax7 = Math.max(iMax7, i43);
                        } else {
                            int i44 = iMax7;
                            if (!z10) {
                                i43 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i43);
                            iMax7 = i44;
                        }
                        i37 += 0;
                        i39 = iMax8;
                        z14 = z9;
                        z13 = z16;
                    }
                    i37++;
                    mode = i29;
                    i36 = i36;
                    i38 = iCombineMeasuredStates2;
                    z11 = z8;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i35 = 0;
                    i31 = -2;
                    i32 = Integer.MIN_VALUE;
                    i33 = 8;
                    i34 = Pow2.MAX_POW2;
                    f3 = 0.0f;
                }
                i36 = i36;
                mode2 = mode2;
                i29 = mode;
                virtualChildCount = virtualChildCount;
                iCombineMeasuredStates2 = i38;
                z8 = true;
                i37++;
                mode = i29;
                i36 = i36;
                i38 = iCombineMeasuredStates2;
                z11 = z8;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i35 = 0;
                i31 = -2;
                i32 = Integer.MIN_VALUE;
                i33 = 8;
                i34 = Pow2.MAX_POW2;
                f3 = 0.0f;
            }
            int i45 = mode2;
            int i46 = mode;
            int i47 = virtualChildCount;
            boolean z17 = z11;
            int iMax9 = iMax5;
            int iCombineMeasuredStates3 = i38;
            int i48 = iMax6;
            int i49 = iMax7;
            int i50 = i39;
            if (this.f2892OooO > 0 && OooOO0O(i47)) {
                this.f2892OooO += this.f2904OooOOOo;
            }
            int i51 = i45;
            if (z12 && (i51 == Integer.MIN_VALUE || i51 == 0)) {
                int i52 = 0;
                this.f2892OooO = 0;
                int i53 = 0;
                while (i53 < i47) {
                    View childAt5 = getChildAt(i53);
                    if (childAt5 == null) {
                        this.f2892OooO += i52;
                    } else if (childAt5.getVisibility() == 8) {
                        i53 += 0;
                    } else {
                        LayoutParams layoutParams6 = (LayoutParams) childAt5.getLayoutParams();
                        int i54 = this.f2892OooO;
                        this.f2892OooO = Math.max(i54, i54 + i48 + ((LinearLayout.LayoutParams) layoutParams6).topMargin + ((LinearLayout.LayoutParams) layoutParams6).bottomMargin + 0);
                    }
                    i53++;
                    i52 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2892OooO;
            this.f2892OooO = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i55 = (16777215 & iResolveSizeAndState) - this.f2892OooO;
            if (z14 || (i55 != 0 && f4 > 0.0f)) {
                float f6 = this.f2898OooOO0;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.f2892OooO = 0;
                int i56 = 0;
                while (i56 < i47) {
                    View childAt6 = getChildAt(i56);
                    if (childAt6.getVisibility() != 8) {
                        LayoutParams layoutParams7 = (LayoutParams) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) layoutParams7).weight;
                        if (f7 > 0.0f) {
                            int i57 = (int) ((i55 * f7) / f4);
                            f4 -= f7;
                            int i58 = i55 - i57;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin, ((LinearLayout.LayoutParams) layoutParams7).width);
                            if (((LinearLayout.LayoutParams) layoutParams7).height == 0) {
                                i27 = Pow2.MAX_POW2;
                                if (i51 == 1073741824) {
                                    if (i57 <= 0) {
                                        i57 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i57, Pow2.MAX_POW2));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                i55 = i58;
                            } else {
                                i27 = Pow2.MAX_POW2;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i57;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i27));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i55 = i58;
                        }
                        int i59 = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i59;
                        int iMax10 = Math.max(i50, measuredWidth3);
                        if (i46 != 1073741824) {
                            i25 = iMax10;
                            i26 = -1;
                            z6 = ((LinearLayout.LayoutParams) layoutParams7).width == -1 ? z17 : false;
                            if (!z6) {
                                i59 = measuredWidth3;
                            }
                            int iMax11 = Math.max(iMax9, i59);
                            if (z13 || ((LinearLayout.LayoutParams) layoutParams7).width != i26) {
                                z7 = false;
                            } else {
                                z7 = z17;
                            }
                            int i60 = this.f2892OooO;
                            this.f2892OooO = Math.max(i60, childAt6.getMeasuredHeight() + i60 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin + 0);
                            z13 = z7;
                            i50 = i25;
                            iMax9 = iMax11;
                        } else {
                            i25 = iMax10;
                            i26 = -1;
                        }
                        if (!z6) {
                            i59 = measuredWidth3;
                        }
                        int iMax12 = Math.max(iMax9, i59);
                        if (z13) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i61 = this.f2892OooO;
                        this.f2892OooO = Math.max(i61, childAt6.getMeasuredHeight() + i61 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin + 0);
                        z13 = z7;
                        i50 = i25;
                        iMax9 = iMax12;
                    }
                    i56++;
                    i51 = i51;
                }
                this.f2892OooO = getPaddingBottom() + getPaddingTop() + this.f2892OooO;
            } else {
                iMax9 = Math.max(iMax9, i49);
                if (z12 && i51 != 1073741824) {
                    for (int i62 = 0; i62 < i47; i62++) {
                        View childAt7 = getChildAt(i62);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i48, Pow2.MAX_POW2));
                        }
                    }
                }
            }
            int i63 = i50;
            if (z13 || i46 == 1073741824) {
                iMax9 = i63;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax9, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z15) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Pow2.MAX_POW2);
                for (int i64 = 0; i64 < i47; i64++) {
                    View childAt8 = getChildAt(i64);
                    if (childAt8.getVisibility() != 8) {
                        LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams8).width == -1) {
                            int i65 = ((LinearLayout.LayoutParams) layoutParams8).height;
                            ((LinearLayout.LayoutParams) layoutParams8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) layoutParams8).height = i65;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2892OooO = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f2900OooOO0o == null || this.f2902OooOOO0 == null) {
            this.f2900OooOO0o = new int[4];
            this.f2902OooOOO0 = new int[4];
        }
        int[] iArr = this.f2900OooOO0o;
        int[] iArr2 = this.f2902OooOOO0;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z18 = this.f2893OooO0Oo;
        boolean z19 = this.f2899OooOO0O;
        boolean z20 = mode3 == 1073741824;
        boolean z21 = true;
        int i66 = 0;
        float f8 = 0.0f;
        int i67 = 0;
        int i68 = 0;
        int iMax13 = 0;
        int i69 = 0;
        boolean z22 = false;
        boolean z23 = false;
        int i70 = 0;
        while (i68 < virtualChildCount2) {
            View childAt9 = getChildAt(i68);
            if (childAt9 == null) {
                this.f2892OooO += 0;
                i15 = i66;
                i16 = i67;
            } else {
                i15 = i66;
                i16 = i67;
                if (childAt9.getVisibility() == 8) {
                    i68 += 0;
                } else {
                    if (OooOO0O(i68)) {
                        this.f2892OooO += this.f2903OooOOOO;
                    }
                    LayoutParams layoutParams9 = (LayoutParams) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) layoutParams9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams9).width == 0 && f9 > 0.0f) {
                        if (z20) {
                            this.f2892OooO = ((LinearLayout.LayoutParams) layoutParams9).leftMargin + ((LinearLayout.LayoutParams) layoutParams9).rightMargin + this.f2892OooO;
                        } else {
                            int i71 = this.f2892OooO;
                            this.f2892OooO = Math.max(i71, ((LinearLayout.LayoutParams) layoutParams9).leftMargin + i71 + ((LinearLayout.LayoutParams) layoutParams9).rightMargin);
                        }
                        if (z18) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            layoutParams3 = layoutParams9;
                            i19 = i15;
                            i20 = i16;
                            i22 = i68;
                            z = z19;
                            z2 = z18;
                        } else {
                            layoutParams3 = layoutParams9;
                            i19 = i15;
                            i20 = i16;
                            i22 = i68;
                            i23 = Pow2.MAX_POW2;
                            z = z19;
                            z2 = z18;
                            z3 = true;
                        }
                        if (mode4 == i23 && ((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z4 = true;
                            z23 = true;
                        } else {
                            z4 = false;
                        }
                        i24 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i24;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i69, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i72 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i72 < 0) {
                                i72 = this.f2897OooO0oo;
                            }
                            int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
                            iArr[i73] = Math.max(iArr[i73], baseline2);
                            iArr2[i73] = Math.max(iArr2[i73], measuredHeight - baseline2);
                        }
                        int iMax14 = Math.max(i70, measuredHeight);
                        if (z21 || ((LinearLayout.LayoutParams) layoutParams3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax3 = Math.max(i20, measuredHeight);
                            iMax4 = i19;
                        } else {
                            iMax3 = i20;
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax4 = Math.max(i19, measuredHeight);
                        }
                        i70 = iMax14;
                        i66 = iMax4;
                        i69 = iCombineMeasuredStates4;
                        z22 = z3;
                        i68 = i22 + 0;
                        z21 = z5;
                        i67 = iMax3;
                        f8 = f10;
                    } else {
                        int i74 = i68;
                        if (((LinearLayout.LayoutParams) layoutParams9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) layoutParams9).width = -2;
                                i17 = 0;
                            }
                            if (f10 == f2) {
                                i18 = this.f2892OooO;
                            } else {
                                i18 = 0;
                            }
                            i19 = i15;
                            i20 = i16;
                            i21 = i17;
                            i22 = i74;
                            z = z19;
                            z2 = z18;
                            measureChildWithMargins(childAt9, i, i18, i2, 0);
                            if (i21 != Integer.MIN_VALUE) {
                                layoutParams3 = layoutParams9;
                                ((LinearLayout.LayoutParams) layoutParams3).width = i21;
                            } else {
                                layoutParams3 = layoutParams9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z20) {
                                this.f2892OooO = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0 + this.f2892OooO;
                            } else {
                                int i75 = this.f2892OooO;
                                this.f2892OooO = Math.max(i75, i75 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0);
                            }
                            if (z) {
                                iMax13 = Math.max(measuredWidth, iMax13);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i18 = this.f2892OooO;
                        } else {
                            i18 = 0;
                        }
                        i19 = i15;
                        i20 = i16;
                        i21 = i17;
                        i22 = i74;
                        z = z19;
                        z2 = z18;
                        measureChildWithMargins(childAt9, i, i18, i2, 0);
                        if (i21 != Integer.MIN_VALUE) {
                            layoutParams3 = layoutParams9;
                            ((LinearLayout.LayoutParams) layoutParams3).width = i21;
                        } else {
                            layoutParams3 = layoutParams9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z20) {
                            this.f2892OooO = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0 + this.f2892OooO;
                        } else {
                            int i76 = this.f2892OooO;
                            this.f2892OooO = Math.max(i76, i76 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + 0);
                        }
                        if (z) {
                            iMax13 = Math.max(measuredWidth, iMax13);
                        }
                    }
                    z3 = z22;
                    i23 = Pow2.MAX_POW2;
                    if (mode4 == i23) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i24 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i24;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i69, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax15 = Math.max(i70, measuredHeight);
                    if (z21) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax3 = Math.max(i20, measuredHeight);
                        iMax4 = i19;
                    } else {
                        iMax3 = i20;
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax4 = Math.max(i19, measuredHeight);
                    }
                    i70 = iMax15;
                    i66 = iMax4;
                    i69 = iCombineMeasuredStates5;
                    z22 = z3;
                    i68 = i22 + 0;
                    z21 = z5;
                    i67 = iMax3;
                    f8 = f10;
                }
                i68++;
                z19 = z;
                z18 = z2;
            }
            z2 = z18;
            i66 = i15;
            i67 = i16;
            z = z19;
            i68++;
            z19 = z;
            z18 = z2;
        }
        boolean z24 = z19;
        boolean z25 = z18;
        int i77 = i66;
        int i78 = i70;
        if (this.f2892OooO > 0 && OooOO0O(virtualChildCount2)) {
            this.f2892OooO += this.f2903OooOOOO;
        }
        int i79 = iArr[1];
        int i80 = i69;
        if (i79 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                iMax = i78;
            }
            if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                i13 = 0;
                this.f2892OooO = 0;
                i14 = 0;
                while (i14 < virtualChildCount2) {
                    childAt3 = getChildAt(i14);
                    if (childAt3 == null) {
                        this.f2892OooO += i13;
                    } else if (childAt3.getVisibility() == 8) {
                        i14 += 0;
                    } else {
                        layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                        if (z20) {
                            this.f2892OooO = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax13 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + this.f2892OooO;
                        } else {
                            int i81 = this.f2892OooO;
                            this.f2892OooO = Math.max(i81, i81 + iMax13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0);
                        }
                    }
                    i14++;
                    i13 = 0;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2892OooO;
            this.f2892OooO = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.f2892OooO;
            if (!z22 || (i3 != 0 && f8 > 0.0f)) {
                f = this.f2898OooOO0;
                if (f > 0.0f) {
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
                this.f2892OooO = 0;
                iCombineMeasuredStates = i80;
                int iMax16 = -1;
                i4 = 0;
                while (i4 < virtualChildCount2) {
                    childAt = getChildAt(i4);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i8 = i3;
                        i9 = mode4;
                    } else {
                        LayoutParams layoutParams10 = (LayoutParams) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) layoutParams10).weight;
                        if (f11 > 0.0f) {
                            int i82 = (int) ((i3 * f11) / f8);
                            float f12 = f8 - f11;
                            int i83 = i3 - i82;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin, ((LinearLayout.LayoutParams) layoutParams10).height);
                            if (((LinearLayout.LayoutParams) layoutParams10).width == 0) {
                                i12 = Pow2.MAX_POW2;
                                if (mode3 == 1073741824) {
                                    if (i82 <= 0) {
                                        i82 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i82, Pow2.MAX_POW2), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f8 = f12;
                                i10 = i83;
                            } else {
                                i12 = Pow2.MAX_POW2;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i82;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i12), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i10 = i83;
                        } else {
                            i10 = i3;
                        }
                        if (z20) {
                            this.f2892OooO = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin + 0 + this.f2892OooO;
                        } else {
                            int i84 = this.f2892OooO;
                            this.f2892OooO = Math.max(i84, childAt.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin + 0);
                        }
                        i9 = mode4;
                        boolean z26 = i9 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                        int i85 = ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i85;
                        iMax16 = Math.max(iMax16, measuredHeight4);
                        if (!z26) {
                            i85 = measuredHeight4;
                        }
                        int iMax17 = Math.max(i77, i85);
                        if (z21) {
                            i11 = -1;
                            boolean z27 = ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                            if (!z25 && (baseline = childAt.getBaseline()) != i11) {
                                int i86 = ((LinearLayout.LayoutParams) layoutParams10).gravity;
                                if (i86 < 0) {
                                    i86 = this.f2897OooO0oo;
                                }
                                int i87 = (((i86 & 112) >> 4) & (-2)) >> 1;
                                iArr[i87] = Math.max(iArr[i87], baseline);
                                iArr2[i87] = Math.max(iArr2[i87], measuredHeight4 - baseline);
                            }
                            z21 = z27;
                            i8 = i10;
                            i77 = iMax17;
                            f8 = f8;
                        } else {
                            i11 = -1;
                        }
                        if (!z25) {
                        }
                        z21 = z27;
                        i8 = i10;
                        i77 = iMax17;
                        f8 = f8;
                    }
                    i4++;
                    i3 = i8;
                    mode4 = i9;
                    mode3 = mode3;
                }
                i5 = mode4;
                this.f2892OooO = getPaddingRight() + getPaddingLeft() + this.f2892OooO;
                i6 = iArr[1];
                if (i6 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c2 = 3;
                    if (iArr[3] == -1) {
                        iMax = iMax16;
                        i7 = 0;
                    }
                    iMax2 = i77;
                } else {
                    c2 = 3;
                }
                i7 = 0;
                iMax = Math.max(iMax16, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
                iMax2 = i77;
            } else {
                iMax2 = Math.max(i77, i67);
                if (z24 && mode3 != 1073741824) {
                    for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                        View childAt10 = getChildAt(i88);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax13, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), Pow2.MAX_POW2));
                        }
                    }
                }
                iCombineMeasuredStates = i80;
                i5 = mode4;
                i7 = 0;
            }
            if (z21 || i5 == 1073741824) {
                iMax2 = iMax;
            }
            setMeasuredDimension(iResolveSizeAndState2 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax2, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
            if (z23) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Pow2.MAX_POW2);
                while (i7 < virtualChildCount2) {
                    childAt2 = getChildAt(i7);
                    if (childAt2.getVisibility() != 8) {
                        layoutParams = (LayoutParams) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            int i89 = ((LinearLayout.LayoutParams) layoutParams).width;
                            ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) layoutParams).width = i89;
                        }
                    }
                    i7++;
                }
            }
        }
        c = 3;
        iMax = Math.max(i78, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i79, iArr[2]))));
        if (z24) {
            i13 = 0;
            this.f2892OooO = 0;
            i14 = 0;
            while (i14 < virtualChildCount2) {
                childAt3 = getChildAt(i14);
                if (childAt3 == null) {
                    this.f2892OooO += i13;
                } else if (childAt3.getVisibility() == 8) {
                    i14 += 0;
                } else {
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (z20) {
                        this.f2892OooO = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax13 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0 + this.f2892OooO;
                    } else {
                        int i810 = this.f2892OooO;
                        this.f2892OooO = Math.max(i810, i810 + iMax13 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + 0);
                    }
                }
                i14++;
                i13 = 0;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2892OooO;
        this.f2892OooO = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.f2892OooO;
        if (z22) {
            f = this.f2898OooOO0;
            if (f > 0.0f) {
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
            this.f2892OooO = 0;
            iCombineMeasuredStates = i80;
            int iMax18 = -1;
            i4 = 0;
            while (i4 < virtualChildCount2) {
                childAt = getChildAt(i4);
                if (childAt != null) {
                    i8 = i3;
                    i9 = mode4;
                } else {
                    i8 = i3;
                    i9 = mode4;
                }
                i4++;
                i3 = i8;
                mode4 = i9;
                mode3 = mode3;
            }
            i5 = mode4;
            this.f2892OooO = getPaddingRight() + getPaddingLeft() + this.f2892OooO;
            i6 = iArr[1];
            if (i6 != -1) {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax18, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            } else {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax18, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            }
            iMax2 = i77;
        } else {
            f = this.f2898OooOO0;
            if (f > 0.0f) {
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
            this.f2892OooO = 0;
            iCombineMeasuredStates = i80;
            int iMax19 = -1;
            i4 = 0;
            while (i4 < virtualChildCount2) {
                childAt = getChildAt(i4);
                if (childAt != null) {
                    i8 = i3;
                    i9 = mode4;
                } else {
                    i8 = i3;
                    i9 = mode4;
                }
                i4++;
                i3 = i8;
                mode4 = i9;
                mode3 = mode3;
            }
            i5 = mode4;
            this.f2892OooO = getPaddingRight() + getPaddingLeft() + this.f2892OooO;
            i6 = iArr[1];
            if (i6 != -1) {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax19, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            } else {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax19, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            }
            iMax2 = i77;
        }
        if (z21) {
            iMax2 = iMax;
        } else {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState3 | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax2, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
        if (z23) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Pow2.MAX_POW2);
            while (i7 < virtualChildCount2) {
                childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                        int i811 = ((LinearLayout.LayoutParams) layoutParams).width;
                        ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) layoutParams).width = i811;
                    }
                }
                i7++;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f2893OooO0Oo = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2895OooO0o0 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2901OooOOO) {
            return;
        }
        this.f2901OooOOO = drawable;
        if (drawable != null) {
            this.f2903OooOOOO = drawable.getIntrinsicWidth();
            this.f2904OooOOOo = drawable.getIntrinsicHeight();
        } else {
            this.f2903OooOOOO = 0;
            this.f2904OooOOOo = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2905OooOOo = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.f2897OooO0oo != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2897OooO0oo = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2897OooO0oo;
        if ((8388615 & i3) != i2) {
            this.f2897OooO0oo = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2899OooOO0O = z;
    }

    public void setOrientation(int i) {
        if (this.f2896OooO0oO != i) {
            this.f2896OooO0oO = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2906OooOOo0) {
            requestLayout();
        }
        this.f2906OooOOo0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2897OooO0oo;
        if ((i3 & 112) != i2) {
            this.f2897OooO0oo = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2898OooOO0 = Math.max(0.0f, f);
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
        this.f2893OooO0Oo = true;
        this.f2895OooO0o0 = -1;
        this.f2894OooO0o = 0;
        this.f2897OooO0oo = 8388659;
        int[] iArr = p012OooOo0O.o00O0O.LinearLayoutCompat;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(p012OooOo0O.o00O0O.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(p012OooOo0O.o00O0O.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f2898OooOO0 = typedArrayObtainStyledAttributes.getFloat(p012OooOo0O.o00O0O.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2895OooO0o0 = typedArrayObtainStyledAttributes.getInt(p012OooOo0O.o00O0O.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2899OooOO0O = typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = p012OooOo0O.o00O0O.LinearLayoutCompat_divider;
        if (typedArrayObtainStyledAttributes.hasValue(i4) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            drawable = p013OooOo0o.o00Oo0.OooO00o(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(i4);
        }
        setDividerDrawable(drawable);
        this.f2906OooOOo0 = typedArrayObtainStyledAttributes.getInt(p012OooOo0O.o00O0O.LinearLayoutCompat_showDividers, 0);
        this.f2905OooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012OooOo0O.o00O0O.LinearLayoutCompat_dividerPadding, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
