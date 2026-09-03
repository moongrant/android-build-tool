package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class GetCredentialsForIdentityResultJsonUnmarshaller implements Unmarshaller<GetCredentialsForIdentityResult, JsonUnmarshallerContext> {
    @Override // com.amazonaws.transform.Unmarshaller
    public final GetCredentialsForIdentityResult OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        JsonUnmarshallerContext jsonUnmarshallerContext2 = jsonUnmarshallerContext;
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = new GetCredentialsForIdentityResult();
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext2.f11152OooO00o;
        awsJsonReader.OooO0O0();
        while (awsJsonReader.hasNext()) {
            String strOooO0o = awsJsonReader.OooO0o();
            if (strOooO0o.equals("IdentityId")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                getCredentialsForIdentityResult.f10583Oooo0o = jsonUnmarshallerContext2.f11152OooO00o.OooO0OO();
            } else if (strOooO0o.equals("Credentials")) {
                if (CredentialsJsonUnmarshaller.f10593OooO00o == null) {
                    CredentialsJsonUnmarshaller.f10593OooO00o = new CredentialsJsonUnmarshaller();
                }
                getCredentialsForIdentityResult.f10584Oooo0oO = CredentialsJsonUnmarshaller.f10593OooO00o.OooO00o(jsonUnmarshallerContext2);
            } else {
                awsJsonReader.OooO0Oo();
            }
        }
        awsJsonReader.OooO00o();
        return getCredentialsForIdentityResult;
    }
}
