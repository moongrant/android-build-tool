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
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p423o0Oo0ooO.oO00OOOo;
import p423o0Oo0ooO.oO00Oo0;
import p423o0Oo0ooO.oO00o000;
import p423o0Oo0ooO.oO00o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Handler f19754OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f19756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Downloader f19757OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, com.squareup.picasso.OooO0OO> f19758OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.OooO00o> f19759OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<Object, com.squareup.picasso.OooO00o> f19760OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<Object> f19761OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f19762OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oO00OOOo f19763OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final oO00o000 f19764OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<com.squareup.picasso.OooO0OO> f19765OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f19766OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f19767OooOOO0;

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0 f19768OooO00o;

        /* JADX INFO: renamed from: com.squareup.picasso.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0178OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Message f19769Oooo;

            public RunnableC0178OooO00o(Message message) {
                this.f19769Oooo = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Unknown handler message received: ");
                sbOooO0O0.append(this.f19769Oooo.what);
                throw new AssertionError(sbOooO0O0.toString());
            }
        }

        public OooO00o(Looper looper, OooOO0 oooOO1) {
            super(looper);
            this.f19768OooO00o = oooOO1;
        }

        /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO0OO>] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r3v48, types: [java.util.HashSet, java.util.Set<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r3v50, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.squareup.picasso.OooO0OO>] */
        /* JADX WARN: Type inference failed for: r5v35, types: [java.util.HashSet, java.util.Set<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r5v37, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.squareup.picasso.OooO0OO>] */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList, java.util.List, java.util.List<com.squareup.picasso.OooO00o>] */
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
            boolean zOooO0oO;
            NetworkInfo activeNetworkInfo = null;
            ArrayList arrayList = null;
            switch (message.what) {
                case 1:
                    this.f19768OooO00o.OooO0o((com.squareup.picasso.OooO00o) message.obj, true);
                    return;
                case 2:
                    com.squareup.picasso.OooO00o oooO00o = (com.squareup.picasso.OooO00o) message.obj;
                    OooOO0 oooOO1 = this.f19768OooO00o;
                    Objects.requireNonNull(oooOO1);
                    String str = oooO00o.f19710OooO;
                    com.squareup.picasso.OooO0OO oooO0OO = (com.squareup.picasso.OooO0OO) oooOO1.f19758OooO0Oo.get(str);
                    if (oooO0OO != null) {
                        oooO0OO.OooO0Oo(oooO00o);
                        if (oooO0OO.OooO0O0()) {
                            oooOO1.f19758OooO0Oo.remove(str);
                            if (oooO00o.f19711OooO00o.f19824OooOOO0) {
                                o00oO0o.OooO("Dispatcher", "canceled", oooO00o.f19712OooO0O0.OooO0O0());
                            }
                        }
                    }
                    if (oooOO1.f19761OooO0oO.contains(oooO00o.f19719OooOO0)) {
                        oooOO1.f19759OooO0o.remove(oooO00o.OooO0Oo());
                        if (oooO00o.f19711OooO00o.f19824OooOOO0) {
                            o00oO0o.OooOO0("Dispatcher", "canceled", oooO00o.f19712OooO0O0.OooO0O0(), "because paused request got canceled");
                        }
                    }
                    com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) oooOO1.f19760OooO0o0.remove(oooO00o.OooO0Oo());
                    if (oooO00o2 == null || !oooO00o2.f19711OooO00o.f19824OooOOO0) {
                        return;
                    }
                    o00oO0o.OooOO0("Dispatcher", "canceled", oooO00o2.f19712OooO0O0.OooO0O0(), "from replaying");
                    return;
                case 3:
                case 8:
                default:
                    Picasso.f19810OooOOO.post(new RunnableC0178OooO00o(message));
                    return;
                case 4:
                    com.squareup.picasso.OooO0OO oooO0OO2 = (com.squareup.picasso.OooO0OO) message.obj;
                    OooOO0 oooOO2 = this.f19768OooO00o;
                    Objects.requireNonNull(oooOO2);
                    if ((oooO0OO2.f19734OoooOOO & MemoryPolicy.NO_STORE.index) == 0) {
                        oO00OOOo oo00oooo = oooOO2.f19763OooOO0;
                        String str2 = oooO0OO2.f19733OoooOO0;
                        Bitmap bitmap = oooO0OO2.f19739Ooooo00;
                        oO00Oo0 oo00oo0 = (oO00Oo0) oo00oooo;
                        if (str2 == null || bitmap == null) {
                            throw new NullPointerException("key == null || bitmap == null");
                        }
                        synchronized (oo00oo0) {
                            oo00oo0.f39793OooO0OO += o00oO0o.OooO0o(bitmap);
                            Bitmap bitmapPut = oo00oo0.f39791OooO00o.put(str2, bitmap);
                            if (bitmapPut != null) {
                                oo00oo0.f39793OooO0OO -= o00oO0o.OooO0o(bitmapPut);
                            }
                            break;
                        }
                        int i = oo00oo0.f39792OooO0O0;
                        while (true) {
                            synchronized (oo00oo0) {
                                if (oo00oo0.f39793OooO0OO < 0 || (oo00oo0.f39791OooO00o.isEmpty() && oo00oo0.f39793OooO0OO != 0)) {
                                    throw new IllegalStateException(oO00Oo0.class.getName() + ".sizeOf() is reporting inconsistent results!");
                                }
                                if (oo00oo0.f39793OooO0OO > i && !oo00oo0.f39791OooO00o.isEmpty()) {
                                    Map.Entry<String, Bitmap> next = oo00oo0.f39791OooO00o.entrySet().iterator().next();
                                    String key = next.getKey();
                                    Bitmap value = next.getValue();
                                    oo00oo0.f39791OooO00o.remove(key);
                                    oo00oo0.f39793OooO0OO -= o00oO0o.OooO0o(value);
                                }
                                break;
                            }
                        }
                    }
                    oooOO2.f19758OooO0Oo.remove(oooO0OO2.f19733OoooOO0);
                    oooOO2.OooO00o(oooO0OO2);
                    if (oooO0OO2.f19731OoooO00.f19824OooOOO0) {
                        o00oO0o.OooOO0("Dispatcher", "batched", o00oO0o.OooO0oO(oooO0OO2), "for completion");
                        return;
                    }
                    return;
                case 5:
                    com.squareup.picasso.OooO0OO oooO0OO3 = (com.squareup.picasso.OooO0OO) message.obj;
                    OooOO0 oooOO3 = this.f19768OooO00o;
                    Objects.requireNonNull(oooOO3);
                    Future<?> future = oooO0OO3.f19740Ooooo0o;
                    if (future != null && future.isCancelled()) {
                        return;
                    }
                    if (oooOO3.f19756OooO0O0.isShutdown()) {
                        oooOO3.OooO0o0(oooO0OO3, false);
                        return;
                    }
                    if (oooOO3.f19767OooOOO0) {
                        Context context = oooOO3.f19755OooO00o;
                        StringBuilder sb = o00oO0o.f19841OooO00o;
                        activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                    boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                    int i2 = oooO0OO3.f19745Oooooo0;
                    if (i2 > 0) {
                        oooO0OO3.f19745Oooooo0 = i2 - 1;
                        zOooO0oO = oooO0OO3.f19736OoooOo0.OooO0oO(activeNetworkInfo);
                    } else {
                        zOooO0oO = false;
                    }
                    o0OoOo0 o0oooo1 = oooO0OO3.f19736OoooOo0;
                    Objects.requireNonNull(o0oooo1);
                    boolean z2 = o0oooo1 instanceof OooOOOO;
                    if (!zOooO0oO) {
                        boolean z3 = oooOO3.f19767OooOOO0 && z2;
                        oooOO3.OooO0o0(oooO0OO3, z3);
                        if (z3) {
                            oooOO3.OooO0Oo(oooO0OO3);
                            return;
                        }
                        return;
                    }
                    if (oooOO3.f19767OooOOO0 && !z) {
                        oooOO3.OooO0o0(oooO0OO3, z2);
                        if (z2) {
                            oooOO3.OooO0Oo(oooO0OO3);
                            return;
                        }
                        return;
                    }
                    if (oooO0OO3.f19731OoooO00.f19824OooOOO0) {
                        o00oO0o.OooO("Dispatcher", "retrying", o00oO0o.OooO0oO(oooO0OO3));
                    }
                    if (oooO0OO3.f19742OooooOO instanceof OooOOOO.OooO00o) {
                        oooO0OO3.f19735OoooOOo |= NetworkPolicy.NO_CACHE.index;
                    }
                    oooO0OO3.f19740Ooooo0o = oooOO3.f19756OooO0O0.submit(oooO0OO3);
                    return;
                case 6:
                    this.f19768OooO00o.OooO0o0((com.squareup.picasso.OooO0OO) message.obj, false);
                    return;
                case 7:
                    OooOO0 oooOO4 = this.f19768OooO00o;
                    Objects.requireNonNull(oooOO4);
                    ArrayList<com.squareup.picasso.OooO0OO> arrayList2 = new ArrayList(oooOO4.f19765OooOO0o);
                    oooOO4.f19765OooOO0o.clear();
                    Handler handler = oooOO4.f19754OooO;
                    handler.sendMessage(handler.obtainMessage(8, arrayList2));
                    if (!arrayList2.isEmpty() && ((com.squareup.picasso.OooO0OO) arrayList2.get(0)).f19731OoooO00.f19824OooOOO0) {
                        StringBuilder sb2 = new StringBuilder();
                        for (com.squareup.picasso.OooO0OO oooO0OO4 : arrayList2) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(o00oO0o.OooO0oO(oooO0OO4));
                        }
                        o00oO0o.OooO("Dispatcher", "delivered", sb2.toString());
                        return;
                    }
                    return;
                case 9:
                    NetworkInfo networkInfo = (NetworkInfo) message.obj;
                    OooOO0 oooOO5 = this.f19768OooO00o;
                    ExecutorService executorService = oooOO5.f19756OooO0O0;
                    if (executorService instanceof Oooo000) {
                        Oooo000 oooo000 = (Oooo000) executorService;
                        Objects.requireNonNull(oooo000);
                        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                            int type = networkInfo.getType();
                            if (type == 0) {
                                int subtype = networkInfo.getSubtype();
                                switch (subtype) {
                                    case 1:
                                    case 2:
                                        oooo000.OooO00o(1);
                                        break;
                                    default:
                                        switch (subtype) {
                                            case 12:
                                                break;
                                            case 13:
                                            case 14:
                                            case 15:
                                                oooo000.OooO00o(3);
                                                break;
                                            default:
                                                oooo000.OooO00o(3);
                                                break;
                                        }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                        oooo000.OooO00o(2);
                                        break;
                                }
                            } else if (type == 1 || type == 6 || type == 9) {
                                oooo000.OooO00o(4);
                            } else {
                                oooo000.OooO00o(3);
                            }
                        } else {
                            oooo000.OooO00o(3);
                        }
                    }
                    if (networkInfo == null || !networkInfo.isConnected() || oooOO5.f19760OooO0o0.isEmpty()) {
                        return;
                    }
                    Iterator it = oooOO5.f19760OooO0o0.values().iterator();
                    while (it.hasNext()) {
                        com.squareup.picasso.OooO00o oooO00o3 = (com.squareup.picasso.OooO00o) it.next();
                        it.remove();
                        if (oooO00o3.f19711OooO00o.f19824OooOOO0) {
                            o00oO0o.OooO("Dispatcher", "replaying", oooO00o3.f19712OooO0O0.OooO0O0());
                        }
                        oooOO5.OooO0o(oooO00o3, false);
                    }
                    return;
                case 10:
                    this.f19768OooO00o.f19766OooOOO = message.arg1 == 1;
                    return;
                case 11:
                    Object obj = message.obj;
                    OooOO0 oooOO6 = this.f19768OooO00o;
                    if (oooOO6.f19761OooO0oO.add(obj)) {
                        Iterator it2 = oooOO6.f19758OooO0Oo.values().iterator();
                        while (it2.hasNext()) {
                            com.squareup.picasso.OooO0OO oooO0OO5 = (com.squareup.picasso.OooO0OO) it2.next();
                            boolean z4 = oooO0OO5.f19731OoooO00.f19824OooOOO0;
                            com.squareup.picasso.OooO00o oooO00o4 = oooO0OO5.f19737OoooOoO;
                            ?? r9 = oooO0OO5.f19738OoooOoo;
                            boolean z5 = (r9 == 0 || r9.isEmpty()) ? false : true;
                            if (oooO00o4 != null || z5) {
                                if (oooO00o4 != null && oooO00o4.f19719OooOO0.equals(obj)) {
                                    oooO0OO5.OooO0Oo(oooO00o4);
                                    oooOO6.f19759OooO0o.put(oooO00o4.OooO0Oo(), oooO00o4);
                                    if (z4) {
                                        o00oO0o.OooOO0("Dispatcher", "paused", oooO00o4.f19712OooO0O0.OooO0O0(), "because tag '" + obj + "' was paused");
                                    }
                                }
                                if (z5) {
                                    for (int size = r9.size() - 1; size >= 0; size--) {
                                        com.squareup.picasso.OooO00o oooO00o5 = (com.squareup.picasso.OooO00o) r9.get(size);
                                        if (oooO00o5.f19719OooOO0.equals(obj)) {
                                            oooO0OO5.OooO0Oo(oooO00o5);
                                            oooOO6.f19759OooO0o.put(oooO00o5.OooO0Oo(), oooO00o5);
                                            if (z4) {
                                                o00oO0o.OooOO0("Dispatcher", "paused", oooO00o5.f19712OooO0O0.OooO0O0(), "because tag '" + obj + "' was paused");
                                            }
                                        }
                                    }
                                }
                                if (oooO0OO5.OooO0O0()) {
                                    it2.remove();
                                    if (z4) {
                                        o00oO0o.OooOO0("Dispatcher", "canceled", o00oO0o.OooO0oO(oooO0OO5), "all actions paused");
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    OooOO0 oooOO7 = this.f19768OooO00o;
                    if (oooOO7.f19761OooO0oO.remove(obj2)) {
                        Iterator it3 = oooOO7.f19759OooO0o.values().iterator();
                        while (it3.hasNext()) {
                            com.squareup.picasso.OooO00o oooO00o6 = (com.squareup.picasso.OooO00o) it3.next();
                            if (oooO00o6.f19719OooOO0.equals(obj2)) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(oooO00o6);
                                it3.remove();
                            }
                        }
                        if (arrayList != null) {
                            Handler handler2 = oooOO7.f19754OooO;
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
        public final OooOO0 f19770OooO00o;

        public OooO0OO(OooOO0 oooOO1) {
            this.f19770OooO00o = oooOO1;
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
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra(ServerProtocol.DIALOG_PARAM_STATE)) {
                    OooOO0 oooOO1 = this.f19770OooO00o;
                    boolean booleanExtra = intent.getBooleanExtra(ServerProtocol.DIALOG_PARAM_STATE, false);
                    OooO00o oooO00o = oooOO1.f19762OooO0oo;
                    oooO00o.sendMessage(oooO00o.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    return;
                }
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb = o00oO0o.f19841OooO00o;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                OooOO0 oooOO2 = this.f19770OooO00o;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                OooO00o oooO00o2 = oooOO2.f19762OooO0oo;
                oooO00o2.sendMessage(oooO00o2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    public OooOO0(Context context, ExecutorService executorService, Handler handler, Downloader downloader, oO00OOOo oo00oooo, oO00o000 oo00o000) {
        boolean z;
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.start();
        Looper looper = oooO0O0.getLooper();
        StringBuilder sb = o00oO0o.f19841OooO00o;
        oO00o00O oo00o00o = new oO00o00O(looper);
        oo00o00o.sendMessageDelayed(oo00o00o.obtainMessage(), 1000L);
        this.f19755OooO00o = context;
        this.f19756OooO0O0 = executorService;
        this.f19758OooO0Oo = new LinkedHashMap();
        this.f19760OooO0o0 = new WeakHashMap();
        this.f19759OooO0o = new WeakHashMap();
        this.f19761OooO0oO = new HashSet();
        this.f19762OooO0oo = new OooO00o(oooO0O0.getLooper(), this);
        this.f19757OooO0OO = downloader;
        this.f19754OooO = handler;
        this.f19763OooOO0 = oo00oooo;
        this.f19764OooOO0O = oo00o000;
        this.f19765OooOO0o = new ArrayList(4);
        try {
            z = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
        }
        this.f19766OooOOO = z;
        this.f19767OooOOO0 = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        OooO0OO oooO0OO = new OooO0OO(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (oooO0OO.f19770OooO00o.f19767OooOOO0) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        oooO0OO.f19770OooO00o.f19755OooO00o.registerReceiver(oooO0OO, intentFilter);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO0OO>] */
    public final void OooO00o(com.squareup.picasso.OooO0OO oooO0OO) {
        Future<?> future = oooO0OO.f19740Ooooo0o;
        if (future != null && future.isCancelled()) {
            return;
        }
        this.f19765OooOO0o.add(oooO0OO);
        if (this.f19762OooO0oo.hasMessages(7)) {
            return;
        }
        this.f19762OooO0oo.sendEmptyMessageDelayed(7, 200L);
    }

    public final void OooO0O0(com.squareup.picasso.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f19762OooO0oo;
        oooO00o.sendMessage(oooO00o.obtainMessage(4, oooO0OO));
    }

    public final void OooO0OO(com.squareup.picasso.OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f19762OooO0oo;
        oooO00o.sendMessage(oooO00o.obtainMessage(6, oooO0OO));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    public final void OooO0Oo(com.squareup.picasso.OooO0OO oooO0OO) {
        Object objOooO0Oo;
        com.squareup.picasso.OooO00o oooO00o = oooO0OO.f19737OoooOoO;
        if (oooO00o != null && (objOooO0Oo = oooO00o.OooO0Oo()) != null) {
            oooO00o.f19720OooOO0O = true;
            this.f19760OooO0o0.put(objOooO0Oo, oooO00o);
        }
        ?? r7 = oooO0OO.f19738OoooOoo;
        if (r7 != 0) {
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                com.squareup.picasso.OooO00o oooO00o2 = (com.squareup.picasso.OooO00o) r7.get(i);
                Object objOooO0Oo2 = oooO00o2.OooO0Oo();
                if (objOooO0Oo2 != null) {
                    oooO00o2.f19720OooOO0O = true;
                    this.f19760OooO0o0.put(objOooO0Oo2, oooO00o2);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, com.squareup.picasso.OooO0OO>] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map<java.lang.Object, com.squareup.picasso.OooO00o>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    public final void OooO0o(com.squareup.picasso.OooO00o oooO00o, boolean z) {
        com.squareup.picasso.OooO0OO oooO0OO;
        if (this.f19761OooO0oO.contains(oooO00o.f19719OooOO0)) {
            this.f19759OooO0o.put(oooO00o.OooO0Oo(), oooO00o);
            if (oooO00o.f19711OooO00o.f19824OooOOO0) {
                String strOooO0O0 = oooO00o.f19712OooO0O0.OooO0O0();
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("because tag '");
                sbOooO0O0.append(oooO00o.f19719OooOO0);
                sbOooO0O0.append("' is paused");
                o00oO0o.OooOO0("Dispatcher", "paused", strOooO0O0, sbOooO0O0.toString());
                return;
            }
            return;
        }
        com.squareup.picasso.OooO0OO oooO0OO2 = (com.squareup.picasso.OooO0OO) this.f19758OooO0Oo.get(oooO00o.f19710OooO);
        if (oooO0OO2 != null) {
            boolean z2 = oooO0OO2.f19731OoooO00.f19824OooOOO0;
            Oooo0 oooo0 = oooO00o.f19712OooO0O0;
            if (oooO0OO2.f19737OoooOoO == null) {
                oooO0OO2.f19737OoooOoO = oooO00o;
                if (z2) {
                    ?? r11 = oooO0OO2.f19738OoooOoo;
                    if (r11 == 0 || r11.isEmpty()) {
                        o00oO0o.OooOO0("Hunter", "joined", oooo0.OooO0O0(), "to empty hunter");
                        return;
                    } else {
                        o00oO0o.OooOO0("Hunter", "joined", oooo0.OooO0O0(), o00oO0o.OooO0oo(oooO0OO2, "to "));
                        return;
                    }
                }
                return;
            }
            if (oooO0OO2.f19738OoooOoo == null) {
                oooO0OO2.f19738OoooOoo = new ArrayList(3);
            }
            oooO0OO2.f19738OoooOoo.add(oooO00o);
            if (z2) {
                o00oO0o.OooOO0("Hunter", "joined", oooo0.OooO0O0(), o00oO0o.OooO0oo(oooO0OO2, "to "));
            }
            Picasso.Priority priority = oooO00o.f19712OooO0O0.f19801OooOOo0;
            if (priority.ordinal() > oooO0OO2.f19744Oooooo.ordinal()) {
                oooO0OO2.f19744Oooooo = priority;
                return;
            }
            return;
        }
        if (this.f19756OooO0O0.isShutdown()) {
            if (oooO00o.f19711OooO00o.f19824OooOOO0) {
                o00oO0o.OooOO0("Dispatcher", "ignored", oooO00o.f19712OooO0O0.OooO0O0(), "because shut down");
                return;
            }
            return;
        }
        Picasso picasso = oooO00o.f19711OooO00o;
        oO00OOOo oo00oooo = this.f19763OooOO0;
        oO00o000 oo00o000 = this.f19764OooOO0O;
        Object obj = com.squareup.picasso.OooO0OO.f19724OoooooO;
        Oooo0 oooo1 = oooO00o.f19712OooO0O0;
        List<o0OoOo0> list = picasso.f19815OooO0OO;
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                oooO0OO = new com.squareup.picasso.OooO0OO(picasso, this, oo00oooo, oo00o000, oooO00o, com.squareup.picasso.OooO0OO.f19727ooOO);
                break;
            }
            o0OoOo0 o0oooo1 = list.get(i);
            if (o0oooo1.OooO0OO(oooo1)) {
                oooO0OO = new com.squareup.picasso.OooO0OO(picasso, this, oo00oooo, oo00o000, oooO00o, o0oooo1);
                break;
            }
            i++;
        }
        oooO0OO.f19740Ooooo0o = this.f19756OooO0O0.submit(oooO0OO);
        this.f19758OooO0Oo.put(oooO00o.f19710OooO, oooO0OO);
        if (z) {
            this.f19760OooO0o0.remove(oooO00o.OooO0Oo());
        }
        if (oooO00o.f19711OooO00o.f19824OooOOO0) {
            o00oO0o.OooO("Dispatcher", "enqueued", oooO00o.f19712OooO0O0.OooO0O0());
        }
    }

    public final void OooO0o0(com.squareup.picasso.OooO0OO oooO0OO, boolean z) {
        if (oooO0OO.f19731OoooO00.f19824OooOOO0) {
            String strOooO0oO = o00oO0o.OooO0oO(oooO0OO);
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("for error");
            sbOooO0O0.append(z ? " (will replay)" : "");
            o00oO0o.OooOO0("Dispatcher", "batched", strOooO0oO, sbOooO0O0.toString());
        }
        this.f19758OooO0Oo.remove(oooO0OO.f19733OoooOO0);
        OooO00o(oooO0OO);
    }
}
