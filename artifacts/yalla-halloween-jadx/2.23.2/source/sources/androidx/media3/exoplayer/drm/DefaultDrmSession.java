package androidx.media3.exoplayer.drm;

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
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
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
import o000O.OooOo;
import o000O0.o0oOO;
import o000OO0O.OooOOO;
import o000OO0O.OooOOOO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p080o000OoO.o00;
import p080o000OoO.o000OOo;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> f7564OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f7565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExoMediaDrm f7566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f7567OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f7568OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f7569OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f7570OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f7571OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, String> f7572OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f7573OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0oOO f7574OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO0 f7575OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Looper f7576OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final UUID f7577OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooO f7578OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f7579OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public HandlerThread f7580OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f7581OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO0OO f7582OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm.KeyRequest f7583OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f7584OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public o000O00.OooO0O0 f7585OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public byte[] f7586OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte[] f7587OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm.OooO0OO f7588OooOoO0;

    @SuppressLint({"HandlerLeak"})
    public class OooO extends Handler {
        public OooO(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> set;
            Set<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f7588OooOoO0) {
                    if (defaultDrmSession.f7579OooOOOo == 2 || defaultDrmSession.OooO0oo()) {
                        defaultDrmSession.f7588OooOoO0 = null;
                        boolean z = obj2 instanceof Exception;
                        OooO00o oooO00o = defaultDrmSession.f7567OooO0OO;
                        if (z) {
                            ((DefaultDrmSessionManager.OooO0o) oooO00o).OooO00o(false, (Exception) obj2);
                            return;
                        }
                        try {
                            defaultDrmSession.f7566OooO0O0.OooO0o((byte[]) obj2);
                            DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) oooO00o;
                            oooO0o.f7628OooO0O0 = null;
                            HashSet hashSet = oooO0o.f7627OooO00o;
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
            if (obj == defaultDrmSession3.f7583OooOo && defaultDrmSession3.OooO0oo()) {
                defaultDrmSession3.f7583OooOo = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession3.OooOO0(false, (Exception) obj2);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession3.f7570OooO0o0 == 3) {
                        ExoMediaDrm exoMediaDrm = defaultDrmSession3.f7566OooO0O0;
                        byte[] bArr2 = defaultDrmSession3.f7587OooOo0o;
                        int i2 = o00.f34910OooO00o;
                        exoMediaDrm.OooOO0O(bArr2, bArr);
                        o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo2 = defaultDrmSession3.f7564OooO;
                        synchronized (o000ooo2.f34979OooO0Oo) {
                            set2 = o000ooo2.f34980OooO0o;
                        }
                        Iterator<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().OooO0O0();
                        }
                        return;
                    }
                    byte[] bArrOooOO0O = defaultDrmSession3.f7566OooO0O0.OooOO0O(defaultDrmSession3.f7586OooOo0O, bArr);
                    int i3 = defaultDrmSession3.f7570OooO0o0;
                    if ((i3 == 2 || (i3 == 0 && defaultDrmSession3.f7587OooOo0o != null)) && bArrOooOO0O != null && bArrOooOO0O.length != 0) {
                        defaultDrmSession3.f7587OooOo0o = bArrOooOO0O;
                    }
                    defaultDrmSession3.f7579OooOOOo = 4;
                    o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo3 = defaultDrmSession3.f7564OooO;
                    synchronized (o000ooo3.f34979OooO0Oo) {
                        set = o000ooo3.f34980OooO0o;
                    }
                    Iterator<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> it2 = set.iterator();
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
        public boolean f7590OooO00o;

        public OooO0OO(Looper looper) {
            super(looper);
        }

        public final boolean OooO00o(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            OooO0o oooO0o = (OooO0o) message.obj;
            if (!oooO0o.f7593OooO0O0) {
                return false;
            }
            int i = oooO0o.f7595OooO0Oo + 1;
            oooO0o.f7595OooO0Oo = i;
            if (i > DefaultDrmSession.this.f7573OooOO0.OooO0O0(3)) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            long jOooO00o = DefaultDrmSession.this.f7573OooOO0.OooO00o(new LoadErrorHandlingPolicy.OooO00o(mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), oooO0o.f7595OooO0Oo));
            if (jOooO00o == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f7590OooO00o) {
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
                    objOooO0OO = ((OooOO0O) DefaultDrmSession.this.f7575OooOO0o).OooO0OO((ExoMediaDrm.OooO0OO) oooO0o.f7594OooO0OO);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objOooO0OO = ((OooOO0O) defaultDrmSession.f7575OooOO0o).OooO00o(defaultDrmSession.f7577OooOOO0, (ExoMediaDrm.KeyRequest) oooO0o.f7594OooO0OO);
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
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = DefaultDrmSession.this.f7573OooOO0;
            long j = oooO0o.f7592OooO00o;
            loadErrorHandlingPolicy.OooO0OO();
            synchronized (this) {
                if (!this.f7590OooO00o) {
                    DefaultDrmSession.this.f7578OooOOOO.obtainMessage(message.what, Pair.create(oooO0o.f7594OooO0OO, objOooO0OO)).sendToTarget();
                }
            }
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f7592OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f7593OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f7594OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7595OooO0Oo;

        public OooO0o(long j, boolean z, long j2, Object obj) {
            this.f7592OooO00o = j;
            this.f7593OooO0O0 = z;
            this.f7594OooO0OO = obj;
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, DefaultDrmSessionManager.OooO0o oooO0o, DefaultDrmSessionManager.OooO oooO, @Nullable List list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap map, OooOOO0 oooOOO0, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, o0oOO o0ooo2) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f7577OooOOO0 = uuid;
        this.f7567OooO0OO = oooO0o;
        this.f7568OooO0Oo = oooO;
        this.f7566OooO0O0 = exoMediaDrm;
        this.f7570OooO0o0 = i;
        this.f7569OooO0o = z;
        this.f7571OooO0oO = z2;
        if (bArr != null) {
            this.f7587OooOo0o = bArr;
            this.f7565OooO00o = null;
        } else {
            list.getClass();
            this.f7565OooO00o = Collections.unmodifiableList(list);
        }
        this.f7572OooO0oo = map;
        this.f7575OooOO0o = oooOOO0;
        this.f7564OooO = new o000OOo<>();
        this.f7573OooOO0 = loadErrorHandlingPolicy;
        this.f7574OooOO0O = o0ooo2;
        this.f7579OooOOOo = 2;
        this.f7576OooOOO = looper;
        this.f7578OooOOOO = new OooO(looper);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public final void OooO(int i, Exception exc) {
        int iOooO0O0;
        Set<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> set;
        int i2 = o00.f34910OooO00o;
        if (i2 >= 21 && OooOOO.OooO00o(exc)) {
            iOooO0O0 = OooOOO.OooO0O0(exc);
        } else if (i2 >= 23 && OooOOOO.OooO00o(exc)) {
            iOooO0O0 = 6006;
        } else if (i2 >= 18 && o000OO0O.OooOOO0.OooO0O0(exc)) {
            iOooO0O0 = 6002;
        } else if (i2 >= 18 && o000OO0O.OooOOO0.OooO00o(exc)) {
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
        this.f7584OooOo0 = new DrmSession.DrmSessionException(iOooO0O0, exc);
        Log.OooO0Oo("DefaultDrmSession", "DRM session error", exc);
        o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo2 = this.f7564OooO;
        synchronized (o000ooo2.f34979OooO0Oo) {
            set = o000ooo2.f34980OooO0o;
        }
        Iterator<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> it = set.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0(exc);
        }
        if (this.f7579OooOOOo != 4) {
            this.f7579OooOOOo = 1;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID OooO00o() {
        OooOOO();
        return this.f7577OooOOO0;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean OooO0O0() {
        OooOOO();
        return this.f7569OooO0o;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final o000O00.OooO0O0 OooO0OO() {
        OooOOO();
        return this.f7585OooOo00;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void OooO0Oo(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o) {
        OooOOO();
        if (this.f7581OooOOo0 < 0) {
            Log.OooO0OO("DefaultDrmSession", "Session reference count less than zero: " + this.f7581OooOOo0);
            this.f7581OooOOo0 = 0;
        }
        if (oooO00o != null) {
            o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo2 = this.f7564OooO;
            synchronized (o000ooo2.f34979OooO0Oo) {
                ArrayList arrayList = new ArrayList(o000ooo2.f34982OooO0oO);
                arrayList.add(oooO00o);
                o000ooo2.f34982OooO0oO = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) o000ooo2.f34981OooO0o0.get(oooO00o);
                if (num == null) {
                    HashSet hashSet = new HashSet(o000ooo2.f34980OooO0o);
                    hashSet.add(oooO00o);
                    o000ooo2.f34980OooO0o = Collections.unmodifiableSet(hashSet);
                }
                o000ooo2.f34981OooO0o0.put(oooO00o, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.f7581OooOOo0 + 1;
        this.f7581OooOOo0 = i;
        if (i == 1) {
            o00Oo0.OooO0Oo(this.f7579OooOOOo == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f7580OooOOo = handlerThread;
            handlerThread.start();
            this.f7582OooOOoo = new OooO0OO(this.f7580OooOOo.getLooper());
            if (OooOO0O()) {
                OooO0oO(true);
            }
        } else if (oooO00o != null && OooO0oo() && this.f7564OooO.o000000O(oooO00o) == 1) {
            oooO00o.OooO0Oo(this.f7579OooOOOo);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f7606OooOO0o != -9223372036854775807L) {
            defaultDrmSessionManager.f7609OooOOOO.remove(this);
            Handler handler = defaultDrmSessionManager.f7615OooOo0;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean OooO0o(String str) {
        OooOOO();
        byte[] bArr = this.f7586OooOo0O;
        o00Oo0.OooO0o(bArr);
        return this.f7566OooO0O0.OooOOO0(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void OooO0o0(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o) {
        OooOOO();
        int i = this.f7581OooOOo0;
        if (i <= 0) {
            Log.OooO0OO("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f7581OooOOo0 = i2;
        if (i2 == 0) {
            this.f7579OooOOOo = 0;
            OooO oooO = this.f7578OooOOOO;
            int i3 = o00.f34910OooO00o;
            oooO.removeCallbacksAndMessages(null);
            OooO0OO oooO0OO = this.f7582OooOOoo;
            synchronized (oooO0OO) {
                oooO0OO.removeCallbacksAndMessages(null);
                oooO0OO.f7590OooO00o = true;
            }
            this.f7582OooOOoo = null;
            this.f7580OooOOo.quit();
            this.f7580OooOOo = null;
            this.f7585OooOo00 = null;
            this.f7584OooOo0 = null;
            this.f7583OooOo = null;
            this.f7588OooOoO0 = null;
            byte[] bArr = this.f7586OooOo0O;
            if (bArr != null) {
                this.f7566OooO0O0.OooOO0(bArr);
                this.f7586OooOo0O = null;
            }
        }
        if (oooO00o != null) {
            this.f7564OooO.OooO00o(oooO00o);
            if (this.f7564OooO.o000000O(oooO00o) == 0) {
                oooO00o.OooO0o();
            }
        }
        OooO0O0 oooO0O0 = this.f7568OooO0Oo;
        int i4 = this.f7581OooOOo0;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i4 == 1 && defaultDrmSessionManager.f7610OooOOOo > 0 && defaultDrmSessionManager.f7606OooOO0o != -9223372036854775807L) {
            defaultDrmSessionManager.f7609OooOOOO.add(this);
            Handler handler = defaultDrmSessionManager.f7615OooOo0;
            handler.getClass();
            handler.postAtTime(new o00000O.OooO00o(this, 1), this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f7606OooOO0o);
        } else if (i4 == 0) {
            defaultDrmSessionManager.f7608OooOOO0.remove(this);
            if (defaultDrmSessionManager.f7611OooOOo == this) {
                defaultDrmSessionManager.f7611OooOOo = null;
            }
            if (defaultDrmSessionManager.f7613OooOOoo == this) {
                defaultDrmSessionManager.f7613OooOOoo = null;
            }
            DefaultDrmSessionManager.OooO0o oooO0o = defaultDrmSessionManager.f7596OooO;
            HashSet hashSet = oooO0o.f7627OooO00o;
            hashSet.remove(this);
            if (oooO0o.f7628OooO0O0 == this) {
                oooO0o.f7628OooO0O0 = null;
                if (!hashSet.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet.iterator().next();
                    oooO0o.f7628OooO0O0 = defaultDrmSession;
                    ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = defaultDrmSession.f7566OooO0O0.OooO0O0();
                    defaultDrmSession.f7588OooOoO0 = oooO0OOOooO0O0;
                    OooO0OO oooO0OO2 = defaultDrmSession.f7582OooOOoo;
                    int i5 = o00.f34910OooO00o;
                    oooO0OOOooO0O0.getClass();
                    oooO0OO2.getClass();
                    oooO0OO2.obtainMessage(0, new OooO0o(OooOo.f33842OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f7606OooOO0o != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.f7615OooOo0;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f7609OooOOOO.remove(this);
            }
        }
        defaultDrmSessionManager.OooOO0O();
    }

    @RequiresNonNull({"sessionId"})
    public final void OooO0oO(boolean z) {
        long j;
        Pair pair;
        long jMin;
        Set<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> set;
        if (this.f7571OooO0oO) {
            return;
        }
        byte[] bArr = this.f7586OooOo0O;
        int i = o00.f34910OooO00o;
        int i2 = this.f7570OooO0o0;
        boolean z2 = false;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f7587OooOo0o.getClass();
                this.f7586OooOo0O.getClass();
                OooOO0o(this.f7587OooOo0o, 3, z);
                return;
            }
            byte[] bArr2 = this.f7587OooOo0o;
            if (bArr2 != null) {
                try {
                    this.f7566OooO0O0.OooO0Oo(bArr, bArr2);
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
        byte[] bArr3 = this.f7587OooOo0o;
        if (bArr3 == null) {
            OooOO0o(bArr, 1, z);
            return;
        }
        if (this.f7579OooOOOo != 4) {
            try {
                this.f7566OooO0O0.OooO0Oo(bArr, bArr3);
                z2 = true;
            } catch (Exception e2) {
                OooO(1, e2);
            }
            if (!z2) {
                return;
            }
        }
        if (C.f6209OooO0Oo.equals(this.f7577OooOOO0)) {
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
        if (this.f7570OooO0o0 == 0 && jMin <= 60) {
            Log.OooO0O0("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            OooOO0o(bArr, 2, z);
            return;
        }
        if (jMin <= 0) {
            OooO(2, new KeysExpiredException());
            return;
        }
        this.f7579OooOOOo = 4;
        o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo2 = this.f7564OooO;
        synchronized (o000ooo2.f34979OooO0Oo) {
            set = o000ooo2.f34980OooO0o;
        }
        Iterator<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> it = set.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO();
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooO0oo() {
        int i = this.f7579OooOOOo;
        return i == 3 || i == 4;
    }

    public final void OooOO0(boolean z, Exception exc) {
        if (!(exc instanceof NotProvisionedException)) {
            OooO(z ? 1 : 2, exc);
            return;
        }
        DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) this.f7567OooO0OO;
        oooO0o.f7627OooO00o.add(this);
        if (oooO0o.f7628OooO0O0 != null) {
            return;
        }
        oooO0o.f7628OooO0O0 = this;
        ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = this.f7566OooO0O0.OooO0O0();
        this.f7588OooOoO0 = oooO0OOOooO0O0;
        OooO0OO oooO0OO = this.f7582OooOOoo;
        int i = o00.f34910OooO00o;
        oooO0OOOooO0O0.getClass();
        oooO0OO.getClass();
        oooO0OO.obtainMessage(0, new OooO0o(OooOo.f33842OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean OooOO0O() {
        Set<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> set;
        if (OooO0oo()) {
            return true;
        }
        try {
            byte[] bArrOooO0OO = this.f7566OooO0O0.OooO0OO();
            this.f7586OooOo0O = bArrOooO0OO;
            this.f7566OooO0O0.OooO0oO(bArrOooO0OO, this.f7574OooOO0O);
            this.f7585OooOo00 = this.f7566OooO0O0.OooO(this.f7586OooOo0O);
            this.f7579OooOOOo = 3;
            o000OOo<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> o000ooo2 = this.f7564OooO;
            synchronized (o000ooo2.f34979OooO0Oo) {
                set = o000ooo2.f34980OooO0o;
            }
            Iterator<androidx.media3.exoplayer.drm.OooO0O0.OooO00o> it = set.iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(3);
            }
            this.f7586OooOo0O.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.OooO0o oooO0o = (DefaultDrmSessionManager.OooO0o) this.f7567OooO0OO;
            oooO0o.f7627OooO00o.add(this);
            if (oooO0o.f7628OooO0O0 == null) {
                oooO0o.f7628OooO0O0 = this;
                ExoMediaDrm.OooO0OO oooO0OOOooO0O0 = this.f7566OooO0O0.OooO0O0();
                this.f7588OooOoO0 = oooO0OOOooO0O0;
                OooO0OO oooO0OO = this.f7582OooOOoo;
                int i = o00.f34910OooO00o;
                oooO0OOOooO0O0.getClass();
                oooO0OO.getClass();
                oooO0OO.obtainMessage(0, new OooO0o(OooOo.f33842OooO0O0.getAndIncrement(), true, SystemClock.elapsedRealtime(), oooO0OOOooO0O0)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            OooO(1, e);
            return false;
        }
    }

    public final void OooOO0o(byte[] bArr, int i, boolean z) {
        try {
            ExoMediaDrm.KeyRequest keyRequestOooOO0o = this.f7566OooO0O0.OooOO0o(bArr, this.f7565OooO00o, i, this.f7572OooO0oo);
            this.f7583OooOo = keyRequestOooOO0o;
            OooO0OO oooO0OO = this.f7582OooOOoo;
            int i2 = o00.f34910OooO00o;
            keyRequestOooOO0o.getClass();
            oooO0OO.getClass();
            oooO0OO.obtainMessage(1, new OooO0o(OooOo.f33842OooO0O0.getAndIncrement(), z, SystemClock.elapsedRealtime(), keyRequestOooOO0o)).sendToTarget();
        } catch (Exception e) {
            OooOO0(true, e);
        }
    }

    public final void OooOOO() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7576OooOOO;
        if (threadCurrentThread != looper.getThread()) {
            Log.OooO0oO("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Nullable
    public final Map<String, String> OooOOO0() {
        OooOOO();
        byte[] bArr = this.f7586OooOo0O;
        if (bArr == null) {
            return null;
        }
        return this.f7566OooO0O0.OooO00o(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        OooOOO();
        if (this.f7579OooOOOo == 1) {
            return this.f7584OooOo0;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        OooOOO();
        return this.f7579OooOOOo;
    }
}
