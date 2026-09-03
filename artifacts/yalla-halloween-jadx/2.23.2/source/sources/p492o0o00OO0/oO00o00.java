package p492o0o00OO0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00 extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f49418OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(MutableState<l> mutableState) {
        super(1);
        this.f49418OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        this.f49418OooO0Oo.getValue().OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
