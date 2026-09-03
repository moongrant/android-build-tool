package p110o000ooo0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface oo0o0Oo extends IInterface {

    public static abstract class OooO00o extends Binder implements oo0o0Oo {

        /* JADX INFO: renamed from: o000ooo0.oo0o0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0413OooO00o implements oo0o0Oo {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f35969OooO0Oo;

            public C0413OooO00o(IBinder iBinder) {
                this.f35969OooO0Oo = iBinder;
            }

            @Override // p110o000ooo0.oo0o0Oo
            public final void OooO0O0(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f35969OooO0Oo.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f35969OooO0Oo;
            }
        }

        public OooO00o() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((o00000O.OooO0O0) this).OooO0O0(parcel.createStringArray());
            return true;
        }
    }

    void OooO0O0(String[] strArr) throws RemoteException;
}
