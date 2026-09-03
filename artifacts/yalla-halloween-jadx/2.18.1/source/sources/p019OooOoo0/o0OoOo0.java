package p019OooOoo0;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f376OooO00o;

    public o0OoOo0(Context context) {
        this.f376OooO00o = context;
    }

    @Override // p019OooOoo0.o00Ooo
    public final void onCustomTabsServiceConnected(ComponentName componentName, o00Oo0 o00oo1) {
        Objects.requireNonNull(o00oo1);
        try {
            o00oo1.f373OooO00o.OooOOO();
        } catch (RemoteException unused) {
        }
        this.f376OooO00o.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
