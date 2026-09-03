package com.common.support.apm.xlog;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/common/support/apm/xlog/FileLogConfig;", "", "builder", "Lcom/common/support/apm/xlog/FileLogConfig$Builder;", "(Lcom/common/support/apm/xlog/FileLogConfig$Builder;)V", "isDeleteLogWhenUploadSucceeded", "", "isDeleteLogWhenUploadSucceeded$sailfish_release", "()Z", "setDeleteLogWhenUploadSucceeded$sailfish_release", "(Z)V", "logDir", "", "getLogDir$sailfish_release", "()Ljava/lang/String;", "logLevel", "", "getLogLevel$sailfish_release", "()I", "namePrefix", "getNamePrefix$sailfish_release", "setNamePrefix$sailfish_release", "(Ljava/lang/String;)V", "publicKey", "getPublicKey$sailfish_release$annotations", "()V", "getPublicKey$sailfish_release", "setPublicKey$sailfish_release", "Builder", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FileLogConfig {
    private boolean isDeleteLogWhenUploadSucceeded;

    @NotNull
    private final String logDir;
    private final int logLevel;

    @NotNull
    private String namePrefix;

    @NotNull
    private String publicKey;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u000e8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\u00020\t8AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/common/support/apm/xlog/FileLogConfig$Builder;", "", "()V", "isDeleteLogWhenUploadSucceeded", "", "()Z", "setDeleteLogWhenUploadSucceeded$sailfish_release", "(Z)V", "logDir", "", "()Ljava/lang/String;", "setLogDir$sailfish_release", "(Ljava/lang/String;)V", "logLevel", "", "()I", "setLogLevel$sailfish_release", "(I)V", "namePrefix", "setNamePrefix$sailfish_release", "publicKey", "setPublicKey$sailfish_release", "build", "Lcom/common/support/apm/xlog/FileLogConfig;", "bool", "setLogDir", "setLogLevel", "level", "setNamePrefix", "setPublicKey", "key", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private String logDir = "";
        private int logLevel = 1;

        @NotNull
        private String publicKey = "";

        @NotNull
        private String namePrefix = "";
        private boolean isDeleteLogWhenUploadSucceeded = true;

        @NotNull
        public final FileLogConfig build() {
            if (StringsKt.isBlank(this.logDir)) {
                throw new IllegalArgumentException("Log dir can not be empty!");
            }
            return new FileLogConfig(this, null);
        }

        @JvmName(name = "isDeleteLogWhenUploadSucceeded")
        /* JADX INFO: renamed from: isDeleteLogWhenUploadSucceeded, reason: from getter */
        public final boolean getIsDeleteLogWhenUploadSucceeded() {
            return this.isDeleteLogWhenUploadSucceeded;
        }

        @JvmName(name = "logDir")
        @NotNull
        /* JADX INFO: renamed from: logDir, reason: from getter */
        public final String getLogDir() {
            return this.logDir;
        }

        @JvmName(name = "logLevel")
        /* JADX INFO: renamed from: logLevel, reason: from getter */
        public final int getLogLevel() {
            return this.logLevel;
        }

        @JvmName(name = "namePrefix")
        @NotNull
        /* JADX INFO: renamed from: namePrefix, reason: from getter */
        public final String getNamePrefix() {
            return this.namePrefix;
        }

        @JvmName(name = "publicKey")
        @NotNull
        /* JADX INFO: renamed from: publicKey, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        public final void setDeleteLogWhenUploadSucceeded$sailfish_release(boolean z) {
            this.isDeleteLogWhenUploadSucceeded = z;
        }

        @NotNull
        public final Builder setLogDir(@NotNull String logDir) {
            Intrinsics.checkNotNullParameter(logDir, "logDir");
            this.logDir = logDir;
            return this;
        }

        public final void setLogDir$sailfish_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.logDir = str;
        }

        @NotNull
        public final Builder setLogLevel(int level) {
            this.logLevel = level;
            return this;
        }

        public final void setLogLevel$sailfish_release(int i) {
            this.logLevel = i;
        }

        @NotNull
        public final Builder setNamePrefix(@NotNull String namePrefix) {
            Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
            this.namePrefix = namePrefix;
            return this;
        }

        public final void setNamePrefix$sailfish_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.namePrefix = str;
        }

        @Deprecated(message = "Unused method")
        @NotNull
        public final Builder setPublicKey(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.publicKey = key;
            return this;
        }

        public final void setPublicKey$sailfish_release(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.publicKey = str;
        }

        @NotNull
        public final Builder isDeleteLogWhenUploadSucceeded(boolean bool) {
            this.isDeleteLogWhenUploadSucceeded = bool;
            return this;
        }
    }

    public /* synthetic */ FileLogConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Deprecated(message = "Unused")
    public static /* synthetic */ void getPublicKey$sailfish_release$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: getLogDir$sailfish_release, reason: from getter */
    public final String getLogDir() {
        return this.logDir;
    }

    /* JADX INFO: renamed from: getLogLevel$sailfish_release, reason: from getter */
    public final int getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: getNamePrefix$sailfish_release, reason: from getter */
    public final String getNamePrefix() {
        return this.namePrefix;
    }

    @NotNull
    /* JADX INFO: renamed from: getPublicKey$sailfish_release, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: isDeleteLogWhenUploadSucceeded$sailfish_release, reason: from getter */
    public final boolean getIsDeleteLogWhenUploadSucceeded() {
        return this.isDeleteLogWhenUploadSucceeded;
    }

    public final void setDeleteLogWhenUploadSucceeded$sailfish_release(boolean z) {
        this.isDeleteLogWhenUploadSucceeded = z;
    }

    public final void setNamePrefix$sailfish_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.namePrefix = str;
    }

    public final void setPublicKey$sailfish_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.publicKey = str;
    }

    private FileLogConfig(Builder builder) {
        this.logDir = builder.getLogDir();
        this.logLevel = builder.getLogLevel();
        this.publicKey = builder.getPublicKey();
        this.namePrefix = builder.getNamePrefix();
        this.isDeleteLogWhenUploadSucceeded = builder.getIsDeleteLogWhenUploadSucceeded();
    }
}
