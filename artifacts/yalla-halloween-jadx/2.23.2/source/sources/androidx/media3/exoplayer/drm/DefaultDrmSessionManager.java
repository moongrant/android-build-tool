package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0O00;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o000O0.o0oOO;
import o000OO0O.OooOo00;
import p039OoooOoo.o00OOO0;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
@UnstableApi
public final class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o f7596OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UUID f7597OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExoMediaDrm.OooO0O0 f7598OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f7599OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f7600OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, String> f7601OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f7602OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f7603OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f7604OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO f7605OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f7606OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Set<OooO0OO> f7607OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList f7608OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Set<DefaultDrmSession> f7609OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f7610OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f7611OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm f7612OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f7613OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0oOO f7614OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Handler f7615OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Looper f7616OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f7617OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public byte[] f7618OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public volatile OooO0O0 f7619OooOoO0;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OooO implements DefaultDrmSession.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO00o implements ExoMediaDrm.OooO00o {
        public OooO00o() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class OooO0O0 extends Handler {
        public OooO0O0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f7608OooOOO0) {
                defaultDrmSession.OooOOO();
                if (Arrays.equals(defaultDrmSession.f7586OooOo0O, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f7570OooO0o0 == 0 && defaultDrmSession.f7579OooOOOo == 4) {
                        int i = o00.f34910OooO00o;
                        defaultDrmSession.OooO0oO(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class OooO0OO implements androidx.media3.exoplayer.drm.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final androidx.media3.exoplayer.drm.OooO0O0.OooO00o f7623OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7624OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public DrmSession f7625OooO0o0;

        public OooO0OO(androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o) {
            this.f7623OooO0Oo = oooO00o;
        }

        @Override // androidx.media3.exoplayer.drm.OooO0OO.OooO0O0
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f7615OooOo0;
            handler.getClass();
            o00.Oooo0oO(handler, new Runnable() { // from class: o000OO0O.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.OooO0OO oooO0OO = this.f34407OooO0Oo;
                    if (oooO0OO.f7624OooO0o) {
                        return;
                    }
                    DrmSession drmSession = oooO0OO.f7625OooO0o0;
                    if (drmSession != null) {
                        drmSession.OooO0o0(oooO0OO.f7623OooO0Oo);
                    }
                    DefaultDrmSessionManager.this.f7607OooOOO.remove(oooO0OO);
                    oooO0OO.f7624OooO0o = true;
                }
            });
        }
    }

    public class OooO0o implements DefaultDrmSession.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f7627OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public DefaultDrmSession f7628OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(boolean z, Exception exc) {
            this.f7628OooO0O0 = null;
            HashSet hashSet = this.f7627OooO00o;
            ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(hashSet);
            hashSet.clear();
            ImmutableList.OooO0O0 oooO0O0ListIterator = immutableListOooOO0O.listIterator(0);
            while (oooO0O0ListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) oooO0O0ListIterator.next();
                defaultDrmSession.getClass();
                defaultDrmSession.OooO(z ? 1 : 3, exc);
            }
        }
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.OooO0O0 oooO0O0, OooOO0O oooOO0O, HashMap map, boolean z, int[] iArr, boolean z2, androidx.media3.exoplayer.upstream.OooO00o oooO00o, long j) {
        uuid.getClass();
        o00Oo0.OooO0O0(!C.f6207OooO0O0.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7597OooO0O0 = uuid;
        this.f7598OooO0OO = oooO0O0;
        this.f7599OooO0Oo = oooOO0O;
        this.f7601OooO0o0 = map;
        this.f7600OooO0o = z;
        this.f7602OooO0oO = iArr;
        this.f7603OooO0oo = z2;
        this.f7604OooOO0 = oooO00o;
        this.f7596OooO = new OooO0o();
        this.f7605OooOO0O = new OooO();
        this.f7617OooOo0O = 0;
        this.f7608OooOOO0 = new ArrayList();
        this.f7607OooOOO = Collections.newSetFromMap(new IdentityHashMap());
        this.f7609OooOOOO = Collections.newSetFromMap(new IdentityHashMap());
        this.f7606OooOO0o = j;
    }

    public static boolean OooO0oO(DefaultDrmSession defaultDrmSession) {
        defaultDrmSession.OooOOO();
        if (defaultDrmSession.f7579OooOOOo == 1) {
            if (o00.f34910OooO00o < 19) {
                return true;
            }
            DrmSession.DrmSessionException error = defaultDrmSession.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList OooOO0(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f6228OooO0oO);
        for (int i = 0; i < drmInitData.f6228OooO0oO; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f6225OooO0Oo[i];
            if ((schemeData.OooO00o(uuid) || (C.f6208OooO0OO.equals(uuid) && schemeData.OooO00o(C.f6207OooO0O0))) && (schemeData.f6233OooO0oo != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final DefaultDrmSession OooO(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, boolean z2) {
        DefaultDrmSession defaultDrmSessionOooO0oo = OooO0oo(list, z, oooO00o);
        boolean zOooO0oO = OooO0oO(defaultDrmSessionOooO0oo);
        long j = this.f7606OooOO0o;
        Set<DefaultDrmSession> set = this.f7609OooOOOO;
        if (zOooO0oO && !set.isEmpty()) {
            Iterator it = ImmutableSet.OooOO0O(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).OooO0o0(null);
            }
            defaultDrmSessionOooO0oo.OooO0o0(oooO00o);
            if (j != -9223372036854775807L) {
                defaultDrmSessionOooO0oo.OooO0o0(null);
            }
            defaultDrmSessionOooO0oo = OooO0oo(list, z, oooO00o);
        }
        if (!OooO0oO(defaultDrmSessionOooO0oo) || !z2) {
            return defaultDrmSessionOooO0oo;
        }
        Set<OooO0OO> set2 = this.f7607OooOOO;
        if (set2.isEmpty()) {
            return defaultDrmSessionOooO0oo;
        }
        Iterator it2 = ImmutableSet.OooOO0O(set2).iterator();
        while (it2.hasNext()) {
            ((OooO0OO) it2.next()).release();
        }
        if (!set.isEmpty()) {
            Iterator it3 = ImmutableSet.OooOO0O(set).iterator();
            while (it3.hasNext()) {
                ((DrmSession) it3.next()).OooO0o0(null);
            }
        }
        defaultDrmSessionOooO0oo.OooO0o0(oooO00o);
        if (j != -9223372036854775807L) {
            defaultDrmSessionOooO0oo.OooO0o0(null);
        }
        return OooO0oo(list, z, oooO00o);
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO
    public final void OooO00o(Looper looper, o0oOO o0ooo2) {
        synchronized (this) {
            Looper looper2 = this.f7616OooOo00;
            if (looper2 == null) {
                this.f7616OooOo00 = looper;
                this.f7615OooOo0 = new Handler(looper);
            } else {
                o00Oo0.OooO0Oo(looper2 == looper);
                this.f7615OooOo0.getClass();
            }
        }
        this.f7614OooOo = o0ooo2;
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO
    @Nullable
    public final DrmSession OooO0O0(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
        OooOO0o(false);
        o00Oo0.OooO0Oo(this.f7610OooOOOo > 0);
        o00Oo0.OooO0o(this.f7616OooOo00);
        return OooO0o(this.f7616OooOo00, oooO00o, oooOO1, true);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    @Override // androidx.media3.exoplayer.drm.OooO0OO
    public final int OooO0OO(androidx.media3.common.OooOO0 oooOO1) {
        String str;
        boolean z = false;
        OooOO0o(false);
        ExoMediaDrm exoMediaDrm = this.f7612OooOOo0;
        exoMediaDrm.getClass();
        int iOooO0oo = exoMediaDrm.OooO0oo();
        DrmInitData drmInitData = oooOO1.f6414OooOOo;
        if (drmInitData == null) {
            int iOooO0oO = o0000oo.OooO0oO(oooOO1.f6412OooOOOO);
            int i = 0;
            while (true) {
                int[] iArr = this.f7602OooO0oO;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iOooO0oO) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iOooO0oo;
            }
            return 0;
        }
        if (this.f7618OooOo0o != null) {
            z = true;
        } else {
            UUID uuid = this.f7597OooO0O0;
            if (!OooOO0(drmInitData, uuid, true).isEmpty()) {
                str = drmInitData.f6226OooO0o;
                if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : o00.f34910OooO00o >= 25)) {
                    z = true;
                }
            } else if (drmInitData.f6228OooO0oO == 1 && drmInitData.f6225OooO0Oo[0].OooO00o(C.f6207OooO0O0)) {
                Log.OooO0o("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                str = drmInitData.f6226OooO0o;
                if (str != null) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            return iOooO0oo;
        }
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO
    public final androidx.media3.exoplayer.drm.OooO0OO.OooO0O0 OooO0Oo(@Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
        int i = 1;
        o00Oo0.OooO0Oo(this.f7610OooOOOo > 0);
        o00Oo0.OooO0o(this.f7616OooOo00);
        OooO0OO oooO0OO = new OooO0OO(oooO00o);
        Handler handler = this.f7615OooOo0;
        handler.getClass();
        handler.post(new o00OOO0(i, oooO0OO, oooOO1));
        return oooO0OO;
    }

    @Nullable
    public final DrmSession OooO0o(Looper looper, @Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1, boolean z) {
        ArrayList arrayListOooOO0;
        if (this.f7619OooOoO0 == null) {
            this.f7619OooOoO0 = new OooO0O0(looper);
        }
        DrmInitData drmInitData = oooOO1.f6414OooOOo;
        int i = 0;
        DefaultDrmSession defaultDrmSessionOooO = null;
        if (drmInitData == null) {
            int iOooO0oO = o0000oo.OooO0oO(oooOO1.f6412OooOOOO);
            ExoMediaDrm exoMediaDrm = this.f7612OooOOo0;
            exoMediaDrm.getClass();
            if (exoMediaDrm.OooO0oo() == 2 && OooOo00.f34416OooO0Oo) {
                return null;
            }
            int[] iArr = this.f7602OooO0oO;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iOooO0oO) {
                    break;
                }
                i++;
            }
            if (i == -1 || exoMediaDrm.OooO0oo() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession = this.f7611OooOOo;
            if (defaultDrmSession == null) {
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                DefaultDrmSession defaultDrmSessionOooO2 = OooO(o0O00.f19060OooO0oo, true, null, z);
                this.f7608OooOOO0.add(defaultDrmSessionOooO2);
                this.f7611OooOOo = defaultDrmSessionOooO2;
            } else {
                defaultDrmSession.OooO0Oo(null);
            }
            return this.f7611OooOOo;
        }
        if (this.f7618OooOo0o == null) {
            arrayListOooOO0 = OooOO0(drmInitData, this.f7597OooO0O0, false);
            if (arrayListOooOO0.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f7597OooO0O0);
                Log.OooO0Oo("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (oooO00o != null) {
                    oooO00o.OooO0o0(missingSchemeDataException);
                }
                return new androidx.media3.exoplayer.drm.OooO(new DrmSession.DrmSessionException(6003, missingSchemeDataException));
            }
        } else {
            arrayListOooOO0 = null;
        }
        if (this.f7600OooO0o) {
            for (DefaultDrmSession defaultDrmSession2 : this.f7608OooOOO0) {
                if (o00.OooO00o(defaultDrmSession2.f7565OooO00o, arrayListOooOO0)) {
                    defaultDrmSessionOooO = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSessionOooO = this.f7613OooOOoo;
        }
        if (defaultDrmSessionOooO == null) {
            defaultDrmSessionOooO = OooO(arrayListOooOO0, false, oooO00o, z);
            if (!this.f7600OooO0o) {
                this.f7613OooOOoo = defaultDrmSessionOooO;
            }
            this.f7608OooOOO0.add(defaultDrmSessionOooO);
        } else {
            defaultDrmSessionOooO.OooO0Oo(oooO00o);
        }
        return defaultDrmSessionOooO;
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO
    public final void OooO0o0() {
        OooOO0o(true);
        int i = this.f7610OooOOOo;
        this.f7610OooOOOo = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f7612OooOOo0 == null) {
            ExoMediaDrm exoMediaDrmOooO00o = this.f7598OooO0OO.OooO00o(this.f7597OooO0O0);
            this.f7612OooOOo0 = exoMediaDrmOooO00o;
            exoMediaDrmOooO00o.OooO0o0(new OooO00o());
        } else {
            if (this.f7606OooOO0o == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f7608OooOOO0;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((DefaultDrmSession) arrayList.get(i2)).OooO0Oo(null);
                i2++;
            }
        }
    }

    public final DefaultDrmSession OooO0oo(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o) {
        this.f7612OooOOo0.getClass();
        boolean z2 = this.f7603OooO0oo | z;
        UUID uuid = this.f7597OooO0O0;
        ExoMediaDrm exoMediaDrm = this.f7612OooOOo0;
        OooO0o oooO0o = this.f7596OooO;
        OooO oooO = this.f7605OooOO0O;
        int i = this.f7617OooOo0O;
        byte[] bArr = this.f7618OooOo0o;
        HashMap<String, String> map = this.f7601OooO0o0;
        OooOOO0 oooOOO0 = this.f7599OooO0Oo;
        Looper looper = this.f7616OooOo00;
        looper.getClass();
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f7604OooOO0;
        o0oOO o0ooo2 = this.f7614OooOo;
        o0ooo2.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, exoMediaDrm, oooO0o, oooO, list, i, z2, z, bArr, map, oooOOO0, looper, loadErrorHandlingPolicy, o0ooo2);
        defaultDrmSession.OooO0Oo(oooO00o);
        if (this.f7606OooOO0o != -9223372036854775807L) {
            defaultDrmSession.OooO0Oo(null);
        }
        return defaultDrmSession;
    }

    public final void OooOO0O() {
        if (this.f7612OooOOo0 != null && this.f7610OooOOOo == 0 && this.f7608OooOOO0.isEmpty() && this.f7607OooOOO.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.f7612OooOOo0;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.f7612OooOOo0 = null;
        }
    }

    public final void OooOO0o(boolean z) {
        if (z && this.f7616OooOo00 == null) {
            Log.OooO0oO("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7616OooOo00;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            Log.OooO0oO("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7616OooOo00.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO
    public final void release() {
        OooOO0o(true);
        int i = this.f7610OooOOOo - 1;
        this.f7610OooOOOo = i;
        if (i != 0) {
            return;
        }
        if (this.f7606OooOO0o != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f7608OooOOO0);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).OooO0o0(null);
            }
        }
        Iterator it = ImmutableSet.OooOO0O(this.f7607OooOOO).iterator();
        while (it.hasNext()) {
            ((OooO0OO) it.next()).release();
        }
        OooOO0O();
    }
}
