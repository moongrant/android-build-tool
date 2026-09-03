package com.common.support.imagepicker.mediaedit.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MessageDigestUtils;", "", "()V", "bytes2Hex", "", "bts", "", "encrypt", "string", "type", "md5", AppMeasurementSdk.ConditionalUserProperty.VALUE, "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MessageDigestUtils {

    @NotNull
    public static final MessageDigestUtils INSTANCE = new MessageDigestUtils();

    private MessageDigestUtils() {
    }

    private final String bytes2Hex(byte[] bts) {
        return ArraysKt___ArraysKt.joinToString$default(bts, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.common.support.imagepicker.mediaedit.utils.MessageDigestUtils.bytes2Hex.1
            @NotNull
            public final CharSequence invoke(byte b) {
                return OooO0O0.OooO0O0.OooO00o(new Object[]{Byte.valueOf(b)}, 1, "%02x", "format(this, *args)");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
    }

    private final String encrypt(String string, String type) {
        if (string == null || string.length() == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(type);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(type)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
            return bytes2Hex(bytes2);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @NotNull
    public final String md5(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return encrypt(value, "MD5");
    }
}
