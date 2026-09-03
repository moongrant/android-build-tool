package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f4322Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f4323Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.OooO0O0 f4324Oooo0oo;

    public OooOO0(ComponentActivity.OooO0O0 oooO0O0, int i, IntentSender.SendIntentException sendIntentException) {
        this.f4324Oooo0oo = oooO0O0;
        this.f4322Oooo0o = i;
        this.f4323Oooo0oO = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4324Oooo0oo.OooO0O0(this.f4322Oooo0o, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f4323Oooo0oO));
    }
}
