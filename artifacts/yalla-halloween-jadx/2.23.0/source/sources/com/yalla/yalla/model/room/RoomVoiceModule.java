package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/room/RoomVoiceModule;", "", "()V", ContributionFragment.ARG_1, "", "getRoomId", "()J", "setRoomId", "(J)V", "timeVoice", "", "Lcom/yalla/yalla/model/room/RoomVoiceModule$TimeVoice;", "getTimeVoice", "()Ljava/util/List;", "setTimeVoice", "(Ljava/util/List;)V", "userId", "getUserId", "setUserId", "TimeVoice", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomVoiceModule {
    public static final int $stable = 8;
    private long roomId;

    @NotNull
    private List<TimeVoice> timeVoice = new ArrayList();
    private long userId;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/room/RoomVoiceModule$TimeVoice;", "", "time", "", "valume", "", "(JI)V", "getTime", "()J", "getValume", "()I", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TimeVoice {
        public static final int $stable = 0;
        private final long time;
        private final int valume;

        public TimeVoice(long j, int i) {
            this.time = j;
            this.valume = i;
        }

        public final long getTime() {
            return this.time;
        }

        public final int getValume() {
            return this.valume;
        }
    }

    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final List<TimeVoice> getTimeVoice() {
        return this.timeVoice;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setTimeVoice(@NotNull List<TimeVoice> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.timeVoice = list;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
