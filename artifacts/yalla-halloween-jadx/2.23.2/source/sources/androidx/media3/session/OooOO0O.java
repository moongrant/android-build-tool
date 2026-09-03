package androidx.media3.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOO0O extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOO0O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f9259OooO0Oo = 0;

        /* JADX INFO: renamed from: androidx.media3.session.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0159OooO00o implements OooOO0O {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f9260OooO0Oo;

            public C0159OooO00o(IBinder iBinder) {
                this.f9260OooO0Oo = iBinder;
            }

            @Override // androidx.media3.session.OooOO0O
            public final void OooO00o(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    if (!this.f9260OooO0Oo.transact(3006, parcelObtain, null, 1)) {
                        int i2 = OooO00o.f9259OooO0Oo;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f9260OooO0Oo;
            }
        }
    }

    void OooO00o(int i) throws RemoteException;
}
