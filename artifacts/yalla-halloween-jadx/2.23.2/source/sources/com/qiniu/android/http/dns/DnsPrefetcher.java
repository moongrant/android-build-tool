package com.qiniu.android.http.dns;

import com.qiniu.android.common.Config;
import com.qiniu.android.common.FixedZone;
import com.qiniu.android.common.Zone;
import com.qiniu.android.common.ZoneInfo;
import com.qiniu.android.common.ZonesInfo;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadRegionRequestMetrics;
import com.qiniu.android.storage.GlobalConfiguration;
import com.qiniu.android.storage.UpToken;
import com.qiniu.android.utils.AndroidNetwork;
import com.qiniu.android.utils.Utils;
import com.qiniu.android.utils.Wait;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class DnsPrefetcher {
    private static final DnsPrefetcher dnsPrefetcher = new DnsPrefetcher();
    private final HappyDns happyDns;
    public String lastPrefetchErrorMessage;
    private boolean isPrefetching = false;
    private DnsCacheInfo dnsCacheInfo = null;
    private HashSet<String> prefetchHosts = new HashSet<>();
    private ConcurrentHashMap<String, List<IDnsNetworkAddress>> addressDictionary = new ConcurrentHashMap<>();

    private DnsPrefetcher() {
        HappyDns happyDns = new HappyDns();
        this.happyDns = happyDns;
        happyDns.setQueryErrorHandler(new HappyDns.DnsQueryErrorHandler() { // from class: com.qiniu.android.http.dns.DnsPrefetcher.1
            @Override // com.qiniu.android.dns.DnsManager.QueryErrorHandler
            public void queryError(Exception exc, String str) {
                DnsPrefetcher.this.lastPrefetchErrorMessage = exc.getMessage();
            }
        });
    }

    private void clearPreHosts() {
        this.addressDictionary.clear();
    }

    private void endPreFetch() {
        setPrefetching(false);
    }

    private String[] getCacheHosts() {
        return (String[]) this.addressDictionary.keySet().toArray(new String[0]);
    }

    private String[] getCurrentZoneHosts(Zone zone, UpToken upToken) {
        ArrayList<ZoneInfo> arrayList;
        List<String> list;
        if (zone == null || upToken == null) {
            return null;
        }
        final Wait wait = new Wait();
        zone.preQuery(upToken, new Zone.QueryHandler() { // from class: com.qiniu.android.http.dns.DnsPrefetcher.2
            @Override // com.qiniu.android.common.Zone.QueryHandler
            public void complete(int i, ResponseInfo responseInfo, UploadRegionRequestMetrics uploadRegionRequestMetrics) {
                wait.stopWait();
            }
        });
        wait.startWait();
        ZonesInfo zonesInfo = zone.getZonesInfo(upToken);
        ArrayList arrayList2 = new ArrayList();
        if (zonesInfo != null && (arrayList = zonesInfo.zonesInfo) != null && arrayList.size() > 0) {
            for (ZoneInfo zoneInfo : zonesInfo.zonesInfo) {
                if (zoneInfo != null && (list = zoneInfo.allHosts) != null) {
                    arrayList2.addAll(list);
                }
            }
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    private synchronized DnsCacheInfo getDnsCacheInfo() {
        return this.dnsCacheInfo;
    }

    private String[] getFixedZoneHosts() {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        for (ZoneInfo zoneInfo : FixedZone.localsZoneInfo().getZonesInfo(null).zonesInfo) {
            if (zoneInfo != null && (list = zoneInfo.allHosts) != null) {
                arrayList.addAll(list);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static DnsPrefetcher getInstance() {
        return dnsPrefetcher;
    }

    private String[] getLocalPreHost() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Config.preQueryHost00);
        arrayList.add(Config.preQueryHost01);
        arrayList.add(Config.upLogURL);
        return (String[]) arrayList.toArray(new String[0]);
    }

    private boolean preFetchHost(String str, Dns dns) {
        if (str != null && str.length() != 0) {
            List<IDnsNetworkAddress> list = this.addressDictionary.get(str);
            if (list != null && list.size() > 0) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            try {
                List<IDnsNetworkAddress> listLookup = dns.lookup(str);
                if (listLookup != null && listLookup.size() > 0) {
                    for (IDnsNetworkAddress iDnsNetworkAddress : listLookup) {
                        arrayList.add(new DnsNetworkAddress(iDnsNetworkAddress.getHostValue(), iDnsNetworkAddress.getIpValue(), Long.valueOf(iDnsNetworkAddress.getTtlValue() != null ? iDnsNetworkAddress.getTtlValue().longValue() : GlobalConfiguration.getInstance().dnsCacheTime), iDnsNetworkAddress.getSourceValue(), iDnsNetworkAddress.getTimestampValue()));
                    }
                }
            } catch (UnknownHostException unused) {
            }
            if (arrayList.size() > 0) {
                this.addressDictionary.put(str, arrayList);
                return true;
            }
        }
        return false;
    }

    private void preFetchHosts(String[] strArr) {
        preFetchHosts(preFetchHosts(strArr, GlobalConfiguration.getInstance().dns), this.happyDns);
    }

    private synchronized boolean prepareToPreFetch() {
        if (!isDnsOpen()) {
            return false;
        }
        if (isPrefetching()) {
            return false;
        }
        String hostIP = AndroidNetwork.getHostIP();
        if (hostIP == null || getDnsCacheInfo() == null || !hostIP.equals(getDnsCacheInfo().getLocalIp())) {
            clearPreHosts();
        }
        setPrefetching(true);
        return true;
    }

    private boolean recorderDnsCache() {
        String str = Utils.currentTimestamp() + "";
        String hostIP = AndroidNetwork.getHostIP();
        if (hostIP == null) {
            return false;
        }
        DnsCacheInfo dnsCacheInfo = new DnsCacheInfo(str, hostIP, this.addressDictionary);
        try {
            DnsCacheFile dnsCacheFile = new DnsCacheFile(GlobalConfiguration.getInstance().dnsCacheDir);
            setDnsCacheInfo(dnsCacheInfo);
            byte[] jsonData = dnsCacheInfo.toJsonData();
            if (jsonData == null) {
                return false;
            }
            dnsCacheFile.set(dnsCacheInfo.cacheKey(), jsonData);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private boolean recoverDnsCache(byte[] bArr) {
        DnsCacheInfo dnsCacheInfoCreateDnsCacheInfoByData = DnsCacheInfo.createDnsCacheInfoByData(bArr);
        if (dnsCacheInfoCreateDnsCacheInfoByData != null && dnsCacheInfoCreateDnsCacheInfoByData.getInfo() != null && dnsCacheInfoCreateDnsCacheInfoByData.getInfo().size() != 0) {
            this.addressDictionary.putAll(dnsCacheInfoCreateDnsCacheInfoByData.getInfo());
            dnsCacheInfoCreateDnsCacheInfoByData.setInfo(this.addressDictionary);
            setDnsCacheInfo(dnsCacheInfoCreateDnsCacheInfoByData);
        }
        return false;
    }

    private synchronized void setDnsCacheInfo(DnsCacheInfo dnsCacheInfo) {
        this.dnsCacheInfo = dnsCacheInfo;
    }

    private synchronized void setPrefetching(boolean z) {
        this.isPrefetching = z;
    }

    public boolean checkAndPrefetchDnsIfNeed(Zone zone, UpToken upToken) {
        String[] currentZoneHosts;
        if (!prepareToPreFetch() || (currentZoneHosts = getCurrentZoneHosts(zone, upToken)) == null) {
            return false;
        }
        synchronized (this) {
            this.prefetchHosts.addAll(Arrays.asList(currentZoneHosts));
        }
        preFetchHosts(currentZoneHosts);
        recorderDnsCache();
        endPreFetch();
        return true;
    }

    public void checkWhetherCachedDnsValid() {
        String[] strArr;
        if (prepareToPreFetch()) {
            synchronized (this) {
                strArr = (String[]) this.prefetchHosts.toArray(new String[0]);
            }
            preFetchHosts(strArr);
            recorderDnsCache();
            endPreFetch();
        }
    }

    public List<IDnsNetworkAddress> getInetAddressByHost(String str) {
        List<IDnsNetworkAddress> list;
        if (isDnsOpen() && (list = this.addressDictionary.get(str)) != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    public void invalidNetworkAddress(IDnsNetworkAddress iDnsNetworkAddress) {
        if (iDnsNetworkAddress == null || iDnsNetworkAddress.getHostValue() == null) {
            return;
        }
        String hostValue = iDnsNetworkAddress.getHostValue();
        List<IDnsNetworkAddress> list = this.addressDictionary.get(hostValue);
        ArrayList arrayList = new ArrayList();
        for (IDnsNetworkAddress iDnsNetworkAddress2 : list) {
            if (!iDnsNetworkAddress2.getIpValue().equals(iDnsNetworkAddress2.getIpValue())) {
                arrayList.add(iDnsNetworkAddress2);
            }
        }
        this.addressDictionary.put(hostValue, arrayList);
    }

    public boolean isDnsOpen() {
        return GlobalConfiguration.getInstance().isDnsOpen;
    }

    public synchronized boolean isPrefetching() {
        return this.isPrefetching;
    }

    public void localFetch() {
        if (prepareToPreFetch()) {
            String[] localPreHost = getLocalPreHost();
            synchronized (this) {
                this.prefetchHosts.addAll(Arrays.asList(localPreHost));
            }
            preFetchHosts(localPreHost);
            recorderDnsCache();
            endPreFetch();
        }
    }

    public boolean recoverCache() {
        byte[] bArr;
        try {
            DnsCacheFile dnsCacheFile = new DnsCacheFile(GlobalConfiguration.getInstance().dnsCacheDir);
            String hostIP = AndroidNetwork.getHostIP();
            if (hostIP == null || hostIP.length() == 0 || (bArr = dnsCacheFile.get(hostIP)) == null) {
                return true;
            }
            return recoverDnsCache(bArr);
        } catch (Exception unused) {
            return true;
        }
    }

    private String[] preFetchHosts(String[] strArr, Dns dns) {
        boolean z;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (dns == null) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= GlobalConfiguration.getInstance().dnsRepreHostNum) {
                    z = false;
                    break;
                }
                if (preFetchHost(str, dns)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
