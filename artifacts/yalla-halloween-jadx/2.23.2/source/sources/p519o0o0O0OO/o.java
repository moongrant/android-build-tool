package p519o0o0O0OO;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51903OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f51905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f51906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51908OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BaseMomentDetailVM baseMomentDetailVM, long j, long j2, LifecycleOwner lifecycleOwner, MomentDetailModel momentDetailModel, boolean z) {
        super(0);
        this.f51904OooO0Oo = baseMomentDetailVM;
        this.f51906OooO0o0 = j;
        this.f51905OooO0o = j2;
        this.f51907OooO0oO = lifecycleOwner;
        this.f51908OooO0oo = momentDetailModel;
        this.f51903OooO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f51904OooO0Oo.momentPollCancel(this.f51906OooO0o0, this.f51905OooO0o).observe(this.f51907OooO0oO, new o000oOoO(new ooo0Oo0(this.f51908OooO0oo, this.f51903OooO), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
