package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.OooOO0;
import com.common.support.apm.xlog.XlogWriter;
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
import o000O0O.OooOo;
import o000O0O.OooOo00;
import o000Oo0.OooO;
import o000Oo0.OooO0OO;
import o000Oo0.OooO0o;
import o000Oo0.OooOOO;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CacheDataSource implements androidx.media3.datasource.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Uri f7048OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Cache f7049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f7050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final OooOo00 f7051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f7052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f7053OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f7054OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f7055OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f7056OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public DataSpec f7057OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public DataSpec f7058OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public androidx.media3.datasource.OooO00o f7059OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f7060OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f7061OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f7062OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public OooO f7063OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f7064OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f7065OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f7066OooOOoo;

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

    public static final class OooO00o implements androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Cache f7067OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final FileDataSource.OooO0O0 f7068OooO0O0 = new FileDataSource.OooO0O0();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f7069OooO0OO = OooO0o.f34795OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f7070OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7071OooO0o0;

        @Override // androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o
        public final androidx.media3.datasource.OooO00o OooO00o() {
            androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o = this.f7070OooO0Oo;
            return OooO0O0(interfaceC0142OooO00o != null ? interfaceC0142OooO00o.OooO00o() : null, this.f7071OooO0o0, 0);
        }

        public final CacheDataSource OooO0O0(@Nullable androidx.media3.datasource.OooO00o oooO00o, int i, int i2) {
            Cache cache = this.f7067OooO00o;
            cache.getClass();
            CacheDataSink cacheDataSink = oooO00o == null ? null : new CacheDataSink(cache);
            this.f7068OooO0O0.getClass();
            return new CacheDataSource(cache, oooO00o, new FileDataSource(), cacheDataSink, this.f7069OooO0OO, i, i2);
        }
    }

    public CacheDataSource(Cache cache, androidx.media3.datasource.OooO00o oooO00o, FileDataSource fileDataSource, CacheDataSink cacheDataSink, OooO0OO oooO0OO, int i, int i2) {
        this.f7049OooO00o = cache;
        this.f7050OooO0O0 = fileDataSource;
        this.f7054OooO0o0 = oooO0OO == null ? OooO0o.f34795OooO0O0 : oooO0OO;
        this.f7053OooO0o = (i & 1) != 0;
        this.f7055OooO0oO = (i & 2) != 0;
        this.f7056OooO0oo = (i & 4) != 0;
        if (oooO00o != null) {
            this.f7052OooO0Oo = oooO00o;
            this.f7051OooO0OO = cacheDataSink != null ? new OooOo00(oooO00o, cacheDataSink) : null;
        } else {
            this.f7052OooO0Oo = OooOO0.f7021OooO00o;
            this.f7051OooO0OO = null;
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws Throwable {
        boolean z;
        byte b;
        CacheDataSource cacheDataSource = this;
        Cache cache = cacheDataSource.f7049OooO00o;
        try {
            ((OooO0OO) cacheDataSource.f7054OooO0o0).getClass();
            String string = dataSpec.f6977OooO0oo;
            if (string == null) {
                string = dataSpec.f6970OooO00o.toString();
            }
            long j = dataSpec.f6974OooO0o;
            Uri uri = dataSpec.f6970OooO00o;
            long j2 = dataSpec.f6971OooO0O0;
            int i = dataSpec.f6972OooO0OO;
            byte[] bArr = dataSpec.f6973OooO0Oo;
            Map<String, String> map = dataSpec.f6975OooO0o0;
            long j3 = dataSpec.f6974OooO0o;
            try {
                long j4 = dataSpec.f6976OooO0oO;
                int i2 = dataSpec.f6969OooO;
                Object obj = dataSpec.f6978OooOO0;
                o00Oo0.OooO0oO(uri, "The uri must be set.");
                DataSpec dataSpec2 = new DataSpec(uri, j2, i, bArr, map, j3, j4, string, i2, obj);
                cacheDataSource = this;
                cacheDataSource.f7057OooOO0 = dataSpec2;
                Uri uri2 = dataSpec2.f6970OooO00o;
                byte[] bArr2 = cache.OooO00o(string).f34833OooO0O0.get("exo_redir");
                Uri uri3 = null;
                String str = bArr2 != null ? new String(bArr2, com.google.common.base.OooOO0.f18592OooO0OO) : null;
                if (str != null) {
                    uri3 = Uri.parse(str);
                }
                if (uri3 != null) {
                    uri2 = uri3;
                }
                cacheDataSource.f7048OooO = uri2;
                cacheDataSource.f7060OooOOO = j;
                boolean z2 = cacheDataSource.f7055OooO0oO;
                long j5 = dataSpec.f6976OooO0oO;
                if (z2 && cacheDataSource.f7065OooOOo0) {
                    b = 0;
                } else {
                    b = (cacheDataSource.f7056OooO0oo && j5 == -1) ? (byte) 1 : (byte) -1;
                }
                boolean z3 = b != -1;
                cacheDataSource.f7064OooOOo = z3;
                if (z3) {
                    cacheDataSource.f7062OooOOOO = -1L;
                } else {
                    long jOooO00o = OooOOO.OooO00o(cache.OooO00o(string));
                    cacheDataSource.f7062OooOOOO = jOooO00o;
                    if (jOooO00o != -1) {
                        long j6 = jOooO00o - j;
                        cacheDataSource.f7062OooOOOO = j6;
                        if (j6 < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                }
                if (j5 != -1) {
                    long j7 = cacheDataSource.f7062OooOOOO;
                    cacheDataSource.f7062OooOOOO = j7 == -1 ? j5 : Math.min(j7, j5);
                }
                long j8 = cacheDataSource.f7062OooOOOO;
                if (j8 > 0 || j8 == -1) {
                    z = false;
                    try {
                        cacheDataSource.OooOOO0(dataSpec2, false);
                    } catch (Throwable th) {
                        th = th;
                        if (cacheDataSource.f7059OooOO0o == cacheDataSource.f7050OooO0O0) {
                            z = true;
                        }
                        if (z || (th instanceof Cache.CacheException)) {
                            cacheDataSource.f7065OooOOo0 = true;
                        }
                        throw th;
                    }
                } else {
                    z = false;
                }
                return j5 != -1 ? j5 : cacheDataSource.f7062OooOOOO;
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

    @Override // androidx.media3.datasource.OooO00o
    public final Map<String, List<String>> OooO0Oo() {
        return (this.f7059OooOO0o == this.f7050OooO0O0) ^ true ? this.f7052OooO0Oo.OooO0Oo() : Collections.emptyMap();
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void OooO0oO(OooOo oooOo) {
        oooOo.getClass();
        this.f7050OooO0O0.OooO0oO(oooOo);
        this.f7052OooO0Oo.OooO0oO(oooOo);
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        return this.f7048OooO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() throws IOException {
        Cache cache = this.f7049OooO00o;
        androidx.media3.datasource.OooO00o oooO00o = this.f7059OooOO0o;
        if (oooO00o == null) {
            return;
        }
        try {
            oooO00o.close();
        } finally {
            this.f7058OooOO0O = null;
            this.f7059OooOO0o = null;
            OooO oooO = this.f7063OooOOOo;
            if (oooO != null) {
                cache.OooO0O0(oooO);
                this.f7063OooOOOo = null;
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
        o000Oo0.o00Oo0 o00oo0OooO0Oo;
        androidx.media3.datasource.OooO00o oooO00o;
        String str;
        androidx.media3.datasource.OooO00o oooO00o2;
        DataSpec dataSpec2;
        Cache cache;
        androidx.media3.datasource.OooO00o oooO00o3;
        androidx.media3.datasource.OooO00o oooO00o4;
        long j;
        long jOooO00o;
        o000Oo0.OooOo00 oooOo00;
        long j2;
        ArrayList arrayList;
        HashMap map;
        boolean z2;
        boolean z3;
        boolean z4;
        Uri uriOooOO0O;
        Uri uri;
        boolean z5;
        String str2 = dataSpec.f6977OooO0oo;
        int i = o00.f34910OooO00o;
        if (this.f7064OooOOo) {
            o00oo0OooO0Oo = null;
        } else if (this.f7053OooO0o) {
            try {
                o00oo0OooO0Oo = this.f7049OooO00o.OooO0Oo(this.f7060OooOOO, this.f7062OooOOOO, str2);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            o00oo0OooO0Oo = this.f7049OooO00o.OooO0o0(this.f7060OooOOO, this.f7062OooOOOO, str2);
        }
        androidx.media3.datasource.OooO00o oooO00o5 = this.f7050OooO0O0;
        OooOo00 oooOo01 = this.f7051OooO0OO;
        Cache cache2 = this.f7049OooO00o;
        androidx.media3.datasource.OooO00o oooO00o6 = this.f7052OooO0Oo;
        if (o00oo0OooO0Oo == null) {
            Uri uri2 = dataSpec.f6970OooO00o;
            str = str2;
            long j3 = dataSpec.f6971OooO0O0;
            int i2 = dataSpec.f6972OooO0OO;
            byte[] bArr = dataSpec.f6973OooO0Oo;
            Map<String, String> map2 = dataSpec.f6975OooO0o0;
            String str3 = dataSpec.f6977OooO0oo;
            int i3 = dataSpec.f6969OooO;
            oooO00o = oooO00o5;
            Object obj = dataSpec.f6978OooOO0;
            oooO00o2 = oooO00o6;
            long j4 = this.f7060OooOOO;
            o000Oo0.o00Oo0 o00oo1 = o00oo0OooO0Oo;
            long j5 = this.f7062OooOOOO;
            o00Oo0.OooO0oO(uri2, "The uri must be set.");
            dataSpec2 = new DataSpec(uri2, j3, i2, bArr, map2, j4, j5, str3, i3, obj);
            cache = cache2;
            oooO00o3 = oooO00o2;
            o00oo0OooO0Oo = o00oo1;
        } else {
            oooO00o = oooO00o5;
            str = str2;
            oooO00o2 = oooO00o6;
            boolean z6 = o00oo0OooO0Oo.f34788OooO0oO;
            long jMin = o00oo0OooO0Oo.f34786OooO0o;
            if (z6) {
                Uri uriFromFile = Uri.fromFile(o00oo0OooO0Oo.f34789OooO0oo);
                long j6 = this.f7060OooOOO;
                long j7 = o00oo0OooO0Oo.f34787OooO0o0;
                long j8 = j6 - j7;
                long jMin2 = jMin - j8;
                long j9 = this.f7062OooOOOO;
                if (j9 != -1) {
                    jMin2 = Math.min(jMin2, j9);
                }
                long j10 = jMin2;
                int i4 = dataSpec.f6972OooO0OO;
                byte[] bArr2 = dataSpec.f6973OooO0Oo;
                Map<String, String> map3 = dataSpec.f6975OooO0o0;
                String str4 = dataSpec.f6977OooO0oo;
                int i5 = dataSpec.f6969OooO;
                Object obj2 = dataSpec.f6978OooOO0;
                o00Oo0.OooO0oO(uriFromFile, "The uri must be set.");
                dataSpec2 = new DataSpec(uriFromFile, j7, i4, bArr2, map3, j8, j10, str4, i5, obj2);
                oooO00o3 = oooO00o;
            } else {
                if (jMin == -1) {
                    jMin = this.f7062OooOOOO;
                } else {
                    long j11 = this.f7062OooOOOO;
                    if (j11 != -1) {
                        jMin = Math.min(jMin, j11);
                    }
                }
                long j12 = jMin;
                Uri uri3 = dataSpec.f6970OooO00o;
                long j13 = dataSpec.f6971OooO0O0;
                int i6 = dataSpec.f6972OooO0OO;
                byte[] bArr3 = dataSpec.f6973OooO0Oo;
                Map<String, String> map4 = dataSpec.f6975OooO0o0;
                String str5 = dataSpec.f6977OooO0oo;
                int i7 = dataSpec.f6969OooO;
                Object obj3 = dataSpec.f6978OooOO0;
                long j14 = this.f7060OooOOO;
                o00Oo0.OooO0oO(uri3, "The uri must be set.");
                dataSpec2 = new DataSpec(uri3, j13, i6, bArr3, map4, j14, j12, str5, i7, obj3);
                if (oooOo01 != null) {
                    oooO00o3 = oooOo01;
                } else {
                    cache = cache2;
                    cache.OooO0O0(o00oo0OooO0Oo);
                    oooO00o3 = oooO00o2;
                    o00oo0OooO0Oo = null;
                }
            }
            cache = cache2;
        }
        if (!this.f7064OooOOo) {
            oooO00o4 = oooO00o2;
            if (oooO00o3 == oooO00o4) {
                j = this.f7060OooOOO + XlogWriter.DEFAULT_MAX_FILE_SIZE;
            }
            this.f7066OooOOoo = j;
            if (z) {
                if (this.f7059OooOO0o == oooO00o4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                o00Oo0.OooO0Oo(z5);
                if (oooO00o3 == oooO00o4) {
                    return;
                }
                try {
                    OooOO0o();
                } catch (Throwable th) {
                    if (!(!o00oo0OooO0Oo.f34788OooO0oO)) {
                        throw th;
                    }
                    cache.OooO0O0(o00oo0OooO0Oo);
                    throw th;
                }
            }
            if (o00oo0OooO0Oo != null && (!o00oo0OooO0Oo.f34788OooO0oO)) {
                this.f7063OooOOOo = o00oo0OooO0Oo;
            }
            this.f7059OooOO0o = oooO00o3;
            this.f7058OooOO0O = dataSpec2;
            this.f7061OooOOO0 = 0L;
            jOooO00o = oooO00o3.OooO00o(dataSpec2);
            oooOo00 = new o000Oo0.OooOo00();
            j2 = dataSpec2.f6976OooO0oO;
            arrayList = oooOo00.f34835OooO0O0;
            map = oooOo00.f34834OooO00o;
            if (j2 == -1 && jOooO00o != -1) {
                this.f7062OooOOOO = jOooO00o;
                Long lValueOf = Long.valueOf(this.f7060OooOOO + jOooO00o);
                lValueOf.getClass();
                map.put("exo_len", lValueOf);
                arrayList.remove("exo_len");
            }
            if (this.f7059OooOO0o == oooO00o) {
                z2 = true;
                z3 = true;
            } else {
                z2 = true;
                z3 = false;
            }
            if (z3 ^ z2) {
                uriOooOO0O = oooO00o3.OooOO0O();
                this.f7048OooO = uriOooOO0O;
                if (dataSpec.f6970OooO00o.equals(uriOooOO0O) ^ z2) {
                    uri = this.f7048OooO;
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
            if (this.f7059OooOO0o == oooOo01) {
                z4 = z2;
            } else {
                z4 = false;
            }
            if (z4) {
                cache.OooO0oo(str, oooOo00);
            }
        }
        oooO00o4 = oooO00o2;
        j = LongCompanionObject.MAX_VALUE;
        this.f7066OooOOoo = j;
        if (z) {
            if (this.f7059OooOO0o == oooO00o4) {
                z5 = true;
            } else {
                z5 = false;
            }
            o00Oo0.OooO0Oo(z5);
            if (oooO00o3 == oooO00o4) {
                return;
            } else {
                OooOO0o();
            }
        }
        if (o00oo0OooO0Oo != null) {
            this.f7063OooOOOo = o00oo0OooO0Oo;
        }
        this.f7059OooOO0o = oooO00o3;
        this.f7058OooOO0O = dataSpec2;
        this.f7061OooOOO0 = 0L;
        jOooO00o = oooO00o3.OooO00o(dataSpec2);
        oooOo00 = new o000Oo0.OooOo00();
        j2 = dataSpec2.f6976OooO0oO;
        arrayList = oooOo00.f34835OooO0O0;
        map = oooOo00.f34834OooO00o;
        if (j2 == -1) {
            this.f7062OooOOOO = jOooO00o;
            Long lValueOf2 = Long.valueOf(this.f7060OooOOO + jOooO00o);
            lValueOf2.getClass();
            map.put("exo_len", lValueOf2);
            arrayList.remove("exo_len");
        }
        if (this.f7059OooOO0o == oooO00o) {
            z2 = true;
            z3 = true;
        } else {
            z2 = true;
            z3 = false;
        }
        if (z3 ^ z2) {
            uriOooOO0O = oooO00o3.OooOO0O();
            this.f7048OooO = uriOooOO0O;
            if (dataSpec.f6970OooO00o.equals(uriOooOO0O) ^ z2) {
                uri = this.f7048OooO;
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
        if (this.f7059OooOO0o == oooOo01) {
            z4 = z2;
        } else {
            z4 = false;
        }
        if (z4) {
            cache.OooO0oo(str, oooOo00);
        }
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() throws IOException {
        this.f7057OooOO0 = null;
        this.f7048OooO = null;
        this.f7060OooOOO = 0L;
        try {
            OooOO0o();
        } catch (Throwable th) {
            if ((this.f7059OooOO0o == this.f7050OooO0O0) || (th instanceof Cache.CacheException)) {
                this.f7065OooOOo0 = true;
            }
            throw th;
        }
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        androidx.media3.datasource.OooO00o oooO00o = this.f7050OooO0O0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f7062OooOOOO == 0) {
            return -1;
        }
        DataSpec dataSpec = this.f7057OooOO0;
        dataSpec.getClass();
        DataSpec dataSpec2 = this.f7058OooOO0O;
        dataSpec2.getClass();
        try {
            if (this.f7060OooOOO >= this.f7066OooOOoo) {
                OooOOO0(dataSpec, true);
            }
            androidx.media3.datasource.OooO00o oooO00o2 = this.f7059OooOO0o;
            oooO00o2.getClass();
            int i4 = oooO00o2.read(bArr, i, i2);
            if (i4 != -1) {
                if (this.f7059OooOO0o == oooO00o) {
                }
                long j = i4;
                this.f7060OooOOO += j;
                this.f7061OooOOO0 += j;
                long j2 = this.f7062OooOOOO;
                if (j2 != -1) {
                    this.f7062OooOOOO = j2 - j;
                }
                return i4;
            }
            androidx.media3.datasource.OooO00o oooO00o3 = this.f7059OooOO0o;
            if (!(oooO00o3 == oooO00o)) {
                i3 = i4;
                long j3 = dataSpec2.f6976OooO0oO;
                if (j3 == -1 || this.f7061OooOOO0 < j3) {
                    String str = dataSpec.f6977OooO0oo;
                    int i5 = o00.f34910OooO00o;
                    this.f7062OooOOOO = 0L;
                    if (!(oooO00o3 == this.f7051OooO0OO)) {
                        return i3;
                    }
                    o000Oo0.OooOo00 oooOo00 = new o000Oo0.OooOo00();
                    Long lValueOf = Long.valueOf(this.f7060OooOOO);
                    HashMap map = oooOo00.f34834OooO00o;
                    lValueOf.getClass();
                    map.put("exo_len", lValueOf);
                    oooOo00.f34835OooO0O0.remove("exo_len");
                    this.f7049OooO00o.OooO0oo(str, oooOo00);
                    return i3;
                }
            } else {
                i3 = i4;
            }
            long j4 = this.f7062OooOOOO;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            OooOO0o();
            OooOOO0(dataSpec, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if ((this.f7059OooOO0o == oooO00o) || (th instanceof Cache.CacheException)) {
                this.f7065OooOOo0 = true;
            }
            throw th;
        }
    }
}
