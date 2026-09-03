package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
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
import p205o00o0o0o.o000O;
import p405o0Oo0OOO.oO000O0O;
import p475o0Ooooo0.o0O00oO0;
import p487o0o00O.o00O0O0;
import p487o0o00O.o00O0O00;
import p487o0o00O.oOO00O;
import p487o0o00O.oo00o;
import p562o0oOo000.o000000;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0ooOOo;
import p590o0oOooo0.O0000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/SettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingActivity.kt\ncom/yalla/yalla/ui/activity/main/SettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,160:1\n22#2,2:161\n*S KotlinDebug\n*F\n+ 1 SettingActivity.kt\ncom/yalla/yalla/ui/activity/main/SettingActivity\n*L\n39#1:161,2\n*E\n"})
public final class SettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f25078OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25079OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO000O0O.class), this, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25080OooO0Oo;

        public OooO00o(oo00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25080OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25080OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25080OooO0Oo;
        }

        public final int hashCode() {
            return this.f25080OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25080OooO0Oo.invoke(obj);
        }
    }

    public final oO000O0O OooOo() {
        return (oO000O0O) this.f25079OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        o0ooOOo o0ooooo = null;
        if (Intrinsics.areEqual(view, OooOo().f44765OooO0Oo)) {
            o0ooOOo o0ooooo2 = o00000OO.f56398OooO00o;
            if (o0ooooo2 != null) {
                o0ooooo = o0ooooo2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("account");
            }
            o0ooooo.OooO00o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44770OooOO0)) {
            o0oo0000.OooO00o.OooO0O0("105049");
            Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new Intent(this, (Class<?>) NoticeSettingActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44771OooOO0O)) {
            startActivity(new Intent(this, (Class<?>) PrivacyActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44767OooO0o0)) {
            startActivity(new Intent(this, (Class<?>) BlackListActivity.class));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44766OooO0o)) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32340OooO0o0, null, new o00O0O00(this));
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44768OooO0oO)) {
            o000O o000o = new o000O(this);
            o000o.OooOoO(o0000.OooO0OO(o000000.clear_chat_dialog_title));
            o000o.OooOOoo(o000000.clear_chat_dialog_info);
            o000o.OooOo(true);
            o000o.OooOo0(new o00O0O0(this));
            o000o.OooOO0o();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44761OooO)) {
            NetworkTestScreen.INSTANCE.navigate();
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f44764OooO0OO)) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
        } else if (Intrinsics.areEqual(view, OooOo().f44769OooO0oo)) {
            finish();
            O0000000.OooO0O0(this);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44762OooO00o);
        OooOOoo(o000000.Settings);
        OooOo().f44765OooO0Oo.setOnClickListener(this);
        OooOo().f44770OooOO0.setOnClickListener(this);
        OooOo().f44771OooOO0O.setOnClickListener(this);
        OooOo().f44767OooO0o0.setOnClickListener(this);
        OooOo().f44766OooO0o.setOnClickListener(this);
        OooOo().f44768OooO0oO.setOnClickListener(this);
        OooOo().f44761OooO.setOnClickListener(this);
        OooOo().f44764OooO0OO.setOnClickListener(this);
        OooOo().f44769OooO0oo.setOnClickListener(this);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0().observe(this, new OooO00o(new oo00o(this)));
        LiveEventBus.get("ACCOUNT_CHANGE_PASSWORD").observe(this, new oOO00O(this, 0));
    }
}
