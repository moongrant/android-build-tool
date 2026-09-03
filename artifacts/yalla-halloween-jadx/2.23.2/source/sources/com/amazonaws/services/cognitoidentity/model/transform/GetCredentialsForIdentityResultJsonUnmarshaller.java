package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* JADX INFO: loaded from: classes2.dex */
public class GetCredentialsForIdentityResultJsonUnmarshaller implements Unmarshaller<GetCredentialsForIdentityResult, JsonUnmarshallerContext> {
    @Override // com.amazonaws.transform.Unmarshaller
    public final GetCredentialsForIdentityResult OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        JsonUnmarshallerContext jsonUnmarshallerContext2 = jsonUnmarshallerContext;
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = new GetCredentialsForIdentityResult();
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext2.f12654OooO00o;
        awsJsonReader.OooO00o();
        while (awsJsonReader.hasNext()) {
            String strOooO0o0 = awsJsonReader.OooO0o0();
            if (strOooO0o0.equals("IdentityId")) {
                SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0().getClass();
                getCredentialsForIdentityResult.f12353OooO0Oo = jsonUnmarshallerContext2.f12654OooO00o.OooO0o();
            } else if (strOooO0o0.equals("Credentials")) {
                if (CredentialsJsonUnmarshaller.f12355OooO00o == null) {
                    CredentialsJsonUnmarshaller.f12355OooO00o = new CredentialsJsonUnmarshaller();
                }
                CredentialsJsonUnmarshaller.f12355OooO00o.getClass();
                getCredentialsForIdentityResult.f12354OooO0o0 = CredentialsJsonUnmarshaller.OooO0O0(jsonUnmarshallerContext2);
            } else {
                awsJsonReader.OooO0OO();
            }
        }
        awsJsonReader.OooO0O0();
        return getCredentialsForIdentityResult;
    }
}
