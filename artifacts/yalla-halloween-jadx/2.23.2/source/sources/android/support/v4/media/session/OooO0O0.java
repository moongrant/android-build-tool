package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0O0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f2113OooO0Oo = 0;

        /* JADX INFO: renamed from: android.support.v4.media.session.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0010OooO00o implements OooO0O0 {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f2114OooO0Oo;

            public C0010OooO00o(IBinder iBinder) {
                this.f2114OooO0Oo = iBinder;
            }

            @Override // android.support.v4.media.session.OooO0O0
            public final void OooOO0O(android.support.v4.media.session.OooO00o oooO00o) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(oooO00o != null ? (android.support.v4.media.session.OooO00o.AbstractBinderC0009OooO00o) oooO00o : null);
                    if (!this.f2114OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i = OooO00o.f2113OooO0Oo;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2114OooO0Oo;
            }
        }

        public static OooO0O0 OooOOoo(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooO0O0)) ? new C0010OooO00o(iBinder) : (OooO0O0) iInterfaceQueryLocalInterface;
        }
    }

    void OooOO0O(android.support.v4.media.session.OooO00o oooO00o) throws RemoteException;
}
