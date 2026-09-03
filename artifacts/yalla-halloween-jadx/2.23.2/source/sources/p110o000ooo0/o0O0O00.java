package p110o000ooo0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface o0O0O00 extends IInterface {

    public static abstract class OooO00o extends Binder implements o0O0O00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f35950OooO0Oo = 0;

        /* JADX INFO: renamed from: o000ooo0.o0O0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0412OooO00o implements o0O0O00 {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f35951OooO0Oo;

            public C0412OooO00o(IBinder iBinder) {
                this.f35951OooO0Oo = iBinder;
            }

            @Override // p110o000ooo0.o0O0O00
            public final int OooO0o(oo0o0Oo oo0o0oo, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(oo0o0oo);
                    parcelObtain.writeString(str);
                    this.f35951OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p110o000ooo0.o0O0O00
            public final void OooO0oo(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f35951OooO0Oo.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f35951OooO0Oo;
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
            oo0o0Oo callback = null;
            if (i == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    callback = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oo0o0Oo)) ? new oo0o0Oo.OooO00o.C0413OooO00o(strongBinder) : (oo0o0Oo) iInterfaceQueryLocalInterface;
                }
                int iOooO0o = ((MultiInstanceInvalidationService.OooO00o) this).OooO0o(callback, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooO0o);
            } else if (i == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    callback = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof oo0o0Oo)) ? new oo0o0Oo.OooO00o.C0413OooO00o(strongBinder2) : (oo0o0Oo) iInterfaceQueryLocalInterface2;
                }
                int i3 = parcel.readInt();
                Intrinsics.checkNotNullParameter(callback, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService.f10971OooO0o) {
                    multiInstanceInvalidationService.f10971OooO0o.unregister(callback);
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

    int OooO0o(oo0o0Oo oo0o0oo, String str) throws RemoteException;

    void OooO0oo(int i, String[] strArr) throws RemoteException;
}
