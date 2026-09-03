package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsApplier implements o000000O {
    private WindowInsetsApplier() {
    }

    private WindowInsetsCompat consumeAllInsets(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.f5388OooO0O0;
        return windowInsetsCompat2.OooO() != null ? windowInsetsCompat2 : windowInsetsCompat.f5389OooO00o.OooO0OO().f5389OooO00o.OooO0O0();
    }

    public static boolean install(@NonNull ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        WindowInsetsApplier windowInsetsApplier = new WindowInsetsApplier();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(viewPager2, windowInsetsApplier);
        return true;
    }

    @Override // androidx.core.view.o000000O
    @NonNull
    public WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat windowInsetsCompatOooOO0 = ViewCompat.OooOO0(viewPager2, windowInsetsCompat);
        if (windowInsetsCompatOooOO0.f5389OooO00o.OooOOOO()) {
            return windowInsetsCompatOooOO0;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.OooO0O0(recyclerView.getChildAt(i), new WindowInsetsCompat(windowInsetsCompatOooOO0));
        }
        return consumeAllInsets(windowInsetsCompatOooOO0);
    }
}
