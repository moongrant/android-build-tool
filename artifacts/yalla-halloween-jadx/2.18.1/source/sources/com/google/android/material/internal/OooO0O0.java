package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.OooOO0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
public final class OooO0O0<T extends OooOO0<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Integer, T> f17202OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Integer> f17203OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f17204OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f17205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f17206OooO0o0;

    public interface OooO00o {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean OooO00o(@NonNull OooOO0<T> oooOO1) {
        int id = oooOO1.getId();
        if (this.f17203OooO0O0.contains(Integer.valueOf(id))) {
            return false;
        }
        OooOO0<T> oooOO2 = (OooOO0) this.f17202OooO00o.get(Integer.valueOf(OooO0OO()));
        if (oooOO2 != null) {
            OooO0o0(oooOO2, false);
        }
        boolean zAdd = this.f17203OooO0O0.add(Integer.valueOf(id));
        if (!oooOO1.isChecked()) {
            oooOO1.setChecked(true);
        }
        return zAdd;
    }

    @NonNull
    public final List<Integer> OooO0O0(@NonNull ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f17203OooO0O0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof OooOO0) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @IdRes
    public final int OooO0OO() {
        if (!this.f17205OooO0Oo || this.f17203OooO0O0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f17203OooO0O0.iterator().next()).intValue();
    }

    public final void OooO0Oo() {
        OooO00o oooO00o = this.f17204OooO0OO;
        if (oooO00o != null) {
            new HashSet(this.f17203OooO0O0);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.OooO0o oooO0o = chipGroup.f16779OoooO0O;
            if (oooO0o != null) {
                chipGroup.f16776OoooO.OooO0O0(chipGroup);
                ChipGroup.OooO0O0 oooO0O0 = (ChipGroup.OooO0O0) oooO0o;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f16776OoooO.f17205OooO0Oo) {
                    ChipGroup.OooO0OO oooO0OO = oooO0O0.f16785OooO00o;
                    chipGroup2.getCheckedChipId();
                    oooO0OO.OooO00o();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean OooO0o0(@NonNull OooOO0<T> oooOO1, boolean z) {
        int id = oooOO1.getId();
        if (!this.f17203OooO0O0.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f17203OooO0O0.size() == 1 && this.f17203OooO0O0.contains(Integer.valueOf(id))) {
            oooOO1.setChecked(true);
            return false;
        }
        boolean zRemove = this.f17203OooO0O0.remove(Integer.valueOf(id));
        if (oooOO1.isChecked()) {
            oooOO1.setChecked(false);
        }
        return zRemove;
    }
}
