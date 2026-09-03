package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.uikit.svga.SVGAView;
import com.common.statuslayout.StatusLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00;
import p194o00o0OO.o000OOo0;
import p405o0Oo0OOO.o0OOo000;
import p405o0Oo0OOO.o0o0000;
import p405o0Oo0OOO.oO0Oo;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o00oO0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p587o0oOooOO.b2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/StateLayout;", "Lcom/common/statuslayout/StatusLayout;", "", ViewHierarchyConstants.TEXT_KEY, "", "setEmptyText", "", "image", "setEmptyImage", "setErrorText", "setErrorImage", "setErrorButtonBackground", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "Lo0Oo0OOO/oO0Oo;", "OooOOoo", "Lo0Oo0OOO/oO0Oo;", "getLoadingBinding", "()Lo0Oo0OOO/oO0Oo;", "setLoadingBinding", "(Lo0Oo0OOO/oO0Oo;)V", "loadingBinding", "Lo0Oo0OOO/o0OOo000;", "OooOo00", "Lo0Oo0OOO/o0OOo000;", "getEmptyBinding", "()Lo0Oo0OOO/o0OOo000;", "setEmptyBinding", "(Lo0Oo0OOO/o0OOo000;)V", "emptyBinding", "Lo0Oo0OOO/o0o0000;", "OooOo0", "Lo0Oo0OOO/o0o0000;", "getErrorBinding", "()Lo0Oo0OOO/o0o0000;", "setErrorBinding", "(Lo0Oo0OOO/o0o0000;)V", "errorBinding", "Lkotlin/Function0;", "OooOo0O", "Lkotlin/jvm/functions/Function0;", "getErrorButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setErrorButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "errorButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class StateLayout extends StatusLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00 f30145OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public String f30146OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f30147OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30148OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public String f30149OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30150OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f30151OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30152OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public oO0Oo loadingBinding;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0o0000 errorBinding;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0OOo000 emptyBinding;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> errorButtonClickListener;

    public static final class OooO00o extends Lambda implements Function2<StatusLayout.State, View, Unit> {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.StateLayout$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0340OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StatusLayout.State.values().length];
                try {
                    iArr[StatusLayout.State.Loading.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(StatusLayout.State state, View view) {
            StatusLayout.State state2 = state;
            View view2 = view;
            Intrinsics.checkNotNullParameter(state2, "state");
            Intrinsics.checkNotNullParameter(view2, "view");
            int i = C0340OooO00o.$EnumSwitchMapping$0[state2.ordinal()];
            StateLayout stateLayout = StateLayout.this;
            if (i == 1) {
                if (stateLayout.f30145OooOO0O == null) {
                    SVGAView sVGAView = (SVGAView) view2.findViewById(o0OO00O.view_empty_holder_sv_first_loading);
                    Intrinsics.checkNotNull(sVGAView);
                    stateLayout.f30145OooOO0O = new o00(sVGAView, o00oO0o.anim_loading_horse_gray, 1000L);
                }
                o00 o00Var = stateLayout.f30145OooOO0O;
                if (o00Var != null && o00Var.f38647OooO0o != 0) {
                    o00Var.f38647OooO0o = 0;
                    o00Var.f38643OooO00o.postDelayed(new o000OOo0(0, o00Var, false), o00Var.f38649OooO0oO);
                }
            } else {
                o00 o00Var2 = stateLayout.f30145OooOO0O;
                if (o00Var2 != null) {
                    o00Var2.f38647OooO0o = o00Var2.f38648OooO0o0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Function0<Unit> errorButtonClickListener = StateLayout.this.getErrorButtonClickListener();
            if (errorButtonClickListener != null) {
                errorButtonClickListener.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooOO0(StateLayout stateLayout, int i, Function0 listener, int i2) {
        String text;
        if ((i2 & 1) != 0) {
            text = stateLayout.getContext().getResources().getString(o000000.try_again);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        } else {
            text = null;
        }
        if ((i2 & 2) != 0) {
            i = stateLayout.getContext().getResources().getColor(o0OOO0o.color_alpha_38);
        }
        if ((i2 & 4) != 0) {
            listener = b2.f56752OooO0Oo;
        }
        stateLayout.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateLayout.f30151OooOOo = text;
        stateLayout.errorButtonClickListener = listener;
        stateLayout.f30150OooOOOo = i;
    }

    public final void OooOO0O(boolean z) {
        boolean enableStateChangeAnim = getEnableStateChangeAnim();
        setEnableStateChangeAnim(z);
        OooO0oo();
        setEnableStateChangeAnim(enableStateChangeAnim);
    }

    @Nullable
    public final o0OOo000 getEmptyBinding() {
        return this.emptyBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getEmptyView() {
        ImageView imageView;
        TextView textView;
        if (this.emptyBinding == null) {
            this.emptyBinding = o0OOo000.inflate(LayoutInflater.from(getContext()));
        }
        o0OOo000 o0ooo001 = this.emptyBinding;
        TextView textView2 = o0ooo001 != null ? o0ooo001.f44645OooO0OO : null;
        if (textView2 != null) {
            textView2.setText(this.f30146OooOO0o);
        }
        o0OOo000 o0ooo002 = this.emptyBinding;
        if (o0ooo002 != null && (textView = o0ooo002.f44645OooO0OO) != null) {
            textView.setTextColor(this.f30148OooOOO0);
        }
        o0OOo000 o0ooo003 = this.emptyBinding;
        if (o0ooo003 != null && (imageView = o0ooo003.f44644OooO0O0) != null) {
            imageView.setImageResource(this.f30147OooOOO);
        }
        o0OOo000 o0ooo004 = this.emptyBinding;
        if (o0ooo004 != null) {
            return o0ooo004.f44643OooO00o;
        }
        return null;
    }

    @Nullable
    public final o0o0000 getErrorBinding() {
        return this.errorBinding;
    }

    @Nullable
    public final Function0<Unit> getErrorButtonClickListener() {
        return this.errorButtonClickListener;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getErrorView() {
        Button button;
        ImageView imageView;
        TextView textView;
        if (this.errorBinding == null) {
            this.errorBinding = o0o0000.inflate(LayoutInflater.from(getContext()));
        }
        o0o0000 o0o0000Var = this.errorBinding;
        TextView textView2 = o0o0000Var != null ? o0o0000Var.f44665OooO0Oo : null;
        if (textView2 != null) {
            textView2.setText(this.f30149OooOOOO);
        }
        o0o0000 o0o0000Var2 = this.errorBinding;
        if (o0o0000Var2 != null && (textView = o0o0000Var2.f44665OooO0Oo) != null) {
            textView.setTextColor(this.f30150OooOOOo);
        }
        o0o0000 o0o0000Var3 = this.errorBinding;
        if (o0o0000Var3 != null && (imageView = o0o0000Var3.f44664OooO0OO) != null) {
            imageView.setImageResource(this.f30152OooOOo0);
        }
        o0o0000 o0o0000Var4 = this.errorBinding;
        Button button2 = o0o0000Var4 != null ? o0o0000Var4.f44663OooO0O0 : null;
        if (button2 != null) {
            button2.setText(this.f30151OooOOo);
        }
        o0o0000 o0o0000Var5 = this.errorBinding;
        if (o0o0000Var5 != null && (button = o0o0000Var5.f44663OooO0O0) != null) {
            button.setOnClickListener(new OooO0O0());
        }
        o0o0000 o0o0000Var6 = this.errorBinding;
        if (o0o0000Var6 != null) {
            return o0o0000Var6.f44662OooO00o;
        }
        return null;
    }

    @Nullable
    public final oO0Oo getLoadingBinding() {
        return this.loadingBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getLoadingView() {
        if (this.loadingBinding == null) {
            this.loadingBinding = oO0Oo.inflate(LayoutInflater.from(getContext()));
        }
        oO0Oo oo0oo = this.loadingBinding;
        if (oo0oo != null) {
            return oo0oo.f44925OooO00o;
        }
        return null;
    }

    public final void setEmptyBinding(@Nullable o0OOo000 o0ooo001) {
        this.emptyBinding = o0ooo001;
    }

    public final void setEmptyImage(int image) {
        this.f30147OooOOO = image;
    }

    public final void setEmptyText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30146OooOO0o = text;
    }

    public final void setErrorBinding(@Nullable o0o0000 o0o0000Var) {
        this.errorBinding = o0o0000Var;
    }

    public final void setErrorButtonBackground(int image) {
    }

    public final void setErrorButtonClickListener(@Nullable Function0<Unit> function0) {
        this.errorButtonClickListener = function0;
    }

    public final void setErrorImage(int image) {
        this.f30152OooOOo0 = image;
    }

    public final void setErrorText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30149OooOOOO = text;
    }

    public final void setLoadingBinding(@Nullable oO0Oo oo0oo) {
        this.loadingBinding = oo0oo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StateLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getString(o000000.no_data);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f30146OooOO0o = string;
        Resources resources = context.getResources();
        int i2 = o0OOO0o.color_alpha_38;
        this.f30148OooOOO0 = resources.getColor(i2);
        this.f30147OooOOO = o0Oo0oo.ic_empty_default;
        String string2 = context.getResources().getString(o000000.Network_request_failed);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f30149OooOOOO = string2;
        this.f30150OooOOOo = context.getResources().getColor(i2);
        String string3 = context.getResources().getString(o000000.Try_again);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.f30151OooOOo = string3;
        setEnableStateChangeAnim(true);
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13571OooO0Oo.add(listener);
    }
}
