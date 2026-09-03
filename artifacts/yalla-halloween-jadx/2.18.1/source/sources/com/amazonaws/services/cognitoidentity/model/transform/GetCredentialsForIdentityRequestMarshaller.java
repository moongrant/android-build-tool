package com.amazonaws.services.cognitoidentity.model.transform;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GetCredentialsForIdentityRequestMarshaller {
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final Request<GetCredentialsForIdentityRequest> OooO00o(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) {
        DefaultRequest defaultRequest = new DefaultRequest(getCredentialsForIdentityRequest, "AmazonCognitoIdentity");
        defaultRequest.OooO00o("X-Amz-Target", "AWSCognitoIdentityService.GetCredentialsForIdentity");
        defaultRequest.f10293OooO0oo = HttpMethodName.POST;
        defaultRequest.f10286OooO00o = "/";
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter awsJsonWriterOooO0O0 = JsonUtils.OooO0O0(stringWriter);
            awsJsonWriterOooO0O0.OooO0O0();
            String str = getCredentialsForIdentityRequest.f10580Oooo;
            if (str != null) {
                awsJsonWriterOooO0O0.OooO0Oo("IdentityId");
                awsJsonWriterOooO0O0.OooO0OO(str);
            }
            Map<String, String> map = getCredentialsForIdentityRequest.f10582OoooO00;
            if (map != null) {
                awsJsonWriterOooO0O0.OooO0Oo("Logins");
                awsJsonWriterOooO0O0.OooO0O0();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        awsJsonWriterOooO0O0.OooO0Oo(entry.getKey());
                        awsJsonWriterOooO0O0.OooO0OO(value);
                    }
                }
                awsJsonWriterOooO0O0.OooO00o();
            }
            String str2 = getCredentialsForIdentityRequest.f10581OoooO0;
            if (str2 != null) {
                awsJsonWriterOooO0O0.OooO0Oo("CustomRoleArn");
                awsJsonWriterOooO0O0.OooO0OO(str2);
            }
            awsJsonWriterOooO0O0.OooO00o();
            awsJsonWriterOooO0O0.close();
            String string = stringWriter.toString();
            byte[] bytes = string.getBytes(StringUtils.f11186OooO00o);
            defaultRequest.f10285OooO = new StringInputStream(string);
            defaultRequest.OooO00o("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.f10289OooO0Oo.containsKey("Content-Type")) {
                defaultRequest.OooO00o("Content-Type", "application/x-amz-json-1.1");
            }
            return defaultRequest;
        } catch (Throwable th) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to marshall request to JSON: ");
            sbOooO0o0.append(th.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), th);
        }
    }
}
