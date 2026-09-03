package p564o0oOo00;

import android.content.DialogInterface;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f45145Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(VehicleMineActivity vehicleMineActivity) {
        super(1);
        this.f45145Oooo0o = vehicleMineActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f45145Oooo0o.f23254OooooOO = false;
        return Unit.INSTANCE;
    }
}
