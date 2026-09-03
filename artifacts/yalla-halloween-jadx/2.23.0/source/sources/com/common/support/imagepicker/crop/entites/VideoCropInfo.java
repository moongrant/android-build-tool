package com.common.support.imagepicker.crop.entites;

import androidx.compose.animation.Oooo000;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/common/support/imagepicker/crop/entites/VideoCropInfo;", "", "startTime", "", "endTime", "(JJ)V", "getEndTime", "()J", "setEndTime", "(J)V", "getStartTime", "setStartTime", "getDuration", "toString", "", "crop_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VideoCropInfo {
    private long endTime;
    private long startTime;

    public VideoCropInfo(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public final long getDuration() {
        return this.endTime - this.startTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoCropInfo(startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return Oooo000.OooO0OO(sb, this.endTime, ')');
    }
}
