package p501o0o00o;

import com.yalla.yalla.common.manager.data.SharedWeeklyStarManager;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41492Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o000 o000Var) {
        super(0);
        this.f41492Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000 o000Var = this.f41492Oooo0o;
        Objects.requireNonNull(o000Var);
        SharedWeeklyStarManager.INSTANCE.getWeeklyStar().observe(o000Var.f41395OooO0oO, new o0000OO0(o000Var, 0));
        return Unit.INSTANCE;
    }
}
