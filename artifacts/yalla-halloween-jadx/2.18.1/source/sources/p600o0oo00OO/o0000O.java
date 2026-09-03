package p600o0oo00OO;

import Oooo0.Oooo0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.app.base.model.UserHeadFrameModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000000O;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p033OoooO00.o00O0O;
import p033OoooO00.o0OoOo0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
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
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o0O0ooO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p498o0o00Oo0.OooOOO;
import p507o0o00oOO.o0000O0;
import p571o0oOo0o.o00O0OO;
import p573o0oOoO.o0000O00;
import p578o0oOoOOO.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000O extends p584o0oOoo.o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000O f48009OooO00o = new o0000O();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48011Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48012Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(HeadFrameViewModel headFrameViewModel, int i) {
            super(2);
            this.f48011Oooo0oO = headFrameViewModel;
            this.f48012Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.this.OooO0o0(this.f48011Oooo0oO, ooo00o, this.f48012Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48013Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(HeadFrameViewModel headFrameViewModel) {
            super(0);
            this.f48013Oooo0o = headFrameViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f48013Oooo0o.getMTempShowUserHeaderFrameModel().getValue() != null) {
                UserHeadFrameModel value = this.f48013Oooo0o.getMTempShowUserHeaderFrameModel().getValue();
                Intrinsics.checkNotNull(value);
                if (value.getLocalTypeModel() == 1) {
                    UserHeadFrameModel value2 = this.f48013Oooo0o.getMTempShowUserHeaderFrameModel().getValue();
                    Intrinsics.checkNotNull(value2);
                    if (!Intrinsics.areEqual(value2.getPic(), OooOOO.f41216OooO00o.OooO0oo().getValue()) && this.f48013Oooo0o.getCurrentSelectPosition() >= 0) {
                        this.f48013Oooo0o.replaceHeadFrame();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f48015Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48016Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f48015Oooo0oO = o00o0o01;
            this.f48016Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.this.OooO00o(this.f48015Oooo0oO, ooo00o, this.f48016Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48017Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(HeadFrameViewModel headFrameViewModel) {
            super(0);
            this.f48017Oooo0o = headFrameViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f48017Oooo0o.getHeadFrameList();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48018Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(HeadFrameViewModel headFrameViewModel) {
            super(3);
            this.f48018Oooo0o = headFrameViewModel;
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
                o0000O00.OooO00o(null, o00O0000.OooO00o(ooo00o2, 627366319, new o000O00O(this.f48018Oooo0o)), ooo00o2, 48, 1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48020Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48021Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(HeadFrameViewModel headFrameViewModel, int i) {
            super(2);
            this.f48020Oooo0oO = headFrameViewModel;
            this.f48021Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.this.OooO0o(this.f48020Oooo0oO, ooo00o, this.f48021Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ HeadFrameViewModel f48023Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48024Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(HeadFrameViewModel headFrameViewModel, int i) {
            super(2);
            this.f48023Oooo0oO = headFrameViewModel;
            this.f48024Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.this.OooO0oO(this.f48023Oooo0oO, ooo00o, this.f48024Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO(o0000O o0000o2, int i, String str, float f, oOO00O ooo00o, int i2, int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        float f3;
        o00OOOO0.OooO00o oooO00o;
        o000000 o000000VarOooO00o;
        o0000O0O.OooO oooO;
        LayoutDirection layoutDirection;
        o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        oo0ooO oo0oooOooOo;
        Objects.requireNonNull(o0000o2);
        oOO00O composer = ooo00o.OooOOo(894015237);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composer.OooO(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composer.Oooo0oo(str) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    f2 = f;
                    if (composer.OooO0oO(f2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i4 & 731) == 146 || !composer.OooOo0()) {
                    if (i5 != 0) {
                        f3 = 0;
                    } else {
                        f3 = f2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                    o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
                    oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
                    composer.OooO0o0(693286680);
                    p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO);
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
                    Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                    o0000oo.OooO0O0(6, null, composer, 6, 2);
                    o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
                    o0O0OO0.OooO00o(composer);
                } else {
                    composer.OooOoo0();
                    f3 = f2;
                }
                oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new o000O0(o0000o2, i, str, f3, i2, i3));
            }
            i4 |= 384;
            f2 = f;
            if ((i4 & 731) == 146) {
                if (i5 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
                o00OO0OO.OooO0O0 oooO0O1 = o00OO0O0.OooO00o.f4181OooOO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO2 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o002 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O1, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO2);
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
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0000oo.OooO0O0(6, null, composer, 6, 2);
                o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
                o0O0OO0.OooO00o(composer);
            } else {
                if (i5 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                o00OO0OO.OooO0O0 oooO0O2 = o00OO0O0.OooO00o.f4181OooOO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO3 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o003 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O2, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO3);
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
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0000oo.OooO0O0(6, null, composer, 6, 2);
                o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
                o0O0OO0.OooO00o(composer);
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new o000O0(o0000o2, i, str, f3, i2, i3));
        }
        i4 |= 48;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 896) == 0) {
                f2 = f;
                if (composer.OooO0oO(f2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i4 & 731) == 146) {
                if (i5 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                o00OO0OO.OooO0O0 oooO0O3 = o00OO0O0.OooO00o.f4181OooOO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO4 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o004 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O3, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO4);
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
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0000oo.OooO0O0(6, null, composer, 6, 2);
                o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
                o0O0OO0.OooO00o(composer);
            } else {
                if (i5 != 0) {
                    f3 = 0;
                } else {
                    f3 = f2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function7 = oo0o0O0.f29705OooO00o;
                o00OO0OO.OooO0O0 oooO0O4 = o00OO0O0.OooO00o.f4181OooOO0o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO5 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o005 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O4, composer);
                composer.OooO0o0(-1323940314);
                oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO5);
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
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0000oo.OooO0O0(6, null, composer, 6, 2);
                o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
                o0O0OO0.OooO00o(composer);
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new o000O0(o0000o2, i, str, f3, i2, i3));
        }
        i4 |= 384;
        f2 = f;
        if ((i4 & 731) == 146) {
            if (i5 != 0) {
                f3 = 0;
            } else {
                f3 = f2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
            o00OO0OO.OooO0O0 oooO0O5 = o00OO0O0.OooO00o.f4181OooOO0o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO6 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o006 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O5, composer);
            composer.OooO0o0(-1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO6);
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
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(6, null, composer, 6, 2);
            o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
            o0O0OO0.OooO00o(composer);
        } else {
            if (i5 != 0) {
                f3 = 0;
            } else {
                f3 = f2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function9 = oo0o0O0.f29705OooO00o;
            o00OO0OO.OooO0O0 oooO0O6 = o00OO0O0.OooO00o.f4181OooOO0o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO7 = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, 5);
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o007 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O6, composer);
            composer.OooO0o0(-1323940314);
            oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO7);
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
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, 18), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(6, null, composer, 6, 2);
            o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, (i4 >> 3) & 14, 0, 65522);
            o0O0OO0.OooO00o(composer);
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000O0(o0000o2, i, str, f3, i2, i3));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0oo(o0000O o0000o2, int i, UserHeadFrameModel userHeadFrameModel, boolean z, Function3 function3, oOO00O ooo00o, int i2) {
        o00OOOO0 o00oooo0OooO00o;
        Objects.requireNonNull(o0000o2);
        oOO00O composer = ooo00o.OooOOo(1590193805);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        if (userHeadFrameModel.isLocalIsSelect()) {
            o0OoOo0 o0oooo0OooO0OO = o00O0O.OooO0OO(12);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00oooo0OooO00o = BorderKt.OooO00o(new Oooo0((float) 0.5d, new o0O0ooO(o0000O0.f41710OooOo0)), o0oooo0OooO0OO);
        } else {
            o00oooo0OooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        }
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooOO0(oooO00o, 82).OooOOoo(o00oooo0OooO00o), false, false, null, new o0000OO0(function3, userHeadFrameModel, i, z), 253);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        oO0O000 oo0o000 = oO0O000.f45783OooO00o;
        String pic = userHeadFrameModel.getPic();
        o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 77);
        o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
        Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        oo0o000.OooO0OO(pic, o00oooo0OooOO0.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), composer, 384, 0);
        if (userHeadFrameModel.getIsweared() == 1) {
            String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.header_frame_in_use);
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 5, 7);
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(BackgroundKt.OooO0O0(o00oooo0OooO, o0000O0.f41710OooOo0, o00O0O.OooO0OO(40)), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
            o00OO0OO alignment2 = o00OO0O0.OooO00o.f4170OooO;
            Intrinsics.checkNotNullParameter(o00oooo0OooO0oO, "<this>");
            Intrinsics.checkNotNullParameter(alignment2, "alignment");
            o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO0oO.OooOOoo(new p028Oooo0o0.o00O00O(alignment2, false));
            long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(12, composer);
            o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
            o000O0O0.OooO0OO(strOooO0OO, o00oooo0OooOOoo, o00000O0.f32067OooO0o0, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, composer, 384, 3072, 57328);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new o000(o0000o2, i, userHeadFrameModel, z, function3, i2));
    }

    /* JADX WARN: Type inference failed for: r24v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @Override // p584o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(2124933631);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
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
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r4);
            ?? r5 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r5);
            ?? r6 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r6);
            ?? r24 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r24, composer, "composer", composer), composer, 0);
            o000000O.OooO0O0(composer, 2058660585, -2137368960, 1729797275);
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
            ViewModel viewModel = ViewModelKt.viewModel(HeadFrameViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            HeadFrameViewModel headFrameViewModel = (HeadFrameViewModel) viewModel;
            o00OOOO0 o00oooo0OooO0o1 = SizeKt.OooO0o0(oooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooOo00 oooOo00 = p028Oooo0o0.o00O000.f2032OooO0Oo;
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4182OooOOO;
            o000000 o000000VarOooO00o = oo00o.OooO00o(oooOo00, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o1);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r4, composer, oooO2, r5, composer, layoutDirection2, r6, composer, o00ooooo3, r24, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            o0000O o0000o2 = f48009OooO00o;
            o0000o2.OooO0oO(headFrameViewModel, composer, 56);
            o0000o2.OooO0o0(headFrameViewModel, composer, 56);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            if (headFrameViewModel.getShowReplaceButton()) {
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                o00OO0OO alignment = o00OO0O0.OooO00o.f4170OooO;
                Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o00OOOO0 o00oooo0OooOOoo = o00oooo0OooO0o.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false));
                composer.OooO0o0(-483455358);
                o000000 o000000VarOooO00o2 = oo00o.OooO00o(oooOo00, oooO00o2, composer);
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
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r4, composer, oooO3, r5, composer, layoutDirection3, r6, composer, o00ooooo4, r24, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                p031OoooO.o00Oo0.OooO00o(null, u.OooO0O0(composer).OooOO0o(), (float) 0.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, composer, 384, 9);
                String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.user_info_header_frame_replace);
                o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o);
                o00000O0.OooO00o oooO00o3 = o00000O0.f32063OooO0O0;
                p.OooO0O0(strOooO0OO, 0L, null, false, false, null, null, null, null, null, null, null, SizeKt.OooO0oO(PaddingKt.OooO0o(BackgroundKt.OooO0O0(o00oooo0OooO0o2, o00000O0.f32067OooO0o0, o000O0Oo.f32099OooO00o), 20, 8), 36), new OooO00o(headFrameViewModel), composer, 0, 0, 4094);
                o0O0OO0.OooO00o(composer);
            }
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, i));
    }

    @Override // p584o0oOoo.o0000O
    @Composable
    public final long OooO0OO(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(1915570682);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41693OooO0OO;
        ooo00o.Oooo0o0();
        return j;
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(HeadFrameViewModel headFrameViewModel, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-657070726);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        composer.OooO0o0(733328855);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4172OooO0O0;
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
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(oooO00o);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r6);
        ?? r5 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r5);
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r2);
        ?? r16 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.bg_header_frame_head_bg, composer), null, SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 148), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 52, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13);
        o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
        o00OOOO0 o00oooo0OooO00o = boxScopeInstance.OooO00o(o00oooo0OooO, o00oo0oo2);
        o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r6, composer, oooO2, r5, composer, layoutDirection2, r2, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        oO0O000 oo0o000 = oO0O000.f45783OooO00o;
        String value = OooOOO.f41216OooO00o.OooO0oo().getValue();
        if (value == null) {
            value = "";
        }
        o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
        oo0o000.OooO0Oo(value, boxScopeInstance.OooO00o(SizeKt.OooOO0(oooO00o, 90), o00oo0oo2), 2, new o00000O0(o00000O0.f32067OooO0o0), false, composer, 200064, 16);
        UserHeadFrameModel value2 = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
        String pic = value2 != null ? value2.getPic() : null;
        composer.OooO0o0(155728299);
        if (pic != null) {
            oo0o000.OooO0OO(pic, boxScopeInstance.OooO00o(SizeKt.OooOO0(oooO00o, 125), o00oo0oo2), composer, 384, 0);
            Unit unit = Unit.INSTANCE;
        }
        composer.Oooo0o0();
        UserHeadFrameModel value3 = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(value3 != null && value3.getLocalTypeModel() == 0 ? R.drawable.icon_header_frame_title_not_unlock : R.drawable.icon_header_frame_title_unlock, composer), null, boxScopeInstance.OooO00o(SizeKt.OooOO0(PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 17, 7), 20), o00OO0O0.OooO00o.f4179OooOO0), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
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
        oo0oooOooOo.OooO00o(new OooOO0(headFrameViewModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(HeadFrameViewModel headFrameViewModel, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1065378774);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Unit unit = Unit.INSTANCE;
        ooo00oOooOOo.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(unit);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            headFrameViewModel.getHeadFrameList();
            ooo00oOooOOo.Oooo00o(null);
        }
        ooo00oOooOOo.Oooo0o0();
        o0O0o.OooO0o0(headFrameViewModel.getMContentState(), null, null, null, null, new OooO0OO(headFrameViewModel), o00O0000.OooO00o(ooo00oOooOOo, -315920217, new OooO0o(headFrameViewModel)), ooo00oOooOOo, 1572864, 30);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(headFrameViewModel, i));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(HeadFrameViewModel headFrameViewModel, oOO00O ooo00o, int i) {
        String strOooO0OO;
        oOO00O composer = ooo00o.OooOOo(-576188373);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        p254o00ooO0O.o00.OooO00o(o0000O0.f41759o00000OO, false, composer, 54);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0O0 = WindowInsetsPadding_androidKt.OooO0O0(SizeKt.OooO0o(oooO00o));
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        f48009OooO00o.OooO0o(headFrameViewModel, composer, 56);
        String strOooO0OO2 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.user_info_header_select_header_frame_title);
        o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
        o00O0OO.OooO00o(strOooO0OO2, o00000O0.f32067OooO0o0, 0, null, null, null, o00000O0.f32069OooO0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 1572912, 0, 1980);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        float f = 40;
        o000O0O0.OooO0OO(p254o00ooO0O.o000O0O0.OooO0OO(R.string.header_frame_lock_state), PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), u.OooO0O0(composer).OooO(), p617o0oo0o.o00Oo0.OooO00o(12, composer), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 1, null, null, composer, 48, 3072, 56816);
        UserHeadFrameModel value = headFrameViewModel.getMTempShowUserHeaderFrameModel().getValue();
        if (value == null || (strOooO0OO = value.getUnlocktext()) == null) {
            strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.header_frame_unlock_automatically);
        }
        o000O0O0.OooO0OO(strOooO0OO, PaddingKt.OooO0oO(SizeKt.OooO0oo(SizeKt.OooO0o(oooO00o), 53, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), u.OooO0O0(composer).OooO0o(), p617o0oo0o.o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 48, 0, 65008);
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(headFrameViewModel, i));
    }
}
