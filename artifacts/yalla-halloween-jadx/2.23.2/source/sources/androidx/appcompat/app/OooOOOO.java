package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0000;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f2402OooO00o;

    public OooOOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f2402OooO00o = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.o00
    public final void OooO00o() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2402OooO00o;
        appCompatDelegateImpl.f2312OooOoO0.setAlpha(1.0f);
        appCompatDelegateImpl.f2315OooOoo0.OooO0Oo(null);
        appCompatDelegateImpl.f2315OooOoo0 = null;
    }

    @Override // androidx.core.view.o00O0000, androidx.core.view.o00
    public final void OooO0O0() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2402OooO00o;
        appCompatDelegateImpl.f2312OooOoO0.setVisibility(0);
        if (appCompatDelegateImpl.f2312OooOoO0.getParent() instanceof View) {
            View view = (View) appCompatDelegateImpl.f2312OooOoO0.getParent();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO0.OooO0OO(view);
        }
    }
}
