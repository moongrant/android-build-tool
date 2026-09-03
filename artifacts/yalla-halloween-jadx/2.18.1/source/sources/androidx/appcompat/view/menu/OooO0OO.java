package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO0OO extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f4698Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0o f4699Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f4700Oooo0oO = -1;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f4701Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f4702OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final LayoutInflater f4703OoooO00;

    public OooO0OO(OooO0o oooO0o, LayoutInflater layoutInflater, boolean z, int i) {
        this.f4698Oooo = z;
        this.f4703OoooO00 = layoutInflater;
        this.f4699Oooo0o = oooO0o;
        this.f4702OoooO0 = i;
        OooO0O0();
    }

    public final void OooO0O0() {
        OooO0o oooO0o = this.f4699Oooo0o;
        OooOO0 oooOO1 = oooO0o.f4727OooOo0O;
        if (oooOO1 != null) {
            oooO0o.OooOO0();
            ArrayList<OooOO0> arrayList = oooO0o.f4714OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == oooOO1) {
                    this.f4700Oooo0oO = i;
                    return;
                }
            }
        }
        this.f4700Oooo0oO = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooOO0 getItem(int i) {
        ArrayList<OooOO0> arrayListOooOOO0;
        if (this.f4698Oooo) {
            OooO0o oooO0o = this.f4699Oooo0o;
            oooO0o.OooOO0();
            arrayListOooOOO0 = oooO0o.f4714OooOO0;
        } else {
            arrayListOooOOO0 = this.f4699Oooo0o.OooOOO0();
        }
        int i2 = this.f4700Oooo0oO;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListOooOOO0.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<OooOO0> arrayListOooOOO0;
        if (this.f4698Oooo) {
            OooO0o oooO0o = this.f4699Oooo0o;
            oooO0o.OooOO0();
            arrayListOooOOO0 = oooO0o.f4714OooOO0;
        } else {
            arrayListOooOOO0 = this.f4699Oooo0o.OooOOO0();
        }
        return this.f4700Oooo0oO < 0 ? arrayListOooOOO0.size() : arrayListOooOOO0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f4703OoooO00.inflate(this.f4702OoooO0, viewGroup, false);
        }
        int i2 = getItem(i).f4731OooO0O0;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f4731OooO0O0 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4699Oooo0o.OooOOO() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        OooOOO.OooO00o oooO00o = (OooOOO.OooO00o) view;
        if (this.f4701Oooo0oo) {
            listMenuItemView.setForceShowIcon(true);
        }
        oooO00o.OooO0Oo(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO0O0();
        super.notifyDataSetChanged();
    }
}
