package o000Oo0;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f34796OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CacheDataSource f34797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Cache f34798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DataSpec f34799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f34800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final OooO00o f34801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f34802OooO0o0 = new byte[131072];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f34803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f34804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile boolean f34805OooOO0;

    public interface OooO00o {
        void onProgress(long j, long j2);
    }

    public OooOO0(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable OooO00o oooO00o) {
        this.f34797OooO00o = cacheDataSource;
        this.f34798OooO0O0 = cacheDataSource.f7049OooO00o;
        this.f34799OooO0OO = dataSpec;
        this.f34801OooO0o = oooO00o;
        ((OooO0OO) cacheDataSource.f7054OooO0o0).getClass();
        String str = dataSpec.f6977OooO0oo;
        this.f34800OooO0Oo = str == null ? dataSpec.f6970OooO00o.toString() : str;
        this.f34803OooO0oO = dataSpec.f6974OooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a5 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b3 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:126:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0166 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x016a A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x017e A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189 A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x019c A[Catch: IOException -> 0x015f, TryCatch #2 {IOException -> 0x015f, blocks: (B:68:0x013e, B:71:0x0145, B:77:0x0159, B:76:0x0154, B:83:0x0166, B:85:0x016a, B:87:0x0174, B:89:0x017e, B:93:0x018f, B:92:0x0189, B:94:0x0192, B:95:0x0194, B:96:0x0199, B:98:0x019c, B:101:0x01a5, B:107:0x01b8, B:106:0x01b3), top: B:122:0x013e }] */
    @WorkerThread
    public final void OooO00o() throws Throwable {
        boolean z;
        String str;
        CacheDataSource cacheDataSource;
        long jOooO00o;
        boolean z2;
        OooOO0 oooOO1;
        int i;
        int i2;
        long j;
        long j2;
        OooO00o oooO00o;
        long j3;
        long j4;
        OooO00o oooO00o2;
        long j5;
        long j6;
        long j7;
        OooO00o oooO00o3;
        long j8;
        OooOO0 oooOO2 = this;
        if (oooOO2.f34805OooOO0) {
            throw new InterruptedIOException();
        }
        Cache cache = oooOO2.f34798OooO0O0;
        String str2 = oooOO2.f34800OooO0Oo;
        DataSpec dataSpec = oooOO2.f34799OooO0OO;
        oooOO2.f34796OooO = cache.OooO0o(dataSpec.f6974OooO0o, dataSpec.f6976OooO0oO, str2);
        long j9 = dataSpec.f6976OooO0oO;
        long j10 = -1;
        if (j9 != -1) {
            oooOO2.f34804OooO0oo = dataSpec.f6974OooO0o + j9;
        } else {
            long jOooO00o2 = OooOOO.OooO00o(oooOO2.f34798OooO0O0.OooO00o(oooOO2.f34800OooO0Oo));
            if (jOooO00o2 == -1) {
                jOooO00o2 = -1;
            }
            oooOO2.f34804OooO0oo = jOooO00o2;
        }
        OooO00o oooO00o4 = oooOO2.f34801OooO0o;
        if (oooO00o4 != null) {
            long j11 = oooOO2.f34804OooO0oo;
            oooO00o4.onProgress(j11 == -1 ? -1L : j11 - oooOO2.f34799OooO0OO.f6974OooO0o, oooOO2.f34796OooO);
        }
        while (true) {
            long j12 = oooOO2.f34804OooO0oo;
            if (j12 != -1 && oooOO2.f34803OooO0oO >= j12) {
                return;
            }
            if (oooOO2.f34805OooOO0) {
                throw new InterruptedIOException();
            }
            long j13 = oooOO2.f34804OooO0oo;
            long jOooO0OO = oooOO2.f34798OooO0O0.OooO0OO(oooOO2.f34803OooO0oO, j13 == -1 ? Long.MAX_VALUE : j13 - oooOO2.f34803OooO0oO, oooOO2.f34800OooO0Oo);
            if (jOooO0OO > 0) {
                oooOO2.f34803OooO0oO += jOooO0OO;
                j = j10;
                oooOO1 = oooOO2;
            } else {
                long j14 = -jOooO0OO;
                long j15 = j14 == LongCompanionObject.MAX_VALUE ? -1L : j14;
                long j16 = oooOO2.f34803OooO0oO;
                boolean z3 = j16 + j15 == oooOO2.f34804OooO0oo || j15 == -1;
                CacheDataSource cacheDataSource2 = oooOO2.f34797OooO00o;
                if (j15 != -1) {
                    Uri uri = dataSpec.f6970OooO00o;
                    long j17 = dataSpec.f6971OooO0O0;
                    int i3 = dataSpec.f6972OooO0OO;
                    byte[] bArr = dataSpec.f6973OooO0Oo;
                    Map<String, String> map = dataSpec.f6975OooO0o0;
                    String str3 = dataSpec.f6977OooO0oo;
                    int i4 = dataSpec.f6969OooO;
                    Object obj = dataSpec.f6978OooOO0;
                    p080o000OoO.o00Oo0.OooO0oO(uri, "The uri must be set.");
                    z = z3;
                    str = "The uri must be set.";
                    cacheDataSource = cacheDataSource2;
                    try {
                        jOooO00o = cacheDataSource.OooO00o(new DataSpec(uri, j17, i3, bArr, map, j16, j15, str3, i4, obj));
                        z2 = true;
                    } catch (IOException unused) {
                        o000O0O.OooO.OooO00o(cacheDataSource);
                        jOooO00o = -1;
                        z2 = false;
                    }
                    oooOO1 = this;
                    if (!z2) {
                        if (!oooOO1.f34805OooOO0) {
                            throw new InterruptedIOException();
                        }
                        Uri uri2 = dataSpec.f6970OooO00o;
                        long j18 = dataSpec.f6971OooO0O0;
                        int i5 = dataSpec.f6972OooO0OO;
                        byte[] bArr2 = dataSpec.f6973OooO0Oo;
                        Map<String, String> map2 = dataSpec.f6975OooO0o0;
                        String str4 = dataSpec.f6977OooO0oo;
                        int i6 = dataSpec.f6969OooO;
                        Object obj2 = dataSpec.f6978OooOO0;
                        p080o000OoO.o00Oo0.OooO0oO(uri2, str);
                        try {
                            jOooO00o = cacheDataSource.OooO00o(new DataSpec(uri2, j18, i5, bArr2, map2, j16, -1L, str4, i6, obj2));
                        } catch (IOException e) {
                            o000O0O.OooO.OooO00o(cacheDataSource);
                            throw e;
                        }
                    }
                    if (z && jOooO00o != -1) {
                        j7 = jOooO00o + j16;
                        try {
                            if (oooOO1.f34804OooO0oo == j7) {
                                oooOO1.f34804OooO0oo = j7;
                                oooO00o3 = oooOO1.f34801OooO0o;
                                if (oooO00o3 != null) {
                                    if (j7 == -1) {
                                        j8 = -1;
                                    } else {
                                        j8 = j7 - oooOO1.f34799OooO0OO.f6974OooO0o;
                                    }
                                    oooO00o3.onProgress(j8, oooOO1.f34796OooO);
                                }
                            }
                        } catch (IOException e2) {
                            o000O0O.OooO.OooO00o(cacheDataSource);
                            throw e2;
                        }
                    }
                    i = 0;
                    i2 = 0;
                    while (i2 != -1) {
                        if (!oooOO1.f34805OooOO0) {
                            throw new InterruptedIOException();
                        }
                        byte[] bArr3 = oooOO1.f34802OooO0o0;
                        i2 = cacheDataSource.read(bArr3, 0, bArr3.length);
                        if (i2 != -1) {
                            j4 = oooOO1.f34796OooO + ((long) i2);
                            oooOO1.f34796OooO = j4;
                            oooO00o2 = oooOO1.f34801OooO0o;
                            if (oooO00o2 != null) {
                                j5 = oooOO1.f34804OooO0oo;
                                if (j5 == -1) {
                                    j6 = -1;
                                } else {
                                    j6 = j5 - oooOO1.f34799OooO0OO.f6974OooO0o;
                                }
                                oooO00o2.onProgress(j6, j4);
                            }
                            i += i2;
                        }
                    }
                    if (z) {
                        j2 = ((long) i) + j16;
                        if (oooOO1.f34804OooO0oo == j2) {
                            oooOO1.f34804OooO0oo = j2;
                            oooO00o = oooOO1.f34801OooO0o;
                            if (oooO00o != null) {
                                j = -1;
                                if (j2 == -1) {
                                    j3 = -1;
                                } else {
                                    j3 = j2 - oooOO1.f34799OooO0OO.f6974OooO0o;
                                }
                                oooO00o.onProgress(j3, oooOO1.f34796OooO);
                            }
                        }
                        j = -1;
                    } else {
                        j = -1;
                    }
                    cacheDataSource.close();
                    oooOO1.f34803OooO0oO = j16 + ((long) i);
                } else {
                    z = z3;
                    str = "The uri must be set.";
                    cacheDataSource = cacheDataSource2;
                }
                jOooO00o = -1;
                z2 = false;
                oooOO1 = this;
                if (!z2) {
                    if (!oooOO1.f34805OooOO0) {
                        throw new InterruptedIOException();
                    }
                    Uri uri3 = dataSpec.f6970OooO00o;
                    long j19 = dataSpec.f6971OooO0O0;
                    int i7 = dataSpec.f6972OooO0OO;
                    byte[] bArr4 = dataSpec.f6973OooO0Oo;
                    Map<String, String> map3 = dataSpec.f6975OooO0o0;
                    String str5 = dataSpec.f6977OooO0oo;
                    int i8 = dataSpec.f6969OooO;
                    Object obj3 = dataSpec.f6978OooOO0;
                    p080o000OoO.o00Oo0.OooO0oO(uri3, str);
                    jOooO00o = cacheDataSource.OooO00o(new DataSpec(uri3, j19, i7, bArr4, map3, j16, -1L, str5, i8, obj3));
                }
                if (z) {
                    j7 = jOooO00o + j16;
                    if (oooOO1.f34804OooO0oo == j7) {
                        oooOO1.f34804OooO0oo = j7;
                        oooO00o3 = oooOO1.f34801OooO0o;
                        if (oooO00o3 != null) {
                            if (j7 == -1) {
                                j8 = -1;
                            } else {
                                j8 = j7 - oooOO1.f34799OooO0OO.f6974OooO0o;
                            }
                            oooO00o3.onProgress(j8, oooOO1.f34796OooO);
                        }
                    }
                }
                i = 0;
                i2 = 0;
                while (i2 != -1) {
                    if (!oooOO1.f34805OooOO0) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr5 = oooOO1.f34802OooO0o0;
                    i2 = cacheDataSource.read(bArr5, 0, bArr5.length);
                    if (i2 != -1) {
                        j4 = oooOO1.f34796OooO + ((long) i2);
                        oooOO1.f34796OooO = j4;
                        oooO00o2 = oooOO1.f34801OooO0o;
                        if (oooO00o2 != null) {
                            j5 = oooOO1.f34804OooO0oo;
                            if (j5 == -1) {
                                j6 = -1;
                            } else {
                                j6 = j5 - oooOO1.f34799OooO0OO.f6974OooO0o;
                            }
                            oooO00o2.onProgress(j6, j4);
                        }
                        i += i2;
                    }
                }
                if (z) {
                    j2 = ((long) i) + j16;
                    if (oooOO1.f34804OooO0oo == j2) {
                        oooOO1.f34804OooO0oo = j2;
                        oooO00o = oooOO1.f34801OooO0o;
                        if (oooO00o != null) {
                            j = -1;
                            if (j2 == -1) {
                                j3 = -1;
                            } else {
                                j3 = j2 - oooOO1.f34799OooO0OO.f6974OooO0o;
                            }
                            oooO00o.onProgress(j3, oooOO1.f34796OooO);
                        }
                    }
                    j = -1;
                } else {
                    j = -1;
                }
                cacheDataSource.close();
                oooOO1.f34803OooO0oO = j16 + ((long) i);
            }
            oooOO2 = oooOO1;
            j10 = j;
        }
    }
}
