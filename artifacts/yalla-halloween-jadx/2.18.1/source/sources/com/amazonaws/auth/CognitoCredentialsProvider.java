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
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class CognitoCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Log f10349OooOO0O = LogFactory.OooO00o(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f10350OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AmazonCognitoIdentityClient f10352OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AWSCognitoIdentityProvider f10353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BasicSessionCredentials f10354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f10355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Date f10356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f10357OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f10358OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ReentrantReadWriteLock f10359OooOO0;

    public CognitoCredentialsProvider(AWSCognitoIdentityProvider aWSCognitoIdentityProvider, Regions regions) {
        AmazonCognitoIdentityClient amazonCognitoIdentityClient = new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), new ClientConfiguration());
        amazonCognitoIdentityClient.setRegion(RegionUtils.OooO00o(regions.OooO0O0()));
        this.f10352OooO0O0 = amazonCognitoIdentityClient;
        this.f10351OooO00o = amazonCognitoIdentityClient.getRegions().OooO0O0();
        this.f10353OooO0OO = aWSCognitoIdentityProvider;
        this.f10357OooO0oO = 3600;
        this.f10358OooO0oo = 500;
        this.f10350OooO = true;
        this.f10359OooOO0 = new ReentrantReadWriteLock(true);
    }

    public final void OooO(Date date) {
        this.f10359OooOO0.writeLock().lock();
        try {
            this.f10356OooO0o0 = date;
        } finally {
            this.f10359OooOO0.writeLock().unlock();
        }
    }

    public AWSSessionCredentials OooO0O0() {
        this.f10359OooOO0.writeLock().lock();
        try {
            if (OooO0o0()) {
                OooOO0();
            }
            return this.f10354OooO0Oo;
        } finally {
            this.f10359OooOO0.writeLock().unlock();
        }
    }

    public String OooO0OO() {
        throw null;
    }

    public final Map<String, String> OooO0Oo() {
        return this.f10353OooO0OO.getLogins();
    }

    public final GetCredentialsForIdentityResult OooO0o() {
        Map<String, String> mapOooO0Oo;
        String strOooO0oO = OooO0oO();
        this.f10355OooO0o = strOooO0oO;
        if (strOooO0oO == null || strOooO0oO.isEmpty()) {
            mapOooO0Oo = OooO0Oo();
        } else {
            HashMap map = new HashMap();
            map.put(Regions.CN_NORTH_1.OooO0O0().equals(this.f10351OooO00o) ? "cognito-identity.cn-north-1.amazonaws.com.cn" : "cognito-identity.amazonaws.com", this.f10355OooO0o);
            mapOooO0Oo = map;
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = new GetCredentialsForIdentityRequest();
        getCredentialsForIdentityRequest.f10580Oooo = OooO0OO();
        getCredentialsForIdentityRequest.f10582OoooO00 = mapOooO0Oo;
        getCredentialsForIdentityRequest.f10581OoooO0 = null;
        return this.f10352OooO0O0.OooO00o(getCredentialsForIdentityRequest);
    }

    public final boolean OooO0o0() {
        if (this.f10354OooO0Oo == null) {
            return true;
        }
        return this.f10356OooO0o0.getTime() - (System.currentTimeMillis() - ((long) (SDKGlobalConfiguration.OooO00o() * 1000))) < ((long) (this.f10358OooO0oo * 1000));
    }

    public final String OooO0oO() {
        OooO0oo(null);
        String strRefresh = this.f10353OooO0OO.refresh();
        this.f10355OooO0o = strRefresh;
        return strRefresh;
    }

    public final void OooO0oo(String str) {
        this.f10353OooO0OO.identityChanged(str);
    }

    public final void OooOO0() throws Throwable {
        Map<String, String> mapOooO0Oo;
        GetCredentialsForIdentityResult getCredentialsForIdentityResultOooO0o;
        try {
            this.f10355OooO0o = this.f10353OooO0OO.refresh();
        } catch (ResourceNotFoundException unused) {
            this.f10355OooO0o = OooO0oO();
        } catch (AmazonServiceException e) {
            if (!e.OooO0O0().equals("ValidationException")) {
                throw e;
            }
            this.f10355OooO0o = OooO0oO();
        }
        if (!this.f10350OooO) {
            String str = this.f10355OooO0o;
            this.f10353OooO0OO.isAuthenticated();
            AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = new AssumeRoleWithWebIdentityRequest();
            assumeRoleWithWebIdentityRequest.f11148OoooO0 = str;
            assumeRoleWithWebIdentityRequest.f11147Oooo = null;
            assumeRoleWithWebIdentityRequest.f11149OoooO00 = "ProviderSession";
            assumeRoleWithWebIdentityRequest.f11150OoooO0O = Integer.valueOf(this.f10357OooO0oO);
            assumeRoleWithWebIdentityRequest.f10273Oooo0oO.OooO00o(CognitoCachingCredentialsProvider.f10336OooOOOo);
            throw null;
        }
        String str2 = this.f10355OooO0o;
        if (str2 == null || str2.isEmpty()) {
            mapOooO0Oo = OooO0Oo();
        } else {
            HashMap map = new HashMap();
            map.put(Regions.CN_NORTH_1.OooO0O0().equals(this.f10351OooO00o) ? "cognito-identity.cn-north-1.amazonaws.com.cn" : "cognito-identity.amazonaws.com", str2);
            mapOooO0Oo = map;
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = new GetCredentialsForIdentityRequest();
        getCredentialsForIdentityRequest.f10580Oooo = OooO0OO();
        getCredentialsForIdentityRequest.f10582OoooO00 = mapOooO0Oo;
        getCredentialsForIdentityRequest.f10581OoooO0 = null;
        try {
            getCredentialsForIdentityResultOooO0o = this.f10352OooO0O0.OooO00o(getCredentialsForIdentityRequest);
        } catch (ResourceNotFoundException unused2) {
            getCredentialsForIdentityResultOooO0o = OooO0o();
        } catch (AmazonServiceException e2) {
            if (!e2.OooO0O0().equals("ValidationException")) {
                throw e2;
            }
            getCredentialsForIdentityResultOooO0o = OooO0o();
        }
        Credentials credentials = getCredentialsForIdentityResultOooO0o.f10584Oooo0oO;
        this.f10354OooO0Oo = new BasicSessionCredentials(credentials.f10577Oooo0o, credentials.f10578Oooo0oO, credentials.f10579Oooo0oo);
        OooO(credentials.f10576Oooo);
        if (getCredentialsForIdentityResultOooO0o.f10583Oooo0o.equals(OooO0OO())) {
            return;
        }
        OooO0oo(getCredentialsForIdentityResultOooO0o.f10583Oooo0o);
    }
}
