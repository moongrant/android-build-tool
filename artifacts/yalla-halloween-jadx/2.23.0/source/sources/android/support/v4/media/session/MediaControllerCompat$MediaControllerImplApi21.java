package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import o00000O.OooOOO0;
import p076o000Oo.OooOOOO;
import p076o000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaController f2101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f2102OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f2103OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<OooO0OO, OooO00o> f2104OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaSessionCompat.Token f2105OooO0o0;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference<MediaControllerCompat$MediaControllerImplApi21> f2106OooO0Oo;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.f2106OooO0Oo = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f2106OooO0Oo.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f2102OooO0O0) {
                mediaControllerCompat$MediaControllerImplApi21.f2105OooO0o0.OooO0O0(OooO0O0.OooO00o.OooOOo(OooOOO0.OooO00o(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f2105OooO0o0;
                OooOo oooOo = null;
                try {
                    Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                    if (bundle2 != null) {
                        bundle2.setClassLoader(OooOOOO.class.getClassLoader());
                        Parcelable parcelable = bundle2.getParcelable("a");
                        if (!(parcelable instanceof ParcelImpl)) {
                            throw new IllegalArgumentException("Invalid parcel");
                        }
                        oooOo = ((ParcelImpl) parcelable).f8253OooO0Oo;
                    }
                } catch (RuntimeException unused) {
                }
                token.OooO0OO(oooOo);
                mediaControllerCompat$MediaControllerImplApi21.OooO00o();
            }
        }
    }

    public static class OooO00o extends OooO0OO.OooO0O0 {
        @Override // android.support.v4.media.session.OooO00o
        public final void OooO00o() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO0Oo() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO0o0() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooOO0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooOOOO() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooOOOo() throws RemoteException {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        OooO0O0 oooO0O0;
        this.f2105OooO0o0 = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f2112OooO0o0);
        this.f2101OooO00o = mediaController;
        synchronized (token.f2110OooO0Oo) {
            oooO0O0 = token.f2111OooO0o;
        }
        if (oooO0O0 == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    @GuardedBy("mLock")
    public final void OooO00o() {
        OooO0O0 oooO0O0;
        MediaSessionCompat.Token token = this.f2105OooO0o0;
        synchronized (token.f2110OooO0Oo) {
            oooO0O0 = token.f2111OooO0o;
        }
        if (oooO0O0 == null) {
            return;
        }
        ArrayList<OooO0OO> arrayList = this.f2103OooO0OO;
        for (OooO0OO oooO0OO : arrayList) {
            OooO00o oooO00o = new OooO00o(oooO0OO);
            this.f2104OooO0Oo.put(oooO0OO, oooO00o);
            oooO0OO.f2116OooO00o = oooO00o;
            try {
                token.OooO00o().OooOOO0(oooO00o);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}
