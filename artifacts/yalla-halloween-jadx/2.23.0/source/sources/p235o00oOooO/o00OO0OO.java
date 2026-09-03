package p235o00oOooO;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.OooO0OO;
import com.google.android.exoplayer2.source.OooOo00;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.DashMediaPeriod;
import com.google.android.exoplayer2.source.o00O0O;
import com.google.android.exoplayer2.source.o00Oo0;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p203o00o0o0o.o00OOO0O;
import p226o00oOo00.o0000;
import p226o00oOo00.o0000O00;
import p235o00oOooO.oo0O;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO0OO<T extends oo0O> implements SampleStream, o00Oo0, Loader.OooO00o<o00OO000>, Loader.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00Oo0.OooO00o<o00OO0OO<T>> f40263OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40264OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo[] f40265OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int[] f40266OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean[] f40267OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final T f40268OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOo00.OooO00o f40269OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f40270OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList<oo0o0O0> f40272OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final List<oo0o0O0> f40274OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o00O0O f40275OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00O0OOO f40276OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o00O0O[] f40277OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public o00OO000 f40278OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f40279OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO0O0<T> f40280OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOo f40281OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f40282OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f40283OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f40284OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public oo0o0O0 f40285OooOoO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Loader f40271OooOO0o = new Loader("ChunkSampleStream");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o00OO0O0 f40273OooOOO0 = new o00OO0O0();

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00OO0OO<T> f40286OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f40287OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O0O f40288OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f40289OooO0oO;

        public OooO00o(o00OO0OO<T> o00oo0oo, o00O0O o00o0o2, int i) {
            this.f40286OooO0Oo = o00oo0oo;
            this.f40288OooO0o0 = o00o0o2;
            this.f40287OooO0o = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            o00OO0OO o00oo0oo = o00OO0OO.this;
            return !o00oo0oo.OooOoO0() && this.f40288OooO0o0.OooOOo0(o00oo0oo.f40284OooOoO);
        }

        public final void OooO0OO() {
            if (this.f40289OooO0oO) {
                return;
            }
            o00OO0OO o00oo0oo = o00OO0OO.this;
            OooOo00.OooO00o oooO00o = o00oo0oo.f40269OooOO0;
            int[] iArr = o00oo0oo.f40266OooO0o0;
            int i = this.f40287OooO0o;
            oooO00o.OooO00o(iArr[i], o00oo0oo.f40265OooO0o[i], 0, null, o00oo0oo.f40283OooOo0o);
            this.f40289OooO0oO = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
            o00OO0OO o00oo0oo = o00OO0OO.this;
            if (o00oo0oo.OooOoO0()) {
                return -3;
            }
            oo0o0O0 oo0o0o0 = o00oo0oo.f40285OooOoO0;
            o00O0O o00o0o2 = this.f40288OooO0o0;
            if (oo0o0o0 != null && oo0o0o0.OooO0o0(this.f40287OooO0o + 1) <= o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo) {
                return -3;
            }
            OooO0OO();
            return o00o0o2.OooOo00(o00ooo0o, decoderInputBuffer, i, o00oo0oo.f40284OooOoO);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOOo(long j) {
            o00OO0OO o00oo0oo = o00OO0OO.this;
            if (o00oo0oo.OooOoO0()) {
                return 0;
            }
            boolean z = o00oo0oo.f40284OooOoO;
            o00O0O o00o0o2 = this.f40288OooO0o0;
            int iOooOOOO = o00o0o2.OooOOOO(j, z);
            oo0o0O0 oo0o0o0 = o00oo0oo.f40285OooOoO0;
            if (oo0o0o0 != null) {
                iOooOOOO = Math.min(iOooOOOO, oo0o0o0.OooO0o0(this.f40287OooO0o + 1) - (o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo));
            }
            o00o0o2.OooOoO0(iOooOOOO);
            if (iOooOOOO > 0) {
                OooO0OO();
            }
            return iOooOOOO;
        }
    }

    public interface OooO0O0<T extends oo0O> {
    }

    public o00OO0OO(int i, @Nullable int[] iArr, @Nullable OooOo[] oooOoArr, com.google.android.exoplayer2.source.dash.OooO00o oooO00o, o00Oo0.OooO00o oooO00o2, o000OO0O o000oo0o2, long j, OooO0OO oooO0OO, com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o3, LoadErrorHandlingPolicy loadErrorHandlingPolicy, OooOo00.OooO00o oooO00o4) {
        this.f40264OooO0Oo = i;
        this.f40266OooO0o0 = iArr;
        this.f40265OooO0o = oooOoArr;
        this.f40268OooO0oo = oooO00o;
        this.f40263OooO = oooO00o2;
        this.f40269OooOO0 = oooO00o4;
        this.f40270OooOO0O = loadErrorHandlingPolicy;
        ArrayList<oo0o0O0> arrayList = new ArrayList<>();
        this.f40272OooOOO = arrayList;
        this.f40274OooOOOO = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f40277OooOOo0 = new o00O0O[length];
        this.f40267OooO0oO = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        o00O0O[] o00o0oArr = new o00O0O[i2];
        oooO0OO.getClass();
        oooO00o3.getClass();
        o00O0O o00o0o2 = new o00O0O(o000oo0o2, oooO0OO, oooO00o3);
        this.f40275OooOOOo = o00o0o2;
        int i3 = 0;
        iArr2[0] = i;
        o00o0oArr[0] = o00o0o2;
        while (i3 < length) {
            o00O0O o00o0o3 = new o00O0O(o000oo0o2, null, null);
            this.f40277OooOOo0[i3] = o00o0o3;
            int i4 = i3 + 1;
            o00o0oArr[i4] = o00o0o3;
            iArr2[i4] = this.f40266OooO0o0[i3];
            i3 = i4;
        }
        this.f40276OooOOo = new o00O0OOO(iArr2, o00o0oArr);
        this.f40282OooOo0O = j;
        this.f40283OooOo0o = j;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void OooO00o() throws IOException {
        Loader loader = this.f40271OooOO0o;
        loader.OooO00o();
        o00O0O o00o0o2 = this.f40275OooOOOo;
        DrmSession drmSession = o00o0o2.f13308OooO0oo;
        if (drmSession != null && drmSession.getState() == 1) {
            DrmSession.DrmSessionException error = o00o0o2.f13308OooO0oo.getError();
            error.getClass();
            throw error;
        }
        if (loader.OooO0O0()) {
            return;
        }
        this.f40268OooO0oo.OooO00o();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean OooO0O0() {
        return !OooOoO0() && this.f40275OooOOOo.OooOOo0(this.f40284OooOoO);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        o00OO000 o00oo001 = (o00OO000) oooO0o;
        this.f40278OooOOoo = null;
        this.f40285OooOoO0 = null;
        long j3 = o00oo001.f40253OooO00o;
        o00O0O0 o00o0o0 = o00oo001.f40252OooO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f40270OooOO0O.OooO0Oo();
        this.f40269OooOO0.OooO0OO(o0000Var, o00oo001.f40255OooO0OO, this.f40264OooO0Oo, o00oo001.f40256OooO0Oo, o00oo001.f40258OooO0o0, o00oo001.f40257OooO0o, o00oo001.f40259OooO0oO, o00oo001.f40260OooO0oo);
        if (z) {
            return;
        }
        if (OooOoO0()) {
            this.f40275OooOOOo.OooOo0(false);
            for (o00O0O o00o0o2 : this.f40277OooOOo0) {
                o00o0o2.OooOo0(false);
            }
        } else if (o00oo001 instanceof oo0o0O0) {
            ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
            OooOo0O(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f40282OooOo0O = this.f40283OooOo0o;
            }
        }
        this.f40263OooO.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
        o00OO000 o00oo001 = (o00OO000) oooO0o;
        this.f40278OooOOoo = null;
        this.f40268OooO0oo.OooO0O0(o00oo001);
        long j3 = o00oo001.f40253OooO00o;
        o00O0O0 o00o0o0 = o00oo001.f40252OooO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f40270OooOO0O.OooO0Oo();
        this.f40269OooOO0.OooO0o0(o0000Var, o00oo001.f40255OooO0OO, this.f40264OooO0Oo, o00oo001.f40256OooO0Oo, o00oo001.f40258OooO0o0, o00oo001.f40257OooO0o, o00oo001.f40259OooO0oO, o00oo001.f40260OooO0oo);
        this.f40263OooO.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        if (OooOoO0()) {
            return this.f40282OooOo0O;
        }
        if (this.f40284OooOoO) {
            return Long.MIN_VALUE;
        }
        return OooOo0o().f40260OooO0oo;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        return this.f40271OooOO0o.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        Loader.OooO0O0 oooO0O0;
        o00OO000 o00oo001 = (o00OO000) oooO0o;
        long j3 = o00oo001.f40252OooO.f40516OooO0O0;
        boolean z = o00oo001 instanceof oo0o0O0;
        ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && OooOo(size)) ? false : true;
        o00O0O0 o00o0o0 = o00oo001.f40252OooO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        o0O00.OoooOO0(o00oo001.f40259OooO0oO);
        o0O00.OoooOO0(o00oo001.f40260OooO0oo);
        LoadErrorHandlingPolicy.OooO0OO oooO0OO = new LoadErrorHandlingPolicy.OooO0OO(iOException, i);
        T t = this.f40268OooO0oo;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f40270OooOO0O;
        if (!t.OooO0o0(o00oo001, z2, oooO0OO, loadErrorHandlingPolicy)) {
            oooO0O0 = null;
        } else if (z2) {
            oooO0O0 = Loader.f14192OooO0Oo;
            if (z) {
                o00O000o.OooO0Oo(OooOo0O(size) == o00oo001);
                if (arrayList.isEmpty()) {
                    this.f40282OooOo0O = this.f40283OooOo0o;
                }
            }
        } else {
            Log.OooO0o("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            oooO0O0 = null;
        }
        if (oooO0O0 == null) {
            long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO0OO);
            oooO0O0 = jOooO00o != -9223372036854775807L ? new Loader.OooO0O0(0, jOooO00o) : Loader.f14193OooO0o0;
        }
        int i2 = oooO0O0.f14197OooO00o;
        boolean z3 = true ^ (i2 == 0 || i2 == 1);
        Loader.OooO0O0 oooO0O1 = oooO0O0;
        this.f40269OooOO0.OooO0oO(o0000Var, o00oo001.f40255OooO0OO, this.f40264OooO0Oo, o00oo001.f40256OooO0Oo, o00oo001.f40258OooO0o0, o00oo001.f40257OooO0o, o00oo001.f40259OooO0oO, o00oo001.f40260OooO0oo, iOException, z3);
        if (z3) {
            this.f40278OooOOoo = null;
            loadErrorHandlingPolicy.OooO0Oo();
            this.f40263OooO.OooO00o(this);
        }
        return oooO0O1;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
        if (OooOoO0()) {
            return -3;
        }
        oo0o0O0 oo0o0o0 = this.f40285OooOoO0;
        o00O0O o00o0o2 = this.f40275OooOOOo;
        if (oo0o0o0 != null && oo0o0o0.OooO0o0(0) <= o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo) {
            return -3;
        }
        OooOoO();
        return o00o0o2.OooOo00(o00ooo0o, decoderInputBuffer, i, this.f40284OooOoO);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO
    public final void OooOOO0() {
        o00O0O o00o0o2 = this.f40275OooOOOo;
        o00o0o2.OooOo0(true);
        DrmSession drmSession = o00o0o2.f13308OooO0oo;
        if (drmSession != null) {
            drmSession.OooO0O0(o00o0o2.f13306OooO0o0);
            o00o0o2.f13308OooO0oo = null;
            o00o0o2.f13307OooO0oO = null;
        }
        for (o00O0O o00o0o3 : this.f40277OooOOo0) {
            o00o0o3.OooOo0(true);
            DrmSession drmSession2 = o00o0o3.f13308OooO0oo;
            if (drmSession2 != null) {
                drmSession2.OooO0O0(o00o0o3.f13306OooO0o0);
                o00o0o3.f13308OooO0oo = null;
                o00o0o3.f13307OooO0oO = null;
            }
        }
        this.f40268OooO0oo.release();
        OooO0O0<T> oooO0O0 = this.f40280OooOo0;
        if (oooO0O0 != null) {
            DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) oooO0O0;
            synchronized (dashMediaPeriod) {
                com.google.android.exoplayer2.source.dash.OooO0OO.C0212OooO0OO c0212OooO0OORemove = dashMediaPeriod.f13172OooOOo0.remove(this);
                if (c0212OooO0OORemove != null) {
                    o00O0O o00o0o4 = c0212OooO0OORemove.f13278OooO00o;
                    o00o0o4.OooOo0(true);
                    DrmSession drmSession3 = o00o0o4.f13308OooO0oo;
                    if (drmSession3 != null) {
                        drmSession3.OooO0O0(o00o0o4.f13306OooO0o0);
                        o00o0o4.f13308OooO0oo = null;
                        o00o0o4.f13307OooO0oO = null;
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int OooOOOo(long j) {
        if (OooOoO0()) {
            return 0;
        }
        boolean z = this.f40284OooOoO;
        o00O0O o00o0o2 = this.f40275OooOOOo;
        int iOooOOOO = o00o0o2.OooOOOO(j, z);
        oo0o0O0 oo0o0o0 = this.f40285OooOoO0;
        if (oo0o0o0 != null) {
            iOooOOOO = Math.min(iOooOOOO, oo0o0o0.OooO0o0(0) - (o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo));
        }
        o00o0o2.OooOoO0(iOooOOOO);
        OooOoO();
        return iOooOOOO;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        long j2;
        List<oo0o0O0> listEmptyList;
        if (!this.f40284OooOoO) {
            Loader loader = this.f40271OooOO0o;
            if (!loader.OooO0O0()) {
                if (!(loader.f14196OooO0OO != null)) {
                    boolean zOooOoO0 = OooOoO0();
                    if (zOooOoO0) {
                        listEmptyList = Collections.emptyList();
                        j2 = this.f40282OooOo0O;
                    } else {
                        j2 = OooOo0o().f40260OooO0oo;
                        listEmptyList = this.f40274OooOOOO;
                    }
                    this.f40268OooO0oo.OooO(j, j2, listEmptyList, this.f40273OooOOO0);
                    o00OO0O0 o00oo0o1 = this.f40273OooOOO0;
                    boolean z = o00oo0o1.f40262OooO0O0;
                    o00OO000 o00oo001 = o00oo0o1.f40261OooO00o;
                    o00oo0o1.f40261OooO00o = null;
                    o00oo0o1.f40262OooO0O0 = false;
                    if (z) {
                        this.f40282OooOo0O = -9223372036854775807L;
                        this.f40284OooOoO = true;
                        return true;
                    }
                    if (o00oo001 == null) {
                        return false;
                    }
                    this.f40278OooOOoo = o00oo001;
                    boolean z2 = o00oo001 instanceof oo0o0O0;
                    o00O0OOO o00o0ooo2 = this.f40276OooOOo;
                    if (z2) {
                        oo0o0O0 oo0o0o0 = (oo0o0O0) o00oo001;
                        if (zOooOoO0) {
                            long j3 = this.f40282OooOo0O;
                            if (oo0o0o0.f40259OooO0oO != j3) {
                                this.f40275OooOOOo.f13321OooOo00 = j3;
                                for (o00O0O o00o0o2 : this.f40277OooOOo0) {
                                    o00o0o2.f13321OooOo00 = this.f40282OooOo0O;
                                }
                            }
                            this.f40282OooOo0O = -9223372036854775807L;
                        }
                        oo0o0o0.f40304OooOOO0 = o00o0ooo2;
                        o00O0O[] o00o0oArr = o00o0ooo2.f40245OooO0O0;
                        int[] iArr = new int[o00o0oArr.length];
                        for (int i = 0; i < o00o0oArr.length; i++) {
                            o00O0O o00o0o3 = o00o0oArr[i];
                            iArr[i] = o00o0o3.f13317OooOOo0 + o00o0o3.f13315OooOOOo;
                        }
                        oo0o0o0.f40303OooOOO = iArr;
                        this.f40272OooOOO.add(oo0o0o0);
                    } else if (o00oo001 instanceof o00OOO00) {
                        ((o00OOO00) o00oo001).f40293OooOO0O = o00o0ooo2;
                    }
                    this.f40269OooOO0.OooO(new o0000(o00oo001.f40253OooO00o, o00oo001.f40254OooO0O0, loader.OooO0Oo(o00oo001, this, this.f40270OooOO0O.OooO0O0(o00oo001.f40255OooO0OO))), o00oo001.f40255OooO0OO, this.f40264OooO0Oo, o00oo001.f40256OooO0Oo, o00oo001.f40258OooO0o0, o00oo001.f40257OooO0o, o00oo001.f40259OooO0oO, o00oo001.f40260OooO0oo);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        if (this.f40284OooOoO) {
            return Long.MIN_VALUE;
        }
        if (OooOoO0()) {
            return this.f40282OooOo0O;
        }
        long jMax = this.f40283OooOo0o;
        oo0o0O0 oo0o0o0OooOo0o = OooOo0o();
        if (!oo0o0o0OooOo0o.OooO0Oo()) {
            ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
            oo0o0o0OooOo0o = arrayList.size() > 1 ? arrayList.get(arrayList.size() - 2) : null;
        }
        if (oo0o0o0OooOo0o != null) {
            jMax = Math.max(jMax, oo0o0o0OooOo0o.f40260OooO0oo);
        }
        return Math.max(jMax, this.f40275OooOOOo.OooOO0o());
    }

    public final boolean OooOo(int i) {
        o00O0O o00o0o2;
        oo0o0O0 oo0o0o0 = this.f40272OooOOO.get(i);
        o00O0O o00o0o3 = this.f40275OooOOOo;
        if (o00o0o3.f13317OooOOo0 + o00o0o3.f13318OooOOoo > oo0o0o0.OooO0o0(0)) {
            return true;
        }
        int i2 = 0;
        do {
            o00O0O[] o00o0oArr = this.f40277OooOOo0;
            if (i2 >= o00o0oArr.length) {
                return false;
            }
            o00o0o2 = o00o0oArr[i2];
            i2++;
        } while (o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo <= oo0o0o0.OooO0o0(i2));
        return true;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        Loader loader = this.f40271OooOO0o;
        if ((loader.f14196OooO0OO != null) || OooOoO0()) {
            return;
        }
        boolean zOooO0O0 = loader.OooO0O0();
        ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
        List<oo0o0O0> list = this.f40274OooOOOO;
        T t = this.f40268OooO0oo;
        if (zOooO0O0) {
            o00OO000 o00oo001 = this.f40278OooOOoo;
            o00oo001.getClass();
            boolean z = o00oo001 instanceof oo0o0O0;
            if (!(z && OooOo(arrayList.size() - 1)) && t.OooO0Oo(j, o00oo001, list)) {
                Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14195OooO0O0;
                o00O000o.OooO0o0(oooO0OO);
                oooO0OO.OooO00o(false);
                if (z) {
                    this.f40285OooOoO0 = (oo0o0O0) o00oo001;
                    return;
                }
                return;
            }
            return;
        }
        int iOooO0oo = t.OooO0oo(j, list);
        if (iOooO0oo < arrayList.size()) {
            o00O000o.OooO0Oo(!loader.OooO0O0());
            int size = arrayList.size();
            while (true) {
                if (iOooO0oo >= size) {
                    iOooO0oo = -1;
                    break;
                } else if (!OooOo(iOooO0oo)) {
                    break;
                } else {
                    iOooO0oo++;
                }
            }
            if (iOooO0oo == -1) {
                return;
            }
            long j2 = OooOo0o().f40260OooO0oo;
            oo0o0O0 oo0o0o0OooOo0O = OooOo0O(iOooO0oo);
            if (arrayList.isEmpty()) {
                this.f40282OooOo0O = this.f40283OooOo0o;
            }
            this.f40284OooOoO = false;
            int i = this.f40264OooO0Oo;
            OooOo00.OooO00o oooO00o = this.f40269OooOO0;
            oooO00o.getClass();
            oooO00o.OooOO0O(new o0000O00(1, i, null, 3, null, o0O00.OoooOO0(oo0o0o0OooOo0O.f40259OooO0oO), o0O00.OoooOO0(j2)));
        }
    }

    public final oo0o0O0 OooOo0O(int i) {
        ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
        oo0o0O0 oo0o0o0 = arrayList.get(i);
        int size = arrayList.size();
        int i2 = o0O00.f40595OooO00o;
        if (i < 0 || size > arrayList.size() || i > size) {
            throw new IllegalArgumentException();
        }
        if (i != size) {
            arrayList.subList(i, size).clear();
        }
        this.f40279OooOo = Math.max(this.f40279OooOo, arrayList.size());
        int i3 = 0;
        this.f40275OooOOOo.OooOO0(oo0o0o0.OooO0o0(0));
        while (true) {
            o00O0O[] o00o0oArr = this.f40277OooOOo0;
            if (i3 >= o00o0oArr.length) {
                return oo0o0o0;
            }
            o00O0O o00o0o2 = o00o0oArr[i3];
            i3++;
            o00o0o2.OooOO0(oo0o0o0.OooO0o0(i3));
        }
    }

    public final oo0o0O0 OooOo0o() {
        ArrayList<oo0o0O0> arrayList = this.f40272OooOOO;
        return arrayList.get(arrayList.size() - 1);
    }

    public final void OooOoO() {
        o00O0O o00o0o2 = this.f40275OooOOOo;
        int iOooOoOO = OooOoOO(o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo, this.f40279OooOo - 1);
        while (true) {
            int i = this.f40279OooOo;
            if (i > iOooOoOO) {
                return;
            }
            this.f40279OooOo = i + 1;
            oo0o0O0 oo0o0o0 = this.f40272OooOOO.get(i);
            OooOo oooOo = oo0o0o0.f40256OooO0Oo;
            if (!oooOo.equals(this.f40281OooOo00)) {
                this.f40269OooOO0.OooO00o(this.f40264OooO0Oo, oooOo, oo0o0o0.f40258OooO0o0, oo0o0o0.f40257OooO0o, oo0o0o0.f40259OooO0oO);
            }
            this.f40281OooOo00 = oooOo;
        }
    }

    public final boolean OooOoO0() {
        return this.f40282OooOo0O != -9223372036854775807L;
    }

    public final int OooOoOO(int i, int i2) {
        ArrayList<oo0o0O0> arrayList;
        do {
            i2++;
            arrayList = this.f40272OooOOO;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i2).OooO0o0(0) <= i);
        return i2 - 1;
    }
}
