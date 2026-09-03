package p509o0o0O0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51138OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f51140OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f51141OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51142OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51143OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(BaseMomentDetailVM baseMomentDetailVM, long j, long j2, LifecycleOwner lifecycleOwner, MomentDetailModel momentDetailModel, boolean z) {
        super(0);
        this.f51139OooO0Oo = baseMomentDetailVM;
        this.f51141OooO0o0 = j;
        this.f51140OooO0o = j2;
        this.f51142OooO0oO = lifecycleOwner;
        this.f51143OooO0oo = momentDetailModel;
        this.f51138OooO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f51139OooO0Oo.momentPollCancel(this.f51141OooO0o0, this.f51140OooO0o).observe(this.f51142OooO0oO, new o0000OO0(new o0O00o00(this.f51143OooO0oo, this.f51138OooO), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
