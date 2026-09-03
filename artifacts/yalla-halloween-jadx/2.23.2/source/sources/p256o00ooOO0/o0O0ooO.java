package p256o00ooOO0;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zaad;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f40329OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaad f40330OooO0O0;

    public o0O0ooO(zaad zaadVar, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.f40330OooO0O0 = zaadVar;
        this.f40329OooO00o = apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.f40330OooO0O0.f14334OooO00o.remove(this.f40329OooO00o);
    }
}
