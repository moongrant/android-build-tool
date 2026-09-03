package p203o00o0o0o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000 extends Binder {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f39153OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableList<Bundle> f39154OooO0Oo;

    static {
        f39153OooO0o0 = o0O00.f40595OooO00o >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public o000(ArrayList arrayList) {
        this.f39154OooO0Oo = ImmutableList.OooOO0O(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, @Nullable Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        ImmutableList<Bundle> immutableList = this.f39154OooO0Oo;
        int size = immutableList.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < f39153OooO0o0) {
            parcel2.writeInt(1);
            parcel2.writeBundle(immutableList.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
