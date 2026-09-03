package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.o000O0O0;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.badge.BadgeDrawable;
import java.util.WeakHashMap;
import o0000O.o0O0O00;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o0000;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o00000OO;
import p272o0O0000o.o0000O0;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f16884OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Drawable f16886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ColorStateList f16887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f16888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f16889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f16890OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f16891OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f16892OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f16893OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f16894OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final View f16895OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ImageView f16896OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final TextView f16897OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ViewGroup f16898OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final TextView f16899OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Drawable f16900OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooOO0O f16901OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f16902OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f16903OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Drawable f16904OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO0OO f16905OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ValueAnimator f16906OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f16907OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f16908OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f16909OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f16910OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f16911OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f16912Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public BadgeDrawable f16913Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f16882Oooo00o = {R.attr.state_checked};

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO0OO f16881Oooo0 = new OooO0OO();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0o f16883Oooo0O0 = new OooO0o();

    public class OooO00o implements View.OnLayoutChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            if (navigationBarItemView.f16896OooOOOo.getVisibility() == 0) {
                BadgeDrawable badgeDrawable = navigationBarItemView.f16913Oooo00O;
                if (badgeDrawable != null) {
                    Rect rect = new Rect();
                    ImageView imageView = navigationBarItemView.f16896OooOOOo;
                    imageView.getDrawingRect(rect);
                    badgeDrawable.setBounds(rect);
                    badgeDrawable.OooO0oo(imageView, null);
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f16915OooO0Oo;

        public OooO0O0(int i) {
            this.f16915OooO0Oo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = NavigationBarItemView.f16882Oooo00o;
            NavigationBarItemView.this.OooO0oO(this.f16915OooO0Oo);
        }
    }

    public static class OooO0OO {
        public float OooO00o(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return 1.0f;
        }
    }

    public static class OooO0o extends OooO0OO {
        @Override // com.google.android.material.navigation.NavigationBarItemView.OooO0OO
        public final float OooO00o(float f, float f2) {
            LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
            return (f * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f16885OooO0Oo = false;
        this.f16902OooOo00 = -1;
        this.f16905OooOoO = f16881Oooo0;
        this.f16907OooOoOO = 0.0f;
        this.f16909OooOoo0 = false;
        this.f16908OooOoo = 0;
        this.f16910OooOooO = 0;
        this.f16911OooOooo = false;
        this.f16912Oooo000 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f16893OooOOO = (FrameLayout) findViewById(o0000Ooo.navigation_bar_item_icon_container);
        this.f16895OooOOOO = findViewById(o0000Ooo.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(o0000Ooo.navigation_bar_item_icon_view);
        this.f16896OooOOOo = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(o0000Ooo.navigation_bar_item_labels_group);
        this.f16898OooOOo0 = viewGroup;
        TextView textView = (TextView) findViewById(o0000Ooo.navigation_bar_item_small_label_view);
        this.f16897OooOOo = textView;
        TextView textView2 = (TextView) findViewById(o0000Ooo.navigation_bar_item_large_label_view);
        this.f16899OooOOoo = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f16888OooO0oO = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f16889OooO0oo = viewGroup.getPaddingBottom();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOoo(textView, 2);
        ViewCompat.OooO0o.OooOOoo(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f16884OooO = textSize - textSize2;
        this.f16890OooOO0 = (textSize2 * 1.0f) / textSize;
        this.f16891OooOO0O = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new OooO00o());
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static void OooO0Oo(TextView textView, @StyleRes int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, o000OO.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(o000OO.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void OooO0o(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void OooO0o0(float f, float f2, int i, @NonNull TextView textView) {
        textView.setScaleX(f);
        textView.setScaleY(f2);
        textView.setVisibility(i);
    }

    public static void OooO0oo(int i, @NonNull ViewGroup viewGroup) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f16893OooOOO;
        return frameLayout != null ? frameLayout : this.f16896OooOOOo;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.f16913Oooo00O;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.f16896OooOOOo.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.f16913Oooo00O;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.f16913Oooo00O.f15821OooO0oo.f15831OooO0O0.f15858OooOo0.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f16896OooOOOo.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public final void OooO00o() {
        Drawable rippleDrawable = this.f16886OooO0o;
        ColorStateList colorStateList = this.f16887OooO0o0;
        FrameLayout frameLayout = this.f16893OooOOO;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f16909OooOoo0 && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(p277o0O00Ooo.OooOOOO.OooO0OO(this.f16887OooO0o0), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(p277o0O00Ooo.OooOOOO.OooO00o(this.f16887OooO0o0), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOOo0(frameLayout, rippleDrawable2);
        }
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void OooO0O0(@FloatRange(from = 0.0d, to = 1.0d) float f, float f2) {
        View view = this.f16895OooOOOO;
        if (view != null) {
            OooO0OO oooO0OO = this.f16905OooOoO;
            oooO0OO.getClass();
            LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(oooO0OO.OooO00o(f, f2));
            view.setAlpha(o0O000.OooO0O0.OooO00o(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f16907OooOoOO = f;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final void OooO0OO(@NonNull OooOO0O oooOO0O) {
        this.f16901OooOo0 = oooOO0O;
        setCheckable(oooOO0O.isCheckable());
        setChecked(oooOO0O.isChecked());
        setEnabled(oooOO0O.isEnabled());
        setIcon(oooOO0O.getIcon());
        setTitle(oooOO0O.f2630OooO0o0);
        setId(oooOO0O.f2625OooO00o);
        if (!TextUtils.isEmpty(oooOO0O.f2641OooOOo0)) {
            setContentDescription(oooOO0O.f2641OooOOo0);
        }
        CharSequence charSequence = !TextUtils.isEmpty(oooOO0O.f2640OooOOo) ? oooOO0O.f2640OooOOo : oooOO0O.f2630OooO0o0;
        if (Build.VERSION.SDK_INT > 23) {
            o000O0O0.OooO00o(this, charSequence);
        }
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        this.f16885OooO0Oo = true;
    }

    public final void OooO0oO(int i) {
        View view = this.f16895OooOOOO;
        if (view == null) {
            return;
        }
        int iMin = Math.min(this.f16908OooOoo, i - (this.f16912Oooo000 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = this.f16911OooOooo && this.f16892OooOO0o == 2 ? iMin : this.f16910OooOooO;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f16893OooOOO;
        if (frameLayout != null && this.f16909OooOoo0) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f16895OooOOOO;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f16913Oooo00O;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return o00000OO.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    @Nullable
    public OooOO0O getItemData() {
        return this.f16901OooOo0;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return o00000O.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f16902OooOo00;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f16898OooOOo0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f16898OooOOo0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        OooOO0O oooOO0O = this.f16901OooOo0;
        if (oooOO0O != null && oooOO0O.isCheckable() && this.f16901OooOo0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16882Oooo00o);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f16913Oooo00O;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            OooOO0O oooOO0O = this.f16901OooOo0;
            CharSequence charSequence = oooOO0O.f2630OooO0o0;
            if (!TextUtils.isEmpty(oooOO0O.f2641OooOOo0)) {
                charSequence = this.f16901OooOo0.f2641OooOOo0;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f16913Oooo00O.OooO0OO()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o0O0O00.OooOO0O.OooO00o(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f33533OooO00o);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o0O0O00.OooO00o.f33516OooO0oO.f33528OooO00o);
        }
        o0O0O00.OooO0O0.OooO0OO(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(o0000O0.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new OooO0O0(i));
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f16895OooOOOO;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        OooO00o();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f16909OooOoo0 = z;
        OooO00o();
        View view = this.f16895OooOOOO;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f16910OooOooO = i;
        OooO0oO(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i) {
        this.f16912Oooo000 = i;
        OooO0oO(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f16911OooOooo = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f16908OooOoo = i;
        OooO0oO(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        BadgeDrawable badgeDrawable2 = this.f16913Oooo00O;
        if (badgeDrawable2 == badgeDrawable) {
            return;
        }
        boolean z = badgeDrawable2 != null;
        ImageView imageView = this.f16896OooOOOo;
        if (z && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f16913Oooo00O != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable3 = this.f16913Oooo00O;
                if (badgeDrawable3 != null) {
                    if (badgeDrawable3.OooO0Oo() != null) {
                        badgeDrawable3.OooO0Oo().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(badgeDrawable3);
                    }
                }
                this.f16913Oooo00O = null;
            }
        }
        this.f16913Oooo00O = badgeDrawable;
        if (imageView != null) {
            if (badgeDrawable != null) {
                setClipChildren(false);
                setClipToPadding(false);
                BadgeDrawable badgeDrawable4 = this.f16913Oooo00O;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                badgeDrawable4.setBounds(rect);
                badgeDrawable4.OooO0oo(imageView, null);
                if (badgeDrawable4.OooO0Oo() != null) {
                    badgeDrawable4.OooO0Oo().setForeground(badgeDrawable4);
                } else {
                    imageView.getOverlay().add(badgeDrawable4);
                }
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0092  */
    public void setChecked(boolean z) {
        TextView textView = this.f16899OooOOoo;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f16897OooOOo;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.f16909OooOoo0 && this.f16885OooO0Oo) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this)) {
                ValueAnimator valueAnimator = this.f16906OooOoO0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f16906OooOoO0 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16907OooOoOO, f);
                this.f16906OooOoO0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.navigation.OooO0O0(this, f));
                this.f16906OooOoO0.setInterpolator(o0O00OOO.OooO00o.OooO0Oo(getContext(), o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f40881OooO0O0));
                this.f16906OooOoO0.setDuration(o0O00OOO.OooO00o.OooO0OO(o00000.motionDurationLong2, getContext(), getResources().getInteger(o0000.material_motion_duration_long_1)));
                this.f16906OooOoO0.start();
            } else {
                OooO0O0(f, f);
            }
        } else {
            OooO0O0(f, f);
        }
        int i = this.f16892OooOO0o;
        ViewGroup viewGroup = this.f16898OooOOo0;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    OooO0o(getIconOrContainer(), this.f16888OooO0oO, 49);
                    OooO0oo(this.f16889OooO0oo, viewGroup);
                    textView.setVisibility(0);
                } else {
                    OooO0o(getIconOrContainer(), this.f16888OooO0oO, 17);
                    OooO0oo(0, viewGroup);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                OooO0oo(this.f16889OooO0oo, viewGroup);
                if (z) {
                    OooO0o(getIconOrContainer(), (int) (this.f16888OooO0oO + this.f16884OooO), 49);
                    OooO0o0(1.0f, 1.0f, 0, textView);
                    float f2 = this.f16890OooOO0;
                    OooO0o0(f2, f2, 4, textView2);
                } else {
                    OooO0o(getIconOrContainer(), this.f16888OooO0oO, 49);
                    float f3 = this.f16891OooOO0O;
                    OooO0o0(f3, f3, 4, textView);
                    OooO0o0(1.0f, 1.0f, 0, textView2);
                }
            } else if (i == 2) {
                OooO0o(getIconOrContainer(), this.f16888OooO0oO, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f16894OooOOO0) {
            if (z) {
                OooO0o(getIconOrContainer(), this.f16888OooO0oO, 49);
                OooO0oo(this.f16889OooO0oo, viewGroup);
                textView.setVisibility(0);
            } else {
                OooO0o(getIconOrContainer(), this.f16888OooO0oO, 17);
                OooO0oo(0, viewGroup);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            OooO0oo(this.f16889OooO0oo, viewGroup);
            if (z) {
                OooO0o(getIconOrContainer(), (int) (this.f16888OooO0oO + this.f16884OooO), 49);
                OooO0o0(1.0f, 1.0f, 0, textView);
                float f4 = this.f16890OooOO0;
                OooO0o0(f4, f4, 4, textView2);
            } else {
                OooO0o(getIconOrContainer(), this.f16888OooO0oO, 49);
                float f5 = this.f16891OooOO0O;
                OooO0o0(f5, f5, 4, textView);
                OooO0o0(1.0f, 1.0f, 0, textView2);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f16897OooOOo.setEnabled(z);
        this.f16899OooOOoo.setEnabled(z);
        this.f16896OooOOOo.setEnabled(z);
        if (z) {
            ViewCompat.OooOOo0(this, Build.VERSION.SDK_INT >= 24 ? new androidx.core.view.o00000OO(androidx.core.view.o00000OO.OooO00o.OooO0O0(getContext(), 1002)) : new androidx.core.view.o00000OO(null));
        } else {
            ViewCompat.OooOOo0(this, null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f16904OooOo0o) {
            return;
        }
        this.f16904OooOo0o = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f16900OooOo = drawable;
            ColorStateList colorStateList = this.f16903OooOo0O;
            if (colorStateList != null) {
                o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
            }
        }
        this.f16896OooOOOo.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f16896OooOOOo;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f16903OooOo0O = colorStateList;
        if (this.f16901OooOo0 == null || (drawable = this.f16900OooOo) == null) {
            return;
        }
        o00Ooo.OooO0O0.OooO0oo(drawable, colorStateList);
        this.f16900OooOo.invalidateSelf();
    }

    public void setItemBackground(int i) {
        Drawable drawableOooO0O0;
        if (i == 0) {
            drawableOooO0O0 = null;
        } else {
            Context context = getContext();
            Object obj = ContextCompat.f5281OooO00o;
            drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, i);
        }
        setItemBackground(drawableOooO0O0);
    }

    public void setItemPaddingBottom(int i) {
        if (this.f16889OooO0oo != i) {
            this.f16889OooO0oo = i;
            OooOO0O oooOO0O = this.f16901OooOo0;
            if (oooOO0O != null) {
                setChecked(oooOO0O.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f16888OooO0oO != i) {
            this.f16888OooO0oO = i;
            OooOO0O oooOO0O = this.f16901OooOo0;
            if (oooOO0O != null) {
                setChecked(oooOO0O.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.f16902OooOo00 = i;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f16887OooO0o0 = colorStateList;
        OooO00o();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f16892OooOO0o != i) {
            this.f16892OooOO0o = i;
            if (this.f16911OooOooo && i == 2) {
                this.f16905OooOoO = f16883Oooo0O0;
            } else {
                this.f16905OooOoO = f16881Oooo0;
            }
            OooO0oO(getWidth());
            OooOO0O oooOO0O = this.f16901OooOo0;
            if (oooOO0O != null) {
                setChecked(oooOO0O.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f16894OooOOO0 != z) {
            this.f16894OooOOO0 = z;
            OooOO0O oooOO0O = this.f16901OooOo0;
            if (oooOO0O != null) {
                setChecked(oooOO0O.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        TextView textView = this.f16899OooOOoo;
        OooO0Oo(textView, i);
        float textSize = this.f16897OooOOo.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f16884OooO = textSize - textSize2;
        this.f16890OooOO0 = (textSize2 * 1.0f) / textSize;
        this.f16891OooOO0O = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        TextView textView = this.f16897OooOOo;
        OooO0Oo(textView, i);
        float textSize = textView.getTextSize();
        float textSize2 = this.f16899OooOOoo.getTextSize();
        this.f16884OooO = textSize - textSize2;
        this.f16890OooOO0 = (textSize2 * 1.0f) / textSize;
        this.f16891OooOO0O = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f16897OooOOo.setTextColor(colorStateList);
            this.f16899OooOOoo.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f16897OooOOo.setText(charSequence);
        this.f16899OooOOoo.setText(charSequence);
        OooOO0O oooOO0O = this.f16901OooOo0;
        if (oooOO0O == null || TextUtils.isEmpty(oooOO0O.f2641OooOOo0)) {
            setContentDescription(charSequence);
        }
        OooOO0O oooOO0O2 = this.f16901OooOo0;
        if (oooOO0O2 != null && !TextUtils.isEmpty(oooOO0O2.f2640OooOOo)) {
            charSequence = this.f16901OooOo0.f2640OooOOo;
        }
        if (Build.VERSION.SDK_INT > 23) {
            o000O0O0.OooO00o(this, charSequence);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f16886OooO0o = drawable;
        OooO00o();
    }
}
