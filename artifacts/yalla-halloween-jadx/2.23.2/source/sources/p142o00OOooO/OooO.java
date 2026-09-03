package p142o00OOooO;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<OooOO0O> f37525OooO0Oo = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray<OooOO0O> sparseArray = this.f37525OooO0Oo;
        OooOO0O oooOO0O = sparseArray.get(i);
        if (oooOO0O == null) {
            return;
        }
        sparseArray.remove(i);
        oooOO0O.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
