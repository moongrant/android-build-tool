package p564o0oOo00;

import android.content.DialogInterface;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VehicleStoreActivity f45152Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(VehicleStoreActivity vehicleStoreActivity) {
        super(1);
        this.f45152Oooo0o = vehicleStoreActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f45152Oooo0o.f23263OooooO0 = false;
        return Unit.INSTANCE;
    }
}
