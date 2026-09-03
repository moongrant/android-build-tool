package p523o0o0O0oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f53190OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f53191OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53192OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53193OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f53194OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(oO000O0O oo000o0o, int i, Modifier modifier, int i2, int i3) {
        super(2);
        this.f53190OooO0Oo = oo000o0o;
        this.f53192OooO0o0 = i;
        this.f53191OooO0o = modifier;
        this.f53193OooO0oO = i2;
        this.f53194OooO0oo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oO000O0O oo000o0o = this.f53190OooO0Oo;
        int i = this.f53192OooO0o0;
        oo000o0o.OooO0O0(i, RecomposeScopeImplKt.updateChangedFlags(this.f53193OooO0oO | 1), this.f53194OooO0oo, composer, this.f53191OooO0o);
        return Unit.INSTANCE;
    }
}
