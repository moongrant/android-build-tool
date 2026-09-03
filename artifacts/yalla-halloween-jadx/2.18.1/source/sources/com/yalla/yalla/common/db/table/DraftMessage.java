package com.yalla.yalla.common.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/common/db/table/DraftMessage;", "", "()V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "uid", "getUid", "setUid", "userId", "getUserId", "setUserId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(message = "使用Conversation表存储草稿消息")
@Entity(indices = {@Index({"uid", "userId"})}, primaryKeys = {"uid", "userId"}, tableName = "DraftMessageTable")
public final class DraftMessage {
    public static final int $stable = 8;

    @NotNull
    private String message = "";
    private long time;
    private long uid;
    private long userId;

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUid() {
        return this.uid;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
