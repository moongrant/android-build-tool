package p175o00OooOo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOooO0 extends o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<String> f32754OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<Fragment> f32755OooO0oo;

    public o0OOooO0(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f32755OooO0oo = new ArrayList();
        this.f32754OooO = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f32755OooO0oo.size();
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0Oo(Object obj) {
        return -2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // p105o000oo0o.o00Ooo
    public final CharSequence OooO0o0(int i) {
        return (CharSequence) this.f32754OooO.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // androidx.fragment.app.o00000
    public final Fragment OooOOOo(int i) {
        return (Fragment) this.f32755OooO0oo.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // androidx.fragment.app.o00000
    public final long OooOOo0(int i) {
        return this.f32755OooO0oo.size() == 2 ? i + 1 : i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooOOoo(Fragment fragment, String str) {
        this.f32755OooO0oo.add(fragment);
        this.f32754OooO.add(str);
        OooO();
    }
}
