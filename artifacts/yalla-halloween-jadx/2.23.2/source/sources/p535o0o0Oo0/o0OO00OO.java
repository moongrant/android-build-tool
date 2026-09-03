package p535o0o0Oo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.moment.MomentGift;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f53743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentGift f53744OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53745OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f53746OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(o0O0OOOo o0o0oooo, int i, MomentGift momentGift, int i2) {
        super(2);
        this.f53743OooO0Oo = o0o0oooo;
        this.f53745OooO0o0 = i;
        this.f53744OooO0o = momentGift;
        this.f53746OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53746OooO0oO | 1);
        int i = this.f53745OooO0o0;
        MomentGift momentGift = this.f53744OooO0o;
        o0O0OOOo.OooO0OO(this.f53743OooO0Oo, i, momentGift, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
