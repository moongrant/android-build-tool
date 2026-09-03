package p447o0OoOoOo;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.oo0o0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o00 implements oo0o0Oo.OooO0O0 {
    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
        oooO0OO.f16866OooO0Oo = windowInsetsCompat.OooO0OO() + oooO0OO.f16866OooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        int iOooO0Oo = windowInsetsCompat.OooO0Oo();
        int iOooO0o0 = windowInsetsCompat.OooO0o0();
        int i = oooO0OO.f16863OooO00o + (z ? iOooO0o0 : iOooO0Oo);
        oooO0OO.f16863OooO00o = i;
        int i2 = oooO0OO.f16865OooO0OO;
        if (!z) {
            iOooO0Oo = iOooO0o0;
        }
        int i3 = i2 + iOooO0Oo;
        oooO0OO.f16865OooO0OO = i3;
        ViewCompat.OooO.OooOO0O(view, i, oooO0OO.f16864OooO0O0, i3, oooO0OO.f16866OooO0Oo);
        return windowInsetsCompat;
    }
}
