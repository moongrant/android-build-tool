package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p522o0o0O0o.o00O0;
import p649o0ooOOoo.od;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailTopic;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/MomentSendModel;", "data", "", "setData", "Lcom/yalla/yalla/model/MomentDetailModel;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentDetailTopic extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final od f24917Oooo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailTopic(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@Nullable MomentSendModel data) {
        MomentSendContentModel content;
        oOO00O.OooO00o(this);
        LinearLayout linearLayout = this.f24917Oooo0o.f50185OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutRoot");
        oOO00O.OooO00o(linearLayout);
        if (data == null || (content = data.getContent()) == null || content.getCircleId() <= 0 || !o00O0.OooO0o0(content.getCircleName())) {
            return;
        }
        oOO00O.OooO(this);
        LinearLayout linearLayout2 = this.f24917Oooo0o.f50185OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutRoot");
        oOO00O.OooO(linearLayout2);
        TextView textView = this.f24917Oooo0o.f50186OooO0OO;
        MomentSendContentModel content2 = data.getContent();
        textView.setText(content2 != null ? content2.getCircleName() : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailTopic(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailTopic(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        od odVarInflate = od.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(odVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24917Oooo0o = odVarInflate;
        oOO00O.OooO00o(this);
        LinearLayout linearLayout = odVarInflate.f50185OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutRoot");
        oOO00O.OooO00o(linearLayout);
    }

    public final void setData(@Nullable MomentDetailModel data) {
        MomentSendContentModel content;
        oOO00O.OooO00o(this);
        LinearLayout linearLayout = this.f24917Oooo0o.f50185OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutRoot");
        oOO00O.OooO00o(linearLayout);
        if (data == null || (content = data.getContent()) == null || content.getCircleId() <= 0 || !o00O0.OooO0o0(content.getCircleName())) {
            return;
        }
        oOO00O.OooO(this);
        LinearLayout linearLayout2 = this.f24917Oooo0o.f50185OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutRoot");
        oOO00O.OooO(linearLayout2);
        this.f24917Oooo0o.f50186OooO0OO.setText(content.getCircleName());
    }
}
