package o0O0000O;

import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o implements OnTokenCanceledListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f41640OooO00o;

    public o0OOO0o(TaskCompletionSource taskCompletionSource) {
        this.f41640OooO00o = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.f41640OooO00o.f16157OooO00o.OooO0OO();
    }
}
