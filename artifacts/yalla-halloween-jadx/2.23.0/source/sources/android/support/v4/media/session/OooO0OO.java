package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaControllerCompat$MediaControllerImplApi21.OooO00o f2116OooO00o;

    @RequiresApi(21)
    public static class OooO00o extends MediaController.Callback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooO0OO> f2117OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.f2117OooO00o = new WeakReference<>(oooO0OO);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.f2117OooO00o.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.OooO00o(bundle);
            this.f2117OooO00o.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.f2117OooO00o.get() != null) {
                Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
                if (mediaMetadata != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaMetadata.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    mediaMetadataCompatCreateFromParcel.getClass();
                }
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            OooO0OO oooO0OO = this.f2117OooO00o.get();
            if (oooO0OO == null || oooO0OO.f2116OooO00o != null || playbackState == null) {
                return;
            }
            List<PlaybackState.CustomAction> listOooOO0 = PlaybackStateCompat.OooO0O0.OooOO0(playbackState);
            if (listOooOO0 != null) {
                ArrayList arrayList2 = new ArrayList(listOooOO0.size());
                for (PlaybackState.CustomAction customAction2 : listOooOO0) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle bundleOooOO0o = PlaybackStateCompat.OooO0O0.OooOO0o(customAction3);
                        MediaSessionCompat.OooO00o(bundleOooOO0o);
                        customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.OooO0O0.OooO0o(customAction3), PlaybackStateCompat.OooO0O0.OooOOOO(customAction3), PlaybackStateCompat.OooO0O0.OooOOO0(customAction3), bundleOooOO0o);
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Bundle bundleOooO00o = PlaybackStateCompat.OooO0OO.OooO00o(playbackState);
            MediaSessionCompat.OooO00o(bundleOooO00o);
            new PlaybackStateCompat(PlaybackStateCompat.OooO0O0.OooOOo(playbackState), PlaybackStateCompat.OooO0O0.OooOOo0(playbackState), PlaybackStateCompat.OooO0O0.OooO(playbackState), PlaybackStateCompat.OooO0O0.OooOOOo(playbackState), PlaybackStateCompat.OooO0O0.OooO0oO(playbackState), PlaybackStateCompat.OooO0O0.OooOO0O(playbackState), PlaybackStateCompat.OooO0O0.OooOOO(playbackState), arrayList, PlaybackStateCompat.OooO0O0.OooO0oo(playbackState), bundleOooO00o);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.f2117OooO00o.get() == null || list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaSession.QueueItem queueItem2 : list) {
                if (queueItem2 != null) {
                    MediaSession.QueueItem queueItem3 = queueItem2;
                    queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.OooO00o(MediaSessionCompat.QueueItem.OooO0O0.OooO0O0(queueItem3)), MediaSessionCompat.QueueItem.OooO0O0.OooO0OO(queueItem3));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f2117OooO00o.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            this.f2117OooO00o.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.OooO00o(bundle);
            this.f2117OooO00o.get();
        }
    }

    public static class OooO0O0 extends android.support.v4.media.session.OooO00o.AbstractBinderC0008OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference<OooO0OO> f2118OooO0Oo;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f2118OooO0Oo = new WeakReference<>(oooO0OO);
        }
    }

    public OooO0OO() {
        new OooO00o(this);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
