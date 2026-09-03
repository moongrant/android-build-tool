package p579o0oOoOOo;

import Oooo0.oo00oO;
import Oooo000.o00oO0o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShareChannel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
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
import p028Oooo0o0.o00O0OOO;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
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
import p145o00Oo0.o000O0Oo;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p257o00ooOO0.o0OoO00O;
import p261o00ooOoO.u;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;
import p604o0oo00oO.oO000OOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class s0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final s0 f46279OooO00o = new s0();

    public /* synthetic */ class OooO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            iArr[ShareChannel.Friends.ordinal()] = 1;
            iArr[ShareChannel.Moments.ordinal()] = 2;
            iArr[ShareChannel.Facebook.ordinal()] = 3;
            iArr[ShareChannel.Twitter.ordinal()] = 4;
            iArr[ShareChannel.Instagram.ordinal()] = 5;
            iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShareType.values().length];
            iArr2[ShareType.User.ordinal()] = 1;
            iArr2[ShareType.Theme.ordinal()] = 2;
            iArr2[ShareType.Topic.ordinal()] = 3;
            iArr2[ShareType.Moment.ordinal()] = 4;
            iArr2[ShareType.Web.ordinal()] = 5;
            iArr2[ShareType.Room.ordinal()] = 6;
            iArr2[ShareType.Events.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f46280Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f46282Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46283Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46284OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46285OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f46286OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO000OOo oo000ooo, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f46282Oooo0oO = oo000ooo;
            this.f46283Oooo0oo = z;
            this.f46280Oooo = z2;
            this.f46285OoooO00 = function0;
            this.f46284OoooO0 = i;
            this.f46286OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            s0.this.OooO00o(this.f46282Oooo0oO, this.f46283Oooo0oo, this.f46280Oooo, this.f46285OoooO00, ooo00o, this.f46284OoooO0 | 1, this.f46286OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f46287Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f46288Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f46289Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46290Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, oO000OOo oo000ooo, boolean z2, int i) {
            super(2);
            this.f46288Oooo0o = z;
            this.f46289Oooo0oO = oo000ooo;
            this.f46290Oooo0oo = z2;
            this.f46287Oooo = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        /* JADX WARN: Type inference failed for: r25v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            long j;
            long j2;
            long jOooO0o;
            Object obj;
            OooO0o oooO0o;
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                float f = 16;
                o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(SizeKt.OooO0o(oooO00o), o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
                if (this.f46288Oooo0o) {
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    j = o0000O0.f41762o00000oO;
                } else {
                    o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                    j = o0000O0.f41693OooO0OO;
                }
                o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, j, o000O0Oo.f32099OooO00o);
                float f2 = 1;
                if (this.f46288Oooo0o) {
                    o0000O0 o0000o3 = o0000O0.f41691OooO00o;
                    j2 = o0000O0.f41775o0000Ooo;
                } else {
                    o0000O0 o0000o4 = o0000O0.f41691OooO00o;
                    j2 = o0000O0.f41693OooO0OO;
                }
                o00OOOO0 o00oooo0OooO0O1 = BorderKt.OooO0O0(o00oooo0OooO0O0, f2, j2, o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
                boolean z = this.f46288Oooo0o;
                oO000OOo oo000ooo = this.f46289Oooo0oO;
                boolean z2 = this.f46290Oooo0oo;
                int i = this.f46287Oooo;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
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
                ?? r13 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO00o, r13);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r2);
                ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r3);
                ?? r25 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r25, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                float f3 = 24;
                o0000oo.OooO0OO(f3, null, composer, 6, 2);
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Share_to);
                long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(17);
                composer.OooO0o0(-181098753);
                if (z) {
                    o0000O0 o0000o5 = o0000O0.f41691OooO00o;
                    jOooO0o = o0000O0.f41693OooO0OO;
                } else {
                    jOooO0o = u.OooO0O0(composer).OooO0o();
                }
                long j3 = jOooO0o;
                composer.Oooo0o0();
                o00OO0OO.OooO00o alignment = o00OO0O0.OooO00o.f4184OooOOOO;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                o00O0OOO other = new o00O0OOO(alignment);
                Intrinsics.checkNotNullParameter(other, "other");
                p031OoooO.o000O0O0.OooO0OO(strOooO0OO, other, j3, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65520);
                o0000oo.OooO0OO(f3, null, composer, 6, 2);
                o00OOOO0 o00oooo0OooO00o2 = oo00oO.OooO00o(oooO00o, oo00oO.OooO0O0(composer, 1));
                composer.OooO0o0(693286680);
                o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO00o2);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r13, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r25, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-678309503);
                ShareType shareTypeOooO0O0 = oo000ooo.OooO0O0();
                composer.OooO0o0(-181098445);
                if (shareTypeOooO0O0 != null) {
                    ShareModel shareModel = (ShareModel) oo000ooo.f48284OooO0OO.getValue();
                    if (shareModel != null) {
                        ShareType shareTypeOooO0O1 = oo000ooo.OooO0O0();
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        composer.OooO0o0(511388516);
                        boolean zOooo0oo = composer.Oooo0oo(shareTypeOooO0O1) | composer.Oooo0oo(boolValueOf);
                        Object objOooO0o = composer.OooO0o();
                        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                            obj = objOooO0o;
                            ArrayList arrayList = new ArrayList();
                            switch (OooO.$EnumSwitchMapping$1[shareTypeOooO0O0.ordinal()]) {
                                case 1:
                                    arrayList.add(ShareChannel.Friends);
                                    break;
                                case 2:
                                    arrayList.add(ShareChannel.Friends);
                                    break;
                                case 3:
                                    arrayList.add(ShareChannel.Friends);
                                    break;
                                case 4:
                                    arrayList.add(ShareChannel.Friends);
                                    arrayList.add(ShareChannel.Moments);
                                    break;
                                case 5:
                                    if (z2) {
                                        arrayList.add(ShareChannel.Friends);
                                    }
                                    arrayList.add(ShareChannel.Moments);
                                    arrayList.add(ShareChannel.Facebook);
                                    arrayList.add(ShareChannel.Twitter);
                                    arrayList.add(ShareChannel.Instagram);
                                    arrayList.add(ShareChannel.WhatsApp);
                                    break;
                                case 6:
                                    arrayList.add(ShareChannel.Friends);
                                    arrayList.add(ShareChannel.Moments);
                                    arrayList.add(ShareChannel.Facebook);
                                    arrayList.add(ShareChannel.Twitter);
                                    arrayList.add(ShareChannel.Instagram);
                                    arrayList.add(ShareChannel.WhatsApp);
                                    break;
                                case 7:
                                    arrayList.add(ShareChannel.Friends);
                                    arrayList.add(ShareChannel.Moments);
                                    arrayList.add(ShareChannel.Facebook);
                                    arrayList.add(ShareChannel.Twitter);
                                    arrayList.add(ShareChannel.Instagram);
                                    arrayList.add(ShareChannel.WhatsApp);
                                    break;
                            }
                            composer.Oooo00o(arrayList);
                            obj = arrayList;
                        }
                        obj = objOooO0o;
                        composer.Oooo0o0();
                        for (ShareChannel shareChannel : (List) obj) {
                            s0 s0Var = s0.f46279OooO00o;
                            switch (OooO.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                                case 1:
                                    oooO0o = new OooO0o(R.drawable.icon_share_friends, o000O0O0.OooO0OO(R.string.Friends));
                                    break;
                                case 2:
                                    oooO0o = new OooO0o(R.drawable.icon_share_moment, o000O0O0.OooO0OO(R.string.moments));
                                    break;
                                case 3:
                                    oooO0o = new OooO0o(R.drawable.facebook, o000O0O0.OooO0OO(R.string.single_third_facebook));
                                    break;
                                case 4:
                                    oooO0o = new OooO0o(R.drawable.icon_share_twitter, o000O0O0.OooO0OO(R.string.single_third_twitter));
                                    break;
                                case 5:
                                    oooO0o = new OooO0o(R.drawable.icon_share_instagram, o000O0O0.OooO0OO(R.string.single_third_instagram));
                                    break;
                                case 6:
                                    oooO0o = new OooO0o(R.drawable.icon_share_whatapp, o000O0O0.OooO0OO(R.string.single_third_whatsApp));
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            s0.OooO0O0(s0Var, oooO0o.f46298OooO00o, oooO0o.f46299OooO0O0, z, new t0(shareTypeOooO0O0, shareModel, shareChannel, oo000ooo), composer, ((i << 3) & 896) | 24576);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                o0000oo.OooO0OO(f, null, composer, 6, 2);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f46291Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO000OOo f46293Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46294Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46295OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46296OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f46297OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(oO000OOo oo000ooo, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f46293Oooo0oO = oo000ooo;
            this.f46294Oooo0oo = z;
            this.f46291Oooo = z2;
            this.f46296OoooO00 = function0;
            this.f46295OoooO0 = i;
            this.f46297OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            s0.this.OooO00o(this.f46293Oooo0oO, this.f46294Oooo0oo, this.f46291Oooo, this.f46296OoooO00, ooo00o, this.f46295OoooO0 | 1, this.f46297OoooO0O);
            return Unit.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f46298OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f46299OooO0O0;

        public OooO0o(int i, @NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f46298OooO00o = i;
            this.f46299OooO0O0 = title;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f46298OooO00o == oooO0o.f46298OooO00o && Intrinsics.areEqual(this.f46299OooO0O0, oooO0o.f46299OooO0O0);
        }

        public final int hashCode() {
            return this.f46299OooO0O0.hashCode() + (this.f46298OooO00o * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ShareItemInfo(icon=");
            sbOooO0o0.append(this.f46298OooO00o);
            sbOooO0o0.append(", title=");
            return o00oO0o.OooO0O0(sbOooO0o0, this.f46299OooO0O0, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0O0(s0 s0Var, int i, String str, boolean z, Function0 function0, oOO00O ooo00o, int i2) {
        int i3;
        long jOooO0oO;
        Objects.requireNonNull(s0Var);
        oOO00O composer = ooo00o.OooOOo(802527369);
        if ((i2 & 14) == 0) {
            i3 = (composer.OooO(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.Oooo0oo(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composer.OooO0OO(z) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composer.Oooo0oo(function0) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
        }
        if ((i3 & 5851) == 1170 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooOO0o(oooO00o, 80), false, false, null, function0, 253);
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -1163856341, i, composer), null, SizeKt.OooOO0(oooO00o, 48), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0OO(10, null, composer, 6, 2);
            long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(13);
            composer.OooO0o0(63931298);
            if (z) {
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                jOooO0oO = o0000O0.f41697OooO0oO;
            } else {
                jOooO0oO = u.OooO0O0(composer).OooO0oO();
            }
            composer.Oooo0o0();
            p031OoooO.o000O0O0.OooO0OO(str, null, jOooO0oO, jOooO0OO, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i3 >> 3) & 14) | 3072, 0, 65522);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new u0(s0Var, i, str, z, function0, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull oO000OOo vm, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable oOO00O ooo00o, int i, int i2) {
        Intrinsics.checkNotNullParameter(vm, "vm");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(222473773);
        boolean z3 = (i2 & 2) != 0 ? false : z;
        boolean z4 = (i2 & 4) != 0 ? true : z2;
        Function0<Unit> function1 = (i2 & 8) != 0 ? null : function0;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (vm.OooO0O0() == null || ((ShareModel) vm.f48284OooO0OO.getValue()) == null) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO00o(vm, z3, z4, function1, i, i2));
            return;
        }
        o0OoO00O.OooO00o(vm.f48282OooO00o, false, false, function1, null, 80, R.style.WindowAnimBottomWithAlpha, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, -243614113, new OooO0O0(z3, vm, z4, i)), ooo00oOooOOo, (i & 7168) | 100663296, 150);
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0OO(vm, z3, z4, function1, i, i2));
    }
}
