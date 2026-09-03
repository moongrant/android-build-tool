package com.yalla.yalla.common.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel;", "", "()V", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel$Action;", "getAction", "()Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel$Action;", "setAction", "(Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel$Action;)V", "oldPurchaseToken", "", "getOldPurchaseToken", "()Ljava/lang/String;", "setOldPurchaseToken", "(Ljava/lang/String;)V", "oldSku", "getOldSku", "setOldSku", "getSkuReplacementMode", "", "isSubscriptionForFirst", "", "toString", "Action", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GooglePaySubscriptionModel {
    public static final int $stable = 8;

    @NotNull
    private String oldSku = "";

    @NotNull
    private String oldPurchaseToken = "";

    @NotNull
    private Action action = Action.ForFirst;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel$Action;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "Downgrade", "ForFirst", "Upgrade", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Action {
        Downgrade(-1),
        ForFirst(0),
        Upgrade(1);

        private final int value;

        Action(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            iArr[Action.Upgrade.ordinal()] = 1;
            iArr[Action.Downgrade.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getOldPurchaseToken() {
        return this.oldPurchaseToken;
    }

    @NotNull
    public final String getOldSku() {
        return this.oldSku;
    }

    public final int getSkuReplacementMode() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.action.ordinal()];
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 2;
    }

    public final boolean isSubscriptionForFirst() {
        return this.action == Action.ForFirst;
    }

    public final void setAction(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "<set-?>");
        this.action = action;
    }

    public final void setOldPurchaseToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oldPurchaseToken = str;
    }

    public final void setOldSku(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oldSku = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("SubscriptionChangeModel(oldSku='");
        sbOooO0O0.append(this.oldSku);
        sbOooO0O0.append("', oldPurchaseToken='");
        sbOooO0O0.append(this.oldPurchaseToken);
        sbOooO0O0.append("', action=");
        sbOooO0O0.append(this.action);
        sbOooO0O0.append(')');
        return sbOooO0O0.toString();
    }
}
