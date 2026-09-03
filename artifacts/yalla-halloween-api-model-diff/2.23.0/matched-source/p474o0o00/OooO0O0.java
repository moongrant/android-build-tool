package p474o0o00;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0O0 implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47211OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f47210OooO0Oo = i;
        this.f47211OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f47210OooO0Oo;
        Object obj = this.f47211OooO0o0;
        switch (i2) {
            case 0:
                AccountProtectionActivity activity = (AccountProtectionActivity) obj;
                int i3 = AccountProtectionActivity.f25146OooOo0O;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Object obj2 = baseQuickAdapter.f10111OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
                TrustedDevice item = (TrustedDevice) obj2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(item, "item");
                Intent intent = new Intent(activity, (Class<?>) ProtectionDetailActivity.class);
                intent.putExtra("TrustedDevice", item);
                activity.startActivity(intent);
                break;
            default:
                ((UserInfoLeftFragment) obj).lambda$initView$4(baseQuickAdapter, view, i);
                break;
        }
    }
}
