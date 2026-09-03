package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.user.BindMoreAccountModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo000o0 f59020OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59021OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BindMoreAccountModel.Reward f59022OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(oOo000o0 ooo000o0, BindMoreAccountModel.Reward reward, int i) {
        super(2);
        this.f59020OooO0Oo = ooo000o0;
        this.f59022OooO0o0 = reward;
        this.f59021OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f59021OooO0o | 1);
        oOo000o0.OooO0Oo(this.f59020OooO0Oo, this.f59022OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
