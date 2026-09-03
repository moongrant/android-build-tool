package p339o0OO0o0o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.o00Ooo;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o00Ooo.OooO0OO {
    @Override // com.google.android.material.internal.o00Ooo.OooO0OO
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull o00Ooo.OooO0o oooO0o) {
        oooO0o.f17364OooO0Oo = windowInsetsCompat.OooO0o() + oooO0o.f17364OooO0Oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        int iOooO0oO = windowInsetsCompat.OooO0oO();
        int iOooO0oo = windowInsetsCompat.OooO0oo();
        oooO0o.f17361OooO00o += z ? iOooO0oo : iOooO0oO;
        int i = oooO0o.f17363OooO0OO;
        if (!z) {
            iOooO0oO = iOooO0oo;
        }
        oooO0o.f17363OooO0OO = i + iOooO0oO;
        oooO0o.OooO00o(view);
        return windowInsetsCompat;
    }
}
