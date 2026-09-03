package p278o0O00o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f41039OooO0Oo;

    public OooOo(BaseTransientBottomBar baseTransientBottomBar) {
        this.f41039OooO0Oo = baseTransientBottomBar;
    }

    @Override // androidx.core.view.o000000O
    @NonNull
    public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        int iOooO0OO = windowInsetsCompat.OooO0OO();
        BaseTransientBottomBar baseTransientBottomBar = this.f41039OooO0Oo;
        baseTransientBottomBar.f17325OooOOO0 = iOooO0OO;
        baseTransientBottomBar.f17324OooOOO = windowInsetsCompat.OooO0Oo();
        baseTransientBottomBar.f17326OooOOOO = windowInsetsCompat.OooO0o0();
        baseTransientBottomBar.OooO0o();
        return windowInsetsCompat;
    }
}
