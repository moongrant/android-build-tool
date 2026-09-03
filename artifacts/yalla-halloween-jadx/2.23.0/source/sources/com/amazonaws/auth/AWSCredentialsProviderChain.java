package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f9005OooO0Oo = LogFactory.OooO00o(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedList f9006OooO00o = new LinkedList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f9007OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AWSCredentialsProvider f9008OooO0OO;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.f9006OooO00o.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        AWSCredentialsProvider aWSCredentialsProvider;
        Log log = f9005OooO0Oo;
        if (this.f9007OooO0O0 && (aWSCredentialsProvider = this.f9008OooO0OO) != null) {
            return aWSCredentialsProvider.OooO00o();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.f9006OooO00o) {
            try {
                AWSCredentials aWSCredentialsOooO00o = aWSCredentialsProvider2.OooO00o();
                if (aWSCredentialsOooO00o.OooO00o() != null && aWSCredentialsOooO00o.OooO0OO() != null) {
                    log.OooO0oO("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.f9008OooO0OO = aWSCredentialsProvider2;
                    return aWSCredentialsOooO00o;
                }
            } catch (Exception e) {
                log.OooO0oO("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
