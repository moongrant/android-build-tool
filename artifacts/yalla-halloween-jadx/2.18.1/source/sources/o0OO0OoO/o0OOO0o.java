package o0OO0OoO;

import androidx.annotation.WorkerThread;
import com.efs.sdk.base.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public final class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f37841Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final URL f37842Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final byte[] f37843Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00oO0o f37844Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzeu f37845OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Map f37846OoooO00;

    public o0OOO0o(zzeu zzeuVar, String str, URL url, byte[] bArr, Map map, o00oO0o o00oo0o2) {
        this.f37845OoooO0 = zzeuVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(o00oo0o2);
        this.f37842Oooo0o = url;
        this.f37843Oooo0oO = bArr;
        this.f37844Oooo0oo = o00oo0o2;
        this.f37841Oooo = str;
        this.f37846OoooO00 = map;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f2: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:40:0x00f1 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f7: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:42:0x00f5 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        IOException e;
        Map map;
        int i;
        Throwable th2;
        o0ooOOo o0ooooo2;
        zzfv zzfvVarZzaz;
        Map map2;
        IOException iOException;
        int i2;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream2;
        IOException e2;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.f37845OoooO0.zzax();
        OutputStream outputStream3 = null;
        try {
            zzeu zzeuVar = this.f37845OoooO0;
            URLConnection uRLConnectionOpenConnection = this.f37842Oooo0o.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzeuVar.f37615OooO00o.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzeuVar.f37615OooO00o.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f37846OoooO00;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.f37843Oooo0oO != null) {
                    byte[] bArrOooOooO = this.f37845OoooO0.f37794OooO0O0.zzu().OooOooO(this.f37843Oooo0oO);
                    zzem zzemVarZzj = this.f37845OoooO0.f37615OooO00o.zzay().zzj();
                    int length = bArrOooOooO.length;
                    zzemVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", Constants.CP_GZIP);
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrOooOooO);
                        outputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        HttpURLConnection httpURLConnection3 = httpURLConnection;
                        outputStream2 = outputStream;
                        e2 = e;
                        httpURLConnection2 = httpURLConnection3;
                        map2 = null;
                        iOException = e2;
                        outputStream3 = outputStream2;
                        httpURLConnection = httpURLConnection2;
                        i2 = 0;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e4) {
                                this.f37845OoooO0.f37615OooO00o.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeo.OooO0o0(this.f37841Oooo), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfvVarZzaz = this.f37845OoooO0.f37615OooO00o.zzaz();
                        o0ooooo2 = new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i2, iOException, null, map2);
                        zzfvVarZzaz.zzp(o0ooooo2);
                    } catch (Throwable th3) {
                        th = th3;
                        map = null;
                        outputStream3 = outputStream;
                        th2 = th;
                        i = 0;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e5) {
                                this.f37845OoooO0.f37615OooO00o.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeo.OooO0o0(this.f37841Oooo), e5);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f37845OoooO0.f37615OooO00o.zzaz().zzp(new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i, null, null, map));
                        throw th2;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr);
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzfvVarZzaz = this.f37845OoooO0.f37615OooO00o.zzaz();
                                o0ooooo2 = new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, responseCode, null, byteArray, headerFields);
                            } catch (Throwable th4) {
                                th = th4;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        i2 = responseCode;
                        map2 = map4;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfvVarZzaz = this.f37845OoooO0.f37615OooO00o.zzaz();
                        o0ooooo2 = new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i2, iOException, null, map2);
                    } catch (Throwable th6) {
                        th2 = th6;
                        i = responseCode;
                        map = map3;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f37845OoooO0.f37615OooO00o.zzaz().zzp(new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i, null, null, map));
                        throw th2;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    map2 = null;
                    i2 = responseCode;
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzfvVarZzaz = this.f37845OoooO0.f37615OooO00o.zzaz();
                    o0ooooo2 = new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i2, iOException, null, map2);
                } catch (Throwable th7) {
                    th2 = th7;
                    i = responseCode;
                    map = null;
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f37845OoooO0.f37615OooO00o.zzaz().zzp(new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i, null, null, map));
                    throw th2;
                }
            } catch (IOException e8) {
                e2 = e8;
                httpURLConnection2 = httpURLConnection;
                outputStream2 = null;
                map2 = null;
                iOException = e2;
                outputStream3 = outputStream2;
                httpURLConnection = httpURLConnection2;
                i2 = 0;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzfvVarZzaz = this.f37845OoooO0.f37615OooO00o.zzaz();
                o0ooooo2 = new o0ooOOo(this.f37841Oooo, this.f37844Oooo0oo, i2, iOException, null, map2);
                zzfvVarZzaz.zzp(o0ooooo2);
            } catch (Throwable th8) {
                th = th8;
                outputStream = null;
            }
            zzfvVarZzaz.zzp(o0ooooo2);
        } catch (IOException e9) {
            e = e9;
            outputStream = null;
            httpURLConnection = null;
        } catch (Throwable th9) {
            th = th9;
            outputStream = null;
            httpURLConnection = null;
        }
    }
}
