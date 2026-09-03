package p513o0o0O00o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.composable.main.MainRoomDialogType;
import com.yalla.yalla.ui.dialog.WelcomeDialog;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.o00O0OO0;
import p519o0o0O0oO.o00O0OOO;
import p519o0o0O0oO.oOo0o00;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainRoomDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomDialog.kt\ncom/yalla/yalla/ui/composable/main/MainRoomDialog\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,231:1\n81#2,11:232\n*S KotlinDebug\n*F\n+ 1 MainRoomDialog.kt\ncom/yalla/yalla/ui/composable/main/MainRoomDialog\n*L\n33#1:232,11\n*E\n"})
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo f51553OooO00o = new OooOo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f51554OooO0O0 = new MutableLiveData<>(null);

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51557OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51557OooO0o0 = fragmentActivity;
            this.f51556OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51556OooO0o | 1);
            OooOo.this.OooO0O0(this.f51557OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51560OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51561OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51560OooO0o0 = fragmentActivity;
            this.f51559OooO0o = mainRoomVM;
            this.f51561OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51561OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51560OooO0o0;
            MainRoomVM mainRoomVM = this.f51559OooO0o;
            OooOo.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51562OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MainRoomVM mainRoomVM) {
            super(1);
            this.f51562OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomVM mainRoomVM = this.f51562OooO0Oo;
            mainRoomVM.setDialogShowCheckInTask(false);
            mainRoomVM.setShowingDialogType(null);
            OooOo.f51554OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51564OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51565OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51566OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51565OooO0o0 = fragmentActivity;
            this.f51564OooO0o = mainRoomVM;
            this.f51566OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51566OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51565OooO0o0;
            MainRoomVM mainRoomVM = this.f51564OooO0o;
            OooOo.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51568OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51569OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51569OooO0o0 = fragmentActivity;
            this.f51568OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51568OooO0o | 1);
            OooOo.this.OooO0O0(this.f51569OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51571OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51572OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51572OooO0o0 = fragmentActivity;
            this.f51571OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51571OooO0o | 1);
            OooOo.this.OooO0O0(this.f51572OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51574OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51575OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51575OooO0o0 = fragmentActivity;
            this.f51574OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51574OooO0o | 1);
            OooOo.this.OooO0O0(this.f51575OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51577OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51578OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51578OooO0o0 = fragmentActivity;
            this.f51577OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51577OooO0o | 1);
            OooOo.this.OooO0O0(this.f51578OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51580OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51581OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51581OooO0o0 = fragmentActivity;
            this.f51580OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51580OooO0o | 1);
            OooOo.this.OooO0O0(this.f51581OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51583OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51584OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51584OooO0o0 = fragmentActivity;
            this.f51583OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51583OooO0o | 1);
            OooOo.this.OooO0O0(this.f51584OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o0O00o.OooOo$OooOo, reason: collision with other inner class name */
    public static final class C0495OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51586OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51587OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0495OooOo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51587OooO0o0 = fragmentActivity;
            this.f51586OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51586OooO0o | 1);
            OooOo.this.OooO0O0(this.f51587OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51589OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51590OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51590OooO0o0 = fragmentActivity;
            this.f51589OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51589OooO0o | 1);
            OooOo.this.OooO0O0(this.f51590OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51592OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51593OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51593OooO0o0 = fragmentActivity;
            this.f51592OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51592OooO0o | 1);
            OooOo.this.OooO0O0(this.f51593OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51595OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51596OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51596OooO0o0 = fragmentActivity;
            this.f51595OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51595OooO0o | 1);
            OooOo.this.OooO0O0(this.f51596OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51598OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51599OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51600OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51599OooO0o0 = fragmentActivity;
            this.f51598OooO0o = mainRoomVM;
            this.f51600OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51600OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51599OooO0o0;
            MainRoomVM mainRoomVM = this.f51598OooO0o;
            OooOo.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51601OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(MainRoomVM mainRoomVM) {
            super(0);
            this.f51601OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomVM mainRoomVM = this.f51601OooO0Oo;
            mainRoomVM.setDialogShowWelcome(false);
            mainRoomVM.setShowingDialogType(null);
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            ((MutableLiveData) p464o0Oooo.o000000O.f46676OooO0OO.getValue()).postValue(Boolean.FALSE);
            OooOo.f51554OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51603OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51604OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51605OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51604OooO0o0 = fragmentActivity;
            this.f51603OooO0o = mainRoomVM;
            this.f51605OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51605OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51604OooO0o0;
            MainRoomVM mainRoomVM = this.f51603OooO0o;
            OooOo.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51607OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51608OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51609OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51608OooO0o0 = fragmentActivity;
            this.f51607OooO0o = mainRoomVM;
            this.f51609OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51609OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51608OooO0o0;
            MainRoomVM mainRoomVM = this.f51607OooO0o;
            OooOo.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51611OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51612OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51613OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51612OooO0o0 = fragmentActivity;
            this.f51611OooO0o = mainRoomVM;
            this.f51613OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51613OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51612OooO0o0;
            MainRoomVM mainRoomVM = this.f51611OooO0o;
            OooOo.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000OO extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51614OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f51615OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f51614OooO0Oo = mainRoomVM;
            this.f51615OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f51614OooO0Oo;
            mainRoomVM.setDialogShowUserReturn(false);
            mainRoomVM.setShowingDialogType(null);
            OfficialActionModel officialActionModel = this.f51615OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooOo.f51554OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51617OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51618OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51619OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51618OooO0o0 = fragmentActivity;
            this.f51617OooO0o = mainRoomVM;
            this.f51619OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51619OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51618OooO0o0;
            MainRoomVM mainRoomVM = this.f51617OooO0o;
            OooOo.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51621OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51622OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51623OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51622OooO0o0 = fragmentActivity;
            this.f51621OooO0o = mainRoomVM;
            this.f51623OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51623OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51622OooO0o0;
            MainRoomVM mainRoomVM = this.f51621OooO0o;
            OooOo.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51625OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51626OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51626OooO0o0 = fragmentActivity;
            this.f51625OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51625OooO0o | 1);
            OooOo.this.OooO0O0(this.f51626OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51628OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51629OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51629OooO0o0 = fragmentActivity;
            this.f51628OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51628OooO0o | 1);
            OooOo.this.OooO0O0(this.f51629OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51631OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51632OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51632OooO0o0 = fragmentActivity;
            this.f51631OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51631OooO0o | 1);
            OooOo.this.OooO0O0(this.f51632OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51635OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51635OooO0o0 = fragmentActivity;
            this.f51634OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51634OooO0o | 1);
            OooOo.this.OooO0O0(this.f51635OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51637OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51638OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51639OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51638OooO0o0 = fragmentActivity;
            this.f51637OooO0o = mainRoomVM;
            this.f51639OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51639OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51638OooO0o0;
            MainRoomVM mainRoomVM = this.f51637OooO0o;
            OooOo.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51641OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51642OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51643OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51642OooO0o0 = fragmentActivity;
            this.f51641OooO0o = mainRoomVM;
            this.f51643OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51643OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51642OooO0o0;
            MainRoomVM mainRoomVM = this.f51641OooO0o;
            OooOo.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51645OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51646OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51647OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51646OooO0o0 = fragmentActivity;
            this.f51645OooO0o = mainRoomVM;
            this.f51647OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51647OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51646OooO0o0;
            MainRoomVM mainRoomVM = this.f51645OooO0o;
            OooOo.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51648OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f51649OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f51648OooO0Oo = mainRoomVM;
            this.f51649OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f51648OooO0Oo;
            mainRoomVM.setDialogShowOfficialAction(false);
            mainRoomVM.setShowingDialogType(null);
            OfficialActionModel officialActionModel = this.f51649OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooOo.f51554OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51651OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51652OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51653OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51652OooO0o0 = fragmentActivity;
            this.f51651OooO0o = mainRoomVM;
            this.f51653OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51653OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51652OooO0o0;
            MainRoomVM mainRoomVM = this.f51651OooO0o;
            OooOo.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f51655OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51656OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f51656OooO0o0 = fragmentActivity;
            this.f51655OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51655OooO0o | 1);
            OooOo.this.OooO0O0(this.f51656OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51658OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51659OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51660OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51659OooO0o0 = fragmentActivity;
            this.f51658OooO0o = mainRoomVM;
            this.f51660OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51660OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51659OooO0o0;
            MainRoomVM mainRoomVM = this.f51658OooO0o;
            OooOo.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51662OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51663OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51664OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f51663OooO0o0 = fragmentActivity;
            this.f51662OooO0o = mainRoomVM;
            this.f51664OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51664OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f51663OooO0o0;
            MainRoomVM mainRoomVM = this.f51662OooO0o;
            OooOo.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f51665OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(MainRoomVM mainRoomVM) {
            super(1);
            this.f51665OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            ((MutableLiveData) p464o0Oooo.o000000O.f46721OoooOOo.getValue()).postValue(Boolean.FALSE);
            MainRoomVM mainRoomVM = this.f51665OooO0Oo;
            mainRoomVM.setDialogShowBindYallaChatTips(false);
            mainRoomVM.setShowingDialogType(null);
            OooOo.f51554OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1986508897);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986508897, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.CheckInTaskDialog (MainRoomDialog.kt:195)");
        }
        if (mainRoomVM.getShowingDialogType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(fragmentActivity, mainRoomVM, i));
            return;
        }
        f51554OooO0O0.postValue(Boolean.FALSE);
        o00O0OOO o00o0ooo2 = new o00O0OOO(fragmentActivity);
        o00o0ooo2.OooO00o(new OooO0O0(mainRoomVM));
        o00o0ooo2.OooO();
        mainRoomVM.setShowingDialogType(MainRoomDialogType.CheckInTask);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0O0(@NotNull FragmentActivity activity, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(1191522817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1191522817, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.Content (MainRoomDialog.kt:31)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MainRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MainRoomVM mainRoomVM = (MainRoomVM) viewModel;
        if (mainRoomVM.getDialogShowWelcome()) {
            composerStartRestartGroup.startReplaceableGroup(941819581);
            mainRoomVM.setDialogShowCheckInTask(false);
            OooO0o0(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowUserReturn()) {
            composerStartRestartGroup.startReplaceableGroup(941819756);
            if (mainRoomVM.getDialogShowWelcome()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new C0495OooOo(activity, i));
                return;
            }
            mainRoomVM.setDialogShowCheckInTask(false);
            OooO0o(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup3 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup3.updateScope(new Oooo000(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowOfficialAction()) {
            composerStartRestartGroup.startReplaceableGroup(941820022);
            if (mainRoomVM.getDialogShowWelcome()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup4 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup4.updateScope(new Oooo0(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowUserReturn()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup5 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup5.updateScope(new o000oOoO(activity, i));
                return;
            }
            mainRoomVM.setDialogShowCheckInTask(false);
            OooO0OO(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup6 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup6 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup6.updateScope(new o0OoOo0(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowBindYallaChatTips()) {
            composerStartRestartGroup.startReplaceableGroup(941820385);
            if (mainRoomVM.getDialogShowWelcome()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup7 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup7 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup7.updateScope(new o00O0O(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowUserReturn()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup8 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup8 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup8.updateScope(new o00Oo0(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowOfficialAction()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup9 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup9 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup9.updateScope(new o00Ooo(activity, i));
                return;
            }
            OooO0Oo(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup10 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup10 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup10.updateScope(new OooO0o(activity, i));
            return;
        }
        if (!mainRoomVM.getDialogShowCheckInTask()) {
            composerStartRestartGroup.startReplaceableGroup(941821269);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup11 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup11 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup11.updateScope(new OooOOOO(activity, i));
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(941820790);
        if (mainRoomVM.getDialogShowWelcome()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup12 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup12 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup12.updateScope(new OooO(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowUserReturn()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup13 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup13 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup13.updateScope(new OooOO0(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowOfficialAction()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup14 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup14 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup14.updateScope(new OooOO0O(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowBindYallaChatTips()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup15 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup15 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup15.updateScope(new OooOOO0(activity, i));
            return;
        }
        OooO00o(activity, mainRoomVM, composerStartRestartGroup, 584);
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup16 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup16 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup16.updateScope(new OooOOO(activity, i));
    }

    @Composable
    public final void OooO0OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-389528628);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-389528628, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.OfficialActionDialog (MainRoomDialog.kt:157)");
        }
        if (mainRoomVM.getShowingDialogType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(fragmentActivity, mainRoomVM, i));
            return;
        }
        OfficialActionModel officialActionModel = mainRoomVM.getOfficialActionModel();
        if (officialActionModel != null) {
            if (!officialActionModel.getDefaultIsShowDialog()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new o00oO0o(fragmentActivity, mainRoomVM, i));
                return;
            }
            if (!officialActionModel.getDefaultIsShowPopUp()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new o0ooOOo(fragmentActivity, mainRoomVM, i));
                return;
            }
            f51554OooO0O0.postValue(Boolean.FALSE);
            oOo0o00 ooo0o00 = new oOo0o00(fragmentActivity);
            ooo0o00.OooO00o(new o0OOO0o(mainRoomVM, officialActionModel));
            ooo0o00.OooOO0(officialActionModel);
            ooo0o00.OooO();
            mainRoomVM.setShowingDialogType(MainRoomDialogType.OfficialAction);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new o0Oo0oo(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0Oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1739778422);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1739778422, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.ShowBindYallaChatTips (MainRoomDialog.kt:213)");
        }
        if (mainRoomVM.getShowingDialogType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(fragmentActivity, mainRoomVM, i));
            return;
        }
        f51554OooO0O0.postValue(Boolean.FALSE);
        o00O0OO0 o00o0oo1 = new o00O0OO0(fragmentActivity);
        o00o0oo1.OooO00o(new oo0o0Oo(mainRoomVM));
        o00o0oo1.OooO();
        mainRoomVM.setShowingDialogType(MainRoomDialogType.BindYallaChatTips);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0O0O00(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2057273818);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057273818, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.UserReturnDialog (MainRoomDialog.kt:119)");
        }
        if (mainRoomVM.getShowingDialogType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00000(fragmentActivity, mainRoomVM, i));
            return;
        }
        OfficialActionModel userReturnModel = mainRoomVM.getUserReturnModel();
        if (userReturnModel != null) {
            if (!userReturnModel.getDefaultIsShowDialog()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new o00000O0(fragmentActivity, mainRoomVM, i));
                return;
            }
            if (!userReturnModel.getDefaultIsShowPopUp()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new o00000O(fragmentActivity, mainRoomVM, i));
                return;
            }
            f51554OooO0O0.postValue(Boolean.FALSE);
            oOo0o00 ooo0o00 = new oOo0o00(fragmentActivity);
            ooo0o00.OooO00o(new o00000OO(mainRoomVM, userReturnModel));
            ooo0o00.OooOO0(userReturnModel);
            ooo0o00.OooO();
            mainRoomVM.setShowingDialogType(MainRoomDialogType.UserReturn);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new o0000Ooo(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0o0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Integer numValueOf;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1349440724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1349440724, i, -1, "com.yalla.yalla.ui.composable.main.MainRoomDialog.ShowWelcomeDialog (MainRoomDialog.kt:99)");
        }
        if (mainRoomVM.getShowingDialogType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(fragmentActivity, mainRoomVM, i));
            return;
        }
        f51554OooO0O0.postValue(Boolean.FALSE);
        WelcomeDialog welcomeDialog = new WelcomeDialog(fragmentActivity);
        p417o0OoO0.oo0o0Oo.OooO00o(welcomeDialog, new o000000(mainRoomVM));
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        String crystal = String.valueOf(p464o0Oooo.o000000O.OooO0Oo().getValue());
        Intrinsics.checkNotNullParameter(crystal, "crystal");
        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.welcome_reward), " x".concat(crystal));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, "x", 0, false, 6, (Object) null);
        if (p591o0oo000O.OooO.OooO0o0()) {
            i2 = iIndexOf$default + 2;
            numValueOf = Integer.valueOf(i2 + 1);
        } else {
            numValueOf = Integer.valueOf(iIndexOf$default);
            i2 = iIndexOf$default - 1;
        }
        SpannableString spannableString = new SpannableString(strOooO00o);
        Drawable drawableOooO0O0 = o0000.OooO0O0(oOo00OO0.icon_crystal_task_item_min);
        int minimumHeight = drawableOooO0O0.getMinimumHeight();
        drawableOooO0O0.setBounds(0, 0, minimumHeight + 1, minimumHeight + 4);
        spannableString.setSpan(new ImageSpan(drawableOooO0O0), i2, numValueOf.intValue(), 17);
        TextView textView = welcomeDialog.f27989OooO0oO;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvWelcomeContent");
            textView = null;
        }
        textView.setText(spannableString);
        welcomeDialog.show();
        mainRoomVM.setShowingDialogType(MainRoomDialogType.Welcome);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o000000O(fragmentActivity, mainRoomVM, i));
    }
}
