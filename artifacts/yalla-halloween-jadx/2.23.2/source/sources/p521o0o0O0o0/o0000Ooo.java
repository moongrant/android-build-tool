package p521o0o0O0o0;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f52943OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f52944OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52945OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52946OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(Activity activity, MomentDetailModel momentDetailModel, BaseMomentDetailVM baseMomentDetailVM, Long l) {
        super(0);
        this.f52943OooO0Oo = activity;
        this.f52945OooO0o0 = momentDetailModel;
        this.f52944OooO0o = l;
        this.f52946OooO0oO = baseMomentDetailVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BaseMomentDetailVM baseMomentDetailVM = this.f52946OooO0oO;
        Long l = this.f52944OooO0o;
        if (l != null) {
            l.longValue();
            long jLongValue = l.longValue();
            MomentDetailModel momentDetailModel = this.f52945OooO0o0;
            LiveData<ApiResult<Object>> liveDataCircleBlackIns = baseMomentDetailVM.circleBlackIns(jLongValue, momentDetailModel != null ? momentDetailModel.getUserId() : 0L, 1);
            ComponentCallbacks2 componentCallbacks2 = this.f52943OooO0Oo;
            Intrinsics.checkNotNull(componentCallbacks2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            liveDataCircleBlackIns.observe((LifecycleOwner) componentCallbacks2, new o000oOoO(new o0000(momentDetailModel), new o0000O00(momentDetailModel), null, false));
        }
        return Unit.INSTANCE;
    }
}
