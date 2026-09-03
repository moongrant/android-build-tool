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
    public final /* synthetic */ Context f11835OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f11836OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f11837OooO0OO;

    public OooOOO0(Context context, String str, String str2) {
        this.f11835OooO00o = context;
        this.f11836OooO0O0 = str;
        this.f11837OooO0OO = str2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        OooOO0 oooOO1;
        o00Ooo<OooOO0> o00ooo2;
        OooOO0 oooOO2;
        Pair pair;
        Context context = this.f11835OooO00o;
        oo0O.OooO oooO = OooO0OO.f11807OooO0O0;
        if (oooO == null) {
            synchronized (oo0O.OooO.class) {
                oooO = OooO0OO.f11807OooO0O0;
                if (oooO == null) {
                    oooO = new oo0O.OooO(OooO0OO.OooO0O0(context), new oo0O.OooO0O0());
                    OooO0OO.f11807OooO0O0 = oooO;
                }
            }
        }
        String str = this.f11836OooO0O0;
        String str2 = this.f11837OooO0OO;
        boolean z = false;
        AutoCloseable autoCloseable = null;
        if (str2 == null) {
            oooOO1 = null;
        } else {
            oo0O.OooO0o oooO0o = oooO.f60306OooO00o;
            oooO0o.getClass();
            try {
                File fileOooO0O0 = oooO0o.OooO0O0();
                FileExtension fileExtension = FileExtension.JSON;
                File file = new File(fileOooO0O0, oo0O.OooO0o.OooO00o(str, fileExtension, false));
                if (!file.exists()) {
                    file = new File(oooO0o.OooO0O0(), oo0O.OooO0o.OooO00o(str, FileExtension.ZIP, false));
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
                    o00OOO0.OooOO0.OooO00o();
                    pair = new Pair(fileExtension, fileInputStream);
                }
            } catch (FileNotFoundException unused) {
            }
            if (pair == null) {
                oooOO1 = null;
            } else {
                FileExtension fileExtension2 = (FileExtension) pair.first;
                InputStream inputStream = (InputStream) pair.second;
                OooOO0 oooOO3 = (fileExtension2 == FileExtension.ZIP ? OooOO0O.OooO0oO(new ZipInputStream(inputStream), str) : OooOO0O.OooO0OO(inputStream, str)).f12010OooO00o;
                if (oooOO3 != null) {
                    oooOO1 = oooOO3;
                } else {
                    oooOO1 = null;
                }
            }
        }
        if (oooOO1 != null) {
            o00ooo2 = new o00Ooo<>(oooOO1);
        } else {
            o00OOO0.OooOO0.OooO00o();
            o00OOO0.OooOO0.OooO00o();
            try {
                try {
                    oooO.f60307OooO0O0.getClass();
                    oo0O.OooO00o OooO00o2 = oo0O.OooO0O0.OooO00o(str);
                    HttpURLConnection httpURLConnection = OooO00o2.f60308OooO0Oo;
                    try {
                        if (httpURLConnection.getResponseCode() / 100 == 2) {
                            z = true;
                        }
                    } catch (IOException unused2) {
                    }
                    if (z) {
                        o00ooo2 = oooO.OooO00o(str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                        o00OOO0.OooOO0.OooO00o();
                    } else {
                        o00ooo2 = new o00Ooo<>(new IllegalArgumentException(OooO00o2.OooO00o()));
                    }
                    try {
                        OooO00o2.close();
                    } catch (IOException e) {
                        o00OOO0.OooOO0.OooO0OO("LottieFetchResult close failed ", e);
                    }
                } catch (Exception e2) {
                    o00Ooo<OooOO0> o00ooo3 = new o00Ooo<>(e2);
                    if (0 != 0) {
                        try {
                            autoCloseable.close();
                        } catch (IOException e3) {
                            o00OOO0.OooOO0.OooO0OO("LottieFetchResult close failed ", e3);
                        }
                    }
                    o00ooo2 = o00ooo3;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException e4) {
                        o00OOO0.OooOO0.OooO0OO("LottieFetchResult close failed ", e4);
                    }
                }
                throw th;
            }
        }
        String str3 = this.f11837OooO0OO;
        if (str3 != null && (oooOO2 = o00ooo2.f12010OooO00o) != null) {
            p135o00OO0o0.o0OOO0o.f37331OooO0O0.f37332OooO00o.put(str3, oooOO2);
        }
        return o00ooo2;
    }
}
