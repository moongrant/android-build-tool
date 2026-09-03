package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f4526OooO00o;

    public OooOo00(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f4526OooO00o = appCompatDelegateImpl;
    }

    @Override // o000O0O0.o00000OO
    public final void OooO00o() {
        this.f4526OooO00o.f4434OoooOoo.setAlpha(1.0f);
        this.f4526OooO00o.f4437OooooO0.OooO0Oo(null);
        this.f4526OooO00o.f4437OooooO0 = null;
    }

    @Override // o000O0O0.o0000Ooo, o000O0O0.o00000OO
    public final void OooO0O0() {
        this.f4526OooO00o.f4434OoooOoo.setVisibility(0);
        if (this.f4526OooO00o.f4434OoooOoo.getParent() instanceof View) {
            View view = (View) this.f4526OooO00o.f4434OoooOoo.getParent();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO0.OooO0OO(view);
        }
    }
}
