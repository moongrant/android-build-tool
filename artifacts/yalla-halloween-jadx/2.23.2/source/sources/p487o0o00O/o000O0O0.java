package p487o0o00O;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.activity.main.OooO0OO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p433o0OoOOO0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f48779OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48780OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o0000Ooo o0000ooo, int i) {
        super(2);
        this.f48779OooO0Oo = o0000ooo;
        this.f48780OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48780OooO0o0 | 1);
        OooO0OO.OooO0OO(this.f48779OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
