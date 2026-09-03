package p675oO0Oo;

import android.view.View;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOo0o00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f59845OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f59846OooO0o0;

    public /* synthetic */ oOo0o00(int i, View.OnClickListener onClickListener) {
        this.f59845OooO0Oo = i;
        this.f59846OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f59845OooO0Oo;
        View.OnClickListener onClickListener = this.f59846OooO0o0;
        switch (i) {
            case 0:
                O0OO00 this$0 = (O0OO00) onClickListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new O0OO00.OooOOO(null), 3, null);
                }
                this$0.OooO0O0();
                break;
            default:
                ((UserInfoLeftFragment) onClickListener).lambda$loadVehicleList$1((ApiResult) obj);
                break;
        }
    }
}
