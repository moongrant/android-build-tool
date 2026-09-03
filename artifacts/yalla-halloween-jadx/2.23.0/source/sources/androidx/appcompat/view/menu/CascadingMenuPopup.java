package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.o000000O;
import androidx.appcompat.widget.o00000OO;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p012OooOo0O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class CascadingMenuPopup extends p018OooOoo0.OooOo00 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f2518OooOooo = Oooo0.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f2519OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f2520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f2521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f2522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2523OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Handler f2524OooOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public View f2531OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public View f2533OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f2534OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2535OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f2536OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2537OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f2538OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f2539OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOOO.OooO00o f2541OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2542OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ViewTreeObserver f2543OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f2544OooOooO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f2525OooOO0O = new ArrayList();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f2526OooOO0o = new ArrayList();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO00o f2528OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO0O0 f2527OooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO0OO f2529OooOOOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f2530OooOOOo = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f2532OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f2540OooOoO0 = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.OooO00o()) {
                ArrayList arrayList = cascadingMenuPopup.f2526OooOO0o;
                if (arrayList.size() <= 0 || ((OooO0o) arrayList.get(0)).f2548OooO00o.f2937OooOoo0) {
                    return;
                }
                View view = cascadingMenuPopup.f2533OooOOoo;
                if (view == null || !view.isShown()) {
                    cascadingMenuPopup.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OooO0o) it.next()).f2548OooO00o.show();
                }
            }
        }
    }

    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.f2543OooOoo0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.f2543OooOoo0 = view.getViewTreeObserver();
                }
                cascadingMenuPopup.f2543OooOoo0.removeGlobalOnLayoutListener(cascadingMenuPopup.f2528OooOOO0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class OooO0OO implements o00000OO {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.widget.o00000OO
        public final void OooO0OO(@NonNull OooO oooO, @NonNull OooOO0O oooOO0O) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.f2524OooOO0.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.f2526OooOO0o;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (oooO == ((OooO0o) arrayList.get(i)).f2549OooO0O0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            cascadingMenuPopup.f2524OooOO0.postAtTime(new androidx.appcompat.view.menu.OooO0O0(this, i2 < arrayList.size() ? (OooO0o) arrayList.get(i2) : null, oooOO0O, oooO), oooO, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o00000OO
        public final void OooOOO0(@NonNull OooO oooO, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f2524OooOO0.removeCallbacksAndMessages(oooO);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MenuPopupWindow f2548OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO f2549OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f2550OooO0OO;

        public OooO0o(@NonNull MenuPopupWindow menuPopupWindow, @NonNull OooO oooO, int i) {
            this.f2548OooO00o = menuPopupWindow;
            this.f2549OooO0O0 = oooO;
            this.f2550OooO0OO = i;
        }
    }

    public CascadingMenuPopup(@AttrRes int i, @StyleRes int i2, @NonNull Context context, @NonNull View view, boolean z) {
        this.f2521OooO0o0 = context;
        this.f2531OooOOo = view;
        this.f2522OooO0oO = i;
        this.f2523OooO0oo = i2;
        this.f2519OooO = z;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        this.f2536OooOo00 = ViewCompat.OooO.OooO0Oo(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2520OooO0o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_config_prefDialogWidth));
        this.f2524OooOO0 = new Handler();
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        Iterator it = this.f2526OooOO0o.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((OooO0o) it.next()).f2548OooO00o.f2914OooO0o.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.OooO0o) adapter).notifyDataSetChanged();
        }
    }

    @Override // p018OooOoo0.Oooo000
    public final boolean OooO00o() {
        ArrayList arrayList = this.f2526OooOO0o;
        return arrayList.size() > 0 && ((OooO0o) arrayList.get(0)).f2548OooO00o.OooO00o();
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(OooO oooO, boolean z) {
        ArrayList arrayList = this.f2526OooOO0o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (oooO == ((OooO0o) arrayList.get(i)).f2549OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((OooO0o) arrayList.get(i2)).f2549OooO0O0.OooO0OO(false);
        }
        OooO0o oooO0o = (OooO0o) arrayList.remove(i);
        oooO0o.f2549OooO0O0.OooOOo(this);
        boolean z2 = this.f2544OooOooO;
        MenuPopupWindow menuPopupWindow = oooO0o.f2548OooO00o;
        if (z2) {
            MenuPopupWindow.OooO00o.OooO0O0(menuPopupWindow.f2936OooOoo, null);
            menuPopupWindow.f2936OooOoo.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2536OooOo00 = ((OooO0o) arrayList.get(size2 - 1)).f2550OooO0OO;
        } else {
            View view = this.f2531OooOOo;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            this.f2536OooOo00 = ViewCompat.OooO.OooO0Oo(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((OooO0o) arrayList.get(0)).f2549OooO0O0.OooO0OO(false);
                return;
            }
            return;
        }
        dismiss();
        OooOOO.OooO00o oooO00o = this.f2541OooOoOO;
        if (oooO00o != null) {
            oooO00o.OooO0O0(oooO, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2543OooOoo0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2543OooOoo0.removeGlobalOnLayoutListener(this.f2528OooOOO0);
            }
            this.f2543OooOoo0 = null;
        }
        this.f2533OooOOoo.removeOnAttachStateChangeListener(this.f2527OooOOO);
        this.f2542OooOoo.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0OO(OooOOO.OooO00o oooO00o) {
        this.f2541OooOoOO = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(OooOo oooOo) {
        for (OooO0o oooO0o : this.f2526OooOO0o) {
            if (oooOo == oooO0o.f2549OooO0O0) {
                oooO0o.f2548OooO00o.f2914OooO0o.requestFocus();
                return true;
            }
        }
        if (!oooOo.hasVisibleItems()) {
            return false;
        }
        OooOO0o(oooOo);
        OooOOO.OooO00o oooO00o = this.f2541OooOoOO;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooOo);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final Parcelable OooO0oO() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOO0o(OooO oooO) {
        oooO.OooO0O0(this, this.f2521OooO0o0);
        if (OooO00o()) {
            OooOo0o(oooO);
        } else {
            this.f2525OooOO0O.add(oooO);
        }
    }

    @Override // p018OooOoo0.Oooo000
    public final o000000O OooOOO() {
        ArrayList arrayList = this.f2526OooOO0o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((OooO0o) arrayList.get(arrayList.size() - 1)).f2548OooO00o.f2914OooO0o;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOOO(@NonNull View view) {
        if (this.f2531OooOOo != view) {
            this.f2531OooOOo = view;
            int i = this.f2530OooOOOo;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            this.f2532OooOOo0 = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        }
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOOo(boolean z) {
        this.f2540OooOoO0 = z;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOo(int i) {
        this.f2535OooOo0 = true;
        this.f2538OooOo0o = i;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOo0(int i) {
        if (this.f2530OooOOOo != i) {
            this.f2530OooOOOo = i;
            View view = this.f2531OooOOo;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            this.f2532OooOOo0 = Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view));
        }
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOoo(PopupWindow.OnDismissListener onDismissListener) {
        this.f2542OooOoo = onDismissListener;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOo0(int i) {
        this.f2537OooOo0O = true;
        this.f2534OooOo = i;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOo00(boolean z) {
        this.f2539OooOoO = z;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    public final void OooOo0o(@NonNull OooO oooO) {
        View childAt;
        OooO0o oooO0o;
        int i;
        char c;
        int i2;
        int i3;
        int width;
        MenuItem item;
        androidx.appcompat.view.menu.OooO0o oooO0o2;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f2521OooO0o0;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        androidx.appcompat.view.menu.OooO0o oooO0o3 = new androidx.appcompat.view.menu.OooO0o(oooO, layoutInflaterFrom, this.f2519OooO, f2518OooOooo);
        if (!OooO00o() && this.f2540OooOoO0) {
            oooO0o3.f2619OooO0o = true;
        } else if (OooO00o()) {
            oooO0o3.f2619OooO0o = p018OooOoo0.OooOo00.OooOo0O(oooO);
        }
        int iOooOOO0 = p018OooOoo0.OooOo00.OooOOO0(oooO0o3, context, this.f2520OooO0o);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(context, this.f2522OooO0oO, this.f2523OooO0oo);
        menuPopupWindow.f2944Oooo00O = this.f2529OooOOOO;
        menuPopupWindow.f2927OooOOoo = this;
        PopupWindow popupWindow = menuPopupWindow.f2936OooOoo;
        popupWindow.setOnDismissListener(this);
        menuPopupWindow.f2925OooOOo = this.f2531OooOOo;
        menuPopupWindow.f2923OooOOOO = this.f2532OooOOo0;
        menuPopupWindow.f2937OooOoo0 = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        menuPopupWindow.OooOO0o(oooO0o3);
        menuPopupWindow.OooOOo0(iOooOOO0);
        menuPopupWindow.f2923OooOOOO = this.f2532OooOOo0;
        ArrayList arrayList = this.f2526OooOO0o;
        if (arrayList.size() > 0) {
            oooO0o = (OooO0o) p018OooOoo0.OooOOO.OooO0O0(arrayList, 1);
            OooO oooO2 = oooO0o.f2549OooO0O0;
            int size = oooO2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = oooO2.getItem(i4);
                if (item.hasSubMenu() && oooO == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                o000000O o000000o2 = oooO0o.f2548OooO00o.f2914OooO0o;
                ListAdapter adapter = o000000o2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    oooO0o2 = (androidx.appcompat.view.menu.OooO0o) headerViewListAdapter.getWrappedAdapter();
                } else {
                    oooO0o2 = (androidx.appcompat.view.menu.OooO0o) adapter;
                    headersCount = 0;
                }
                int count = oooO0o2.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == oooO0o2.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - o000000o2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o000000o2.getChildCount()) {
                    childAt = o000000o2.getChildAt(firstVisiblePosition);
                } else {
                    childAt = null;
                }
            }
        } else {
            childAt = null;
            oooO0o = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = MenuPopupWindow.f2943Oooo00o;
                if (method != null) {
                    try {
                        method.invoke(popupWindow, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                MenuPopupWindow.OooO0O0.OooO00o(popupWindow, false);
            }
            MenuPopupWindow.OooO00o.OooO00o(popupWindow, null);
            o000000O o000000o3 = ((OooO0o) arrayList.get(arrayList.size() - 1)).f2548OooO00o.f2914OooO0o;
            int[] iArr = new int[2];
            o000000o3.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f2533OooOOoo.getWindowVisibleDisplayFrame(rect);
            if (this.f2536OooOo00 == 1) {
                i = 0;
                if (o000000o3.getWidth() + iArr[0] + iOooOOO0 <= rect.right) {
                    i = 1;
                }
            } else if (iArr[0] - iOooOOO0 < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z = i == 1;
            this.f2536OooOo00 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindow.f2925OooOOo = childAt;
                i2 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f2531OooOOo.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f2532OooOOo0 & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.f2531OooOOo.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                int i6 = iArr3[c] - iArr2[c];
                i2 = iArr3[1] - iArr2[1];
                i3 = i6;
            }
            if ((this.f2532OooOOo0 & 5) != 5) {
                width = z ? i3 + childAt.getWidth() : i3 - iOooOOO0;
            } else if (z) {
                width = i3 + iOooOOO0;
            } else {
                iOooOOO0 = childAt.getWidth();
            }
            menuPopupWindow.f2912OooO = width;
            menuPopupWindow.f2921OooOOO = true;
            menuPopupWindow.f2922OooOOO0 = true;
            menuPopupWindow.OooO0oo(i2);
        } else {
            if (this.f2535OooOo0) {
                menuPopupWindow.f2912OooO = this.f2538OooOo0o;
            }
            if (this.f2537OooOo0O) {
                menuPopupWindow.OooO0oo(this.f2534OooOo);
            }
            Rect rect2 = this.f388OooO0Oo;
            menuPopupWindow.f2935OooOoOO = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new OooO0o(menuPopupWindow, oooO, this.f2536OooOo00));
        menuPopupWindow.show();
        o000000O o000000o4 = menuPopupWindow.f2914OooO0o;
        o000000o4.setOnKeyListener(this);
        if (oooO0o == null && this.f2539OooOoO && oooO.f2584OooOOO0 != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(Oooo0.abc_popup_menu_header_item_layout, (ViewGroup) o000000o4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(oooO.f2584OooOOO0);
            o000000o4.addHeaderView(frameLayout, null, false);
            menuPopupWindow.show();
        }
    }

    @Override // p018OooOoo0.Oooo000
    public final void dismiss() {
        ArrayList arrayList = this.f2526OooOO0o;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        OooO0o[] oooO0oArr = (OooO0o[]) arrayList.toArray(new OooO0o[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooO0o oooO0o = oooO0oArr[size];
            if (oooO0o.f2548OooO00o.OooO00o()) {
                oooO0o.f2548OooO00o.dismiss();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        OooO0o oooO0o;
        ArrayList arrayList = this.f2526OooOO0o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                oooO0o = null;
                break;
            }
            oooO0o = (OooO0o) arrayList.get(i);
            if (!oooO0o.f2548OooO00o.OooO00o()) {
                break;
            } else {
                i++;
            }
        }
        if (oooO0o != null) {
            oooO0o.f2549OooO0O0.OooO0OO(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p018OooOoo0.Oooo000
    public final void show() {
        if (OooO00o()) {
            return;
        }
        ArrayList arrayList = this.f2525OooOO0O;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOo0o((OooO) it.next());
        }
        arrayList.clear();
        View view = this.f2531OooOOo;
        this.f2533OooOOoo = view;
        if (view != null) {
            boolean z = this.f2543OooOoo0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2543OooOoo0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2528OooOOO0);
            }
            this.f2533OooOOoo.addOnAttachStateChangeListener(this.f2527OooOOO);
        }
    }
}
