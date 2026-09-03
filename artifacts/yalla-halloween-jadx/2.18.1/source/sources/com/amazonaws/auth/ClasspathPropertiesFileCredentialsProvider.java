package com.amazonaws.auth;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10335OooO00o = "/AwsCredentials.properties";

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.f10335OooO00o);
        if (resourceAsStream == null) {
            throw new AmazonClientException(OooO.OooO00o(OooO00o.OooO0o0("Unable to load AWS credentials from the "), this.f10335OooO00o, " file on the classpath"));
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException(OooO.OooO00o(OooO00o.OooO0o0("Unable to load AWS credentials from the "), this.f10335OooO00o, " file on the classpath"), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        return OooO.OooO00o(sb, this.f10335OooO00o, ")");
    }
}
