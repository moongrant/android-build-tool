package p515o0o0O0O0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f51855OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51856OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f51857OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51858OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f51859OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l, Long l2) {
        super(0);
        this.f51855OooO0Oo = l;
        this.f51857OooO0o0 = activity;
        this.f51856OooO0o = momentDetailModel;
        this.f51858OooO0oO = baseMomentDetailVM;
        this.f51859OooO0oo = l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Oooo000.OooO00o(this.f51857OooO0o0, this.f51856OooO0o, this.f51858OooO0oO, this.f51855OooO0Oo, this.f51859OooO0oo);
        return Unit.INSTANCE;
    }
}
