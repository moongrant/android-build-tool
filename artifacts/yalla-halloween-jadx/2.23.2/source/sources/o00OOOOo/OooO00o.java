package o00OOOOo;

import android.os.AsyncTask;
import android.text.TextUtils;
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
import p146o00Oo000.OooOOO0;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AsyncTask<String, Integer, String> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f37462OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f37463OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000O00<String> f37464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f37466OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f37465OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f37467OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f37468OooO0oo = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37461OooO00o = false;

    public OooO00o(File file) {
        this.f37463OooO0OO = file;
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

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        File file;
        int i;
        this.f37465OooO0o = false;
        this.f37467OooO0oO = "";
        if (!TextUtils.isEmpty(this.f37462OooO0O0) && (file = this.f37463OooO0OO) != null) {
            try {
                String str = this.f37468OooO0oo;
                if (str == null || str.isEmpty()) {
                    str = OooO00o(this.f37462OooO0O0) + OooOOO0.OooO0O0(this.f37462OooO0O0);
                }
                if (!TextUtils.isEmpty(str)) {
                    File file2 = new File(file, str);
                    if (this.f37461OooO00o || !file2.exists()) {
                        if (file2.exists()) {
                            file2.delete();
                            file2.createNewFile();
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f37462OooO0O0).openConnection()));
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
                            while (inputStream != null) {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                i += i2;
                                int i3 = (i * 100) / contentLength;
                                if (i3 > this.f37466OooO0o0) {
                                    this.f37466OooO0o0 = i3;
                                    publishProgress(Integer.valueOf(i3));
                                }
                            }
                        }
                        httpURLConnection.disconnect();
                        fileOutputStream.close();
                        inputStream.close();
                        if (contentLength == i) {
                            this.f37465OooO0o = true;
                            if (file3.renameTo(file2)) {
                                this.f37467OooO0oO = file2.getAbsolutePath();
                            } else {
                                this.f37467OooO0oO = file3.getAbsolutePath();
                            }
                        } else {
                            this.f37465OooO0o = false;
                            this.f37467OooO0oO = "";
                        }
                    } else {
                        this.f37465OooO0o = true;
                        this.f37467OooO0oO = file2.getAbsolutePath();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f37465OooO0o = false;
                this.f37467OooO0oO = "";
            }
        }
        return this.f37467OooO0oO;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        super.onPostExecute(str);
        o0000O00<String> o0000o00 = this.f37464OooO0Oo;
        if (o0000o00 != null) {
            o0000o00.result(this.f37465OooO0o, this.f37467OooO0oO);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
        super.onProgressUpdate(numArr);
    }
}
