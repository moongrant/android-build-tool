package p591o0oOooOo;

import Oooo0.o0oOOo;
import Oooo0.oo00oO;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OO0O0;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventCreateViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o00OO000;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o0O0ooO;
import p258o00ooOOo.j;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p418o0Oo0oo.o00000OO;
import p502o0o00o0.o000OO;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O00O0o;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000OO00;
import p616o0oo0Ooo.oO0O00;
import p618o0oo0o0.o0O0O00;
import p621o0oo0o0o.o00O0;
import p621o0oo0o0o.o00O0O0O;
import p710ooOO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class x3 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final x3 f47361OooO00o = new x3();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f47363Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47364Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O00o0 o00o00o1, int i) {
            super(2);
            this.f47363Oooo0oO = o00o00o1;
            this.f47364Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO0o0(this.f47363Oooo0oO, ooo00o, this.f47364Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventCreateScreen$Content$1", f = "EventCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47365Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventCreateViewModel eventCreateViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47365Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47365Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f47365Oooo0o.m492getTagList();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47367Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47368Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47367Oooo0oO = o00o0o01;
            this.f47368Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO00o(this.f47367Oooo0oO, ooo00o, this.f47368Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ EventModel f47369OooO00o;

        public OooO0OO(EventModel eventModel) {
            this.f47369OooO00o = eventModel;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(EventModel.class).newInstance(this.f47369OooO00o);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo… .newInstance(eventModel)");
            return tNewInstance;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.OooOOOO.OooO0O0(this, cls, creationExtras);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47370Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47371Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f47372Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LifecycleOwner lifecycleOwner, EventCreateViewModel eventCreateViewModel, CoroutineScope coroutineScope) {
            super(0);
            this.f47370Oooo0o = lifecycleOwner;
            this.f47371Oooo0oO = eventCreateViewModel;
            this.f47372Oooo0oo = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LifecycleOwner lifecycleOwner = this.f47370Oooo0o;
            EventCreateViewModel eventCreateViewModel = this.f47371Oooo0oO;
            CoroutineScope coroutineScope = this.f47372Oooo0oo;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.set(13, 0);
            if (o00O0O0O.OooO00o(eventCreateViewModel.getDateModelStart().getTimeInMillis()) < o00O0O0O.OooO0O0(60) + calendar.getTimeInMillis()) {
                ToastUtil.f12567OooO00o.OooO00o(R.string.event_create_err_start_time_invalid);
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jCurrentTimeMillis2);
                calendar2.set(13, 0);
                if (o00O0O0O.OooO00o(eventCreateViewModel.getDateModelEnd().getTimeInMillis()) < o00O0O0O.OooO0O0(65) + calendar2.getTimeInMillis()) {
                    ToastUtil.f12567OooO00o.OooO00o(R.string.event_create_err_end_time_invalid);
                } else if (o00O0O0O.OooO00o(eventCreateViewModel.getDateModelStart().getTimeInMillis()) > o00O0O0O.OooO00o(eventCreateViewModel.getDateModelEnd().getTimeInMillis())) {
                    ToastUtil.f12567OooO00o.OooO00o(R.string.event_create_err_end_time_must_last_start_time);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new e4(eventCreateViewModel, lifecycleOwner, null), 3, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f47373Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00OO0O0 o00oo0o1) {
            super(1);
            this.f47373Oooo0o = o00oo0o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean z;
            MotionEvent it = motionEvent;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getAction() == 0) {
                o00OO0O0 o00oo0o1 = this.f47373Oooo0o;
                if (o00oo0o1 != null) {
                    o00oo0o1.OooO0O0();
                }
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47375Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f47375Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO0o(ooo00o, this.f47375Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47376Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f47376Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            String describe = this.f47376Oooo0o.getDescribe();
            if (!StringsKt.isBlank(it)) {
                this.f47376Oooo0o.setDescribe("");
            }
            if (it.length() <= this.f47376Oooo0o.getMaxCountDescribe()) {
                this.f47376Oooo0o.setDescribe(it);
            } else {
                this.f47376Oooo0o.setDescribe(describe);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<o0000oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47377Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f47377Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000oo o0000ooVar) {
            o0000oo it = o0000ooVar;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f47377Oooo0o.setDescribeHasFocus(it.OooO00o());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47378Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventCreateViewModel eventCreateViewModel) {
            super(3);
            this.f47378Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2;
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o3 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o3.Oooo0oo(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o3.OooOo0()) {
                ooo00o3.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ooo00o3.OooO0o0(-17158647);
                String describe = this.f47378Oooo0o.getDescribe();
                if (describe == null || describe.length() == 0) {
                    ooo00o2 = ooo00o3;
                    o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_describe_hint, ooo00o3), null, u.OooO0O0(ooo00o3).OooOO0(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 3072, 0, 65522);
                } else {
                    ooo00o2 = ooo00o3;
                }
                ooo00o2.Oooo0o0();
                innerTextField.invoke(ooo00o2, Integer.valueOf(i & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47380Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i) {
            super(2);
            this.f47380Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO0oO(ooo00o, this.f47380Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47381Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47381Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47381Oooo0o.setDescribe("");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f47382Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f47383Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47384Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(o00OO0O0 o00oo0o1, FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47382Oooo0o = o00oo0o1;
            this.f47383Oooo0oO = fragmentActivity;
            this.f47384Oooo0oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OO0O0 o00oo0o1 = this.f47382Oooo0o;
            if (o00oo0o1 != null) {
                o00oo0o1.OooO0O0();
            }
            FragmentActivity fragmentActivity = this.f47383Oooo0oO;
            if (fragmentActivity != null) {
                EventCreateViewModel eventCreateViewModel = this.f47384Oooo0oo;
                if (!eventCreateViewModel.getShowPermission()) {
                    eventCreateViewModel.setShowPermission(true);
                    o0O0O00.OooO0OO(fragmentActivity, p618o0oo0o0.oo0o0Oo.f48607OooO0O0, new b4(eventCreateViewModel), new d4(fragmentActivity, eventCreateViewModel));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f47385Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f47386Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47387Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o00OO0O0 o00oo0o1, FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47385Oooo0o = o00oo0o1;
            this.f47386Oooo0oO = fragmentActivity;
            this.f47387Oooo0oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OO0O0 o00oo0o1 = this.f47385Oooo0o;
            if (o00oo0o1 != null) {
                o00oo0o1.OooO0O0();
            }
            FragmentActivity fragmentActivity = this.f47386Oooo0oO;
            if (fragmentActivity != null) {
                EventCreateViewModel eventCreateViewModel = this.f47387Oooo0oo;
                if (!eventCreateViewModel.getShowPermission()) {
                    eventCreateViewModel.setShowPermission(true);
                    o0O0O00.OooO0OO(fragmentActivity, p618o0oo0o0.oo0o0Oo.f48607OooO0O0, new b4(eventCreateViewModel), new d4(fragmentActivity, eventCreateViewModel));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47389Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(int i) {
            super(2);
            this.f47389Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO0oo(ooo00o, this.f47389Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47390Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(EventCreateViewModel eventCreateViewModel) {
            super(3);
            this.f47390Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2;
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o3 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o3.Oooo0oo(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o3.OooOo0()) {
                ooo00o3.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ooo00o3.OooO0o0(1209777556);
                String name = this.f47390Oooo0o.getName();
                if (name == null || name.length() == 0) {
                    ooo00o2 = ooo00o3;
                    o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_name_hint, ooo00o3), null, u.OooO0O0(ooo00o3).OooOO0(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, ooo00o2, 3072, 3072, 57330);
                } else {
                    ooo00o2 = ooo00o3;
                }
                ooo00o2.Oooo0o0();
                innerTextField.invoke(ooo00o2, Integer.valueOf(i & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47391Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47391Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47391Oooo0o.setName("");
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47393Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(int i) {
            super(2);
            this.f47393Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooO(ooo00o, this.f47393Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47394Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ EventTagModel f47395Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(EventCreateViewModel eventCreateViewModel, EventTagModel eventTagModel) {
            super(0);
            this.f47394Oooo0o = eventCreateViewModel;
            this.f47395Oooo0oO = eventTagModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = p031OoooO.o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
            if (fragmentActivity != null) {
                EventCreateViewModel eventCreateViewModel = this.f47394Oooo0o;
                EventTagModel select = this.f47395Oooo0oO;
                final o000OO o000oo2 = new o000OO(fragmentActivity);
                List<EventTagModel> list = eventCreateViewModel.getTagList();
                final y3 y3Var = new y3(eventCreateViewModel);
                Intrinsics.checkNotNullParameter(list, "list");
                Intrinsics.checkNotNullParameter(select, "select");
                o000oo2.OooOO0O().f50633OooO0O0.removeAllViews();
                for (final EventTagModel eventTagModel : list) {
                    final o000OO.OooO00o oooO00o = new o000OO.OooO00o(o000oo2.f41543Oooo0o, eventTagModel);
                    oooO00o.OooO0O0().setOnClickListener(new View.OnClickListener() { // from class: o0o00o0.o0000O0O
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            o000OO this$0 = o000oo2;
                            o000OO.OooO00o this_apply = oooO00o;
                            Function1 function1 = y3Var;
                            EventTagModel item = eventTagModel;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            Intrinsics.checkNotNullParameter(item, "$item");
                            o000OO.OooO00o oooO00o2 = this$0.f41590o000oOoO;
                            if (oooO00o2 != null) {
                                oooO00o2.OooO0Oo(false);
                            }
                            this_apply.OooO0Oo(true);
                            this$0.f41590o000oOoO = this_apply;
                            if (function1 != null) {
                                function1.invoke(item);
                            }
                            this$0.OooO0O0();
                        }
                    });
                    p254o00ooO0O.oOO00O.OooO00o(oooO00o.OooO00o());
                    if (oooO00o.f41592OooO0O0.getIcon().length() > 0) {
                        p254o00ooO0O.oOO00O.OooO(oooO00o.OooO00o());
                        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(oooO00o.f41591OooO00o);
                        oooO00o2.f48434OooO0oo = null;
                        oooO00o2.f48430OooO0Oo = false;
                        oooO00o2.f48441OooOOOo = R.drawable.ic_evnet_chat;
                        oooO00o2.f48444OooOOoo = 0;
                        oooO00o2.f48431OooO0o = R.drawable.ic_evnet_chat;
                        oooO00o2.f48435OooOO0 = null;
                        oooO00o2.f48438OooOOO = -1;
                        oooO00o2.f48440OooOOOO = -1;
                        oooO00o2.f48454OooOoo0 = 2;
                        oooO00o2.f48453OooOoo = 0;
                        oooO00o2.f48447OooOo00 = 0;
                        oooO00o2.f48446OooOo0 = false;
                        oooO00o2.f48448OooOo0O = false;
                        oooO00o2.f48449OooOo0o = 0;
                        oooO00o2.f48445OooOo = 0;
                        oooO00o2.f48451OooOoO0 = 0;
                        oooO00o2.f48450OooOoO = 0;
                        oooO00o2.f48452OooOoOO = 0;
                        oooO00o2.f48455OooOooO = 0;
                        oooO00o2.f48456OooOooo = 0;
                        oooO00o2.f48458Oooo00O = false;
                        oooO00o2.f48439OooOOO0 = false;
                        oooO00o2.f48429OooO0OO = oooO00o.f41592OooO0O0.getIcon();
                        oooO00o2.f48427OooO00o = 0;
                        oooO00o2.OooO0o(oooO00o.OooO00o());
                    }
                    p254o00ooO0O.oOO00O.OooO00o(oooO00o.OooO0OO());
                    if (oooO00o.f41592OooO0O0.getTagName().length() > 0) {
                        p254o00ooO0O.oOO00O.OooO(oooO00o.OooO0OO());
                        oooO00o.OooO0OO().setText(oooO00o.f41592OooO0O0.getTagName());
                    }
                    oooO00o.OooO0Oo(false);
                    if (select.getId() == eventTagModel.getId()) {
                        oooO00o.OooO0Oo(true);
                        o000oo2.f41590o000oOoO = oooO00o;
                    }
                    o000oo2.OooOO0O().f50633OooO0O0.addView(oooO00o.OooO0O0());
                }
                o000oo2.OooOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47397Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(int i) {
            super(2);
            this.f47397Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooOO0o(ooo00o, this.f47397Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f47398Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47399Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47400Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(o00OO0O0 o00oo0o1, AppCompatActivity appCompatActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47398Oooo0o = o00oo0o1;
            this.f47399Oooo0oO = appCompatActivity;
            this.f47400Oooo0oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OO0O0 o00oo0o1 = this.f47398Oooo0o;
            if (o00oo0o1 != null) {
                o00oo0o1.OooO0O0();
            }
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = this.f47400Oooo0oo.getDateModelStart().getTimeInMillis();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(timeInMillis);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            j jVar = new j(this.f47399Oooo0oO, p254o00ooO0O.o000O0O0.OooO0OO(R.string.Cancel), p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm), p617o0oo0o.o00oO0o.f48562OooO00o, p617o0oo0o.o00oO0o.f48563OooO0O0, true);
            jVar.OooOOo(this.f47400Oooo0oo.getDateModelStart(), null);
            z3 callBack = new z3(this.f47400Oooo0oo);
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            jVar.f34656OooOOo0 = callBack;
            jVar.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f47401Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47402Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47403Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(o00OO0O0 o00oo0o1, AppCompatActivity appCompatActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f47401Oooo0o = o00oo0o1;
            this.f47402Oooo0oO = appCompatActivity;
            this.f47403Oooo0oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OO0O0 o00oo0o1 = this.f47401Oooo0o;
            if (o00oo0o1 != null) {
                o00oo0o1.OooO0O0();
            }
            j jVar = new j(this.f47402Oooo0oO, p254o00ooO0O.o000O0O0.OooO0OO(R.string.Cancel), p254o00ooO0O.o000O0O0.OooO0OO(R.string.Confirm), p617o0oo0o.o00oO0o.f48562OooO00o, p617o0oo0o.o00oO0o.f48563OooO0O0, false);
            jVar.OooOOo(this.f47403Oooo0oo.getDateModelEnd(), this.f47403Oooo0oo.getDateModelStart());
            a4 callBack = new a4(this.f47403Oooo0oo);
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            jVar.f34656OooOOo0 = callBack;
            jVar.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f47404Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f47404Oooo0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            String name = this.f47404Oooo0o.getName();
            StringBuilder sb = new StringBuilder();
            int length = it.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char cCharAt = it.charAt(i);
                if (cCharAt != '\n') {
                    sb.append(cCharAt);
                }
                i++;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
            if (!StringsKt.isBlank(it)) {
                this.f47404Oooo0o.setName("");
            }
            if (string.length() <= this.f47404Oooo0o.getMaxCountName()) {
                this.f47404Oooo0o.setName(string);
            } else {
                this.f47404Oooo0o.setName(name);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47406Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(int i) {
            super(2);
            this.f47406Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooOO0O(ooo00o, this.f47406Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47408Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(int i) {
            super(2);
            this.f47408Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooOO0(ooo00o, this.f47408Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47410Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(int i) {
            super(2);
            this.f47410Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            x3.this.OooOOO0(ooo00o, this.f47410Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r22v1, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v25, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        o00OOOO0.OooO00o oooO00o;
        oOO00O composer = ooo00o.OooOOo(1673299960);
        if ((i & 1) == 0 && composer.OooOo0()) {
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, 19), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_name, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, 10), composer, 6);
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o2);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0o, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o);
            o00OO0OO.OooO0O0 oooO0O0 = OoooooO.o00OO0O0.OooO00o.f4183OooOOO0;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r22 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r22, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
            float f = 24;
            p032OoooO0.OooOo.OooO00o(eventCreateViewModel.getName(), new o0OoOo0(eventCreateViewModel), rowScopeInstance.OooO0O0(SizeKt.OooO0oo(rowScopeInstance.OooO00o(oooO00o2, true), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), OoooooO.o00OO0O0.OooO00o.f4181OooOO0o), true, false, new o00000O.oo0o0Oo(u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 262140), null, null, false, 3, null, null, null, new o0O0ooO(o0000O0.f41710OooOo0), o00O0000.OooO00o(composer, 1169784485, new o00O0O(eventCreateViewModel)), composer, 805309440, 24576, 7632);
            composer.OooO0o0(-495788026);
            if (eventCreateViewModel.getName().length() > 0) {
                o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(oooO00o2, f);
                o000000 o000000VarOooO00o2 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
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
                oooO00o = oooO00o2;
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r22, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                StringBuilder sb = new StringBuilder();
                sb.append(eventCreateViewModel.getName().length());
                sb.append('/');
                sb.append(eventCreateViewModel.getMaxCountName());
                o000O0O0.OooO0OO(sb.toString(), SizeKt.OooO0oO(oooO00o, 20), u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3120, 0, 65520);
                p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_uderinfo_edit_clear, composer), null, ClickableKt.OooO0Oo(SizeKt.OooOO0(oooO00o, 23), false, new o00Oo0(eventCreateViewModel), 7), u.OooO0O0(composer).OooOO0(), composer, 56, 0);
                o0O0OO0.OooO00o(composer);
            } else {
                oooO00o = oooO00o2;
            }
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 11), composer, 6);
            o0O00O0o.OooO00o(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0L, composer, 0, 7);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Ooo(i));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(1177115168);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Bundle bundleOooO0O0 = o000OO00.OooO0O0((NavBackStackEntry) composer.OooOO0o(o000OO00.f46954OooO00o), composer);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(bundleOooO0O0);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = (EventModel) bundleOooO0O0.getSerializable("key");
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            OooO0OO oooO0OO = new OooO0OO((EventModel) objOooO0o);
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, oooO0OO, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            o00Oo00.OooO0o0(eventCreateViewModel, new OooO00o(eventCreateViewModel, null), composer);
            p504o0o00o0O.OooOo.OooO00o(eventCreateViewModel.getShowLoadingDialog().getValue().booleanValue(), null, null, composer, 0, 6);
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(BackgroundKt.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, u.OooO0O0(composer).OooO0Oo(), o000O0Oo.f32099OooO00o));
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(OoooooO.o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o0);
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
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
            x3 x3Var = f47361OooO00o;
            x3Var.OooO0o(composer, 6);
            x3Var.OooOOO0(composer, 6);
            x3Var.OooO0o0(boxScopeInstance, composer, 54);
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
        oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, i));
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(2012456470);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new o0oOOo(0);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OO0O0 o00oo0o0OooO00o = androidx.compose.ui.platform.o00O00o0.f6471OooO00o.OooO00o(composer);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0OO = oo00oO.OooO0OO(BackgroundKt.OooO0O0(WindowInsetsPadding_androidKt.OooO00o(oooO00o), u.OooO0O0(composer).OooO0Oo(), o000O0Oo.f32099OooO00o), (o0oOOo) objOooO0o);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(o00oo0o0OooO00o);
            Object objOooO0o2 = composer.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new OooOO0(o00oo0o0OooO00o);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            Function1 onTouchEvent = (Function1) objOooO0o2;
            Intrinsics.checkNotNullParameter(o00oooo0OooO0OO, "<this>");
            Intrinsics.checkNotNullParameter(onTouchEvent, "onTouchEvent");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            o00OOOO0 o00oooo0OooO00o = o00OOO0O.OooO00o(o00oooo0OooO0OO, o00oOoo.f6560OooO00o, new o00000OO(onTouchEvent, null));
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
            o00OO0OO.OooO00o oooO00o2 = OoooooO.o00OO0O0.OooO00o.f4182OooOOO;
            o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            x3 x3Var = f47361OooO00o;
            x3Var.OooO0oo(composer, 6);
            float f = 13;
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, f, 8, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8);
            composer.OooO0o0(-483455358);
            o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooOo00, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            x3Var.OooO(composer, 6);
            x3Var.OooOO0O(composer, 6);
            x3Var.OooOO0o(composer, 6);
            x3Var.OooOO0(composer, 6);
            x3Var.OooO0oO(composer, 6);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 4), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_create_hint, composer), null, u.OooO0O0(composer).OooOO0(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 91), composer, 6);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
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
        oo0oooOooOo.OooO00o(new OooOO0O(i));
    }

    /* JADX WARN: Type inference failed for: r18v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v28, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(o00O00o0 o00o00o1, oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        long jOooOO0;
        oOO00O composer = ooo00o.OooOOo(-2119239626);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o00o00o1) ? 4 : 2) | i;
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
            if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0O0 = Oooo000.o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0O0).f29498Oooo0o;
            composer.Oooo0o0();
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(SizeKt.OooO0o(PaddingKt.OooO0o(oooO00o, 24, 12)), OoooooO.o00OO0O0.OooO00o.f4170OooO);
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(OoooooO.o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r4);
            ?? r5 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r5);
            ?? r18 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r18, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(SizeKt.OooO0oO(p442o0OoOo0.Oooo000.OooO00o(oooO00o, p033OoooO00.o00O0O.OooO0OO((float) 20.5d)), 41));
            composer.OooO0o0(-2044351857);
            if (!StringsKt.isBlank(eventCreateViewModel.getName())) {
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                jOooOO0 = o0000O0.f41710OooOo0;
            } else {
                jOooOO0 = u.OooO0O0(composer).OooOO0();
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0Oo = ClickableKt.OooO0Oo(BackgroundKt.OooO0O0(o00oooo0OooO0o, jOooOO0, o000O0Oo.f32099OooO00o), !StringsKt.isBlank(eventCreateViewModel.getName()), new OooO0o(lifecycleOwner, eventCreateViewModel, coroutineScope), 6);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, OoooooO.o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0Oo);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0O0, r3, composer, oooO2, r4, composer, layoutDirection2, r5, composer, o00ooooo3, r18, composer, "composer", composer), composer, 0);
            String strOooO00o = p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -678309503, R.string.event_create_button, composer);
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(17);
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            o000O0O0.OooO0OO(strOooO00o, null, o0000O0.f41693OooO0OO, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3456, 0, 65522);
            o00OO0O.OooOO0O.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(o00o00o1, i));
    }

    /* JADX WARN: Type inference failed for: r21v1, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        o00OOOO0.OooO00o oooO00o;
        oOO00O composer = ooo00o.OooOOo(1549807672);
        if ((i & 1) == 0 && composer.OooOo0()) {
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 12;
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, f), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_describe, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            float f2 = 10;
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, f2), composer, 6);
            o00OOOO0 o00oooo0OooO0oo = SizeKt.OooO0oo(SizeKt.OooO0o(p442o0OoOo0.Oooo000.OooO00o(oooO00o2, p033OoooO00.o00O0O.OooO0OO(4))), Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0oo, o0000O0.f41736OoooOO0, o000O0Oo.f32099OooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, OoooooO.o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r21 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r21, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            p032OoooO0.OooOo.OooO00o(eventCreateViewModel.getDescribe(), new OooOOO(eventCreateViewModel), FocusChangedModifierKt.OooO00o(PaddingKt.OooO0oo(SizeKt.OooO0o(SizeKt.OooO0oo(BackgroundKt.OooO0O0(oooO00o2, o0000O0.f41692OooO0O0, o000O0Oo.f32099OooO00o), 125, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2)), f2, f, f2, f), new OooOOO0(eventCreateViewModel)), true, false, new o00000O.oo0o0Oo(u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 262140), null, null, false, 5, null, null, null, new o0O0ooO(o0000O0.f41710OooOo0), o00O0000.OooO00o(composer, -298779593, new OooOOOO(eventCreateViewModel)), composer, 805309440, 24576, 7632);
            composer.OooO0o0(-2054483717);
            if (eventCreateViewModel.getDescribe().length() > 0) {
                float f3 = 23;
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(SizeKt.OooO0oO(oooO00o2, f3));
                o00OO0OO.OooO0O0 oooO0O0 = OoooooO.o00OO0O0.OooO00o.f4181OooOO0o;
                Oooo0o0.o00O000.OooO0OO oooO0OO = p028Oooo0o0.o00O000.f2031OooO0OO;
                composer.OooO0o0(693286680);
                o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(oooO0OO, oooO0O0, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o);
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
                oooO00o = oooO00o2;
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r21, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                StringBuilder sb = new StringBuilder();
                sb.append(eventCreateViewModel.getDescribe().length());
                sb.append('/');
                sb.append(eventCreateViewModel.getMaxCountDescribe());
                o000O0O0.OooO0OO(sb.toString(), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_uderinfo_edit_clear, composer), null, ClickableKt.OooO0Oo(SizeKt.OooOO0(oooO00o, f3), false, new OooOo00(eventCreateViewModel), 7), u.OooO0O0(composer).OooOO0(), composer, 56, 0);
                o0O0OO0.OooO00o(composer);
            } else {
                oooO00o = oooO00o2;
            }
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo(i));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x044a  */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        String eventDefaultPic;
        oOO00O composer = ooo00o.OooOOo(974786298);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OO0O0 o00oo0o0OooO00o = androidx.compose.ui.platform.o00O00o0.f6471OooO00o.OooO00o(composer);
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = p031OoooO.o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41704OooOOOO;
            o000O0Oo.OooO00o oooO00o2 = o000O0Oo.f32099OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(oooO00o, j, oooO00o2);
            composer.OooO0o0(733328855);
            o00OO0OO o00oo0oo = OoooooO.o00OO0O0.OooO00o.f4172OooO0O0;
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            ?? r11 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r11);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r20 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r20, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (eventCreateViewModel.getHeadUrl().length() > 0) {
                eventDefaultPic = eventCreateViewModel.getHeadUrl();
            } else {
                if (eventCreateViewModel.getHeadPath().length() > 0) {
                    eventDefaultPic = eventCreateViewModel.getHeadPath();
                } else if (eventCreateViewModel.getSelectTag() != null) {
                    EventTagModel selectTag = eventCreateViewModel.getSelectTag();
                    Intrinsics.checkNotNull(selectTag);
                    eventDefaultPic = selectTag.getEventDefaultPic();
                } else {
                    eventDefaultPic = "";
                }
            }
            composer.OooO0o0(604400049);
            oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
            composer.OooO0o0(604401387);
            coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0));
            c0072OooO00o.f9912OooO0OO = eventDefaultPic;
            c0072OooO00o.OooO0O0(true);
            c0072OooO00o.OooO0Oo(R.drawable.ic_event_default_head_bg);
            c0072OooO00o.OooO0OO(R.drawable.ic_event_default_head_bg);
            p114o00O00o.OooOo00 oooOo00OooO00o = p114o00O00o.Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
            composer.Oooo0o0();
            composer.Oooo0o0();
            float f = 179;
            Oooo0.o00.OooO00o(oooOo00OooO00o, null, SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), ((o00OO000) p028Oooo0o0.o0OO000o.OooO00o(p028Oooo0o0.oo0ooO.OooO00o(composer), composer)).OooO0Oo() + f), OoooooO.o00OO0O0.OooO00o.f4173OooO0OO, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 27696, 96);
            if (eventCreateViewModel.getHeadPath().length() == 0) {
                if (eventCreateViewModel.getHeadUrl().length() == 0) {
                    composer.OooO0o0(-30331121);
                    o00OOOO0 o00oooo0OooO0O1 = WindowInsetsPadding_androidKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(BackgroundKt.OooO0O0(oooO00o, j, oooO00o2)), ((o00OO000) p028Oooo0o0.o0OO000o.OooO00o(p028Oooo0o0.oo0ooO.OooO00o(composer), composer)).OooO0Oo() + f));
                    composer.OooO0o0(733328855);
                    o000000 o000000VarOooO0Oo2 = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
                    composer.OooO0o0(-1323940314);
                    o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O1);
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
                    ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo2, r11, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r20, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-2137368960);
                    o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0oO(WindowInsetsPadding_androidKt.OooO0O0(oooO00o), 35), p033OoooO00.o00O0O.OooO0OO(8));
                    List colors = CollectionsKt.mutableListOf(new o00000O0(o0000O0.f41810oo000o), new o00000O0(o0000O0.f41801o00ooo));
                    Intrinsics.checkNotNullParameter(colors, "colors");
                    long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    long jOooO00o2 = o00O0O.OooOO0.OooO00o(Float.POSITIVE_INFINITY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    Intrinsics.checkNotNullParameter(colors, "colors");
                    o00OOOO0 o00oooo0OooO00o2 = BackgroundKt.OooO00o(o00oooo0OooO00o, new p145o00Oo0.o000OO(colors, jOooO00o, jOooO00o2, 0), null, 6);
                    o00OO0OO alignment = OoooooO.o00OO0O0.OooO00o.f4175OooO0o;
                    Intrinsics.checkNotNullParameter(o00oooo0OooO00o2, "<this>");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                    Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                    o00OOOO0 o00oooo0OooO0Oo = ClickableKt.OooO0Oo(o00oooo0OooO00o2.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), false, new Oooo000(o00oo0o0OooO00o, fragmentActivity, eventCreateViewModel), 7);
                    p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, OoooooO.o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
                    o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                    o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                    Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0Oo);
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
                    ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0O0, r11, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r20, composer, "composer", composer), composer, 0);
                    composer.OooO0o0(2058660585);
                    composer.OooO0o0(-678309503);
                    float f2 = 15;
                    o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f2), composer, 6);
                    o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.icon_add_white, composer);
                    long j2 = o0000O0.f41693OooO0OO;
                    p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o, null, SizeKt.OooOO0(oooO00o, 14), j2, composer, 3512, 0);
                    o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 4), composer, 6);
                    o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_add_cover_photo, composer), null, j2, o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3456, 0, 65522);
                    o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f2), composer, 6);
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                    composer.Oooo0o0();
                } else {
                    composer.OooO0o0(-30328891);
                    o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.drawable.icon_update_photo, composer);
                    o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(PaddingKt.OooO0o0(ClickableKt.OooO0Oo(oooO00o, false, new Oooo0(o00oo0o0OooO00o, fragmentActivity, eventCreateViewModel), 7), 14), 27);
                    o00OO0OO alignment2 = OoooooO.o00OO0O0.OooO00o.f4179OooOO0;
                    Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
                    Intrinsics.checkNotNullParameter(alignment2, "alignment");
                    Function1<o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
                    Function1<o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
                    Oooo0.o00.OooO00o(o000oo0oOooO00o2, null, o00oooo0OooOO0.OooOOoo(new p028Oooo0o0.o00O00O(alignment2, false)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                    composer.Oooo0o0();
                }
            } else {
                composer.OooO0o0(-30328891);
                o000OO0O o000oo0oOooO00o3 = o00000.OooO0O0.OooO00o(R.drawable.icon_update_photo, composer);
                o00OOOO0 o00oooo0OooOO1 = SizeKt.OooOO0(PaddingKt.OooO0o0(ClickableKt.OooO0Oo(oooO00o, false, new Oooo0(o00oo0o0OooO00o, fragmentActivity, eventCreateViewModel), 7), 14), 27);
                o00OO0OO alignment3 = OoooooO.o00OO0O0.OooO00o.f4179OooOO0;
                Intrinsics.checkNotNullParameter(o00oooo0OooOO1, "<this>");
                Intrinsics.checkNotNullParameter(alignment3, "alignment");
                Function1<o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function7 = o00oOoo.f6560OooO00o;
                Oooo0.o00.OooO00o(o000oo0oOooO00o3, null, o00oooo0OooOO1.OooOOoo(new p028Oooo0o0.o00O00O(alignment3, false)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                composer.Oooo0o0();
            }
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000oOoO(i));
    }

    /* JADX WARN: Type inference failed for: r39v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Function0<o000000.OooO00o> function0;
        oOO00O composer = ooo00o.OooOOo(-428444088);
        if ((i & 1) == 0 && composer.OooOo0()) {
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            if ((eventCreateViewModel.getRoomName().length() > 0) && eventCreateViewModel.getRoomIdx() > 0) {
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO0o, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o);
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, OoooooO.o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
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
                ?? r7 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r7);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r3);
                ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r4);
                ?? r39 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r39, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                float f = 12;
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
                o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_create_Where, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                float f2 = 10;
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f2), composer, 6);
                o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(SizeKt.OooOOO(oooO00o));
                o00OO0OO.OooO0O0 oooO0O0 = OoooooO.o00OO0O0.OooO00o.f4181OooOO0o;
                Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
                o000000 o000000VarOooO00o2 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o2);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    function0 = function1;
                    composer.OooOoO0(function0);
                } else {
                    function0 = function1;
                    composer.Oooo00O();
                }
                Function0<o000000.OooO00o> function2 = function0;
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r7, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r39, composer, "composer", composer), composer, 0);
                float f3 = 15;
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_evnet_room, composer), null, SizeKt.OooOO0(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f3), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o000O0O0.OooO0OO(eventCreateViewModel.getRoomName(), null, u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
                o00OOOO0 o00oooo0OooO0o3 = SizeKt.OooO0o(SizeKt.OooOOO(oooO00o));
                composer.OooO0o0(693286680);
                o000000 o000000VarOooO00o3 = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o3);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function2);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r7, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r39, composer, "composer", composer), composer, 0);
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_evnet_room_id, composer), null, SizeKt.OooOO0(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), f3), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o000O0O0.OooO0OO(String.valueOf(eventCreateViewModel.getRoomIdx()), null, u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f2), composer, 6);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(i));
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0O(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(-1358337609);
        if ((i & 1) == 0 && composer.OooOo0()) {
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            EventTagModel selectTag = eventCreateViewModel.getSelectTag();
            if (selectTag != null) {
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                float f = 12;
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
                o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_keyword, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                float f2 = 10;
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f2), composer, 6);
                o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOOO0(SizeKt.OooO0oO(oooO00o, 33), 111, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), p033OoooO00.o00O0O.OooO00o());
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(ClickableKt.OooO0Oo(BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41712OooOo0O, o000O0Oo.f32099OooO00o), false, new o00oO0o(eventCreateViewModel, selectTag), 7), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, OoooooO.o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
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
                oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                String icon = selectTag.getIcon();
                composer.OooO0o0(604400049);
                oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
                composer.OooO0o0(604401387);
                coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0));
                c0072OooO00o.f9912OooO0OO = icon;
                c0072OooO00o.OooO0O0(true);
                c0072OooO00o.OooO0Oo(R.drawable.ic_evnet_chat);
                c0072OooO00o.OooO0OO(R.drawable.ic_evnet_chat);
                p114o00O00o.OooOo00 oooOo00OooO00o = p114o00O00o.Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
                composer.Oooo0o0();
                composer.Oooo0o0();
                Oooo0.o00.OooO00o(oooOo00OooO00o, null, SizeKt.OooOO0(oooO00o, 18), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25008, 104);
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 6), composer, 6);
                o000O0O0.OooO0OO(selectTag.getTagName(), null, u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 3072, 3120, 55282);
                float f3 = 8;
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f3), composer, 6);
                o0O00O0o.OooO0O0(SizeKt.OooO0oO(oooO00o, f2), 1, 0L, composer, 54, 4);
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f3), composer, 6);
                p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_sort_gray, composer), null, SizeKt.OooOO0(oooO00o, 13), u.OooO0O0(composer).OooO(), composer, 440, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
                Unit unit = Unit.INSTANCE;
            }
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0ooOOo(i));
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0o(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(-386320070);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
            Intrinsics.checkNotNull(objOooOO0o, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AppCompatActivity appCompatActivity = (AppCompatActivity) objOooOO0o;
            o00OO0O0 o00oo0o0OooO00o = androidx.compose.ui.platform.o00O00o0.f6471OooO00o.OooO00o(composer);
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
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 12;
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_time, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, 10), composer, 6);
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, OoooooO.o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o);
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
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
            o00O0 o00o1 = o00O0.f48624OooO00o;
            String strOooO0OO = o00o1.OooO0OO(eventCreateViewModel.getDateModelStart().getTimeInMillis(), "dd/MM/yyyy HH:mm");
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(15);
            long jOooO0o = u.OooO0O0(composer).OooO0o();
            float f2 = 5;
            o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(ClickableKt.OooO0Oo(oooO00o, false, new o0OOO0o(o00oo0o0OooO00o, appCompatActivity, eventCreateViewModel), 7), p033OoooO00.o00O0O.OooO0OO(f2));
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41736OoooOO0;
            float f3 = 9;
            float f4 = 7;
            o000O0O0.OooO0OO(strOooO0OO, rowScopeInstance.OooO00o(PaddingKt.OooO0o(BackgroundKt.OooO0O0(o00oooo0OooO00o, j, o000O0Oo.f32099OooO00o), f3, f4), true), jOooO0o, jOooO0OO, null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3072, 0, 65008);
            float f5 = 4;
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f5), composer, 6);
            o0O00O0o.OooO00o(SizeKt.OooOO0o(oooO00o, 13), 1, 0L, composer, 54, 4);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f5), composer, 6);
            o000O0O0.OooO0OO(o00o1.OooO0OO(eventCreateViewModel.getDateModelEnd().getTimeInMillis(), "dd/MM/yyyy HH:mm"), rowScopeInstance.OooO00o(PaddingKt.OooO0o(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(ClickableKt.OooO0Oo(oooO00o, false, new o0Oo0oo(o00oo0o0OooO00o, appCompatActivity, eventCreateViewModel), 7), p033OoooO00.o00O0O.OooO0OO(f2)), j, o000O0Oo.f32099OooO00o), f3, f4), true), u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3072, 0, 65008);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f), composer, 6);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0OO00O(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOO0(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-586271208);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41692OooO0O0;
            q3 q3Var = q3.f47325OooO00o;
            o00O0OO.OooO00o(null, 0L, 0, null, null, q3.f47326OooO0O0, j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 1769472, 0, 1951);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo0o0Oo(i));
    }
}
