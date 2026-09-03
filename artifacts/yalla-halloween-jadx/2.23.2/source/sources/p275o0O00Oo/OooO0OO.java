package p275o0O00Oo;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f41007OooO00o;

    public OooO0OO(NavigationRailView navigationRailView) {
        this.f41007OooO00o = navigationRailView;
    }

    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
        boolean zOooO0O0;
        boolean zOooO0O1;
        NavigationRailView navigationRailView = this.f41007OooO00o;
        Boolean bool = navigationRailView.f16987OooOO0O;
        if (bool != null) {
            zOooO0O0 = bool.booleanValue();
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            zOooO0O0 = ViewCompat.OooO0o.OooO0O0(navigationRailView);
        }
        if (zOooO0O0) {
            oooO0OO.f16864OooO0O0 += windowInsetsCompat.OooO00o(7).f33478OooO0O0;
        }
        Boolean bool2 = navigationRailView.f16988OooOO0o;
        if (bool2 != null) {
            zOooO0O1 = bool2.booleanValue();
        } else {
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            zOooO0O1 = ViewCompat.OooO0o.OooO0O0(navigationRailView);
        }
        if (zOooO0O1) {
            oooO0OO.f16866OooO0Oo += windowInsetsCompat.OooO00o(7).f33480OooO0Oo;
        }
        WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        int iOooO0Oo = windowInsetsCompat.OooO0Oo();
        int iOooO0o0 = windowInsetsCompat.OooO0o0();
        int i = oooO0OO.f16863OooO00o;
        if (z) {
            iOooO0Oo = iOooO0o0;
        }
        int i2 = i + iOooO0Oo;
        oooO0OO.f16863OooO00o = i2;
        ViewCompat.OooO.OooOO0O(view, i2, oooO0OO.f16864OooO0O0, oooO0OO.f16865OooO0OO, oooO0OO.f16866OooO0Oo);
        return windowInsetsCompat;
    }
}
