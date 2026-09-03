package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class AWSS3V4Signer extends AWS4Signer {
    public AWSS3V4Signer() {
        super(false);
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final String OooOOO(DefaultRequest defaultRequest) {
        long j;
        defaultRequest.OooO00o("x-amz-content-sha256", "required");
        AmazonWebServiceRequest amazonWebServiceRequest = defaultRequest.f8982OooO0oO;
        if (!((amazonWebServiceRequest instanceof PutObjectRequest) || (amazonWebServiceRequest instanceof UploadPartRequest))) {
            return super.OooOOO(defaultRequest);
        }
        String str = (String) defaultRequest.f8979OooO0Oo.get("Content-Length");
        if (str != null) {
            j = Long.parseLong(str);
        } else {
            try {
                InputStream inputStream = defaultRequest.f8975OooO;
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
        byte[] bArr2 = AwsChunkedEncodingInputStream.f9010OooOOOo;
        if (j < 0) {
            throw new IllegalArgumentException("Nonnegative content length expected.");
        }
        long j3 = j / 131072;
        long j4 = j % 131072;
        defaultRequest.OooO00o("Content-Length", Long.toString(AwsChunkedEncodingInputStream.OooO0OO(0L) + (AwsChunkedEncodingInputStream.OooO0OO(131072L) * j3) + (j4 > 0 ? AwsChunkedEncodingInputStream.OooO0OO(j4) : 0L)));
        return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    }

    @Override // com.amazonaws.auth.AWS4Signer
    public final void OooOOo(DefaultRequest defaultRequest, AWS4Signer.HeaderSigningResult headerSigningResult) {
        AmazonWebServiceRequest amazonWebServiceRequest = defaultRequest.f8982OooO0oO;
        if ((amazonWebServiceRequest instanceof PutObjectRequest) || (amazonWebServiceRequest instanceof UploadPartRequest)) {
            InputStream inputStream = defaultRequest.f8975OooO;
            String str = headerSigningResult.f8995OooO00o;
            String str2 = headerSigningResult.f8996OooO0O0;
            byte[] bArr = headerSigningResult.f8997OooO0OO;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = headerSigningResult.f8998OooO0Oo;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            defaultRequest.f8975OooO = new AwsChunkedEncodingInputStream(inputStream, bArr2, str, str2, BinaryUtils.OooO0O0(bArr4), this);
        }
    }
}
