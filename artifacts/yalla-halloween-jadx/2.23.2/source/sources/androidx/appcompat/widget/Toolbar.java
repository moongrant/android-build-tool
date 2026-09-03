package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.time.DurationKt;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Drawable f3124OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ActionMenuView f3125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AppCompatTextView f3126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AppCompatTextView f3127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public AppCompatImageButton f3128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AppCompatImageView f3129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final CharSequence f3130OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AppCompatImageButton f3131OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f3132OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f3133OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Context f3134OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f3135OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f3136OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f3137OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f3138OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f3139OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f3140OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f3141OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f3142OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f3143OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000O00 f3144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f3145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f3146OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CharSequence f3147OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ColorStateList f3148OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public CharSequence f3149OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ColorStateList f3150OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f3151OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooOO0 f3152Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int[] f3153Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f3154Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final ArrayList<View> f3155Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ArrayList<View> f3156Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final androidx.core.view.o00oO0o f3157Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ArrayList<MenuItem> f3158Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f3159Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public OooOO0O f3160Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o000OO0O f3161Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ActionMenuPresenter f3162Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OnBackInvokedCallback f3163OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooO.OooO00o f3164OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public androidx.appcompat.view.menu.OooOOO.OooO00o f3165OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f3166OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OnBackInvokedDispatcher f3167OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO0O0 f3168OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f3169o000oOoO;

    @RequiresApi(33)
    public static class OooO {
        @Nullable
        @DoNotInline
        public static OnBackInvokedDispatcher OooO00o(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        public static OnBackInvokedCallback OooO0O0(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.o000O0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        public static void OooO0OO(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public static void OooO0Oo(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
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
            ActionMenuPresenter actionMenuPresenter;
            ActionMenuView actionMenuView = Toolbar.this.f3125OooO0Oo;
            if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f2776OooOo0o) == null) {
                return;
            }
            actionMenuPresenter.OooOOOO();
        }
    }

    public class OooO0OO implements androidx.appcompat.view.menu.OooO.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
            androidx.appcompat.view.menu.OooO.OooO00o oooO00o = Toolbar.this.f3164OoooO0;
            return oooO00o != null && oooO00o.OooO00o(oooO, menuItem);
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            Toolbar toolbar = Toolbar.this;
            ActionMenuPresenter actionMenuPresenter = toolbar.f3125OooO0Oo.f2776OooOo0o;
            if (!(actionMenuPresenter != null && actionMenuPresenter.OooOOO0())) {
                Iterator<androidx.core.view.o0OOO0o> it = toolbar.f3157Oooo0O0.f5459OooO0O0.iterator();
                while (it.hasNext()) {
                    it.next().OooO0O0(oooO);
                }
            }
            androidx.appcompat.view.menu.OooO.OooO00o oooO00o = toolbar.f3164OoooO0;
            if (oooO00o != null) {
                oooO00o.OooO0O0(oooO);
            }
        }
    }

    public class OooO0o implements View.OnClickListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooOO0 oooOO1 = Toolbar.this.f3152Oooo;
            androidx.appcompat.view.menu.OooOO0O oooOO0O = oooOO1 == null ? null : oooOO1.f3177OooO0o0;
            if (oooOO0O != null) {
                oooOO0O.collapseActionView();
            }
        }
    }

    public class OooOO0 implements androidx.appcompat.view.menu.OooOOO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO f3175OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f3177OooO0o0;

        public OooOO0() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooO(boolean z) {
            if (this.f3177OooO0o0 != null) {
                androidx.appcompat.view.menu.OooO oooO = this.f3175OooO0Oo;
                boolean z2 = false;
                if (oooO != null) {
                    int size = oooO.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f3175OooO0Oo.getItem(i) == this.f3177OooO0o0) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                OooO0Oo(this.f3177OooO0o0);
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooO0O0(androidx.appcompat.view.menu.OooO oooO, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final boolean OooO0Oo(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f3132OooOO0o;
            if (callback instanceof p016OooOoOO.o00O0O) {
                ((p016OooOoOO.o00O0O) callback).OooO0o0();
            }
            toolbar.removeView(toolbar.f3132OooOO0o);
            toolbar.removeView(toolbar.f3131OooOO0O);
            toolbar.f3132OooOO0o = null;
            ArrayList<View> arrayList = toolbar.f3156Oooo00o;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    arrayList.clear();
                    this.f3177OooO0o0 = null;
                    toolbar.requestLayout();
                    oooOO0O.f2651OooOoo = false;
                    oooOO0O.f2636OooOOO.OooOOOo(false);
                    toolbar.OooOOoo();
                    return true;
                }
                toolbar.addView(arrayList.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final boolean OooO0o(androidx.appcompat.view.menu.OooOo oooOo) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooO0o0(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final Parcelable OooO0oO() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final boolean OooO0oo(androidx.appcompat.view.menu.OooOO0O oooOO0O) {
            Toolbar toolbar = Toolbar.this;
            toolbar.OooO0OO();
            ViewParent parent = toolbar.f3131OooOO0O.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3131OooOO0O);
                }
                toolbar.addView(toolbar.f3131OooOO0O);
            }
            View actionView = oooOO0O.getActionView();
            toolbar.f3132OooOO0o = actionView;
            this.f3177OooO0o0 = oooOO0O;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f3132OooOO0o);
                }
                LayoutParams layoutParams = new LayoutParams();
                layoutParams.f2228OooO00o = (toolbar.f3138OooOOo0 & 112) | 8388611;
                layoutParams.f3170OooO0O0 = 2;
                toolbar.f3132OooOO0o.setLayoutParams(layoutParams);
                toolbar.addView(toolbar.f3132OooOO0o);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((LayoutParams) childAt.getLayoutParams()).f3170OooO0O0 != 2 && childAt != toolbar.f3125OooO0Oo) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f3156Oooo00o.add(childAt);
                }
            }
            toolbar.requestLayout();
            oooOO0O.f2651OooOoo = true;
            oooOO0O.f2636OooOOO.OooOOOo(false);
            KeyEvent.Callback callback = toolbar.f3132OooOO0o;
            if (callback instanceof p016OooOoOO.o00O0O) {
                ((p016OooOoOO.o00O0O) callback).OooO0O0();
            }
            toolbar.OooOOoo();
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final boolean OooOO0() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final void OooOO0O(Context context, androidx.appcompat.view.menu.OooO oooO) {
            androidx.appcompat.view.menu.OooOO0O oooOO0O;
            androidx.appcompat.view.menu.OooO oooO2 = this.f3175OooO0Oo;
            if (oooO2 != null && (oooOO0O = this.f3177OooO0o0) != null) {
                oooO2.OooO0Oo(oooOO0O);
            }
            this.f3175OooO0Oo = oooO;
        }

        @Override // androidx.appcompat.view.menu.OooOOO
        public final int getId() {
            return 0;
        }
    }

    public interface OooOO0O {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f3178OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f3179OooO0oO;

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
            this.f3178OooO0o = parcel.readInt();
            this.f3179OooO0oO = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f5545OooO0Oo, i);
            parcel.writeInt(this.f3178OooO0o);
            parcel.writeInt(this.f3179OooO0oO ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    public static int OooO(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.o00O0O.OooO0O0(marginLayoutParams) + androidx.core.view.o00O0O.OooO0OO(marginLayoutParams);
    }

    public static LayoutParams OooO0oO(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static int OooOO0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
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
        return new p016OooOoOO.o00oO0o(getContext());
    }

    public final void OooO00o(int i, ArrayList arrayList) {
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(this));
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3170OooO0O0 == 0 && OooOOo(childAt)) {
                    int i3 = layoutParams.f2228OooO00o;
                    WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                    int iOooO0Oo = ViewCompat.OooO.OooO0Oo(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, iOooO0Oo) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iOooO0Oo == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f3170OooO0O0 == 0 && OooOOo(childAt2)) {
                int i5 = layoutParams2.f2228OooO00o;
                WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
                int iOooO0Oo2 = ViewCompat.OooO.OooO0Oo(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, iOooO0Oo2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iOooO0Oo2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void OooO0O0(View view, boolean z) {
        LayoutParams layoutParamsOooO0oO;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsOooO0oO = new LayoutParams();
        } else {
            layoutParamsOooO0oO = !checkLayoutParams(layoutParams) ? OooO0oO(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsOooO0oO.f3170OooO0O0 = 1;
        if (!z || this.f3132OooOO0o == null) {
            addView(view, layoutParamsOooO0oO);
        } else {
            view.setLayoutParams(layoutParamsOooO0oO);
            this.f3156Oooo00o.add(view);
        }
    }

    public final void OooO0OO() {
        if (this.f3131OooOO0O == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, p012OooOo0O.OooOOO0.toolbarNavigationButtonStyle);
            this.f3131OooOO0O = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f3124OooO);
            this.f3131OooOO0O.setContentDescription(this.f3130OooOO0);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f2228OooO00o = (this.f3138OooOOo0 & 112) | 8388611;
            layoutParams.f3170OooO0O0 = 2;
            this.f3131OooOO0O.setLayoutParams(layoutParams);
            this.f3131OooOO0O.setOnClickListener(new OooO0o());
        }
    }

    public final void OooO0Oo() {
        OooO0o0();
        ActionMenuView actionMenuView = this.f3125OooO0Oo;
        if (actionMenuView.f2771OooOOoo == null) {
            androidx.appcompat.view.menu.OooO oooO = (androidx.appcompat.view.menu.OooO) actionMenuView.getMenu();
            if (this.f3152Oooo == null) {
                this.f3152Oooo = new OooOO0();
            }
            this.f3125OooO0Oo.setExpandedActionViewsExclusive(true);
            oooO.OooO0O0(this.f3152Oooo, this.f3134OooOOO0);
            OooOOoo();
        }
    }

    public final void OooO0o() {
        if (this.f3128OooO0oO == null) {
            this.f3128OooO0oO = new AppCompatImageButton(getContext(), null, p012OooOo0O.OooOOO0.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f2228OooO00o = (this.f3138OooOOo0 & 112) | 8388611;
            this.f3128OooO0oO.setLayoutParams(layoutParams);
        }
    }

    public final void OooO0o0() {
        if (this.f3125OooO0Oo == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3125OooO0Oo = actionMenuView;
            actionMenuView.setPopupTheme(this.f3133OooOOO);
            this.f3125OooO0Oo.setOnMenuItemClickListener(this.f3159Oooo0o);
            ActionMenuView actionMenuView2 = this.f3125OooO0Oo;
            androidx.appcompat.view.menu.OooOOO.OooO00o oooO00o = this.f3165OoooO00;
            OooO0OO oooO0OO = new OooO0OO();
            actionMenuView2.f2772OooOo = oooO00o;
            actionMenuView2.f2778OooOoO0 = oooO0OO;
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f2228OooO00o = (this.f3138OooOOo0 & 112) | 8388613;
            this.f3125OooO0Oo.setLayoutParams(layoutParams);
            OooO0O0(this.f3125OooO0Oo, false);
        }
    }

    public final int OooO0oo(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = layoutParams.f2228OooO00o & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f3145OooOoO & 112;
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

    public void OooOO0O(@MenuRes int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    @MainThread
    public final void OooOO0o() {
        Iterator<MenuItem> it = this.f3158Oooo0OO.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<androidx.core.view.o0OOO0o> it2 = this.f3157Oooo0O0.f5459OooO0O0.iterator();
        while (it2.hasNext()) {
            it2.next().OooO0Oo(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3158Oooo0OO = currentMenuItems2;
    }

    public final int OooOOO(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iOooO0oo = OooO0oo(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iOooO0oo, iMax + measuredWidth, view.getMeasuredHeight() + iOooO0oo);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    public final boolean OooOOO0(View view) {
        return view.getParent() == this || this.f3156Oooo00o.contains(view);
    }

    public final int OooOOOO(View view, int i, int i2, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iOooO0oo = OooO0oo(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iOooO0oo, iMax, view.getMeasuredHeight() + iOooO0oo);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int OooOOOo(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final boolean OooOOo(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void OooOOo0(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, Pow2.MAX_POW2);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    final void OooOOoo() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherOooO00o = OooO.OooO00o(this);
            OooOO0 oooOO1 = this.f3152Oooo;
            if (((oooOO1 == null || oooOO1.f3177OooO0o0 == null) ? false : true) && onBackInvokedDispatcherOooO00o != null) {
                WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                z = ViewCompat.OooOO0O.OooO0O0(this) && this.f3169o000oOoO;
            }
            if (z && this.f3167OoooOO0 == null) {
                if (this.f3163OoooO == null) {
                    this.f3163OoooO = OooO.OooO0O0(new Runnable() { // from class: androidx.appcompat.widget.o000O00O
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.OooOO0 oooOO2 = this.f3268OooO0Oo.f3152Oooo;
                            androidx.appcompat.view.menu.OooOO0O oooOO0O = oooOO2 == null ? null : oooOO2.f3177OooO0o0;
                            if (oooOO0O != null) {
                                oooOO0O.collapseActionView();
                            }
                        }
                    });
                }
                OooO.OooO0OO(onBackInvokedDispatcherOooO00o, this.f3163OoooO);
                this.f3167OoooOO0 = onBackInvokedDispatcherOooO00o;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f3167OoooOO0) == null) {
                return;
            }
            OooO.OooO0Oo(onBackInvokedDispatcher, this.f3163OoooO);
            this.f3167OoooOO0 = null;
        }
    }

    @Override // androidx.core.view.o00Oo0
    @MainThread
    public final void addMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
        androidx.core.view.o00oO0o o00oo0o2 = this.f3157Oooo0O0;
        o00oo0o2.f5459OooO0O0.add(o0ooo0o2);
        o00oo0o2.f5458OooO00o.run();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0oO(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f3131OooOO0O;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f3131OooOO0O;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0000O00 o0000o00 = this.f3144OooOo0o;
        if (o0000o00 != null) {
            return o0000o00.f3245OooO0oO ? o0000o00.f3239OooO00o : o0000o00.f3240OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f3146OooOoO0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0000O00 o0000o00 = this.f3144OooOo0o;
        if (o0000o00 != null) {
            return o0000o00.f3239OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0000O00 o0000o00 = this.f3144OooOo0o;
        if (o0000o00 != null) {
            return o0000o00.f3240OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0000O00 o0000o00 = this.f3144OooOo0o;
        if (o0000o00 != null) {
            return o0000o00.f3245OooO0oO ? o0000o00.f3240OooO0O0 : o0000o00.f3239OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f3140OooOo;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.OooO oooO;
        ActionMenuView actionMenuView = this.f3125OooO0Oo;
        return actionMenuView != null && (oooO = actionMenuView.f2771OooOOoo) != null && oooO.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f3146OooOoO0, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        return ViewCompat.OooO.OooO0Oo(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3140OooOo, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f3129OooO0oo;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f3129OooO0oo;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        OooO0Oo();
        return this.f3125OooO0Oo.getMenu();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public View getNavButtonView() {
        return this.f3128OooO0oO;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f3128OooO0oO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f3128OooO0oO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f3162Oooo0oo;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        OooO0Oo();
        return this.f3125OooO0Oo.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f3134OooOOO0;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f3133OooOOO;
    }

    public CharSequence getSubtitle() {
        return this.f3149OooOoo0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.f3126OooO0o;
    }

    public CharSequence getTitle() {
        return this.f3147OooOoOO;
    }

    public int getTitleMarginBottom() {
        return this.f3143OooOo0O;
    }

    public int getTitleMarginEnd() {
        return this.f3142OooOo00;
    }

    public int getTitleMarginStart() {
        return this.f3139OooOOoo;
    }

    public int getTitleMarginTop() {
        return this.f3141OooOo0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.f3127OooO0o0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o0Oo0oo getWrapper() {
        if (this.f3161Oooo0oO == null) {
            this.f3161Oooo0oO = new o000OO0O(this, true);
        }
        return this.f3161Oooo0oO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOoo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3168OoooOOO);
        OooOOoo();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3154Oooo000 = false;
        }
        if (!this.f3154Oooo000) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3154Oooo000 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3154Oooo000 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:103:0x0292 A[LOOP:0: B:102:0x0290->B:103:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02ae A[LOOP:1: B:105:0x02ac->B:106:0x02ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02cd A[LOOP:2: B:108:0x02cb->B:109:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0310  */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b A[LOOP:3: B:117:0x0319->B:118:0x031b, LOOP_END] */
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
        int iOooOOO;
        int iOooOOOO;
        int iMax;
        int iMin;
        boolean zOooOOo;
        boolean zOooOOo2;
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
        ArrayList<View> arrayList;
        int size;
        int iOooOOO2;
        int i17;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z3 = ViewCompat.OooO.OooO0Oo(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f3153Oooo0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iOooO0Oo = ViewCompat.OooO0o.OooO0Oo(this);
        int iMin2 = iOooO0Oo >= 0 ? Math.min(iOooO0Oo, i4 - i2) : 0;
        if (OooOOo(this.f3128OooO0oO)) {
            if (z3) {
                iOooOOOO = OooOOOO(this.f3128OooO0oO, i26, iMin2, iArr);
                iOooOOO = paddingLeft;
            } else {
                iOooOOO = OooOOO(this.f3128OooO0oO, paddingLeft, iMin2, iArr);
            }
            if (OooOOo(this.f3131OooOO0O)) {
                if (z3) {
                    iOooOOOO = OooOOOO(this.f3131OooOO0O, iOooOOOO, iMin2, iArr);
                } else {
                    iOooOOO = OooOOO(this.f3131OooOO0O, iOooOOO, iMin2, iArr);
                }
            }
            if (OooOOo(this.f3125OooO0Oo)) {
                if (z3) {
                    iOooOOO = OooOOO(this.f3125OooO0Oo, iOooOOO, iMin2, iArr);
                } else {
                    iOooOOOO = OooOOOO(this.f3125OooO0Oo, iOooOOOO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iOooOOO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iOooOOOO));
            iMax = Math.max(iOooOOO, currentContentInsetLeft);
            iMin = Math.min(iOooOOOO, i26 - currentContentInsetRight);
            if (OooOOo(this.f3132OooOO0o)) {
                if (z3) {
                    iMin = OooOOOO(this.f3132OooOO0o, iMin, iMin2, iArr);
                } else {
                    iMax = OooOOO(this.f3132OooOO0o, iMax, iMin2, iArr);
                }
            }
            if (OooOOo(this.f3129OooO0oo)) {
                if (z3) {
                    iMin = OooOOOO(this.f3129OooO0oo, iMin, iMin2, iArr);
                } else {
                    iMax = OooOOO(this.f3129OooO0oo, iMax, iMin2, iArr);
                }
            }
            zOooOOo = OooOOo(this.f3127OooO0o0);
            zOooOOo2 = OooOOo(this.f3126OooO0o);
            if (zOooOOo) {
                LayoutParams layoutParams3 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                measuredHeight = this.f3127OooO0o0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zOooOOo2) {
                LayoutParams layoutParams4 = (LayoutParams) this.f3126OooO0o.getLayoutParams();
                measuredHeight += this.f3126OooO0o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            }
            if (!zOooOOo || zOooOOo2) {
                if (zOooOOo) {
                    appCompatTextView = this.f3127OooO0o0;
                } else {
                    appCompatTextView = this.f3126OooO0o;
                }
                if (zOooOOo2) {
                    appCompatTextView2 = this.f3126OooO0o;
                } else {
                    appCompatTextView2 = this.f3127OooO0o0;
                }
                layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
                layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
                z2 = (!zOooOOo && this.f3127OooO0o0.getMeasuredWidth() > 0) || (zOooOOo2 && this.f3126OooO0o.getMeasuredWidth() > 0);
                i5 = this.f3145OooOoO & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i16 = this.f3143OooOo0O;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f3143OooOo0O) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.f3139OooOOoo;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zOooOOo) {
                        LayoutParams layoutParams5 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                        int measuredWidth2 = iMin - this.f3127OooO0o0.getMeasuredWidth();
                        int measuredHeight2 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                        this.f3127OooO0o0.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.f3142OooOo00;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zOooOOo2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                        this.f3126OooO0o.layout(iMin - this.f3126OooO0o.getMeasuredWidth(), i28, iMin, this.f3126OooO0o.getMeasuredHeight() + i28);
                        i12 = iMin - this.f3142OooOo00;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                } else {
                    if (z2) {
                        i7 = this.f3139OooOOoo;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax += Math.max(0, i29);
                    iArr[0] = Math.max(0, -i29);
                    if (zOooOOo) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                        int measuredWidth3 = this.f3127OooO0o0.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                        this.f3127OooO0o0.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.f3142OooOo00;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (zOooOOo2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f3126OooO0o.getMeasuredWidth() + iMax;
                        this.f3126OooO0o.layout(iMax, i30, measuredWidth4, this.f3126OooO0o.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.f3142OooOo00;
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
            arrayList = this.f3155Oooo00O;
            OooO00o(3, arrayList);
            size = arrayList.size();
            iOooOOO2 = iMax;
            for (i17 = 0; i17 < size; i17++) {
                iOooOOO2 = OooOOO(arrayList.get(i17), iOooOOO2, iMin2, iArr);
            }
            i18 = iMin2;
            OooO00o(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = OooOOOO(arrayList.get(i19), iMin, i18, iArr);
            }
            OooO00o(1, arrayList);
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
            i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iOooOOO2) {
                if (i25 > iMin) {
                    iOooOOO2 = i24 - (i25 - iMin);
                } else {
                    iOooOOO2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iOooOOO2 = OooOOO(arrayList.get(i23), iOooOOO2, i18, iArr);
            }
            arrayList.clear();
        }
        iOooOOO = paddingLeft;
        iOooOOOO = i26;
        if (OooOOo(this.f3131OooOO0O)) {
            if (z3) {
                iOooOOOO = OooOOOO(this.f3131OooOO0O, iOooOOOO, iMin2, iArr);
            } else {
                iOooOOO = OooOOO(this.f3131OooOO0O, iOooOOO, iMin2, iArr);
            }
        }
        if (OooOOo(this.f3125OooO0Oo)) {
            if (z3) {
                iOooOOO = OooOOO(this.f3125OooO0Oo, iOooOOO, iMin2, iArr);
            } else {
                iOooOOOO = OooOOOO(this.f3125OooO0Oo, iOooOOOO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iOooOOO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iOooOOOO));
        iMax = Math.max(iOooOOO, currentContentInsetLeft2);
        iMin = Math.min(iOooOOOO, i26 - currentContentInsetRight2);
        if (OooOOo(this.f3132OooOO0o)) {
            if (z3) {
                iMin = OooOOOO(this.f3132OooOO0o, iMin, iMin2, iArr);
            } else {
                iMax = OooOOO(this.f3132OooOO0o, iMax, iMin2, iArr);
            }
        }
        if (OooOOo(this.f3129OooO0oo)) {
            if (z3) {
                iMin = OooOOOO(this.f3129OooO0oo, iMin, iMin2, iArr);
            } else {
                iMax = OooOOO(this.f3129OooO0oo, iMax, iMin2, iArr);
            }
        }
        zOooOOo = OooOOo(this.f3127OooO0o0);
        zOooOOo2 = OooOOo(this.f3126OooO0o);
        if (zOooOOo) {
            LayoutParams layoutParams8 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
            measuredHeight = this.f3127OooO0o0.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zOooOOo2) {
            LayoutParams layoutParams9 = (LayoutParams) this.f3126OooO0o.getLayoutParams();
            measuredHeight += this.f3126OooO0o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin;
        }
        if (zOooOOo) {
            if (zOooOOo) {
                appCompatTextView = this.f3127OooO0o0;
            } else {
                appCompatTextView = this.f3126OooO0o;
            }
            if (zOooOOo2) {
                appCompatTextView2 = this.f3126OooO0o;
            } else {
                appCompatTextView2 = this.f3127OooO0o0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zOooOOo) {
            }
            i5 = this.f3145OooOoO & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i16 = this.f3143OooOo0O;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f3143OooOo0O) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f3139OooOOoo;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zOooOOo) {
                    LayoutParams layoutParams10 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                    int measuredWidth5 = iMin - this.f3127OooO0o0.getMeasuredWidth();
                    int measuredHeight4 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                    this.f3127OooO0o0.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.f3142OooOo00;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zOooOOo2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                    this.f3126OooO0o.layout(iMin - this.f3126OooO0o.getMeasuredWidth(), i211, iMin, this.f3126OooO0o.getMeasuredHeight() + i211);
                    i12 = iMin - this.f3142OooOo00;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.f3139OooOOoo;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax += Math.max(0, i212);
                iArr[0] = Math.max(0, -i212);
                if (zOooOOo) {
                    LayoutParams layoutParams11 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                    int measuredWidth6 = this.f3127OooO0o0.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                    this.f3127OooO0o0.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.f3142OooOo00;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zOooOOo2) {
                    int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f3126OooO0o.getMeasuredWidth() + iMax;
                    this.f3126OooO0o.layout(iMax, i34, measuredWidth7, this.f3126OooO0o.getMeasuredHeight() + i34);
                    i9 = measuredWidth7 + this.f3142OooOo00;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (zOooOOo) {
                appCompatTextView = this.f3127OooO0o0;
            } else {
                appCompatTextView = this.f3126OooO0o;
            }
            if (zOooOOo2) {
                appCompatTextView2 = this.f3126OooO0o;
            } else {
                appCompatTextView2 = this.f3127OooO0o0;
            }
            layoutParams = (LayoutParams) appCompatTextView.getLayoutParams();
            layoutParams2 = (LayoutParams) appCompatTextView2.getLayoutParams();
            if (zOooOOo) {
            }
            i5 = this.f3145OooOoO & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f3141OooOo0;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i16 = this.f3143OooOo0O;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f3143OooOo0O) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f3139OooOOoo;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zOooOOo) {
                    LayoutParams layoutParams12 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                    int measuredWidth8 = iMin - this.f3127OooO0o0.getMeasuredWidth();
                    int measuredHeight6 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                    this.f3127OooO0o0.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.f3142OooOo00;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zOooOOo2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                    this.f3126OooO0o.layout(iMin - this.f3126OooO0o.getMeasuredWidth(), i214, iMin, this.f3126OooO0o.getMeasuredHeight() + i214);
                    i12 = iMin - this.f3142OooOo00;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.f3139OooOOoo;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax += Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (zOooOOo) {
                    LayoutParams layoutParams13 = (LayoutParams) this.f3127OooO0o0.getLayoutParams();
                    int measuredWidth9 = this.f3127OooO0o0.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f3127OooO0o0.getMeasuredHeight() + paddingTop;
                    this.f3127OooO0o0.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.f3142OooOo00;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zOooOOo2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f3126OooO0o.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f3126OooO0o.getMeasuredWidth() + iMax;
                    this.f3126OooO0o.layout(iMax, i35, measuredWidth10, this.f3126OooO0o.getMeasuredHeight() + i35);
                    i9 = measuredWidth10 + this.f3142OooOo00;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        arrayList = this.f3155Oooo00O;
        OooO00o(3, arrayList);
        size = arrayList.size();
        iOooOOO2 = iMax;
        while (i17 < size) {
            iOooOOO2 = OooOOO(arrayList.get(i17), iOooOOO2, iMin2, iArr);
        }
        i18 = iMin2;
        OooO00o(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = OooOOOO(arrayList.get(i19), iMin, i18, iArr);
        }
        OooO00o(1, arrayList);
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
        i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iOooOOO2) {
            if (i25 > iMin) {
                iOooOOO2 = i24 - (i25 - iMin);
            } else {
                iOooOOO2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iOooOOO2 = OooOOO(arrayList.get(i23), iOooOOO2, i18, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iOooO;
        int iMax;
        int iCombineMeasuredStates;
        int iOooO2;
        int iOooOO0;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z;
        boolean zOooO00o = o0O0ooO.OooO00o(this);
        int i3 = !zOooO00o ? 1 : 0;
        if (OooOOo(this.f3128OooO0oO)) {
            OooOOo0(this.f3128OooO0oO, i, 0, i2, this.f3137OooOOo);
            iOooO = OooO(this.f3128OooO0oO) + this.f3128OooO0oO.getMeasuredWidth();
            iMax = Math.max(0, OooOO0(this.f3128OooO0oO) + this.f3128OooO0oO.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3128OooO0oO.getMeasuredState());
        } else {
            iOooO = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (OooOOo(this.f3131OooOO0O)) {
            OooOOo0(this.f3131OooOO0O, i, 0, i2, this.f3137OooOOo);
            iOooO = OooO(this.f3131OooOO0O) + this.f3131OooOO0O.getMeasuredWidth();
            iMax = Math.max(iMax, OooOO0(this.f3131OooOO0O) + this.f3131OooOO0O.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3131OooOO0O.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iOooO) + 0;
        int iMax4 = Math.max(0, currentContentInsetStart - iOooO);
        int[] iArr = this.f3153Oooo0;
        iArr[zOooO00o ? 1 : 0] = iMax4;
        if (OooOOo(this.f3125OooO0Oo)) {
            OooOOo0(this.f3125OooO0Oo, i, iMax3, i2, this.f3137OooOOo);
            iOooO2 = OooO(this.f3125OooO0Oo) + this.f3125OooO0Oo.getMeasuredWidth();
            iMax = Math.max(iMax, OooOO0(this.f3125OooO0Oo) + this.f3125OooO0Oo.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3125OooO0Oo.getMeasuredState());
        } else {
            iOooO2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iOooO2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iOooO2);
        if (OooOOo(this.f3132OooOO0o)) {
            iMax5 += OooOOOo(this.f3132OooOO0o, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, OooOO0(this.f3132OooOO0o) + this.f3132OooOO0o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3132OooOO0o.getMeasuredState());
        }
        if (OooOOo(this.f3129OooO0oo)) {
            iMax5 += OooOOOo(this.f3129OooO0oo, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, OooOO0(this.f3129OooO0oo) + this.f3129OooO0oo.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3129OooO0oo.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).f3170OooO0O0 == 0 && OooOOo(childAt)) {
                iMax5 += OooOOOo(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, OooOO0(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.f3141OooOo0 + this.f3143OooOo0O;
        int i6 = this.f3139OooOOoo + this.f3142OooOo00;
        if (OooOOo(this.f3127OooO0o0)) {
            OooOOOo(this.f3127OooO0o0, i, iMax5 + i6, i2, i5, iArr);
            int iOooO3 = OooO(this.f3127OooO0o0) + this.f3127OooO0o0.getMeasuredWidth();
            iOooOO0 = OooOO0(this.f3127OooO0o0) + this.f3127OooO0o0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3127OooO0o0.getMeasuredState());
            iMax2 = iOooO3;
        } else {
            iOooOO0 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (OooOOo(this.f3126OooO0o)) {
            iMax2 = Math.max(iMax2, OooOOOo(this.f3126OooO0o, i, iMax5 + i6, i2, iOooOO0 + i5, iArr));
            iOooOO0 += OooOO0(this.f3126OooO0o) + this.f3126OooO0o.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3126OooO0o.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iOooOO0);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f3166OoooO0O) {
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
            if (OooOOo(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
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
        super.onRestoreInstanceState(savedState.f5545OooO0Oo);
        ActionMenuView actionMenuView = this.f3125OooO0Oo;
        androidx.appcompat.view.menu.OooO oooO = actionMenuView != null ? actionMenuView.f2771OooOOoo : null;
        int i = savedState.f3178OooO0o;
        if (i != 0 && this.f3152Oooo != null && oooO != null && (menuItemFindItem = oooO.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f3179OooO0oO) {
            OooO0O0 oooO0O0 = this.f3168OoooOOO;
            removeCallbacks(oooO0O0);
            post(oooO0O0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3144OooOo0o == null) {
            this.f3144OooOo0o = new o0000O00();
        }
        o0000O00 o0000o00 = this.f3144OooOo0o;
        boolean z = i == 1;
        if (z == o0000o00.f3245OooO0oO) {
            return;
        }
        o0000o00.f3245OooO0oO = z;
        if (!o0000o00.f3246OooO0oo) {
            o0000o00.f3239OooO00o = o0000o00.f3244OooO0o0;
            o0000o00.f3240OooO0O0 = o0000o00.f3243OooO0o;
            return;
        }
        if (z) {
            int i2 = o0000o00.f3242OooO0Oo;
            if (i2 == Integer.MIN_VALUE) {
                i2 = o0000o00.f3244OooO0o0;
            }
            o0000o00.f3239OooO00o = i2;
            int i3 = o0000o00.f3241OooO0OO;
            if (i3 == Integer.MIN_VALUE) {
                i3 = o0000o00.f3243OooO0o;
            }
            o0000o00.f3240OooO0O0 = i3;
            return;
        }
        int i4 = o0000o00.f3241OooO0OO;
        if (i4 == Integer.MIN_VALUE) {
            i4 = o0000o00.f3244OooO0o0;
        }
        o0000o00.f3239OooO00o = i4;
        int i5 = o0000o00.f3242OooO0Oo;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o0000o00.f3243OooO0o;
        }
        o0000o00.f3240OooO0O0 = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.OooOO0O oooOO0O;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        OooOO0 oooOO1 = this.f3152Oooo;
        if (oooOO1 != null && (oooOO0O = oooOO1.f3177OooO0o0) != null) {
            savedState.f3178OooO0o = oooOO0O.f2625OooO00o;
        }
        ActionMenuView actionMenuView = this.f3125OooO0Oo;
        boolean z = false;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f2776OooOo0o;
            if (actionMenuPresenter != null && actionMenuPresenter.OooOOO0()) {
                z = true;
            }
        }
        savedState.f3179OooO0oO = z;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3151OooOooo = false;
        }
        if (!this.f3151OooOooo) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3151OooOooo = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3151OooOooo = false;
        }
        return true;
    }

    @Override // androidx.core.view.o00Oo0
    @MainThread
    public final void removeMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
        this.f3157Oooo0O0.OooO00o(o0ooo0o2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f3169o000oOoO != z) {
            this.f3169o000oOoO = z;
            OooOOoo();
        }
    }

    public void setCollapseContentDescription(@StringRes int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f3166OoooO0O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3146OooOoO0) {
            this.f3146OooOoO0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3140OooOo) {
            this.f3140OooOo = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i) {
        setLogo(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    public void setLogoDescription(@StringRes int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(@StringRes int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        OooO0o();
        this.f3128OooO0oO.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OooOO0O oooOO0O) {
        this.f3160Oooo0o0 = oooOO0O;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        OooO0Oo();
        this.f3125OooO0Oo.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f3133OooOOO != i) {
            this.f3133OooOOO = i;
            if (i == 0) {
                this.f3134OooOOO0 = getContext();
            } else {
                this.f3134OooOOO0 = new ContextThemeWrapper(getContext(), i);
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
        this.f3143OooOo0O = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f3142OooOo00 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f3139OooOOoo = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f3141OooOo0 = i;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f3170OooO0O0;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3170OooO0O0 = 0;
        }

        public LayoutParams() {
            this.f3170OooO0O0 = 0;
            this.f2228OooO00o = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f3170OooO0O0 = 0;
            this.f3170OooO0O0 = layoutParams.f3170OooO0O0;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3170OooO0O0 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3170OooO0O0 = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3170OooO0O0 = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0OO();
        }
        AppCompatImageButton appCompatImageButton = this.f3131OooOO0O;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            OooO0OO();
            this.f3131OooOO0O.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f3131OooOO0O;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f3124OooO);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3129OooO0oo == null) {
                this.f3129OooO0oo = new AppCompatImageView(getContext());
            }
            if (!OooOOO0(this.f3129OooO0oo)) {
                OooO0O0(this.f3129OooO0oo, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f3129OooO0oo;
            if (appCompatImageView != null && OooOOO0(appCompatImageView)) {
                removeView(this.f3129OooO0oo);
                this.f3156Oooo00o.remove(this.f3129OooO0oo);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f3129OooO0oo;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3129OooO0oo == null) {
            this.f3129OooO0oo = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f3129OooO0oo;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0o();
        }
        AppCompatImageButton appCompatImageButton = this.f3128OooO0oO;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            o000O0O0.OooO00o(this.f3128OooO0oO, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            OooO0o();
            if (!OooOOO0(this.f3128OooO0oO)) {
                OooO0O0(this.f3128OooO0oO, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f3128OooO0oO;
            if (appCompatImageButton != null && OooOOO0(appCompatImageButton)) {
                removeView(this.f3128OooO0oO);
                this.f3156Oooo00o.remove(this.f3128OooO0oO);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f3128OooO0oO;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f3126OooO0o;
            if (appCompatTextView != null && OooOOO0(appCompatTextView)) {
                removeView(this.f3126OooO0o);
                this.f3156Oooo00o.remove(this.f3126OooO0o);
            }
        } else {
            if (this.f3126OooO0o == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f3126OooO0o = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f3126OooO0o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3136OooOOOo;
                if (i != 0) {
                    this.f3126OooO0o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3150OooOooO;
                if (colorStateList != null) {
                    this.f3126OooO0o.setTextColor(colorStateList);
                }
            }
            if (!OooOOO0(this.f3126OooO0o)) {
                OooO0O0(this.f3126OooO0o, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f3126OooO0o;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f3149OooOoo0 = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f3150OooOooO = colorStateList;
        AppCompatTextView appCompatTextView = this.f3126OooO0o;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f3127OooO0o0;
            if (appCompatTextView != null && OooOOO0(appCompatTextView)) {
                removeView(this.f3127OooO0o0);
                this.f3156Oooo00o.remove(this.f3127OooO0o0);
            }
        } else {
            if (this.f3127OooO0o0 == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f3127OooO0o0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f3127OooO0o0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3135OooOOOO;
                if (i != 0) {
                    this.f3127OooO0o0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3148OooOoo;
                if (colorStateList != null) {
                    this.f3127OooO0o0.setTextColor(colorStateList);
                }
            }
            if (!OooOOO0(this.f3127OooO0o0)) {
                OooO0O0(this.f3127OooO0o0, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f3127OooO0o0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f3147OooOoOO = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f3148OooOoo = colorStateList;
        AppCompatTextView appCompatTextView = this.f3127OooO0o0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3145OooOoO = 8388627;
        this.f3155Oooo00O = new ArrayList<>();
        this.f3156Oooo00o = new ArrayList<>();
        this.f3153Oooo0 = new int[2];
        this.f3157Oooo0O0 = new androidx.core.view.o00oO0o(new o000O00(this, 0));
        this.f3158Oooo0OO = new ArrayList<>();
        this.f3159Oooo0o = new OooO00o();
        this.f3168OoooOOO = new OooO0O0();
        Context context2 = getContext();
        int[] iArr = p012OooOo0O.o00O0O.Toolbar;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context2, attributeSet, iArr, i);
        ViewCompat.OooOOO(this, context, iArr, attributeSet, o000oo0OooOOO0.f3324OooO0O0, i, 0);
        this.f3135OooOOOO = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.Toolbar_titleTextAppearance, 0);
        this.f3136OooOOOo = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.Toolbar_subtitleTextAppearance, 0);
        int i2 = p012OooOo0O.o00O0O.Toolbar_android_gravity;
        TypedArray typedArray = o000oo0OooOOO0.f3324OooO0O0;
        this.f3145OooOoO = typedArray.getInteger(i2, 8388627);
        this.f3138OooOOo0 = typedArray.getInteger(p012OooOo0O.o00O0O.Toolbar_buttonGravity, 48);
        int iOooO0OO = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_titleMargin, 0);
        int i3 = p012OooOo0O.o00O0O.Toolbar_titleMargins;
        iOooO0OO = o000oo0OooOOO0.OooOO0o(i3) ? o000oo0OooOOO0.OooO0OO(i3, iOooO0OO) : iOooO0OO;
        this.f3143OooOo0O = iOooO0OO;
        this.f3141OooOo0 = iOooO0OO;
        this.f3142OooOo00 = iOooO0OO;
        this.f3139OooOOoo = iOooO0OO;
        int iOooO0OO2 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_titleMarginStart, -1);
        if (iOooO0OO2 >= 0) {
            this.f3139OooOOoo = iOooO0OO2;
        }
        int iOooO0OO3 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_titleMarginEnd, -1);
        if (iOooO0OO3 >= 0) {
            this.f3142OooOo00 = iOooO0OO3;
        }
        int iOooO0OO4 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_titleMarginTop, -1);
        if (iOooO0OO4 >= 0) {
            this.f3141OooOo0 = iOooO0OO4;
        }
        int iOooO0OO5 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_titleMarginBottom, -1);
        if (iOooO0OO5 >= 0) {
            this.f3143OooOo0O = iOooO0OO5;
        }
        this.f3137OooOOo = o000oo0OooOOO0.OooO0Oo(p012OooOo0O.o00O0O.Toolbar_maxButtonHeight, -1);
        int iOooO0OO6 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iOooO0OO7 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iOooO0Oo = o000oo0OooOOO0.OooO0Oo(p012OooOo0O.o00O0O.Toolbar_contentInsetLeft, 0);
        int iOooO0Oo2 = o000oo0OooOOO0.OooO0Oo(p012OooOo0O.o00O0O.Toolbar_contentInsetRight, 0);
        if (this.f3144OooOo0o == null) {
            this.f3144OooOo0o = new o0000O00();
        }
        o0000O00 o0000o00 = this.f3144OooOo0o;
        o0000o00.f3246OooO0oo = false;
        if (iOooO0Oo != Integer.MIN_VALUE) {
            o0000o00.f3244OooO0o0 = iOooO0Oo;
            o0000o00.f3239OooO00o = iOooO0Oo;
        }
        if (iOooO0Oo2 != Integer.MIN_VALUE) {
            o0000o00.f3243OooO0o = iOooO0Oo2;
            o0000o00.f3240OooO0O0 = iOooO0Oo2;
        }
        if (iOooO0OO6 != Integer.MIN_VALUE || iOooO0OO7 != Integer.MIN_VALUE) {
            o0000o00.OooO00o(iOooO0OO6, iOooO0OO7);
        }
        this.f3140OooOo = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3146OooOoO0 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3124OooO = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.Toolbar_collapseIcon);
        this.f3130OooOO0 = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.Toolbar_collapseContentDescription);
        CharSequence charSequenceOooOO0O = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceOooOO0O)) {
            setTitle(charSequenceOooOO0O);
        }
        CharSequence charSequenceOooOO0O2 = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceOooOO0O2)) {
            setSubtitle(charSequenceOooOO0O2);
        }
        this.f3134OooOOO0 = getContext();
        setPopupTheme(o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.Toolbar_popupTheme, 0));
        Drawable drawableOooO0o0 = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.Toolbar_navigationIcon);
        if (drawableOooO0o0 != null) {
            setNavigationIcon(drawableOooO0o0);
        }
        CharSequence charSequenceOooOO0O3 = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceOooOO0O3)) {
            setNavigationContentDescription(charSequenceOooOO0O3);
        }
        Drawable drawableOooO0o1 = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.Toolbar_logo);
        if (drawableOooO0o1 != null) {
            setLogo(drawableOooO0o1);
        }
        CharSequence charSequenceOooOO0O4 = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceOooOO0O4)) {
            setLogoDescription(charSequenceOooOO0O4);
        }
        int i4 = p012OooOo0O.o00O0O.Toolbar_titleTextColor;
        if (o000oo0OooOOO0.OooOO0o(i4)) {
            setTitleTextColor(o000oo0OooOOO0.OooO0O0(i4));
        }
        int i5 = p012OooOo0O.o00O0O.Toolbar_subtitleTextColor;
        if (o000oo0OooOOO0.OooOO0o(i5)) {
            setSubtitleTextColor(o000oo0OooOOO0.OooO0O0(i5));
        }
        int i6 = p012OooOo0O.o00O0O.Toolbar_menu;
        if (o000oo0OooOOO0.OooOO0o(i6)) {
            OooOO0O(o000oo0OooOOO0.OooO(i6, 0));
        }
        o000oo0OooOOO0.OooOOO();
    }
}
