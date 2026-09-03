package com.amazonaws.auth;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.ResourceNotFoundException;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p179o00o00.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class CognitoCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Log f12134OooOO0O = LogFactory.OooO00o(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f12135OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12136OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AmazonCognitoIdentityClient f12137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AWSCognitoIdentityProvider f12138OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BasicSessionCredentials f12139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f12140OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Date f12141OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12142OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f12143OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ReentrantReadWriteLock f12144OooOO0;

    public CognitoCredentialsProvider(OooO.OooO00o oooO00o, Regions regions) {
        Regions regionsOooO00o;
        AmazonCognitoIdentityClient amazonCognitoIdentityClient = new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), new ClientConfiguration());
        amazonCognitoIdentityClient.OooOO0O(RegionUtils.OooO00o(regions.OooO0O0()));
        this.f12137OooO0O0 = amazonCognitoIdentityClient;
        synchronized (amazonCognitoIdentityClient) {
            regionsOooO00o = Regions.OooO00o(amazonCognitoIdentityClient.f12051OooO0oo.f12324OooO00o);
        }
        this.f12136OooO00o = regionsOooO00o.OooO0O0();
        this.f12138OooO0OO = oooO00o;
        this.f12142OooO0oO = 3600;
        this.f12143OooO0oo = 500;
        this.f12135OooO = true;
        this.f12144OooOO0 = new ReentrantReadWriteLock(true);
    }

    public AWSSessionCredentials OooO0O0() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12144OooOO0;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (OooO0Oo()) {
                OooO0o();
            }
            return this.f12139OooO0Oo;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public String OooO0OO() {
        throw null;
    }

    public final boolean OooO0Oo() {
        if (this.f12139OooO0Oo == null) {
            return true;
        }
        return this.f12141OooO0o0.getTime() - (System.currentTimeMillis() - ((long) (SDKGlobalConfiguration.f12079OooO00o.get() * 1000))) < ((long) (this.f12143OooO0oo * 1000));
    }

    public final void OooO0o() {
        HashMap mapOooO0oO;
        GetCredentialsForIdentityResult getCredentialsForIdentityResultOooO0o0;
        AWSCognitoIdentityProvider aWSCognitoIdentityProvider = this.f12138OooO0OO;
        try {
            this.f12140OooO0o = aWSCognitoIdentityProvider.OooO0O0();
        } catch (ResourceNotFoundException unused) {
            aWSCognitoIdentityProvider.OooO00o(null);
            this.f12140OooO0o = aWSCognitoIdentityProvider.OooO0O0();
        } catch (AmazonServiceException e) {
            if (!e.OooO00o().equals("ValidationException")) {
                throw e;
            }
            aWSCognitoIdentityProvider.OooO00o(null);
            this.f12140OooO0o = aWSCognitoIdentityProvider.OooO0O0();
        }
        if (!this.f12135OooO) {
            String str = this.f12140OooO0o;
            aWSCognitoIdentityProvider.OooO0OO();
            AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = new AssumeRoleWithWebIdentityRequest();
            assumeRoleWithWebIdentityRequest.f12649OooO = str;
            assumeRoleWithWebIdentityRequest.f12650OooO0oO = null;
            assumeRoleWithWebIdentityRequest.f12651OooO0oo = "ProviderSession";
            assumeRoleWithWebIdentityRequest.f12652OooOO0 = Integer.valueOf(this.f12142OooO0oO);
            assumeRoleWithWebIdentityRequest.f12054OooO0o0.OooO00o(CognitoCachingCredentialsProvider.f12122OooOOOO);
            throw null;
        }
        String str2 = this.f12140OooO0o;
        if (str2 == null || str2.isEmpty()) {
            mapOooO0oO = aWSCognitoIdentityProvider.OooO0oO();
        } else {
            mapOooO0oO = new HashMap();
            mapOooO0oO.put(Regions.CN_NORTH_1.OooO0O0().equals(this.f12136OooO00o) ? "cognito-identity.cn-north-1.amazonaws.com.cn" : "cognito-identity.amazonaws.com", str2);
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = new GetCredentialsForIdentityRequest();
        getCredentialsForIdentityRequest.f12351OooO0oO = OooO0OO();
        getCredentialsForIdentityRequest.f12352OooO0oo = mapOooO0oO;
        getCredentialsForIdentityRequest.f12350OooO = null;
        try {
            getCredentialsForIdentityResultOooO0o0 = this.f12137OooO0O0.OooOOO0(getCredentialsForIdentityRequest);
        } catch (ResourceNotFoundException unused2) {
            getCredentialsForIdentityResultOooO0o0 = OooO0o0();
        } catch (AmazonServiceException e2) {
            if (!e2.OooO00o().equals("ValidationException")) {
                throw e2;
            }
            getCredentialsForIdentityResultOooO0o0 = OooO0o0();
        }
        Credentials credentials = getCredentialsForIdentityResultOooO0o0.f12354OooO0o0;
        this.f12139OooO0Oo = new BasicSessionCredentials(credentials.f12346OooO0Oo, credentials.f12348OooO0o0, credentials.f12347OooO0o);
        Date date = credentials.f12349OooO0oO;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f12144OooOO0;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f12141OooO0o0 = date;
            reentrantReadWriteLock.writeLock().unlock();
            if (getCredentialsForIdentityResultOooO0o0.f12353OooO0Oo.equals(OooO0OO())) {
                return;
            }
            aWSCognitoIdentityProvider.OooO00o(getCredentialsForIdentityResultOooO0o0.f12353OooO0Oo);
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public final GetCredentialsForIdentityResult OooO0o0() {
        HashMap mapOooO0oO;
        AWSCognitoIdentityProvider aWSCognitoIdentityProvider = this.f12138OooO0OO;
        aWSCognitoIdentityProvider.OooO00o(null);
        String strOooO0O0 = aWSCognitoIdentityProvider.OooO0O0();
        this.f12140OooO0o = strOooO0O0;
        if (strOooO0O0 == null || strOooO0O0.isEmpty()) {
            mapOooO0oO = aWSCognitoIdentityProvider.OooO0oO();
        } else {
            mapOooO0oO = new HashMap();
            mapOooO0oO.put(Regions.CN_NORTH_1.OooO0O0().equals(this.f12136OooO00o) ? "cognito-identity.cn-north-1.amazonaws.com.cn" : "cognito-identity.amazonaws.com", this.f12140OooO0o);
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = new GetCredentialsForIdentityRequest();
        getCredentialsForIdentityRequest.f12351OooO0oO = OooO0OO();
        getCredentialsForIdentityRequest.f12352OooO0oo = mapOooO0oO;
        getCredentialsForIdentityRequest.f12350OooO = null;
        return this.f12137OooO0O0.OooOOO0(getCredentialsForIdentityRequest);
    }
}
