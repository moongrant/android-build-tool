package p506o0o00oO0;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O extends Lambda implements Function3<Integer, Integer, Intent, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O f41643Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(o00O o00o2) {
        super(3);
        this.f41643Oooo0o = o00o2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Intent intent) {
        this.f41643Oooo0o.f41625OooO0OO.onActivityResult(num.intValue(), num2.intValue(), intent);
        return Unit.INSTANCE;
    }
}
