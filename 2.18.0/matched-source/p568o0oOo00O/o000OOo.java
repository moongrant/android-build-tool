package p568o0oOo00O;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import com.yalla.yalla.ui.view.MomentDetailUserView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45247Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45248OoooO00;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f45247Oooo = i;
        this.f45248OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45247Oooo) {
            case 0:
                AristocracyPresentationActivity this$0 = (AristocracyPresentationActivity) this.f45248OoooO00;
                int i = AristocracyPresentationActivity.f23300OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                break;
            default:
                MomentDetailUserView this$1 = (MomentDetailUserView) this.f45248OoooO00;
                int i2 = MomentDetailUserView.f24937OooooO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f24947OoooOoO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
