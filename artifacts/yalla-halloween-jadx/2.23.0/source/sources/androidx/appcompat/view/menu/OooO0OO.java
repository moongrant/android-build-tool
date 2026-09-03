package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;
import p012OooOo0O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO0OO implements OooOOO, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO.OooO00o f2608OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Context f2609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO f2610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LayoutInflater f2611OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ExpandedMenuView f2612OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2613OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO00o f2614OooOO0;

    public class OooO00o extends BaseAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f2615OooO0Oo = -1;

        public OooO00o() {
            OooO0O0();
        }

        public final void OooO0O0() {
            OooO oooO = OooO0OO.this.f2610OooO0o;
            OooOO0O oooOO0O = oooO.f2593OooOo0O;
            if (oooOO0O != null) {
                oooO.OooO();
                ArrayList<OooOO0O> arrayList = oooO.f2580OooOO0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == oooOO0O) {
                        this.f2615OooO0Oo = i;
                        return;
                    }
                }
            }
            this.f2615OooO0Oo = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooOO0O getItem(int i) {
            OooO0OO oooO0OO = OooO0OO.this;
            OooO oooO = oooO0OO.f2610OooO0o;
            oooO.OooO();
            ArrayList<OooOO0O> arrayList = oooO.f2580OooOO0;
            oooO0OO.getClass();
            int i2 = i + 0;
            int i3 = this.f2615OooO0Oo;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            OooO0OO oooO0OO = OooO0OO.this;
            OooO oooO = oooO0OO.f2610OooO0o;
            oooO.OooO();
            int size = oooO.f2580OooOO0.size();
            oooO0OO.getClass();
            int i = size + 0;
            return this.f2615OooO0Oo < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                OooO0OO oooO0OO = OooO0OO.this;
                view = oooO0OO.f2611OooO0o0.inflate(oooO0OO.f2613OooO0oo, viewGroup, false);
            }
            ((OooOOOO.OooO00o) view).OooO0OO(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            OooO0O0();
            super.notifyDataSetChanged();
        }
    }

    public OooO0OO(Context context, int i) {
        this.f2613OooO0oo = i;
        this.f2609OooO0Oo = context;
        this.f2611OooO0o0 = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        OooO00o oooO00o = this.f2614OooOO0;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(OooO oooO, boolean z) {
        OooOOO.OooO00o oooO00o = this.f2608OooO;
        if (oooO00o != null) {
            oooO00o.OooO0O0(oooO, z);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0OO(OooOOO.OooO00o oooO00o) {
        this.f2608OooO = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0Oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(OooOo oooOo) {
        if (!oooOo.hasVisibleItems()) {
            return false;
        }
        OooOO0 oooOO1 = new OooOO0(oooOo);
        Context context = oooOo.f2572OooO00o;
        androidx.appcompat.app.OooO0O0.OooO00o oooO00o = new androidx.appcompat.app.OooO0O0.OooO00o(context);
        OooO0OO oooO0OO = new OooO0OO(oooO00o.getContext(), Oooo0.abc_list_menu_item_layout);
        oooOO1.f2624OooO0o = oooO0OO;
        oooO0OO.f2608OooO = oooOO1;
        oooOo.OooO0O0(oooO0OO, context);
        OooO0OO oooO0OO2 = oooOO1.f2624OooO0o;
        if (oooO0OO2.f2614OooOO0 == null) {
            oooO0OO2.f2614OooOO0 = oooO0OO2.new OooO00o();
        }
        OooO00o oooO00o2 = oooO0OO2.f2614OooOO0;
        AlertController.OooO0O0 oooO0O0 = oooO00o.f2394OooO00o;
        oooO0O0.f2279OooOO0O = oooO00o2;
        oooO0O0.f2280OooOO0o = oooOO1;
        View view = oooOo.f2585OooOOOO;
        if (view != null) {
            oooO0O0.f2275OooO0o0 = view;
        } else {
            oooO0O0.f2272OooO0OO = oooOo.f2583OooOOO;
            oooO00o.setTitle(oooOo.f2584OooOOO0);
        }
        oooO0O0.f2278OooOO0 = oooOO1;
        androidx.appcompat.app.OooO0O0 oooO0O0Create = oooO00o.create();
        oooOO1.f2625OooO0o0 = oooO0O0Create;
        oooO0O0Create.setOnDismissListener(oooOO1);
        WindowManager.LayoutParams attributes = oooOO1.f2625OooO0o0.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oooOO1.f2625OooO0o0.show();
        OooOOO.OooO00o oooO00o3 = this.f2608OooO;
        if (oooO00o3 == null) {
            return true;
        }
        oooO00o3.OooO0OO(oooOo);
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2612OooO0oO.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final Parcelable OooO0oO() {
        if (this.f2612OooO0oO == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2612OooO0oO;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0oo(OooOO0O oooOO0O) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooOO0O(Context context, OooO oooO) {
        if (this.f2609OooO0Oo != null) {
            this.f2609OooO0Oo = context;
            if (this.f2611OooO0o0 == null) {
                this.f2611OooO0o0 = LayoutInflater.from(context);
            }
        }
        this.f2610OooO0o = oooO;
        OooO00o oooO00o = this.f2614OooOO0;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2610OooO0o.OooOOo0(this.f2614OooOO0.getItem(i), this, 0);
    }
}
