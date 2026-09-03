package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0O0;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f2403OooO00o;

    public OooOOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f2403OooO00o = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.o000OO0O
    public final void OooO00o() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2403OooO00o;
        appCompatDelegateImpl.f2314OooOoO0.setAlpha(1.0f);
        appCompatDelegateImpl.f2317OooOoo0.OooO0Oo(null);
        appCompatDelegateImpl.f2317OooOoo0 = null;
    }

    @Override // androidx.core.view.o000O0O0, androidx.core.view.o000OO0O
    public final void OooO0O0() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2403OooO00o;
        appCompatDelegateImpl.f2314OooOoO0.setVisibility(0);
        if (appCompatDelegateImpl.f2314OooOoO0.getParent() instanceof View) {
            View view = (View) appCompatDelegateImpl.f2314OooOoO0.getParent();
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO0.OooO0OO(view);
        }
    }
}
