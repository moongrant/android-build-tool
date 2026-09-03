package p587o0oOooOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GifListJson f56800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56802OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(GifListJson gifListJson, Function0<Unit> function0, int i) {
        super(2);
        this.f56800OooO0Oo = gifListJson;
        this.f56802OooO0o0 = function0;
        this.f56801OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f56801OooO0o | 1);
        i0.OooO00o(this.f56800OooO0Oo, this.f56802OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
