package p323o0O0oo0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOO0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f36890OooO00o = 0;

        /* JADX INFO: renamed from: o0O0oo0.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0371OooO00o implements OooOOO0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public IBinder f36891OooO00o;

            public C0371OooO00o(IBinder iBinder) {
                this.f36891OooO00o = iBinder;
            }

            @Override // p323o0O0oo0.OooOOO0
            public final Bundle OooO0o0(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    this.f36891OooO00o.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f36891OooO00o;
            }
        }
    }

    Bundle OooO0o0(Bundle bundle) throws RemoteException;
}
