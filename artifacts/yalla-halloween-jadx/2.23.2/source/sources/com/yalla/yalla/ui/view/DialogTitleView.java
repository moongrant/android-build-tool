package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.x2;
import p562o0oOo000.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/ui/view/DialogTitleView;", "Landroid/widget/LinearLayout;", "", "showLine", "", "setShowLine", "(Ljava/lang/Boolean;)V", "Lo0Oo0OOO/x2;", "OooO0Oo", "Lo0Oo0OOO/x2;", "getBinding", "()Lo0Oo0OOO/x2;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class DialogTitleView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x2 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Drawable f29832OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f29833OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Drawable f29834OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Boolean f29835OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29836OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f29836OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f29836OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f29837OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(1);
            this.f29837OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f29837OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO0OO(DialogTitleView dialogTitleView, String str) {
        dialogTitleView.f29833OooO0o0 = str;
        boolean z = str == null || str.length() == 0;
        x2 x2Var = dialogTitleView.binding;
        if (z) {
            TextView tvTitle = x2Var.f45689OooO0o0;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            o000O.OooO0O0(tvTitle);
        } else {
            TextView tvTitle2 = x2Var.f45689OooO0o0;
            Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
            o000O.OooOOOO(tvTitle2);
            x2Var.f45689OooO0o0.setText(str);
        }
    }

    public final void OooO00o(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f29834OooO0oO = drawable;
        x2 x2Var = this.binding;
        if (drawable == null) {
            ImageView ivEnd = x2Var.f45686OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivEnd, "ivEnd");
            o000O.OooO0O0(ivEnd);
        } else {
            ImageView ivEnd2 = x2Var.f45686OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivEnd2, "ivEnd");
            o000O.OooOOOO(ivEnd2);
            x2Var.f45686OooO0O0.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView ivEnd3 = x2Var.f45686OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivEnd3, "ivEnd");
            o000O.OooO0oo(ivEnd3, new OooO00o(function0));
        }
    }

    public final void OooO0O0(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f29832OooO0o = drawable;
        x2 x2Var = this.binding;
        if (drawable == null) {
            ImageView ivStart = x2Var.f45687OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivStart, "ivStart");
            o000O.OooO0O0(ivStart);
        } else {
            ImageView ivStart2 = x2Var.f45687OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivStart2, "ivStart");
            o000O.OooOOOO(ivStart2);
            x2Var.f45687OooO0OO.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView ivStart3 = x2Var.f45687OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivStart3, "ivStart");
            o000O.OooO0oo(ivStart3, new OooO0O0(function0));
        }
    }

    @NotNull
    public final x2 getBinding() {
        return this.binding;
    }

    public final void setShowLine(@Nullable Boolean showLine) {
        this.f29835OooO0oo = showLine;
        x2 x2Var = this.binding;
        if (showLine == null || Intrinsics.areEqual(showLine, Boolean.FALSE)) {
            View line = x2Var.f45688OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            o000O.OooO0O0(line);
        } else {
            View line2 = x2Var.f45688OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(line2, "line");
            o000O.OooOOOO(line2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DialogTitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        x2 x2VarInflate = x2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(x2VarInflate, "inflate(...)");
        this.binding = x2VarInflate;
        this.f29833OooO0o0 = "";
        this.f29835OooO0oo = Boolean.FALSE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00000.DialogTitleView);
        this.f29833OooO0o0 = o0OoOo0.OooOOO(typedArrayObtainStyledAttributes.getString(o00000.DialogTitleView_titleText), "");
        this.f29832OooO0o = typedArrayObtainStyledAttributes.getDrawable(o00000.DialogTitleView_startSrc);
        this.f29834OooO0oO = typedArrayObtainStyledAttributes.getDrawable(o00000.DialogTitleView_endSrc);
        this.f29835OooO0oo = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(o00000.DialogTitleView_showLine, false));
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO(this, this.f29833OooO0o0);
        OooO0O0(this.f29832OooO0o, null);
        OooO00o(this.f29834OooO0oO, null);
        setShowLine(this.f29835OooO0oo);
    }
}
