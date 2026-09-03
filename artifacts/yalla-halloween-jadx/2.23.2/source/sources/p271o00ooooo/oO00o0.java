package p271o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzgd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
public final class oO00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzez f40576OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final URL f40577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0OOO00 f40578OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f40579OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f40580OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map f40581OooO0oo;

    public oO00o0(zzez zzezVar, String str, URL url, byte[] bArr, Map map, oO0OOO00 oo0ooo00) {
        this.f40576OooO = zzezVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(oo0ooo00);
        this.f40577OooO0Oo = url;
        this.f40579OooO0o0 = bArr;
        this.f40578OooO0o = oo0ooo00;
        this.f40580OooO0oO = str;
        this.f40581OooO0oo = map;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bd A[Catch: all -> 0x00dc, LOOP:1: B:27:0x00b7->B:29:0x00bd, LOOP_END, TryCatch #10 {all -> 0x00dc, blocks: (B:26:0x00b5, B:27:0x00b7, B:29:0x00bd, B:30:0x00c1), top: B:82:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00c1 A[EDGE_INSN: B:94:0x00c1->B:30:0x00c1 BREAK  A[LOOP:1: B:27:0x00b7->B:29:0x00bd], SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:233), block:B:41:0x00e7 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ec: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:237), block:B:43:0x00eb */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException iOException;
        int i;
        Map map;
        Map map2;
        int i2;
        oO00o00O oo00o00o;
        zzga zzgaVarZzaB;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i3;
        String str = this.f40580OooO0oO;
        zzez zzezVar = this.f40576OooO;
        zzezVar.zzaz();
        zzgd zzgdVar = zzezVar.f40788OooO00o;
        int i4 = 0;
        OutputStream outputStream2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.f40577OooO0Oo.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzgdVar.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzgdVar.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f40581OooO0oo;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr2 = this.f40579OooO0o0;
                if (bArr2 != null) {
                    byte[] bArrOooOoo0 = zzezVar.f40509OooO0O0.zzu().OooOoo0(bArr2);
                    zzer zzerVarZzj = zzgdVar.zzaA().zzj();
                    int length = bArrOooOoo0.length;
                    zzerVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrOooOoo0);
                        outputStream.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                        while (true) {
                                            i3 = inputStream.read(bArr);
                                            if (i3 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i3);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzgaVarZzaB = zzgdVar.zzaB();
                                        oo00o00o = new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, responseCode, null, byteArray, headerFields);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = null;
                                }
                            } catch (IOException e) {
                                i = responseCode;
                                map = map4;
                                iOException = e;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e2) {
                                        zzgdVar.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.OooO0Oo(str), e2);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzgaVarZzaB = zzgdVar.zzaB();
                                oo00o00o = new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i, iOException, null, map);
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = responseCode;
                                map2 = map3;
                                if (outputStream2 != null) {
                                    try {
                                        outputStream2.close();
                                    } catch (IOException e3) {
                                        zzgdVar.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.OooO0Oo(str), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzgdVar.zzaB().zzp(new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i2, null, null, map2));
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            i4 = responseCode;
                            iOException = e;
                            i = i4;
                            map = null;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzgaVarZzaB = zzgdVar.zzaB();
                            oo00o00o = new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i, iOException, null, map);
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = responseCode;
                            map2 = null;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzgdVar.zzaB().zzp(new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i2, null, null, map2));
                            throw th;
                        }
                    } catch (IOException e5) {
                        iOException = e5;
                        i = 0;
                        map = null;
                        outputStream2 = outputStream;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgaVarZzaB = zzgdVar.zzaB();
                        oo00o00o = new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i, iOException, null, map);
                        zzgaVarZzaB.zzp(oo00o00o);
                    } catch (Throwable th5) {
                        th = th5;
                        map2 = null;
                        outputStream2 = outputStream;
                        i2 = 0;
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgdVar.zzaB().zzp(new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, i2, null, null, map2));
                        throw th;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    while (true) {
                        i3 = inputStream.read(bArr);
                        if (i3 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i3);
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    zzgaVarZzaB = zzgdVar.zzaB();
                    oo00o00o = new oO00o00O(this.f40580OooO0oO, this.f40578OooO0o, responseCode, null, byteArray2, headerFields2);
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
            }
            zzgaVarZzaB.zzp(oo00o00o);
        } catch (IOException e7) {
            iOException = e7;
            i = 0;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
