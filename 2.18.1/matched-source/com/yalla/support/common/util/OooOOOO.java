package com.yalla.support.common.util;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o00000O.oo0o0Oo;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000000O;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p261o00ooOoO.u;
import p507o0o00oOO.o0000O0;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r50v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO00o(oOO00O ooo00o, int i) {
        Function0<o000000.OooO00o> function0;
        Function0<o000000.OooO00o> function1;
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(1361379291);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 12;
            o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(PaddingKt.OooO0oO(SizeKt.OooO0oO(oooO00o, 80), 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), p033OoooO00.o00O0O.OooO0OO(f));
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
            Function0<o000000.OooO00o> function2 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r50 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r50, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -2137368960, R.drawable.main_ic_explore_event_bg, composer), null, SizeKt.OooO0Oo(SizeKt.OooO0o(oooO00o)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0Oo(oooO00o), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0oO);
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
            Function0<o000000.OooO00o> function4 = function0;
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r50, composer, "composer", composer), composer, 0);
            float f2 = 50;
            float f3 = 8;
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.main_ic_explore_event_header, composer), null, o000O0o.OooO0OO(p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, f2), p033OoooO00.o00O0O.OooO0OO(f3)), composer), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14);
            Intrinsics.checkNotNullParameter(o00oooo0OooO, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
            o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO.OooOOoo(new o0O000O(true));
            Oooo0o0.o00O000.OooO0O0 oooO0O1 = p028Oooo0o0.o00O000.f2033OooO0o;
            composer.OooO0o0(-483455358);
            o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooO0O1, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                function1 = function4;
                composer.OooOoO0(function1);
            } else {
                function1 = function4;
                composer.Oooo00O();
            }
            Function0<o000000.OooO00o> function7 = function1;
            ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r50, composer, "composer", composer), composer, 0);
            String strOooO00o = p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -1163856341, R.string.Events_Create_Entrance_Title, composer);
            long jOooO0OO = o00000OO.OooO0OO(4284440415L);
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(15);
            o0000O00.OooO00o oooO00o2 = o0000O00.f27125Oooo0oO;
            o000O0O0.OooO0OO(strOooO00o, null, jOooO0OO, jOooO0OO2, null, o0000O00.f27130OoooO0O, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 200064, 0, 32722);
            o0000oo.OooO0OO(2, null, composer, 6, 2);
            String strOooO00o2 = o00000.OooO0OO.OooO00o(R.string.Events_Create_Entrance_Desc, composer);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o000O0O0.OooO0OO(strOooO00o2, null, o0000O0.f41731Oooo0oo, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3456, 0, 32754);
            o0O0OO0.OooO00o(composer);
            o00OOOO0 o00oooo0OooOOO0 = SizeKt.OooOOO0(PaddingKt.OooO(SizeKt.OooO0oO(oooO00o, 32), 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), 82, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(o00000OO.OooO0OO(4294871582L)), new o00000O0(o00000OO.OooO0OO(4294953600L))});
            o00O0O.OooO.OooO00o oooO00o3 = o00O0O.OooO.f30391OooO0O0;
            long j = o00O0O.OooO.f30392OooO0OO;
            long j2 = o00O0O.OooO.f30393OooO0Oo;
            Intrinsics.checkNotNullParameter(colors, "colors");
            o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(BackgroundKt.OooO00o(o00oooo0OooOOO0, new o000OO(colors, j, j2, 0), p033OoooO00.o00O0O.OooO0OO(f2), 4), f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            composer.OooO0o0(693286680);
            o000000 o000000VarOooO00o3 = o0O00o00.OooO00o(oooO0O1, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO4 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o00Oo0.OooO0O0(o00oooo0OooO0oO2);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function7);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r2, composer, oooO4, r3, composer, layoutDirection4, r4, composer, o00ooooo5, r50, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.main_ic_explore_events_create, composer), null, SizeKt.OooOO0(oooO00o, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(4, null, composer, 6, 2);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
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
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Create, composer), o000O0o.OooO0O0(oooO00o, false, false, null, new o00OO0O.OooOOOO(lifecycleOwner, (EventViewModel) viewModel), 253), o0000O0.f41693OooO0OO, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3456, 0, 32752);
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
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00OO0O.OooOo00(i));
    }

    /* JADX WARN: Type inference failed for: r36v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    public static final void OooO0O0(EventModel eventModel, oOO00O ooo00o, int i) {
        Function0<o000000.OooO00o> function0;
        Function0<o000000.OooO00o> function1;
        int i2;
        Function0<o000000.OooO00o> function2;
        Function0<o000000.OooO00o> function3;
        o0O0O0o0<o00OOOOo> o0o0o0o0;
        o0O0O0o0<LayoutDirection> o0o0o0o1;
        o00OOOO0.OooO00o oooO00o;
        Function0<o000000.OooO00o> function4;
        oOO00O composer = ooo00o.OooOOo(784615400);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o2, Constants.ERR_ALREADY_IN_RECORDING), 143), false, false, null, new o00OO0O.OooOo(eventModel), 253);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o2 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
        o0O0O0o0<LayoutDirection> o0o0o0o3 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
        o0O0O0o0<o00OOOOo> o0o0o0o4 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function6 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function6);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r9 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r9);
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r7);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r36 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r36, composer, "composer", composer), composer, 0);
        o000000O.OooO0O0(composer, 2058660585, -1163856341, 733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(oooO00o2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function6);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r9, composer, oooO2, r7, composer, layoutDirection2, r4, composer, o00ooooo3, r36, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        String eventImage = eventModel.getEventImage();
        composer.OooO0o0(604400049);
        o0O0O0o0<oOO00O.OooOO0> o0o0o0o5 = p114o00O00o.o000oOoO.f30327OooO00o;
        oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(o0o0o0o5, composer);
        composer.OooO0o0(604401387);
        o0O0O0o0<Context> o0o0o0o6 = o0O0O00.f6591OooO0O0;
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o6));
        c0072OooO00o.f9912OooO0OO = eventImage;
        Unit unit = Unit.INSTANCE;
        float f = 12;
        Oooo0.o00.OooO00o(com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer), null, p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o2), 90), p033OoooO00.o00O0O.OooO0OO(f)), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
        float f2 = 6;
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o2, f2, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12);
        p033OoooO00.o0OoOo0 o0oooo1 = p033OoooO00.o00O0O.f3431OooO00o;
        float f3 = 4;
        float f4 = 2;
        o00OOOO0 o00oooo0OooO0oo = PaddingKt.OooO0oo(BorderKt.OooO0O0(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(o00oooo0OooO, o0oooo1), o00000OO.OooO0OO(2147483648L), o000O0Oo.f32099OooO00o), (float) 0.5d, o00000OO.OooO0O0(1308622847), o0oooo1), f3, f4, f2, f4);
        composer.OooO0o0(693286680);
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(oooOOOO, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO0oo);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function0 = function6;
            composer.OooOoO0(function0);
        } else {
            function0 = function6;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function7 = function0;
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r9, composer, oooO3, r7, composer, layoutDirection3, r4, composer, o00ooooo4, r36, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        String eventTagIcon = eventModel.getEventTagIcon();
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o2 = p114o00O00o.OooOOOO.OooO00o(o0o0o0o5, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o2 = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0o0o0o6));
        c0072OooO00o2.f9912OooO0OO = eventTagIcon;
        p114o00O00o.OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o2, oooOO0OooO00o2, composer);
        float f5 = 11;
        Oooo0.o00.OooO00o(oooOo00OooO0O0, null, SizeKt.OooOO0(oooO00o2, f5), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 432, 120);
        o0000oo.OooO0O0(f4, null, composer, 6, 2);
        String eventTag = eventModel.getEventTag();
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41693OooO0OO;
        o000O0O0.OooO0OO(eventTag, null, j, o0000O0O.o00Oo0.OooO0OO(10), null, null, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3456, 0, 32754);
        o0O0OO0.OooO00o(composer);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4170OooO;
        Intrinsics.checkNotNullParameter(oooO00o2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function8 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function9 = o00oOoo.f6560OooO00o;
        p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
        Intrinsics.checkNotNullParameter(other, "other");
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(other), 27);
        List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(o0000O0.f41692OooO0O0), new o00000O0(o00000OO.OooO0OO(2785017856L))});
        Intrinsics.checkNotNullParameter(colors, "colors");
        long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long jOooO00o2 = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.POSITIVE_INFINITY);
        Intrinsics.checkNotNullParameter(colors, "colors");
        o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(BackgroundKt.OooO00o(o00oooo0OooO0oO, new o000OO(colors, jOooO00o, jOooO00o2, 0), p033OoooO00.o00O0O.OooO0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, f, 3), 4), f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, 6);
        o000000 o000000VarOooO00o3 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, o00OO0O0.OooO00o.f4183OooOOO0, composer, -1323940314);
        o0000O0O.OooO oooO4 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
        LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
        o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o00Oo0.OooO0O0(o00oooo0OooO2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function1 = function7;
            composer.OooOoO0(function1);
        } else {
            function1 = function7;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function10 = function1;
        ((o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o3, r9, composer, oooO4, r7, composer, layoutDirection4, r4, composer, o00ooooo5, r36, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        if (eventModel.getEventState() == EventModel.State.INSTANCE.getInProgress()) {
            composer.OooO0o0(-967508970);
            o000000 o000000VarOooO00o4 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
            o0000O0O.OooO oooO5 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
            LayoutDirection layoutDirection5 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
            o00OOOOo o00ooooo6 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O4 = o00Oo0.OooO0O0(oooO00o2);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                function4 = function10;
                composer.OooOoO0(function4);
            } else {
                function4 = function10;
                composer.Oooo00O();
            }
            ((o00) function3OooO0O4).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o4, r9, composer, oooO5, r7, composer, layoutDirection5, r4, composer, o00ooooo6, r36, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.mipmap.ic_explore_event_yellow, composer), null, SizeKt.OooOO0(oooO00o2, f5), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Room_Event_Live_Now, composer), PaddingKt.OooO(oooO00o2, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), o00000OO.OooO0OO(4294943263L), o0000O0O.o00Oo0.OooO0OO(11), null, null, null, 0L, null, null, 0L, 0, false, 1, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3504, 3072, 24560);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            oooO00o = oooO00o2;
            function3 = function4;
            o0o0o0o0 = o0o0o0o4;
            o0o0o0o1 = o0o0o0o3;
            i2 = 0;
        } else {
            i2 = 0;
            composer.OooO0o0(-967508218);
            o000000 o000000VarOooO00o5 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, o00OO0O0.OooO00o.f4181OooOO0o, composer, -1323940314);
            o0000O0O.OooO oooO6 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
            LayoutDirection layoutDirection6 = (LayoutDirection) composer.OooOO0o(o0o0o0o3);
            o00OOOOo o00ooooo7 = (o00OOOOo) composer.OooOO0o(o0o0o0o4);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O5 = o00Oo0.OooO0O0(oooO00o2);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                function2 = function10;
                composer.OooOoO0(function2);
            } else {
                function2 = function10;
                composer.Oooo00O();
            }
            function3 = function2;
            o0o0o0o0 = o0o0o0o4;
            o0o0o0o1 = o0o0o0o3;
            ((o00) function3OooO0O5).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o5, r9, composer, oooO6, r7, composer, layoutDirection6, r4, composer, o00ooooo7, r36, composer, "composer", composer), composer, 0);
            oooO00o = oooO00o2;
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_explore_event_time, composer), null, SizeKt.OooOO0(oooO00o, f5), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o000O0O0.OooO0OO(o00O0.f48624OooO00o.OooO0oO(eventModel.getEventStartTime()), PaddingKt.OooO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), j, o0000O0O.o00Oo0.OooO0OO(11), null, null, null, 0L, null, null, 0L, 0, false, 1, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3504, 3072, 24560);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        o00OO0O.OooOO0O.OooO00o(composer);
        o0000oo.OooO0OO(f2, null, composer, 6, 2);
        String eventName = eventModel.getEventName();
        long jOooO0oO = u.OooO0O0(composer).OooO0oO();
        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(13);
        o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(oooO00o, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        oo0o0Oo oo0o0oo = new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431);
        o0000O00.OooO00o oooO00o3 = o0000O00.f27125Oooo0oO;
        o000O0O0.OooO0OO(eventName, o00oooo0OooO0oO2, jOooO0oO, jOooO0OO, null, o0000O00.f27131OoooOO0, null, 0L, null, null, 0L, 2, false, 1, null, oo0o0oo, composer, 199728, 3120, 22480);
        o0000oo.OooO0OO(f2, null, composer, 6, 2);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        o00OOOO0 o00oooo0OooO0oO3 = PaddingKt.OooO0oO(oooO00o, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        o000000 o000000VarOooO00o6 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
        o0000O0O.OooO oooO7 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o2);
        LayoutDirection layoutDirection7 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo8 = (o00OOOOo) composer.OooOO0o(o0o0o0o0);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O6 = o00Oo0.OooO0O0(o00oooo0OooO0oO3);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function3);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O6).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o6, r9, composer, oooO7, r7, composer, layoutDirection7, r4, composer, o00ooooo8, r36, composer, "composer", composer), composer, Integer.valueOf(i2));
        Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_explore_event_room, composer), null, SizeKt.OooOO0(oooO00o, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        o0000oo.OooO0O0(f4, null, composer, 6, 2);
        o000O0O0.OooO0OO(eventModel.getRoomName(), SizeKt.OooOOO0(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 120, 1), u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(11), null, null, null, 0L, null, null, 0L, 2, false, 1, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3120, 3120, 22512);
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
        oo0oooOooOo.OooO00o(new o00OO0O.Oooo000(eventModel, i));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0OO(oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1175950004);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 12;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(BorderKt.OooO0O0(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooOO0o(oooO00o, 68), 90), p033OoooO00.o00O0O.OooO0OO(f)), o00000OO.OooO0OO(4294440951L), o000O0Oo.f32099OooO00o), (float) 0.5d, o00000OO.OooO0OO(4293059298L), p033OoooO00.o00O0O.OooO0OO(f)), false, false, null, o00OO0O.o000oOoO.f31369Oooo0o, KotlinVersion.MAX_COMPONENT_VALUE);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooO0O0 oooO0O0 = p028Oooo0o0.o00O000.f2033OooO0o;
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            o000000 o000000VarOooO00o = oo00o.OooO00o(oooO0O0, oooO00o2, composer);
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
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -1163856341, R.drawable.ic_explore_event_more, composer), null, o000O0o.OooO0OO(SizeKt.OooOO0(oooO00o, 24), composer), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
            o0000oo.OooO0OO(3, null, composer, 6, 2);
            o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.explore_event_more, composer), PaddingKt.OooO0oO(oooO00o, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), o00000OO.OooO0OO(4284440415L), o0000O0O.o00Oo0.OooO0OO(11), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, new oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3504, 0, 32240);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00OO0O.o0OoOo0(i));
    }

    public static final void OooO0Oo(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
