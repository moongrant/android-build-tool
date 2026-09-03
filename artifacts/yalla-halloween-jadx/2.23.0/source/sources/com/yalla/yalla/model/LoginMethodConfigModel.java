package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/LoginMethodConfigModel;", "", "faceBook", "Lcom/yalla/yalla/model/LoginMethod;", "phone", "twitter", "weChat", "yallaChat", "(Lcom/yalla/yalla/model/LoginMethod;Lcom/yalla/yalla/model/LoginMethod;Lcom/yalla/yalla/model/LoginMethod;Lcom/yalla/yalla/model/LoginMethod;Lcom/yalla/yalla/model/LoginMethod;)V", "getFaceBook", "()Lcom/yalla/yalla/model/LoginMethod;", "getPhone", "getTwitter", "getWeChat", "getYallaChat", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LoginMethodConfigModel {
    public static final int $stable = 0;

    @NotNull
    private final LoginMethod faceBook;

    @NotNull
    private final LoginMethod phone;

    @NotNull
    private final LoginMethod twitter;

    @NotNull
    private final LoginMethod weChat;

    @NotNull
    private final LoginMethod yallaChat;

    public LoginMethodConfigModel(@NotNull LoginMethod faceBook, @NotNull LoginMethod phone, @NotNull LoginMethod twitter, @NotNull LoginMethod weChat, @NotNull LoginMethod yallaChat) {
        Intrinsics.checkNotNullParameter(faceBook, "faceBook");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        Intrinsics.checkNotNullParameter(yallaChat, "yallaChat");
        this.faceBook = faceBook;
        this.phone = phone;
        this.twitter = twitter;
        this.weChat = weChat;
        this.yallaChat = yallaChat;
    }

    public static /* synthetic */ LoginMethodConfigModel copy$default(LoginMethodConfigModel loginMethodConfigModel, LoginMethod loginMethod, LoginMethod loginMethod2, LoginMethod loginMethod3, LoginMethod loginMethod4, LoginMethod loginMethod5, int i, Object obj) {
        if ((i & 1) != 0) {
            loginMethod = loginMethodConfigModel.faceBook;
        }
        if ((i & 2) != 0) {
            loginMethod2 = loginMethodConfigModel.phone;
        }
        LoginMethod loginMethod6 = loginMethod2;
        if ((i & 4) != 0) {
            loginMethod3 = loginMethodConfigModel.twitter;
        }
        LoginMethod loginMethod7 = loginMethod3;
        if ((i & 8) != 0) {
            loginMethod4 = loginMethodConfigModel.weChat;
        }
        LoginMethod loginMethod8 = loginMethod4;
        if ((i & 16) != 0) {
            loginMethod5 = loginMethodConfigModel.yallaChat;
        }
        return loginMethodConfigModel.copy(loginMethod, loginMethod6, loginMethod7, loginMethod8, loginMethod5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoginMethod getFaceBook() {
        return this.faceBook;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoginMethod getPhone() {
        return this.phone;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LoginMethod getTwitter() {
        return this.twitter;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LoginMethod getWeChat() {
        return this.weChat;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LoginMethod getYallaChat() {
        return this.yallaChat;
    }

    @NotNull
    public final LoginMethodConfigModel copy(@NotNull LoginMethod faceBook, @NotNull LoginMethod phone, @NotNull LoginMethod twitter, @NotNull LoginMethod weChat, @NotNull LoginMethod yallaChat) {
        Intrinsics.checkNotNullParameter(faceBook, "faceBook");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(weChat, "weChat");
        Intrinsics.checkNotNullParameter(yallaChat, "yallaChat");
        return new LoginMethodConfigModel(faceBook, phone, twitter, weChat, yallaChat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginMethodConfigModel)) {
            return false;
        }
        LoginMethodConfigModel loginMethodConfigModel = (LoginMethodConfigModel) other;
        return Intrinsics.areEqual(this.faceBook, loginMethodConfigModel.faceBook) && Intrinsics.areEqual(this.phone, loginMethodConfigModel.phone) && Intrinsics.areEqual(this.twitter, loginMethodConfigModel.twitter) && Intrinsics.areEqual(this.weChat, loginMethodConfigModel.weChat) && Intrinsics.areEqual(this.yallaChat, loginMethodConfigModel.yallaChat);
    }

    @NotNull
    public final LoginMethod getFaceBook() {
        return this.faceBook;
    }

    @NotNull
    public final LoginMethod getPhone() {
        return this.phone;
    }

    @NotNull
    public final LoginMethod getTwitter() {
        return this.twitter;
    }

    @NotNull
    public final LoginMethod getWeChat() {
        return this.weChat;
    }

    @NotNull
    public final LoginMethod getYallaChat() {
        return this.yallaChat;
    }

    public int hashCode() {
        return this.yallaChat.hashCode() + ((this.weChat.hashCode() + ((this.twitter.hashCode() + ((this.phone.hashCode() + (this.faceBook.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LoginMethodConfigModel(faceBook=" + this.faceBook + ", phone=" + this.phone + ", twitter=" + this.twitter + ", weChat=" + this.weChat + ", yallaChat=" + this.yallaChat + ")";
    }
}
