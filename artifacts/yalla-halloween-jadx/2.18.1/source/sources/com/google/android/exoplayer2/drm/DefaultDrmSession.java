package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p036OoooOOO.o000000;
import p301o0O0Oooo.o000OOo0;
import p310o0O0o0oo.o00O0000;
import p318o0O0oOo.o0000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p709oo0oOOo.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> f13650OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f13651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO f13652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f13653OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f13654OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f13655OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f13656OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f13657OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, String> f13658OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Oooo000 f13659OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOO0 f13660OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final UUID f13661OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13662OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO f13663OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f13664OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public HandlerThread f13665OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o000OOo0 f13666OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO0OO f13667OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f13668OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public byte[] f13669OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public byte[] f13670OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.OooO.OooO00o f13671OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.OooO.OooO0o f13672OooOo0o;

    @SuppressLint({"HandlerLeak"})
    public class OooO extends Handler {
        public OooO(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set;
            Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f13672OooOo0o) {
                    if (defaultDrmSession.f13662OooOOO == 2 || defaultDrmSession.OooO0oO()) {
                        defaultDrmSession.f13672OooOo0o = null;
                        if (obj2 instanceof Exception) {
                            ((DefaultDrmSessionManager.OooO0o) defaultDrmSession.f13653OooO0OO).OooO00o((Exception) obj2);
                            return;
                        }
                        try {
                            defaultDrmSession.f13652OooO0O0.OooOO0((byte[]) obj2);
                            DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) defaultDrmSession.f13653OooO0OO;
                            for (DefaultDrmSession defaultDrmSession2 : DefaultDrmSessionManager.this.f13690OooOOO) {
                                if (defaultDrmSession2.OooOO0(false)) {
                                    defaultDrmSession2.OooO0o(true);
                                }
                            }
                            DefaultDrmSessionManager.this.f13690OooOOO.clear();
                            return;
                        } catch (Exception e) {
                            ((DefaultDrmSessionManager.OooO0o) defaultDrmSession.f13653OooO0OO).OooO00o(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
            if (obj == defaultDrmSession3.f13671OooOo0O && defaultDrmSession3.OooO0oO()) {
                defaultDrmSession3.f13671OooOo0O = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession3.OooO((Exception) obj2);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession3.f13656OooO0o0 == 3) {
                        com.google.android.exoplayer2.drm.OooO oooO = defaultDrmSession3.f13652OooO0O0;
                        byte[] bArr2 = defaultDrmSession3.f13669OooOo0;
                        int i2 = p318o0O0oOo.o000OOo0.f36740OooO00o;
                        oooO.OooO(bArr2, bArr);
                        o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = defaultDrmSession3.f13650OooO;
                        synchronized (o0000Var.f36665Oooo0o) {
                            set2 = o0000Var.f36667Oooo0oo;
                        }
                        Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().OooO0O0();
                        }
                        return;
                    }
                    byte[] bArrOooO = defaultDrmSession3.f13652OooO0O0.OooO(defaultDrmSession3.f13670OooOo00, bArr);
                    int i3 = defaultDrmSession3.f13656OooO0o0;
                    if ((i3 == 2 || (i3 == 0 && defaultDrmSession3.f13669OooOo0 != null)) && bArrOooO != null && bArrOooO.length != 0) {
                        defaultDrmSession3.f13669OooOo0 = bArrOooO;
                    }
                    defaultDrmSession3.f13662OooOOO = 4;
                    o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var2 = defaultDrmSession3.f13650OooO;
                    synchronized (o0000Var2.f36665Oooo0o) {
                        set = o0000Var2.f36667Oooo0oo;
                    }
                    Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it2 = set.iterator();
                    while (it2.hasNext()) {
                        it2.next().OooO00o();
                    }
                    return;
                } catch (Exception e2) {
                    defaultDrmSession3.OooO(e2);
                }
                defaultDrmSession3.OooO(e2);
            }
        }
    }

    public interface OooO00o {
    }

    public interface OooO0O0 {
    }

    @SuppressLint({"HandlerLeak"})
    public class OooO0OO extends Handler {
        public OooO0OO(Looper looper) {
            super(looper);
        }

        public final void OooO00o(int i, Object obj, boolean z) {
            obtainMessage(i, new OooO0o(o00O0000.f36320OooO0OO.getAndIncrement(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objOooO0OO;
            OooO0o oooO0o = (OooO0o) message.obj;
            boolean z = true;
            try {
                int i = message.what;
                if (i == 0) {
                    objOooO0OO = ((OooOO0O) DefaultDrmSession.this.f13660OooOO0O).OooO0OO((com.google.android.exoplayer2.drm.OooO.OooO0o) oooO0o.f13677OooO0OO);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objOooO0OO = ((OooOO0O) defaultDrmSession.f13660OooOO0O).OooO00o(defaultDrmSession.f13661OooOO0o, (com.google.android.exoplayer2.drm.OooO.OooO00o) oooO0o.f13677OooO0OO);
                }
            } catch (MediaDrmCallbackException e) {
                OooO0o oooO0o2 = (OooO0o) message.obj;
                if (oooO0o2.f13676OooO0O0) {
                    int i2 = oooO0o2.f13678OooO0Oo + 1;
                    oooO0o2.f13678OooO0Oo = i2;
                    if (i2 > ((com.google.android.exoplayer2.upstream.OooOO0) DefaultDrmSession.this.f13659OooOO0).OooO00o(3)) {
                        z = false;
                    } else {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        Throwable unexpectedDrmSessionException = e.getCause() instanceof IOException ? (IOException) e.getCause() : new UnexpectedDrmSessionException(e.getCause());
                        Oooo000 oooo000 = DefaultDrmSession.this.f13659OooOO0;
                        long jMin = ((unexpectedDrmSessionException instanceof ParserException) || (unexpectedDrmSessionException instanceof FileNotFoundException) || (unexpectedDrmSessionException instanceof Loader.UnexpectedLoaderException)) ? -9223372036854775807L : Math.min((oooO0o2.f13678OooO0Oo - 1) * 1000, 5000);
                        if (jMin == -9223372036854775807L) {
                            z = false;
                        } else {
                            sendMessageDelayed(Message.obtain(message), jMin);
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return;
                } else {
                    objOooO0OO = e;
                }
            } catch (Exception e2) {
                o0000oo.OooO0OO("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objOooO0OO = e2;
            }
            Oooo000 oooo001 = DefaultDrmSession.this.f13659OooOO0;
            long j = oooO0o.f13675OooO00o;
            Objects.requireNonNull(oooo001);
            DefaultDrmSession.this.f13663OooOOO0.obtainMessage(message.what, Pair.create(oooO0o.f13677OooO0OO, objOooO0OO)).sendToTarget();
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f13676OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f13677OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13678OooO0Oo;

        public OooO0o(long j, boolean z, long j2, Object obj) {
            this.f13675OooO00o = j;
            this.f13676OooO0O0 = z;
            this.f13677OooO0OO = obj;
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, com.google.android.exoplayer2.drm.OooO oooO, OooO00o oooO00o, OooO0O0 oooO0O0, @Nullable List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> map, OooOOO0 oooOOO0, Looper looper, Oooo000 oooo000) {
        if (i == 1 || i == 3) {
            Objects.requireNonNull(bArr);
        }
        this.f13661OooOO0o = uuid;
        this.f13653OooO0OO = oooO00o;
        this.f13654OooO0Oo = oooO0O0;
        this.f13652OooO0O0 = oooO;
        this.f13656OooO0o0 = i;
        this.f13655OooO0o = z;
        this.f13657OooO0oO = z2;
        if (bArr != null) {
            this.f13669OooOo0 = bArr;
            this.f13651OooO00o = null;
        } else {
            Objects.requireNonNull(list);
            this.f13651OooO00o = Collections.unmodifiableList(list);
        }
        this.f13658OooO0oo = map;
        this.f13660OooOO0O = oooOOO0;
        this.f13650OooO = new o0000<>();
        this.f13659OooOO0 = oooo000;
        this.f13662OooOOO = 2;
        this.f13663OooOOO0 = new OooO(looper);
    }

    public final void OooO(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            ((DefaultDrmSessionManager.OooO0o) this.f13653OooO0OO).OooO0O0(this);
        } else {
            OooO0oo(exc);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO00o(@Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o) {
        o00000O0.OooO0Oo(this.f13664OooOOOO >= 0);
        if (c0097OooO00o != null) {
            o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = this.f13650OooO;
            synchronized (o0000Var.f36665Oooo0o) {
                ArrayList arrayList = new ArrayList(o0000Var.f36664Oooo);
                arrayList.add(c0097OooO00o);
                o0000Var.f36664Oooo = Collections.unmodifiableList(arrayList);
                Integer num = o0000Var.f36666Oooo0oO.get(c0097OooO00o);
                if (num == null) {
                    HashSet hashSet = new HashSet(o0000Var.f36667Oooo0oo);
                    hashSet.add(c0097OooO00o);
                    o0000Var.f36667Oooo0oo = Collections.unmodifiableSet(hashSet);
                }
                o0000Var.f36666Oooo0oO.put((E) c0097OooO00o, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.f13664OooOOOO + 1;
        this.f13664OooOOOO = i;
        if (i == 1) {
            o00000O0.OooO0Oo(this.f13662OooOOO == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f13665OooOOOo = handlerThread;
            handlerThread.start();
            this.f13667OooOOo0 = new OooO0OO(this.f13665OooOOOo.getLooper());
            if (OooOO0(true)) {
                OooO0o(true);
            }
        } else if (c0097OooO00o != null && OooO0oO()) {
            c0097OooO00o.OooO0Oo();
        }
        DefaultDrmSessionManager.OooO oooO = (DefaultDrmSessionManager.OooO) this.f13654OooO0Oo;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f13689OooOO0o != -9223372036854775807L) {
            defaultDrmSessionManager.f13692OooOOOO.remove(this);
            Handler handler = DefaultDrmSessionManager.this.f13698OooOo0;
            Objects.requireNonNull(handler);
            handler.removeCallbacksAndMessages(this);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO0O0(@Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o) {
        Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set;
        o00000O0.OooO0Oo(this.f13664OooOOOO > 0);
        int i = this.f13664OooOOOO - 1;
        this.f13664OooOOOO = i;
        if (i == 0) {
            this.f13662OooOOO = 0;
            OooO oooO = this.f13663OooOOO0;
            int i2 = p318o0O0oOo.o000OOo0.f36740OooO00o;
            oooO.removeCallbacksAndMessages(null);
            this.f13667OooOOo0.removeCallbacksAndMessages(null);
            this.f13667OooOOo0 = null;
            this.f13665OooOOOo.quit();
            this.f13665OooOOOo = null;
            this.f13666OooOOo = null;
            this.f13668OooOOoo = null;
            this.f13671OooOo0O = null;
            this.f13672OooOo0o = null;
            byte[] bArr = this.f13670OooOo00;
            if (bArr != null) {
                this.f13652OooO0O0.OooO0oO(bArr);
                this.f13670OooOo00 = null;
            }
            o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = this.f13650OooO;
            synchronized (o0000Var.f36665Oooo0o) {
                set = o0000Var.f36667Oooo0oo;
            }
            Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it = set.iterator();
            while (it.hasNext()) {
                it.next().OooO0o();
            }
        }
        if (c0097OooO00o != null) {
            if (OooO0oO()) {
                c0097OooO00o.OooO0o();
            }
            o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var2 = this.f13650OooO;
            synchronized (o0000Var2.f36665Oooo0o) {
                Integer num = o0000Var2.f36666Oooo0oO.get(c0097OooO00o);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(o0000Var2.f36664Oooo);
                    arrayList.remove(c0097OooO00o);
                    o0000Var2.f36664Oooo = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        o0000Var2.f36666Oooo0oO.remove(c0097OooO00o);
                        HashSet hashSet = new HashSet(o0000Var2.f36667Oooo0oo);
                        hashSet.remove(c0097OooO00o);
                        o0000Var2.f36667Oooo0oo = Collections.unmodifiableSet(hashSet);
                    } else {
                        o0000Var2.f36666Oooo0oO.put((E) c0097OooO00o, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
        }
        OooO0O0 oooO0O0 = this.f13654OooO0Oo;
        int i3 = this.f13664OooOOOO;
        DefaultDrmSessionManager.OooO oooO2 = (DefaultDrmSessionManager.OooO) oooO0O0;
        Objects.requireNonNull(oooO2);
        if (i3 == 1) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f13689OooOO0o != -9223372036854775807L) {
                defaultDrmSessionManager.f13692OooOOOO.add(this);
                Handler handler = DefaultDrmSessionManager.this.f13698OooOo0;
                Objects.requireNonNull(handler);
                handler.postAtTime(new OooOO0.OooO(this, 2), this, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f13689OooOO0o);
                return;
            }
        }
        if (i3 == 0) {
            DefaultDrmSessionManager.this.f13691OooOOO0.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager2 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager2.f13694OooOOo == this) {
                defaultDrmSessionManager2.f13694OooOOo = null;
            }
            if (defaultDrmSessionManager2.f13696OooOOoo == this) {
                defaultDrmSessionManager2.f13696OooOOoo = null;
            }
            if (defaultDrmSessionManager2.f13690OooOOO.size() > 1 && DefaultDrmSessionManager.this.f13690OooOOO.get(0) == this) {
                DefaultDrmSessionManager.this.f13690OooOOO.get(1).OooOO0o();
            }
            DefaultDrmSessionManager.this.f13690OooOOO.remove(this);
            DefaultDrmSessionManager defaultDrmSessionManager3 = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager3.f13689OooOO0o != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager3.f13698OooOo0;
                Objects.requireNonNull(handler2);
                handler2.removeCallbacksAndMessages(this);
                DefaultDrmSessionManager.this.f13692OooOOOO.remove(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0OO() {
        return this.f13655OooO0o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final o000OOo0 OooO0Oo() {
        return this.f13666OooOOo;
    }

    @RequiresNonNull({"sessionId"})
    public final void OooO0o(boolean z) {
        long jMin;
        Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set;
        if (this.f13657OooO0oO) {
            return;
        }
        byte[] bArr = this.f13670OooOo00;
        int i = p318o0O0oOo.o000OOo0.f36740OooO00o;
        int i2 = this.f13656OooO0o0;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.f13669OooOo0 == null || OooOOO()) {
                    OooOO0O(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            Objects.requireNonNull(this.f13669OooOo0);
            Objects.requireNonNull(this.f13670OooOo00);
            if (OooOOO()) {
                OooOO0O(this.f13669OooOo0, 3, z);
                return;
            }
            return;
        }
        if (this.f13669OooOo0 == null) {
            OooOO0O(bArr, 1, z);
            return;
        }
        if (this.f13662OooOOO == 4 || OooOOO()) {
            if (C.f13108OooO0Oo.equals(this.f13661OooOO0o)) {
                Map<String, String> mapOooOOO0 = OooOOO0();
                Pair pair = mapOooOOO0 == null ? null : new Pair(Long.valueOf(o000000.OooO0oo(mapOooOOO0, "LicenseDurationRemaining")), Long.valueOf(o000000.OooO0oo(mapOooOOO0, "PlaybackDurationRemaining")));
                Objects.requireNonNull(pair);
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (this.f13656OooO0o0 == 0 && jMin <= 60) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                sb.append(jMin);
                Log.d("DefaultDrmSession", sb.toString());
                OooOO0O(bArr, 2, z);
                return;
            }
            if (jMin <= 0) {
                OooO0oo(new KeysExpiredException());
                return;
            }
            this.f13662OooOOO = 4;
            o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = this.f13650OooO;
            synchronized (o0000Var.f36665Oooo0o) {
                set = o0000Var.f36667Oooo0oo;
            }
            Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it = set.iterator();
            while (it.hasNext()) {
                it.next().OooO0OO();
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException OooO0o0() {
        if (this.f13662OooOOO == 1) {
            return this.f13668OooOOoo;
        }
        return null;
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooO0oO() {
        int i = this.f13662OooOOO;
        return i == 3 || i == 4;
    }

    public final void OooO0oo(Exception exc) {
        Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set;
        this.f13668OooOOoo = new DrmSession.DrmSessionException(exc);
        o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = this.f13650OooO;
        synchronized (o0000Var.f36665Oooo0o) {
            set = o0000Var.f36667Oooo0oo;
        }
        Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it = set.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0(exc);
        }
        if (this.f13662OooOOO != 4) {
            this.f13662OooOOO = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooOO0(boolean z) {
        Set<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> set;
        if (OooO0oO()) {
            return true;
        }
        try {
            byte[] bArrOooO0o0 = this.f13652OooO0O0.OooO0o0();
            this.f13670OooOo00 = bArrOooO0o0;
            this.f13666OooOOo = this.f13652OooO0O0.OooO0OO(bArrOooO0o0);
            o0000<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> o0000Var = this.f13650OooO;
            synchronized (o0000Var.f36665Oooo0o) {
                set = o0000Var.f36667Oooo0oo;
            }
            Iterator<com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o> it = set.iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo();
            }
            this.f13662OooOOO = 3;
            Objects.requireNonNull(this.f13670OooOo00);
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                ((DefaultDrmSessionManager.OooO0o) this.f13653OooO0OO).OooO0O0(this);
                return false;
            }
            OooO0oo(e);
            return false;
        } catch (Exception e2) {
            OooO0oo(e2);
            return false;
        }
    }

    public final void OooOO0O(byte[] bArr, int i, boolean z) {
        try {
            com.google.android.exoplayer2.drm.OooO.OooO00o oooO00oOooOO0O = this.f13652OooO0O0.OooOO0O(bArr, this.f13651OooO00o, i, this.f13658OooO0oo);
            this.f13671OooOo0O = oooO00oOooOO0O;
            OooO0OO oooO0OO = this.f13667OooOOo0;
            int i2 = p318o0O0oOo.o000OOo0.f36740OooO00o;
            Objects.requireNonNull(oooO00oOooOO0O);
            oooO0OO.OooO00o(1, oooO00oOooOO0O, z);
        } catch (Exception e) {
            OooO(e);
        }
    }

    public final void OooOO0o() {
        com.google.android.exoplayer2.drm.OooO.OooO0o oooO0oOooO0Oo = this.f13652OooO0O0.OooO0Oo();
        this.f13672OooOo0o = oooO0oOooO0Oo;
        OooO0OO oooO0OO = this.f13667OooOOo0;
        int i = p318o0O0oOo.o000OOo0.f36740OooO00o;
        Objects.requireNonNull(oooO0oOooO0Oo);
        oooO0OO.OooO00o(0, oooO0oOooO0Oo, true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean OooOOO() {
        try {
            this.f13652OooO0O0.OooO0o(this.f13670OooOo00, this.f13669OooOo0);
            return true;
        } catch (Exception e) {
            o0000oo.OooO0O0("DefaultDrmSession", "Error trying to restore keys.", e);
            OooO0oo(e);
            return false;
        }
    }

    @Nullable
    public final Map<String, String> OooOOO0() {
        byte[] bArr = this.f13670OooOo00;
        if (bArr == null) {
            return null;
        }
        return this.f13652OooO0O0.OooO0O0(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f13662OooOOO;
    }
}
