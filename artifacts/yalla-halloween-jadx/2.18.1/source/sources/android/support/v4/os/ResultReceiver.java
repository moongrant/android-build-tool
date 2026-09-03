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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public android.support.v4.os.OooO00o f4293Oooo0o;

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

    public class OooO0O0 extends android.support.v4.os.OooO00o.AbstractBinderC0030OooO00o {
        public OooO0O0() {
        }

        @Override // android.support.v4.os.OooO00o
        public final void OooOOOO(int i, Bundle bundle) {
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.OooO00o(i, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        android.support.v4.os.OooO00o c0031OooO00o;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = android.support.v4.os.OooO00o.AbstractBinderC0030OooO00o.f4291OooO00o;
        if (strongBinder == null) {
            c0031OooO00o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0031OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.OooO00o)) ? new android.support.v4.os.OooO00o.AbstractBinderC0030OooO00o.C0031OooO00o(strongBinder) : (android.support.v4.os.OooO00o) iInterfaceQueryLocalInterface;
        }
        this.f4293Oooo0o = c0031OooO00o;
    }

    public void OooO00o(int i, Bundle bundle) {
    }

    public final void OooO0O0(int i, Bundle bundle) {
        android.support.v4.os.OooO00o oooO00o = this.f4293Oooo0o;
        if (oooO00o != null) {
            try {
                oooO00o.OooOOOO(i, bundle);
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
            if (this.f4293Oooo0o == null) {
                this.f4293Oooo0o = new OooO0O0();
            }
            parcel.writeStrongBinder(this.f4293Oooo0o.asBinder());
        }
    }
}
