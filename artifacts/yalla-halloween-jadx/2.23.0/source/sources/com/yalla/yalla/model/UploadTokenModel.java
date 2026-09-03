package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/UploadTokenModel;", "", "()V", "bucket", "", "getBucket", "()Ljava/lang/String;", "setBucket", "(Ljava/lang/String;)V", "domain", "getDomain", "setDomain", "fileName", "getFileName", "setFileName", "identityId", "getIdentityId", "setIdentityId", "poolId", "getPoolId", "setPoolId", "providerName", "getProviderName", "setProviderName", "region", "getRegion", "setRegion", "upAK", "getUpAK", "setUpAK", "upToken", "getUpToken", "setUpToken", "upType", "getUpType", "setUpType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UploadTokenModel {
    public static final int $stable = 8;

    @SerializedName("uptype")
    @NotNull
    private String upType = "";

    @SerializedName("filename")
    @NotNull
    private String fileName = "";

    @SerializedName("upak")
    @NotNull
    private String upAK = "";

    @NotNull
    private String bucket = "";

    @SerializedName("uptoken")
    @NotNull
    private String upToken = "";

    @SerializedName("identityid")
    @NotNull
    private String identityId = "";

    @SerializedName("poolid")
    @NotNull
    private String poolId = "";

    @SerializedName("logins")
    @NotNull
    private String providerName = "";

    @NotNull
    private String region = "";

    @SerializedName("domain")
    @NotNull
    private String domain = "";

    @NotNull
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getIdentityId() {
        return this.identityId;
    }

    @NotNull
    public final String getPoolId() {
        return this.poolId;
    }

    @NotNull
    public final String getProviderName() {
        return this.providerName;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getUpAK() {
        return this.upAK;
    }

    @NotNull
    public final String getUpToken() {
        return this.upToken;
    }

    @NotNull
    public final String getUpType() {
        return this.upType;
    }

    public final void setBucket(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bucket = str;
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setIdentityId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identityId = str;
    }

    public final void setPoolId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.poolId = str;
    }

    public final void setProviderName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.providerName = str;
    }

    public final void setRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.region = str;
    }

    public final void setUpAK(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upAK = str;
    }

    public final void setUpToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upToken = str;
    }

    public final void setUpType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.upType = str;
    }
}
