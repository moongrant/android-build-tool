package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/model/CheckUserInRoomModel;", "", "()V", "data", "Lcom/yalla/yalla/common/model/CheckUserInRoomModel$InRoomInfo;", "getData", "()Lcom/yalla/yalla/common/model/CheckUserInRoomModel$InRoomInfo;", "setData", "(Lcom/yalla/yalla/common/model/CheckUserInRoomModel$InRoomInfo;)V", "isinbar", "", "getIsinbar", "()Z", "setIsinbar", "(Z)V", "InRoomInfo", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CheckUserInRoomModel {
    public static final int $stable = 8;

    @Nullable
    private InRoomInfo data;
    private boolean isinbar;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/model/CheckUserInRoomModel$InRoomInfo;", "", "()V", "barid", "", "getBarid", "()J", "setBarid", "(J)V", "barlevel", "", "getBarlevel", "()I", "setBarlevel", "(I)V", "barname", "", "getBarname", "()Ljava/lang/String;", "setBarname", "(Ljava/lang/String;)V", "roomserverip", "getRoomserverip", "setRoomserverip", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class InRoomInfo {
        public static final int $stable = 8;
        private long barid;
        private int barlevel;

        @NotNull
        private String roomserverip = "";

        @NotNull
        private String barname = "";

        public final long getBarid() {
            return this.barid;
        }

        public final int getBarlevel() {
            return this.barlevel;
        }

        @NotNull
        public final String getBarname() {
            return this.barname;
        }

        @NotNull
        public final String getRoomserverip() {
            return this.roomserverip;
        }

        public final void setBarid(long j) {
            this.barid = j;
        }

        public final void setBarlevel(int i) {
            this.barlevel = i;
        }

        public final void setBarname(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.barname = str;
        }

        public final void setRoomserverip(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomserverip = str;
        }
    }

    @Nullable
    public final InRoomInfo getData() {
        return this.data;
    }

    public final boolean getIsinbar() {
        return this.isinbar;
    }

    public final void setData(@Nullable InRoomInfo inRoomInfo) {
        this.data = inRoomInfo;
    }

    public final void setIsinbar(boolean z) {
        this.isinbar = z;
    }
}
