package p157o00OoOO0;

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
import com.code.android.util.o000O000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
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
import p159o00OoOOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTextDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDialog.kt\ncom/code/android/yldialog/TextDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,275:1\n23#2:276\n*S KotlinDebug\n*F\n+ 1 TextDialog.kt\ncom/code/android/yldialog/TextDialog\n*L\n19#1:276\n*E\n"})
public final class o0OO00O extends Oooo0<o0OO00O> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f38241OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f38242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f38243OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f38244OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f38245OooOO0O;

    public static final class OooO extends Lambda implements Function0<ViewGroup> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o0OO00O.this.f10135OooO0OO;
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
            o0OO00O o0oo00o2 = o0OO00O.this;
            Function0<? extends Object> function0 = o0oo00o2.f38241OooO;
            if (function0 != null) {
                function0.invoke();
            }
            if (o0oo00o2.f38242OooO0oO) {
                o0oo00o2.OooO0OO();
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
            o0OO00O o0oo00o2 = o0OO00O.this;
            Function0<? extends Object> function0 = o0oo00o2.f38244OooOO0;
            if (function0 != null) {
                function0.invoke();
            }
            if (o0oo00o2.f38243OooO0oo) {
                o0oo00o2.OooO0OO();
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
            o0OO00O.this.f10134OooO0O0.cancel();
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
    public o0OO00O(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38242OooO0oO = true;
        this.f38243OooO0oo = true;
        this.f38245OooOO0O = new o000O0Oo(Reflection.getOrCreateKotlinClass(o000OOo.class), context, new OooO());
        OooOO0O(WindowAnim.ScaleWithAlpha);
        FrameLayout frameLayout = OooOOO0().f38471OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "dialogBinding.root");
        int iOooO00o = o0000O0.OooO00o(16);
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        o000OO00.OooO0oO(frameLayout, iOooO00o, iOooO00o, iOooO00o, iOooO00o);
        TextView textView = OooOOO0().f38477OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        o000OO00.OooO0O0(textView);
        TextView textView2 = OooOOO0().f38476OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "dialogBinding.tvMessage");
        o000OO00.OooO0O0(textView2);
        FrameLayout frameLayout2 = OooOOO0().f38472OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "dialogBinding.flCustom");
        o000OO00.OooO0O0(frameLayout2);
        TextView textView3 = OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "dialogBinding.tvRefuse");
        o000OO00.OooO0O0(textView3);
        TextView textView4 = OooOOO0().f38474OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "dialogBinding.tvConfirm");
        o000OO00.OooO(textView4, new OooO00o());
        TextView textView5 = OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView5, "dialogBinding.tvRefuse");
        o000OO00.OooO(textView5, new OooO0O0());
        ImageView imageView = OooOOO0().f38473OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "dialogBinding.ivClose");
        o000OO00.OooO(imageView, new OooO0OO());
    }

    public static void OooOOO(TextView textView, TextButtonStyle textButtonStyle) {
        int i = OooO0o.$EnumSwitchMapping$0[textButtonStyle.ordinal()];
        if (i == 1) {
            textView.setBackgroundResource(o00Ooo.yl_dialog_confirm_bg_selector);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            return;
        }
        if (i == 2) {
            textView.setBackgroundResource(o00Ooo.yl_dialog_outline_bg_selector);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        } else if (i == 3) {
            textView.setBackgroundResource(o00Ooo.yl_dialog_refuse_bg_default);
            textView.setTextColor(Color.parseColor("#FF333333"));
        } else if (i != 4) {
            textView.setBackgroundResource(o00Ooo.yl_dialog_confirm_bg_selector);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
        } else {
            textView.setBackground(null);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        }
    }

    @NotNull
    public final o000OOo OooOOO0() {
        return (o000OOo) this.f38245OooOO0O.getValue();
    }

    @NotNull
    public final void OooOOOO(int i) {
        OooOOO0().f38474OooO0Oo.setText(i);
        TextView textView = OooOOO0().f38474OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        o000OO00.OooOOOO(textView);
    }

    @NotNull
    public final void OooOOOo(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO0().f38474OooO0Oo.setText(string);
        TextView textView = OooOOO0().f38474OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        o000OO00.OooOOOO(textView);
    }

    @NotNull
    public final void OooOOo(@NotNull View customizeView) {
        Intrinsics.checkNotNullParameter(customizeView, "customizeView");
        OooOOO0().f38472OooO0O0.removeAllViews();
        OooOOO0().f38472OooO0O0.addView(customizeView);
        FrameLayout frameLayout = OooOOO0().f38472OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "dialogBinding.flCustom");
        o000OO00.OooOOOO(frameLayout);
    }

    @JvmOverloads
    @NotNull
    public final void OooOOo0(boolean z) {
        TextView textView = OooOOO0().f38474OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        o000OO00.OooOOO0(textView, z);
    }

    @NotNull
    public final void OooOOoo(int i) {
        TextView textView = OooOOO0().f38476OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        o000O000.OooO00o(textView, o0000.OooO0OO(i));
    }

    @JvmOverloads
    @NotNull
    public final void OooOo(boolean z) {
        TextView textView = OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        o000OO00.OooOOO0(textView, z);
    }

    @NotNull
    public final void OooOo0(@NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38241OooO = listener;
        TextView textView = OooOOO0().f38474OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        o000OO00.OooOOOO(textView);
    }

    @NotNull
    public final void OooOo00(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        TextView textView = OooOOO0().f38476OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        o000O000.OooO00o(textView, message);
    }

    @NotNull
    public final void OooOo0O(@NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38244OooOO0 = listener;
        TextView textView = OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        o000OO00.OooOOOO(textView);
    }

    @NotNull
    public final void OooOo0o(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO0().f38475OooO0o.setText(string);
        TextView textView = OooOOO0().f38475OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        o000OO00.OooOOOO(textView);
    }

    @NotNull
    public final void OooOoO(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = OooOOO0().f38477OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        o000O000.OooO00o(textView, title);
    }

    @NotNull
    public final void OooOoO0(int i) {
        TextView textView = OooOOO0().f38477OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        o000O000.OooO00o(textView, o0000.OooO0OO(i));
    }

    @NotNull
    public final void OooOoOO() {
        ImageView imageView = OooOOO0().f38473OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "dialogBinding.ivClose");
        o000OO00.OooOOOO(imageView);
        Space space = OooOOO0().f38478OooO0oo;
        Intrinsics.checkNotNullExpressionValue(space, "dialogBinding.vCloseHolder");
        o000OO00.OooOOOO(space);
    }
}
