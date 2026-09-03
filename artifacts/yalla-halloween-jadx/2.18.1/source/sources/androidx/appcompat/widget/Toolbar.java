package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements o000O0O0.OooOO0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public AppCompatImageButton f5251Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ActionMenuView f5252Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public AppCompatTextView f5253Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public AppCompatTextView f5254Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public AppCompatImageButton f5255OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f5256OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public AppCompatImageView f5257OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CharSequence f5258OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f5259OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f5260OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f5261OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f5262OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f5263OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f5264OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f5265Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f5266Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f5267OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f5268OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o000000O f5269OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f5270Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f5271Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f5272OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public CharSequence f5273Ooooooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final OooO0O0 f5274o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Context f5275o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public ColorStateList f5276o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f5277o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f5278o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final ArrayList<View> f5279o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ArrayList<MenuItem> f5280o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final o000O0O0.OooOOOO f5281o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final ArrayList<View> f5282o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f5283o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOOO0.OooO00o f5284o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ActionMenuPresenter f5285o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public OooO0o f5286o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public CharSequence f5287o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public OooO f5288o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final OooO00o f5289o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public o0000O f5290o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final int[] f5291oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO0o.OooO00o f5292oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ColorStateList f5293ooOO;

    public interface OooO {
    }

    public class OooO00o implements ActionMenuView.OooO0o {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.OooOo();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO0o oooO0o = Toolbar.this.f5286o0Oo0oo;
            androidx.appcompat.view.menu.OooOO0 oooOO1 = oooO0o == null ? null : oooO0o.f5299Oooo0oO;
            if (oooOO1 != null) {
                oooOO1.collapseActionView();
            }
        }
    }

    public class OooO0o implements androidx.appcompat.view.menu.OooOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO0o f5298Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0 f5299Oooo0oO;

        public OooO0o() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO0OO(androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO0Oo(boolean z) {
            if (this.f5299Oooo0oO != null) {
                androidx.appcompat.view.menu.OooO0o oooO0o = this.f5298Oooo0o;
                boolean z2 = false;
                if (oooO0o != null) {
                    int size = oooO0o.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f5298Oooo0o.getItem(i) == this.f5299Oooo0oO) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                OooO0oO(this.f5299Oooo0oO);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final boolean OooO0o0() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final boolean OooO0oO(androidx.appcompat.view.menu.OooOO0 oooOO1) {
            KeyEvent.Callback callback = Toolbar.this.f5259OoooOO0;
            if (callback instanceof p016OooOoO0.OooOO0O) {
                ((p016OooOoO0.OooOO0O) callback).OooO0o0();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f5259OoooOO0);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f5255OoooO);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f5259OoooOO0 = null;
            int size = toolbar3.f5282o00ooo.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f5282o00ooo.clear();
                    this.f5299Oooo0oO = null;
                    Toolbar.this.requestLayout();
                    oooOO1.f4756OooOoo = false;
                    oooOO1.f4741OooOOO.OooOOo(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f5282o00ooo.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final void OooO0oo(Context context, androidx.appcompat.view.menu.OooO0o oooO0o) {
            androidx.appcompat.view.menu.OooOO0 oooOO1;
            androidx.appcompat.view.menu.OooO0o oooO0o2 = this.f5298Oooo0o;
            if (oooO0o2 != null && (oooOO1 = this.f5299Oooo0oO) != null) {
                oooO0o2.OooO0o0(oooOO1);
            }
            this.f5298Oooo0o = oooO0o;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final boolean OooOO0O(androidx.appcompat.view.menu.OooOo00 oooOo00) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final Parcelable OooOO0o() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final boolean OooOOO0(androidx.appcompat.view.menu.OooOO0 oooOO1) {
            Toolbar.this.OooO0OO();
            ViewParent parent = Toolbar.this.f5255OoooO.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f5255OoooO);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f5255OoooO);
            }
            Toolbar.this.f5259OoooOO0 = oooOO1.getActionView();
            this.f5299Oooo0oO = oooOO1;
            ViewParent parent2 = Toolbar.this.f5259OoooOO0.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f5259OoooOO0);
                }
                Objects.requireNonNull(Toolbar.this);
                LayoutParams layoutParams = new LayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParams.f4361OooO00o = 8388611 | (toolbar4.f5263OoooOoO & 112);
                layoutParams.f5294OooO0O0 = 2;
                toolbar4.f5259OoooOO0.setLayoutParams(layoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f5259OoooOO0);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).f5294OooO0O0 != 2 && childAt != toolbar6.f5252Oooo0o) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f5282o00ooo.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            oooOO1.f4756OooOoo = true;
            oooOO1.f4741OooOOO.OooOOo(false);
            KeyEvent.Callback callback = Toolbar.this.f5259OoooOO0;
            if (callback instanceof p016OooOoO0.OooOO0O) {
                ((p016OooOoO0.OooOO0O) callback).OooO0OO();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOO0
        public final int getId() {
            return 0;
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p016OooOoO0.OooOo(getContext());
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void OooO00o(List<View> list, int i) {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f5294OooO0O0 == 0 && OooOo0o(childAt) && OooOO0(layoutParams.f4361OooO00o) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f5294OooO0O0 == 0 && OooOo0o(childAt2) && OooOO0(layoutParams2.f4361OooO00o) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void OooO0O0(View view, boolean z) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.f5294OooO0O0 = 1;
        if (!z || this.f5259OoooOO0 == null) {
            addView(view, layoutParamsGenerateLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.f5282o00ooo.add(view);
        }
    }

    public final void OooO0OO() {
        if (this.f5255OoooO == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, OooOo00.OooO00o.toolbarNavigationButtonStyle);
            this.f5255OoooO = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f5256OoooO0);
            this.f5255OoooO.setContentDescription(this.f5258OoooO0O);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f4361OooO00o = 8388611 | (this.f5263OoooOoO & 112);
            layoutParams.f5294OooO0O0 = 2;
            this.f5255OoooO.setLayoutParams(layoutParams);
            this.f5255OoooO.setOnClickListener(new OooO0OO());
        }
    }

    public final void OooO0Oo() {
        if (this.f5269OooooOo == null) {
            this.f5269OooooOo = new o000000O();
        }
    }

    public final void OooO0o() {
        if (this.f5252Oooo0o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f5252Oooo0o = actionMenuView;
            actionMenuView.setPopupTheme(this.f5260OoooOOO);
            this.f5252Oooo0o.setOnMenuItemClickListener(this.f5289o0ooOOo);
            ActionMenuView actionMenuView2 = this.f5252Oooo0o;
            androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o = this.f5284o0OO00O;
            androidx.appcompat.view.menu.OooO0o.OooO00o oooO00o2 = this.f5292oo0o0Oo;
            actionMenuView2.f4882Oooooo0 = oooO00o;
            actionMenuView2.f4881Oooooo = oooO00o2;
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f4361OooO00o = 8388613 | (this.f5263OoooOoO & 112);
            this.f5252Oooo0o.setLayoutParams(layoutParams);
            OooO0O0(this.f5252Oooo0o, false);
        }
    }

    public final void OooO0o0() {
        OooO0o();
        ActionMenuView actionMenuView = this.f5252Oooo0o;
        if (actionMenuView.f4876Ooooo00 == null) {
            androidx.appcompat.view.menu.OooO0o oooO0o = (androidx.appcompat.view.menu.OooO0o) actionMenuView.getMenu();
            if (this.f5286o0Oo0oo == null) {
                this.f5286o0Oo0oo = new OooO0o();
            }
            this.f5252Oooo0o.setExpandedActionViewsExclusive(true);
            oooO0o.OooO0OO(this.f5286o0Oo0oo, this.f5275o000oOoO);
        }
    }

    public final void OooO0oO() {
        if (this.f5251Oooo == null) {
            this.f5251Oooo = new AppCompatImageButton(getContext(), null, OooOo00.OooO00o.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f4361OooO00o = 8388611 | (this.f5263OoooOoO & 112);
            this.f5251Oooo.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final int OooOO0(int i) {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, iOooO0Oo) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return iOooO0Oo == 1 ? 5 : 3;
    }

    public final int OooOO0O(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f4361OooO00o & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f5272OoooooO & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final int OooOO0o(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o000O0O0.OooOO0.OooO0O0(marginLayoutParams) + o000O0O0.OooOO0.OooO0OO(marginLayoutParams);
    }

    public final void OooOOO(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final int OooOOO0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @MainThread
    public final void OooOOOO() {
        Iterator<MenuItem> it = this.f5280o00oO0O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f5281o00oO0o.OooO0O0(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5280o00oO0O = currentMenuItems2;
        this.f5281o00oO0o.OooO0Oo(menu);
    }

    public final boolean OooOOOo(View view) {
        return view.getParent() == this || this.f5282o00ooo.contains(view);
    }

    public final int OooOOo(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iOooOO0O = OooOO0O(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iOooOO0O, iMax + measuredWidth, view.getMeasuredHeight() + iOooOO0O);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    public final boolean OooOOo0() {
        ActionMenuView actionMenuView = this.f5252Oooo0o;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f4880OooooOo;
            if (actionMenuPresenter != null && actionMenuPresenter.OooOOO()) {
                return true;
            }
        }
        return false;
    }

    public final int OooOOoo(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iOooOO0O = OooOO0O(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iOooOO0O, iMax, view.getMeasuredHeight() + iOooOO0O);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final boolean OooOo() {
        ActionMenuView actionMenuView = this.f5252Oooo0o;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f4880OooooOo;
            if (actionMenuPresenter != null && actionMenuPresenter.OooOOOO()) {
                return true;
            }
        }
        return false;
    }

    public final void OooOo0(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int OooOo00(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void OooOo0O(Context context, @StyleRes int i) {
        this.f5261OoooOOo = i;
        AppCompatTextView appCompatTextView = this.f5253Oooo0oO;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(context, i);
        }
    }

    public final boolean OooOo0o(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // o000O0O0.OooOO0O
    @MainThread
    public final void addMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
        this.f5281o00oO0o.OooO00o(oooOo);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f5255OoooO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f5255OoooO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o000000O o000000o2 = this.f5269OooooOo;
        if (o000000o2 != null) {
            return o000000o2.f5319OooO0oO ? o000000o2.f5313OooO00o : o000000o2.f5314OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f5270Oooooo;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o000000O o000000o2 = this.f5269OooooOo;
        if (o000000o2 != null) {
            return o000000o2.f5313OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o000000O o000000o2 = this.f5269OooooOo;
        if (o000000o2 != null) {
            return o000000o2.f5314OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o000000O o000000o2 = this.f5269OooooOo;
        if (o000000o2 != null) {
            return o000000o2.f5319OooO0oO ? o000000o2.f5314OooO0O0 : o000000o2.f5313OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f5271Oooooo0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.OooO0o oooO0o;
        ActionMenuView actionMenuView = this.f5252Oooo0o;
        return actionMenuView != null && (oooO0o = actionMenuView.f4876Ooooo00) != null && oooO0o.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f5270Oooooo, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5271Oooooo0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f5257OoooO00;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f5257OoooO00;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        OooO0o0();
        return this.f5252Oooo0o.getMenu();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public View getNavButtonView() {
        return this.f5251Oooo;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f5251Oooo;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f5251Oooo;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f5285o0OOO0o;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        OooO0o0();
        return this.f5252Oooo0o.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f5275o000oOoO;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f5260OoooOOO;
    }

    public CharSequence getSubtitle() {
        return this.f5287o0OoOo0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f5254Oooo0oo;
    }

    public CharSequence getTitle() {
        return this.f5273Ooooooo;
    }

    public int getTitleMarginBottom() {
        return this.f5268OooooOO;
    }

    public int getTitleMarginEnd() {
        return this.f5266Ooooo0o;
    }

    public int getTitleMarginStart() {
        return this.f5265Ooooo00;
    }

    public int getTitleMarginTop() {
        return this.f5267OooooO0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.f5253Oooo0oO;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o00oO0o getWrapper() {
        if (this.f5290o0ooOoO == null) {
            this.f5290o0ooOoO = new o0000O(this, true);
        }
        return this.f5290o0ooOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5274o000OOo);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5278o00Ooo = false;
        }
        if (!this.f5278o00Ooo) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5278o00Ooo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5278o00Ooo = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:103:0x0294 A[LOOP:0: B:102:0x0292->B:103:0x0294, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b6 A[LOOP:1: B:105:0x02b4->B:106:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02db A[LOOP:2: B:108:0x02d9->B:109:0x02db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x031e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0322  */
    /* JADX WARN: Code duplicated, block: B:118:0x032d A[LOOP:3: B:117:0x032b->B:118:0x032d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x021f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iOooOOo;
        int iOooOOoo;
        int iMax;
        int iMin;
        boolean zOooOo0o;
        boolean zOooOo0o2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int iOooOOo2;
        int i17;
        int i18;
        int size2;
        int i19;
        ArrayList<View> arrayList;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int size4;
        int iOooOOo3;
        int i25;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z3 = ViewCompat.OooO.OooO0Oo(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f5291oo000o;
        iArr[1] = 0;
        iArr[0] = 0;
        int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(this);
        int iMin2 = iOooO0Oo >= 0 ? Math.min(iOooO0Oo, i4 - i2) : 0;
        if (OooOo0o(this.f5251Oooo)) {
            if (z3) {
                iOooOOoo = OooOOoo(this.f5251Oooo, i26, iArr, iMin2);
                iOooOOo = paddingLeft;
            } else {
                iOooOOo = OooOOo(this.f5251Oooo, paddingLeft, iArr, iMin2);
            }
            if (OooOo0o(this.f5255OoooO)) {
                if (z3) {
                    iOooOOoo = OooOOoo(this.f5255OoooO, iOooOOoo, iArr, iMin2);
                } else {
                    iOooOOo = OooOOo(this.f5255OoooO, iOooOOo, iArr, iMin2);
                }
            }
            if (OooOo0o(this.f5252Oooo0o)) {
                if (z3) {
                    iOooOOo = OooOOo(this.f5252Oooo0o, iOooOOo, iArr, iMin2);
                } else {
                    iOooOOoo = OooOOoo(this.f5252Oooo0o, iOooOOoo, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iOooOOo);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iOooOOoo));
            iMax = Math.max(iOooOOo, currentContentInsetLeft);
            iMin = Math.min(iOooOOoo, i26 - currentContentInsetRight);
            if (OooOo0o(this.f5259OoooOO0)) {
                if (z3) {
                    iMin = OooOOoo(this.f5259OoooOO0, iMin, iArr, iMin2);
                } else {
                    iMax = OooOOo(this.f5259OoooOO0, iMax, iArr, iMin2);
                }
            }
            if (OooOo0o(this.f5257OoooO00)) {
                if (z3) {
                    iMin = OooOOoo(this.f5257OoooO00, iMin, iArr, iMin2);
                } else {
                    iMax = OooOOo(this.f5257OoooO00, iMax, iArr, iMin2);
                }
            }
            zOooOo0o = OooOo0o(this.f5253Oooo0oO);
            zOooOo0o2 = OooOo0o(this.f5254Oooo0oo);
            if (zOooOo0o) {
                LayoutParams layoutParams3 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                measuredHeight = this.f5253Oooo0oO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zOooOo0o2) {
                LayoutParams layoutParams4 = (LayoutParams) this.f5254Oooo0oo.getLayoutParams();
                measuredHeight += this.f5254Oooo0oo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            }
            if (!zOooOo0o || zOooOo0o2) {
                if (zOooOo0o) {
                    appCompatTextView = this.f5253Oooo0oO;
                } else {
                    appCompatTextView = this.f5254Oooo0oo;
                }
                if (zOooOo0o2) {
                    appCompatTextView2 = this.f5254Oooo0oo;
                } else {
                    appCompatTextView2 = this.f5253Oooo0oO;
                }
                layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
                layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
                z2 = (!zOooOo0o && this.f5253Oooo0oO.getMeasuredWidth() > 0) || (zOooOo0o2 && this.f5254Oooo0oo.getMeasuredWidth() > 0);
                i5 = this.f5272OoooooO & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i16 = this.f5268OooooOO;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f5268OooooOO) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.f5265Ooooo00;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zOooOo0o) {
                        LayoutParams layoutParams5 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                        int measuredWidth2 = iMin - this.f5253Oooo0oO.getMeasuredWidth();
                        int measuredHeight2 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                        this.f5253Oooo0oO.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.f5266Ooooo0o;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zOooOo0o2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                        this.f5254Oooo0oo.layout(iMin - this.f5254Oooo0oo.getMeasuredWidth(), i28, iMin, this.f5254Oooo0oo.getMeasuredHeight() + i28);
                        i12 = iMin - this.f5266Ooooo0o;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                } else {
                    if (z2) {
                        i7 = this.f5265Ooooo00;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax += Math.max(0, i29);
                    iArr[0] = Math.max(0, -i29);
                    if (zOooOo0o) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                        int measuredWidth3 = this.f5253Oooo0oO.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                        this.f5253Oooo0oO.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.f5266Ooooo0o;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (zOooOo0o2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f5254Oooo0oo.getMeasuredWidth() + iMax;
                        this.f5254Oooo0oo.layout(iMax, i30, measuredWidth4, this.f5254Oooo0oo.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.f5266Ooooo0o;
                    } else {
                        i9 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    }
                }
            } else {
                i6 = paddingLeft;
                iMin2 = iMin2;
            }
            OooO00o(this.f5279o00o0O, 3);
            size = this.f5279o00o0O.size();
            iOooOOo2 = iMax;
            for (i17 = 0; i17 < size; i17++) {
                iOooOOo2 = OooOOo(this.f5279o00o0O.get(i17), iOooOOo2, iArr, iMin2);
            }
            i18 = iMin2;
            OooO00o(this.f5279o00o0O, 5);
            size2 = this.f5279o00o0O.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = OooOOoo(this.f5279o00o0O.get(i19), iMin, iArr, i18);
            }
            OooO00o(this.f5279o00o0O, 1);
            arrayList = this.f5279o00o0O;
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = arrayList.get(i22);
                LayoutParams layoutParams7 = (LayoutParams) view.getLayoutParams();
                int i32 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i21;
                int i33 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i20;
                int iMax3 = Math.max(0, i32);
                int iMax4 = Math.max(0, i33);
                int iMax5 = Math.max(0, -i32);
                int iMax6 = Math.max(0, -i33);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i20 = iMax6;
                i21 = iMax5;
            }
            i23 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i24 = measuredWidth + i23;
            if (i23 >= iOooOOo2) {
                if (i24 > iMin) {
                    iOooOOo2 = i23 - (i24 - iMin);
                } else {
                    iOooOOo2 = i23;
                }
            }
            size4 = this.f5279o00o0O.size();
            iOooOOo3 = iOooOOo2;
            for (i25 = 0; i25 < size4; i25++) {
                iOooOOo3 = OooOOo(this.f5279o00o0O.get(i25), iOooOOo3, iArr, i18);
            }
            this.f5279o00o0O.clear();
        }
        iOooOOo = paddingLeft;
        iOooOOoo = i26;
        if (OooOo0o(this.f5255OoooO)) {
            if (z3) {
                iOooOOoo = OooOOoo(this.f5255OoooO, iOooOOoo, iArr, iMin2);
            } else {
                iOooOOo = OooOOo(this.f5255OoooO, iOooOOo, iArr, iMin2);
            }
        }
        if (OooOo0o(this.f5252Oooo0o)) {
            if (z3) {
                iOooOOo = OooOOo(this.f5252Oooo0o, iOooOOo, iArr, iMin2);
            } else {
                iOooOOoo = OooOOoo(this.f5252Oooo0o, iOooOOoo, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iOooOOo);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iOooOOoo));
        iMax = Math.max(iOooOOo, currentContentInsetLeft2);
        iMin = Math.min(iOooOOoo, i26 - currentContentInsetRight2);
        if (OooOo0o(this.f5259OoooOO0)) {
            if (z3) {
                iMin = OooOOoo(this.f5259OoooOO0, iMin, iArr, iMin2);
            } else {
                iMax = OooOOo(this.f5259OoooOO0, iMax, iArr, iMin2);
            }
        }
        if (OooOo0o(this.f5257OoooO00)) {
            if (z3) {
                iMin = OooOOoo(this.f5257OoooO00, iMin, iArr, iMin2);
            } else {
                iMax = OooOOo(this.f5257OoooO00, iMax, iArr, iMin2);
            }
        }
        zOooOo0o = OooOo0o(this.f5253Oooo0oO);
        zOooOo0o2 = OooOo0o(this.f5254Oooo0oo);
        if (zOooOo0o) {
            LayoutParams layoutParams8 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
            measuredHeight = this.f5253Oooo0oO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zOooOo0o2) {
            LayoutParams layoutParams9 = (LayoutParams) this.f5254Oooo0oo.getLayoutParams();
            measuredHeight += this.f5254Oooo0oo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin;
        }
        if (zOooOo0o) {
            if (zOooOo0o) {
                appCompatTextView = this.f5253Oooo0oO;
            } else {
                appCompatTextView = this.f5254Oooo0oo;
            }
            if (zOooOo0o2) {
                appCompatTextView2 = this.f5254Oooo0oo;
            } else {
                appCompatTextView2 = this.f5253Oooo0oO;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zOooOo0o) {
            }
            i5 = this.f5272OoooooO & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i16 = this.f5268OooooOO;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f5268OooooOO) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f5265Ooooo00;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zOooOo0o) {
                    LayoutParams layoutParams10 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                    int measuredWidth5 = iMin - this.f5253Oooo0oO.getMeasuredWidth();
                    int measuredHeight4 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                    this.f5253Oooo0oO.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.f5266Ooooo0o;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zOooOo0o2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                    this.f5254Oooo0oo.layout(iMin - this.f5254Oooo0oo.getMeasuredWidth(), i211, iMin, this.f5254Oooo0oo.getMeasuredHeight() + i211);
                    i12 = iMin - this.f5266Ooooo0o;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.f5265Ooooo00;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax += Math.max(0, i212);
                iArr[0] = Math.max(0, -i212);
                if (zOooOo0o) {
                    LayoutParams layoutParams11 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                    int measuredWidth6 = this.f5253Oooo0oO.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                    this.f5253Oooo0oO.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.f5266Ooooo0o;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zOooOo0o2) {
                    int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f5254Oooo0oo.getMeasuredWidth() + iMax;
                    this.f5254Oooo0oo.layout(iMax, i34, measuredWidth7, this.f5254Oooo0oo.getMeasuredHeight() + i34);
                    i9 = measuredWidth7 + this.f5266Ooooo0o;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (zOooOo0o) {
                appCompatTextView = this.f5253Oooo0oO;
            } else {
                appCompatTextView = this.f5254Oooo0oo;
            }
            if (zOooOo0o2) {
                appCompatTextView2 = this.f5254Oooo0oo;
            } else {
                appCompatTextView2 = this.f5253Oooo0oO;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zOooOo0o) {
            }
            i5 = this.f5272OoooooO & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5267OooooO0;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i16 = this.f5268OooooOO;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f5268OooooOO) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f5265Ooooo00;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zOooOo0o) {
                    LayoutParams layoutParams12 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                    int measuredWidth8 = iMin - this.f5253Oooo0oO.getMeasuredWidth();
                    int measuredHeight6 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                    this.f5253Oooo0oO.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.f5266Ooooo0o;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zOooOo0o2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                    this.f5254Oooo0oo.layout(iMin - this.f5254Oooo0oo.getMeasuredWidth(), i214, iMin, this.f5254Oooo0oo.getMeasuredHeight() + i214);
                    i12 = iMin - this.f5266Ooooo0o;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.f5265Ooooo00;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax += Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (zOooOo0o) {
                    LayoutParams layoutParams13 = (LayoutParams) this.f5253Oooo0oO.getLayoutParams();
                    int measuredWidth9 = this.f5253Oooo0oO.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f5253Oooo0oO.getMeasuredHeight() + paddingTop;
                    this.f5253Oooo0oO.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.f5266Ooooo0o;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zOooOo0o2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5254Oooo0oo.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f5254Oooo0oo.getMeasuredWidth() + iMax;
                    this.f5254Oooo0oo.layout(iMax, i35, measuredWidth10, this.f5254Oooo0oo.getMeasuredHeight() + i35);
                    i9 = measuredWidth10 + this.f5266Ooooo0o;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        OooO00o(this.f5279o00o0O, 3);
        size = this.f5279o00o0O.size();
        iOooOOo2 = iMax;
        while (i17 < size) {
            iOooOOo2 = OooOOo(this.f5279o00o0O.get(i17), iOooOOo2, iArr, iMin2);
        }
        i18 = iMin2;
        OooO00o(this.f5279o00o0O, 5);
        size2 = this.f5279o00o0O.size();
        while (i19 < size2) {
            iMin = OooOOoo(this.f5279o00o0O.get(i19), iMin, iArr, i18);
        }
        OooO00o(this.f5279o00o0O, 1);
        arrayList = this.f5279o00o0O;
        int i36 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i36;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = arrayList.get(i22);
            LayoutParams layoutParams14 = (LayoutParams) view2.getLayoutParams();
            int i37 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i21;
            int i38 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i20;
            int iMax7 = Math.max(0, i37);
            int iMax8 = Math.max(0, i38);
            int iMax9 = Math.max(0, -i37);
            int iMax10 = Math.max(0, -i38);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i20 = iMax10;
            i21 = iMax9;
        }
        i23 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i24 = measuredWidth + i23;
        if (i23 >= iOooOOo2) {
            if (i24 > iMin) {
                iOooOOo2 = i23 - (i24 - iMin);
            } else {
                iOooOOo2 = i23;
            }
        }
        size4 = this.f5279o00o0O.size();
        iOooOOo3 = iOooOOo2;
        while (i25 < size4) {
            iOooOOo3 = OooOOo(this.f5279o00o0O.get(i25), iOooOOo3, iArr, i18);
        }
        this.f5279o00o0O.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iOooOO0o;
        int iMax;
        int iCombineMeasuredStates;
        int iOooOO0o2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iOooOOO0;
        boolean z;
        int[] iArr = this.f5291oo000o;
        boolean zOooO0O0 = o000O00O.OooO0O0(this);
        int i3 = !zOooO0O0 ? 1 : 0;
        if (OooOo0o(this.f5251Oooo)) {
            OooOo0(this.f5251Oooo, i, 0, i2, this.f5264OoooOoo);
            iOooOO0o = OooOO0o(this.f5251Oooo) + this.f5251Oooo.getMeasuredWidth();
            iMax = Math.max(0, OooOOO0(this.f5251Oooo) + this.f5251Oooo.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5251Oooo.getMeasuredState());
        } else {
            iOooOO0o = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (OooOo0o(this.f5255OoooO)) {
            OooOo0(this.f5255OoooO, i, 0, i2, this.f5264OoooOoo);
            iOooOO0o = OooOO0o(this.f5255OoooO) + this.f5255OoooO.getMeasuredWidth();
            iMax = Math.max(iMax, OooOOO0(this.f5255OoooO) + this.f5255OoooO.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5255OoooO.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iOooOO0o) + 0;
        iArr[zOooO0O0 ? 1 : 0] = Math.max(0, currentContentInsetStart - iOooOO0o);
        if (OooOo0o(this.f5252Oooo0o)) {
            OooOo0(this.f5252Oooo0o, i, iMax3, i2, this.f5264OoooOoo);
            iOooOO0o2 = OooOO0o(this.f5252Oooo0o) + this.f5252Oooo0o.getMeasuredWidth();
            iMax = Math.max(iMax, OooOOO0(this.f5252Oooo0o) + this.f5252Oooo0o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5252Oooo0o.getMeasuredState());
        } else {
            iOooOO0o2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iOooOO0o2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iOooOO0o2);
        if (OooOo0o(this.f5259OoooOO0)) {
            iMax4 += OooOo00(this.f5259OoooOO0, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, OooOOO0(this.f5259OoooOO0) + this.f5259OoooOO0.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5259OoooOO0.getMeasuredState());
        }
        if (OooOo0o(this.f5257OoooO00)) {
            iMax4 += OooOo00(this.f5257OoooO00, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, OooOOO0(this.f5257OoooO00) + this.f5257OoooO00.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5257OoooO00.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).f5294OooO0O0 == 0 && OooOo0o(childAt)) {
                iMax4 += OooOo00(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, OooOOO0(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f5267OooooO0 + this.f5268OooooOO;
        int i6 = this.f5265Ooooo00 + this.f5266Ooooo0o;
        if (OooOo0o(this.f5253Oooo0oO)) {
            OooOo00(this.f5253Oooo0oO, i, iMax4 + i6, i2, i5, iArr);
            int iOooOO0o3 = OooOO0o(this.f5253Oooo0oO) + this.f5253Oooo0oO.getMeasuredWidth();
            iOooOOO0 = OooOOO0(this.f5253Oooo0oO) + this.f5253Oooo0oO.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5253Oooo0oO.getMeasuredState());
            iMax2 = iOooOO0o3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iOooOOO0 = 0;
        }
        if (OooOo0o(this.f5254Oooo0oo)) {
            iMax2 = Math.max(iMax2, OooOo00(this.f5254Oooo0oo, i, iMax4 + i6, i2, iOooOOO0 + i5, iArr));
            iOooOOO0 += OooOOO0(this.f5254Oooo0oo) + this.f5254Oooo0oo.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5254Oooo0oo.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iOooOOO0);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax5;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f5283o0O0O00) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount2) {
                z = true;
                break;
            }
            View childAt2 = getChildAt(i7);
            if (OooOo0o(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
            i7++;
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f8027Oooo0o);
        ActionMenuView actionMenuView = this.f5252Oooo0o;
        androidx.appcompat.view.menu.OooO0o oooO0o = actionMenuView != null ? actionMenuView.f4876Ooooo00 : null;
        int i = savedState.f5302Oooo0oo;
        if (i != 0 && this.f5286o0Oo0oo != null && oooO0o != null && (menuItemFindItem = oooO0o.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f5301Oooo) {
            removeCallbacks(this.f5274o000OOo);
            post(this.f5274o000OOo);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        OooO0Oo();
        o000000O o000000o2 = this.f5269OooooOo;
        boolean z = i == 1;
        if (z == o000000o2.f5319OooO0oO) {
            return;
        }
        o000000o2.f5319OooO0oO = z;
        if (!o000000o2.f5320OooO0oo) {
            o000000o2.f5313OooO00o = o000000o2.f5318OooO0o0;
            o000000o2.f5314OooO0O0 = o000000o2.f5317OooO0o;
            return;
        }
        if (z) {
            int i2 = o000000o2.f5316OooO0Oo;
            if (i2 == Integer.MIN_VALUE) {
                i2 = o000000o2.f5318OooO0o0;
            }
            o000000o2.f5313OooO00o = i2;
            int i3 = o000000o2.f5315OooO0OO;
            if (i3 == Integer.MIN_VALUE) {
                i3 = o000000o2.f5317OooO0o;
            }
            o000000o2.f5314OooO0O0 = i3;
            return;
        }
        int i4 = o000000o2.f5315OooO0OO;
        if (i4 == Integer.MIN_VALUE) {
            i4 = o000000o2.f5318OooO0o0;
        }
        o000000o2.f5313OooO00o = i4;
        int i5 = o000000o2.f5316OooO0Oo;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o000000o2.f5317OooO0o;
        }
        o000000o2.f5314OooO0O0 = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.OooOO0 oooOO1;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooO0o oooO0o = this.f5286o0Oo0oo;
        if (oooO0o != null && (oooOO1 = oooO0o.f5299Oooo0oO) != null) {
            savedState.f5302Oooo0oo = oooOO1.f4730OooO00o;
        }
        savedState.f5301Oooo = OooOOo0();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5277o00Oo0 = false;
        }
        if (!this.f5277o00Oo0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5277o00Oo0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5277o00Oo0 = false;
        }
        return true;
    }

    @Override // o000O0O0.OooOO0O
    @MainThread
    public final void removeMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
        this.f5281o00oO0o.OooO0o0(oooOo);
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f5283o0O0O00 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5270Oooooo) {
            this.f5270Oooooo = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f5271Oooooo0) {
            this.f5271Oooooo0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        OooO0oO();
        this.f5251Oooo.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OooO oooO) {
        this.f5288o0ooOO0 = oooO;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        OooO0o0();
        this.f5252Oooo0o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f5260OoooOOO != i) {
            this.f5260OoooOOO = i;
            if (i == 0) {
                this.f5275o000oOoO = getContext();
            } else {
                this.f5275o000oOoO = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f5268OooooOO = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f5266Ooooo0o = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f5265Ooooo00 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f5267OooooO0 = i;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5294OooO0O0;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5294OooO0O0 = 0;
        }

        public LayoutParams() {
            this.f5294OooO0O0 = 0;
            this.f4361OooO00o = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f5294OooO0O0 = 0;
            this.f5294OooO0O0 = layoutParams.f5294OooO0O0;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5294OooO0O0 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5294OooO0O0 = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5294OooO0O0 = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0OO();
        }
        AppCompatImageButton appCompatImageButton = this.f5255OoooO;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            OooO0OO();
            this.f5255OoooO.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f5255OoooO;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f5256OoooO0);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5257OoooO00 == null) {
                this.f5257OoooO00 = new AppCompatImageView(getContext());
            }
            if (!OooOOOo(this.f5257OoooO00)) {
                OooO0O0(this.f5257OoooO00, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f5257OoooO00;
            if (appCompatImageView != null && OooOOOo(appCompatImageView)) {
                removeView(this.f5257OoooO00);
                this.f5282o00ooo.remove(this.f5257OoooO00);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f5257OoooO00;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5257OoooO00 == null) {
            this.f5257OoooO00 = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f5257OoooO00;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0oO();
        }
        AppCompatImageButton appCompatImageButton = this.f5251Oooo;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            o0000OO0.OooO00o(this.f5251Oooo, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            OooO0oO();
            if (!OooOOOo(this.f5251Oooo)) {
                OooO0O0(this.f5251Oooo, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f5251Oooo;
            if (appCompatImageButton != null && OooOOOo(appCompatImageButton)) {
                removeView(this.f5251Oooo);
                this.f5282o00ooo.remove(this.f5251Oooo);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f5251Oooo;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5254Oooo0oo;
            if (appCompatTextView != null && OooOOOo(appCompatTextView)) {
                removeView(this.f5254Oooo0oo);
                this.f5282o00ooo.remove(this.f5254Oooo0oo);
            }
        } else {
            if (this.f5254Oooo0oo == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f5254Oooo0oo = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5254Oooo0oo.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5262OoooOo0;
                if (i != 0) {
                    this.f5254Oooo0oo.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f5276o00O0O;
                if (colorStateList != null) {
                    this.f5254Oooo0oo.setTextColor(colorStateList);
                }
            }
            if (!OooOOOo(this.f5254Oooo0oo)) {
                OooO0O0(this.f5254Oooo0oo, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5254Oooo0oo;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f5287o0OoOo0 = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f5276o00O0O = colorStateList;
        AppCompatTextView appCompatTextView = this.f5254Oooo0oo;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5253Oooo0oO;
            if (appCompatTextView != null && OooOOOo(appCompatTextView)) {
                removeView(this.f5253Oooo0oO);
                this.f5282o00ooo.remove(this.f5253Oooo0oO);
            }
        } else {
            if (this.f5253Oooo0oO == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f5253Oooo0oO = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5253Oooo0oO.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5261OoooOOo;
                if (i != 0) {
                    this.f5253Oooo0oO.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f5293ooOO;
                if (colorStateList != null) {
                    this.f5253Oooo0oO.setTextColor(colorStateList);
                }
            }
            if (!OooOOOo(this.f5253Oooo0oO)) {
                OooO0O0(this.f5253Oooo0oO, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5253Oooo0oO;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f5273Ooooooo = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f5293ooOO = colorStateList;
        AppCompatTextView appCompatTextView = this.f5253Oooo0oO;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f5301Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f5302Oooo0oo;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5302Oooo0oo = parcel.readInt();
            this.f5301Oooo = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f8027Oooo0o, i);
            parcel.writeInt(this.f5302Oooo0oo);
            parcel.writeInt(this.f5301Oooo ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5272OoooooO = 8388627;
        this.f5279o00o0O = new ArrayList<>();
        this.f5282o00ooo = new ArrayList<>();
        this.f5291oo000o = new int[2];
        this.f5281o00oO0o = new o000O0O0.OooOOOO(new o0000O0O(this, 0));
        this.f5280o00oO0O = new ArrayList<>();
        this.f5289o0ooOOo = new OooO00o();
        this.f5274o000OOo = new OooO0O0();
        Context context2 = getContext();
        int[] iArr = OooOo00.OooOOOO.Toolbar;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context2, attributeSet, iArr, i);
        ViewCompat.OooOo0O(this, context, iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        this.f5261OoooOOo = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.Toolbar_titleTextAppearance, 0);
        this.f5262OoooOo0 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.Toolbar_subtitleTextAppearance, 0);
        this.f5272OoooooO = o0000o0OooOOo.OooOO0O(OooOo00.OooOOOO.Toolbar_android_gravity, this.f5272OoooooO);
        this.f5263OoooOoO = o0000o0OooOOo.OooOO0O(OooOo00.OooOOOO.Toolbar_buttonGravity, 48);
        int iOooO0o0 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_titleMargin, 0);
        int i2 = OooOo00.OooOOOO.Toolbar_titleMargins;
        iOooO0o0 = o0000o0OooOOo.OooOOOo(i2) ? o0000o0OooOOo.OooO0o0(i2, iOooO0o0) : iOooO0o0;
        this.f5268OooooOO = iOooO0o0;
        this.f5267OooooO0 = iOooO0o0;
        this.f5266Ooooo0o = iOooO0o0;
        this.f5265Ooooo00 = iOooO0o0;
        int iOooO0o1 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_titleMarginStart, -1);
        if (iOooO0o1 >= 0) {
            this.f5265Ooooo00 = iOooO0o1;
        }
        int iOooO0o2 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_titleMarginEnd, -1);
        if (iOooO0o2 >= 0) {
            this.f5266Ooooo0o = iOooO0o2;
        }
        int iOooO0o3 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_titleMarginTop, -1);
        if (iOooO0o3 >= 0) {
            this.f5267OooooO0 = iOooO0o3;
        }
        int iOooO0o4 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_titleMarginBottom, -1);
        if (iOooO0o4 >= 0) {
            this.f5268OooooOO = iOooO0o4;
        }
        this.f5264OoooOoo = o0000o0OooOOo.OooO0o(OooOo00.OooOOOO.Toolbar_maxButtonHeight, -1);
        int iOooO0o5 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iOooO0o6 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iOooO0o = o0000o0OooOOo.OooO0o(OooOo00.OooOOOO.Toolbar_contentInsetLeft, 0);
        int iOooO0o7 = o0000o0OooOOo.OooO0o(OooOo00.OooOOOO.Toolbar_contentInsetRight, 0);
        OooO0Oo();
        o000000O o000000o2 = this.f5269OooooOo;
        o000000o2.f5320OooO0oo = false;
        if (iOooO0o != Integer.MIN_VALUE) {
            o000000o2.f5318OooO0o0 = iOooO0o;
            o000000o2.f5313OooO00o = iOooO0o;
        }
        if (iOooO0o7 != Integer.MIN_VALUE) {
            o000000o2.f5317OooO0o = iOooO0o7;
            o000000o2.f5314OooO0O0 = iOooO0o7;
        }
        if (iOooO0o5 != Integer.MIN_VALUE || iOooO0o6 != Integer.MIN_VALUE) {
            o000000o2.OooO00o(iOooO0o5, iOooO0o6);
        }
        this.f5271Oooooo0 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f5270Oooooo = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f5256OoooO0 = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.Toolbar_collapseIcon);
        this.f5258OoooO0O = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.Toolbar_collapseContentDescription);
        CharSequence charSequenceOooOOOO = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceOooOOOO)) {
            setTitle(charSequenceOooOOOO);
        }
        CharSequence charSequenceOooOOOO2 = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceOooOOOO2)) {
            setSubtitle(charSequenceOooOOOO2);
        }
        this.f5275o000oOoO = getContext();
        setPopupTheme(o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.Toolbar_popupTheme, 0));
        Drawable drawableOooO0oO = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.Toolbar_navigationIcon);
        if (drawableOooO0oO != null) {
            setNavigationIcon(drawableOooO0oO);
        }
        CharSequence charSequenceOooOOOO3 = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceOooOOOO3)) {
            setNavigationContentDescription(charSequenceOooOOOO3);
        }
        Drawable drawableOooO0oO2 = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.Toolbar_logo);
        if (drawableOooO0oO2 != null) {
            setLogo(drawableOooO0oO2);
        }
        CharSequence charSequenceOooOOOO4 = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceOooOOOO4)) {
            setLogoDescription(charSequenceOooOOOO4);
        }
        int i3 = OooOo00.OooOOOO.Toolbar_titleTextColor;
        if (o0000o0OooOOo.OooOOOo(i3)) {
            setTitleTextColor(o0000o0OooOOo.OooO0OO(i3));
        }
        int i4 = OooOo00.OooOOOO.Toolbar_subtitleTextColor;
        if (o0000o0OooOOo.OooOOOo(i4)) {
            setSubtitleTextColor(o0000o0OooOOo.OooO0OO(i4));
        }
        int i5 = OooOo00.OooOOOO.Toolbar_menu;
        if (o0000o0OooOOo.OooOOOo(i5)) {
            getMenuInflater().inflate(o0000o0OooOOo.OooOOO0(i5, 0), getMenu());
        }
        o0000o0OooOOo.OooOOoo();
    }
}
