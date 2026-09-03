package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
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
import p200o00o0o.o0O0OOO0;
import p207o00o0oOo.o0oO0Ooo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
@Deprecated
public final class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o f11717OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UUID f11718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExoMediaDrm.OooO0O0 f11719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f11720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f11721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, String> f11722OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f11723OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f11724OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f11725OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO f11726OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f11727OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Set<OooO0OO> f11728OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList f11729OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Set<DefaultDrmSession> f11730OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f11731OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f11732OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ExoMediaDrm f11733OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f11734OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public o0O0OOO0 f11735OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Handler f11736OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Looper f11737OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f11738OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public byte[] f11739OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public volatile OooO0O0 f11740OooOoO0;

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
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f11729OooOOO0) {
                defaultDrmSession.OooOOO();
                if (Arrays.equals(defaultDrmSession.f11707OooOo0O, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f11691OooO0o0 == 0 && defaultDrmSession.f11700OooOOOo == 4) {
                        int i = o0O00.f40595OooO00o;
                        defaultDrmSession.OooO0oO(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class OooO0OO implements com.google.android.exoplayer2.drm.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final com.google.android.exoplayer2.drm.OooO0O0.OooO00o f11744OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public DrmSession f11745OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f11746OooO0Oo;

        public OooO0OO(com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o) {
            this.f11744OooO0O0 = oooO00o;
        }

        @Override // com.google.android.exoplayer2.drm.OooO0OO.OooO0O0
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f11736OooOo0;
            handler.getClass();
            o0O00.Oooo0oO(handler, new OooO0O0.OooOO0(this, 1));
        }
    }

    public class OooO0o implements DefaultDrmSession.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f11748OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public DefaultDrmSession f11749OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(boolean z, Exception exc) {
            this.f11749OooO0O0 = null;
            HashSet hashSet = this.f11748OooO00o;
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

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.OooO0O0 oooO0O0, OooOO0O oooOO0O, HashMap map, boolean z, int[] iArr, boolean z2, com.google.android.exoplayer2.upstream.OooO oooO, long j) {
        uuid.getClass();
        o00O000o.OooO0O0(!C.f10897OooO0O0.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11718OooO0O0 = uuid;
        this.f11719OooO0OO = oooO0O0;
        this.f11720OooO0Oo = oooOO0O;
        this.f11722OooO0o0 = map;
        this.f11721OooO0o = z;
        this.f11723OooO0oO = iArr;
        this.f11724OooO0oo = z2;
        this.f11725OooOO0 = oooO;
        this.f11717OooO = new OooO0o();
        this.f11726OooOO0O = new OooO();
        this.f11738OooOo0O = 0;
        this.f11729OooOOO0 = new ArrayList();
        this.f11728OooOOO = Collections.newSetFromMap(new IdentityHashMap());
        this.f11730OooOOOO = Collections.newSetFromMap(new IdentityHashMap());
        this.f11727OooOO0o = j;
    }

    public static boolean OooO0oO(DefaultDrmSession defaultDrmSession) {
        defaultDrmSession.OooOOO();
        if (defaultDrmSession.f11700OooOOOo == 1) {
            if (o0O00.f40595OooO00o < 19) {
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
        ArrayList arrayList = new ArrayList(drmInitData.f11753OooO0oO);
        for (int i = 0; i < drmInitData.f11753OooO0oO; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f11750OooO0Oo[i];
            if ((schemeData.OooO00o(uuid) || (C.f10898OooO0OO.equals(uuid) && schemeData.OooO00o(C.f10897OooO0O0))) && (schemeData.f11758OooO0oo != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final DefaultDrmSession OooO(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, boolean z2) {
        DefaultDrmSession defaultDrmSessionOooO0oo = OooO0oo(list, z, oooO00o);
        boolean zOooO0oO = OooO0oO(defaultDrmSessionOooO0oo);
        long j = this.f11727OooOO0o;
        Set<DefaultDrmSession> set = this.f11730OooOOOO;
        if (zOooO0oO && !set.isEmpty()) {
            Iterator it = ImmutableSet.OooOO0O(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).OooO0O0(null);
            }
            defaultDrmSessionOooO0oo.OooO0O0(oooO00o);
            if (j != -9223372036854775807L) {
                defaultDrmSessionOooO0oo.OooO0O0(null);
            }
            defaultDrmSessionOooO0oo = OooO0oo(list, z, oooO00o);
        }
        if (!OooO0oO(defaultDrmSessionOooO0oo) || !z2) {
            return defaultDrmSessionOooO0oo;
        }
        Set<OooO0OO> set2 = this.f11728OooOOO;
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
                ((DrmSession) it3.next()).OooO0O0(null);
            }
        }
        defaultDrmSessionOooO0oo.OooO0O0(oooO00o);
        if (j != -9223372036854775807L) {
            defaultDrmSessionOooO0oo.OooO0O0(null);
        }
        return OooO0oo(list, z, oooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    @Override // com.google.android.exoplayer2.drm.OooO0OO
    public final int OooO00o(OooOo oooOo) {
        String str;
        boolean z = false;
        OooOO0o(false);
        ExoMediaDrm exoMediaDrm = this.f11733OooOOo0;
        exoMediaDrm.getClass();
        int iOooO0oO = exoMediaDrm.OooO0oO();
        DrmInitData drmInitData = oooOo.f11213OooOOo;
        if (drmInitData == null) {
            int iOooO0oo = o00OO0OO.OooO0oo(oooOo.f11211OooOOOO);
            int i = 0;
            while (true) {
                int[] iArr = this.f11723OooO0oO;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iOooO0oo) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iOooO0oO;
            }
            return 0;
        }
        if (this.f11739OooOo0o != null) {
            z = true;
        } else {
            UUID uuid = this.f11718OooO0O0;
            if (!OooOO0(drmInitData, uuid, true).isEmpty()) {
                str = drmInitData.f11751OooO0o;
                if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : o0O00.f40595OooO00o >= 25)) {
                    z = true;
                }
            } else if (drmInitData.f11753OooO0oO == 1 && drmInitData.f11750OooO0Oo[0].OooO00o(C.f10897OooO0O0)) {
                Log.OooO0o("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                str = drmInitData.f11751OooO0o;
                if (str != null) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            return iOooO0oO;
        }
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.OooO0OO
    @Nullable
    public final DrmSession OooO0O0(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo) {
        OooOO0o(false);
        o00O000o.OooO0Oo(this.f11731OooOOOo > 0);
        o00O000o.OooO0o0(this.f11737OooOo00);
        return OooO0o(this.f11737OooOo00, oooO00o, oooOo, true);
    }

    @Override // com.google.android.exoplayer2.drm.OooO0OO
    public final void OooO0OO() {
        OooOO0o(true);
        int i = this.f11731OooOOOo;
        this.f11731OooOOOo = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f11733OooOOo0 == null) {
            ExoMediaDrm exoMediaDrmOooO00o = this.f11719OooO0OO.OooO00o(this.f11718OooO0O0);
            this.f11733OooOOo0 = exoMediaDrmOooO00o;
            exoMediaDrmOooO00o.OooO0o(new OooO00o());
        } else {
            if (this.f11727OooOO0o == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f11729OooOOO0;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((DefaultDrmSession) arrayList.get(i2)).OooO00o(null);
                i2++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO0OO
    public final com.google.android.exoplayer2.drm.OooO0OO.OooO0O0 OooO0Oo(@Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo) {
        o00O000o.OooO0Oo(this.f11731OooOOOo > 0);
        o00O000o.OooO0o0(this.f11737OooOo00);
        OooO0OO oooO0OO = new OooO0OO(oooO00o);
        Handler handler = this.f11736OooOo0;
        handler.getClass();
        handler.post(new OooO0O0.OooOO0O(3, oooO0OO, oooOo));
        return oooO0OO;
    }

    @Nullable
    public final DrmSession OooO0o(Looper looper, @Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o, OooOo oooOo, boolean z) {
        ArrayList arrayListOooOO0;
        if (this.f11740OooOoO0 == null) {
            this.f11740OooOoO0 = new OooO0O0(looper);
        }
        DrmInitData drmInitData = oooOo.f11213OooOOo;
        int i = 0;
        DefaultDrmSession defaultDrmSessionOooO = null;
        if (drmInitData == null) {
            int iOooO0oo = o00OO0OO.OooO0oo(oooOo.f11211OooOOOO);
            ExoMediaDrm exoMediaDrm = this.f11733OooOOo0;
            exoMediaDrm.getClass();
            if (exoMediaDrm.OooO0oO() == 2 && o0oO0Ooo.f39449OooO0Oo) {
                return null;
            }
            int[] iArr = this.f11723OooO0oO;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iOooO0oo) {
                    break;
                }
                i++;
            }
            if (i == -1 || exoMediaDrm.OooO0oO() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession = this.f11732OooOOo;
            if (defaultDrmSession == null) {
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                DefaultDrmSession defaultDrmSessionOooO2 = OooO(com.google.common.collect.o0O00.f19536OooO0oo, true, null, z);
                this.f11729OooOOO0.add(defaultDrmSessionOooO2);
                this.f11732OooOOo = defaultDrmSessionOooO2;
            } else {
                defaultDrmSession.OooO00o(null);
            }
            return this.f11732OooOOo;
        }
        if (this.f11739OooOo0o == null) {
            arrayListOooOO0 = OooOO0(drmInitData, this.f11718OooO0O0, false);
            if (arrayListOooOO0.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f11718OooO0O0);
                Log.OooO0Oo("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (oooO00o != null) {
                    oooO00o.OooO0o0(missingSchemeDataException);
                }
                return new com.google.android.exoplayer2.drm.OooO(new DrmSession.DrmSessionException(6003, missingSchemeDataException));
            }
        } else {
            arrayListOooOO0 = null;
        }
        if (this.f11721OooO0o) {
            for (DefaultDrmSession defaultDrmSession2 : this.f11729OooOOO0) {
                if (o0O00.OooO00o(defaultDrmSession2.f11686OooO00o, arrayListOooOO0)) {
                    defaultDrmSessionOooO = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSessionOooO = this.f11734OooOOoo;
        }
        if (defaultDrmSessionOooO == null) {
            defaultDrmSessionOooO = OooO(arrayListOooOO0, false, oooO00o, z);
            if (!this.f11721OooO0o) {
                this.f11734OooOOoo = defaultDrmSessionOooO;
            }
            this.f11729OooOOO0.add(defaultDrmSessionOooO);
        } else {
            defaultDrmSessionOooO.OooO00o(oooO00o);
        }
        return defaultDrmSessionOooO;
    }

    @Override // com.google.android.exoplayer2.drm.OooO0OO
    public final void OooO0o0(Looper looper, o0O0OOO0 o0o0ooo0) {
        synchronized (this) {
            Looper looper2 = this.f11737OooOo00;
            if (looper2 == null) {
                this.f11737OooOo00 = looper;
                this.f11736OooOo0 = new Handler(looper);
            } else {
                o00O000o.OooO0Oo(looper2 == looper);
                this.f11736OooOo0.getClass();
            }
        }
        this.f11735OooOo = o0o0ooo0;
    }

    public final DefaultDrmSession OooO0oo(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o) {
        this.f11733OooOOo0.getClass();
        boolean z2 = this.f11724OooO0oo | z;
        UUID uuid = this.f11718OooO0O0;
        ExoMediaDrm exoMediaDrm = this.f11733OooOOo0;
        OooO0o oooO0o = this.f11717OooO;
        OooO oooO = this.f11726OooOO0O;
        int i = this.f11738OooOo0O;
        byte[] bArr = this.f11739OooOo0o;
        HashMap<String, String> map = this.f11722OooO0o0;
        OooOOO0 oooOOO0 = this.f11720OooO0Oo;
        Looper looper = this.f11737OooOo00;
        looper.getClass();
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f11725OooOO0;
        o0O0OOO0 o0o0ooo0 = this.f11735OooOo;
        o0o0ooo0.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, exoMediaDrm, oooO0o, oooO, list, i, z2, z, bArr, map, oooOOO0, looper, loadErrorHandlingPolicy, o0o0ooo0);
        defaultDrmSession.OooO00o(oooO00o);
        if (this.f11727OooOO0o != -9223372036854775807L) {
            defaultDrmSession.OooO00o(null);
        }
        return defaultDrmSession;
    }

    public final void OooOO0O() {
        if (this.f11733OooOOo0 != null && this.f11731OooOOOo == 0 && this.f11729OooOOO0.isEmpty() && this.f11728OooOOO.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.f11733OooOOo0;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.f11733OooOOo0 = null;
        }
    }

    public final void OooOO0o(boolean z) {
        if (z && this.f11737OooOo00 == null) {
            Log.OooO0oO("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11737OooOo00;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            Log.OooO0oO("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f11737OooOo00.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.OooO0OO
    public final void release() {
        OooOO0o(true);
        int i = this.f11731OooOOOo - 1;
        this.f11731OooOOOo = i;
        if (i != 0) {
            return;
        }
        if (this.f11727OooOO0o != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f11729OooOOO0);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).OooO0O0(null);
            }
        }
        Iterator it = ImmutableSet.OooOO0O(this.f11728OooOOO).iterator();
        while (it.hasNext()) {
            ((OooO0OO) it.next()).release();
        }
        OooOO0O();
    }
}
