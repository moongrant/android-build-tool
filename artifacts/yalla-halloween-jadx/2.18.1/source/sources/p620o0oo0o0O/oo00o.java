package p620o0oo0o0O;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f48621OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final oOO00O f48622OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Class<?> f48623OooO0O0;

    public static final class OooO00o {
        @NotNull
        public final oo00o OooO00o(@Nullable FragmentActivity fragmentActivity) {
            return new oo00o(fragmentActivity);
        }
    }

    public oo00o(FragmentActivity fragmentActivity) {
        Objects.requireNonNull(fragmentActivity, "Surprise , something is error , perhaps this is love");
        oOO00O ooo00o = (oOO00O) fragmentActivity.getSupportFragmentManager().Oooo00O("oo00o");
        if (ooo00o == null) {
            ooo00o = new oOO00O();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
            oooO00o.OooO0Oo(0, ooo00o, "oo00o", 1);
            oooO00o.OooO0oo();
            supportFragmentManager.OooOooO();
        }
        this.f48622OooO00o = ooo00o;
    }

    public final void OooO00o(@Nullable Function2<? super Integer, ? super Intent, Unit> function2) {
        oOO00O ooo00o = this.f48622OooO00o;
        Objects.requireNonNull(ooo00o, "From activity is null , forget from() ?");
        FragmentActivity activity = ooo00o.getActivity();
        Objects.requireNonNull(activity, "Surprise , something is error , perhaps this is love");
        Intent intent = new Intent();
        Class<?> cls = this.f48623OooO0O0;
        if (cls != null) {
            Intrinsics.checkNotNull(cls);
            intent.setClass(activity, cls);
        }
        int iRandom = (int) (((Math.random() * ((double) 9)) + ((double) 1)) * ((double) 1000));
        oOO00O ooo00o2 = this.f48622OooO00o;
        ooo00o2.f48620Oooo0o.put(iRandom, function2);
        ooo00o2.startActivityForResult(intent, iRandom);
    }
}
