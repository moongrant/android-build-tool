package p034OoooOO0;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.o0Oo0oo;
import p031OoooO0.OooOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1462OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1463OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rational f1464OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f1465OooO0Oo;

    public o0ooOOo(@NonNull o0Oo0oo o0oo0oo2, @Nullable Rational rational) {
        this.f1462OooO00o = o0oo0oo2.OooO0OO();
        this.f1463OooO0O0 = o0oo0oo2.OooO0o0();
        this.f1464OooO0OO = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.f1465OooO0Oo = z;
    }

    @Nullable
    public final Size OooO00o(@NonNull ImageOutputConfig imageOutputConfig) {
        int iOooOOO = imageOutputConfig.OooOOO();
        Size sizeOooOOOO = imageOutputConfig.OooOOOO();
        if (sizeOooOOOO == null) {
            return sizeOooOOOO;
        }
        int iOooO00o = OooOo.OooO00o(OooOo.OooO0O0(iOooOOO), this.f1462OooO00o, 1 == this.f1463OooO0O0);
        return iOooO00o == 90 || iOooO00o == 270 ? new Size(sizeOooOOOO.getHeight(), sizeOooOOOO.getWidth()) : sizeOooOOOO;
    }
}
