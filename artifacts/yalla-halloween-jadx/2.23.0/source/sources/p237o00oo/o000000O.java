package p237o00oo;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface o000000O extends IInterface {

    public static abstract class OooO00o extends Binder implements o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f40312OooO0Oo = 0;

        /* JADX INFO: renamed from: o00oo.o000000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0446OooO00o implements o000000O {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f40313OooO0Oo;

            public C0446OooO00o(IBinder iBinder) {
                this.f40313OooO0Oo = iBinder;
            }

            @Override // p237o00oo.o000000O
            public final Bundle OooO0OO(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    this.f40313OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f40313OooO0Oo;
            }
        }
    }

    Bundle OooO0OO(Bundle bundle) throws RemoteException;
}
