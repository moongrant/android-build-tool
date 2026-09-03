package com.amazonaws.services.cognitoidentity;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AmazonCognitoIdentityClient extends AmazonWebServiceClient implements AmazonCognitoIdentity {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AWSCredentialsProvider f10574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<JsonErrorUnmarshaller> f10575OooO0O0;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public AmazonCognitoIdentityClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(aWSCredentials);
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f10574OooO00o = staticCredentialsProvider;
        ArrayList arrayList = new ArrayList();
        this.f10575OooO0O0 = arrayList;
        arrayList.add(new ConcurrentModificationExceptionUnmarshaller());
        this.f10575OooO0O0.add(new DeveloperUserAlreadyRegisteredExceptionUnmarshaller());
        this.f10575OooO0O0.add(new ExternalServiceExceptionUnmarshaller());
        this.f10575OooO0O0.add(new InternalErrorExceptionUnmarshaller());
        this.f10575OooO0O0.add(new InvalidIdentityPoolConfigurationExceptionUnmarshaller());
        this.f10575OooO0O0.add(new InvalidParameterExceptionUnmarshaller());
        this.f10575OooO0O0.add(new LimitExceededExceptionUnmarshaller());
        this.f10575OooO0O0.add(new NotAuthorizedExceptionUnmarshaller());
        this.f10575OooO0O0.add(new ResourceConflictExceptionUnmarshaller());
        this.f10575OooO0O0.add(new ResourceNotFoundExceptionUnmarshaller());
        this.f10575OooO0O0.add(new TooManyRequestsExceptionUnmarshaller());
        this.f10575OooO0O0.add(new JsonErrorUnmarshaller());
        setEndpoint("cognito-identity.us-east-1.amazonaws.com");
        this.endpointPrefix = "cognito-identity";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.OooO0OO("/com/amazonaws/services/cognitoidentity/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.OooO0O0("/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.amazonaws.Request] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.AmazonWebServiceClient, com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.amazonaws.AmazonWebServiceRequest, com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.amazonaws.Request] */
    public final GetCredentialsForIdentityResult OooO00o(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) throws Throwable {
        Response response;
        Throwable th;
        ExecutionContext executionContextCreateExecutionContext = createExecutionContext(getCredentialsForIdentityRequest);
        AWSRequestMetrics aWSRequestMetrics = executionContextCreateExecutionContext.f10387OooO00o;
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        aWSRequestMetrics.OooO0o(field);
        Response response2 = null;
        ?? r4 = 0;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                aWSRequestMetrics.OooO0o(field2);
                try {
                    getCredentialsForIdentityRequest = new GetCredentialsForIdentityRequestMarshaller().OooO00o(getCredentialsForIdentityRequest);
                    try {
                        ((DefaultRequest) getCredentialsForIdentityRequest).OooO0OO(aWSRequestMetrics);
                        aWSRequestMetrics.OooO0O0(field2);
                        Response responseOooO0O0 = OooO0O0(getCredentialsForIdentityRequest, new JsonResponseHandler(new GetCredentialsForIdentityResultJsonUnmarshaller()), executionContextCreateExecutionContext);
                        try {
                            GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) responseOooO0O0.f10297OooO00o;
                            aWSRequestMetrics.OooO0O0(field);
                            endClientExecution(aWSRequestMetrics, getCredentialsForIdentityRequest, responseOooO0O0, true);
                            return getCredentialsForIdentityResult;
                        } catch (Throwable th2) {
                            th = th2;
                            response2 = responseOooO0O0;
                            Response response3 = response2;
                            r4 = getCredentialsForIdentityRequest;
                            response = response3;
                            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
                            endClientExecution(aWSRequestMetrics, r4, response, true);
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
                endClientExecution(aWSRequestMetrics, r4, response, true);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final <X, Y extends AmazonWebServiceRequest> Response<X> OooO0O0(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> httpResponseHandler, ExecutionContext executionContext) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.f10291OooO0o0 = this.endpoint;
        defaultRequest.f10294OooOO0 = this.timeOffset;
        AWSRequestMetrics aWSRequestMetrics = executionContext.f10387OooO00o;
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.CredentialsRequestTime;
        aWSRequestMetrics.OooO0o(field);
        try {
            AWSCredentials aWSCredentialsOooO00o = this.f10574OooO00o.OooO00o();
            aWSRequestMetrics.OooO0O0(field);
            executionContext.f10390OooO0Oo = aWSCredentialsOooO00o;
            return this.client.OooO0O0(request, httpResponseHandler, new JsonErrorResponseHandler(this.f10575OooO0O0), executionContext);
        } catch (Throwable th) {
            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.CredentialsRequestTime);
            throw th;
        }
    }
}
