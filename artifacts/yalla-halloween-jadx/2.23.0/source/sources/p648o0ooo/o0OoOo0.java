package p648o0ooo;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function3<Integer, Integer, Intent, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f59781OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o000oOoO o000oooo2) {
        super(3);
        this.f59781OooO0Oo = o000oooo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Intent intent) {
        this.f59781OooO0Oo.f59755OooO0OO.onActivityResult(num.intValue(), num2.intValue(), intent);
        return Unit.INSTANCE;
    }
}
