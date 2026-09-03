package p257o00ooOOo;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OOO0OO extends zzc {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f40359OooO0Oo;
    public final int zza;

    @Nullable
    public final Bundle zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public o0OOO0OO(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.f40359OooO0Oo = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void OooO00o() {
        int i = this.zza;
        BaseGmsClient baseGmsClient = this.f40359OooO0Oo;
        if (i != 0) {
            baseGmsClient.OooO(1, null);
            Bundle bundle = this.zzb;
            OooO0OO(new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (OooO0Oo()) {
                return;
            }
            baseGmsClient.OooO(1, null);
            OooO0OO(new ConnectionResult(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final void OooO0O0() {
    }

    public abstract void OooO0OO(ConnectionResult connectionResult);

    public abstract boolean OooO0Oo();
}
