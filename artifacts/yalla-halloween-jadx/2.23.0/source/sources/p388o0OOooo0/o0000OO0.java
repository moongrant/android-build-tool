package p388o0OOooo0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.code.android.util.o0ooOOo;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import java.util.Stack;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import o000O00.o00000O;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p188o00o0O.OooOO0;
import p526o0o0OOO0.oo0oOO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44384OooO0Oo;

    public static final class OooO00o implements o0ooOOo {
        @Override // com.code.android.util.o0ooOOo
        public final boolean OooO00o() {
            return OooO.OooO0o0();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Activity, String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f44385OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Activity activity) {
            Activity activity2 = activity;
            if (activity2 != null && (activity2 instanceof ScreenNavigationActivity)) {
                OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
                String strOooO0OO = oo0oOO0.OooO0OO((ScreenNavigationActivity) activity2);
                if (strOooO0OO != null) {
                    return StringsKt__StringsKt.substringAfterLast$default(strOooO0OO, ".", (String) null, 2, (Object) null);
                }
            } else if (activity2 != null) {
                return activity2.getClass().getSimpleName();
            }
            return null;
        }
    }

    public o0000OO0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44384OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0OO() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = o000O0.f10354OooO00o;
        Context applicationContext = this.f44384OooO0Oo.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        OooO00o ltrCheckListener = new OooO00o();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(ltrCheckListener, "ltrCheckListener");
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        o000O0.f10354OooO00o = applicationContext;
        o000O0.f10356OooO0OO = ltrCheckListener;
        Stack<Activity> stack = com.code.android.util.OooO0O0.f10254OooO00o;
        Context context2 = o000O0.OooO00o();
        Intrinsics.checkNotNullParameter(context2, "context");
        ((Application) context2).registerActivityLifecycleCallbacks(new com.code.android.util.OooO00o());
        com.code.android.util.OooO0O0.f10258OooO0o = OooO0O0.f44385OooO0Oo;
    }
}
