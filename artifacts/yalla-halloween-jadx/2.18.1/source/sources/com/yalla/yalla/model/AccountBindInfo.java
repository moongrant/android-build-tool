package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020'R2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001a\u0010!\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010¨\u0006("}, d2 = {"Lcom/yalla/yalla/model/AccountBindInfo;", "Ljava/io/Serializable;", "()V", "bindingInfo", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/BindingInfo;", "Lkotlin/collections/ArrayList;", "getBindingInfo", "()Ljava/util/ArrayList;", "setBindingInfo", "(Ljava/util/ArrayList;)V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "isFb", "setFb", "isGg", "setGg", "isIg", "setIg", "isIos", "setIos", "isPh", "setPh", "isQq", "setQq", "isTt", "setTt", "isWx", "setWx", "isWxRp", "setWxRp", "isYc", "setYc", "getAccount", "type", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AccountBindInfo implements Serializable {
    public static final int $stable = 8;

    @SerializedName("bindingInfo")
    @Nullable
    private ArrayList<BindingInfo> bindingInfo;

    @NotNull
    private String isFb = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isYc = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isPh = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isWx = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isQq = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isWxRp = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isIg = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isGg = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isTt = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String isIos = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @NotNull
    private String countryCode = "";

    @NotNull
    public final String getAccount(int type) {
        String account;
        ArrayList<BindingInfo> arrayList = this.bindingInfo;
        BindingInfo bindingInfo = null;
        Object obj = null;
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                if (((BindingInfo) obj2).getSources() == type) {
                    obj = obj2;
                    break;
                }
            }
            bindingInfo = (BindingInfo) obj;
        }
        return (bindingInfo == null || (account = bindingInfo.getAccount()) == null) ? "" : account;
    }

    @Nullable
    public final ArrayList<BindingInfo> getBindingInfo() {
        return this.bindingInfo;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: isFb, reason: from getter */
    public final String getIsFb() {
        return this.isFb;
    }

    @NotNull
    /* JADX INFO: renamed from: isGg, reason: from getter */
    public final String getIsGg() {
        return this.isGg;
    }

    @NotNull
    /* JADX INFO: renamed from: isIg, reason: from getter */
    public final String getIsIg() {
        return this.isIg;
    }

    @NotNull
    /* JADX INFO: renamed from: isIos, reason: from getter */
    public final String getIsIos() {
        return this.isIos;
    }

    @NotNull
    /* JADX INFO: renamed from: isPh, reason: from getter */
    public final String getIsPh() {
        return this.isPh;
    }

    @NotNull
    /* JADX INFO: renamed from: isQq, reason: from getter */
    public final String getIsQq() {
        return this.isQq;
    }

    @NotNull
    /* JADX INFO: renamed from: isTt, reason: from getter */
    public final String getIsTt() {
        return this.isTt;
    }

    @NotNull
    /* JADX INFO: renamed from: isWx, reason: from getter */
    public final String getIsWx() {
        return this.isWx;
    }

    @NotNull
    /* JADX INFO: renamed from: isWxRp, reason: from getter */
    public final String getIsWxRp() {
        return this.isWxRp;
    }

    @NotNull
    /* JADX INFO: renamed from: isYc, reason: from getter */
    public final String getIsYc() {
        return this.isYc;
    }

    public final void setBindingInfo(@Nullable ArrayList<BindingInfo> arrayList) {
        this.bindingInfo = arrayList;
    }

    public final void setCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setFb(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isFb = str;
    }

    public final void setGg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isGg = str;
    }

    public final void setIg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isIg = str;
    }

    public final void setIos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isIos = str;
    }

    public final void setPh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isPh = str;
    }

    public final void setQq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isQq = str;
    }

    public final void setTt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isTt = str;
    }

    public final void setWx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isWx = str;
    }

    public final void setWxRp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isWxRp = str;
    }

    public final void setYc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isYc = str;
    }
}
