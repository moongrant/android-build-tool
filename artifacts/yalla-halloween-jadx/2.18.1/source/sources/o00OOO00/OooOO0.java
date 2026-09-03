package o00OOO00;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import java.util.Objects;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 implements OooOO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Activity f31673Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooO0o f31674Oooo0oO = new OooO0o();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Window f31675Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Triple<o0O00OO<Boolean>, ComposeView, Boolean> f31676Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f31677Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> f31678Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Triple<? extends o0O00OO<Boolean>, ComposeView, Boolean> triple, String str, Function3<? super o0O00OO<Boolean>, ? super oOO00O, ? super Integer, Unit> function3, Window window) {
            super(2);
            this.f31676Oooo0o = triple;
            this.f31677Oooo0oO = str;
            this.f31678Oooo0oo = function3;
            this.f31675Oooo = window;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                if (!this.f31676Oooo0o.getFirst().getValue().booleanValue() && TextUtils.isEmpty(this.f31677Oooo0oO)) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final Window window = this.f31675Oooo;
                    final Triple<o0O00OO<Boolean>, ComposeView, Boolean> triple = this.f31676Oooo0o;
                    handler.postDelayed(new Runnable() { // from class: o00OOO00.OooO
                        @Override // java.lang.Runnable
                        public final void run() {
                            Window window2 = window;
                            Triple triple2 = triple;
                            Intrinsics.checkNotNullParameter(triple2, "$triple");
                            View decorView = window2.getDecorView();
                            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) decorView).removeView((View) triple2.getSecond());
                        }
                    }, 0L);
                }
                this.f31678Oooo0oo.invoke(this.f31676Oooo0o.getFirst(), ooo00o2, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OooO00o() {
        this.f31674Oooo0oO.f31672OooO00o.clear();
    }

    public final boolean OooO0O0(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!o0000Ooo.OooO00o(this.f31673Oooo0o)) {
            return false;
        }
        Activity activity = this.f31673Oooo0o;
        Intrinsics.checkNotNull(activity);
        Window window = activity.getWindow();
        OooO0o oooO0o = this.f31674Oooo0oO;
        View decorView = window.getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup decorView2 = (ViewGroup) decorView;
        Objects.requireNonNull(oooO0o);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(decorView2, "decorView");
        Triple<o0O00OO<Boolean>, ComposeView, Boolean> triple = oooO0o.f31672OooO00o.get(tag);
        if (triple == null) {
            return false;
        }
        oooO0o.f31672OooO00o.remove(tag);
        decorView2.removeView(triple.getSecond());
        return true;
    }

    @Override // o00OOO00.OooOO0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public final o0O00OO<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super o0O00OO<Boolean>, ? super oOO00O, ? super Integer, Unit> content) {
        Triple<o0O00OO<Boolean>, ComposeView, Boolean> triple;
        Intrinsics.checkNotNullParameter(content, "content");
        if (!o0000Ooo.OooO00o(this.f31673Oooo0o)) {
            return null;
        }
        Activity activity = this.f31673Oooo0o;
        Intrinsics.checkNotNull(activity);
        Window window = activity.getWindow();
        if (TextUtils.isEmpty(tag)) {
            OooO0o oooO0o = this.f31674Oooo0oO;
            Activity activity2 = this.f31673Oooo0o;
            Intrinsics.checkNotNull(activity2);
            View decorView = window.getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup decorView2 = (ViewGroup) decorView;
            Objects.requireNonNull(oooO0o);
            Intrinsics.checkNotNullParameter(activity2, "activity");
            Intrinsics.checkNotNullParameter(decorView2, "decorView");
            ComposeView composeView = new ComposeView(activity2, null, 0, 6, null);
            decorView2.addView(composeView);
            Boolean bool = Boolean.TRUE;
            triple = new Triple<>(o0OOO00.OooO0Oo(bool), composeView, bool);
        } else {
            OooO0o oooO0o2 = this.f31674Oooo0oO;
            Activity activity3 = this.f31673Oooo0o;
            Intrinsics.checkNotNull(activity3);
            View decorView3 = window.getDecorView();
            Intrinsics.checkNotNull(decorView3, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView3;
            Intrinsics.checkNotNull(tag);
            Objects.requireNonNull(oooO0o2);
            Intrinsics.checkNotNullParameter(activity3, "activity");
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(tag, "tag");
            if (oooO0o2.f31672OooO00o.containsKey(tag)) {
                Triple<o0O00OO<Boolean>, ComposeView, Boolean> triple2 = oooO0o2.f31672OooO00o.get(tag);
                Intrinsics.checkNotNull(triple2);
                Triple<o0O00OO<Boolean>, ComposeView, Boolean> triple3 = triple2;
                triple = new Triple<>(triple3.getFirst(), triple3.getSecond(), Boolean.FALSE);
                triple.getFirst().setValue(Boolean.TRUE);
            } else {
                Boolean bool2 = Boolean.TRUE;
                triple = new Triple<>(o0OOO00.OooO0Oo(bool2), new ComposeView(activity3, null, 0, 6, null), bool2);
                oooO0o2.f31672OooO00o.put(tag, triple);
                viewGroup.addView(triple.getSecond());
            }
        }
        if (triple.getThird().booleanValue()) {
            triple.getSecond().setContent(o00O0000.OooO0O0(386124085, true, new OooO00o(triple, tag, content, window)));
        }
        return triple.getFirst();
    }
}
