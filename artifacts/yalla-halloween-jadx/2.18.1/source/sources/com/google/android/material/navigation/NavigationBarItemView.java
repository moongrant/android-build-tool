package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
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
import androidx.appcompat.view.menu.OooOO0;
import androidx.appcompat.view.menu.OooOOO;
import androidx.appcompat.widget.o0000OO0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0Oo0oo;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooOO0O;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements OooOOO.OooO00o {

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final int[] f17370o00Ooo = {R.attr.state_checked};

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static final OooO0OO f17371o00o0O = new OooO0OO();

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final OooO0o f17372o00ooo = new OooO0o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f17373Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f17374Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f17375Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f17376Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f17377OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f17378OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f17379OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f17380OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final FrameLayout f17381OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final ImageView f17382OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final ViewGroup f17383OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final TextView f17384OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final TextView f17385OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f17386OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public OooOO0 f17387Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f17388Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public Drawable f17389OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public Drawable f17390OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ValueAnimator f17391OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f17392Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public OooO0OO f17393Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f17394OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f17395Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public final View f17396o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f17397o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public BadgeDrawable f17398o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f17399o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f17400ooOO;

    public class OooO00o implements View.OnLayoutChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f17382OoooOOO.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                ImageView imageView = navigationBarItemView.f17382OoooOOO;
                if (navigationBarItemView.OooO0O0()) {
                    com.google.android.material.badge.OooO00o.OooO0OO(navigationBarItemView.f17398o00Oo0, imageView);
                }
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f17402Oooo0o;

        public OooO0O0(int i) {
            this.f17402Oooo0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
            int i = this.f17402Oooo0o;
            int[] iArr = NavigationBarItemView.f17370o00Ooo;
            navigationBarItemView.OooO(i);
        }
    }

    public static class OooO0OO {
        public float OooO00o(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            return 1.0f;
        }
    }

    public static class OooO0o extends OooO0OO {
        @Override // com.google.android.material.navigation.NavigationBarItemView.OooO0OO
        public final float OooO00o(float f) {
            LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
            return (f * 0.6f) + 0.4f;
        }
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.f17374Oooo0o = false;
        this.f17386OoooOoo = -1;
        this.f17393Oooooo0 = f17371o00o0O;
        this.f17392Oooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f17394OoooooO = false;
        this.f17395Ooooooo = 0;
        this.f17399o0OoOo0 = 0;
        this.f17400ooOO = false;
        this.f17397o00O0O = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f17381OoooOO0 = (FrameLayout) findViewById(OooOOO0.navigation_bar_item_icon_container);
        this.f17396o000oOoO = findViewById(OooOOO0.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(OooOOO0.navigation_bar_item_icon_view);
        this.f17382OoooOOO = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(OooOOO0.navigation_bar_item_labels_group);
        this.f17383OoooOOo = viewGroup;
        TextView textView = (TextView) findViewById(OooOOO0.navigation_bar_item_small_label_view);
        this.f17384OoooOo0 = textView;
        TextView textView2 = (TextView) findViewById(OooOOO0.navigation_bar_item_large_label_view);
        this.f17385OoooOoO = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f17375Oooo0oO = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f17376Oooo0oo = viewGroup.getPaddingBottom();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(textView, 2);
        ViewCompat.OooO0o.OooOOoo(textView2, 2);
        setFocusable(true);
        OooO00o(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new OooO00o());
        }
    }

    public static void OooO0o(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void OooO0oO(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void OooOO0(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f17381OoooOO0;
        return frameLayout != null ? frameLayout : this.f17382OoooOOO;
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
        BadgeDrawable badgeDrawable = this.f17398o00Oo0;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.f17382OoooOOO.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.f17398o00Oo0;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.f17398o00Oo0.f16485OoooO00.f16493OooO0O0.f16508OoooOo0.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f17382OoooOOO.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public final void OooO(int i) {
        if (this.f17396o000oOoO == null) {
            return;
        }
        int iMin = Math.min(this.f17395Ooooooo, i - (this.f17397o00O0O * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17396o000oOoO.getLayoutParams();
        layoutParams.height = this.f17400ooOO && this.f17380OoooO0O == 2 ? iMin : this.f17399o0OoOo0;
        layoutParams.width = iMin;
        this.f17396o000oOoO.setLayoutParams(layoutParams);
    }

    public final void OooO00o(float f, float f2) {
        this.f17373Oooo = f - f2;
        this.f17379OoooO00 = (f2 * 1.0f) / f;
        this.f17378OoooO0 = (f * 1.0f) / f2;
    }

    public final boolean OooO0O0() {
        return this.f17398o00Oo0 != null;
    }

    public final void OooO0OO() {
        OooOO0 oooOO1 = this.f17387Ooooo00;
        if (oooOO1 != null) {
            setChecked(oooOO1.isChecked());
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final void OooO0Oo(@NonNull OooOO0 oooOO1) {
        this.f17387Ooooo00 = oooOO1;
        setCheckable(oooOO1.isCheckable());
        setChecked(oooOO1.isChecked());
        setEnabled(oooOO1.isEnabled());
        setIcon(oooOO1.getIcon());
        setTitle(oooOO1.f4735OooO0o0);
        setId(oooOO1.f4730OooO00o);
        if (!TextUtils.isEmpty(oooOO1.f4746OooOOo0)) {
            setContentDescription(oooOO1.f4746OooOOo0);
        }
        CharSequence charSequence = !TextUtils.isEmpty(oooOO1.f4745OooOOo) ? oooOO1.f4745OooOOo : oooOO1.f4735OooO0o0;
        if (Build.VERSION.SDK_INT > 23) {
            o0000OO0.OooO00o(this, charSequence);
        }
        setVisibility(oooOO1.isVisible() ? 0 : 8);
        this.f17374Oooo0o = true;
    }

    public final void OooO0o0(@FloatRange(from = 0.0d, to = 1.0d) float f, float f2) {
        View view = this.f17396o000oOoO;
        if (view != null) {
            OooO0OO oooO0OO = this.f17393Oooooo0;
            Objects.requireNonNull(oooO0OO);
            LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
            view.setScaleX((0.6f * f) + 0.4f);
            view.setScaleY(oooO0OO.OooO00o(f));
            view.setAlpha(p338o0OO0o0O.OooO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0.8f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1.0f : 0.2f, f));
        }
        this.f17392Oooooo = f;
    }

    public final void OooO0oo(@Nullable View view) {
        if (OooO0O0()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.OooO00o.OooO0O0(this.f17398o00Oo0, view);
            }
            this.f17398o00Oo0 = null;
        }
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f17396o000oOoO;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.f17398o00Oo0;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return OooOO0O.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    @Nullable
    public OooOO0 getItemData() {
        return this.f17387Ooooo00;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return p337o0OO0o0.OooOO0.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f17386OoooOoo;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17383OoooOOo.getLayoutParams();
        return this.f17383OoooOOo.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17383OoooOOo.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f17383OoooOOo.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        OooOO0 oooOO1 = this.f17387Ooooo00;
        if (oooOO1 != null && oooOO1.isCheckable() && this.f17387Ooooo00.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17370o00Ooo);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f17398o00Oo0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            OooOO0 oooOO1 = this.f17387Ooooo00;
            CharSequence charSequence = oooOO1.f4735OooO0o0;
            if (!TextUtils.isEmpty(oooOO1.f4746OooOOo0)) {
                charSequence = this.f17387Ooooo00.f4746OooOOo0;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f17398o00Oo0.OooO0OO()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o000O0o0.o0000OO0.OooO0OO.OooO00o(0, 1, getItemVisiblePosition(), 1, isSelected()).f28217OooO00o);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o000O0o0.o0000OO0.OooO00o.f28200OooO0oO.f28212OooO00o);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(OooOo.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new OooO0O0(i));
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.f17396o000oOoO;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f17394OoooooO = z;
        View view = this.f17396o000oOoO;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f17399o0OoOo0 = i;
        OooO(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i) {
        this.f17397o00O0O = i;
        OooO(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f17400ooOO = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f17395Ooooooo = i;
        OooO(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.f17398o00Oo0 == badgeDrawable) {
            return;
        }
        if (OooO0O0() && this.f17382OoooOOO != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            OooO0oo(this.f17382OoooOOO);
        }
        this.f17398o00Oo0 = badgeDrawable;
        ImageView imageView = this.f17382OoooOOO;
        if (imageView == null || !OooO0O0()) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        com.google.android.material.badge.OooO00o.OooO00o(this.f17398o00Oo0, imageView);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    public void setChecked(boolean z) {
        TextView textView = this.f17385OoooOoO;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f17385OoooOoO;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f17384OoooOo0;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f17384OoooOo0;
        textView4.setPivotY(textView4.getBaseline());
        float f = z ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (this.f17394OoooooO && this.f17374Oooo0o) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(this)) {
                ValueAnimator valueAnimator = this.f17391OooooOo;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f17391OooooOo = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17392Oooooo, f);
                this.f17391OooooOo = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.navigation.OooO00o(this, f));
                this.f17391OooooOo.setInterpolator(o0OOO00o.OooO00o.OooO0Oo(getContext(), p337o0OO0o0.OooO0o.motionEasingStandard, p338o0OO0o0O.OooO0o.f37973OooO0O0));
                this.f17391OooooOo.setDuration(o0OOO00o.OooO00o.OooO0OO(getContext(), p337o0OO0o0.OooO0o.motionDurationLong1, getResources().getInteger(p337o0OO0o0.OooOOO.material_motion_duration_long_1)));
                this.f17391OooooOo.start();
            } else {
                OooO0o0(f, f);
            }
        } else {
            OooO0o0(f, f);
        }
        int i = this.f17380OoooO0O;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 49);
                    OooOO0(this.f17383OoooOOo, this.f17376Oooo0oo);
                    this.f17385OoooOoO.setVisibility(0);
                } else {
                    OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 17);
                    OooOO0(this.f17383OoooOOo, 0);
                    this.f17385OoooOoO.setVisibility(4);
                }
                this.f17384OoooOo0.setVisibility(4);
            } else if (i == 1) {
                OooOO0(this.f17383OoooOOo, this.f17376Oooo0oo);
                if (z) {
                    OooO0oO(getIconOrContainer(), (int) (this.f17375Oooo0oO + this.f17373Oooo), 49);
                    OooO0o(this.f17385OoooOoO, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f17384OoooOo0;
                    float f2 = this.f17379OoooO00;
                    OooO0o(textView5, f2, f2, 4);
                } else {
                    OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 49);
                    TextView textView6 = this.f17385OoooOoO;
                    float f3 = this.f17378OoooO0;
                    OooO0o(textView6, f3, f3, 4);
                    OooO0o(this.f17384OoooOo0, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 17);
                this.f17385OoooOoO.setVisibility(8);
                this.f17384OoooOo0.setVisibility(8);
            }
        } else if (this.f17377OoooO) {
            if (z) {
                OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 49);
                OooOO0(this.f17383OoooOOo, this.f17376Oooo0oo);
                this.f17385OoooOoO.setVisibility(0);
            } else {
                OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 17);
                OooOO0(this.f17383OoooOOo, 0);
                this.f17385OoooOoO.setVisibility(4);
            }
            this.f17384OoooOo0.setVisibility(4);
        } else {
            OooOO0(this.f17383OoooOOo, this.f17376Oooo0oo);
            if (z) {
                OooO0oO(getIconOrContainer(), (int) (this.f17375Oooo0oO + this.f17373Oooo), 49);
                OooO0o(this.f17385OoooOoO, 1.0f, 1.0f, 0);
                TextView textView7 = this.f17384OoooOo0;
                float f4 = this.f17379OoooO00;
                OooO0o(textView7, f4, f4, 4);
            } else {
                OooO0oO(getIconOrContainer(), this.f17375Oooo0oO, 49);
                TextView textView8 = this.f17385OoooOoO;
                float f5 = this.f17378OoooO0;
                OooO0o(textView8, f5, f5, 4);
                OooO0o(this.f17384OoooOo0, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f17384OoooOo0.setEnabled(z);
        this.f17385OoooOoO.setEnabled(z);
        this.f17382OoooOOO.setEnabled(z);
        if (z) {
            ViewCompat.OooOoO(this, o0Oo0oo.OooO00o(getContext()));
        } else {
            ViewCompat.OooOoO(this, null);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.f17389OooooO0) {
            return;
        }
        this.f17389OooooO0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = o0OOO0o.OooO0o0(drawable).mutate();
            this.f17390OooooOO = drawable;
            ColorStateList colorStateList = this.f17388Ooooo0o;
            if (colorStateList != null) {
                o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
            }
        }
        this.f17382OoooOOO.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17382OoooOOO.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f17382OoooOOO.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.f17388Ooooo0o = colorStateList;
        if (this.f17387Ooooo00 == null || (drawable = this.f17390OooooOO) == null) {
            return;
        }
        o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
        this.f17390OooooOO.invalidateSelf();
    }

    public void setItemBackground(int i) {
        Drawable drawableOooO0O0;
        if (i == 0) {
            drawableOooO0O0 = null;
        } else {
            Context context = getContext();
            Object obj = o000O000.OooO00o.f28085OooO00o;
            drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
        }
        setItemBackground(drawableOooO0O0);
    }

    public void setItemPaddingBottom(int i) {
        if (this.f17376Oooo0oo != i) {
            this.f17376Oooo0oo = i;
            OooO0OO();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f17375Oooo0oO != i) {
            this.f17375Oooo0oO = i;
            OooO0OO();
        }
    }

    public void setItemPosition(int i) {
        this.f17386OoooOoo = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f17380OoooO0O != i) {
            this.f17380OoooO0O = i;
            if (this.f17400ooOO && i == 2) {
                this.f17393Oooooo0 = f17372o00ooo;
            } else {
                this.f17393Oooooo0 = f17371o00o0O;
            }
            OooO(getWidth());
            OooO0OO();
        }
    }

    public void setShifting(boolean z) {
        if (this.f17377OoooO != z) {
            this.f17377OoooO = z;
            OooO0OO();
        }
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        TextView textView = this.f17385OoooOoO;
        TextViewCompat.OooO0o(textView, i);
        int iOooO0o = o0OOO0O.OooO0OO.OooO0o(textView.getContext(), i);
        if (iOooO0o != 0) {
            textView.setTextSize(0, iOooO0o);
        }
        OooO00o(this.f17384OoooOo0.getTextSize(), this.f17385OoooOoO.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        TextView textView = this.f17384OoooOo0;
        TextViewCompat.OooO0o(textView, i);
        int iOooO0o = o0OOO0O.OooO0OO.OooO0o(textView.getContext(), i);
        if (iOooO0o != 0) {
            textView.setTextSize(0, iOooO0o);
        }
        OooO00o(this.f17384OoooOo0.getTextSize(), this.f17385OoooOoO.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f17384OoooOo0.setTextColor(colorStateList);
            this.f17385OoooOoO.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.f17384OoooOo0.setText(charSequence);
        this.f17385OoooOoO.setText(charSequence);
        OooOO0 oooOO1 = this.f17387Ooooo00;
        if (oooOO1 == null || TextUtils.isEmpty(oooOO1.f4746OooOOo0)) {
            setContentDescription(charSequence);
        }
        OooOO0 oooOO2 = this.f17387Ooooo00;
        if (oooOO2 != null && !TextUtils.isEmpty(oooOO2.f4745OooOOo)) {
            charSequence = this.f17387Ooooo00.f4745OooOOo;
        }
        if (Build.VERSION.SDK_INT > 23) {
            o0000OO0.OooO00o(this, charSequence);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, drawable);
    }
}
