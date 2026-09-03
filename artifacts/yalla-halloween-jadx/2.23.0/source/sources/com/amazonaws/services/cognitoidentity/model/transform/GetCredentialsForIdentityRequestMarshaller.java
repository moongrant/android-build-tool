package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GetCredentialsForIdentityRequestMarshaller {
    public static DefaultRequest OooO00o(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) {
        DefaultRequest defaultRequest = new DefaultRequest(getCredentialsForIdentityRequest, "AmazonCognitoIdentity");
        defaultRequest.OooO00o("X-Amz-Target", "AWSCognitoIdentityService.GetCredentialsForIdentity");
        defaultRequest.f8983OooO0oo = HttpMethodName.POST;
        defaultRequest.f8976OooO00o = "/";
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter awsJsonWriterOooO0O0 = JsonUtils.OooO0O0(stringWriter);
            awsJsonWriterOooO0O0.OooO00o();
            String str = getCredentialsForIdentityRequest.f9261OooO0oO;
            if (str != null) {
                awsJsonWriterOooO0O0.OooO0OO("IdentityId");
                awsJsonWriterOooO0O0.OooO0Oo(str);
            }
            Map<String, String> map = getCredentialsForIdentityRequest.f9262OooO0oo;
            if (map != null) {
                awsJsonWriterOooO0O0.OooO0OO("Logins");
                awsJsonWriterOooO0O0.OooO00o();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        awsJsonWriterOooO0O0.OooO0OO(entry.getKey());
                        awsJsonWriterOooO0O0.OooO0Oo(value);
                    }
                }
                awsJsonWriterOooO0O0.OooO0O0();
            }
            String str2 = getCredentialsForIdentityRequest.f9260OooO;
            if (str2 != null) {
                awsJsonWriterOooO0O0.OooO0OO("CustomRoleArn");
                awsJsonWriterOooO0O0.OooO0Oo(str2);
            }
            awsJsonWriterOooO0O0.OooO0O0();
            awsJsonWriterOooO0O0.close();
            String string = stringWriter.toString();
            byte[] bytes = string.getBytes(StringUtils.f9590OooO00o);
            defaultRequest.f8975OooO = new StringInputStream(string);
            defaultRequest.OooO00o("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.f8979OooO0Oo.containsKey("Content-Type")) {
                defaultRequest.OooO00o("Content-Type", "application/x-amz-json-1.1");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
