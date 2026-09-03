package com.common.support.okhttpforsdk;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.oo0oOO0;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/common/support/okhttpforsdk/HttpService;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "", "createHttpLoggerInterceptor", "Lo0ooO0oO/o00OOOO0$OooO00o;", "createBuilderInner", "Lcom/common/support/okhttpforsdk/Config;", "config", "init", "Lo0ooO0oO/o00OOOO0;", "createClient", "setLogLevel", "", "isLoggable$lib_release", "()Z", "isLoggable", "", "DEFAULT_TAG", "Ljava/lang/String;", "defaultConfig", "Lcom/common/support/okhttpforsdk/Config;", "Lcom/common/support/okhttpforsdk/HttpLogger;", "httpLogger", "Lcom/common/support/okhttpforsdk/HttpLogger;", "Lokhttp3/logging/HttpLoggingInterceptor;", "logInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "<set-?>", "defaultClient", "Lo0ooO0oO/o00OOOO0;", "getDefaultClient", "()Lo0ooO0oO/o00OOOO0;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HttpService {

    @NotNull
    public static final String DEFAULT_TAG = "HttpService";

    @NotNull
    public static final HttpService INSTANCE = new HttpService();

    @NotNull
    private static Config config;
    private static o00OOOO0 defaultClient;

    @NotNull
    private static final Config defaultConfig;

    @Nullable
    private static HttpLogger httpLogger;

    @Nullable
    private static HttpLoggingInterceptor logInterceptor;

    static {
        Config config2 = new Config(null, null, null, null, null, null, false, 127, null);
        defaultConfig = config2;
        config = config2;
    }

    private HttpService() {
    }

    private final o00OOOO0.OooO00o createBuilderInner() {
        X509TrustManager trustManagers;
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        oooO00o.f57307OooOo0o = o0O000o0.OooO0O0(300L, unit);
        oooO00o.OooO0OO(30L, unit);
        oooO00o.OooO0Oo(20L, unit);
        oooO00o.OooO0o(0L, TimeUnit.MILLISECONDS);
        SSLSocketFactory sslSocketFactory = config.getSslSocketFactory();
        if (sslSocketFactory != null && (trustManagers = config.getTrustManagers()) != null) {
            oooO00o.OooO0o0(sslSocketFactory, trustManagers);
        }
        ExecutorService executorService = config.getExecutor();
        if (executorService != null) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            oo0oOO0 dispatcher = new oo0oOO0();
            dispatcher.f57381OooO00o = executorService;
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(dispatcher, "<set-?>");
            oooO00o.f57285OooO00o = dispatcher;
        }
        o00OO00O.OooO0OO eventListenerFactory = config.getEventListenerFactory();
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "<set-?>");
        oooO00o.f57290OooO0o0 = eventListenerFactory;
        oooO00o.f57289OooO0o = false;
        return oooO00o;
    }

    private final void createHttpLoggerInterceptor(HttpLoggingInterceptor.Level level) {
        config.setHttpLogLevel(level);
        HttpLogger httpLogger2 = new HttpLogger(config.getHttpLogTag());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(httpLogger2);
        httpLogger = httpLogger2;
        logInterceptor = httpLoggingInterceptor;
        HttpLoggingInterceptor.Level httpLogLevel = config.getHttpLogLevel();
        Intrinsics.checkNotNullParameter(httpLogLevel, "<set-?>");
        httpLoggingInterceptor.f60863OooO0O0 = httpLogLevel;
    }

    public static /* synthetic */ void init$default(HttpService httpService, Config config2, int i, Object obj) {
        if ((i & 1) != 0) {
            config2 = defaultConfig;
        }
        httpService.init(config2);
    }

    @NotNull
    public final o00OOOO0 createClient() {
        o00OOOO0.OooO00o oooO00oCreateBuilderInner = createBuilderInner();
        createHttpLoggerInterceptor(config.getHttpLogLevel());
        HttpLoggingInterceptor httpLoggingInterceptor = logInterceptor;
        Intrinsics.checkNotNull(httpLoggingInterceptor);
        oooO00oCreateBuilderInner.OooO00o(httpLoggingInterceptor);
        defaultClient = new o00OOOO0(oooO00oCreateBuilderInner);
        return getDefaultClient();
    }

    @NotNull
    public final o00OOOO0 getDefaultClient() {
        o00OOOO0 o00oooo1 = defaultClient;
        if (o00oooo1 != null) {
            return o00oooo1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultClient");
        return null;
    }

    public final void init(@NotNull Config config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
    }

    public final boolean isLoggable$lib_release() {
        return config.getIsLoggable();
    }

    public final void setLogLevel(@NotNull o00OOOO0 o00oooo1, @NotNull HttpLoggingInterceptor.Level level) {
        Object next;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(level, "level");
        Iterator<T> it = o00oooo1.f57257OooO0o.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((o00OOO00) next) instanceof HttpLoggingInterceptor));
        o00OOO00 o00ooo01 = (o00OOO00) next;
        if (o00ooo01 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        ((HttpLoggingInterceptor) o00ooo01).f60863OooO0O0 = level;
    }
}
