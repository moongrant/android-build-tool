package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.w2;
import p423o0OoO0OO.o000O000;
import p506o0o00oOo.f1;
import p506o0o00oOo.g1;
import p506o0o00oOo.oO0o0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserWelfareRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserWelfareRecordActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n22#2,2:96\n329#3,4:98\n329#3,4:102\n*S KotlinDebug\n*F\n+ 1 UserWelfareRecordActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity\n*L\n45#1:96,2\n65#1:98,4\n69#1:102,4\n*E\n"})
public final class UserWelfareRecordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26917OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(w2.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f26918OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f26919OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26920OooOo0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26921OooO0Oo;

        public OooO00o(f1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26921OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26921OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26921OooO0Oo;
        }

        public final int hashCode() {
            return this.f26921OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26921OooO0Oo.invoke(obj);
        }
    }

    public final w2 OooOo() {
        return (w2) this.f26917OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45671OooO00o);
        this.f26919OooOo00 = getIntent().getLongExtra("POINT_BALANCE", 0L);
        this.f26918OooOo0 = getIntent().getLongExtra("EXPIRING_POINT", 0L);
        this.f26920OooOo0O = getIntent().getBooleanExtra("POINT_FROZEN", false);
        ComposeView composeViewTopHead = OooOo().f45674OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeViewTopHead, "composeViewTopHead");
        o0000oo.OooO0Oo(composeViewTopHead, ComposableLambdaKt.composableLambdaInstance(1427375962, true, new g1(this)));
        ComposeView composeViewContent = OooOo().f45673OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeViewContent, "composeViewContent");
        o0000oo.OooO0Oo(composeViewContent, oO0o0o.f50509OooO00o);
        OooOo00(getString(o000000.welfare_score_history));
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            ViewGroup.LayoutParams layoutParams = headerLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = o000O000.OooO00o();
            headerLayout.setLayoutParams(marginLayoutParams);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo0o();
        }
        CoordinatorLayout clBenefit = OooOo().f45672OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clBenefit, "clBenefit");
        ViewGroup.LayoutParams layoutParams2 = clBenefit.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = o0000O0.OooO00o(50);
        clBenefit.setLayoutParams(marginLayoutParams2);
        CoordinatorLayout clBenefit2 = OooOo().f45672OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clBenefit2, "clBenefit");
        oOO00O.OooO00o(clBenefit2, false, 3);
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(o0Oo0oo.ic_vip_help, new o00Oo0(this));
        }
    }
}
