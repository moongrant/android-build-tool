package com.app.base.mixedroom.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002,-B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001e\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/app/base/mixedroom/model/RoomGameConfig;", "", "()V", "box", "Lcom/app/base/mixedroom/model/TreasureBoxProgressModel;", "getBox", "()Lcom/app/base/mixedroom/model/TreasureBoxProgressModel;", "setBox", "(Lcom/app/base/mixedroom/model/TreasureBoxProgressModel;)V", "code", "", "getCode", "()I", "setCode", "(I)V", "eventCount", "getEventCount", "setEventCount", "eventIsStart", "", "getEventIsStart", "()Z", "setEventIsStart", "(Z)V", "fruitGameState", "getFruitGameState", "setFruitGameState", "isShowCamel", "setShowCamel", "moraGameState", "getMoraGameState", "setMoraGameState", "turnGameProgress", "getTurnGameProgress", "setTurnGameProgress", "turnGameState", "getTurnGameState", "setTurnGameState", "vote", "Lcom/app/base/mixedroom/model/RoomGameConfig$Vote;", "getVote", "()Lcom/app/base/mixedroom/model/RoomGameConfig$Vote;", "setVote", "(Lcom/app/base/mixedroom/model/RoomGameConfig$Vote;)V", "Box", "Vote", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomGameConfig {
    public static final int $stable = 8;

    @Nullable
    private TreasureBoxProgressModel box;
    private int eventCount;
    private boolean eventIsStart;
    private int fruitGameState;
    private boolean isShowCamel;

    @SerializedName(ServerProtocol.DIALOG_PARAM_STATE)
    private int moraGameState;
    private int turnGameState;

    @Nullable
    private Vote vote;
    private int code = 1000;
    private int turnGameProgress = 2;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/base/mixedroom/model/RoomGameConfig$Box;", "", "()V", "boxLevel", "", "getBoxLevel", "()I", "setBoxLevel", "(I)V", "percent", "getPercent", "setPercent", "timeId", "", "getTimeId", "()J", "setTimeId", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Box {
        public static final int $stable = 8;
        private int boxLevel;
        private int percent;
        private long timeId;

        public final int getBoxLevel() {
            return this.boxLevel;
        }

        public final int getPercent() {
            return this.percent;
        }

        public final long getTimeId() {
            return this.timeId;
        }

        public final void setBoxLevel(int i) {
            this.boxLevel = i;
        }

        public final void setPercent(int i) {
            this.percent = i;
        }

        public final void setTimeId(long j) {
            this.timeId = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/base/mixedroom/model/RoomGameConfig$Vote;", "", "()V", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", "getStatus", "()I", "setStatus", "(I)V", "voteId", "", "getVoteId", "()J", "setVoteId", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Vote {
        public static final int $stable = 8;
        private int status;
        private long voteId;

        public final int getStatus() {
            return this.status;
        }

        public final long getVoteId() {
            return this.voteId;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final void setVoteId(long j) {
            this.voteId = j;
        }
    }

    @Nullable
    public final TreasureBoxProgressModel getBox() {
        return this.box;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getEventCount() {
        return this.eventCount;
    }

    public final boolean getEventIsStart() {
        return this.eventIsStart;
    }

    public final int getFruitGameState() {
        return this.fruitGameState;
    }

    public final int getMoraGameState() {
        return this.moraGameState;
    }

    public final int getTurnGameProgress() {
        return this.turnGameProgress;
    }

    public final int getTurnGameState() {
        return this.turnGameState;
    }

    @Nullable
    public final Vote getVote() {
        return this.vote;
    }

    /* JADX INFO: renamed from: isShowCamel, reason: from getter */
    public final boolean getIsShowCamel() {
        return this.isShowCamel;
    }

    public final void setBox(@Nullable TreasureBoxProgressModel treasureBoxProgressModel) {
        this.box = treasureBoxProgressModel;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setEventCount(int i) {
        this.eventCount = i;
    }

    public final void setEventIsStart(boolean z) {
        this.eventIsStart = z;
    }

    public final void setFruitGameState(int i) {
        this.fruitGameState = i;
    }

    public final void setMoraGameState(int i) {
        this.moraGameState = i;
    }

    public final void setShowCamel(boolean z) {
        this.isShowCamel = z;
    }

    public final void setTurnGameProgress(int i) {
        this.turnGameProgress = i;
    }

    public final void setTurnGameState(int i) {
        this.turnGameState = i;
    }

    public final void setVote(@Nullable Vote vote) {
        this.vote = vote;
    }
}
