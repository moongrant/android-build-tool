package com.yalla.yalla.ui.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.BaseRoomModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/adapter/RemoveMemberModel;", "Lcom/yalla/yalla/model/BaseRoomModel;", "()V", "followType", "", "getFollowType", "()I", "setFollowType", "(I)V", "roomMemberCount", "getRoomMemberCount", "setRoomMemberCount", "userid", "", "getUserid", "()J", "setUserid", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoveMemberModel extends BaseRoomModel {
    public static final int $stable = 8;

    @SerializedName("followtype")
    private int followType;
    private int roomMemberCount;

    @SerializedName("userid")
    private long userid;

    public final int getFollowType() {
        return this.followType;
    }

    public final int getRoomMemberCount() {
        return this.roomMemberCount;
    }

    public final long getUserid() {
        return this.userid;
    }

    public final void setFollowType(int i) {
        this.followType = i;
    }

    public final void setRoomMemberCount(int i) {
        this.roomMemberCount = i;
    }

    public final void setUserid(long j) {
        this.userid = j;
    }
}
