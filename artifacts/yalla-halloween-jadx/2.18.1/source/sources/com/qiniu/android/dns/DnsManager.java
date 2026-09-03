package com.qiniu.android.dns;

import OooO00o.OooO00o;
import com.qiniu.android.dns.http.DomainNotOwn;
import com.qiniu.android.dns.local.Hosts;
import com.qiniu.android.dns.util.LruCache;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class DnsManager {
    private final LruCache<String, Record[]> cache;
    private final Hosts hosts;
    private volatile int index;
    private volatile NetworkInfo info;
    public QueryErrorHandler queryErrorHandler;
    private final IResolver[] resolvers;
    private final IpSorter sorter;

    public static class DummySorter implements IpSorter {
        private AtomicInteger pos;

        private DummySorter() {
            this.pos = new AtomicInteger();
        }

        @Override // com.qiniu.android.dns.IpSorter
        public String[] sort(String[] strArr) {
            return strArr;
        }
    }

    public interface QueryErrorHandler {
        void queryError(Exception exc, String str);
    }

    public DnsManager(NetworkInfo networkInfo, IResolver[] iResolverArr) {
        this(networkInfo, iResolverArr, null);
    }

    private void clearCache() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public static boolean needHttpDns() {
        try {
            String id = TimeZone.getDefault().getID();
            return "Asia/Shanghai".equals(id) || "Asia/Chongqing".equals(id) || "Asia/Harbin".equals(id) || "Asia/Urumqi".equals(id);
        } catch (Exception unused) {
            return false;
        }
    }

    private String[] queryInternal(Domain domain) throws IOException {
        Record[] recordArrQueryRecordInternal = queryRecordInternal(domain);
        if (recordArrQueryRecordInternal == null || recordArrQueryRecordInternal.length == 0) {
            return null;
        }
        return records2Ip(recordArrQueryRecordInternal);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x014b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x00e7 A[EDGE_INSN: B:121:0x00e7->B:74:0x00e7 BREAK  A[LOOP:1: B:40:0x007c->B:73:0x00e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    private Record[] queryRecordInternal(Domain domain) throws IOException {
        Record[] recordArrResolve;
        int i;
        int i2;
        IResolver[] iResolverArr;
        UnknownHostException unknownHostException;
        QueryErrorHandler queryErrorHandler;
        String[] strArrQuery;
        NetworkInfo networkInfo;
        String[] strArrQuery2;
        int i3 = 0;
        if (domain.hostsFirst && (strArrQuery2 = this.hosts.query(domain, this.info)) != null && strArrQuery2.length != 0) {
            Record[] recordArr = new Record[strArrQuery2.length];
            while (i3 < strArrQuery2.length) {
                recordArr[i3] = new Record(strArrQuery2[i3], 1, 600, new Date().getTime(), Record.Source.Unknown);
                i3++;
            }
            return recordArr;
        }
        synchronized (this.cache) {
            IOException e = null;
            if (!this.info.equals(NetworkInfo.normal) || !Network.isNetworkChanged()) {
                recordArrResolve = this.cache.get(domain.domain);
                if (recordArrResolve != null && recordArrResolve.length != 0) {
                    if (!recordArrResolve[0].isExpired()) {
                        if (recordArrResolve.length > 1) {
                            rotate(recordArrResolve);
                        }
                        return recordArrResolve;
                    }
                }
                i = this.index;
                i2 = 0;
                while (true) {
                    iResolverArr = this.resolvers;
                    if (i2 < iResolverArr.length) {
                        break;
                    }
                    int length = (i + i2) % iResolverArr.length;
                    networkInfo = this.info;
                    String ip = Network.getIp();
                    try {
                        recordArrResolve = this.resolvers[length].resolve(domain, this.info);
                    } catch (DomainNotOwn unused) {
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        QueryErrorHandler queryErrorHandler2 = this.queryErrorHandler;
                        if (queryErrorHandler2 != null) {
                            queryErrorHandler2.queryError(e, domain.domain);
                        }
                    } catch (Exception e3) {
                        IOException iOException = new IOException(e3);
                        e3.printStackTrace();
                        QueryErrorHandler queryErrorHandler3 = this.queryErrorHandler;
                        if (queryErrorHandler3 != null) {
                            queryErrorHandler3.queryError(e3, domain.domain);
                        }
                        e = iOException;
                    }
                    String ip2 = Network.getIp();
                    if (this.info != networkInfo || !((recordArrResolve == null || recordArrResolve.length == 0) && ip.equals(ip2))) {
                        break;
                    }
                    synchronized (this.resolvers) {
                        if (this.index == i) {
                            this.index++;
                            if (this.index == this.resolvers.length) {
                                this.index = 0;
                            }
                        }
                    }
                    i2++;
                }
                if (recordArrResolve == null && recordArrResolve.length != 0) {
                    Record[] recordArrTrimCname = trimCname(recordArrResolve);
                    if (recordArrTrimCname.length == 0) {
                        throw new UnknownHostException("no A records");
                    }
                    synchronized (this.cache) {
                        this.cache.put(domain.domain, recordArrTrimCname);
                    }
                    return recordArrTrimCname;
                }
                if (domain.hostsFirst && (strArrQuery = this.hosts.query(domain, this.info)) != null && strArrQuery.length != 0) {
                    Record[] recordArr2 = new Record[strArrQuery.length];
                    while (i3 < strArrQuery.length) {
                        recordArr2[i3] = new Record(strArrQuery[i3], 1, 600, new Date().getTime(), Record.Source.Unknown);
                        i3++;
                    }
                    return recordArr2;
                }
                if (e == null) {
                    throw e;
                }
                unknownHostException = new UnknownHostException(domain.domain);
                queryErrorHandler = this.queryErrorHandler;
                if (queryErrorHandler != null) {
                    throw unknownHostException;
                }
                queryErrorHandler.queryError(unknownHostException, domain.domain);
                throw unknownHostException;
            }
            this.cache.clear();
            synchronized (this.resolvers) {
                this.index = 0;
            }
            recordArrResolve = null;
            i = this.index;
            i2 = 0;
            while (true) {
                iResolverArr = this.resolvers;
                if (i2 < iResolverArr.length) {
                    break;
                    break;
                }
                int length2 = (i + i2) % iResolverArr.length;
                networkInfo = this.info;
                String ip3 = Network.getIp();
                recordArrResolve = this.resolvers[length2].resolve(domain, this.info);
                String ip4 = Network.getIp();
                if (this.info != networkInfo) {
                    break;
                }
                break;
                i2++;
            }
            if (recordArrResolve == null) {
            }
            if (domain.hostsFirst) {
            }
            if (e == null) {
                throw e;
            }
            unknownHostException = new UnknownHostException(domain.domain);
            queryErrorHandler = this.queryErrorHandler;
            if (queryErrorHandler != null) {
                throw unknownHostException;
            }
            queryErrorHandler.queryError(unknownHostException, domain.domain);
            throw unknownHostException;
        }
    }

    private static String[] records2Ip(Record[] recordArr) {
        if (recordArr == null || recordArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(recordArr.length);
        for (Record record : recordArr) {
            arrayList.add(record.value);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void rotate(Record[] recordArr) {
        if (recordArr == null || recordArr.length <= 1) {
            return;
        }
        Record record = recordArr[0];
        System.arraycopy(recordArr, 1, recordArr, 0, recordArr.length - 1);
        recordArr[recordArr.length - 1] = record;
    }

    private static Record[] trimCname(Record[] recordArr) {
        ArrayList arrayList = new ArrayList(recordArr.length);
        for (Record record : recordArr) {
            if (record != null && record.type == 1) {
                arrayList.add(record);
            }
        }
        return (Record[]) arrayList.toArray(new Record[arrayList.size()]);
    }

    public static boolean validIP(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains("-")) {
            return false;
        }
        try {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf != -1 && Integer.parseInt(str.substring(0, iIndexOf)) > 255) {
                return false;
            }
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 != -1 && Integer.parseInt(str.substring(i, iIndexOf2)) > 255) {
                return false;
            }
            int i2 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(46, i2);
            return iIndexOf3 == -1 || Integer.parseInt(str.substring(i2, iIndexOf3)) <= 255 || Integer.parseInt(str.substring(iIndexOf3 + 1, str.length() - 1)) <= 255 || str.charAt(str.length() - 1) == '.';
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public void onNetworkChange(NetworkInfo networkInfo) {
        clearCache();
        if (networkInfo == null) {
            networkInfo = NetworkInfo.normal;
        }
        this.info = networkInfo;
        synchronized (this.resolvers) {
            this.index = 0;
        }
    }

    public DnsManager putHosts(String str, String str2, int i) {
        this.hosts.put(str, new Hosts.Value(str2, i));
        return this;
    }

    public String[] query(String str) throws IOException {
        return query(new Domain(str));
    }

    public InetAddress[] queryInetAdress(Domain domain) throws IOException {
        String[] strArrQuery = query(domain);
        InetAddress[] inetAddressArr = new InetAddress[strArrQuery.length];
        for (int i = 0; i < strArrQuery.length; i++) {
            inetAddressArr[i] = InetAddress.getByName(strArrQuery[i]);
        }
        return inetAddressArr;
    }

    public Record[] queryRecords(String str) throws IOException {
        return queryRecords(new Domain(str));
    }

    public DnsManager(NetworkInfo networkInfo, IResolver[] iResolverArr, IpSorter ipSorter) {
        this.hosts = new Hosts();
        this.info = null;
        this.index = 0;
        this.info = networkInfo == null ? NetworkInfo.normal : networkInfo;
        this.resolvers = (IResolver[]) iResolverArr.clone();
        this.cache = new LruCache<>();
        this.sorter = ipSorter == null ? new DummySorter() : ipSorter;
    }

    public DnsManager putHosts(String str, String str2) {
        this.hosts.put(str, str2);
        return this;
    }

    public String[] query(Domain domain) throws IOException {
        if (domain == null) {
            throw new IOException("null domain");
        }
        String str = domain.domain;
        if (str == null || str.trim().length() == 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("empty domain ");
            sbOooO0o0.append(domain.domain);
            throw new IOException(sbOooO0o0.toString());
        }
        if (validIP(domain.domain)) {
            return new String[]{domain.domain};
        }
        String[] strArrQueryInternal = queryInternal(domain);
        return (strArrQueryInternal == null || strArrQueryInternal.length <= 1) ? strArrQueryInternal : this.sorter.sort(strArrQueryInternal);
    }

    public Record[] queryRecords(Domain domain) throws IOException {
        if (domain == null) {
            throw new IOException("null domain");
        }
        String str = domain.domain;
        if (str != null && str.trim().length() != 0) {
            return validIP(domain.domain) ? new Record[]{new Record(domain.domain, 1, 600, new Date().getTime(), Record.Source.Unknown)} : queryRecordInternal(domain);
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("empty domain ");
        sbOooO0o0.append(domain.domain);
        throw new IOException(sbOooO0o0.toString());
    }
}
