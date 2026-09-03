package p506o0o00oO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO.OooO00o f41648Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(o00OO.OooO00o oooO00o) {
        super(1);
        this.f41648Oooo0o = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it1 = str;
        Intrinsics.checkNotNullParameter(it1, "it1");
        Function1<? super String, Unit> function1 = this.f41648Oooo0o.f41636OoooOo0;
        if (function1 != null) {
            function1.invoke(it1);
        }
        return Unit.INSTANCE;
    }
}
