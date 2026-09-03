package com.yalla.yalla.model.room;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.OooOOO0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/room/RoomJoinMemberModel;", "", "code", "", "dues", "headphoto", "", "nickname", "invitefalg", "", "leftcoin", "", "userid", "roomMemberCount", "memberInfo", "Lcom/yalla/yalla/model/room/MemberBadgeInfo;", "(IILjava/lang/String;Ljava/lang/String;ZJJILcom/yalla/yalla/model/room/MemberBadgeInfo;)V", "getCode", "()I", "getDues", "getHeadphoto", "()Ljava/lang/String;", "getInvitefalg", "()Z", "getLeftcoin", "()J", "getMemberInfo", "()Lcom/yalla/yalla/model/room/MemberBadgeInfo;", "getNickname", "getRoomMemberCount", "getUserid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RoomJoinMemberModel {
    public static final int $stable = 0;
    private final int code;
    private final int dues;

    @NotNull
    private final String headphoto;
    private final boolean invitefalg;
    private final long leftcoin;

    @Nullable
    private final MemberBadgeInfo memberInfo;

    @NotNull
    private final String nickname;
    private final int roomMemberCount;
    private final long userid;

    public RoomJoinMemberModel() {
        this(0, 0, null, null, false, 0L, 0L, 0, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDues() {
        return this.dues;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeadphoto() {
        return this.headphoto;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInvitefalg() {
        return this.invitefalg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getLeftcoin() {
        return this.leftcoin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUserid() {
        return this.userid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRoomMemberCount() {
        return this.roomMemberCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MemberBadgeInfo getMemberInfo() {
        return this.memberInfo;
    }

    @NotNull
    public final RoomJoinMemberModel copy(int code, int dues, @NotNull String headphoto, @NotNull String nickname, boolean invitefalg, long leftcoin, long userid, int roomMemberCount, @Nullable MemberBadgeInfo memberInfo) {
        Intrinsics.checkNotNullParameter(headphoto, "headphoto");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new RoomJoinMemberModel(code, dues, headphoto, nickname, invitefalg, leftcoin, userid, roomMemberCount, memberInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomJoinMemberModel)) {
            return false;
        }
        RoomJoinMemberModel roomJoinMemberModel = (RoomJoinMemberModel) other;
        return this.code == roomJoinMemberModel.code && this.dues == roomJoinMemberModel.dues && Intrinsics.areEqual(this.headphoto, roomJoinMemberModel.headphoto) && Intrinsics.areEqual(this.nickname, roomJoinMemberModel.nickname) && this.invitefalg == roomJoinMemberModel.invitefalg && this.leftcoin == roomJoinMemberModel.leftcoin && this.userid == roomJoinMemberModel.userid && this.roomMemberCount == roomJoinMemberModel.roomMemberCount && Intrinsics.areEqual(this.memberInfo, roomJoinMemberModel.memberInfo);
    }

    public final int getCode() {
        return this.code;
    }

    public final int getDues() {
        return this.dues;
    }

    @NotNull
    public final String getHeadphoto() {
        return this.headphoto;
    }

    public final boolean getInvitefalg() {
        return this.invitefalg;
    }

    public final long getLeftcoin() {
        return this.leftcoin;
    }

    @Nullable
    public final MemberBadgeInfo getMemberInfo() {
        return this.memberInfo;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRoomMemberCount() {
        return this.roomMemberCount;
    }

    public final long getUserid() {
        return this.userid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.nickname, OooO0O0.OooO00o(this.headphoto, ((this.code * 31) + this.dues) * 31, 31), 31);
        boolean z = this.invitefalg;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iOooO00o + r1) * 31;
        long j = this.leftcoin;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.userid;
        int i3 = (((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.roomMemberCount) * 31;
        MemberBadgeInfo memberBadgeInfo = this.memberInfo;
        return i3 + (memberBadgeInfo == null ? 0 : memberBadgeInfo.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.code;
        int i2 = this.dues;
        String str = this.headphoto;
        String str2 = this.nickname;
        boolean z = this.invitefalg;
        long j = this.leftcoin;
        long j2 = this.userid;
        int i3 = this.roomMemberCount;
        MemberBadgeInfo memberBadgeInfo = this.memberInfo;
        StringBuilder sbOooO00o = o00000.OooO00o("RoomJoinMemberModel(code=", i, ", dues=", i2, ", headphoto=");
        OooO0OO.OooO0O0.OooO00o(sbOooO00o, str, ", nickname=", str2, ", invitefalg=");
        sbOooO00o.append(z);
        sbOooO00o.append(", leftcoin=");
        sbOooO00o.append(j);
        OooOOO0.OooO00o(sbOooO00o, ", userid=", j2, ", roomMemberCount=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", memberInfo=");
        sbOooO00o.append(memberBadgeInfo);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public RoomJoinMemberModel(int i, int i2, @NotNull String headphoto, @NotNull String nickname, boolean z, long j, long j2, int i3, @Nullable MemberBadgeInfo memberBadgeInfo) {
        Intrinsics.checkNotNullParameter(headphoto, "headphoto");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.code = i;
        this.dues = i2;
        this.headphoto = headphoto;
        this.nickname = nickname;
        this.invitefalg = z;
        this.leftcoin = j;
        this.userid = j2;
        this.roomMemberCount = i3;
        this.memberInfo = memberBadgeInfo;
    }

    public /* synthetic */ RoomJoinMemberModel(int i, int i2, String str, String str2, boolean z, long j, long j2, int i3, MemberBadgeInfo memberBadgeInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) == 0 ? str2 : "", (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? 0L : j, (i4 & 64) == 0 ? j2 : 0L, (i4 & 128) == 0 ? i3 : 0, (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : memberBadgeInfo);
    }
}
