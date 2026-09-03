package com.yalla.yalla.ui.activity.room.live.side;

import Oooo0.o00;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.qiniu.android.http.ResponseInfo;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import o00000.OooO0OO;
import o00000O0.o0OO00O;
import o0000O0.OooO0o;
import o0000OO.OooOO0O;
import o0000OO.Oooo000;
import o0000OO.o00000O;
import o0000OO.o00000O0;
import o0000OO.o000OOo;
import o0000OO.o0O0O00;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0000O0;
import p023Oooo00O.o000O00;
import p023Oooo00O.o000Oo0;
import p023Oooo00O.o00oO0o;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o000O0o;
import p263o00ooo.o000OO0O;
import p442o0OoOo0.o0Oo0oo;
import p601o0oo00Oo.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class RoomMusicManagerKt {

    public static final class OooO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f23121Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooOO0O oooOO0O) {
            super(1);
            this.f23121Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, this.f23121Oooo0o.f27368OooO0o0, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, constrainAs.f27359OooO0OO.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23122Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f23122Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23122Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f23123Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, constrainAs.f27359OooO0OO.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, constrainAs.f27359OooO0OO.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f23124Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOO0O oooOO0O) {
            super(1);
            this.f23124Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, this.f23124Oooo0o.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, this.f23124Oooo0o.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, this.f23124Oooo0o.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, this.f23124Oooo0o.f27368OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f23125Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooOO0O oooOO0O) {
            super(1);
            this.f23125Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, this.f23125Oooo0o.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, this.f23125Oooo0o.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, this.f23125Oooo0o.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, this.f23125Oooo0o.f27368OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f23126Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f23127Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f23128Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23129Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00OOOO0 o00oooo1, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f23127Oooo0o = o00oooo1;
            this.f23128Oooo0oO = z;
            this.f23129Oooo0oo = function0;
            this.f23126Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomMusicManagerKt.OooO00o(this.f23127Oooo0o, this.f23128Oooo0oO, this.f23129Oooo0oo, ooo00o, this.f23126Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00OOOO0 other, final boolean z, @NotNull Function0<Unit> onClick, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(other, "modifier");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(796122331);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(other) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.OooO0OO(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(onClick) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Intrinsics.checkNotNullParameter(other, "other");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(onClick);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO00o(onClick);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(other, false, false, null, (Function0) objOooO0o, 253);
            Object objOooO0O0 = o000O00.OooO0O0(ooo00oOooOOo, -270267587, -3687241);
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0O0 == c0323OooO00o) {
                objOooO0O0 = new o000OOo();
                ooo00oOooOOo.Oooo00o(objOooO0O0);
            }
            ooo00oOooOOo.Oooo0o0();
            final o000OOo o000ooo2 = (o000OOo) objOooO0O0;
            ooo00oOooOOo.OooO0o0(-3687241);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new ConstraintLayoutScope();
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objOooO0o2;
            ooo00oOooOOo.OooO0o0(-3687241);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            Pair pairOooO0O0 = Oooo000.OooO0O0(constraintLayoutScope, (o0O00OO) objOooO0o3, o000ooo2, ooo00oOooOOo);
            o000000 o000000Var = (o000000) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            o00Oo0.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0O0, false, new Function1<o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomMusicManagerKt$RoomSlideMusicCompose$$inlined$ConstraintLayout$1
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
            }), o00O0000.OooO00o(ooo00oOooOOo, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomMusicManagerKt$RoomSlideMusicCompose$$inlined$ConstraintLayout$2

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ int f23132Oooo0o = 0;

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
                        int i3 = ((this.f23132Oooo0o >> 3) & 112) | 8;
                        if ((i3 & 14) == 0) {
                            i3 |= ooo00o3.Oooo0oo(constraintLayoutScope2) ? 4 : 2;
                        }
                        if ((i3 & 91) == 18 && ooo00o3.OooOo0()) {
                            ooo00o3.OooOoo0();
                        } else {
                            ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                            OooOO0O oooOO0OOooO00o = oooO00oOooO0OO.OooO00o();
                            OooOO0O oooOO0OOooO0O0 = oooO00oOooO0OO.OooO0O0();
                            OooOO0O oooOO0OOooO0OO = oooO00oOooO0OO.OooO0OO();
                            OooOO0O oooOO0OOooO0O1 = oooO00oOooO0OO.f6775OooO00o.OooO0O0();
                            o000OO0O o000oo0oOooO00o = OooO0O0.OooO00o(R.drawable.icon_room_side_music_bg, ooo00o3);
                            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                            float f = 40;
                            o00.OooO00o(o000oo0oOooO00o, null, constraintLayoutScope2.OooO00o(SizeKt.OooOO0(oooO00o, f), oooOO0OOooO00o, RoomMusicManagerKt.OooO0O0.f23123Oooo0o), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o3, 56, 120);
                            ooo00o3.OooO0o0(918028180);
                            float fFloatValue = z ? ((Number) ((o000Oo0.OooO00o) p023Oooo00O.o000OO0O.OooO00o(p023Oooo00O.o000OO0O.OooO0OO(ooo00o3), 360.0f, o00oO0o.OooO00o(o00oO0o.OooO0Oo(ResponseInfo.UnknownError, 0, o0000O0.OooO00o.f1052OooO00o, 2), RepeatMode.Restart, 4), ooo00o3)).getValue()).floatValue() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            ooo00o3.Oooo0o0();
                            o000OO0O o000oo0oOooO00o2 = OooO0O0.OooO00o(R.drawable.icon_room_side_music, ooo00o3);
                            o00OOOO0 o00oooo0OooO00o = o0Oo0oo.OooO00o(SizeKt.OooOO0(oooO00o, 26), fFloatValue);
                            ooo00o3.OooO0o0(1157296644);
                            boolean zOooo0oo2 = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                            Object objOooO0o4 = ooo00o3.OooO0o();
                            if (zOooo0oo2 || objOooO0o4 == oOO00O.OooO00o.f29689OooO0O0) {
                                objOooO0o4 = new RoomMusicManagerKt.OooO0OO(oooOO0OOooO00o);
                                ooo00o3.Oooo00o(objOooO0o4);
                            }
                            ooo00o3.Oooo0o0();
                            o00.OooO00o(o000oo0oOooO00o2, null, constraintLayoutScope2.OooO00o(o00oooo0OooO00o, oooOO0OOooO0O0, (Function1) objOooO0o4), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o3, 56, 120);
                            o000OO0O o000oo0oOooO00o3 = OooO0O0.OooO00o(R.drawable.icon_room_side_music_fg, ooo00o3);
                            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, f);
                            ooo00o3.OooO0o0(1157296644);
                            boolean zOooo0oo3 = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                            Object objOooO0o5 = ooo00o3.OooO0o();
                            if (zOooo0oo3 || objOooO0o5 == oOO00O.OooO00o.f29689OooO0O0) {
                                objOooO0o5 = new RoomMusicManagerKt.OooO0o(oooOO0OOooO00o);
                                ooo00o3.Oooo00o(objOooO0o5);
                            }
                            ooo00o3.Oooo0o0();
                            o00.OooO00o(o000oo0oOooO00o3, null, constraintLayoutScope2.OooO00o(o00oooo0OooOO0, oooOO0OOooO0OO, (Function1) objOooO0o5), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00o3, 56, 120);
                            String strOooO00o = OooO0OO.OooO00o(R.string.room_alert_music, ooo00o3);
                            o00O00O o00o00o2 = new o00O00O(o0000O0O.o00Oo0.OooO0OO(7), o0000O0O.o00Oo0.OooO0OO(10));
                            p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                            long j = p507o0o00oOO.o0000O0.f41697OooO0oO;
                            ooo00o3.OooO0o0(1157296644);
                            boolean zOooo0oo4 = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                            Object objOooO0o6 = ooo00o3.OooO0o();
                            if (zOooo0oo4 || objOooO0o6 == oOO00O.OooO00o.f29689OooO0O0) {
                                objOooO0o6 = new RoomMusicManagerKt.OooO(oooOO0OOooO00o);
                                ooo00o3.Oooo00o(objOooO0o6);
                            }
                            ooo00o3.Oooo0o0();
                            p601o0oo00Oo.o00O000.OooO00o(strOooO00o, o00o00o2, constraintLayoutScope2.OooO00o(oooO00o, oooOO0OOooO0O1, (Function1) objOooO0o6), j, null, null, null, 0L, null, new OooO0o(3), 0L, 0, false, 1, null, ooo00o3, 3072, 3072, 24048);
                        }
                        Objects.requireNonNull(constraintLayoutScope);
                    }
                    return Unit.INSTANCE;
                }
            }), o000000Var, ooo00oOooOOo, 48, 0);
            ooo00oOooOOo.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(other, z, onClick, i));
    }
}
