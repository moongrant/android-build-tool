package com.code.android.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class ToastUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f12567OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ToastUtil f12568OooO0O0 = new ToastUtil();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static WeakReference<OooO0OO> f12569OooO0OO;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003B\u0000¨\u0006\u0004"}, d2 = {"Lcom/code/android/util/ToastUtil$MODE;", "", "Companion", "OooO00o", "AndroidUtil_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MODE {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f12570OooO00o;

        /* JADX INFO: renamed from: com.code.android.util.ToastUtil$MODE$OooO00o, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ Companion f12570OooO00o = new Companion();
        }
    }

    public static abstract class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Toast f12571OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public ToastUtil f12572OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public View f12573OooO0OO;

        public OooO00o(@NotNull ToastUtil toastUtils) {
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Toast toast = new Toast(o00O000.OooO00o());
            this.f12571OooO00o = toast;
            this.f12572OooO0O0 = toastUtils;
            Intrinsics.checkNotNull(toast);
            toast.setGravity(17, 0, 0);
        }

        @Override // com.code.android.util.ToastUtil.OooO0OO
        @CallSuper
        public final void cancel() {
            Toast toast = this.f12571OooO00o;
            if (toast != null) {
                toast.cancel();
            }
            this.f12571OooO00o = null;
            this.f12573OooO0OO = null;
        }
    }

    public static final class OooO0O0 {
        public final void OooO00o(@StringRes int i) {
            OooO0OO(o000O0O0.OooO0OO(i), ToastUtil.f12568OooO0O0);
        }

        public final void OooO0O0(@Nullable CharSequence charSequence) {
            OooO0OO(charSequence, ToastUtil.f12568OooO0O0);
        }

        public final void OooO0OO(CharSequence charSequence, ToastUtil toastUtil) {
            if (charSequence == null || StringsKt.isBlank(charSequence)) {
                return;
            }
            o0O0ooO runnable = new o0O0ooO(toastUtil, charSequence);
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                runnable.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(runnable);
            }
        }
    }

    public interface OooO0OO {
        void cancel();
    }

    public static final class OooO0o extends OooO00o {

        public static final class OooO00o extends Handler {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final Handler f12574OooO00o;

            public OooO00o(@NotNull Handler impl) {
                Intrinsics.checkNotNullParameter(impl, "impl");
                this.f12574OooO00o = impl;
            }

            @Override // android.os.Handler
            public final void dispatchMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                try {
                    this.f12574OooO00o.dispatchMessage(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public final void handleMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.f12574OooO00o.handleMessage(msg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(@NotNull ToastUtil toastUtils) {
            super(toastUtils);
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f12571OooO00o);
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
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/code/android/util/ToastUtil$UtilsMaxWidthRelativeLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AndroidUtil_release"}, k = 1, mv = {1, 7, 1})
    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final int f12575Oooo0o = o000OO00.OooO00o(80);

        public UtilsMaxWidthRelativeLayout(@Nullable Context context) {
            super(context);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(o000O.OooO00o() - f12575Oooo0o, Integer.MIN_VALUE), i2);
        }

        public UtilsMaxWidthRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }
}
