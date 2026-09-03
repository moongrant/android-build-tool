package p591o0oOooOo;

import Oooo0.o000oOoO;
import Oooo000.OooO0o;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.room.RoomEventHistoryViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o00000O0.o0OO00O;
import o0000O0O.OooO;
import o0000OO.OooOO0O;
import o0000OO.o00000O0;
import o0000OO.o000OOo;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000O00O;
import p027Oooo0o.o000OO0O;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p074o000O0oo.OooOOO;
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
import p114o00O00o.OooOOOO;
import p114o00O00o.OooOo00;
import p114o00O00o.Oooo0;
import p145o00Oo0.o000O0Oo;
import p261o00ooOoO.u;
import p507o0o00oOO.o0000O0;
import p571o0oOo0o.o00O0OO;
import p584o0oOoo.o0000O;
import p591o0oOooOo.f5;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class f5 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final f5 f47232OooO00o = new f5();

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O00O f47233Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<EventModel> f47234Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O00O o000o00o2, androidx.paging.compose.OooO0OO<EventModel> oooO0OO) {
            super(3);
            this.f47233Oooo0o = o000o00o2;
            this.f47234Oooo0oO = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 RefreshContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                float f = 0;
                Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), this.f47233Oooo0o, new o0O00O(f, 17, f, f), false, null, null, null, false, new e5(this.f47234Oooo0oO), ooo00o2, 390, 248);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47236Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47237Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47236Oooo0oO = o00o0o01;
            this.f47237Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            f5.this.OooO00o(this.f47236Oooo0oO, ooo00o, this.f47237Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ EventModel f47239Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f47240Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(EventModel eventModel, int i) {
            super(2);
            this.f47239Oooo0oO = eventModel;
            this.f47240Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            f5.this.OooO0o0(this.f47239Oooo0oO, ooo00o, this.f47240Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO(f5 f5Var, ConstraintLayoutScope constraintLayoutScope, OooOO0O oooOO0O, OooOO0O oooOO0O2, EventModel eventModel, oOO00O ooo00o, int i) {
        Objects.requireNonNull(f5Var);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-624101400);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (!eventModel.getIsEndDay()) {
            o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(SizeKt.OooO0Oo(o00OOOO0.OooO00o.f4198Oooo0o), (float) 0.5d);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOO0O2);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new m5(oooOO0O2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o000oOoO.OooO00o(constraintLayoutScope.OooO00o(o00oooo0OooOO0o, oooOO0O, (Function1) objOooO0o), n5.f47313Oooo0o, ooo00oOooOOo, 48);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o5(f5Var, constraintLayoutScope, oooOO0O, oooOO0O2, eventModel, i));
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r31v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r4v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooO0o(f5 f5Var, ConstraintLayoutScope constraintLayoutScope, OooOO0O oooOO0O, EventModel eventModel, Function0 function0, oOO00O ooo00o, int i) {
        Function0<o000000.OooO00o> function1;
        Objects.requireNonNull(f5Var);
        oOO00O composer = ooo00o.OooOOo(-1348711128);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        float f = 8;
        o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0o(oooO00o, 320), o00O0O.OooO0OO(f));
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41693OooO0OO, o000O0Oo.f32099OooO00o);
        composer.OooO0o0(1157296644);
        boolean zOooo0oo = composer.Oooo0oo(function0);
        Object objOooO0o = composer.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new g5(function0);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o00OOOO0 o00oooo0OooO00o2 = constraintLayoutScope.OooO00o(ClickableKt.OooO0Oo(o00oooo0OooO0O0, false, (Function0) objOooO0o, 7), oooOO0O, h5.f47248Oooo0o);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
        o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4182OooOOO;
        o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
        OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function2 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o2);
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
        ?? r15 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r15);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r4);
        ?? r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r6);
        ?? r31 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, r31, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        o00OOOO0 o00oooo0OooO0o0 = PaddingKt.OooO0o0(oooO00o, f);
        composer.OooO0o0(693286680);
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r15, composer, oooO2, r4, composer, layoutDirection2, r6, composer, o00ooooo3, r31, composer, "composer", composer), composer, 0);
        o0OOO0o.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_event_time, composer), null, SizeKt.OooOO0(oooO00o, 12), u.OooO0O0(composer).OooO(), composer, 440, 0);
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 4), composer, 6);
        StringBuilder sb = new StringBuilder();
        sb.append(o00000.OooO0OO.OooO00o(R.string.event_history_start_time, composer));
        sb.append(' ');
        long eventStartTime = eventModel.getEventStartTime();
        if (p496o0o00OOo.o000oOoO.OooO00o(eventStartTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
            eventStartTime *= (long) 1000;
        }
        p621o0oo0o0o.o00O0O00 o00o0o01 = p621o0oo0o0o.o00O0O00.f48626OooO00o;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        Calendar.getInstance().setTimeInMillis(eventStartTime);
        String str = simpleDateFormat.format(Long.valueOf(eventStartTime));
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(millis)");
        sb.append(str);
        o000O0O0.OooO0OO(sb.toString(), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3072, 0, 65010);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        o0O0OOO0.OooO00o(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), (float) 0.5d), u.OooO0O0(composer).OooOO0o(), o000O0Oo.f32099OooO00o), composer, 0);
        o00OOOO0 o00oooo0OooO0o1 = PaddingKt.OooO0o0(SizeKt.OooO0o(oooO00o), f);
        composer.OooO0o0(693286680);
        o000000 o000000VarOooO00o3 = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO3 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0o1);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function1 = function2;
            composer.OooOoO0(function1);
        } else {
            function1 = function2;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function4 = function1;
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r15, composer, oooO3, r4, composer, layoutDirection3, r6, composer, o00ooooo4, r31, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        String eventImage = eventModel.getEventImage();
        composer.OooO0o0(604400049);
        OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
        c0072OooO00o.f9912OooO0OO = eventImage;
        c0072OooO00o.OooO0O0(true);
        OooOo00 oooOo00OooO00o = Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, composer);
        composer.Oooo0o0();
        composer.Oooo0o0();
        float f2 = 6;
        float f3 = 76;
        Oooo0.o00.OooO00o(oooOo00OooO00o, null, SizeKt.OooOO0O(p442o0OoOo0.Oooo000.OooO00o(oooO00o, o00O0O.OooO0OO(f2)), 134, f3), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
        o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(oooO00o, f3);
        Intrinsics.checkNotNullParameter(o00oooo0OooO0oO, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
        o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO0oO.OooOOoo(new o0O000O(true));
        Oooo0o0.o00O000.OooO0O0 oooO0O1 = p028Oooo0o0.o00O000.f2033OooO0o;
        composer.OooO0o0(-483455358);
        o000000 o000000VarOooO00o4 = oo00o.OooO00o(oooO0O1, oooO00o2, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO4 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function4);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o4, r15, composer, oooO4, r4, composer, layoutDirection4, r6, composer, o00ooooo5, r31, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        String eventName = eventModel.getEventName();
        long jOooO0o = u.OooO0O0(composer).OooO0o();
        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(13);
        o0000O00.OooO00o oooO00o3 = o0000O00.f27125Oooo0oO;
        o000O0O0.OooO0OO(eventName, null, jOooO0o, jOooO0OO, null, o0000O00.f27131OoooOO0, null, 0L, null, new o0000O0.OooO0o(1), 0L, 2, false, 2, null, null, composer, 199680, 3120, 54738);
        if (!StringsKt.isBlank(eventModel.getEventDesc())) {
            o0O0OOO0.OooO00o(SizeKt.OooO0oO(oooO00o, f2), composer, 6);
            o000O0O0.OooO0OO(eventModel.getEventDesc(), null, u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 2, false, 2, null, null, composer, 3072, 3120, 54770);
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
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new i5(f5Var, constraintLayoutScope, oooOO0O, eventModel, function0, i));
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0oO(f5 f5Var, final EventModel eventModel, final Function0 function0, oOO00O ooo00o, final int i) {
        Objects.requireNonNull(f5Var);
        oOO00O composer = ooo00o.OooOOo(828615876);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o);
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
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        f47232OooO00o.OooO0o0(eventModel, composer, 56);
        o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o);
        composer.OooO0o0(-270267587);
        composer.OooO0o0(-3687241);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new o000OOo();
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        final o000OOo o000ooo2 = (o000OOo) objOooO0o;
        composer.OooO0o0(-3687241);
        Object objOooO0o2 = composer.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new ConstraintLayoutScope();
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objOooO0o2;
        composer.OooO0o0(-3687241);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        Pair pairOooO0O0 = o0000OO.Oooo000.OooO0O0(constraintLayoutScope, (o0O00OO) objOooO0o3, o000ooo2, composer);
        o000000 o000000Var = (o000000) pairOooO0O0.component1();
        final Function0 function2 = (Function0) pairOooO0O0.component2();
        o00Oo0.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0o2, false, new Function1<o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.screen.event.RoomEventHistoryScreen$RoomEventHistoryItem$lambda-2$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0OO00O o0oo00o2) {
                o0OO00O semantics = o0oo00o2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                o00000O0.OooO00o(semantics, o000ooo2);
                return Unit.INSTANCE;
            }
        }), o00O0000.OooO00o(composer, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.event.RoomEventHistoryScreen$RoomEventHistoryItem$lambda-2$$inlined$ConstraintLayout$2

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f24685Oooo0o = 6;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(oOO00O ooo00o2, Integer num) {
                oOO00O ooo00o3 = ooo00o2;
                if (((num.intValue() & 11) ^ 2) == 0 && ooo00o3.OooOo0()) {
                    ooo00o3.OooOoo0();
                } else {
                    Objects.requireNonNull(constraintLayoutScope);
                    constraintLayoutScope.OooO0Oo();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    int i2 = ((this.f24685Oooo0o >> 3) & 112) | 8;
                    if ((i2 & 14) == 0) {
                        i2 |= ooo00o3.Oooo0oo(constraintLayoutScope2) ? 4 : 2;
                    }
                    if ((i2 & 91) == 18 && ooo00o3.OooOo0()) {
                        ooo00o3.OooOoo0();
                    } else {
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0000OO.OooOO0O oooOO0OOooO00o = oooO00oOooO0OO.OooO00o();
                        o0000OO.OooOO0O oooOO0OOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0000OO.OooOO0O oooOO0OOooO0OO = oooO00oOooO0OO.OooO0OO();
                        f5 f5Var2 = f5.f47232OooO00o;
                        int i3 = i2 & 14;
                        int i4 = i3 | 28680;
                        f5.OooO(f5Var2, constraintLayoutScope2, oooOO0OOooO00o, oooOO0OOooO0O0, eventModel, ooo00o3, i4);
                        f5.OooO0o(f5Var2, constraintLayoutScope2, oooOO0OOooO0O0, eventModel, function0, ooo00o3, i3 | 25096 | ((i << 6) & 7168));
                        f5.OooO0oo(f5Var2, constraintLayoutScope2, oooOO0OOooO0OO, oooOO0OOooO0O0, eventModel, ooo00o3, i4);
                    }
                    Objects.requireNonNull(constraintLayoutScope);
                }
                return Unit.INSTANCE;
            }
        }), o000000Var, composer, 48, 0);
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
        oo0oooOooOo.OooO00o(new j5(f5Var, eventModel, function0, i));
    }

    public static final void OooO0oo(f5 f5Var, ConstraintLayoutScope constraintLayoutScope, OooOO0O oooOO0O, OooOO0O oooOO0O2, EventModel eventModel, oOO00O ooo00o, int i) {
        Objects.requireNonNull(f5Var);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-106628708);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (eventModel.getHasNextTimeNode()) {
            o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o), 15);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(oooOO0O2);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new k5(oooOO0O2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O0OOO0.OooO00o(constraintLayoutScope.OooO00o(o00oooo0OooO0oO, oooOO0O, (Function1) objOooO0o), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new l5(f5Var, constraintLayoutScope, oooOO0O, oooOO0O2, eventModel, i));
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(-1121079836);
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
            ViewModel viewModel = ViewModelKt.viewModel(RoomEventHistoryViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            RoomEventHistoryViewModel roomEventHistoryViewModel = (RoomEventHistoryViewModel) viewModel;
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(BackgroundKt.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, u.OooO0O0(composer).OooOo00(), o000O0Oo.f32099OooO00o));
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
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
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            o00O0OO.OooO00o(OooOOO.OooO00o(composer, 2058660585, -1163856341, R.string.room_event_history_title, composer), 0L, 0, null, null, null, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 0, 0, 2046);
            androidx.paging.compose.OooO0OO oooO0OOOooO00o = androidx.paging.compose.OooOO0.OooO00o(roomEventHistoryViewModel.getEventHistoryPager().f48686OooO0oo, composer);
            o000O00O o000o00oOooO00o = o000OO0O.OooO00o(composer);
            p259o00ooOo.o0O00O.OooO00o(oooO0OOOooO00o, null, o000o00oOooO00o, null, null, null, null, o00O0000.OooO00o(composer, 652424117, new OooO00o(o000o00oOooO00o, oooO0OOOooO00o)), composer, 12582920, 122);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, i));
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(EventModel eventModel, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-200903606);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (eventModel.getIsNewTimeNode()) {
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
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
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            float f = 12;
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
            o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, 6), o00O0O.f3431OooO00o);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o0O0OOO0.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41710OooOo0, o000O0Oo.f32099OooO00o), composer, 0);
            o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, f), composer, 6);
            o000O0O0.OooO0OO(o00O0.f48624OooO00o.OooO0OO(eventModel.getEventStartTime(), "dd/MM yyyy"), null, u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, new o0000O0.OooO0o(1), 0L, 0, false, 0, null, null, composer, 3072, 0, 65010);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(eventModel, i));
    }
}
