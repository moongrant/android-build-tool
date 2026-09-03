package o0O00OOO;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f41699OooO0Oo;

    public OooO0O0(NavigationRailView navigationRailView) {
        this.f41699OooO0Oo = navigationRailView;
    }

    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    @NonNull
    public final WindowInsetsCompat OooO0O0(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
        boolean zOooO0O0;
        boolean zOooO0O1;
        NavigationRailView navigationRailView = this.f41699OooO0Oo;
        Boolean bool = navigationRailView.f17460OooOO0O;
        if (bool != null) {
            zOooO0O0 = bool.booleanValue();
        } else {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            zOooO0O0 = ViewCompat.OooO0o.OooO0O0(navigationRailView);
        }
        if (zOooO0O0) {
            oooO0OO.f17337OooO0O0 += windowInsetsCompat.OooO00o(7).f33990OooO0O0;
        }
        Boolean bool2 = navigationRailView.f17461OooOO0o;
        if (bool2 != null) {
            zOooO0O1 = bool2.booleanValue();
        } else {
            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
            zOooO0O1 = ViewCompat.OooO0o.OooO0O0(navigationRailView);
        }
        if (zOooO0O1) {
            oooO0OO.f17339OooO0Oo += windowInsetsCompat.OooO00o(7).f33992OooO0Oo;
        }
        WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(view) == 1;
        int iOooO0Oo = windowInsetsCompat.OooO0Oo();
        int iOooO0o0 = windowInsetsCompat.OooO0o0();
        int i = oooO0OO.f17336OooO00o;
        if (z) {
            iOooO0Oo = iOooO0o0;
        }
        int i2 = i + iOooO0Oo;
        oooO0OO.f17336OooO00o = i2;
        ViewCompat.OooO.OooOO0O(view, i2, oooO0OO.f17337OooO0O0, oooO0OO.f17338OooO0OO, oooO0OO.f17339OooO0Oo);
        return windowInsetsCompat;
    }
}
