package p515o0o0O0O0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f51809OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51810OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51811OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM) {
        super(0);
        this.f51809OooO0Oo = activity;
        this.f51811OooO0o0 = momentDetailModel;
        this.f51810OooO0o = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Oooo000.OooO0O0(this.f51809OooO0Oo, this.f51811OooO0o0, this.f51810OooO0o, 0L);
        return Unit.INSTANCE;
    }
}
