package com.qiniu.android.http.dns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SystemDns implements Dns {
    @Override // com.qiniu.android.http.dns.Dns
    public List<IDnsNetworkAddress> lookup(String str) throws UnknownHostException {
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
            arrayList.add(new DnsNetworkAddress(inetAddress.getHostName(), inetAddress.getHostAddress(), 120L, null, Long.valueOf(new Date().getTime())));
        }
        return arrayList;
    }

    public List<InetAddress> lookupInetAddress(String str) throws UnknownHostException {
        return Arrays.asList(InetAddress.getAllByName(str));
    }
}
