package com.yalla.yalla.ui.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.BaseAppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o000O00.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.Oooo0;
import p147o00Oo0Oo.o000OOo;
import p188o00o0O.OooOO0;
import p382o0OOoo0o.o0OoOo0;
import p526o0o0OOO0.o000OO00;
import p526o0o0OOO0.oOO00O;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/screen/ScreenNavigationActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScreenNavigationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenNavigationActivity.kt\ncom/yalla/yalla/ui/screen/ScreenNavigationActivity\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n81#2:138\n107#2,2:139\n1855#3,2:141\n*S KotlinDebug\n*F\n+ 1 ScreenNavigationActivity.kt\ncom/yalla/yalla/ui/screen/ScreenNavigationActivity\n*L\n50#1:138\n50#1:139,2\n122#1:141,2\n*E\n"})
public final class ScreenNavigationActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f29156OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f29157OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f29158OooO0oO = new ArrayList();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f29159OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f29160OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, ScreenNavigationActivity screenNavigationActivity) {
            super(2);
            this.f29159OooO0Oo = str;
            this.f29160OooO0o0 = screenNavigationActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-469994245, iIntValue, -1, "com.yalla.yalla.ui.screen.ScreenNavigationActivity.onCreate.<anonymous> (ScreenNavigationActivity.kt:62)");
                }
                DarkThemeKt.isSystemInDarkTheme(composer2, 0);
                o000OOo.OooO00o(o0OoOo0.OooO00o(composer2, 8), ComposableLambdaKt.composableLambda(composer2, -344805032, true, new OooO0o(this.f29159OooO0Oo, this.f29160OooO0o0)), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f29161OooO0Oo;

        public OooO0O0(oOO00O function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29161OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f29161OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f29161OooO0Oo;
        }

        public final int hashCode() {
            return this.f29161OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29161OooO0Oo.invoke(obj);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f29158OooO0oO.iterator();
        while (it.hasNext()) {
            ((o000OO00) it.next()).OooO00o(i, i2, intent);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o0OoOo0.f44303OooO0Oo.observe(this, new OooO0O0(new oOO00O(this)));
        androidx.core.view.o000OO00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(0);
        String stringExtra = getIntent().getStringExtra("screen");
        if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
            finish();
        } else {
            Oooo0.OooO00o(this, ComposableLambdaKt.composableLambdaInstance(-469994245, true, new OooO00o(stringExtra, this)));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
        Intrinsics.checkNotNullParameter(this, "activity");
        oo0oOO0.f53618OooO00o.remove(this);
    }
}
