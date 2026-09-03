package p499o0o00o0O;

import android.content.DialogInterface;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f49405OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(VehicleStoreActivity vehicleStoreActivity) {
        super(1);
        this.f49405OooO0Oo = vehicleStoreActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49405OooO0Oo.f27048OooOo0o = false;
        return Unit.INSTANCE;
    }
}
