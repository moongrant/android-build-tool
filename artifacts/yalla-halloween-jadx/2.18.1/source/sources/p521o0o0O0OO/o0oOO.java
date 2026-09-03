package p521o0o0O0OO;

import Oooo000.OooO0o;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.developer.nettest.NetDevTestVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o000000.OooO00o;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.OooOO0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO {
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO00o(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        oOO00O ooo00o2;
        oOO00O composer = ooo00o.OooOOo(1826996565);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
            ooo00o2 = composer;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(NetDevTestVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            NetDevTestVM netDevTestVM = (NetDevTestVM) viewModel;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current2 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
            composer.Oooo0o0();
            oO0Oo0oo oo0oo0oo = (oO0Oo0oo) viewModel2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(OooO00o.f26575OooO0Oo);
            Function0<OooO00o> function0 = OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            o00OO o00oo2 = new o00OO(netDevTestVM, oo0oo0oo, lifecycleOwner);
            o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o);
            o00OO00O o00oo00o = o00OO00O.f42936OooO00o;
            OooOO0O.OooO00o(o00oo2, o00oooo0OooO0o2, false, null, null, null, null, null, null, o00OO00O.f42937OooO0O0, composer, 805306416, 508);
            ooo00o2 = composer;
            OooOO0O.OooO00o(new o00OOO0O(netDevTestVM, oo0oo0oo, lifecycleOwner), SizeKt.OooO0o(oooO00o), false, null, null, null, null, null, null, o00OO00O.f42938OooO0OO, composer, 805306416, 508);
            OooOO0O.OooO00o(new o00OOOOo(netDevTestVM, oo0oo0oo, lifecycleOwner), SizeKt.OooO0o(oooO00o), false, null, null, null, null, null, null, o00OO00O.f42939OooO0Oo, ooo00o2, 805306416, 508);
            o0O0OO0.OooO00o(ooo00o2);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Oo00(i));
    }
}
