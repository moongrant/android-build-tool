package p371o0OOo0oO;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p379o0OOoOOO.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f43172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43173OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f43174OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f43175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f43177OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f43178OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            if (o0oooo1.f43174OooO0OO) {
                if (iIntValue > o0oooo1.f43175OooO0Oo) {
                    if (iIntValue != o0oooo1.f43178OooO0oO) {
                        o0oooo1.f43178OooO0oO = iIntValue;
                        Activity context = o0oooo1.f43172OooO00o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (o0ooOOo.f43180OooO00o != iIntValue && iIntValue >= 0) {
                            o0ooOOo.f43180OooO00o = iIntValue;
                            o00oO0o.f43168OooO00o.getClass();
                            Intrinsics.checkNotNullParameter(context, "context");
                            SharedPreferences sharedPreferencesOooO0O0 = o00oO0o.OooO0O0(context);
                            Intrinsics.checkNotNull(sharedPreferencesOooO0O0);
                            sharedPreferencesOooO0O0.edit().putInt(o00oO0o.f43170OooO0OO, iIntValue).apply();
                        }
                        Function1<? super Integer, Unit> function1 = o0oooo1.f43177OooO0o0;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(o0oooo1.f43178OooO0oO));
                        }
                    }
                    if (!o0oooo1.f43173OooO0O0) {
                        o0oooo1.f43173OooO0O0 = true;
                        Function2<? super Boolean, ? super Integer, Unit> function2 = o0oooo1.f43176OooO0o;
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, Integer.valueOf(o0oooo1.f43178OooO0oO));
                        }
                    }
                } else if (o0oooo1.f43173OooO0O0) {
                    o0oooo1.f43173OooO0O0 = false;
                    Function2<? super Boolean, ? super Integer, Unit> function3 = o0oooo1.f43176OooO0o;
                    if (function3 != null) {
                        function3.invoke(Boolean.FALSE, Integer.valueOf(o0oooo1.f43178OooO0oO));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o0OoOo0(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        this.f43172OooO00o = context;
        this.f43174OooO0OO = true;
        this.f43175OooO0Oo = 240;
        Intrinsics.checkNotNullParameter(context, "context");
        if (o0ooOOo.f43180OooO00o == 0) {
            o00oO0o o00oo0o2 = o00oO0o.f43168OooO00o;
            int i = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
            o00oo0o2.getClass();
            o0ooOOo.f43180OooO00o = o00oO0o.OooO00o(i, context);
        }
        this.f43178OooO0oO = o0ooOOo.f43180OooO00o;
        context.getWindow();
        Window addInsetListener = context.getWindow();
        Intrinsics.checkNotNullExpressionValue(addInsetListener, "getWindow(...)");
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(addInsetListener, "$this$addInsetListener");
        View decorView = addInsetListener.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        View view = new View(addInsetListener.getContext());
        o00O00 o00o01 = new o00O00(null, oooO00o);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(view, o00o01);
        ((ViewGroup) decorView).addView(view, 0, new ViewGroup.LayoutParams(0, 0));
    }
}
