package p599o0oo00O0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.common.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p580o0oOoOo.oO0;
import p580o0oOoOo.oO000;
import p580o0oOoOo.oO000O0O;
import p580o0oOoOo.oO0O00o0;
import p580o0oOoOo.oOOoOOO0;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f47955OooO00o = new o00Ooo();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47957Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f47957Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Ooo.this.OooO00o(ooo00o, this.f47957Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-744284395);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            oO000.f46451OooO00o.OooO00o(ooo00oOooOOo, 6);
            oO000O0O.f46487OooO00o.OooO00o(ooo00oOooOOo, 6);
            oOOoOOO0.f46695OooO00o.OooO0O0(ooo00oOooOOo, 6);
            oO0O00o0.f46571OooO00o.OooO(ooo00oOooOOo, 6);
            oO0.f46437OooO00o.OooO00o(ooo00oOooOOo, 6);
            ooo00oOooOOo.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(LiveRoomVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            o0OOO0o.OooO0o0(liveRoomVM, (oO0Oo0oo) viewModel2, ooo00oOooOOo, 64);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i));
    }
}
