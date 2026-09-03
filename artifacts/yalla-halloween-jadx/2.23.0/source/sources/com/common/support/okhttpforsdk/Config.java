package com.common.support.okhttpforsdk;

import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OO00O;
import p635o0ooO0oo.o0O000Oo;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006*"}, d2 = {"Lcom/common/support/okhttpforsdk/Config;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "httpLogLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getHttpLogLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "setHttpLogLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "", "httpLogTag", "Ljava/lang/String;", "getHttpLogTag", "()Ljava/lang/String;", "setHttpLogTag", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "trustManagers", "Ljavax/net/ssl/X509TrustManager;", "getTrustManagers", "()Ljavax/net/ssl/X509TrustManager;", "Lo0ooO0oO/o00OO00O$OooO0OO;", "eventListenerFactory", "Lo0ooO0oO/o00OO00O$OooO0OO;", "getEventListenerFactory", "()Lo0ooO0oO/o00OO00O$OooO0OO;", "", "isLoggable", "Z", "()Z", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lo0ooO0oO/o00OO00O$OooO0OO;Z)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Config {

    @NotNull
    private final o00OO00O.OooO0OO eventListenerFactory;

    @Nullable
    private final ExecutorService executor;

    @NotNull
    private HttpLoggingInterceptor.Level httpLogLevel;

    @NotNull
    private String httpLogTag;
    private final boolean isLoggable;

    @Nullable
    private final SSLSocketFactory sslSocketFactory;

    @Nullable
    private final X509TrustManager trustManagers;

    public Config() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    @NotNull
    public final o00OO00O.OooO0OO getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Nullable
    public final ExecutorService getExecutor() {
        return this.executor;
    }

    @NotNull
    public final HttpLoggingInterceptor.Level getHttpLogLevel() {
        return this.httpLogLevel;
    }

    @NotNull
    public final String getHttpLogTag() {
        return this.httpLogTag;
    }

    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Nullable
    public final X509TrustManager getTrustManagers() {
        return this.trustManagers;
    }

    /* JADX INFO: renamed from: isLoggable, reason: from getter */
    public final boolean getIsLoggable() {
        return this.isLoggable;
    }

    public final void setHttpLogLevel(@NotNull HttpLoggingInterceptor.Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.httpLogLevel = level;
    }

    public final void setHttpLogTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.httpLogTag = str;
    }

    public Config(@NotNull HttpLoggingInterceptor.Level httpLogLevel, @NotNull String httpLogTag, @Nullable ExecutorService executorService, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable X509TrustManager x509TrustManager, @NotNull o00OO00O.OooO0OO eventListenerFactory, boolean z) {
        Intrinsics.checkNotNullParameter(httpLogLevel, "httpLogLevel");
        Intrinsics.checkNotNullParameter(httpLogTag, "httpLogTag");
        Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
        this.httpLogLevel = httpLogLevel;
        this.httpLogTag = httpLogTag;
        this.executor = executorService;
        this.sslSocketFactory = sSLSocketFactory;
        this.trustManagers = x509TrustManager;
        this.eventListenerFactory = eventListenerFactory;
        this.isLoggable = z;
    }

    public Config(HttpLoggingInterceptor.Level level, String str, ExecutorService executorService, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, o00OO00O.OooO0OO oooO0OO, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        level = (i & 1) != 0 ? HttpLoggingInterceptor.Level.BODY : level;
        String str2 = (i & 2) != 0 ? HttpService.DEFAULT_TAG : str;
        ExecutorService executorService2 = (i & 4) != 0 ? null : executorService;
        SSLSocketFactory sSLSocketFactory2 = (i & 8) != 0 ? null : sSLSocketFactory;
        X509TrustManager x509TrustManager2 = (i & 16) == 0 ? x509TrustManager : null;
        if ((i & 32) != 0) {
            o00OO00O o00oo00o = o00OO00O.NONE;
            byte[] bArr = o0O000o0.f57386OooO00o;
            Intrinsics.checkNotNullParameter(o00oo00o, "<this>");
            oooO0OO = new o0O000Oo(o00oo00o);
        }
        this(level, str2, executorService2, sSLSocketFactory2, x509TrustManager2, oooO0OO, (i & 64) != 0 ? false : z);
    }
}
