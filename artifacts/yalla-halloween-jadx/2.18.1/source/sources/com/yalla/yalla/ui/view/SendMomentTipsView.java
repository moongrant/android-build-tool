package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.oOO00O;
import p625o0oo0oo.o000O0O0;
import p649o0ooOOoo.y9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "editMaxNum", "", "setData", "(Ljava/lang/Integer;)V", "Lkotlin/Function0;", "Oooo0oO", "Lkotlin/jvm/functions/Function0;", "getCloseListener", "()Lkotlin/jvm/functions/Function0;", "setCloseListener", "(Lkotlin/jvm/functions/Function0;)V", "closeListener", "Lo0ooOOoo/y9;", "binding", "Lo0ooOOoo/y9;", "getBinding", "()Lo0ooOOoo/y9;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendMomentTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final y9 f25208Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> closeListener;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Function0<Unit> closeListener;
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.areEqual(view, SendMomentTipsView.this.getF25208Oooo0o().f51000OooO0O0) || (closeListener = SendMomentTipsView.this.getCloseListener()) == null) {
                return;
            }
            closeListener.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final y9 getF25208Oooo0o() {
        return this.f25208Oooo0o;
    }

    @Nullable
    public final Function0<Unit> getCloseListener() {
        return this.closeListener;
    }

    public final void setCloseListener(@Nullable Function0<Unit> function0) {
        this.closeListener = function0;
    }

    public final void setData(@Nullable Integer editMaxNum) {
        this.f25208Oooo0o.f51001OooO0OO.setText(o000O0O0.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Moment_Edit_Page_Title_Content), com.yalla.support.common.util.OooO.OooO0oo(Integer.valueOf(oOO00O.OooO0Oo(editMaxNum, 5)), "")));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        y9 y9VarInflate = y9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(y9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25208Oooo0o = y9VarInflate;
        y9VarInflate.f51000OooO0O0.setOnClickListener(new OooO00o());
    }
}
