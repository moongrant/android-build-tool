package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.screen.NetworkTestScreen;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p486o0o00O00.o00O0O0;
import p486o0o00O00.o00O0O00;
import p486o0o00O00.o00O0OO0;
import p486o0o00O00.oo0o0O0;
import p560o0oOo000.o00000;
import p560o0oOo000.o0000OO0;
import p579o0oOoo.oO00o0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.u3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/SettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingActivity.kt\ncom/yalla/yalla/ui/activity/main/SettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,160:1\n22#2,2:161\n*S KotlinDebug\n*F\n+ 1 SettingActivity.kt\ncom/yalla/yalla/ui/activity/main/SettingActivity\n*L\n39#1:161,2\n*E\n"})
public final class SettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f25532OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25533OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(u3.class), this, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25534OooO0Oo;

        public OooO00o(o00O0O00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25534OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25534OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25534OooO0Oo;
        }

        public final int hashCode() {
            return this.f25534OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25534OooO0Oo.invoke(obj);
        }
    }

    public final u3 OooOo() {
        return (u3) this.f25533OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        o00000 o00000Var = null;
        if (Intrinsics.areEqual(view, OooOo().f58938OooO0Oo)) {
            o00000 o00000Var2 = o0000OO0.f56182OooO00o;
            if (o00000Var2 != null) {
                o00000Var = o00000Var2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("account");
            }
            o00000Var.OooO00o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58943OooOO0)) {
            o0OO000.OooO00o("105049");
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new Intent(this, (Class<?>) NoticeSettingActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58944OooOO0O)) {
            startActivity(new Intent(this, (Class<?>) PrivacyActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58940OooO0o0)) {
            startActivity(new Intent(this, (Class<?>) BlackListActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58939OooO0o)) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32884OooO0o0, null, new o00O0OO0(this));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58941OooO0oO)) {
            o0OO00O o0oo00o2 = new o0OO00O(this);
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.clear_chat_dialog_title));
            o0oo00o2.OooOOoo(oO00OOo0.clear_chat_dialog_info);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new oo0o0O0(this));
            o0oo00o2.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58934OooO)) {
            NetworkTestScreen.INSTANCE.navigate();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f58937OooO0OO)) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
        } else if (Intrinsics.areEqual(view, OooOo().f58942OooO0oo)) {
            finish();
            oO00o0.OooO0O0(this);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58935OooO00o);
        OooOOoo(oO00OOo0.Settings);
        OooOo().f58938OooO0Oo.setOnClickListener(this);
        OooOo().f58943OooOO0.setOnClickListener(this);
        OooOo().f58944OooOO0O.setOnClickListener(this);
        OooOo().f58940OooO0o0.setOnClickListener(this);
        OooOo().f58939OooO0o.setOnClickListener(this);
        OooOo().f58941OooO0oO.setOnClickListener(this);
        OooOo().f58934OooO.setOnClickListener(this);
        OooOo().f58937OooO0OO.setOnClickListener(this);
        OooOo().f58942OooO0oo.setOnClickListener(this);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0().observe(this, new OooO00o(new o00O0O00(this)));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new o00O0O0(this));
    }
}
