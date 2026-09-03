package p493o0o00O0o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOO0OO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f49353OooO0o0;

    public /* synthetic */ oOOO0OO0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f49352OooO0Oo = i;
        this.f49353OooO0o0 = baseFragmentActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49352OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f49353OooO0o0;
        switch (i) {
            case 0:
                ShowImageActivity this$0 = (ShowImageActivity) baseFragmentActivity;
                int i2 = ShowImageActivity.f25804Oooo00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = this$0.f25806OooOOo0.get(this$0.OooOo0o().f45047OooO0o0.getCurrentItem());
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                this$0.OooOo(str, false);
                break;
            default:
                AristocracyPresentationActivity this$1 = (AristocracyPresentationActivity) baseFragmentActivity;
                int i3 = AristocracyPresentationActivity.f26603OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                break;
        }
    }
}
