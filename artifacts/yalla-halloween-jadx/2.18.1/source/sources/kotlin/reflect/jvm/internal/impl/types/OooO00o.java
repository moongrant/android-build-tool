package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o {
    public static Object OooO00o(OooOOO oooOOO) {
        Long value = oooOOO.OooOo().getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    public static StringBuilder OooO0O0(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }
}
