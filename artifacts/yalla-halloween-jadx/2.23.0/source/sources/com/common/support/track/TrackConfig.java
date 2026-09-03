package com.common.support.track;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/common/support/track/TrackConfig;", "", "()V", "isTrackEnable", "", "isTrackEnable$track_release", "()Z", "setTrackEnable$track_release", "(Z)V", "Builder", "Companion", "track_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TrackConfig {
    public static final boolean IS_TRACK_ENABLE = false;
    private boolean isTrackEnable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/common/support/track/TrackConfig$Builder;", "", "()V", "build", "Lcom/common/support/track/TrackConfig;", "track_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        @NotNull
        public final TrackConfig build() {
            final TrackConfig trackConfig = new TrackConfig();
            trackConfig.setTrackEnable$track_release(Sailfish.INSTANCE.isTrackEnable());
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.track.TrackConfig$Builder$build$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return Intrinsics.stringPlus("TrackAgent build() isTrackEnable: ", Boolean.valueOf(trackConfig.getIsTrackEnable()));
                }
            }, 1, null);
            return trackConfig;
        }
    }

    /* JADX INFO: renamed from: isTrackEnable$track_release, reason: from getter */
    public final boolean getIsTrackEnable() {
        return this.isTrackEnable;
    }

    public final void setTrackEnable$track_release(boolean z) {
        this.isTrackEnable = z;
    }
}
