package p499o0o00o0O;

import android.content.DialogInterface;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VehicleMineActivity f49378OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(VehicleMineActivity vehicleMineActivity) {
        super(1);
        this.f49378OooO0Oo = vehicleMineActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49378OooO0Oo.f27038OooOo0o = false;
        return Unit.INSTANCE;
    }
}
