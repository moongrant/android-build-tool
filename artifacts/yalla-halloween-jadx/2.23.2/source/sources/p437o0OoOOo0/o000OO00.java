package p437o0OoOOo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f47159OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f47160OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f47161OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public SkuDetails f47162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ProductDetails f47163OooO0o0;

    public o000OO00(@NotNull String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f47159OooO00o = sku;
        this.f47161OooO0OO = "USD";
    }

    @NotNull
    public final String toString() {
        return "GooglePaySkuDetail(sku='" + this.f47159OooO00o + "', amount=" + this.f47160OooO0O0 + ", unit='" + this.f47161OooO0OO + "', \ndetail=" + this.f47162OooO0Oo + ", \nproductDetails=" + this.f47163OooO0o0 + ")";
    }
}
