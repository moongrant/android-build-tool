package com.app.upload.qiniu;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.app.impl.StateCallback;
import com.app.model.ImageInfoModel;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.gson.OooOOO0;
import com.qiniu.android.http.ResponseInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public class QiNiuImageInfoSingleAsyncTask extends AsyncTask<String, Integer, String> {
    private String imageUrl;
    private o0000O00<ImageInfoModel> mResultCallback;
    private StateCallback stateCallback;
    private final int Request_TimeOut_Millis = ResponseInfo.UnknownError;
    private final int Connect_TimeOut_Millis = ResponseInfo.UnknownError;
    private final String imageInfo = "imageInfo";

    public QiNiuImageInfoSingleAsyncTask addResultCallback(o0000O00<ImageInfoModel> o0000o00) {
        this.mResultCallback = o0000o00;
        return this;
    }

    public QiNiuImageInfoSingleAsyncTask addStateCallback(StateCallback stateCallback) {
        return this;
    }

    public void getQiNiuImageInfo(String str) {
        this.imageUrl = QiNiuImageUrlHelper.getUrl(str);
        execute("imageInfo");
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7 A[Catch: Exception -> 0x00db, MalformedURLException -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #7 {MalformedURLException -> 0x00de, blocks: (B:34:0x00b3, B:39:0x00bd, B:66:0x00ec, B:72:0x00f9, B:71:0x00f6, B:53:0x00d7), top: B:83:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[Catch: Exception -> 0x00db, MalformedURLException -> 0x00de, TRY_ENTER, TRY_LEAVE, TryCatch #7 {MalformedURLException -> 0x00de, blocks: (B:34:0x00b3, B:39:0x00bd, B:66:0x00ec, B:72:0x00f9, B:71:0x00f6, B:53:0x00d7), top: B:83:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    public String doInBackground(String... strArr) throws Throwable {
        Throwable th;
        Exception exc;
        String str;
        String str2 = null;
        inputStream = null;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        httpURLConnection = null;
        HttpURLConnection httpURLConnection = null;
        str2 = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (stringBuffer.length() == 0) {
                        stringBuffer.append("?");
                    } else {
                        stringBuffer.append("&");
                    }
                    stringBuffer.append(str3);
                }
            }
            try {
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.imageUrl + stringBuffer.toString()).openConnection()));
                        try {
                            httpURLConnection2.setConnectTimeout(ResponseInfo.UnknownError);
                            httpURLConnection2.setReadTimeout(ResponseInfo.UnknownError);
                            httpURLConnection2.setDoInput(true);
                            httpURLConnection2.setRequestMethod("GET");
                            httpURLConnection2.setRequestProperty("Charset", "UTF-8");
                            httpURLConnection2.connect();
                            if (httpURLConnection2.getResponseCode() == 200) {
                                inputStream = httpURLConnection2.getInputStream();
                                try {
                                    httpURLConnection2.getContentLength();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                    while (true) {
                                        int i = inputStream.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i);
                                        try {
                                            exc.printStackTrace();
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            if (inputStream != null) {
                                                return str;
                                            }
                                            try {
                                                inputStream.close();
                                                return str;
                                            } catch (IOException e) {
                                                e = e;
                                                e.printStackTrace();
                                                return str;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    str = new String(byteArrayOutputStream.toByteArray());
                                    try {
                                        byteArrayOutputStream.close();
                                        inputStream.close();
                                        inputStream2 = inputStream;
                                    } catch (Exception e3) {
                                        httpURLConnection = httpURLConnection2;
                                        exc = e3;
                                        exc.printStackTrace();
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        if (inputStream != null) {
                                            return str;
                                        }
                                        inputStream.close();
                                        return str;
                                    } catch (Throwable th3) {
                                        httpURLConnection = httpURLConnection2;
                                        th = th3;
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    httpURLConnection = httpURLConnection2;
                                    exc = e4;
                                    str = null;
                                } catch (Throwable th4) {
                                    httpURLConnection = httpURLConnection2;
                                    th = th4;
                                }
                            } else {
                                str = null;
                            }
                            httpURLConnection2.disconnect();
                            if (inputStream2 == null) {
                                return str;
                            }
                            try {
                                inputStream2.close();
                                return str;
                            } catch (IOException e5) {
                                e = e5;
                                e.printStackTrace();
                                return str;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            httpURLConnection = httpURLConnection2;
                            exc = e;
                            str = str2;
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = httpURLConnection2;
                            th = th;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (MalformedURLException e8) {
                    e = e8;
                    str2 = null;
                    e.printStackTrace();
                    return str2;
                }
            } catch (Exception e9) {
                e = e9;
                str2 = null;
                e.printStackTrace();
                return str2;
            }
        } catch (MalformedURLException e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        boolean z = false;
        ImageInfoModel imageInfoModel = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                z = true;
                imageInfoModel = (ImageInfoModel) new OooOOO0().OooO0OO(str, ImageInfoModel.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (imageInfoModel == null) {
            imageInfoModel = new ImageInfoModel();
        }
        imageInfoModel.setUrl(this.imageUrl);
        o0000O00<ImageInfoModel> o0000o00 = this.mResultCallback;
        if (o0000o00 != null) {
            o0000o00.result(z, imageInfoModel);
        }
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate((Object[]) numArr);
    }
}
