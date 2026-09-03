package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f2066OooO0O0 = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f2067OooO00o;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.OooO0O0(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    @RequiresApi(23)
    public static class OooO extends OooO0o {
    }

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static MediaDescription OooO00o(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        public static int OooO0O0(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class OooO0O0 extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooOO0O> f2070OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public WeakReference<Messenger> f2071OooO0O0;

        public OooO0O0(OooOO0O oooOO0O) {
            this.f2070OooO00o = new WeakReference<>(oooOO0O);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f2071OooO0O0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            WeakReference<OooOO0O> weakReference2 = this.f2070OooO00o;
            if (weakReference2.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.OooO00o(data);
            OooOO0O oooOO0O = weakReference2.get();
            Messenger messenger = this.f2071OooO0O0.get();
            try {
                int i = message.what;
                if (i == 1) {
                    MediaSessionCompat.OooO00o(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    oooOO0O.OooO0O0();
                } else if (i == 2) {
                    oooOO0O.OooO00o();
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle = data.getBundle("data_options");
                    MediaSessionCompat.OooO00o(bundle);
                    MediaSessionCompat.OooO00o(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    data.getParcelableArrayList("data_media_item_list");
                    oooOO0O.OooO0OO(messenger, string, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    oooOO0O.OooO00o();
                }
            }
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f2072OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0O0 f2073OooO0O0;

        @RequiresApi(21)
        public class OooO00o extends MediaBrowser.ConnectionCallback {
            public OooO00o() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                OooO0OO oooO0OO = OooO0OO.this;
                OooO0O0 oooO0O0 = oooO0OO.f2073OooO0O0;
                if (oooO0O0 != null) {
                    OooO0o oooO0o = (OooO0o) oooO0O0;
                    MediaBrowser mediaBrowser = oooO0o.f2076OooO0O0;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder iBinderOooO00o = o00000O.OooOOO0.OooO00o(extras, "extra_messenger");
                            if (iBinderOooO00o != null) {
                                oooO0o.f2079OooO0o = new OooOOO0(iBinderOooO00o, oooO0o.f2077OooO0OO);
                                OooO0O0 oooO0O1 = oooO0o.f2078OooO0Oo;
                                Messenger messenger = new Messenger(oooO0O1);
                                oooO0o.f2081OooO0oO = messenger;
                                oooO0O1.getClass();
                                oooO0O1.f2071OooO0O0 = new WeakReference<>(messenger);
                                try {
                                    OooOOO0 oooOOO0 = oooO0o.f2079OooO0o;
                                    Context context = oooO0o.f2075OooO00o;
                                    Messenger messenger2 = oooO0o.f2081OooO0oO;
                                    oooOOO0.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", oooOOO0.f2086OooO0O0);
                                    oooOOO0.OooO00o(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            android.support.v4.media.session.OooO0O0 oooO0O0OooOOo = android.support.v4.media.session.OooO0O0.OooO00o.OooOOo(o00000O.OooOOO0.OooO00o(extras, "extra_session_binder"));
                            if (oooO0O0OooOOo != null) {
                                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                                oooO0o.f2082OooO0oo = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, oooO0O0OooOOo) : null;
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                MediaButtonReceiver.OooO00o oooO00o = (MediaButtonReceiver.OooO00o) oooO0OO;
                OooO oooO = oooO00o.f6135OooO0o.f2067OooO00o;
                if (oooO.f2082OooO0oo == null) {
                    MediaSession.Token sessionToken2 = oooO.f2076OooO0O0.getSessionToken();
                    oooO.f2082OooO0oo = sessionToken2 != null ? new MediaSessionCompat.Token(sessionToken2, null) : null;
                }
                MediaSessionCompat.Token token = oooO.f2082OooO0oo;
                new ConcurrentHashMap();
                if (token == null) {
                    throw new IllegalArgumentException("sessionToken must not be null");
                }
                MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = new MediaControllerCompat$MediaControllerImplApi21(oooO00o.f6133OooO0OO, token);
                KeyEvent keyEvent = (KeyEvent) oooO00o.f6134OooO0Oo.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                mediaControllerCompat$MediaControllerImplApi21.f2101OooO00o.dispatchMediaButtonEvent(keyEvent);
                oooO00o.OooO00o();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                OooO0OO oooO0OO = OooO0OO.this;
                OooO0O0 oooO0O0 = oooO0OO.f2073OooO0O0;
                if (oooO0O0 != null) {
                    oooO0O0.getClass();
                }
                ((MediaButtonReceiver.OooO00o) oooO0OO).OooO00o();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                OooO0OO oooO0OO = OooO0OO.this;
                OooO0O0 oooO0O0 = oooO0OO.f2073OooO0O0;
                if (oooO0O0 != null) {
                    OooO0o oooO0o = (OooO0o) oooO0O0;
                    oooO0o.f2079OooO0o = null;
                    oooO0o.f2081OooO0oO = null;
                    oooO0o.f2082OooO0oo = null;
                    OooO0O0 oooO0O1 = oooO0o.f2078OooO0Oo;
                    oooO0O1.getClass();
                    oooO0O1.f2071OooO0O0 = new WeakReference<>(null);
                }
                ((MediaButtonReceiver.OooO00o) oooO0OO).OooO00o();
            }
        }

        public interface OooO0O0 {
        }
    }

    @RequiresApi(21)
    public static class OooO0o implements OooOO0O, OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f2075OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaBrowser f2076OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Bundle f2077OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOO0 f2079OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Messenger f2081OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MediaSessionCompat.Token f2082OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f2078OooO0Oo = new OooO0O0(this);

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final p188o00o0O.OooOO0<String, OooOOO> f2080OooO0o0 = new p188o00o0O.OooOO0<>();

        public OooO0o(Context context, ComponentName componentName, MediaButtonReceiver.OooO00o oooO00o) {
            this.f2075OooO00o = context;
            Bundle bundle = new Bundle();
            this.f2077OooO0OO = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            oooO00o.f2073OooO0O0 = this;
            this.f2076OooO0O0 = new MediaBrowser(context, componentName, oooO00o.f2072OooO00o, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0O
        public final void OooO00o() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0O
        public final void OooO0O0() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0O
        public final void OooO0OO(Messenger messenger, String str, Bundle bundle) {
            if (this.f2081OooO0oO != messenger) {
                return;
            }
            OooOOO orDefault = this.f2080OooO0o0.getOrDefault(str, null);
            if (orDefault == null) {
                if (MediaBrowserCompat.f2066OooO0O0) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = orDefault.f2084OooO0O0;
                if (i >= arrayList.size()) {
                    return;
                }
                if (p068o0000oo0.OooOOO.OooO00o((Bundle) arrayList.get(i), bundle)) {
                    return;
                }
                i++;
            }
        }
    }

    @RequiresApi(26)
    public static class OooOO0 extends OooO {
    }

    public interface OooOO0O {
        void OooO00o();

        void OooO0O0();

        void OooO0OO(Messenger messenger, String str, Bundle bundle);
    }

    public static class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f2083OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f2084OooO0O0 = new ArrayList();
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Messenger f2085OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Bundle f2086OooO0O0;

        public OooOOO0(IBinder iBinder, Bundle bundle) {
            this.f2085OooO00o = new Messenger(iBinder);
            this.f2086OooO0O0 = bundle;
        }

        public final void OooO00o(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f2085OooO00o.send(messageObtain);
        }
    }

    public static abstract class OooOOOO {

        @RequiresApi(21)
        public class OooO00o extends MediaBrowser.SubscriptionCallback {
            public OooO00o() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                OooOOOO.this.getClass();
                MediaItem.OooO00o(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str) {
                OooOOOO.this.getClass();
            }
        }

        @RequiresApi(26)
        public class OooO0O0 extends OooO00o {
            public OooO0O0() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.OooO00o(bundle);
                MediaItem.OooO00o(list);
                OooOOOO.this.getClass();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.OooO00o(bundle);
                OooOOOO.this.getClass();
            }
        }

        public OooOOOO() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new OooO0O0();
            } else {
                new OooO00o();
            }
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.OooO0O0(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, MediaButtonReceiver.OooO00o oooO00o) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2067OooO00o = new OooOO0(context, componentName, oooO00o);
        } else {
            this.f2067OooO00o = new OooO(context, componentName, oooO00o);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f2068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final MediaDescriptionCompat f2069OooO0o0;

        public class OooO00o implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f2090OooO0Oo)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f2068OooO0Oo = i;
            this.f2069OooO0o0 = mediaDescriptionCompat;
        }

        public static void OooO00o(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                        mediaItem = new MediaItem(MediaDescriptionCompat.OooO00o(OooO00o.OooO00o(mediaItem2)), OooO00o.OooO0O0(mediaItem2));
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NonNull
        public final String toString() {
            return "MediaItem{mFlags=" + this.f2068OooO0Oo + ", mDescription=" + this.f2069OooO0o0 + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2068OooO0Oo);
            this.f2069OooO0o0.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f2068OooO0Oo = parcel.readInt();
            this.f2069OooO0o0 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
