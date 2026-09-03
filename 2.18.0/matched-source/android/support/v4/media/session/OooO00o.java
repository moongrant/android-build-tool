package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0028OooO00o extends Binder implements OooO00o {
        public AbstractBinderC0028OooO00o() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooO0oO();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    OooOO0O();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    OooO();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    OooO0O0();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    OooO0o();
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    OooOO0();
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((OooO0OO.OooO0O0) this).f4284OooO00o.get();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void OooO() throws RemoteException;

    void OooO0O0() throws RemoteException;

    void OooO0o() throws RemoteException;

    void OooO0oO() throws RemoteException;

    void OooOO0() throws RemoteException;

    void OooOO0O() throws RemoteException;
}
