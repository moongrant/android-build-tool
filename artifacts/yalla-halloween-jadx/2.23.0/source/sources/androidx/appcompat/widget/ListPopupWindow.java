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
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements p018OooOoo0.Oooo000 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Method f2909OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final Method f2910OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final Method f2911Oooo000;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2912OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f2913OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000000O f2914OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ListAdapter f2915OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f2916OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2917OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f2918OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f2919OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f2920OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f2921OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f2922OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f2923OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f2924OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public View f2925OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO0o f2926OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2927OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0OO f2928OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooOO0O f2929OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2930OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0 f2931OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO f2932OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Rect f2933OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Handler f2934OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Rect f2935OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final PopupWindow f2936OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f2937OooOoo0;

    public class OooO implements AbsListView.OnScrollListener {
        public OooO() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if ((listPopupWindow.f2936OooOoo.getInputMethodMode() == 2) || listPopupWindow.f2936OooOoo.getContentView() == null) {
                    return;
                }
                Handler handler = listPopupWindow.f2934OooOoO0;
                OooOO0O oooOO0O = listPopupWindow.f2929OooOo0;
                handler.removeCallbacks(oooOO0O);
                oooOO0O.run();
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
            o000000O o000000o2 = ListPopupWindow.this.f2914OooO0o;
            if (o000000o2 != null) {
                o000000o2.setListSelectionHidden(true);
                o000000o2.requestLayout();
            }
        }
    }

    public class OooO0o extends DataSetObserver {
        public OooO0o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.OooO00o()) {
                listPopupWindow.show();
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
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (popupWindow = listPopupWindow.f2936OooOoo) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.f2936OooOoo.getWidth() && y >= 0 && y < listPopupWindow.f2936OooOoo.getHeight()) {
                listPopupWindow.f2934OooOoO0.postDelayed(listPopupWindow.f2929OooOo0, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.f2934OooOoO0.removeCallbacks(listPopupWindow.f2929OooOo0);
            return false;
        }
    }

    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            o000000O o000000o2 = listPopupWindow.f2914OooO0o;
            if (o000000o2 != null) {
                WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                if (!ViewCompat.OooOO0O.OooO0O0(o000000o2) || listPopupWindow.f2914OooO0o.getCount() <= listPopupWindow.f2914OooO0o.getChildCount() || listPopupWindow.f2914OooO0o.getChildCount() > listPopupWindow.f2924OooOOOo) {
                    return;
                }
                listPopupWindow.f2936OooOoo.setInputMethodMode(2);
                listPopupWindow.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2909OooOooO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2911Oooo000 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2910OooOooo = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, p012OooOo0O.OooOOO0.listPopupWindowStyle);
    }

    @Override // p018OooOoo0.Oooo000
    public final boolean OooO00o() {
        return this.f2936OooOoo.isShowing();
    }

    public final int OooO0O0() {
        return this.f2912OooO;
    }

    public final void OooO0Oo(int i) {
        this.f2912OooO = i;
    }

    @Nullable
    public final Drawable OooO0o() {
        return this.f2936OooOoo.getBackground();
    }

    public final void OooO0oo(int i) {
        this.f2918OooOO0 = i;
        this.f2920OooOO0o = true;
    }

    public final int OooOO0O() {
        if (this.f2920OooOO0o) {
            return this.f2918OooOO0;
        }
        return 0;
    }

    public void OooOO0o(@Nullable ListAdapter listAdapter) {
        OooO0o oooO0o = this.f2926OooOOo0;
        if (oooO0o == null) {
            this.f2926OooOOo0 = new OooO0o();
        } else {
            ListAdapter listAdapter2 = this.f2915OooO0o0;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(oooO0o);
            }
        }
        this.f2915OooO0o0 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2926OooOOo0);
        }
        o000000O o000000o2 = this.f2914OooO0o;
        if (o000000o2 != null) {
            o000000o2.setAdapter(this.f2915OooO0o0);
        }
    }

    @Override // p018OooOoo0.Oooo000
    @Nullable
    public final o000000O OooOOO() {
        return this.f2914OooO0o;
    }

    public final void OooOOOO(@Nullable Drawable drawable) {
        this.f2936OooOoo.setBackgroundDrawable(drawable);
    }

    @NonNull
    public o000000O OooOOOo(Context context, boolean z) {
        return new o000000O(context, z);
    }

    public final void OooOOo0(int i) {
        Drawable background = this.f2936OooOoo.getBackground();
        if (background == null) {
            this.f2917OooO0oo = i;
            return;
        }
        Rect rect = this.f2933OooOoO;
        background.getPadding(rect);
        this.f2917OooO0oo = rect.left + rect.right + i;
    }

    @Override // p018OooOoo0.Oooo000
    public final void dismiss() {
        PopupWindow popupWindow = this.f2936OooOoo;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f2914OooO0o = null;
        this.f2934OooOoO0.removeCallbacks(this.f2929OooOo0);
    }

    @Override // p018OooOoo0.Oooo000
    public final void show() {
        int i;
        int iOooO00o;
        int iMakeMeasureSpec;
        int paddingBottom;
        o000000O o000000o2;
        o000000O o000000o3 = this.f2914OooO0o;
        PopupWindow popupWindow = this.f2936OooOoo;
        Context context = this.f2913OooO0Oo;
        if (o000000o3 == null) {
            o000000O o000000oOooOOOo = OooOOOo(context, !this.f2937OooOoo0);
            this.f2914OooO0o = o000000oOooOOOo;
            o000000oOooOOOo.setAdapter(this.f2915OooO0o0);
            this.f2914OooO0o.setOnItemClickListener(this.f2927OooOOoo);
            this.f2914OooO0o.setFocusable(true);
            this.f2914OooO0o.setFocusableInTouchMode(true);
            this.f2914OooO0o.setOnItemSelectedListener(new o00000O(this));
            this.f2914OooO0o.setOnScrollListener(this.f2932OooOo0o);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2930OooOo00;
            if (onItemSelectedListener != null) {
                this.f2914OooO0o.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f2914OooO0o);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f2933OooOoO;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f2920OooOO0o) {
                this.f2918OooOO0 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        View view = this.f2925OooOOo;
        int i3 = this.f2918OooOO0;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2910OooOooo;
            if (method != null) {
                try {
                    iOooO00o = ((Integer) method.invoke(popupWindow, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iOooO00o = popupWindow.getMaxAvailableHeight(view, i3);
                }
            } else {
                iOooO00o = popupWindow.getMaxAvailableHeight(view, i3);
            }
        } else {
            iOooO00o = OooO00o.OooO00o(popupWindow, view, i3, z);
        }
        int i4 = this.f2916OooO0oO;
        if (i4 == -1) {
            paddingBottom = iOooO00o + i;
        } else {
            int i5 = this.f2917OooO0oo;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, Pow2.MAX_POW2) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Pow2.MAX_POW2);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iOooO00o2 = this.f2914OooO0o.OooO00o(iMakeMeasureSpec, iOooO00o + 0);
            paddingBottom = iOooO00o2 + (iOooO00o2 > 0 ? this.f2914OooO0o.getPaddingBottom() + this.f2914OooO0o.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        androidx.core.widget.OooOOOO.OooO0Oo(popupWindow, this.f2919OooOO0O);
        if (popupWindow.isShowing()) {
            View view2 = this.f2925OooOOo;
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view2)) {
                int width = this.f2917OooO0oo;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2925OooOOo.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f2917OooO0oo == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f2917OooO0oo == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view3 = this.f2925OooOOo;
                int i6 = this.f2912OooO;
                int i7 = this.f2918OooOO0;
                if (width < 0) {
                    width = -1;
                }
                popupWindow.update(view3, i6, i7, width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f2917OooO0oo;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2925OooOOo.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2909OooOooO;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            OooO0O0.OooO0O0(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f2931OooOo0O);
        if (this.f2921OooOOO) {
            androidx.core.widget.OooOOOO.OooO0OO(popupWindow, this.f2922OooOOO0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2911Oooo000;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.f2935OooOoOO);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            OooO0O0.OooO00o(popupWindow, this.f2935OooOoOO);
        }
        androidx.core.widget.OooOOO.OooO00o(popupWindow, this.f2925OooOOo, this.f2912OooO, this.f2918OooOO0, this.f2923OooOOOO);
        this.f2914OooO0o.setSelection(-1);
        if ((!this.f2937OooOoo0 || this.f2914OooO0o.isInTouchMode()) && (o000000o2 = this.f2914OooO0o) != null) {
            o000000o2.setListSelectionHidden(true);
            o000000o2.requestLayout();
        }
        if (this.f2937OooOoo0) {
            return;
        }
        this.f2934OooOoO0.post(this.f2928OooOo);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f2916OooO0oO = -2;
        this.f2917OooO0oo = -2;
        this.f2919OooOO0O = 1002;
        this.f2923OooOOOO = 0;
        this.f2924OooOOOo = Integer.MAX_VALUE;
        this.f2929OooOo0 = new OooOO0O();
        this.f2931OooOo0O = new OooOO0();
        this.f2932OooOo0o = new OooO();
        this.f2928OooOo = new OooO0OO();
        this.f2933OooOoO = new Rect();
        this.f2913OooO0Oo = context;
        this.f2934OooOoO0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.ListPopupWindow, i, i2);
        this.f2912OooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p012OooOo0O.o00O0O.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p012OooOo0O.o00O0O.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f2918OooOO0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2920OooOO0o = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f2936OooOoo = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
