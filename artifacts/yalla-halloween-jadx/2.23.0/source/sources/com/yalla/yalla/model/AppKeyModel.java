package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003Jw\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u0006:"}, d2 = {"Lcom/yalla/yalla/model/AppKeyModel;", "", "twitter", "Lcom/yalla/yalla/model/KeyInfo;", AccessToken.DEFAULT_GRAPH_DOMAIN, FacebookSdk.INSTAGRAM, "wechat", "zego", "agora", "umeng", "appsFlyer", "appsMessage", "androidSmKey", "chatKey", "(Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;Lcom/yalla/yalla/model/KeyInfo;)V", "getAgora", "()Lcom/yalla/yalla/model/KeyInfo;", "setAgora", "(Lcom/yalla/yalla/model/KeyInfo;)V", "getAndroidSmKey", "setAndroidSmKey", "getAppsFlyer", "setAppsFlyer", "getAppsMessage", "setAppsMessage", "getChatKey", "setChatKey", "getFacebook", "setFacebook", "getInstagram", "setInstagram", "getTwitter", "setTwitter", "getUmeng", "setUmeng", "getWechat", "setWechat", "getZego", "setZego", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppKeyModel {
    public static final int $stable = 8;

    @NotNull
    private KeyInfo agora;

    @NotNull
    private KeyInfo androidSmKey;

    @NotNull
    private KeyInfo appsFlyer;

    @NotNull
    private KeyInfo appsMessage;

    @NotNull
    private KeyInfo chatKey;

    @NotNull
    private KeyInfo facebook;

    @NotNull
    private KeyInfo instagram;

    @NotNull
    private KeyInfo twitter;

    @NotNull
    private KeyInfo umeng;

    @NotNull
    private KeyInfo wechat;

    @NotNull
    private KeyInfo zego;

    public AppKeyModel(@NotNull KeyInfo twitter, @NotNull KeyInfo facebook, @NotNull KeyInfo instagram, @NotNull KeyInfo wechat, @NotNull KeyInfo zego, @NotNull KeyInfo agora, @NotNull KeyInfo umeng, @NotNull KeyInfo appsFlyer, @NotNull KeyInfo appsMessage, @NotNull KeyInfo androidSmKey, @NotNull KeyInfo chatKey) {
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(instagram, "instagram");
        Intrinsics.checkNotNullParameter(wechat, "wechat");
        Intrinsics.checkNotNullParameter(zego, "zego");
        Intrinsics.checkNotNullParameter(agora, "agora");
        Intrinsics.checkNotNullParameter(umeng, "umeng");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(appsMessage, "appsMessage");
        Intrinsics.checkNotNullParameter(androidSmKey, "androidSmKey");
        Intrinsics.checkNotNullParameter(chatKey, "chatKey");
        this.twitter = twitter;
        this.facebook = facebook;
        this.instagram = instagram;
        this.wechat = wechat;
        this.zego = zego;
        this.agora = agora;
        this.umeng = umeng;
        this.appsFlyer = appsFlyer;
        this.appsMessage = appsMessage;
        this.androidSmKey = androidSmKey;
        this.chatKey = chatKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KeyInfo getTwitter() {
        return this.twitter;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final KeyInfo getAndroidSmKey() {
        return this.androidSmKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final KeyInfo getChatKey() {
        return this.chatKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KeyInfo getFacebook() {
        return this.facebook;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KeyInfo getInstagram() {
        return this.instagram;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final KeyInfo getWechat() {
        return this.wechat;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final KeyInfo getZego() {
        return this.zego;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final KeyInfo getAgora() {
        return this.agora;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final KeyInfo getUmeng() {
        return this.umeng;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final KeyInfo getAppsFlyer() {
        return this.appsFlyer;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final KeyInfo getAppsMessage() {
        return this.appsMessage;
    }

    @NotNull
    public final AppKeyModel copy(@NotNull KeyInfo twitter, @NotNull KeyInfo facebook, @NotNull KeyInfo instagram, @NotNull KeyInfo wechat, @NotNull KeyInfo zego, @NotNull KeyInfo agora, @NotNull KeyInfo umeng, @NotNull KeyInfo appsFlyer, @NotNull KeyInfo appsMessage, @NotNull KeyInfo androidSmKey, @NotNull KeyInfo chatKey) {
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(instagram, "instagram");
        Intrinsics.checkNotNullParameter(wechat, "wechat");
        Intrinsics.checkNotNullParameter(zego, "zego");
        Intrinsics.checkNotNullParameter(agora, "agora");
        Intrinsics.checkNotNullParameter(umeng, "umeng");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(appsMessage, "appsMessage");
        Intrinsics.checkNotNullParameter(androidSmKey, "androidSmKey");
        Intrinsics.checkNotNullParameter(chatKey, "chatKey");
        return new AppKeyModel(twitter, facebook, instagram, wechat, zego, agora, umeng, appsFlyer, appsMessage, androidSmKey, chatKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppKeyModel)) {
            return false;
        }
        AppKeyModel appKeyModel = (AppKeyModel) other;
        return Intrinsics.areEqual(this.twitter, appKeyModel.twitter) && Intrinsics.areEqual(this.facebook, appKeyModel.facebook) && Intrinsics.areEqual(this.instagram, appKeyModel.instagram) && Intrinsics.areEqual(this.wechat, appKeyModel.wechat) && Intrinsics.areEqual(this.zego, appKeyModel.zego) && Intrinsics.areEqual(this.agora, appKeyModel.agora) && Intrinsics.areEqual(this.umeng, appKeyModel.umeng) && Intrinsics.areEqual(this.appsFlyer, appKeyModel.appsFlyer) && Intrinsics.areEqual(this.appsMessage, appKeyModel.appsMessage) && Intrinsics.areEqual(this.androidSmKey, appKeyModel.androidSmKey) && Intrinsics.areEqual(this.chatKey, appKeyModel.chatKey);
    }

    @NotNull
    public final KeyInfo getAgora() {
        return this.agora;
    }

    @NotNull
    public final KeyInfo getAndroidSmKey() {
        return this.androidSmKey;
    }

    @NotNull
    public final KeyInfo getAppsFlyer() {
        return this.appsFlyer;
    }

    @NotNull
    public final KeyInfo getAppsMessage() {
        return this.appsMessage;
    }

    @NotNull
    public final KeyInfo getChatKey() {
        return this.chatKey;
    }

    @NotNull
    public final KeyInfo getFacebook() {
        return this.facebook;
    }

    @NotNull
    public final KeyInfo getInstagram() {
        return this.instagram;
    }

    @NotNull
    public final KeyInfo getTwitter() {
        return this.twitter;
    }

    @NotNull
    public final KeyInfo getUmeng() {
        return this.umeng;
    }

    @NotNull
    public final KeyInfo getWechat() {
        return this.wechat;
    }

    @NotNull
    public final KeyInfo getZego() {
        return this.zego;
    }

    public int hashCode() {
        return this.chatKey.hashCode() + ((this.androidSmKey.hashCode() + ((this.appsMessage.hashCode() + ((this.appsFlyer.hashCode() + ((this.umeng.hashCode() + ((this.agora.hashCode() + ((this.zego.hashCode() + ((this.wechat.hashCode() + ((this.instagram.hashCode() + ((this.facebook.hashCode() + (this.twitter.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAgora(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.agora = keyInfo;
    }

    public final void setAndroidSmKey(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.androidSmKey = keyInfo;
    }

    public final void setAppsFlyer(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.appsFlyer = keyInfo;
    }

    public final void setAppsMessage(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.appsMessage = keyInfo;
    }

    public final void setChatKey(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.chatKey = keyInfo;
    }

    public final void setFacebook(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.facebook = keyInfo;
    }

    public final void setInstagram(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.instagram = keyInfo;
    }

    public final void setTwitter(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.twitter = keyInfo;
    }

    public final void setUmeng(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.umeng = keyInfo;
    }

    public final void setWechat(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.wechat = keyInfo;
    }

    public final void setZego(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "<set-?>");
        this.zego = keyInfo;
    }

    @NotNull
    public String toString() {
        return "AppKeyModel(twitter=" + this.twitter + ", facebook=" + this.facebook + ", instagram=" + this.instagram + ", wechat=" + this.wechat + ", zego=" + this.zego + ", agora=" + this.agora + ", umeng=" + this.umeng + ", appsFlyer=" + this.appsFlyer + ", appsMessage=" + this.appsMessage + ", androidSmKey=" + this.androidSmKey + ", chatKey=" + this.chatKey + ")";
    }
}
