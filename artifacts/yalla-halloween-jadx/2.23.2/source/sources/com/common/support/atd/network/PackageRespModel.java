package com.common.support.atd.network;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/common/support/atd/network/PackageRespModel;", "", "()V", "addPackages", "", "getAddPackages", "()Ljava/lang/String;", "setAddPackages", "(Ljava/lang/String;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "latestVersionHex", "getLatestVersionHex", "setLatestVersionHex", "modifyPackages", "getModifyPackages", "setModifyPackages", "PackageModel", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PackageRespModel {
    private int count;

    @NotNull
    private String latestVersionHex = "";

    @NotNull
    private String addPackages = "";

    @NotNull
    private String modifyPackages = "";

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/common/support/atd/network/PackageRespModel$PackageModel;", "", "()V", "pkgId", "", "getPkgId", "()I", "setPkgId", "(I)V", "pkgName", "", "getPkgName", "()Ljava/lang/String;", "setPkgName", "(Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PackageModel {
        private int pkgId;

        @NotNull
        private String pkgName = "";

        public final int getPkgId() {
            return this.pkgId;
        }

        @NotNull
        public final String getPkgName() {
            return this.pkgName;
        }

        public final void setPkgId(int i) {
            this.pkgId = i;
        }

        public final void setPkgName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.pkgName = str;
        }
    }

    @NotNull
    public final String getAddPackages() {
        return this.addPackages;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getLatestVersionHex() {
        return this.latestVersionHex;
    }

    @NotNull
    public final String getModifyPackages() {
        return this.modifyPackages;
    }

    public final void setAddPackages(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addPackages = str;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setLatestVersionHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latestVersionHex = str;
    }

    public final void setModifyPackages(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modifyPackages = str;
    }
}
