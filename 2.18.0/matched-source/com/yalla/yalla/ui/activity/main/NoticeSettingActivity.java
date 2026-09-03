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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.vm.main.NoticeSettingVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p070o0000ooO.o00000OO;
import p165o00OoOo0.oo0O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.oOO00O;
import p526o0o0O0oO.o0O0O0o0;
import p651o0ooOOoo.nh;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/NoticeSettingActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class NoticeSettingActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final /* synthetic */ int f22048OooooOo = 0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f22049OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(nh.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22050OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NoticeSettingVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.NoticeSettingActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22053Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22053Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public final nh OooOoo() {
        return (nh) this.f22049OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NoticeSettingVM OooOooO() {
        return (NoticeSettingVM) this.f22050OooooOO.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f50149OooO0O0)) {
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

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50148OooO00o);
        OooOo(R.string.Notice_Setting_title);
        OooOo0O(1);
        OooOoo().f50150OooO0OO.getF20951Oooo().f51060OooO0O0.setText(R.string.Notice_Setting_friend_requests);
        Switch r9 = OooOoo().f50150OooO0OO.getF20951Oooo().f51063OooO0o0;
        Intrinsics.checkNotNullExpressionValue(r9, "binding.cvFriendRequest.views.vSwitch");
        oOO00O.OooO(r9);
        OooOoo().f50150OooO0OO.getF20951Oooo().f51063OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OOoO.oO0OO0O
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NoticeSettingActivity this$0 = this.f43681OooO00o;
                int i = NoticeSettingActivity.f22048OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    this$0.OooOoOO(o000O0O0.OooO0OO(R.string.setting), this$0.f21704Ooooo00);
                    this$0.OooOooO().changeFriendRequestNotice(z);
                }
            }
        });
        OooOoo().f50151OooO0Oo.getF20951Oooo().f51060OooO0O0.setText(R.string.Notice_Setting_private_chat);
        Switch r10 = OooOoo().f50151OooO0Oo.getF20951Oooo().f51063OooO0o0;
        Intrinsics.checkNotNullExpressionValue(r10, "binding.cvPrivateChat.views.vSwitch");
        oOO00O.OooO(r10);
        OooOoo().f50151OooO0Oo.getF20951Oooo().f51063OooO0o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OOoO.oO0OO00
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NoticeSettingActivity this$0 = this.f43679OooO00o;
                int i = NoticeSettingActivity.f22048OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (compoundButton.isPressed()) {
                    this$0.OooOooO().changePrivateChatNotice(z);
                }
            }
        });
        OooOoo().f50149OooO0O0.setOnClickListener(this);
        OooOooO().getFriendRequest().observe(this, new o0O0O0o0(this, 2));
        OooOooO().getPrivateChat().observe(this, new oo0O(this, 3));
        BaseActivityK.OooOoo0(this, null, this.f21704Ooooo00, 1, null);
        OooOooO().loadNoticeSetting();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean zOooO00o = new o00000OO(this).OooO00o();
        LinearLayout linearLayout = OooOoo().f50152OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llPermissionTip");
        o00O0O.OooO0oO(linearLayout, !zOooO00o);
    }
}
