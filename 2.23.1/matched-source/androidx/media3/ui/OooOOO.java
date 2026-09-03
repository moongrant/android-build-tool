package androidx.media3.ui;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9646OooO0o0;

    public /* synthetic */ OooOOO(ViewGroup viewGroup, int i) {
        this.f9645OooO0Oo = i;
        this.f9646OooO0o0 = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9645OooO0Oo;
        ViewGroup viewGroup = this.f9646OooO0o0;
        switch (i) {
            case 0:
                PlayerControlView.OooO00o((PlayerControlView) viewGroup);
                break;
            default:
                com.twitter.sdk.android.tweetcomposer.OooO00o.this.OooO00o();
                break;
        }
    }
}
