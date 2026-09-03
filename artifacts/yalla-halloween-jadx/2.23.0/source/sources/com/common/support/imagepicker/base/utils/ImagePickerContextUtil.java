package com.common.support.imagepicker.base.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/base/utils/ImagePickerContextUtil;", "", "()V", "<set-?>", "Landroid/content/Context;", "sAppContext", "getSAppContext", "()Landroid/content/Context;", "initAppContext", "", "applicationContext", "initAppContext$base_release", "base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class ImagePickerContextUtil {

    @NotNull
    public static final ImagePickerContextUtil INSTANCE = new ImagePickerContextUtil();
    private static Context sAppContext;

    private ImagePickerContextUtil() {
    }

    @NotNull
    public final Context getSAppContext() {
        Context context = sAppContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sAppContext");
        return null;
    }

    public final void initAppContext$base_release(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        sAppContext = applicationContext;
    }
}
