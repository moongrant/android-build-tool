package p396o0Oo00o0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o0ooOOo;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import java.util.Stack;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p191o00o0O0.o00Oo0;
import p532o0o0OOo0.o00O00;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43630OooO0Oo;

    public static final class OooO00o implements o0ooOOo {
        @Override // com.code.android.util.o0ooOOo
        public final boolean OooO00o() {
            return OooOo00.OooO0o0();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Activity, String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f43631OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Activity activity) {
            Activity activity2 = activity;
            if (activity2 != null && (activity2 instanceof ScreenNavigationActivity)) {
                OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
                String strOooO0OO = o00O00.OooO0OO((ScreenNavigationActivity) activity2);
                if (strOooO0OO != null) {
                    return StringsKt__StringsKt.substringAfterLast$default(strOooO0OO, ".", (String) null, 2, (Object) null);
                }
            } else if (activity2 != null) {
                return activity2.getClass().getSimpleName();
            }
            return null;
        }
    }

    public o000OOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43630OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0OO() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = o000O00O.f13421OooO00o;
        Context applicationContext = this.f43630OooO0Oo.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        OooO00o ltrCheckListener = new OooO00o();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(ltrCheckListener, "ltrCheckListener");
        Intrinsics.checkNotNullParameter(applicationContext, "<set-?>");
        o000O00O.f13421OooO00o = applicationContext;
        o000O00O.f13424OooO0Oo = ltrCheckListener;
        Stack<Activity> stack = com.code.android.util.OooO0O0.f13314OooO00o;
        Context context2 = o000O00O.OooO00o();
        Intrinsics.checkNotNullParameter(context2, "context");
        ((Application) context2).registerActivityLifecycleCallbacks(new com.code.android.util.OooO00o());
        com.code.android.util.OooO0O0.f13318OooO0o = OooO0O0.f43631OooO0Oo;
    }
}
