package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "targetId"})}, primaryKeys = {"targetId", "uid"}, tableName = "ConversationTable")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001e\u0010.\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001e\u00101\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R\u001e\u00104\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001b¨\u00067"}, d2 = {"Lcom/yalla/yalla/data/db/table/Conversation;", "", "()V", "draft", "", "getDraft", "()Ljava/lang/String;", "setDraft", "(Ljava/lang/String;)V", "isAcceptMsg", "", "()Z", "setAcceptMsg", "(Z)V", "isVoiceAndUnread", "setVoiceAndUnread", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "mid", "getMid", "setMid", "momentType", "", "getMomentType", "()I", "setMomentType", "(I)V", "sendState", "getSendState", "setSendState", "targetId", "", "getTargetId", "()J", "setTargetId", "(J)V", "time", "getTime", "setTime", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "topTime", "getTopTime", "setTopTime", "type", "getType", "setType", "uid", "getUid", "setUid", "unReadCount", "getUnReadCount", "setUnReadCount", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Conversation {
    public static final int $stable = 8;

    @ColumnInfo(name = "isVoiceAndUnread")
    private boolean isVoiceAndUnread;

    @ColumnInfo(name = "momentType")
    private int momentType;

    @ColumnInfo(name = "sendState")
    private int sendState;

    @ColumnInfo(name = "targetId")
    private long targetId;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = "topTime")
    private long topTime;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;

    @ColumnInfo(name = "unReadCount")
    private int unReadCount;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_TITLE)
    @NotNull
    private String title = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @ColumnInfo(name = "draft")
    @NotNull
    private String draft = "";

    @ColumnInfo(name = "isAcceptMsg")
    private boolean isAcceptMsg = true;

    @NotNull
    public final String getDraft() {
        return this.draft;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final int getMomentType() {
        return this.momentType;
    }

    public final int getSendState() {
        return this.sendState;
    }

    public final long getTargetId() {
        return this.targetId;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getTopTime() {
        return this.topTime;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    /* JADX INFO: renamed from: isAcceptMsg, reason: from getter */
    public final boolean getIsAcceptMsg() {
        return this.isAcceptMsg;
    }

    /* JADX INFO: renamed from: isVoiceAndUnread, reason: from getter */
    public final boolean getIsVoiceAndUnread() {
        return this.isVoiceAndUnread;
    }

    public final void setAcceptMsg(boolean z) {
        this.isAcceptMsg = z;
    }

    public final void setDraft(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.draft = str;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setMomentType(int i) {
        this.momentType = i;
    }

    public final void setSendState(int i) {
        this.sendState = i;
    }

    public final void setTargetId(long j) {
        this.targetId = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setTopTime(long j) {
        this.topTime = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public final void setVoiceAndUnread(boolean z) {
        this.isVoiceAndUnread = z;
    }
}
