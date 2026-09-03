package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.vm.main.NoticeSettingVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.u1;
import p445o0OoOo0o.o000O0O0;
import p492o0o00O0O.o00O00OO;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/NoticeSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNoticeSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeSettingActivity.kt\ncom/yalla/yalla/ui/activity/main/NoticeSettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,99:1\n22#2,2:100\n75#3,13:102\n*S KotlinDebug\n*F\n+ 1 NoticeSettingActivity.kt\ncom/yalla/yalla/ui/activity/main/NoticeSettingActivity\n*L\n22#1:100,2\n23#1:102,13\n*E\n"})
public final class NoticeSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f24975OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24976OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(u1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24977OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NoticeSettingVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.NoticeSettingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.NoticeSettingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.NoticeSettingActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24980OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24980OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final u1 OooOo() {
        return (u1) this.f24976OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f45568OooO0O0)) {
            Intent intent = new Intent();
            try {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", getApplicationInfo().uid);
                intent.putExtra("app_package", getPackageName());
                intent.putExtra("app_uid", getApplicationInfo().uid);
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.putExtra("package", getPackageName());
                startActivity(intent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45567OooO00o);
        OooOOoo(o000OOo.Notice_Setting_title);
        OooOOo0(1);
        OooOo().f45569OooO0OO.getViews().f43935OooO0O0.setText(o000OOo.Notice_Setting_friend_requests);
        Switch vSwitch = OooOo().f45569OooO0OO.getViews().f43938OooO0o0;
        Intrinsics.checkNotNullExpressionValue(vSwitch, "vSwitch");
        o000O.OooOOOO(vSwitch);
        OooOo().f45569OooO0OO.getViews().f43938OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O0O.o00O00O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = NoticeSettingActivity.f24975OooOo0;
                NoticeSettingActivity this$0 = this.f48949OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    this$0.OooOo0O(this$0.f24684OooOOo0, o0000.OooO0OO(o000OOo.setting));
                    ((NoticeSettingVM) this$0.f24977OooOo00.getValue()).changeFriendRequestNotice(z);
                }
            }
        });
        OooOo().f45570OooO0Oo.getViews().f43935OooO0O0.setText(o000OOo.Notice_Setting_private_chat);
        Switch vSwitch2 = OooOo().f45570OooO0Oo.getViews().f43938OooO0o0;
        Intrinsics.checkNotNullExpressionValue(vSwitch2, "vSwitch");
        o000O.OooOOOO(vSwitch2);
        OooOo().f45570OooO0Oo.getViews().f43938OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O0O.oOO00O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = NoticeSettingActivity.f24975OooOo0;
                NoticeSettingActivity this$0 = this.f49044OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    ((NoticeSettingVM) this$0.f24977OooOo00.getValue()).changePrivateChatNotice(z);
                }
            }
        });
        OooOo().f45568OooO0O0.setOnClickListener(this);
        ViewModelLazy viewModelLazy = this.f24977OooOo00;
        ((NoticeSettingVM) viewModelLazy.getValue()).getFriendRequest().observe(this, new o000O0O0(this, 1));
        ((NoticeSettingVM) viewModelLazy.getValue()).getPrivateChat().observe(this, new o00O00OO(this, 0));
        BaseActivityK.OooOo0o(this, null, this.f24684OooOOo0, 1);
        ((NoticeSettingVM) viewModelLazy.getValue()).loadNoticeSetting();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zOooO00o = new NotificationManagerCompat(this).OooO00o();
        LinearLayout llPermissionTip = OooOo().f45571OooO0o0;
        Intrinsics.checkNotNullExpressionValue(llPermissionTip, "llPermissionTip");
        o000O.OooOOO0(llPermissionTip, !zOooO00o);
    }
}
