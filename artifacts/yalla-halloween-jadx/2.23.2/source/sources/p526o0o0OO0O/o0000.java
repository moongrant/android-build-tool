package p526o0o0OO0O;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function3<Integer, Integer, Intent, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f53269OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o0000Ooo o0000ooo) {
        super(3);
        this.f53269OooO0Oo = o0000ooo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Intent intent) {
        this.f53269OooO0Oo.f53292OooO0OO.onActivityResult(num.intValue(), num2.intValue(), intent);
        return Unit.INSTANCE;
    }
}
