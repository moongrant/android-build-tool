package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/facebook/internal/AppCall;", "", "requestCode", "", "callId", "Ljava/util/UUID;", "(ILjava/util/UUID;)V", "getCallId", "()Ljava/util/UUID;", "getRequestCode", "()I", "setRequestCode", "(I)V", "requestIntent", "Landroid/content/Intent;", "getRequestIntent", "()Landroid/content/Intent;", "setRequestIntent", "(Landroid/content/Intent;)V", "setPending", "", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@AutoHandleExceptions
public final class AppCall {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static AppCall currentPendingCall;

    @NotNull
    private final UUID callId;
    private int requestCode;

    @Nullable
    private Intent requestIntent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/AppCall$Companion;", "", "()V", "<set-?>", "Lcom/facebook/internal/AppCall;", "currentPendingCall", "getCurrentPendingCall", "()Lcom/facebook/internal/AppCall;", "finishPendingCall", "callId", "Ljava/util/UUID;", "requestCode", "", "setCurrentPendingCall", "", "appCall", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean setCurrentPendingCall(AppCall appCall) {
            AppCall currentPendingCall;
            currentPendingCall = getCurrentPendingCall();
            AppCall.currentPendingCall = appCall;
            return currentPendingCall != null;
        }

        @JvmStatic
        @Nullable
        public final synchronized AppCall finishPendingCall(@NotNull UUID callId, int requestCode) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            AppCall currentPendingCall = getCurrentPendingCall();
            if (currentPendingCall != null && Intrinsics.areEqual(currentPendingCall.getCallId(), callId) && currentPendingCall.getRequestCode() == requestCode) {
                setCurrentPendingCall(null);
                return currentPendingCall;
            }
            return null;
        }

        @Nullable
        public final AppCall getCurrentPendingCall() {
            return AppCall.currentPendingCall;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AppCall(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public AppCall(int i, @NotNull UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.requestCode = i;
        this.callId = callId;
    }

    @JvmStatic
    @Nullable
    public static final synchronized AppCall finishPendingCall(@NotNull UUID uuid, int i) {
        return INSTANCE.finishPendingCall(uuid, i);
    }

    @NotNull
    public final UUID getCallId() {
        return this.callId;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    @Nullable
    public final Intent getRequestIntent() {
        return this.requestIntent;
    }

    public final boolean setPending() {
        return INSTANCE.setCurrentPendingCall(this);
    }

    public final void setRequestCode(int i) {
        this.requestCode = i;
    }

    public final void setRequestIntent(@Nullable Intent intent) {
        this.requestIntent = intent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppCall(int i, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(i, uuid);
    }
}
