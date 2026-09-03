package com.yalla.yalla.manager.unBlur;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GooglePaySubscriptionModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f22938OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public String f22939OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Action f22940OooO0OO = Action.ForFirst;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel$Action[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel$Action[]) from 0x002a: INVOKE (r5v2 com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel$Action[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:43)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/manager/unBlur/GooglePaySubscriptionModel$Action;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Downgrade", "ForFirst", "Upgrade", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Action {
        Downgrade(-1),
        ForFirst(0),
        Upgrade(1);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(actionArr);
        }

        public Action(int i) {
            super(str, i);
            this.value = i;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
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
        String str = this.f22938OooO00o;
        String str2 = this.f22939OooO0O0;
        Action action = this.f22940OooO0OO;
        StringBuilder sbOooO00o = OooO0OO.OooO00o("SubscriptionChangeModel(oldSku='", str, "', oldPurchaseToken='", str2, "', action=");
        sbOooO00o.append(action);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }
}
