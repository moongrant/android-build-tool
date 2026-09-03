package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.TimestampFormat;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class CredentialsJsonUnmarshaller implements Unmarshaller<Credentials, JsonUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static CredentialsJsonUnmarshaller f10593OooO00o;

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Credentials OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext.f11152OooO00o;
        if (!awsJsonReader.OooO0o0()) {
            awsJsonReader.OooO0Oo();
            return null;
        }
        Credentials credentials = new Credentials();
        awsJsonReader.OooO0O0();
        while (awsJsonReader.hasNext()) {
            String strOooO0o = awsJsonReader.OooO0o();
            if (strOooO0o.equals("AccessKeyId")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                credentials.f10577Oooo0o = jsonUnmarshallerContext.f11152OooO00o.OooO0OO();
            } else if (strOooO0o.equals("SecretKey")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                credentials.f10578Oooo0oO = jsonUnmarshallerContext.f11152OooO00o.OooO0OO();
            } else if (strOooO0o.equals("SessionToken")) {
                Objects.requireNonNull(SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0());
                credentials.f10579Oooo0oo = jsonUnmarshallerContext.f11152OooO00o.OooO0OO();
            } else if (strOooO0o.equals("Expiration")) {
                if (SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f11154OooO0O0 == null) {
                    SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f11154OooO0O0 = new SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller(TimestampFormat.UNIX_TIMESTAMP);
                }
                credentials.f10576Oooo = SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f11154OooO0O0.OooO00o(jsonUnmarshallerContext);
            } else {
                awsJsonReader.OooO0Oo();
            }
        }
        awsJsonReader.OooO00o();
        return credentials;
    }
}
