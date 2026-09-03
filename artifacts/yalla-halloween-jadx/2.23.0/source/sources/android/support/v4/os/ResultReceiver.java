package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public android.support.v4.os.OooO00o f2142OooO0Oo;

    public class OooO00o implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class OooO0O0 extends android.support.v4.os.OooO00o.AbstractBinderC0010OooO00o {
        public OooO0O0() {
        }

        @Override // android.support.v4.os.OooO00o
        public final void OooO(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.OooO00o(i, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        android.support.v4.os.OooO00o c0011OooO00o;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = android.support.v4.os.OooO00o.AbstractBinderC0010OooO00o.f2140OooO0Oo;
        if (strongBinder == null) {
            c0011OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.OooO00o.f2139OooO00o);
            c0011OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.OooO00o)) ? new android.support.v4.os.OooO00o.AbstractBinderC0010OooO00o.C0011OooO00o(strongBinder) : (android.support.v4.os.OooO00o) iInterfaceQueryLocalInterface;
        }
        this.f2142OooO0Oo = c0011OooO00o;
    }

    public void OooO00o(int i, Bundle bundle) {
    }

    public final void OooO0O0(int i, Bundle bundle) {
        android.support.v4.os.OooO00o oooO00o = this.f2142OooO0Oo;
        if (oooO00o != null) {
            try {
                oooO00o.OooO(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2142OooO0Oo == null) {
                this.f2142OooO0Oo = new OooO0O0();
            }
            parcel.writeStrongBinder(this.f2142OooO0Oo.asBinder());
        }
    }
}
