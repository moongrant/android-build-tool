package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "YallaTeamMessageTable")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010;\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR \u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001e\u00105\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001e\u00108\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101¨\u0006>"}, d2 = {"Lcom/yalla/yalla/common/db/table/YallaTeamMessage;", "", "()V", "coverImage", "", "getCoverImage", "()Ljava/lang/String;", "setCoverImage", "(Ljava/lang/String;)V", "detailImage", "getDetailImage", "setDetailImage", "detailTitle", "getDetailTitle", "setDetailTitle", "isRead", "", "()Z", "setRead", "(Z)V", "jumpId", "getJumpId", "setJumpId", "jumpType", "", "getJumpType", "()I", "setJumpType", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "messageType", "getMessageType", "setMessageType", "mid", "getMid", "setMid", "satisfactionSurvey", "Lcom/yalla/yalla/common/db/table/YallaTeamMessage$SatisfactionSurvey;", "getSatisfactionSurvey", "()Lcom/yalla/yalla/common/db/table/YallaTeamMessage$SatisfactionSurvey;", "setSatisfactionSurvey", "(Lcom/yalla/yalla/common/db/table/YallaTeamMessage$SatisfactionSurvey;)V", "time", "", "getTime", "()J", "setTime", "(J)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "type", "getType", "setType", "uid", "getUid", "setUid", "toString", "Companion", "SatisfactionSurvey", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YallaTeamMessage {
    public static final int TYPE_FEEDBACK = 1;
    public static final int TYPE_FEEDBACK_REPLY_TIP = 4;
    public static final int TYPE_FEEDBACK_TIP = 2;
    public static final int TYPE_MESSAGE = 3;
    public static final int TYPE_SATISFACTION_SURVEY = 7;
    public static final int TYPE_SYSTEM_NOTICE = 5;
    public static final int TYPE_WELCOME_TIP = 6;

    @ColumnInfo(name = "isRead")
    private boolean isRead;

    @ColumnInfo(name = "jumpType")
    private int jumpType;

    @Embedded
    @Nullable
    private SatisfactionSurvey satisfactionSurvey;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_TITLE)
    @Nullable
    private String title;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;
    public static final int $stable = 8;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @ColumnInfo(name = "messageType")
    private int messageType = 1;

    @ColumnInfo(name = "jumpId")
    @NotNull
    private String jumpId = "";

    @ColumnInfo(name = "coverImage")
    @NotNull
    private String coverImage = "";

    @ColumnInfo(name = "detailImage")
    @NotNull
    private String detailImage = "";

    @ColumnInfo(name = "detailTitle")
    @NotNull
    private String detailTitle = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/common/db/table/YallaTeamMessage$SatisfactionSurvey;", "", "()V", "isSubmit", "", "()Z", "setSubmit", "(Z)V", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", "score", "", "getScore", "()I", "setScore", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class SatisfactionSurvey {
        public static final int $stable = 8;

        @ColumnInfo(name = "surveyIsSubmit")
        private boolean isSubmit;

        @ColumnInfo(name = "surveyMessageId")
        private long messageId;

        @ColumnInfo(name = "surveyScore")
        private int score;

        public final long getMessageId() {
            return this.messageId;
        }

        public final int getScore() {
            return this.score;
        }

        /* JADX INFO: renamed from: isSubmit, reason: from getter */
        public final boolean getIsSubmit() {
            return this.isSubmit;
        }

        public final void setMessageId(long j) {
            this.messageId = j;
        }

        public final void setScore(int i) {
            this.score = i;
        }

        public final void setSubmit(boolean z) {
            this.isSubmit = z;
        }
    }

    @NotNull
    public final String getCoverImage() {
        return this.coverImage;
    }

    @NotNull
    public final String getDetailImage() {
        return this.detailImage;
    }

    @NotNull
    public final String getDetailTitle() {
        return this.detailTitle;
    }

    @NotNull
    public final String getJumpId() {
        return this.jumpId;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final SatisfactionSurvey getSatisfactionSurvey() {
        return this.satisfactionSurvey;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setCoverImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverImage = str;
    }

    public final void setDetailImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detailImage = str;
    }

    public final void setDetailTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detailTitle = str;
    }

    public final void setJumpId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jumpId = str;
    }

    public final void setJumpType(int i) {
        this.jumpType = i;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMessageType(int i) {
        this.messageType = i;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setSatisfactionSurvey(@Nullable SatisfactionSurvey satisfactionSurvey) {
        this.satisfactionSurvey = satisfactionSurvey;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("YallaTeamMessage(uid=");
        sbOooO0o0.append(this.uid);
        sbOooO0o0.append(", mid='");
        sbOooO0o0.append(this.mid);
        sbOooO0o0.append("', type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", message='");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append("', time=");
        sbOooO0o0.append(this.time);
        sbOooO0o0.append(", isRead=");
        sbOooO0o0.append(this.isRead);
        sbOooO0o0.append("),satisfactionSurvey={messageId=");
        SatisfactionSurvey satisfactionSurvey = this.satisfactionSurvey;
        sbOooO0o0.append(satisfactionSurvey != null ? Long.valueOf(satisfactionSurvey.getMessageId()) : null);
        sbOooO0o0.append(",isSubmit=");
        SatisfactionSurvey satisfactionSurvey2 = this.satisfactionSurvey;
        sbOooO0o0.append(satisfactionSurvey2 != null ? Boolean.valueOf(satisfactionSurvey2.getIsSubmit()) : null);
        sbOooO0o0.append(",score=");
        SatisfactionSurvey satisfactionSurvey3 = this.satisfactionSurvey;
        sbOooO0o0.append(satisfactionSurvey3 != null ? Integer.valueOf(satisfactionSurvey3.getScore()) : null);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
