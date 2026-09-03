package p587o0oOooOO;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f56991OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f56992OooO0oo;

    public u0(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f56992OooO0oo = new ArrayList();
        this.f56991OooO = new ArrayList();
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f56992OooO0oo.size();
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0Oo(Object obj) {
        return -2;
    }

    @Override // p114o00O00o.OooO0OO
    public final CharSequence OooO0o0(int i) {
        return (CharSequence) this.f56991OooO.get(i);
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final long OooOOo(int i) {
        return this.f56992OooO0oo.size() == 2 ? i + 1 : i;
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final Fragment OooOOo0(int i) {
        return (Fragment) this.f56992OooO0oo.get(i);
    }

    public final void OooOOoo(Fragment fragment, String str) {
        this.f56992OooO0oo.add(fragment);
        this.f56991OooO.add(str);
        OooO();
    }
}
