package p474o0o00;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<ApiResult<List<TrustedDevice>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f47214OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AccountProtectionActivity accountProtectionActivity) {
        super(1);
        this.f47214OooO0Oo = accountProtectionActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<TrustedDevice>> apiResult) {
        ApiResult<List<TrustedDevice>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        AccountProtectionActivity accountProtectionActivity = this.f47214OooO0Oo;
        accountProtectionActivity.OooOo0();
        if (it.isSuccess()) {
            List<TrustedDevice> data = it.getData();
            if ((data != null ? data.size() : 0) > 0) {
                TextView textView = accountProtectionActivity.OooOoO0().f58771OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTrustedDevice");
                o000OO00.OooOOOO(textView);
                RecyclerView recyclerView = accountProtectionActivity.OooOoO0().f58769OooO0O0;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvTrustedDevice");
                o000OO00.OooOOOO(recyclerView);
            } else {
                TextView textView2 = accountProtectionActivity.OooOoO0().f58771OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTrustedDevice");
                o000OO00.OooO0OO(textView2);
                RecyclerView recyclerView2 = accountProtectionActivity.OooOoO0().f58769OooO0O0;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvTrustedDevice");
                o000OO00.OooO0OO(recyclerView2);
            }
        } else {
            TextView textView3 = accountProtectionActivity.OooOoO0().f58771OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTrustedDevice");
            o000OO00.OooO0OO(textView3);
            RecyclerView recyclerView3 = accountProtectionActivity.OooOoO0().f58769OooO0O0;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "binding.rvTrustedDevice");
            o000OO00.OooO0OO(recyclerView3);
        }
        OooOo00 oooOo00 = accountProtectionActivity.f25148OooOo0;
        if (oooOo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOo00 = null;
        }
        oooOo00.Oooo0O0(it.isSuccess());
        return Unit.INSTANCE;
    }
}
