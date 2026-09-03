package o0O0000O;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OnTokenCanceledListener f41598OooO0Oo;

    public OooO00o(OnTokenCanceledListener onTokenCanceledListener) {
        this.f41598OooO0Oo = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f41598OooO0Oo.onCanceled();
    }
}
