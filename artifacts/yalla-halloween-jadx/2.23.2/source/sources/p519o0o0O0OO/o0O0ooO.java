package p519o0o0O0OO;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f52398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52399OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52400OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52401OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(Activity activity, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, BaseMomentDetailVM baseMomentDetailVM) {
        super(0);
        this.f52398OooO0Oo = activity;
        this.f52400OooO0o0 = momentDetailModel;
        this.f52399OooO0o = momentAdapterTag;
        this.f52401OooO0oO = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activity = this.f52398OooO0Oo;
        o000O000.OooO00o(activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null, this.f52400OooO0o0, this.f52399OooO0o, this.f52401OooO0oO, null, null);
        return Unit.INSTANCE;
    }
}
