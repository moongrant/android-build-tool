package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p301o0O0Oooo.o00;
import p301o0O0Oooo.o00oOoo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o f13679OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UUID f13680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO.OooO0OO f13681OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f13682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f13683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, String> f13684OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f13685OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f13686OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Oooo000 f13687OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO f13688OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f13689OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final List<DefaultDrmSession> f13690OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final List<DefaultDrmSession> f13691OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Set<DefaultDrmSession> f13692OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13693OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f13694OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.OooO f13695OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession f13696OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public volatile OooO0OO f13697OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Handler f13698OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Looper f13699OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f13700OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public byte[] f13701OooOo0o;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
            sb.append("Media does not support uuid: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class OooO implements DefaultDrmSession.OooO0O0 {
        public OooO() {
        }
    }

    public class OooO0O0 implements com.google.android.exoplayer2.drm.OooO.OooO0O0 {
        public OooO0O0() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class OooO0OO extends Handler {
        public OooO0OO(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f13691OooOOO0) {
                if (Arrays.equals(defaultDrmSession.f13670OooOo00, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f13656OooO0o0 == 0 && defaultDrmSession.f13662OooOOO == 4) {
                        int i = o000OOo0.f36740OooO00o;
                        defaultDrmSession.OooO0o(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public class OooO0o implements DefaultDrmSession.OooO00o {
        public OooO0o() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        public final void OooO00o(Exception exc) {
            Iterator it = DefaultDrmSessionManager.this.f13690OooOOO.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).OooO0oo(exc);
            }
            DefaultDrmSessionManager.this.f13690OooOOO.clear();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
        public final void OooO0O0(DefaultDrmSession defaultDrmSession) {
            if (DefaultDrmSessionManager.this.f13690OooOOO.contains(defaultDrmSession)) {
                return;
            }
            DefaultDrmSessionManager.this.f13690OooOOO.add(defaultDrmSession);
            if (DefaultDrmSessionManager.this.f13690OooOOO.size() == 1) {
                defaultDrmSession.OooOO0o();
            }
        }
    }

    public DefaultDrmSessionManager(UUID uuid, com.google.android.exoplayer2.drm.OooO.OooO0OO oooO0OO, OooOOO0 oooOOO0, HashMap map, boolean z, int[] iArr, boolean z2, Oooo000 oooo000, long j, OooO00o oooO00o) {
        Objects.requireNonNull(uuid);
        o00000O0.OooO0O0(!C.f13106OooO0O0.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13680OooO0O0 = uuid;
        this.f13681OooO0OO = oooO0OO;
        this.f13682OooO0Oo = oooOOO0;
        this.f13684OooO0o0 = map;
        this.f13683OooO0o = z;
        this.f13685OooO0oO = iArr;
        this.f13686OooO0oo = z2;
        this.f13687OooOO0 = oooo000;
        this.f13679OooO = new OooO0o();
        this.f13688OooOO0O = new OooO();
        this.f13700OooOo0O = 0;
        this.f13691OooOOO0 = new ArrayList();
        this.f13690OooOOO = new ArrayList();
        this.f13692OooOOOO = Collections.newSetFromMap(new IdentityHashMap());
        this.f13689OooOO0o = j;
    }

    public static List<DrmInitData.SchemeData> OooO0o(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f13706Oooo);
        for (int i = 0; i < drmInitData.f13706Oooo; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.f13707Oooo0o[i];
            if ((schemeData.OooO00o(uuid) || (C.f13107OooO0OO.equals(uuid) && schemeData.OooO00o(C.f13106OooO0O0))) && (schemeData.f13714OoooO00 != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void OooO00o() {
        int i = this.f13693OooOOOo;
        this.f13693OooOOOo = i + 1;
        if (i != 0) {
            return;
        }
        o00000O0.OooO0Oo(this.f13695OooOOo0 == null);
        com.google.android.exoplayer2.drm.OooO oooOOooO00o = this.f13681OooO0OO.OooO00o(this.f13680OooO0O0);
        this.f13695OooOOo0 = oooOOooO00o;
        oooOOooO00o.OooO0oo(new OooO0O0());
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession>] */
    @Override // com.google.android.exoplayer2.drm.OooO0O0
    @Nullable
    public final DrmSession OooO0O0(Looper looper, @Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o, Format format) {
        List<DrmInitData.SchemeData> listOooO0o;
        Looper looper2 = this.f13699OooOo00;
        int i = 0;
        if (looper2 == null) {
            this.f13699OooOo00 = looper;
            this.f13698OooOo0 = new Handler(looper);
        } else {
            o00000O0.OooO0Oo(looper2 == looper);
        }
        if (this.f13697OooOo == null) {
            this.f13697OooOo = new OooO0OO(looper);
        }
        DrmInitData drmInitData = format.f13134OoooOoo;
        DefaultDrmSession defaultDrmSessionOooO0o0 = null;
        if (drmInitData != null) {
            if (this.f13701OooOo0o == null) {
                listOooO0o = OooO0o(drmInitData, this.f13680OooO0O0, false);
                if (((ArrayList) listOooO0o).isEmpty()) {
                    MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f13680OooO0O0);
                    if (c0097OooO00o != null) {
                        c0097OooO00o.OooO0o0(missingSchemeDataException);
                    }
                    return new com.google.android.exoplayer2.drm.OooO0o(new DrmSession.DrmSessionException(missingSchemeDataException));
                }
            } else {
                listOooO0o = null;
            }
            if (this.f13683OooO0o) {
                for (DefaultDrmSession defaultDrmSession : this.f13691OooOOO0) {
                    if (o000OOo0.OooO00o(defaultDrmSession.f13651OooO00o, listOooO0o)) {
                        defaultDrmSessionOooO0o0 = defaultDrmSession;
                        break;
                    }
                }
            } else {
                defaultDrmSessionOooO0o0 = this.f13696OooOOoo;
            }
            if (defaultDrmSessionOooO0o0 == null) {
                defaultDrmSessionOooO0o0 = OooO0o0(listOooO0o, false, c0097OooO00o);
                if (!this.f13683OooO0o) {
                    this.f13696OooOOoo = defaultDrmSessionOooO0o0;
                }
                this.f13691OooOOO0.add(defaultDrmSessionOooO0o0);
            } else {
                defaultDrmSessionOooO0o0.OooO00o(c0097OooO00o);
            }
            return defaultDrmSessionOooO0o0;
        }
        int iOooO0o = o000OO.OooO0o(format.f13131OoooOOo);
        com.google.android.exoplayer2.drm.OooO oooO = this.f13695OooOOo0;
        Objects.requireNonNull(oooO);
        if (o00.class.equals(oooO.OooO00o()) && o00.f36038OooO0Oo) {
            return null;
        }
        int[] iArr = this.f13685OooO0oO;
        int i2 = o000OOo0.f36740OooO00o;
        while (true) {
            if (i >= iArr.length) {
                i = -1;
                break;
            }
            if (iArr[i] == iOooO0o) {
                break;
            }
            i++;
        }
        if (i == -1 || o00oOoo.class.equals(oooO.OooO00o())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession2 = this.f13694OooOOo;
        if (defaultDrmSession2 == null) {
            com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            DefaultDrmSession defaultDrmSessionOooO0o1 = OooO0o0(o0.f18399OoooO00, true, null);
            this.f13691OooOOO0.add(defaultDrmSessionOooO0o1);
            this.f13694OooOOo = defaultDrmSessionOooO0o1;
        } else {
            defaultDrmSession2.OooO00o(null);
        }
        return this.f13694OooOOo;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.OooO0O0
    @Nullable
    public final Class<? extends p301o0O0Oooo.o000OOo0> OooO0OO(Format format) {
        String str;
        com.google.android.exoplayer2.drm.OooO oooO = this.f13695OooOOo0;
        Objects.requireNonNull(oooO);
        Class<? extends p301o0O0Oooo.o000OOo0> clsOooO00o = oooO.OooO00o();
        DrmInitData drmInitData = format.f13134OoooOoo;
        int i = 0;
        if (drmInitData == null) {
            int iOooO0o = o000OO.OooO0o(format.f13131OoooOOo);
            int[] iArr = this.f13685OooO0oO;
            int i2 = o000OOo0.f36740OooO00o;
            while (i < iArr.length) {
                if (iArr[i] == iOooO0o) {
                    if (i != -1) {
                        return clsOooO00o;
                    }
                    return null;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return clsOooO00o;
            }
            return null;
        }
        if (this.f13701OooOo0o != null) {
            i = 1;
        } else if (!((ArrayList) OooO0o(drmInitData, this.f13680OooO0O0, true)).isEmpty()) {
            str = drmInitData.f13709Oooo0oo;
            if (str != null || "cenc".equals(str) || (!"cbcs".equals(str) ? !("cbc1".equals(str) || "cens".equals(str)) : o000OOo0.f36740OooO00o >= 25)) {
                i = 1;
            }
        } else if (drmInitData.f13706Oooo == 1 && drmInitData.f13707Oooo0o[0].OooO00o(C.f13106OooO0O0)) {
            String strValueOf = String.valueOf(this.f13680OooO0O0);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(strValueOf);
            Log.w("DefaultDrmSessionMgr", sb.toString());
            str = drmInitData.f13709Oooo0oo;
            if (str != null) {
                i = 1;
            } else {
                i = 1;
            }
        }
        return i != 0 ? clsOooO00o : o00oOoo.class;
    }

    public final DefaultDrmSession OooO0Oo(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o) {
        Objects.requireNonNull(this.f13695OooOOo0);
        boolean z2 = this.f13686OooO0oo | z;
        UUID uuid = this.f13680OooO0O0;
        com.google.android.exoplayer2.drm.OooO oooO = this.f13695OooOOo0;
        OooO0o oooO0o = this.f13679OooO;
        OooO oooO2 = this.f13688OooOO0O;
        int i = this.f13700OooOo0O;
        byte[] bArr = this.f13701OooOo0o;
        HashMap<String, String> map = this.f13684OooO0o0;
        OooOOO0 oooOOO0 = this.f13682OooO0Oo;
        Looper looper = this.f13699OooOo00;
        Objects.requireNonNull(looper);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, oooO, oooO0o, oooO2, list, i, z2, z, bArr, map, oooOOO0, looper, this.f13687OooOO0);
        defaultDrmSession.OooO00o(c0097OooO00o);
        if (this.f13689OooOO0o != -9223372036854775807L) {
            defaultDrmSession.OooO00o(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession OooO0o0(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o) {
        DefaultDrmSession defaultDrmSessionOooO0Oo = OooO0Oo(list, z, c0097OooO00o);
        if (defaultDrmSessionOooO0Oo.f13662OooOOO != 1) {
            return defaultDrmSessionOooO0Oo;
        }
        if (o000OOo0.f36740OooO00o >= 19) {
            DrmSession.DrmSessionException drmSessionExceptionOooO0o0 = defaultDrmSessionOooO0Oo.OooO0o0();
            Objects.requireNonNull(drmSessionExceptionOooO0o0);
            if (!(drmSessionExceptionOooO0o0.getCause() instanceof ResourceBusyException)) {
                return defaultDrmSessionOooO0Oo;
            }
        }
        if (this.f13692OooOOOO.isEmpty()) {
            return defaultDrmSessionOooO0Oo;
        }
        com.google.common.collect.OooO0OO oooO0OOListIterator = ImmutableList.OooOO0o(this.f13692OooOOOO).listIterator(0);
        while (oooO0OOListIterator.hasNext()) {
            ((DrmSession) oooO0OOListIterator.next()).OooO0O0(null);
        }
        defaultDrmSessionOooO0Oo.OooO0O0(c0097OooO00o);
        if (this.f13689OooOO0o != -9223372036854775807L) {
            defaultDrmSessionOooO0Oo.OooO0O0(null);
        }
        return OooO0Oo(list, z, c0097OooO00o);
    }

    @Override // com.google.android.exoplayer2.drm.OooO0O0
    public final void release() {
        int i = this.f13693OooOOOo - 1;
        this.f13693OooOOOo = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f13691OooOOO0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((DefaultDrmSession) arrayList.get(i2)).OooO0O0(null);
        }
        com.google.android.exoplayer2.drm.OooO oooO = this.f13695OooOOo0;
        Objects.requireNonNull(oooO);
        oooO.release();
        this.f13695OooOOo0 = null;
    }
}
