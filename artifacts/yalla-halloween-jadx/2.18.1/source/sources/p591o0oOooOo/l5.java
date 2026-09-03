package p591o0oOooOo;

import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0000OO.OooOO0O;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f47278Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ f5 f47279Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayoutScope f47280Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f47281Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f47282OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ EventModel f47283OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(f5 f5Var, ConstraintLayoutScope constraintLayoutScope, OooOO0O oooOO0O, OooOO0O oooOO0O2, EventModel eventModel, int i) {
        super(2);
        this.f47279Oooo0o = f5Var;
        this.f47280Oooo0oO = constraintLayoutScope;
        this.f47281Oooo0oo = oooOO0O;
        this.f47278Oooo = oooOO0O2;
        this.f47283OoooO00 = eventModel;
        this.f47282OoooO0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        f5.OooO0oo(this.f47279Oooo0o, this.f47280Oooo0oO, this.f47281Oooo0oo, this.f47278Oooo, this.f47283OoooO00, ooo00o, this.f47282OoooO0 | 1);
        return Unit.INSTANCE;
    }
}
