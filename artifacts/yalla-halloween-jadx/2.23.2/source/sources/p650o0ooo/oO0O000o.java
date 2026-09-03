package p650o0ooo;

import android.view.View;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O000o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f58854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f58855OooO0o0;

    public /* synthetic */ oO0O000o(int i, View.OnClickListener onClickListener) {
        this.f58854OooO0Oo = i;
        this.f58855OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f58854OooO0Oo;
        View.OnClickListener onClickListener = this.f58855OooO0o0;
        switch (i) {
            case 0:
                oO0O00oO this$0 = (oO0O00oO) onClickListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0O00oO.OooOOO(null), 3, null);
                }
                this$0.OooO0O0();
                break;
            default:
                ((UserInfoLeftFragment) onClickListener).lambda$loadVehicleList$1((ApiResult) obj);
                break;
        }
    }
}
