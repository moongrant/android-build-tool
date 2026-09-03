package o0OO0o00;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f37917OooO0Oo;

    public /* synthetic */ OooO00o() {
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ((OnTokenCanceledListener) this.f37917OooO0Oo).onCanceled();
    }
}
