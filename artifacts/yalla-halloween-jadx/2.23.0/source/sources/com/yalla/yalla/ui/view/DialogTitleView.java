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
import com.code.android.util.o000OO00;
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
import p584o0oOooO0.oO00Oo0;
import p641o0ooOOOO.ib;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/ui/view/DialogTitleView;", "Landroid/widget/LinearLayout;", "", "showLine", "", "setShowLine", "(Ljava/lang/Boolean;)V", "Lo0ooOOOO/ib;", "OooO0Oo", "Lo0ooOOOO/ib;", "getBinding", "()Lo0ooOOOO/ib;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class DialogTitleView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ib binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Drawable f30378OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f30379OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Drawable f30380OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Boolean f30381OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30382OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f30382OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f30382OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30383OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(1);
            this.f30383OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f30383OooO0Oo.invoke();
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
        dialogTitleView.f30379OooO0o0 = str;
        boolean z = str == null || str.length() == 0;
        ib ibVar = dialogTitleView.binding;
        if (z) {
            TextView textView = ibVar.f58152OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTitle");
            o000OO00.OooO0O0(textView);
        } else {
            TextView textView2 = ibVar.f58152OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTitle");
            o000OO00.OooOOOO(textView2);
            ibVar.f58152OooO0o0.setText(str);
        }
    }

    public final void OooO00o(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f30380OooO0oO = drawable;
        ib ibVar = this.binding;
        if (drawable == null) {
            ImageView imageView = ibVar.f58149OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEnd");
            o000OO00.OooO0O0(imageView);
        } else {
            ImageView imageView2 = ibVar.f58149OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivEnd");
            o000OO00.OooOOOO(imageView2);
            ibVar.f58149OooO0O0.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView imageView3 = ibVar.f58149OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivEnd");
            o000OO00.OooO0oo(imageView3, new OooO00o(function0));
        }
    }

    public final void OooO0O0(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f30378OooO0o = drawable;
        ib ibVar = this.binding;
        if (drawable == null) {
            ImageView imageView = ibVar.f58150OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivStart");
            o000OO00.OooO0O0(imageView);
        } else {
            ImageView imageView2 = ibVar.f58150OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivStart");
            o000OO00.OooOOOO(imageView2);
            ibVar.f58150OooO0OO.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView imageView3 = ibVar.f58150OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivStart");
            o000OO00.OooO0oo(imageView3, new OooO0O0(function0));
        }
    }

    @NotNull
    public final ib getBinding() {
        return this.binding;
    }

    public final void setShowLine(@Nullable Boolean showLine) {
        this.f30381OooO0oo = showLine;
        ib ibVar = this.binding;
        if (showLine == null || Intrinsics.areEqual(showLine, Boolean.FALSE)) {
            View view = ibVar.f58151OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(view, "binding.line");
            o000OO00.OooO0O0(view);
        } else {
            View view2 = ibVar.f58151OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.line");
            o000OO00.OooOOOO(view2);
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
        ib ibVarInflate = ib.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ibVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = ibVarInflate;
        this.f30379OooO0o0 = "";
        this.f30381OooO0oo = Boolean.FALSE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, oO00Oo0.DialogTitleView);
        this.f30379OooO0o0 = o0OoOo0.OooOOO(typedArrayObtainStyledAttributes.getString(oO00Oo0.DialogTitleView_titleText), "");
        this.f30378OooO0o = typedArrayObtainStyledAttributes.getDrawable(oO00Oo0.DialogTitleView_startSrc);
        this.f30380OooO0oO = typedArrayObtainStyledAttributes.getDrawable(oO00Oo0.DialogTitleView_endSrc);
        this.f30381OooO0oo = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(oO00Oo0.DialogTitleView_showLine, false));
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO(this, this.f30379OooO0o0);
        OooO0O0(this.f30378OooO0o, null);
        OooO00o(this.f30380OooO0oO, null);
        setShowLine(this.f30381OooO0oo);
    }
}
