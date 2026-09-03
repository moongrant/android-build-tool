package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements p015OooOoO.o00Oo0 {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static Method f5017o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static Method f5018o00Oo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static Method f5019ooOO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f5020Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f5021Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ListAdapter f5022Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0OOO0o f5023Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f5024OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f5025OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5026OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f5027OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f5028OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f5029OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f5030OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f5031OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public OooO0o f5032OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public View f5033OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public AdapterView.OnItemClickListener f5034Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooOO0O f5035Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final OooOO0 f5036OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final OooO f5037OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final OooO0OO f5038OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final Rect f5039Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final Handler f5040Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Rect f5041OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f5042Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f5043o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public PopupWindow f5044o0OoOo0;

    public class OooO implements AbsListView.OnScrollListener {
        public OooO() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                if ((ListPopupWindow.this.f5044o0OoOo0.getInputMethodMode() == 2) || ListPopupWindow.this.f5044o0OoOo0.getContentView() == null) {
                    return;
                }
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f5040Oooooo0.removeCallbacks(listPopupWindow.f5035Ooooo0o);
                ListPopupWindow.this.f5035Ooooo0o.run();
            }
        }
    }

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static int OooO00o(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    @RequiresApi(29)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void OooO0O0(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO0o o0ooo0o2 = ListPopupWindow.this.f5023Oooo0oo;
            if (o0ooo0o2 != null) {
                o0ooo0o2.setListSelectionHidden(true);
                o0ooo0o2.requestLayout();
            }
        }
    }

    public class OooO0o extends DataSetObserver {
        public OooO0o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (ListPopupWindow.this.OooO0O0()) {
                ListPopupWindow.this.OooO00o();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class OooOO0 implements View.OnTouchListener {
        public OooOO0() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f5044o0OoOo0) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f5044o0OoOo0.getWidth() && y >= 0 && y < ListPopupWindow.this.f5044o0OoOo0.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f5040Oooooo0.postDelayed(listPopupWindow.f5035Ooooo0o, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.f5040Oooooo0.removeCallbacks(listPopupWindow2.f5035Ooooo0o);
            return false;
        }
    }

    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO0o o0ooo0o2 = ListPopupWindow.this.f5023Oooo0oo;
            if (o0ooo0o2 != null) {
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (!ViewCompat.OooOO0O.OooO0O0(o0ooo0o2) || ListPopupWindow.this.f5023Oooo0oo.getCount() <= ListPopupWindow.this.f5023Oooo0oo.getChildCount()) {
                    return;
                }
                int childCount = ListPopupWindow.this.f5023Oooo0oo.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f5031OoooOo0) {
                    listPopupWindow.f5044o0OoOo0.setInputMethodMode(2);
                    ListPopupWindow.this.OooO00o();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f5019ooOO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f5018o00Oo0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f5017o00O0O = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.listPopupWindowStyle);
    }

    @Override // p015OooOoO.o00Oo0
    public final void OooO00o() {
        int i;
        int iOooO00o;
        int iMakeMeasureSpec;
        int paddingBottom;
        o0OOO0o o0ooo0o2;
        if (this.f5023Oooo0oo == null) {
            o0OOO0o o0ooo0oOooOOo0 = OooOOo0(this.f5021Oooo0o, !this.f5042Ooooooo);
            this.f5023Oooo0oo = o0ooo0oOooOOo0;
            o0ooo0oOooOOo0.setAdapter(this.f5022Oooo0oO);
            this.f5023Oooo0oo.setOnItemClickListener(this.f5034Ooooo00);
            this.f5023Oooo0oo.setFocusable(true);
            this.f5023Oooo0oo.setFocusableInTouchMode(true);
            this.f5023Oooo0oo.setOnItemSelectedListener(new oo0o0Oo(this));
            this.f5023Oooo0oo.setOnScrollListener(this.f5037OooooOO);
            this.f5044o0OoOo0.setContentView(this.f5023Oooo0oo);
        }
        Drawable background = this.f5044o0OoOo0.getBackground();
        if (background != null) {
            background.getPadding(this.f5039Oooooo);
            Rect rect = this.f5039Oooooo;
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f5028OoooOO0) {
                this.f5027OoooO0O = -i2;
            }
        } else {
            this.f5039Oooooo.setEmpty();
            i = 0;
        }
        boolean z = this.f5044o0OoOo0.getInputMethodMode() == 2;
        View view = this.f5033OoooOoo;
        int i3 = this.f5027OoooO0O;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f5017o00O0O;
            if (method != null) {
                try {
                    iOooO00o = ((Integer) method.invoke(this.f5044o0OoOo0, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iOooO00o = this.f5044o0OoOo0.getMaxAvailableHeight(view, i3);
                }
            } else {
                iOooO00o = this.f5044o0OoOo0.getMaxAvailableHeight(view, i3);
            }
        } else {
            iOooO00o = OooO00o.OooO00o(this.f5044o0OoOo0, view, i3, z);
        }
        if (this.f5020Oooo == -1) {
            paddingBottom = iOooO00o + i;
        } else {
            int i4 = this.f5026OoooO00;
            if (i4 == -2) {
                int i5 = this.f5021Oooo0o.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f5039Oooooo;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i4 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else {
                int i6 = this.f5021Oooo0o.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f5039Oooooo;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect3.left + rect3.right), 1073741824);
            }
            int iOooO00o2 = this.f5023Oooo0oo.OooO00o(iMakeMeasureSpec, iOooO00o + 0);
            paddingBottom = iOooO00o2 + (iOooO00o2 > 0 ? this.f5023Oooo0oo.getPaddingBottom() + this.f5023Oooo0oo.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f5044o0OoOo0.getInputMethodMode() == 2;
        androidx.core.widget.OooOOOO.OooO0O0(this.f5044o0OoOo0, this.f5024OoooO);
        if (this.f5044o0OoOo0.isShowing()) {
            View view2 = this.f5033OoooOoo;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view2)) {
                int width = this.f5026OoooO00;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f5033OoooOoo.getWidth();
                }
                int i7 = this.f5020Oooo;
                if (i7 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f5044o0OoOo0.setWidth(this.f5026OoooO00 == -1 ? -1 : 0);
                        this.f5044o0OoOo0.setHeight(0);
                    } else {
                        this.f5044o0OoOo0.setWidth(this.f5026OoooO00 == -1 ? -1 : 0);
                        this.f5044o0OoOo0.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    paddingBottom = i7;
                }
                this.f5044o0OoOo0.setOutsideTouchable(true);
                this.f5044o0OoOo0.update(this.f5033OoooOoo, this.f5025OoooO0, this.f5027OoooO0O, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f5026OoooO00;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f5033OoooOoo.getWidth();
        }
        int i8 = this.f5020Oooo;
        if (i8 == -1) {
            paddingBottom = -1;
        } else if (i8 != -2) {
            paddingBottom = i8;
        }
        this.f5044o0OoOo0.setWidth(width2);
        this.f5044o0OoOo0.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f5019ooOO;
            if (method2 != null) {
                try {
                    method2.invoke(this.f5044o0OoOo0, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            OooO0O0.OooO0O0(this.f5044o0OoOo0, true);
        }
        this.f5044o0OoOo0.setOutsideTouchable(true);
        this.f5044o0OoOo0.setTouchInterceptor(this.f5036OooooO0);
        if (this.f5029OoooOOO) {
            androidx.core.widget.OooOOOO.OooO00o(this.f5044o0OoOo0, this.f5043o000oOoO);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f5018o00Oo0;
            if (method3 != null) {
                try {
                    method3.invoke(this.f5044o0OoOo0, this.f5041OoooooO);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            OooO0O0.OooO00o(this.f5044o0OoOo0, this.f5041OoooooO);
        }
        androidx.core.widget.OooOOOO.OooO00o.OooO00o(this.f5044o0OoOo0, this.f5033OoooOoo, this.f5025OoooO0, this.f5027OoooO0O, this.f5030OoooOOo);
        this.f5023Oooo0oo.setSelection(-1);
        if ((!this.f5042Ooooooo || this.f5023Oooo0oo.isInTouchMode()) && (o0ooo0o2 = this.f5023Oooo0oo) != null) {
            o0ooo0o2.setListSelectionHidden(true);
            o0ooo0o2.requestLayout();
        }
        if (this.f5042Ooooooo) {
            return;
        }
        this.f5040Oooooo0.post(this.f5038OooooOo);
    }

    @Override // p015OooOoO.o00Oo0
    public final boolean OooO0O0() {
        return this.f5044o0OoOo0.isShowing();
    }

    public final int OooO0OO() {
        return this.f5025OoooO0;
    }

    public final void OooO0o0(int i) {
        this.f5025OoooO0 = i;
    }

    @Nullable
    public final Drawable OooO0oo() {
        return this.f5044o0OoOo0.getBackground();
    }

    @Override // p015OooOoO.o00Oo0
    @Nullable
    public final ListView OooOO0() {
        return this.f5023Oooo0oo;
    }

    public final void OooOO0O(@Nullable Drawable drawable) {
        this.f5044o0OoOo0.setBackgroundDrawable(drawable);
    }

    public final void OooOO0o(int i) {
        this.f5027OoooO0O = i;
        this.f5028OoooOO0 = true;
    }

    public final int OooOOOO() {
        if (this.f5028OoooOO0) {
            return this.f5027OoooO0O;
        }
        return 0;
    }

    public void OooOOOo(@Nullable ListAdapter listAdapter) {
        OooO0o oooO0o = this.f5032OoooOoO;
        if (oooO0o == null) {
            this.f5032OoooOoO = new OooO0o();
        } else {
            ListAdapter listAdapter2 = this.f5022Oooo0oO;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(oooO0o);
            }
        }
        this.f5022Oooo0oO = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5032OoooOoO);
        }
        o0OOO0o o0ooo0o2 = this.f5023Oooo0oo;
        if (o0ooo0o2 != null) {
            o0ooo0o2.setAdapter(this.f5022Oooo0oO);
        }
    }

    public final void OooOOo(int i) {
        Drawable background = this.f5044o0OoOo0.getBackground();
        if (background == null) {
            this.f5026OoooO00 = i;
            return;
        }
        background.getPadding(this.f5039Oooooo);
        Rect rect = this.f5039Oooooo;
        this.f5026OoooO00 = rect.left + rect.right + i;
    }

    @NonNull
    public o0OOO0o OooOOo0(Context context, boolean z) {
        return new o0OOO0o(context, z);
    }

    public final void OooOOoo() {
        this.f5044o0OoOo0.setInputMethodMode(2);
    }

    public final void OooOo0(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f5044o0OoOo0.setOnDismissListener(onDismissListener);
    }

    public final void OooOo00() {
        this.f5042Ooooooo = true;
        this.f5044o0OoOo0.setFocusable(true);
    }

    @Override // p015OooOoO.o00Oo0
    public final void dismiss() {
        this.f5044o0OoOo0.dismiss();
        this.f5044o0OoOo0.setContentView(null);
        this.f5023Oooo0oo = null;
        this.f5040Oooooo0.removeCallbacks(this.f5035Ooooo0o);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f5020Oooo = -2;
        this.f5026OoooO00 = -2;
        this.f5024OoooO = 1002;
        this.f5030OoooOOo = 0;
        this.f5031OoooOo0 = Integer.MAX_VALUE;
        this.f5035Ooooo0o = new OooOO0O();
        this.f5036OooooO0 = new OooOO0();
        this.f5037OooooOO = new OooO();
        this.f5038OooooOo = new OooO0OO();
        this.f5039Oooooo = new Rect();
        this.f5021Oooo0o = context;
        this.f5040Oooooo0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.ListPopupWindow, i, i2);
        this.f5025OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(OooOo00.OooOOOO.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(OooOo00.OooOOOO.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f5027OoooO0O = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5028OoooOO0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f5044o0OoOo0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
