package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.fragment.room.RoomThemeMineFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0oOo0O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48866OooO0o0;

    public /* synthetic */ o0oOo0O0(Object obj, int i) {
        this.f48865OooO0Oo = i;
        this.f48866OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48865OooO0Oo;
        Object obj2 = this.f48866OooO0o0;
        switch (i) {
            case 0:
                UntieAccountBindActivity this$0 = (UntieAccountBindActivity) obj2;
                ApiResult apiResult = (ApiResult) obj;
                int i2 = UntieAccountBindActivity.f24889OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOo0();
                if (apiResult.isSuccess()) {
                    if (apiResult.getData() != null) {
                        this$0.f24891OooOo0 = (AccountBindInfo) apiResult.getData();
                    }
                }
                break;
            default:
                RoomThemeMineFragment.initView$lambda$0((RoomThemeMineFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
