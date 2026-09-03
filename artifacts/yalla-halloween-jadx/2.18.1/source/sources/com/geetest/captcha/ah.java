package com.geetest.captcha;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/geetest/captcha/utils/SdUtils;", "", "()V", "dirPath", "", "getDirPath", "()Ljava/lang/String;", "geeLogFileDir", "getGeeLogFileDir", "setGeeLogFileDir", "(Ljava/lang/String;)V", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class ah {
    public static final ah a = new ah();

    @Nullable
    private static String b;

    private ah() {
    }

    public static void a(@Nullable String str) {
        b = str;
    }

    @Nullable
    public static String a() {
        return b;
    }
}
