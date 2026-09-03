package p415o0Oo0ooO;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import oo0o0O0.OooO00o;
import oo0o0O0.OooO0OO;
import p120o00O0Ooo.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends AsyncTask<String, Integer, String> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f45399OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f45400OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO<String> f45401OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f45403OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f45402OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f45404OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f45405OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f45397OooO = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f45398OooO00o = false;

    public x0(File file) {
        this.f45400OooO0OO = file;
        if (file == null || file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static String OooO00o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & UByte.MAX_VALUE;
                if (i < 16) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public final void OooO0O0(String str) {
        this.f45399OooO0O0 = str;
        execute(new String[0]);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        File file;
        int i;
        this.f45404OooO0oO = false;
        this.f45405OooO0oo = "";
        if (!TextUtils.isEmpty(this.f45399OooO0O0) && (file = this.f45400OooO0OO) != null) {
            try {
                String str = this.f45397OooO;
                if (str == null || str.isEmpty()) {
                    str = OooO00o(this.f45399OooO0O0) + o0OO00O.OooO0O0(this.f45399OooO0O0);
                }
                Log.d("downLoadFile", "downLoadFile \n urlStr = " + this.f45399OooO0O0 + "\n filePath = " + file + "\n fileNameNew = " + str);
                if (!TextUtils.isEmpty(str)) {
                    File file2 = new File(file, str);
                    if (this.f45398OooO00o || !file2.exists()) {
                        if (file2.exists()) {
                            file2.delete();
                            file2.createNewFile();
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f45399OooO0O0).openConnection()));
                        InputStream inputStream = httpURLConnection.getInputStream();
                        File file3 = new File(file, str + "temp");
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                        int contentLength = httpURLConnection.getContentLength();
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() >= 400) {
                            i = 0;
                        } else {
                            i = 0;
                            while (inputStream != null && !isCancelled()) {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                i += i2;
                                int i3 = (i * 100) / contentLength;
                                if (i3 > this.f45402OooO0o) {
                                    this.f45402OooO0o = i3;
                                    publishProgress(Integer.valueOf(i3));
                                }
                            }
                        }
                        httpURLConnection.disconnect();
                        fileOutputStream.close();
                        inputStream.close();
                        if (contentLength == i) {
                            this.f45404OooO0oO = true;
                            if (file3.renameTo(file2)) {
                                this.f45405OooO0oo = file2.getAbsolutePath();
                            } else {
                                this.f45405OooO0oo = file3.getAbsolutePath();
                            }
                        } else {
                            this.f45404OooO0oO = false;
                            this.f45405OooO0oo = "";
                        }
                    } else {
                        this.f45404OooO0oO = true;
                        this.f45405OooO0oo = file2.getAbsolutePath();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f45404OooO0oO = false;
                this.f45405OooO0oo = "";
            }
        }
        return this.f45405OooO0oo;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        super.onPostExecute(str);
        OooO0OO<String> oooO0OO = this.f45401OooO0Oo;
        if (oooO0OO != null) {
            oooO0OO.result(this.f45404OooO0oO, this.f45405OooO0oo);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
        super.onProgressUpdate(numArr);
        OooO00o oooO00o = this.f45403OooO0o0;
        if (oooO00o != null) {
            oooO00o.progress(this.f45402OooO0o);
        }
    }
}
