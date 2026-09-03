package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "type"})}, primaryKeys = {"uid", "type"}, tableName = "SimpleMessageTable")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\u00020\u0001:\u0004$%&'B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/yalla/yalla/data/db/table/SimpleMessage;", "", "()V", "activityMessage", "Lcom/yalla/yalla/data/db/table/SimpleMessage$ActivityMessage;", "getActivityMessage", "()Lcom/yalla/yalla/data/db/table/SimpleMessage$ActivityMessage;", "setActivityMessage", "(Lcom/yalla/yalla/data/db/table/SimpleMessage$ActivityMessage;)V", "fansMessage", "Lcom/yalla/yalla/data/db/table/SimpleMessage$FansMessage;", "getFansMessage", "()Lcom/yalla/yalla/data/db/table/SimpleMessage$FansMessage;", "setFansMessage", "(Lcom/yalla/yalla/data/db/table/SimpleMessage$FansMessage;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "visitorMessage", "Lcom/yalla/yalla/data/db/table/SimpleMessage$VisitorMessage;", "getVisitorMessage", "()Lcom/yalla/yalla/data/db/table/SimpleMessage$VisitorMessage;", "setVisitorMessage", "(Lcom/yalla/yalla/data/db/table/SimpleMessage$VisitorMessage;)V", "ActivityMessage", "Companion", "FansMessage", "VisitorMessage", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleMessage {
    public static final int TYPE_ACTIVITY = 1;
    public static final int TYPE_Fans = 2;
    public static final int TYPE_Visitor = 3;

    @Embedded
    @Nullable
    private ActivityMessage activityMessage;

    @Embedded
    @Nullable
    private FansMessage fansMessage;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;

    @Embedded
    @Nullable
    private VisitorMessage visitorMessage;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/table/SimpleMessage$ActivityMessage;", "", "()V", "activityNum", "", "getActivityNum", "()I", "setActivityNum", "(I)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActivityMessage {
        public static final int $stable = 8;

        @ColumnInfo(name = "activityNum")
        private int activityNum;

        @ColumnInfo(name = "content")
        @NotNull
        private String content = "";

        public final int getActivityNum() {
            return this.activityNum;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final void setActivityNum(int i) {
            this.activityNum = i;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SimpleMessage$FansMessage;", "", "()V", "fansNum", "", "getFansNum", "()I", "setFansNum", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FansMessage {
        public static final int $stable = 8;

        @ColumnInfo(name = "fansNum")
        private int fansNum;

        public final int getFansNum() {
            return this.fansNum;
        }

        public final void setFansNum(int i) {
            this.fansNum = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/data/db/table/SimpleMessage$VisitorMessage;", "", "()V", "visitorNum", "", "getVisitorNum", "()I", "setVisitorNum", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VisitorMessage {
        public static final int $stable = 8;

        @ColumnInfo(name = "visitorNum")
        private int visitorNum;

        public final int getVisitorNum() {
            return this.visitorNum;
        }

        public final void setVisitorNum(int i) {
            this.visitorNum = i;
        }
    }

    @Nullable
    public final ActivityMessage getActivityMessage() {
        return this.activityMessage;
    }

    @Nullable
    public final FansMessage getFansMessage() {
        return this.fansMessage;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    @Nullable
    public final VisitorMessage getVisitorMessage() {
        return this.visitorMessage;
    }

    public final void setActivityMessage(@Nullable ActivityMessage activityMessage) {
        this.activityMessage = activityMessage;
    }

    public final void setFansMessage(@Nullable FansMessage fansMessage) {
        this.fansMessage = fansMessage;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setVisitorMessage(@Nullable VisitorMessage visitorMessage) {
        this.visitorMessage = visitorMessage;
    }
}
