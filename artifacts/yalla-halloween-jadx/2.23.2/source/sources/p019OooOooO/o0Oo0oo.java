package p019OooOooO;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f397OooO00o;

    public o0Oo0oo(Context context) {
        this.f397OooO00o = context;
    }

    @Override // p019OooOooO.o000OOo
    public final void onCustomTabsServiceConnected(ComponentName componentName, o0O0O00 o0o0o00) {
        o0o0o00.getClass();
        try {
            o0o0o00.f393OooO00o.OooOOOO(0L);
        } catch (RemoteException unused) {
        }
        this.f397OooO00o.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
