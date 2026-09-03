package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0O000 f58906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f58907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f58908OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0(oOO0O000 ooo0o000, MainRoomVM mainRoomVM, int i) {
        super(2);
        this.f58906OooO0Oo = ooo0o000;
        this.f58908OooO0o0 = mainRoomVM;
        this.f58907OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58907OooO0o | 1);
        oOO0O000.OooO0OO(this.f58906OooO0Oo, this.f58908OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
