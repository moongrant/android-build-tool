package p564o0oOo00;

import android.view.View;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f45130Oooo;

    public o000(VehicleStoreActivity vehicleStoreActivity) {
        this.f45130Oooo = vehicleStoreActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
        VehicleStoreActivity vehicleStoreActivity = this.f45130Oooo;
        Objects.requireNonNull(vehicleStoreActivity);
        oooO00o.OooO00o(vehicleStoreActivity, false);
    }
}
