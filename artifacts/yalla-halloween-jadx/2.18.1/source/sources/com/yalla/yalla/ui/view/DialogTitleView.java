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
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.o00O0O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p444o0OoOo0O.o0O0OO0;
import p522o0o0O0o.o00O0;
import p649o0ooOOoo.qi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/DialogTitleView;", "Landroid/widget/LinearLayout;", "", "showLine", "", "setShowLine", "(Ljava/lang/Boolean;)V", "Lo0ooOOoo/qi;", "binding", "Lo0ooOOoo/qi;", "getBinding", "()Lo0ooOOoo/qi;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class DialogTitleView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Drawable f24781Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final qi f24782Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public String f24783Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Drawable f24784Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Boolean f24785OoooO00;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24786Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f24786Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f24786Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24787Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(1);
            this.f24787Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f24787Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO0OO(DialogTitleView dialogTitleView, String str) {
        dialogTitleView.f24783Oooo0oO = str;
        if (str == null || str.length() == 0) {
            TextView textView = dialogTitleView.f24782Oooo0o.f50417OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTitle");
            oOO00O.OooO00o(textView);
        } else {
            TextView textView2 = dialogTitleView.f24782Oooo0o.f50417OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTitle");
            oOO00O.OooO(textView2);
            dialogTitleView.f24782Oooo0o.f50417OooO0o0.setText(str);
        }
    }

    public final void OooO00o(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f24781Oooo = drawable;
        if (drawable == null) {
            ImageView imageView = this.f24782Oooo0o.f50414OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEnd");
            oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = this.f24782Oooo0o.f50414OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivEnd");
            oOO00O.OooO(imageView2);
            this.f24782Oooo0o.f50414OooO0O0.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView imageView3 = this.f24782Oooo0o.f50414OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivEnd");
            o00O0O.OooO0Oo(imageView3, new OooO00o(function0));
        }
    }

    public final void OooO0O0(@Nullable Drawable drawable, @Nullable Function0<Unit> function0) {
        this.f24784Oooo0oo = drawable;
        if (drawable == null) {
            ImageView imageView = this.f24782Oooo0o.f50415OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivStart");
            oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = this.f24782Oooo0o.f50415OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivStart");
            oOO00O.OooO(imageView2);
            this.f24782Oooo0o.f50415OooO0OO.setImageDrawable(drawable);
        }
        if (function0 != null) {
            ImageView imageView3 = this.f24782Oooo0o.f50415OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivStart");
            o00O0O.OooO0Oo(imageView3, new OooO0O0(function0));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final qi getF24782Oooo0o() {
        return this.f24782Oooo0o;
    }

    public final void setShowLine(@Nullable Boolean showLine) {
        this.f24785OoooO00 = showLine;
        if (showLine == null || Intrinsics.areEqual(showLine, Boolean.FALSE)) {
            View view = this.f24782Oooo0o.f50416OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(view, "binding.line");
            oOO00O.OooO00o(view);
        } else {
            View view2 = this.f24782Oooo0o.f50416OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.line");
            oOO00O.OooO(view2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        qi qiVarInflate = qi.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(qiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24782Oooo0o = qiVarInflate;
        this.f24783Oooo0oO = "";
        this.f24785OoooO00 = Boolean.FALSE;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OO0.DialogTitleView);
        this.f24783Oooo0oO = o00O0.OooO0oO(typedArrayObtainStyledAttributes.getString(3));
        this.f24784Oooo0oo = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f24781Oooo = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f24785OoooO00 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false));
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO(this, this.f24783Oooo0oO);
        OooO0O0(this.f24784Oooo0oo, null);
        OooO00o(this.f24781Oooo, null);
        setShowLine(this.f24785OoooO00);
    }
}
