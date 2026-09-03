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
import p148o00Oo0o.o00O0O;
import p148o00Oo0o.o0OoOo0;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.x2;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO0O0OoO;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.h3;
import p641o0ooOOOO.i3;
import p641o0ooOOOO.j3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/StateLayout;", "Lcom/common/statuslayout/StatusLayout;", "", ViewHierarchyConstants.TEXT_KEY, "", "setEmptyText", "", "image", "setEmptyImage", "setErrorText", "setErrorImage", "setErrorButtonBackground", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "Lo0ooOOOO/j3;", "OooOOoo", "Lo0ooOOOO/j3;", "getLoadingBinding", "()Lo0ooOOOO/j3;", "setLoadingBinding", "(Lo0ooOOOO/j3;)V", "loadingBinding", "Lo0ooOOOO/h3;", "OooOo00", "Lo0ooOOOO/h3;", "getEmptyBinding", "()Lo0ooOOOO/h3;", "setEmptyBinding", "(Lo0ooOOOO/h3;)V", "emptyBinding", "Lo0ooOOOO/i3;", "OooOo0", "Lo0ooOOOO/i3;", "getErrorBinding", "()Lo0ooOOOO/i3;", "setErrorBinding", "(Lo0ooOOOO/i3;)V", "errorBinding", "Lkotlin/Function0;", "OooOo0O", "Lkotlin/jvm/functions/Function0;", "getErrorButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setErrorButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "errorButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class StateLayout extends StatusLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00O0O f30690OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public String f30691OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f30692OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30693OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public String f30694OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f30695OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f30696OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30697OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public j3 loadingBinding;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public i3 errorBinding;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h3 emptyBinding;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> errorButtonClickListener;

    public static final class OooO00o extends Lambda implements Function2<StatusLayout.State, View, Unit> {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.StateLayout$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0341OooO00o {
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
            int i = C0341OooO00o.$EnumSwitchMapping$0[state2.ordinal()];
            StateLayout stateLayout = StateLayout.this;
            if (i == 1) {
                if (stateLayout.f30690OooOO0O == null) {
                    SVGAView svgaView = (SVGAView) view2.findViewById(oO00O0oO.view_empty_holder_sv_first_loading);
                    Intrinsics.checkNotNullExpressionValue(svgaView, "svgaView");
                    stateLayout.f30690OooOO0O = new o00O0O(svgaView, oO0O0OoO.anim_loading_horse_gray, 1000L);
                }
                o00O0O o00o0o2 = stateLayout.f30690OooOO0O;
                if (o00o0o2 != null && o00o0o2.f37844OooO0o != 0) {
                    o00o0o2.f37844OooO0o = 0;
                    o00o0o2.f37840OooO00o.postDelayed(new o0OoOo0(0, o00o0o2, false), o00o0o2.f37846OooO0oO);
                }
            } else {
                o00O0O o00o0o3 = stateLayout.f30690OooOO0O;
                if (o00o0o3 != null) {
                    o00o0o3.f37844OooO0o = o00o0o3.f37845OooO0o0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
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
            text = stateLayout.getContext().getResources().getString(oO00OOo0.try_again);
            Intrinsics.checkNotNullExpressionValue(text, "context.resources.getString(R.string.try_again)");
        } else {
            text = null;
        }
        if ((i2 & 2) != 0) {
            i = stateLayout.getContext().getResources().getColor(oO00O0o.color_alpha_38);
        }
        if ((i2 & 4) != 0) {
            listener = x2.f55746OooO0Oo;
        }
        stateLayout.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateLayout.f30696OooOOo = text;
        stateLayout.errorButtonClickListener = listener;
        stateLayout.f30695OooOOOo = i;
    }

    public final void OooOO0O(boolean z) {
        boolean enableStateChangeAnim = getEnableStateChangeAnim();
        setEnableStateChangeAnim(z);
        OooO0oo();
        setEnableStateChangeAnim(enableStateChangeAnim);
    }

    @Nullable
    public final h3 getEmptyBinding() {
        return this.emptyBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getEmptyView() {
        ImageView imageView;
        TextView textView;
        if (this.emptyBinding == null) {
            this.emptyBinding = h3.inflate(LayoutInflater.from(getContext()));
        }
        h3 h3Var = this.emptyBinding;
        TextView textView2 = h3Var != null ? h3Var.f58030OooO0OO : null;
        if (textView2 != null) {
            textView2.setText(this.f30691OooOO0o);
        }
        h3 h3Var2 = this.emptyBinding;
        if (h3Var2 != null && (textView = h3Var2.f58030OooO0OO) != null) {
            textView.setTextColor(this.f30693OooOOO0);
        }
        h3 h3Var3 = this.emptyBinding;
        if (h3Var3 != null && (imageView = h3Var3.f58029OooO0O0) != null) {
            imageView.setImageResource(this.f30692OooOOO);
        }
        h3 h3Var4 = this.emptyBinding;
        if (h3Var4 != null) {
            return h3Var4.f58028OooO00o;
        }
        return null;
    }

    @Nullable
    public final i3 getErrorBinding() {
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
            this.errorBinding = i3.inflate(LayoutInflater.from(getContext()));
        }
        i3 i3Var = this.errorBinding;
        TextView textView2 = i3Var != null ? i3Var.f58105OooO0Oo : null;
        if (textView2 != null) {
            textView2.setText(this.f30694OooOOOO);
        }
        i3 i3Var2 = this.errorBinding;
        if (i3Var2 != null && (textView = i3Var2.f58105OooO0Oo) != null) {
            textView.setTextColor(this.f30695OooOOOo);
        }
        i3 i3Var3 = this.errorBinding;
        if (i3Var3 != null && (imageView = i3Var3.f58104OooO0OO) != null) {
            imageView.setImageResource(this.f30697OooOOo0);
        }
        i3 i3Var4 = this.errorBinding;
        Button button2 = i3Var4 != null ? i3Var4.f58103OooO0O0 : null;
        if (button2 != null) {
            button2.setText(this.f30696OooOOo);
        }
        i3 i3Var5 = this.errorBinding;
        if (i3Var5 != null && (button = i3Var5.f58103OooO0O0) != null) {
            button.setOnClickListener(new OooO0O0());
        }
        i3 i3Var6 = this.errorBinding;
        if (i3Var6 != null) {
            return i3Var6.f58102OooO00o;
        }
        return null;
    }

    @Nullable
    public final j3 getLoadingBinding() {
        return this.loadingBinding;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getLoadingView() {
        if (this.loadingBinding == null) {
            this.loadingBinding = j3.inflate(LayoutInflater.from(getContext()));
        }
        j3 j3Var = this.loadingBinding;
        if (j3Var != null) {
            return j3Var.f58161OooO00o;
        }
        return null;
    }

    public final void setEmptyBinding(@Nullable h3 h3Var) {
        this.emptyBinding = h3Var;
    }

    public final void setEmptyImage(int image) {
        this.f30692OooOOO = image;
    }

    public final void setEmptyText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30691OooOO0o = text;
    }

    public final void setErrorBinding(@Nullable i3 i3Var) {
        this.errorBinding = i3Var;
    }

    public final void setErrorButtonBackground(int image) {
    }

    public final void setErrorButtonClickListener(@Nullable Function0<Unit> function0) {
        this.errorButtonClickListener = function0;
    }

    public final void setErrorImage(int image) {
        this.f30697OooOOo0 = image;
    }

    public final void setErrorText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f30694OooOOOO = text;
    }

    public final void setLoadingBinding(@Nullable j3 j3Var) {
        this.loadingBinding = j3Var;
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
        String string = context.getResources().getString(oO00OOo0.no_data);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(R.string.no_data)");
        this.f30691OooOO0o = string;
        Resources resources = context.getResources();
        int i2 = oO00O0o.color_alpha_38;
        this.f30693OooOOO0 = resources.getColor(i2);
        this.f30692OooOOO = oOo00OO0.ic_empty_default;
        String string2 = context.getResources().getString(oO00OOo0.Network_request_failed);
        Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getStr…g.Network_request_failed)");
        this.f30694OooOOOO = string2;
        this.f30695OooOOOo = context.getResources().getColor(i2);
        String string3 = context.getResources().getString(oO00OOo0.Try_again);
        Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getString(R.string.Try_again)");
        this.f30696OooOOo = string3;
        setEnableStateChangeAnim(true);
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f10510OooO0Oo.add(listener);
    }
}
