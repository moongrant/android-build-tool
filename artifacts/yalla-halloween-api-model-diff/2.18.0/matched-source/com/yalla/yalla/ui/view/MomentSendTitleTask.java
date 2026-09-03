package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.task.sendPostTask.SendPostService;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256o00ooO0o.oo0oOO0;
import p603o0oo00Oo.o0OO000;
import p603o0oo00Oo.o0OO000o;
import p623o0oo0o0o.oo00o;
import p651o0ooOOoo.yd;
import p656o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentSendTitleTask;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentSendTitleTask extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final yd f25007Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public MomentSendModel f25008OoooO00;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentSendState.values().length];
            iArr[MomentSendState.Success.ordinal()] = 1;
            iArr[MomentSendState.Sending.ordinal()] = 2;
            iArr[MomentSendState.FailedSendFrequently.ordinal()] = 3;
            iArr[MomentSendState.FailedContent.ordinal()] = 4;
            iArr[MomentSendState.FailedImage.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p656o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, MomentSendTitleTask.this.f25007Oooo.f51020OooO)) {
                MomentSendTitleTask.OooO0O0(MomentSendTitleTask.this);
                return;
            }
            if (Intrinsics.areEqual(view, MomentSendTitleTask.this.f25007Oooo.f51022OooO0O0)) {
                MomentSendTitleTask momentSendTitleTask = MomentSendTitleTask.this;
                if (momentSendTitleTask.getActivity().isDestroyed() || momentSendTitleTask.getActivity().isFinishing()) {
                    return;
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(momentSendTitleTask.getActivity());
                oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.Discard_Post));
                oo0ooo0.OooOOo0(OooOOO.OooO0OO(R.string.KEEP_TRYING));
                oo0ooo0.OooOoO0(OooOOO.OooO0OO(R.string.DISCARD));
                oo0ooo0.OooOo0o(new o0OO000(momentSendTitleTask));
                oo0ooo0.OooOo(new o0OO000o(momentSendTitleTask));
                oo0ooo0.OooOOO0();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTitleTask(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(MomentSendTitleTask momentSendTitleTask) {
        MomentSendModel momentSendModel = momentSendTitleTask.f25008OoooO00;
        if (momentSendModel != null) {
            MomentSendState sendPostState = momentSendModel.getSendPostState();
            MomentSendState momentSendState = MomentSendState.Sending;
            if (sendPostState == momentSendState) {
                return;
            }
            momentSendModel.setSendPostState(momentSendState);
            momentSendTitleTask.OooO0OO();
            SendPostService.OooO00o oooO00o = SendPostService.f11916OoooOO0;
            Context context = momentSendTitleTask.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            oooO00o.OooO00o(context, momentSendModel, false);
        }
    }

    public final void OooO0OO() {
        this.f25007Oooo.f51020OooO.setClickable(true);
        ImageView imageView = this.f25007Oooo.f51024OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivPower");
        o00O0O.OooO00o(imageView);
        MomentSendModel momentSendModel = this.f25008OoooO00;
        MomentSendState sendPostState = momentSendModel != null ? momentSendModel.getSendPostState() : null;
        int i = sendPostState == null ? -1 : OooO00o.$EnumSwitchMapping$0[sendPostState.ordinal()];
        if (i == 1) {
            ImageView imageView2 = this.f25007Oooo.f51022OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivDel");
            o00O0O.OooO00o(imageView2);
            ImageView imageView3 = this.f25007Oooo.f51024OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivPower");
            o00O0O.OooO(imageView3);
            this.f25007Oooo.f51028OooO0oo.setText(oo00o.f48643OooO00o.OooO0Oo(System.currentTimeMillis(), System.currentTimeMillis()) + " • ");
            TextView textView = this.f25007Oooo.f51020OooO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTry");
            o00O0O.OooO00o(textView);
            this.f25007Oooo.f51020OooO.setClickable(false);
            return;
        }
        if (i == 2) {
            ImageView imageView4 = this.f25007Oooo.f51022OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivDel");
            o00O0O.OooO00o(imageView4);
            this.f25007Oooo.f51028OooO0oo.setText(R.string.Posting);
            TextView textView2 = this.f25007Oooo.f51020OooO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTry");
            o00O0O.OooO00o(textView2);
            this.f25007Oooo.f51020OooO.setClickable(false);
            return;
        }
        if (i == 3) {
            ImageView imageView5 = this.f25007Oooo.f51022OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivDel");
            o00O0O.OooO(imageView5);
            this.f25007Oooo.f51028OooO0oo.setText(R.string.You_are_posting_too_much);
            TextView textView3 = this.f25007Oooo.f51020OooO;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTry");
            o00O0O.OooO(textView3);
            return;
        }
        if (i == 4) {
            ImageView imageView6 = this.f25007Oooo.f51022OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivDel");
            o00O0O.OooO(imageView6);
            this.f25007Oooo.f51028OooO0oo.setText(R.string.Network_connection_lost);
            TextView textView4 = this.f25007Oooo.f51020OooO;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvTry");
            o00O0O.OooO(textView4);
            return;
        }
        if (i != 5) {
            return;
        }
        ImageView imageView7 = this.f25007Oooo.f51022OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivDel");
        o00O0O.OooO(imageView7);
        this.f25007Oooo.f51028OooO0oo.setText(R.string.Network_connection_lost);
        TextView textView5 = this.f25007Oooo.f51020OooO;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvTry");
        o00O0O.OooO(textView5);
    }

    @NotNull
    public final FragmentActivity getActivity() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (FragmentActivity) context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTitleTask(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentSendTitleTask(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        yd ydVarInflate = yd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ydVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25007Oooo = ydVarInflate;
        OooO0O0 oooO0O0 = new OooO0O0();
        ConstraintLayout constraintLayout = ydVarInflate.f51025OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutRoot");
        o00O0O.OooO(constraintLayout);
        ydVarInflate.f51020OooO.setOnClickListener(oooO0O0);
        ydVarInflate.f51022OooO0O0.setOnClickListener(oooO0O0);
    }
}
