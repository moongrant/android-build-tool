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
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO0O0 implements OooOOO0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ExpandedMenuView f4689Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f4690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public LayoutInflater f4691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0o f4692Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOOO0.OooO00o f4693OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f4694OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooO00o f4695OoooO0O;

    public class OooO00o extends BaseAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f4696Oooo0o = -1;

        public OooO00o() {
            OooO0O0();
        }

        public final void OooO0O0() {
            OooO0o oooO0o = OooO0O0.this.f4692Oooo0oo;
            OooOO0 oooOO1 = oooO0o.f4727OooOo0O;
            if (oooOO1 != null) {
                oooO0o.OooOO0();
                ArrayList<OooOO0> arrayList = oooO0o.f4714OooOO0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == oooOO1) {
                        this.f4696Oooo0o = i;
                        return;
                    }
                }
            }
            this.f4696Oooo0o = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public final OooOO0 getItem(int i) {
            OooO0o oooO0o = OooO0O0.this.f4692Oooo0oo;
            oooO0o.OooOO0();
            ArrayList<OooOO0> arrayList = oooO0o.f4714OooOO0;
            Objects.requireNonNull(OooO0O0.this);
            int i2 = i + 0;
            int i3 = this.f4696Oooo0o;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            OooO0o oooO0o = OooO0O0.this.f4692Oooo0oo;
            oooO0o.OooOO0();
            int size = oooO0o.f4714OooOO0.size();
            Objects.requireNonNull(OooO0O0.this);
            int i = size + 0;
            return this.f4696Oooo0o < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                OooO0O0 oooO0O0 = OooO0O0.this;
                view = oooO0O0.f4691Oooo0oO.inflate(oooO0O0.f4694OoooO00, viewGroup, false);
            }
            ((OooOOO.OooO00o) view).OooO0Oo(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            OooO0O0();
            super.notifyDataSetChanged();
        }
    }

    public OooO0O0(Context context, int i) {
        this.f4694OoooO00 = i;
        this.f4690Oooo0o = context;
        this.f4691Oooo0oO = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4689Oooo.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final ListAdapter OooO00o() {
        if (this.f4695OoooO0O == null) {
            this.f4695OoooO0O = new OooO00o();
        }
        return this.f4695OoooO0O;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(OooO0o oooO0o, boolean z) {
        OooOOO0.OooO00o oooO00o = this.f4693OoooO0;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooO0o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        OooO00o oooO00o = this.f4695OoooO0O;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o(OooOOO0.OooO00o oooO00o) {
        this.f4693OoooO0 = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0oO(OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0oo(Context context, OooO0o oooO0o) {
        if (this.f4690Oooo0o != null) {
            this.f4690Oooo0o = context;
            if (this.f4691Oooo0oO == null) {
                this.f4691Oooo0oO = LayoutInflater.from(context);
            }
        }
        this.f4692Oooo0oo = oooO0o;
        OooO00o oooO00o = this.f4695OoooO0O;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(OooOo00 oooOo00) {
        if (!oooOo00.hasVisibleItems()) {
            return false;
        }
        OooO oooO = new OooO(oooOo00);
        androidx.appcompat.app.OooO0o.OooO00o oooO00o = new androidx.appcompat.app.OooO0o.OooO00o(oooOo00.f4706OooO00o);
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o.f4518OooO00o.f4403OooO00o, OooOo00.OooOO0O.abc_list_menu_item_layout);
        oooO.f4679Oooo0oo = oooO0O0;
        oooO0O0.f4693OoooO0 = oooO;
        oooO.f4677Oooo0o.OooO0O0(oooO0O0);
        ListAdapter listAdapterOooO00o = oooO.f4679Oooo0oo.OooO00o();
        AlertController.OooO0O0 oooO0O1 = oooO00o.f4518OooO00o;
        oooO0O1.f4409OooO0oO = listAdapterOooO00o;
        oooO0O1.f4410OooO0oo = oooO;
        View view = oooOo00.f4719OooOOOO;
        if (view != null) {
            oooO0O1.f4408OooO0o0 = view;
        } else {
            oooO0O1.f4405OooO0OO = oooOo00.f4717OooOOO;
            oooO0O1.f4406OooO0Oo = oooOo00.f4718OooOOO0;
        }
        oooO0O1.f4407OooO0o = oooO;
        androidx.appcompat.app.OooO0o oooO0oOooO00o = oooO00o.OooO00o();
        oooO.f4678Oooo0oO = oooO0oOooO00o;
        oooO0oOooO00o.setOnDismissListener(oooO);
        WindowManager.LayoutParams attributes = oooO.f4678Oooo0oO.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oooO.f4678Oooo0oO.show();
        OooOOO0.OooO00o oooO00o2 = this.f4693OoooO0;
        if (oooO00o2 == null) {
            return true;
        }
        oooO00o2.OooO0Oo(oooOo00);
        return true;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final Parcelable OooOO0o() {
        if (this.f4689Oooo == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f4689Oooo;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOOO0(OooOO0 oooOO1) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4692Oooo0oo.OooOo00(this.f4695OoooO0O.getItem(i), this, 0);
    }
}
