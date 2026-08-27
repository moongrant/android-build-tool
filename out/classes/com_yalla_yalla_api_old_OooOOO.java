package com.yalla.yalla.api.old;

import android.os.Looper;
import androidx.compose.material3.am;
import androidx.compose.material3.bm;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.JsonUtil;
import com.code.android.util.o00OOO0;
import com.code.android.util.o0o0Oo;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "")
@SourceDebugExtension({"SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\ncom/yalla/yalla/api/old/ApiClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1869#2,2:146\n1869#2,2:148\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\ncom/yalla/yalla/api/old/ApiClient\n*L\n108#1:146,2\n134#1:148,2\n*E\n"})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f45025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f45026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f45027OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f45028OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f45029OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f45030OooO0o0;

    static {
        int i = 0;
        f45025OooO00o = LazyKt.lazy(new OooO(i));
        f45026OooO0O0 = LazyKt.lazy(new OooOO0(i));
        f45027OooO0OO = LazyKt.lazy(new OooOO0O(i));
        f45028OooO0Oo = LazyKt.lazy(new OooOOO0(i));
        int i2 = 1;
        f45030OooO0o0 = LazyKt.lazy(new am(i2));
        f45029OooO0o = LazyKt.lazy(new bm(i2));
    }

    public static void OooO00o(@NotNull OkHttpClient.Builder builder) {
        Object objM7825constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (p447o0Ooo00.OooOOO0.OooOO0O()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{"com.yalla.android.netmonitor.MonitorInterceptor", "com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitWeakNetworkInterceptor"}).iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type okhttp3.Interceptor");
                builder.addInterceptor((Interceptor) objNewInstance);
            }
            objM7825constructorimpl = Result.m7825constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM7828exceptionOrNullimpl = Result.m7828exceptionOrNullimpl(objM7825constructorimpl);
        if (thM7828exceptionOrNullimpl == null || (string = thM7828exceptionOrNullimpl.toString()) == null || StringsKt.isBlank(string)) {
            return;
        }
        androidx.lifecycle.OooO0O0 oooO0O0OooO00o = o00OOO0.OooO00o(string, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            oooO0O0OooO00o.run();
        } else {
            o0o0Oo.OooO0OO().post(oooO0O0OooO00o);
        }
    }

    public static void OooO0O0(@NotNull OkHttpClient.Builder builder) {
        Object objM7825constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (p447o0Ooo00.OooOOO0.OooOO0O()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.listOf("com.didichuxing.doraemonkit.kit.network.okhttp.interceptor.DokitMockInterceptor").iterator();
            while (it.hasNext()) {
                Object objNewInstance = Class.forName((String) it.next()).newInstance();
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type okhttp3.Interceptor");
                builder.addInterceptor((Interceptor) objNewInstance);
            }
            objM7825constructorimpl = Result.m7825constructorimpl(builder.addInterceptor(new p474o0o000O0.o000oOoO()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM7828exceptionOrNullimpl = Result.m7828exceptionOrNullimpl(objM7825constructorimpl);
        if (thM7828exceptionOrNullimpl == null || (string = thM7828exceptionOrNullimpl.toString()) == null || StringsKt.isBlank(string)) {
            return;
        }
        androidx.lifecycle.OooO0O0 oooO0O0OooO00o = o00OOO0.OooO00o(string, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            oooO0O0OooO00o.run();
        } else {
            o0o0Oo.OooO0OO().post(oooO0O0OooO00o);
        }
    }

    public static Retrofit.Builder OooO0OO() {
        Retrofit.Builder builderClient = new Retrofit.Builder().client((OkHttpClient) f45025OooO00o.getValue());
        JsonUtil.f27146OooO00o.getClass();
        Retrofit.Builder builderAddConverterFactory = builderClient.addConverterFactory(GsonConverterFactory.create(JsonUtil.OooO0O0()));
        Intrinsics.checkNotNullExpressionValue(builderAddConverterFactory, "addConverterFactory(...)");
        return builderAddConverterFactory;
    }
}
