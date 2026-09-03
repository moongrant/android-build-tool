package androidx.compose.runtime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO {
    public static Object OooO00o(Type type, String str, String str2, Type type2) {
        Intrinsics.checkNotNullExpressionValue(type, str);
        Object objOooO0Oo = com.code.android.json.OooO00o.OooO0Oo(str2, type2);
        Intrinsics.checkNotNull(objOooO0Oo);
        return objOooO0Oo;
    }

    public static ArrayList OooO0O0(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }
}
