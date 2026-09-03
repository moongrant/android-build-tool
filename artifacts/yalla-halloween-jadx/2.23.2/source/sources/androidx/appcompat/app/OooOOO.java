package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0000;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f2399OooO0Oo;

    public class OooO00o extends o00O0000 {
        public OooO00o() {
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f2399OooO0Oo.f2312OooOoO0.setAlpha(1.0f);
            AppCompatDelegateImpl appCompatDelegateImpl = oooOOO.f2399OooO0Oo;
            appCompatDelegateImpl.f2315OooOoo0.OooO0Oo(null);
            appCompatDelegateImpl.f2315OooOoo0 = null;
        }

        @Override // androidx.core.view.o00O0000, androidx.core.view.o00
        public final void OooO0O0() {
            OooOOO.this.f2399OooO0Oo.f2312OooOoO0.setVisibility(0);
        }
    }

    public OooOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f2399OooO0Oo = appCompatDelegateImpl;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2399OooO0Oo;
        appCompatDelegateImpl.f2311OooOoO.showAtLocation(appCompatDelegateImpl.f2312OooOoO0, 55, 0, 0);
        o000OOo0 o000ooo1 = appCompatDelegateImpl.f2315OooOoo0;
        if (o000ooo1 != null) {
            o000ooo1.OooO0O0();
        }
        if (!appCompatDelegateImpl.f2316OooOooO || (viewGroup = appCompatDelegateImpl.f2317OooOooo) == null) {
            z = false;
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            appCompatDelegateImpl.f2312OooOoO0.setAlpha(1.0f);
            appCompatDelegateImpl.f2312OooOoO0.setVisibility(0);
            return;
        }
        appCompatDelegateImpl.f2312OooOoO0.setAlpha(0.0f);
        o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(appCompatDelegateImpl.f2312OooOoO0);
        o000ooo0OooO00o.OooO00o(1.0f);
        appCompatDelegateImpl.f2315OooOoo0 = o000ooo0OooO00o;
        o000ooo0OooO00o.OooO0Oo(new OooO00o());
    }
}
