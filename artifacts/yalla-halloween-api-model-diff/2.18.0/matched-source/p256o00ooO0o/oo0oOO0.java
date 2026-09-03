package p256o00ooO0o;

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
import com.code.android.yltheme.TextButtonStyle;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000OO00;
import p255o00ooO0O.o00O0000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.oOO00O;
import p257o00ooOO.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0oOO0 extends o00O00OO<oo0oOO0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f34393OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34394OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f34395OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function0<? extends Object> f34396OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00O000o f34397OooOO0O;

    public static final class OooO extends Lambda implements Function0<ViewGroup> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return oo0oOO0.this.f34223OooO0OO;
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
            Function0<? extends Object> function0 = oo0oOO0.this.f34393OooO;
            if (function0 != null) {
                function0.invoke();
            }
            oo0oOO0 oo0ooo0 = oo0oOO0.this;
            if (oo0ooo0.f34394OooO0oO) {
                oo0ooo0.OooO0Oo();
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
            Function0<? extends Object> function0 = oo0oOO0.this.f34396OooOO0;
            if (function0 != null) {
                function0.invoke();
            }
            oo0oOO0 oo0ooo0 = oo0oOO0.this;
            if (oo0ooo0.f34395OooO0oo) {
                oo0ooo0.OooO0Oo();
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
            oo0oOO0.this.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextButtonStyle.values().length];
            iArr[TextButtonStyle.Default.ordinal()] = 1;
            iArr[TextButtonStyle.OutLined.ordinal()] = 2;
            iArr[TextButtonStyle.OutLinedNegative.ordinal()] = 3;
            iArr[TextButtonStyle.None.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34394OooO0oO = true;
        this.f34395OooO0oo = true;
        this.f34397OooOO0O = new o00O000o(Reflection.getOrCreateKotlinClass(o0O00o0.class), context, new OooO());
        OooOO0o(WindowAnim.ScaleWithAlpha);
        FrameLayout frameLayout = OooOOO().f34417OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "dialogBinding.root");
        int iOooO00o = o000OO00.OooO00o(16);
        Intrinsics.checkNotNullParameter(frameLayout, "<this>");
        oOO00O.OooO0o(frameLayout, iOooO00o, iOooO00o, iOooO00o, iOooO00o);
        TextView textView = OooOOO().f34423OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        oOO00O.OooO00o(textView);
        TextView textView2 = OooOOO().f34422OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView2, "dialogBinding.tvMessage");
        oOO00O.OooO00o(textView2);
        FrameLayout frameLayout2 = OooOOO().f34418OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "dialogBinding.flCustom");
        oOO00O.OooO00o(frameLayout2);
        TextView textView3 = OooOOO().f34421OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "dialogBinding.tvRefuse");
        oOO00O.OooO00o(textView3);
        TextView textView4 = OooOOO().f34420OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "dialogBinding.tvConfirm");
        oOO00O.OooO0oO(textView4, new OooO00o());
        TextView textView5 = OooOOO().f34421OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView5, "dialogBinding.tvRefuse");
        oOO00O.OooO0oO(textView5, new OooO0O0());
        ImageView imageView = OooOOO().f34419OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "dialogBinding.ivClose");
        oOO00O.OooO0oO(imageView, new OooO0OO());
    }

    public static /* synthetic */ oo0oOO0 OooOOoo(oo0oOO0 oo0ooo0, boolean z, int i, Object obj) {
        oo0ooo0.OooOOo(true);
        return oo0ooo0;
    }

    public static /* synthetic */ oo0oOO0 OooOoo0(oo0oOO0 oo0ooo0, boolean z, int i, Object obj) {
        oo0ooo0.OooOoOO(true);
        return oo0ooo0;
    }

    @NotNull
    public final o0O00o0 OooOOO() {
        return (o0O00o0) this.f34397OooOO0O.getValue();
    }

    public final void OooOOOO(TextView textView, TextButtonStyle textButtonStyle) {
        int i = OooO0o.$EnumSwitchMapping$0[textButtonStyle.ordinal()];
        if (i == 1) {
            textView.setBackgroundResource(o00O0O0.yl_dialog_confirm_bg_selector);
            textView.setTextColor(Color.parseColor("#FFFFFFFF"));
            return;
        }
        if (i == 2) {
            textView.setBackgroundResource(o00O0O0.yl_dialog_outline_bg_selector);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        } else if (i == 3) {
            textView.setBackgroundResource(o00O0O0.yl_dialog_refuse_bg_default);
            textView.setTextColor(Color.parseColor("#FF333333"));
        } else {
            if (i != 4) {
                return;
            }
            textView.setBackground(null);
            textView.setTextColor(Color.parseColor("#00D8C9"));
        }
    }

    @NotNull
    public final oo0oOO0 OooOOOo(int i) {
        OooOOO().f34420OooO0Oo.setText(i);
        TextView textView = OooOOO().f34420OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        oOO00O.OooO(textView);
        return this;
    }

    @JvmOverloads
    @NotNull
    public final oo0oOO0 OooOOo(boolean z) {
        TextView textView = OooOOO().f34420OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        oOO00O.OooO0oo(textView, z);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOOo0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO().f34420OooO0Oo.setText(string);
        TextView textView = OooOOO().f34420OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        oOO00O.OooO(textView);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOo(@NotNull Function0<? extends Object> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34396OooOO0 = listener;
        TextView textView = OooOOO().f34421OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        oOO00O.OooO(textView);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOo0(int i) {
        TextView textView = OooOOO().f34422OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        o00O0000.OooO00o(textView, o000O0O0.OooO0OO(i));
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOo00(@NotNull View customizeView) {
        Intrinsics.checkNotNullParameter(customizeView, "customizeView");
        OooOOO().f34418OooO0O0.removeAllViews();
        OooOOO().f34418OooO0O0.addView(customizeView);
        FrameLayout frameLayout = OooOOO().f34418OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "dialogBinding.flCustom");
        oOO00O.OooO(frameLayout);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOo0O(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        TextView textView = OooOOO().f34422OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        o00O0000.OooO00o(textView, message);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOo0o(@NotNull Function0<? extends Object> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34393OooO = listener;
        TextView textView = OooOOO().f34420OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
        oOO00O.OooO(textView);
        return this;
    }

    @JvmOverloads
    @NotNull
    public final oo0oOO0 OooOoO() {
        OooOoo0(this, false, 1, null);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOoO0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        OooOOO().f34421OooO0o.setText(string);
        TextView textView = OooOOO().f34421OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        oOO00O.OooO(textView);
        return this;
    }

    @JvmOverloads
    @NotNull
    public final oo0oOO0 OooOoOO(boolean z) {
        TextView textView = OooOOO().f34421OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvRefuse");
        oOO00O.OooO0oo(textView, z);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOoo(int i) {
        TextView textView = OooOOO().f34423OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        o00O0000.OooO00o(textView, o000O0O0.OooO0OO(i));
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOooO(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = OooOOO().f34423OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvTitle");
        o00O0000.OooO00o(textView, title);
        return this;
    }

    @NotNull
    public final oo0oOO0 OooOooo() {
        ImageView imageView = OooOOO().f34419OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "dialogBinding.ivClose");
        oOO00O.OooO(imageView);
        Space space = OooOOO().f34424OooO0oo;
        Intrinsics.checkNotNullExpressionValue(space, "dialogBinding.vCloseHolder");
        oOO00O.OooO(space);
        return this;
    }
}
