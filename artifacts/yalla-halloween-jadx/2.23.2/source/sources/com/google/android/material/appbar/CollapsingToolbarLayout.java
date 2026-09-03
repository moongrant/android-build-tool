package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
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
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.o00oO0o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.ULong;
import org.jctools.util.Pow2;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;
import p422o0OoO00O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final int f15730Oooo0 = o0000O0O.Widget_Design_CollapsingToolbar;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f15731OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public ViewGroup f15733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15734OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public View f15735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public View f15736OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f15737OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f15738OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f15739OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.internal.OooO0OO f15740OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Rect f15741OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final o00O0O f15742OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f15743OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f15744OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15745OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Drawable f15746OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final TimeInterpolator f15747OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f15748OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f15749OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ValueAnimator f15750OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f15751OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f15752OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final TimeInterpolator f15753OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO0O0 f15754OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f15755OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f15756OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f15757OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f15758OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f15759Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f15760Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f15761Oooo00o;

    public class OooO00o implements o000000O {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.OooO0o.OooO0O0(collapsingToolbarLayout) ? windowInsetsCompat : null;
            if (!o000OO.OooO0OO.OooO00o(collapsingToolbarLayout.f15757OooOooO, windowInsetsCompat2)) {
                collapsingToolbarLayout.f15757OooOooO = windowInsetsCompat2;
                collapsingToolbarLayout.requestLayout();
            }
            return windowInsetsCompat.f5389OooO00o.OooO0OO();
        }
    }

    public class OooO0O0 implements AppBarLayout.OooO0O0 {
        public OooO0O0() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
        public final void OooO00o(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f15756OooOoo0 = i;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.f15757OooOooO;
            int iOooO0o = windowInsetsCompat != null ? windowInsetsCompat.OooO0o() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = collapsingToolbarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                o000oOoO o000ooooOooO0O0 = CollapsingToolbarLayout.OooO0O0(childAt);
                int i3 = layoutParams.f15762OooO00o;
                if (i3 == 1) {
                    o000ooooOooO0O0.OooO0O0(o0000O00.OooO00o.OooO0O0(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.OooO0O0(childAt).f15810OooO0O0) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).bottomMargin));
                } else if (i3 == 2) {
                    o000ooooOooO0O0.OooO0O0(Math.round((-i) * layoutParams.f15763OooO0O0));
                }
            }
            collapsingToolbarLayout.OooO0Oo();
            if (collapsingToolbarLayout.f15746OooOOoo != null && iOooO0o > 0) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(collapsingToolbarLayout);
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            int iOooO0Oo = (height - ViewCompat.OooO0o.OooO0Oo(collapsingToolbarLayout)) - iOooO0o;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f = iOooO0Oo;
            float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
            com.google.android.material.internal.OooO0OO oooO0OO = collapsingToolbarLayout.f15740OooOOO;
            oooO0OO.f16739OooO0Oo = fMin;
            oooO0OO.f16741OooO0o0 = OooOo.OooO0o.OooO00o(1.0f, fMin, 0.5f, fMin);
            oooO0OO.f16740OooO0o = collapsingToolbarLayout.f15756OooOoo0 + iOooO0Oo;
            oooO0OO.OooOOOo(Math.abs(i) / f);
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO0OO {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public static o000oOoO OooO0O0(@NonNull View view) {
        int i = o0000Ooo.view_offset_helper;
        o000oOoO o000oooo2 = (o000oOoO) view.getTag(i);
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        o000oOoO o000oooo3 = new o000oOoO(view);
        view.setTag(i, o000oooo3);
        return o000oooo3;
    }

    public final void OooO00o() {
        View view;
        if (this.f15732OooO0Oo) {
            ViewGroup viewGroup = null;
            this.f15733OooO0o = null;
            this.f15735OooO0oO = null;
            int i = this.f15734OooO0o0;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f15733OooO0o = viewGroup2;
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
                    this.f15735OooO0oO = view;
                }
            }
            if (this.f15733OooO0o == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f15733OooO0o = viewGroup;
            }
            OooO0OO();
            this.f15732OooO0Oo = false;
        }
    }

    public final void OooO0OO() {
        View view;
        if (!this.f15743OooOOOo && (view = this.f15736OooO0oo) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f15736OooO0oo);
            }
        }
        if (!this.f15743OooOOOo || this.f15733OooO0o == null) {
            return;
        }
        if (this.f15736OooO0oo == null) {
            this.f15736OooO0oo = new View(getContext());
        }
        if (this.f15736OooO0oo.getParent() == null) {
            this.f15733OooO0o.addView(this.f15736OooO0oo, -1, -1);
        }
    }

    public final void OooO0Oo() {
        if (this.f15744OooOOo == null && this.f15746OooOOoo == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f15756OooOoo0 < getScrimVisibleHeightTrigger());
    }

    public final void OooO0o() {
        CharSequence title;
        if (this.f15733OooO0o != null && this.f15743OooOOOo && TextUtils.isEmpty(this.f15740OooOOO.f16769Oooo00O)) {
            ViewGroup viewGroup = this.f15733OooO0o;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    public final void OooO0o0(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int titleMarginBottom;
        int titleMarginStart;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f15743OooOOOo || (view = this.f15736OooO0oo) == null) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z2 = false;
        boolean z3 = ViewCompat.OooOO0O.OooO0O0(view) && this.f15736OooO0oo.getVisibility() == 0;
        this.f15745OooOOo0 = z3;
        if (z3 || z) {
            boolean z4 = ViewCompat.OooO.OooO0Oo(this) == 1;
            View view2 = this.f15735OooO0oO;
            if (view2 == null) {
                view2 = this.f15733OooO0o;
            }
            int height = ((getHeight() - OooO0O0(view2).f15810OooO0O0) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f15736OooO0oo;
            Rect rect = this.f15741OooOOO0;
            com.google.android.material.internal.OooO0o.OooO00o(this, view3, rect);
            ViewGroup viewGroup = this.f15733OooO0o;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginStart = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            int i5 = rect.left + (z4 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z4) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
            Rect rect2 = oooO0OO.f16743OooO0oo;
            if (!(rect2.left == i5 && rect2.top == i6 && rect2.right == i8 && rect2.bottom == i9)) {
                rect2.set(i5, i6, i8, i9);
                oooO0OO.f16780OoooO0O = true;
            }
            int i10 = z4 ? this.f15738OooOO0O : this.f15731OooO;
            int i11 = rect.top + this.f15737OooOO0;
            int i12 = (i3 - i) - (z4 ? this.f15731OooO : this.f15738OooOO0O);
            int i13 = (i4 - i2) - this.f15739OooOO0o;
            Rect rect3 = oooO0OO.f16742OooO0oO;
            if (rect3.left == i10 && rect3.top == i11 && rect3.right == i12 && rect3.bottom == i13) {
                z2 = true;
            }
            if (!z2) {
                rect3.set(i10, i11, i12, i13);
                oooO0OO.f16780OoooO0O = true;
            }
            oooO0OO.OooO(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        OooO00o();
        if (this.f15733OooO0o == null && (drawable = this.f15744OooOOo) != null && this.f15749OooOo00 > 0) {
            drawable.mutate().setAlpha(this.f15749OooOo00);
            this.f15744OooOOo.draw(canvas);
        }
        if (this.f15743OooOOOo && this.f15745OooOOo0) {
            ViewGroup viewGroup = this.f15733OooO0o;
            com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
            if (viewGroup == null || this.f15744OooOOo == null || this.f15749OooOo00 <= 0) {
                oooO0OO.OooO0Oo(canvas);
            } else {
                if (!(this.f15755OooOoo == 1) || oooO0OO.f16737OooO0O0 >= oooO0OO.f16741OooO0o0) {
                    oooO0OO.OooO0Oo(canvas);
                } else {
                    int iSave = canvas.save();
                    canvas.clipRect(this.f15744OooOOo.getBounds(), Region.Op.DIFFERENCE);
                    oooO0OO.OooO0Oo(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f15746OooOOoo == null || this.f15749OooOo00 <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f15757OooOooO;
        int iOooO0o = windowInsetsCompat != null ? windowInsetsCompat.OooO0o() : 0;
        if (iOooO0o > 0) {
            this.f15746OooOOoo.setBounds(0, -this.f15756OooOoo0, getWidth(), iOooO0o - this.f15756OooOoo0);
            this.f15746OooOOoo.mutate().setAlpha(this.f15749OooOo00);
            this.f15746OooOOoo.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
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
        int height;
        boolean z3;
        Drawable drawable = this.f15744OooOOo;
        if (drawable == null || this.f15749OooOo00 <= 0) {
            z = false;
        } else if ((r3 = this.f15735OooO0oO) != null) {
            z2 = false;
            if (z2) {
                int width = getWidth();
                height = getHeight();
                if (this.f15755OooOoo == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && view != null && this.f15743OooOOOo) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.f15744OooOOo.mutate().setAlpha(this.f15749OooOo00);
                this.f15744OooOOo.draw(canvas);
                z = true;
            } else {
                z = false;
            }
        } else {
            z2 = false;
            if (z2) {
                int width2 = getWidth();
                height = getHeight();
                if (this.f15755OooOoo == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width2, height);
                this.f15744OooOOo.mutate().setAlpha(this.f15749OooOo00);
                this.f15744OooOOo.draw(canvas);
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
        Drawable drawable = this.f15746OooOOoo;
        boolean zOooOOo = false;
        if (drawable != null && drawable.isStateful()) {
            zOooOOo = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f15744OooOOo;
        if (drawable2 != null && drawable2.isStateful()) {
            zOooOOo |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO != null) {
            zOooOOo |= oooO0OO.OooOOo(drawableState);
        }
        if (zOooOOo) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public int getCollapsedTitleGravity() {
        return this.f15740OooOOO.f16745OooOO0O;
    }

    public float getCollapsedTitleTextSize() {
        return this.f15740OooOOO.f16748OooOOO0;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f15740OooOOO.f16758OooOo0o;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f15744OooOOo;
    }

    public int getExpandedTitleGravity() {
        return this.f15740OooOOO.f16744OooOO0;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f15739OooOO0o;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f15738OooOO0O;
    }

    public int getExpandedTitleMarginStart() {
        return this.f15731OooO;
    }

    public int getExpandedTitleMarginTop() {
        return this.f15737OooOO0;
    }

    public float getExpandedTitleTextSize() {
        return this.f15740OooOOO.f16746OooOO0o;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f15740OooOOO.f16759OooOoO;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f15740OooOOO.f16801o00ooo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        StaticLayout staticLayout = this.f15740OooOOO.f16794OoooooO;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f15740OooOOO.f16794OoooooO.getSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f15740OooOOO.f16794OoooooO.getSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f15740OooOOO.f16798o00Oo0;
    }

    public int getScrimAlpha() {
        return this.f15749OooOo00;
    }

    public long getScrimAnimationDuration() {
        return this.f15751OooOo0o;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f15752OooOoO;
        if (i >= 0) {
            return i + this.f15758OooOooo + this.f15760Oooo00O;
        }
        WindowInsetsCompat windowInsetsCompat = this.f15757OooOooO;
        int iOooO0o = windowInsetsCompat != null ? windowInsetsCompat.OooO0o() : 0;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(this);
        return iOooO0Oo > 0 ? Math.min((iOooO0Oo * 2) + iOooO0o, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f15746OooOOoo;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f15743OooOOOo) {
            return this.f15740OooOOO.f16769Oooo00O;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f15755OooOoo;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f15740OooOOO.f16796o000oOoO;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f15740OooOOO.f16768Oooo000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f15755OooOoo == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            setFitsSystemWindows(ViewCompat.OooO0o.OooO0O0(appBarLayout));
            if (this.f15754OooOoOO == null) {
                this.f15754OooOoOO = new OooO0O0();
            }
            appBarLayout.OooO00o(this.f15754OooOoOO);
            ViewCompat.OooOOO0.OooO0OO(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15740OooOOO.OooO0oo(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        OooO0O0 oooO0O0 = this.f15754OooOoOO;
        if (oooO0O0 != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f15695OooOO0O) != null) {
            arrayList.remove(oooO0O0);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.f15757OooOooO;
        if (windowInsetsCompat != null) {
            int iOooO0o = windowInsetsCompat.OooO0o();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                if (!ViewCompat.OooO0o.OooO0O0(childAt) && childAt.getTop() < iOooO0o) {
                    childAt.offsetTopAndBottom(iOooO0o);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            o000oOoO o000ooooOooO0O0 = OooO0O0(getChildAt(i6));
            View view = o000ooooOooO0O0.f15809OooO00o;
            o000ooooOooO0O0.f15810OooO0O0 = view.getTop();
            o000ooooOooO0O0.f15811OooO0OO = view.getLeft();
        }
        OooO0o0(i, i2, i3, i4, false);
        OooO0o();
        OooO0Oo();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            OooO0O0(getChildAt(i7)).OooO00o();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        OooO00o();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.f15757OooOooO;
        int iOooO0o = windowInsetsCompat != null ? windowInsetsCompat.OooO0o() : 0;
        if ((mode == 0 || this.f15759Oooo000) && iOooO0o > 0) {
            this.f15758OooOooo = iOooO0o;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iOooO0o, Pow2.MAX_POW2));
        }
        if (this.f15761Oooo00o) {
            com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
            if (oooO0OO.f16798o00Oo0 > 1) {
                OooO0o();
                OooO0o0(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i3 = oooO0OO.f16750OooOOOo;
                if (i3 > 1) {
                    TextPaint textPaint = oooO0OO.f16781OoooOO0;
                    textPaint.setTextSize(oooO0OO.f16746OooOO0o);
                    textPaint.setTypeface(oooO0OO.f16759OooOoO);
                    textPaint.setLetterSpacing(oooO0OO.f16793Oooooo0);
                    this.f15760Oooo00O = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f15760Oooo00O, Pow2.MAX_POW2));
                }
            }
        }
        ViewGroup viewGroup = this.f15733OooO0o;
        if (viewGroup != null) {
            View view = this.f15735OooO0oO;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f15744OooOOo;
        if (drawable != null) {
            ViewGroup viewGroup = this.f15733OooO0o;
            if ((this.f15755OooOoo == 1) && viewGroup != null && this.f15743OooOOOo) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f15740OooOOO.OooOO0o(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.f15740OooOOO.OooOO0O(i);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.f16749OooOOOO != colorStateList) {
            oooO0OO.f16749OooOOOO = colorStateList;
            oooO0OO.OooO(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.f16748OooOOO0 != f) {
            oooO0OO.f16748OooOOO0 = f;
            oooO0OO.OooO(false);
        }
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.OooOOO0(typeface)) {
            oooO0OO.OooO(false);
        }
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f15744OooOOo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f15744OooOOo = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f15733OooO0o;
                if ((this.f15755OooOoo == 1) && viewGroup != null && this.f15743OooOOOo) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f15744OooOOo.setCallback(this);
                this.f15744OooOOo.setAlpha(this.f15749OooOo00);
            }
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setContentScrim(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.f16744OooOO0 != i) {
            oooO0OO.f16744OooOO0 = i;
            oooO0OO.OooO(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f15739OooOO0o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f15738OooOO0O = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f15731OooO = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f15737OooOO0 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.f15740OooOOO.OooOOO(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.f16747OooOOO != colorStateList) {
            oooO0OO.f16747OooOOO = colorStateList;
            oooO0OO.OooO(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.f16746OooOO0o != f) {
            oooO0OO.f16746OooOO0o = f;
            oooO0OO.OooO(false);
        }
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (oooO0OO.OooOOOO(typeface)) {
            oooO0OO.OooO(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f15761Oooo00o = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f15759Oooo000 = z;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i) {
        this.f15740OooOOO.f16801o00ooo = i;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f) {
        this.f15740OooOOO.f16799o00Ooo = f;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f15740OooOOO.f16800o00o0O = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (i != oooO0OO.f16798o00Oo0) {
            oooO0OO.f16798o00Oo0 = i;
            Bitmap bitmap = oooO0OO.f16772Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooO0OO.f16772Oooo0OO = null;
            }
            oooO0OO.OooO(false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f15740OooOOO.f16771Oooo0O0 = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f15749OooOo00) {
            if (this.f15744OooOOo != null && (viewGroup = this.f15733OooO0o) != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOO0O(viewGroup);
            }
            this.f15749OooOo00 = i;
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = ULong.MIN_VALUE) long j) {
        this.f15751OooOo0o = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = ULong.MIN_VALUE) int i) {
        if (this.f15752OooOoO != i) {
            this.f15752OooOoO = i;
            OooO0Oo();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z2 = ViewCompat.OooOO0O.OooO0OO(this) && !isInEditMode();
        if (this.f15748OooOo0 != z) {
            if (z2) {
                int i = z ? 255 : 0;
                OooO00o();
                ValueAnimator valueAnimator = this.f15750OooOo0O;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f15750OooOo0O = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f15749OooOo00 ? this.f15747OooOo : this.f15753OooOoO0);
                    this.f15750OooOo0O.addUpdateListener(new Oooo0(this));
                } else if (valueAnimator.isRunning()) {
                    this.f15750OooOo0O.cancel();
                }
                this.f15750OooOo0O.setDuration(this.f15751OooOo0o);
                this.f15750OooOo0O.setIntValues(this.f15749OooOo00, i);
                this.f15750OooOo0O.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f15748OooOo0 = z;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable OooO0OO oooO0OO) {
        com.google.android.material.internal.OooO0OO oooO0OO2 = this.f15740OooOOO;
        if (oooO0OO != null) {
            oooO0OO2.OooO(true);
        } else {
            oooO0OO2.getClass();
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f15746OooOOoo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f15746OooOOoo = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f15746OooOOoo.setState(getDrawableState());
                }
                Drawable drawable3 = this.f15746OooOOoo;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                o00Ooo.OooO0OO.OooO0O0(drawable3, ViewCompat.OooO.OooO0Oo(this));
                this.f15746OooOOoo.setVisible(getVisibility() == 0, false);
                this.f15746OooOOoo.setCallback(this);
                this.f15746OooOOoo.setAlpha(this.f15749OooOo00);
            }
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f5281OooO00o;
        setStatusBarScrim(ContextCompat.OooO0OO.OooO0O0(context, i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        if (charSequence == null || !TextUtils.equals(oooO0OO.f16769Oooo00O, charSequence)) {
            oooO0OO.f16769Oooo00O = charSequence;
            oooO0OO.f16770Oooo00o = null;
            Bitmap bitmap = oooO0OO.f16772Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooO0OO.f16772Oooo0OO = null;
            }
            oooO0OO.OooO(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.f15755OooOoo = i;
        boolean z = i == 1;
        this.f15740OooOOO.f16738OooO0OO = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f15755OooOoo == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.f15744OooOOo == null) {
            float dimension = getResources().getDimension(o00000O.design_appbar_elevation);
            o00O0O o00o0o2 = this.f15742OooOOOO;
            setContentScrimColor(o00o0o2.OooO00o(dimension, o00o0o2.f46617OooO0Oo));
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        oooO0OO.f16768Oooo000 = truncateAt;
        oooO0OO.OooO(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f15743OooOOOo) {
            this.f15743OooOOOo = z;
            setContentDescription(getTitle());
            OooO0OO();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.OooO0OO oooO0OO = this.f15740OooOOO;
        oooO0OO.f16796o000oOoO = timeInterpolator;
        oooO0OO.OooO(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f15746OooOOoo;
        if (drawable != null && drawable.isVisible() != z) {
            this.f15746OooOOoo.setVisible(z, false);
        }
        Drawable drawable2 = this.f15744OooOOo;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f15744OooOOo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15744OooOOo || drawable == this.f15746OooOOoo;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList colorStateListOooO00o;
        ColorStateList colorStateListOooO00o2;
        TextUtils.TruncateAt truncateAt;
        int i3 = f15730Oooo0;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i3), attributeSet, i);
        this.f15732OooO0Oo = true;
        this.f15741OooOOO0 = new Rect();
        this.f15752OooOoO = -1;
        this.f15758OooOooo = 0;
        this.f15760Oooo00O = 0;
        Context context2 = getContext();
        com.google.android.material.internal.OooO0OO oooO0OO = new com.google.android.material.internal.OooO0OO(this);
        this.f15740OooOOO = oooO0OO;
        oooO0OO.f16782OoooOOO = o0O000.OooO0O0.f40884OooO0o0;
        oooO0OO.OooO(false);
        oooO0OO.f16771Oooo0O0 = false;
        this.f15742OooOOOO = new o00O0O(context2);
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context2, attributeSet, o000OO.CollapsingToolbarLayout, i, i3, new int[0]);
        int i4 = typedArrayOooO0Oo.getInt(o000OO.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (oooO0OO.f16744OooOO0 != i4) {
            oooO0OO.f16744OooOO0 = i4;
            oooO0OO.OooO(false);
        }
        oooO0OO.OooOO0o(typedArrayOooO0Oo.getInt(o000OO.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f15739OooOO0o = dimensionPixelSize;
        this.f15738OooOO0O = dimensionPixelSize;
        this.f15737OooOO0 = dimensionPixelSize;
        this.f15731OooO = dimensionPixelSize;
        int i5 = o000OO.CollapsingToolbarLayout_expandedTitleMarginStart;
        if (typedArrayOooO0Oo.hasValue(i5)) {
            this.f15731OooO = typedArrayOooO0Oo.getDimensionPixelSize(i5, 0);
        }
        int i6 = o000OO.CollapsingToolbarLayout_expandedTitleMarginEnd;
        if (typedArrayOooO0Oo.hasValue(i6)) {
            this.f15738OooOO0O = typedArrayOooO0Oo.getDimensionPixelSize(i6, 0);
        }
        int i7 = o000OO.CollapsingToolbarLayout_expandedTitleMarginTop;
        if (typedArrayOooO0Oo.hasValue(i7)) {
            this.f15737OooOO0 = typedArrayOooO0Oo.getDimensionPixelSize(i7, 0);
        }
        int i8 = o000OO.CollapsingToolbarLayout_expandedTitleMarginBottom;
        if (typedArrayOooO0Oo.hasValue(i8)) {
            this.f15739OooOO0o = typedArrayOooO0Oo.getDimensionPixelSize(i8, 0);
        }
        this.f15743OooOOOo = typedArrayOooO0Oo.getBoolean(o000OO.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayOooO0Oo.getText(o000OO.CollapsingToolbarLayout_title));
        oooO0OO.OooOOO(o0000O0O.TextAppearance_Design_CollapsingToolbar_Expanded);
        oooO0OO.OooOO0O(p012OooOo0O.o0OoOo0.TextAppearance_AppCompat_Widget_ActionBar_Title);
        int i9 = o000OO.CollapsingToolbarLayout_expandedTitleTextAppearance;
        if (typedArrayOooO0Oo.hasValue(i9)) {
            oooO0OO.OooOOO(typedArrayOooO0Oo.getResourceId(i9, 0));
        }
        int i10 = o000OO.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        if (typedArrayOooO0Oo.hasValue(i10)) {
            oooO0OO.OooOO0O(typedArrayOooO0Oo.getResourceId(i10, 0));
        }
        int i11 = o000OO.CollapsingToolbarLayout_titleTextEllipsize;
        if (typedArrayOooO0Oo.hasValue(i11)) {
            int i12 = typedArrayOooO0Oo.getInt(i11, -1);
            if (i12 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i12 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i12 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        int i13 = o000OO.CollapsingToolbarLayout_expandedTitleTextColor;
        if (typedArrayOooO0Oo.hasValue(i13) && oooO0OO.f16747OooOOO != (colorStateListOooO00o2 = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, i13))) {
            oooO0OO.f16747OooOOO = colorStateListOooO00o2;
            oooO0OO.OooO(false);
        }
        int i14 = o000OO.CollapsingToolbarLayout_collapsedTitleTextColor;
        if (typedArrayOooO0Oo.hasValue(i14) && oooO0OO.f16749OooOOOO != (colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context2, typedArrayOooO0Oo, i14))) {
            oooO0OO.f16749OooOOOO = colorStateListOooO00o;
            oooO0OO.OooO(false);
        }
        this.f15752OooOoO = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        int i15 = o000OO.CollapsingToolbarLayout_maxLines;
        if (typedArrayOooO0Oo.hasValue(i15) && (i2 = typedArrayOooO0Oo.getInt(i15, 1)) != oooO0OO.f16798o00Oo0) {
            oooO0OO.f16798o00Oo0 = i2;
            Bitmap bitmap = oooO0OO.f16772Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooO0OO.f16772Oooo0OO = null;
            }
            oooO0OO.OooO(false);
        }
        int i16 = o000OO.CollapsingToolbarLayout_titlePositionInterpolator;
        if (typedArrayOooO0Oo.hasValue(i16)) {
            oooO0OO.f16796o000oOoO = AnimationUtils.loadInterpolator(context2, typedArrayOooO0Oo.getResourceId(i16, 0));
            oooO0OO.OooO(false);
        }
        this.f15751OooOo0o = typedArrayOooO0Oo.getInt(o000OO.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        int i17 = o00000.motionEasingStandardInterpolator;
        this.f15747OooOo = o0O00OOO.OooO00o.OooO0Oo(context2, i17, o0O000.OooO0O0.f40882OooO0OO);
        this.f15753OooOoO0 = o0O00OOO.OooO00o.OooO0Oo(context2, i17, o0O000.OooO0O0.f40883OooO0Oo);
        setContentScrim(typedArrayOooO0Oo.getDrawable(o000OO.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayOooO0Oo.getDrawable(o000OO.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayOooO0Oo.getInt(o000OO.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f15734OooO0o0 = typedArrayOooO0Oo.getResourceId(o000OO.CollapsingToolbarLayout_toolbarId, -1);
        this.f15759Oooo000 = typedArrayOooO0Oo.getBoolean(o000OO.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f15761Oooo00o = typedArrayOooO0Oo.getBoolean(o000OO.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayOooO0Oo.recycle();
        setWillNotDraw(false);
        OooO00o oooO00o = new OooO00o();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(this, oooO00o);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f15762OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f15763OooO0O0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15762OooO00o = 0;
            this.f15763OooO0O0 = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.CollapsingToolbarLayout_Layout);
            this.f15762OooO00o = typedArrayObtainStyledAttributes.getInt(o000OO.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f15763OooO0O0 = typedArrayObtainStyledAttributes.getFloat(o000OO.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.f15762OooO00o = 0;
            this.f15763OooO0O0 = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15762OooO00o = 0;
            this.f15763OooO0O0 = 0.5f;
        }
    }
}
