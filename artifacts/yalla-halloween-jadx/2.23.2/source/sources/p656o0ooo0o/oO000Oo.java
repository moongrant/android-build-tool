package p656o0ooo0o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0OoO00O;
import p652o0ooo000.o0000O00;
import p655o0ooo0O.o0OOOO0o;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class oO000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> f59578OooO00o = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f59579OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = o0OoO00O.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = o0OoO00O.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = o0OOOO0o.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = o0000O00.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f59579OooO0O0 = MapsKt.toMap(linkedHashMap);
    }
}
