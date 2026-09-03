package com.yalla.yalla.ui.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentSendModel;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p515o0o0O00.o00O00;
import p601o0oo00Oo.o0OO0;
import p601o0oo00Oo.o0OO00o0;
import p649o0ooOOoo.he;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/PostTaskView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/MomentSendModel;", "", "Oooo0oO", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostTaskView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f25068Oooo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final he f25069Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentSendModel, Unit> listener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Activity f25071Oooo0oo;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PostTaskView postTaskView = PostTaskView.this;
            int i = PostTaskView.f25068Oooo;
            Objects.requireNonNull(postTaskView);
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PostTaskView postTaskView = PostTaskView.this;
            Activity activity = postTaskView.f25071Oooo0oo;
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.Discard_Post));
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.KEEP_TRYING));
            oo0ooo0.OooOoO0(o000O0O0.OooO0OO(R.string.DISCARD));
            oo0ooo0.OooOo0o(new o0OO00o0(postTaskView));
            oo0ooo0.OooOo(new o0OO0(postTaskView));
            oo0ooo0.OooOOO0();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostTaskView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: setContent$lambda-3$lambda-1, reason: not valid java name */
    private static final void m490setContent$lambda3$lambda1(PostTaskView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.requireNonNull(this$0);
        o00O00.OooO("onTextClicked setViewData 动态详情 position = 0, data = null");
    }

    /* JADX INFO: renamed from: setContent$lambda-3$lambda-2, reason: not valid java name */
    private static final void m491setContent$lambda3$lambda2(PostTaskView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            int lineCount = this$0.f25069Oooo0o.f49563OooO0O0.getLayout().getLineCount();
            o00O00.OooO0O0("lines = " + lineCount);
            if (lineCount > 6) {
                this$0.f25069Oooo0o.f49564OooO0OO.setVisibility(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final Function1<MomentSendModel, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(@Nullable Function1<? super MomentSendModel, Unit> function1) {
        this.listener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PostTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        he heVarInflate = he.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(heVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25069Oooo0o = heVarInflate;
        this.f25071Oooo0oo = (Activity) context;
        heVarInflate.f49562OooO00o.setVisibility(0);
        heVarInflate.f49570OooOO0.setVisibility(0);
        heVarInflate.f49576OooOOOo.setOnClickListener(new OooO00o());
        heVarInflate.f49568OooO0oO.setOnClickListener(new OooO0O0());
        heVarInflate.f49570OooOO0.setVisibility(8);
        heVarInflate.f49569OooO0oo.setImageDrawable(null);
        heVarInflate.f49566OooO0o.setVisibility(8);
        heVarInflate.f49566OooO0o.setImageDrawable(null);
        heVarInflate.f49574OooOOO0.setVisibility(8);
        heVarInflate.f49572OooOO0o.setText("");
        heVarInflate.f49572OooOO0o.setVisibility(8);
        heVarInflate.f49575OooOOOO.setText("");
        heVarInflate.f49573OooOOO.setVisibility(8);
        heVarInflate.f49576OooOOOo.setVisibility(8);
        heVarInflate.f49568OooO0oO.setVisibility(8);
        heVarInflate.f49565OooO0Oo.setVisibility(8);
        heVarInflate.f49567OooO0o0.setText("");
        heVarInflate.f49563OooO0O0.setText("");
        heVarInflate.f49563OooO0O0.setVisibility(8);
        heVarInflate.f49563OooO0O0.setMaxLines(6);
        heVarInflate.f49564OooO0OO.setVisibility(4);
        heVarInflate.f49561OooO.setVisibility(8);
        heVarInflate.f49561OooO.OooO0O0();
        heVarInflate.f49577OooOOo0.setVisibility(8);
        heVarInflate.f49577OooOOo0.setText("");
    }
}
