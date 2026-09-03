package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.okhttp.Protocol;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Picasso {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ReferenceQueue<Object> f21752OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f21753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<o00oO0o> f21754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f21755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f21756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f21757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.squareup.picasso.OooO0o f21758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final WeakHashMap f21759OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final WeakHashMap f21760OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Bitmap.Config f21761OooOO0 = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f21762OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public volatile boolean f21763OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO00o f21751OooOOO0 = new OooO00o(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static volatile Picasso f21750OooOOO = null;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public static class OooO00o extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) message.obj;
                if (oooO00o.f21677OooO00o.f21763OooOO0o) {
                    o000000O.OooO0oo("Main", "canceled", oooO00o.f21678OooO0O0.OooO0O0(), "target got garbage collected");
                }
                oooO00o.f21677OooO00o.OooO00o(oooO00o.OooO0Oo());
                return;
            }
            if (i != 8) {
                if (i != 13) {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list = (List) message.obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) list.get(i2);
                    Picasso picasso = oooO00o2.f21677OooO00o;
                    picasso.getClass();
                    Bitmap bitmapOooO0o0 = MemoryPolicy.OooO00o(oooO00o2.f21682OooO0o0) ? picasso.OooO0o0(oooO00o2.f21676OooO) : null;
                    if (bitmapOooO0o0 != null) {
                        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
                        picasso.OooO0O0(bitmapOooO0o0, loadedFrom, oooO00o2);
                        if (picasso.f21763OooOO0o) {
                            o000000O.OooO0oo("Main", "completed", oooO00o2.f21678OooO0O0.OooO0O0(), "from " + loadedFrom);
                        }
                    } else {
                        picasso.OooO0OO(oooO00o2);
                        if (picasso.f21763OooOO0o) {
                            o000000O.OooO0oO("Main", "resumed", oooO00o2.f21678OooO0O0.OooO0O0());
                        }
                    }
                }
                return;
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.squareup.picasso.OooO0OO oooO0OO = (com.squareup.picasso.OooO0OO) list2.get(i3);
                Picasso picasso2 = oooO0OO.f21697OooO0o0;
                picasso2.getClass();
                com.squareup.picasso.OooO00o oooO00o3 = oooO0OO.f21703OooOOO;
                ArrayList arrayList = oooO0OO.f21705OooOOOO;
                boolean z = true;
                boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                if (oooO00o3 == null && !z2) {
                    z = false;
                }
                if (z) {
                    Uri uri = oooO0OO.f21700OooOO0.f21794OooO0Oo;
                    Bitmap bitmap = oooO0OO.f21706OooOOOo;
                    LoadedFrom loadedFrom2 = oooO0OO.f21707OooOOo;
                    if (oooO00o3 != null) {
                        picasso2.OooO0O0(bitmap, loadedFrom2, oooO00o3);
                    }
                    if (z2) {
                        int size3 = arrayList.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            picasso2.OooO0O0(bitmap, loadedFrom2, (com.squareup.picasso.OooO00o) arrayList.get(i4));
                        }
                    }
                }
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f21764OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Downloader f21765OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00Oo0 f21766OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOo f21767OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO0o.OooO00o f21768OooO0o0;

        public OooO0O0(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f21764OooO00o = context.getApplicationContext();
        }

        public final Picasso OooO00o() {
            Downloader o000ooo2;
            Context context = this.f21764OooO00o;
            if (this.f21765OooO0O0 == null) {
                StringBuilder sb = o000000O.f21773OooO00o;
                try {
                    List<Protocol> list = com.squareup.okhttp.o00Oo0.f21594OooOoo0;
                    o000ooo2 = new o0OoOo0(context);
                } catch (ClassNotFoundException unused) {
                    o000ooo2 = new o000OOo(context);
                }
                this.f21765OooO0O0 = o000ooo2;
            }
            if (this.f21767OooO0Oo == null) {
                this.f21767OooO0Oo = new OooOo(context);
            }
            if (this.f21766OooO0OO == null) {
                this.f21766OooO0OO = new o00Oo0();
            }
            if (this.f21768OooO0o0 == null) {
                this.f21768OooO0o0 = OooO0o.f21772OooO00o;
            }
            o0OOO0o o0ooo0o2 = new o0OOO0o(this.f21767OooO0Oo);
            return new Picasso(context, new OooOOO(context, this.f21766OooO0OO, Picasso.f21751OooOOO0, this.f21765OooO0O0, this.f21767OooO0Oo, o0ooo0o2), this.f21767OooO0Oo, this.f21768OooO0o0, o0ooo0o2);
        }
    }

    public static class OooO0OO extends Thread {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ReferenceQueue<Object> f21769OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f21770OooO0o0;

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Exception f21771OooO0Oo;

            public OooO00o(Exception exc) {
                this.f21771OooO0Oo = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f21771OooO0Oo);
            }
        }

        public OooO0OO(ReferenceQueue referenceQueue, OooO00o oooO00o) {
            this.f21769OooO0Oo = referenceQueue;
            this.f21770OooO0o0 = oooO00o;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Handler handler = this.f21770OooO0o0;
            Process.setThreadPriority(10);
            while (true) {
                try {
                    com.squareup.picasso.OooO00o.C0277OooO00o c0277OooO00o = (com.squareup.picasso.OooO00o.C0277OooO00o) this.f21769OooO0Oo.remove(1000L);
                    Message messageObtainMessage = handler.obtainMessage();
                    if (c0277OooO00o != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0277OooO00o.f21688OooO00o;
                        handler.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    handler.post(new OooO00o(e));
                    return;
                }
            }
        }
    }

    public interface OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f21772OooO00o = new OooO00o();

        public static class OooO00o implements OooO0o {
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public Picasso(Context context, OooOOO oooOOO, com.squareup.picasso.OooO0o oooO0o, OooO0o oooO0o2, o0OOO0o o0ooo0o2) {
        this.f21755OooO0OO = context;
        this.f21756OooO0Oo = oooOOO;
        this.f21758OooO0o0 = oooO0o;
        this.f21753OooO00o = oooO0o2;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new o0ooOOo(context));
        arrayList.add(new OooOO0(context));
        arrayList.add(new Oooo0(context));
        arrayList.add(new OooOO0O(context));
        arrayList.add(new com.squareup.picasso.OooO0O0(context));
        arrayList.add(new OooOOOO(context));
        arrayList.add(new o000oOoO(oooOOO.f21724OooO0OO, o0ooo0o2));
        this.f21754OooO0O0 = Collections.unmodifiableList(arrayList);
        this.f21757OooO0o = o0ooo0o2;
        this.f21759OooO0oO = new WeakHashMap();
        this.f21760OooO0oo = new WeakHashMap();
        this.f21762OooOO0O = false;
        this.f21763OooOO0o = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f21752OooO = referenceQueue;
        new OooO0OO(referenceQueue, f21751OooOOO0).start();
    }

    public static Picasso OooO0o(Context context) {
        if (f21750OooOOO == null) {
            synchronized (Picasso.class) {
                if (f21750OooOOO == null) {
                    f21750OooOOO = new OooO0O0(context).OooO00o();
                }
            }
        }
        return f21750OooOOO;
    }

    public final void OooO00o(Object obj) {
        o000000O.OooO0O0();
        com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) this.f21759OooO0oO.remove(obj);
        if (oooO00o != null) {
            oooO00o.OooO00o();
            OooOOO.OooO00o oooO00o2 = this.f21756OooO0Oo.f21729OooO0oo;
            oooO00o2.sendMessage(oooO00o2.obtainMessage(2, oooO00o));
        }
        if (obj instanceof ImageView) {
            OooOOO0 oooOOO0 = (OooOOO0) this.f21760OooO0oo.remove((ImageView) obj);
            if (oooOOO0 != null) {
                oooOOO0.f21738OooO0o = null;
                ImageView imageView = oooOOO0.f21739OooO0o0.get();
                if (imageView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(oooOOO0);
                }
            }
        }
    }

    public final void OooO0O0(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.OooO00o oooO00o) {
        if (oooO00o.f21687OooOO0o) {
            return;
        }
        if (!oooO00o.f21686OooOO0O) {
            this.f21759OooO0oO.remove(oooO00o.OooO0Oo());
        }
        if (bitmap == null) {
            oooO00o.OooO0OO();
            if (this.f21763OooOO0o) {
                o000000O.OooO0oO("Main", "errored", oooO00o.f21678OooO0O0.OooO0O0());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        oooO00o.OooO0O0(bitmap, loadedFrom);
        if (this.f21763OooOO0o) {
            o000000O.OooO0oo("Main", "completed", oooO00o.f21678OooO0O0.OooO0O0(), "from " + loadedFrom);
        }
    }

    public final void OooO0OO(com.squareup.picasso.OooO00o oooO00o) {
        Object objOooO0Oo = oooO00o.OooO0Oo();
        if (objOooO0Oo != null) {
            WeakHashMap weakHashMap = this.f21759OooO0oO;
            if (weakHashMap.get(objOooO0Oo) != oooO00o) {
                OooO00o(objOooO0Oo);
                weakHashMap.put(objOooO0Oo, oooO00o);
            }
        }
        OooOOO.OooO00o oooO00o2 = this.f21756OooO0Oo.f21729OooO0oo;
        oooO00o2.sendMessage(oooO00o2.obtainMessage(1, oooO00o));
    }

    public final oo000o OooO0Oo(String str) {
        if (str == null) {
            return new oo000o(this, null);
        }
        if (str.trim().length() != 0) {
            return new oo000o(this, Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public final Bitmap OooO0o0(String str) {
        Bitmap bitmapOooO00o = ((OooOo) this.f21758OooO0o0).OooO00o(str);
        o0OOO0o o0ooo0o2 = this.f21757OooO0o;
        if (bitmapOooO00o != null) {
            o0ooo0o2.f21820OooO0O0.sendEmptyMessage(0);
        } else {
            o0ooo0o2.f21820OooO0O0.sendEmptyMessage(1);
        }
        return bitmapOooO00o;
    }
}
