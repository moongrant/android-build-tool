package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p070o0000ooO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final boolean f8573OoooO0O = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0o f8574Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final p021OooOooo.Oooo0<IBinder, OooO0O0> f8576OoooO00 = new p021OooOooo.Oooo0<>();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final OooOo00 f8575OoooO0 = new OooOo00(this);

    @RequiresApi(23)
    public class OooO extends OooO0o implements Oooo000 {
        public OooO() {
            super();
        }

        @Override // androidx.media.Oooo000
        public final void OooO0Oo(androidx.media.OooOo00.OooO0O0 oooO0O0) {
            Objects.requireNonNull(MediaBrowserServiceCompat.this);
            oooO0O0.OooO00o(null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO0o, androidx.media.MediaBrowserServiceCompat.OooO0OO
        public void onCreate() {
            OooOo oooOo = new OooOo(MediaBrowserServiceCompat.this, this);
            this.f8584OooO0O0 = oooOo;
            androidx.media.OooOo00.OooO00o(oooOo);
        }
    }

    public static final class OooO00o {
    }

    public class OooO0O0 implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f8578OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO f8579OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap<String, List<o000OO0O.OooO0o<IBinder, Bundle>>> f8580OooO0OO = new HashMap<>();

        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                MediaBrowserServiceCompat.this.f8576OoooO00.remove(((OooOOOO) oooO0O0.f8579OooO0O0).OooO00o());
            }
        }

        public OooO0O0(String str, int i, int i2, OooOOO oooOOO) {
            this.f8578OooO00o = str;
            if (Build.VERSION.SDK_INT >= 28) {
                new o000oOoO(str, i, i2);
            }
            this.f8579OooO0O0 = oooOOO;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.f8575OoooO0.post(new OooO00o());
        }
    }

    public interface OooO0OO {
        void onCreate();
    }

    @RequiresApi(21)
    public class OooO0o implements OooO0OO, androidx.media.OooOo00.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<Bundle> f8583OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.media.OooOo00.OooO00o f8584OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Messenger f8585OooO0OO;

        public OooO0o() {
        }

        @Override // androidx.media.OooOo00.OooO0OO
        public final void OooO0O0(String str, androidx.media.OooOo00.OooO0O0<List<Parcel>> oooO0O0) {
            MediaBrowserServiceCompat.this.OooO0O0();
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<android.os.Bundle>] */
        @Override // androidx.media.OooOo00.OooO0OO
        public final void OooO0OO(String str, int i, Bundle bundle) {
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.f8585OooO0OO = new Messenger(MediaBrowserServiceCompat.this.f8575OoooO0);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                o0Oo0oo.OooO0O0(bundle2, "extra_messenger", this.f8585OooO0OO.getBinder());
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                this.f8583OooO00o.add(bundle2);
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            new HashMap();
            if (Build.VERSION.SDK_INT >= 28) {
                new o000oOoO(str, -1, i);
            }
            Objects.requireNonNull(mediaBrowserServiceCompat);
            MediaBrowserServiceCompat.this.OooO00o();
            Objects.requireNonNull(MediaBrowserServiceCompat.this);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO0OO
        public void onCreate() {
            androidx.media.OooOo00.OooO00o oooO00o = new androidx.media.OooOo00.OooO00o(MediaBrowserServiceCompat.this, this);
            this.f8584OooO0O0 = oooO00o;
            androidx.media.OooOo00.OooO00o(oooO00o);
        }
    }

    @RequiresApi(26)
    public class OooOO0 extends OooO implements Oooo0.OooO0OO {
        public OooOO0() {
            super();
        }

        @Override // androidx.media.Oooo0.OooO0OO
        public final void OooO00o(String str, Oooo0.OooO0O0 oooO0O0) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            Objects.requireNonNull(mediaBrowserServiceCompat);
            mediaBrowserServiceCompat.OooO0O0();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.OooO, androidx.media.MediaBrowserServiceCompat.OooO0o, androidx.media.MediaBrowserServiceCompat.OooO0OO
        public final void onCreate() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            Field field = Oooo0.f8631OooO00o;
            Oooo0.OooO00o oooO00o = new Oooo0.OooO00o(mediaBrowserServiceCompat, this);
            this.f8584OooO0O0 = oooO00o;
            androidx.media.OooOo00.OooO00o(oooO00o);
        }
    }

    @RequiresApi(28)
    public class OooOO0O extends OooOO0 {
        public OooOO0O(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    public interface OooOOO {
    }

    public class OooOOO0 {
        public OooOOO0() {
        }
    }

    public static class OooOOOO implements OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Messenger f8589OooO00o;

        public OooOOOO(Messenger messenger) {
            this.f8589OooO00o = messenger;
        }

        public final IBinder OooO00o() {
            return this.f8589OooO00o.getBinder();
        }

        public final void OooO0O0(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f8589OooO00o.send(messageObtain);
        }
    }

    public final class OooOo00 extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f8590OooO00o;

        public OooOo00(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f8590OooO00o = mediaBrowserServiceCompat.new OooOOO0();
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
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.OooO00o(bundle);
                    OooOOO0 oooOOO0 = this.f8590OooO00o;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    OooOOOO oooOOOO = new OooOOOO(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    Objects.requireNonNull(mediaBrowserServiceCompat);
                    boolean z = false;
                    if (string != null) {
                        for (String str : mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2)) {
                            if (str.equals(string)) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooO0O0(oooOOO0, oooOOOO, string, i, i2, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    OooOOO0 oooOOO1 = this.f8590OooO00o;
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooO0OO(oooOOO1, new OooOOOO(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.OooO00o(bundle2);
                    OooOOO0 oooOOO2 = this.f8590OooO00o;
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooO0o(oooOOO2, new OooOOOO(message.replyTo), data.getString("data_media_item_id"), o0Oo0oo.OooO00o(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    OooOOO0 oooOOO3 = this.f8590OooO00o;
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooO(oooOOO3, new OooOOOO(message.replyTo), data.getString("data_media_item_id"), o0Oo0oo.OooO00o(data, "data_callback_token")));
                    return;
                case 5:
                    OooOOO0 oooOOO4 = this.f8590OooO00o;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO2 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO4);
                    if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooOO0(oooOOO4, oooOOOO2, string2, resultReceiver));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.OooO00o(bundle3);
                    OooOOO0 oooOOO5 = this.f8590OooO00o;
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooOO0O(oooOOO5, new OooOOOO(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                    return;
                case 7:
                    OooOOO0 oooOOO6 = this.f8590OooO00o;
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooOOO0(oooOOO6, new OooOOOO(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.OooO00o(bundle4);
                    OooOOO0 oooOOO7 = this.f8590OooO00o;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO3 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO7);
                    if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooOOO(oooOOO7, oooOOOO3, string3, bundle4, resultReceiver2));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.OooO00o(bundle5);
                    OooOOO0 oooOOO8 = this.f8590OooO00o;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    OooOOOO oooOOOO4 = new OooOOOO(message.replyTo);
                    Objects.requireNonNull(oooOOO8);
                    if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f8575OoooO0.OooO00o(new androidx.media.OooOOOO(oooOOO8, oooOOOO4, string4, bundle5, resultReceiver3));
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
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    @Nullable
    public abstract OooO00o OooO00o();

    public abstract void OooO0O0();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f8574Oooo.f8584OooO0O0.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f8574Oooo = new OooOO0O(this);
        } else if (i >= 26) {
            this.f8574Oooo = new OooOO0();
        } else if (i >= 23) {
            this.f8574Oooo = new OooO();
        } else {
            this.f8574Oooo = new OooO0o();
        }
        this.f8574Oooo.onCreate();
    }
}
