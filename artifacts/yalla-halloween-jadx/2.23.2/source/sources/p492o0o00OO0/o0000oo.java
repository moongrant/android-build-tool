package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49129OooO0o0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f49128OooO0Oo = i;
        this.f49129OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object result) {
        int i = this.f49128OooO0Oo;
        Object obj = this.f49129OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                int i2 = MomentDetailActivity.f25608Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                this$0.OooOoO().f44928OooO0O0.setExpanded(((Boolean) result).booleanValue());
                break;
            default:
                MainRoomFragment.initObserver$lambda$2((MainRoomFragment) obj, result);
                break;
        }
    }
}
