package p599o0oo00O0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
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
import o00000O.oo0o0Oo;
import o0000O0O.OooO;
import o00O0O.OooOo00;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00o00;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
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
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o0000OO0;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o00Ooo;
import p177o00Ooooo.oOo00ooO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OO00;
import p498o0o00Oo0.OooOOO;
import p507o0o00oOO.o0000O0;
import p522o0o0O0o.o00O00;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f47986OooO00o = new o0OoOo0();

    public static final class OooO00o implements o000OOo0 {
        @Override // p145o00Oo0.o000OOo0
        @NotNull
        public final o0000OO0 OooO00o(long j, @NotNull LayoutDirection layoutDirection, @NotNull OooO density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            o000O0o o000o0oOooO00o = o00Ooo.OooO00o();
            p145o00Oo0.o0OoOo0 o0oooo1 = (p145o00Oo0.o0OoOo0) o000o0oOooO00o;
            o0oooo1.OooOO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o0oooo1.OooOOO(OooOo00.OooO0Oo(j), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o0oooo1.OooOOO(OooOo00.OooO0Oo(j) - o000OO00.OooO00o(10), OooOo00.OooO0O0(j) / 2);
            o0oooo1.OooOOO(OooOo00.OooO0Oo(j), OooOo00.OooO0O0(j));
            o0oooo1.OooOOO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO0O0(j));
            return new o0000OO0.OooO00o(o000o0oOooO00o);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTopContribution$Content$1", f = "LiveRoomScreenTopContribution.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f47987Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<oOo00ooO> f47988Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, o0O00OO<oOo00ooO> o0o00oo2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f47987Oooo0o = context;
            this.f47988Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f47987Oooo0o, this.f47988Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oOo00ooO ooo00oooOooO0O0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O.OooO00o oooO00o = o00O.OooO00o.f43196OooO00o;
            if (o00O.OooO00o.f43198OooO0OO.getValue().booleanValue()) {
                if (o0OoOo0.OooO0O0(this.f47988Oooo0oO) == null) {
                    o0O00OO<oOo00ooO> o0o00oo2 = this.f47988Oooo0oO;
                    oOo00ooO ooo00ooo = new oOo00ooO();
                    ooo00ooo.setArguments(new Bundle());
                    o0o00oo2.setValue(ooo00ooo);
                    oOo00ooO ooo00oooOooO0O1 = o0OoOo0.OooO0O0(this.f47988Oooo0oO);
                    if (ooo00oooOooO0O1 != null) {
                        ooo00oooOooO0O1.f32942OoooOoo = new DialogInterface.OnDismissListener() { // from class: o0oo00O0.o00O0O
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                o00O.OooO00o oooO00o2 = o00O.OooO00o.f43196OooO00o;
                                o00O.OooO00o.f43198OooO0OO.setValue(Boolean.FALSE);
                            }
                        };
                    }
                }
                oOo00ooO ooo00oooOooO0O2 = o0OoOo0.OooO0O0(this.f47988Oooo0oO);
                boolean z = false;
                if (ooo00oooOooO0O2 != null && !ooo00oooOooO0O2.isAdded()) {
                    z = true;
                }
                if (z && (ooo00oooOooO0O0 = o0OoOo0.OooO0O0(this.f47988Oooo0oO)) != null) {
                    Context context = this.f47987Oooo0o;
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ooo00oooOooO0O0.show(((FragmentActivity) context).getSupportFragmentManager(), o000O0O0.OooO0OO(R.string.room_rank_top_list_desc));
                }
            } else {
                oOo00ooO ooo00oooOooO0O3 = o0OoOo0.OooO0O0(this.f47988Oooo0oO);
                if (ooo00oooOooO0O3 != null) {
                    ooo00oooOooO0O3.dismiss();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f47989Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00Oo0 onLogin = o00Oo0.f47954Oooo0o;
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

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f47991Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f47991Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OoOo0.this.OooO00o(ooo00o, this.f47991Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final oOo00ooO OooO0O0(o0O00OO o0o00oo2) {
        return (oOo00ooO) o0o00oo2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(363540053);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O o00o2 = o00O.f43140OooO00o;
            if (((o00OO00O.OooO0O0) o00O.f43143OooO0Oo.getValue()) instanceof o00OO00O.OooO0O0.C0405OooO0O0) {
                composer.OooO0o0(-492369756);
                Object objOooO0o = composer.OooO0o();
                if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = o0OOO00.OooO0Oo(null);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                Context context = (Context) composer.OooOO0o(o0O0O00.f6591OooO0O0);
                o00O.OooO00o oooO00o = o00O.OooO00o.f43196OooO00o;
                o00Oo00.OooO0o0(o00O.OooO00o.f43198OooO0OO.getValue(), new OooO0O0(context, (o0O00OO) objOooO0o, null), composer);
                composer.OooO0o0(733328855);
                o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
                OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(oooO00o2);
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
                ?? r7 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r7);
                ?? r4 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r4);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r3);
                ?? r16 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                Intrinsics.checkNotNullParameter(oooO00o2, "<this>");
                o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(o00oo0oo, true);
                Intrinsics.checkNotNullParameter(other, "other");
                o00OOOO0 o00oooo0OooO0OO = p254o00ooO0O.o000O0o.OooO0OO(other, composer);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                p028Oooo0o0.oOO00O.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO0OO, o0000O0.f41694OooO0Oo, new OooO00o()), composer, 0);
                o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
                o00OOOO0 o00oooo0OooO0O0 = p254o00ooO0O.o000O0o.OooO0O0(SizeKt.OooO0oO(oooO00o2, 30), false, false, null, OooO0OO.f47989Oooo0o, 253);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r7, composer, oooO2, r4, composer, layoutDirection2, r3, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                o0000oo.OooO0O0(5, null, composer, 6, 2);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.ic_room_contribution, composer), null, SizeKt.OooOO0O(oooO00o2, 21, 19), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0000oo.OooO0O0(4, null, composer, 6, 2);
                String strOooO00o = o00O00.OooO00o(((Number) o00O.OooO00o.f43197OooO0O0.getValue()).longValue());
                long j = o0000O0.f41747Oooooo;
                p031OoooO.o000O0O0.OooO0OO(strOooO00o, null, j, o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3456, 0, 32754);
                float f = 18;
                p031OoooO.o0OOO0o.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icv_arrow, composer), null, p254o00ooO0O.o000O0o.OooO0OO(SizeKt.OooOO0O(oooO00o2, f, f), composer), j, composer, 3128, 0);
                o0000oo.OooO0O0(12, null, composer, 6, 2);
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
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(i));
    }
}
