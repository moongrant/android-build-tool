package com.yalla.yalla.ui.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentSendModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p515o0o0O00.o00O00;
import p649o0ooOOoo.ae;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentSendTaskView;", "Landroid/widget/LinearLayout;", "Landroid/app/Activity;", "getActivity", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentSendTaskView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f24984Oooo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ae f24985Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public MomentSendModel f24986Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f24987Oooo0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTaskView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setContent$lambda-3$lambda-2, reason: not valid java name */
    public static final void m489setContent$lambda3$lambda2(MomentSendTaskView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            int lineCount = this$0.f24985Oooo0o.f48947OooO0o0.getLayout().getLineCount();
            o00O00.OooO0O0("lines = " + lineCount);
            if (lineCount > 6) {
                this$0.f24985Oooo0o.f48945OooO0Oo.setVisibility(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0() {
        this.f24985Oooo0o.f48943OooO0O0.setVisibility(8);
        this.f24985Oooo0o.f48947OooO0o0.setText("");
        this.f24985Oooo0o.f48947OooO0o0.setVisibility(8);
        this.f24985Oooo0o.f48947OooO0o0.setMaxLines(6);
        this.f24985Oooo0o.f48944OooO0OO.setVisibility(8);
        this.f24985Oooo0o.f48945OooO0Oo.setVisibility(8);
        com.app.base.view.imageMore.ImageMoreView imageMoreView = this.f24985Oooo0o.f48946OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageMoreView, "binding.mImageMoreViewTask");
        oOO00O.OooO00o(imageMoreView);
        this.f24985Oooo0o.f48946OooO0o.OooO0o0();
        this.f24985Oooo0o.f48948OooO0oO.setVisibility(8);
        this.f24985Oooo0o.f48948OooO0oO.setText("");
    }

    @NotNull
    public final Activity getActivity() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        return (Activity) context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ae aeVarInflate = ae.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(aeVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24985Oooo0o = aeVarInflate;
        aeVarInflate.f48942OooO00o.setVisibility(0);
        aeVarInflate.f48943OooO0O0.setVisibility(0);
        aeVarInflate.f48947OooO0o0.setEllipsize(TextUtils.TruncateAt.END);
        aeVarInflate.f48948OooO0oO.setVisibility(8);
        OooO0O0();
    }
}
