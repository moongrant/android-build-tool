package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.Credentials;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller;
import com.amazonaws.transform.TimestampFormat;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* JADX INFO: loaded from: classes2.dex */
class CredentialsJsonUnmarshaller implements Unmarshaller<Credentials, JsonUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static CredentialsJsonUnmarshaller f9265OooO00o;

    public static Credentials OooO0O0(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader awsJsonReader = jsonUnmarshallerContext.f9563OooO00o;
        if (!awsJsonReader.OooO0Oo()) {
            awsJsonReader.OooO0OO();
            return null;
        }
        Credentials credentials = new Credentials();
        awsJsonReader.OooO00o();
        while (awsJsonReader.hasNext()) {
            String strOooO0o0 = awsJsonReader.OooO0o0();
            boolean zEquals = strOooO0o0.equals("AccessKeyId");
            AwsJsonReader awsJsonReader2 = jsonUnmarshallerContext.f9563OooO00o;
            if (zEquals) {
                SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0().getClass();
                credentials.f9256OooO0Oo = awsJsonReader2.OooO0o();
            } else if (strOooO0o0.equals("SecretKey")) {
                SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0().getClass();
                credentials.f9258OooO0o0 = awsJsonReader2.OooO0o();
            } else if (strOooO0o0.equals("SessionToken")) {
                SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller.OooO0O0().getClass();
                credentials.f9257OooO0o = awsJsonReader2.OooO0o();
            } else if (strOooO0o0.equals("Expiration")) {
                if (SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f9565OooO0O0 == null) {
                    SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f9565OooO0O0 = new SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller(TimestampFormat.UNIX_TIMESTAMP);
                }
                credentials.f9259OooO0oO = SimpleTypeJsonUnmarshallers$DateJsonUnmarshaller.f9565OooO0O0.OooO00o(jsonUnmarshallerContext);
            } else {
                awsJsonReader.OooO0OO();
            }
        }
        awsJsonReader.OooO0O0();
        return credentials;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public final /* bridge */ /* synthetic */ Credentials OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return OooO0O0(jsonUnmarshallerContext);
    }
}
