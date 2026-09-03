package p087o000Oooo;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0O00;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f28559Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f28560Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f28561Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o00O0O00 o00o0o01, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f28559Oooo0o = o00o0o01;
            this.f28560Oooo0oO = function2;
            this.f28561Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                o000O0.OooO0O0(this.f28559Oooo0o, this.f28560Oooo0oO, ooo00o2, ((this.f28561Oooo0oo >> 3) & 112) | 8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f28562Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f28563Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f28564Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f28565Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(NavBackStackEntry navBackStackEntry, o00O0O00 o00o0o01, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f28563Oooo0o = navBackStackEntry;
            this.f28564Oooo0oO = o00o0o01;
            this.f28565Oooo0oo = function2;
            this.f28562Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000O0.OooO00o(this.f28563Oooo0o, this.f28564Oooo0oO, this.f28565Oooo0oo, ooo00o, this.f28562Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@NotNull NavBackStackEntry navBackStackEntry, @NotNull o00O0O00 saveableStateHolder, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1579360880);
        o00OO0O0.OooO00o(new o0O0OO0[]{LocalViewModelStoreOwner.INSTANCE.provides(navBackStackEntry), o0O0O00.f6593OooO0Oo.OooO0O0(navBackStackEntry), o0O0O00.f6595OooO0o0.OooO0O0(navBackStackEntry)}, o00O0000.OooO00o(ooo00oOooOOo, -52928304, new OooO00o(saveableStateHolder, content, i)), ooo00oOooOOo, 56);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(navBackStackEntry, saveableStateHolder, content, i));
    }

    public static final void OooO0O0(o00O0O00 o00o0o01, Function2 function2, oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1211832233);
        ooo00oOooOOo.OooO0o0(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0000O0.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
        ooo00oOooOOo.Oooo0o0();
        o0000O0 o0000o1 = (o0000O0) viewModel;
        o0000o1.f28541OooO0O0 = o00o0o01;
        o00o0o01.OooO00o(o0000o1.f28540OooO00o, function2, ooo00oOooOOo, (i & 112) | 520);
        o00Oo00.OooO0O0(o0000o1, new o000OO0O(o0000o1), ooo00oOooOOo);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000O0O0(o00o0o01, function2, i));
    }
}
