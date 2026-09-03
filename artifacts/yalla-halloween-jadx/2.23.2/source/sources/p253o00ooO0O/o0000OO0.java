package p253o00ooO0O;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0000OO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f40232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<T> f40233OooO0O0 = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40234OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bundle f40235OooO0Oo;

    public o0000OO0(int i, int i2, Bundle bundle) {
        this.f40232OooO00o = i;
        this.f40234OooO0OO = i2;
        this.f40235OooO0Oo = bundle;
    }

    public abstract void OooO00o(Bundle bundle);

    public abstract boolean OooO0O0();

    public final void OooO0OO(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            Log.d("MessengerIpcClient", o0OoOo0.OooO0OO(new StringBuilder(strValueOf.length() + 14 + strValueOf2.length()), "Failing ", strValueOf, " with ", strValueOf2));
        }
        this.f40233OooO0O0.setException(zzqVar);
    }

    public final void OooO0Oo(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            Log.d("MessengerIpcClient", o0OoOo0.OooO0OO(new StringBuilder(strValueOf.length() + 16 + strValueOf2.length()), "Finishing ", strValueOf, " with ", strValueOf2));
        }
        this.f40233OooO0O0.setResult(bundle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.f40234OooO0OO);
        sb.append(" id=");
        sb.append(this.f40232OooO00o);
        sb.append(" oneWay=");
        sb.append(OooO0O0());
        sb.append("}");
        return sb.toString();
    }
}
