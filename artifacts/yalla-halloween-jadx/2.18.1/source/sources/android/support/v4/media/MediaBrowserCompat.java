package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
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
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f4215OooO0O0 = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f4216OooO00o;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
            MediaSessionCompat.OooO00o(bundle);
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

    @RequiresApi(26)
    public static class OooO extends OooO0o {
        public OooO(Context context, ComponentName componentName, OooO0O0 oooO0O0) {
            super(context, componentName, oooO0O0);
        }
    }

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooOO0> f4219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public WeakReference<Messenger> f4220OooO0O0;

        public OooO00o(OooOO0 oooOO1) {
            this.f4219OooO00o = new WeakReference<>(oooOO1);
        }

        public final void OooO00o(Messenger messenger) {
            this.f4220OooO0O0 = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f4220OooO0O0;
            if (weakReference == null || weakReference.get() == null || this.f4219OooO00o.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.OooO00o(data);
            OooOO0 oooOO1 = this.f4219OooO00o.get();
            Messenger messenger = this.f4220OooO0O0.get();
            try {
                int i = message.what;
                if (i == 1) {
                    MediaSessionCompat.OooO00o(data.getBundle("data_root_hints"));
                    data.getString("data_media_item_id");
                    oooOO1.OooO0O0();
                } else if (i == 2) {
                    oooOO1.OooO00o();
                } else if (i != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle = data.getBundle("data_options");
                    MediaSessionCompat.OooO00o(bundle);
                    MediaSessionCompat.OooO00o(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    data.getParcelableArrayList("data_media_item_list");
                    oooOO1.OooO0OO(messenger, string, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    oooOO1.OooO00o();
                }
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final android.support.v4.media.OooO0OO f4221OooO00o = new android.support.v4.media.OooO0OO(new C0027OooO0O0());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f4222OooO0O0;

        public interface OooO00o {
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public class C0027OooO0O0 implements android.support.v4.media.OooO0O0 {
            public C0027OooO0O0() {
            }
        }

        public void OooO00o() {
            throw null;
        }
    }

    @RequiresApi(21)
    public static class OooO0OO implements OooOO0, OooO0O0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f4224OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaBrowser f4225OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Bundle f4226OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOO0O f4228OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Messenger f4230OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public MediaSessionCompat.Token f4231OooO0oo;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO00o f4227OooO0Oo = new OooO00o(this);

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Oooo0<String, OooOOO0> f4229OooO0o0 = new Oooo0<>();

        public OooO0OO(Context context, ComponentName componentName, OooO0O0 oooO0O0) {
            this.f4224OooO00o = context;
            Bundle bundle = new Bundle();
            this.f4226OooO0OO = bundle;
            bundle.putInt("extra_client_version", 1);
            oooO0O0.f4222OooO0O0 = this;
            this.f4225OooO0O0 = new MediaBrowser(context, componentName, oooO0O0.f4221OooO00o, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0
        public final void OooO00o() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0
        public final void OooO0O0() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooOO0
        public final void OooO0OO(Messenger messenger, String str, Bundle bundle) {
            if (this.f4230OooO0oO != messenger) {
                return;
            }
            OooOOO0 orDefault = this.f4229OooO0o0.getOrDefault(str, null);
            if (orDefault != null) {
                orDefault.OooO00o(bundle);
            } else if (MediaBrowserCompat.f4215OooO0O0) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }
    }

    @RequiresApi(23)
    public static class OooO0o extends OooO0OO {
        public OooO0o(Context context, ComponentName componentName, OooO0O0 oooO0O0) {
            super(context, componentName, oooO0O0);
        }
    }

    public interface OooOO0 {
        void OooO00o();

        void OooO0O0();

        void OooO0OO(Messenger messenger, String str, Bundle bundle);
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Messenger f4232OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Bundle f4233OooO0O0;

        public OooOO0O(IBinder iBinder, Bundle bundle) {
            this.f4232OooO00o = new Messenger(iBinder);
            this.f4233OooO0O0 = bundle;
        }

        public final void OooO00o(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f4232OooO00o.send(messageObtain);
        }
    }

    public static abstract class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Binder f4234OooO00o = new Binder();

        public class OooO00o implements android.support.v4.media.OooO0o {
            public OooO00o() {
            }

            @Override // android.support.v4.media.OooO0o
            public final void OooO00o(List list) {
                Objects.requireNonNull(OooOOO.this);
                OooOOO oooOOO = OooOOO.this;
                MediaItem.OooO00o(list);
                Objects.requireNonNull(oooOOO);
            }

            @Override // android.support.v4.media.OooO0o
            public final void onError() {
                Objects.requireNonNull(OooOOO.this);
            }
        }

        public class OooO0O0 extends OooO00o implements android.support.v4.media.OooOO0 {
            public OooO0O0() {
                super();
            }

            @Override // android.support.v4.media.OooOO0
            public final void OooO0O0(List list) {
                OooOOO oooOOO = OooOOO.this;
                MediaItem.OooO00o(list);
                Objects.requireNonNull(oooOOO);
            }

            @Override // android.support.v4.media.OooOO0
            public final void OooO0OO() {
                Objects.requireNonNull(OooOOO.this);
            }
        }

        public OooOOO() {
            if (Build.VERSION.SDK_INT >= 26) {
                new android.support.v4.media.OooOO0O(new OooO0O0());
            } else {
                new android.support.v4.media.OooO(new OooO00o());
            }
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOOO> f4237OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<Bundle> f4238OooO0O0 = new ArrayList();

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.os.Bundle>] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<android.os.Bundle>] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<android.support.v4.media.MediaBrowserCompat$OooOOO>] */
        public final OooOOO OooO00o(Bundle bundle) {
            for (int i = 0; i < this.f4238OooO0O0.size(); i++) {
                if (androidx.media.OooO00o.OooO00o((Bundle) this.f4238OooO0O0.get(i), bundle)) {
                    return (OooOOO) this.f4237OooO00o.get(i);
                }
            }
            return null;
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void OooO00o(int i, Bundle bundle) {
            Parcelable[] parcelableArray;
            MediaSessionCompat.OooO00o(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results") || (parcelableArray = bundle.getParcelableArray("search_results")) == null) {
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, OooO0O0 oooO0O0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f4216OooO00o = new OooO(context, componentName, oooO0O0);
        } else if (i >= 23) {
            this.f4216OooO00o = new OooO0o(context, componentName, oooO0O0);
        } else {
            this.f4216OooO00o = new OooO0OO(context, componentName, oooO0O0);
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f4217Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final MediaDescriptionCompat f4218Oooo0oO;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface Flags {
        }

        public static class OooO00o implements Parcelable.Creator<MediaItem> {
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
            if (TextUtils.isEmpty(mediaDescriptionCompat.f4240Oooo0o)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f4217Oooo0o = i;
            this.f4218Oooo0oO = mediaDescriptionCompat;
        }

        public static List<MediaItem> OooO00o(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.OooO00o(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f4217Oooo0o + ", mDescription=" + this.f4218Oooo0oO + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4217Oooo0o);
            this.f4218Oooo0oO.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f4217Oooo0o = parcel.readInt();
            this.f4218Oooo0oO = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
