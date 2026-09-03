package p520o0o0O0O0;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
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
import com.code.android.util.o0000O;
import com.yalla.yalla.manager.main.MainDialogManager$PriorityType;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.dialog.MainDialogWelcome;
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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.o0O000Oo;
import p407o0Oo0OOO.o0O000o0;
import p407o0Oo0OOO.o0OoOoOo;
import p474o0OoooOO.oo0oO0;
import p593o0oOoooO.h0;
import p675oO0Oo.O0OO00;
import p675oO0Oo.oOOOOo0O;
import p675oO0Oo.oOOo0O00;
import p675oO0Oo.r;
import p675oO0Oo.s;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainDialogUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDialogUI.kt\ncom/yalla/yalla/ui/composable/main/MainDialogUI\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,237:1\n81#2,11:238\n*S KotlinDebug\n*F\n+ 1 MainDialogUI.kt\ncom/yalla/yalla/ui/composable/main/MainDialogUI\n*L\n24#1:238,11\n*E\n"})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f52740OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f52741OooO0O0 = new MutableLiveData<>(null);

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52743OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52744OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52744OooO0o0 = fragmentActivity;
            this.f52743OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52743OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52744OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52746OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52747OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52748OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52747OooO0o0 = fragmentActivity;
            this.f52746OooO0o = mainRoomVM;
            this.f52748OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52748OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52747OooO0o0;
            MainRoomVM mainRoomVM = this.f52746OooO0o;
            OooO0OO.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52749OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MainRoomVM mainRoomVM) {
            super(1);
            this.f52749OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomVM mainRoomVM = this.f52749OooO0Oo;
            mainRoomVM.setDialogShowCheckInTask(false);
            mainRoomVM.setShowingPriorityType(null);
            OooO0OO.f52741OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o0O0O0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0479OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52751OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52752OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52753OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0479OooO0OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52752OooO0o0 = fragmentActivity;
            this.f52751OooO0o = mainRoomVM;
            this.f52753OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52753OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52752OooO0o0;
            MainRoomVM mainRoomVM = this.f52751OooO0o;
            OooO0OO.this.OooO00o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52755OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52756OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52756OooO0o0 = fragmentActivity;
            this.f52755OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52755OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52756OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52758OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52759OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52759OooO0o0 = fragmentActivity;
            this.f52758OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52758OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52759OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52761OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52762OooO0o0 = fragmentActivity;
            this.f52761OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52761OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52762OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52764OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52765OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52765OooO0o0 = fragmentActivity;
            this.f52764OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52764OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52765OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52767OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52768OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52768OooO0o0 = fragmentActivity;
            this.f52767OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52767OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52768OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52770OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52771OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52771OooO0o0 = fragmentActivity;
            this.f52770OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52770OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52771OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52773OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52774OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52774OooO0o0 = fragmentActivity;
            this.f52773OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52773OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52774OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52776OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52777OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52777OooO0o0 = fragmentActivity;
            this.f52776OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52776OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52777OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52779OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52780OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52780OooO0o0 = fragmentActivity;
            this.f52779OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52779OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52780OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52782OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52783OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52783OooO0o0 = fragmentActivity;
            this.f52782OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52782OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52783OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52785OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52786OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52787OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52786OooO0o0 = fragmentActivity;
            this.f52785OooO0o = mainRoomVM;
            this.f52787OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52787OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52786OooO0o0;
            MainRoomVM mainRoomVM = this.f52785OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52789OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52790OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52791OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52790OooO0o0 = fragmentActivity;
            this.f52789OooO0o = mainRoomVM;
            this.f52791OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52791OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52790OooO0o0;
            MainRoomVM mainRoomVM = this.f52789OooO0o;
            OooO0OO.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52792OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f52793OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f52792OooO0Oo = mainRoomVM;
            this.f52793OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f52792OooO0Oo;
            mainRoomVM.setDialogShowOfficialAction(false);
            mainRoomVM.setShowingPriorityType(null);
            OfficialActionModel officialActionModel = this.f52793OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooO0OO.f52741OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52795OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52796OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52797OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52796OooO0o0 = fragmentActivity;
            this.f52795OooO0o = mainRoomVM;
            this.f52797OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52797OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52796OooO0o0;
            MainRoomVM mainRoomVM = this.f52795OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52799OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52800OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52801OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52800OooO0o0 = fragmentActivity;
            this.f52799OooO0o = mainRoomVM;
            this.f52801OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52801OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52800OooO0o0;
            MainRoomVM mainRoomVM = this.f52799OooO0o;
            OooO0OO.this.OooO0Oo(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52802OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000O0(MainRoomVM mainRoomVM) {
            super(1);
            this.f52802OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            ((MutableLiveData) oo0oO0.f48014OoooOOo.getValue()).postValue(Boolean.FALSE);
            MainRoomVM mainRoomVM = this.f52802OooO0Oo;
            mainRoomVM.setDialogShowBindYallaChatTips(false);
            mainRoomVM.setShowingPriorityType(null);
            OooO0OO.f52741OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o00000OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52804OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52805OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52806OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52805OooO0o0 = fragmentActivity;
            this.f52804OooO0o = mainRoomVM;
            this.f52806OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52806OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52805OooO0o0;
            MainRoomVM mainRoomVM = this.f52804OooO0o;
            OooO0OO.this.OooO0o0(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52808OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52809OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52810OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52809OooO0o0 = fragmentActivity;
            this.f52808OooO0o = mainRoomVM;
            this.f52810OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52810OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52809OooO0o0;
            MainRoomVM mainRoomVM = this.f52808OooO0o;
            OooO0OO.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52812OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52813OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52814OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O00(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52813OooO0o0 = fragmentActivity;
            this.f52812OooO0o = mainRoomVM;
            this.f52814OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52814OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52813OooO0o0;
            MainRoomVM mainRoomVM = this.f52812OooO0o;
            OooO0OO.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0O extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52815OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OfficialActionModel f52816OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000O0O(MainRoomVM mainRoomVM, OfficialActionModel officialActionModel) {
            super(1);
            this.f52815OooO0Oo = mainRoomVM;
            this.f52816OooO0o0 = officialActionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
            MainRoomVM mainRoomVM = this.f52815OooO0Oo;
            mainRoomVM.setDialogShowUserReturn(false);
            mainRoomVM.setShowingPriorityType(null);
            OfficialActionModel officialActionModel = this.f52816OooO0o0;
            officialActionModel.setShowPopUp(false);
            officialActionModel.refresh();
            OooO0OO.f52741OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52817OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000Ooo(MainRoomVM mainRoomVM) {
            super(1);
            this.f52817OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            MainRoomVM mainRoomVM = this.f52817OooO0Oo;
            mainRoomVM.setDialogShowWelcome(false);
            mainRoomVM.setShowingPriorityType(null);
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            ((MutableLiveData) oo0oO0.f47969OooO0OO.getValue()).postValue(Boolean.FALSE);
            OooO0OO.f52741OooO0O0.postValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class o0000oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52819OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52820OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52821OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0000oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52820OooO0o0 = fragmentActivity;
            this.f52819OooO0o = mainRoomVM;
            this.f52821OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52821OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52820OooO0o0;
            MainRoomVM mainRoomVM = this.f52819OooO0o;
            OooO0OO.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52823OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52824OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52825OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OO(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52824OooO0o0 = fragmentActivity;
            this.f52823OooO0o = mainRoomVM;
            this.f52825OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52825OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52824OooO0o0;
            MainRoomVM mainRoomVM = this.f52823OooO0o;
            OooO0OO.this.OooO0o(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52827OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52828OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52829OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52828OooO0o0 = fragmentActivity;
            this.f52827OooO0o = mainRoomVM;
            this.f52829OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52829OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52828OooO0o0;
            MainRoomVM mainRoomVM = this.f52827OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52832OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52832OooO0o0 = fragmentActivity;
            this.f52831OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52831OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52832OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52834OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52835OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52835OooO0o0 = fragmentActivity;
            this.f52834OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52834OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52835OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52837OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52838OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52838OooO0o0 = fragmentActivity;
            this.f52837OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52837OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52838OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52840OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52841OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52841OooO0o0 = fragmentActivity;
            this.f52840OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52840OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52841OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52843OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52844OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52844OooO0o0 = fragmentActivity;
            this.f52843OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52843OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52844OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52846OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52847OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52848OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52847OooO0o0 = fragmentActivity;
            this.f52846OooO0o = mainRoomVM;
            this.f52848OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52848OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52847OooO0o0;
            MainRoomVM mainRoomVM = this.f52846OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52850OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52851OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52851OooO0o0 = fragmentActivity;
            this.f52850OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52850OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52851OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52853OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52854OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52854OooO0o0 = fragmentActivity;
            this.f52853OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52853OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52854OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52856OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52857OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52857OooO0o0 = fragmentActivity;
            this.f52856OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52856OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52857OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52859OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52860OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52860OooO0o0 = fragmentActivity;
            this.f52859OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52859OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52860OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52862OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52863OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52863OooO0o0 = fragmentActivity;
            this.f52862OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52862OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52863OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52865OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52866OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(FragmentActivity fragmentActivity, int i) {
            super(2);
            this.f52866OooO0o0 = fragmentActivity;
            this.f52865OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52865OooO0o | 1);
            OooO0OO.this.OooO0O0(this.f52866OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f52868OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f52869OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52870OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, int i) {
            super(2);
            this.f52869OooO0o0 = fragmentActivity;
            this.f52868OooO0o = mainRoomVM;
            this.f52870OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52870OooO0oO | 1);
            FragmentActivity fragmentActivity = this.f52869OooO0o0;
            MainRoomVM mainRoomVM = this.f52868OooO0o;
            OooO0OO.this.OooO0OO(fragmentActivity, mainRoomVM, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1648694143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1648694143, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.CheckInTaskDialog (MainDialogUI.kt:203)");
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
        f52741OooO0O0.postValue(Boolean.FALSE);
        O0OO00 o0oo00 = new O0OO00(fragmentActivity);
        o0oo00.OooO00o(new OooO0O0(mainRoomVM));
        o0oo00.OooO();
        mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.CheckInTask);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new C0479OooO0OO(fragmentActivity, mainRoomVM, i));
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
            composerStartRestartGroup.startReplaceableGroup(867386097);
            oOOOOo0O.f59818OooO00o.OooO00o(composerStartRestartGroup, 6);
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
        if (mainRoomVM.getDialogShowWelcome()) {
            composerStartRestartGroup.startReplaceableGroup(867386230);
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
            mainRoomVM.setDialogShowCheckInTask(false);
            OooO0o0(activity, mainRoomVM, composerStartRestartGroup, 584);
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
        if (mainRoomVM.getDialogShowUserReturn()) {
            composerStartRestartGroup.startReplaceableGroup(867386501);
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
            if (mainRoomVM.getDialogShowWelcome()) {
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
            mainRoomVM.setDialogShowCheckInTask(false);
            OooO0o(activity, mainRoomVM, composerStartRestartGroup, 584);
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
        if (mainRoomVM.getDialogShowOfficialAction()) {
            composerStartRestartGroup.startReplaceableGroup(867386863);
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
            if (mainRoomVM.getDialogShowWelcome()) {
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
            if (mainRoomVM.getDialogShowUserReturn()) {
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
            mainRoomVM.setDialogShowCheckInTask(false);
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
        if (mainRoomVM.getDialogShowBindYallaChatTips()) {
            composerStartRestartGroup.startReplaceableGroup(867387322);
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
            if (mainRoomVM.getDialogShowWelcome()) {
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
            if (mainRoomVM.getDialogShowUserReturn()) {
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
            if (mainRoomVM.getDialogShowOfficialAction()) {
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
        if (!mainRoomVM.getDialogShowCheckInTask()) {
            composerStartRestartGroup.startReplaceableGroup(867388398);
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
        composerStartRestartGroup.startReplaceableGroup(867387823);
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
        if (mainRoomVM.getDialogShowWelcome()) {
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
        if (mainRoomVM.getDialogShowUserReturn()) {
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
        if (mainRoomVM.getDialogShowOfficialAction()) {
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
        if (mainRoomVM.getDialogShowBindYallaChatTips()) {
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
            ComposerKt.traceEventStart(-1838684820, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.OfficialActionDialog (MainDialogUI.kt:166)");
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
            f52741OooO0O0.postValue(Boolean.FALSE);
            r rVar = new r(fragmentActivity);
            rVar.OooO00o(new o000000(mainRoomVM, officialActionModel));
            rVar.f59916OooOOO0 = officialActionModel;
            AutoImage autoImage = ((o0OoOoOo) rVar.f59915OooOO0o.getValue()).f44664OooO0O0;
            autoImage.getClass();
            FragmentActivity fragmentActivity2 = rVar.f59914OooOO0O;
            Intrinsics.checkNotNullParameter(fragmentActivity2, "fragmentActivity");
            autoImage.f29812OooO0oO = fragmentActivity2;
            autoImage.f29808OooO = 16;
            autoImage.f29815OooOO0O = Boolean.TRUE;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            autoImage.f29814OooOO0 = scaleType;
            autoImage.f29813OooO0oo = p565o0oOo000.o0OOO0o.icon_picture_default;
            autoImage.OooO00o(com.code.android.util.o0OoOo0.OooOOO(officialActionModel.getPopUpImgUrl(), ""));
            h0.OooO0OO("301005", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            rVar.OooO();
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
            ComposerKt.traceEventStart(1829498902, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.ShowBindYallaChatTips (MainDialogUI.kt:220)");
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
        f52741OooO0O0.postValue(Boolean.FALSE);
        oOOo0O00 oooo0o00 = new oOOo0O00(fragmentActivity);
        oooo0o00.OooO00o(new o00000O0(mainRoomVM));
        oooo0o00.OooO();
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
    public final void OooO0o(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868604218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868604218, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.UserReturnDialog (MainDialogUI.kt:129)");
        }
        if (mainRoomVM.getShowingPriorityType() != null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0000O00(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup2.updateScope(new o0000oo(fragmentActivity, mainRoomVM, i));
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
                scopeUpdateScopeEndRestartGroup3.updateScope(new o0000O0(fragmentActivity, mainRoomVM, i));
                return;
            }
            f52741OooO0O0.postValue(Boolean.FALSE);
            s sVar = new s(fragmentActivity);
            sVar.OooO00o(new o0000O0O(mainRoomVM, userReturnModel));
            sVar.f59942OooOOO0 = userReturnModel;
            AutoImage autoImage = ((o0O000Oo) sVar.f59941OooOO0o.getValue()).f44419OooO0O0;
            autoImage.getClass();
            FragmentActivity fragmentActivity2 = sVar.f59940OooOO0O;
            Intrinsics.checkNotNullParameter(fragmentActivity2, "fragmentActivity");
            autoImage.f29812OooO0oO = fragmentActivity2;
            autoImage.f29808OooO = 16;
            autoImage.f29815OooOO0O = Boolean.TRUE;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            autoImage.f29814OooOO0 = scaleType;
            autoImage.f29813OooO0oo = p565o0oOo000.o0OOO0o.icon_picture_default;
            autoImage.OooO00o(com.code.android.util.o0OoOo0.OooOOO(userReturnModel.getPopUpImgUrl(), ""));
            h0.OooO0OO("301005", MapsKt.mapOf(TuplesKt.to("url", userReturnModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(userReturnModel.getType())), TuplesKt.to("activity", Integer.valueOf(userReturnModel.getActivityId()))));
            sVar.OooO();
            mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.UserReturn);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new o000OO(fragmentActivity, mainRoomVM, i));
    }

    @Composable
    public final void OooO0o0(FragmentActivity fragmentActivity, MainRoomVM mainRoomVM, Composer composer, int i) {
        Integer numValueOf;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1070611060);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070611060, i, -1, "com.yalla.yalla.ui.composable.main.MainDialogUI.ShowWelcomeDialog (MainDialogUI.kt:110)");
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
        f52741OooO0O0.postValue(Boolean.FALSE);
        MainDialogWelcome mainDialogWelcome = new MainDialogWelcome(fragmentActivity);
        mainDialogWelcome.OooO00o(new o0000Ooo(mainRoomVM));
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        String crystal = String.valueOf(oo0oO0.OooO0Oo().getValue());
        Intrinsics.checkNotNullParameter(crystal, "crystal");
        String strOooO00o = o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.welcome_reward), " x".concat(crystal));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, "x", 0, false, 6, (Object) null);
        if (p596o0oo000O.OooO0o.OooO0o0()) {
            i2 = iIndexOf$default + 2;
            numValueOf = Integer.valueOf(i2 + 1);
        } else {
            numValueOf = Integer.valueOf(iIndexOf$default);
            i2 = iIndexOf$default - 1;
        }
        SpannableString spannableString = new SpannableString(strOooO00o);
        Drawable drawableOooO0O0 = com.code.android.util.o0000.OooO0O0(p565o0oOo000.o0OOO0o.icon_crystal_task_item_min);
        int minimumHeight = drawableOooO0O0.getMinimumHeight();
        drawableOooO0O0.setBounds(0, 0, minimumHeight + 1, minimumHeight + 4);
        spannableString.setSpan(new ImageSpan(drawableOooO0O0), i2, numValueOf.intValue(), 17);
        ((o0O000o0) mainDialogWelcome.f27386OooOO0o.getValue()).f44424OooO0Oo.setText(spannableString);
        mainDialogWelcome.OooO();
        mainRoomVM.setShowingPriorityType(MainDialogManager$PriorityType.Welcome);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0000(fragmentActivity, mainRoomVM, i));
    }
}
