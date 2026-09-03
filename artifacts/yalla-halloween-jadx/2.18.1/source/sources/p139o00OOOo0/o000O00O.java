package p139o00OOOo0;

import Oooo000.OooO0o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.OooO00o;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o00O0OOO;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000000O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OO00;
import p261o00ooOoO.u;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31782Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f31783Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f31784Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(RoomUserInfoModel roomUserInfoModel, Integer num, o0O00OO<Boolean> o0o00oo2) {
        super(2);
        this.f31782Oooo0o = roomUserInfoModel;
        this.f31783Oooo0oO = num;
        this.f31784Oooo0oo = o0o00oo2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0152  */
    /* JADX WARN: Code duplicated, block: B:39:0x015b  */
    /* JADX WARN: Code duplicated, block: B:40:0x015f  */
    /* JADX WARN: Code duplicated, block: B:43:0x019e  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0204  */
    /* JADX WARN: Code duplicated, block: B:49:0x021b  */
    /* JADX WARN: Code duplicated, block: B:50:0x021e  */
    /* JADX WARN: Code duplicated, block: B:52:0x022a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0232  */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        OooO00o OooO00o2;
        String strOooO0OO;
        boolean z;
        String str;
        OooO00o oooO00o;
        o00OOOO0.OooO00o oooO00o2;
        o00OO0OO.OooO00o alignment;
        o0O00OO<Boolean> o0o00oo2;
        o000000 o000000VarOooO00o;
        OooO oooO;
        LayoutDirection layoutDirection;
        o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        oOO00O ooo00o2;
        oOO00O ooo00o3;
        String str2;
        oOO00O composer = ooo00o;
        if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int roomMemberType = this.f31782Oooo0o.getRoomMemberType();
            if (roomMemberType != 0) {
                if (roomMemberType != 1) {
                    if (roomMemberType == 2) {
                        OooO00o2 = o000O0O0.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.remove_room_title), o000O0O0.OooO0OO(R.string.admin)), o000O0O0.OooO0OO(R.string.admin), 4294951737L, 452969273L);
                        strOooO0OO = o000O0O0.OooO0OO(R.string.remove_member_room);
                        Integer num2 = this.f31783Oooo0oO;
                        if (num2 != null && num2.intValue() == 2) {
                        }
                    } else if (roomMemberType != 3) {
                        OooO00o2 = null;
                        strOooO0OO = null;
                    } else {
                        OooO00o2 = o000O0O0.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.remove_room_title), o000O0O0.OooO0OO(R.string.Member)), o000O0O0.OooO0OO(R.string.Member), 4278245577L, 436263113L);
                        strOooO0OO = o000O0O0.OooO0OO(R.string.remove_member_room);
                        Integer num3 = this.f31783Oooo0oO;
                        if (num3 != null && num3.intValue() == 2) {
                        }
                    }
                    oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
                    o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o2);
                    alignment = o00OO0O0.OooO00o.f4184OooOOOO;
                    o0o00oo2 = this.f31784Oooo0oo;
                    composer.OooO0o0(-483455358);
                    p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                    o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, alignment, composer);
                    composer.OooO0o0(-1323940314);
                    oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
                    layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                    o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                    Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                    function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                    function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o);
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
                    o000000O.OooO0O0(composer, 2058660585, -1163856341, 1368893764);
                    if (oooO00o == null) {
                        ooo00o2 = composer;
                    } else {
                        long jOooO0OO = o000OO00.OooO0OO(18, composer);
                        long jOooO0o = u.OooO0O0(composer).OooO0o();
                        o0000O00.OooO00o oooO00o3 = o0000O00.f27125Oooo0oO;
                        o0000O00 o0000o00 = o0000O00.f27127OoooO;
                        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                        Intrinsics.checkNotNullParameter(o00oooo0OooO0oO, "<this>");
                        Intrinsics.checkNotNullParameter(alignment, "alignment");
                        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                        ooo00o2 = composer;
                        p031OoooO.o000O0O0.OooO0O0(oooO00o, o00oooo0OooO0oO.OooOOoo(new o00O0OOO(alignment)), jOooO0o, jOooO0OO, null, o0000o00, null, 0L, null, null, 0L, 0, false, 0, null, null, null, ooo00o2, 196608, 0, 131024);
                    }
                    ooo00o2.Oooo0o0();
                    if (z) {
                        ooo00o3 = ooo00o2;
                        o0000oo.OooO0OO(15, null, ooo00o3, 6, 2);
                        o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        p251o00ooO.o000O00O.OooO00o(o00oooo0OooO0oO2, str2, o0o00oo2, ooo00o3, 390, 0);
                    } else {
                        ooo00o3 = ooo00o2;
                    }
                    o0O0OO0.OooO00o(ooo00o3);
                } else {
                    OooO00o2 = o000O0O0.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.remove_room_title), o000O0O0.OooO0OO(R.string.title_RoomPerson_roomer)), o000O0O0.OooO0OO(R.string.title_RoomPerson_roomer), 4294863980L, 452881516L);
                    strOooO0OO = null;
                }
                oooO00o = OooO00o2;
                str = strOooO0OO;
                z = false;
                oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o2 = SizeKt.OooO0o(oooO00o2);
                alignment = o00OO0O0.OooO00o.f4184OooOOOO;
                o0o00oo2 = this.f31784Oooo0oo;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o002 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, alignment, composer);
                composer.OooO0o0(-1323940314);
                oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o2);
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
                o000000O.OooO0O0(composer, 2058660585, -1163856341, 1368893764);
                if (oooO00o == null) {
                    ooo00o2 = composer;
                } else {
                    long jOooO0OO2 = o000OO00.OooO0OO(18, composer);
                    long jOooO0o2 = u.OooO0O0(composer).OooO0o();
                    o0000O00.OooO00o oooO00o4 = o0000O00.f27125Oooo0oO;
                    o0000O00 o0000o01 = o0000O00.f27127OoooO;
                    o00OOOO0 o00oooo0OooO0oO3 = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                    Intrinsics.checkNotNullParameter(o00oooo0OooO0oO3, "<this>");
                    Intrinsics.checkNotNullParameter(alignment, "alignment");
                    Function1<o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
                    Function1<o00O000o, Unit> function5 = o00oOoo.f6560OooO00o;
                    ooo00o2 = composer;
                    p031OoooO.o000O0O0.OooO0O0(oooO00o, o00oooo0OooO0oO3.OooOOoo(new o00O0OOO(alignment)), jOooO0o2, jOooO0OO2, null, o0000o01, null, 0L, null, null, 0L, 0, false, 0, null, null, null, ooo00o2, 196608, 0, 131024);
                }
                ooo00o2.Oooo0o0();
                if (z) {
                    ooo00o3 = ooo00o2;
                    o0000oo.OooO0OO(15, null, ooo00o3, 6, 2);
                    o00OOOO0 o00oooo0OooO0oO4 = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    p251o00ooO.o000O00O.OooO00o(o00oooo0OooO0oO4, str2, o0o00oo2, ooo00o3, 390, 0);
                } else {
                    ooo00o3 = ooo00o2;
                }
                o0O0OO0.OooO00o(ooo00o3);
            } else {
                OooO00o2 = o000O0O0.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.remove_room_title), o000O0O0.OooO0OO(R.string.guest)), o000O0O0.OooO0OO(R.string.guest), 4288256409L, 442852709L);
                strOooO0OO = o000O0O0.OooO0OO(R.string.remove_guest_room);
                Integer num4 = this.f31783Oooo0oO;
                if (num4 != null) {
                    num4.intValue();
                }
            }
            oooO00o = OooO00o2;
            str = strOooO0OO;
            z = true;
            oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o3 = SizeKt.OooO0o(oooO00o2);
            alignment = o00OO0O0.OooO00o.f4184OooOOOO;
            o0o00oo2 = this.f31784Oooo0oo;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o003 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, alignment, composer);
            composer.OooO0o0(-1323940314);
            oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o3);
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
            o000000O.OooO0O0(composer, 2058660585, -1163856341, 1368893764);
            if (oooO00o == null) {
                ooo00o2 = composer;
            } else {
                long jOooO0OO3 = o000OO00.OooO0OO(18, composer);
                long jOooO0o3 = u.OooO0O0(composer).OooO0o();
                o0000O00.OooO00o oooO00o5 = o0000O00.f27125Oooo0oO;
                o0000O00 o0000o02 = o0000O00.f27127OoooO;
                o00OOOO0 o00oooo0OooO0oO5 = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                Intrinsics.checkNotNullParameter(o00oooo0OooO0oO5, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function7 = o00oOoo.f6560OooO00o;
                ooo00o2 = composer;
                p031OoooO.o000O0O0.OooO0O0(oooO00o, o00oooo0OooO0oO5.OooOOoo(new o00O0OOO(alignment)), jOooO0o3, jOooO0OO3, null, o0000o02, null, 0L, null, null, 0L, 0, false, 0, null, null, null, ooo00o2, 196608, 0, 131024);
            }
            ooo00o2.Oooo0o0();
            if (z) {
                ooo00o3 = ooo00o2;
                o0000oo.OooO0OO(15, null, ooo00o3, 6, 2);
                o00OOOO0 o00oooo0OooO0oO6 = PaddingKt.OooO0oO(oooO00o2, 25, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                p251o00ooO.o000O00O.OooO00o(o00oooo0OooO0oO6, str2, o0o00oo2, ooo00o3, 390, 0);
            } else {
                ooo00o3 = ooo00o2;
            }
            o0O0OO0.OooO00o(ooo00o3);
        }
        return Unit.INSTANCE;
    }
}
