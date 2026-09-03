package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AWSS3V4Signer extends AWS4Signer {
    public AWSS3V4Signer() {
        super(false);
    }

    public static boolean OooOoO(Request<?> request) {
        return (((DefaultRequest) request).f10292OooO0oO instanceof PutObjectRequest) || (((DefaultRequest) request).f10292OooO0oO instanceof UploadPartRequest);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String OooOOo(Request<?> request) {
        return "UNSIGNED-PAYLOAD";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.amazonaws.auth.AWS4Signer
    public final String OooOOo0(Request<?> request) {
        long j;
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("x-amz-content-sha256", "required");
        if (!OooOoO(defaultRequest)) {
            return super.OooOOo0(defaultRequest);
        }
        String str = (String) defaultRequest.f10289OooO0Oo.get("Content-Length");
        if (str != null) {
            j = Long.parseLong(str);
        } else {
            try {
                InputStream inputStream = defaultRequest.f10285OooO;
                if (!inputStream.markSupported()) {
                    throw new AmazonClientException("Failed to get content length");
                }
                byte[] bArr = new byte[4096];
                inputStream.mark(-1);
                long j2 = 0;
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    j2 += (long) i;
                }
                inputStream.reset();
                j = j2;
            } catch (IOException e) {
                throw new AmazonClientException("Cannot get the content-lenght of the request content.", e);
            }
        }
        defaultRequest.OooO00o("x-amz-decoded-content-length", Long.toString(j));
        byte[] bArr2 = AwsChunkedEncodingInputStream.f10314OoooOo0;
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j3 = j / 131072;
        long j4 = j % 131072;
        defaultRequest.OooO00o("Content-Length", Long.toString(AwsChunkedEncodingInputStream.OooO0O0(0L) + (AwsChunkedEncodingInputStream.OooO0O0(131072L) * j3) + (j4 > 0 ? AwsChunkedEncodingInputStream.OooO0O0(j4) : 0L)));
        return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final void OooOoO0(Request<?> request, AWS4Signer.HeaderSigningResult headerSigningResult) {
        if (OooOoO(request)) {
            DefaultRequest defaultRequest = (DefaultRequest) request;
            InputStream inputStream = defaultRequest.f10285OooO;
            String str = headerSigningResult.f10305OooO00o;
            String str2 = headerSigningResult.f10306OooO0O0;
            byte[] bArr = headerSigningResult.f10307OooO0OO;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            defaultRequest.f10285OooO = new AwsChunkedEncodingInputStream(inputStream, bArr2, str, str2, BinaryUtils.OooO0O0(headerSigningResult.OooO00o()), this);
        }
    }
}
