package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Handler f21253OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f21255OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Downloader f21256OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f21257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final WeakHashMap f21258OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final WeakHashMap f21259OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashSet f21260OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f21261OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0o f21262OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OOO0o f21263OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f21264OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f21265OooOOO0;

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO f21266OooO00o;

        /* JADX INFO: renamed from: com.squareup.picasso.OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0278OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Message f21267OooO0Oo;

            public RunnableC0278OooO00o(Message message) {
                this.f21267OooO0Oo = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unknown handler message received: " + this.f21267OooO0Oo.what);
            }
        }

        public OooO00o(Looper looper, OooOOO oooOOO) {
            super(looper);
            this.f21266OooO00o = oooOOO;
        }

        /* JADX WARN: Code duplicated, block: B:79:0x0180  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean zOooO0o;
            NetworkInfo activeNetworkInfo = null;
            ArrayList arrayList = null;
            switch (message.what) {
                case 1:
                    this.f21266OooO00o.OooO0o0((com.squareup.picasso.OooO00o) message.obj, true);
                    return;
                case 2:
                    com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) message.obj;
                    OooOOO oooOOO = this.f21266OooO00o;
                    oooOOO.getClass();
                    String str = oooO00o.f21208OooO;
                    com.squareup.picasso.OooO0OO oooO0OO = (com.squareup.picasso.OooO0OO) oooOOO.f21257OooO0Oo.get(str);
                    if (oooO0OO != null) {
                        oooO0OO.OooO0Oo(oooO00o);
                        if (oooO0OO.OooO0O0()) {
                            oooOOO.f21257OooO0Oo.remove(str);
                            if (oooO00o.f21209OooO00o.f21295OooOO0o) {
                                o000000O.OooO0oO("Dispatcher", "canceled", oooO00o.f21210OooO0O0.OooO0O0());
                            }
                        }
                    }
                    if (oooOOO.f21260OooO0oO.contains(oooO00o.f21217OooOO0)) {
                        oooOOO.f21258OooO0o.remove(oooO00o.OooO0Oo());
                        if (oooO00o.f21209OooO00o.f21295OooOO0o) {
                            o000000O.OooO0oo("Dispatcher", "canceled", oooO00o.f21210OooO0O0.OooO0O0(), "because paused request got canceled");
                        }
                    }
                    com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) oooOOO.f21259OooO0o0.remove(oooO00o.OooO0Oo());
                    if (oooO00o2 == null || !oooO00o2.f21209OooO00o.f21295OooOO0o) {
                        return;
                    }
                    o000000O.OooO0oo("Dispatcher", "canceled", oooO00o2.f21210OooO0O0.OooO0O0(), "from replaying");
                    return;
                case 3:
                case 8:
                default:
                    Picasso.f21283OooOOO0.post(new RunnableC0278OooO00o(message));
                    return;
                case 4:
                    com.squareup.picasso.OooO0OO oooO0OO2 = (com.squareup.picasso.OooO0OO) message.obj;
                    OooOOO oooOOO2 = this.f21266OooO00o;
                    oooOOO2.getClass();
                    if ((oooO0OO2.f21233OooOO0O & MemoryPolicy.NO_STORE.index) == 0) {
                        OooO0o oooO0o = oooOOO2.f21262OooOO0;
                        String str2 = oooO0OO2.f21226OooO;
                        Bitmap bitmap = oooO0OO2.f21238OooOOOo;
                        OooOo oooOo = (OooOo) oooO0o;
                        oooOo.getClass();
                        if (str2 == null || bitmap == null) {
                            throw new NullPointerException("key == null || bitmap == null");
                        }
                        synchronized (oooOo) {
                            oooOo.f21274OooO0OO += o000000O.OooO0Oo(bitmap);
                            Bitmap bitmapPut = oooOo.f21272OooO00o.put(str2, bitmap);
                            if (bitmapPut != null) {
                                oooOo.f21274OooO0OO -= o000000O.OooO0Oo(bitmapPut);
                            }
                            break;
                        }
                        oooOo.OooO0OO(oooOo.f21273OooO0O0);
                    }
                    oooOOO2.f21257OooO0Oo.remove(oooO0OO2.f21226OooO);
                    oooOOO2.OooO00o(oooO0OO2);
                    if (oooO0OO2.f21229OooO0o0.f21295OooOO0o) {
                        o000000O.OooO0oo("Dispatcher", "batched", o000000O.OooO0o0(oooO0OO2), "for completion");
                        return;
                    }
                    return;
                case 5:
                    com.squareup.picasso.OooO0OO oooO0OO3 = (com.squareup.picasso.OooO0OO) message.obj;
                    OooOOO oooOOO3 = this.f21266OooO00o;
                    oooOOO3.getClass();
                    Future<?> future = oooO0OO3.f21240OooOOo0;
                    if (future != null && future.isCancelled()) {
                        return;
                    }
                    if (oooOOO3.f21255OooO0O0.isShutdown()) {
                        oooOOO3.OooO0Oo(oooO0OO3, false);
                        return;
                    }
                    if (oooOOO3.f21265OooOOO0) {
                        Context context = oooOOO3.f21254OooO00o;
                        StringBuilder sb = o000000O.f21305OooO00o;
                        activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                    Object[] objArr = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                    int i = oooO0OO3.f21242OooOo0;
                    if ((i > 0) == true) {
                        oooO0OO3.f21242OooOo0 = i - 1;
                        zOooO0o = oooO0OO3.f21236OooOOO0.OooO0o(activeNetworkInfo);
                    } else {
                        zOooO0o = false;
                    }
                    o00oO0o o00oo0o2 = oooO0OO3.f21236OooOOO0;
                    o00oo0o2.getClass();
                    boolean z = o00oo0o2 instanceof o000oOoO;
                    if (!zOooO0o) {
                        boolean z2 = oooOOO3.f21265OooOOO0 && z;
                        oooOOO3.OooO0Oo(oooO0OO3, z2);
                        if (z2) {
                            oooOOO3.OooO0OO(oooO0OO3);
                            return;
                        }
                        return;
                    }
                    if (oooOOO3.f21265OooOOO0 && objArr != true) {
                        oooOOO3.OooO0Oo(oooO0OO3, z);
                        if (z) {
                            oooOOO3.OooO0OO(oooO0OO3);
                            return;
                        }
                        return;
                    }
                    if (oooO0OO3.f21229OooO0o0.f21295OooOO0o) {
                        o000000O.OooO0oO("Dispatcher", "retrying", o000000O.OooO0o0(oooO0OO3));
                    }
                    if (oooO0OO3.f21241OooOOoo instanceof o000oOoO.OooO00o) {
                        oooO0OO3.f21234OooOO0o |= NetworkPolicy.NO_CACHE.index;
                    }
                    oooO0OO3.f21240OooOOo0 = oooOOO3.f21255OooO0O0.submit(oooO0OO3);
                    return;
                case 6:
                    this.f21266OooO00o.OooO0Oo((com.squareup.picasso.OooO0OO) message.obj, false);
                    return;
                case 7:
                    OooOOO oooOOO4 = this.f21266OooO00o;
                    oooOOO4.getClass();
                    ArrayList<com.squareup.picasso.OooO0OO> arrayList2 = new ArrayList(oooOOO4.f21264OooOO0o);
                    oooOOO4.f21264OooOO0o.clear();
                    Handler handler = oooOOO4.f21253OooO;
                    handler.sendMessage(handler.obtainMessage(8, arrayList2));
                    if (!arrayList2.isEmpty() && ((com.squareup.picasso.OooO0OO) arrayList2.get(0)).f21229OooO0o0.f21295OooOO0o) {
                        StringBuilder sb2 = new StringBuilder();
                        for (com.squareup.picasso.OooO0OO oooO0OO4 : arrayList2) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(o000000O.OooO0o0(oooO0OO4));
                        }
                        o000000O.OooO0oO("Dispatcher", "delivered", sb2.toString());
                        return;
                    }
                    return;
                case 9:
                    NetworkInfo networkInfo = (NetworkInfo) message.obj;
                    OooOOO oooOOO5 = this.f21266OooO00o;
                    ExecutorService executorService = oooOOO5.f21255OooO0O0;
                    if (executorService instanceof o00Oo0) {
                        o00Oo0 o00oo1 = (o00Oo0) executorService;
                        if (networkInfo != null) {
                            o00oo1.getClass();
                            if (networkInfo.isConnectedOrConnecting()) {
                                int type = networkInfo.getType();
                                if (type == 0) {
                                    int subtype = networkInfo.getSubtype();
                                    switch (subtype) {
                                        case 1:
                                        case 2:
                                            o00oo1.OooO0O0(1);
                                            break;
                                        default:
                                            switch (subtype) {
                                                case 12:
                                                    break;
                                                case 13:
                                                case 14:
                                                case 15:
                                                    o00oo1.OooO0O0(3);
                                                    break;
                                                default:
                                                    o00oo1.OooO0O0(3);
                                                    break;
                                            }
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            o00oo1.OooO0O0(2);
                                            break;
                                    }
                                } else if (type == 1 || type == 6 || type == 9) {
                                    o00oo1.OooO0O0(4);
                                } else {
                                    o00oo1.OooO0O0(3);
                                }
                            } else {
                                o00oo1.OooO0O0(3);
                            }
                        } else {
                            o00oo1.OooO0O0(3);
                        }
                    }
                    if (networkInfo == null || !networkInfo.isConnected() || oooOOO5.f21259OooO0o0.isEmpty()) {
                        return;
                    }
                    Iterator it = oooOOO5.f21259OooO0o0.values().iterator();
                    while (it.hasNext()) {
                        com.squareup.picasso.OooO00o oooO00o3 = (com.squareup.picasso.OooO00o) it.next();
                        it.remove();
                        if (oooO00o3.f21209OooO00o.f21295OooOO0o) {
                            o000000O.OooO0oO("Dispatcher", "replaying", oooO00o3.f21210OooO0O0.OooO0O0());
                        }
                        oooOOO5.OooO0o0(oooO00o3, false);
                    }
                    return;
                case 10:
                    OooOOO oooOOO6 = this.f21266OooO00o;
                    int i2 = message.arg1;
                    oooOOO6.getClass();
                    return;
                case 11:
                    Object obj = message.obj;
                    OooOOO oooOOO7 = this.f21266OooO00o;
                    if (oooOOO7.f21260OooO0oO.add(obj)) {
                        Iterator it2 = oooOOO7.f21257OooO0Oo.values().iterator();
                        while (it2.hasNext()) {
                            com.squareup.picasso.OooO0OO oooO0OO5 = (com.squareup.picasso.OooO0OO) it2.next();
                            boolean z3 = oooO0OO5.f21229OooO0o0.f21295OooOO0o;
                            com.squareup.picasso.OooO00o oooO00o4 = oooO0OO5.f21235OooOOO;
                            ArrayList arrayList3 = oooO0OO5.f21237OooOOOO;
                            boolean z4 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
                            if (oooO00o4 != null || z4) {
                                if (oooO00o4 != null && oooO00o4.f21217OooOO0.equals(obj)) {
                                    oooO0OO5.OooO0Oo(oooO00o4);
                                    oooOOO7.f21258OooO0o.put(oooO00o4.OooO0Oo(), oooO00o4);
                                    if (z3) {
                                        o000000O.OooO0oo("Dispatcher", "paused", oooO00o4.f21210OooO0O0.OooO0O0(), "because tag '" + obj + "' was paused");
                                    }
                                }
                                if (z4) {
                                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                                        com.squareup.picasso.OooO00o oooO00o5 = (com.squareup.picasso.OooO00o) arrayList3.get(size);
                                        if (oooO00o5.f21217OooOO0.equals(obj)) {
                                            oooO0OO5.OooO0Oo(oooO00o5);
                                            oooOOO7.f21258OooO0o.put(oooO00o5.OooO0Oo(), oooO00o5);
                                            if (z3) {
                                                o000000O.OooO0oo("Dispatcher", "paused", oooO00o5.f21210OooO0O0.OooO0O0(), "because tag '" + obj + "' was paused");
                                            }
                                        }
                                    }
                                }
                                if (oooO0OO5.OooO0O0()) {
                                    it2.remove();
                                    if (z3) {
                                        o000000O.OooO0oo("Dispatcher", "canceled", o000000O.OooO0o0(oooO0OO5), "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    OooOOO oooOOO8 = this.f21266OooO00o;
                    if (oooOOO8.f21260OooO0oO.remove(obj2)) {
                        Iterator it3 = oooOOO8.f21258OooO0o.values().iterator();
                        while (it3.hasNext()) {
                            com.squareup.picasso.OooO00o oooO00o6 = (com.squareup.picasso.OooO00o) it3.next();
                            if (oooO00o6.f21217OooOO0.equals(obj2)) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(oooO00o6);
                                it3.remove();
                            }
                        }
                        if (arrayList != null) {
                            Handler handler2 = oooOOO8.f21253OooO;
                            handler2.sendMessage(handler2.obtainMessage(13, arrayList));
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    public static class OooO0O0 extends HandlerThread {
        public OooO0O0() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class OooO0OO extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO f21268OooO00o;

        public OooO0OO(OooOOO oooOOO) {
            this.f21268OooO00o = oooOOO;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            boolean zEquals = "android.intent.action.AIRPLANE_MODE".equals(action);
            OooOOO oooOOO = this.f21268OooO00o;
            if (zEquals) {
                if (intent.hasExtra("state")) {
                    boolean booleanExtra = intent.getBooleanExtra("state", false);
                    OooO00o oooO00o = oooOOO.f21261OooO0oo;
                    oooO00o.sendMessage(oooO00o.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    return;
                }
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb = o000000O.f21305OooO00o;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                OooO00o oooO00o2 = oooOOO.f21261OooO0oo;
                oooO00o2.sendMessage(oooO00o2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    public OooOOO(Context context, ExecutorService executorService, Picasso.OooO00o oooO00o, Downloader downloader, OooO0o oooO0o, o0OOO0o o0ooo0o2) {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.start();
        Looper looper = oooO0O0.getLooper();
        StringBuilder sb = o000000O.f21305OooO00o;
        o000000 o000000Var = new o000000(looper);
        o000000Var.sendMessageDelayed(o000000Var.obtainMessage(), 1000L);
        this.f21254OooO00o = context;
        this.f21255OooO0O0 = executorService;
        this.f21257OooO0Oo = new LinkedHashMap();
        this.f21259OooO0o0 = new WeakHashMap();
        this.f21258OooO0o = new WeakHashMap();
        this.f21260OooO0oO = new HashSet();
        this.f21261OooO0oo = new OooO00o(oooO0O0.getLooper(), this);
        this.f21256OooO0OO = downloader;
        this.f21253OooO = oooO00o;
        this.f21262OooOO0 = oooO0o;
        this.f21263OooOO0O = o0ooo0o2;
        this.f21264OooOO0o = new ArrayList(4);
        try {
            Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException unused) {
        }
        this.f21265OooOOO0 = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        OooO0OO oooO0OO = new OooO0OO(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        OooOOO oooOOO = oooO0OO.f21268OooO00o;
        if (oooOOO.f21265OooOOO0) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        oooOOO.f21254OooO00o.registerReceiver(oooO0OO, intentFilter);
    }

    public final void OooO00o(com.squareup.picasso.OooO0OO oooO0OO) {
        Future<?> future = oooO0OO.f21240OooOOo0;
        if (future != null && future.isCancelled()) {
            return;
        }
        this.f21264OooOO0o.add(oooO0OO);
        OooO00o oooO00o = this.f21261OooO0oo;
        if (oooO00o.hasMessages(7)) {
            return;
        }
        oooO00o.sendEmptyMessageDelayed(7, 200L);
    }

    public final void OooO0O0(com.squareup.picasso.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f21261OooO0oo;
        oooO00o.sendMessage(oooO00o.obtainMessage(4, oooO0OO));
    }

    public final void OooO0OO(com.squareup.picasso.OooO0OO oooO0OO) {
        Object objOooO0Oo;
        com.squareup.picasso.OooO00o oooO00o = oooO0OO.f21235OooOOO;
        WeakHashMap weakHashMap = this.f21259OooO0o0;
        if (oooO00o != null && (objOooO0Oo = oooO00o.OooO0Oo()) != null) {
            oooO00o.f21218OooOO0O = true;
            weakHashMap.put(objOooO0Oo, oooO00o);
        }
        ArrayList arrayList = oooO0OO.f21237OooOOOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) arrayList.get(i);
                Object objOooO0Oo2 = oooO00o2.OooO0Oo();
                if (objOooO0Oo2 != null) {
                    oooO00o2.f21218OooOO0O = true;
                    weakHashMap.put(objOooO0Oo2, oooO00o2);
                }
            }
        }
    }

    public final void OooO0Oo(com.squareup.picasso.OooO0OO oooO0OO, boolean z) {
        if (oooO0OO.f21229OooO0o0.f21295OooOO0o) {
            o000000O.OooO0oo("Dispatcher", "batched", o000000O.OooO0o0(oooO0OO), "for error".concat(z ? " (will replay)" : ""));
        }
        this.f21257OooO0Oo.remove(oooO0OO.f21226OooO);
        OooO00o(oooO0OO);
    }

    public final void OooO0o0(com.squareup.picasso.OooO00o oooO00o, boolean z) {
        com.squareup.picasso.OooO0OO oooO0OO;
        if (this.f21260OooO0oO.contains(oooO00o.f21217OooOO0)) {
            this.f21258OooO0o.put(oooO00o.OooO0Oo(), oooO00o);
            if (oooO00o.f21209OooO00o.f21295OooOO0o) {
                o000000O.OooO0oo("Dispatcher", "paused", oooO00o.f21210OooO0O0.OooO0O0(), "because tag '" + oooO00o.f21217OooOO0 + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.OooO0OO oooO0OO2 = (com.squareup.picasso.OooO0OO) this.f21257OooO0Oo.get(oooO00o.f21208OooO);
        if (oooO0OO2 != null) {
            boolean z2 = oooO0OO2.f21229OooO0o0.f21295OooOO0o;
            o00Ooo o00ooo2 = oooO00o.f21210OooO0O0;
            if (oooO0OO2.f21235OooOOO == null) {
                oooO0OO2.f21235OooOOO = oooO00o;
                if (z2) {
                    ArrayList arrayList = oooO0OO2.f21237OooOOOO;
                    if (arrayList == null || arrayList.isEmpty()) {
                        o000000O.OooO0oo("Hunter", "joined", o00ooo2.OooO0O0(), "to empty hunter");
                        return;
                    } else {
                        o000000O.OooO0oo("Hunter", "joined", o00ooo2.OooO0O0(), o000000O.OooO0o(oooO0OO2, "to "));
                        return;
                    }
                }
                return;
            }
            if (oooO0OO2.f21237OooOOOO == null) {
                oooO0OO2.f21237OooOOOO = new ArrayList(3);
            }
            oooO0OO2.f21237OooOOOO.add(oooO00o);
            if (z2) {
                o000000O.OooO0oo("Hunter", "joined", o00ooo2.OooO0O0(), o000000O.OooO0o(oooO0OO2, "to "));
            }
            Picasso.Priority priority = oooO00o.f21210OooO0O0.f21338OooOOo0;
            if (priority.ordinal() > oooO0OO2.f21244OooOo0O.ordinal()) {
                oooO0OO2.f21244OooOo0O = priority;
                return;
            }
            return;
        }
        if (this.f21255OooO0O0.isShutdown()) {
            if (oooO00o.f21209OooO00o.f21295OooOO0o) {
                o000000O.OooO0oo("Dispatcher", "ignored", oooO00o.f21210OooO0O0.OooO0O0(), "because shut down");
                return;
            }
            return;
        }
        Picasso picasso = oooO00o.f21209OooO00o;
        OooO0o oooO0o = this.f21262OooOO0;
        o0OOO0o o0ooo0o2 = this.f21263OooOO0O;
        Object obj = com.squareup.picasso.OooO0OO.f21223OooOo0o;
        o00Ooo o00ooo3 = oooO00o.f21210OooO0O0;
        List<o00oO0o> list = picasso.f21286OooO0O0;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                oooO0OO = new com.squareup.picasso.OooO0OO(picasso, this, oooO0o, o0ooo0o2, oooO00o, com.squareup.picasso.OooO0OO.f21224OooOoO);
                break;
            }
            o00oO0o o00oo0o2 = list.get(i);
            if (o00oo0o2.OooO0O0(o00ooo3)) {
                oooO0OO = new com.squareup.picasso.OooO0OO(picasso, this, oooO0o, o0ooo0o2, oooO00o, o00oo0o2);
                break;
            }
            i++;
        }
        oooO0OO.f21240OooOOo0 = this.f21255OooO0O0.submit(oooO0OO);
        this.f21257OooO0Oo.put(oooO00o.f21208OooO, oooO0OO);
        if (z) {
            this.f21259OooO0o0.remove(oooO00o.OooO0Oo());
        }
        if (oooO00o.f21209OooO00o.f21295OooOO0o) {
            o000000O.OooO0oO("Dispatcher", "enqueued", oooO00o.f21210OooO0O0.OooO0O0());
        }
    }
}
