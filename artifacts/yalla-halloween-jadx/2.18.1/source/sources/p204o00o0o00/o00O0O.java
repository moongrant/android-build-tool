package p204o00o0o00;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends Fragment {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SparseArray<o00Ooo> f33241Oooo0o = new SparseArray<>();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        o00Ooo o00ooo2 = this.f33241Oooo0o.get(i);
        if (o00ooo2 == null) {
            return;
        }
        this.f33241Oooo0o.remove(i);
        o00ooo2.onActivityResult(i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
