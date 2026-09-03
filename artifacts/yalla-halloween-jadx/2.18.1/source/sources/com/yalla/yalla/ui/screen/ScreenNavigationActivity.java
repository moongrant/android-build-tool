package com.yalla.yalla.ui.screen;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o000O0O0.o0000O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOo0.OooO0o;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000oo;
import p261o00ooOoO.u;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/screen/ScreenNavigationActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ScreenNavigationActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f24560Oooo0oo = new OooO00o();

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f24561Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f24562Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Bundle f24563Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, ScreenNavigationActivity screenNavigationActivity, Bundle bundle) {
            super(2);
            this.f24561Oooo0o = str;
            this.f24562Oooo0oO = screenNavigationActivity;
            this.f24563Oooo0oo = bundle;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0000oo.OooO00o(ooo00o2, 0);
                u.OooO00o(false, o00O0000.OooO00o(ooo00o2, -344805032, new OooO0OO(this.f24561Oooo0o, this.f24562Oooo0oO, this.f24563Oooo0oo)), ooo00o2, 48, 1);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_activity_close_enter, R.anim.anim_activity_close_exit);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.anim_activity_open_enter, R.anim.anim_activity_open_exit);
        o0000O00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(0);
        String stringExtra = getIntent().getStringExtra("screen");
        if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
            finish();
        } else {
            OooO0o.OooO00o(this, o00O0000.OooO0O0(-469994245, true, new OooO0O0(stringExtra, this, getIntent().getBundleExtra("compose_params"))));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o000O o000o = o000O.f46945OooO00o;
        Intrinsics.checkNotNullParameter(this, "activity");
        o000O.f46946OooO0O0.remove(this);
    }
}
