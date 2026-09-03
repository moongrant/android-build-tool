package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public enum IOUtils {
    ;

    private static final int BUFFER_SIZE = 4096;
    private static final Log logger = LogFactory.OooO00o(IOUtils.class);

    public static String OooO00o(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return new String(byteArrayOutputStream.toByteArray(), StringUtils.f11186OooO00o);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
