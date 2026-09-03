package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/GetInitConfigModel;", "", "()V", "facebookConf", "Lcom/yalla/yalla/model/GetInitConfigModel$FacebookConf;", "getFacebookConf", "()Lcom/yalla/yalla/model/GetInitConfigModel$FacebookConf;", "setFacebookConf", "(Lcom/yalla/yalla/model/GetInitConfigModel$FacebookConf;)V", "videoPostConf", "Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "getVideoPostConf", "()Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "setVideoPostConf", "(Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;)V", "FacebookConf", "VideoPostConf", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetInitConfigModel {
    public static final int $stable = 8;

    @Nullable
    private FacebookConf facebookConf;

    @Nullable
    private VideoPostConf videoPostConf;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/GetInitConfigModel$FacebookConf;", "", "()V", "canUseFacebookLogin", "", "getCanUseFacebookLogin", "()Z", "setCanUseFacebookLogin", "(Z)V", "canUseFacebookShare", "getCanUseFacebookShare", "setCanUseFacebookShare", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FacebookConf {
        public static final int $stable = 8;
        private boolean canUseFacebookLogin = true;
        private boolean canUseFacebookShare = true;

        public final boolean getCanUseFacebookLogin() {
            return this.canUseFacebookLogin;
        }

        public final boolean getCanUseFacebookShare() {
            return this.canUseFacebookShare;
        }

        public final void setCanUseFacebookLogin(boolean z) {
            this.canUseFacebookLogin = z;
        }

        public final void setCanUseFacebookShare(boolean z) {
            this.canUseFacebookShare = z;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/GetInitConfigModel$VideoPostConf;", "", "()V", "maxDuration", "", "getMaxDuration", "()J", "setMaxDuration", "(J)V", "maxFileSize", "getMaxFileSize", "setMaxFileSize", "minDuration", "getMinDuration", "setMinDuration", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public final FacebookConf getFacebookConf() {
        return this.facebookConf;
    }

    @Nullable
    public final VideoPostConf getVideoPostConf() {
        return this.videoPostConf;
    }

    public final void setFacebookConf(@Nullable FacebookConf facebookConf) {
        this.facebookConf = facebookConf;
    }

    public final void setVideoPostConf(@Nullable VideoPostConf videoPostConf) {
        this.videoPostConf = videoPostConf;
    }
}
