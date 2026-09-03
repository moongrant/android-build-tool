package p599o0oo00O0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.ProfileLimitModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00o00;
import p033OoooO00.o00O0O;
import p033OoooO00.o0OoOo0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p255o00ooO0o.oo0oOO0;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p442o0OoOo0.Oooo000;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p545o0o0OoOo.a8;
import p561o0oOOooo.oO00Oo0;
import p561o0oOOooo.oOOoOOO0;
import p579o0oOoOOo.s0;
import p604o0oo00oO.oO000OOo;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O00 f47959OooO00o = new o0O0O00();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47961Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f47961Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0O00.this.OooO00o(ooo00o, this.f47961Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f47962Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO000OOo oo000ooo) {
            super(0);
            this.f47962Oooo0o = oo000ooo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (o00O.f43140OooO00o.OooOO0O() && !this.f47962Oooo0o.f48282OooO00o.getValue().booleanValue()) {
                o00O.f43139OooO.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47963Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f47963Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a8 a8Var;
            oOOoOOO0 ooooooo0;
            Context context = this.f47963Oooo0o;
            MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
            if (mixedRoomActivity != null && (a8Var = mixedRoomActivity.f11784o0000Ooo) != null && (ooooooo0 = a8Var.f44361OooO0o0) != null) {
                o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                Integer value = oooO00o.OooO00o().f43329OooOOOO.getValue();
                boolean z = false;
                if (value != null && value.intValue() == 1) {
                    o0O00000.OooO0OO("InRoom_hostAnnouncement_top");
                    if (oooO00o.OooO00o().f43328OooOOO0.getValue() != null) {
                        ProfileLimitModel value2 = oooO00o.OooO00o().f43328OooOOO0.getValue();
                        if (value2 != null) {
                            String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign), value2.getBlockReason());
                            if (value2.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value2.getExpireTime() <= 0) {
                                strOooO00o = OooOo.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), value2.getBlockReason()), o00O0.f48624OooO00o.OooO0Oo(value2.getExpireTime(), System.currentTimeMillis()));
                                z = true;
                            }
                            oo0oOO0 oo0ooo0 = new oo0oOO0(ooooooo0.f44365OooO00o);
                            oo0ooo0.OooOo0O(strOooO00o);
                            if (!z) {
                                oo0ooo0.OooOoOO(true);
                                oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.Continue_));
                                oo0ooo0.OooOo0o(new oO00Oo0(ooooooo0));
                            }
                            ooooooo0.f44919OooO0O0 = oo0ooo0;
                            oo0ooo0.OooOOO0();
                        }
                    } else {
                        ooooooo0.OooO0OO();
                    }
                } else {
                    o0O00000.OooO0OO("InRoom_announcement_top");
                    oo0oOO0 oo0ooo1 = new oo0oOO0(ooooooo0.f44365OooO00o);
                    oo0ooo1.OooOoo(R.string.Announcement);
                    String value3 = oooO00o.OooO00o().f43337OooOo0O.getValue();
                    if (value3 == null || StringsKt.isBlank(value3)) {
                        value3 = o000O0O0.OooO0OO(R.string.title_RoomInfoMenu_normalNotice);
                    }
                    oo0ooo1.OooOo0O(value3);
                    ooooooo0.f44919OooO0O0 = oo0ooo1;
                    oo0ooo1.OooOOO0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47964Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f47965Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, LiveRoomVM liveRoomVM) {
            super(0);
            this.f47964Oooo0o = context;
            this.f47965Oooo0oO = liveRoomVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000OOo onLogin = new o000OOo(this.f47964Oooo0o, this.f47965Oooo0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
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

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47966Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f47966Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47966Oooo0o;
            MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
            if (mixedRoomActivity != null) {
                mixedRoomActivity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        float f;
        Context context;
        o00OOOO0.OooO00o oooO00o;
        o00OOOO0 o00oooo1;
        CreationExtras defaultViewModelCreationExtras2;
        oOO00O composer = ooo00o.OooOOo(1745388725);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
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
            ViewModel viewModel = ViewModelKt.viewModel(oO000OOo.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            oO000OOo oo000ooo = (oO000OOo) viewModel;
            s0.f46279OooO00o.OooO00o(oo000ooo, true, false, new OooO00o(oo000ooo), composer, 24632, 4);
            o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0Oo = SizeKt.OooO0Oo(oooO00o2);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0Oo);
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
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            float f2 = 8;
            o0000oo.OooO0O0(f2, null, composer, 6, 2);
            Context context2 = (Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
            oO0Oo oo0ooOooO00o = p044OooooOO.o00O00O.OooO00o(o00OO00O.f43313OooooOo.OooO00o().f43324OooOO0, null, composer);
            composer.OooO0o0(984178166);
            if (((RoomLoginInformation) oo0ooOooO00o.getValue()) != null) {
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.room_ic_top_announcement, composer);
                o0OoOo0 o0oooo1 = o00O0O.f3431OooO00o;
                float f3 = 24;
                Oooo0.o00.OooO00o(o000oo0oOooO00o, null, SizeKt.OooOO0(PaddingKt.OooO0o0(o000O0o.OooO0O0(Oooo000.OooO00o(oooO00o2, o0oooo1), false, false, null, new OooO0O0(context2), KotlinVersion.MAX_COMPONENT_VALUE), f2), f3), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
                o0000oo.OooO0O0(3, null, composer, 6, 2);
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
                ViewModel viewModel2 = ViewModelKt.viewModel(LiveRoomVM.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
                composer.Oooo0o0();
                oooO00o = oooO00o2;
                f = f2;
                context = context2;
                o00oooo1 = null;
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_room_top_share, composer), null, SizeKt.OooOO0(PaddingKt.OooO0o0(o000O0o.OooO0O0(Oooo000.OooO00o(oooO00o, o0oooo1), false, false, null, new OooO0OO(context2, (LiveRoomVM) viewModel2), KotlinVersion.MAX_COMPONENT_VALUE), f), f3), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
            } else {
                f = f2;
                context = context2;
                oooO00o = oooO00o2;
                o00oooo1 = null;
            }
            composer.Oooo0o0();
            o0000oo.OooO0O0(3, o00oooo1, composer, 6, 2);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_room_close, composer), null, SizeKt.OooOO0(PaddingKt.OooO0o0(o000O0o.OooO0O0(Oooo000.OooO00o(oooO00o, o00O0O.f3431OooO00o), false, false, null, new OooO0o(context), KotlinVersion.MAX_COMPONENT_VALUE), f), 24), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
            o0000oo.OooO0O0(6, o00oooo1, composer, 6, 2);
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
        oo0oooOooOo.OooO00o(new OooO(i));
    }
}
