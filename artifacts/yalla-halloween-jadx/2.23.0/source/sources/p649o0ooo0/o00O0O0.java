package p649o0ooo0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOOO0;
import p639o0ooOO0o.o00OO0O0;
import p651o0ooo00O.o0O0O00;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> f59810OooO00o = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f59811OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = o00OOOO0.class.getPackage();
        String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = o00OOOO0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = o0O0O00.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = o00OO0O0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f59811OooO0O0 = MapsKt.toMap(linkedHashMap);
    }
}
