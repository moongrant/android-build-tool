package p331o0O0oooO;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OO00o0<T> extends zac {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskCompletionSource<T> f37122OooO00o;

    public o0OO00o0(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f37122OooO00o = taskCompletionSource;
    }

    public abstract void zac(zabq<?> zabqVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.f37122OooO00o.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.f37122OooO00o.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e) {
            zad(zai.OooO00o(e));
            throw e;
        } catch (RemoteException e2) {
            zad(zai.OooO00o(e2));
        } catch (RuntimeException e3) {
            this.f37122OooO00o.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
