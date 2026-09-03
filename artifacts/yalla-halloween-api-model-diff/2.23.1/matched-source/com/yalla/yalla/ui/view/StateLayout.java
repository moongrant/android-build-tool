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
import p407o0Oo0OOO.o0o0000;
import p407o0Oo0OOO.o0oo0000;
import p407o0Oo0OOO.oO0Oo;
import p472o0OoooO.oo0OOoo;
import p546o0o0Ooo0.oOo0000O;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.o0ooOOo;
import p565o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/StateLayout;", "Lcom/common/statuslayout/StatusLayout;", "", ViewHierarchyConstants.TEXT_KEY, "", "setEmptyText", "", "image", "setEmptyImage", "setErrorText", "setErrorImage", "setErrorButtonBackground", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "Lo0Oo0OOO/o0oo0000;", "OooOOoo", "Lo0Oo0OOO/o0oo0000;", "getLoadingBinding", "()Lo0Oo0OOO/o0oo0000;", "setLoadingBinding", "(Lo0Oo0OOO/o0oo0000;)V", "loadingBinding", "Lo0Oo0OOO/o0o0000;", "OooOo00", "Lo0Oo0OOO/o0o0000;", "getEmptyBinding", "()Lo0Oo0OOO/o0o0000;", "setEmptyBinding", "(Lo0Oo0OOO/o0o0000;)V", "emptyBinding", "Lo0Oo0OOO/oO0Oo;", "OooOo0", "Lo0Oo0OOO/oO0Oo;", "getErrorBinding", "()Lo0Oo0OOO/oO0Oo;", "setErrorBinding", "(Lo0Oo0OOO/oO0Oo;)V", "errorBinding", "Lkotlin/Function0;", "OooOo0O", "Lkotlin/jvm/functions/Function0;", "getErrorButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setErrorButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "errorButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class StateLayout extends StatusLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00 f30155OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public String f30156OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f30157OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30158OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public String f30159OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30160OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f30161OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30162OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0oo0000 loadingBinding;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public oO0Oo errorBinding;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0o0000 emptyBinding;

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
                if (stateLayout.f30155OooOO0O == null) {
                    SVGAView sVGAView = (SVGAView) view2.findViewById(o0Oo0oo.view_empty_holder_sv_first_loading);
                    Intrinsics.checkNotNull(sVGAView);
                    stateLayout.f30155OooOO0O = new o00(sVGAView, oo000o.anim_loading_horse_gray, 1000L);
                }
                o00 o00Var = stateLayout.f30155OooOO0O;
                if (o00Var != null && o00Var.f38643OooO0o != 0) {
                    o00Var.f38643OooO0o = 0;
                    o00Var.f38639OooO00o.postDelayed(new o000OOo0(0, o00Var, false), o00Var.f38645OooO0oO);
                }
            } else {
                o00 o00Var2 = stateLayout.f30155OooOO0O;
                if (o00Var2 != null) {
                    o00Var2.f38643OooO0o = o00Var2.f38644OooO0o0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends oo0OOoo {
        public OooO0O0() {
        }

        @Override // p472o0OoooO.oo0OOoo
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
            text = stateLayout.getContext().getResources().getString(o000OOo.try_again);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
        } else {
            text = null;
        }
        if ((i2 & 2) != 0) {
            i = stateLayout.getContext().getResources().getColor(o0ooOOo.color_alpha_38);
        }
        if ((i2 & 4) != 0) {
            listener = oOo0000O.f55772OooO0Oo;
        }
        stateLayout.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateLayout.f30161OooOOo = text;
        stateLayout.errorButtonClickListener = listener;
        stateLayout.f30160OooOOOo = i;
    }

    public final void OooOO0O(boolean z) {
        boolean enableStateChangeAnim = getEnableStateChangeAnim();
        setEnableStateChangeAnim(z);
        OooO0oo();
        setEnableStateChangeAnim(enableStateChangeAnim);
    }

    @Nullable
    public final o0o0000 getEmptyBinding() {
        return this.emptyBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getEmptyView() {
        ImageView imageView;
        TextView textView;
        if (this.emptyBinding == null) {
            this.emptyBinding = o0o0000.inflate(LayoutInflater.from(getContext()));
        }
        o0o0000 o0o0000Var = this.emptyBinding;
        TextView textView2 = o0o0000Var != null ? o0o0000Var.f44668OooO0OO : null;
        if (textView2 != null) {
            textView2.setText(this.f30156OooOO0o);
        }
        o0o0000 o0o0000Var2 = this.emptyBinding;
        if (o0o0000Var2 != null && (textView = o0o0000Var2.f44668OooO0OO) != null) {
            textView.setTextColor(this.f30158OooOOO0);
        }
        o0o0000 o0o0000Var3 = this.emptyBinding;
        if (o0o0000Var3 != null && (imageView = o0o0000Var3.f44667OooO0O0) != null) {
            imageView.setImageResource(this.f30157OooOOO);
        }
        o0o0000 o0o0000Var4 = this.emptyBinding;
        if (o0o0000Var4 != null) {
            return o0o0000Var4.f44666OooO00o;
        }
        return null;
    }

    @Nullable
    public final oO0Oo getErrorBinding() {
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
            this.errorBinding = oO0Oo.inflate(LayoutInflater.from(getContext()));
        }
        oO0Oo oo0oo = this.errorBinding;
        TextView textView2 = oo0oo != null ? oo0oo.f44948OooO0Oo : null;
        if (textView2 != null) {
            textView2.setText(this.f30159OooOOOO);
        }
        oO0Oo oo0oo2 = this.errorBinding;
        if (oo0oo2 != null && (textView = oo0oo2.f44948OooO0Oo) != null) {
            textView.setTextColor(this.f30160OooOOOo);
        }
        oO0Oo oo0oo3 = this.errorBinding;
        if (oo0oo3 != null && (imageView = oo0oo3.f44947OooO0OO) != null) {
            imageView.setImageResource(this.f30162OooOOo0);
        }
        oO0Oo oo0oo4 = this.errorBinding;
        Button button2 = oo0oo4 != null ? oo0oo4.f44946OooO0O0 : null;
        if (button2 != null) {
            button2.setText(this.f30161OooOOo);
        }
        oO0Oo oo0oo5 = this.errorBinding;
        if (oo0oo5 != null && (button = oo0oo5.f44946OooO0O0) != null) {
            button.setOnClickListener(new OooO0O0());
        }
        oO0Oo oo0oo6 = this.errorBinding;
        if (oo0oo6 != null) {
            return oo0oo6.f44945OooO00o;
        }
        return null;
    }

    @Nullable
    public final o0oo0000 getLoadingBinding() {
        return this.loadingBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getLoadingView() {
        if (this.loadingBinding == null) {
            this.loadingBinding = o0oo0000.inflate(LayoutInflater.from(getContext()));
        }
        o0oo0000 o0oo0000Var = this.loadingBinding;
        if (o0oo0000Var != null) {
            return o0oo0000Var.f44702OooO00o;
        }
        return null;
    }

    public final void setEmptyBinding(@Nullable o0o0000 o0o0000Var) {
        this.emptyBinding = o0o0000Var;
    }

    public final void setEmptyImage(int image) {
        this.f30157OooOOO = image;
    }

    public final void setEmptyText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30156OooOO0o = text;
    }

    public final void setErrorBinding(@Nullable oO0Oo oo0oo) {
        this.errorBinding = oo0oo;
    }

    public final void setErrorButtonBackground(int image) {
    }

    public final void setErrorButtonClickListener(@Nullable Function0<Unit> function0) {
        this.errorButtonClickListener = function0;
    }

    public final void setErrorImage(int image) {
        this.f30162OooOOo0 = image;
    }

    public final void setErrorText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30159OooOOOO = text;
    }

    public final void setLoadingBinding(@Nullable o0oo0000 o0oo0000Var) {
        this.loadingBinding = o0oo0000Var;
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
        String string = context.getResources().getString(o000OOo.no_data);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f30156OooOO0o = string;
        Resources resources = context.getResources();
        int i2 = o0ooOOo.color_alpha_38;
        this.f30158OooOOO0 = resources.getColor(i2);
        this.f30157OooOOO = o0OOO0o.ic_empty_default;
        String string2 = context.getResources().getString(o000OOo.Network_request_failed);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f30159OooOOOO = string2;
        this.f30160OooOOOo = context.getResources().getColor(i2);
        String string3 = context.getResources().getString(o000OOo.Try_again);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.f30161OooOOo = string3;
        setEnableStateChangeAnim(true);
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13579OooO0Oo.add(listener);
    }
}
