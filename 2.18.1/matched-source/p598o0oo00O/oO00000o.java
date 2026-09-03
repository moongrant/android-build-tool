package p598o0oo00O;

import Oooo0.oo00oO;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.yltheme.TextButtonStyle;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.commonsdk.internal.a;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o0000;
import p142o00OOooO.o0000O0;
import p142o00OOooO.o0000oo;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p145o00Oo0.o0O0ooO;
import p254o00ooO0O.o000O0o;
import p257o00ooOO0.o0O0oo0o;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p391o0OOooOo.o0O00000;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;
import p584o0oOoo.o000O;
import p584o0oOoo.o000OO00;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO00000o extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO00000o f47706OooO00o = new oO00000o();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47708Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47709Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47708Oooo0oO = roomThemeCustomizeVM;
            this.f47709Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO0o(this.f47708Oooo0oO, ooo00o, this.f47709Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47710Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f47710Oooo0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletActivity.f23268OoooooO.OooO00o(this.f47710Oooo0o, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f47711Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f47713Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47714Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OOOO0 o00oooo1, RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47713Oooo0oO = o00oooo1;
            this.f47714Oooo0oo = roomThemeCustomizeVM;
            this.f47711Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO0o0(this.f47713Oooo0oO, this.f47714Oooo0oo, ooo00o, this.f47711Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.store.RoomThemeCustomizeScreen$Content$2", f = "RoomThemeCustomizeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47715Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47716Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LifecycleOwner lifecycleOwner, RoomThemeCustomizeVM roomThemeCustomizeVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f47715Oooo0o = lifecycleOwner;
            this.f47716Oooo0oO = roomThemeCustomizeVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f47715Oooo0o, this.f47716Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = 5;
            LiveEventBus.get("ROOM_THEME_PREVIEW_CROP_RESULT").observe(this.f47715Oooo0o, new o0000(this.f47716Oooo0oO, i));
            LiveEventBus.get("CUSTOM_THEME_GET_YALLA_PREMIUM_4_5").observe(this.f47715Oooo0o, new o0000oo(this.f47716Oooo0oO, i));
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().observe(this.f47715Oooo0o, new o0000O0(this.f47716Oooo0oO, i));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47718Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47719Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47718Oooo0oO = o00o0o01;
            this.f47719Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO00o(this.f47718Oooo0oO, ooo00o, this.f47719Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47720Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f47721Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RoomThemeCustomizeVM roomThemeCustomizeVM, CustomPrices customPrices) {
            super(0);
            this.f47720Oooo0o = roomThemeCustomizeVM;
            this.f47721Oooo0oO = customPrices;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47720Oooo0o.setCurrentThemeType(this.f47721Oooo0oO.getThemeType());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47723Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47724Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47723Oooo0oO = roomThemeCustomizeVM;
            this.f47724Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO0o(this.f47723Oooo0oO, ooo00o, this.f47724Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f47725Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f47727Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47728Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f47729OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f47730OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0O0O0O o0o0o0o, RoomThemeCustomizeVM roomThemeCustomizeVM, CustomPrices customPrices, o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f47727Oooo0oO = o0o0o0o;
            this.f47728Oooo0oo = roomThemeCustomizeVM;
            this.f47725Oooo = customPrices;
            this.f47730OoooO00 = o00oooo1;
            this.f47729OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO0oO(this.f47727Oooo0oO, this.f47728Oooo0oo, this.f47725Oooo, this.f47730OoooO00, ooo00o, this.f47729OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f47731Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CustomPrices f47732Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(boolean z, CustomPrices customPrices) {
            super(2);
            this.f47731Oooo0o = z;
            this.f47732Oooo0oO = customPrices;
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2;
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                boolean z = this.f47731Oooo0o;
                CustomPrices customPrices = this.f47732Oooo0oO;
                composer.OooO0o0(733328855);
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o0O0O00.o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
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
                ?? r5 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                p100o000oOoO.oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r5);
                ?? r1 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                p100o000oOoO.oO00000o.OooO0O0(composer, oooO, r1);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                p100o000oOoO.oO00000o.OooO0O0(composer, layoutDirection, r2);
                ?? r25 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r25, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                Oooo0o0.o00O000.OooO0O0 oooO0O0 = p028Oooo0o0.o00O000.f2033OooO0o;
                composer.OooO0o0(-483455358);
                o0O0O00.o000000 o000000VarOooO00o = oo00o.OooO00o(oooO0O0, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o0);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r5, composer, oooO2, r1, composer, layoutDirection2, r2, composer, o00ooooo3, r25, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                o000O0O0.OooO0OO(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.xxx_days), RoomThemeCustomizeVM.INSTANCE.OooO00o(customPrices.getThemeType())), null, u.OooO0O0(composer).OooO0oO(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65530);
                p254o00ooO0O.o0000oo.OooO0OO((float) 5.5d, null, composer, 6, 2);
                o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4181OooOO0o;
                composer.OooO0o0(693286680);
                o0O0O00.o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O1, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
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
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r5, composer, oooO3, r1, composer, layoutDirection3, r2, composer, o00ooooo4, r25, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.coin, composer), null, SizeKt.OooOO0(oooO00o, 16), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                float f = 2;
                p254o00ooO0O.o0000oo.OooO0O0(f, null, composer, 6, 2);
                composer.OooO0o0(-1015685419);
                if (customPrices.getDiscountPrice() != customPrices.getOriginalPrice()) {
                    String strValueOf = String.valueOf(customPrices.getOriginalPrice());
                    long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(14, composer);
                    p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                    ooo00o2 = composer;
                    o000O0O0.OooO0OO(strValueOf, null, p507o0o00oOO.o0000O0.f41805o0Oo0oo, jOooO00o, null, null, null, 0L, o0000O0.OooO.f27248OooO0o0, null, 0L, 0, false, 0, null, null, ooo00o2, 100663680, 0, 65266);
                    p254o00ooO0O.o0000oo.OooO0O0(f, null, ooo00o2, 6, 2);
                } else {
                    ooo00o2 = composer;
                }
                ooo00o2.Oooo0o0();
                String strValueOf2 = String.valueOf(customPrices.getDiscountPrice());
                long jOooO00o2 = p617o0oo0o.o00Oo0.OooO00o(14, ooo00o2);
                p507o0o00oOO.o0000O0 o0000o2 = p507o0o00oOO.o0000O0.f41691OooO00o;
                o000O0O0.OooO0OO(strValueOf2, null, p507o0o00oOO.o0000O0.f41803o0OO00O, jOooO00o2, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 384, 0, 65522);
                o00OO0O.OooOO0O.OooO00o(ooo00o2);
                if (z) {
                    o00OO0OO alignment = o00OO0O0.OooO00o.f4174OooO0Oo;
                    Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                    Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                    p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
                    Intrinsics.checkNotNullParameter(other, "other");
                    Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_room_theme_customize_pay_selected, ooo00o2), null, SizeKt.OooOO0(other, 20), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o2, 56, 120);
                }
                o0O0OO0.OooO00o(ooo00o2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47733Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RoomThemeCustomizeVM roomThemeCustomizeVM) {
            super(0);
            this.f47733Oooo0o = roomThemeCustomizeVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f47733Oooo0o.loadThemePrice();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f47734Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47736Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47737Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(o00O0O00 o00o0o01, RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47736Oooo0oO = o00o0o01;
            this.f47737Oooo0oo = roomThemeCustomizeVM;
            this.f47734Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO0oo(this.f47736Oooo0oO, this.f47737Oooo0oo, ooo00o, this.f47734Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47738Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(RoomThemeCustomizeVM roomThemeCustomizeVM) {
            super(3);
            this.f47738Oooo0o = roomThemeCustomizeVM;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O composer = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                RoomThemeCustomizeVM roomThemeCustomizeVM = this.f47738Oooo0o;
                composer.OooO0o0(-483455358);
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o0O0O00.o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
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
                p100o000oOoO.oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                p100o000oOoO.oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                p100o000oOoO.oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                oO00000o.OooOOO(oO00000o.f47706OooO00o, ColumnScopeInstance.f5743OooO00o, roomThemeCustomizeVM, composer, 454);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47739Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f47739Oooo0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            VipActivity.f23570OoooOOo.OooO00o(this.f47739Oooo0o, VipLevel.Vip0);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47740Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(AppCompatActivity appCompatActivity) {
            super(0);
            this.f47740Oooo0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumActivity.f23360o0ooOOo.OooO00o(this.f47740Oooo0o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47742Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47743Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47742Oooo0oO = roomThemeCustomizeVM;
            this.f47743Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOOO0(this.f47742Oooo0oO, ooo00o, this.f47743Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f47744Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(AppCompatActivity appCompatActivity) {
            super(0);
            this.f47744Oooo0o = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AppCompatActivity appCompatActivity = this.f47744Oooo0o;
            o0O00000.OooO0OO("Me_store_CreateTheme_uploadImage");
            try {
                p618o0oo0o0.o0O0O00.OooO0OO(appCompatActivity, p618o0oo0o0.oo0o0Oo.f48607OooO0O0, null, new oO000O0O(appCompatActivity));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47745Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47746Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47747Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(RoomThemeCustomizeVM roomThemeCustomizeVM, LifecycleOwner lifecycleOwner, o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f47745Oooo0o = roomThemeCustomizeVM;
            this.f47746Oooo0oO = lifecycleOwner;
            this.f47747Oooo0oo = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f47745Oooo0o.isNewTheme()) {
                RoomThemeCustomizeVM roomThemeCustomizeVM = this.f47745Oooo0o;
                String customImagePath = this.f47745Oooo0o.getCustomImagePath();
                if (customImagePath == null) {
                    customImagePath = "";
                }
                LiveData<CloudFileInfo> liveDataUploadCustomImage = roomThemeCustomizeVM.uploadCustomImage(new File(customImagePath));
                final LifecycleOwner lifecycleOwner = this.f47746Oooo0oO;
                final RoomThemeCustomizeVM roomThemeCustomizeVM2 = this.f47745Oooo0o;
                final o0O00OO<Boolean> o0o00oo2 = this.f47747Oooo0oo;
                liveDataUploadCustomImage.observe(lifecycleOwner, new Observer() { // from class: o0oo00O.oO0000Oo
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        RoomThemeCustomizeVM viewModel = roomThemeCustomizeVM2;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        o0O00OO showBuySuccessDialog = o0o00oo2;
                        CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
                        Intrinsics.checkNotNullParameter(lifecycleOwner2, "$lifecycleOwner");
                        Intrinsics.checkNotNullParameter(showBuySuccessDialog, "$showBuySuccessDialog");
                        if (cloudFileInfo != null) {
                            Intrinsics.checkNotNull(cloudFileInfo);
                            viewModel.purchaseNewTheme(CloudImageUtilKt.imgRemoveHost(cloudFileInfo.getUrl()), viewModel.getCurrentThemeType()).observe(lifecycleOwner2, new OooOo(new oO0000o0(showBuySuccessDialog), null, null, false, 14));
                        }
                    }
                });
            } else {
                this.f47745Oooo0o.reNewOldTheme().observe(this.f47746Oooo0oO, new o0o0000.OooOo(oO000.f47702Oooo0o, null, null, false, 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00O0O f47748Oooo0o = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O o000o = o000O.f46945OooO00o;
            o000O.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47749Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47750Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47751Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47752Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(RoomThemeCustomizeVM roomThemeCustomizeVM, o0O00OO<Boolean> o0o00oo2, int i, o0O00OO<Boolean> o0o00oo3) {
            super(0);
            this.f47750Oooo0o = roomThemeCustomizeVM;
            this.f47751Oooo0oO = o0o00oo2;
            this.f47752Oooo0oo = i;
            this.f47749Oooo = o0o00oo3;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007b  */
        /* JADX WARN: Code duplicated, block: B:30:0x0086  */
        /* JADX WARN: Code duplicated, block: B:32:0x0092  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Long value;
            boolean z;
            if (this.f47750Oooo0o.getCurrentThemeType() > 0 && !TextUtils.isEmpty(this.f47750Oooo0o.getCustomImagePath())) {
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
                if (value2 != null && value2.getFirst().booleanValue()) {
                    value = oooOOO.OooO0OO().getValue();
                    if (value == null) {
                        value = 0L;
                    }
                    if (value.longValue() < this.f47752Oooo0oo) {
                        p189o00o00oO.oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    } else {
                        this.f47749Oooo.setValue(Boolean.TRUE);
                    }
                } else {
                    Pair<Integer, Integer> value3 = oooOOO.OooO().getValue();
                    if (!(value3 != null && value3.getFirst().intValue() == VipState.Vip.getValue())) {
                        Pair<Integer, Integer> value4 = oooOOO.OooO().getValue();
                        z = value4 != null && value4.getFirst().intValue() == VipState.VipHide.getValue();
                    }
                    if (z) {
                        value = oooOOO.OooO0OO().getValue();
                        if (value == null) {
                            value = 0L;
                        }
                        if (value.longValue() < this.f47752Oooo0oo) {
                            p189o00o00oO.oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                        } else {
                            this.f47749Oooo.setValue(Boolean.TRUE);
                        }
                    } else {
                        this.f47751Oooo0oO.setValue(Boolean.TRUE);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47754Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47755Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47754Oooo0oO = roomThemeCustomizeVM;
            this.f47755Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooO(this.f47754Oooo0oO, ooo00o, this.f47755Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<Context, View> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f47756Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(View view) {
            super(1);
            this.f47756Oooo0o = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f47756Oooo0o;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47758Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47759Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47758Oooo0oO = roomThemeCustomizeVM;
            this.f47759Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOOO0(this.f47758Oooo0oO, ooo00o, this.f47759Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f47761Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47762Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(String str, int i) {
            super(2);
            this.f47761Oooo0oO = str;
            this.f47762Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOO0O(this.f47761Oooo0oO, ooo00o, this.f47762Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47764Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47765Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47764Oooo0oO = roomThemeCustomizeVM;
            this.f47765Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOO0(this.f47764Oooo0oO, ooo00o, this.f47765Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47766Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f47767Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(RoomThemeCustomizeVM roomThemeCustomizeVM, Context context) {
            super(1);
            this.f47766Oooo0o = roomThemeCustomizeVM;
            this.f47767Oooo0oO = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f47766Oooo0o.isNewTheme()) {
                Context context = this.f47767Oooo0oO;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                AppCompatActivity appCompatActivity = (AppCompatActivity) context;
                o0O00000.OooO0OO("Me_store_CreateTheme_uploadImage");
                try {
                    p618o0oo0o0.o0O0O00.OooO0OO(appCompatActivity, p618o0oo0o0.oo0o0Oo.f48607OooO0O0, null, new oO000O0O(appCompatActivity));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f47768Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f47769Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47770Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(View view, RoomThemeCustomizeVM roomThemeCustomizeVM) {
            super(1);
            this.f47769Oooo0o = view;
            this.f47770Oooo0oO = roomThemeCustomizeVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            NetImageView netImageView = (NetImageView) this.f47769Oooo0o.findViewById(R.id.ivSelectedImage);
            if (this.f47770Oooo0oO.isNewTheme()) {
                netImageView.setImageBitmap(BitmapFactory.decodeFile(this.f47770Oooo0oO.getCustomImagePath()));
            } else {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(netImageView.getContext());
                oooO00o.f48429OooO0OO = this.f47770Oooo0oO.getCustomImagePath();
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(netImageView);
            }
            netImageView.setCornerRadius(com.yalla.support.common.util.OooOo00.OooO00o(8));
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeCustomizeVM f47772Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47773Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(RoomThemeCustomizeVM roomThemeCustomizeVM, int i) {
            super(2);
            this.f47772Oooo0oO = roomThemeCustomizeVM;
            this.f47773Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOO0(this.f47772Oooo0oO, ooo00o, this.f47773Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47775Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(int i) {
            super(2);
            this.f47775Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00000o.this.OooOO0o(ooo00o, this.f47775Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooOOO(oO00000o oo00000o, o00O0O00 o00o0o01, RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        Objects.requireNonNull(oo00000o);
        oOO00O composer = ooo00o.OooOOo(947064448);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OO0OO.OooO00o oooO00o = o00OO0O0.OooO00o.f4184OooOOOO;
        float f = 16;
        Oooo0o0.o00O000.OooO oooOOooO0oo = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f);
        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(BackgroundKt.OooO0O0(o00o0o01.OooO00o(SizeKt.OooO0o0(oo00oO.OooO0OO(oooO00o2, oo00oO.OooO0O0(composer, 1))), true), u.OooO0O0(composer).OooO0Oo(), o000O0Oo.f32099OooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, 1);
        composer.OooO0o0(-483455358);
        o0O0O00.o000000 o000000VarOooO00o = oo00o.OooO00o(oooOOooO0oo, oooO00o, composer);
        composer.OooO0o0(-1323940314);
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
        p100o000oOoO.oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        p100o000oOoO.oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        p100o000oOoO.oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        oO00000o oo00000o2 = f47706OooO00o;
        oo00000o2.OooOOO0(roomThemeCustomizeVM, composer, 56);
        oo00000o2.OooOO0(roomThemeCustomizeVM, composer, 56);
        oo00000o2.OooO0o(roomThemeCustomizeVM, composer, 56);
        oo00000o2.OooO(roomThemeCustomizeVM, composer, 56);
        oo00000o2.OooOO0o(composer, 6);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        float f2 = (float) 0.5d;
        o0O0OOO0.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o2), f2), composer, 6);
        p031OoooO.o00Oo0.OooO00o(null, u.OooO0O0(composer).OooOO0o(), f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, composer, 384, 9);
        oo00000o.OooO0o0(BackgroundKt.OooO0O0(oooO00o2, u.OooO0O0(composer).OooO0Oo(), o000O0Oo.f32099OooO00o), roomThemeCustomizeVM, composer, (i & 896) | 64);
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO0000O(oo00000o, o00o0o01, roomThemeCustomizeVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1702636638);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
        List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(p507o0o00oOO.o0000O0.f41811oo0o0Oo), new o00000O0(p507o0o00oOO.o0000O0.f41802o0O0O00)});
        Intrinsics.checkNotNullParameter(colors, "colors");
        long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long jOooO00o2 = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 100.0f);
        Intrinsics.checkNotNullParameter(colors, "colors");
        o000OO o000oo2 = new o000OO(colors, jOooO00o, jOooO00o2, 0);
        boolean z = !TextUtils.isEmpty(roomThemeCustomizeVM.getCustomImagePath());
        p031OoooO.OooO0OO oooO0OO = p031OoooO.OooO0OO.f2549OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        p031OoooO.OooO0O0 oooO0O0OooO00o = oooO0OO.OooO00o(o00000O0.f32069OooO0oo, u.OooO0O0(ooo00oOooOOo).OooO00o(), u.OooO0O0(ooo00oOooOOo).OooO0O0(), u.OooO0O0(ooo00oOooOOo).OooO0OO(), ooo00oOooOOo, a.k, 0);
        Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
        Intrinsics.checkNotNull(objOooOO0o, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objOooOO0o;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00oOooOOo.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00oOooOOo.Oooo00o(objOooO0o2);
        }
        ooo00oOooOOo.Oooo0o0();
        o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o3 = ooo00oOooOOo.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00oOooOOo.Oooo00o(objOooO0o3);
        }
        ooo00oOooOOo.Oooo0o0();
        o0O00OO o0o00oo4 = (o0O00OO) objOooO0o3;
        int currentCustomPrice = roomThemeCustomizeVM.getCurrentCustomPrice();
        String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.title_RoomMember_Tips);
        String strOooO0OO2 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_dialog_premium_vip_warn);
        String strOooO0OO3 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.Get_Yalla_Premium);
        TextButtonStyle textButtonStyle = TextButtonStyle.OutLined;
        o0O0oo0o.OooO0Oo(o0o00oo2, strOooO0OO, strOooO0OO2, null, true, false, null, null, strOooO0OO3, false, textButtonStyle, false, new Oooo000(appCompatActivity), p254o00ooO0O.o000O0O0.OooO0OO(R.string.Get_Vip), false, textButtonStyle, new Oooo0(appCompatActivity), null, null, ooo00oOooOOo, 24582, 196614, 412392);
        p504o0o00o0O.OooOo.OooO00o(roomThemeCustomizeVM.getShowLoadingDialog().getValue().booleanValue(), null, null, ooo00oOooOOo, 0, 6);
        o0O0oo0o.OooO0Oo(o0o00oo3, null, com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_dialog_before_buy_warn), String.valueOf(currentCustomPrice), RoomThemeCustomizeVM.INSTANCE.OooO00o(roomThemeCustomizeVM.getCurrentThemeType())), null, false, false, null, null, p254o00ooO0O.o000O0O0.OooO0OO(R.string.Pay), false, null, false, new o000oOoO(roomThemeCustomizeVM, lifecycleOwner, o0o00oo4), null, false, null, o0OoOo0.f47768Oooo0o, null, null, ooo00oOooOOo, 6, 1572864, 454394);
        o0O0oo0o.OooO0Oo(o0o00oo4, p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_dialog_success_title), p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_dialog_success_content), null, false, false, null, null, null, false, null, false, o00O0O.f47748Oooo0o, null, false, null, null, null, null, ooo00oOooOOo, 196614, 384, 520152);
        p.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Pay), p617o0oo0o.o00Oo0.OooO00o(16, ooo00oOooOOo), null, z, false, null, oooO0O0OooO00o, null, null, null, null, null, BackgroundKt.OooO00o(p442o0OoOo0.Oooo000.OooO00o(PaddingKt.OooO0oO(SizeKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), 40), 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), p033OoooO00.o00O0O.OooO00o()), o000oo2, null, 6), new o00Oo0(roomThemeCustomizeVM, o0o00oo2, currentCustomPrice, o0o00oo3), ooo00oOooOOo, 0, 0, 4020);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Ooo(roomThemeCustomizeVM, i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-318142531);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomThemeCustomizeVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            RoomThemeCustomizeVM roomThemeCustomizeVM = (RoomThemeCustomizeVM) viewModel;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
            Bundle bundleOooO0O0 = o000OO00.OooO0O0((NavBackStackEntry) ooo00oOooOOo.OooOO0o(o000OO00.f46954OooO00o), ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(bundleOooO0O0);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                String string = bundleOooO0O0.getString("preThemePicUrl");
                long j = bundleOooO0O0.getLong("preThemeThemeId", -1L);
                int i3 = bundleOooO0O0.getInt("preThemeThemeType", 2);
                if (!TextUtils.isEmpty(string) && j != -1) {
                    roomThemeCustomizeVM.setCurrentThemeType(i3);
                    roomThemeCustomizeVM.setReNewThemeId(j);
                    roomThemeCustomizeVM.setCustomImagePath(string);
                }
                roomThemeCustomizeVM.loadThemePrice();
                ooo00oOooOOo.Oooo00o(null);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0o0(Unit.INSTANCE, new OooO0OO(lifecycleOwner, roomThemeCustomizeVM, null), ooo00oOooOOo);
            OooO0oo(o00o0o01, roomThemeCustomizeVM, ooo00oOooOOo, ((i2 << 3) & 896) | (i2 & 14) | 64);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(o00o0o01, i));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-923159374);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        List<CustomPrices> dayChooseList = roomThemeCustomizeVM.getDayChooseList();
        if (dayChooseList != null && dayChooseList.isEmpty()) {
            oo0ooO oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(roomThemeCustomizeVM, i));
            return;
        }
        float f = 16;
        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        Oooo0o0.o00O000.OooO oooOOooO0oo = p028Oooo0o0.o00O000.f2029OooO00o.OooO0oo(f);
        composer.OooO0o0(693286680);
        o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOooO0oo, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
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
        p100o000oOoO.oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        p100o000oOoO.oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        p100o000oOoO.oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        List<CustomPrices> dayChooseList2 = roomThemeCustomizeVM.getDayChooseList();
        Intrinsics.checkNotNull(dayChooseList2);
        for (CustomPrices customPrices : dayChooseList2) {
            f47706OooO00o.OooO0oO(rowScopeInstance, roomThemeCustomizeVM, customPrices, o000O0o.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new OooOO0(roomThemeCustomizeVM, customPrices), 253), composer, 25158);
        }
        o0O0OO0.OooO00o(composer);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        oo0ooO oo0oooOooOo2 = composer.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOO0O(roomThemeCustomizeVM, i));
    }

    /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(o00OOOO0 o00oooo1, RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1409888038);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Object objOooOO0o = composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
        Intrinsics.checkNotNull(objOooOO0o, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objOooOO0o;
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(PaddingKt.OooO0oO(SizeKt.OooO0o(o00oooo1), 15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), 50);
        composer.OooO0o0(733328855);
        o0O0O00.o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
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
        ?? r6 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        p100o000oOoO.oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r6);
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        p100o000oOoO.oO00000o.OooO0O0(composer, oooO, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        p100o000oOoO.oO00000o.OooO0O0(composer, layoutDirection, r3);
        ?? r25 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r25, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0Oo = SizeKt.OooO0Oo(oooO00o);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r6, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r25, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.coin, composer), null, SizeKt.OooOO0(oooO00o, 21), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        p254o00ooO0O.o0000oo.OooO0O0(5, null, composer, 6, 2);
        String coin = roomThemeCustomizeVM.getCoin();
        long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(18, composer);
        p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
        long j = p507o0o00oOO.o0000O0.f41747Oooooo;
        o000O0O0.OooO0OO(coin, null, j, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        o00OOOO0 o00oooo0OooO0Oo2 = SizeKt.OooO0Oo(oooO00o);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4174OooO0Oo;
        Intrinsics.checkNotNullParameter(o00oooo0OooO0Oo2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(o00oooo0OooO0Oo2.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), false, false, null, new OooO00o(appCompatActivity), 253);
        o0O0O00.o000000 o000000VarOooO00o2 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r6, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r25, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        o000O0O0.OooO0OO(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Recharge_), oooO00o, j, p617o0oo0o.o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, new o00000O.oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 432, 0, 32752);
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
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00oooo1, roomThemeCustomizeVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(o0O0O0O o0o0o0o, RoomThemeCustomizeVM roomThemeCustomizeVM, CustomPrices customPrices, o00OOOO0 o00oooo1, oOO00O ooo00o, int i) {
        long jOooOOo0;
        long j;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1911441734);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        boolean z = roomThemeCustomizeVM.getCurrentThemeType() == customPrices.getThemeType();
        float f = 1;
        if (z) {
            p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
            jOooOOo0 = p507o0o00oOO.o0000O0.f41747Oooooo;
        } else {
            jOooOOo0 = u.OooO0O0(ooo00oOooOOo).OooOOo0();
        }
        o0O0ooO o0o0ooo = new o0O0ooO(jOooOOo0);
        float f2 = 9;
        o00OOOO0 o00oooo0OooO00o = o0o0o0o.OooO00o(SizeKt.OooO0oO(BorderKt.OooO0OO(o00oooo1, f, o0o0ooo, p033OoooO00.o00O0O.OooO0OO(f2)), 69), true);
        p033OoooO00.o0OoOo0 o0oooo0OooO0OO = p033OoooO00.o00O0O.OooO0OO(f2);
        if (z) {
            p507o0o00oOO.o0000O0 o0000o2 = p507o0o00oOO.o0000O0.f41691OooO00o;
            j = p507o0o00oOO.o0000O0.f41804o0OOO0o;
        } else {
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            j = o00000O0.f32067OooO0o0;
        }
        p031OoooO.OooOOO0.OooO00o(o00oooo0OooO00o, o0oooo0OooO0OO, j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 1017942839, new OooOOO0(z, customPrices)), ooo00oOooOOo, 1572864, 56);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(o0o0o0o, roomThemeCustomizeVM, customPrices, o00oooo1, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(o00O0O00 o00o0o01, RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1578796561);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00O0OO.OooO00o(null, 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 0, 0, 2047);
        o0O0o.OooO0o0(roomThemeCustomizeVM.getContentState(), o00o0o01.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, true), null, null, null, new OooOOOO(roomThemeCustomizeVM), o00O0000.OooO00o(ooo00oOooOOo, -924129428, new OooOo00(roomThemeCustomizeVM)), ooo00oOooOOo, 1572864, 28);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo(o00o0o01, roomThemeCustomizeVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0(RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        Object obj;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1539267770);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (TextUtils.isEmpty(roomThemeCustomizeVM.getCustomImagePath())) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new oo000o(roomThemeCustomizeVM, i));
            return;
        }
        Context context = (Context) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            obj = objOooO0o;
            View rootView = View.inflate(context, R.layout.room_include_theme_room_preview, null);
            Intrinsics.checkNotNullExpressionValue(rootView, "this");
            p254o00ooO0O.oOO00O.OooO(rootView);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(com.yalla.support.common.util.OooOo00.OooO00o(208.0f), -2);
            layoutParams.height = (layoutParams.width * p522o0o0O0o.o000O0Oo.f42986OooO0O0) / p522o0o0O0o.o000O0Oo.f42985OooO00o;
            rootView.setLayoutParams(layoutParams);
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            p254o00ooO0O.oOO00O.OooO0oO(rootView, new o0Oo0oo(roomThemeCustomizeVM, context));
            ooo00oOooOOo.Oooo00o(rootView);
            obj = rootView;
        }
        obj = objOooO0o;
        ooo00oOooOOo.Oooo0o0();
        View view = (View) obj;
        AndroidView_androidKt.OooO00o(new o00oO0o(view), o00OOOO0.OooO00o.f4198Oooo0o, new o0ooOOo(view, roomThemeCustomizeVM), ooo00oOooOOo, 48, 0);
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new o0OOO0o(roomThemeCustomizeVM, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0O(String str, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1717532265);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o000O0O0.OooO0OO(str, SizeKt.OooO0o(PaddingKt.OooO0oO(o00OOOO0.OooO00o.f4198Oooo0o, 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2)), u.OooO0O0(ooo00oOooOOo).OooO(), p617o0oo0o.o00Oo0.OooO00o(13, ooo00oOooOOo), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, (i2 & 14) | 48, 0, 65520);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0OO00O(str, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0o(oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1423572850);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int i3 = (i2 << 3) & 112;
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_1), ooo00oOooOOo, i3);
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_2), ooo00oOooOOo, i3);
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_3), ooo00oOooOOo, i3);
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_4), ooo00oOooOOo, i3);
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_5), ooo00oOooOOo, i3);
            OooOO0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_description_6), ooo00oOooOOo, i3);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo0o0Oo(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOO0(RoomThemeCustomizeVM roomThemeCustomizeVM, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1144346788);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (!TextUtils.isEmpty(roomThemeCustomizeVM.getCustomImagePath())) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new o0O0O00(roomThemeCustomizeVM, i));
            return;
        }
        Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
        Intrinsics.checkNotNull(objOooOO0o, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        p571o0oOo0o.o00O000o o00o000o2 = p571o0oOo0o.o00O000o.f45521OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(PaddingKt.OooO0oO(SizeKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), 159), 55, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), false, false, null, new o000OOo((AppCompatActivity) objOooOO0o), 253);
        p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
        long j = p507o0o00oOO.o0000O0.f41710OooOo0;
        ooo0Oo0 ooo0oo0 = ooo0Oo0.f47895OooO00o;
        o00o000o2.OooO00o(o00oooo0OooO0O0, j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ooo0Oo0.f47896OooO0O0, ooo00oOooOOo, 14155824, 60);
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new o000000(roomThemeCustomizeVM, i));
    }
}
