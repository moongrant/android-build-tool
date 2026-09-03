package p405o0Oo0OO0;

import android.net.http.HttpResponseCache;
import android.util.Log;
import com.qiniu.android.http.request.Request;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1 f39055Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo00.OooO00o f39056Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ URL f39057Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f39058Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function1 f39059OoooO00;

    public OooOOO(OooOo00.OooO00o oooO00o, URL url, Ref.BooleanRef booleanRef, Function1 function1, Function1 function2) {
        this.f39056Oooo0o = oooO00o;
        this.f39057Oooo0oO = url;
        this.f39058Oooo0oo = booleanRef;
        this.f39055Oooo = function1;
        this.f39059OoooO00 = function2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        try {
            if (HttpResponseCache.getInstalled() == null) {
                Objects.requireNonNull(this.f39056Oooo0o);
                Log.e("SVGAParser", "SVGAParser can not handle cache before install HttpResponseCache. see https://github.com/yyued/SVGAPlayer-Android#cache");
                Log.e("SVGAParser", "在配置 HttpResponseCache 前 SVGAParser 无法缓存. 查看 https://github.com/yyued/SVGAPlayer-Android#cache ");
            }
            URLConnection uRLConnectionOpenConnection = this.f39057Oooo0oO.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                uRLConnectionOpenConnection = null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            if (httpURLConnection != null) {
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setRequestMethod(Request.HttpMethodGet);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[4096];
                        while (!this.f39058Oooo0oo.element && (i = inputStream.read(bArr, 0, 4096)) != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        if (this.f39058Oooo0oo.element) {
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return;
                        }
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        try {
                            this.f39055Oooo.invoke(byteArrayInputStream);
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(byteArrayInputStream, null);
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(byteArrayInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(byteArrayOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(inputStream, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.f39059OoooO00.invoke(e);
        }
    }
}
