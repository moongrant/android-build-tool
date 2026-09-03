package p008OooOOo;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0OO extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f202OooO0Oo = 0;

        /* JADX INFO: renamed from: OooOOo.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0001OooO00o implements OooO0OO {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f203OooO0Oo;

            public C0001OooO00o(IBinder iBinder) {
                this.f203OooO0Oo = iBinder;
            }

            @Override // p008OooOOo.OooO0OO
            public final boolean OooO0o(OooO0O0 oooO0O0, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException {
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
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(arrayList);
                    this.f203OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p008OooOOo.OooO0OO
            public final boolean OooOO0o(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j);
                    this.f203OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p008OooOOo.OooO0OO
            public final boolean OooOOO(OooO0O0 oooO0O0) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(oooO0O0 != null ? oooO0O0.asBinder() : null);
                    this.f203OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f203OooO0Oo;
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
                    boolean zOooOO0o = ((CustomTabsService.OooO00o) this).OooOO0o(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooOO0o ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zOooOOO = ((CustomTabsService.OooO00o) this).OooOOO(OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooOOO ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zOooO0o = ((CustomTabsService.OooO00o) this).OooO0o(OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0o ? 1 : 0);
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
                    OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                    }
                    boolean zOooO0o2 = CustomTabsService.this.OooO0o();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0o2 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                    }
                    boolean zOooO0o0 = CustomTabsService.this.OooO0o0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zOooO0o0 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder());
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    int iOooO0Oo = CustomTabsService.this.OooO0Oo();
                    parcel2.writeNoException();
                    parcel2.writeInt(iOooO0Oo);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    OooO0O0.OooO00o.OooOOo(parcel.readStrongBinder());
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

    boolean OooO0o(OooO0O0 oooO0O0, Uri uri, Bundle bundle, ArrayList arrayList) throws RemoteException;

    boolean OooOO0o(long j) throws RemoteException;

    boolean OooOOO(OooO0O0 oooO0O0) throws RemoteException;
}
