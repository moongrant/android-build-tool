package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0030OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f4291OooO00o = 0;

        /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0031OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public IBinder f4292OooO00o;

            public C0031OooO00o(IBinder iBinder) {
                this.f4292OooO00o = iBinder;
            }

            @Override // android.support.v4.os.OooO00o
            public final void OooOOOO(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f4292OooO00o.transact(1, parcelObtain, null, 1)) {
                        int i2 = AbstractBinderC0030OooO00o.f4291OooO00o;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4292OooO00o;
            }
        }

        public AbstractBinderC0030OooO00o() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((ResultReceiver.OooO0O0) this).OooOOOO(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    void OooOOOO(int i, Bundle bundle) throws RemoteException;
}
