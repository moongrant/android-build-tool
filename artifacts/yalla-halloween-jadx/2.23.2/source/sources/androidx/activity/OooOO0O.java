package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.OooO0O0 f2179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f2180OooO0o0;

    public OooOO0O(ComponentActivity.OooO0O0 oooO0O0, int i, IntentSender.SendIntentException sendIntentException) {
        this.f2179OooO0o = oooO0O0;
        this.f2178OooO0Oo = i;
        this.f2180OooO0o0 = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2179OooO0o.OooO00o(this.f2178OooO0Oo, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2180OooO0o0));
    }
}
