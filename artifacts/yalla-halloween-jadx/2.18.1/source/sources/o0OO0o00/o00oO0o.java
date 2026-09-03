package o0OO0o00;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements OnTokenCanceledListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37955OooO00o;

    public o00oO0o(TaskCompletionSource taskCompletionSource) {
        this.f37955OooO00o = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.f37955OooO00o.f16362OooO00o.OooO0OO();
    }
}
