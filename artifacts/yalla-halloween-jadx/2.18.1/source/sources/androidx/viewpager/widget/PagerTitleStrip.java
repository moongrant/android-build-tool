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
import androidx.core.widget.TextViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.KotlinVersion;
import p105o000oo0o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final int[] f9627OoooOoo = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final int[] f9628Ooooo00 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f9629Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewPager f9630Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f9631Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f9632Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f9633OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f9634OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f9635OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f9636OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f9637OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO00o f9638OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public WeakReference<o00Ooo> f9639OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f9640OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f9641OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f9642o000oOoO;

    public class OooO00o extends DataSetObserver implements ViewPager.OooOOO0, ViewPager.OooOO0O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f9643Oooo0o;

        public OooO00o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOO0O
        public final void OooO00o(ViewPager viewPager, o00Ooo o00ooo2, o00Ooo o00ooo3) {
            PagerTitleStrip.this.OooO00o(o00ooo2, o00ooo3);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.OooO0O0(pagerTitleStrip.f9630Oooo0o.getCurrentItem(), PagerTitleStrip.this.f9630Oooo0o.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f9634OoooO0;
            if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            pagerTitleStrip2.OooO0OO(pagerTitleStrip2.f9630Oooo0o.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            this.f9643Oooo0o = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.OooO0OO(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (this.f9643Oooo0o == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.OooO0O0(pagerTitleStrip.f9630Oooo0o.getCurrentItem(), PagerTitleStrip.this.f9630Oooo0o.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f9634OoooO0;
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                pagerTitleStrip2.OooO0OO(pagerTitleStrip2.f9630Oooo0o.getCurrentItem(), f, true);
            }
        }
    }

    public static class OooO0O0 extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Locale f9645Oooo0o;

        public OooO0O0(Context context) {
            this.f9645Oooo0o = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f9645Oooo0o);
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

    public final void OooO00o(o00Ooo o00ooo2, o00Ooo o00ooo3) {
        if (o00ooo2 != null) {
            o00ooo2.OooOOOO(this.f9638OoooOOO);
            this.f9639OoooOOo = null;
        }
        if (o00ooo3 != null) {
            o00ooo3.OooOO0(this.f9638OoooOOO);
            this.f9639OoooOOo = new WeakReference<>(o00ooo3);
        }
        ViewPager viewPager = this.f9630Oooo0o;
        if (viewPager != null) {
            this.f9635OoooO00 = -1;
            this.f9634OoooO0 = -1.0f;
            OooO0O0(viewPager.getCurrentItem(), o00ooo3);
            requestLayout();
        }
    }

    public final void OooO0O0(int i, o00Ooo o00ooo2) {
        int iOooO0OO = o00ooo2 != null ? o00ooo2.OooO0OO() : 0;
        this.f9637OoooOO0 = true;
        CharSequence charSequenceOooO0o0 = null;
        this.f9631Oooo0oO.setText((i < 1 || o00ooo2 == null) ? null : o00ooo2.OooO0o0(i - 1));
        this.f9632Oooo0oo.setText((o00ooo2 == null || i >= iOooO0OO) ? null : o00ooo2.OooO0o0(i));
        int i2 = i + 1;
        if (i2 < iOooO0OO && o00ooo2 != null) {
            charSequenceOooO0o0 = o00ooo2.OooO0o0(i2);
        }
        this.f9629Oooo.setText(charSequenceOooO0o0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f9631Oooo0oO.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f9632Oooo0oo.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f9629Oooo.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f9635OoooO00 = i;
        if (!this.f9642o000oOoO) {
            OooO0OO(i, this.f9634OoooO0, false);
        }
        this.f9637OoooOO0 = false;
    }

    public void OooO0OO(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f9635OoooO00) {
            OooO0O0(i, this.f9630Oooo0o.getAdapter());
        } else if (!z && f == this.f9634OoooO0) {
            return;
        }
        this.f9642o000oOoO = true;
        int measuredWidth = this.f9631Oooo0oO.getMeasuredWidth();
        int measuredWidth2 = this.f9632Oooo0oo.getMeasuredWidth();
        int measuredWidth3 = this.f9629Oooo.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f9631Oooo0oO.getBaseline();
        int baseline2 = this.f9632Oooo0oo.getBaseline();
        int baseline3 = this.f9629Oooo.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f9631Oooo0oO.getMeasuredHeight() + i11, this.f9632Oooo0oo.getMeasuredHeight() + i12), this.f9629Oooo.getMeasuredHeight() + i13);
        int i14 = this.f9633OoooO & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.f9632Oooo0oo;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.f9636OoooO0O) - measuredWidth);
            TextView textView2 = this.f9631Oooo0oO;
            textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f9636OoooO0O);
            TextView textView3 = this.f9629Oooo;
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f9634OoooO0 = f;
            this.f9642o000oOoO = false;
        }
        i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f9632Oooo0oo;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f9636OoooO0O) - measuredWidth);
        TextView textView5 = this.f9631Oooo0oO;
        textView5.layout(iMin2, i3, measuredWidth + iMin2, textView5.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f9636OoooO0O);
        TextView textView6 = this.f9629Oooo;
        textView6.layout(iMax4, i5, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i5);
        this.f9634OoooO0 = f;
        this.f9642o000oOoO = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f9636OoooO0O;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        o00Ooo adapter = viewPager.getAdapter();
        OooO00o oooO00o = this.f9638OoooOOO;
        viewPager.f9675o000000o = oooO00o;
        if (viewPager.f9672o00000 == null) {
            viewPager.f9672o00000 = new ArrayList();
        }
        viewPager.f9672o00000.add(oooO00o);
        this.f9630Oooo0o = viewPager;
        WeakReference<o00Ooo> weakReference = this.f9639OoooOOo;
        OooO00o(weakReference != null ? weakReference.get() : null, adapter);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<androidx.viewpager.widget.ViewPager$OooOO0O>] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f9630Oooo0o;
        if (viewPager != null) {
            OooO00o(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f9630Oooo0o;
            ViewPager.OooOOO0 oooOOO0 = viewPager2.f9675o000000o;
            viewPager2.f9675o000000o = null;
            OooO00o oooO00o = this.f9638OoooOOO;
            ?? r0 = viewPager2.f9672o00000;
            if (r0 != 0) {
                r0.remove(oooO00o);
            }
            this.f9630Oooo0o = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9630Oooo0o != null) {
            float f = this.f9634OoooO0;
            if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            OooO0OO(this.f9635OoooO00, f, true);
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
        this.f9631Oooo0oO.measure(childMeasureSpec2, childMeasureSpec);
        this.f9632Oooo0oo.measure(childMeasureSpec2, childMeasureSpec);
        this.f9629Oooo.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.f9632Oooo0oo.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.f9632Oooo0oo.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f9637OoooOO0) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f9633OoooO = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & KotlinVersion.MAX_COMPONENT_VALUE;
        this.f9640OoooOo0 = i;
        int i2 = (i << 24) | (this.f9641OoooOoO & 16777215);
        this.f9631Oooo0oO.setTextColor(i2);
        this.f9629Oooo.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.f9641OoooOoO = i;
        this.f9632Oooo0oo.setTextColor(i);
        int i2 = (this.f9640OoooOo0 << 24) | (this.f9641OoooOoO & 16777215);
        this.f9631Oooo0oO.setTextColor(i2);
        this.f9629Oooo.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f9636OoooO0O = i;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9635OoooO00 = -1;
        this.f9634OoooO0 = -1.0f;
        this.f9638OoooOOO = new OooO00o();
        TextView textView = new TextView(context);
        this.f9631Oooo0oO = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f9632Oooo0oo = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f9629Oooo = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9627OoooOoo);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.OooO0o(this.f9631Oooo0oO, resourceId);
            TextViewCompat.OooO0o(this.f9632Oooo0oo, resourceId);
            TextViewCompat.OooO0o(this.f9629Oooo, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            this.f9631Oooo0oO.setTextSize(0, f);
            this.f9632Oooo0oo.setTextSize(0, f);
            this.f9629Oooo.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f9631Oooo0oO.setTextColor(color);
            this.f9632Oooo0oo.setTextColor(color);
            this.f9629Oooo.setTextColor(color);
        }
        this.f9633OoooO = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f9641OoooOoO = this.f9632Oooo0oo.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f9631Oooo0oO.setEllipsize(TextUtils.TruncateAt.END);
        this.f9632Oooo0oo.setEllipsize(TextUtils.TruncateAt.END);
        this.f9629Oooo.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f9628Ooooo00);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f9631Oooo0oO);
            setSingleLineAllCaps(this.f9632Oooo0oo);
            setSingleLineAllCaps(this.f9629Oooo);
        } else {
            this.f9631Oooo0oO.setSingleLine();
            this.f9632Oooo0oo.setSingleLine();
            this.f9629Oooo.setSingleLine();
        }
        this.f9636OoooO0O = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
