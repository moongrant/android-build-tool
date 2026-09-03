package com.amazonaws.auth;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.services.cognitoidentity.model.transform.GetIdRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.GetIdResultJsonUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenResultJsonUnmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AWSAbstractCognitoIdentityProvider implements AWSCognitoIdentityProvider {
    private final String accountId;
    public final AmazonCognitoIdentity cib;
    public String identityId;
    private final String identityPoolId;
    public List<IdentityChangedListener> listeners;
    public Map<String, String> loginsMap;
    public String token;

    public AWSAbstractCognitoIdentityProvider(String str, String str2, AmazonCognitoIdentity amazonCognitoIdentity) {
        this.accountId = str;
        this.identityPoolId = str2;
        this.loginsMap = new HashMap();
        this.listeners = new ArrayList();
        this.cib = amazonCognitoIdentity;
    }

    public void appendUserAgent(AmazonWebServiceRequest amazonWebServiceRequest, String str) {
        amazonWebServiceRequest.f10273Oooo0oO.OooO00o(str);
    }

    public void clearListeners() {
        this.listeners.clear();
    }

    public String getAccountId() {
        return this.accountId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.amazonaws.Request] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazonaws.AmazonWebServiceRequest, com.amazonaws.services.cognitoidentity.model.GetIdRequest] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.amazonaws.auth.AWSAbstractCognitoIdentityProvider] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.amazonaws.Request] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.transform.GetIdRequestMarshaller] */
    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public String getIdentityId() throws Throwable {
        Throwable th;
        Response response;
        Throwable th2;
        if (this.identityId == null) {
            ?? getIdRequest = new GetIdRequest();
            getIdRequest.f10585Oooo = getAccountId();
            getIdRequest.f10587OoooO00 = getIdentityPoolId();
            getIdRequest.f10586OoooO0 = this.loginsMap;
            appendUserAgent(getIdRequest, getUserAgent());
            ?? r1 = (AmazonCognitoIdentityClient) this.cib;
            ExecutionContext executionContextCreateExecutionContext = r1.createExecutionContext(getIdRequest);
            AWSRequestMetrics aWSRequestMetrics = executionContextCreateExecutionContext.f10387OooO00o;
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
            aWSRequestMetrics.OooO0o(field);
            ?? r6 = 0;
            Response response2 = null;
            try {
                try {
                    AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                    aWSRequestMetrics.OooO0o(field2);
                    try {
                        getIdRequest = new GetIdRequestMarshaller().OooO00o(getIdRequest);
                        try {
                            ((DefaultRequest) getIdRequest).OooO0OO(aWSRequestMetrics);
                            aWSRequestMetrics.OooO0O0(field2);
                            Response responseOooO0O0 = r1.OooO0O0(getIdRequest, new JsonResponseHandler(new GetIdResultJsonUnmarshaller()), executionContextCreateExecutionContext);
                            try {
                                GetIdResult getIdResult = (GetIdResult) responseOooO0O0.f10297OooO00o;
                                aWSRequestMetrics.OooO0O0(field);
                                r1.endClientExecution(aWSRequestMetrics, getIdRequest, responseOooO0O0, true);
                                String str = getIdResult.f10588Oooo0o;
                                if (str != null) {
                                    identityChanged(str);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                response2 = responseOooO0O0;
                                Response response3 = response2;
                                r6 = getIdRequest;
                                response = response3;
                                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
                                r1.endClientExecution(aWSRequestMetrics, r6, response, true);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.RequestMarshallTime);
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                response = null;
                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
                r1.endClientExecution(aWSRequestMetrics, r6, response, true);
                throw th;
            }
        }
        return this.identityId;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public Map<String, String> getLogins() {
        return this.loginsMap;
    }

    public abstract String getProviderName();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.amazonaws.Request] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazonaws.AmazonWebServiceRequest, com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.amazonaws.auth.AWSAbstractCognitoIdentityProvider] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.amazonaws.Request] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenRequestMarshaller] */
    public String getToken() throws Throwable {
        Response response;
        Throwable th;
        if (this.token == null) {
            ?? getOpenIdTokenRequest = new GetOpenIdTokenRequest();
            getOpenIdTokenRequest.f10589Oooo = getIdentityId();
            getOpenIdTokenRequest.f10590OoooO00 = this.loginsMap;
            appendUserAgent(getOpenIdTokenRequest, getUserAgent());
            ?? r1 = (AmazonCognitoIdentityClient) this.cib;
            ExecutionContext executionContextCreateExecutionContext = r1.createExecutionContext(getOpenIdTokenRequest);
            AWSRequestMetrics aWSRequestMetrics = executionContextCreateExecutionContext.f10387OooO00o;
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
            aWSRequestMetrics.OooO0o(field);
            Response response2 = null;
            ?? r6 = 0;
            try {
                try {
                    AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                    aWSRequestMetrics.OooO0o(field2);
                    try {
                        getOpenIdTokenRequest = new GetOpenIdTokenRequestMarshaller().OooO00o(getOpenIdTokenRequest);
                        try {
                            ((DefaultRequest) getOpenIdTokenRequest).OooO0OO(aWSRequestMetrics);
                            aWSRequestMetrics.OooO0O0(field2);
                            Response responseOooO0O0 = r1.OooO0O0(getOpenIdTokenRequest, new JsonResponseHandler(new GetOpenIdTokenResultJsonUnmarshaller()), executionContextCreateExecutionContext);
                            try {
                                GetOpenIdTokenResult getOpenIdTokenResult = (GetOpenIdTokenResult) responseOooO0O0.f10297OooO00o;
                                aWSRequestMetrics.OooO0O0(field);
                                r1.endClientExecution(aWSRequestMetrics, getOpenIdTokenRequest, responseOooO0O0, true);
                                if (!getOpenIdTokenResult.f10591Oooo0o.equals(getIdentityId())) {
                                    identityChanged(getOpenIdTokenResult.f10591Oooo0o);
                                }
                                this.token = getOpenIdTokenResult.f10592Oooo0oO;
                            } catch (Throwable th2) {
                                th = th2;
                                response2 = responseOooO0O0;
                                Response response3 = response2;
                                r6 = getOpenIdTokenRequest;
                                response = response3;
                                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
                                r1.endClientExecution(aWSRequestMetrics, r6, response, true);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.RequestMarshallTime);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    response = null;
                    aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
                    r1.endClientExecution(aWSRequestMetrics, r6, response, true);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        return this.token;
    }

    public String getUserAgent() {
        return "";
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public void identityChanged(String str) {
        String str2 = this.identityId;
        if (str2 == null || !str2.equals(str)) {
            this.identityId = str;
            Iterator<IdentityChangedListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().identityChanged(this.identityId);
            }
        }
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public boolean isAuthenticated() {
        Map<String, String> map = this.loginsMap;
        return map != null && map.size() > 0;
    }

    @Override // com.amazonaws.auth.AWSIdentityProvider
    public String refresh() throws Throwable {
        getIdentityId();
        String token = getToken();
        update(getIdentityId(), token);
        return token;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public void registerIdentityChangedListener(IdentityChangedListener identityChangedListener) {
        this.listeners.add(identityChangedListener);
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setLogins(Map<String, String> map) {
        this.loginsMap = map;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void unregisterIdentityChangedListener(IdentityChangedListener identityChangedListener) {
        this.listeners.remove(identityChangedListener);
    }

    public void update(String str, String str2) {
        String str3 = this.identityId;
        if (str3 == null || !str3.equals(str)) {
            identityChanged(str);
        }
        String str4 = this.token;
        if (str4 == null || !str4.equals(str2)) {
            this.token = str2;
        }
    }

    @Deprecated
    public AWSAbstractCognitoIdentityProvider(String str, String str2, ClientConfiguration clientConfiguration) {
        this(str, str2, new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), clientConfiguration));
    }

    public AWSAbstractCognitoIdentityProvider(String str, String str2, ClientConfiguration clientConfiguration, Regions regions) {
        this(str, str2, new AmazonCognitoIdentityClient(new AnonymousAWSCredentials(), clientConfiguration));
        this.cib.setRegion(RegionUtils.OooO00o(regions.OooO0O0()));
    }

    @Deprecated
    public AWSAbstractCognitoIdentityProvider(String str, String str2) {
        this(str, str2, new ClientConfiguration());
    }

    public AWSAbstractCognitoIdentityProvider(String str, String str2, Regions regions) {
        this(str, str2, new ClientConfiguration(), regions);
    }
}
