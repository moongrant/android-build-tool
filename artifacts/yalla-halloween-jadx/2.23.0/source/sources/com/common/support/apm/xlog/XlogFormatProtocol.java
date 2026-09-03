package com.common.support.apm.xlog;

import com.common.support.apm.utils.NumberExtensionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/common/support/apm/xlog/XlogFormatProtocol;", "", "()V", "pack", "", "code", "", "bodyData", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class XlogFormatProtocol {

    @NotNull
    public static final XlogFormatProtocol INSTANCE = new XlogFormatProtocol();

    private XlogFormatProtocol() {
    }

    @NotNull
    public final byte[] pack(int code, @NotNull byte[] bodyData) {
        Intrinsics.checkNotNullParameter(bodyData, "bodyData");
        if (bodyData.length == 0) {
            return new byte[0];
        }
        byte[] byteArray = NumberExtensionsKt.toByteArray(code, true);
        byte[] byteArray2 = NumberExtensionsKt.toByteArray(bodyData.length, true);
        byte[] bArr = new byte[byteArray.length + byteArray2.length + bodyData.length];
        ArraysKt.copyInto(byteArray, bArr, 0, 0, byteArray.length);
        ArraysKt.copyInto(byteArray2, bArr, byteArray.length, 0, byteArray2.length);
        ArraysKt.copyInto(bodyData, bArr, byteArray.length + byteArray2.length, 0, bodyData.length);
        return bArr;
    }
}
