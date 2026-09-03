package p044OooooOO;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O {
    @Composable
    @NotNull
    public static final oO0Oo OooO00o(@NotNull LiveData liveData, Object obj, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        ooo00o.OooO0o0(411178300);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00o.OooOO0o(o0O0O00.f6593OooO0Oo);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o0OOO00.OooO0Oo(obj);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        o00Oo00.OooO00o(liveData, lifecycleOwner, new o00O00(liveData, lifecycleOwner, o0o00oo2), ooo00o);
        ooo00o.Oooo0o0();
        return o0o00oo2;
    }

    @Composable
    @NotNull
    public static final oO0Oo OooO0O0(@NotNull LiveData liveData, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        ooo00o.OooO0o0(-2027206144);
        oO0Oo oo0ooOooO00o = OooO00o(liveData, liveData.getValue(), ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO00o;
    }
}
