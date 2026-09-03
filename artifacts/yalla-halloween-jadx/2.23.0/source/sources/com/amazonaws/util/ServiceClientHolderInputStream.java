package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceClientHolderInputStream extends SdkFilterInputStream {
    public ServiceClientHolderInputStream(S3ObjectInputStream s3ObjectInputStream) {
        super(s3ObjectInputStream);
    }
}
