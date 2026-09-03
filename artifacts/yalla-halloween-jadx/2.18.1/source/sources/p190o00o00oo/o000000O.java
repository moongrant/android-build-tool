package p190o00o00oo;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;
import p179o00o0.o00O0O;
import p207o00o0oO.o00O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends AsyncTask<String, Integer, String> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f33053OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public File f33054OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O0O<String> f33055OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33057OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f33056OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f33058OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f33059OooO0oo = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f33052OooO00o = false;

    public o000000O(File file) {
        this.f33054OooO0OO = file;
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
            byte[] bArrDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME).digest(str.getBytes("UTF-8"));
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
        this.f33053OooO0O0 = str;
        execute(new String[0]);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        int i;
        this.f33056OooO0o = false;
        this.f33058OooO0oO = "";
        if (!TextUtils.isEmpty(this.f33053OooO0O0) && this.f33054OooO0OO != null) {
            try {
                String str = this.f33059OooO0oo;
                if (str == null || str.isEmpty()) {
                    str = OooO00o(this.f33053OooO0O0) + o00O0.OooO0O0(this.f33053OooO0O0);
                }
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(this.f33054OooO0OO, str);
                    if (this.f33052OooO00o || !file.exists()) {
                        if (file.exists()) {
                            file.delete();
                            file.createNewFile();
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f33053OooO0O0).openConnection();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        File file2 = new File(this.f33054OooO0OO, str + "temp");
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        byte[] bArr = new byte[1024];
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
                                if (i3 > this.f33057OooO0o0) {
                                    this.f33057OooO0o0 = i3;
                                    publishProgress(Integer.valueOf(i3));
                                }
                            }
                        }
                        httpURLConnection.disconnect();
                        fileOutputStream.close();
                        inputStream.close();
                        if (contentLength == i) {
                            this.f33056OooO0o = true;
                            if (file2.renameTo(file)) {
                                this.f33058OooO0oO = file.getAbsolutePath();
                            } else {
                                this.f33058OooO0oO = file2.getAbsolutePath();
                            }
                        } else {
                            this.f33056OooO0o = false;
                            this.f33058OooO0oO = "";
                        }
                    } else {
                        this.f33056OooO0o = true;
                        this.f33058OooO0oO = file.getAbsolutePath();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.f33056OooO0o = false;
                this.f33058OooO0oO = "";
            }
        }
        return this.f33058OooO0oO;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        super.onPostExecute(str);
        o00O0O<String> o00o0o2 = this.f33055OooO0Oo;
        if (o00o0o2 != null) {
            o00o0o2.result(this.f33056OooO0o, this.f33058OooO0oO);
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
