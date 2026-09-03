package p432o0OoOOOo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.http.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45960OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(o00OOOOo o00ooooo2, RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
        super(1);
        this.f45960OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        o00OOOOo o00ooooo2 = this.f45960OooO0Oo;
        o00ooooo2.f45930OooOO0o = false;
        if (error.getCode() == 3003) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                o0oo00o2.OooOOoo(oO00OOo0.Recharge_Page_CopyUnder_maintenance_Dialog);
                o0oo00o2.OooOOOO(oO00OOo0.OK);
                o0oo00o2.OooOo0(new o0O00000(o00ooooo2));
                o0oo00o2.OooOO0o();
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
