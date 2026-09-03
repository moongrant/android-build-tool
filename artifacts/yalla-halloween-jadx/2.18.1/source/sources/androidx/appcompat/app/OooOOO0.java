package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements o000O0O0.oo000o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f4522Oooo0o;

    public OooOOO0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f4522Oooo0o = appCompatDelegateImpl;
    }

    @Override // o000O0O0.oo000o
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
        int iOooO = windowInsetsCompat.OooO();
        int iO000oOoO = this.f4522Oooo0o.o000oOoO(windowInsetsCompat);
        if (iOooO != iO000oOoO) {
            windowInsetsCompat = windowInsetsCompat.OooOO0o(windowInsetsCompat.OooO0oO(), iO000oOoO, windowInsetsCompat.OooO0oo(), windowInsetsCompat.OooO0o());
        }
        return ViewCompat.OooOOo0(view, windowInsetsCompat);
    }
}
