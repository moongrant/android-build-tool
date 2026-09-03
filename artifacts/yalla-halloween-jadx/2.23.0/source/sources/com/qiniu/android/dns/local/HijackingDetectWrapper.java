package com.qiniu.android.dns.local;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;

/* JADX INFO: loaded from: classes4.dex */
public final class HijackingDetectWrapper implements IResolver {
    private final Resolver resolver;

    public HijackingDetectWrapper(Resolver resolver) {
        this.resolver = resolver;
    }

    @Override // com.qiniu.android.dns.IResolver
    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws Throwable {
        boolean z;
        Record[] recordArrResolve = this.resolver.resolve(domain, networkInfo);
        if (domain.hasCname) {
            int length = recordArrResolve.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (recordArrResolve[i].isCname()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                throw new DnshijackingException(domain.domain, this.resolver.address.getHostAddress());
            }
        }
        if (domain.maxTtl != 0) {
            for (Record record : recordArrResolve) {
                if (!record.isCname() && record.ttl > domain.maxTtl) {
                    throw new DnshijackingException(domain.domain, this.resolver.address.getHostAddress(), record.ttl);
                }
            }
        }
        return recordArrResolve;
    }
}
