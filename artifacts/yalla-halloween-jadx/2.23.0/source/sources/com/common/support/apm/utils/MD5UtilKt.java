package com.common.support.apm.utils;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"bytesToHexString", "", "src", "", "getFileMD5", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "sailfish_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class MD5UtilKt {
    @Nullable
    public static final String bytesToHexString(@Nullable byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return null;
        }
        int length = bArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte b = bArr[i];
                byte[] bArr2 = o0O000o0.f57386OooO00o;
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    @NotNull
    public static final String getFileMD5(@NotNull File file) {
        MessageDigest messageDigest;
        String strBytesToHexString;
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists() || !file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        FileInputStream fileInputStream = null;
        try {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    while (true) {
                        try {
                            int i = fileInputStream2.read(bArr, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                            if (i == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            try {
                                th.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return messageDigest != null ? "" : strBytesToHexString;
                            } catch (Throwable th2) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                throw th2;
                            }
                        }
                    }
                    fileInputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
            messageDigest = null;
        }
        if (messageDigest != null || (strBytesToHexString = bytesToHexString(messageDigest.digest())) == null) {
            return "";
        }
    }
}
