package p530o0o0OOOO;

import android.content.DialogInterface;
import com.yalla.yalla.ext.KeyboardExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.p3;
import p601o0oo00oO.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53397OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(o0O00oO0 o0o00oo1) {
        super(1);
        this.f53397OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        p3 p3Var = this.f53397OooO0Oo.OooOO0o().f44844OooO0oO.binding;
        KeyboardExtKt.OooO00o(p3Var.f45394OooO0Oo);
        p3Var.f45394OooO0Oo.clearFocus();
        o000OO.OooO0O0().OooO00o();
        return Unit.INSTANCE;
    }
}
