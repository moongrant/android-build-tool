package p536o0o0Oo00;

import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import com.yalla.yalla.manager.main.MainDialogManager$PriorityType;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.view.AutoImage;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O000Oo;
import p405o0Oo0OOO.o0OoOoOo;
import p475o0Ooooo0.o0O00oO0;
import p650o0ooo.oO0O000;
import p650o0ooo.oO0O00oO;
import p650o0ooo.oOO000;
import p650o0ooo.oOO0000;
import p650o0ooo.oOO0O000;
import p650o0ooo.oOo000o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainDialogUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDialogUI.kt\ncom/yalla/yalla/ui/composable/main/MainDialogUI\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,218:1\n81#2,11:219\n*S KotlinDebug\n*F\n+ 1 MainDialogUI.kt\ncom/yalla/yalla/ui/composable/main/MainDialogUI\n*L\n24#1:219,11\n*E\n"})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f54351OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f54352OooO0O0 = new MutableLiveData<>(null);

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54354OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54355OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54355OooO0o0 = fragmentActivity;
            this.f54354OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54354OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54355OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54357OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54358OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54359OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54358OooO0o0 = fragmentActivity;
            this.f54357OooO0o = mainRoomVM;
            this.f54359OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54359OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54358OooO0o0;
            MainRoomVM mainRoomVM = this.f54357OooO0o;
            OooO0OO.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54360OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MainRoomVM mainRoomVM) {
            super(1);
            this.f54360OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomVM mainRoomVM = this.f54360OooO0Oo;
            mainRoomVM.getDialogShowCheckInTask().setValue(Boolean.FALSE);
            mainRoomVM.setShowingPriorityType(null);
            OooO0OO.f54352OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o0Oo00.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0482OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54362OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54363OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54364OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0482OooO0OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54363OooO0o0 = fragmentActivity;
            this.f54362OooO0o = mainRoomVM;
            this.f54364OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54364OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54363OooO0o0;
            MainRoomVM mainRoomVM = this.f54362OooO0o;
            OooO0OO.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54366OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54367OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54367OooO0o0 = fragmentActivity;
            this.f54366OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54366OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54367OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54369OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54370OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54370OooO0o0 = fragmentActivity;
            this.f54369OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54369OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54370OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54372OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54373OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54373OooO0o0 = fragmentActivity;
            this.f54372OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54372OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54373OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54375OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54376OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54376OooO0o0 = fragmentActivity;
            this.f54375OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54375OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54376OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54378OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54379OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54379OooO0o0 = fragmentActivity;
            this.f54378OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54378OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54379OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54381OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54382OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54382OooO0o0 = fragmentActivity;
            this.f54381OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54381OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54382OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54384OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54385OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54385OooO0o0 = fragmentActivity;
            this.f54384OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54384OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54385OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54387OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54388OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54388OooO0o0 = fragmentActivity;
            this.f54387OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54387OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54388OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54390OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54391OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54391OooO0o0 = fragmentActivity;
            this.f54390OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54390OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54391OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54393OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54394OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54394OooO0o0 = fragmentActivity;
            this.f54393OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54393OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54394OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54396OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54397OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54398OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54397OooO0o0 = fragmentActivity;
            this.f54396OooO0o = mainRoomVM;
            this.f54398OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54398OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54397OooO0o0;
            MainRoomVM mainRoomVM = this.f54396OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54400OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54401OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54402OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54401OooO0o0 = fragmentActivity;
            this.f54400OooO0o = mainRoomVM;
            this.f54402OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54402OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54401OooO0o0;
            MainRoomVM mainRoomVM = this.f54400OooO0o;
            OooO0OO.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f54404OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f54403OooO0Oo = mainRoomVM;
            this.f54404OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f54403OooO0Oo;
            mainRoomVM.getDialogShowOfficialAction().setValue(Boolean.FALSE);
            mainRoomVM.setShowingPriorityType(null);
            OfficialActionModel officialActionModel = this.f54404OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooO0OO.f54352OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54406OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54407OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54408OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54407OooO0o0 = fragmentActivity;
            this.f54406OooO0o = mainRoomVM;
            this.f54408OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54408OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54407OooO0o0;
            MainRoomVM mainRoomVM = this.f54406OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54410OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54411OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54412OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54411OooO0o0 = fragmentActivity;
            this.f54410OooO0o = mainRoomVM;
            this.f54412OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54412OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54411OooO0o0;
            MainRoomVM mainRoomVM = this.f54410OooO0o;
            OooO0OO.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54413OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(MainRoomVM mainRoomVM) {
            super(1);
            this.f54413OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            MutableLiveData mutableLiveData = (MutableLiveData) o0O00oO0.f47983OoooOOo.getValue();
            Boolean bool = Boolean.FALSE;
            mutableLiveData.postValue(bool);
            MainRoomVM mainRoomVM = this.f54413OooO0Oo;
            mainRoomVM.getDialogShowBindYallaChatTips().setValue(bool);
            mainRoomVM.setShowingPriorityType(null);
            OooO0OO.f54352OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54415OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54416OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54417OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54416OooO0o0 = fragmentActivity;
            this.f54415OooO0o = mainRoomVM;
            this.f54417OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54417OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54416OooO0o0;
            MainRoomVM mainRoomVM = this.f54415OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O00 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54418OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f54419OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O00(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f54418OooO0Oo = mainRoomVM;
            this.f54419OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f54418OooO0Oo;
            mainRoomVM.getDialogShowUserReturn().setValue(Boolean.FALSE);
            mainRoomVM.setShowingPriorityType(null);
            OfficialActionModel officialActionModel = this.f54419OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooO0OO.f54352OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54421OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54422OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54423OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54422OooO0o0 = fragmentActivity;
            this.f54421OooO0o = mainRoomVM;
            this.f54423OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54423OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54422OooO0o0;
            MainRoomVM mainRoomVM = this.f54421OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54425OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54426OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54427OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54426OooO0o0 = fragmentActivity;
            this.f54425OooO0o = mainRoomVM;
            this.f54427OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54427OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54426OooO0o0;
            MainRoomVM mainRoomVM = this.f54425OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54429OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54430OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54431OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54430OooO0o0 = fragmentActivity;
            this.f54429OooO0o = mainRoomVM;
            this.f54431OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54431OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54430OooO0o0;
            MainRoomVM mainRoomVM = this.f54429OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54433OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54434OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54434OooO0o0 = fragmentActivity;
            this.f54433OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54433OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54434OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54436OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54437OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54437OooO0o0 = fragmentActivity;
            this.f54436OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54436OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54437OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54439OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54440OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54440OooO0o0 = fragmentActivity;
            this.f54439OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54439OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54440OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54442OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54443OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54443OooO0o0 = fragmentActivity;
            this.f54442OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54442OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54443OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54445OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54446OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54446OooO0o0 = fragmentActivity;
            this.f54445OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54445OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54446OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54448OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54449OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54450OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54449OooO0o0 = fragmentActivity;
            this.f54448OooO0o = mainRoomVM;
            this.f54450OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54450OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54449OooO0o0;
            MainRoomVM mainRoomVM = this.f54448OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54452OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54453OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54453OooO0o0 = fragmentActivity;
            this.f54452OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54452OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54453OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54455OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54456OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54456OooO0o0 = fragmentActivity;
            this.f54455OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54455OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54456OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54458OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54459OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54459OooO0o0 = fragmentActivity;
            this.f54458OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54458OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54459OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54461OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54462OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54462OooO0o0 = fragmentActivity;
            this.f54461OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54461OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54462OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54464OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54465OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54465OooO0o0 = fragmentActivity;
            this.f54464OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54464OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54465OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54467OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54468OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f54468OooO0o0 = fragmentActivity;
            this.f54467OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54467OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f54468OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f54470OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54471OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54472OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f54471OooO0o0 = fragmentActivity;
            this.f54470OooO0o = mainRoomVM;
            this.f54472OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54472OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f54471OooO0o0;
            MainRoomVM mainRoomVM = this.f54470OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1648694143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1648694143, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.CheckInTaskDialog (MainDialogUI.kt:184)");
        }
        if (mainRoomVM.getShowingPriorityType() != null) {
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
        f54352OooO0O0.postValue(Boolean.FALSE);
        oO0O00oO oo0o00oo = new oO0O00oO(fragmentActivity);
        oo0o00oo.OooO00o(new OooO0O0(mainRoomVM));
        oo0o00oo.OooO();
        mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.CheckInTask);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new C0482OooO0OO(fragmentActivity, mainRoomVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@NotNull FragmentActivity activity, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(643184161);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(643184161, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.Content (MainDialogUI.kt:22)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MainRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MainRoomVM mainRoomVM = (MainRoomVM) viewModel;
        if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867386107);
            oOo000o0.f59027OooO00o.OooO00o(composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowWelcome().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867386246);
            if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new o00Oo0(activity, i));
                return;
            }
            mainRoomVM.getDialogShowCheckInTask().setValue(Boolean.FALSE);
            oOO0O000.f58948OooO00o.OooO00o(composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup3 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup3.updateScope(new o00Ooo(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowUserReturn().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867386541);
            if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup4 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup4.updateScope(new oo000o(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowWelcome().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup5 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup5.updateScope(new o00oO0o(activity, i));
                return;
            }
            mainRoomVM.getDialogShowCheckInTask().setValue(Boolean.FALSE);
            OooO0o0(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup6 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup6 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup6.updateScope(new o0ooOOo(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowOfficialAction().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867386921);
            if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup7 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup7 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup7.updateScope(new o0OOO0o(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowWelcome().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup8 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup8 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup8.updateScope(new o0Oo0oo(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowUserReturn().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup9 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup9 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup9.updateScope(new o0OO00O(activity, i));
                return;
            }
            mainRoomVM.getDialogShowCheckInTask().setValue(Boolean.FALSE);
            OooO0OO(activity, mainRoomVM, composerStartRestartGroup, 584);
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
        if (mainRoomVM.getDialogShowBindYallaChatTips().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867387404);
            if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup11 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup11 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup11.updateScope(new OooO(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowWelcome().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup12 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup12 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup12.updateScope(new OooOO0(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowUserReturn().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup13 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup13 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup13.updateScope(new OooOO0O(activity, i));
                return;
            }
            if (mainRoomVM.getDialogShowOfficialAction().getValue().booleanValue()) {
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup14 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup14 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup14.updateScope(new OooOOO0(activity, i));
                return;
            }
            OooO0Oo(activity, mainRoomVM, composerStartRestartGroup, 584);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup15 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup15 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup15.updateScope(new OooOOO(activity, i));
            return;
        }
        if (!mainRoomVM.getDialogShowCheckInTask().getValue().booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(867388528);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup16 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup16 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup16.updateScope(new o00O0O(activity, i));
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(867387929);
        if (mainRoomVM.getShowBindMoreAccount().getValue().booleanValue()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup17 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup17 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup17.updateScope(new OooOOOO(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowWelcome().getValue().booleanValue()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup18 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup18 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup18.updateScope(new OooOo00(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowUserReturn().getValue().booleanValue()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup19 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup19 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup19.updateScope(new OooOo(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowOfficialAction().getValue().booleanValue()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup20 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup20 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup20.updateScope(new Oooo000(activity, i));
            return;
        }
        if (mainRoomVM.getDialogShowBindYallaChatTips().getValue().booleanValue()) {
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup21 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup21 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup21.updateScope(new o000oOoO(activity, i));
            return;
        }
        OooO00o(activity, mainRoomVM, composerStartRestartGroup, 584);
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup22 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup22 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup22.updateScope(new o0OoOo0(activity, i));
    }

    @Composable
    public final void OooO0OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1838684820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1838684820, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.OfficialActionDialog (MainDialogUI.kt:147)");
        }
        if (mainRoomVM.getShowingPriorityType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup2.updateScope(new o0O0O00(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup3.updateScope(new o000OOo(fragmentActivity, mainRoomVM, i));
                return;
            }
            f54352OooO0O0.postValue(Boolean.FALSE);
            oOO0000 ooo0000 = new oOO0000(fragmentActivity);
            ooo0000.OooO00o(new o000000(mainRoomVM, officialActionModel));
            ooo0000.f58921OooOOO0 = officialActionModel;
            AutoImage autoImage = ((o0OoOoOo) ooo0000.f58920OooOO0o.getValue()).f44660OooO0O0;
            autoImage.getClass();
            FragmentActivity fragmentActivity2 = ooo0000.f58919OooOO0O;
            Intrinsics.checkNotNullParameter(fragmentActivity2, "fragmentActivity");
            autoImage.f29802OooO0oO = fragmentActivity2;
            autoImage.f29798OooO = 16;
            autoImage.f29805OooOO0O = Boolean.TRUE;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            autoImage.f29804OooOO0 = scaleType;
            autoImage.f29803OooO0oo = p562o0oOo000.o0Oo0oo.icon_picture_default;
            autoImage.OooO00o(com.code.android.util.o0OoOo0.OooOOO(officialActionModel.getPopUpImgUrl(), ""));
            o0oo0000.OooO00o.OooO0OO("301005", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            ooo0000.OooO();
            mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.OfficialAction);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new o000000O(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0Oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1829498902);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1829498902, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.ShowBindYallaChatTips (MainDialogUI.kt:201)");
        }
        if (mainRoomVM.getShowingPriorityType() != null) {
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
        f54352OooO0O0.postValue(Boolean.FALSE);
        oO0O000 oo0o000 = new oO0O000(fragmentActivity);
        oo0o000.OooO00o(new o00000O0(mainRoomVM));
        oo0o000.OooO();
        mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.BindYallaChatTips);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o00000O(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0o0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868604218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868604218, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.UserReturnDialog (MainDialogUI.kt:110)");
        }
        if (mainRoomVM.getShowingPriorityType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00000OO(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup2.updateScope(new o0000Ooo(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup3.updateScope(new o0000(fragmentActivity, mainRoomVM, i));
                return;
            }
            f54352OooO0O0.postValue(Boolean.FALSE);
            oOO000 ooo000 = new oOO000(fragmentActivity);
            ooo000.OooO00o(new o0000O00(mainRoomVM, userReturnModel));
            ooo000.f58915OooOOO0 = userReturnModel;
            AutoImage autoImage = ((o0O000Oo) ooo000.f58914OooOO0o.getValue()).f44412OooO0O0;
            autoImage.getClass();
            FragmentActivity fragmentActivity2 = ooo000.f58913OooOO0O;
            Intrinsics.checkNotNullParameter(fragmentActivity2, "fragmentActivity");
            autoImage.f29802OooO0oO = fragmentActivity2;
            autoImage.f29798OooO = 16;
            autoImage.f29805OooOO0O = Boolean.TRUE;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            autoImage.f29804OooOO0 = scaleType;
            autoImage.f29803OooO0oo = p562o0oOo000.o0Oo0oo.icon_picture_default;
            autoImage.OooO00o(com.code.android.util.o0OoOo0.OooOOO(userReturnModel.getPopUpImgUrl(), ""));
            o0oo0000.OooO00o.OooO0OO("301005", MapsKt.mapOf(TuplesKt.to("url", userReturnModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(userReturnModel.getType())), TuplesKt.to("activity", Integer.valueOf(userReturnModel.getActivityId()))));
            ooo000.OooO();
            mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.UserReturn);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new o0000oo(fragmentActivity, mainRoomVM, i));
    }
}
