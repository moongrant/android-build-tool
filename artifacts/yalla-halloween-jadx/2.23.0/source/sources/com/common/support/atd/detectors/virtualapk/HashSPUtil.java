package com.common.support.atd.detectors.virtualapk;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/HashSPUtil;", "", "()V", "DEFAULT_HASH", "", "KEY_HASH_STR", "SP_NAME", "getLocalHash", "context", "Landroid/content/Context;", "putHashToLocal", "", "hash", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HashSPUtil {

    @NotNull
    private static final String DEFAULT_HASH = "";

    @NotNull
    public static final HashSPUtil INSTANCE = new HashSPUtil();

    @NotNull
    private static final String KEY_HASH_STR = "key_hash_str";

    @NotNull
    private static final String SP_NAME = "virtual_pkg";

    private HashSPUtil() {
    }

    @NotNull
    public final String getLocalHash(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(SP_NAME, 0).getString(KEY_HASH_STR, "");
        return string == null || string.length() == 0 ? "" : string;
    }

    public final void putHashToLocal(@NotNull Context context, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hash, "hash");
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_NAME, 0).edit();
        editorEdit.putString(KEY_HASH_STR, hash);
        editorEdit.apply();
    }
}
