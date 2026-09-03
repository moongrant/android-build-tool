package p515o0o0O0O0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f51791OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51792OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f51793OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51794OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f51795OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, Long l2) {
        super(0);
        this.f51791OooO0Oo = l;
        this.f51793OooO0o0 = activity;
        this.f51792OooO0o = momentDetailModel;
        this.f51794OooO0oO = baseMomentDetailVM;
        this.f51795OooO0oo = l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Oooo000.OooO00o(this.f51793OooO0o0, this.f51792OooO0o, this.f51794OooO0oO, this.f51791OooO0Oo, this.f51795OooO0oo);
        return Unit.INSTANCE;
    }
}
