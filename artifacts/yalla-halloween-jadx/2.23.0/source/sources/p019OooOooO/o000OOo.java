package p019OooOooO;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p008OooOOo.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000OOo implements ServiceConnection {

    public class OooO00o extends o0O0O00 {
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, o0O0O00 o0o0o00);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        OooO0OO c0001OooO00o;
        int i = OooO0OO.OooO00o.f202OooO0Oo;
        if (iBinder == null) {
            c0001OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c0001OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0OO)) ? new OooO0OO.OooO00o.C0001OooO00o(iBinder) : (OooO0OO) iInterfaceQueryLocalInterface;
        }
        onCustomTabsServiceConnected(componentName, new OooO00o(c0001OooO00o, componentName));
    }
}
