package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49138OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(MomentDetailActivity momentDetailActivity) {
        super(1);
        this.f49138OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        ((l) this.f49138OooO0Oo.f25610OooOo.getValue()).OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
