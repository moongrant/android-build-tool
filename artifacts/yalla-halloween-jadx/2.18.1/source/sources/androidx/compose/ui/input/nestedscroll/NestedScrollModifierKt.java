package androidx.compose.ui.input.nestedscroll;

import Oooo000.o00oO0o;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;
import p346o0OOO0o.OooOOO;
import p346o0OOO0o.OooOOOO;
import p346o0OOO0o.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollModifierKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f6084Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOOO f6085Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOOO oooOOOO, OooOOO oooOOO) {
            super(3);
            this.f6084Oooo0o = oooOOOO;
            this.f6085Oooo0oO = oooOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(410346167);
            ooo00o2.OooO0o0(773894976);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
            }
            ooo00o2.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
            ooo00o2.Oooo0o0();
            OooOOOO oooOOOO = this.f6084Oooo0o;
            ooo00o2.OooO0o0(100475938);
            if (oooOOOO == null) {
                ooo00o2.OooO0o0(-492369756);
                Object objOooO0o2 = ooo00o2.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = new OooOOOO();
                    ooo00o2.Oooo00o(objOooO0o2);
                }
                ooo00o2.Oooo0o0();
                oooOOOO = (OooOOOO) objOooO0o2;
            }
            ooo00o2.Oooo0o0();
            OooOOO oooOOO = this.f6085Oooo0oO;
            ooo00o2.OooO0o0(1618982084);
            boolean zOooo0oo = ooo00o2.Oooo0oo(oooOOO) | ooo00o2.Oooo0oo(oooOOOO) | ooo00o2.Oooo0oo(coroutineScope);
            Object objOooO0o3 = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o3 == c0323OooO00o) {
                oooOOOO.f38147OooO0O0 = coroutineScope;
                objOooO0o3 = new OooOo00(oooOOOO, oooOOO);
                ooo00o2.Oooo00o(objOooO0o3);
            }
            ooo00o2.Oooo0o0();
            OooOo00 oooOo00 = (OooOo00) objOooO0o3;
            ooo00o2.Oooo0o0();
            return oooOo00;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull OooOOO connection, @Nullable OooOOOO oooOOOO) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(oooOOOO, connection));
    }
}
