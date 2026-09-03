package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class GetOpenIdTokenResultJsonUnmarshaller implements Unmarshaller<GetOpenIdTokenResult, JsonUnmarshallerContext> {
    @Override // com.amazonaws.transform.Unmarshaller
    public final GetOpenIdTokenResult OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        JsonUnmarshallerContext jsonUnmarshallerContext2 = jsonUnmarshallerContext;
        GetOpenIdTokenResult getOpenIdTokenResult = new GetOpenIdTokenResult();
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext2.f11152OooO00o;
        awsJsonReader.OooO0O0();
        while (awsJsonReader.hasNext()) {
            String strOooO0o = awsJsonReader.OooO0o();
            if (strOooO0o.equals("IdentityId")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                getOpenIdTokenResult.f10591Oooo0o = jsonUnmarshallerContext2.f11152OooO00o.OooO0OO();
            } else if (strOooO0o.equals("Token")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                getOpenIdTokenResult.f10592Oooo0oO = jsonUnmarshallerContext2.f11152OooO00o.OooO0OO();
            } else {
                awsJsonReader.OooO0Oo();
            }
        }
        awsJsonReader.OooO00o();
        return getOpenIdTokenResult;
    }
}
