package p008OooOOOo;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0OO extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f178OooO00o = 0;

        /* JADX INFO: renamed from: OooOOOo.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0002OooO00o implements OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public IBinder f179OooO00o;

            public C0002OooO00o(IBinder iBinder) {
                this.f179OooO00o = iBinder;
            }

            @Override // p008OooOOOo.OooO0OO
            public final boolean OooO0Oo(OooO0O0 oooO0O0, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(oooO0O0 != null ? oooO0O0.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(0);
                    parcelObtain.writeTypedList(null);
                    this.f179OooO00o.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p008OooOOOo.OooO0OO
            public final boolean OooO0oo(OooO0O0 oooO0O0) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder((OooO0O0.OooO00o) oooO0O0);
                    this.f179OooO00o.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p008OooOOOo.OooO0OO
            public final boolean OooOOO() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(0L);
                    this.f179OooO00o.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f179OooO00o;
            }
        }

        public OooO00o() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    parcel.readLong();
                    boolean zOooO0oo = CustomTabsService.this.OooO0oo();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0oo ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zOooO0oo2 = ((CustomTabsService.OooO00o) this).OooO0oo(OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0oo2 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    parcel.createTypedArrayList(Bundle.CREATOR);
                    boolean zOooO0O0 = CustomTabsService.this.OooO0O0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0O0 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    Bundle bundleOooO00o = CustomTabsService.this.OooO00o();
                    parcel2.writeNoException();
                    if (bundleOooO00o != null) {
                        parcel2.writeInt(1);
                        bundleOooO00o.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                    }
                    boolean zOooO0o = CustomTabsService.this.OooO0o();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0o ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                    }
                    boolean zOooO0o0 = CustomTabsService.this.OooO0o0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0o0 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder());
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    int iOooO0Oo = CustomTabsService.this.OooO0Oo();
                    parcel2.writeNoException();
                    parcel2.writeInt(iOooO0Oo);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOOo(parcel.readStrongBinder());
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    boolean zOooO0oO = CustomTabsService.this.OooO0oO();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0oO ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean OooO0Oo(OooO0O0 oooO0O0, Uri uri) throws RemoteException;

    boolean OooO0oo(OooO0O0 oooO0O0) throws RemoteException;

    boolean OooOOO() throws RemoteException;
}
