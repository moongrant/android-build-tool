package com.common.support.atd.network;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/common/support/atd/network/PackageRespModel;", "", "", "count", "I", "getCount", "()I", "setCount", "(I)V", "", "latestVersionHex", "Ljava/lang/String;", "getLatestVersionHex", "()Ljava/lang/String;", "setLatestVersionHex", "(Ljava/lang/String;)V", "addPackages", "getAddPackages", "setAddPackages", "modifyPackages", "getModifyPackages", "setModifyPackages", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PackageRespModel {
    private int count;

    @NotNull
    private String latestVersionHex = "";

    @NotNull
    private String addPackages = "";

    @NotNull
    private String modifyPackages = "";

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
