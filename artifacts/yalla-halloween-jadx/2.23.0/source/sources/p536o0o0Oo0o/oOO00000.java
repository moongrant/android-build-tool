package p536o0o0Oo0o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.user.UserMomentListTypeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0000 f55184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55185OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<UserMomentListTypeModel, Unit> f55186OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55187OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOO00000(oOO0000 ooo0000, Function1<? super UserMomentListTypeModel, Unit> function1, int i, int i2) {
        super(2);
        this.f55184OooO0Oo = ooo0000;
        this.f55186OooO0o0 = function1;
        this.f55185OooO0o = i;
        this.f55187OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55185OooO0o | 1);
        oOO0000 ooo0000 = this.f55184OooO0Oo;
        Function1<UserMomentListTypeModel, Unit> function1 = this.f55186OooO0o0;
        ooo0000.OooO00o(iUpdateChangedFlags, this.f55187OooO0oO, composer, function1);
        return Unit.INSTANCE;
    }
}
