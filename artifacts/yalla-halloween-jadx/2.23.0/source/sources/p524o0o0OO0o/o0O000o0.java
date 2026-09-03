package p524o0o0OO0o;

import android.content.DialogInterface;
import com.yalla.yalla.ext.KeyboardExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p597o0oo00o0.OooOOO;
import p641o0ooOOOO.ac;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends Lambda implements Function1<DialogInterface, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53494OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o0O00 o0o01) {
        super(1);
        this.f53494OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DialogInterface dialogInterface) {
        DialogInterface it = dialogInterface;
        Intrinsics.checkNotNullParameter(it, "it");
        ac acVar = this.f53494OooO0Oo.OooOO0o().f58263OooO0oO.binding;
        KeyboardExtKt.OooO00o(acVar.f57529OooO0Oo);
        acVar.f57529OooO0Oo.clearFocus();
        OooOOO.OooO0O0().OooO00o();
        return Unit.INSTANCE;
    }
}
