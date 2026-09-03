package p091o000o00o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000000O extends Binder implements IInterface {
    public o000000O() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int iOooOOo0 = ((MultiInstanceInvalidationService.OooO0O0) this).OooOOo0(o000000.OooO00o.OooOOOo(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iOooOOo0);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.OooO0O0) this).OooOOOo(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        o000000 o000000VarOooOOOo = o000000.OooO00o.OooOOOo(parcel.readStrongBinder());
        int i3 = parcel.readInt();
        MultiInstanceInvalidationService.OooO0O0 oooO0O0 = (MultiInstanceInvalidationService.OooO0O0) this;
        synchronized (MultiInstanceInvalidationService.this.f9263Oooo0oo) {
            MultiInstanceInvalidationService.this.f9263Oooo0oo.unregister(o000000VarOooOOOo);
            MultiInstanceInvalidationService.this.f9262Oooo0oO.remove(Integer.valueOf(i3));
        }
        parcel2.writeNoException();
        return true;
    }
}
