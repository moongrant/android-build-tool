package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;
import p649o0ooOOoo.z9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentTopicView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isInEdit", "", "setIsInEdit", "Lcom/yalla/yalla/model/TopicInfoModel;", "topicInfoModel", "setData", "Lkotlin/Function0;", "Oooo0oO", "Lkotlin/jvm/functions/Function0;", "getRootListener", "()Lkotlin/jvm/functions/Function0;", "setRootListener", "(Lkotlin/jvm/functions/Function0;)V", "rootListener", "Lo0ooOOoo/z9;", "binding", "Lo0ooOOoo/z9;", "getBinding", "()Lo0ooOOoo/z9;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendMomentTopicView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final z9 f25211Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> rootListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f25213Oooo0oo;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Function0<Unit> rootListener;
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.areEqual(view, SendMomentTopicView.this.getF25211Oooo0o().f51064OooO00o) || (rootListener = SendMomentTopicView.this.getRootListener()) == null) {
                return;
            }
            rootListener.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final z9 getF25211Oooo0o() {
        return this.f25211Oooo0o;
    }

    @Nullable
    public final Function0<Unit> getRootListener() {
        return this.rootListener;
    }

    public final void setData(@Nullable TopicInfoModel topicInfoModel) {
        if (!(topicInfoModel == null || oOO00O.OooO0o(Long.valueOf(topicInfoModel.getId())) == 0)) {
            this.f25211Oooo0o.f51066OooO0OO.setText(o00O0.OooO0oO(topicInfoModel != null ? topicInfoModel.getName() : null));
            return;
        }
        this.f25211Oooo0o.f51066OooO0OO.setText(o000O0O0.OooO0OO(R.string.Add_a_topic));
        if (this.f25213Oooo0oo) {
            LinearLayout linearLayout = this.f25211Oooo0o.f51064OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
            p254o00ooO0O.oOO00O.OooO00o(linearLayout);
        } else {
            LinearLayout linearLayout2 = this.f25211Oooo0o.f51064OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.root");
            p254o00ooO0O.oOO00O.OooO(linearLayout2);
        }
    }

    public final void setIsInEdit(boolean isInEdit) {
        this.f25213Oooo0oo = isInEdit;
        if (isInEdit) {
            ImageView imageView = this.f25211Oooo0o.f51065OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopicArrow");
            p254o00ooO0O.oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = this.f25211Oooo0o.f51065OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTopicArrow");
            p254o00ooO0O.oOO00O.OooO(imageView2);
        }
    }

    public final void setRootListener(@Nullable Function0<Unit> function0) {
        this.rootListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentTopicView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        z9 z9VarInflate = z9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(z9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25211Oooo0o = z9VarInflate;
        z9VarInflate.f51064OooO00o.setOnClickListener(new OooO00o());
    }
}
