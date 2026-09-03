package p620o0oo0o0O;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends Fragment {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SparseArray<o00O00o0> f48616Oooo0o = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        o00O00o0 o00o00o1 = this.f48616Oooo0o.get(i);
        if (o00o00o1 == null) {
            return;
        }
        this.f48616Oooo0o.remove(i);
        o00o00o1.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
