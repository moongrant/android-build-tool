package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0011\u0010\nR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u001d\u0010\nR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006R\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0006R\u001a\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b#\u0010\nR\u001a\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b%\u0010\nR\u001a\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b'\u0010\nR\u001a\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b)\u0010\nR\u001a\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b+\u0010\nR\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u001a\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b/\u0010\nR\u001a\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b1\u0010\nR\u001a\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b3\u0010\nR\u001a\u00104\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b5\u0010\nR\u001a\u00106\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b7\u0010\nR\u001a\u00108\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b9\u0010\nR\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0006R\u0016\u0010<\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0006¨\u0006>"}, d2 = {"Lcom/yalla/yalla/model/moment/VideoDetailModel;", "Ljava/io/Serializable;", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "commentNum", "", "getCommentNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "content", "getContent", "coverPic", "getCoverPic", "createTime", "getCreateTime", "headUrl", "getHeadUrl", "id", "getId", "isFollow", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isPraise", "isVIP", "kaVipLv", "getKaVipLv", "medal", "getMedal", "nickName", "getNickName", "nvipLv", "getNvipLv", "playNum", "getPlayNum", "power", "getPower", "praiseNum", "getPraiseNum", "role", "getRole", "sessionId", "getSessionId", "sex", "getSex", "shareNum", "getShareNum", "sourcesId", "getSourcesId", "totalPropValue", "getTotalPropValue", "userId", "getUserId", "userIdx", "getUserIdx", "videoSize", "getVideoSize", "videoUrl", "getVideoUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VideoDetailModel implements Serializable {
    public static final int $stable = 0;

    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    @Nullable
    private final String address;

    @SerializedName("commentNum")
    @Nullable
    private final Integer commentNum;

    @SerializedName("content")
    @Nullable
    private final String content;

    @SerializedName("coverPic")
    @Nullable
    private final String coverPic;

    @SerializedName("createTime")
    @Nullable
    private final Integer createTime;

    @SerializedName("headUrl")
    @Nullable
    private final String headUrl;

    @SerializedName("id")
    @Nullable
    private final Integer id;

    @SerializedName("isFollow")
    @Nullable
    private final Boolean isFollow;

    @SerializedName("isPraise")
    @Nullable
    private final Boolean isPraise;

    @SerializedName("isVIP")
    @Nullable
    private final Boolean isVIP;

    @SerializedName("kaVipLv")
    @Nullable
    private final Integer kaVipLv;

    @SerializedName("medal")
    @Nullable
    private final String medal;

    @SerializedName("nickName")
    @Nullable
    private final String nickName;

    @SerializedName("nvipLv")
    @Nullable
    private final Integer nvipLv;

    @SerializedName("playNum")
    @Nullable
    private final Integer playNum;

    @SerializedName("power")
    @Nullable
    private final Integer power;

    @SerializedName("praiseNum")
    @Nullable
    private final Integer praiseNum;

    @SerializedName("role")
    @Nullable
    private final Integer role;

    @SerializedName("sessionId")
    @Nullable
    private final String sessionId;

    @SerializedName("sex")
    @Nullable
    private final Integer sex;

    @SerializedName("shareNum")
    @Nullable
    private final Integer shareNum;

    @SerializedName("sourcesId")
    @Nullable
    private final Integer sourcesId;

    @SerializedName("totalPropValue")
    @Nullable
    private final Integer totalPropValue;

    @SerializedName("userId")
    @Nullable
    private final Integer userId;

    @SerializedName("userIdx")
    @Nullable
    private final Integer userIdx;

    @SerializedName("videoSize")
    @Nullable
    private final String videoSize;

    @SerializedName("videoUrl")
    @NotNull
    private final String videoUrl = "";

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final Integer getCommentNum() {
        return this.commentNum;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCoverPic() {
        return this.coverPic;
    }

    @Nullable
    public final Integer getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getHeadUrl() {
        return this.headUrl;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKaVipLv() {
        return this.kaVipLv;
    }

    @Nullable
    public final String getMedal() {
        return this.medal;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Integer getNvipLv() {
        return this.nvipLv;
    }

    @Nullable
    public final Integer getPlayNum() {
        return this.playNum;
    }

    @Nullable
    public final Integer getPower() {
        return this.power;
    }

    @Nullable
    public final Integer getPraiseNum() {
        return this.praiseNum;
    }

    @Nullable
    public final Integer getRole() {
        return this.role;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Integer getSex() {
        return this.sex;
    }

    @Nullable
    public final Integer getShareNum() {
        return this.shareNum;
    }

    @Nullable
    public final Integer getSourcesId() {
        return this.sourcesId;
    }

    @Nullable
    public final Integer getTotalPropValue() {
        return this.totalPropValue;
    }

    @Nullable
    public final Integer getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getUserIdx() {
        return this.userIdx;
    }

    @Nullable
    public final String getVideoSize() {
        return this.videoSize;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: isFollow, reason: from getter */
    public final Boolean getIsFollow() {
        return this.isFollow;
    }

    @Nullable
    /* JADX INFO: renamed from: isPraise, reason: from getter */
    public final Boolean getIsPraise() {
        return this.isPraise;
    }

    @Nullable
    /* JADX INFO: renamed from: isVIP, reason: from getter */
    public final Boolean getIsVIP() {
        return this.isVIP;
    }
}
