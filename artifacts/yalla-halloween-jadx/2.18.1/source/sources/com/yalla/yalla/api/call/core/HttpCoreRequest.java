package com.yalla.yalla.api.call.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import retrofit2.http.HeaderMap;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJE\u0010\u000b\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\r\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/api/call/core/HttpCoreRequest;", "", "", "", "headers", "url", "Lo0ooo0o0/o00OOOOo;", "get", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "paras", "postForm", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postJson", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0ooo0o0/o0o0Oo;", "body", "postBody", "(Ljava/util/Map;Ljava/lang/String;Lo0ooo0o0/o0o0Oo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class HttpCoreRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HttpCoreRequest f20565OooO00o = new HttpCoreRequest();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static o0O0O00 f20566OooO0O0;

    public final IHttpService OooO00o() {
        if (f20566OooO0O0 == null) {
            o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
            OooO0O0 oooO0O1 = OooO0O0.f40784OooO00o;
            oooO0O0.OooO0Oo((o00OO) OooO0O0.f40785OooO0O0.getValue());
            oooO0O0.OooO0O0((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).get(0));
            f20566OooO0O0 = oooO0O0.OooO0OO();
        }
        o0O0O00 o0o0o00 = f20566OooO0O0;
        Intrinsics.checkNotNull(o0o0o00);
        Object objOooO0O0 = o0o0o00.OooO0O0(IHttpService.class);
        Intrinsics.checkNotNullExpressionValue(objOooO0O0, "retrofit!!.create(IHttpService::class.java)");
        return (IHttpService) objOooO0O0;
    }

    @Nullable
    public final Object get(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super o00OOOOo> continuation) {
        return OooO00o().getAsync(map, str, continuation);
    }

    @Nullable
    public final Object post(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super o00OOOOo> continuation) {
        return OooO00o().postAsync(map, str, continuation);
    }

    @Nullable
    public final Object postBody(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull o0o0Oo o0o0oo, @NotNull Continuation<? super o00OOOOo> continuation) {
        return OooO00o().postBodyAsync(map, str, o0o0oo, continuation);
    }

    @Nullable
    public final Object postForm(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Map<String, ? extends Object> map2, @NotNull Continuation<? super o00OOOOo> continuation) {
        return OooO00o().postFormAsync(map, str, map2, continuation);
    }

    @Nullable
    public final Object postJson(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Object obj, @NotNull Continuation<? super o00OOOOo> continuation) {
        return OooO00o().postJsonAsync(map, str, obj, continuation);
    }
}
