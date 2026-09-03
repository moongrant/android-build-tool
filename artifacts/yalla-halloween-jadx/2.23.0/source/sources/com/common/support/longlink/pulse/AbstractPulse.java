package com.common.support.longlink.pulse;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/common/support/longlink/pulse/AbstractPulse;", "Lcom/common/support/longlink/pulse/Pulse;", "()V", "isPulsing", "", "pulseTimeoutListener", "Lcom/common/support/longlink/pulse/Pulse$OnPulseTimeoutListener;", "getPulseTimeoutListener", "()Lcom/common/support/longlink/pulse/Pulse$OnPulseTimeoutListener;", "setPulseTimeoutListener", "(Lcom/common/support/longlink/pulse/Pulse$OnPulseTimeoutListener;)V", ViewHierarchyConstants.TAG_KEY, "", "getTag$longlink_release", "()Ljava/lang/String;", "setTag$longlink_release", "(Ljava/lang/String;)V", "setOnPulseTimeoutListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "start", "stop", "longlink_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractPulse implements Pulse {
    private boolean isPulsing;

    @Nullable
    private Pulse.OnPulseTimeoutListener pulseTimeoutListener;

    @NotNull
    private String tag = "";

    @Nullable
    public final Pulse.OnPulseTimeoutListener getPulseTimeoutListener() {
        return this.pulseTimeoutListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getTag$longlink_release, reason: from getter */
    public String getTag() {
        return this.tag;
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void setOnPulseTimeoutListener(@NotNull Pulse.OnPulseTimeoutListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.pulseTimeoutListener = listener;
    }

    public final void setPulseTimeoutListener(@Nullable Pulse.OnPulseTimeoutListener onPulseTimeoutListener) {
        this.pulseTimeoutListener = onPulseTimeoutListener;
    }

    public void setTag$longlink_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void start() {
        if (this.isPulsing) {
            return;
        }
        this.isPulsing = true;
    }

    @Override // com.common.support.longlink.pulse.Pulse
    public void stop() {
        if (this.isPulsing) {
            this.isPulsing = false;
        }
    }
}
