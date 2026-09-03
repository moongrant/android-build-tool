package com.app.base.base.activity;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.application.App;
import com.app.base.bluetooth.BluetoothBroadcastReceiver;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.autosize.AutoSizeCompat;
import o00OOO00.OooO0O0;
import o00OOO00.OooO0OO;
import o00OOO00.OooOO0;
import o00OOO00.OooOO0O;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p043OooooO0.o00O0000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p140o00OOOoO.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OOo0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0017J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0017J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/app/base/base/activity/BaseFragmentActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "Lo00OOOoO/OooO0o;", "Lo00Oo00/OooO00o;", "Landroid/view/View$OnClickListener;", "Lo00OOO00/OooOO0O;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "setContentView", "Lo00OOOoO/OooO0OO;", "msg", "onEvent", "onEventMainThread", "onClick", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class BaseFragmentActivity extends BaseAppCompatActivity implements OooO0o, o00Oo00.OooO00o, View.OnClickListener, OooOO0O {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f11460OoooOOo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f11461Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public HeaderLayout f11463OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public BluetoothBroadcastReceiver f11464OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f11466OoooO0O;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f11468OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f11469o000oOoO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f11462Oooo0oo = new OooOO0();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final OooO00o f11465OoooO00 = new OooO00o();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f11467OoooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            BaseFragmentActivity.this.onClickNotDouble(view);
        }
    }

    @NotNull
    public final View OooOOo(int i) {
        OooO00o oooO00o = this.f11465OoooO00;
        View viewFindViewById = findViewById(i);
        p148o00Oo0O.o00Oo0.OooO0O0(viewFindViewById, oooO00o);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewClick(activity, id, noDoubleClickListener)");
        return viewFindViewById;
    }

    public void OooOOo0() {
        finish();
        startActivity(getIntent());
    }

    public void OooOOoo() {
        MobclickAgent.onPageEnd(getClass().getName());
    }

    public final void OooOo(int i) {
        OooOoO0(o000O0O0.OooO0OO(i));
    }

    public boolean OooOo0() {
        return !(this instanceof MixedRoomActivity);
    }

    public void OooOo00() {
        MobclickAgent.onPageStart(getClass().getName());
    }

    public final void OooOo0O(int i) {
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            if (i == 1) {
                headerLayout.setNavigationIcon(R.drawable.btn_return_black);
                headerLayout.OooOo0O(App.f11458Oooo0oO, R.style.ToolbarTitleTextAppearanceBlack);
                headerLayout.setBackgroundColor(OooOOO.OooO00o(R.color.color_white));
                headerLayout.f12044o000000.setTextColor(OooOOO.OooO00o(R.color.color_alpha_87));
                o000OOo0.OooO0o0(this, o000O000.OooO00o.OooO0O0(this, R.color.white));
                return;
            }
            if (i == 2) {
                headerLayout.setNavigationIcon(R.drawable.btn_return);
                headerLayout.OooOo0O(App.f11458Oooo0oO, R.style.ToolbarTitleTextAppearance);
                headerLayout.setBackgroundColor(OooOOO.OooO00o(R.color.color_3b3b3b));
                headerLayout.f12044o000000.setTextColor(OooOOO.OooO00o(R.color.selector_toolbar_menu_text));
                o000OOo0.OooO0Oo(this, o000O000.OooO00o.OooO0O0(this, R.color.color_161616));
                return;
            }
            if (i != 3) {
                headerLayout.OooOoO();
                return;
            }
            headerLayout.setNavigationIcon(R.drawable.btn_return);
            headerLayout.OooOo0O(App.f11458Oooo0oO, R.style.ToolbarTitleTextAppearance);
            headerLayout.setBackgroundColor(OooOOO.OooO00o(R.color.transparent));
            headerLayout.f12044o000000.setTextColor(OooOOO.OooO00o(R.color.selector_toolbar_menu_text));
            o000OOo0.OooO0o0(this, o000O000.OooO00o.OooO0O0(this, R.color.color_111));
        }
    }

    public void OooOo0o() {
        setRequestedOrientation(1);
    }

    public final void OooOoO0(@Nullable String str) {
        HeaderLayout headerLayout = this.f11463OoooO;
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
        this.f11465OoooO00.onClick(view);
    }

    @Override // o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        OooOo0o();
        o0Oo0oo.OooO0oo(this);
        LiveEventBus.get("RECREATE").observe(this, new o00OOO00.OooO00o(this, 0));
        this.f11462Oooo0oo.f31673Oooo0o = this;
        if (OooOo0()) {
            View decorView = getWindow().getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ComposeView composeView = new ComposeView(this, null, 0, 6, null);
            ((ViewGroup) decorView).addView(composeView, new FrameLayout.LayoutParams(-1, -1));
            composeView.setContent(o00O0000.OooO0O0(807029134, true, new OooO0OO(this)));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o0Oo0oo.OooO(this);
        this.f11462Oooo0oo.OooO00o();
    }

    @Override // p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
    }

    @Override // p140o00OOOoO.OooO0o
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
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
        this.f11468OoooOOO = System.currentTimeMillis() - this.f11469o000oOoO;
        this.f11467OoooOO0.setValue(Boolean.FALSE);
        this.f11461Oooo = false;
        OooOOoo();
        MobclickAgent.onPause(this);
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver = this.f11464OoooO0;
        if (bluetoothBroadcastReceiver != null) {
            Intrinsics.checkNotNull(bluetoothBroadcastReceiver);
            try {
                Context context = bluetoothBroadcastReceiver.f11475OooO00o;
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
        this.f11469o000oOoO = System.currentTimeMillis();
        if (this.f11466OoooO0O) {
            OooOOo0();
            return;
        }
        this.f11467OoooOO0.setValue(Boolean.TRUE);
        this.f11461Oooo = true;
        OooOo00();
        MobclickAgent.onResume(this);
        if (this.f11464OoooO0 == null) {
            BluetoothBroadcastReceiver bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver(this);
            this.f11464OoooO0 = bluetoothBroadcastReceiver;
            Intrinsics.checkNotNull(bluetoothBroadcastReceiver);
            bluetoothBroadcastReceiver.f11477OooO0OO = new OooO0O0(this, 0);
            IntentFilter intentFilter = new IntentFilter();
            bluetoothBroadcastReceiver.f11476OooO0O0 = intentFilter;
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            bluetoothBroadcastReceiver.f11476OooO0O0.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        }
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver2 = this.f11464OoooO0;
        Intrinsics.checkNotNull(bluetoothBroadcastReceiver2);
        Objects.requireNonNull(bluetoothBroadcastReceiver2);
        try {
            if (bluetoothBroadcastReceiver2.f11475OooO00o != null) {
                if (bluetoothBroadcastReceiver2.f11476OooO0O0 == null) {
                    bluetoothBroadcastReceiver2.f11476OooO0O0 = new IntentFilter();
                }
                bluetoothBroadcastReceiver2.f11475OooO00o.registerReceiver(bluetoothBroadcastReceiver2, bluetoothBroadcastReceiver2.f11476OooO0O0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        HeaderLayout headerLayout = (HeaderLayout) findViewById(R.id.headerLayout);
        this.f11463OoooO = headerLayout;
        if (headerLayout != null) {
            OooOOO(headerLayout);
        }
    }

    @Override // o00OOO00.OooOO0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public final o0O00OO<Boolean> showDialog(@Nullable String str, @NotNull Function3<? super o0O00OO<Boolean>, ? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.f11462Oooo0oo.showDialog(str, content);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@Nullable View view) {
        super.setContentView(view);
        HeaderLayout headerLayout = (HeaderLayout) findViewById(R.id.headerLayout);
        this.f11463OoooO = headerLayout;
        if (headerLayout != null) {
            OooOOO(headerLayout);
        }
    }
}
