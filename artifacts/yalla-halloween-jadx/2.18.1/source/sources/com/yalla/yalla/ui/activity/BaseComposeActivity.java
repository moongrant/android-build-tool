package com.yalla.yalla.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o000O0O0.o0000O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOo0.OooO0o;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p261o00ooOoO.u;
import p502o0o00o0.o0000O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "直接使用Screen")
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseComposeActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public abstract class BaseComposeActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f21689Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f21688Oooo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Lazy f21690OoooO00 = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BaseComposeActivity.this.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O invoke() {
            return new o0000O(BaseComposeActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                u.OooO00o(false, o00O0000.OooO00o(ooo00o2, -2116732229, new com.yalla.yalla.ui.activity.OooO00o(BaseComposeActivity.this)), ooo00o2, 48, 1);
            }
            return Unit.INSTANCE;
        }
    }

    @Composable
    public abstract void OooOOo0(@Nullable oOO00O ooo00o, int i);

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o0000O00.OooO00o(getWindow(), false);
        getWindow().setSoftInputMode(16);
        getWindow().setStatusBarColor(Color.argb(0, 0, 0, 0));
        OooO0o.OooO00o(this, o00O0000.OooO0O0(-297643682, true, new OooO0OO()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f21688Oooo.setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f21688Oooo.setValue(Boolean.TRUE);
    }
}
