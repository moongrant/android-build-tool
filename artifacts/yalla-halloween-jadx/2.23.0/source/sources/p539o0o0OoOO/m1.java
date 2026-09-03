package p539o0o0OoOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GifListJson f55595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55596OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(GifListJson gifListJson, int i) {
        super(2);
        this.f55595OooO0Oo = gifListJson;
        this.f55596OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55596OooO0o0 | 1);
        n1.OooO0O0(this.f55595OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
