package com.common.support.utils;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/common/support/utils/Utils;", "", "()V", "<set-?>", "Landroid/app/Application;", "app", "getApp", "()Landroid/app/Application;", "init", "", "utils_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();
    private static Application app;

    private Utils() {
    }

    @NotNull
    public final Application getApp() {
        Application application = app;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app");
        return null;
    }

    public final void init(@NotNull Application app2) {
        Intrinsics.checkNotNullParameter(app2, "app");
        app = app2;
    }
}
