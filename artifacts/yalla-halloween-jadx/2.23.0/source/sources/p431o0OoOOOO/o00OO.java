package p431o0OoOOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f45870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f45871OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f45872OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public SkuDetails f45873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ProductDetails f45874OooO0o0;

    public o00OO(@NotNull String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f45870OooO00o = sku;
        this.f45872OooO0OO = "USD";
    }

    @NotNull
    public final String toString() {
        return "GooglePaySkuDetail(sku='" + this.f45870OooO00o + "', amount=" + this.f45871OooO0O0 + ", unit='" + this.f45872OooO0OO + "', \ndetail=" + this.f45873OooO0Oo + ", \nproductDetails=" + this.f45874OooO0o0 + ")";
    }
}
