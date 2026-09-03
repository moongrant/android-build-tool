package p019OooOoo0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p008OooOOOo.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Ooo implements ServiceConnection {

    public class OooO00o extends o00Oo0 {
        public OooO00o(OooO0OO oooO0OO, ComponentName componentName) {
            super(oooO0OO, componentName);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, o00Oo0 o00oo1);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        OooO0OO c0002OooO00o;
        int i = OooO0OO.OooO00o.f178OooO00o;
        if (iBinder == null) {
            c0002OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c0002OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0OO)) ? new OooO0OO.OooO00o.C0002OooO00o(iBinder) : (OooO0OO) iInterfaceQueryLocalInterface;
        }
        onCustomTabsServiceConnected(componentName, new OooO00o(c0002OooO00o, componentName));
    }
}
