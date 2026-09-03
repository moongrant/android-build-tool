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
import com.umeng.analytics.pro.bl;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p420o0Oo0ooO.oO00OOo0;
import p420o0Oo0ooO.oO00Oo0;
import p420o0Oo0ooO.oO00o00;
import p420o0Oo0ooO.oOOoOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Picasso {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f19790OooOOO = new OooO00o(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile Picasso f19791OooOOOO = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<ImageView, oO00Oo0> f19792OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f19794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<o0OoOo0> f19795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f19796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO00OOo0 f19797OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f19798OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO00o00 f19799OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.OooO00o> f19800OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ReferenceQueue<Object> f19801OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f19803OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public volatile boolean f19804OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f19793OooO00o = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Bitmap.Config f19802OooOO0O = null;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(bl.a);

        public final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public interface OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f19805OooO00o = new OooO00o();

        public static class OooO00o implements OooO {
        }
    }

    public static class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List, java.util.List<com.squareup.picasso.OooO00o>] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) message.obj;
                if (oooO00o.f19691OooO00o.f19804OooOOO0) {
                    o00oO0o.OooOO0("Main", "canceled", oooO00o.f19692OooO0O0.OooO0O0(), "target got garbage collected");
                }
                oooO00o.f19691OooO00o.OooO00o(oooO00o.OooO0Oo());
                return;
            }
            if (i != 8) {
                if (i != 13) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown handler message received: ");
                    sbOooO0o0.append(message.what);
                    throw new AssertionError(sbOooO0o0.toString());
                }
                List list = (List) message.obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) list.get(i2);
                    Picasso picasso = oooO00o2.f19691OooO00o;
                    Objects.requireNonNull(picasso);
                    Bitmap bitmapOooO0o0 = MemoryPolicy.OooO00o(oooO00o2.f19696OooO0o0) ? picasso.OooO0o0(oooO00o2.f19690OooO) : null;
                    if (bitmapOooO0o0 != null) {
                        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
                        picasso.OooO0O0(bitmapOooO0o0, loadedFrom, oooO00o2);
                        if (picasso.f19804OooOOO0) {
                            o00oO0o.OooOO0("Main", "completed", oooO00o2.f19692OooO0O0.OooO0O0(), "from " + loadedFrom);
                        }
                    } else {
                        picasso.OooO0OO(oooO00o2);
                        if (picasso.f19804OooOOO0) {
                            o00oO0o.OooO("Main", "resumed", oooO00o2.f19692OooO0O0.OooO0O0());
                        }
                    }
                }
                return;
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.squareup.picasso.OooO0OO oooO0OO = (com.squareup.picasso.OooO0OO) list2.get(i3);
                Picasso picasso2 = oooO0OO.f19710Oooo0oO;
                Objects.requireNonNull(picasso2);
                com.squareup.picasso.OooO00o oooO00o3 = oooO0OO.f19717OoooOOO;
                ?? r5 = oooO0OO.f19718OoooOOo;
                boolean z = true;
                boolean z2 = (r5 == 0 || r5.isEmpty()) ? false : true;
                if (oooO00o3 == null && !z2) {
                    z = false;
                }
                if (z) {
                    Uri uri = oooO0OO.f19715OoooO0O.f19769OooO0Oo;
                    Exception exc = oooO0OO.f19722Ooooo00;
                    Bitmap bitmap = oooO0OO.f19719OoooOo0;
                    LoadedFrom loadedFrom2 = oooO0OO.f19721OoooOoo;
                    if (oooO00o3 != null) {
                        picasso2.OooO0O0(bitmap, loadedFrom2, oooO00o3);
                    }
                    if (z2) {
                        int size3 = r5.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            picasso2.OooO0O0(bitmap, loadedFrom2, (com.squareup.picasso.OooO00o) r5.get(i4));
                        }
                    }
                    OooO0o oooO0o = picasso2.f19793OooO00o;
                    if (oooO0o != null && exc != null) {
                        oooO0o.OooO00o();
                    }
                }
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f19806OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Downloader f19807OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Oooo000 f19808OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oOOoOOO0 f19809OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO.OooO00o f19810OooO0o0;

        public OooO0O0(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f19806OooO00o = context.getApplicationContext();
        }

        public final Picasso OooO00o() {
            Downloader oo000oVar;
            Context context = this.f19806OooO00o;
            if (this.f19807OooO0O0 == null) {
                StringBuilder sb = o00oO0o.f19821OooO00o;
                try {
                    Class.forName("o0Oo0o00.o000");
                    oo000oVar = new OooOo00(context);
                } catch (ClassNotFoundException unused) {
                    oo000oVar = new oo000o(context);
                }
                this.f19807OooO0O0 = oo000oVar;
            }
            if (this.f19809OooO0Oo == null) {
                this.f19809OooO0Oo = new oOOoOOO0(context);
            }
            if (this.f19808OooO0OO == null) {
                this.f19808OooO0OO = new Oooo000();
            }
            if (this.f19810OooO0o0 == null) {
                this.f19810OooO0o0 = OooO.f19805OooO00o;
            }
            oO00o00 oo00o00 = new oO00o00(this.f19809OooO0Oo);
            return new Picasso(context, new OooOO0(context, this.f19808OooO0OO, Picasso.f19790OooOOO, this.f19807OooO0O0, this.f19809OooO0Oo, oo00o00), this.f19809OooO0Oo, this.f19810OooO0o0, oo00o00);
        }
    }

    public static class OooO0OO extends Thread {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ReferenceQueue<Object> f19811Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Handler f19812Oooo0oO;

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Exception f19813Oooo0o;

            public OooO00o(Exception exc) {
                this.f19813Oooo0o = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f19813Oooo0o);
            }
        }

        public OooO0OO(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f19811Oooo0o = referenceQueue;
            this.f19812Oooo0oO = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    com.squareup.picasso.OooO00o.C0176OooO00o c0176OooO00o = (com.squareup.picasso.OooO00o.C0176OooO00o) this.f19811Oooo0o.remove(1000L);
                    Message messageObtainMessage = this.f19812Oooo0oO.obtainMessage();
                    if (c0176OooO00o != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0176OooO00o.f19702OooO00o;
                        this.f19812Oooo0oO.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f19812Oooo0oO.post(new OooO00o(e));
                    return;
                }
            }
        }
    }

    public interface OooO0o {
        void OooO00o();
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public Picasso(Context context, OooOO0 oooOO1, oO00OOo0 oo00ooo0, OooO oooO, oO00o00 oo00o00) {
        this.f19796OooO0Oo = context;
        this.f19798OooO0o0 = oooOO1;
        this.f19797OooO0o = oo00ooo0;
        this.f19794OooO0O0 = oooO;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new o00O0O(context));
        arrayList.add(new com.squareup.picasso.OooO0o(context));
        arrayList.add(new OooOOO(context));
        arrayList.add(new com.squareup.picasso.OooO(context));
        arrayList.add(new com.squareup.picasso.OooO0O0(context));
        arrayList.add(new OooOO0O(context));
        arrayList.add(new OooOOOO(oooOO1.f19737OooO0OO, oo00o00));
        this.f19795OooO0OO = Collections.unmodifiableList(arrayList);
        this.f19799OooO0oO = oo00o00;
        this.f19800OooO0oo = new WeakHashMap();
        this.f19792OooO = new WeakHashMap();
        this.f19803OooOO0o = false;
        this.f19804OooOOO0 = false;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f19801OooOO0 = referenceQueue;
        new OooO0OO(referenceQueue, f19790OooOOO).start();
    }

    public static Picasso OooO0o(Context context) {
        if (f19791OooOOOO == null) {
            synchronized (Picasso.class) {
                if (f19791OooOOOO == null) {
                    f19791OooOOOO = new OooO0O0(context).OooO00o();
                }
            }
        }
        return f19791OooOOOO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<android.widget.ImageView, o0Oo0ooO.oO00Oo0>, java.util.WeakHashMap] */
    public final void OooO00o(Object obj) {
        o00oO0o.OooO0O0();
        com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) this.f19800OooO0oo.remove(obj);
        if (oooO00o != null) {
            oooO00o.OooO00o();
            OooOO0.OooO00o oooO00o2 = this.f19798OooO0o0.f19742OooO0oo;
            oooO00o2.sendMessage(oooO00o2.obtainMessage(2, oooO00o));
        }
        if (obj instanceof ImageView) {
            oO00Oo0 oo00oo0 = (oO00Oo0) this.f19792OooO.remove((ImageView) obj);
            if (oo00oo0 != null) {
                oo00oo0.f39773Oooo0oo = null;
                ImageView imageView = oo00oo0.f39772Oooo0oO.get();
                if (imageView == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(oo00oo0);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    public final void OooO0O0(Bitmap bitmap, LoadedFrom loadedFrom, com.squareup.picasso.OooO00o oooO00o) {
        if (oooO00o.f19701OooOO0o) {
            return;
        }
        if (!oooO00o.f19700OooOO0O) {
            this.f19800OooO0oo.remove(oooO00o.OooO0Oo());
        }
        if (bitmap == null) {
            oooO00o.OooO0OO();
            if (this.f19804OooOOO0) {
                o00oO0o.OooO("Main", "errored", oooO00o.f19692OooO0O0.OooO0O0());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        oooO00o.OooO0O0(bitmap, loadedFrom);
        if (this.f19804OooOOO0) {
            o00oO0o.OooOO0("Main", "completed", oooO00o.f19692OooO0O0.OooO0O0(), "from " + loadedFrom);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    public final void OooO0OO(com.squareup.picasso.OooO00o oooO00o) {
        Object objOooO0Oo = oooO00o.OooO0Oo();
        if (objOooO0Oo != null && this.f19800OooO0oo.get(objOooO0Oo) != oooO00o) {
            OooO00o(objOooO0Oo);
            this.f19800OooO0oo.put(objOooO0Oo, oooO00o);
        }
        OooOO0.OooO00o oooO00o2 = this.f19798OooO0o0.f19742OooO0oo;
        oooO00o2.sendMessage(oooO00o2.obtainMessage(1, oooO00o));
    }

    public final o000oOoO OooO0Oo(String str) {
        if (str == null) {
            return new o000oOoO(this, null);
        }
        if (str.trim().length() != 0) {
            return new o000oOoO(this, Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public final Bitmap OooO0o0(String str) {
        Bitmap bitmapOooO00o = ((oOOoOOO0) this.f19797OooO0o).OooO00o(str);
        if (bitmapOooO00o != null) {
            this.f19799OooO0oO.f39776OooO0O0.sendEmptyMessage(0);
        } else {
            this.f19799OooO0oO.f39776OooO0O0.sendEmptyMessage(1);
        }
        return bitmapOooO00o;
    }
}
