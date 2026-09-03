package com.amazonaws.auth;

import OooO00o.OooO00o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class PropertiesCredentials implements AWSCredentials {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10367OooO0O0;

    public PropertiesCredentials(File file) throws IOException {
        if (!file.exists()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("File doesn't exist:  ");
            sbOooO0o0.append(file.getAbsolutePath());
            throw new FileNotFoundException(sbOooO0o0.toString());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.f10366OooO00o = properties.getProperty("accessKey");
            this.f10367OooO0O0 = properties.getProperty("secretKey");
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0O0() {
        return this.f10366OooO00o;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public final String OooO0OO() {
        return this.f10367OooO0O0;
    }

    public PropertiesCredentials(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
            if (properties.getProperty("accessKey") != null && properties.getProperty("secretKey") != null) {
                this.f10366OooO00o = properties.getProperty("accessKey");
                this.f10367OooO0O0 = properties.getProperty("secretKey");
                return;
            }
            throw new IllegalArgumentException("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }
}
