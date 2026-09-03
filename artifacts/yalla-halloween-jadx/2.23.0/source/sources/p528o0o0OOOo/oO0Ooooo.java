package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.moment.MomentGift;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f54049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentGift f54050OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54051OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54052OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(oO0Oo oo0oo, int i, MomentGift momentGift, int i2) {
        super(2);
        this.f54049OooO0Oo = oo0oo;
        this.f54051OooO0o0 = i;
        this.f54050OooO0o = momentGift;
        this.f54052OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54052OooO0oO | 1);
        int i = this.f54051OooO0o0;
        MomentGift momentGift = this.f54050OooO0o;
        oO0Oo.OooO0OO(this.f54049OooO0Oo, i, momentGift, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
