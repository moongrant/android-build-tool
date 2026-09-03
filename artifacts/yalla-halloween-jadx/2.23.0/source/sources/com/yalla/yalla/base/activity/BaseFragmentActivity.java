package com.yalla.yalla.base.activity;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.util.bluetooth.BluetoothBroadcastReceiver;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.jessyan.autosize.AutoSizeCompat;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o000oOoO;
import p399o0Oo0O0O.o00O0O;
import p399o0Oo0O0O.o0OoOo0;
import p418o0OoO000.Oooo000;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.z0;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p629o0ooO0O0.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0017J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0017J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "Lo0OoO000/Oooo000;", "Lo0ooO0O0/o00000OO;", "Landroid/view/View$OnClickListener;", "Lo0Oo0O0O/o00O0O;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "setContentView", "Lo0OoO000/OooOo;", "msg", "onEvent", "onEventMainThread", "onClick", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseFragmentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentActivity.kt\ncom/yalla/yalla/base/activity/BaseFragmentActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,250:1\n75#2,13:251\n1#3:264\n81#4:265\n107#4,2:266\n*S KotlinDebug\n*F\n+ 1 BaseFragmentActivity.kt\ncom/yalla/yalla/base/activity/BaseFragmentActivity\n*L\n63#1:251,13\n110#1:265\n110#1:266,2\n*E\n"})
public class BaseFragmentActivity extends BaseAppCompatActivity implements Oooo000, o00000OO, View.OnClickListener, o00O0O {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final /* synthetic */ int f22750OooOOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public BluetoothBroadcastReceiver f22751OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f22753OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public HeaderLayout f22755OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f22758OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f22760OooOOOO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f22752OooO0o = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f22754OooO0oo = new OooO0O0();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22756OooOO0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0O0OOO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.base.activity.BaseFragmentActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.base.activity.BaseFragmentActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.base.activity.BaseFragmentActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f22765OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22765OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f22757OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22759OooOOO0 = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<ComposeView> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComposeView invoke() {
            ComposeView composeView = new ComposeView(BaseFragmentActivity.this, null, 0, 6, null);
            View decorView = BaseFragmentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(composeView, new FrameLayout.LayoutParams(-1, -1));
            return composeView;
        }
    }

    public static final class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            BaseFragmentActivity.this.onClickNotDouble(view);
        }
    }

    @NotNull
    public final View OooOOOO(int i) {
        View viewFindViewById = findViewById(i);
        z0.OooO0O0(viewFindViewById, this.f22754OooO0oo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewClick(activity, id, noDoubleClickListener)");
        return viewFindViewById;
    }

    public boolean OooOOOo() {
        return !(this instanceof MixedRoomActivity);
    }

    public void OooOOo() {
        setRequestedOrientation(1);
    }

    public final void OooOOo0(int i) {
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            if (i == 1) {
                headerLayout.OooOo0O();
                int i2 = oO00O0o.white;
                Object obj = ContextCompat.f5271OooO00o;
                o0000O0O.OooO0o0(this, ContextCompat.OooO0o.OooO00o(this, i2));
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    headerLayout.OooOo0();
                    return;
                }
                headerLayout.OooOo0o();
                int i3 = oO00O0o.color_111;
                Object obj2 = ContextCompat.f5271OooO00o;
                o0000O0O.OooO0o0(this, ContextCompat.OooO0o.OooO00o(this, i3));
                return;
            }
            headerLayout.setNavigationIcon(oOo00OO0.btn_return);
            App app = App.f22702OooO0o;
            int i4 = oO00Oo00.ToolbarTitleTextAppearance;
            headerLayout.f3137OooOOOO = i4;
            AppCompatTextView appCompatTextView = headerLayout.f3129OooO0o0;
            if (appCompatTextView != null) {
                appCompatTextView.setTextAppearance(app, i4);
            }
            headerLayout.setBackgroundColor(o0000.OooO00o(oO00O0o.color_3b3b3b));
            headerLayout.f30473OoooOOo.setTextColor(o0000.OooO00o(oO00O0o.selector_toolbar_menu_text));
            int i5 = oO00O0o.color_161616;
            Object obj3 = ContextCompat.f5271OooO00o;
            o0000O0O.OooO0o(this, ContextCompat.OooO0o.OooO00o(this, i5), true);
        }
    }

    public final void OooOOoo(int i) {
        OooOo00(o0000.OooO0OO(i));
    }

    public final void OooOo00(@Nullable String str) {
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout == null) {
            return;
        }
        headerLayout.setTitle(str);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public final Resources getResources() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            AutoSizeCompat.autoConvertDensityOfGlobal(super.getResources());
        }
        return super.getResources();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22754OooO0oo.onClick(view);
    }

    @Override // p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        OooOOo();
        OooOo.OooO0Oo(this);
        this.f22752OooO0o.f44424OooO0Oo = this;
        ((ComposeView) this.f22759OooOOO0.getValue()).setContent(ComposableLambdaKt.composableLambdaInstance(1205661657, true, new p399o0Oo0O0O.Oooo000(this)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OooOo.OooO0o0(this);
        this.f22752OooO0o.f44425OooO0o0.f44420OooO00o.clear();
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    @Override // p418o0OoO000.Oooo000
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f22760OooOOOO = System.currentTimeMillis() - this.f22758OooOOO;
        this.f22757OooOO0o.setValue(Boolean.FALSE);
        this.f22753OooO0oO = false;
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver = this.f22751OooO;
        if (bluetoothBroadcastReceiver != null) {
            Intrinsics.checkNotNull(bluetoothBroadcastReceiver);
            try {
                Context context = bluetoothBroadcastReceiver.f32830OooO00o;
                if (context != null) {
                    context.unregisterReceiver(bluetoothBroadcastReceiver);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f22758OooOOO = System.currentTimeMillis();
        this.f22757OooOO0o.setValue(Boolean.TRUE);
        this.f22753OooO0oO = true;
        if (this.f22751OooO == null) {
            BluetoothBroadcastReceiver bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver(this);
            this.f22751OooO = bluetoothBroadcastReceiver;
            Intrinsics.checkNotNull(bluetoothBroadcastReceiver);
            bluetoothBroadcastReceiver.f32832OooO0OO = new o000oOoO(this);
            IntentFilter intentFilter = new IntentFilter();
            bluetoothBroadcastReceiver.f32831OooO0O0 = intentFilter;
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            bluetoothBroadcastReceiver.f32831OooO0O0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        }
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver2 = this.f22751OooO;
        Intrinsics.checkNotNull(bluetoothBroadcastReceiver2);
        Context context = bluetoothBroadcastReceiver2.f32830OooO00o;
        if (context != null) {
            try {
                if (bluetoothBroadcastReceiver2.f32831OooO0O0 == null) {
                    bluetoothBroadcastReceiver2.f32831OooO0O0 = new IntentFilter();
                }
                context.registerReceiver(bluetoothBroadcastReceiver2, bluetoothBroadcastReceiver2.f32831OooO0O0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        HeaderLayout headerLayout = (HeaderLayout) findViewById(oO00O0oO.headerLayout);
        this.f22755OooOO0 = headerLayout;
        if (headerLayout != null) {
            OooOO0o().OooOoO(headerLayout);
        }
    }

    @Override // p399o0Oo0O0O.o00O0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public final MutableState<Boolean> showDialog(@Nullable String str, @NotNull Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.f22752OooO0o.showDialog(str, content);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@Nullable View view) {
        super.setContentView(view);
        HeaderLayout headerLayout = (HeaderLayout) findViewById(oO00O0oO.headerLayout);
        this.f22755OooOO0 = headerLayout;
        if (headerLayout != null) {
            OooOO0o().OooOoO(headerLayout);
        }
    }
}
