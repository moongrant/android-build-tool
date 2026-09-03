package oo0oOO0;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<OooO0OO> f60906OooO0Oo = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray<OooO0OO> sparseArray = this.f60906OooO0Oo;
        OooO0OO oooO0OO = sparseArray.get(i);
        if (oooO0OO == null) {
            return;
        }
        sparseArray.remove(i);
        oooO0OO.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
