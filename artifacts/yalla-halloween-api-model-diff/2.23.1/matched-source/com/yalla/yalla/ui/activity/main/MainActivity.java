package com.yalla.yalla.ui.activity.main;

import OooO0OO.OooO0O0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o000O0;
import com.code.android.util.o0OoOo0;
import com.facebook.internal.AnalyticsEvents;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.manager.main.MainUpApkManager;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.main.MainVM;
import com.yalla.yalla.util.PaySupportChannels;
import com.yalla.yalla.util.WebPageInfo;
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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p193o00o0O0O.o0000oo;
import p270o00oooo0.o0O0OO0;
import p381o0OOoOOO.o00O00o0;
import p388o0OOooO.oo0o0Oo;
import p407o0Oo0OOO.oO0000o0;
import p416o0Oo0oO.oO000O0;
import p431o0OoOO.Oooo000;
import p431o0OoOO.o0Oo0oo;
import p435o0OoOOO0.o00000;
import p435o0OoOOO0.o00000OO;
import p435o0OoOOO0.o0000OO0;
import p474o0OoooOO.oo0oO0;
import p478o0OooooO.oOO0O0O0;
import p492o0o00O0O.o0000O00;
import p492o0o00O0O.o000O00;
import p492o0o00O0O.o000O00O;
import p492o0o00O0O.o000O0O0;
import p492o0o00O0O.o000O0Oo;
import p492o0o00O0O.o000O0o;
import p492o0o00O0O.o000OO00;
import p492o0o00O0O.o000OO0O;
import p565o0oOo000.o00Ooo;
import p571o0oOo0o0.o0O0O00;
import p574o0oOoO0o.o00O0O0;
import p587o0oOooO.oO00OOo0;
import p587o0oOooO.oO00o00O;
import p587o0oOooO.oOo000Oo;
import p597o0oo00O.OooOOOO;
import p648o0ooOOoo.s0;
import p648o0ooOOoo.t0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/MainActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,691:1\n22#2,2:692\n75#3,13:694\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/yalla/yalla/ui/activity/main/MainActivity\n*L\n117#1:692,2\n119#1:694,13\n*E\n"})
public final class MainActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f24941OooOoo = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public o00O0O0 f24948OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public oOO0O0O0 f24950OooOoOO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24942OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO0000o0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24945OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MainVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.MainActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f24959OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24959OooO0Oo;
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
    public final Lazy f24944OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f24946OooOo0O = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24947OooOo0o = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f24943OooOo = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final o000O0o f24949OooOoO0 = new MessageQueue.IdleHandler() { // from class: o0o00O0O.o000O0o
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            int i = MainActivity.f24941OooOoo;
            MainActivity this$0 = this.f48930OooO00o;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getClass();
            new Oooo000(this$0, new PayManager(this$0)).OooO0OO(PaySupportChannels.pay_type_googlePay.getNum(), false);
            this$0.OooOoO().atd(this$0);
            return false;
        }
    };

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f24951OooOoo0 = -1;

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
            int i3 = MainActivity.f24941OooOoo;
            if ((i2 & 2) != 0) {
                i = -1;
            }
            int i4 = (i2 & 4) == 0 ? 0 : -1;
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("page", i);
            intent.putExtra("INTENT_CHILD_PAGE", i4);
            context.startActivity(intent);
            context.overridePendingTransition(o00Ooo.alpha_in, o00Ooo.alpha_out);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000 invoke() {
            int i = MainActivity.f24941OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new o00000(mainActivity, mainActivity.OooOo());
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00000OO> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            int i = MainActivity.f24941OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new o00000OO(mainActivity, mainActivity.OooOo(), mainActivity.OooOoO());
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0000OO0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000OO0 invoke() {
            int i = MainActivity.f24941OooOoo;
            MainActivity mainActivity = MainActivity.this;
            return new o0000OO0(mainActivity, mainActivity.OooOo(), mainActivity.OooOoO());
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = MainActivity.f24941OooOoo;
            MainActivity.this.OooOoO0().OooO0Oo(3);
            return Unit.INSTANCE;
        }
    }

    static {
        new OooO00o();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(o00Ooo.alpha_in, o00Ooo.anim_empty);
    }

    public final oO0000o0 OooOo() {
        return (oO0000o0) this.f24942OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MainVM OooOoO() {
        return (MainVM) this.f24945OooOo00.getValue();
    }

    public final o00000OO OooOoO0() {
        return (o00000OO) this.f24946OooOo0O.getValue();
    }

    public final void OooOoOO() {
        o00O0O0 o00o0o0 = this.f24948OooOoO;
        if (o00o0o0 == null || o00o0o0.f56342OooO0o0) {
            return;
        }
        int length = String.valueOf(System.currentTimeMillis()).length();
        long j = o00o0o0.f56340OooO0Oo;
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
        OooOo().f44758OooO0oO.OooO0O0(o00o0o0);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(@Nullable Context context) {
        super.attachBaseContext(context);
        p596o0oo000O.OooO0o.OooO0O0();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        MainRoomFragment mainRoomFragment = OooOoO0().f46861OooO0oO;
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
        oOo000Oo.OooO00o("MainActivity onCreate before onCreate");
        super.onCreate(bundle);
        oOo000Oo.OooO00o("MainActivity onCreate before setContentView");
        int i = 1;
        oo0o0Oo.f43506OooO0Oo = true;
        setContentView(OooOo().f44752OooO00o);
        oOo000Oo.OooO00o("MainActivity onCreate after setContentView");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        int i2 = 0;
        o00O00o0.OooO0OO(window, 0);
        FrameLayout flMain = OooOo().f44755OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flMain, "flMain");
        o00O00o0.OooO00o(flMain, false, 2);
        OooOoO().initBefore();
        SharedMainMessageManager.INSTANCE.isSignIn();
        List<Fragment> listOooo00O = getSupportFragmentManager().Oooo00O();
        if (!(listOooo00O == null || listOooo00O.isEmpty())) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
            Iterator<Fragment> it = getSupportFragmentManager().Oooo00O().iterator();
            while (it.hasNext()) {
                oooO00o.OooOO0o(it.next());
            }
            oooO00o.OooO0o();
        }
        ComposeView composeViewTopBg = OooOo().f44754OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeViewTopBg, "composeViewTopBg");
        o0000oo.OooO0Oo(composeViewTopBg, o0000O00.f48907OooO00o);
        ComposeView composeView = OooOo().f44753OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(1033011013, true, new o000OO0O(this)));
        o00000OO o00000ooOooOoO0 = OooOoO0();
        o00000ooOooOoO0.getClass();
        Looper.myQueue().addIdleHandler(o00000ooOooOoO0.f46845OooO0OO);
        o00000 o00000Var = (o00000) this.f24944OooOo0.getValue();
        o00000Var.getClass();
        Looper.myQueue().addIdleHandler(o00000Var.f46845OooO0OO);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), null, new o000OO00(this, null), 2, null);
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        oo0oO0.OooOo0O().observe(this, new com.yalla.yalla.ui.activity.main.OooO0OO.OooOO0(new o000O0O0(this)));
        LiveEventBus.get("INTENT_SCHEME").observeSticky(this, new Observer() { // from class: o0o00O0O.o000Oo0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String strRemovePrefix;
                String queryParameter;
                String url;
                String queryParameter2;
                int i3 = MainActivity.f24941OooOoo;
                MainActivity context = this.f48939OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                OooOOOO.OooO0OO("IntentScheme", "LiveEventBus it = " + obj);
                if (obj instanceof Uri) {
                    Uri uri = (Uri) obj;
                    Intrinsics.checkNotNullParameter(context, "activity");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    OooOOOO.OooO0OO("IntentScheme", "parserIntentUri uri = " + uri);
                    String scheme = uri.getScheme();
                    if (scheme != null && ((StringsKt__StringsJVMKt.startsWith(scheme, "yalla", true) && Intrinsics.areEqual(uri.getHost(), "screen")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "enterroom")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "main")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "account_binding")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "start")) || ((StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), "event")) || (StringsKt__StringsJVMKt.startsWith(scheme, "com.weieyu.yalla", true) && Intrinsics.areEqual(uri.getHost(), AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB))))))))) {
                        if (!Intrinsics.areEqual(uri.getScheme(), "yalla")) {
                            uri = new Uri.Builder().scheme("yalla").authority("screen").path(uri.getHost()).appendQueryParameter("BarId", uri.getQueryParameter("BarId")).appendQueryParameter("eventID", uri.getQueryParameter("eventID")).appendQueryParameter("url", uri.getQueryParameter("url")).build();
                        }
                        Intrinsics.checkNotNull(uri);
                        String scheme2 = uri.getScheme();
                        String host = uri.getHost();
                        String path = uri.getPath();
                        String strOooO00o = OooO.OooO00o(uri.getQueryParameterNames());
                        StringBuilder sb = new StringBuilder("intentJump uri = ");
                        sb.append(uri);
                        sb.append(", scheme = ");
                        sb.append(scheme2);
                        sb.append(", host = ");
                        OooO0O0.OooO00o(sb, host, ", path = ", path, ", ParameterNames = ");
                        sb.append(strOooO00o);
                        sb.append(", } ");
                        OooOOOO.OooO0OO("IntentScheme", sb.toString());
                        String path2 = uri.getPath();
                        if (path2 == null || (strRemovePrefix = StringsKt.removePrefix(path2, (CharSequence) "/")) == null) {
                            return;
                        }
                        switch (strRemovePrefix.hashCode()) {
                            case -1328717197:
                                if (strRemovePrefix.equals("account_binding")) {
                                    oO00o00O onLogin = oO00o00O.f56706OooO0Oo;
                                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                                    if (!Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                        Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
                                        if (context2 != null) {
                                            Intrinsics.checkNotNullParameter(context2, "context");
                                            context2.startActivity(new Intent(context2, (Class<?>) LoginActivity.class));
                                        }
                                    } else {
                                        onLogin.invoke();
                                    }
                                    break;
                                }
                                break;
                            case -857121869:
                                if (strRemovePrefix.equals("enterroom") && (queryParameter = uri.getQueryParameter("BarId")) != null) {
                                    MutableState mutableState = o0Oo0oo.f46817OooO00o;
                                    o0Oo0oo.OooO0o0(o0OoOo0.OooO(0L, queryParameter), EnterRoomParentPage.OtherApp_Room);
                                }
                                break;
                            case 117588:
                                if (strRemovePrefix.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB) && (url = uri.getQueryParameter("url")) != null) {
                                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ExternalLink);
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    webPageInfo.f32289OooO0o0 = url;
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                                    intent.putExtra("pageinfo", webPageInfo);
                                    context.startActivity(intent);
                                }
                                break;
                            case 3343801:
                                if (strRemovePrefix.equals("main")) {
                                    MainActivity.OooO00o.OooO00o(context, 0, 6);
                                    break;
                                }
                                break;
                            case 96891546:
                                if (strRemovePrefix.equals("event") && (queryParameter2 = uri.getQueryParameter("eventID")) != null) {
                                    EventModel eventModel = new EventModel();
                                    eventModel.setId(o0OoOo0.OooO(0L, queryParameter2));
                                    if (eventModel.getId() != 0) {
                                        p571o0oOo0o0.o0OoOo0 o0oooo1 = o0O0O00.f56324OooO0O0;
                                        if (o0oooo1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("event");
                                            o0oooo1 = null;
                                        }
                                        o0oooo1.OooO0o(eventModel);
                                        break;
                                    }
                                }
                                break;
                            case 109757538:
                                strRemovePrefix.equals("start");
                                break;
                        }
                    }
                }
            }
        });
        MainUpApkManager mainUpApkManager = (MainUpApkManager) this.f24947OooOo0o.getValue();
        mainUpApkManager.getClass();
        Looper.myQueue().addIdleHandler(mainUpApkManager.f46845OooO0OO);
        LiveEventBus.get("NOTIFICATION_UPDATE_REMINDER").observe(this, new o000O00(this, i2));
        LiveEventBus.get("NOTIFICATION_ROOM_MEMBER_CONVENE_CARD", o00O0O0.class).observe(this, new s0(this, i));
        LiveEventBus.get("PageCreate_InApp").observe(this, new t0(this, i));
        LiveEventBus.get("INTENT_FIREBASE").observeSticky(this, new o000O00O());
        LiveEventBus.get("ConfirmRechargeOrder_Success").observe(this, new p492o0o00O0O.o000O0());
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new o000O0Oo(null));
        MutableLiveData<Integer> mutableLiveData = p431o0OoOO.OooOo00.f46776OooO00o;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new p431o0OoOO.OooOOOO(null), 3, null);
        p597o0oo00O.OooOOOO.OooO0O0("AppInfo doOnInit");
        oOo000Oo.OooO00o("MainActivity onCreate delayShowLogin");
        oOo000Oo.OooO00o("MainActivity onCreate end");
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            oOO0O0O0 ooo0o0o0 = this.f24950OooOoOO;
            if (ooo0o0o0 != null) {
                unbindService(ooo0o0o0);
                this.f24950OooOoOO = null;
            }
        } catch (Exception e) {
            p597o0oo00O.OooOOOO.OooO00o(100, "IMService", e.getMessage(), e);
        }
        OooOoO0().OooO0OO();
        o00000 o00000Var = (o00000) this.f24944OooOo0.getValue();
        o00000Var.getClass();
        Looper.myQueue().removeIdleHandler(o00000Var.f46845OooO0OO);
        MainUpApkManager mainUpApkManager = (MainUpApkManager) this.f24947OooOo0o.getValue();
        mainUpApkManager.getClass();
        Looper.myQueue().removeIdleHandler(mainUpApkManager.f46845OooO0OO);
        o0000OO0 o0000oo1 = (o0000OO0) this.f24943OooOo.getValue();
        o0000oo1.getClass();
        Looper.myQueue().removeIdleHandler(o0000oo1.f46845OooO0OO);
        stopService(new Intent(this, (Class<?>) RoomLiveService.class));
        Looper.myQueue().removeIdleHandler(this.f24949OooOoO0);
        oo0o0Oo.f43506OooO0Oo = false;
        List<p365o0OOo00O.OooO> pool = p365o0OOo00O.Oooo000.f43070OooO00o;
        Intrinsics.checkNotNullExpressionValue(pool, "pool");
        Iterator<Integer> it = CollectionsKt.getIndices(pool).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            p365o0OOo00O.OooO oooO = pool.get(iNextInt);
            if (oooO != null) {
                oooO.release();
            }
            pool.set(iNextInt, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p548o0oO0O00.OooOOOO
    public final void onEventMainThread(@Nullable p548o0oO0O00.OooOOO<?> oooOOO) {
        super.onEventMainThread(oooOOO);
        Intrinsics.checkNotNull(oooOOO);
        if (oooOOO.f55803OooO00o == 192) {
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
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
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
        IMMessageService iMMessageService = IMMessageService.f24486OooO0o;
        if (iMMessageService != null) {
            iMMessageService.OooO00o();
        }
        if (o0O0OO0.OooO0O0().OooO0O0("isUp", false)) {
            ((MainUpApkManager) this.f24947OooOo0o.getValue()).OooO0OO();
        }
        if (this.f24951OooOoo0 > -1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            linkedHashMap.put("userId", String.valueOf(oo0oO0.OooOOo0().getValue()));
            p392o0OOooo.o00000.OooO00o("app_open", linkedHashMap);
        }
        this.f24951OooOoo0 = Calendar.getInstance().get(6);
        OooOoOO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        oO00OOo0.OooO0oO();
        oO000O0 oo000o0OooO00o = p417o0Oo0oO0.o00Oo0.OooO00o();
        Map<Long, Float> map = VideoPreloadWorker.f32309OooO;
        oo000o0OooO00o.OooOO0O(MapsKt.toMap(VideoPreloadWorker.f32309OooO));
    }
}
