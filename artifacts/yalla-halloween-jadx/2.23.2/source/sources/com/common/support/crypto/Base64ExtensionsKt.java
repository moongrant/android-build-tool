package com.common.support.crypto;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0005"}, d2 = {"base64Decode", "", "", "base64Encode", "base64EncodeToString", "crypto_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Base64ExtensionsKt {
    @NotNull
    public static final byte[] base64Decode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this, Base64.DEFAULT)");
        return bArrDecode;
    }

    @NotNull
    public static final byte[] base64Encode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(toByteArray(), Base64.DEFAULT)");
        return bArrEncode;
    }

    @NotNull
    public static final String base64EncodeToString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(toByteArray(), Base64.DEFAULT)");
        return strEncodeToString;
    }

    @NotNull
    public static final byte[] base64Decode(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrDecode = Base64.decode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this, Base64.DEFAULT)");
        return bArrDecode;
    }

    @NotNull
    public static final byte[] base64Encode(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrEncode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(this, Base64.DEFAULT)");
        return bArrEncode;
    }

    @NotNull
    public static final String base64EncodeToString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(this, Base64.DEFAULT)");
        return StringsKt__StringsJVMKt.replace$default(strEncodeToString, "\n", "", false, 4, (Object) null);
    }
}
