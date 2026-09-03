package p524o0o0O0oO;

import Oooo000.o00O00;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.main.MainVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.o0OoOo0;
import p023Oooo00O.o0ooOOo;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.oo00o;
import p031OoooO.o0000O;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p043OooooO0.o00;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o000OO00;
import p143o00OOooo.o00OOO0O;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p164o00OoOo0.o00OO0OO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p263o00ooo.o000OO0O;
import p499o0o00OoO.o0OO00O;
import p507o0o00oOO.o0000O0;
import p522o0o0O0o.o00O000o;
import p606o0oo0O.OooOo;
import p617o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OO0 {

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f43054Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f43055Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f43056Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O00o0 o00o00o1, MutableLiveData<Integer> mutableLiveData, int i) {
            super(2);
            this.f43054Oooo0o = o00o00o1;
            this.f43055Oooo0oO = mutableLiveData;
            this.f43056Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0OO0.OooO00o(this.f43054Oooo0o, this.f43055Oooo0oO, ooo00o, this.f43056Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f43057Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableLiveData<Integer> mutableLiveData) {
            super(0);
            this.f43057Oooo0o = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableLiveData<Integer> mutableLiveData = this.f43057Oooo0o;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(0);
            }
            OooOo.OooO0O0("101043");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f43058Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableLiveData<Integer> mutableLiveData) {
            super(0);
            this.f43058Oooo0o = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableLiveData<Integer> mutableLiveData = this.f43058Oooo0o;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(1);
            }
            OooOo.OooO0O0("101044");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f43059Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableLiveData<Integer> mutableLiveData) {
            super(0);
            this.f43059Oooo0o = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableLiveData<Integer> mutableLiveData = this.f43059Oooo0o;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(2);
            }
            OooOo.OooO0O0("101045");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f43060Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f43061Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableLiveData<Integer> mutableLiveData, o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f43060Oooo0o = mutableLiveData;
            this.f43061Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("101046");
            o0O0OOO0 onLogin = new o0O0OOO0(this.f43060Oooo0o, this.f43061Oooo0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f43062Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f43062Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f43062Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f43063Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f43063Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f43063Oooo0o.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f43064Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f43065Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f43066Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f43067Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f43068OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Integer f43069OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f43070OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f43071OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f43072OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f43073o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0O0O0O o0o0o0o, int i, int i2, String str, boolean z, Integer num, boolean z2, Function0<Unit> function0, int i3, int i4) {
            super(2);
            this.f43065Oooo0o = o0o0o0o;
            this.f43066Oooo0oO = i;
            this.f43067Oooo0oo = i2;
            this.f43064Oooo = str;
            this.f43070OoooO00 = z;
            this.f43069OoooO0 = num;
            this.f43071OoooO0O = z2;
            this.f43068OoooO = function0;
            this.f43072OoooOO0 = i3;
            this.f43073o000oOoO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0OO0.OooO0O0(this.f43065Oooo0o, this.f43066Oooo0oO, this.f43067Oooo0oo, this.f43064Oooo, this.f43070OoooO00, this.f43069OoooO0, this.f43071OoooO0O, this.f43068OoooO, ooo00o, this.f43072OoooOO0 | 1, this.f43073o000oOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f43074Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f43074Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f43074Oooo0o.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0177  */
    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00O00o0 o00o00o1, @Nullable MutableLiveData<Integer> mutableLiveData, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        boolean z;
        o0O00OO o0o00oo2;
        int iIntValue;
        int iIntValue2;
        Boolean bool;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(o00o00o1, "<this>");
        oOO00O composer = ooo00o.OooOOo(1830341856);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        composer.OooO0o0(2114310024);
        oO0Oo oo0ooOooO0O0 = mutableLiveData == null ? null : o00O00O.OooO0O0(mutableLiveData, composer);
        composer.Oooo0o0();
        Integer num3 = oo0ooOooO0O0 != null ? (Integer) oo0ooOooO0O0.getValue() : null;
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
        ViewModel viewModel = ViewModelKt.viewModel(MainVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
        composer.Oooo0o0();
        MainVM mainVM = (MainVM) viewModel;
        composer.OooO0o0(2114310087);
        composer.OooO0o0(-1800107778);
        int i2 = 1;
        if (Intrinsics.areEqual(Oooo0.OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0)), "BridgeContext")) {
            composer.Oooo0o0();
            z = false;
        } else {
            composer.Oooo0o0();
            z = true;
        }
        int i3 = 2;
        if (z) {
            Observable<Object> observable = LiveEventBus.get("EVENTMSG_TASK_TO_MAIN");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENTMSG_TASK_TO_MAIN)");
            o00O000o.OooO00o(observable, new o00OO0OO(mutableLiveData, i2), composer, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENTMSG_TASK_TO_MOMENTS)");
            o00O000o.OooO00o(observable2, new o00OOO0O(mutableLiveData, i3), composer, 72);
        }
        composer.Oooo0o0();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Boolean bool2 = (Boolean) o00O00O.OooO0O0(oooOOO.OooOooO(), composer).getValue();
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        composer.OooO0o0(2114310521);
        if (zBooleanValue) {
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
                StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "messageDot");
                sbOooO00o.append(oooOOO.OooOo().getValue());
                objOooO0o = o0OOO00.OooO0Oo(Boolean.valueOf(o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)));
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
        } else {
            o0o00oo2 = null;
        }
        composer.Oooo0o0();
        composer.OooO0o0(2114310673);
        if (zBooleanValue) {
            LiveData<Integer> unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
            oO0Oo oo0ooOooO0O1 = unreadMomentsMessageCount == null ? null : o00O00O.OooO0O0(unreadMomentsMessageCount, composer);
            if (oo0ooOooO0O1 == null || (num2 = (Integer) oo0ooOooO0O1.getValue()) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
        } else {
            iIntValue = 0;
        }
        composer.Oooo0o0();
        composer.OooO0o0(2114310843);
        if (zBooleanValue) {
            MediatorLiveData<Integer> unreadMessageCount = SharedMessageVM.INSTANCE.getUnreadMessageCount();
            oO0Oo oo0ooOooO0O2 = unreadMessageCount == null ? null : o00O00O.OooO0O0(unreadMessageCount, composer);
            if (oo0ooOooO0O2 == null || (num = (Integer) oo0ooOooO0O2.getValue()) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num.intValue();
            }
        } else {
            iIntValue2 = 0;
        }
        composer.Oooo0o0();
        composer.OooO0o0(2114311013);
        boolean zBooleanValue2 = (!zBooleanValue || (bool = (Boolean) o00O00O.OooO0O0(mainVM.getHaveNewFollowingPost(), composer).getValue()) == null) ? false : bool.booleanValue();
        composer.Oooo0o0();
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0o, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o);
        p048OoooooO.o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4170OooO;
        o0000oo.OooO0OO(49, o00o00o1.OooO00o(o00oooo0OooO0O0, o00oo0oo), composer, 6, 0);
        o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(SizeKt.OooO0o(oooO00o), o00oo0oo);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            p100o000oOoO.o00O00O.OooO00o();
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
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        o0O00OO o0o00oo3 = o0o00oo2;
        OooO0O0(rowScopeInstance, R.array.tab_room_select, R.array.tab_room_unselect, o00000.OooO0OO.OooO00o(R.string.room, composer), num3 != null && num3.intValue() == 0, null, false, new OooO00o(mutableLiveData), composer, 6, 48);
        OooO0O0(rowScopeInstance, R.array.tab_explore_select, R.array.tab_explore_unselect, o00000.OooO0OO.OooO00o(R.string.room_nav_explore, composer), num3 != null && num3.intValue() == 1, null, false, new OooO0O0(mutableLiveData), composer, 6, 48);
        OooO0O0(rowScopeInstance, R.array.tab_moments_select, R.array.tab_moments_unselect, o00000.OooO0OO.OooO00o(R.string.moments, composer), num3 != null && num3.intValue() == 2, Integer.valueOf(iIntValue), zBooleanValue2, new OooO0OO(mutableLiveData), composer, 6, 0);
        OooO0O0(rowScopeInstance, R.array.tab_message_select, R.array.tab_message_unselect, o00000.OooO0OO.OooO00o(R.string.tab_message, composer), num3 != null && num3.intValue() == 3, Integer.valueOf(iIntValue2), (o0o00oo3 != null ? ((Boolean) o0o00oo3.getValue()).booleanValue() : false) || iIntValue > 0, new OooO0o(mutableLiveData, o0o00oo3), composer, 6, 0);
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooO(o00o00o1, mutableLiveData, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01af  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x0202  */
    /* JADX WARN: Code duplicated, block: B:114:0x0205  */
    /* JADX WARN: Code duplicated, block: B:117:0x020b  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e  */
    /* JADX WARN: Code duplicated, block: B:121:0x021b  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0224  */
    /* JADX WARN: Code duplicated, block: B:126:0x0227  */
    /* JADX WARN: Code duplicated, block: B:127:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x022d  */
    /* JADX WARN: Code duplicated, block: B:129:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:131:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x0239  */
    /* JADX WARN: Code duplicated, block: B:134:0x023c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0242  */
    /* JADX WARN: Code duplicated, block: B:138:0x0245  */
    /* JADX WARN: Code duplicated, block: B:141:0x028c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0295  */
    /* JADX WARN: Code duplicated, block: B:144:0x0299  */
    /* JADX WARN: Code duplicated, block: B:147:0x0345  */
    /* JADX WARN: Code duplicated, block: B:149:0x034e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0352  */
    /* JADX WARN: Code duplicated, block: B:153:0x038d  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:173:0x041f  */
    /* JADX WARN: Code duplicated, block: B:176:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x0430  */
    /* JADX WARN: Code duplicated, block: B:180:0x0447  */
    /* JADX WARN: Code duplicated, block: B:183:0x044c  */
    /* JADX WARN: Code duplicated, block: B:185:0x045a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0498  */
    /* JADX WARN: Code duplicated, block: B:190:0x049d  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:193:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:196:0x0579  */
    /* JADX WARN: Code duplicated, block: B:197:0x0583  */
    /* JADX WARN: Code duplicated, block: B:202:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:206:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(o0O0O0O o0o0o0o, int i, int i2, String str, boolean z, Integer num, boolean z2, Function0<Unit> function0, oOO00O ooo00o, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Integer num2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        Integer num3;
        boolean z4;
        Object objOooO0o;
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
        o0O00OO o0o00oo2;
        o00OOOO0.OooO00o oooO00o;
        boolean zOooo0oo;
        Object objOooO0o2;
        o000000 o000000VarOooO00o;
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0;
        o0000O0O.OooO oooO;
        o0O0O0o0<LayoutDirection> o0o0o0o1;
        LayoutDirection layoutDirection;
        o0O0O0o0<o00OOOOo> o0o0o0o2;
        o00OOOOo o00ooooo2;
        int i12;
        Function0<o000000.OooO00o> function1;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        ?? r3;
        ?? r11;
        ?? r1;
        ?? r8;
        int i13;
        float f;
        oO0Oo oo0ooOooO00o;
        int i14;
        int iIntValue;
        float f2;
        oO0Oo oo0ooOooO00o2;
        o000000 o000000VarOooO00o2;
        o0000O0O.OooO oooO2;
        LayoutDirection layoutDirection2;
        o00OOOOo o00ooooo3;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1;
        RowScopeInstance rowScopeInstance;
        float f3;
        o0O0O00.OooOO0.OooO00o.OooO0OO oooO0OO;
        o000000 o000000VarOooO0Oo;
        o0000O0O.OooO oooO3;
        LayoutDirection layoutDirection3;
        o00OOOOo o00ooooo4;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2;
        boolean zOooo0oo2;
        Object objOooO0o3;
        Object objOooO0O0;
        oO0Oo oo0ooOooO00o3;
        Context context;
        int iIntValue2;
        o00OOOO0 o00oooo0OooOOO0;
        long jOooO0OO;
        Integer num4;
        boolean z5;
        boolean zOooo0oo3;
        Object objOooO0o4;
        Object objOooO0O1;
        Context context2;
        int iIntValue3;
        oo0ooO oo0oooOooOo;
        oOO00O composer = ooo00o.OooOOo(-40884513);
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composer.Oooo0oo(o0o0o0o) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 1) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composer.OooO(i) ? 32 : 16;
        }
        if ((i4 & 2) != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= composer.OooO(i2) ? 256 : 128;
        }
        if ((i4 & 4) == 0) {
            if ((i3 & 7168) == 0) {
                i5 |= composer.Oooo0oo(str) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
            }
            if ((i4 & 8) != 0) {
                i5 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (composer.OooO0OO(z)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i5 |= i6;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
                if ((458752 & i3) == 0) {
                    num2 = num;
                    if (composer.Oooo0oo(num2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    if ((3670016 & i3) == 0) {
                        z3 = z2;
                        if (composer.OooO0OO(z3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i5 |= i10;
                    }
                    if ((i4 & 64) != 0) {
                        if ((29360128 & i3) == 0) {
                            if (composer.Oooo0oo(function0)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                        }
                        if ((23967451 & i5) == 4793490 || !composer.OooOo0()) {
                            if (i7 != 0) {
                                num3 = null;
                            } else {
                                num3 = num2;
                            }
                            if (i9 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                            composer.OooO0o0(-492369756);
                            objOooO0o = composer.OooO0o();
                            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                            if (objOooO0o == c0323OooO00o) {
                                objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                                composer.Oooo00o(objOooO0o);
                            }
                            composer.Oooo0o0();
                            o0o00oo2 = (o0O00OO) objOooO0o;
                            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                            o00OOOO0 o00oooo0OooO00o = o0o0o0o.OooO00o(oooO00o, true);
                            composer.OooO0o0(1157296644);
                            zOooo0oo = composer.Oooo0oo(function0);
                            objOooO0o2 = composer.OooO0o();
                            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                                objOooO0o2 = new OooOO0(function0);
                                composer.Oooo00o(objOooO0o2);
                            }
                            composer.Oooo0o0();
                            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(o00oooo0OooO00o, false, false, null, (Function0) objOooO0o2, 253);
                            OoooooO.o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
                            composer.OooO0o0(-483455358);
                            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o2, composer);
                            composer.OooO0o0(-1323940314);
                            o0o0o0o0 = o000.f6356OooO0o0;
                            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            o0o0o0o1 = o000.f6360OooOO0O;
                            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            o0o0o0o2 = o000.f6364OooOOOO;
                            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                            i12 = i5;
                            function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
                            if (!(composer.OooOo0o() instanceof o00O000)) {
                                p100o000oOoO.o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function1);
                            } else {
                                composer.Oooo00O();
                            }
                            composer.OooOo0O();
                            Intrinsics.checkNotNullParameter(composer, "composer");
                            r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                            oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                            r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                            oO00000o.OooO0O0(composer, oooO, r11);
                            r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                            oO00000o.OooO0O0(composer, layoutDirection, r1);
                            r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-1163856341);
                            if (z) {
                                i13 = 30;
                            } else {
                                i13 = 25;
                            }
                            float f4 = i13;
                            if (z) {
                                f = 0.5f;
                            } else {
                                f = 1.0f;
                            }
                            oo0ooOooO00o = o0OoOo0.OooO00o(f4, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                            if (z) {
                                if (z4) {
                                    if (num3 != null) {
                                        iIntValue3 = num3.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    if (iIntValue3 <= 0) {
                                        i14 = -32;
                                    } else {
                                        i14 = -30;
                                    }
                                } else {
                                    i14 = -30;
                                }
                            } else if (z4) {
                                if (num3 != null) {
                                    iIntValue = num3.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (iIntValue <= 0) {
                                    i14 = -18;
                                } else {
                                    i14 = -14;
                                }
                            } else {
                                i14 = -14;
                            }
                            float f5 = i14;
                            if (z) {
                                f2 = 0.5f;
                            } else {
                                f2 = 1.0f;
                            }
                            oo0ooOooO00o2 = o0OoOo0.OooO00o(f5, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                            OoooooO.o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4183OooOOO0;
                            composer.OooO0o0(693286680);
                            o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
                            composer.OooO0o0(-1323940314);
                            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o);
                            if (!(composer.OooOo0o() instanceof o00O000)) {
                                p100o000oOoO.o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function1);
                            } else {
                                composer.Oooo00O();
                            }
                            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-678309503);
                            rowScopeInstance = RowScopeInstance.f5758OooO00o;
                            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                            o00OOOO0 o00oooo0OooO00o2 = rowScopeInstance.OooO00o(oooO00o, true);
                            f3 = 48;
                            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(o00oooo0OooO00o2, f3);
                            oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooO0oO, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                            composer.OooO0o0(733328855);
                            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                            composer.OooO0o0(-1323940314);
                            oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                            layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                            o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                            function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                            if (!(composer.OooOo0o() instanceof o00O000)) {
                                p100o000oOoO.o00O00O.OooO00o();
                                throw null;
                            }
                            composer.OooOo00();
                            if (composer.OooOOO0()) {
                                composer.OooOoO0(function1);
                            } else {
                                composer.Oooo00O();
                            }
                            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                            composer.OooO0o0(2058660585);
                            composer.OooO0o0(-2137368960);
                            if (z) {
                                composer.OooO0o0(-437273117);
                                long j = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                                composer.OooO0o0(1157296644);
                                zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                                objOooO0o4 = composer.OooO0o();
                                if (zOooo0oo3 || objOooO0o4 == c0323OooO00o) {
                                    objOooO0o4 = new OooOO0O(o0o00oo2);
                                    composer.Oooo00o(objOooO0o4);
                                }
                                composer.Oooo0o0();
                                Function0 function2 = (Function0) objOooO0o4;
                                objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                                if (objOooO0O1 == c0323OooO00o) {
                                    context2 = o0000O.f2657OooO00o;
                                    if (context2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                        context2 = null;
                                    }
                                    objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                    composer.Oooo00o(objOooO0O1);
                                }
                                composer.Oooo0o0();
                                oO0Oo oo0ooOooO00o4 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j, function2, composer, 40);
                                composer.Oooo0o0();
                                composer.Oooo0o0();
                                oo0ooOooO00o3 = oo0ooOooO00o4;
                            } else {
                                composer.OooO0o0(-437272918);
                                long j2 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 400L;
                                composer.OooO0o0(1157296644);
                                zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                                objOooO0o3 = composer.OooO0o();
                                if (zOooo0oo2 || objOooO0o3 == c0323OooO00o) {
                                    objOooO0o3 = new OooOOO0(o0o00oo2);
                                    composer.Oooo00o(objOooO0o3);
                                }
                                composer.Oooo0o0();
                                Function0 function4 = (Function0) objOooO0o3;
                                objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                                if (objOooO0O0 == c0323OooO00o) {
                                    context = o0000O.f2657OooO00o;
                                    if (context == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                        context = null;
                                    }
                                    objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                    composer.Oooo00o(objOooO0O0);
                                }
                                composer.Oooo0o0();
                                oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function4, composer, 40);
                                composer.Oooo0o0();
                                composer.Oooo0o0();
                            }
                            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                            if (num3 != null) {
                                iIntValue2 = num3.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            if (iIntValue2 > 0) {
                                o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                            } else {
                                o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                            }
                            p048OoooooO.o00OO0OO alignment = o00OO0O0.OooO00o.f4170OooO;
                            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                            Intrinsics.checkNotNullParameter(alignment, "alignment");
                            Function1<androidx.compose.ui.platform.o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
                            Function1<androidx.compose.ui.platform.o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
                            p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
                            Intrinsics.checkNotNullParameter(other, "other");
                            p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            composer.Oooo0o();
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(11);
                            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                            if (z) {
                                jOooO0OO = o00000OO.OooO0OO(4282993996L);
                            } else {
                                jOooO0OO = o00000OO.OooO0OO(4289311664L);
                            }
                            o000O0O0.OooO0OO(str, o00oooo0OooO, jOooO0OO, jOooO0OO2, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                            p028Oooo0o0.o0O0OO0.OooO00o(composer);
                            num4 = num3;
                            z5 = z4;
                        } else {
                            composer.OooOoo0();
                            num4 = num2;
                            z5 = z3;
                        }
                        oo0oooOooOo = composer.OooOo();
                        if (oo0oooOooOo == null) {
                            return;
                        }
                        oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
                    }
                    i11 = 12582912;
                    i5 |= i11;
                    if ((23967451 & i5) == 4793490) {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o3 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O1 = o000O0o.OooO0O0(o00oooo0OooO00o3, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o3 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o002 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o3, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f6 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f6, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f7 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f7, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O1, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o2);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o4 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO2 = SizeKt.OooO0oO(o00oooo0OooO00o4, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o2, null, o00oooo0OooO0oO2, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j3 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function8 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o5 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j3, function8, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o5;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function9 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function9, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment2 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment2, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function10 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function11 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other2 = new p028Oooo0o0.o00O00O(alignment2, false);
                        Intrinsics.checkNotNullParameter(other2, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other2, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO3 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO2, jOooO0OO, jOooO0OO3, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    } else {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o5 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O2 = o000O0o.OooO0O0(o00oooo0OooO00o5, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o4 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o003 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o4, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O2);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f8 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f8, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f9 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f9, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o3 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O2 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O2, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o3);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o3 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o6 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO3 = SizeKt.OooO0oO(o00oooo0OooO00o6, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o3, null, o00oooo0OooO0oO3, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j4 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function13 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o6 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j4, function13, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o6;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function14 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function14, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment3 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment3, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function15 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function16 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other3 = new p028Oooo0o0.o00O00O(alignment3, false);
                        Intrinsics.checkNotNullParameter(other3, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other3, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO4 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO3 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO3, jOooO0OO, jOooO0OO4, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    }
                    oo0oooOooOo = composer.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
                }
                i5 |= 1572864;
                z3 = z2;
                if ((i4 & 64) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composer.Oooo0oo(function0)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function17 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o7 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O3 = o000O0o.OooO0O0(o00oooo0OooO00o7, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o5 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o004 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o5, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O3);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f10 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f10, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f11 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f11, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o4 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O3 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O3, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o4);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o4 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o8 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO4 = SizeKt.OooO0oO(o00oooo0OooO00o8, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o4, null, o00oooo0OooO0oO4, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j5 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function18 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o7 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j5, function18, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o7;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function19 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function19, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment4 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment4, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function110 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function111 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other4 = new p028Oooo0o0.o00O00O(alignment4, false);
                        Intrinsics.checkNotNullParameter(other4, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other4, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO5 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO4 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO4, jOooO0OO, jOooO0OO5, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    } else {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function112 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o9 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O4 = o000O0o.OooO0O0(o00oooo0OooO00o9, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o6 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o005 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o6, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O4);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f12 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f12, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f13 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f13, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o5 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O4 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O4, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o5);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o5 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o10 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO5 = SizeKt.OooO0oO(o00oooo0OooO00o10, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o5, null, o00oooo0OooO0oO5, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j6 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function113 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o8 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j6, function113, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o8;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function114 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function114, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment5 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment5, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function115 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function116 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other5 = new p028Oooo0o0.o00O00O(alignment5, false);
                        Intrinsics.checkNotNullParameter(other5, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other5, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO6 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO5 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO5, jOooO0OO, jOooO0OO6, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    }
                    oo0oooOooOo = composer.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
                }
                i11 = 12582912;
                i5 |= i11;
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o11 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O5 = o000O0o.OooO0O0(o00oooo0OooO00o11, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o7 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o006 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o7, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O5);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f14 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f14, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f15 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f15, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o6 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O5 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O5, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o6);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o6 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o12 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO6 = SizeKt.OooO0oO(o00oooo0OooO00o12, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o6, null, o00oooo0OooO0oO6, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j7 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o9 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j7, function118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o9;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment6 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment6, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other6 = new p028Oooo0o0.o00O00O(alignment6, false);
                    Intrinsics.checkNotNullParameter(other6, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other6, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO7 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO6 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO6, jOooO0OO, jOooO0OO7, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o13 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O6 = o000O0o.OooO0O0(o00oooo0OooO00o13, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o8 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o007 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o8, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O6);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f16 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f16, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f17 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f17, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o7 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O6 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O6, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o7);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o7 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o14 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO7 = SizeKt.OooO0oO(o00oooo0OooO00o14, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o7, null, o00oooo0OooO0oO7, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j8 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function1113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o10 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j8, function1113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o10;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function1114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment7 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment7, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other7 = new p028Oooo0o0.o00O00O(alignment7, false);
                    Intrinsics.checkNotNullParameter(other7, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other7, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO8 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO7 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO7, jOooO0OO, jOooO0OO8, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i5 |= 196608;
            num2 = num;
            i9 = i4 & 32;
            if (i9 != 0) {
                if ((3670016 & i3) == 0) {
                    z3 = z2;
                    if (composer.OooO0OO(z3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i5 |= i10;
                }
                if ((i4 & 64) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composer.Oooo0oo(function0)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1117 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o15 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O7 = o000O0o.OooO0O0(o00oooo0OooO00o15, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o9 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o008 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o9, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O7);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f18 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f18, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f19 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f19, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o8 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O7 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O7, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o8);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o8 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o16 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO8 = SizeKt.OooO0oO(o00oooo0OooO00o16, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o8, null, o00oooo0OooO0oO8, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j9 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function1118 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o11 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j9, function1118, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o11;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function1119 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1119, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment8 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment8, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function11110 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other8 = new p028Oooo0o0.o00O00O(alignment8, false);
                        Intrinsics.checkNotNullParameter(other8, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other8, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO9 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO8 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO8, jOooO0OO, jOooO0OO9, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    } else {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11112 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o17 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O8 = o000O0o.OooO0O0(o00oooo0OooO00o17, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o10 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o009 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o10, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O8);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f110 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f110, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f111 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f111, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o9 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O8 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O8, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o9);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o9 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o18 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO9 = SizeKt.OooO0oO(o00oooo0OooO00o18, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o9, null, o00oooo0OooO0oO9, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j10 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function11113 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o12 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j10, function11113, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o12;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function11114 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11114, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment9 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment9, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function11115 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function11116 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other9 = new p028Oooo0o0.o00O00O(alignment9, false);
                        Intrinsics.checkNotNullParameter(other9, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other9, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO10 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO9 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO9, jOooO0OO, jOooO0OO10, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    }
                    oo0oooOooOo = composer.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
                }
                i11 = 12582912;
                i5 |= i11;
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o19 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O9 = o000O0o.OooO0O0(o00oooo0OooO00o19, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o11 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0010 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o11, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O9);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f112 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f112, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f113 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f113, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o10 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O9 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O9, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o10);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o10 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o110 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO10 = SizeKt.OooO0oO(o00oooo0OooO00o110, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o10, null, o00oooo0OooO0oO10, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j11 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function11118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o13 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j11, function11118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o13;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function11119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment10 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment10, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function111110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other10 = new p028Oooo0o0.o00O00O(alignment10, false);
                    Intrinsics.checkNotNullParameter(other10, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other10, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO11 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO10 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO10, jOooO0OO, jOooO0OO11, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o111 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O10 = o000O0o.OooO0O0(o00oooo0OooO00o111, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o12 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0011 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o12, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O10);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f114 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f114, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f115 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f115, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o11 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O10 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O10, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o11);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o11 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o112 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO11 = SizeKt.OooO0oO(o00oooo0OooO00o112, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o11, null, o00oooo0OooO0oO11, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j12 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function111113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o14 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j12, function111113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o14;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function111114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment11 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment11, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function111115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function111116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other11 = new p028Oooo0o0.o00O00O(alignment11, false);
                    Intrinsics.checkNotNullParameter(other11, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other11, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO12 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO11 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO11, jOooO0OO, jOooO0OO12, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i5 |= 1572864;
            z3 = z2;
            if ((i4 & 64) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composer.Oooo0oo(function0)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o113 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O11 = o000O0o.OooO0O0(o00oooo0OooO00o113, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o13 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0012 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o13, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O11);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f116 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f116, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f117 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f117, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o12 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O11 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O11, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o12);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o12 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o114 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO12 = SizeKt.OooO0oO(o00oooo0OooO00o114, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o12, null, o00oooo0OooO0oO12, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j13 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function111118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o15 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j13, function111118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o15;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function111119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment12 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment12, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other12 = new p028Oooo0o0.o00O00O(alignment12, false);
                    Intrinsics.checkNotNullParameter(other12, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other12, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO13 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO12 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO12, jOooO0OO, jOooO0OO13, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o115 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O12 = o000O0o.OooO0O0(o00oooo0OooO00o115, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o14 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0013 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o14, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O12);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f118 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f118, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f119 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f119, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o13 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O12 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O12, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o13);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o13 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o116 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO13 = SizeKt.OooO0oO(o00oooo0OooO00o116, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o13, null, o00oooo0OooO0oO13, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j14 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function1111113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o16 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j14, function1111113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o16;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function1111114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment13 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment13, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other13 = new p028Oooo0o0.o00O00O(alignment13, false);
                    Intrinsics.checkNotNullParameter(other13, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other13, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO14 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO13 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO13, jOooO0OO, jOooO0OO14, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i11 = 12582912;
            i5 |= i11;
            if ((23967451 & i5) == 4793490) {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111117 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o117 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O13 = o000O0o.OooO0O0(o00oooo0OooO00o117, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o15 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o0014 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o15, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O13);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f1110 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f1110, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f1111 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f1111, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o14 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O13 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O13, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o14);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o14 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o118 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO14 = SizeKt.OooO0oO(o00oooo0OooO00o118, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o14, null, o00oooo0OooO0oO14, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j15 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function1111118 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o17 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j15, function1111118, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o17;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function1111119 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111119, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment14 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment14, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111110 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other14 = new p028Oooo0o0.o00O00O(alignment14, false);
                Intrinsics.checkNotNullParameter(other14, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other14, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO15 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO14 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO14, jOooO0OO, jOooO0OO15, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            } else {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111112 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o119 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O14 = o000O0o.OooO0O0(o00oooo0OooO00o119, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o16 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o0015 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o16, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O14);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f1112 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f1112, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f1113 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f1113, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o15 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O14 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O14, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o15);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o15 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o1110 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO15 = SizeKt.OooO0oO(o00oooo0OooO00o1110, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o15, null, o00oooo0OooO0oO15, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j16 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function11111113 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o18 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j16, function11111113, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o18;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function11111114 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111114, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment15 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment15, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111115 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111116 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other15 = new p028Oooo0o0.o00O00O(alignment15, false);
                Intrinsics.checkNotNullParameter(other15, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other15, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO16 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO15 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO15, jOooO0OO, jOooO0OO16, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
        }
        i5 |= 3072;
        if ((i4 & 8) != 0) {
            i5 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (composer.OooO0OO(z)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i5 |= i6;
        }
        i7 = i4 & 16;
        if (i7 != 0) {
            if ((458752 & i3) == 0) {
                num2 = num;
                if (composer.Oooo0oo(num2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                if ((3670016 & i3) == 0) {
                    z3 = z2;
                    if (composer.OooO0OO(z3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i5 |= i10;
                }
                if ((i4 & 64) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composer.Oooo0oo(function0)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                    }
                    if ((23967451 & i5) == 4793490) {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111117 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o1111 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O15 = o000O0o.OooO0O0(o00oooo0OooO00o1111, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o17 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o0016 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o17, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O15);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f1114 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f1114, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f1115 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f1115, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o16 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O15 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O15, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o16);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o16 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o1112 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO16 = SizeKt.OooO0oO(o00oooo0OooO00o1112, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o16, null, o00oooo0OooO0oO16, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j17 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function11111118 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o19 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j17, function11111118, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o19;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function11111119 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111119, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment16 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment16, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111110 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other16 = new p028Oooo0o0.o00O00O(alignment16, false);
                        Intrinsics.checkNotNullParameter(other16, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other16, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO17 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO16 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO16, jOooO0OO, jOooO0OO17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    } else {
                        if (i7 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i9 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111112 = oo0o0O0.f29705OooO00o;
                        composer.OooO0o0(-492369756);
                        objOooO0o = composer.OooO0o();
                        c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                        if (objOooO0o == c0323OooO00o) {
                            objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                            composer.Oooo00o(objOooO0o);
                        }
                        composer.Oooo0o0();
                        o0o00oo2 = (o0O00OO) objOooO0o;
                        oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO00o1113 = o0o0o0o.OooO00o(oooO00o, true);
                        composer.OooO0o0(1157296644);
                        zOooo0oo = composer.Oooo0oo(function0);
                        objOooO0o2 = composer.OooO0o();
                        if (zOooo0oo) {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        } else {
                            objOooO0o2 = new OooOO0(function0);
                            composer.Oooo00o(objOooO0o2);
                        }
                        composer.Oooo0o0();
                        o00OOOO0 o00oooo0OooO0O16 = o000O0o.OooO0O0(o00oooo0OooO00o1113, false, false, null, (Function0) objOooO0o2, 253);
                        OoooooO.o00OO0OO.OooO00o oooO00o18 = o00OO0O0.OooO00o.f4184OooOOOO;
                        composer.OooO0o0(-483455358);
                        p028Oooo0o0.o00O000 o00o0017 = p028Oooo0o0.o00O000.f2029OooO00o;
                        o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o18, composer);
                        composer.OooO0o0(-1323940314);
                        o0o0o0o0 = o000.f6356OooO0o0;
                        oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        o0o0o0o1 = o000.f6360OooOO0O;
                        layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o0o0o0o2 = o000.f6364OooOOOO;
                        o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        i12 = i5;
                        function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O16);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        composer.OooOo0O();
                        Intrinsics.checkNotNullParameter(composer, "composer");
                        r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                        oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                        r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                        oO00000o.OooO0O0(composer, oooO, r11);
                        r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                        oO00000o.OooO0O0(composer, layoutDirection, r1);
                        r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-1163856341);
                        if (z) {
                            i13 = 30;
                        } else {
                            i13 = 25;
                        }
                        float f1116 = i13;
                        if (z) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        oo0ooOooO00o = o0OoOo0.OooO00o(f1116, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                        if (z) {
                            if (z4) {
                                i14 = -30;
                            } else {
                                if (num3 != null) {
                                    iIntValue3 = num3.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                if (iIntValue3 <= 0) {
                                    i14 = -32;
                                } else {
                                    i14 = -30;
                                }
                            }
                        } else if (z4) {
                            i14 = -14;
                        } else {
                            if (num3 != null) {
                                iIntValue = num3.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue <= 0) {
                                i14 = -18;
                            } else {
                                i14 = -14;
                            }
                        }
                        float f1117 = i14;
                        if (z) {
                            f2 = 0.5f;
                        } else {
                            f2 = 1.0f;
                        }
                        oo0ooOooO00o2 = o0OoOo0.OooO00o(f1117, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                        o00OOOO0 o00oooo0OooO0o17 = SizeKt.OooO0o(oooO00o);
                        OoooooO.o00OO0OO.OooO0O0 oooO0O16 = o00OO0O0.OooO00o.f4183OooOOO0;
                        composer.OooO0o0(693286680);
                        o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O16, composer);
                        composer.OooO0o0(-1323940314);
                        oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o17);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-678309503);
                        rowScopeInstance = RowScopeInstance.f5758OooO00o;
                        o000OO0O o000oo0oOooO00o17 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                        o00OOOO0 o00oooo0OooO00o1114 = rowScopeInstance.OooO00o(oooO00o, true);
                        f3 = 48;
                        o00OOOO0 o00oooo0OooO0oO17 = SizeKt.OooO0oO(o00oooo0OooO00o1114, f3);
                        oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                        Oooo0.o00.OooO00o(o000oo0oOooO00o17, null, o00oooo0OooO0oO17, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.OooO0o0(733328855);
                        o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                        layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                        o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                        function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                        if (!(composer.OooOo0o() instanceof o00O000)) {
                            p100o000oOoO.o00O00O.OooO00o();
                            throw null;
                        }
                        composer.OooOo00();
                        if (composer.OooOOO0()) {
                            composer.OooOoO0(function1);
                        } else {
                            composer.Oooo00O();
                        }
                        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (z) {
                            composer.OooO0o0(-437273117);
                            long j18 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                            composer.OooO0o0(1157296644);
                            zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o4 = composer.OooO0o();
                            if (zOooo0oo3) {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            } else {
                                objOooO0o4 = new OooOO0O(o0o00oo2);
                                composer.Oooo00o(objOooO0o4);
                            }
                            composer.Oooo0o0();
                            Function0 function111111113 = (Function0) objOooO0o4;
                            objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                            if (objOooO0O1 == c0323OooO00o) {
                                context2 = o0000O.f2657OooO00o;
                                if (context2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context2 = null;
                                }
                                objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                                composer.Oooo00o(objOooO0O1);
                            }
                            composer.Oooo0o0();
                            oO0Oo oo0ooOooO00o110 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j18, function111111113, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = oo0ooOooO00o110;
                        } else {
                            composer.OooO0o0(-437272918);
                            if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                            }
                            composer.OooO0o0(1157296644);
                            zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                            objOooO0o3 = composer.OooO0o();
                            if (zOooo0oo2) {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            } else {
                                objOooO0o3 = new OooOOO0(o0o00oo2);
                                composer.Oooo00o(objOooO0o3);
                            }
                            composer.Oooo0o0();
                            Function0 function111111114 = (Function0) objOooO0o3;
                            objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                            if (objOooO0O0 == c0323OooO00o) {
                                context = o0000O.f2657OooO00o;
                                if (context == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    context = null;
                                }
                                objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                                composer.Oooo00o(objOooO0O0);
                            }
                            composer.Oooo0o0();
                            oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111114, composer, 40);
                            composer.Oooo0o0();
                            composer.Oooo0o0();
                        }
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue2 > 0) {
                            o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                        } else {
                            o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                        }
                        p048OoooooO.o00OO0OO alignment17 = o00OO0O0.OooO00o.f4170OooO;
                        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                        Intrinsics.checkNotNullParameter(alignment17, "alignment");
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111115 = o00oOoo.f6560OooO00o;
                        Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111116 = o00oOoo.f6560OooO00o;
                        p028Oooo0o0.o00O00O other17 = new p028Oooo0o0.o00O00O(alignment17, false);
                        Intrinsics.checkNotNullParameter(other17, "other");
                        p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other17, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        long jOooO0OO18 = o0000O0O.o00Oo0.OooO0OO(11);
                        o00OOOO0 o00oooo0OooO17 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                        if (z) {
                            jOooO0OO = o00000OO.OooO0OO(4282993996L);
                        } else {
                            jOooO0OO = o00000OO.OooO0OO(4289311664L);
                        }
                        o000O0O0.OooO0OO(str, o00oooo0OooO17, jOooO0OO, jOooO0OO18, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                        p028Oooo0o0.o0O0OO0.OooO00o(composer);
                        num4 = num3;
                        z5 = z4;
                    }
                    oo0oooOooOo = composer.OooOo();
                    if (oo0oooOooOo == null) {
                        return;
                    }
                    oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
                }
                i11 = 12582912;
                i5 |= i11;
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o1115 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O17 = o000O0o.OooO0O0(o00oooo0OooO00o1115, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o19 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0018 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o19, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O17);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f1118 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f1118, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f1119 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f1119, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o18 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O17 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O17, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o18);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o18 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o1116 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO18 = SizeKt.OooO0oO(o00oooo0OooO00o1116, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o18, null, o00oooo0OooO0oO18, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j19 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function111111118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o111 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j19, function111111118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o111;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function111111119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment18 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment18, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other18 = new p028Oooo0o0.o00O00O(alignment18, false);
                    Intrinsics.checkNotNullParameter(other18, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other18, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO19 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO18 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO18, jOooO0OO, jOooO0OO19, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o1117 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O18 = o000O0o.OooO0O0(o00oooo0OooO00o1117, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o110 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o0019 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o110, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O18);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f11110 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f11110, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f11111 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f11111, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o19 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O18 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O18, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o19);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o19 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o1118 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO19 = SizeKt.OooO0oO(o00oooo0OooO00o1118, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o19, null, o00oooo0OooO0oO19, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j110 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o112 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j110, function1111111113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o112;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111111114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment19 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment19, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other19 = new p028Oooo0o0.o00O00O(alignment19, false);
                    Intrinsics.checkNotNullParameter(other19, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other19, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO110 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO19 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO19, jOooO0OO, jOooO0OO110, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i5 |= 1572864;
            z3 = z2;
            if ((i4 & 64) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composer.Oooo0oo(function0)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o1119 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O19 = o000O0o.OooO0O0(o00oooo0OooO00o1119, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o111 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o00110 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o111, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O19);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f11112 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f11112, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f11113 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f11113, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o110 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O19 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O19, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o110);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o110 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o11110 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO110 = SizeKt.OooO0oO(o00oooo0OooO00o11110, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o110, null, o00oooo0OooO0oO110, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j111 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o113 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j111, function1111111118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o113;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111111119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment110 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment110, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other110 = new p028Oooo0o0.o00O00O(alignment110, false);
                    Intrinsics.checkNotNullParameter(other110, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other110, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO111 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO110 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO110, jOooO0OO, jOooO0OO111, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o11111 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O110 = o000O0o.OooO0O0(o00oooo0OooO00o11111, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o112 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o00111 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o112, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O110);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f11114 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f11114, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f11115 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f11115, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o111 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O110 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O110, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o111);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o111 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o11112 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO111 = SizeKt.OooO0oO(o00oooo0OooO00o11112, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o111, null, o00oooo0OooO0oO111, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j112 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function11111111113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o114 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j112, function11111111113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o114;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function11111111114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111111114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment111 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment111, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other111 = new p028Oooo0o0.o00O00O(alignment111, false);
                    Intrinsics.checkNotNullParameter(other111, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other111, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO112 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO111 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO111, jOooO0OO, jOooO0OO112, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i11 = 12582912;
            i5 |= i11;
            if ((23967451 & i5) == 4793490) {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111117 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o11113 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O111 = o000O0o.OooO0O0(o00oooo0OooO00o11113, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o113 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00112 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o113, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O111);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f11116 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f11116, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f11117 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f11117, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o112 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O111 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O111, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o112);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o112 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o11114 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO112 = SizeKt.OooO0oO(o00oooo0OooO00o11114, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o112, null, o00oooo0OooO0oO112, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j113 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111118 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o115 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j113, function11111111118, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o115;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111119 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111111119, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment112 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment112, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111110 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111111 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other112 = new p028Oooo0o0.o00O00O(alignment112, false);
                Intrinsics.checkNotNullParameter(other112, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other112, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO113 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO112 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO112, jOooO0OO, jOooO0OO113, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            } else {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111112 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o11115 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O112 = o000O0o.OooO0O0(o00oooo0OooO00o11115, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o114 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00113 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o114, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O112);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f11118 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f11118, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f11119 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f11119, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o113 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O112 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O112, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o113);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o113 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o11116 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO113 = SizeKt.OooO0oO(o00oooo0OooO00o11116, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o113, null, o00oooo0OooO0oO113, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j114 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function111111111113 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o116 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j114, function111111111113, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o116;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function111111111114 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111111114, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment113 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment113, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111115 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111116 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other113 = new p028Oooo0o0.o00O00O(alignment113, false);
                Intrinsics.checkNotNullParameter(other113, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other113, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO114 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO113 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO113, jOooO0OO, jOooO0OO114, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
        }
        i5 |= 196608;
        num2 = num;
        i9 = i4 & 32;
        if (i9 != 0) {
            if ((3670016 & i3) == 0) {
                z3 = z2;
                if (composer.OooO0OO(z3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i5 |= i10;
            }
            if ((i4 & 64) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composer.Oooo0oo(function0)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111117 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o11117 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O113 = o000O0o.OooO0O0(o00oooo0OooO00o11117, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o115 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o00114 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o115, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O113);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f111110 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f111110, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f111111 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f111111, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o114 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O113 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O113, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o114);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o114 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o11118 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO114 = SizeKt.OooO0oO(o00oooo0OooO00o11118, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o114, null, o00oooo0OooO0oO114, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j115 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function111111111118 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o117 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j115, function111111111118, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o117;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function111111111119 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111111119, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment114 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment114, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111110 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111111 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other114 = new p028Oooo0o0.o00O00O(alignment114, false);
                    Intrinsics.checkNotNullParameter(other114, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other114, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO115 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO114 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO114, jOooO0OO, jOooO0OO115, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                } else {
                    if (i7 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111112 = oo0o0O0.f29705OooO00o;
                    composer.OooO0o0(-492369756);
                    objOooO0o = composer.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                        composer.Oooo00o(objOooO0o);
                    }
                    composer.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO00o11119 = o0o0o0o.OooO00o(oooO00o, true);
                    composer.OooO0o0(1157296644);
                    zOooo0oo = composer.Oooo0oo(function0);
                    objOooO0o2 = composer.OooO0o();
                    if (zOooo0oo) {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    } else {
                        objOooO0o2 = new OooOO0(function0);
                        composer.Oooo00o(objOooO0o2);
                    }
                    composer.Oooo0o0();
                    o00OOOO0 o00oooo0OooO0O114 = o000O0o.OooO0O0(o00oooo0OooO00o11119, false, false, null, (Function0) objOooO0o2, 253);
                    OoooooO.o00OO0OO.OooO00o oooO00o116 = o00OO0O0.OooO00o.f4184OooOOOO;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o00115 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o116, composer);
                    composer.OooO0o0(-1323940314);
                    o0o0o0o0 = o000.f6356OooO0o0;
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    o0o0o0o1 = o000.f6360OooOO0O;
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o0o0o0o2 = o000.f6364OooOOOO;
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    i12 = i5;
                    function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O114);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    composer.OooOo0O();
                    Intrinsics.checkNotNullParameter(composer, "composer");
                    r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                    oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                    r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                    oO00000o.OooO0O0(composer, oooO, r11);
                    r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                    oO00000o.OooO0O0(composer, layoutDirection, r1);
                    r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                    ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-1163856341);
                    if (z) {
                        i13 = 30;
                    } else {
                        i13 = 25;
                    }
                    float f111112 = i13;
                    if (z) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    oo0ooOooO00o = o0OoOo0.OooO00o(f111112, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                    if (z) {
                        if (z4) {
                            i14 = -30;
                        } else {
                            if (num3 != null) {
                                iIntValue3 = num3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 <= 0) {
                                i14 = -32;
                            } else {
                                i14 = -30;
                            }
                        }
                    } else if (z4) {
                        i14 = -14;
                    } else {
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue <= 0) {
                            i14 = -18;
                        } else {
                            i14 = -14;
                        }
                    }
                    float f111113 = i14;
                    if (z) {
                        f2 = 0.5f;
                    } else {
                        f2 = 1.0f;
                    }
                    oo0ooOooO00o2 = o0OoOo0.OooO00o(f111113, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                    o00OOOO0 o00oooo0OooO0o115 = SizeKt.OooO0o(oooO00o);
                    OoooooO.o00OO0OO.OooO0O0 oooO0O114 = o00OO0O0.OooO00o.f4183OooOOO0;
                    composer.OooO0o0(693286680);
                    o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O114, composer);
                    composer.OooO0o0(-1323940314);
                    oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o115);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    rowScopeInstance = RowScopeInstance.f5758OooO00o;
                    o000OO0O o000oo0oOooO00o115 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                    o00OOOO0 o00oooo0OooO00o111110 = rowScopeInstance.OooO00o(oooO00o, true);
                    f3 = 48;
                    o00OOOO0 o00oooo0OooO0oO115 = SizeKt.OooO0oO(o00oooo0OooO00o111110, f3);
                    oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o115, null, o00oooo0OooO0oO115, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.OooO0o0(733328855);
                    o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                    composer.OooO0o0(-1323940314);
                    oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                    if (!(composer.OooOo0o() instanceof o00O000)) {
                        p100o000oOoO.o00O00O.OooO00o();
                        throw null;
                    }
                    composer.OooOo00();
                    if (composer.OooOOO0()) {
                        composer.OooOoO0(function1);
                    } else {
                        composer.Oooo00O();
                    }
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    if (z) {
                        composer.OooO0o0(-437273117);
                        long j116 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                        composer.OooO0o0(1157296644);
                        zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o4 = composer.OooO0o();
                        if (zOooo0oo3) {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        } else {
                            objOooO0o4 = new OooOO0O(o0o00oo2);
                            composer.Oooo00o(objOooO0o4);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111111113 = (Function0) objOooO0o4;
                        objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                        if (objOooO0O1 == c0323OooO00o) {
                            context2 = o0000O.f2657OooO00o;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context2 = null;
                            }
                            objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                            composer.Oooo00o(objOooO0O1);
                        }
                        composer.Oooo0o0();
                        oO0Oo oo0ooOooO00o118 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j116, function1111111111113, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = oo0ooOooO00o118;
                    } else {
                        composer.OooO0o0(-437272918);
                        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                        }
                        composer.OooO0o0(1157296644);
                        zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                        objOooO0o3 = composer.OooO0o();
                        if (zOooo0oo2) {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        } else {
                            objOooO0o3 = new OooOOO0(o0o00oo2);
                            composer.Oooo00o(objOooO0o3);
                        }
                        composer.Oooo0o0();
                        Function0 function1111111111114 = (Function0) objOooO0o3;
                        objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                        if (objOooO0O0 == c0323OooO00o) {
                            context = o0000O.f2657OooO00o;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                context = null;
                            }
                            objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                            composer.Oooo00o(objOooO0O0);
                        }
                        composer.Oooo0o0();
                        oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111111111114, composer, 40);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 > 0) {
                        o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                    } else {
                        o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                    }
                    p048OoooooO.o00OO0OO alignment115 = o00OO0O0.OooO00o.f4170OooO;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment115, "alignment");
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111115 = o00oOoo.f6560OooO00o;
                    Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111116 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other115 = new p028Oooo0o0.o00O00O(alignment115, false);
                    Intrinsics.checkNotNullParameter(other115, "other");
                    p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other115, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    long jOooO0OO116 = o0000O0O.o00Oo0.OooO0OO(11);
                    o00OOOO0 o00oooo0OooO115 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                    if (z) {
                        jOooO0OO = o00000OO.OooO0OO(4282993996L);
                    } else {
                        jOooO0OO = o00000OO.OooO0OO(4289311664L);
                    }
                    o000O0O0.OooO0OO(str, o00oooo0OooO115, jOooO0OO, jOooO0OO116, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                    p028Oooo0o0.o0O0OO0.OooO00o(composer);
                    num4 = num3;
                    z5 = z4;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
            }
            i11 = 12582912;
            i5 |= i11;
            if ((23967451 & i5) == 4793490) {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111117 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o111111 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O115 = o000O0o.OooO0O0(o00oooo0OooO00o111111, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o117 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00116 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o117, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O115);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f111114 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f111114, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f111115 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f111115, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o116 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O115 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O115, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o116);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o116 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o111112 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO116 = SizeKt.OooO0oO(o00oooo0OooO00o111112, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o116, null, o00oooo0OooO0oO116, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j117 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function1111111111118 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o119 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j117, function1111111111118, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o119;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function1111111111119 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111111111119, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment116 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment116, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111111110 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111111111 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other116 = new p028Oooo0o0.o00O00O(alignment116, false);
                Intrinsics.checkNotNullParameter(other116, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other116, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO117 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO116 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO116, jOooO0OO, jOooO0OO117, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            } else {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111111112 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o111113 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O116 = o000O0o.OooO0O0(o00oooo0OooO00o111113, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o118 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00117 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o118, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O116);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f111116 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f111116, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f111117 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f111117, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o117 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O116 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O116, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o117);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o117 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o111114 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO117 = SizeKt.OooO0oO(o00oooo0OooO00o111114, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o117, null, o00oooo0OooO0oO117, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j118 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111111113 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o1110 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j118, function11111111111113, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o1110;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111111114 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111111111114, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment117 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment117, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111111115 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function11111111111116 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other117 = new p028Oooo0o0.o00O00O(alignment117, false);
                Intrinsics.checkNotNullParameter(other117, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other117, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO118 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO117 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO117, jOooO0OO, jOooO0OO118, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
        }
        i5 |= 1572864;
        z3 = z2;
        if ((i4 & 64) != 0) {
            if ((29360128 & i3) == 0) {
                if (composer.Oooo0oo(function0)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
            }
            if ((23967451 & i5) == 4793490) {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function11111111111117 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o111115 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O117 = o000O0o.OooO0O0(o00oooo0OooO00o111115, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o119 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00118 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o119, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O117);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f111118 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f111118, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f111119 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f111119, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o118 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O117 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O117, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o118);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o118 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o111116 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO118 = SizeKt.OooO0oO(o00oooo0OooO00o111116, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o118, null, o00oooo0OooO0oO118, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j119 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111111118 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o1111 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j119, function11111111111118, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o1111;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function11111111111119 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function11111111111119, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment118 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment118, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111111110 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111111111 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other118 = new p028Oooo0o0.o00O00O(alignment118, false);
                Intrinsics.checkNotNullParameter(other118, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other118, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO119 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO118 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO118, jOooO0OO, jOooO0OO119, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            } else {
                if (i7 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111111112 = oo0o0O0.f29705OooO00o;
                composer.OooO0o0(-492369756);
                objOooO0o = composer.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO00o111117 = o0o0o0o.OooO00o(oooO00o, true);
                composer.OooO0o0(1157296644);
                zOooo0oo = composer.Oooo0oo(function0);
                objOooO0o2 = composer.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooOO0(function0);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o00OOOO0 o00oooo0OooO0O118 = o000O0o.OooO0O0(o00oooo0OooO00o111117, false, false, null, (Function0) objOooO0o2, 253);
                OoooooO.o00OO0OO.OooO00o oooO00o1110 = o00OO0O0.OooO00o.f4184OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o00119 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o1110, composer);
                composer.OooO0o0(-1323940314);
                o0o0o0o0 = o000.f6356OooO0o0;
                oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0o0o0o1 = o000.f6360OooOO0O;
                layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0o0o0o2 = o000.f6364OooOOOO;
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                i12 = i5;
                function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O118);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
                r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r11);
                r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r1);
                r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                if (z) {
                    i13 = 30;
                } else {
                    i13 = 25;
                }
                float f1111110 = i13;
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                oo0ooOooO00o = o0OoOo0.OooO00o(f1111110, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
                if (z) {
                    if (z4) {
                        i14 = -30;
                    } else {
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 <= 0) {
                            i14 = -32;
                        } else {
                            i14 = -30;
                        }
                    }
                } else if (z4) {
                    i14 = -14;
                } else {
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 0) {
                        i14 = -18;
                    } else {
                        i14 = -14;
                    }
                }
                float f1111111 = i14;
                if (z) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                oo0ooOooO00o2 = o0OoOo0.OooO00o(f1111111, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
                o00OOOO0 o00oooo0OooO0o119 = SizeKt.OooO0o(oooO00o);
                OoooooO.o00OO0OO.OooO0O0 oooO0O118 = o00OO0O0.OooO00o.f4183OooOOO0;
                composer.OooO0o0(693286680);
                o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O118, composer);
                composer.OooO0o0(-1323940314);
                oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o119);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                rowScopeInstance = RowScopeInstance.f5758OooO00o;
                o000OO0O o000oo0oOooO00o119 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
                o00OOOO0 o00oooo0OooO00o111118 = rowScopeInstance.OooO00o(oooO00o, true);
                f3 = 48;
                o00OOOO0 o00oooo0OooO0oO119 = SizeKt.OooO0oO(o00oooo0OooO00o111118, f3);
                oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
                Oooo0.o00.OooO00o(o000oo0oOooO00o119, null, o00oooo0OooO0oO119, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.OooO0o0(733328855);
                o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    p100o000oOoO.o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function1);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                if (z) {
                    composer.OooO0o0(-437273117);
                    long j1110 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                    composer.OooO0o0(1157296644);
                    zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o4 = composer.OooO0o();
                    if (zOooo0oo3) {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    } else {
                        objOooO0o4 = new OooOO0O(o0o00oo2);
                        composer.Oooo00o(objOooO0o4);
                    }
                    composer.Oooo0o0();
                    Function0 function111111111111113 = (Function0) objOooO0o4;
                    objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                    if (objOooO0O1 == c0323OooO00o) {
                        context2 = o0000O.f2657OooO00o;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context2 = null;
                        }
                        objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                        composer.Oooo00o(objOooO0O1);
                    }
                    composer.Oooo0o0();
                    oO0Oo oo0ooOooO00o1112 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j1110, function111111111111113, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = oo0ooOooO00o1112;
                } else {
                    composer.OooO0o0(-437272918);
                    if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    }
                    composer.OooO0o0(1157296644);
                    zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                    objOooO0o3 = composer.OooO0o();
                    if (zOooo0oo2) {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    } else {
                        objOooO0o3 = new OooOOO0(o0o00oo2);
                        composer.Oooo00o(objOooO0o3);
                    }
                    composer.Oooo0o0();
                    Function0 function111111111111114 = (Function0) objOooO0o3;
                    objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                    if (objOooO0O0 == c0323OooO00o) {
                        context = o0000O.f2657OooO00o;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                            context = null;
                        }
                        objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                        composer.Oooo00o(objOooO0O0);
                    }
                    composer.Oooo0o0();
                    oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111111111114, composer, 40);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                }
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (iIntValue2 > 0) {
                    o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
                } else {
                    o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
                }
                p048OoooooO.o00OO0OO alignment119 = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment119, "alignment");
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111111115 = o00oOoo.f6560OooO00o;
                Function1<androidx.compose.ui.platform.o00O000o, Unit> function111111111111116 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other119 = new p028Oooo0o0.o00O00O(alignment119, false);
                Intrinsics.checkNotNullParameter(other119, "other");
                p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other119, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                long jOooO0OO1110 = o0000O0O.o00Oo0.OooO0OO(11);
                o00OOOO0 o00oooo0OooO119 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
                if (z) {
                    jOooO0OO = o00000OO.OooO0OO(4282993996L);
                } else {
                    jOooO0OO = o00000OO.OooO0OO(4289311664L);
                }
                o000O0O0.OooO0OO(str, o00oooo0OooO119, jOooO0OO, jOooO0OO1110, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
                p028Oooo0o0.o0O0OO0.OooO00o(composer);
                num4 = num3;
                z5 = z4;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
        }
        i11 = 12582912;
        i5 |= i11;
        if ((23967451 & i5) == 4793490) {
            if (i7 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function111111111111117 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO00o111119 = o0o0o0o.OooO00o(oooO00o, true);
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(function0);
            objOooO0o2 = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = new OooOO0(function0);
                composer.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = new OooOO0(function0);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O119 = o000O0o.OooO0O0(o00oooo0OooO00o111119, false, false, null, (Function0) objOooO0o2, 253);
            OoooooO.o00OO0OO.OooO00o oooO00o1111 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001110 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o1111, composer);
            composer.OooO0o0(-1323940314);
            o0o0o0o0 = o000.f6356OooO0o0;
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0o0o0o1 = o000.f6360OooOO0O;
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0o0o0o2 = o000.f6364OooOOOO;
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            i12 = i5;
            function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O119);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
            r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r11);
            r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r1);
            r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            if (z) {
                i13 = 30;
            } else {
                i13 = 25;
            }
            float f1111112 = i13;
            if (z) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            oo0ooOooO00o = o0OoOo0.OooO00o(f1111112, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
            if (z) {
                if (z4) {
                    i14 = -30;
                } else {
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    if (iIntValue3 <= 0) {
                        i14 = -32;
                    } else {
                        i14 = -30;
                    }
                }
            } else if (z4) {
                i14 = -14;
            } else {
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue <= 0) {
                    i14 = -18;
                } else {
                    i14 = -14;
                }
            }
            float f1111113 = i14;
            if (z) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            oo0ooOooO00o2 = o0OoOo0.OooO00o(f1111113, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
            o00OOOO0 o00oooo0OooO0o1110 = SizeKt.OooO0o(oooO00o);
            OoooooO.o00OO0OO.OooO0O0 oooO0O119 = o00OO0O0.OooO00o.f4183OooOOO0;
            composer.OooO0o0(693286680);
            o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O119, composer);
            composer.OooO0o0(-1323940314);
            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o1110);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            rowScopeInstance = RowScopeInstance.f5758OooO00o;
            o000OO0O o000oo0oOooO00o1110 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
            o00OOOO0 o00oooo0OooO00o1111110 = rowScopeInstance.OooO00o(oooO00o, true);
            f3 = 48;
            o00OOOO0 o00oooo0OooO0oO1110 = SizeKt.OooO0oO(o00oooo0OooO00o1111110, f3);
            oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
            Oooo0.o00.OooO00o(o000oo0oOooO00o1110, null, o00oooo0OooO0oO1110, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            composer.OooO0o0(733328855);
            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z) {
                composer.OooO0o0(-437273117);
                long j1111 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                composer.OooO0o0(1157296644);
                zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                objOooO0o4 = composer.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooOO0O(o0o00oo2);
                    composer.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooOO0O(o0o00oo2);
                    composer.Oooo00o(objOooO0o4);
                }
                composer.Oooo0o0();
                Function0 function111111111111118 = (Function0) objOooO0o4;
                objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                if (objOooO0O1 == c0323OooO00o) {
                    context2 = o0000O.f2657OooO00o;
                    if (context2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context2 = null;
                    }
                    objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                    composer.Oooo00o(objOooO0O1);
                }
                composer.Oooo0o0();
                oO0Oo oo0ooOooO00o1113 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j1111, function111111111111118, composer, 40);
                composer.Oooo0o0();
                composer.Oooo0o0();
                oo0ooOooO00o3 = oo0ooOooO00o1113;
            } else {
                composer.OooO0o0(-437272918);
                if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                }
                composer.OooO0o0(1157296644);
                zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                objOooO0o3 = composer.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooOOO0(o0o00oo2);
                    composer.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooOOO0(o0o00oo2);
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                Function0 function111111111111119 = (Function0) objOooO0o3;
                objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                if (objOooO0O0 == c0323OooO00o) {
                    context = o0000O.f2657OooO00o;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context = null;
                    }
                    objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                    composer.Oooo00o(objOooO0O0);
                }
                composer.Oooo0o0();
                oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function111111111111119, composer, 40);
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (iIntValue2 > 0) {
                o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
            } else {
                o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
            }
            p048OoooooO.o00OO0OO alignment1110 = o00OO0O0.OooO00o.f4170OooO;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(alignment1110, "alignment");
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111111110 = o00oOoo.f6560OooO00o;
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111111111 = o00oOoo.f6560OooO00o;
            p028Oooo0o0.o00O00O other1110 = new p028Oooo0o0.o00O00O(alignment1110, false);
            Intrinsics.checkNotNullParameter(other1110, "other");
            p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other1110, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            long jOooO0OO1111 = o0000O0O.o00Oo0.OooO0OO(11);
            o00OOOO0 o00oooo0OooO1110 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
            if (z) {
                jOooO0OO = o00000OO.OooO0OO(4282993996L);
            } else {
                jOooO0OO = o00000OO.OooO0OO(4289311664L);
            }
            o000O0O0.OooO0OO(str, o00oooo0OooO1110, jOooO0OO, jOooO0OO1111, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
            p028Oooo0o0.o0O0OO0.OooO00o(composer);
            num4 = num3;
            z5 = z4;
        } else {
            if (i7 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function1111111111111112 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(-492369756);
            objOooO0o = composer.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO00o1111111 = o0o0o0o.OooO00o(oooO00o, true);
            composer.OooO0o0(1157296644);
            zOooo0oo = composer.Oooo0oo(function0);
            objOooO0o2 = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = new OooOO0(function0);
                composer.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = new OooOO0(function0);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O1110 = o000O0o.OooO0O0(o00oooo0OooO00o1111111, false, false, null, (Function0) objOooO0o2, 253);
            OoooooO.o00OO0OO.OooO00o oooO00o1112 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001111 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o1112, composer);
            composer.OooO0o0(-1323940314);
            o0o0o0o0 = o000.f6356OooO0o0;
            oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0o0o0o1 = o000.f6360OooOO0O;
            layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0o0o0o2 = o000.f6364OooOOOO;
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            i12 = i5;
            function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O1110);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
            r11 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r11);
            r1 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r1);
            r8 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            if (z) {
                i13 = 30;
            } else {
                i13 = 25;
            }
            float f1111114 = i13;
            if (z) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            oo0ooOooO00o = o0OoOo0.OooO00o(f1111114, o00oO0o.OooO0OO(f, 400.0f, null, 4), composer);
            if (z) {
                if (z4) {
                    i14 = -30;
                } else {
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    if (iIntValue3 <= 0) {
                        i14 = -32;
                    } else {
                        i14 = -30;
                    }
                }
            } else if (z4) {
                i14 = -14;
            } else {
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue <= 0) {
                    i14 = -18;
                } else {
                    i14 = -14;
                }
            }
            float f1111115 = i14;
            if (z) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            oo0ooOooO00o2 = o0OoOo0.OooO00o(f1111115, o00oO0o.OooO0OO(f2, 400.0f, null, 4), composer);
            o00OOOO0 o00oooo0OooO0o1111 = SizeKt.OooO0o(oooO00o);
            OoooooO.o00OO0OO.OooO0O0 oooO0O1110 = o00OO0O0.OooO00o.f4183OooOOO0;
            composer.OooO0o0(693286680);
            o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O1110, composer);
            composer.OooO0o0(-1323940314);
            oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o1111);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r11, composer, layoutDirection2, r1, composer, o00ooooo3, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            rowScopeInstance = RowScopeInstance.f5758OooO00o;
            o000OO0O o000oo0oOooO00o1111 = o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer);
            o00OOOO0 o00oooo0OooO00o1111112 = rowScopeInstance.OooO00o(oooO00o, true);
            f3 = 48;
            o00OOOO0 o00oooo0OooO0oO1111 = SizeKt.OooO0oO(o00oooo0OooO00o1111112, f3);
            oooO0OO = o0O0O00.OooOO0.OooO00o.f35240OooO0Oo;
            Oooo0.o00.OooO00o(o000oo0oOooO00o1111, null, o00oooo0OooO0oO1111, null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            composer.OooO0o0(733328855);
            o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            function3OooO0O2 = o00Oo0.OooO0O0(oooO00o);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r3, composer, oooO3, r11, composer, layoutDirection3, r1, composer, o00ooooo4, r8, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (z) {
                composer.OooO0o0(-437273117);
                long j1112 = ((Boolean) o0o00oo2.getValue()).booleanValue() ? 0L : 600L;
                composer.OooO0o0(1157296644);
                zOooo0oo3 = composer.Oooo0oo(o0o00oo2);
                objOooO0o4 = composer.OooO0o();
                if (zOooo0oo3) {
                    objOooO0o4 = new OooOO0O(o0o00oo2);
                    composer.Oooo00o(objOooO0o4);
                } else {
                    objOooO0o4 = new OooOO0O(o0o00oo2);
                    composer.Oooo00o(objOooO0o4);
                }
                composer.Oooo0o0();
                Function0 function1111111111111113 = (Function0) objOooO0o4;
                objOooO0O1 = o000O00.OooO0O0(composer, 1521858409, -492369756);
                if (objOooO0O1 == c0323OooO00o) {
                    context2 = o0000O.f2657OooO00o;
                    if (context2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context2 = null;
                    }
                    objOooO0O1 = p516o0o0O000.Oooo0.OooO00o(context2, i);
                    composer.Oooo00o(objOooO0O1);
                }
                composer.Oooo0o0();
                oO0Oo oo0ooOooO00o1114 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O1, j1112, function1111111111111113, composer, 40);
                composer.Oooo0o0();
                composer.Oooo0o0();
                oo0ooOooO00o3 = oo0ooOooO00o1114;
            } else {
                composer.OooO0o0(-437272918);
                if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                }
                composer.OooO0o0(1157296644);
                zOooo0oo2 = composer.Oooo0oo(o0o00oo2);
                objOooO0o3 = composer.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooOOO0(o0o00oo2);
                    composer.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooOOO0(o0o00oo2);
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                Function0 function1111111111111114 = (Function0) objOooO0o3;
                objOooO0O0 = o000O00.OooO0O0(composer, 462544834, -492369756);
                if (objOooO0O0 == c0323OooO00o) {
                    context = o0000O.f2657OooO00o;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        context = null;
                    }
                    objOooO0O0 = p516o0o0O000.Oooo0.OooO00o(context, i2);
                    composer.Oooo00o(objOooO0O0);
                }
                composer.Oooo0o0();
                oo0ooOooO00o3 = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0O0, j2, function1111111111111114, composer, 40);
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o3.getValue()).intValue(), composer), null, SizeKt.OooO0oO(oooO00o, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (iIntValue2 > 0) {
                o00oooo0OooOOO0 = o00O00.OooOOO(oooO00o, num3, 8, true, 0L, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 13924);
            } else {
                o00oooo0OooOOO0 = o00O00.OooOOO0(oooO00o, z4, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, true, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o).getValue()).f27306Oooo0o, ((o0000O0O.OooOOO0) ((o0ooOOo) oo0ooOooO00o2).getValue()).f27306Oooo0o, 2, 558);
            }
            p048OoooooO.o00OO0OO alignment1111 = o00OO0O0.OooO00o.f4170OooO;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(alignment1111, "alignment");
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111111115 = o00oOoo.f6560OooO00o;
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1111111111111116 = o00oOoo.f6560OooO00o;
            p028Oooo0o0.o00O00O other1111 = new p028Oooo0o0.o00O00O(alignment1111, false);
            Intrinsics.checkNotNullParameter(other1111, "other");
            p028Oooo0o0.oOO00O.OooO00o(SizeKt.OooOO0(other1111, 40).OooOOoo(o00oooo0OooOOO0), composer, 0);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.tab_main_middle_shadow_bg, composer), null, SizeKt.OooO0oO(rowScopeInstance.OooO00o(oooO00o, true), f3), null, oooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            long jOooO0OO1112 = o0000O0O.o00Oo0.OooO0OO(11);
            o00OOOO0 o00oooo0OooO1111 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
            if (z) {
                jOooO0OO = o00000OO.OooO0OO(4282993996L);
            } else {
                jOooO0OO = o00000OO.OooO0OO(4289311664L);
            }
            o000O0O0.OooO0OO(str, o00oooo0OooO1111, jOooO0OO, jOooO0OO1112, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i12 >> 9) & 14) | 3120, 0, 65520);
            p028Oooo0o0.o0O0OO0.OooO00o(composer);
            num4 = num3;
            z5 = z4;
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, i, i2, str, z, num4, z5, function0, i3, i4));
    }
}
