package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import p082o000OoOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final int[] f8275OooOOo = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final int[] f8276OooOOoo = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f8277OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewPager f8278OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TextView f8279OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextView f8280OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f8281OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f8282OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8283OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8284OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8285OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO00o f8286OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f8287OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public WeakReference<OooOO0O> f8288OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8289OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8290OooOOo0;

    public class OooO00o extends DataSetObserver implements ViewPager.OooOOO0, ViewPager.OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8291OooO0Oo;

        public OooO00o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOO0O
        public final void OooO00o(ViewPager viewPager, OooOO0O oooOO0O, OooOO0O oooOO0O2) {
            PagerTitleStrip.this.OooO00o(oooOO0O, oooOO0O2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.OooO0O0(pagerTitleStrip.f8278OooO0Oo.getCurrentItem(), pagerTitleStrip.f8278OooO0Oo.getAdapter());
            float f = pagerTitleStrip.f8277OooO;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip.OooO0OO(f, pagerTitleStrip.f8278OooO0Oo.getCurrentItem(), true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            this.f8291OooO0Oo = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.OooO0OO(f, i, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (this.f8291OooO0Oo == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.OooO0O0(pagerTitleStrip.f8278OooO0Oo.getCurrentItem(), pagerTitleStrip.f8278OooO0Oo.getAdapter());
                float f = pagerTitleStrip.f8277OooO;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip.OooO0OO(f, pagerTitleStrip.f8278OooO0Oo.getCurrentItem(), true);
            }
        }
    }

    public static class OooO0O0 extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Locale f8293OooO00o;

        public OooO0O0(Context context) {
            this.f8293OooO00o = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f8293OooO00o);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new OooO0O0(textView.getContext()));
    }

    public final void OooO00o(OooOO0O oooOO0O, OooOO0O oooOO0O2) {
        OooO00o oooO00o = this.f8286OooOOO;
        if (oooOO0O != null) {
            oooOO0O.OooOOOo(oooO00o);
            this.f8288OooOOOO = null;
        }
        if (oooOO0O2 != null) {
            oooOO0O2.OooOO0(oooO00o);
            this.f8288OooOOOO = new WeakReference<>(oooOO0O2);
        }
        ViewPager viewPager = this.f8278OooO0Oo;
        if (viewPager != null) {
            this.f8282OooO0oo = -1;
            this.f8277OooO = -1.0f;
            OooO0O0(viewPager.getCurrentItem(), oooOO0O2);
            requestLayout();
        }
    }

    public final void OooO0O0(int i, OooOO0O oooOO0O) {
        int iOooO0OO = oooOO0O != null ? oooOO0O.OooO0OO() : 0;
        this.f8285OooOO0o = true;
        CharSequence charSequenceOooO0o0 = null;
        CharSequence charSequenceOooO0o1 = (i < 1 || oooOO0O == null) ? null : oooOO0O.OooO0o0(i - 1);
        TextView textView = this.f8280OooO0o0;
        textView.setText(charSequenceOooO0o1);
        TextView textView2 = this.f8279OooO0o;
        textView2.setText((oooOO0O == null || i >= iOooO0OO) ? null : oooOO0O.OooO0o0(i));
        int i2 = i + 1;
        if (i2 < iOooO0OO && oooOO0O != null) {
            charSequenceOooO0o0 = oooOO0O.OooO0o0(i2);
        }
        TextView textView3 = this.f8281OooO0oO;
        textView3.setText(charSequenceOooO0o0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f8282OooO0oo = i;
        if (!this.f8287OooOOO0) {
            OooO0OO(this.f8277OooO, i, false);
        }
        this.f8285OooOO0o = false;
    }

    public void OooO0OO(float f, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f8282OooO0oo) {
            OooO0O0(i, this.f8278OooO0Oo.getAdapter());
        } else if (!z && f == this.f8277OooO) {
            return;
        }
        this.f8287OooOOO0 = true;
        TextView textView = this.f8280OooO0o0;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f8279OooO0o;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f8281OooO0oO;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.f8284OooOO0O & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.f8283OooOO0) - measuredWidth);
            textView.layout(iMin, i3, measuredWidth + iMin, textView.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f8283OooOO0);
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f8277OooO = f;
            this.f8287OooOOO0 = false;
        }
        i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f8283OooOO0) - measuredWidth);
        textView.layout(iMin2, i3, measuredWidth + iMin2, textView.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f8283OooOO0);
        textView3.layout(iMax4, i5, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f8277OooO = f;
        this.f8287OooOOO0 = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f8283OooOO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        OooOO0O adapter = viewPager.getAdapter();
        OooO00o oooO00o = this.f8286OooOOO;
        viewPager.f8341OoooOOO = oooO00o;
        if (viewPager.f8342OoooOOo == null) {
            viewPager.f8342OoooOOo = new ArrayList();
        }
        viewPager.f8342OoooOOo.add(oooO00o);
        this.f8278OooO0Oo = viewPager;
        WeakReference<OooOO0O> weakReference = this.f8288OooOOOO;
        OooO00o(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f8278OooO0Oo;
        if (viewPager != null) {
            OooO00o(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f8278OooO0Oo;
            ViewPager.OooOOO0 oooOOO0 = viewPager2.f8341OoooOOO;
            viewPager2.f8341OoooOOO = null;
            ArrayList arrayList = viewPager2.f8342OoooOOo;
            if (arrayList != null) {
                arrayList.remove(this.f8286OooOOO);
            }
            this.f8278OooO0Oo = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f8278OooO0Oo != null) {
            float f = this.f8277OooO;
            if (f < 0.0f) {
                f = 0.0f;
            }
            OooO0OO(f, this.f8282OooO0oo, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f8280OooO0o0.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f8279OooO0o;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f8281OooO0oO.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f8285OooOO0o) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f8284OooOO0O = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f8289OooOOOo = i;
        int i2 = (i << 24) | (this.f8290OooOOo0 & 16777215);
        this.f8280OooO0o0.setTextColor(i2);
        this.f8281OooO0oO.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.f8290OooOOo0 = i;
        this.f8279OooO0o.setTextColor(i);
        int i2 = (this.f8289OooOOOo << 24) | (this.f8290OooOOo0 & 16777215);
        this.f8280OooO0o0.setTextColor(i2);
        this.f8281OooO0oO.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f8283OooOO0 = i;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8282OooO0oo = -1;
        this.f8277OooO = -1.0f;
        this.f8286OooOOO = new OooO00o();
        TextView textView = new TextView(context);
        this.f8280OooO0o0 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f8279OooO0o = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f8281OooO0oO = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8275OooOOo);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            textView.setTextSize(0, f);
            textView2.setTextSize(0, f);
            textView3.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f8284OooOO0O = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f8290OooOOo0 = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f8276OooOOoo);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f8283OooOO0 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
