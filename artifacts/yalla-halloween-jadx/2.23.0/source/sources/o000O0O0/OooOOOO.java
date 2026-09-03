package o000O0O0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOOO extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOOOO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f34727OooO0Oo = 0;

        /* JADX INFO: renamed from: o000O0O0.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0410OooO00o implements OooOOOO {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f34728OooO0Oo;

            public C0410OooO00o(IBinder iBinder) {
                this.f34728OooO0Oo = iBinder;
            }

            @Override // o000O0O0.OooOOOO
            public final int OooO0oO(OooOOO oooOOO, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(oooOOO);
                    parcelObtain.writeString(str);
                    this.f34728OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // o000O0O0.OooOOOO
            public final void OooO0oo(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f34728OooO0Oo.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f34728OooO0Oo;
            }
        }

        public OooO00o() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            OooOOO callback = null;
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    callback = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOOO)) ? new OooOOO.OooO00o.C0409OooO00o(strongBinder) : (OooOOO) iInterfaceQueryLocalInterface;
                }
                int iOooO0oO = ((MultiInstanceInvalidationService.OooO00o) this).OooO0oO(callback, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooO0oO);
            } else if (i == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    callback = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof OooOOO)) ? new OooOOO.OooO00o.C0409OooO00o(strongBinder2) : (OooOOO) iInterfaceQueryLocalInterface2;
                }
                int i3 = parcel.readInt();
                Intrinsics.checkNotNullParameter(callback, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService.f7877OooO0o) {
                    multiInstanceInvalidationService.f7877OooO0o.unregister(callback);
                }
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                ((MultiInstanceInvalidationService.OooO00o) this).OooO0oo(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int OooO0oO(OooOOO oooOOO, String str) throws RemoteException;

    void OooO0oo(int i, String[] strArr) throws RemoteException;
}
