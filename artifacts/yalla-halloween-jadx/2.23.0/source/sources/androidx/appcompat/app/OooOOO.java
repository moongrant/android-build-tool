package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0O0;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f2400OooO0Oo;

    public class OooO00o extends o000O0O0 {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000OO0O
        public final void OooO00o() {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f2400OooO0Oo.f2314OooOoO0.setAlpha(1.0f);
            AppCompatDelegateImpl appCompatDelegateImpl = oooOOO.f2400OooO0Oo;
            appCompatDelegateImpl.f2317OooOoo0.OooO0Oo(null);
            appCompatDelegateImpl.f2317OooOoo0 = null;
        }

        @Override // androidx.core.view.o000O0O0, androidx.core.view.o000OO0O
        public final void OooO0O0() {
            OooOOO.this.f2400OooO0Oo.f2314OooOoO0.setVisibility(0);
        }
    }

    public OooOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f2400OooO0Oo = appCompatDelegateImpl;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2400OooO0Oo;
        appCompatDelegateImpl.f2313OooOoO.showAtLocation(appCompatDelegateImpl.f2314OooOoO0, 55, 0, 0);
        o000O0Oo o000o0oo2 = appCompatDelegateImpl.f2317OooOoo0;
        if (o000o0oo2 != null) {
            o000o0oo2.OooO0O0();
        }
        if (!appCompatDelegateImpl.f2318OooOooO || (viewGroup = appCompatDelegateImpl.f2319OooOooo) == null) {
            z = false;
        } else {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            appCompatDelegateImpl.f2314OooOoO0.setAlpha(1.0f);
            appCompatDelegateImpl.f2314OooOoO0.setVisibility(0);
            return;
        }
        appCompatDelegateImpl.f2314OooOoO0.setAlpha(0.0f);
        o000O0Oo o000o0ooOooO00o = ViewCompat.OooO00o(appCompatDelegateImpl.f2314OooOoO0);
        o000o0ooOooO00o.OooO00o(1.0f);
        appCompatDelegateImpl.f2317OooOoo0 = o000o0ooOooO00o;
        o000o0ooOooO00o.OooO0Oo(new OooO00o());
    }
}
