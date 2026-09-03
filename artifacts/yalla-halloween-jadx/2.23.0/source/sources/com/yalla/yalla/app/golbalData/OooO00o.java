package com.yalla.yalla.app.golbalData;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.user.OooO;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, CountryModel> f22727OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CountryModel> f22728OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static int f22729OooO0OO;

    /* JADX INFO: renamed from: com.yalla.yalla.app.golbalData.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0285OooO00o {
        void OooO00o(@NotNull ArrayList<CountryModel> arrayList);
    }

    @Nullable
    public static CountryModel OooO00o(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, CountryModel> map = f22727OooO00o;
        if ((!map.isEmpty()) && map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public static void OooO0O0(OooO oooO) {
        if (f22729OooO0OO == p591o0oo000O.OooO.OooO0OO() && (!f22728OooO0O0.isEmpty())) {
            return;
        }
        f22729OooO0OO = p591o0oo000O.OooO.OooO0OO();
        OooOOO.OooO0OO(GlobalScope.INSTANCE, new ApiCountryUtils$init$1("1", oooO, null));
    }
}
