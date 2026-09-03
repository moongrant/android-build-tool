package p491o0o00O0o;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.moment.o000OOo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0o0Oo implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49078OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f49077OooO0Oo = i;
        this.f49078OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f49077OooO0Oo;
        Object obj = this.f49078OooO0o0;
        switch (i2) {
            case 0:
                AccountProtectionActivity activity = (AccountProtectionActivity) obj;
                int i3 = AccountProtectionActivity.f24684OooOo0O;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                Object obj2 = baseQuickAdapter.f13189OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.model.TrustedDevice");
                TrustedDevice item = (TrustedDevice) obj2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(item, "item");
                Intent intent = new Intent(activity, (Class<?>) ProtectionDetailActivity.class);
                intent.putExtra("TrustedDevice", item);
                activity.startActivity(intent);
                break;
            default:
                o000OOo this_apply = (o000OOo) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Context context = this_apply.f56423OooOo;
                if (context != null) {
                    int i4 = TopicDetailActivity.f25854OooOoOO;
                    Object obj3 = this_apply.f13189OooOOoo.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj3);
                }
                break;
        }
    }
}
