package p492o0o00OO0;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.v3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0oo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f49306OooO0o0;

    public /* synthetic */ o0O0oo00(int i, View.OnClickListener onClickListener) {
        this.f49305OooO0Oo = i;
        this.f49306OooO0o0 = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49305OooO0Oo;
        View.OnClickListener onClickListener = this.f49306OooO0o0;
        switch (i) {
            case 0:
                ShowImageActivity this$0 = (ShowImageActivity) onClickListener;
                int i2 = ShowImageActivity.f25802Oooo00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = this$0.f25804OooOOo0.get(this$0.OooOo0o().f44718OooO0o0.getCurrentItem());
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                this$0.OooOo(str, false);
                break;
            case 1:
                AristocracyPresentationActivity this$1 = (AristocracyPresentationActivity) onClickListener;
                int i3 = AristocracyPresentationActivity.f26602OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                break;
            default:
                v3 this$2 = (v3) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0();
                break;
        }
    }
}
