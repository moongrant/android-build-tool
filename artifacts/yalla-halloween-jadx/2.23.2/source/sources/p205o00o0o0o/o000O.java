package p205o00o0o0o;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.easydialog.WindowAnim;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O000;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206o00o0oO.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTextDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDialog.kt\ncom/code/android/yldialog/TextDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,275:1\n23#2:276\n*S KotlinDebug\n*F\n+ 1 TextDialog.kt\ncom/code/android/yldialog/TextDialog\n*L\n19#1:276\n*E\n"})
public final class o000O extends o0000OO0<o000O> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f39361OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f39362OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f39363OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f39364OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o000O0 f39365OooOO0O;

    public static final class OooO extends Lambda implements Function0<ViewGroup> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o000O.this.f38489OooO0OO;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O o000o = o000O.this;
            Function0<? extends Object> function0 = o000o.f39361OooO;
            if (function0 != null) {
                function0.invoke();
            }
            if (o000o.f39362OooO0oO) {
                o000o.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O o000o = o000O.this;
            Function0<? extends Object> function0 = o000o.f39364OooOO0;
            if (function0 != null) {
                function0.invoke();
            }
            if (o000o.f39363OooO0oo) {
                o000o.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O.this.f38488OooO0O0.cancel();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextButtonStyle.values().length];
            try {
                iArr[TextButtonStyle.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextButtonStyle.GreenOutLined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextButtonStyle.GreyOutLined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextButtonStyle.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39362OooO0oO = true;
        this.f39363OooO0oo = true;
        this.f39365OooOO0O = new o000O0(Reflection.getOrCreateKotlinClass(o0O00000.class), context, new OooO());
        OooOO0O(WindowAnim.ScaleWithAlpha);
        FrameLayout frameLayout = OooOOO0().f39387OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        int iOooO00o = o0000O0.OooO00o(16);
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        com.code.android.util.o000O.OooO0oO(frameLayout, iOooO00o, iOooO00o, iOooO00o, iOooO00o);
        TextView tvTitle = OooOOO0().f39393OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        com.code.android.util.o000O.OooO0O0(tvTitle);
        TextView tvMessage = OooOOO0().f39392OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        com.code.android.util.o000O.OooO0O0(tvMessage);
        FrameLayout flCustom = OooOOO0().f39388OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flCustom, "flCustom");
        com.code.android.util.o000O.OooO0O0(flCustom);
        TextView tvRefuse = OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
        com.code.android.util.o000O.OooO0O0(tvRefuse);
        TextView tvConfirm = OooOOO0().f39390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        com.code.android.util.o000O.OooO(tvConfirm, new OooO00o());
        TextView tvRefuse2 = OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse2, "tvRefuse");
        com.code.android.util.o000O.OooO(tvRefuse2, new OooO0O0());
        ImageView ivClose = OooOOO0().f39389OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        com.code.android.util.o000O.OooO(ivClose, new OooO0OO());
    }

    public static void OooOOO(TextView textView, TextButtonStyle textButtonStyle) {
        int i = OooO0o.$EnumSwitchMapping$0[textButtonStyle.ordinal()];
        if (i == 1) {
            textView.setBackgroundResource(o000O00.yl_dialog_confirm_bg_selector);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            return;
        }
        if (i == 2) {
            textView.setBackgroundResource(o000O00.yl_dialog_outline_bg_selector);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        } else if (i == 3) {
            textView.setBackgroundResource(o000O00.yl_dialog_refuse_bg_default);
            textView.setTextColor(Color.parseColor("#FF333333"));
        } else if (i != 4) {
            textView.setBackgroundResource(o000O00.yl_dialog_confirm_bg_selector);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
        } else {
            textView.setBackground(null);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        }
    }

    @NotNull
    public final o0O00000 OooOOO0() {
        return (o0O00000) this.f39365OooOO0O.getValue();
    }

    @NotNull
    public final void OooOOOO(int i) {
        OooOOO0().f39390OooO0Oo.setText(i);
        TextView tvConfirm = OooOOO0().f39390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        com.code.android.util.o000O.OooOOOO(tvConfirm);
    }

    @NotNull
    public final void OooOOOo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO0().f39390OooO0Oo.setText(string);
        TextView tvConfirm = OooOOO0().f39390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        com.code.android.util.o000O.OooOOOO(tvConfirm);
    }

    @NotNull
    public final void OooOOo(@NotNull View customizeView) {
        Intrinsics.checkNotNullParameter(customizeView, "customizeView");
        OooOOO0().f39388OooO0O0.removeAllViews();
        OooOOO0().f39388OooO0O0.addView(customizeView);
        FrameLayout flCustom = OooOOO0().f39388OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flCustom, "flCustom");
        com.code.android.util.o000O.OooOOOO(flCustom);
    }

    @JvmOverloads
    @NotNull
    public final void OooOOo0(boolean z) {
        TextView tvConfirm = OooOOO0().f39390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        com.code.android.util.o000O.OooOOO0(tvConfirm, z);
    }

    @NotNull
    public final void OooOOoo(int i) {
        TextView tvMessage = OooOOO0().f39392OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o000O000.OooO00o(tvMessage, o0000.OooO0OO(i));
    }

    @JvmOverloads
    @NotNull
    public final void OooOo(boolean z) {
        TextView tvRefuse = OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
        com.code.android.util.o000O.OooOOO0(tvRefuse, z);
    }

    @NotNull
    public final void OooOo0(@NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39361OooO = listener;
        TextView tvConfirm = OooOOO0().f39390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        com.code.android.util.o000O.OooOOOO(tvConfirm);
    }

    @NotNull
    public final void OooOo00(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        TextView tvMessage = OooOOO0().f39392OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o000O000.OooO00o(tvMessage, message);
    }

    @NotNull
    public final void OooOo0O(@NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f39364OooOO0 = listener;
        TextView tvRefuse = OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
        com.code.android.util.o000O.OooOOOO(tvRefuse);
    }

    @NotNull
    public final void OooOo0o(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO0().f39391OooO0o.setText(string);
        TextView tvRefuse = OooOOO0().f39391OooO0o;
        Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
        com.code.android.util.o000O.OooOOOO(tvRefuse);
    }

    @NotNull
    public final void OooOoO(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView tvTitle = OooOOO0().f39393OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        o000O000.OooO00o(tvTitle, title);
    }

    @NotNull
    public final void OooOoO0(int i) {
        TextView tvTitle = OooOOO0().f39393OooO0oO;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        o000O000.OooO00o(tvTitle, o0000.OooO0OO(i));
    }

    @NotNull
    public final void OooOoOO() {
        ImageView ivClose = OooOOO0().f39389OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        com.code.android.util.o000O.OooOOOO(ivClose);
        Space vCloseHolder = OooOOO0().f39394OooO0oo;
        Intrinsics.checkNotNullExpressionValue(vCloseHolder, "vCloseHolder");
        com.code.android.util.o000O.OooOOOO(vCloseHolder);
    }
}
