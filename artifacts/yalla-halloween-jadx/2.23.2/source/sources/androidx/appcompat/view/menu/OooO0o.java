package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO0o extends BaseAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2615OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2617OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f2618OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f2619OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LayoutInflater f2620OooO0oo;

    public OooO0o(OooO oooO, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2619OooO0oO = z;
        this.f2620OooO0oo = layoutInflater;
        this.f2616OooO0Oo = oooO;
        this.f2615OooO = i;
        OooO0O0();
    }

    public final void OooO0O0() {
        OooO oooO = this.f2616OooO0Oo;
        OooOO0O oooOO0O = oooO.f2591OooOo0O;
        if (oooOO0O != null) {
            oooO.OooO();
            ArrayList<OooOO0O> arrayList = oooO.f2578OooOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == oooOO0O) {
                    this.f2618OooO0o0 = i;
                    return;
                }
            }
        }
        this.f2618OooO0o0 = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final OooOO0O getItem(int i) {
        ArrayList<OooOO0O> arrayListOooOO0o;
        boolean z = this.f2619OooO0oO;
        OooO oooO = this.f2616OooO0Oo;
        if (z) {
            oooO.OooO();
            arrayListOooOO0o = oooO.f2578OooOO0;
        } else {
            arrayListOooOO0o = oooO.OooOO0o();
        }
        int i2 = this.f2618OooO0o0;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListOooOO0o.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<OooOO0O> arrayListOooOO0o;
        boolean z = this.f2619OooO0oO;
        OooO oooO = this.f2616OooO0Oo;
        if (z) {
            oooO.OooO();
            arrayListOooOO0o = oooO.f2578OooOO0;
        } else {
            arrayListOooOO0o = oooO.OooOO0o();
        }
        return this.f2618OooO0o0 < 0 ? arrayListOooOO0o.size() : arrayListOooOO0o.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f2620OooO0oo.inflate(this.f2615OooO, viewGroup, false);
        }
        int i2 = getItem(i).f2626OooO0O0;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2626OooO0O0 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2616OooO0Oo.OooOOO0() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        OooOOOO.OooO00o oooO00o = (OooOOOO.OooO00o) view;
        if (this.f2617OooO0o) {
            listMenuItemView.setForceShowIcon(true);
        }
        oooO00o.OooO0OO(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO0O0();
        super.notifyDataSetChanged();
    }
}
