package p091o000o00o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface o000000 extends IInterface {

    public static abstract class OooO00o extends Binder implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f29120OooO00o = 0;

        /* JADX INFO: renamed from: o000o00o.o000000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0320OooO00o implements o000000 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public IBinder f29121OooO00o;

            public C0320OooO00o(IBinder iBinder) {
                this.f29121OooO00o = iBinder;
            }

            @Override // p091o000o00o.o000000
            public final void OooO0OO(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f29121OooO00o.transact(1, parcelObtain, null, 1)) {
                        int i = OooO00o.f29120OooO00o;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f29121OooO00o;
            }
        }

        public static o000000 OooOOOo(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o000000)) ? new C0320OooO00o(iBinder) : (o000000) iInterfaceQueryLocalInterface;
        }
    }

    void OooO0OO(String[] strArr) throws RemoteException;
}
