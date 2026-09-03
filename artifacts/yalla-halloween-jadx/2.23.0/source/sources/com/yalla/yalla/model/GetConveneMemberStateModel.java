package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/GetConveneMemberStateModel;", "", "()V", "conveneTimeLong", "", "getConveneTimeLong", "()I", "setConveneTimeLong", "(I)V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "maxConveneCount", "getMaxConveneCount", "setMaxConveneCount", "state", "getState", "setState", "toString", "", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetConveneMemberStateModel {
    private long endTime;
    private int state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private int maxConveneCount = 50;
    private int conveneTimeLong = 10;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/GetConveneMemberStateModel$Companion;", "", "()V", "clone", "Lcom/yalla/yalla/model/GetConveneMemberStateModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GetConveneMemberStateModel clone(@Nullable GetConveneMemberStateModel getConveneMemberStateModel) {
            GetConveneMemberStateModel getConveneMemberStateModel2 = new GetConveneMemberStateModel();
            if (getConveneMemberStateModel != null) {
                getConveneMemberStateModel2.setMaxConveneCount(getConveneMemberStateModel.getMaxConveneCount());
                getConveneMemberStateModel2.setConveneTimeLong(getConveneMemberStateModel.getConveneTimeLong());
                getConveneMemberStateModel2.setState(getConveneMemberStateModel.getState());
                getConveneMemberStateModel2.setEndTime(getConveneMemberStateModel.getEndTime());
            }
            return getConveneMemberStateModel2;
        }
    }

    public final int getConveneTimeLong() {
        return this.conveneTimeLong;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getMaxConveneCount() {
        return this.maxConveneCount;
    }

    public final int getState() {
        return this.state;
    }

    public final void setConveneTimeLong(int i) {
        this.conveneTimeLong = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setMaxConveneCount(int i) {
        this.maxConveneCount = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "GetConveneMemberStateModel(state=" + this.state + ", endTime=" + this.endTime + ")";
    }
}
