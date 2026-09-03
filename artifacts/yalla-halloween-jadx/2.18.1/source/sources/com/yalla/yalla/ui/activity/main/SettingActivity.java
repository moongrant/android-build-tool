package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00OOO0;
import p143o00OOooo.o00OOOO0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p535o0o0OOoO.oOO00OO;
import p535o0o0OOoO.ooooO000;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p649o0ooOOoo.la;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/SettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22059Ooooo00 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22060OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(la.class), this, null);

    public static final class OooO00o {
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOo0() {
    }

    public final la OooOoo() {
        return (la) this.f22060OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f49942OooO0Oo)) {
            Intrinsics.checkNotNullParameter(this, "activity");
            startActivity(new Intent(this, (Class<?>) AccountActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49947OooOO0)) {
            o0O00000.OooO0OO("Me_push_notification");
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new Intent(this, (Class<?>) NoticeSettingActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49948OooOO0O)) {
            startActivity(new Intent(this, (Class<?>) PrivacyActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49944OooO0o0)) {
            startActivity(new Intent(this, (Class<?>) BlackListActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49943OooO0o)) {
            o0O0O00.OooO0OO(this, oo0o0Oo.f48608OooO0OO, null, new oOO00OO(this));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49945OooO0oO)) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(this);
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.clear_chat_dialog_title));
            oo0ooo0.OooOo0(R.string.clear_chat_dialog_info);
            oo0ooo0.OooOoOO(true);
            oo0ooo0.OooOo0o(new ooooO000(this));
            oo0ooo0.OooOOO0();
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49938OooO)) {
            startActivity(new Intent(this, (Class<?>) NetworkTestActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49941OooO0OO)) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
        } else if (Intrinsics.areEqual(view, OooOoo().f49946OooO0oo)) {
            finish();
            p516o0o0O000.oo0o0Oo.f42125OooO00o.OooO0O0(this, false);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49939OooO00o);
        OooOo(R.string.Settings);
        OooOoo().f49942OooO0Oo.setOnClickListener(this);
        OooOoo().f49947OooOO0.setOnClickListener(this);
        OooOoo().f49948OooOO0O.setOnClickListener(this);
        OooOoo().f49944OooO0o0.setOnClickListener(this);
        OooOoo().f49943OooO0o.setOnClickListener(this);
        OooOoo().f49945OooO0oO.setOnClickListener(this);
        OooOoo().f49938OooO.setOnClickListener(this);
        OooOoo().f49941OooO0OO.setOnClickListener(this);
        OooOoo().f49946OooO0oo.setOnClickListener(this);
        int i = 3;
        OooOOO.f41216OooO00o.OooOoo().observe(this, new o00OOO0(this, i));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o00OOOO0(this, i));
    }
}
