package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p063o0000oO.Oooo0;
import p113o00O00Oo.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaControllerImplApi21 f2091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<OooO00o, Boolean> f2092OooO0O0 = new ConcurrentHashMap<>();

    @RequiresApi(21)
    public static class MediaControllerImplApi21 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MediaController f2093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f2094OooO0O0 = new Object();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @GuardedBy("mLock")
        public final ArrayList f2095OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashMap<OooO00o, OooO00o> f2096OooO0Oo = new HashMap<>();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final MediaSessionCompat.Token f2097OooO0o0;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final WeakReference<MediaControllerImplApi21> f2098OooO0Oo;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f2098OooO0Oo = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f2098OooO0Oo.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f2094OooO0O0) {
                    mediaControllerImplApi21.f2097OooO0o0.OooO0O0(android.support.v4.media.session.OooO0O0.OooO00o.OooOOoo(Oooo0.OooO00o(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f2097OooO0o0.OooO0OO(OooOOOO.OooO00o(bundle));
                    mediaControllerImplApi21.OooO00o();
                }
            }
        }

        public static class OooO00o extends OooO00o.OooO0OO {
            @Override // android.support.v4.media.session.OooO00o
            public final void OooO0Oo() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.OooO00o
            public final void OooO0o0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.OooO00o
            public final void OooOO0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.OooO00o
            public final void OooOOO(ArrayList arrayList) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.OooO00o
            public final void OooOOO0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.OooO00o
            public final void OooOOOo(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f2097OooO0o0 = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f2111OooO0o0);
            this.f2093OooO00o = mediaController;
            if (token.OooO00o() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @GuardedBy("mLock")
        public final void OooO00o() {
            MediaSessionCompat.Token token = this.f2097OooO0o0;
            if (token.OooO00o() == null) {
                return;
            }
            ArrayList<OooO00o> arrayList = this.f2095OooO0OO;
            for (OooO00o oooO00o : arrayList) {
                OooO00o oooO00o2 = new OooO00o(oooO00o);
                this.f2096OooO0Oo.put(oooO00o, oooO00o2);
                oooO00o.f2101OooO0OO = oooO00o2;
                try {
                    token.OooO00o().OooOO0O(oooO00o2);
                    oooO00o.OooOOO0(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            arrayList.clear();
        }
    }

    public static abstract class OooO00o implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C0008OooO00o f2099OooO00o = new C0008OooO00o(this);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0O0 f2100OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public MediaControllerImplApi21.OooO00o f2101OooO0OO;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$OooO00o$OooO00o, reason: collision with other inner class name */
        @RequiresApi(21)
        public static class C0008OooO00o extends MediaController.Callback {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final WeakReference<OooO00o> f2102OooO00o;

            public C0008OooO00o(OooO00o oooO00o) {
                this.f2102OooO00o = new WeakReference<>(oooO00o);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO00o(new OooO0O0(playbackInfo.getPlaybackType(), AudioAttributesCompat.OooO00o(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.OooO00o(bundle);
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO0OO(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO0Oo(MediaMetadataCompat.OooO00o(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o == null || oooO00o.f2101OooO0OO != null) {
                    return;
                }
                oooO00o.OooO0o0(PlaybackStateCompat.OooO00o(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO0o(MediaSessionCompat.QueueItem.OooO00o(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO0oO(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooO();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.OooO00o(bundle);
                OooO00o oooO00o = this.f2102OooO00o.get();
                if (oooO00o != null) {
                    oooO00o.OooOO0(str, bundle);
                }
            }
        }

        public class OooO0O0 extends Handler {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public boolean f2103OooO00o;

            public OooO0O0(Looper looper) {
                super(looper);
                this.f2103OooO00o = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (this.f2103OooO00o) {
                    int i = message.what;
                    OooO00o oooO00o = OooO00o.this;
                    switch (i) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.OooO00o(data);
                            oooO00o.OooOO0((String) message.obj, data);
                            break;
                        case 2:
                            oooO00o.OooO0o0((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            oooO00o.OooO0Oo((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            oooO00o.OooO00o((OooO0O0) message.obj);
                            break;
                        case 5:
                            oooO00o.OooO0o((List) message.obj);
                            break;
                        case 6:
                            oooO00o.OooO0oO((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.OooO00o(bundle);
                            oooO00o.OooO0OO(bundle);
                            break;
                        case 8:
                            oooO00o.OooO();
                            break;
                        case 9:
                            oooO00o.OooO0oo(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            oooO00o.OooO0O0(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            oooO00o.OooOO0o(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            oooO00o.OooOO0O();
                            break;
                    }
                }
            }
        }

        public static class OooO0OO extends android.support.v4.media.session.OooO00o.AbstractBinderC0009OooO00o {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final WeakReference<OooO00o> f2105OooO0Oo;

            public OooO0OO(OooO00o oooO00o) {
                this.f2105OooO0Oo = new WeakReference<>(oooO00o);
            }
        }

        public void OooO() {
        }

        public void OooO00o(OooO0O0 oooO0O0) {
        }

        public void OooO0O0(boolean z) {
        }

        public void OooO0OO(Bundle bundle) {
        }

        public void OooO0Oo(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void OooO0o(List<MediaSessionCompat.QueueItem> list) {
        }

        public void OooO0o0(PlaybackStateCompat playbackStateCompat) {
        }

        public void OooO0oO(CharSequence charSequence) {
        }

        public void OooO0oo(int i) {
        }

        public void OooOO0(String str, Bundle bundle) {
        }

        public void OooOO0O() {
        }

        public void OooOO0o(int i) {
        }

        public final void OooOOO(Handler handler) {
            if (handler != null) {
                OooO0O0 oooO0O0 = new OooO0O0(handler.getLooper());
                this.f2100OooO0O0 = oooO0O0;
                oooO0O0.f2103OooO00o = true;
            } else {
                OooO0O0 oooO0O1 = this.f2100OooO0O0;
                if (oooO0O1 != null) {
                    oooO0O1.f2103OooO00o = false;
                    oooO0O1.removeCallbacksAndMessages(null);
                    this.f2100OooO0O0 = null;
                }
            }
        }

        public final void OooOOO0(int i, Object obj, Bundle bundle) {
            OooO0O0 oooO0O0 = this.f2100OooO0O0;
            if (oooO0O0 != null) {
                Message messageObtainMessage = oooO0O0.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            OooOOO0(8, null, null);
        }
    }

    public static final class OooO0O0 {
        public OooO0O0(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f2091OooO00o = new MediaControllerImplApi21(context, token);
    }
}
