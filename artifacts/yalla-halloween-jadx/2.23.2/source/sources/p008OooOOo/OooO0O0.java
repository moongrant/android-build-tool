package p008OooOOo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p019OooOooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0O0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooOOo.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0000OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f200OooO0Oo;

            public C0000OooO00o(IBinder iBinder) {
                this.f200OooO0Oo = iBinder;
            }

            @Override // p008OooOOo.OooO0O0
            public final void OooOO0o(Bundle bundle, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f200OooO0Oo.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p008OooOOo.OooO0O0
            public final void OooOOo(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f200OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f200OooO0Oo;
            }
        }

        public OooO00o() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static OooO0O0 OooOOoo(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0O0)) ? new C0000OooO00o(iBinder) : (OooO0O0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                ((o0OO00O) this).OooOOo(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                ((o0OO00O) this).OooOO0o(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 6) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            parcel.readInt();
            if (parcel.readInt() != 0) {
            }
            parcel.readInt();
            if (parcel.readInt() != 0) {
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void OooOO0o(Bundle bundle, String str) throws RemoteException;

    void OooOOo(Bundle bundle) throws RemoteException;
}
