package p566o0oOo00O;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import com.yalla.yalla.ui.view.MomentDetailUserView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45189Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f45190Oooo0oO;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f45189Oooo0o = i;
        this.f45190Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45189Oooo0o) {
            case 0:
                AristocracyPresentationActivity this$0 = (AristocracyPresentationActivity) this.f45190Oooo0oO;
                int i = AristocracyPresentationActivity.f23281Ooooo00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                break;
            default:
                MomentDetailUserView this$1 = (MomentDetailUserView) this.f45190Oooo0oO;
                int i2 = MomentDetailUserView.f24918OoooOoo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f24928OoooOOO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
