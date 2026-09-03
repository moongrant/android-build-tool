package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.o0o0Oo;
import com.common.support.apm.xlog.XlogWriter;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.OooOO0O;
import com.google.common.base.OooO;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import p244o00oo0Oo.o00O0O0O;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p246o00oo0o0.o00;
import p246o00oo0o0.o000O0;
import p246o00oo0o0.o000O0Oo;
import p246o00oo0o0.o000OO0O;
import p246o00oo0o0.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CacheDataSource implements com.google.android.exoplayer2.upstream.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Uri f14279OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Cache f14280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f14281OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o00O0O0O f14282OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f14283OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f14284OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0Oo f14285OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f14286OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f14287OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public DataSpec f14288OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public DataSpec f14289OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.upstream.OooO00o f14290OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f14291OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f14292OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f14293OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o000OO0O f14294OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f14295OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14296OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f14297OooOOoo;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o implements com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Cache f14298OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final FileDataSource.OooO0O0 f14299OooO0O0 = new FileDataSource.OooO0O0();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f14300OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f14301OooO0Oo;

        @Override // com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o
        public final com.google.android.exoplayer2.upstream.OooO00o OooO00o() {
            com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o = this.f14300OooO0OO;
            com.google.android.exoplayer2.upstream.OooO00o OooO00o2 = interfaceC0215OooO00o != null ? interfaceC0215OooO00o.OooO00o() : null;
            int i = this.f14301OooO0Oo;
            Cache cache = this.f14298OooO00o;
            cache.getClass();
            CacheDataSink cacheDataSink = OooO00o2 != null ? new CacheDataSink(cache) : null;
            this.f14299OooO0O0.getClass();
            return new CacheDataSource(cache, OooO00o2, new FileDataSource(), cacheDataSink, i);
        }
    }

    public CacheDataSource(Cache cache, com.google.android.exoplayer2.upstream.OooO00o oooO00o, FileDataSource fileDataSource, CacheDataSink cacheDataSink, int i) {
        o000O0 o000o0 = o000O0Oo.f40697OooO0OO;
        this.f14280OooO00o = cache;
        this.f14281OooO0O0 = fileDataSource;
        this.f14285OooO0o0 = o000o0;
        this.f14284OooO0o = (i & 1) != 0;
        this.f14286OooO0oO = (i & 2) != 0;
        this.f14287OooO0oo = (i & 4) != 0;
        if (oooO00o != null) {
            this.f14283OooO0Oo = oooO00o;
            this.f14282OooO0OO = cacheDataSink != null ? new o00O0O0O(oooO00o, cacheDataSink) : null;
        } else {
            this.f14283OooO0Oo = OooOO0O.f14252OooO00o;
            this.f14282OooO0OO = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws Throwable {
        boolean z;
        byte b;
        CacheDataSource cacheDataSource = this;
        Cache cache = cacheDataSource.f14280OooO00o;
        try {
            ((o000O0) cacheDataSource.f14285OooO0o0).getClass();
            String string = dataSpec.f14168OooO0oo;
            if (string == null) {
                string = dataSpec.f14161OooO00o.toString();
            }
            long j = dataSpec.f14165OooO0o;
            Uri uri = dataSpec.f14161OooO00o;
            long j2 = dataSpec.f14162OooO0O0;
            int i = dataSpec.f14163OooO0OO;
            byte[] bArr = dataSpec.f14164OooO0Oo;
            Map<String, String> map = dataSpec.f14166OooO0o0;
            long j3 = dataSpec.f14165OooO0o;
            try {
                long j4 = dataSpec.f14167OooO0oO;
                int i2 = dataSpec.f14160OooO;
                Object obj = dataSpec.f14169OooOO0;
                o00O000o.OooO0o(uri, "The uri must be set.");
                DataSpec dataSpec2 = new DataSpec(uri, j2, i, bArr, map, j3, j4, string, i2, obj);
                cacheDataSource = this;
                cacheDataSource.f14288OooOO0 = dataSpec2;
                Uri uri2 = dataSpec2.f14161OooO00o;
                byte[] bArr2 = cache.OooO00o(string).f40728OooO0O0.get("exo_redir");
                Uri uri3 = null;
                String str = bArr2 != null ? new String(bArr2, OooO.f19059OooO0OO) : null;
                if (str != null) {
                    uri3 = Uri.parse(str);
                }
                if (uri3 != null) {
                    uri2 = uri3;
                }
                cacheDataSource.f14279OooO = uri2;
                cacheDataSource.f14291OooOOO = j;
                boolean z2 = cacheDataSource.f14286OooO0oO;
                long j5 = dataSpec.f14167OooO0oO;
                if (z2 && cacheDataSource.f14296OooOOo0) {
                    b = 0;
                } else {
                    b = (cacheDataSource.f14287OooO0oo && j5 == -1) ? (byte) 1 : (byte) -1;
                }
                boolean z3 = b != -1;
                cacheDataSource.f14295OooOOo = z3;
                if (z3) {
                    cacheDataSource.f14293OooOOOO = -1L;
                } else {
                    long jOooO00o = o0o0Oo.OooO00o(cache.OooO00o(string));
                    cacheDataSource.f14293OooOOOO = jOooO00o;
                    if (jOooO00o != -1) {
                        long j6 = jOooO00o - j;
                        cacheDataSource.f14293OooOOOO = j6;
                        if (j6 < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                }
                if (j5 != -1) {
                    long j7 = cacheDataSource.f14293OooOOOO;
                    cacheDataSource.f14293OooOOOO = j7 == -1 ? j5 : Math.min(j7, j5);
                }
                long j8 = cacheDataSource.f14293OooOOOO;
                if (j8 > 0 || j8 == -1) {
                    z = false;
                    try {
                        cacheDataSource.OooOOO0(dataSpec2, false);
                    } catch (Throwable th) {
                        th = th;
                        if (cacheDataSource.f14290OooOO0o == cacheDataSource.f14281OooO0O0) {
                            z = true;
                        }
                        if (z || (th instanceof Cache.CacheException)) {
                            cacheDataSource.f14296OooOOo0 = true;
                        }
                        throw th;
                    }
                } else {
                    z = false;
                }
                return j5 != -1 ? j5 : cacheDataSource.f14293OooOOOO;
            } catch (Throwable th2) {
                th = th2;
                z = false;
                cacheDataSource = this;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void OooO0OO(o00O0OO0 o00o0oo1) {
        o00o0oo1.getClass();
        this.f14281OooO0O0.OooO0OO(o00o0oo1);
        this.f14283OooO0Oo.OooO0OO(o00o0oo1);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final Map<String, List<String>> OooO0o0() {
        return (this.f14290OooOO0o == this.f14281OooO0O0) ^ true ? this.f14283OooO0Oo.OooO0o0() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f14279OooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() throws IOException {
        Cache cache = this.f14280OooO00o;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14290OooOO0o;
        if (oooO00o == null) {
            return;
        }
        try {
            oooO00o.close();
        } finally {
            this.f14289OooOO0O = null;
            this.f14290OooOO0o = null;
            o000OO0O o000oo0o2 = this.f14294OooOOOo;
            if (o000oo0o2 != null) {
                cache.OooO0OO(o000oo0o2);
                this.f14294OooOOOo = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public final void OooOOO0(DataSpec dataSpec, boolean z) throws IOException {
        o00O00 o00o00OooO0o0;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o;
        String str;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o2;
        DataSpec dataSpec2;
        Cache cache;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o3;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o4;
        long j;
        long jOooO00o;
        o00 o00Var;
        long j2;
        ArrayList arrayList;
        HashMap map;
        boolean z2;
        boolean z3;
        boolean z4;
        Uri uriOooOO0O;
        Uri uri;
        boolean z5;
        String str2 = dataSpec.f14168OooO0oo;
        int i = o0O00.f40595OooO00o;
        if (this.f14295OooOOo) {
            o00o00OooO0o0 = null;
        } else if (this.f14284OooO0o) {
            try {
                o00o00OooO0o0 = this.f14280OooO00o.OooO0o0(this.f14291OooOOO, this.f14293OooOOOO, str2);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            o00o00OooO0o0 = this.f14280OooO00o.OooO0o(this.f14291OooOOO, this.f14293OooOOOO, str2);
        }
        com.google.android.exoplayer2.upstream.OooO00o oooO00o5 = this.f14281OooO0O0;
        o00O0O0O o00o0o0o2 = this.f14282OooO0OO;
        Cache cache2 = this.f14280OooO00o;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o6 = this.f14283OooO0Oo;
        if (o00o00OooO0o0 == null) {
            Uri uri2 = dataSpec.f14161OooO00o;
            str = str2;
            long j3 = dataSpec.f14162OooO0O0;
            int i2 = dataSpec.f14163OooO0OO;
            byte[] bArr = dataSpec.f14164OooO0Oo;
            Map<String, String> map2 = dataSpec.f14166OooO0o0;
            String str3 = dataSpec.f14168OooO0oo;
            int i3 = dataSpec.f14160OooO;
            oooO00o = oooO00o5;
            Object obj = dataSpec.f14169OooOO0;
            oooO00o2 = oooO00o6;
            long j4 = this.f14291OooOOO;
            o00O00 o00o01 = o00o00OooO0o0;
            long j5 = this.f14293OooOOOO;
            o00O000o.OooO0o(uri2, "The uri must be set.");
            dataSpec2 = new DataSpec(uri2, j3, i2, bArr, map2, j4, j5, str3, i3, obj);
            cache = cache2;
            oooO00o3 = oooO00o2;
            o00o00OooO0o0 = o00o01;
        } else {
            oooO00o = oooO00o5;
            str = str2;
            oooO00o2 = oooO00o6;
            boolean z6 = o00o00OooO0o0.f40720OooO0oO;
            long jMin = o00o00OooO0o0.f40718OooO0o;
            if (z6) {
                Uri uriFromFile = Uri.fromFile(o00o00OooO0o0.f40721OooO0oo);
                long j6 = this.f14291OooOOO;
                long j7 = o00o00OooO0o0.f40719OooO0o0;
                long j8 = j6 - j7;
                long jMin2 = jMin - j8;
                long j9 = this.f14293OooOOOO;
                if (j9 != -1) {
                    jMin2 = Math.min(jMin2, j9);
                }
                long j10 = jMin2;
                int i4 = dataSpec.f14163OooO0OO;
                byte[] bArr2 = dataSpec.f14164OooO0Oo;
                Map<String, String> map3 = dataSpec.f14166OooO0o0;
                String str4 = dataSpec.f14168OooO0oo;
                int i5 = dataSpec.f14160OooO;
                Object obj2 = dataSpec.f14169OooOO0;
                o00O000o.OooO0o(uriFromFile, "The uri must be set.");
                dataSpec2 = new DataSpec(uriFromFile, j7, i4, bArr2, map3, j8, j10, str4, i5, obj2);
                oooO00o3 = oooO00o;
            } else {
                if (jMin == -1) {
                    jMin = this.f14293OooOOOO;
                } else {
                    long j11 = this.f14293OooOOOO;
                    if (j11 != -1) {
                        jMin = Math.min(jMin, j11);
                    }
                }
                long j12 = jMin;
                Uri uri3 = dataSpec.f14161OooO00o;
                long j13 = dataSpec.f14162OooO0O0;
                int i6 = dataSpec.f14163OooO0OO;
                byte[] bArr3 = dataSpec.f14164OooO0Oo;
                Map<String, String> map4 = dataSpec.f14166OooO0o0;
                String str5 = dataSpec.f14168OooO0oo;
                int i7 = dataSpec.f14160OooO;
                Object obj3 = dataSpec.f14169OooOO0;
                long j14 = this.f14291OooOOO;
                o00O000o.OooO0o(uri3, "The uri must be set.");
                dataSpec2 = new DataSpec(uri3, j13, i6, bArr3, map4, j14, j12, str5, i7, obj3);
                if (o00o0o0o2 != null) {
                    oooO00o3 = o00o0o0o2;
                } else {
                    cache = cache2;
                    cache.OooO0OO(o00o00OooO0o0);
                    oooO00o3 = oooO00o2;
                    o00o00OooO0o0 = null;
                }
            }
            cache = cache2;
        }
        if (!this.f14295OooOOo) {
            oooO00o4 = oooO00o2;
            if (oooO00o3 == oooO00o4) {
                j = this.f14291OooOOO + XlogWriter.DEFAULT_MAX_FILE_SIZE;
            }
            this.f14297OooOOoo = j;
            if (z) {
                if (this.f14290OooOO0o == oooO00o4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                o00O000o.OooO0Oo(z5);
                if (oooO00o3 == oooO00o4) {
                    return;
                }
                try {
                    OooOO0o();
                } catch (Throwable th) {
                    if (!(!o00o00OooO0o0.f40720OooO0oO)) {
                        throw th;
                    }
                    cache.OooO0OO(o00o00OooO0o0);
                    throw th;
                }
            }
            if (o00o00OooO0o0 != null && (!o00o00OooO0o0.f40720OooO0oO)) {
                this.f14294OooOOOo = o00o00OooO0o0;
            }
            this.f14290OooOO0o = oooO00o3;
            this.f14289OooOO0O = dataSpec2;
            this.f14292OooOOO0 = 0L;
            jOooO00o = oooO00o3.OooO00o(dataSpec2);
            o00Var = new o00();
            j2 = dataSpec2.f14167OooO0oO;
            arrayList = o00Var.f40676OooO0O0;
            map = o00Var.f40675OooO00o;
            if (j2 == -1 && jOooO00o != -1) {
                this.f14293OooOOOO = jOooO00o;
                Long lValueOf = Long.valueOf(this.f14291OooOOO + jOooO00o);
                lValueOf.getClass();
                map.put("exo_len", lValueOf);
                arrayList.remove("exo_len");
            }
            if (this.f14290OooOO0o == oooO00o) {
                z2 = true;
                z3 = true;
            } else {
                z2 = true;
                z3 = false;
            }
            if (z3 ^ z2) {
                uriOooOO0O = oooO00o3.OooOO0O();
                this.f14279OooO = uriOooOO0O;
                if (dataSpec.f14161OooO00o.equals(uriOooOO0O) ^ z2) {
                    uri = this.f14279OooO;
                } else {
                    uri = null;
                }
                if (uri == null) {
                    arrayList.add("exo_redir");
                    map.remove("exo_redir");
                } else {
                    String string = uri.toString();
                    string.getClass();
                    map.put("exo_redir", string);
                    arrayList.remove("exo_redir");
                }
            }
            if (this.f14290OooOO0o == o00o0o0o2) {
                z4 = z2;
            } else {
                z4 = false;
            }
            if (z4) {
                cache.OooO0O0(str, o00Var);
            }
        }
        oooO00o4 = oooO00o2;
        j = LongCompanionObject.MAX_VALUE;
        this.f14297OooOOoo = j;
        if (z) {
            if (this.f14290OooOO0o == oooO00o4) {
                z5 = true;
            } else {
                z5 = false;
            }
            o00O000o.OooO0Oo(z5);
            if (oooO00o3 == oooO00o4) {
                return;
            } else {
                OooOO0o();
            }
        }
        if (o00o00OooO0o0 != null) {
            this.f14294OooOOOo = o00o00OooO0o0;
        }
        this.f14290OooOO0o = oooO00o3;
        this.f14289OooOO0O = dataSpec2;
        this.f14292OooOOO0 = 0L;
        jOooO00o = oooO00o3.OooO00o(dataSpec2);
        o00Var = new o00();
        j2 = dataSpec2.f14167OooO0oO;
        arrayList = o00Var.f40676OooO0O0;
        map = o00Var.f40675OooO00o;
        if (j2 == -1) {
            this.f14293OooOOOO = jOooO00o;
            Long lValueOf2 = Long.valueOf(this.f14291OooOOO + jOooO00o);
            lValueOf2.getClass();
            map.put("exo_len", lValueOf2);
            arrayList.remove("exo_len");
        }
        if (this.f14290OooOO0o == oooO00o) {
            z2 = true;
            z3 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        if (z3 ^ z2) {
            uriOooOO0O = oooO00o3.OooOO0O();
            this.f14279OooO = uriOooOO0O;
            if (dataSpec.f14161OooO00o.equals(uriOooOO0O) ^ z2) {
                uri = this.f14279OooO;
            } else {
                uri = null;
            }
            if (uri == null) {
                arrayList.add("exo_redir");
                map.remove("exo_redir");
            } else {
                String string2 = uri.toString();
                string2.getClass();
                map.put("exo_redir", string2);
                arrayList.remove("exo_redir");
            }
        }
        if (this.f14290OooOO0o == o00o0o0o2) {
            z4 = z2;
        } else {
            z4 = false;
        }
        if (z4) {
            cache.OooO0O0(str, o00Var);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() throws IOException {
        this.f14288OooOO0 = null;
        this.f14279OooO = null;
        this.f14291OooOOO = 0L;
        try {
            OooOO0o();
        } catch (Throwable th) {
            if ((this.f14290OooOO0o == this.f14281OooO0O0) || (th instanceof Cache.CacheException)) {
                this.f14296OooOOo0 = true;
            }
            throw th;
        }
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        com.google.android.exoplayer2.upstream.OooO00o oooO00o = this.f14281OooO0O0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f14293OooOOOO == 0) {
            return -1;
        }
        DataSpec dataSpec = this.f14288OooOO0;
        dataSpec.getClass();
        DataSpec dataSpec2 = this.f14289OooOO0O;
        dataSpec2.getClass();
        try {
            if (this.f14291OooOOO >= this.f14297OooOOoo) {
                OooOOO0(dataSpec, true);
            }
            com.google.android.exoplayer2.upstream.OooO00o oooO00o2 = this.f14290OooOO0o;
            oooO00o2.getClass();
            int i4 = oooO00o2.read(bArr, i, i2);
            if (i4 != -1) {
                if (this.f14290OooOO0o == oooO00o) {
                }
                long j = i4;
                this.f14291OooOOO += j;
                this.f14292OooOOO0 += j;
                long j2 = this.f14293OooOOOO;
                if (j2 != -1) {
                    this.f14293OooOOOO = j2 - j;
                }
                return i4;
            }
            com.google.android.exoplayer2.upstream.OooO00o oooO00o3 = this.f14290OooOO0o;
            if (!(oooO00o3 == oooO00o)) {
                i3 = i4;
                long j3 = dataSpec2.f14167OooO0oO;
                if (j3 == -1 || this.f14292OooOOO0 < j3) {
                    String str = dataSpec.f14168OooO0oo;
                    int i5 = o0O00.f40595OooO00o;
                    this.f14293OooOOOO = 0L;
                    if (!(oooO00o3 == this.f14282OooO0OO)) {
                        return i3;
                    }
                    o00 o00Var = new o00();
                    Long lValueOf = Long.valueOf(this.f14291OooOOO);
                    HashMap map = o00Var.f40675OooO00o;
                    lValueOf.getClass();
                    map.put("exo_len", lValueOf);
                    o00Var.f40676OooO0O0.remove("exo_len");
                    this.f14280OooO00o.OooO0O0(str, o00Var);
                    return i3;
                }
            } else {
                i3 = i4;
            }
            long j4 = this.f14293OooOOOO;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            OooOO0o();
            OooOOO0(dataSpec, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if ((this.f14290OooOO0o == oooO00o) || (th instanceof Cache.CacheException)) {
                this.f14296OooOOo0 = true;
            }
            throw th;
        }
    }
}
