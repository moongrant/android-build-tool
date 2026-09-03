package p599o0oo00oo;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 extends Fragment {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<o0000O> f56858OooO0Oo = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray<o0000O> sparseArray = this.f56858OooO0Oo;
        o0000O o0000o2 = sparseArray.get(i);
        if (o0000o2 == null) {
            return;
        }
        sparseArray.remove(i);
        o0000o2.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
