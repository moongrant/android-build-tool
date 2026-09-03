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
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentTopicView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isInEdit", "", "setIsInEdit", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicInfoModel", "setData", "Lo0Oo0OOO/o0OOOO0o;", "OooO0Oo", "Lo0Oo0OOO/o0OOOO0o;", "getBinding", "()Lo0Oo0OOO/o0OOOO0o;", "binding", "Lkotlin/Function0;", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getRootListener", "()Lkotlin/jvm/functions/Function0;", "setRootListener", "(Lkotlin/jvm/functions/Function0;)V", "rootListener", "OooO0o", "getClearTopicListener", "setClearTopicListener", "clearTopicListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SendMomentTopicView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0OOOO0o binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> clearTopicListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> rootListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public TopicInfoModel f30704OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f30705OooO0oo;

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
            if (!sendMomentTopicView.f30705OooO0oo && (rootListener = sendMomentTopicView.getRootListener()) != null) {
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
            if (!sendMomentTopicView.f30705OooO0oo) {
                o0oo0000.OooO00o.OooO0O0("103066");
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
        TopicInfoModel topicInfoModel = this.f30704OooO0oO;
        return topicInfoModel == null || o0OoOo0.OooOO0(Long.valueOf(topicInfoModel.getId())) == 0;
    }

    @NotNull
    public final o0OOOO0o getBinding() {
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
        this.f30704OooO0oO = topicInfoModel;
        boolean z = this.f30705OooO0oo;
        o0OOOO0o o0oooo0o2 = this.binding;
        if (z) {
            if (OooO0O0()) {
                LinearLayout linearLayout = o0oooo0o2.f44639OooO00o;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                o000O.OooO0O0(linearLayout);
                return;
            }
            LinearLayout linearLayout2 = o0oooo0o2.f44639OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
            o000O.OooOOOO(linearLayout2);
            o0oooo0o2.f44642OooO0Oo.setText(o0OoOo0.OooOOO(topicInfoModel != null ? topicInfoModel.getName() : null, ""));
            ImageView ivTopicArrow = o0oooo0o2.f44640OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivTopicArrow, "ivTopicArrow");
            o000O.OooO0O0(ivTopicArrow);
            ImageView ivTopicClose = o0oooo0o2.f44641OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivTopicClose, "ivTopicClose");
            o000O.OooO0O0(ivTopicClose);
            return;
        }
        if (!OooO0O0()) {
            o0oooo0o2.f44642OooO0Oo.setText(o0OoOo0.OooOOO(topicInfoModel != null ? topicInfoModel.getName() : null, ""));
            ImageView ivTopicArrow2 = o0oooo0o2.f44640OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivTopicArrow2, "ivTopicArrow");
            o000O.OooO0O0(ivTopicArrow2);
            ImageView ivTopicClose2 = o0oooo0o2.f44641OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivTopicClose2, "ivTopicClose");
            o000O.OooOOOO(ivTopicClose2);
            return;
        }
        o0oooo0o2.f44642OooO0Oo.setText(o0000.OooO0OO(o000000.Add_a_topic));
        LinearLayout linearLayout3 = o0oooo0o2.f44639OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "getRoot(...)");
        o000O.OooOOOO(linearLayout3);
        ImageView ivTopicArrow3 = o0oooo0o2.f44640OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivTopicArrow3, "ivTopicArrow");
        o000O.OooOOOO(ivTopicArrow3);
        ImageView ivTopicClose3 = o0oooo0o2.f44641OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivTopicClose3, "ivTopicClose");
        o000O.OooO0O0(ivTopicClose3);
    }

    public final void setIsInEdit(boolean isInEdit) {
        this.f30705OooO0oo = isInEdit;
        o0OOOO0o o0oooo0o2 = this.binding;
        if (isInEdit) {
            ImageView ivTopicArrow = o0oooo0o2.f44640OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivTopicArrow, "ivTopicArrow");
            o000O.OooO0O0(ivTopicArrow);
        } else {
            ImageView ivTopicArrow2 = o0oooo0o2.f44640OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivTopicArrow2, "ivTopicArrow");
            o000O.OooOOOO(ivTopicArrow2);
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
        o0OOOO0o o0oooo0oInflate = o0OOOO0o.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oooo0oInflate, "inflate(...)");
        this.binding = o0oooo0oInflate;
        LinearLayout linearLayout = o0oooo0oInflate.f44639OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        o000O.OooO(linearLayout, new OooO00o());
        ImageView ivTopicClose = o0oooo0oInflate.f44641OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivTopicClose, "ivTopicClose");
        o000O.OooO(ivTopicClose, new OooO0O0());
    }
}
