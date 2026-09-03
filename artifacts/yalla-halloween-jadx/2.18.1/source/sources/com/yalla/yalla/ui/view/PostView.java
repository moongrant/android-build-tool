package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendCommentModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.ge;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/view/PostView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/MomentSendCommentModel;", "", "Oooo0oO", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/yalla/yalla/model/MomentDetailModel;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Oooo0oo", "Lcom/yalla/yalla/model/MomentDetailModel;", "getPostDetailModel", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setPostDetailModel", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "postDetailModel", "Lo0ooOOoo/ge;", "binding", "Lo0ooOOoo/ge;", "getBinding", "()Lo0ooOOoo/ge;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ge f25074Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentSendCommentModel, Unit> listener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentDetailModel postDetailModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final ge getF25074Oooo0o() {
        return this.f25074Oooo0o;
    }

    @Nullable
    public final Function1<MomentSendCommentModel, Unit> getListener() {
        return this.listener;
    }

    @Nullable
    public final MomentDetailModel getPostDetailModel() {
        return this.postDetailModel;
    }

    public final void setListener(@Nullable Function1<? super MomentSendCommentModel, Unit> function1) {
        this.listener = function1;
    }

    public final void setPostDetailModel(@Nullable MomentDetailModel momentDetailModel) {
        this.postDetailModel = momentDetailModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ge geVarInflate = ge.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(geVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25074Oooo0o = geVarInflate;
        geVarInflate.f49463OooO00o.setVisibility(0);
        geVarInflate.f49464OooO0O0.setVisibility(0);
    }
}
