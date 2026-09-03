package com.qiniu.android.dns.http;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import com.youth.banner.config.BannerConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class DnspodFree implements IResolver {
    private final String ip;
    private final int timeout;

    public DnspodFree(String str) {
        this(str, 10);
    }

    @Override // com.qiniu.android.dns.IResolver
    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        int contentLength;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("http://" + this.ip + "/d?ttl=1&dn=" + domain.domain).openConnection()));
        httpURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
        httpURLConnection.setReadTimeout(this.timeout * 1000);
        if (httpURLConnection.getResponseCode() == 200 && (contentLength = httpURLConnection.getContentLength()) > 0 && contentLength <= 1024) {
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[contentLength];
            int i = inputStream.read(bArr);
            inputStream.close();
            if (i <= 0) {
                return null;
            }
            String[] strArrSplit = new String(bArr, 0, i).split(",");
            if (strArrSplit.length != 2) {
                return null;
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                String[] strArrSplit2 = strArrSplit[0].split(";");
                if (strArrSplit2.length == 0) {
                    return null;
                }
                Record[] recordArr = new Record[strArrSplit2.length];
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                    recordArr[i3] = new Record(strArrSplit2[i3], 1, i2, jCurrentTimeMillis, Record.Source.DnspodFree);
                }
                return recordArr;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public DnspodFree(String str, int i) {
        this.ip = str;
        this.timeout = i;
    }

    public DnspodFree() {
        this("119.29.29.29");
    }
}
