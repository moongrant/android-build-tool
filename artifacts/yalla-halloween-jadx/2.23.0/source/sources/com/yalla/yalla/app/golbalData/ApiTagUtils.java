package com.yalla.yalla.app.golbalData;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.CategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class ApiTagUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, CategoryModel> f22721OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList f22722OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static int f22723OooO0OO;

    @Nullable
    public static CategoryModel OooO00o(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, CategoryModel> map = f22721OooO00o;
        if ((!map.isEmpty()) && map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    public static void OooO0O0() {
        if (f22723OooO0OO == OooO.OooO0OO() && (!f22722OooO0O0.isEmpty())) {
            return;
        }
        f22723OooO0OO = OooO.OooO0OO();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ApiTagUtils$init$1(null), 3, null);
    }
}
