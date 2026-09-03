package p587o0oOoo0O;

import Oooo0.oo00oO;
import Oooo000.o00oO0o;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventPower;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00000O.oo0o0Oo;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p027Oooo0o.Oooo000;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p032OoooO0.o000oOoO;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
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
import p142o00OOooO.o000OOo;
import p145o00Oo0.o000O0Oo;
import p254o00ooO0O.o000O0o;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p498o0o00Oo0.OooOOO;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O00OO;
import p530o0o0OOO.o00OO00O;
import p584o0oOoo.o000O;
import p591o0oOooOo.f5;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOo00OO0 implements oO0OOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOo00OO0 f47074OooO00o = new oOo00OO0();

    public static final class OooO extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomEventInfoViewModel f47075Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RoomEventInfoViewModel roomEventInfoViewModel) {
            super(3);
            this.f47075Oooo0o = roomEventInfoViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 PagingContentState = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(PagingContentState, "$this$PagingContentState");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                oOo00OO0.OooO0o(oOo00OO0.f47074OooO00o, this.f47075Oooo0o, ooo00o2, 56);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomEventInfoViewModel f47076Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f47077Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47078Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomEventInfoViewModel roomEventInfoViewModel, CoroutineScope coroutineScope, EventViewModel eventViewModel) {
            super(0);
            this.f47076Oooo0o = roomEventInfoViewModel;
            this.f47077Oooo0oO = coroutineScope;
            this.f47078Oooo0oo = eventViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("102004");
            this.f47076Oooo0o.getShowLoadingDialog().setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(this.f47077Oooo0oO, null, null, new oO00O0o(this.f47076Oooo0o, this.f47078Oooo0oo, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47080Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f47080Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo00OO0.this.OooO0OO(ooo00o, this.f47080Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f47081Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O.OooO00o(f5.f47232OooO00o, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47083Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f47083Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo00OO0.this.OooO0Oo(ooo00o, this.f47083Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<EventModel> f47084Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(androidx.paging.compose.OooO0OO<EventModel> oooO0OO) {
            super(3);
            this.f47084Oooo0o = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 PagingContentState = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(PagingContentState, "$this$PagingContentState");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                Oooo000.OooO00o(null, null, null, false, null, null, null, false, new oO00OOO(this.f47084Oooo0o), ooo00o2, 0, KotlinVersion.MAX_COMPONENT_VALUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f47086Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47087Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, int i) {
            super(2);
            this.f47086Oooo0oO = str;
            this.f47087Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo00OO0.this.OooO00o(this.f47086Oooo0oO, ooo00o, this.f47087Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooOOO0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventPower.values().length];
            iArr[EventPower.HostCanCreate.ordinal()] = 1;
            iArr[EventPower.HostNotCreate.ordinal()] = 2;
            iArr[EventPower.AdminCanCreate.ordinal()] = 3;
            iArr[EventPower.AdminNotCreate.ordinal()] = 4;
            iArr[EventPower.Member.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r1v20, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooO0o(oOo00OO0 ooo00oo0, RoomEventInfoViewModel roomEventInfoViewModel, oOO00O ooo00o, int i) {
        EventPower eventPower;
        long jOooO0oo;
        Objects.requireNonNull(ooo00oo0);
        oOO00O composer = ooo00o.OooOOo(2078070259);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Integer value = oooO00o.OooO00o().f43329OooOOOO.getValue();
        if (value != null && value.intValue() == 1) {
            Integer value2 = oooO00o.OooO00o().f43320OooO0o.getValue();
            Intrinsics.checkNotNull(value2);
            eventPower = value2.intValue() >= 10 ? EventPower.HostCanCreate : EventPower.HostNotCreate;
        } else if (value == null || value.intValue() != 2) {
            eventPower = EventPower.Member;
        } else if (roomEventInfoViewModel.isCanCreate()) {
            Integer value3 = oooO00o.OooO00o().f43320OooO0o.getValue();
            if (value3 == null) {
                value3 = 0;
            }
            if (value3.intValue() >= 10) {
                eventPower = EventPower.AdminCanCreate;
            } else {
                eventPower = EventPower.AdminNotCreate;
            }
        } else {
            eventPower = EventPower.AdminNotCreate;
        }
        EventPower eventPower2 = eventPower;
        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0OO = oo00oO.OooO0OO(PaddingKt.OooO0oO(SizeKt.OooO0o0(oooO00o2), 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), oo00oO.OooO0O0(composer, 1));
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0OO);
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
        ?? r1 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r1);
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r3);
        ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
        Intrinsics.checkNotNullParameter(oooO00o2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
        Intrinsics.checkNotNullParameter(other, "other");
        o00OO0OO.OooO00o oooO00o3 = o00OO0O0.OooO00o.f4184OooOOOO;
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o3, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(other);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r1, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
        o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -1163856341, R.drawable.ic_empty_default, composer);
        float f = Constants.ERR_ALREADY_IN_RECORDING;
        Oooo0.o00.OooO00o(o000oo0oOooO00o, "", SizeKt.OooOO0O(oooO00o2, f, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, 12), composer, 6);
        String strOooO00o = o00000.OooO0OO.OooO00o(R.string.Room_Event_Empty_Title, composer);
        if (eventPower2 == EventPower.Member || eventPower2 == EventPower.AdminNotCreate) {
            composer.OooO0o0(-1521443643);
            jOooO0oo = u.OooO0O0(composer).OooO0oo();
        } else {
            composer.OooO0o0(-1521443623);
            jOooO0oo = u.OooO0O0(composer).OooO0o();
        }
        composer.Oooo0o0();
        o000O0O0.OooO0OO(strOooO00o, null, jOooO0oo, o0000O0O.o00Oo0.OooO0OO(16), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
        o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o2, 8), composer, 6);
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = p254o00ooO0O.o000O0O0.OooO0OO(R.string.Room_Event_Settings);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        String str = (String) objOooO0o;
        int i2 = OooOOO0.$EnumSwitchMapping$0[eventPower2.ordinal()];
        if (i2 == 1) {
            composer.OooO0o0(-1521443338);
            composer.OooO0o0(-1521443290);
            o00000O.OooO00o.C0282OooO00o c0282OooO00o = new o00000O.OooO00o.C0282OooO00o();
            String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.Room_Event_Empty_Host);
            c0282OooO00o.OooO0O0(StringsKt__StringsKt.substringBefore$default(strOooO0OO, str, (String) null, 2, (Object) null));
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            int iOooO0oO = c0282OooO00o.OooO0oO(new o00000O.o00Oo0(o0000O0.f41710OooOo0, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16382));
            try {
                c0282OooO00o.OooO0o(str, str);
                c0282OooO00o.OooO0O0(o00000.OooO0OO.OooO00o(R.string.Room_Event_Settings, composer));
                Unit unit = Unit.INSTANCE;
                c0282OooO00o.OooO0o0(iOooO0oO);
                c0282OooO00o.OooO0O0(StringsKt__StringsKt.substringAfter$default(strOooO0OO, str, (String) null, 2, (Object) null));
                o00000O.OooO00o oooO00oOooO0oo = c0282OooO00o.OooO0oo();
                composer.Oooo0o0();
                o000oOoO.OooO00o(oooO00oOooO0oo, null, new oo0o0Oo(u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 245756), false, 0, 0, null, new oO00O0oO(oooO00oOooO0oo, str, (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0)), composer, 0, 122);
                composer.Oooo0o0();
            } catch (Throwable th) {
                c0282OooO00o.OooO0o0(iOooO0oO);
                throw th;
            }
        } else if (i2 == 2 || i2 == 3) {
            composer.OooO0o0(-1521441862);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Room_Event_Empty_Manager, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3072, 0, 65010);
            composer.Oooo0o0();
            Unit unit2 = Unit.INSTANCE;
        } else if (i2 == 4 || i2 == 5) {
            composer.OooO0o0(-1521441448);
            composer.Oooo0o0();
            Unit unit3 = Unit.INSTANCE;
        } else {
            composer.OooO0o0(-1521441407);
            composer.Oooo0o0();
            Unit unit4 = Unit.INSTANCE;
        }
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
        oo0oooOooOo.OooO00o(new oO00OO0O(ooo00oo0, roomEventInfoViewModel, i));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0o0(oOo00OO0 ooo00oo0, EventModel eventModel, int i, oOO00O ooo00o, int i2) {
        CreationExtras defaultViewModelCreationExtras;
        Objects.requireNonNull(ooo00oo0);
        oOO00O composer = ooo00o.OooOOo(464190024);
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
        ViewModel viewModel = ViewModelKt.viewModel(EventViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
        composer.Oooo0o0();
        EventViewModel eventViewModel = (EventViewModel) viewModel;
        Context context = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
        long creatorUserId = eventModel.getCreatorUserId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        boolean z = value != null && creatorUserId == value.longValue();
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        float f = 12;
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        composer.OooO0o0(766459196);
        if (!z && eventModel.getEventState() == 0) {
            EventKt.OooO0oo(new oO000Oo0(eventModel), composer, 0);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        }
        composer.Oooo0o0();
        if (z || (!z && eventModel.getEventState() == 1)) {
            composer.OooO0o0(766459514);
            EventKt.OooO0oO(rowScopeInstance, eventModel.getEventState(), new oO000Oo(eventModel), composer, 6);
            composer.Oooo0o0();
        } else if (z || eventModel.getEventState() != 0) {
            composer.OooO0o0(766460601);
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(766459802);
            EventKt.OooO(rowScopeInstance, eventModel.getHasSubscribe(), new oO0O0OoO(eventModel, i, context, eventViewModel), composer, 6);
            composer.Oooo0o0();
        }
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO00O0o0(ooo00oo0, eventModel, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0249  */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p587o0oOoo0O.oO0OOo0o
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull String arguments, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        oOO00O composer = ooo00o.OooOOo(-1255175026);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0O0o0<Context> o0o0o0o0 = o0O0O00.f6591OooO0O0;
            composer.OooO0o0(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            int i2 = 6;
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
            ViewModel viewModel = ViewModelKt.viewModel(RoomEventInfoViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            RoomEventInfoViewModel roomEventInfoViewModel = (RoomEventInfoViewModel) viewModel;
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
            ViewModel viewModel2 = ViewModelKt.viewModel(EventViewModel.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
            composer.Oooo0o0();
            EventViewModel eventViewModel = (EventViewModel) viewModel2;
            p504o0o00o0O.OooOo.OooO00o(eventViewModel.getShowLoadingDialog().getValue().booleanValue(), null, null, composer, 0, 6);
            EventKt.OooOOO0(eventViewModel.getShowAddToCalendarDialog(), (Context) composer.OooOO0o(o0o0o0o0), eventViewModel.getAddToCalendarEventModel(), composer, 576);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(BackgroundKt.OooO0O0(oooO00o, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o));
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
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
            composer.OooO0o0(-1163856341);
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = androidx.paging.compose.OooOO0.OooO00o(roomEventInfoViewModel.getEventInfoPager().f48686OooO0oo, composer);
            Observable<Object> observable = LiveEventBus.get("EVENT_CREATE_SUCCESS");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.EVENT_CREATE_SUCCESS)");
            int i3 = 4;
            p522o0o0O0o.o00O000o.OooO00o(observable, new p142o00OOooO.o000000(oooO0OOOooO00o, i3), composer, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENT_DELETED");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.EVENT_DELETED)");
            p522o0o0O0o.o00O000o.OooO00o(observable2, new p142o00OOooO.o0O0O00(roomEventInfoViewModel, i3), composer, 72);
            Observable<Object> observable3 = LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.EVENT_UPDATE_SUBSCRIBE_NUMBER)");
            p522o0o0O0o.o00O000o.OooO00o(observable3, new o000OOo(roomEventInfoViewModel, i2), composer, 72);
            composer.OooO0o0(1964379301);
            if (oooO0OOOooO00o.OooO0OO() <= 0) {
                f47074OooO00o.OooO0Oo(composer, 6);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            o0O00OO.OooO00o(oooO0OOOooO00o, o00oooo0OooO0o.OooOOoo(new o0O000O(true)), null, o00O0000.OooO00o(composer, 659232367, new OooO(roomEventInfoViewModel)), null, o00O0000.OooO00o(composer, -156814863, new OooOO0(oooO0OOOooO00o)), composer, 199688, 20);
            o00OO00O.OooO00o oooO00o2 = o00OO00O.f43313OooooOo;
            Integer value = oooO00o2.OooO00o().f43329OooOOOO.getValue();
            if (value != null && value.intValue() == 1) {
                f47074OooO00o.OooO0OO(composer, 6);
            } else {
                Integer value2 = oooO00o2.OooO00o().f43329OooOOOO.getValue();
                if (value2 != null && value2.intValue() == 2) {
                    Integer value3 = oooO00o2.OooO00o().f43320OooO0o.getValue();
                    Intrinsics.checkNotNull(value3);
                    if (value3.intValue() >= 10 && roomEventInfoViewModel.isCanCreate()) {
                        f47074OooO00o.OooO0OO(composer, 6);
                    }
                }
            }
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(arguments, i));
    }

    @Override // p587o0oOoo0O.oO0OOo0o
    @Composable
    public final void OooO0O0(@Nullable oOO00O ooo00o, int i) {
        oO0OOo0o.OooO00o.OooO00o(this, ooo00o, i);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras defaultViewModelCreationExtras2;
        oOO00O composer = ooo00o.OooOOo(-916614327);
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
            ViewModel viewModel = ViewModelKt.viewModel(RoomEventInfoViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            RoomEventInfoViewModel roomEventInfoViewModel = (RoomEventInfoViewModel) viewModel;
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
            ViewModel viewModel2 = ViewModelKt.viewModel(EventViewModel.class, current2, null, null, defaultViewModelCreationExtras2, composer, 36936, 0);
            composer.Oooo0o0();
            EventViewModel eventViewModel = (EventViewModel) viewModel2;
            Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
            if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0O0).f29498Oooo0o;
            composer.Oooo0o0();
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 47);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(BackgroundKt.OooO0O0(o00oooo0OooO0oO, o0000O0.f41710OooOo0, o000O0Oo.f32099OooO00o), false, false, null, new OooO00o(roomEventInfoViewModel, coroutineScope, eventViewModel), 253);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, oooO0O0, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
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
            oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.room_event_create, composer), null, SizeKt.OooOO0(oooO00o, 23), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 6), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Create, composer), null, o0000O0.f41693OooO0OO, o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3456, 0, 65522);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(@Nullable oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-587599416);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 12;
            float f2 = 15;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(PaddingKt.OooO(SizeKt.OooO0o(oooO00o), f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12), false, false, null, OooO0OO.f47081Oooo0o, 253);
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
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_room_event_history_tag, composer);
            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, f2);
            o0O0O00.OooOO0.OooO00o.C0361OooO00o c0361OooO00o = o0O0O00.OooOO0.OooO00o.f35238OooO0O0;
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooOO0, null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
            float f3 = 4;
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f3), composer, 6);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.room_event_history_title, composer), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f3), composer, 6);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_room_event_info_history_detail, composer), null, SizeKt.OooOO0(oooO00o, f), null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(i));
    }
}
