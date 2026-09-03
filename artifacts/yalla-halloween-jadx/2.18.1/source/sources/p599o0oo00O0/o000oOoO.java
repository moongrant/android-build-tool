package p599o0oo00O0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p159o00OoOO.o00O000;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;
import p530o0o0OOO.o00O;
import p571o0oOo0o.oo00o;
import p579o0oOoOOo.k0;
import p580o0oOoOo.oO0000Oo;
import p580o0oOoOo.oO0000o0;
import p580o0oOoOo.oO0Oo0o0;
import p580o0oOoOo.oOOOoo00;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f47934OooO00o = new o000oOoO();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f47935Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47936Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0O0("102238");
            o00O000 o00o000OooO = o00O000.OooO();
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            o00o000OooO.OooO00o(false, ((Boolean) o00O.OooO0o.f43221OooO0o0.getValue()).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f47937Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            o00O.OooO0o.f43225OooOO0O.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f47938Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43176Oooo0OO.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f47939Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
            Activity activityOooO0O0 = p254o00ooO0O.o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                PurchaseLockRoomActivity.f22505OooooOO.OooO00o(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47941Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f47941Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000oOoO.this.OooO00o(ooo00o, this.f47941Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f47942Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f47943Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47944Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(LiveRoomVM liveRoomVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f47942Oooo0o = liveRoomVM;
            this.f47943Oooo0oO = oo0oo0oo;
            this.f47944Oooo0oo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p484o0o000OO.OooOOOO<ApiResult<Object>> oooOOOOFollowRoom = this.f47942Oooo0o.followRoom(false);
            oo00o.OooO0O0(oooOOOOFollowRoom, this.f47943Oooo0oO);
            o0o0000.o000oOoO.OooO0Oo(oooOOOOFollowRoom, this.f47944Oooo0oo, p599o0oo00O0.Oooo0.f47915Oooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO f47945Oooo0o = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000.OooO().OooOoo0(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()), AppEventsConstants.EVENT_PARAM_VALUE_NO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f47946Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f47947Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo f47948Oooo0o = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f47949Oooo0o = new OooOo00();

        public OooOo00() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000 o00o000OooO = o00O000.OooO();
            o00O o00o2 = o00O.f43140OooO00o;
            o00o000OooO.OooOo00(String.valueOf(((Number) o00O.f43161OooOo0O.getValue()).longValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo0 f47950Oooo0o = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O o00o2 = o00O.f43140OooO00o;
            if (o00o2.OooO0O0().f21216Oooo0o == WebFrom.ActivityNotice) {
                p606o0oo0O.OooOo.OooO0OO("101050", MapsKt.mapOf(new Pair("activity", o00o2.OooO0O0().f21227OoooOoO)));
            }
            WebPageInfo.OooO00o oooO00o = WebPageInfo.f21213OoooOoo;
            o00o2.OooOOO(WebPageInfo.f21214Ooooo00);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f47951Oooo0o = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43162OooOo0o.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0oo00O0.o000oOoO$o000oOoO, reason: collision with other inner class name */
    public static final class C0418o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0418o000oOoO f47952Oooo0o = new C0418o000oOoO();

        public C0418o000oOoO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0O0("102237");
            Observable<Object> observable = LiveEventBus.get("INVITE_UP_MIC");
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            observable.post(Boolean.valueOf(((Boolean) o00O.OooO0o.f43221OooO0o0.getValue()).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        CreationExtras defaultViewModelCreationExtras3;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(162236607);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Context context = (Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0);
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
            ViewModel viewModel = ViewModelKt.viewModel(EventViewModel.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            EventViewModel eventViewModel = (EventViewModel) viewModel;
            EventKt.OooOOO0(eventViewModel.getShowAddToCalendarDialog(), context, eventViewModel.getAddToCalendarEventModel(), ooo00oOooOOo, 576);
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
            ViewModel viewModel2 = ViewModelKt.viewModel(LiveRoomVM.class, current2, null, null, defaultViewModelCreationExtras2, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel2;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current3 = localViewModelStoreOwner.getCurrent(ooo00oOooOOo, 6);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current3 instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras3 = ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras3, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras3 = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel3 = ViewModelKt.viewModel(oO0Oo0oo.class, current3, null, null, defaultViewModelCreationExtras3, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            o00O o00o2 = o00O.f43140OooO00o;
            o0O0oo0o.OooO0Oo(o00O.f43166OooOoo, o00000.OooO0OO.OooO00o(R.string.Unfollow, ooo00oOooOOo), o00000.OooO0OO.OooO00o(R.string.un_follow_content, ooo00oOooOOo), null, false, false, null, null, o00000.OooO0OO.OooO00o(R.string.Confirm, ooo00oOooOOo), false, null, false, new OooOO0O(liveRoomVM, (oO0Oo0oo) viewModel3, lifecycleOwner), null, false, null, OooOOO0.f47946Oooo0o, null, null, ooo00oOooOOo, 0, 1572864, 454392);
            o0O0oo0o.OooO0Oo(o00O.f43160OooOo00, o00000.OooO0OO.OooO00o(R.string.Unjoin_the_Member_Group, ooo00oOooOOo), o00000.OooO0OO.OooO00o(R.string.unjoin_the_member_group_tip, ooo00oOooOOo), null, false, false, null, null, null, false, null, false, OooOOO.f47945Oooo0o, null, false, null, OooOOOO.f47947Oooo0o, null, null, ooo00oOooOOo, 0, 1573248, 454648);
            o0O0oo0o.OooO0Oo(o00O.f43159OooOo0, o00000.OooO0OO.OooO00o(R.string.Remove_Member, ooo00oOooOOo), o00000.OooO0OO.OooO00o(R.string.remove_member_tip, ooo00oOooOOo), null, false, false, null, null, o00000.OooO0OO.OooO00o(R.string.Remove, ooo00oOooOOo), false, null, false, OooOo00.f47949Oooo0o, null, false, null, OooOo.f47948Oooo0o, null, null, ooo00oOooOOo, 0, 1573248, 454392);
            o0O0oo0o.OooO0Oo(o00O.f43162OooOo0o, o00000.OooO0OO.OooO00o(R.string.room_member_convene_dialog_title, ooo00oOooOOo), o000O0O0.OooO0OO(R.string.room_member_convene_dialog_info1) + '\n' + o000O0O0.OooO0OO(R.string.room_member_convene_dialog_info2), null, false, false, null, null, null, false, null, false, Oooo000.f47951Oooo0o, null, false, null, null, null, null, ooo00oOooOOo, 0, 384, 520184);
            k0.f45988OooO00o.OooO00o(o00o2.OooO0O0(), Oooo0.f47950Oooo0o, ooo00oOooOOo, 440);
            oO0Oo0o0.f46641OooO00o.OooO00o(ooo00oOooOOo, 6);
            oOOOoo00.f46690OooO00o.OooO00o(ooo00oOooOOo, 6);
            oO0000Oo.f46478OooO00o.OooO00o(ooo00oOooOOo, 6);
            oO0000o0.f46481OooO00o.OooO00o(ooo00oOooOOo, 6);
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            o0O00OO<Boolean> o0o00oo2 = o00O.OooO0o.f43218OooO0OO;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.mic_tops_content);
            String[] strArr = new String[1];
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) o00O.OooO0o.f43219OooO0Oo.getValue();
            strArr[0] = roomUserInfoModel != null ? roomUserInfoModel.getUserName() : null;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr), null, false, false, null, null, o00000.OooO0OO.OooO00o(R.string.Accept, ooo00oOooOOo), false, null, false, C0418o000oOoO.f47952Oooo0o, o00000.OooO0OO.OooO00o(R.string.Ignore, ooo00oOooOOo), false, null, OooO00o.f47936Oooo0o, null, null, ooo00oOooOOo, 0, 1573248, 446202);
            o0O0oo0o.OooO0Oo(o00O.OooO0o.f43225OooOO0O, null, o000O0O0.OooO0OO(R.string.apply_mic_is_turned_off), null, false, false, null, null, null, false, null, false, OooO0O0.f47937Oooo0o, null, false, null, null, null, null, ooo00oOooOOo, 0, 384, 520186);
            o0O0oo0o.OooO0Oo(o00O.f43176Oooo0OO, null, o000O0O0.OooO0OO(R.string.login_error_tips), null, false, false, null, null, null, false, null, false, OooO0OO.f47938Oooo0o, null, false, null, null, null, null, ooo00oOooOOo, 0, 384, 520186);
            o0O0oo0o.OooO0Oo(o00O.f43179Oooo0oO, null, o00000.OooO0OO.OooO00o(R.string.You_have_not_purchased_Room_Lock_yet_confirm_to_buy, ooo00oOooOOo), null, false, false, null, null, null, false, null, false, OooO0o.f47939Oooo0o, null, false, null, OooO.f47935Oooo0o, null, null, ooo00oOooOOo, 0, 1573248, 454650);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(i));
    }
}
