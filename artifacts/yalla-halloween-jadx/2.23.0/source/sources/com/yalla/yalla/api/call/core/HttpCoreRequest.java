package com.yalla.yalla.api.call.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O0O;
import p622o0oo0ooo.w1;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.oo00oO;
import retrofit2.http.HeaderMap;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJE\u0010\u000b\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\r\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/api/call/core/HttpCoreRequest;", "", "", "", "headers", "url", "Lo0ooO0oO/o0O0o;", "get", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "paras", "postForm", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postJson", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0ooO0oO/oo00oO;", "body", "postBody", "(Ljava/util/Map;Ljava/lang/String;Lo0ooO0oO/oo00oO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class HttpCoreRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HttpCoreRequest f22674OooO00o = new HttpCoreRequest();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o000OO f22675OooO0O0;

    public static IHttpService OooO00o() {
        if (f22675OooO0O0 == null) {
            o000OO.OooO0O0 oooO0O0 = new o000OO.OooO0O0();
            Lazy lazy = o0000O0O.f44197OooO00o;
            o00OOOO0 o00oooo1 = (o00OOOO0) o0000O0O.f44197OooO00o.getValue();
            Objects.requireNonNull(o00oooo1, "client == null");
            oooO0O0.f61144OooO0O0 = o00oooo1;
            oooO0O0.OooO0O0(new w1().OooO0o0().get(0));
            f22675OooO0O0 = oooO0O0.OooO0OO();
        }
        o000OO o000oo2 = f22675OooO0O0;
        Intrinsics.checkNotNull(o000oo2);
        Object objOooO0O0 = o000oo2.OooO0O0(IHttpService.class);
        Intrinsics.checkNotNullExpressionValue(objOooO0O0, "retrofit!!.create(IHttpService::class.java)");
        return (IHttpService) objOooO0O0;
    }

    @Nullable
    public final Object get(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super o0O0o> continuation) {
        return OooO00o().getAsync(map, str, continuation);
    }

    @Nullable
    public final Object post(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super o0O0o> continuation) {
        return OooO00o().postAsync(map, str, continuation);
    }

    @Nullable
    public final Object postBody(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull oo00oO oo00oo, @NotNull Continuation<? super o0O0o> continuation) {
        return OooO00o().postBodyAsync(map, str, oo00oo, continuation);
    }

    @Nullable
    public final Object postForm(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Map<String, ? extends Object> map2, @NotNull Continuation<? super o0O0o> continuation) {
        return OooO00o().postFormAsync(map, str, map2, continuation);
    }

    @Nullable
    public final Object postJson(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Object obj, @NotNull Continuation<? super o0O0o> continuation) {
        return OooO00o().postJsonAsync(map, str, obj, continuation);
    }
}
