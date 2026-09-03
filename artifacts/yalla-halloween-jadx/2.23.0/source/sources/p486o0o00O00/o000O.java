package p486o0o00O00;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.activity.main.OooO0OO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p426o0OoOO.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f48278OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48279OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(Oooo0 oooo0, int i) {
        super(2);
        this.f48278OooO0Oo = oooo0;
        this.f48279OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48279OooO0o0 | 1);
        OooO0OO.OooO0OO(this.f48278OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
