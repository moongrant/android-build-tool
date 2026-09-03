package com.common.support.apm;

import com.common.support.apm.base.Env;
import com.common.support.apm.xlog.FileLogConfig;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u00020\u00068AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/common/support/apm/SailfishConfiguration;", "", "builder", "Lcom/common/support/apm/SailfishConfiguration$Builder;", "(Lcom/common/support/apm/SailfishConfiguration$Builder;)V", "env", "Lcom/common/support/apm/base/Env;", "()Lcom/common/support/apm/base/Env;", "setEnv$sailfish_release", "(Lcom/common/support/apm/base/Env;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "setExecutorService$sailfish_release", "(Ljava/util/concurrent/ExecutorService;)V", "fileLogConfig", "Lcom/common/support/apm/xlog/FileLogConfig;", "()Lcom/common/support/apm/xlog/FileLogConfig;", "setFileLogConfig$sailfish_release", "(Lcom/common/support/apm/xlog/FileLogConfig;)V", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactory$sailfish_release", "(Ljavax/net/ssl/SSLSocketFactory;)V", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "setTrustManager$sailfish_release", "(Ljavax/net/ssl/X509TrustManager;)V", "Builder", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SailfishConfiguration {

    @NotNull
    private Env env;

    @Nullable
    private ExecutorService executorService;

    @NotNull
    private FileLogConfig fileLogConfig;

    @Nullable
    private SSLSocketFactory sslSocketFactory;

    @Nullable
    private X509TrustManager trustManager;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0010J\u0016\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/common/support/apm/SailfishConfiguration$Builder;", "", "()V", "env", "Lcom/common/support/apm/base/Env;", "getEnv$sailfish_release", "()Lcom/common/support/apm/base/Env;", "setEnv$sailfish_release", "(Lcom/common/support/apm/base/Env;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$sailfish_release", "()Ljava/util/concurrent/ExecutorService;", "setExecutorService$sailfish_release", "(Ljava/util/concurrent/ExecutorService;)V", "fileLogConfig", "Lcom/common/support/apm/xlog/FileLogConfig;", "getFileLogConfig$sailfish_release", "()Lcom/common/support/apm/xlog/FileLogConfig;", "setFileLogConfig$sailfish_release", "(Lcom/common/support/apm/xlog/FileLogConfig;)V", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory$sailfish_release", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactory$sailfish_release", "(Ljavax/net/ssl/SSLSocketFactory;)V", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "getTrustManager$sailfish_release", "()Ljavax/net/ssl/X509TrustManager;", "setTrustManager$sailfish_release", "(Ljavax/net/ssl/X509TrustManager;)V", "build", "Lcom/common/support/apm/SailfishConfiguration;", "setEnv", "setExecutorService", "setFileLogConfig", "config", "setSslSocketFactory", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private Env env = Env.pro;

        @Nullable
        private ExecutorService executorService;
        public FileLogConfig fileLogConfig;

        @Nullable
        private SSLSocketFactory sslSocketFactory;

        @Nullable
        private X509TrustManager trustManager;

        @NotNull
        public final SailfishConfiguration build() {
            if (this.fileLogConfig != null) {
                return new SailfishConfiguration(this);
            }
            throw new UninitializedPropertyAccessException("Property fileLogConfig is uninitialized ");
        }

        @NotNull
        /* JADX INFO: renamed from: getEnv$sailfish_release, reason: from getter */
        public final Env getEnv() {
            return this.env;
        }

        @Nullable
        /* JADX INFO: renamed from: getExecutorService$sailfish_release, reason: from getter */
        public final ExecutorService getExecutorService() {
            return this.executorService;
        }

        @NotNull
        public final FileLogConfig getFileLogConfig$sailfish_release() {
            FileLogConfig fileLogConfig = this.fileLogConfig;
            if (fileLogConfig != null) {
                return fileLogConfig;
            }
            Intrinsics.throwUninitializedPropertyAccessException("fileLogConfig");
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: getSslSocketFactory$sailfish_release, reason: from getter */
        public final SSLSocketFactory getSslSocketFactory() {
            return this.sslSocketFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: getTrustManager$sailfish_release, reason: from getter */
        public final X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        @NotNull
        public final Builder setEnv(@NotNull Env env) {
            Intrinsics.checkNotNullParameter(env, "env");
            this.env = env;
            return this;
        }

        public final void setEnv$sailfish_release(@NotNull Env env) {
            Intrinsics.checkNotNullParameter(env, "<set-?>");
            this.env = env;
        }

        @NotNull
        public final Builder setExecutorService(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            this.executorService = executorService;
            return this;
        }

        public final void setExecutorService$sailfish_release(@Nullable ExecutorService executorService) {
            this.executorService = executorService;
        }

        @NotNull
        public final Builder setFileLogConfig(@NotNull FileLogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            setFileLogConfig$sailfish_release(config);
            return this;
        }

        public final void setFileLogConfig$sailfish_release(@NotNull FileLogConfig fileLogConfig) {
            Intrinsics.checkNotNullParameter(fileLogConfig, "<set-?>");
            this.fileLogConfig = fileLogConfig;
        }

        @NotNull
        public final Builder setSslSocketFactory(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            this.sslSocketFactory = sslSocketFactory;
            this.trustManager = trustManager;
            return this;
        }

        public final void setSslSocketFactory$sailfish_release(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
        }

        public final void setTrustManager$sailfish_release(@Nullable X509TrustManager x509TrustManager) {
            this.trustManager = x509TrustManager;
        }
    }

    public SailfishConfiguration(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.executorService = builder.getExecutorService();
        this.sslSocketFactory = builder.getSslSocketFactory();
        this.trustManager = builder.getTrustManager();
        this.env = builder.getEnv();
        this.fileLogConfig = builder.getFileLogConfig$sailfish_release();
    }

    @JvmName(name = "env")
    @NotNull
    /* JADX INFO: renamed from: env, reason: from getter */
    public final Env getEnv() {
        return this.env;
    }

    @JvmName(name = "executorService")
    @Nullable
    /* JADX INFO: renamed from: executorService, reason: from getter */
    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    @JvmName(name = "fileLogConfig")
    @NotNull
    /* JADX INFO: renamed from: fileLogConfig, reason: from getter */
    public final FileLogConfig getFileLogConfig() {
        return this.fileLogConfig;
    }

    public final void setEnv$sailfish_release(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "<set-?>");
        this.env = env;
    }

    public final void setExecutorService$sailfish_release(@Nullable ExecutorService executorService) {
        this.executorService = executorService;
    }

    public final void setFileLogConfig$sailfish_release(@NotNull FileLogConfig fileLogConfig) {
        Intrinsics.checkNotNullParameter(fileLogConfig, "<set-?>");
        this.fileLogConfig = fileLogConfig;
    }

    public final void setSslSocketFactory$sailfish_release(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public final void setTrustManager$sailfish_release(@Nullable X509TrustManager x509TrustManager) {
        this.trustManager = x509TrustManager;
    }

    @JvmName(name = "sslSocketFactory")
    @Nullable
    /* JADX INFO: renamed from: sslSocketFactory, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @JvmName(name = "trustManager")
    @Nullable
    /* JADX INFO: renamed from: trustManager, reason: from getter */
    public final X509TrustManager getTrustManager() {
        return this.trustManager;
    }
}
