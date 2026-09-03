package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p070o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaController f4253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f4254OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final List<OooO0OO> f4255OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<OooO0OO, OooO00o> f4256OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaSessionCompat.Token f4257OooO0o0;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f4258Oooo0o;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.f4258Oooo0o = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f4258Oooo0o.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f4254OooO0O0) {
                mediaControllerCompat$MediaControllerImplApi21.f4257OooO0o0.f4264Oooo0oO = OooO0O0.OooO00o.OooOOOo(o0OO00O.OooO00o(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f4257OooO0o0;
                bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                Objects.requireNonNull(token);
                mediaControllerCompat$MediaControllerImplApi21.OooO00o();
            }
        }
    }

    public static class OooO00o extends OooO0OO.OooO0O0 {
        public OooO00o(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO0O0() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO0o() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooO0oO() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooOO0() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.OooO00o
        public final void OooOO0O() throws RemoteException {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
        this.f4257OooO0o0 = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f4263Oooo0o);
        this.f4253OooO00o = mediaController;
        if (token.f4264Oooo0oO == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<android.support.v4.media.session.OooO0OO>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<android.support.v4.media.session.OooO0OO>] */
    @GuardedBy("mLock")
    public final void OooO00o() {
        if (this.f4257OooO0o0.f4264Oooo0oO == null) {
            return;
        }
        for (OooO0OO oooO0OO : this.f4255OooO0OO) {
            OooO00o oooO00o = new OooO00o(oooO0OO);
            this.f4256OooO0Oo.put(oooO0OO, oooO00o);
            oooO0OO.f4266OooO00o = oooO00o;
            try {
                this.f4257OooO0o0.f4264Oooo0oO.OooO00o(oooO00o);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        this.f4255OooO0OO.clear();
    }
}
