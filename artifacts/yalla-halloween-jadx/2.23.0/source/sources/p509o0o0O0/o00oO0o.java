package p509o0o0O0;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f50961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50963OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f50964OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(Activity activity, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, BaseMomentDetailVM baseMomentDetailVM) {
        super(0);
        this.f50961OooO0Oo = activity;
        this.f50963OooO0o0 = momentDetailModel;
        this.f50962OooO0o = momentAdapterTag;
        this.f50964OooO0oO = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activity = this.f50961OooO0Oo;
        o000OOo.OooO00o(activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null, this.f50963OooO0o0, this.f50962OooO0o, this.f50964OooO0oO, null, null);
        return Unit.INSTANCE;
    }
}
