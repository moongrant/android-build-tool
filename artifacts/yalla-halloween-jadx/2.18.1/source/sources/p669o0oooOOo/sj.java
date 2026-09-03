package p669o0oooOOo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import p660o0ooo0o0.o00OO;
import p662o0oooO.o0O0ooO;
import p664o0oooO00.o000000O;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
public final class sj {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f51926OooO00o = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<String, String> f51927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final sj f51928OooO0OO = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = o00OO.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = o00OO.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = o0O0ooO.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = o000000O.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f51927OooO0O0 = MapsKt.toMap(linkedHashMap);
    }
}
