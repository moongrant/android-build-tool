package p539o0o0OoOO;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class x1 extends o00000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f55744OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f55745OooO0oo;

    public x1(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f55745OooO0oo = new ArrayList();
        this.f55744OooO = new ArrayList();
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        return this.f55745OooO0oo.size();
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0Oo(Object obj) {
        return -2;
    }

    @Override // p082o000OoOo.OooOO0O
    public final CharSequence OooO0o0(int i) {
        return (CharSequence) this.f55744OooO.get(i);
    }

    @Override // androidx.fragment.app.o00000OO
    public final long OooOOo(int i) {
        return this.f55745OooO0oo.size() == 2 ? i + 1 : i;
    }

    @Override // androidx.fragment.app.o00000OO
    public final Fragment OooOOo0(int i) {
        return (Fragment) this.f55745OooO0oo.get(i);
    }

    public final void OooOOoo(Fragment fragment, String str) {
        this.f55745OooO0oo.add(fragment);
        this.f55744OooO.add(str);
        OooO();
    }
}
