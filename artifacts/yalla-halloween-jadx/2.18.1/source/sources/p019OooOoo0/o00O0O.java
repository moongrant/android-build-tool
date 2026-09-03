package p019OooOoo0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends OooOOOo.OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Handler f368OooO00o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f369OooO0O0;

    public class OooO00o implements Runnable {
        public OooO00o(Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Objects.requireNonNull(o00O0O.this);
            throw null;
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0(String str, Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Objects.requireNonNull(o00O0O.this);
            throw null;
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Objects.requireNonNull(o00O0O.this);
            throw null;
        }
    }

    @Override // p008OooOOOo.OooO0O0
    public final void OooOO0o(String str, Bundle bundle) throws RemoteException {
        if (this.f369OooO0O0 == null) {
            return;
        }
        this.f368OooO00o.post(new OooO0O0(str, bundle));
    }

    @Override // p008OooOOOo.OooO0O0
    public final void OooOOO0(Bundle bundle) throws RemoteException {
        if (this.f369OooO0O0 == null) {
            return;
        }
        this.f368OooO00o.post(new OooO00o(bundle));
    }

    public final void OooOOo0(int i, Uri uri, boolean z, @Nullable Bundle bundle) throws RemoteException {
        if (this.f369OooO0O0 == null) {
            return;
        }
        this.f368OooO00o.post(new OooO0OO(i, uri, z, bundle));
    }
}
