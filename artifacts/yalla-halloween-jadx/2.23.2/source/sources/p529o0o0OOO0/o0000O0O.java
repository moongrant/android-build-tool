package p529o0o0OOO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.ui.fragment.message.OooOO0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f53381OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53382OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53383OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(Modifier modifier, int i, int i2) {
        super(2);
        this.f53381OooO0Oo = modifier;
        this.f53383OooO0o0 = i;
        this.f53382OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        OooOO0.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f53383OooO0o0 | 1), this.f53382OooO0o, composer, this.f53381OooO0Oo);
        return Unit.INSTANCE;
    }
}
