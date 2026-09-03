package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ServiceClientHolderInputStream extends SdkFilterInputStream {
    public ServiceClientHolderInputStream(InputStream inputStream) {
        super(inputStream);
    }
}
