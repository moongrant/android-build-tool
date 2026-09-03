package o000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO extends Binder implements IInterface {
    public OooO0OO() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        OooO0O0 oooO00o;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
        parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            oooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            oooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0O0)) ? new OooO00o(strongBinder) : (OooO0O0) iInterfaceQueryLocalInterface;
        }
        UnusedAppRestrictionsBackportService.OooO00o oooO00o2 = (UnusedAppRestrictionsBackportService.OooO00o) this;
        if (oooO00o != null) {
            UnusedAppRestrictionsBackportService.this.OooO00o();
        }
        return true;
    }
}
