package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o1;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRuleActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeRuleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRuleActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRuleActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,42:1\n22#2,2:43\n*S KotlinDebug\n*F\n+ 1 BadgeRuleActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRuleActivity\n*L\n20#1:43,2\n*E\n"})
public final class BadgeRuleActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26631OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26632OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o1.class), this, null);

    public final o1 OooOo() {
        return (o1) this.f26632OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44696OooO00o);
        OooOOoo(o000000.user_badge_rule);
        OooOOo0(1);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(((MutableLiveData) o0O00oO0.f47971Oooo0O0.getValue()).getValue(), Boolean.TRUE)) {
            OooOo().f44697OooO0O0.setText(o0000.OooO0OO(o000000.user_badge_rule_content1_new));
            OooOo().f44698OooO0OO.setText(o0000.OooO0OO(o000000.user_badge_rule_achievement_content2_new));
            AppCompatTextView appCompatTextView = OooOo().f44699OooO0Oo;
            CharSequence text = OooOo().f44699OooO0Oo.getText();
            appCompatTextView.setText(((Object) text) + "\n" + o0000.OooO0OO(o000000.user_badge_moment_diamond_medal_info));
        }
    }
}
