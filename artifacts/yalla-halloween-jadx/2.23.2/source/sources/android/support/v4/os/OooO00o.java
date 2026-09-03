package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f2135OooO00o = "android$support$v4$os$IResultReceiver".replace(Typography.dollar, '.');

    /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0011OooO00o extends Binder implements OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f2136OooO0Oo = 0;

        /* JADX INFO: renamed from: android.support.v4.os.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0012OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f2137OooO0Oo;

            public C0012OooO00o(IBinder iBinder) {
                this.f2137OooO0Oo = iBinder;
            }

            @Override // android.support.v4.os.OooO00o
            public final void OooO(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(OooO00o.f2135OooO00o);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f2137OooO0Oo.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f2137OooO0Oo;
            }
        }

        public AbstractBinderC0011OooO00o() {
            attachInterface(this, OooO00o.f2135OooO00o);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = OooO00o.f2135OooO00o;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((ResultReceiver.OooO0O0) this).OooO(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }

    void OooO(int i, Bundle bundle) throws RemoteException;
}
