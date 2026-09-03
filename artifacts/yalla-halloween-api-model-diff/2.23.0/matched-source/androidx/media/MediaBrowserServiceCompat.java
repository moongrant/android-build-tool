package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f6069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f6071OooO0o0 = new OooO0O0("android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f6070OooO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p188o00o0O.OooOO0<IBinder, OooO0O0> f6072OooO0oO = new p188o00o0O.OooOO0<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f6073OooO0oo = new OooOo(this);

    @RequiresApi(23)
    public class OooO extends OooO0o {

        public class OooO00o extends OooO0o.OooO00o {
            public OooO00o(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                OooOOO0 oooOOO0 = new OooOOO0(result);
                OooO0O0 oooO0O0 = MediaBrowserServiceCompat.this.f6071OooO0o0;
                oooOOO0.OooO00o(null);
            }
        }

        public OooO() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO0OO
        public void onCreate() {
            OooO00o oooO00o = new OooO00o(MediaBrowserServiceCompat.this);
            this.f6087OooO0O0 = oooO00o;
            oooO00o.onCreate();
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f6076OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Bundle f6077OooO0O0;

        public OooO00o(@NonNull String str, @Nullable Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f6076OooO00o = str;
            this.f6077OooO0O0 = bundle;
        }
    }

    public class OooO0O0 implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f6078OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6079OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f6080OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOOOO f6081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO00o f6082OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final HashMap<String, List<o000OO.OooO0o<IBinder, Bundle>>> f6083OooO0o0 = new HashMap<>();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                MediaBrowserServiceCompat.this.f6072OooO0oO.remove(((OooOo00) oooO0O0.f6081OooO0Oo).OooO00o());
            }
        }

        public OooO0O0(String str, int i, int i2, OooOOOO oooOOOO) {
            this.f6078OooO00o = str;
            this.f6079OooO0O0 = i;
            this.f6080OooO0OO = i2;
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                p068o0000oo0.OooOOOO.OooO00o(str, i, i2);
            }
            this.f6081OooO0Oo = oooOOOO;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.f6073OooO0oo.post(new OooO00o());
        }
    }

    public interface OooO0OO {
        void onCreate();
    }

    @RequiresApi(21)
    public class OooO0o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f6086OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f6087OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Messenger f6088OooO0OO;

        @RequiresApi(21)
        public class OooO00o extends MediaBrowserService {
            public OooO00o(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                attachBaseContext(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                OooO00o oooO00o;
                MediaSessionCompat.OooO00o(bundle);
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                OooO0o oooO0o = OooO0o.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                int i2 = -1;
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                } else {
                    bundle3.remove("extra_client_version");
                    oooO0o.f6088OooO0OO = new Messenger(mediaBrowserServiceCompat.f6073OooO0oo);
                    bundle2 = new Bundle();
                    bundle2.putInt("extra_service_version", 2);
                    o00000O.OooOOO0.OooO0O0(bundle2, "extra_messenger", oooO0o.f6088OooO0OO.getBinder());
                    oooO0o.f6086OooO00o.add(bundle2);
                    i2 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                }
                OooO0O0 oooO0O0 = MediaBrowserServiceCompat.this.new OooO0O0(str, i2, i, null);
                mediaBrowserServiceCompat.getClass();
                OooO00o OooO00o2 = mediaBrowserServiceCompat.OooO00o();
                if (OooO00o2 == null) {
                    oooO00o = null;
                } else {
                    if (oooO0o.f6088OooO0OO != null) {
                        mediaBrowserServiceCompat.f6070OooO0o.add(oooO0O0);
                    }
                    Bundle bundle4 = OooO00o2.f6077OooO0O0;
                    if (bundle2 == null) {
                        bundle2 = bundle4;
                    } else if (bundle4 != null) {
                        bundle2.putAll(bundle4);
                    }
                    oooO00o = new OooO00o(OooO00o2.f6076OooO00o, bundle2);
                }
                if (oooO00o == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(oooO00o.f6076OooO00o, oooO00o.f6077OooO0O0);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                OooO0o oooO0o = OooO0o.this;
                oooO0o.getClass();
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                OooO0O0 oooO0O0 = mediaBrowserServiceCompat.f6071OooO0o0;
                mediaBrowserServiceCompat.OooO0O0();
            }
        }

        public OooO0o() {
        }
    }

    @RequiresApi(26)
    public class OooOO0 extends OooO {

        public class OooO00o extends OooO.OooO00o {
            public OooO00o(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.OooO00o(bundle);
                OooOO0 oooOO1 = OooOO0.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                OooO0O0 oooO0O0 = mediaBrowserServiceCompat.f6071OooO0o0;
                mediaBrowserServiceCompat.OooO0O0();
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public OooOO0() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO, androidx.media.MediaBrowserServiceCompat.OooO0OO
        public final void onCreate() {
            OooO00o oooO00o = new OooO00o(MediaBrowserServiceCompat.this);
            this.f6087OooO0O0 = oooO00o;
            oooO00o.onCreate();
        }
    }

    @RequiresApi(28)
    public class OooOO0O extends OooOO0 {
    }

    public class OooOOO {
        public OooOOO() {
        }
    }

    @RequiresApi(21)
    public static class OooOOO0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MediaBrowserService.Result f6094OooO00o;

        public OooOOO0(MediaBrowserService.Result result) {
            this.f6094OooO00o = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(T t) {
            boolean z = t instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.f6094OooO00o;
            if (!z) {
                if (!(t instanceof Parcel)) {
                    result.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    public interface OooOOOO {
    }

    public final class OooOo extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO f6095OooO00o;

        public OooOo(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f6095OooO00o = mediaBrowserServiceCompat.new OooOOO();
        }

        public final void OooO00o(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i = message.what;
            OooOOO oooOOO = this.f6095OooO00o;
            switch (i) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.OooO00o(bundle);
                    String string = data.getString("data_package_name");
                    int i2 = data.getInt("data_calling_pid");
                    int i3 = data.getInt("data_calling_uid");
                    OooOo00 oooOo00 = new OooOo00(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        for (String str : mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i3)) {
                            if (str.equals(string)) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        mediaBrowserServiceCompat.f6073OooO0oo.OooO00o(new androidx.media.OooO00o(i2, i3, bundle, oooOOO, oooOo00, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
                case 2:
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooO0O0(oooOOO, new OooOo00(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.OooO00o(bundle2);
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooO0OO(oooOOO, new OooOo00(message.replyTo), data.getString("data_media_item_id"), o00000O.OooOOO0.OooO00o(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooO0o(oooOOO, new OooOo00(message.replyTo), data.getString("data_media_item_id"), o00000O.OooOOO0.OooO00o(data, "data_callback_token")));
                    return;
                case 5:
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOo00 oooOo01 = new OooOo00(message.replyTo);
                    oooOOO.getClass();
                    if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooO(oooOOO, oooOo01, string2, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.OooO00o(bundle3);
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooOO0(data.getInt("data_calling_uid"), data.getInt("data_calling_pid"), bundle3, oooOOO, new OooOo00(message.replyTo), data.getString("data_package_name")));
                    return;
                case 7:
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooOO0O(oooOOO, new OooOo00(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.OooO00o(bundle4);
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOo00 oooOo02 = new OooOo00(message.replyTo);
                    oooOOO.getClass();
                    if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooOOO0(oooOOO, oooOo02, string3, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.OooO00o(bundle5);
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOo00 oooOo03 = new OooOo00(message.replyTo);
                    oooOOO.getClass();
                    if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f6073OooO0oo.OooO00o(new androidx.media.OooOOO(oooOOO, oooOo03, string4, bundle5, resultReceiver3));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public static class OooOo00 implements OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Messenger f6096OooO00o;

        public OooOo00(Messenger messenger) {
            this.f6096OooO00o = messenger;
        }

        public final IBinder OooO00o() {
            return this.f6096OooO00o.getBinder();
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    @Nullable
    public abstract OooO00o OooO00o();

    public abstract void OooO0O0();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6069OooO0Oo.f6087OooO0O0.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f6069OooO0Oo = new OooOO0O();
        } else if (i >= 26) {
            this.f6069OooO0Oo = new OooOO0();
        } else {
            this.f6069OooO0Oo = new OooO();
        }
        this.f6069OooO0Oo.onCreate();
    }
}
