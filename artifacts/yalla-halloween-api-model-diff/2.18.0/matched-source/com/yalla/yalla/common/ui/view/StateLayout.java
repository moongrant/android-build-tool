package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.statuslayout.StatusLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;
import p510o0o00oOo.o000OOo0;
import p518o0o0O000.o00Oo0;
import p651o0ooOOoo.aa;
import p651o0ooOOoo.ba;
import p651o0ooOOoo.z9;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/yalla/yalla/common/ui/view/StateLayout;", "Lcom/common/statuslayout/StatusLayout;", "", ViewHierarchyConstants.TEXT_KEY, "", "setEmptyText", "", "image", "setEmptyImage", "setErrorText", "setErrorImage", "setErrorButtonBackground", "Landroid/view/View;", "getLoadingView", "getEmptyView", "getErrorView", "Lkotlin/Function0;", "Oooooo", "Lkotlin/jvm/functions/Function0;", "getErrorButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setErrorButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "errorButtonClickListener", "Lo0ooOOoo/ba;", "loadingBinding", "Lo0ooOOoo/ba;", "getLoadingBinding", "()Lo0ooOOoo/ba;", "setLoadingBinding", "(Lo0ooOOoo/ba;)V", "Lo0ooOOoo/z9;", "emptyBinding", "Lo0ooOOoo/z9;", "getEmptyBinding", "()Lo0ooOOoo/z9;", "setEmptyBinding", "(Lo0ooOOoo/z9;)V", "Lo0ooOOoo/aa;", "errorBinding", "Lo0ooOOoo/aa;", "getErrorBinding", "()Lo0ooOOoo/aa;", "setErrorBinding", "(Lo0ooOOoo/aa;)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StateLayout extends StatusLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public o00Oo0 f21039OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public String f21040OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f21041OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f21042OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public String f21043OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f21044Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f21045Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public String f21046OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ba f21047OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public z9 f21048OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> errorButtonClickListener;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public aa f21050Oooooo0;

    public static final class OooO00o extends Lambda implements Function2<StatusLayout.State, View, Unit> {

        /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.StateLayout$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0222OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StatusLayout.State.values().length];
                iArr[StatusLayout.State.Loading.ordinal()] = 1;
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
            if (C0222OooO00o.$EnumSwitchMapping$0[state2.ordinal()] == 1) {
                if (StateLayout.this.f21039OoooOOO == null) {
                    SVGAView svgaView = (SVGAView) view2.findViewById(R.id.view_empty_holder_sv_first_loading);
                    StateLayout stateLayout = StateLayout.this;
                    Intrinsics.checkNotNullExpressionValue(svgaView, "svgaView");
                    stateLayout.f21039OoooOOO = new o00Oo0(svgaView, R.array.horse_gray, 1000L, true);
                }
                o00Oo0 o00oo1 = StateLayout.this.f21039OoooOOO;
                if (o00oo1 != null) {
                    o00oo1.OooO0O0();
                }
            } else {
                o00Oo0 o00oo2 = StateLayout.this.f21039OoooOOO;
                if (o00oo2 != null) {
                    o00oo2.f42101OooO0o = o00oo2.f42102OooO0o0;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends OooOOO0 {
        public OooO0O0() {
            super(0L, 1, null);
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View view) {
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
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooOO0(StateLayout stateLayout, int i, Function0 listener, int i2) {
        String text = (i2 & 1) != 0 ? o000O0O0.OooO0OO(R.string.try_again) : null;
        if ((i2 & 2) != 0) {
            i = o000O0O0.OooO00o(R.color.color_alpha_38);
        }
        if ((i2 & 4) != 0) {
            listener = o000OOo0.f41894Oooo;
        }
        Objects.requireNonNull(stateLayout);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateLayout.f21046OooooO0 = text;
        stateLayout.errorButtonClickListener = listener;
        stateLayout.f21044Ooooo00 = i;
    }

    public final void OooOO0O(boolean z) {
        boolean enableStateChangeAnim = getEnableStateChangeAnim();
        setEnableStateChangeAnim(z);
        OooO0oo();
        setEnableStateChangeAnim(enableStateChangeAnim);
    }

    @Nullable
    /* JADX INFO: renamed from: getEmptyBinding, reason: from getter */
    public final z9 getF21048OooooOo() {
        return this.f21048OooooOo;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getEmptyView() {
        ImageView imageView;
        TextView textView;
        if (this.f21048OooooOo == null) {
            this.f21048OooooOo = z9.inflate(LayoutInflater.from(getContext()));
        }
        z9 z9Var = this.f21048OooooOo;
        TextView textView2 = z9Var != null ? z9Var.f51092OooO0OO : null;
        if (textView2 != null) {
            textView2.setText(this.f21040OoooOOo);
        }
        z9 z9Var2 = this.f21048OooooOo;
        if (z9Var2 != null && (textView = z9Var2.f51092OooO0OO) != null) {
            textView.setTextColor(this.f21041OoooOo0);
        }
        z9 z9Var3 = this.f21048OooooOo;
        if (z9Var3 != null && (imageView = z9Var3.f51091OooO0O0) != null) {
            imageView.setImageResource(this.f21042OoooOoO);
        }
        z9 z9Var4 = this.f21048OooooOo;
        if (z9Var4 != null) {
            return z9Var4.f51090OooO00o;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getErrorBinding, reason: from getter */
    public final aa getF21050Oooooo0() {
        return this.f21050Oooooo0;
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
        if (this.f21050Oooooo0 == null) {
            this.f21050Oooooo0 = aa.inflate(LayoutInflater.from(getContext()));
        }
        aa aaVar = this.f21050Oooooo0;
        TextView textView2 = aaVar != null ? aaVar.f48951OooO0Oo : null;
        if (textView2 != null) {
            textView2.setText(this.f21043OoooOoo);
        }
        aa aaVar2 = this.f21050Oooooo0;
        if (aaVar2 != null && (textView = aaVar2.f48951OooO0Oo) != null) {
            textView.setTextColor(this.f21044Ooooo00);
        }
        aa aaVar3 = this.f21050Oooooo0;
        if (aaVar3 != null && (imageView = aaVar3.f48950OooO0OO) != null) {
            imageView.setImageResource(this.f21045Ooooo0o);
        }
        aa aaVar4 = this.f21050Oooooo0;
        Button button2 = aaVar4 != null ? aaVar4.f48949OooO0O0 : null;
        if (button2 != null) {
            button2.setText(this.f21046OooooO0);
        }
        aa aaVar5 = this.f21050Oooooo0;
        if (aaVar5 != null && (button = aaVar5.f48949OooO0O0) != null) {
            button.setOnClickListener(new OooO0O0());
        }
        aa aaVar6 = this.f21050Oooooo0;
        if (aaVar6 != null) {
            return aaVar6.f48948OooO00o;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getLoadingBinding, reason: from getter */
    public final ba getF21047OooooOO() {
        return this.f21047OooooOO;
    }

    @Override // com.common.statuslayout.StatusLayout
    @Nullable
    public View getLoadingView() {
        if (this.f21047OooooOO == null) {
            this.f21047OooooOO = ba.inflate(LayoutInflater.from(getContext()));
        }
        ba baVar = this.f21047OooooOO;
        if (baVar != null) {
            return baVar.f49024OooO00o;
        }
        return null;
    }

    public final void setEmptyBinding(@Nullable z9 z9Var) {
        this.f21048OooooOo = z9Var;
    }

    public final void setEmptyImage(int image) {
        this.f21042OoooOoO = image;
    }

    public final void setEmptyText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f21040OoooOOo = text;
    }

    public final void setErrorBinding(@Nullable aa aaVar) {
        this.f21050Oooooo0 = aaVar;
    }

    public final void setErrorButtonBackground(int image) {
    }

    public final void setErrorButtonClickListener(@Nullable Function0<Unit> function0) {
        this.errorButtonClickListener = function0;
    }

    public final void setErrorImage(int image) {
        this.f21045Ooooo0o = image;
    }

    public final void setErrorText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f21043OoooOoo = text;
    }

    public final void setLoadingBinding(@Nullable ba baVar) {
        this.f21047OooooOO = baVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @JvmOverloads
    public StateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21040OoooOOo = o000O0O0.OooO0OO(R.string.no_data);
        this.f21041OoooOo0 = o000O0O0.OooO00o(R.color.color_alpha_38);
        this.f21042OoooOoO = R.drawable.ic_empty_default;
        this.f21043OoooOoo = o000O0O0.OooO0OO(R.string.Network_request_failed);
        this.f21044Ooooo00 = o000O0O0.OooO00o(R.color.color_alpha_38);
        this.f21046OooooO0 = o000O0O0.OooO0OO(R.string.Try_again);
        setEnableStateChangeAnim(true);
        OooO00o listener = new OooO00o();
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12657Oooo.add(listener);
    }
}
