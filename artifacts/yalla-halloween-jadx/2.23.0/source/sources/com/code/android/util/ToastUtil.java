package com.code.android.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ToastUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ToastUtil f10293OooO00o = new ToastUtil();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static WeakReference<OooO0O0> f10294OooO0O0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003B\u0000¨\u0006\u0004"}, d2 = {"Lcom/code/android/util/ToastUtil$MODE;", "", "Companion", "OooO00o", "AndroidUtil_release"}, k = 1, mv = {1, 8, 0})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MODE {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f10295OooO00o;

        /* JADX INFO: renamed from: com.code.android.util.ToastUtil$MODE$OooO00o, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ Companion f10295OooO00o = new Companion();
        }
    }

    public static abstract class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Toast f10296OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ToastUtil f10297OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public View f10298OooO0OO;

        public OooO00o(@NotNull ToastUtil toastUtils) {
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            Toast toast = new Toast(o000O0.OooO00o());
            this.f10296OooO00o = toast;
            this.f10297OooO0O0 = toastUtils;
            Intrinsics.checkNotNull(toast);
            toast.setGravity(17, 0, 0);
        }

        @Override // com.code.android.util.ToastUtil.OooO0O0
        @CallSuper
        public final void cancel() {
            Toast toast = this.f10296OooO00o;
            if (toast != null) {
                toast.cancel();
            }
            this.f10296OooO00o = null;
            this.f10298OooO0OO = null;
        }
    }

    public interface OooO0O0 {
        void cancel();
    }

    public static final class OooO0OO extends OooO00o {

        public static final class OooO00o extends Handler {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final Handler f10299OooO00o;

            public OooO00o(@NotNull Handler impl) {
                Intrinsics.checkNotNullParameter(impl, "impl");
                this.f10299OooO00o = impl;
            }

            @Override // android.os.Handler
            public final void dispatchMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                try {
                    this.f10299OooO00o.dispatchMessage(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public final void handleMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.f10299OooO00o.handleMessage(msg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull ToastUtil toastUtils) {
            super(toastUtils);
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f10296OooO00o);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(obj);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.os.Handler");
                    declaredField2.set(obj, new OooO00o((Handler) obj2));
                } catch (Exception unused) {
                }
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/code/android/util/ToastUtil$UtilsMaxWidthRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AndroidUtil_release"}, k = 1, mv = {1, 8, 0})
    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final int f10300OooO0Oo = o0000O0.OooO00o(80);

        public UtilsMaxWidthRelativeLayout(@Nullable Context context) {
            super(context);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(o0000O00.OooO0O0() - f10300OooO0Oo, Integer.MIN_VALUE), i2);
        }

        public UtilsMaxWidthRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }
}
