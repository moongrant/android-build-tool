package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0OoOo0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.f3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "editMaxNum", "", "setData", "(Ljava/lang/Integer;)V", "Lo0ooOOOO/f3;", "OooO0Oo", "Lo0ooOOOO/f3;", "getBinding", "()Lo0ooOOOO/f3;", "binding", "Lkotlin/Function0;", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getCloseListener", "()Lkotlin/jvm/functions/Function0;", "setCloseListener", "(Lkotlin/jvm/functions/Function0;)V", "closeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SendMomentTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f3 binding;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> closeListener;

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Function0<Unit> closeListener;
            Intrinsics.checkNotNullParameter(view, "view");
            SendMomentTipsView sendMomentTipsView = SendMomentTipsView.this;
            if (!Intrinsics.areEqual(view, sendMomentTipsView.getBinding().f57900OooO0O0) || (closeListener = sendMomentTipsView.getCloseListener()) == null) {
                return;
            }
            closeListener.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final f3 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getCloseListener() {
        return this.closeListener;
    }

    public final void setCloseListener(@Nullable Function0<Unit> function0) {
        this.closeListener = function0;
    }

    public final void setData(@Nullable Integer editMaxNum) {
        this.binding.f57901OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Moment_Edit_Page_Title_Content), o0OoOo0.OooOO0o(Integer.valueOf(o0OoOo0.OooO0o0(5, editMaxNum)), "")));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        f3 f3VarInflate = f3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(f3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = f3VarInflate;
        f3VarInflate.f57900OooO0O0.setOnClickListener(new OooO00o());
    }
}
