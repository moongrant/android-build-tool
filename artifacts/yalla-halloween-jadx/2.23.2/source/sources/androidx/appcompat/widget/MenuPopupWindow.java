package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MenuPopupWindow extends ListPopupWindow implements o00000OO {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final Method f2941Oooo00o;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public o00000OO f2942Oooo00O;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends o000000O {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final int f2943OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public o00000OO f2944OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final int f2945OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0O f2946OooOOoo;

        @RequiresApi(17)
        public static class OooO00o {
            @DoNotInline
            public static int OooO00o(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == OooO00o.OooO00o(context.getResources().getConfiguration())) {
                this.f2943OooOOOo = 21;
                this.f2945OooOOo0 = 22;
            } else {
                this.f2943OooOOOo = 22;
                this.f2945OooOOo0 = 21;
            }
        }

        @Override // androidx.appcompat.widget.o000000O, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.OooO0o oooO0o;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f2944OooOOo != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    oooO0o = (androidx.appcompat.view.menu.OooO0o) headerViewListAdapter.getWrappedAdapter();
                } else {
                    oooO0o = (androidx.appcompat.view.menu.OooO0o) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.OooOO0O item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= oooO0o.getCount()) ? null : oooO0o.getItem(i);
                androidx.appcompat.view.menu.OooOO0O oooOO0O = this.f2946OooOOoo;
                if (oooOO0O != item) {
                    androidx.appcompat.view.menu.OooO oooO = oooO0o.f2616OooO0Oo;
                    if (oooOO0O != null) {
                        this.f2944OooOOo.OooOOO0(oooO, oooOO0O);
                    }
                    this.f2946OooOOoo = item;
                    if (item != null) {
                        this.f2944OooOOo.OooO0OO(oooO, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2943OooOOOo) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f2945OooOOo0) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.OooO0o) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.OooO0o) adapter).f2616OooO0Oo.OooO0OO(false);
            return true;
        }

        public void setHoverListener(o00000OO o00000oo2) {
            this.f2944OooOOo = o00000oo2;
        }

        @Override // androidx.appcompat.widget.o000000O, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @RequiresApi(23)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @DoNotInline
        public static void OooO0O0(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi(29)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2941Oooo00o = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@NonNull Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.o00000OO
    public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull androidx.appcompat.view.menu.OooOO0O oooOO0O) {
        o00000OO o00000oo2 = this.f2942Oooo00O;
        if (o00000oo2 != null) {
            o00000oo2.OooO0OO(oooO, oooOO0O);
        }
    }

    @Override // androidx.appcompat.widget.o00000OO
    public final void OooOOO0(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
        o00000OO o00000oo2 = this.f2942Oooo00O;
        if (o00000oo2 != null) {
            o00000oo2.OooOOO0(oooO, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    public final o000000O OooOOOo(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
