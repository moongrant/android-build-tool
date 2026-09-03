package com.common.support.atd.utils;

import com.google.gson.OooOOO;
import com.google.gson.OooOOO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/gson/OooOOO0;", "gson", "Lcom/google/gson/OooOOO0;", "getGson", "()Lcom/google/gson/OooOOO0;", "lib_release"}, k = 2, mv = {1, 7, 1})
public final class JsonUtilKt {

    @NotNull
    private static final OooOOO0 gson;

    static {
        OooOOO0 oooOOO0OooO00o = new OooOOO().OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOO0OooO00o, "GsonBuilder().create()");
        gson = oooOOO0OooO00o;
    }

    @NotNull
    public static final OooOOO0 getGson() {
        return gson;
    }
}
