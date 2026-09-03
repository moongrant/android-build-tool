package p367o0OOo0o0;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f43959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f43960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f43961OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f43962OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function2<? super Boolean, ? super Integer, Unit> f43963OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f43964OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f43965OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            OooOO0 oooOO1 = OooOO0.this;
            if (oooOO1.f43961OooO0OO) {
                if (iIntValue > oooOO1.f43962OooO0Oo) {
                    if (iIntValue != oooOO1.f43965OooO0oO) {
                        oooOO1.f43965OooO0oO = iIntValue;
                        Activity context = oooOO1.f43959OooO00o;
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (OooOo.f43976OooO00o != iIntValue && iIntValue >= 0) {
                            OooOo.f43976OooO00o = iIntValue;
                            OooOo00.f43977OooO00o.getClass();
                            Intrinsics.checkNotNullParameter(context, "context");
                            SharedPreferences sharedPreferencesOooO0O0 = OooOo00.OooO0O0(context);
                            Intrinsics.checkNotNull(sharedPreferencesOooO0O0);
                            sharedPreferencesOooO0O0.edit().putInt(OooOo00.f43979OooO0OO, iIntValue).apply();
                        }
                        Function1<? super Integer, Unit> function1 = oooOO1.f43964OooO0o0;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(oooOO1.f43965OooO0oO));
                        }
                    }
                    if (!oooOO1.f43960OooO0O0) {
                        oooOO1.f43960OooO0O0 = true;
                        Function2<? super Boolean, ? super Integer, Unit> function2 = oooOO1.f43963OooO0o;
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, Integer.valueOf(oooOO1.f43965OooO0oO));
                        }
                    }
                } else if (oooOO1.f43960OooO0O0) {
                    oooOO1.f43960OooO0O0 = false;
                    Function2<? super Boolean, ? super Integer, Unit> function3 = oooOO1.f43963OooO0o;
                    if (function3 != null) {
                        function3.invoke(Boolean.FALSE, Integer.valueOf(oooOO1.f43965OooO0oO));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OooOO0(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        this.f43959OooO00o = context;
        this.f43961OooO0OO = true;
        this.f43962OooO0Oo = 240;
        Intrinsics.checkNotNullParameter(context, "context");
        if (OooOo.f43976OooO00o == 0) {
            OooOo00 oooOo00 = OooOo00.f43977OooO00o;
            int i = (int) ((Resources.getSystem().getDisplayMetrics().density * 300.0f) + 0.5f);
            oooOo00.getClass();
            OooOo.f43976OooO00o = OooOo00.OooO00o(i, context);
        }
        this.f43965OooO0oO = OooOo.f43976OooO00o;
        context.getWindow();
        Window addInsetListener = context.getWindow();
        Intrinsics.checkNotNullExpressionValue(addInsetListener, "activity.window");
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(addInsetListener, "$this$addInsetListener");
        View decorView = addInsetListener.getDecorView();
        if (decorView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        View view = new View(addInsetListener.getContext());
        p370o0OOoO.OooOO0 oooOO1 = new p370o0OOoO.OooOO0(null, oooO00o);
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(view, oooOO1);
        ((ViewGroup) decorView).addView(view, 0, new ViewGroup.LayoutParams(0, 0));
    }
}
