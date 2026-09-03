package p293o0O0Oo0O;

import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.KotlinVersion;
import p318o0O0oOo.o000;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f35735OooO00o = {ZegoConstants.StreamUpdateType.Deleted, RecyclerView.MAX_SCROLL_DURATION, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ShopVehicleListModel.VehicleTagType_Vip400, ShopVehicleListModel.VehicleTagType_Vip400, RecyclerView.oo0o0Oo.FLAG_MOVED};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35736OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35737OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f35738OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f35736OooO00o = i;
            this.f35737OooO0O0 = i2;
            this.f35738OooO0OO = i3;
        }
    }

    public static void OooO00o(int i, o000 o000Var) {
        o000Var.OooOo(7);
        byte[] bArr = o000Var.f36661OooO00o;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    public static OooO00o OooO0O0(o0000OO0 o0000oo1) {
        int i;
        int i2;
        int iOooO0oO = o0000oo1.OooO0oO(16);
        int iOooO0oO2 = o0000oo1.OooO0oO(16);
        if (iOooO0oO2 == 65535) {
            iOooO0oO2 = o0000oo1.OooO0oO(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iOooO0oO2 + i;
        if (iOooO0oO == 44097) {
            i3 += 2;
        }
        if (o0000oo1.OooO0oO(2) == 3) {
            do {
                o0000oo1.OooO0oO(2);
            } while (o0000oo1.OooO0o());
        }
        int iOooO0oO3 = o0000oo1.OooO0oO(10);
        if (o0000oo1.OooO0o() && o0000oo1.OooO0oO(3) > 0) {
            o0000oo1.OooOOO0(2);
        }
        int i4 = o0000oo1.OooO0o() ? 48000 : 44100;
        int iOooO0oO4 = o0000oo1.OooO0oO(4);
        if (i4 == 44100 && iOooO0oO4 == 13) {
            i2 = f35735OooO00o[iOooO0oO4];
        } else if (i4 == 48000) {
            int[] iArr = f35735OooO00o;
            if (iOooO0oO4 < 14) {
                int i5 = iArr[iOooO0oO4];
                int i6 = iOooO0oO3 % 5;
                if (i6 == 1) {
                    if (iOooO0oO4 != 3 || iOooO0oO4 == 8) {
                        i5++;
                    }
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4 && (iOooO0oO4 == 3 || iOooO0oO4 == 8 || iOooO0oO4 == 11)) {
                            i5++;
                        }
                    } else if (iOooO0oO4 != 3) {
                        i5++;
                    } else {
                        i5++;
                    }
                } else if (iOooO0oO4 == 8 || iOooO0oO4 == 11) {
                    i5++;
                }
                i2 = i5;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new OooO00o(i4, i3, i2);
    }
}
