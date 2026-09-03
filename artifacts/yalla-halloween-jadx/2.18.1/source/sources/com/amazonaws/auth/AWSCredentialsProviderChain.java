package com.amazonaws.auth;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f10309OooO0Oo = LogFactory.OooO00o(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<AWSCredentialsProvider> f10310OooO00o = new LinkedList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f10311OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AWSCredentialsProvider f10312OooO0OO;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.LinkedList, java.util.List<com.amazonaws.auth.AWSCredentialsProvider>] */
    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.f10310OooO00o.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        AWSCredentialsProvider aWSCredentialsProvider;
        if (this.f10311OooO0O0 && (aWSCredentialsProvider = this.f10312OooO0OO) != null) {
            return aWSCredentialsProvider.OooO00o();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.f10310OooO00o) {
            try {
                AWSCredentials aWSCredentialsOooO00o = aWSCredentialsProvider2.OooO00o();
                if (aWSCredentialsOooO00o.OooO0O0() != null && aWSCredentialsOooO00o.OooO0OO() != null) {
                    f10309OooO0Oo.OooO00o("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.f10312OooO0OO = aWSCredentialsProvider2;
                    return aWSCredentialsOooO00o;
                }
            } catch (Exception e) {
                Log log = f10309OooO0Oo;
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to load credentials from ");
                sbOooO0o0.append(aWSCredentialsProvider2.toString());
                sbOooO0o0.append(": ");
                sbOooO0o0.append(e.getMessage());
                log.OooO00o(sbOooO0o0.toString());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
