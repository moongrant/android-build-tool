package com.common.support.zeus;

import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0086 ¨\u0006\u000e"}, d2 = {"Lcom/common/support/zeus/SV2;", "", "()V", "a1", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "random", "a2", "a3", "a4", "init", "", "appKey", "signv2_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SV2 {

    @NotNull
    public static final SV2 INSTANCE = new SV2();

    static {
        System.loadLibrary("zeus");
    }

    private SV2() {
    }

    @NotNull
    public final native String a1(@NotNull byte[] message, @NotNull String random);

    @NotNull
    public final native String a2(@NotNull byte[] message, @NotNull String random);

    @NotNull
    public final native String a3(@NotNull byte[] message, @NotNull String random);

    @NotNull
    public final native String a4(@NotNull byte[] message, @NotNull String random);

    public final native void init(@NotNull String appKey);
}
