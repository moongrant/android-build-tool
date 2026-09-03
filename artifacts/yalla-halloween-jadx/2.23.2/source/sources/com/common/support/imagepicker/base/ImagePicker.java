package com.common.support.imagepicker.base;

import android.app.Application;
import com.common.support.imagepicker.base.utils.ImagePickerContextUtil;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"Lcom/common/support/imagepicker/base/ImagePicker;", "", "()V", "checkInit", "", "Companion", "base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ImagePicker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean mInitialized;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/common/support/imagepicker/base/ImagePicker$Companion;", "", "()V", "mInitialized", "", "init", "", "application", "Landroid/app/Application;", "debug", "base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void init(@NotNull Application application, boolean debug) {
            Intrinsics.checkNotNullParameter(application, "application");
            ImagePicker.mInitialized = true;
            ImagePickerContextUtil.INSTANCE.initAppContext$base_release(application);
            ImagePickerLogUtil.INSTANCE.initDebug$base_release(debug);
        }
    }

    public ImagePicker() {
        checkInit();
    }

    private final void checkInit() {
        if (!mInitialized) {
            throw new IllegalStateException("Please init ImagePicker first in Application class.");
        }
    }
}
