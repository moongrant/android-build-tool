package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;
import p004OooO0oO.o000oOoO;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12121OooO00o = "/".concat("AwsCredentials.properties");

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials OooO00o() {
        Class<?> cls = getClass();
        String str = this.f12121OooO00o;
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new AmazonClientException(o000oOoO.OooO0O0("Unable to load AWS credentials from the ", str, " file on the classpath"));
        }
        try {
            return new PropertiesCredentials(resourceAsStream);
        } catch (IOException e) {
            throw new AmazonClientException(o000oOoO.OooO0O0("Unable to load AWS credentials from the ", str, " file on the classpath"), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        return o0oOO.OooO0O0(sb, this.f12121OooO00o, ")");
    }
}
