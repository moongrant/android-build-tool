package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.mixedroom.MixedRoomService;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.manager.FixRechargeOrderManager;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.main.MainVM;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import net.sqlcipher.database.SQLiteDatabase;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p143o00OOooo.o00O0OO;
import p143o00OOooo.o00OO00O;
import p159o00OoOO.o000O;
import p168o00Ooo0.o0OoOo0;
import p168o00Ooo0.oo000o;
import p176o00OoooO.oO00Oo0;
import p176o00OoooO.oO00o000;
import p193o00o0O00.Oooo000;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p487o0o000oO.o0ooOOo;
import p496o0o00OOo.o000oOoO;
import p515o0o0O00.o00O00;
import p516o0o0O000.oo0o0Oo;
import p524o0o0O0oO.o0O0000O;
import p524o0o0O0oO.o0O00o0;
import p524o0o0O0oO.o0O0O0o0;
import p524o0o0O0oO.o0O0o0;
import p524o0o0O0oO.o0O0oo0o;
import p535o0o0OOoO.oO0;
import p535o0o0OOoO.oO0O00;
import p535o0o0OOoO.oO0O000;
import p535o0o0OOoO.oO0O000o;
import p535o0o0OOoO.oO0O00O;
import p535o0o0OOoO.oO0O00oO;
import p601o0oo00Oo.o0OO0o00;
import p614o0oo0Oo.o000Oo0;
import p617o0oo0o.o00000O;
import p649o0ooOOoo.ha;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/MainActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainActivity extends BaseActivityK {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f21943ooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public ServiceConnection f21952OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public o0OO0o00 f21953Ooooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f21944OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ha.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f21945Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.MainActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.MainActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.MainActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f21965Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f21965Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f21946Ooooo0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f21947OooooO0 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f21948OooooOO = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f21949OooooOo = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f21951Oooooo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final oO0 f21950Oooooo = new MessageQueue.IdleHandler() { // from class: o0o0OOoO.oO0
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            MainActivity this$0 = this.f43630OooO00o;
            MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Objects.requireNonNull(this$0);
            FixRechargeOrderManager.start$default(new FixRechargeOrderManager(this$0, new PayManager(this$0)), PaySupportChannels.pay_type_googlePay.getNum(), false, 2, null);
            this$0.Oooo00o().atd(this$0);
            return false;
        }
    };

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f21954o0OoOo0 = -1;

    public static final class OooO extends Lambda implements Function0<o0O0o0> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0o0 invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            return new o0O0o0(mainActivity, mainActivity.OooOoo(), MainActivity.this.Oooo00o());
        }
    }

    public static final class OooO00o {
        public static void OooO00o(Context context, boolean z, int i, int i2) {
            OooO00o oooO00o = MainActivity.f21943ooOO;
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            int i3 = (i2 & 16) != 0 ? -1 : 0;
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent();
            intent.setClass(context, MainActivity.class);
            if (z) {
                intent.setFlags(268468224);
            }
            intent.putExtra("page", i);
            intent.putExtra("INTENT_CHILD_PAGE", i3);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0O0000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0000O invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            return new o0O0000O(mainActivity, mainActivity.OooOoo());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0oo0o> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0oo0o invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            return new o0O0oo0o(mainActivity, mainActivity.OooOoo());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0O0o0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O0o0 invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            return new o0O0O0o0(mainActivity, mainActivity.OooOoo(), MainActivity.this.Oooo00o());
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MainUpApkManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainUpApkManager invoke() {
            return new MainUpApkManager(MainActivity.this);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            mainActivity.OooOoo().f49534OooO0O0.setContent(o00O0000.OooO0O0(472284338, true, new oO0O00O(mainActivity)));
            mainActivity.Oooo000().OooO0OO();
            mainActivity.OooOooO().OooO0OO();
            mainActivity.OooOooo().OooO0OO();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getDefault(), null, new oO0O00oO(mainActivity, null), 2, null);
            o000Oo0.OooO00o(mainActivity.getIntent(), o0OO0OoO.OooO00o.f37476OooO0Oo);
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            oooOOO.OooOooO().observe(mainActivity, new o0O00o0(mainActivity, 1));
            LiveEventBus.get("INTENT_SCHEME").observeSticky(mainActivity, new oO00o000(mainActivity, 2));
            mainActivity.Oooo00O().OooO0OO();
            int i = 4;
            LiveEventBus.get("NOTIFICATION_UPDATE_REMINDER").observe(mainActivity, new o000O(mainActivity, i));
            LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD", o0OO0o00.class).observe(mainActivity, new o00OO00O(mainActivity, 3));
            LiveEventBus.get("PageCreate_InApp").observe(mainActivity, new o00O0OO(mainActivity, i));
            MainActivity mainActivity2 = MainActivity.this;
            Objects.requireNonNull(mainActivity2);
            LifecycleOwnerKt.getLifecycleScope(mainActivity2).launchWhenStarted(new oO0O00(null));
            if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
                MainActivity.this.Oooo0();
            }
            Intrinsics.checkNotNullParameter("MainActivity onCreate delayShowLogin", ViewHierarchyConstants.TEXT_KEY);
            o00O00.OooO0OO("TaskDispatcher", "MainActivity onCreate delayShowLogin  " + (System.currentTimeMillis() - o00000O.f48475OooO00o));
            Integer value = oooOOO.OooOO0().getValue();
            if (value == null) {
                value = 0;
            }
            o0O00000.OooO0Oo("userlevel", value.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainActivity mainActivity = MainActivity.this;
            OooO00o oooO00o = MainActivity.f21943ooOO;
            mainActivity.Oooo000().OooO0o(3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f21962Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ToastUtil.f12567OooO00o.OooO00o(R.string.room_toast);
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOOo() {
        overridePendingTransition(R.anim.alpha_in, R.anim.anim_empty);
    }

    public final ha OooOoo() {
        return (ha) this.f21944OoooOoo.getValue();
    }

    public final o0O0000O OooOooO() {
        return (o0O0000O) this.f21948OooooOO.getValue();
    }

    public final o0O0oo0o OooOooo() {
        return (o0O0oo0o) this.f21946Ooooo0o.getValue();
    }

    public final void Oooo0() {
        Oooo00o().loadUserInfo();
    }

    public final o0O0O0o0 Oooo000() {
        return (o0O0O0o0) this.f21947OooooO0.getValue();
    }

    public final MainUpApkManager Oooo00O() {
        return (MainUpApkManager) this.f21949OooooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MainVM Oooo00o() {
        return (MainVM) this.f21945Ooooo00.getValue();
    }

    public final void Oooo0O0() {
        o0OO0o00 o0oo0o01 = this.f21953Ooooooo;
        if (o0oo0o01 == null || o0oo0o01.f48209OooO0o0) {
            return;
        }
        long j = o0oo0o01.f48207OooO0Oo;
        if (o000oOoO.OooO00o(j, p279o0O00OoO.OooO.OooO00o()) == 3) {
            j *= (long) 1000;
        }
        if (j < System.currentTimeMillis() || !(p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0() instanceof MainActivity)) {
            return;
        }
        OooOoo().f49539OooO0oO.OooO0O0(o0oo0o01);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(@Nullable Context context) {
        super.attachBaseContext(context);
        Oooo000.f33132OooO00o = oo000o.OooO00o();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        MainRoomFragment mainRoomFragment = Oooo000().f43048OooO0oO;
        if (mainRoomFragment != null) {
            mainRoomFragment.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        boolean z2;
        oO00Oo0 oo00oo0 = OooOooO().f43020OooO;
        if (oo00oo0 != null) {
            FrameLayout frameLayout = oo00oo0.f32851OooO00o.f49726OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
            if (o00O0O.OooO0OO(frameLayout)) {
                oo00oo0.OooO00o();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return;
        }
        DrawerLayout drawerLayout = OooOoo().f49535OooO0OO;
        View viewOooO0Oo = drawerLayout.OooO0Oo(8388611);
        if (viewOooO0Oo != null ? drawerLayout.OooOO0o(viewOooO0Oo) : false) {
            OooOoo().f49535OooO0OO.OooO0OO(false);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
        o00000O.OooO00o("MainActivity onCreate before onCreate");
        super.onCreate(bundle);
        o00000O.OooO00o("MainActivity onCreate before setContentView");
        setContentView(OooOoo().f49533OooO00o);
        o00000O.OooO00o("MainActivity onCreate after setContentView");
        o0ooOOo o0ooooo2 = o0ooOOo.f40960OooO00o;
        boolean z = true;
        o0ooOOo.f40961OooO0O0 = true;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        FrameLayout frameLayout = OooOoo().f49536OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.flMain");
        oO0OoOO0.OooO0O0(frameLayout, false, 2);
        ImageView imageView = OooOoo().f49532OooO;
        Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.vToolbarBackground");
        oO0OoOO0.OooO0OO(imageView);
        Oooo00o().initBefore();
        SharedMainMessageManager.INSTANCE.isSignIn();
        List<Fragment> listOooo0OO = getSupportFragmentManager().Oooo0OO();
        if (listOooo0OO != null && !listOooo0OO.isEmpty()) {
            z = false;
        }
        if (!z) {
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(getSupportFragmentManager());
            Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
            Iterator<Fragment> it = getSupportFragmentManager().Oooo0OO().iterator();
            while (it.hasNext()) {
                oooO00o.OooOOO0(it.next());
            }
            oooO00o.OooO0oo();
        }
        oo0o0Oo.f42125OooO00o.OooO00o(this, new OooOO0O());
        Intrinsics.checkNotNullParameter("MainActivity onCreate end", ViewHierarchyConstants.TEXT_KEY);
        o00O00.OooO0OO("TaskDispatcher", "MainActivity onCreate end  " + (System.currentTimeMillis() - o00000O.f48475OooO00o));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection = this.f21952OoooooO;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
            this.f21952OoooooO = null;
        }
        Oooo000().OooO0o0();
        OooOooo().OooO0o0();
        OooOooO().OooO0o0();
        Oooo00O().OooO0o0();
        ((o0O0o0) this.f21951Oooooo0.getValue()).OooO0o0();
        stopService(new Intent(this, (Class<?>) MixedRoomService.class));
        Looper.myQueue().removeIdleHandler(this.f21950Oooooo);
        o0ooOOo o0ooooo2 = o0ooOOo.f40960OooO00o;
        o0ooOOo.f40961OooO0O0 = false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
        Intrinsics.checkNotNull(oooO0OO);
        int i = oooO0OO.f31885OooO00o;
        if (i != 151) {
            if (i != 192) {
                return;
            }
            Oooo0();
            return;
        }
        stopService(new Intent(this, (Class<?>) MixedRoomService.class));
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOoo(R.string.room_ban_title);
        oo0ooo0.OooOo0(R.string.room_ban_toast);
        oo0ooo0.OooO0oO(false);
        oo0ooo0.OooOo0o(OooOOO0.f21962Oooo0o);
        oo0ooo0.OooOOO0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("isExitApp", false)) {
            finish();
            Process.killProcess(Process.myPid());
            return;
        }
        setIntent(intent);
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("page", -1)) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            Oooo000().OooO0o(0);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            Oooo000().OooO0o(1);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            Oooo000().OooO0o(2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            OooOOO onLogin = new OooOOO();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (com.android.billingclient.api.o00000O.OooO0O0().OooOO0()) {
            Oooo00O().OooO0o();
        }
        o000Oo0.OooO00o(getIntent(), oO0O000.f43649OooO0Oo);
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            try {
                LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new oO0O000o(this, null));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f21954o0OoOo0 > -1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
            p141o00OOoo.OooO.OooO00o("app_open", linkedHashMap);
        }
        this.f21954o0OoOo0 = Calendar.getInstance().get(6);
        Oooo0O0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        o0OoOo0.OooO();
    }
}
