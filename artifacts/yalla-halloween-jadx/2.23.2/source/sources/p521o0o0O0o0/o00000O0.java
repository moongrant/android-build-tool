package p521o0o0O0o0;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f52923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52925OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM) {
        super(0);
        this.f52923OooO0Oo = activity;
        this.f52925OooO0o0 = momentDetailModel;
        this.f52924OooO0o = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000000O.OooO0O0(this.f52923OooO0Oo, this.f52925OooO0o0, this.f52924OooO0o, 0L);
        return Unit.INSTANCE;
    }
}
