package p328o0O0ooOO;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0oOOo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37041OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<T> f37042OooO0O0 = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37043OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bundle f37044OooO0Oo;

    public o0oOOo(int i, int i2, Bundle bundle) {
        this.f37041OooO00o = i;
        this.f37043OooO0OO = i2;
        this.f37044OooO0Oo = bundle;
    }

    public abstract void OooO00o(Bundle bundle);

    public abstract boolean OooO0O0();

    public final void OooO0OO(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f37042OooO0O0.setException(zzqVar);
    }

    public final void OooO0Oo(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f37042OooO0O0.setResult(t);
    }

    public final String toString() {
        int i = this.f37043OooO0OO;
        int i2 = this.f37041OooO00o;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(OooO0O0());
        sb.append("}");
        return sb.toString();
    }
}
