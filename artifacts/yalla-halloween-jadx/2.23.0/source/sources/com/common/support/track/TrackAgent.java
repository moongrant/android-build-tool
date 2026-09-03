package com.common.support.track;

import android.content.Context;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.sailfish_commons.logmodels.TrackModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/common/support/track/TrackAgent;", "", "()V", "trackConfig", "Lcom/common/support/track/TrackConfig;", "getTrackConfig", "()Lcom/common/support/track/TrackConfig;", "setTrackConfig", "(Lcom/common/support/track/TrackConfig;)V", "init", "", "context", "Landroid/content/Context;", "builder", "Lcom/common/support/track/TrackConfig$Builder;", "onEvent", "trackModel", "Lcom/common/support/sailfish_commons/logmodels/TrackModel;", "track_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TrackAgent {

    @NotNull
    public static final TrackAgent INSTANCE = new TrackAgent();
    public static TrackConfig trackConfig;

    private TrackAgent() {
    }

    @NotNull
    public final TrackConfig getTrackConfig() {
        TrackConfig trackConfig2 = trackConfig;
        if (trackConfig2 != null) {
            return trackConfig2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trackConfig");
        return null;
    }

    public final void init(@NotNull Context context, @NotNull TrackConfig.Builder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        setTrackConfig(builder.build());
        Sailfish.INSTANCE.addOnConfigChangeAction(new Function0<Unit>() { // from class: com.common.support.track.TrackAgent.init.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.track.TrackAgent.init.1.1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Configuration change for TrackAgent!";
                    }
                }, 1, null);
                TrackAgent.INSTANCE.getTrackConfig().setTrackEnable$track_release(Sailfish.INSTANCE.isTrackEnable());
            }
        });
    }

    public final void onEvent(@NotNull final TrackModel trackModel) {
        Intrinsics.checkNotNullParameter(trackModel, "trackModel");
        if (!getTrackConfig().getIsTrackEnable()) {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.track.TrackAgent.onEvent.1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return Intrinsics.stringPlus("TrackAgent onEvent() isTrackEnable: ", Boolean.valueOf(TrackAgent.INSTANCE.getTrackConfig().getIsTrackEnable()));
                }
            }, 1, null);
        } else {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.track.TrackAgent.onEvent.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return Intrinsics.stringPlus("TrackAgent onEvent() trackModel: ", trackModel);
                }
            }, 1, null);
            Sailfish.INSTANCE.writeTrackLog(trackModel);
        }
    }

    public final void setTrackConfig(@NotNull TrackConfig trackConfig2) {
        Intrinsics.checkNotNullParameter(trackConfig2, "<set-?>");
        trackConfig = trackConfig2;
    }
}
