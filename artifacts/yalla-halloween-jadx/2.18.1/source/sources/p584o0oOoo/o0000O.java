package p584o0oOoo;

import Oooo000.OooO0o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p261o00ooOoO.u;
import p515o0o0O00.o00O00;
import p571o0oOo0o.o00O00o0;
import p571o0oOo0o.oo00o;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public abstract class o0000O {

    public static final class OooO00o extends Lambda implements Function2<o00OOOO0, Lifecycle.State, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(o00OOOO0 o00oooo1, Lifecycle.State state) {
            o00OOOO0 LifecycleEffect = o00oooo1;
            Lifecycle.State state2 = state;
            Intrinsics.checkNotNullParameter(LifecycleEffect, "$this$LifecycleEffect");
            Intrinsics.checkNotNullParameter(state2, "state");
            o00O00.OooO0O0("ActivityStackManager screen " + o0000O.this.OooO0Oo() + " state = " + state2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f46943Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f46943Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.this.OooO0O0(ooo00o, this.f46943Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public abstract void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(2020257464);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(oO0Oo0oo.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            oO0Oo0oo oo0oo0oo = (oO0Oo0oo) viewModel;
            oo00o.OooO00o(oo0oo0oo.f48285OooO00o, (String) oo0oo0oo.f48286OooO0O0.getValue(), false, composer, 8, 4);
            p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(SizeKt.OooO0o0(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o), OooO0OO(composer), o000O0Oo.f32099OooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = p028Oooo0o0.oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5743OooO00o;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(this);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO00o();
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00O00o0.OooO00o((Function2) objOooO0o, composer, 0);
            OooO00o(columnScopeInstance, composer, ((i2 << 3) & 112) | 6);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }

    @Composable
    public long OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-2138573473);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        long jOooOo00 = u.OooO0O0(ooo00o).OooOo00();
        ooo00o.Oooo0o0();
        return jOooOo00;
    }

    @NotNull
    public final String OooO0Oo() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        return name;
    }
}
