package p604o0oo0O0;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<Oooo000> f57386OooO0Oo = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray<Oooo000> sparseArray = this.f57386OooO0Oo;
        Oooo000 oooo000 = sparseArray.get(i);
        if (oooo000 == null) {
            return;
        }
        sparseArray.remove(i);
        oooo000.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
