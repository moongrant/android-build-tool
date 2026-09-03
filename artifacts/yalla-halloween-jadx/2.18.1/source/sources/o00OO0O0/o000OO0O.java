package o00OO0O0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000OO0O f31479Oooo0o = new o000OO0O();

    public o000OO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null) {
            p159o00OoOO.o00O000.OooO().OooO0oo(value.longValue());
        }
        return Unit.INSTANCE;
    }
}
