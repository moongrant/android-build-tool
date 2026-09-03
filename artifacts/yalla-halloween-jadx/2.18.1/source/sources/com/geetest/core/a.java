package com.geetest.core;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static Pair<Boolean, String> a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    Pair<Boolean, String> pair = new Pair<>(Boolean.TRUE, byteArrayOutputStream.toString());
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return pair;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e5) {
                e5.printStackTrace();
                Pair<Boolean, String> pair2 = new Pair<>(Boolean.FALSE, e5.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                return pair2;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            Pair<Boolean, String> pair3 = new Pair<>(Boolean.FALSE, e8.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            return pair3;
        }
    }
}
