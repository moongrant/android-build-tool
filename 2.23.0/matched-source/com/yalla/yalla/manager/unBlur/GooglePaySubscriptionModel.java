package com.yalla.yalla.manager.unBlur;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GooglePaySubscriptionModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f23407OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public String f23408OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Action f23409OooO0OO = Action.ForFirst;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/manager/unBlur/GooglePaySubscriptionModel$Action;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Downgrade", "ForFirst", "Upgrade", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum Action {
        Downgrade(-1),
        ForFirst(0),
        Upgrade(1);

        private final int value;

        Action(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.Upgrade.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.Downgrade.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final String toString() {
        String str = this.f23407OooO00o;
        String str2 = this.f23408OooO0O0;
        Action action = this.f23409OooO0OO;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("SubscriptionChangeModel(oldSku='", str, "', oldPurchaseToken='", str2, "', action=");
        sbOooO0OO.append(action);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
