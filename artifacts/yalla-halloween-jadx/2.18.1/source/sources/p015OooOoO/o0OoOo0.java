package p015OooOoO;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.OooO0OO;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOO0;
import androidx.appcompat.view.menu.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OoOo0 implements o00Oo0, OooOOO0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Rect f297Oooo0o;

    public static int OooOOOO(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean OooOo0o(OooO0o oooO0o) {
        int size = oooO0o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = oooO0o.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0oO(OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(@NonNull Context context, @Nullable OooO0o oooO0o) {
    }

    public abstract void OooOOO(OooO0o oooO0o);

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOOO0(OooOO0 oooOO1) {
        return false;
    }

    public abstract void OooOOOo(View view);

    public abstract void OooOOo(int i);

    public abstract void OooOOo0(boolean z);

    public abstract void OooOOoo(int i);

    public abstract void OooOo0(boolean z);

    public abstract void OooOo00(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooOo0O(int i);

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (OooO0OO) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (OooO0OO) listAdapter).f4699Oooo0o.OooOo00((MenuItem) listAdapter.getItem(i), this, (this instanceof CascadingMenuPopup) ^ true ? 0 : 4);
    }
}
