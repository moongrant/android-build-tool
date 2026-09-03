package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0Oo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.main.MainVM;
import com.yalla.yalla.util.PaySupportChannels;
import com.yalla.yalla.util.cache.VideoPreloadWorker;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p382o0OOoo0o.o00Ooo;
import p386o0OOooOo.o00O0O0O;
import p426o0OoOO.o0ooOOo;
import p427o0OoOO00.Oooo0;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO0000Oo;
import p486o0o00O00.o000;
import p486o0o00O00.o00000O0;
import p486o0o00O00.o0000OO0;
import p486o0o00O00.o000O0;
import p486o0o00O00.o000O00;
import p486o0o00O00.o000O000;
import p486o0o00O00.o000O00O;
import p486o0o00O00.o000O0O0;
import p486o0o00O00.o000O0o;
import p486o0o00O00.o000OO;
import p486o0o00O00.o000Oo0;
import p579o0oOoo.oO00O0o0;
import p579o0oOoo.oO00o00;
import p584o0oOooO0.oO000o00;
import p641o0ooOOOO.q3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/MainActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,691:1\n22#2,2:692\n75#3,13:694\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivity\n*L\n117#1:692,2\n119#1:694,13\n*E\n"})
public final class MainActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f25394OooOoo = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public p557o0oOo.OooOo00 f25401OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public oO0000Oo f25403OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f25395OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(q3.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25398OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.MainActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25412OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25412OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25397OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25399OooOo0O = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25400OooOo0o = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25396OooOo = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final o000OO f25402OooOoO0 = new MessageQueue.IdleHandler() { // from class: o0o00O00.o000OO
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            int i = MainActivity.f25394OooOoo;
            MainActivity this$0 = this.f48288OooO00o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getClass();
            new Oooo0(this$0, new PayManager(this$0)).OooO0OO(PaySupportChannels.pay_type_googlePay.getNum(), false);
            this$0.OooOoO().atd(this$0);
            return false;
        }
    };

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f25404OooOoo0 = -1;

    public static final class OooO extends Lambda implements Function0<MainUpApkManager> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainUpApkManager invoke() {
            return new MainUpApkManager(MainActivity.this);
        }
    }

    public static final class OooO00o {
        public static void OooO00o(Activity context, int i, int i2) {
            int i3 = MainActivity.f25394OooOoo;
            if ((i2 & 2) != 0) {
                i = -1;
            }
            int i4 = (i2 & 4) == 0 ? 0 : -1;
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("page", i);
            intent.putExtra("INTENT_CHILD_PAGE", i4);
            context.startActivity(intent);
            context.overridePendingTransition(oO000o00.alpha_in, oO000o00.alpha_out);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<p426o0OoOO.OooOo00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p426o0OoOO.OooOo00 invoke() {
            int i = MainActivity.f25394OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new p426o0OoOO.OooOo00(mainActivity, mainActivity.OooOo());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<p426o0OoOO.Oooo0> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p426o0OoOO.Oooo0 invoke() {
            int i = MainActivity.f25394OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new p426o0OoOO.Oooo0(mainActivity, mainActivity.OooOo(), mainActivity.OooOoO());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0ooOOo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0ooOOo invoke() {
            int i = MainActivity.f25394OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new o0ooOOo(mainActivity, mainActivity.OooOo(), mainActivity.OooOoO());
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = MainActivity.f25394OooOoo;
            MainActivity.this.OooOoO0().OooO0Oo(3);
            return Unit.INSTANCE;
        }
    }

    static {
        new OooO00o();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(oO000o00.alpha_in, oO000o00.anim_empty);
    }

    public final q3 OooOo() {
        return (q3) this.f25395OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MainVM OooOoO() {
        return (MainVM) this.f25398OooOo00.getValue();
    }

    public final p426o0OoOO.Oooo0 OooOoO0() {
        return (p426o0OoOO.Oooo0) this.f25399OooOo0O.getValue();
    }

    public final void OooOoOO() {
        p557o0oOo.OooOo00 oooOo00 = this.f25401OooOoO;
        if (oooOo00 == null || oooOo00.f56173OooO0o0) {
            return;
        }
        int length = String.valueOf(System.currentTimeMillis()).length();
        long j = oooOo00.f56171OooO0Oo;
        int length2 = length - String.valueOf(j).length();
        int i = 1;
        if (1 <= length2) {
            while (true) {
                j *= (long) 10;
                if (i == length2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (j < System.currentTimeMillis() || !(com.code.android.util.OooO0O0.OooO0O0() instanceof MainActivity)) {
            return;
        }
        OooOo().f58660OooO0oO.OooO0O0(oooOo00);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(@Nullable Context context) {
        super.attachBaseContext(context);
        p591o0oo000O.OooO.OooO0O0();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        MainRoomFragment mainRoomFragment = OooOoO0().f45604OooO0oO;
        if (mainRoomFragment != null) {
            mainRoomFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
        oO00o00.OooO00o("MainActivity onCreate before onCreate");
        super.onCreate(bundle);
        oO00o00.OooO00o("MainActivity onCreate before setContentView");
        o00Ooo.f44287OooO0Oo = true;
        setContentView(OooOo().f58654OooO00o);
        oO00o00.OooO00o("MainActivity onCreate after setContentView");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        FrameLayout frameLayout = OooOo().f58657OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.flMain");
        p370o0OOoO.OooOOO0.OooO00o(frameLayout, false, 2);
        OooOoO().initBefore();
        SharedMainMessageManager.INSTANCE.isSignIn();
        List<Fragment> listOooo00O = getSupportFragmentManager().Oooo00O();
        if (!(listOooo00O == null || listOooo00O.isEmpty())) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
            Iterator<Fragment> it = getSupportFragmentManager().Oooo00O().iterator();
            while (it.hasNext()) {
                oooO00o.OooOOO0(it.next());
            }
            oooO00o.OooO0o();
        }
        ComposeView composeView = OooOo().f58656OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView, "mBinding.composeViewTopBg");
        o000OOo.OooO0Oo(composeView, o00000O0.f48253OooO00o);
        ComposeView composeView2 = OooOo().f58655OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView2, "mBinding.composeView");
        o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(1033011013, true, new o000(this)));
        p426o0OoOO.Oooo0 oooo0OooOoO0 = OooOoO0();
        oooo0OooOoO0.getClass();
        Looper.myQueue().addIdleHandler(oooo0OooOoO0.f46044OooO0OO);
        p426o0OoOO.OooOo00 oooOo00 = (p426o0OoOO.OooOo00) this.f25397OooOo0.getValue();
        oooOo00.getClass();
        Looper.myQueue().addIdleHandler(oooOo00.f46044OooO0OO);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), null, new o000O0O0(this, null), 2, null);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this, new com.yalla.yalla.ui.activity.main.OooO0OO.OooOO0(new o000O000(this)));
        LiveEventBus.get("INTENT_SCHEME").observeSticky(this, new o000O0o(this));
        MainUpApkManager mainUpApkManager = (MainUpApkManager) this.f25400OooOo0o.getValue();
        mainUpApkManager.getClass();
        Looper.myQueue().addIdleHandler(mainUpApkManager.f46044OooO0OO);
        LiveEventBus.get("NOTIFICATION_UPDATE_REMINDER").observe(this, new o000Oo0(this));
        LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD", p557o0oOo.OooOo00.class).observe(this, new o000O00(this));
        LiveEventBus.get("PageCreate_InApp").observe(this, new o000O00O(this));
        LiveEventBus.get("INTENT_FIREBASE").observeSticky(this, o000O0.f48280OooO0Oo);
        LiveEventBus.get("ConfirmRechargeOrder_Success").observe(this, p486o0o00O00.o000O0Oo.f48286OooO0Oo);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new o0000OO0(null));
        MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new p427o0OoOO00.OooOo00(null), 3, null);
        p592o0oo00O.OooOOO0.OooO0O0("AppInfo doOnInit");
        oO00o00.OooO00o("MainActivity onCreate delayShowLogin");
        oO00o00.OooO00o("MainActivity onCreate end");
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            oO0000Oo oo0000oo = this.f25403OooOoOO;
            if (oo0000oo != null) {
                unbindService(oo0000oo);
                this.f25403OooOoOO = null;
            }
        } catch (Exception e) {
            p592o0oo00O.OooOOO0.OooO00o(100, "IMService", e.getMessage(), e);
        }
        OooOoO0().OooO0OO();
        p426o0OoOO.OooOo00 oooOo00 = (p426o0OoOO.OooOo00) this.f25397OooOo0.getValue();
        oooOo00.getClass();
        Looper.myQueue().removeIdleHandler(oooOo00.f46044OooO0OO);
        MainUpApkManager mainUpApkManager = (MainUpApkManager) this.f25400OooOo0o.getValue();
        mainUpApkManager.getClass();
        Looper.myQueue().removeIdleHandler(mainUpApkManager.f46044OooO0OO);
        o0ooOOo o0ooooo = (o0ooOOo) this.f25396OooOo.getValue();
        o0ooooo.getClass();
        Looper.myQueue().removeIdleHandler(o0ooooo.f46044OooO0OO);
        stopService(new Intent(this, (Class<?>) RoomLiveService.class));
        Looper.myQueue().removeIdleHandler(this.f25402OooOoO0);
        o00Ooo.f44287OooO0Oo = false;
        List<o0OOo000.OooO0OO> pool = o0OOo000.OooOOOO.f43866OooO00o;
        Intrinsics.checkNotNullExpressionValue(pool, "pool");
        Iterator<Integer> it = CollectionsKt.getIndices(pool).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            o0OOo000.OooO0OO oooO0OO = pool.get(iNextInt);
            if (oooO0OO != null) {
                oooO0OO.release();
            }
            pool.set(iNextInt, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> oooOo) {
        super.onEventMainThread(oooOo);
        Intrinsics.checkNotNull(oooOo);
        if (oooOo.f45532OooO00o == 192) {
            OooOoO().loadUserInfo();
        }
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
            OooOoO0().OooO0Oo(0);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            OooOoO0().OooO0Oo(1);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            OooOoO0().OooO0Oo(2);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            OooOO0 onLogin = new OooOO0();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        IMMessageService iMMessageService = IMMessageService.f24939OooO0o;
        if (iMMessageService != null) {
            iMMessageService.OooO00o();
        }
        if (com.android.billingclient.api.o0000OO0.OooO0O0().OooO0O0("isUp", false)) {
            ((MainUpApkManager) this.f25400OooOo0o.getValue()).OooO0OO();
        }
        if (this.f25404OooOoo0 > -1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            linkedHashMap.put("userId", String.valueOf(o000000O.OooOOo0().getValue()));
            o00O0O0O.OooO00o("app_open", linkedHashMap);
        }
        this.f25404OooOoo0 = Calendar.getInstance().get(6);
        OooOoOO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        oO00O0o0.OooO0oO();
        p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
        Map<Long, Float> map = VideoPreloadWorker.f32839OooOOOO;
        o00oooOooO00o.OooOO0O(MapsKt.toMap(VideoPreloadWorker.f32839OooOOOO));
    }
}
