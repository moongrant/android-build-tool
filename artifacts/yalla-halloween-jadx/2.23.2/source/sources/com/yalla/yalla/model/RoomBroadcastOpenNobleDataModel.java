package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.NativeProtocol;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;", "", "()V", NativeProtocol.WEB_DIALOG_ACTION, "", "getAction", "()I", "setAction", "(I)V", "nickname", "", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "type", "getType", "userid", "getUserid", "viplevel", "getViplevel", "setViplevel", "setNobleActionOpen", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomBroadcastOpenNobleDataModel {
    public static final int $stable = 8;
    private final int type;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int viplevel;
    private int action = 1;

    @NotNull
    private String nickname = "";

    @NotNull
    private final String userid = "";

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUserid() {
        return this.userid;
    }

    public final int getViplevel() {
        return this.viplevel;
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    @NotNull
    public final RoomBroadcastOpenNobleDataModel setNobleActionOpen() {
        this.action = 1;
        this.nickname = "";
        this.viplevel = VipLevel.Vip0.getValue();
        return this;
    }

    public final void setViplevel(int i) {
        this.viplevel = i;
    }
}
