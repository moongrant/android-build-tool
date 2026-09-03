package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.z9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRuleActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeRuleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRuleActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRuleActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,42:1\n22#2,2:43\n*S KotlinDebug\n*F\n+ 1 BadgeRuleActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRuleActivity\n*L\n20#1:43,2\n*E\n"})
public final class BadgeRuleActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f27097OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27098OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(z9.class), this, null);

    public final z9 OooOo() {
        return (z9) this.f27098OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59499OooO00o);
        OooOOoo(oO00OOo0.user_badge_rule);
        OooOOo0(1);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(((MutableLiveData) o000000O.f46709Oooo0O0.getValue()).getValue(), Boolean.TRUE)) {
            OooOo().f59500OooO0O0.setText(o0000.OooO0OO(oO00OOo0.user_badge_rule_content1_new));
            OooOo().f59501OooO0OO.setText(o0000.OooO0OO(oO00OOo0.user_badge_rule_achievement_content2_new));
            AppCompatTextView appCompatTextView = OooOo().f59502OooO0Oo;
            CharSequence text = OooOo().f59502OooO0Oo.getText();
            appCompatTextView.setText(((Object) text) + "\n" + o0000.OooO0OO(oO00OOo0.user_badge_moment_diamond_medal_info));
        }
    }
}
