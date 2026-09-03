package p246o00oo0o0;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.compose.ui.graphics.o0o0Oo;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import p244o00oo0Oo.o00O000;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CacheDataSource f40689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Cache f40690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DataSpec f40691OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f40692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final OooO00o f40693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f40694OooO0o0 = new byte[131072];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f40695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f40696OooO0oo;

    public interface OooO00o {
    }

    public o000O0O0(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable OooO00o oooO00o) {
        this.f40689OooO00o = cacheDataSource;
        this.f40690OooO0O0 = cacheDataSource.f14280OooO00o;
        this.f40691OooO0OO = dataSpec;
        this.f40693OooO0o = oooO00o;
        ((o000O0) cacheDataSource.f14285OooO0o0).getClass();
        String str = dataSpec.f14168OooO0oo;
        this.f40692OooO0Oo = str == null ? dataSpec.f14161OooO00o.toString() : str;
        this.f40695OooO0oO = dataSpec.f14165OooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144 A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014f A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158 A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0160 A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x016a A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x0175 A[Catch: IOException -> 0x013b, TryCatch #2 {IOException -> 0x013b, blocks: (B:60:0x0124, B:76:0x0144, B:79:0x014f, B:83:0x015a, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:89:0x016a, B:95:0x0177, B:94:0x0175, B:63:0x012b, B:69:0x0138, B:68:0x0136), top: B:106:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    @WorkerThread
    public final void OooO00o() throws Throwable {
        OooO00o oooO00o;
        long jOooO00o;
        boolean z;
        CacheDataSource cacheDataSource;
        int i;
        o000O0O0 o000o0o1;
        int i2;
        int i3;
        long j;
        long j2;
        o000O0O0 o000o0o2 = this;
        Cache cache = o000o0o2.f40690OooO0O0;
        String str = o000o0o2.f40692OooO0Oo;
        DataSpec dataSpec = o000o0o2.f40691OooO0OO;
        cache.OooO0oO(dataSpec.f14165OooO0o, dataSpec.f14167OooO0oO, str);
        long j3 = dataSpec.f14167OooO0oO;
        long j4 = -1;
        if (j3 != -1) {
            o000o0o2.f40696OooO0oo = dataSpec.f14165OooO0o + j3;
        } else {
            long jOooO00o2 = o0o0Oo.OooO00o(o000o0o2.f40690OooO0O0.OooO00o(o000o0o2.f40692OooO0Oo));
            if (jOooO00o2 == -1) {
                jOooO00o2 = -1;
            }
            o000o0o2.f40696OooO0oo = jOooO00o2;
        }
        OooO00o oooO00o2 = o000o0o2.f40693OooO0o;
        if (oooO00o2 != null) {
            if (o000o0o2.f40696OooO0oo != -1) {
                long j5 = dataSpec.f14165OooO0o;
            }
            Map<Long, Float> map = VideoPreloadWorker.f32839OooOOOO;
        }
        while (true) {
            long j6 = o000o0o2.f40696OooO0oo;
            if (j6 != -1 && o000o0o2.f40695OooO0oO >= j6) {
                return;
            }
            long jOooO0Oo = o000o0o2.f40690OooO0O0.OooO0Oo(o000o0o2.f40695OooO0oO, j6 == -1 ? Long.MAX_VALUE : j6 - o000o0o2.f40695OooO0oO, o000o0o2.f40692OooO0Oo);
            if (jOooO0Oo > 0) {
                o000o0o2.f40695OooO0oO += jOooO0Oo;
                o000o0o1 = o000o0o2;
                oooO00o = oooO00o2;
                j = j4;
            } else {
                long j7 = -jOooO0Oo;
                long j8 = j7 == LongCompanionObject.MAX_VALUE ? -1L : j7;
                long j9 = o000o0o2.f40695OooO0oO;
                boolean z2 = j9 + j8 == o000o0o2.f40696OooO0oo || j8 == -1;
                CacheDataSource cacheDataSource2 = o000o0o2.f40689OooO00o;
                if (j8 != -1) {
                    Uri uri = dataSpec.f14161OooO00o;
                    long j10 = dataSpec.f14162OooO0O0;
                    int i4 = dataSpec.f14163OooO0OO;
                    byte[] bArr = dataSpec.f14164OooO0Oo;
                    Map<String, String> map2 = dataSpec.f14166OooO0o0;
                    String str2 = dataSpec.f14168OooO0oo;
                    int i5 = dataSpec.f14160OooO;
                    oooO00o = oooO00o2;
                    Object obj = dataSpec.f14169OooOO0;
                    o00O000o.OooO0o(uri, "The uri must be set.");
                    try {
                        jOooO00o = cacheDataSource2.OooO00o(new DataSpec(uri, j10, i4, bArr, map2, j9, j8, str2, i5, obj));
                        z = true;
                    } catch (IOException unused) {
                        o00O000.OooO00o(cacheDataSource2);
                        jOooO00o = -1;
                        z = false;
                    }
                    if (z) {
                        cacheDataSource = cacheDataSource2;
                        i = 0;
                    } else {
                        Uri uri2 = dataSpec.f14161OooO00o;
                        long j11 = dataSpec.f14162OooO0O0;
                        int i6 = dataSpec.f14163OooO0OO;
                        byte[] bArr2 = dataSpec.f14164OooO0Oo;
                        Map<String, String> map3 = dataSpec.f14166OooO0o0;
                        String str3 = dataSpec.f14168OooO0oo;
                        int i7 = dataSpec.f14160OooO;
                        Object obj2 = dataSpec.f14169OooOO0;
                        o00O000o.OooO0o(uri2, "The uri must be set.");
                        i = 0;
                        try {
                            long jOooO00o3 = cacheDataSource2.OooO00o(new DataSpec(uri2, j11, i6, bArr2, map3, j9, -1L, str3, i7, obj2));
                            cacheDataSource = cacheDataSource2;
                            jOooO00o = jOooO00o3;
                        } catch (IOException e) {
                            o00O000.OooO00o(cacheDataSource2);
                            throw e;
                        }
                    }
                    if (z2 || jOooO00o == -1) {
                        o000o0o1 = this;
                    } else {
                        long j12 = jOooO00o + j9;
                        o000o0o1 = this;
                        try {
                            if (o000o0o1.f40696OooO0oo != j12) {
                                o000o0o1.f40696OooO0oo = j12;
                                if (oooO00o != null) {
                                    if (j12 != -1) {
                                        long j13 = dataSpec.f14165OooO0o;
                                    }
                                    Map<Long, Float> map4 = VideoPreloadWorker.f32839OooOOOO;
                                }
                            }
                        } catch (IOException e2) {
                            o00O000.OooO00o(cacheDataSource);
                            throw e2;
                        }
                    }
                    i2 = i;
                    i3 = i2;
                    while (i3 != -1) {
                        byte[] bArr3 = o000o0o1.f40694OooO0o0;
                        i3 = cacheDataSource.read(bArr3, i, bArr3.length);
                        if (i3 == -1) {
                            if (oooO00o != null) {
                                if (o000o0o1.f40696OooO0oo == -1) {
                                    long j14 = dataSpec.f14165OooO0o;
                                }
                                Map<Long, Float> map5 = VideoPreloadWorker.f32839OooOOOO;
                            }
                            i2 += i3;
                        }
                    }
                    if (z2) {
                        j2 = ((long) i2) + j9;
                        if (o000o0o1.f40696OooO0oo == j2) {
                            o000o0o1.f40696OooO0oo = j2;
                            if (oooO00o != null) {
                                j = -1;
                                if (j2 == -1) {
                                    long j15 = dataSpec.f14165OooO0o;
                                }
                                Map<Long, Float> map6 = VideoPreloadWorker.f32839OooOOOO;
                            }
                        }
                        j = -1;
                    } else {
                        j = -1;
                    }
                    cacheDataSource.close();
                    o000o0o1.f40695OooO0oO = j9 + ((long) i2);
                } else {
                    oooO00o = oooO00o2;
                }
                jOooO00o = -1;
                z = false;
                if (z) {
                    Uri uri3 = dataSpec.f14161OooO00o;
                    long j16 = dataSpec.f14162OooO0O0;
                    int i8 = dataSpec.f14163OooO0OO;
                    byte[] bArr4 = dataSpec.f14164OooO0Oo;
                    Map<String, String> map7 = dataSpec.f14166OooO0o0;
                    String str4 = dataSpec.f14168OooO0oo;
                    int i9 = dataSpec.f14160OooO;
                    Object obj3 = dataSpec.f14169OooOO0;
                    o00O000o.OooO0o(uri3, "The uri must be set.");
                    i = 0;
                    long jOooO00o4 = cacheDataSource2.OooO00o(new DataSpec(uri3, j16, i8, bArr4, map7, j9, -1L, str4, i9, obj3));
                    cacheDataSource = cacheDataSource2;
                    jOooO00o = jOooO00o4;
                } else {
                    cacheDataSource = cacheDataSource2;
                    i = 0;
                }
                if (z2) {
                    o000o0o1 = this;
                } else {
                    o000o0o1 = this;
                }
                i2 = i;
                i3 = i2;
                while (i3 != -1) {
                    byte[] bArr5 = o000o0o1.f40694OooO0o0;
                    i3 = cacheDataSource.read(bArr5, i, bArr5.length);
                    if (i3 == -1) {
                        if (oooO00o != null) {
                            if (o000o0o1.f40696OooO0oo == -1) {
                                long j17 = dataSpec.f14165OooO0o;
                            }
                            Map<Long, Float> map8 = VideoPreloadWorker.f32839OooOOOO;
                        }
                        i2 += i3;
                    }
                }
                if (z2) {
                    j2 = ((long) i2) + j9;
                    if (o000o0o1.f40696OooO0oo == j2) {
                        o000o0o1.f40696OooO0oo = j2;
                        if (oooO00o != null) {
                            j = -1;
                            if (j2 == -1) {
                                long j18 = dataSpec.f14165OooO0o;
                            }
                            Map<Long, Float> map9 = VideoPreloadWorker.f32839OooOOOO;
                        }
                    }
                    j = -1;
                } else {
                    j = -1;
                }
                cacheDataSource.close();
                o000o0o1.f40695OooO0oO = j9 + ((long) i2);
            }
            o000o0o2 = o000o0o1;
            j4 = j;
            oooO00o2 = oooO00o;
        }
    }
}
