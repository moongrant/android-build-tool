package com.yalla.yalla.common.ui.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/common/ui/view/VipLevel;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Companion", "Vip0", "Vip1", "Vip2", "Vip3", "Vip4", "Vip5", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum VipLevel {
    Vip0(0),
    Vip1(100),
    Vip2(200),
    Vip3(ShopVehicleListModel.VehicleTagType_Vip300),
    Vip4(ShopVehicleListModel.VehicleTagType_Vip400),
    Vip5(500);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final int value;

    /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.VipLevel$OooO00o, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.VipLevel$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0225OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VipLevel.values().length];
                iArr[VipLevel.Vip0.ordinal()] = 1;
                iArr[VipLevel.Vip1.ordinal()] = 2;
                iArr[VipLevel.Vip2.ordinal()] = 3;
                iArr[VipLevel.Vip3.ordinal()] = 4;
                iArr[VipLevel.Vip4.ordinal()] = 5;
                iArr[VipLevel.Vip5.ordinal()] = 6;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final int OooO00o(int i) {
            switch (C0225OooO00o.$EnumSwitchMapping$0[OooO0O0(i).ordinal()]) {
                case 1:
                case 2:
                    return R.drawable.user_ka_vip_level_image_1;
                case 3:
                    return R.drawable.user_ka_vip_level_image_2;
                case 4:
                    return R.drawable.user_ka_vip_level_image_3;
                case 5:
                    return R.drawable.user_ka_vip_level_image_4;
                case 6:
                    return R.drawable.user_ka_vip_level_image_5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @NotNull
        public final VipLevel OooO0O0(int i) {
            if (i == 0) {
                return VipLevel.Vip0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 100) {
                                    if (i != 200) {
                                        if (i != 300) {
                                            if (i != 400) {
                                                if (i != 500) {
                                                    return VipLevel.Vip0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return VipLevel.Vip5;
                        }
                        return VipLevel.Vip4;
                    }
                    return VipLevel.Vip3;
                }
                return VipLevel.Vip2;
            }
            return VipLevel.Vip1;
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip0.ordinal()] = 1;
            iArr[VipLevel.Vip1.ordinal()] = 2;
            iArr[VipLevel.Vip2.ordinal()] = 3;
            iArr[VipLevel.Vip3.ordinal()] = 4;
            iArr[VipLevel.Vip4.ordinal()] = 5;
            iArr[VipLevel.Vip5.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    VipLevel(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final int OooO0O0() {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
