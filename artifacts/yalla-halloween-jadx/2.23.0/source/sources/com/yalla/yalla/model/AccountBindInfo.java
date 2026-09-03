package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dR2\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/AccountBindInfo;", "Ljava/io/Serializable;", "()V", "bindingInfo", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/BindingInfo;", "Lkotlin/collections/ArrayList;", "getBindingInfo", "()Ljava/util/ArrayList;", "setBindingInfo", "(Ljava/util/ArrayList;)V", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "isFb", "setFb", "isPh", "setPh", "isTt", "setTt", "isYc", "setYc", "getAccount", "type", "", "isBindFacebook", "", "isBindPhone", "isBindTwitter", "isBindYallaChat", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountBindInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBindInfo.kt\ncom/yalla/yalla/model/AccountBindInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
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
    private String isTt = AppEventsConstants.EVENT_PARAM_VALUE_NO;

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

    public final boolean isBindFacebook() {
        return (StringsKt.isBlank(this.isFb) ^ true) && !Intrinsics.areEqual(this.isFb, AppEventsConstants.EVENT_PARAM_VALUE_NO);
    }

    public final boolean isBindPhone() {
        return this.isPh.length() > 4;
    }

    public final boolean isBindTwitter() {
        return (StringsKt.isBlank(this.isTt) ^ true) && !Intrinsics.areEqual(this.isTt, AppEventsConstants.EVENT_PARAM_VALUE_NO);
    }

    public final boolean isBindYallaChat() {
        return (StringsKt.isBlank(this.isYc) ^ true) && !Intrinsics.areEqual(this.isYc, AppEventsConstants.EVENT_PARAM_VALUE_NO);
    }

    @NotNull
    /* JADX INFO: renamed from: isFb, reason: from getter */
    public final String getIsFb() {
        return this.isFb;
    }

    @NotNull
    /* JADX INFO: renamed from: isPh, reason: from getter */
    public final String getIsPh() {
        return this.isPh;
    }

    @NotNull
    /* JADX INFO: renamed from: isTt, reason: from getter */
    public final String getIsTt() {
        return this.isTt;
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

    public final void setPh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isPh = str;
    }

    public final void setTt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isTt = str;
    }

    public final void setYc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isYc = str;
    }
}
