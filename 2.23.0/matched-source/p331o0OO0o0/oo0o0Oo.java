package p331o0OO0o0;

import androidx.activity.result.OooO00o;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0o0Oo implements OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43193OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f43192OooO0Oo = i;
        this.f43193OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f43192OooO0Oo;
        Object obj = this.f43193OooO0o0;
        switch (i) {
            case 1:
                TaskActivity this$0 = (TaskActivity) obj;
                int i2 = TaskActivity.f25537OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO();
                break;
            default:
                MainRoomRecommendFragment.initView$lambda$2((MainRoomRecommendFragment) obj);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o000OOo this$0 = (o000OOo) this.f43193OooO0o0;
        int i = o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0o();
    }
}
