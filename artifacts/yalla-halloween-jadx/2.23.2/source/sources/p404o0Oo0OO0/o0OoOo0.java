package p404o0Oo0OO0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.OooO0OO;
import java.util.HashMap;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p386o0OOooO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Activity f43664OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Oooo000 f43665OooO0o0 = new Oooo000();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Triple<MutableState<Boolean>, ComposeView, Boolean> f43666OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Window f43667OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f43668OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function3<MutableState<Boolean>, Composer, Integer, Unit> f43669OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Triple<? extends MutableState<Boolean>, ComposeView, Boolean> triple, String str, Window window, Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f43666OooO0Oo = triple;
            this.f43668OooO0o0 = str;
            this.f43667OooO0o = window;
            this.f43669OooO0oO = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(396755257, iIntValue, -1, "com.yalla.yalla.base.activity.ComposeDialogProxy.showDialog.<anonymous> (ComposeDialogProxy.kt:44)");
                }
                final Triple<MutableState<Boolean>, ComposeView, Boolean> triple = this.f43666OooO0Oo;
                if (!triple.getFirst().getValue().booleanValue() && TextUtils.isEmpty(this.f43668OooO0o0)) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final Window window = this.f43667OooO0o;
                    handler.postDelayed(new Runnable() { // from class: o0Oo0OO0.Oooo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Triple triple2 = triple;
                            Intrinsics.checkNotNullParameter(triple2, "$triple");
                            View decorView = window.getDecorView();
                            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) decorView).removeView((View) triple2.getSecond());
                        }
                    }, 0L);
                }
                o0000oo.OooO00o(o0OOO0o.OooO00o(composer2, 8), ComposableLambdaKt.composableLambda(composer2, 1777301820, true, new o000oOoO(this.f43669OooO0oO, triple)), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean OooO00o(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!OooO0OO.OooO00o(this.f43664OooO0Oo)) {
            return false;
        }
        Activity activity = this.f43664OooO0Oo;
        Intrinsics.checkNotNull(activity);
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup decorView2 = (ViewGroup) decorView;
        Oooo000 oooo000 = this.f43665OooO0o0;
        oooo000.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(decorView2, "decorView");
        HashMap<String, Triple<MutableState<Boolean>, ComposeView, Boolean>> map = oooo000.f43661OooO00o;
        Triple<MutableState<Boolean>, ComposeView, Boolean> triple = map.get(tag);
        if (triple == null) {
            return false;
        }
        map.remove(tag);
        decorView2.removeView(triple.getSecond());
        return true;
    }

    @Override // p404o0Oo0OO0.o00O0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public final MutableState<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super MutableState<Boolean>, ? super Composer, ? super Integer, Unit> content) {
        Triple<MutableState<Boolean>, ComposeView, Boolean> triple;
        Intrinsics.checkNotNullParameter(content, "content");
        if (!OooO0OO.OooO00o(this.f43664OooO0Oo)) {
            return null;
        }
        Activity activity = this.f43664OooO0Oo;
        Intrinsics.checkNotNull(activity);
        Window window = activity.getWindow();
        boolean zIsEmpty = TextUtils.isEmpty(tag);
        Oooo000 oooo000 = this.f43665OooO0o0;
        if (zIsEmpty) {
            Activity activity2 = this.f43664OooO0Oo;
            Intrinsics.checkNotNull(activity2);
            View decorView = window.getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup decorView2 = (ViewGroup) decorView;
            oooo000.getClass();
            Intrinsics.checkNotNullParameter(activity2, "activity");
            Intrinsics.checkNotNullParameter(decorView2, "decorView");
            ComposeView composeView = new ComposeView(activity2, null, 0, 6, null);
            decorView2.addView(composeView);
            Boolean bool = Boolean.TRUE;
            triple = new Triple<>(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null), composeView, bool);
        } else {
            Activity activity3 = this.f43664OooO0Oo;
            Intrinsics.checkNotNull(activity3);
            View decorView3 = window.getDecorView();
            Intrinsics.checkNotNull(decorView3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView3;
            Intrinsics.checkNotNull(tag);
            oooo000.getClass();
            Intrinsics.checkNotNullParameter(activity3, "activity");
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(tag, "tag");
            HashMap<String, Triple<MutableState<Boolean>, ComposeView, Boolean>> map = oooo000.f43661OooO00o;
            if (map.containsKey(tag)) {
                Triple<MutableState<Boolean>, ComposeView, Boolean> triple2 = map.get(tag);
                Intrinsics.checkNotNull(triple2);
                Triple<MutableState<Boolean>, ComposeView, Boolean> triple3 = triple2;
                triple = new Triple<>(triple3.getFirst(), triple3.getSecond(), Boolean.FALSE);
                triple.getFirst().setValue(Boolean.TRUE);
            } else {
                Boolean bool2 = Boolean.TRUE;
                Triple<MutableState<Boolean>, ComposeView, Boolean> triple4 = new Triple<>(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null), new ComposeView(activity3, null, 0, 6, null), bool2);
                map.put(tag, triple4);
                viewGroup.addView(triple4.getSecond());
                triple = triple4;
            }
        }
        if (triple.getThird().booleanValue()) {
            o0000oo.OooO0Oo(triple.getSecond(), ComposableLambdaKt.composableLambdaInstance(396755257, true, new OooO00o(triple, tag, window, content)));
        }
        return triple.getFirst();
    }
}
