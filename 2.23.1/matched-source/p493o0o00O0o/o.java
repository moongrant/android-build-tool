package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49166OooO0o0;

    public /* synthetic */ o(Object obj, int i) {
        this.f49165OooO0Oo = i;
        this.f49166OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object result) {
        int i = this.f49165OooO0Oo;
        Object obj = this.f49166OooO0o0;
        switch (i) {
            case 0:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                int i2 = MomentDetailActivity.f25610Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                this$0.OooOoO().f45009OooO0O0.setExpanded(((Boolean) result).booleanValue());
                break;
            default:
                MainRoomFragment.initObserver$lambda$3((MainRoomFragment) obj, result);
                break;
        }
    }
}
