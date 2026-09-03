package p331o0O0oooO;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f37077OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaad f37078OooO0O0;

    public o0O00000(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f37078OooO0O0 = zaadVar;
        this.f37077OooO00o = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.f37078OooO0O0.f15311OooO00o.remove(this.f37077OooO00o);
    }
}
