package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0009OooO00o extends Binder implements OooO00o {
        public AbstractBinderC0009OooO00o() {
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
                    String string = parcel.readString();
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    MediaControllerCompat.OooO00o oooO00o = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o != null) {
                        oooO00o.OooOOO0(1, string, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooO0Oo();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    PlaybackStateCompat playbackStateCompatCreateFromParcel = parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null;
                    MediaControllerCompat.OooO00o oooO00o2 = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o2 != null) {
                        oooO00o2.OooOOO0(2, playbackStateCompatCreateFromParcel, null);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooO0o0(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooOOO(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooOOOo(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooOOO0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    OooOO0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int i3 = parcel.readInt();
                    MediaControllerCompat.OooO00o oooO00o3 = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o3 != null) {
                        oooO00o3.OooOOO0(9, Integer.valueOf(i3), null);
                    }
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    boolean z = parcel.readInt() != 0;
                    MediaControllerCompat.OooO00o oooO00o4 = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o4 != null) {
                        oooO00o4.OooOOO0(11, Boolean.valueOf(z), null);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int i4 = parcel.readInt();
                    MediaControllerCompat.OooO00o oooO00o5 = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o5 != null) {
                        oooO00o5.OooOOO0(12, Integer.valueOf(i4), null);
                    }
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaControllerCompat.OooO00o oooO00o6 = ((MediaControllerCompat.OooO00o.OooO0OO) this).f2105OooO0Oo.get();
                    if (oooO00o6 != null) {
                        oooO00o6.OooOOO0(13, null, null);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void OooO0Oo() throws RemoteException;

    void OooO0o0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void OooOO0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void OooOOO(ArrayList arrayList) throws RemoteException;

    void OooOOO0(Bundle bundle) throws RemoteException;

    void OooOOOo(CharSequence charSequence) throws RemoteException;
}
