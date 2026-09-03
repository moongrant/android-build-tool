package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o000Oo0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010,\u001a\u00020\u001bJ\b\u0010-\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b¨\u0006/"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentPoll;", "Ljava/io/Serializable;", "()V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "id", "getId", "setId", "isExpire", "", "()Z", "setExpire", "(Z)V", "isShowVoteNum", "setShowVoteNum", "options", "", "Lcom/yalla/yalla/model/moment/MomentPoll$Option;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "shareDefaultImg", "", "getShareDefaultImg", "()Ljava/lang/String;", "setShareDefaultImg", "(Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "voteCount", "", "getVoteCount", "()I", "setVoteCount", "(I)V", "voteOptionId", "getVoteOptionId", "setVoteOptionId", "toJSONString", "toString", "Option", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentPoll implements Serializable {
    public static final int $stable = 8;

    @SerializedName("expireTime")
    private long expireTime;

    @SerializedName("id")
    private long id;

    @SerializedName("isExpire")
    private boolean isExpire;

    @SerializedName("isShowVoteNum")
    private boolean isShowVoteNum;

    @SerializedName("voteCount")
    private int voteCount;

    @SerializedName("voteOptionId")
    private long voteOptionId;

    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_TITLE)
    @NotNull
    private String title = "";

    @SerializedName("shareDefaultImg")
    @NotNull
    private String shareDefaultImg = "";

    @SerializedName(alternate = {"option"}, value = "options")
    @NotNull
    private List<Option> options = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentPoll$Option;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "isVote", "", "()Z", "setVote", "(Z)V", "optionText", "", "getOptionText", "()Ljava/lang/String;", "setOptionText", "(Ljava/lang/String;)V", "voteCount", "", "getVoteCount", "()I", "setVoteCount", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Option implements Serializable {
        public static final int $stable = 8;
        private long id;
        private boolean isVote;

        @SerializedName(alternate = {ViewHierarchyConstants.TEXT_KEY}, value = "optionText")
        @NotNull
        private String optionText = "";
        private int voteCount = 2;

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getOptionText() {
            return this.optionText;
        }

        public final int getVoteCount() {
            return this.voteCount;
        }

        /* JADX INFO: renamed from: isVote, reason: from getter */
        public final boolean getIsVote() {
            return this.isVote;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setOptionText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.optionText = str;
        }

        public final void setVote(boolean z) {
            this.isVote = z;
        }

        public final void setVoteCount(int i) {
            this.voteCount = i;
        }
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<Option> getOptions() {
        return this.options;
    }

    @NotNull
    public final String getShareDefaultImg() {
        return this.shareDefaultImg;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final long getVoteOptionId() {
        return this.voteOptionId;
    }

    /* JADX INFO: renamed from: isExpire, reason: from getter */
    public final boolean getIsExpire() {
        return this.isExpire;
    }

    /* JADX INFO: renamed from: isShowVoteNum, reason: from getter */
    public final boolean getIsShowVoteNum() {
        return this.isShowVoteNum;
    }

    public final void setExpire(boolean z) {
        this.isExpire = z;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setOptions(@NotNull List<Option> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.options = list;
    }

    public final void setShareDefaultImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareDefaultImg = str;
    }

    public final void setShowVoteNum(boolean z) {
        this.isShowVoteNum = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setVoteCount(int i) {
        this.voteCount = i;
    }

    public final void setVoteOptionId(long j) {
        this.voteOptionId = j;
    }

    @NotNull
    public final String toJSONString() {
        return OooOO0.OooO00o(this);
    }

    @NotNull
    public String toString() {
        long j = this.id;
        String str = this.title;
        String str2 = this.shareDefaultImg;
        long j2 = this.expireTime;
        int i = this.voteCount;
        boolean z = this.isShowVoteNum;
        boolean z2 = this.isExpire;
        long j3 = this.voteOptionId;
        List<Option> list = this.options;
        StringBuilder sb = new StringBuilder("MomentPoll(id=");
        sb.append(j);
        sb.append(", title='");
        sb.append(str);
        sb.append("', shareDefaultImg='");
        sb.append(str2);
        sb.append("', expireTime=");
        sb.append(j2);
        sb.append(", voteCount=");
        sb.append(i);
        sb.append(", isShowVoteNum=");
        sb.append(z);
        sb.append(", isExpire=");
        sb.append(z2);
        OooO0O0.OooO00o(sb, ", voteOptionId=", j3, ", options=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
