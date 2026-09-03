package p018OooOoo0;

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
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooO0o;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo00 implements Oooo000, OooOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Rect f388OooO0Oo;

    public static int OooOOO0(OooO0o oooO0o, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = oooO0o.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = oooO0o.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = oooO0o.getView(i4, view, frameLayout);
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

    public static boolean OooOo0O(OooO oooO) {
        int size = oooO.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = oooO.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0Oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooOO0O(@NonNull Context context, @Nullable OooO oooO) {
    }

    public abstract void OooOO0o(OooO oooO);

    public abstract void OooOOOO(View view);

    public abstract void OooOOOo(boolean z);

    public abstract void OooOOo(int i);

    public abstract void OooOOo0(int i);

    public abstract void OooOOoo(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooOo0(int i);

    public abstract void OooOo00(boolean z);

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (OooO0o) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (OooO0o) listAdapter).f2618OooO0Oo.OooOOo0((MenuItem) listAdapter.getItem(i), this, (this instanceof CascadingMenuPopup) ^ true ? 0 : 4);
    }
}
