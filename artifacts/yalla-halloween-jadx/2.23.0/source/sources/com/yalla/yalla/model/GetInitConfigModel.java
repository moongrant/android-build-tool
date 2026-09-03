package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/model/GetInitConfigModel;", "", "()V", "videoPostConf", "Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "getVideoPostConf", "()Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "setVideoPostConf", "(Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;)V", "VideoPostConf", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetInitConfigModel {
    public static final int $stable = 8;

    @Nullable
    private VideoPostConf videoPostConf;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "", "()V", "maxDuration", "", "getMaxDuration", "()J", "setMaxDuration", "(J)V", "maxFileSize", "getMaxFileSize", "setMaxFileSize", "minDuration", "getMinDuration", "setMinDuration", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VideoPostConf {
        public static final int $stable = 8;
        private long maxDuration;
        private long maxFileSize;
        private long minDuration;

        public final long getMaxDuration() {
            return this.maxDuration;
        }

        public final long getMaxFileSize() {
            return this.maxFileSize;
        }

        public final long getMinDuration() {
            return this.minDuration;
        }

        public final void setMaxDuration(long j) {
            this.maxDuration = j;
        }

        public final void setMaxFileSize(long j) {
            this.maxFileSize = j;
        }

        public final void setMinDuration(long j) {
            this.minDuration = j;
        }
    }

    @Nullable
    public final VideoPostConf getVideoPostConf() {
        return this.videoPostConf;
    }

    public final void setVideoPostConf(@Nullable VideoPostConf videoPostConf) {
        this.videoPostConf = videoPostConf;
    }
}
