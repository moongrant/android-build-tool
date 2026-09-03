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
import com.code.android.util.o000O0Oo;
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
import p147o00Oo0Oo.o000OOo;
import p417o0OoO0.o0ooOOo;
import p496o0o00o.o000OO0O;
import p496o0o00o.oO0Oo0o0;
import p496o0o00o.oO0o0000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.hb;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserWelfareRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserWelfareRecordActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n22#2,2:96\n329#3,4:98\n329#3,4:102\n*S KotlinDebug\n*F\n+ 1 UserWelfareRecordActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareRecordActivity\n*L\n45#1:96,2\n65#1:98,4\n69#1:102,4\n*E\n"})
public final class UserWelfareRecordActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27382OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(hb.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f27383OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f27384OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f27385OooOo0O;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27386OooO0Oo;

        public OooO00o(oO0Oo0o0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27386OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27386OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27386OooO0Oo;
        }

        public final int hashCode() {
            return this.f27386OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27386OooO0Oo.invoke(obj);
        }
    }

    public final hb OooOo() {
        return (hb) this.f27382OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58091OooO00o);
        this.f27384OooOo00 = getIntent().getLongExtra("POINT_BALANCE", 0L);
        this.f27383OooOo0 = getIntent().getLongExtra("EXPIRING_POINT", 0L);
        this.f27385OooOo0O = getIntent().getBooleanExtra("POINT_FROZEN", false);
        ComposeView composeView = OooOo().f58094OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeViewTopHead");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1427375962, true, new oO0o0000(this)));
        ComposeView composeView2 = OooOo().f58093OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeViewContent");
        o000OOo.OooO0Oo(composeView2, o000OO0O.f48994OooO00o);
        OooOo00(getString(oO00OOo0.welfare_score_history));
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            ViewGroup.LayoutParams layoutParams = headerLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = o0ooOOo.OooO00o();
            headerLayout.setLayoutParams(marginLayoutParams);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo0o();
        }
        CoordinatorLayout coordinatorLayout = OooOo().f58092OooO0O0;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.clBenefit");
        ViewGroup.LayoutParams layoutParams2 = coordinatorLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = o0000O0.OooO00o(50);
        coordinatorLayout.setLayoutParams(marginLayoutParams2);
        CoordinatorLayout coordinatorLayout2 = OooOo().f58092OooO0O0;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "binding.clBenefit");
        p370o0OOoO.OooOOO0.OooO00o(coordinatorLayout2, false, 3);
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(oOo00OO0.ic_vip_help, new o00Oo0(this));
        }
    }
}
