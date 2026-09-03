package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p200o00o0o.o0O0OOO0;
import p206o00o0oOO.o00Oo00;
import p207o00o0oOo.o0O00O;
import p207o00o0oOo.o0O00OO;
import p207o00o0oOo.o0O00OOO;
import p226o00oOo00.o0000;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O0O0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
@Deprecated
public final class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> f11685OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f11686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExoMediaDrm f11687OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f11688OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f11689OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f11690OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11691OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f11692OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, String> f11693OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f11694OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0O0OOO0 f11695OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO0 f11696OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Looper f11697OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final UUID f11698OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO f11699OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f11700OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public HandlerThread f11701OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f11702OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO0OO f11703OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm.KeyRequest f11704OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f11705OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public o00Oo00 f11706OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public byte[] f11707OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte[] f11708OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm.OooO0OO f11709OooOoO0;

    @SuppressLint({"HandlerLeak"})
    public class OooO extends Handler {
        public OooO(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> set;
            Set<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f11709OooOoO0) {
                    if (defaultDrmSession.f11700OooOOOo == 2 || defaultDrmSession.OooO0oo()) {
                        defaultDrmSession.f11709OooOoO0 = null;
                        boolean z = obj2 instanceof Exception;
                        OooO00o oooO00o = defaultDrmSession.f11688OooO0OO;
                        if (z) {
                            ((DefaultDrmSessionManager.OooO0o) oooO00o).OooO00o(false, (Exception) obj2);
                            return;
                        }
                        try {
                            defaultDrmSession.f11687OooO0O0.OooO0o0((byte[]) obj2);
                            DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) oooO00o;
                            oooO0o.f11749OooO0O0 = null;
                            HashSet hashSet = oooO0o.f11748OooO00o;
                            ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(hashSet);
                            hashSet.clear();
                            ImmutableList.OooO0O0 oooO0O0ListIterator = immutableListOooOO0O.listIterator(0);
                            while (oooO0O0ListIterator.hasNext()) {
                                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) oooO0O0ListIterator.next();
                                if (defaultDrmSession2.OooOO0O()) {
                                    defaultDrmSession2.OooO0oO(true);
                                }
                            }
                            return;
                        } catch (Exception e) {
                            ((DefaultDrmSessionManager.OooO0o) oooO00o).OooO00o(true, e);
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
            if (obj == defaultDrmSession3.f11704OooOo && defaultDrmSession3.OooO0oo()) {
                defaultDrmSession3.f11704OooOo = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession3.OooOO0(false, (Exception) obj2);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession3.f11691OooO0o0 == 3) {
                        ExoMediaDrm exoMediaDrm = defaultDrmSession3.f11687OooO0O0;
                        byte[] bArr2 = defaultDrmSession3.f11708OooOo0o;
                        int i2 = o0O00.f40595OooO00o;
                        exoMediaDrm.OooOO0(bArr2, bArr);
                        o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o0 = defaultDrmSession3.f11685OooO;
                        synchronized (o00o0o0.f40565OooO0Oo) {
                            set2 = o00o0o0.f40566OooO0o;
                        }
                        Iterator<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().OooO0O0();
                        }
                        return;
                    }
                    byte[] bArrOooOO0 = defaultDrmSession3.f11687OooO0O0.OooOO0(defaultDrmSession3.f11707OooOo0O, bArr);
                    int i3 = defaultDrmSession3.f11691OooO0o0;
                    if ((i3 == 2 || (i3 == 0 && defaultDrmSession3.f11708OooOo0o != null)) && bArrOooOO0 != null && bArrOooOO0.length != 0) {
                        defaultDrmSession3.f11708OooOo0o = bArrOooOO0;
                    }
                    defaultDrmSession3.f11700OooOOOo = 4;
                    o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o1 = defaultDrmSession3.f11685OooO;
                    synchronized (o00o0o1.f40565OooO0Oo) {
                        set = o00o0o1.f40566OooO0o;
                    }
                    Iterator<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> it2 = set.iterator();
                    while (it2.hasNext()) {
                        it2.next().OooO00o();
                    }
                    return;
                } catch (Exception e2) {
                    defaultDrmSession3.OooOO0(true, e2);
                }
                defaultDrmSession3.OooOO0(true, e2);
            }
        }
    }

    public interface OooO00o {
    }

    public interface OooO0O0 {
    }

    @SuppressLint({"HandlerLeak"})
    public class OooO0OO extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f11711OooO00o;

        public OooO0OO(Looper looper) {
            super(looper);
        }

        public final boolean OooO00o(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            OooO0o oooO0o = (OooO0o) message.obj;
            if (!oooO0o.f11714OooO0O0) {
                return false;
            }
            int i = oooO0o.f11716OooO0Oo + 1;
            oooO0o.f11716OooO0Oo = i;
            if (i > DefaultDrmSession.this.f11694OooOO0.OooO0O0(3)) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            long jOooO00o = DefaultDrmSession.this.f11694OooOO0.OooO00o(new LoadErrorHandlingPolicy.OooO0OO(mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), oooO0o.f11716OooO0Oo));
            if (jOooO00o == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f11711OooO00o) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jOooO00o);
                return true;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objOooO0OO;
            OooO0o oooO0o = (OooO0o) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objOooO0OO = ((OooOO0O) DefaultDrmSession.this.f11696OooOO0o).OooO0OO((ExoMediaDrm.OooO0OO) oooO0o.f11715OooO0OO);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objOooO0OO = ((OooOO0O) defaultDrmSession.f11696OooOO0o).OooO00o(defaultDrmSession.f11698OooOOO0, (ExoMediaDrm.KeyRequest) oooO0o.f11715OooO0OO);
                }
            } catch (MediaDrmCallbackException e) {
                boolean zOooO00o = OooO00o(message, e);
                objOooO0OO = e;
                if (zOooO00o) {
                    return;
                }
            } catch (Exception e2) {
                Log.OooO0oO("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objOooO0OO = e2;
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = DefaultDrmSession.this.f11694OooOO0;
            long j = oooO0o.f11713OooO00o;
            loadErrorHandlingPolicy.OooO0Oo();
            synchronized (this) {
                if (!this.f11711OooO00o) {
                    DefaultDrmSession.this.f11699OooOOOO.obtainMessage(message.what, Pair.create(oooO0o.f11715OooO0OO, objOooO0OO)).sendToTarget();
                }
            }
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f11713OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f11714OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f11715OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f11716OooO0Oo;

        public OooO0o(long j, boolean z, long j2, Object obj) {
            this.f11713OooO00o = j;
            this.f11714OooO0O0 = z;
            this.f11715OooO0OO = obj;
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, DefaultDrmSessionManager.OooO0o oooO0o, DefaultDrmSessionManager.OooO oooO, @Nullable List list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap map, OooOOO0 oooOOO0, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, o0O0OOO0 o0o0ooo0) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f11698OooOOO0 = uuid;
        this.f11688OooO0OO = oooO0o;
        this.f11689OooO0Oo = oooO;
        this.f11687OooO0O0 = exoMediaDrm;
        this.f11691OooO0o0 = i;
        this.f11690OooO0o = z;
        this.f11692OooO0oO = z2;
        if (bArr != null) {
            this.f11708OooOo0o = bArr;
            this.f11686OooO00o = null;
        } else {
            list.getClass();
            this.f11686OooO00o = Collections.unmodifiableList(list);
        }
        this.f11693OooO0oo = map;
        this.f11696OooOO0o = oooOOO0;
        this.f11685OooO = new o00O0O0<>();
        this.f11694OooOO0 = loadErrorHandlingPolicy;
        this.f11695OooOO0O = o0o0ooo0;
        this.f11700OooOOOo = 2;
        this.f11697OooOOO = looper;
        this.f11699OooOOOO = new OooO(looper);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void OooO(int i, Exception exc) {
        int iOooO0O0;
        Set<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> set;
        int i2 = o0O00.f40595OooO00o;
        if (i2 >= 21 && o0O00OO.OooO00o(exc)) {
            iOooO0O0 = o0O00OO.OooO0O0(exc);
        } else if (i2 >= 23 && o0O00OOO.OooO00o(exc)) {
            iOooO0O0 = 6006;
        } else if (i2 >= 18 && o0O00O.OooO0O0(exc)) {
            iOooO0O0 = 6002;
        } else if (i2 >= 18 && o0O00O.OooO00o(exc)) {
            iOooO0O0 = 6007;
        } else if (exc instanceof UnsupportedDrmException) {
            iOooO0O0 = 6001;
        } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            iOooO0O0 = 6003;
        } else if (exc instanceof KeysExpiredException) {
            iOooO0O0 = 6008;
        } else if (i == 1) {
            iOooO0O0 = 6006;
        } else if (i == 2) {
            iOooO0O0 = 6004;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            iOooO0O0 = 6002;
        }
        this.f11705OooOo0 = new DrmSession.DrmSessionException(iOooO0O0, exc);
        Log.OooO0Oo("DefaultDrmSession", "DRM session error", exc);
        o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o0 = this.f11685OooO;
        synchronized (o00o0o0.f40565OooO0Oo) {
            set = o00o0o0.f40566OooO0o;
        }
        Iterator<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> it = set.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0(exc);
        }
        if (this.f11700OooOOOo != 4) {
            this.f11700OooOOOo = 1;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO00o(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o) {
        OooOOO();
        if (this.f11702OooOOo0 < 0) {
            Log.OooO0OO("DefaultDrmSession", "Session reference count less than zero: " + this.f11702OooOOo0);
            this.f11702OooOOo0 = 0;
        }
        if (oooO00o != null) {
            o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o0 = this.f11685OooO;
            synchronized (o00o0o0.f40565OooO0Oo) {
                ArrayList arrayList = new ArrayList(o00o0o0.f40568OooO0oO);
                arrayList.add(oooO00o);
                o00o0o0.f40568OooO0oO = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) o00o0o0.f40567OooO0o0.get(oooO00o);
                if (num == null) {
                    HashSet hashSet = new HashSet(o00o0o0.f40566OooO0o);
                    hashSet.add(oooO00o);
                    o00o0o0.f40566OooO0o = Collections.unmodifiableSet(hashSet);
                }
                o00o0o0.f40567OooO0o0.put(oooO00o, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.f11702OooOOo0 + 1;
        this.f11702OooOOo0 = i;
        if (i == 1) {
            o00O000o.OooO0Oo(this.f11700OooOOOo == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f11701OooOOo = handlerThread;
            handlerThread.start();
            this.f11703OooOOoo = new OooO0OO(this.f11701OooOOo.getLooper());
            if (OooOO0O()) {
                OooO0oO(true);
            }
        } else if (oooO00o != null && OooO0oo() && this.f11685OooO.o000OOo(oooO00o) == 1) {
            oooO00o.OooO0Oo(this.f11700OooOOOo);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f11727OooOO0o != -9223372036854775807L) {
            defaultDrmSessionManager.f11730OooOOOO.remove(this);
            Handler handler = defaultDrmSessionManager.f11736OooOo0;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void OooO0O0(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o) {
        OooOOO();
        int i = this.f11702OooOOo0;
        if (i <= 0) {
            Log.OooO0OO("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f11702OooOOo0 = i2;
        if (i2 == 0) {
            this.f11700OooOOOo = 0;
            OooO oooO = this.f11699OooOOOO;
            int i3 = o0O00.f40595OooO00o;
            oooO.removeCallbacksAndMessages(null);
            OooO0OO oooO0OO = this.f11703OooOOoo;
            synchronized (oooO0OO) {
                oooO0OO.removeCallbacksAndMessages(null);
                oooO0OO.f11711OooO00o = true;
            }
            this.f11703OooOOoo = null;
            this.f11701OooOOo.quit();
            this.f11701OooOOo = null;
            this.f11706OooOo00 = null;
            this.f11705OooOo0 = null;
            this.f11704OooOo = null;
            this.f11709OooOoO0 = null;
            byte[] bArr = this.f11707OooOo0O;
            if (bArr != null) {
                this.f11687OooO0O0.OooO(bArr);
                this.f11707OooOo0O = null;
            }
        }
        if (oooO00o != null) {
            this.f11685OooO.OooO00o(oooO00o);
            if (this.f11685OooO.o000OOo(oooO00o) == 0) {
                oooO00o.OooO0o();
            }
        }
        OooO0O0 oooO0O0 = this.f11689OooO0Oo;
        int i4 = this.f11702OooOOo0;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i4 == 1 && defaultDrmSessionManager.f11731OooOOOo > 0 && defaultDrmSessionManager.f11727OooOO0o != -9223372036854775807L) {
            defaultDrmSessionManager.f11730OooOOOO.add(this);
            Handler handler = defaultDrmSessionManager.f11736OooOo0;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: o00o0oOo.o0OoOoOo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39448OooO0Oo.OooO0O0(null);
                }
            }, this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f11727OooOO0o);
        } else if (i4 == 0) {
            defaultDrmSessionManager.f11729OooOOO0.remove(this);
            if (defaultDrmSessionManager.f11732OooOOo == this) {
                defaultDrmSessionManager.f11732OooOOo = null;
            }
            if (defaultDrmSessionManager.f11734OooOOoo == this) {
                defaultDrmSessionManager.f11734OooOOoo = null;
            }
            DefaultDrmSessionManager.OooO0o oooO0o = defaultDrmSessionManager.f11717OooO;
            HashSet hashSet = oooO0o.f11748OooO00o;
            hashSet.remove(this);
            if (oooO0o.f11749OooO0O0 == this) {
                oooO0o.f11749OooO0O0 = null;
                if (!hashSet.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet.iterator().next();
                    oooO0o.f11749OooO0O0 = defaultDrmSession;
                    ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = defaultDrmSession.f11687OooO0O0.OooO0O0();
                    defaultDrmSession.f11709OooOoO0 = oooO0OOOooO0O0;
                    OooO0OO oooO0OO2 = defaultDrmSession.f11703OooOOoo;
                    int i5 = o0O00.f40595OooO00o;
                    oooO0OOOooO0O0.getClass();
                    oooO0OO2.getClass();
                    oooO0OO2.obtainMessage(0, new OooO0o(o0000.f39822OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f11727OooOO0o != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.f11736OooOo0;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f11730OooOOOO.remove(this);
            }
        }
        defaultDrmSessionManager.OooOO0O();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID OooO0OO() {
        OooOOO();
        return this.f11698OooOOO0;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0Oo() {
        OooOOO();
        return this.f11690OooO0o;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean OooO0o(String str) {
        OooOOO();
        byte[] bArr = this.f11707OooOo0O;
        o00O000o.OooO0o0(bArr);
        return this.f11687OooO0O0.OooOOO0(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final o00Oo00 OooO0o0() {
        OooOOO();
        return this.f11706OooOo00;
    }

    @RequiresNonNull({"sessionId"})
    public final void OooO0oO(boolean z) {
        long j;
        Pair pair;
        long jMin;
        Set<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> set;
        if (this.f11692OooO0oO) {
            return;
        }
        byte[] bArr = this.f11707OooOo0O;
        int i = o0O00.f40595OooO00o;
        int i2 = this.f11691OooO0o0;
        boolean z2 = false;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f11708OooOo0o.getClass();
                this.f11707OooOo0O.getClass();
                OooOO0o(this.f11708OooOo0o, 3, z);
                return;
            }
            byte[] bArr2 = this.f11708OooOo0o;
            if (bArr2 != null) {
                try {
                    this.f11687OooO0O0.OooO0Oo(bArr, bArr2);
                    z2 = true;
                } catch (Exception e) {
                    OooO(1, e);
                }
                if (!z2) {
                    return;
                }
            }
            OooOO0o(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.f11708OooOo0o;
        if (bArr3 == null) {
            OooOO0o(bArr, 1, z);
            return;
        }
        if (this.f11700OooOOOo != 4) {
            try {
                this.f11687OooO0O0.OooO0Oo(bArr, bArr3);
                z2 = true;
            } catch (Exception e2) {
                OooO(1, e2);
            }
            if (!z2) {
                return;
            }
        }
        if (C.f10899OooO0Oo.equals(this.f11698OooOOO0)) {
            Map<String, String> mapOooOOO0 = OooOOO0();
            if (mapOooOOO0 == null) {
                pair = null;
            } else {
                long j2 = -9223372036854775807L;
                try {
                    String str = mapOooOOO0.get("LicenseDurationRemaining");
                    j = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j);
                try {
                    String str2 = mapOooOOO0.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j2 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j2));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = LongCompanionObject.MAX_VALUE;
        }
        if (this.f11691OooO0o0 == 0 && jMin <= 60) {
            Log.OooO0O0("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            OooOO0o(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            OooO(2, new KeysExpiredException());
            return;
        }
        this.f11700OooOOOo = 4;
        o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o0 = this.f11685OooO;
        synchronized (o00o0o0.f40565OooO0Oo) {
            set = o00o0o0.f40566OooO0o;
        }
        Iterator<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> it = set.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO();
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooO0oo() {
        int i = this.f11700OooOOOo;
        return i == 3 || i == 4;
    }

    public final void OooOO0(boolean z, Exception exc) {
        if (!(exc instanceof NotProvisionedException)) {
            OooO(z ? 1 : 2, exc);
            return;
        }
        DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) this.f11688OooO0OO;
        oooO0o.f11748OooO00o.add(this);
        if (oooO0o.f11749OooO0O0 != null) {
            return;
        }
        oooO0o.f11749OooO0O0 = this;
        ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = this.f11687OooO0O0.OooO0O0();
        this.f11709OooOoO0 = oooO0OOOooO0O0;
        OooO0OO oooO0OO = this.f11703OooOOoo;
        int i = o0O00.f40595OooO00o;
        oooO0OOOooO0O0.getClass();
        oooO0OO.getClass();
        oooO0OO.obtainMessage(0, new OooO0o(o0000.f39822OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooOO0O() {
        Set<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> set;
        if (OooO0oo()) {
            return true;
        }
        try {
            byte[] bArrOooO0OO = this.f11687OooO0O0.OooO0OO();
            this.f11707OooOo0O = bArrOooO0OO;
            this.f11687OooO0O0.OooOO0O(bArrOooO0OO, this.f11695OooOO0O);
            this.f11706OooOo00 = this.f11687OooO0O0.OooO0oo(this.f11707OooOo0O);
            this.f11700OooOOOo = 3;
            o00O0O0<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> o00o0o0 = this.f11685OooO;
            synchronized (o00o0o0.f40565OooO0Oo) {
                set = o00o0o0.f40566OooO0o;
            }
            Iterator<com.google.android.exoplayer2.drm.OooO0O0.OooO00o> it = set.iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(3);
            }
            this.f11707OooOo0O.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) this.f11688OooO0OO;
            oooO0o.f11748OooO00o.add(this);
            if (oooO0o.f11749OooO0O0 == null) {
                oooO0o.f11749OooO0O0 = this;
                ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = this.f11687OooO0O0.OooO0O0();
                this.f11709OooOoO0 = oooO0OOOooO0O0;
                OooO0OO oooO0OO = this.f11703OooOOoo;
                int i = o0O00.f40595OooO00o;
                oooO0OOOooO0O0.getClass();
                oooO0OO.getClass();
                oooO0OO.obtainMessage(0, new OooO0o(o0000.f39822OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            OooO(1, e);
            return false;
        }
    }

    public final void OooOO0o(byte[] bArr, int i, boolean z) {
        try {
            ExoMediaDrm.KeyRequest keyRequestOooOO0o = this.f11687OooO0O0.OooOO0o(bArr, this.f11686OooO00o, i, this.f11693OooO0oo);
            this.f11704OooOo = keyRequestOooOO0o;
            OooO0OO oooO0OO = this.f11703OooOOoo;
            int i2 = o0O00.f40595OooO00o;
            keyRequestOooOO0o.getClass();
            oooO0OO.getClass();
            oooO0OO.obtainMessage(1, new OooO0o(o0000.f39822OooO0O0.getAndIncrement(), z, SystemClock.elapsedRealtime(), keyRequestOooOO0o)).sendToTarget();
        } catch (Exception e) {
            OooOO0(true, e);
        }
    }

    public final void OooOOO() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11697OooOOO;
        if (threadCurrentThread != looper.getThread()) {
            Log.OooO0oO("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Nullable
    public final Map<String, String> OooOOO0() {
        OooOOO();
        byte[] bArr = this.f11707OooOo0O;
        if (bArr == null) {
            return null;
        }
        return this.f11687OooO0O0.OooO00o(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        OooOOO();
        if (this.f11700OooOOOo == 1) {
            return this.f11705OooOo0;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        OooOOO();
        return this.f11700OooOOOo;
    }
}
