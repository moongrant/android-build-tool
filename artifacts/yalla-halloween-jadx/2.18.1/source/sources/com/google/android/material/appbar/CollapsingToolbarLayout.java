package com.google.android.material.appbar;

import OooOo00.OooOOO;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.o000oOoO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.ULong;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import p021OooOooo.o00O0O;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p343o0OO0ooO.o0OOOO0o;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final int f16402o00o0O = Oooo000.Widget_Design_CollapsingToolbar;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public View f16403Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f16404Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f16405Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public ViewGroup f16406Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f16407OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f16408OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f16409OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f16410OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f16411OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.internal.OooO0OO f16412OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NonNull
    public final o0OOOO0o f16413OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f16414OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f16415OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public Drawable f16416OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public Drawable f16417Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f16418Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f16419OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ValueAnimator f16420OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public long f16421OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OooO0O0 f16422Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f16423Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f16424OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f16425Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final Rect f16426o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f16427o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f16428o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f16429o00Ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f16430o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f16431ooOO;

    public class OooO00o implements oo000o {
        public OooO00o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            Objects.requireNonNull(collapsingToolbarLayout);
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.OooO0o.OooO0O0(collapsingToolbarLayout) ? windowInsetsCompat : null;
            if (!o000OO0O.OooO0OO.OooO00o(collapsingToolbarLayout.f16430o0OoOo0, windowInsetsCompat2)) {
                collapsingToolbarLayout.f16430o0OoOo0 = windowInsetsCompat2;
                collapsingToolbarLayout.requestLayout();
            }
            return windowInsetsCompat.OooO00o();
        }
    }

    public class OooO0O0 implements AppBarLayout.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
        public final void OooO00o(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f16424OoooooO = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f16430o0OoOo0;
            int iOooO = windowInsetsCompat != null ? windowInsetsCompat.OooO() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                OooOO0 oooOO0OooO0Oo = CollapsingToolbarLayout.OooO0Oo(childAt);
                int i3 = layoutParams.f16432OooO00o;
                if (i3 == 1) {
                    oooOO0OooO0Oo.OooO0O0(o00O0O.OooO0o0(-i, 0, CollapsingToolbarLayout.this.OooO0OO(childAt)));
                } else if (i3 == 2) {
                    oooOO0OooO0Oo.OooO0O0(Math.round((-i) * layoutParams.f16433OooO0O0));
                }
            }
            CollapsingToolbarLayout.this.OooO0oo();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f16417Ooooo00 != null && iOooO > 0) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            int iOooO0Oo = (height - ViewCompat.OooO0o.OooO0Oo(collapsingToolbarLayout3)) - iOooO;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            com.google.android.material.internal.OooO0OO oooO0OO = CollapsingToolbarLayout.this.f16412OoooOOO;
            float f = iOooO0Oo;
            float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
            oooO0OO.f17213OooO0o0 = fMin;
            oooO0OO.f17212OooO0o = Oooo000.OooO00o.OooO00o(1.0f, fMin, 0.5f, fMin);
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            com.google.android.material.internal.OooO0OO oooO0OO2 = collapsingToolbarLayout4.f16412OoooOOO;
            oooO0OO2.f17214OooO0oO = collapsingToolbarLayout4.f16424OoooooO + iOooO0Oo;
            oooO0OO2.OooOo(Math.abs(i) / f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    public static int OooO0O0(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @NonNull
    public static OooOO0 OooO0Oo(@NonNull View view) {
        int i = OooOOO0.view_offset_helper;
        OooOO0 oooOO1 = (OooOO0) view.getTag(i);
        if (oooOO1 != null) {
            return oooOO1;
        }
        OooOO0 oooOO2 = new OooOO0(view);
        view.setTag(i, oooOO2);
        return oooOO2;
    }

    public final void OooO(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f16414OoooOo0 || (view = this.f16409OoooO00) == null) {
            return;
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int titleMarginStart = 0;
        boolean z2 = ViewCompat.OooOO0O.OooO0O0(view) && this.f16409OoooO00.getVisibility() == 0;
        this.f16415OoooOoO = z2;
        if (z2 || z) {
            boolean z3 = ViewCompat.OooO.OooO0Oo(this) == 1;
            View view2 = this.f16403Oooo;
            if (view2 == null) {
                view2 = this.f16406Oooo0oo;
            }
            int iOooO0OO = OooO0OO(view2);
            com.google.android.material.internal.OooO0o.OooO00o(this, this.f16409OoooO00, this.f16426o000oOoO);
            ViewGroup viewGroup = this.f16406Oooo0oo;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
            Rect rect = this.f16426o000oOoO;
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + iOooO0OO + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            oooO0OO.OooOOO(i5, i6, i7 - titleMarginStart, (rect.bottom + iOooO0OO) - titleMarginBottom);
            this.f16412OoooOOO.OooOOoo(z3 ? this.f16407OoooO : this.f16408OoooO0, this.f16426o000oOoO.top + this.f16410OoooO0O, (i3 - i) - (z3 ? this.f16408OoooO0 : this.f16407OoooO), (i4 - i2) - this.f16411OoooOO0);
            this.f16412OoooOOO.OooOOO0(z);
        }
    }

    public final void OooO00o() {
        View view;
        if (this.f16404Oooo0o) {
            ViewGroup viewGroup = null;
            this.f16406Oooo0oo = null;
            this.f16403Oooo = null;
            int i = this.f16405Oooo0oO;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f16406Oooo0oo = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f16403Oooo = view;
                }
            }
            if (this.f16406Oooo0oo == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f16406Oooo0oo = viewGroup;
            }
            OooO0oO();
            this.f16404Oooo0o = false;
        }
    }

    public final int OooO0OO(@NonNull View view) {
        return ((getHeight() - OooO0Oo(view).f16470OooO0O0) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public final void OooO0o(@NonNull Drawable drawable, @Nullable View view, int i, int i2) {
        if (OooO0o0() && view != null && this.f16414OoooOo0) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    public final boolean OooO0o0() {
        return this.f16425Ooooooo == 1;
    }

    public final void OooO0oO() {
        View view;
        if (!this.f16414OoooOo0 && (view = this.f16409OoooO00) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f16409OoooO00);
            }
        }
        if (!this.f16414OoooOo0 || this.f16406Oooo0oo == null) {
            return;
        }
        if (this.f16409OoooO00 == null) {
            this.f16409OoooO00 = new View(getContext());
        }
        if (this.f16409OoooO00.getParent() == null) {
            this.f16406Oooo0oo.addView(this.f16409OoooO00, -1, -1);
        }
    }

    public final void OooO0oo() {
        if (this.f16416OoooOoo == null && this.f16417Ooooo00 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f16424OoooooO < getScrimVisibleHeightTrigger());
    }

    public final void OooOO0() {
        CharSequence title;
        if (this.f16406Oooo0oo != null && this.f16414OoooOo0 && TextUtils.isEmpty(this.f16412OoooOOO.f17241Oooo00O)) {
            ViewGroup viewGroup = this.f16406Oooo0oo;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        OooO00o();
        if (this.f16406Oooo0oo == null && (drawable = this.f16416OoooOoo) != null && this.f16418Ooooo0o > 0) {
            drawable.mutate().setAlpha(this.f16418Ooooo0o);
            this.f16416OoooOoo.draw(canvas);
        }
        if (this.f16414OoooOo0 && this.f16415OoooOoO) {
            if (this.f16406Oooo0oo == null || this.f16416OoooOoo == null || this.f16418Ooooo0o <= 0 || !OooO0o0()) {
                this.f16412OoooOOO.OooO0o(canvas);
            } else {
                com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
                if (oooO0OO.f17210OooO0OO < oooO0OO.f17212OooO0o) {
                    int iSave = canvas.save();
                    canvas.clipRect(this.f16416OoooOoo.getBounds(), Region.Op.DIFFERENCE);
                    this.f16412OoooOOO.OooO0o(canvas);
                    canvas.restoreToCount(iSave);
                } else {
                    this.f16412OoooOOO.OooO0o(canvas);
                }
            }
        }
        if (this.f16417Ooooo00 == null || this.f16418Ooooo0o <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f16430o0OoOo0;
        int iOooO = windowInsetsCompat != null ? windowInsetsCompat.OooO() : 0;
        if (iOooO > 0) {
            this.f16417Ooooo00.setBounds(0, -this.f16424OoooooO, getWidth(), iOooO - this.f16424OoooooO);
            this.f16417Ooooo00.mutate().setAlpha(this.f16418Ooooo0o);
            this.f16417Ooooo00.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f16416OoooOoo;
        if (drawable == null || this.f16418Ooooo0o <= 0) {
            z = false;
        } else if ((r3 = this.f16403Oooo) != null) {
            z2 = false;
            if (z2) {
                OooO0o(drawable, view, getWidth(), getHeight());
                this.f16416OoooOoo.mutate().setAlpha(this.f16418Ooooo0o);
                this.f16416OoooOoo.draw(canvas);
                z = true;
            } else {
                z = false;
            }
        } else {
            z2 = false;
            if (z2) {
                OooO0o(drawable, view, getWidth(), getHeight());
                this.f16416OoooOoo.mutate().setAlpha(this.f16418Ooooo0o);
                this.f16416OoooOoo.draw(canvas);
                z = true;
            } else {
                z = false;
            }
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16417Ooooo00;
        boolean zOooOoOO = false;
        if (drawable != null && drawable.isStateful()) {
            zOooOoOO = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f16416OoooOoo;
        if (drawable2 != null && drawable2.isStateful()) {
            zOooOoOO |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
        if (oooO0OO != null) {
            zOooOoOO |= oooO0OO.OooOoOO(drawableState);
        }
        if (zOooOoOO) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public int getCollapsedTitleGravity() {
        return this.f16412OoooOOO.f17218OooOO0o;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f16412OoooOOO.f17226OooOo;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f16416OoooOoo;
    }

    public int getExpandedTitleGravity() {
        return this.f16412OoooOOO.f17217OooOO0O;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f16411OoooOO0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f16407OoooO;
    }

    public int getExpandedTitleMarginStart() {
        return this.f16408OoooO0;
    }

    public int getExpandedTitleMarginTop() {
        return this.f16410OoooO0O;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f16412OoooOOO.f17233OooOoOO;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f16412OoooOOO.f17273o00ooo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        StaticLayout staticLayout = this.f16412OoooOOO.f17266OoooooO;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f16412OoooOOO.f17266OoooooO.getSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f16412OoooOOO.f17266OoooooO.getSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f16412OoooOOO.f17270o00Oo0;
    }

    public int getScrimAlpha() {
        return this.f16418Ooooo0o;
    }

    public long getScrimAnimationDuration() {
        return this.f16421OooooOo;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f16423Oooooo0;
        if (i >= 0) {
            return i + this.f16431ooOO + this.f16428o00Oo0;
        }
        WindowInsetsCompat windowInsetsCompat = this.f16430o0OoOo0;
        int iOooO = windowInsetsCompat != null ? windowInsetsCompat.OooO() : 0;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(this);
        return iOooO0Oo > 0 ? Math.min((iOooO0Oo * 2) + iOooO, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f16417Ooooo00;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f16414OoooOo0) {
            return this.f16412OoooOOO.f17241Oooo00O;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f16425Ooooooo;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f16412OoooOOO.f17268o000oOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (OooO0o0()) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            setFitsSystemWindows(ViewCompat.OooO0o.OooO0O0(appBarLayout));
            if (this.f16422Oooooo == null) {
                this.f16422Oooooo = new OooO0O0();
            }
            appBarLayout.OooO00o(this.f16422Oooooo);
            ViewCompat.OooOOO0.OooO0OO(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16412OoooOOO.OooOO0O(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ?? r0;
        ViewParent parent = getParent();
        OooO0O0 oooO0O0 = this.f16422Oooooo;
        if (oooO0O0 != null && (parent instanceof AppBarLayout) && (r0 = ((AppBarLayout) parent).f16369OoooO) != 0) {
            r0.remove(oooO0O0);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f16430o0OoOo0;
        if (windowInsetsCompat != null) {
            int iOooO = windowInsetsCompat.OooO();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (!ViewCompat.OooO0o.OooO0O0(childAt) && childAt.getTop() < iOooO) {
                    ViewCompat.OooOOOo(childAt, iOooO);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            OooOO0 oooOO0OooO0Oo = OooO0Oo(getChildAt(i6));
            oooOO0OooO0Oo.f16470OooO0O0 = oooOO0OooO0Oo.f16469OooO00o.getTop();
            oooOO0OooO0Oo.f16471OooO0OO = oooOO0OooO0Oo.f16469OooO00o.getLeft();
        }
        OooO(i, i2, i3, i4, false);
        OooOO0();
        OooO0oo();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            OooO0Oo(getChildAt(i7)).OooO00o();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO00o();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f16430o0OoOo0;
        int iOooO = windowInsetsCompat != null ? windowInsetsCompat.OooO() : 0;
        if ((mode == 0 || this.f16427o00O0O) && iOooO > 0) {
            this.f16431ooOO = iOooO;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iOooO, 1073741824));
        }
        if (this.f16429o00Ooo && this.f16412OoooOOO.f17270o00Oo0 > 1) {
            OooOO0();
            OooO(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
            int i3 = oooO0OO.f17224OooOOo0;
            if (i3 > 1) {
                TextPaint textPaint = oooO0OO.f17253OoooOO0;
                textPaint.setTextSize(oooO0OO.f17220OooOOO0);
                textPaint.setTypeface(oooO0OO.f17233OooOoOO);
                textPaint.setLetterSpacing(oooO0OO.f17265Oooooo0);
                this.f16428o00Oo0 = (i3 - 1) * Math.round(oooO0OO.f17253OoooOO0.descent() + (-oooO0OO.f17253OoooOO0.ascent()));
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f16428o00Oo0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f16406Oooo0oo;
        if (viewGroup != null) {
            View view = this.f16403Oooo;
            if (view == null || view == this) {
                setMinimumHeight(OooO0O0(viewGroup));
            } else {
                setMinimumHeight(OooO0O0(view));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f16416OoooOoo;
        if (drawable != null) {
            OooO0o(drawable, this.f16406Oooo0oo, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f16412OoooOOO.OooOOo0(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f16412OoooOOO.OooOOOO(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
        if (oooO0OO.OooOOo(typeface)) {
            oooO0OO.OooOOO0(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16416OoooOoo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16416OoooOoo = drawableMutate;
            if (drawableMutate != null) {
                OooO0o(drawableMutate, this.f16406Oooo0oo, getWidth(), getHeight());
                this.f16416OoooOoo.setCallback(this);
                this.f16416OoooOoo.setAlpha(this.f16418Ooooo0o);
            }
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setContentScrim(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f16412OoooOOO.OooOo0O(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f16411OoooOO0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f16407OoooO = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f16408OoooO0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f16410OoooO0O = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f16412OoooOOO.OooOo00(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f16412OoooOOO.OooOo0(colorStateList);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
        if (oooO0OO.OooOo0o(typeface)) {
            oooO0OO.OooOOO0(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f16429o00Ooo = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f16427o00O0O = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f16412OoooOOO.f17273o00ooo = i;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f16412OoooOOO.f17271o00Ooo = f;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f16412OoooOOO.f17272o00o0O = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f16412OoooOOO;
        if (i != oooO0OO.f17270o00Oo0) {
            oooO0OO.f17270o00Oo0 = i;
            oooO0OO.OooO0o0();
            oooO0OO.OooOOO0(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f16412OoooOOO.f17243Oooo0O0 = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f16418Ooooo0o) {
            if (this.f16416OoooOoo != null && (viewGroup = this.f16406Oooo0oo) != null) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOO0O(viewGroup);
            }
            this.f16418Ooooo0o = i;
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = ULong.MIN_VALUE) long j) {
        this.f16421OooooOo = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = ULong.MIN_VALUE) int i) {
        if (this.f16423Oooooo0 != i) {
            this.f16423Oooooo0 = i;
            OooO0oo();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z2 = ViewCompat.OooOO0O.OooO0OO(this) && !isInEditMode();
        if (this.f16419OooooO0 != z) {
            int i = KotlinVersion.MAX_COMPONENT_VALUE;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                OooO00o();
                ValueAnimator valueAnimator = this.f16420OooooOO;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f16420OooooOO = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f16418Ooooo0o ? p338o0OO0o0O.OooO0o.f37974OooO0OO : p338o0OO0o0O.OooO0o.f37975OooO0Oo);
                    this.f16420OooooOO.addUpdateListener(new OooO(this));
                } else if (valueAnimator.isRunning()) {
                    this.f16420OooooOO.cancel();
                }
                this.f16420OooooOO.setDuration(this.f16421OooooOo);
                this.f16420OooooOO.setIntValues(this.f16418Ooooo0o, i);
                this.f16420OooooOO.start();
            } else {
                setScrimAlpha(z ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            }
            this.f16419OooooO0 = z;
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f16417Ooooo00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16417Ooooo00 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16417Ooooo00.setState(getDrawableState());
                }
                Drawable drawable3 = this.f16417Ooooo00;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                o0OOO0o.OooO0OO(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f16417Ooooo00.setVisible(getVisibility() == 0, false);
                this.f16417Ooooo00.setCallback(this);
                this.f16417Ooooo00.setAlpha(this.f16418Ooooo0o);
            }
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = o000O000.OooO00o.f28085OooO00o;
        setStatusBarScrim(o000O000.OooO00o.OooO0OO.OooO0O0(context, i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f16412OoooOOO.OooOoo0(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.f16425Ooooooo = i;
        boolean zOooO0o0 = OooO0o0();
        this.f16412OoooOOO.f17211OooO0Oo = zOooO0o0;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (OooO0o0()) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (zOooO0o0 && this.f16416OoooOoo == null) {
            float dimension = getResources().getDimension(p337o0OO0o0.OooOO0.design_appbar_elevation);
            o0OOOO0o o0oooo0o2 = this.f16413OoooOOo;
            setContentScrimColor(o0oooo0o2.OooO00o(o0oooo0o2.f38022OooO0Oo, dimension));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f16414OoooOo0) {
            this.f16414OoooOo0 = z;
            setContentDescription(getTitle());
            OooO0oO();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f16412OoooOOO.OooOoO(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f16417Ooooo00;
        if (drawable != null && drawable.isVisible() != z) {
            this.f16417Ooooo00.setVisible(z, false);
        }
        Drawable drawable2 = this.f16416OoooOoo;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f16416OoooOoo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16416OoooOoo || drawable == this.f16417Ooooo00;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f16412OoooOOO.OooOOOo(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        int i3 = f16402o00o0O;
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, i3), attributeSet, i);
        this.f16404Oooo0o = true;
        this.f16426o000oOoO = new Rect();
        this.f16423Oooooo0 = -1;
        this.f16431ooOO = 0;
        this.f16428o00Oo0 = 0;
        Context context2 = getContext();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f16412OoooOOO = oooO0OO;
        oooO0OO.f17254OoooOOO = p338o0OO0o0O.OooO0o.f37976OooO0o0;
        oooO0OO.OooOOO0(false);
        oooO0OO.f17243Oooo0O0 = false;
        this.f16413OoooOOo = new o0OOOO0o(context2);
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context2, attributeSet, Oooo0.CollapsingToolbarLayout, i, i3, new int[0]);
        oooO0OO.OooOo0O(typedArrayOooO0Oo.getInt(Oooo0.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        oooO0OO.OooOOo0(typedArrayOooO0Oo.getInt(Oooo0.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f16411OoooOO0 = dimensionPixelSize;
        this.f16407OoooO = dimensionPixelSize;
        this.f16410OoooO0O = dimensionPixelSize;
        this.f16408OoooO0 = dimensionPixelSize;
        int i4 = Oooo0.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayOooO0Oo.hasValue(i4)) {
            this.f16408OoooO0 = typedArrayOooO0Oo.getDimensionPixelSize(i4, 0);
        }
        int i5 = Oooo0.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            this.f16407OoooO = typedArrayOooO0Oo.getDimensionPixelSize(i5, 0);
        }
        int i6 = Oooo0.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayOooO0Oo.hasValue(i6)) {
            this.f16410OoooO0O = typedArrayOooO0Oo.getDimensionPixelSize(i6, 0);
        }
        int i7 = Oooo0.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayOooO0Oo.hasValue(i7)) {
            this.f16411OoooOO0 = typedArrayOooO0Oo.getDimensionPixelSize(i7, 0);
        }
        this.f16414OoooOo0 = typedArrayOooO0Oo.getBoolean(Oooo0.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayOooO0Oo.getText(Oooo0.CollapsingToolbarLayout_title));
        oooO0OO.OooOo00(Oooo000.TextAppearance_Design_CollapsingToolbar_Expanded);
        oooO0OO.OooOOOO(OooOOO.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i8 = Oooo0.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayOooO0Oo.hasValue(i8)) {
            oooO0OO.OooOo00(typedArrayOooO0Oo.getResourceId(i8, 0));
        }
        int i9 = Oooo0.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayOooO0Oo.hasValue(i9)) {
            oooO0OO.OooOOOO(typedArrayOooO0Oo.getResourceId(i9, 0));
        }
        int i10 = Oooo0.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayOooO0Oo.hasValue(i10)) {
            oooO0OO.OooOo0(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i10));
        }
        int i11 = Oooo0.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayOooO0Oo.hasValue(i11)) {
            oooO0OO.OooOOOo(o0OOO0O.OooO0OO.OooO00o(context2, typedArrayOooO0Oo, i11));
        }
        this.f16423Oooooo0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i12 = Oooo0.CollapsingToolbarLayout_maxLines;
        if (typedArrayOooO0Oo.hasValue(i12) && (i2 = typedArrayOooO0Oo.getInt(i12, 1)) != oooO0OO.f17270o00Oo0) {
            oooO0OO.f17270o00Oo0 = i2;
            oooO0OO.OooO0o0();
            oooO0OO.OooOOO0(false);
        }
        int i13 = Oooo0.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayOooO0Oo.hasValue(i13)) {
            oooO0OO.OooOoO(AnimationUtils.loadInterpolator(context2, typedArrayOooO0Oo.getResourceId(i13, 0)));
        }
        this.f16421OooooOo = typedArrayOooO0Oo.getInt(Oooo0.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayOooO0Oo.getDrawable(Oooo0.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayOooO0Oo.getDrawable(Oooo0.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayOooO0Oo.getInt(Oooo0.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f16405Oooo0oO = typedArrayOooO0Oo.getResourceId(Oooo0.CollapsingToolbarLayout_toolbarId, -1);
        this.f16427o00O0O = typedArrayOooO0Oo.getBoolean(Oooo0.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f16429o00Ooo = typedArrayOooO0Oo.getBoolean(Oooo0.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayOooO0Oo.recycle();
        setWillNotDraw(false);
        OooO00o oooO00o = new OooO00o();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(this, oooO00o);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16432OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f16433OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16432OooO00o = 0;
            this.f16433OooO0O0 = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.CollapsingToolbarLayout_Layout);
            this.f16432OooO00o = typedArrayObtainStyledAttributes.getInt(Oooo0.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f16433OooO0O0 = typedArrayObtainStyledAttributes.getFloat(Oooo0.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f16432OooO00o = 0;
            this.f16433OooO0O0 = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16432OooO00o = 0;
            this.f16433OooO0O0 = 0.5f;
        }
    }
}
