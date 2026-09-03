package p470o0Oooo0;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import o000O0O0.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p478o0OooooO.oO0o0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f40614OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f40615OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40616OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f40617OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f40618OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f40619OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Activity f40620OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o00 o00Var = o00.this;
            if (o00Var.f40615OooO0O0) {
                if (iIntValue > o00Var.f40616OooO0OO) {
                    if (iIntValue != o00Var.f40618OooO0o) {
                        o00Var.f40618OooO0o = iIntValue;
                        Activity context = o00Var.f40620OooO0oO;
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (o00oOoo.f40633OooO00o != iIntValue && iIntValue >= 0) {
                            o00oOoo.f40633OooO00o = iIntValue;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("save keyboard: %d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                            Log.d("KeyBordUtil", str);
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (o0O0ooO.f40634OooO00o == null) {
                                synchronized (o0O0ooO.class) {
                                    if (o0O0ooO.f40634OooO00o == null) {
                                        o0O0ooO.f40634OooO00o = context.getSharedPreferences("keyboard.common", 0);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            SharedPreferences sharedPreferences = o0O0ooO.f40634OooO00o;
                            Intrinsics.checkNotNull(sharedPreferences);
                            sharedPreferences.edit().putInt("sp.key.keyboard.height", iIntValue).apply();
                        }
                        Function1<? super Integer, Unit> function1 = o00Var.f40617OooO0Oo;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(o00Var.f40618OooO0o));
                        }
                    }
                    if (!o00Var.f40614OooO00o) {
                        o00Var.f40614OooO00o = true;
                        Function2<? super Boolean, ? super Integer, Unit> function2 = o00Var.f40619OooO0o0;
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, Integer.valueOf(o00Var.f40618OooO0o));
                        }
                    }
                } else if (o00Var.f40614OooO00o) {
                    o00Var.f40614OooO00o = false;
                    Function2<? super Boolean, ? super Integer, Unit> function3 = o00Var.f40619OooO0o0;
                    if (function3 != null) {
                        function3.invoke(Boolean.FALSE, Integer.valueOf(o00Var.f40618OooO0o));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o00(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40620OooO0oO = activity;
        this.f40615OooO0O0 = true;
        this.f40616OooO0OO = 240;
        this.f40618OooO0o = o00oOoo.OooO00o(activity);
        Window addInsetListener = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(addInsetListener, "activity.window");
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(addInsetListener, "$this$addInsetListener");
        View decorView = addInsetListener.getDecorView();
        Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = new View(addInsetListener.getContext());
        oO0o0o oo0o0o = new oO0o0o(null, oooO00o);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(view, oo0o0o);
        ((ViewGroup) decorView).addView(view, 0, new ViewGroup.LayoutParams(0, 0));
    }
}
