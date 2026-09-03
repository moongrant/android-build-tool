package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class GetIdResultJsonUnmarshaller implements Unmarshaller<GetIdResult, JsonUnmarshallerContext> {
    @Override // com.amazonaws.transform.Unmarshaller
    public final GetIdResult OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        JsonUnmarshallerContext jsonUnmarshallerContext2 = jsonUnmarshallerContext;
        GetIdResult getIdResult = new GetIdResult();
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext2.f11152OooO00o;
        awsJsonReader.OooO0O0();
        while (awsJsonReader.hasNext()) {
            if (awsJsonReader.OooO0o().equals("IdentityId")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                getIdResult.f10588Oooo0o = jsonUnmarshallerContext2.f11152OooO00o.OooO0OO();
            } else {
                awsJsonReader.OooO0Oo();
            }
        }
        awsJsonReader.OooO00o();
        return getIdResult;
    }
}
