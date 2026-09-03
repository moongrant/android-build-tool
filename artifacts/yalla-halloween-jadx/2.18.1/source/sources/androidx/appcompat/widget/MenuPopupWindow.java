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
public final class MenuPopupWindow extends ListPopupWindow implements o0O0O00 {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static Method f5050o00o0O;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public o0O0O00 f5051o00Ooo;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends o0OOO0o {

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final int f5052OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final int f5053OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public o0O0O00 f5054Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooOO0 f5055Ooooo0o;

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
                this.f5052OoooOoO = 21;
                this.f5053OoooOoo = 22;
            } else {
                this.f5052OoooOoO = 22;
                this.f5053OoooOoo = 21;
            }
        }

        @Override // androidx.appcompat.widget.o0OOO0o, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            androidx.appcompat.view.menu.OooO0OO oooO0OO;
            int iPointToPosition;
            int i;
            if (this.f5054Ooooo00 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    oooO0OO = (androidx.appcompat.view.menu.OooO0OO) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    oooO0OO = (androidx.appcompat.view.menu.OooO0OO) adapter;
                }
                androidx.appcompat.view.menu.OooOO0 item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < oooO0OO.getCount()) {
                    item = oooO0OO.getItem(i);
                }
                androidx.appcompat.view.menu.OooOO0 oooOO1 = this.f5055Ooooo0o;
                if (oooOO1 != item) {
                    androidx.appcompat.view.menu.OooO0o oooO0o = oooO0OO.f4699Oooo0o;
                    if (oooOO1 != null) {
                        this.f5054Ooooo00.OooO0oO(oooO0o, oooOO1);
                    }
                    this.f5055Ooooo0o = item;
                    if (item != null) {
                        this.f5054Ooooo00.OooO0Oo(oooO0o, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f5052OoooOoO) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f5053OoooOoo) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.OooO0OO) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.OooO0OO) adapter).f4699Oooo0o.OooO0Oo(false);
            return true;
        }

        public void setHoverListener(o0O0O00 o0o0o00) {
            this.f5054Ooooo00 = o0o0o00;
        }

        @Override // androidx.appcompat.widget.o0OOO0o, android.widget.AbsListView
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
                f5050o00o0O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@NonNull Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.o0O0O00
    public final void OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
        o0O0O00 o0o0o00 = this.f5051o00Ooo;
        if (o0o0o00 != null) {
            o0o0o00.OooO0Oo(oooO0o, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.o0O0O00
    public final void OooO0oO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
        o0O0O00 o0o0o00 = this.f5051o00Ooo;
        if (o0o0o00 != null) {
            o0o0o00.OooO0oO(oooO0o, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    public final o0OOO0o OooOOo0(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
