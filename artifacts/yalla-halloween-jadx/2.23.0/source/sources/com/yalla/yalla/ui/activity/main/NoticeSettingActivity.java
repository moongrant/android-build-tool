package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.vm.main.NoticeSettingVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o00000O.o00oO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p486o0o00O00.o00O00OO;
import p486o0o00O00.oOO00O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.ea;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/NoticeSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNoticeSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeSettingActivity.kt\ncom/yalla/yalla/ui/activity/main/NoticeSettingActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,99:1\n22#2,2:100\n75#3,13:102\n*S KotlinDebug\n*F\n+ 1 NoticeSettingActivity.kt\ncom/yalla/yalla/ui/activity/main/NoticeSettingActivity\n*L\n22#1:100,2\n23#1:102,13\n*E\n"})
public final class NoticeSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f25428OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25429OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ea.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25430OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NoticeSettingVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.NoticeSettingActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f25433OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25433OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final ea OooOo() {
        return (ea) this.f25429OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f57855OooO0O0)) {
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
        setContentView(OooOo().f57854OooO00o);
        OooOOoo(oO00OOo0.Notice_Setting_title);
        OooOOo0(1);
        OooOo().f57856OooO0OO.getViews().f58823OooO0O0.setText(oO00OOo0.Notice_Setting_friend_requests);
        Switch r0 = OooOo().f57856OooO0OO.getViews().f58826OooO0o0;
        Intrinsics.checkNotNullExpressionValue(r0, "binding.cvFriendRequest.views.vSwitch");
        o000OO00.OooOOOO(r0);
        OooOo().f57856OooO0OO.getViews().f58826OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O00.o00O00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = NoticeSettingActivity.f25428OooOo0;
                NoticeSettingActivity this$0 = this.f48299OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    this$0.OooOo0O(this$0.f25138OooOOo0, o0000.OooO0OO(oO00OOo0.setting));
                    ((NoticeSettingVM) this$0.f25430OooOo00.getValue()).changeFriendRequestNotice(z);
                }
            }
        });
        OooOo().f57857OooO0Oo.getViews().f58823OooO0O0.setText(oO00OOo0.Notice_Setting_private_chat);
        Switch r1 = OooOo().f57857OooO0Oo.getViews().f58826OooO0o0;
        Intrinsics.checkNotNullExpressionValue(r1, "binding.cvPrivateChat.views.vSwitch");
        o000OO00.OooOOOO(r1);
        OooOo().f57857OooO0Oo.getViews().f58826OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o00O00.o00O00O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = NoticeSettingActivity.f25428OooOo0;
                NoticeSettingActivity this$0 = this.f48303OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    ((NoticeSettingVM) this$0.f25430OooOo00.getValue()).changePrivateChatNotice(z);
                }
            }
        });
        OooOo().f57855OooO0O0.setOnClickListener(this);
        ViewModelLazy viewModelLazy = this.f25430OooOo00;
        ((NoticeSettingVM) viewModelLazy.getValue()).getFriendRequest().observe(this, new oOO00O(this));
        ((NoticeSettingVM) viewModelLazy.getValue()).getPrivateChat().observe(this, new o00O00OO(this));
        BaseActivityK.OooOo0o(this, null, this.f25138OooOOo0, 1);
        ((NoticeSettingVM) viewModelLazy.getValue()).loadNoticeSetting();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zOooO00o = new o00oO0o(this).OooO00o();
        LinearLayout linearLayout = OooOo().f57858OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llPermissionTip");
        o000OO00.OooOOO0(linearLayout, !zOooO00o);
    }
}
