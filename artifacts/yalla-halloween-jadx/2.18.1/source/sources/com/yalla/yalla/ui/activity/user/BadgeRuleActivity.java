package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p649o0ooOOoo.jh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRuleActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeRuleActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23309Ooooo00 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23310OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(jh.class), this, null);

    public static final class OooO00o {
    }

    public final jh OooOoo() {
        return (jh) this.f23310OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49798OooO00o);
        OooOo(R.string.user_badge_rule);
        OooOo0O(1);
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOO0o().getValue(), Boolean.TRUE)) {
            OooOoo().f49799OooO0O0.setText(o000O0O0.OooO0OO(R.string.user_badge_rule_content1_new));
            OooOoo().f49800OooO0OO.setText(o000O0O0.OooO0OO(R.string.user_badge_rule_achievement_content2_new));
            OooOoo().f49801OooO0Oo.setText(((Object) OooOoo().f49801OooO0Oo.getText()) + '\n' + o000O0O0.OooO0OO(R.string.user_badge_moment_diamond_medal_info));
        }
    }
}
