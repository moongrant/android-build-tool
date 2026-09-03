package com.common.support.zeus;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p225o00oOOo0.o0000O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 J\t\u0010\u000b\u001a\u00020\u0004H\u0086 J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0086 ¨\u0006\u0011"}, d2 = {"Lcom/common/support/zeus/SV2;", "", "()V", "a1", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "random", "a2", "a3", "a4", "a5", "init", "", "context", "Landroid/content/Context;", "appKey", "signv2_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SV2 {

    @NotNull
    public static final SV2 INSTANCE = new SV2();

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

    @NotNull
    public final native String a5();

    public final void init(@NotNull Context context, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        o0000O o0000o2 = new o0000O();
        o0000o2.f39714OooO0Oo = true;
        o0000o2.OooO0O0(context, "zeus");
        init(appKey);
    }

    public final native void init(@NotNull String appKey);
}
