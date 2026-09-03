package com.qiniu.android.http.dns;

import com.qiniu.android.dns.DnsManager;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import com.qiniu.android.dns.http.DnspodFree;
import com.qiniu.android.utils.Utils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HappyDns implements Dns {
    private DnsManager dnsManager = new DnsManager(NetworkInfo.normal, new IResolver[]{new SystemResolver(), new DnspodFree()});

    public interface DnsQueryErrorHandler extends DnsManager.QueryErrorHandler {
    }

    public static class SystemResolver implements IResolver {
        private SystemResolver() {
        }

        @Override // com.qiniu.android.dns.IResolver
        public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
            long jCurrentTimestamp = Utils.currentTimestamp();
            ArrayList arrayList = new ArrayList();
            Iterator<InetAddress> it = new SystemDns().lookupInetAddress(domain.domain).iterator();
            while (it.hasNext()) {
                arrayList.add(new Record(it.next().getHostAddress(), 1, 120, jCurrentTimestamp, Record.Source.System));
            }
            return (Record[]) arrayList.toArray(new Record[0]);
        }
    }

    @Override // com.qiniu.android.http.dns.Dns
    public List<IDnsNetworkAddress> lookup(String str) throws UnknownHostException {
        String str2;
        try {
            Record[] recordArrQueryRecords = this.dnsManager.queryRecords(new Domain(str));
            if (recordArrQueryRecords == null || recordArrQueryRecords.length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            try {
                for (Record record : recordArrQueryRecords) {
                    Record.Source source = record.source;
                    if (source == Record.Source.System) {
                        str2 = "system";
                    } else if (source == Record.Source.DnspodFree || source == Record.Source.DnspodEnterprise) {
                        str2 = "httpdns";
                    } else {
                        str2 = source == Record.Source.Unknown ? "none" : "customized";
                    }
                    arrayList.add(new DnsNetworkAddress(str, record.value, Long.valueOf(record.ttl), str2, Long.valueOf(record.timeStamp)));
                }
            } catch (IOException unused) {
            }
            return arrayList;
        } catch (IOException unused2) {
            return null;
        }
    }

    public void setQueryErrorHandler(DnsQueryErrorHandler dnsQueryErrorHandler) {
        this.dnsManager.queryErrorHandler = dnsQueryErrorHandler;
    }
}
