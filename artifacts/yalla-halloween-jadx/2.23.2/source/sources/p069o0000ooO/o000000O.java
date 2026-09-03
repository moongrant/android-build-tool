package p069o0000ooO;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000000O extends Binder {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f33814OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<Bundle> f33815OooO0Oo;

    static {
        f33814OooO0o0 = o00.f34910OooO00o >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public o000000O(List<Bundle> list) {
        this.f33815OooO0Oo = ImmutableList.OooOO0O(list);
    }

    public static o0O00 OooO00o(IBinder iBinder) {
        int i;
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            oooO00o.OooO0OO(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return oooO00o.OooO0oo();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        ImmutableList<Bundle> immutableList = this.f33815OooO0Oo;
        int size = immutableList.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f33814OooO0o0) {
            parcel2.writeInt(1);
            parcel2.writeBundle(immutableList.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
