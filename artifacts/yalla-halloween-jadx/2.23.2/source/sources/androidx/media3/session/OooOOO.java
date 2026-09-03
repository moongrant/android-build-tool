package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO extends Binder implements IInterface {
    public OooOOO() {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        OooOO0O c0159OooO00o;
        if (i != 3001) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c0159OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            c0159OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOO0O)) ? new OooOO0O.OooO00o.C0159OooO00o(strongBinder) : (OooOO0O) iInterfaceQueryLocalInterface;
        }
        ((MediaSessionService.OooO00o) this).OooOOoo(c0159OooO00o, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
        return true;
    }
}
