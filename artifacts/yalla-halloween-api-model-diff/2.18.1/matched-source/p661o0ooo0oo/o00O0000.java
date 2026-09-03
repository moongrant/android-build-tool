package p661o0ooo0oo;

import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f51496OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00OOO00 f51497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f51498OooO0O0;

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:24:0x0039  */
        public final boolean OooO00o(@NotNull o00OOOO0 response, @NotNull o00OOO00 request) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int i = response.f51443OoooO00;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i == 307) {
                    if (response.OooO0O0("Expires", null) == null && response.OooO00o().f51267OooO0OO == -1 && !response.OooO00o().f51269OooO0o && !response.OooO00o().f51270OooO0o0) {
                        return false;
                    }
                } else if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case ShopVehicleListModel.VehicleTagType_Vip300 /* 300 */:
                        case 301:
                            break;
                        case 302:
                            if (response.OooO0O0("Expires", null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.OooO00o().f51266OooO0O0 || request.OooO00o().f51266OooO0O0) ? false : true;
        }
    }

    public o00O0000(@Nullable o00OOO00 o00ooo01, @Nullable o00OOOO0 o00oooo1) {
        this.f51497OooO00o = o00ooo01;
        this.f51498OooO0O0 = o00oooo1;
    }
}
