package com.yalla.yalla.common.ui.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/ui/view/PremiumLevel;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Companion", "Premium0", "Premium1", "Premium2", "Premium3", "Premium4", "Premium5", "Premium6", "Premium7", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum PremiumLevel {
    Premium0(0),
    Premium1(100),
    Premium2(200),
    Premium3(ShopVehicleListModel.VehicleTagType_Vip300),
    Premium4(ShopVehicleListModel.VehicleTagType_Vip400),
    Premium5(500),
    Premium6(600),
    Premium7(700);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.PremiumLevel$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final PremiumLevel OooO00o(@Nullable Integer num) {
            if (num != null && num.intValue() == 0) {
                return PremiumLevel.Premium0;
            }
            boolean z = false;
            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 100)) {
                return PremiumLevel.Premium1;
            }
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 200)) {
                return PremiumLevel.Premium2;
            }
            if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 300)) {
                return PremiumLevel.Premium3;
            }
            if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 400)) {
                return PremiumLevel.Premium4;
            }
            if ((num != null && num.intValue() == 5) || (num != null && num.intValue() == 500)) {
                return PremiumLevel.Premium5;
            }
            if ((num != null && num.intValue() == 6) || (num != null && num.intValue() == 600)) {
                return PremiumLevel.Premium5;
            }
            if ((num != null && num.intValue() == 7) || (num != null && num.intValue() == 700)) {
                z = true;
            }
            return z ? PremiumLevel.Premium5 : PremiumLevel.Premium0;
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PremiumLevel.values().length];
            iArr[PremiumLevel.Premium0.ordinal()] = 1;
            iArr[PremiumLevel.Premium1.ordinal()] = 2;
            iArr[PremiumLevel.Premium2.ordinal()] = 3;
            iArr[PremiumLevel.Premium3.ordinal()] = 4;
            iArr[PremiumLevel.Premium4.ordinal()] = 5;
            iArr[PremiumLevel.Premium5.ordinal()] = 6;
            iArr[PremiumLevel.Premium6.ordinal()] = 7;
            iArr[PremiumLevel.Premium7.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    PremiumLevel(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final int OooO0O0() {
        return Math.max(OooO0Oo() - 1, 0);
    }

    public final int OooO0Oo() {
        switch (OooO0O0.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
