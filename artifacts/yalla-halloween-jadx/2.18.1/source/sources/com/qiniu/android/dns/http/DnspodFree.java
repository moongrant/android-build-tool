package com.qiniu.android.dns.http;

import OooO00o.OooO00o;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import com.youth.banner.config.BannerConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class DnspodFree implements IResolver {
    private final String ip;
    private final int timeout;

    public DnspodFree(String str) {
        this(str, 10);
    }

    @Override // com.qiniu.android.dns.IResolver
    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("http://");
        sbOooO0o0.append(this.ip);
        sbOooO0o0.append("/d?ttl=1&dn=");
        sbOooO0o0.append(domain.domain);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sbOooO0o0.toString()).openConnection();
        httpURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
        httpURLConnection.setReadTimeout(this.timeout * 1000);
        Record[] recordArr = null;
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength > 0 && contentLength <= 1024) {
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
                recordArr = new Record[strArrSplit2.length];
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                for (int i3 = 0; i3 < strArrSplit2.length; i3++) {
                    recordArr[i3] = new Record(strArrSplit2[i3], 1, i2, jCurrentTimeMillis, Record.Source.DnspodFree);
                }
            } catch (Exception unused) {
            }
        }
        return recordArr;
    }

    public DnspodFree(String str, int i) {
        this.ip = str;
        this.timeout = i;
    }

    public DnspodFree() {
        this("119.29.29.29");
    }
}
