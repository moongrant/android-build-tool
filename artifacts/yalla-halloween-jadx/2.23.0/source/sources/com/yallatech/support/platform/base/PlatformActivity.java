package com.yallatech.support.platform.base;

import OooO.OooO0OO;
import OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOo0.o0ooOOo;
import OooO0o.OooO00o;
import OooOOOO.OooOOOO;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.share.internal.ShareConstants;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.share.bean.ShareResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006OooOO0o.OooOO0O;
import p604o0oo0OO.o000000;
import p604o0oo0OO.o000000O;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yallatech/support/platform/base/PlatformActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlatformActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Fragment f32930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f32931OooO0o0 = "PlatformFragment";

    public final void OooOOO0(FragmentManager fragmentManager, OooO00o oooO00o) {
        androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o2, "fm.beginTransaction()");
        oooO00o2.OooO0OO(o000000.frameAuthRoot, oooO00o, this.f32931OooO0o0, 1);
        oooO00o2.OooO0o();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f32930OooO0o;
        if (fragment == null) {
            return;
        }
        fragment.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment fragment = this.f32930OooO0o;
        boolean z = false;
        if (fragment instanceof OooOO0O) {
            if (fragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.login.ui.AuthFragment");
            }
            WebBrowser webBrowser = ((OooOO0O) fragment).f117OooO0o0;
            if (webBrowser != null && webBrowser.onBackPressed()) {
                return;
            }
        }
        Fragment fragment2 = this.f32930OooO0o;
        if (fragment2 instanceof o0ooOOo) {
            if (fragment2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.share.ShareFragment");
            }
            o0ooOOo o0ooooo = (o0ooOOo) fragment2;
            WebBrowser webBrowser2 = o0ooooo.f117OooO0o0;
            if (webBrowser2 != null && webBrowser2.onBackPressed()) {
                z = true;
            } else {
                OooOOOO oooOOOO = o0ooooo.f81OooO0o;
                if (oooOOOO != null && oooOOOO.f198OooO) {
                    o0ooooo.OooO0O0(ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -1, null, 2, null));
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o000000O.base_platform_activity_auth);
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentOooOoo = supportFragmentManager.OooOoo(this.f32931OooO0o0);
        this.f32930OooO0o = fragmentOooOoo;
        if (fragmentOooOoo == null) {
            int intExtra = intent.getIntExtra("yalla_buddle_type", 0);
            if (intExtra == 1) {
                OooOO0O oooOO0O = new OooOO0O();
                OooOOO0(supportFragmentManager, oooOO0O);
                this.f32930OooO0o = oooOO0O;
                return;
            }
            if (intExtra == 2) {
                o0ooOOo o0ooooo = new o0ooOOo();
                OooOOO0(supportFragmentManager, o0ooooo);
                this.f32930OooO0o = o0ooooo;
                return;
            }
            if (intExtra == 3) {
                OooO0OO oooO0OO = new OooO0OO();
                OooOOO0(supportFragmentManager, oooO0OO);
                this.f32930OooO0o = oooO0OO;
            } else if (intExtra == 4) {
                OooOO0.OooO0OO oooO0OO2 = new OooOO0.OooO0OO();
                OooOOO0(supportFragmentManager, oooO0OO2);
                this.f32930OooO0o = oooO0OO2;
            } else {
                if (intExtra != 5) {
                    finish();
                    return;
                }
                p002OooO0Oo.OooOOOO oooOOOO = new p002OooO0Oo.OooOOOO();
                OooOOO0(supportFragmentManager, oooOOOO);
                this.f32930OooO0o = oooOOOO;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Intrinsics.checkNotNullParameter("Platform Activity onPause", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, "Platform Activity onPause");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        Fragment fragment = this.f32930OooO0o;
        if (fragment == null) {
            return;
        }
        fragment.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Platform Activity onResume", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, "Platform Activity onResume");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Intrinsics.checkNotNullParameter("Platform Activity onStop", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, "Platform Activity onStop");
        }
    }
}
