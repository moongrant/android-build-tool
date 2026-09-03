package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f5844Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f5845Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f5846Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O0O0 f5847Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0 oooo0, OooOOO0 oooOOO0, o000O0O0 o000o0o1, int i) {
            super(2);
            this.f5845Oooo0o = oooo0;
            this.f5846Oooo0oO = oooOOO0;
            this.f5847Oooo0oo = o000o0o1;
            this.f5844Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OoOo0.OooO00o(this.f5845Oooo0o, this.f5846Oooo0oO, this.f5847Oooo0oo, ooo00o, this.f5844Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalFoundationApi
    public static final void OooO00o(@NotNull Oooo0 prefetchState, @NotNull OooOOO0 itemContentFactory, @NotNull o000O0O0 subcomposeLayoutState, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1113453182);
        View view = (View) ooo00oOooOOo.OooOO0o(o0O0O00.f6594OooO0o);
        ooo00oOooOOo.OooO0o0(1618982084);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(subcomposeLayoutState) | ooo00oOooOOo.Oooo0oo(prefetchState) | ooo00oOooOOo.Oooo0oo(view);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            ooo00oOooOOo.Oooo00o(new o000oOoO(prefetchState, subcomposeLayoutState, itemContentFactory, view));
        }
        ooo00oOooOOo.Oooo0o0();
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(prefetchState, itemContentFactory, subcomposeLayoutState, i));
    }
}
