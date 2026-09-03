package p598o0oo00O;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
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
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p029Oooo0oO.o000O0Oo;
import p029Oooo0oO.o000OO00;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p114o00O00o.o000oOoO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o0O0ooO;
import p257o00ooOO0.o0O0oo0o;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.p;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O0O0O;
import p571o0oOo0o.o00O0OO;
import p571o0oOo0o.oo00o;
import p584o0oOoo.o0000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo0oo extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0Oo0oo f47855OooO00o = new oO0Oo0oo();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47857Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47858Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47857Oooo0oO = o0o00oo2;
            this.f47858Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0Oo0oo.this.OooO0o0(this.f47857Oooo0oO, ooo00o, this.f47858Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f47859Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<StoreRoomChatBubbleModel> f47860Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f47861Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ p604o0oo00oO.oO0Oo0oo f47862Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(androidx.paging.compose.OooO0OO<StoreRoomChatBubbleModel> oooO0OO, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, p604o0oo00oO.oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f47860Oooo0o = oooO0OO;
            this.f47861Oooo0oO = storeRoomChatBubbleMineVM;
            this.f47862Oooo0oo = oo0oo0oo;
            this.f47859Oooo = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o000O0Oo.OooO00o oooO00o = new o000O0Oo.OooO00o(2);
                float f = 9;
                float f2 = 8;
                o0O00O o0o00o2 = new o0O00O(f, f2, f, f2);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                float f3 = 1;
                o000OO00.OooO00o(oooO00o, SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, o0o00o2, false, o00o001.OooO0oo(f3), o00o001.OooO0oo(f3), null, false, new oO0OoOO0(this.f47860Oooo0o, this.f47861Oooo0oO, this.f47862Oooo0oo, this.f47859Oooo), ooo00o2, 1772592, 404);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47864Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47865Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47864Oooo0oO = o00o0o01;
            this.f47865Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0Oo0oo.this.OooO00o(this.f47864Oooo0oO, ooo00o, this.f47865Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47866Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context) {
            super(0);
            this.f47866Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumActivity.f23360o0ooOOo.OooO00o(this.f47866Oooo0o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f47867Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47868Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Context context) {
            super(0);
            this.f47868Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.f23570OoooOOo.OooO00o(this.f47868Oooo0o, VipLevel.Vip1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f47869Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47870Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Context context) {
            super(0);
            this.f47870Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.f23570OoooOOo.OooO00o(this.f47870Oooo0o, VipLevel.Vip1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47872Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47873Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47872Oooo0oO = o0o00oo2;
            this.f47873Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0Oo0oo.this.OooO0o(this.f47872Oooo0oO, ooo00o, this.f47873Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f47874Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f47876Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47877Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f47876Oooo0oO = o0o00oo2;
            this.f47877Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0Oo0oo.this.OooO0oO(this.f47876Oooo0oO, ooo00o, this.f47877Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO(oO0Oo0oo oo0oo0oo, StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, p604o0oo00oO.oO0Oo0oo oo0oo0oo2, LifecycleOwner lifecycleOwner, oOO00O ooo00o, int i) {
        Objects.requireNonNull(oo0oo0oo);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(454000073);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        p.OooO0O0(o000O0O0.OooO0OO(storeRoomChatBubbleModel.getSelected() ? R.string.In_Use : R.string.Use), p254o00ooO0O.o000OO00.OooO0OO(16, ooo00oOooOOo), null, storeRoomChatBubbleModel.getFrozenDay() == 0, false, null, null, o00O0O.OooO0OO(0), null, null, o00O0000.OooO00o(ooo00oOooOOo, 1399639406, new oO0OOo0o(storeRoomChatBubbleModel)), null, SizeKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), 36), new oO000Oo0(storeRoomChatBubbleModel, storeRoomChatBubbleMineVM, oo0oo0oo2, lifecycleOwner), ooo00oOooOOo, 0, 390, 2932);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO000Oo(oo0oo0oo, storeRoomChatBubbleModel, storeRoomChatBubbleMineVM, oo0oo0oo2, lifecycleOwner, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooO0oo(oO0Oo0oo oo0oo0oo, StoreRoomChatBubbleModel storeRoomChatBubbleModel, oOO00O ooo00o, int i) {
        long j;
        o0O0O0o0<LayoutDirection> o0o0o0o0;
        int i2;
        o00OO0OO o00oo0oo;
        o00OOOO0.OooO00o oooO00o;
        o00O00o0 o00o00o1;
        int i3;
        long j2;
        Function0<o000000.OooO00o> function0;
        Function0<o000000.OooO00o> function1;
        o0O0O0o0<o00OOOOo> o0o0o0o1;
        o0O0O0o0<LayoutDirection> o0o0o0o2;
        o0O0O0o0<o0000O0O.OooO> o0o0o0o3;
        o00OOOO0.OooO00o oooO00o2;
        Throwable th;
        String strOooO0OO;
        Objects.requireNonNull(oo0oo0oo);
        oOO00O composer = ooo00o.OooOOo(-1621591298);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o3 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o3), 170);
        float f = 2;
        if (storeRoomChatBubbleModel.getSelected()) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            j = o0000O0.f41710OooOo0;
        } else {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41692OooO0O0;
        }
        float f2 = 6;
        float f3 = 0;
        o00OOOO0 o00oooo0OooO0O0 = BorderKt.OooO0O0(o00oooo0OooO0oO, f, j, o00O0O.OooO0Oo(f2, f2, f3, f3));
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o4 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o4);
        o0O0O0o0<LayoutDirection> o0o0o0o5 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o5);
        o0O0O0o0<o00OOOOo> o0o0o0o6 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o6);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function2 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r1 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r1);
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r3);
        ?? r25 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r25, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        o00O00o0 o00o00o2 = BoxScopeInstance.f5741OooO00o;
        String strImgFormat = CloudImageUtilKt.imgFormat(storeRoomChatBubbleModel.getBackgroundUrl());
        composer.OooO0o0(604400049);
        o0O0O0o0<oOO00O.OooOO0> o0o0o0o7 = o000oOoO.f30327OooO00o;
        oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(o0o0o0o7, composer);
        composer.OooO0o0(604401387);
        o0O0O0o0<Context> o0o0o0o8 = o0O0O00.f6591OooO0O0;
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o8));
        c0072OooO00o.f9912OooO0OO = strImgFormat;
        c0072OooO00o.OooO0O0(false);
        c0072OooO00o.f9936OooOoo = new ColorDrawable(Color.parseColor("#FF2C2C34"));
        c0072OooO00o.f9937OooOoo0 = 0;
        Oooo0.o00.OooO00o(com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer), "", SizeKt.OooO0o0(oooO00o3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25008, 104);
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        composer.OooO0o0(-492369756);
        Object objOooO0o2 = composer.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.TRUE);
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
        String strImgFormat2 = CloudImageUtilKt.imgFormat(storeRoomChatBubbleModel.getAttachedPicUrl());
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o2 = p114o00O00o.OooOOOO.OooO00o(o0o0o0o7, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o2 = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o8));
        c0072OooO00o2.f9912OooO0OO = strImgFormat2;
        c0072OooO00o2.OooO0O0(false);
        c0072OooO00o2.f9915OooO0o0 = new ooOOOOoo(o0o00oo3, o0o00oo3, o0o00oo2);
        p114o00O00o.OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o2, oooOO0OooO00o2, composer);
        o0O0O00.OooOO0.OooO00o.OooO oooO2 = o0O0O00.OooOO0.OooO00o.f35239OooO0OO;
        o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
        float f4 = 30;
        Oooo0.o00.OooO00o(oooOo00OooO0O0, "", SizeKt.OooO0o0(PaddingKt.OooO0oo(o00o00o2.OooO00o(oooO00o3, o00oo0oo2), f4, 35, f4, 46)), null, oooO2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
        composer.OooO0o0(-749361587);
        if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
            String bubbleText = storeRoomChatBubbleModel.getBubbleText();
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(o00o00o2.OooO00o(oooO00o3, o00oo0oo2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11, 7);
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            o0o0o0o0 = o0o0o0o5;
            i2 = 0;
            p031OoooO.o000O0O0.OooO0OO(bubbleText, o00oooo0OooO, o0000O0.f41693OooO0OO, p254o00ooO0O.o000OO00.OooO0OO(20, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65520);
        } else {
            o0o0o0o0 = o0o0o0o5;
            i2 = 0;
        }
        composer.Oooo0o0();
        composer.OooO0o0(-749361235);
        if (((Boolean) o0o00oo3.getValue()).booleanValue()) {
            composer.OooO0o0(-492369756);
            Object objOooO0o3 = composer.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = "svga/anim_loading.svga";
                composer.Oooo00o("svga/anim_loading.svga");
            }
            composer.Oooo0o0();
            oooO00o = oooO00o3;
            o00oo0oo = o00oo0oo2;
            o00o00o1 = o00o00o2;
            i3 = 11;
            o0O0O0O.OooO00o((String) objOooO0o3, true, 0, null, PaddingKt.OooO(o00o00o1.OooO00o(SizeKt.OooOO0(oooO00o, 60), o00oo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11, 7), composer, 54, 12);
        } else {
            o00oo0oo = o00oo0oo2;
            oooO00o = oooO00o3;
            o00o00o1 = r15;
            i3 = 11;
        }
        composer.Oooo0o0();
        composer.OooO0o0(-749360886);
        if ((storeRoomChatBubbleModel.getDayNum() > 0 || storeRoomChatBubbleModel.getFrozenDay() > 0) && storeRoomChatBubbleModel.getTimeLong() != -1) {
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            float f5 = 5;
            o00OOOO0 o00oooo0OooO0oO2 = SizeKt.OooO0oO(PaddingKt.OooO(oooO00o, f5, f5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12), 20);
            if (storeRoomChatBubbleModel.getFrozenDay() > 0) {
                o0000O0 o0000o4 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41753o00000;
            } else {
                o0000O0 o0000o5 = o0000O0.f41691OooO00o;
                j2 = o0000O0.f41749OoooooO;
            }
            o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(BackgroundKt.OooO0O0(o00oooo0OooO0oO2, j2, o00O0O.OooO00o()), 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o4);
            o0O0O0o0<LayoutDirection> o0o0o0o9 = o0o0o0o0;
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o9);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o6);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO2);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                function0 = function2;
                composer.OooOoO0(function0);
            } else {
                function0 = function2;
                composer.Oooo00O();
            }
            function1 = function0;
            o0o0o0o1 = o0o0o0o6;
            o0o0o0o2 = o0o0o0o9;
            o0o0o0o3 = o0o0o0o4;
            int i4 = i3;
            o00OOOO0.OooO00o oooO00o4 = oooO00o;
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r1, composer, oooO3, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r25, composer, "composer", composer), composer, Integer.valueOf(i2));
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_store_limit_time, composer), null, SizeKt.OooOO0(oooO00o4, i4), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(f, null, composer, 6, 2);
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.store_xxx_days);
            String[] strArr = new String[1];
            strArr[0] = storeRoomChatBubbleModel.getFrozenDay() > 0 ? String.valueOf(storeRoomChatBubbleModel.getFrozenDay()) : String.valueOf(storeRoomChatBubbleModel.getDayNum());
            String strOooO00o = OooOo.OooO00o(strOooO0OO2, strArr);
            o0000O0 o0000o6 = o0000O0.f41691OooO00o;
            oooO00o2 = oooO00o4;
            p031OoooO.o000O0O0.OooO0OO(strOooO00o, null, o0000O0.f41693OooO0OO, p254o00ooO0O.o000OO00.OooO0OO(i4, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            o0O0OO0.OooO00o(composer);
            th = null;
        } else {
            function1 = function2;
            o0o0o0o1 = o0o0o0o6;
            o0o0o0o3 = o0o0o0o4;
            o0o0o0o2 = o0o0o0o0;
            oooO00o2 = oooO00o;
            th = null;
        }
        composer.Oooo0o0();
        if (storeRoomChatBubbleModel.getObtainType() > 0) {
            o00OOOO0 o00oooo0OooO00o = o00o00o1.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o2), 24), o00OO0O0.OooO00o.f4170OooO);
            o0000O0 o0000o7 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O1 = BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41791o000OOo, p145o00Oo0.o000O0Oo.f32099OooO00o);
            o000000 o000000VarOooO00o2 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
            o0000O0O.OooO oooO4 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o3);
            LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o2);
            o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o1);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw th;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r1, composer, oooO4, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r25, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            if (storeRoomChatBubbleModel.getObtainType() == 1 && PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(storeRoomChatBubbleModel.getObtainLevel())) == PremiumLevel.Premium4) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Free_for_Count);
            } else if (storeRoomChatBubbleModel.getObtainType() == 1 && PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(storeRoomChatBubbleModel.getObtainLevel())) == PremiumLevel.Premium5) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Free_for_Marquis);
            } else {
                strOooO0OO = storeRoomChatBubbleModel.getObtainType() == 2 ? o000O0O0.OooO0OO(R.string.Free_for_VIP) : "";
            }
            p031OoooO.o000O0O0.OooO0OO(strOooO0OO, null, o0000O0.f41754o000000, p254o00ooO0O.o000OO00.OooO0OO(12, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 384, 0, 65522);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new oO000OOo(oo0oo0oo, storeRoomChatBubbleModel, i));
    }

    public static final void OooOO0(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, p604o0oo00oO.oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        boolean z = true;
        if (storeRoomChatBubbleModel.getSelected()) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.item_in_used);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
                return;
            } else {
                p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                return;
            }
        }
        if (storeRoomChatBubbleModel.getFrozenDay() != 0 && storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getCanBuyUserType() == 1) {
            storeRoomChatBubbleMineVM.getShowPremiumBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (storeRoomChatBubbleModel.getFrozenDay() != 0 && storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getCanBuyUserType() == 2) {
            storeRoomChatBubbleMineVM.getShowVipBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (storeRoomChatBubbleModel.getFrozenDay() != 0 && !storeRoomChatBubbleModel.getCanBuy() && storeRoomChatBubbleModel.getObtainType() == 2) {
            storeRoomChatBubbleMineVM.getShowVipGiveFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        p484o0o000OO.OooOOOO<ApiResult<String>> oooOOOOUseBubble = storeRoomChatBubbleMineVM.useBubble(storeRoomChatBubbleModel.getShopId());
        oo00o.OooO0O0(oooOOOOUseBubble, oo0oo0oo);
        o0o0000.o000oOoO.OooO0Oo(oooOOOOUseBubble, lifecycleOwner, oO000o00.f47799Oooo0o);
    }

    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1032349415);
        if ((i & 112) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O0OO.OooO00o(o000O0O0.OooO0OO(R.string.Chat_Box), 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, ooo00oOooOOo, 0, 0, 2046);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
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
            ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleMineVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = (StoreRoomChatBubbleMineVM) viewModel;
            int i3 = i2 & 112;
            OooO0o0(storeRoomChatBubbleMineVM.getShowPremiumBuyFrozenDialog(), ooo00oOooOOo, i3);
            OooO0o(storeRoomChatBubbleMineVM.getShowVipBuyFrozenDialog(), ooo00oOooOOo, i3);
            OooO0oO(storeRoomChatBubbleMineVM.getShowVipGiveFrozenDialog(), ooo00oOooOOo, i3);
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
            ViewModel viewModel2 = ViewModelKt.viewModel(p604o0oo00oO.oO0Oo0oo.class, current2, null, null, defaultViewModelCreationExtras2, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = androidx.paging.compose.OooOO0.OooO00o(storeRoomChatBubbleMineVM.getBubblePagingSource().f48686OooO0oo, ooo00oOooOOo);
            o0O0o.OooO0Oo(oooO0OOOooO00o, SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, null, null, o00O0000.OooO00o(ooo00oOooOOo, -1543882325, new OooO00o(oooO0OOOooO00o, storeRoomChatBubbleMineVM, (p604o0oo00oO.oO0Oo0oo) viewModel2, lifecycleOwner)), ooo00oOooOOo, 196664, 28);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(35827412);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, o000O0O0.OooO0OO(R.string.vip_can_use), null, false, false, null, null, o000O0O0.OooO0OO(R.string.Get_Vip), false, null, false, new OooOO0((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), null, false, null, OooOO0O.f47869Oooo0o, null, null, ooo00o2, i2 & 14, 1572864, 454394);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(o0o00oo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-165564454);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, o000O0O0.OooO0OO(R.string.only_premium_use), null, false, false, null, null, o000O0O0.OooO0OO(R.string.Get_Yalla_Premium), false, null, false, new OooO0OO((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), null, false, null, OooO0o.f47867Oooo0o, null, null, ooo00o2, i2 & 14, 1572864, 454394);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(o0o00oo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(391170997);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, null, o000O0O0.OooO0OO(R.string.firzen_vip_use_ubfrozen), null, false, false, null, null, o000O0O0.OooO0OO(R.string.unfreeze_vip), false, null, false, new OooOOO((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), null, false, null, OooOOOO.f47874Oooo0o, null, null, ooo00o2, i2 & 14, 1572864, 454394);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo00(o0o00oo2, i));
    }
}
