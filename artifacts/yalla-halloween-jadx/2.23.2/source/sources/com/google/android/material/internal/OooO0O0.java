package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.OooOOO0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public final class OooO0O0<T extends OooOOO0<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f16730OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f16731OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f16732OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f16734OooO0o0;

    public interface OooO00o {
    }

    public final boolean OooO00o(@NonNull OooOOO0<T> oooOOO0) {
        int id = oooOOO0.getId();
        HashSet hashSet = this.f16731OooO0O0;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        OooOOO0<T> oooOOO1 = (OooOOO0) this.f16730OooO00o.get(Integer.valueOf(OooO0OO()));
        if (oooOOO1 != null) {
            OooO0o0(oooOOO1, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!oooOOO0.isChecked()) {
            oooOOO0.setChecked(true);
        }
        return zAdd;
    }

    @NonNull
    public final ArrayList OooO0O0(@NonNull ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f16731OooO0O0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof OooOOO0) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public final int OooO0OO() {
        if (this.f16733OooO0Oo) {
            HashSet hashSet = this.f16731OooO0O0;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public final void OooO0Oo() {
        OooO00o oooO00o = this.f16732OooO0OO;
        if (oooO00o != null) {
            new HashSet(this.f16731OooO0O0);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.OooO0o oooO0o = chipGroup.f16242OooOO0;
            if (oooO0o != null) {
                chipGroup.f16243OooOO0O.OooO0O0(chipGroup);
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f16243OooOO0O.f16733OooO0Oo) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean OooO0o0(@NonNull OooOOO0<T> oooOOO0, boolean z) {
        int id = oooOOO0.getId();
        HashSet hashSet = this.f16731OooO0O0;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            oooOOO0.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (oooOOO0.isChecked()) {
            oooOOO0.setChecked(false);
        }
        return zRemove;
    }
}
