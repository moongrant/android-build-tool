package p599o0oo00oo;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f56860OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0000O0O f56861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Class<?> f56862OooO0O0;

    public o0000OO0(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        o0000O0O o0000o0o2 = (o0000O0O) fragmentActivity.getSupportFragmentManager().OooOoo("o0oo00oo.o0000OO0");
        if (o0000o0o2 == null) {
            o0000o0o2 = new o0000O0O();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
            supportFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0OO(0, o0000o0o2, "o0oo00oo.o0000OO0", 1);
            oooO00o.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f56861OooO00o = o0000o0o2;
    }

    public final void OooO00o(@Nullable Function2<? super Integer, ? super Intent, Unit> function2) {
        o0000O0O o0000o0o2 = this.f56861OooO00o;
        if (o0000o0o2 == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        FragmentActivity activity = o0000o0o2.getActivity();
        if (activity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = new Intent();
        Class<?> cls = this.f56862OooO0O0;
        if (cls != null) {
            Intrinsics.checkNotNull(cls);
            intent.setClass(activity, cls);
        }
        int iRandom = (int) (((Math.random() * ((double) 9)) + ((double) 1)) * ((double) 1000));
        Intrinsics.checkNotNullParameter(intent, "intent");
        o0000o0o2.f56859OooO0Oo.put(iRandom, function2);
        o0000o0o2.startActivityForResult(intent, iRandom);
    }
}
