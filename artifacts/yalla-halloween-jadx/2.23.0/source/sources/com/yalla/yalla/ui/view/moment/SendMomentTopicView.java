package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.topic.TopicInfoModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.g3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentTopicView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isInEdit", "", "setIsInEdit", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicInfoModel", "setData", "Lo0ooOOOO/g3;", "OooO0Oo", "Lo0ooOOOO/g3;", "getBinding", "()Lo0ooOOOO/g3;", "binding", "Lkotlin/Function0;", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getRootListener", "()Lkotlin/jvm/functions/Function0;", "setRootListener", "(Lkotlin/jvm/functions/Function0;)V", "rootListener", "OooO0o", "getClearTopicListener", "setClearTopicListener", "clearTopicListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SendMomentTopicView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g3 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearTopicListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> rootListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f31245OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f31246OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            Function0<Unit> rootListener;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMomentTopicView sendMomentTopicView = SendMomentTopicView.this;
            if (!sendMomentTopicView.f31246OooO0oo && (rootListener = sendMomentTopicView.getRootListener()) != null) {
                rootListener.invoke();
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
            SendMomentTopicView sendMomentTopicView = SendMomentTopicView.this;
            if (!sendMomentTopicView.f31246OooO0oo) {
                o0OO000.OooO00o("103066");
                Function0<Unit> clearTopicListener = sendMomentTopicView.getClearTopicListener();
                if (clearTopicListener != null) {
                    clearTopicListener.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO0O0() {
        TopicInfoModel topicInfoModel = this.f31245OooO0oO;
        return topicInfoModel == null || o0OoOo0.OooOO0(Long.valueOf(topicInfoModel.getId())) == 0;
    }

    @NotNull
    public final g3 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getClearTopicListener() {
        return this.clearTopicListener;
    }

    @Nullable
    public final Function0<Unit> getRootListener() {
        return this.rootListener;
    }

    public final void setClearTopicListener(@Nullable Function0<Unit> function0) {
        this.clearTopicListener = function0;
    }

    public final void setData(@Nullable TopicInfoModel topicInfoModel) {
        this.f31245OooO0oO = topicInfoModel;
        boolean z = this.f31246OooO0oo;
        g3 g3Var = this.binding;
        if (z) {
            if (OooO0O0()) {
                LinearLayout linearLayout = g3Var.f57958OooO00o;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
                o000OO00.OooO0O0(linearLayout);
                return;
            }
            LinearLayout linearLayout2 = g3Var.f57958OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.root");
            o000OO00.OooOOOO(linearLayout2);
            g3Var.f57961OooO0Oo.setText(o0OoOo0.OooOOO(topicInfoModel != null ? topicInfoModel.getName() : null, ""));
            ImageView imageView = g3Var.f57959OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopicArrow");
            o000OO00.OooO0O0(imageView);
            ImageView imageView2 = g3Var.f57960OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTopicClose");
            o000OO00.OooO0O0(imageView2);
            return;
        }
        if (!OooO0O0()) {
            g3Var.f57961OooO0Oo.setText(o0OoOo0.OooOOO(topicInfoModel != null ? topicInfoModel.getName() : null, ""));
            ImageView imageView3 = g3Var.f57959OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivTopicArrow");
            o000OO00.OooO0O0(imageView3);
            ImageView imageView4 = g3Var.f57960OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivTopicClose");
            o000OO00.OooOOOO(imageView4);
            return;
        }
        g3Var.f57961OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.Add_a_topic));
        LinearLayout linearLayout3 = g3Var.f57958OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.root");
        o000OO00.OooOOOO(linearLayout3);
        ImageView imageView5 = g3Var.f57959OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivTopicArrow");
        o000OO00.OooOOOO(imageView5);
        ImageView imageView6 = g3Var.f57960OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivTopicClose");
        o000OO00.OooO0O0(imageView6);
    }

    public final void setIsInEdit(boolean isInEdit) {
        this.f31246OooO0oo = isInEdit;
        g3 g3Var = this.binding;
        if (isInEdit) {
            ImageView imageView = g3Var.f57959OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopicArrow");
            o000OO00.OooO0O0(imageView);
        } else {
            ImageView imageView2 = g3Var.f57959OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTopicArrow");
            o000OO00.OooOOOO(imageView2);
        }
    }

    public final void setRootListener(@Nullable Function0<Unit> function0) {
        this.rootListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentTopicView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        g3 g3VarInflate = g3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(g3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = g3VarInflate;
        LinearLayout linearLayout = g3VarInflate.f57958OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        o000OO00.OooO(linearLayout, new OooO00o());
        ImageView imageView = g3VarInflate.f57960OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopicClose");
        o000OO00.OooO(imageView, new OooO0O0());
    }
}
