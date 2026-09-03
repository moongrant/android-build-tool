package com.yallatech.support.platform.base;

import OooO.OooO0OO;
import OooO00o.OooO00o.OooO00o.OooO00o.p002OooOOo0.o0ooOOo;
import OooOOO.OooOOOO;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.facebook.share.internal.ShareConstants;
import com.yallatech.support.platform.base.web.WebBrowser;
import com.yallatech.support.platform.share.bean.ShareResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006OooO0oo.o000000O;
import p625o0oo0oo.o000OO0O;
import p627o0oo0ooO.oO0O0O0o;
import p627o0oo0ooO.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yallatech/support/platform/base/PlatformActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlatformActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final String f26314Oooo0oO = "PlatformFragment";

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Fragment f26315Oooo0oo;

    public final Fragment OooOOOO(FragmentManager fragmentManager, Fragment fragment) {
        OooO00o oooO00o = new OooO00o(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "fm.beginTransaction()");
        oooO00o.OooO0Oo(oO0O0O0o.frameAuthRoot, fragment, this.f26314Oooo0oO, 1);
        oooO00o.OooO0oo();
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f26315Oooo0oo;
        if (fragment == null) {
            return;
        }
        fragment.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment fragment = this.f26315Oooo0oo;
        boolean z = false;
        if (fragment instanceof OooOO0O.OooO00o) {
            Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.yallatech.support.platform.login.ui.AuthFragment");
            WebBrowser webBrowser = ((OooOO0O.OooO00o) fragment).f135Oooo0oO;
            if (webBrowser != null && webBrowser.onBackPressed()) {
                return;
            }
        }
        Fragment fragment2 = this.f26315Oooo0oo;
        if (fragment2 instanceof o0ooOOo) {
            Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.yallatech.support.platform.share.ShareFragment");
            o0ooOOo o0ooooo2 = (o0ooOOo) fragment2;
            WebBrowser webBrowser2 = o0ooooo2.f135Oooo0oO;
            if (webBrowser2 != null && webBrowser2.onBackPressed()) {
                z = true;
            } else {
                OooOOOO oooOOOO = o0ooooo2.f61Oooo0oo;
                if (oooOOOO != null && oooOOOO.f174OooO) {
                    o0ooooo2.OooO00o(ShareResponse.Companion.createShareResponse$default(ShareResponse.INSTANCE, -1, null, 2, null));
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
        setContentView(oOo0oooO.base_platform_activity_auth);
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentOooo00O = supportFragmentManager.Oooo00O(this.f26314Oooo0oO);
        this.f26315Oooo0oo = fragmentOooo00O;
        if (fragmentOooo00O == null) {
            int intExtra = intent.getIntExtra("yalla_buddle_type", 0);
            if (intExtra == 1) {
                OooOO0O.OooO00o oooO00o = new OooOO0O.OooO00o();
                OooOOOO(supportFragmentManager, oooO00o);
                this.f26315Oooo0oo = oooO00o;
                return;
            }
            if (intExtra == 2) {
                o0ooOOo o0ooooo2 = new o0ooOOo();
                OooOOOO(supportFragmentManager, o0ooooo2);
                this.f26315Oooo0oo = o0ooooo2;
                return;
            }
            if (intExtra == 3) {
                o000000O o000000o2 = new o000000O();
                OooOOOO(supportFragmentManager, o000000o2);
                this.f26315Oooo0oo = o000000o2;
            } else if (intExtra == 4) {
                OooO0OO oooO0OO = new OooO0OO();
                OooOOOO(supportFragmentManager, oooO0OO);
                this.f26315Oooo0oo = oooO0OO;
            } else {
                if (intExtra != 5) {
                    finish();
                    return;
                }
                OooO0OO.OooO0OO oooO0OO2 = new OooO0OO.OooO0OO();
                OooOOOO(supportFragmentManager, oooO0OO2);
                this.f26315Oooo0oo = oooO0OO2;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Intrinsics.checkNotNullParameter("Platform Activity onPause", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, "Platform Activity onPause");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        Fragment fragment = this.f26315Oooo0oo;
        if (fragment == null) {
            return;
        }
        fragment.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Platform Activity onResume", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, "Platform Activity onResume");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Intrinsics.checkNotNullParameter("Platform Activity onStop", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, "Platform Activity onStop");
        }
    }
}
