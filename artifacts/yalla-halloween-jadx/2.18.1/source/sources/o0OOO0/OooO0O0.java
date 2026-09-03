package o0OOO0;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o00Ooo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f38027OooO00o;

    public OooO0O0(NavigationRailView navigationRailView) {
        this.f38027OooO00o = navigationRailView;
    }

    @Override // com.google.android.material.internal.o00Ooo.OooO0OO
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull o00Ooo.OooO0o oooO0o) {
        boolean zOooO0O0;
        boolean zOooO0O1;
        NavigationRailView navigationRailView = this.f38027OooO00o;
        Boolean bool = navigationRailView.f17477o000oOoO;
        if (bool != null) {
            zOooO0O0 = bool.booleanValue();
        } else {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            zOooO0O0 = ViewCompat.OooO0o.OooO0O0(navigationRailView);
        }
        if (zOooO0O0) {
            oooO0o.f17362OooO0O0 += windowInsetsCompat.OooO0Oo(7).f28163OooO0O0;
        }
        NavigationRailView navigationRailView2 = this.f38027OooO00o;
        Boolean bool2 = navigationRailView2.f17476OoooOOO;
        if (bool2 != null) {
            zOooO0O1 = bool2.booleanValue();
        } else {
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            zOooO0O1 = ViewCompat.OooO0o.OooO0O0(navigationRailView2);
        }
        if (zOooO0O1) {
            oooO0o.f17364OooO0Oo += windowInsetsCompat.OooO0Oo(7).f28165OooO0Oo;
        }
        WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        int iOooO0oO = windowInsetsCompat.OooO0oO();
        int iOooO0oo = windowInsetsCompat.OooO0oo();
        int i = oooO0o.f17361OooO00o;
        if (z) {
            iOooO0oO = iOooO0oo;
        }
        oooO0o.f17361OooO00o = i + iOooO0oO;
        oooO0o.OooO00o(view);
        return windowInsetsCompat;
    }
}
