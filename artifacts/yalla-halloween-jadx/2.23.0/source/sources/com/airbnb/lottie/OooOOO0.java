package com.airbnb.lottie;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f8745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f8746OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f8747OooO0OO;

    public OooOOO0(Context context, String str, String str2) {
        this.f8745OooO00o = context;
        this.f8746OooO0O0 = str;
        this.f8747OooO0OO = str2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        OooOO0 oooOO1;
        o00Ooo<OooOO0> o00ooo2;
        OooOO0 oooOO2;
        Pair pair;
        Context context = this.f8745OooO00o;
        p114o00O00o.OooOO0O oooOO0O = OooO0OO.f8717OooO0O0;
        if (oooOO0O == null) {
            synchronized (p114o00O00o.OooOO0O.class) {
                oooOO0O = OooO0OO.f8717OooO0O0;
                if (oooOO0O == null) {
                    oooOO0O = new p114o00O00o.OooOO0O(OooO0OO.OooO0O0(context), new p114o00O00o.OooO0o());
                    OooO0OO.f8717OooO0O0 = oooOO0O;
                }
            }
        }
        String str = this.f8746OooO0O0;
        String str2 = this.f8747OooO0OO;
        boolean z = false;
        AutoCloseable autoCloseable = null;
        if (str2 == null) {
            oooOO1 = null;
        } else {
            p114o00O00o.OooOO0 oooOO3 = oooOO0O.f36399OooO00o;
            oooOO3.getClass();
            try {
                File fileOooO0O0 = oooOO3.OooO0O0();
                FileExtension fileExtension = FileExtension.JSON;
                File file = new File(fileOooO0O0, p114o00O00o.OooOO0.OooO00o(str, fileExtension, false));
                if (!file.exists()) {
                    file = new File(oooOO3.OooO0O0(), p114o00O00o.OooOO0.OooO00o(str, FileExtension.ZIP, false));
                    if (!file.exists()) {
                        file = null;
                    }
                }
                if (file == null) {
                    pair = null;
                } else {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    if (file.getAbsolutePath().endsWith(".zip")) {
                        fileExtension = FileExtension.ZIP;
                    }
                    file.getAbsolutePath();
                    o00O0.OooOO0.OooO00o();
                    pair = new Pair(fileExtension, fileInputStream);
                }
            } catch (FileNotFoundException unused) {
            }
            if (pair == null) {
                oooOO1 = null;
            } else {
                FileExtension fileExtension2 = (FileExtension) pair.first;
                InputStream inputStream = (InputStream) pair.second;
                OooOO0 oooOO4 = (fileExtension2 == FileExtension.ZIP ? OooOO0O.OooO0oO(new ZipInputStream(inputStream), str) : OooOO0O.OooO0OO(inputStream, str)).f8920OooO00o;
                if (oooOO4 != null) {
                    oooOO1 = oooOO4;
                } else {
                    oooOO1 = null;
                }
            }
        }
        if (oooOO1 != null) {
            o00ooo2 = new o00Ooo<>(oooOO1);
        } else {
            o00O0.OooOO0.OooO00o();
            o00O0.OooOO0.OooO00o();
            try {
                try {
                    oooOO0O.f36400OooO0O0.getClass();
                    p114o00O00o.OooO0OO oooO0OOOooO00o = p114o00O00o.OooO0o.OooO00o(str);
                    HttpURLConnection httpURLConnection = oooO0OOOooO00o.f36397OooO0Oo;
                    try {
                        if (httpURLConnection.getResponseCode() / 100 == 2) {
                            z = true;
                        }
                    } catch (IOException unused2) {
                    }
                    if (z) {
                        o00ooo2 = oooOO0O.OooO00o(str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                        o00O0.OooOO0.OooO00o();
                    } else {
                        o00ooo2 = new o00Ooo<>(new IllegalArgumentException(oooO0OOOooO00o.OooO00o()));
                    }
                    try {
                        oooO0OOOooO00o.close();
                    } catch (IOException e) {
                        o00O0.OooOO0.OooO0OO("LottieFetchResult close failed ", e);
                    }
                } catch (Exception e2) {
                    o00Ooo<OooOO0> o00ooo3 = new o00Ooo<>(e2);
                    if (0 != 0) {
                        try {
                            autoCloseable.close();
                        } catch (IOException e3) {
                            o00O0.OooOO0.OooO0OO("LottieFetchResult close failed ", e3);
                        }
                    }
                    o00ooo2 = o00ooo3;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException e4) {
                        o00O0.OooOO0.OooO0OO("LottieFetchResult close failed ", e4);
                    }
                }
                throw th;
            }
        }
        String str3 = this.f8747OooO0OO;
        if (str3 != null && (oooOO2 = o00ooo2.f8920OooO00o) != null) {
            oOO00O.OooOO0.f60844OooO0O0.f60845OooO00o.put(str3, oooOO2);
        }
        return o00ooo2;
    }
}
