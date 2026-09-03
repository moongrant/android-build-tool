package com.amazonaws.services.cognitoidentity;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.transform.ConcurrentModificationExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.DeveloperUserAlreadyRegisteredExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ExternalServiceExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityResultJsonUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InternalErrorExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InvalidIdentityPoolConfigurationExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InvalidParameterExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.NotAuthorizedExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ResourceConflictExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.TooManyRequestsExceptionUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AmazonCognitoIdentityClient extends AmazonWebServiceClient implements AmazonCognitoIdentity {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AWSCredentialsProvider f9254OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList f9255OooOO0O;

    public AmazonCognitoIdentityClient(AnonymousAWSCredentials anonymousAWSCredentials, ClientConfiguration clientConfiguration) {
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(anonymousAWSCredentials);
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f9254OooOO0 = staticCredentialsProvider;
        ArrayList arrayList = new ArrayList();
        this.f9255OooOO0O = arrayList;
        arrayList.add(new ConcurrentModificationExceptionUnmarshaller());
        this.f9255OooOO0O.add(new DeveloperUserAlreadyRegisteredExceptionUnmarshaller());
        this.f9255OooOO0O.add(new ExternalServiceExceptionUnmarshaller());
        this.f9255OooOO0O.add(new InternalErrorExceptionUnmarshaller());
        this.f9255OooOO0O.add(new InvalidIdentityPoolConfigurationExceptionUnmarshaller());
        this.f9255OooOO0O.add(new InvalidParameterExceptionUnmarshaller());
        this.f9255OooOO0O.add(new LimitExceededExceptionUnmarshaller());
        this.f9255OooOO0O.add(new NotAuthorizedExceptionUnmarshaller());
        this.f9255OooOO0O.add(new ResourceConflictExceptionUnmarshaller());
        this.f9255OooOO0O.add(new ResourceNotFoundExceptionUnmarshaller());
        this.f9255OooOO0O.add(new TooManyRequestsExceptionUnmarshaller());
        this.f9255OooOO0O.add(new JsonErrorUnmarshaller());
        URI uriOooOO0o = OooOO0o("cognito-identity.us-east-1.amazonaws.com");
        String strOooOO0 = OooOO0();
        Signer signerOooO0oo = OooO0oo(strOooOO0, AwsHostNameUtils.OooO00o(uriOooOO0o.getHost(), strOooOO0), false);
        synchronized (this) {
            this.f8954OooO00o = uriOooOO0o;
            this.f8959OooO0o0 = signerOooO0oo;
        }
        this.f8960OooO0oO = "cognito-identity";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.f8957OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler.class, "/com/amazonaws/services/cognitoidentity/request.handlers"));
        this.f8957OooO0Oo.addAll(handlerChainFactory.OooO00o(RequestHandler2.class, "/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    public final Response OooOOO(DefaultRequest defaultRequest, JsonResponseHandler jsonResponseHandler, ExecutionContext executionContext) {
        defaultRequest.f8981OooO0o0 = this.f8954OooO00o;
        defaultRequest.f8984OooOO0 = 0;
        AWSRequestMetrics aWSRequestMetrics = executionContext.f9081OooO00o;
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.CredentialsRequestTime;
        aWSRequestMetrics.OooO0o(field);
        try {
            AWSCredentials aWSCredentialsOooO00o = this.f9254OooOO0.OooO00o();
            aWSRequestMetrics.OooO0O0(field);
            executionContext.f9084OooO0Oo = aWSCredentialsOooO00o;
            return this.f8956OooO0OO.OooO0O0(defaultRequest, jsonResponseHandler, new JsonErrorResponseHandler(this.f9255OooOO0O), executionContext);
        } catch (Throwable th) {
            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.CredentialsRequestTime);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GetCredentialsForIdentityResult OooOOO0(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) throws AmazonClientException {
        this.f8956OooO0OO.getClass();
        AwsSdkMetrics.OooO0OO();
        ExecutionContext executionContext = new ExecutionContext(this.f8957OooO0Oo, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null, this);
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        AWSRequestMetrics aWSRequestMetrics = executionContext.f9081OooO00o;
        aWSRequestMetrics.OooO0o(field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            aWSRequestMetrics.OooO0o(field2);
            try {
                new GetCredentialsForIdentityRequestMarshaller();
                DefaultRequest defaultRequestOooO00o = GetCredentialsForIdentityRequestMarshaller.OooO00o(getCredentialsForIdentityRequest);
                if (defaultRequestOooO00o.f8985OooOO0O != null) {
                    throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
                }
                defaultRequestOooO00o.f8985OooOO0O = aWSRequestMetrics;
                aWSRequestMetrics.OooO0O0(field2);
                GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) OooOOO(defaultRequestOooO00o, new JsonResponseHandler(new GetCredentialsForIdentityResultJsonUnmarshaller()), executionContext).f8987OooO00o;
                aWSRequestMetrics.OooO0O0(field);
                OooO(aWSRequestMetrics, defaultRequestOooO00o, true);
                return getCredentialsForIdentityResult;
            } catch (Throwable th) {
                aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.RequestMarshallTime);
                throw th;
            }
        } catch (Throwable th2) {
            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
            OooO(aWSRequestMetrics, null, true);
            throw th2;
        }
    }
}
