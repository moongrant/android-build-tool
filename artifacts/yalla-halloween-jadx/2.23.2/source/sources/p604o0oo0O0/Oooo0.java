package p604o0oo0O0;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f57391OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooOo00 f57392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Class<?> f57393OooO0O0;

    public Oooo0(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        OooOo00 oooOo00 = (OooOo00) fragmentActivity.getSupportFragmentManager().OooOoo("o0oo0O0.Oooo0");
        if (oooOo00 == null) {
            oooOo00 = new OooOo00();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0OO(0, oooOo00, "o0oo0O0.Oooo0", 1);
            oooO00o.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f57392OooO00o = oooOo00;
    }

    public final void OooO00o(@Nullable Function2<? super Integer, ? super Intent, Unit> function2) {
        OooOo00 oooOo00 = this.f57392OooO00o;
        if (oooOo00 == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        FragmentActivity activity = oooOo00.getActivity();
        if (activity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = new Intent();
        Class<?> cls = this.f57393OooO0O0;
        if (cls != null) {
            Intrinsics.checkNotNull(cls);
            intent.setClass(activity, cls);
        }
        int iRandom = (int) (((Math.random() * ((double) 9)) + ((double) 1)) * ((double) 1000));
        Intrinsics.checkNotNullParameter(intent, "intent");
        oooOo00.f57390OooO0Oo.put(iRandom, function2);
        oooOo00.startActivityForResult(intent, iRandom);
    }
}
