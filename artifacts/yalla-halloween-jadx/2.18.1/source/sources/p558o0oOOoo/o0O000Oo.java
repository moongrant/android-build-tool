package p558o0oOOoo;

import Oooo000.o00Ooo;
import Oooo000.o0OOO0o;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p023Oooo00O.o0000O0;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.o0OoOo0;
import p023Oooo00O.o0ooOOo;
import p028Oooo0o0.o00O0O0O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.oo0o0Oo;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o00000O0;
import p145o00Oo0.o00000OO;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p442o0OoOo0.Oooo000;
import p498o0o00Oo0.OooOOO;
import p510o0o00oo0.o0O0O0O;
import p522o0o0O0o.o00O000o;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.j1;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000Oo f44748OooO00o = new o0O000Oo();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44750Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f44750Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O000Oo.this.OooO00o(ooo00o, this.f44750Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TreasureBoxOpenDialog> f44751Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TreasureBoxDialog> f44752Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<TreasureBoxOpenDialog> o0o00oo2, o0O00OO<TreasureBoxDialog> o0o00oo3) {
            super(1);
            this.f44751Oooo0o = o0o00oo2;
            this.f44752Oooo0oO = o0o00oo3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            o00OO00O.f43313OooooOo.OooO00o().f43364OoooOo0.postValue(null);
            TreasureBoxOpenDialog value = this.f44751Oooo0o.getValue();
            if (value != null && value.OooO0OO()) {
                value.OooO0O0();
            }
            this.f44751Oooo0o.setValue(null);
            TreasureBoxDialog value2 = this.f44752Oooo0oO.getValue();
            if (value2 != null && value2.OooO0OO()) {
                value2.OooO0O0();
            }
            this.f44752Oooo0oO.setValue(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TreasureBoxDialog> f44753Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00OO<TreasureBoxDialog> o0o00oo2) {
            super(1);
            this.f44753Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O000o0(this.f44753Oooo0o);
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ TreasureBoxProgressModel f44754Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TreasureBoxDialog> f44755Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44756Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TreasureBoxProgressModel treasureBoxProgressModel, o0O00OO<TreasureBoxDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f44754Oooo0o = treasureBoxProgressModel;
            this.f44755Oooo0oO = o0o00oo2;
            this.f44756Oooo0oo = mixedRoomActivity;
        }

        /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            Integer numValueOf;
            String str;
            Integer num2;
            boolean z;
            String str2;
            Integer numValueOf2;
            o00Ooo AnimatedVisibility = o00ooo2;
            oOO00O composer = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int boxLevel = this.f44754Oooo0o.getBoxLevel();
            if (boxLevel != 1) {
                if (boxLevel != 5) {
                    if (boxLevel != 10) {
                        str = null;
                        num2 = null;
                        str2 = str;
                        numValueOf2 = num2;
                        z = true;
                    } else if (this.f44754Oooo0o.getPercent() == 100) {
                        numValueOf2 = Integer.valueOf(R.drawable.ic_room_treasure_box_side_3_open);
                        str2 = null;
                        z = false;
                    } else if (this.f44754Oooo0o.getPercent() >= 90) {
                        str = "svga/anim_room_treasure_box_side_3.svga";
                        num2 = null;
                        str2 = str;
                        numValueOf2 = num2;
                        z = true;
                    } else {
                        numValueOf = Integer.valueOf(R.drawable.ic_room_treasure_box_side_3);
                        num2 = numValueOf;
                        str = null;
                        str2 = str;
                        numValueOf2 = num2;
                        z = true;
                    }
                } else if (this.f44754Oooo0o.getPercent() >= 90) {
                    str = "svga/anim_room_treasure_box_side_2.svga";
                    num2 = null;
                    str2 = str;
                    numValueOf2 = num2;
                    z = true;
                } else {
                    numValueOf = Integer.valueOf(R.drawable.ic_room_treasure_box_side_2);
                    num2 = numValueOf;
                    str = null;
                    str2 = str;
                    numValueOf2 = num2;
                    z = true;
                }
            } else if (this.f44754Oooo0o.getPercent() >= 90) {
                str = "svga/anim_room_treasure_box_side_1.svga";
                num2 = null;
                str2 = str;
                numValueOf2 = num2;
                z = true;
            } else {
                numValueOf = Integer.valueOf(R.drawable.ic_room_treasure_box_side_1);
                num2 = numValueOf;
                str = null;
                str2 = str;
                numValueOf2 = num2;
                z = true;
            }
            OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
            p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooO0o(oooO00o), false, false, null, new o0OoO00O(this.f44755Oooo0oO, this.f44756Oooo0oo), 253);
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
            TreasureBoxProgressModel treasureBoxProgressModel = this.f44754Oooo0o;
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, oooO00o2, composer);
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
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            if (!TextUtils.isEmpty(str2)) {
                composer.OooO0o0(630377);
                Intrinsics.checkNotNull(str2);
                o0O0O0O.OooO00o(str2, true, 0, null, SizeKt.OooOO0(oooO00o, 40), composer, 24624, 12);
                composer.Oooo0o0();
            } else if (numValueOf2 != null) {
                composer.OooO0o0(630620);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(numValueOf2.intValue(), composer), null, SizeKt.OooOO0(oooO00o, 40), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                composer.Oooo0o0();
            } else {
                composer.OooO0o0(630839);
                composer.Oooo0o0();
            }
            if (z) {
                o0000oo.OooO0OO(2, null, composer, 6, 2);
                oO0Oo oo0ooOooO0O0 = o0OoOo0.OooO0O0(treasureBoxProgressModel.getPercent() / 100.0f, o00oO0o.OooO0Oo(500, 0, o0000O0.f1051OooO00o, 2), composer, 0);
                p048OoooooO.o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(o0OOO0o.OooO00o(PaddingKt.OooO0oO(oooO00o, 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), null, 3), o00O0O.f3431OooO00o);
                float fFloatValue = ((Number) ((o0ooOOo) oo0ooOooO0O0).getValue()).floatValue();
                long jOooO0OO = o00000OO.OooO0OO(4293624878L);
                p507o0o00oOO.o0000O0 o0000o1 = p507o0o00oOO.o0000O0.f41691OooO00o;
                oo0o0Oo.OooO0O0(fFloatValue, o00oooo0OooO00o, jOooO0OO, p507o0o00oOO.o0000O0.f41696OooO0o0, composer, 3456, 0);
            }
            o0O0OO0.OooO00o(composer);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44758Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f44758Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O000Oo.this.OooO00o(ooo00o, this.f44758Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44760Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f44760Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O000Oo.this.OooO00o(ooo00o, this.f44760Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TreasureBoxOpenDialog> f44761Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ p047Oooooo0.o00OO0OO<Room.TreasureBoxDrawNotify> f44762Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44763Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00OO<TreasureBoxOpenDialog> o0o00oo2, p047Oooooo0.o00OO0OO<Room.TreasureBoxDrawNotify> o00oo0oo, MixedRoomActivity mixedRoomActivity) {
            super(1);
            this.f44761Oooo0o = o0o00oo2;
            this.f44762Oooo0oO = o00oo0oo;
            this.f44763Oooo0oo = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f44761Oooo0o.setValue(null);
            Room.TreasureBoxDrawNotify treasureBoxDrawNotify = (Room.TreasureBoxDrawNotify) CollectionsKt.getOrNull(this.f44762Oooo0oO, 0);
            if (treasureBoxDrawNotify != null) {
                p047Oooooo0.o00OO0OO<Room.TreasureBoxDrawNotify> o00oo0oo = this.f44762Oooo0oO;
                o0O00OO<TreasureBoxOpenDialog> o0o00oo2 = this.f44761Oooo0o;
                MixedRoomActivity mixedRoomActivity = this.f44763Oooo0oo;
                o00oo0oo.remove(0);
                o0O000Oo.f44748OooO00o.OooO0O0(treasureBoxDrawNotify, o00oo0oo, o0o00oo2, mixedRoomActivity);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-637745289);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            final MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            if (mixedRoomActivity == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(i));
                return;
            }
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new p047Oooooo0.o00OO0OO();
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            final p047Oooooo0.o00OO0OO o00oo0oo = (p047Oooooo0.o00OO0OO) objOooO0o;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo2 = (o0O00OO) objOooO0o2;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o3;
            Observable<Object> observable = LiveEventBus.get("ROOM_TREASURE_BOX_OPEN");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.ROOM_TREASURE_BOX_OPEN)");
            o00O000o.OooO00o(observable, new Observer() { // from class: o0oOOoo.o0OoOoOo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MixedRoomActivity activity = mixedRoomActivity;
                    p047Oooooo0.o00OO0OO<Room.TreasureBoxDrawNotify> notifyQueue = o00oo0oo;
                    o0O00OO<TreasureBoxOpenDialog> openDialog = o0o00oo2;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(notifyQueue, "$notifyQueue");
                    Intrinsics.checkNotNullParameter(openDialog, "$openDialog");
                    if (activity.f11461Oooo) {
                        o0O000Oo o0o000oo2 = o0O000Oo.f44748OooO00o;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.TreasureBoxDrawNotify");
                        Room.TreasureBoxDrawNotify treasureBoxDrawNotify = (Room.TreasureBoxDrawNotify) obj;
                        if (openDialog.getValue() != null) {
                            notifyQueue.add(treasureBoxDrawNotify);
                        } else {
                            o0o000oo2.OooO0O0(treasureBoxDrawNotify, notifyQueue, openDialog, activity);
                        }
                    }
                }
            }, ooo00oOooOOo, 72);
            Observable<Object> observable2 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(RoomEventKey.RESET_ROOM)");
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(o0o00oo3);
            Object objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o4 == c0323OooO00o) {
                objOooO0o4 = new OooO00o(o0o00oo2, o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observable2, new o00000O0((Function1) objOooO0o4, 2), ooo00oOooOOo, 72);
            Unit unit = Unit.INSTANCE;
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo3);
            Object objOooO0o5 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o5 == c0323OooO00o) {
                objOooO0o5 = new OooO0O0(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o5);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0O0(unit, (Function1) objOooO0o5, ooo00oOooOOo);
            TreasureBoxProgressModel treasureBoxProgressModel = (TreasureBoxProgressModel) p044OooooOO.o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43363OoooOOo, ooo00oOooOOo).getValue();
            if (treasureBoxProgressModel == null) {
                oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo2 == null) {
                    return;
                }
                oo0oooOooOo2.OooO00o(new OooOO0(i));
                return;
            }
            Oooo000.o00Oo0.OooO0Oo(treasureBoxProgressModel.getTimeId() != 0, PaddingKt.OooO(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), Oooo000.o000000.OooO0Oo(null, 3).OooO0O0(Oooo000.o000000.OooO0OO()), Oooo000.o000000.OooO0o0(null, 3).OooO0O0(Oooo000.o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, 350354335, new OooO0OO(treasureBoxProgressModel, o0o00oo3, mixedRoomActivity)), ooo00oOooOOo, 200112, 16);
        }
        oo0ooO oo0oooOooOo3 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo3 == null) {
            return;
        }
        oo0oooOooOo3.OooO00o(new OooO0o(i));
    }

    public final void OooO0O0(Room.TreasureBoxDrawNotify notify, p047Oooooo0.o00OO0OO<Room.TreasureBoxDrawNotify> o00oo0oo, o0O00OO<TreasureBoxOpenDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        String strOooO0OO;
        StringBuilder sbOooO00o;
        String string;
        o0o00oo2.setValue(new TreasureBoxOpenDialog(mixedRoomActivity));
        TreasureBoxOpenDialog value = o0o00oo2.getValue();
        if (value != null) {
            value.OooO00o(new OooOO0O(o0o00oo2, o00oo0oo, mixedRoomActivity));
        }
        TreasureBoxOpenDialog value2 = o0o00oo2.getValue();
        if (value2 != null) {
            Intrinsics.checkNotNullParameter(notify, "notify");
            value2.f23796o000oOoO = notify;
            LinearLayoutCompat linearLayoutCompat = value2.f23794OoooOO0.f50324OooOOO;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.vCountdown");
            p254o00ooO0O.oOO00O.OooO(linearLayoutCompat);
            LinearLayoutCompat linearLayoutCompat2 = value2.f23794OoooOO0.f50325OooOOO0;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.vAward");
            p254o00ooO0O.oOO00O.OooO00o(linearLayoutCompat2);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(value2.f41543Oooo0o);
            Room.TreasureBoxDrawNotify treasureBoxDrawNotify = value2.f23796o000oOoO;
            Object obj = null;
            if (treasureBoxDrawNotify == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify = null;
            }
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize$default(treasureBoxDrawNotify.getRoomboxTop().getHeadUrl(), OooOo00.OooO00o(60), false, 2, null);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0O0(2, o000O0O0.OooO00o(R.color.color_FFFCCB80)));
            oooO00o.OooO0o(value2.f23794OoooOO0.f50318OooO0o0);
            TextView textView = value2.f23794OoooOO0.f50312OooO;
            Room.TreasureBoxDrawNotify treasureBoxDrawNotify2 = value2.f23796o000oOoO;
            if (treasureBoxDrawNotify2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify2 = null;
            }
            textView.setText(treasureBoxDrawNotify2.getRoomboxTop().getNickName());
            Room.TreasureBoxDrawNotify treasureBoxDrawNotify3 = value2.f23796o000oOoO;
            if (treasureBoxDrawNotify3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify3 = null;
            }
            int roomboxLevel = treasureBoxDrawNotify3.getRoomboxLevel();
            if (roomboxLevel == 1) {
                value2.f23794OoooOO0.f50317OooO0o.OooO0oo("svga/anim_room_treasure_box_1.svga", value2.f23793OoooO);
            } else if (roomboxLevel == 5) {
                value2.f23794OoooOO0.f50317OooO0o.OooO0oo("svga/anim_room_treasure_box_2.svga", value2.f23793OoooO);
            } else if (roomboxLevel == 10) {
                value2.f23794OoooOO0.f50317OooO0o.OooO0oo("svga/anim_room_treasure_box_3.svga", value2.f23793OoooO);
            }
            value2.f23794OoooOO0.f50317OooO0o.setLoops(1);
            value2.f23794OoooOO0.f50317OooO0o.OooO();
            value2.f23794OoooOO0.f50317OooO0o.f21008Ooooo00 = new j1(value2);
            TextView textView2 = value2.f23794OoooOO0.f50323OooOO0o;
            Room.TreasureBoxDrawNotify treasureBoxDrawNotify4 = value2.f23796o000oOoO;
            if (treasureBoxDrawNotify4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("boxInfo");
                treasureBoxDrawNotify4 = null;
            }
            int roomboxLevel2 = treasureBoxDrawNotify4.getRoomboxLevel();
            if (roomboxLevel2 == 1) {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Treasure_Chest_Opened_1);
            } else if (roomboxLevel2 != 5) {
                strOooO0OO = roomboxLevel2 != 10 ? o000O0O0.OooO0OO(R.string.Treasure_Chest_Opened_1) : o000O0O0.OooO0OO(R.string.Treasure_Chest_Opened_3);
            } else {
                strOooO0OO = o000O0O0.OooO0OO(R.string.Treasure_Chest_Opened_2);
            }
            textView2.setText(strOooO0OO);
            List<Room.TreasureBoxDrawAwardUserModel> awardUsersList = notify.getAwardUsersList();
            Intrinsics.checkNotNullExpressionValue(awardUsersList, "notify.awardUsersList");
            for (Object obj2 : awardUsersList) {
                long userId = ((Room.TreasureBoxDrawAwardUserModel) obj2).getUserId();
                Long value3 = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value3 != null && userId == value3.longValue()) {
                    obj = obj2;
                    break;
                }
            }
            Room.TreasureBoxDrawAwardUserModel treasureBoxDrawAwardUserModel = (Room.TreasureBoxDrawAwardUserModel) obj;
            if (treasureBoxDrawAwardUserModel != null) {
                ImageView imageView = value2.f23794OoooOO0.f50314OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivAwardBg");
                p254o00ooO0O.oOO00O.OooO(imageView);
                TextView textView3 = value2.f23794OoooOO0.f50320OooO0oo;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvAward");
                p254o00ooO0O.oOO00O.OooO(textView3);
                ImageView imageView2 = value2.f23794OoooOO0.f50315OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivAwardNotWin");
                p254o00ooO0O.oOO00O.OooO0O0(imageView2);
                SVGAView sVGAView = value2.f23794OoooOO0.f50319OooO0oO;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaViewAward");
                p254o00ooO0O.oOO00O.OooO(sVGAView);
                String imageUrl = treasureBoxDrawAwardUserModel.getDynamicUrl();
                if (imageUrl.length() == 0) {
                    imageUrl = treasureBoxDrawAwardUserModel.getAwardImage();
                }
                SVGAView sVGAView2 = value2.f23794OoooOO0.f50319OooO0oO;
                Intrinsics.checkNotNullExpressionValue(imageUrl, "imageUrl");
                sVGAView2.OooO0oo(imageUrl, value2.f23793OoooO);
                sVGAView2.OooO();
                TextView textView4 = value2.f23794OoooOO0.f50320OooO0oo;
                if (treasureBoxDrawAwardUserModel.getAwardType() == 1) {
                    string = treasureBoxDrawAwardUserModel.getNums() + ' ' + o000O0O0.OooO0OO(R.string.days);
                } else {
                    if (oo000o.OooO0o0()) {
                        sbOooO00o = new StringBuilder();
                        sbOooO00o.append(treasureBoxDrawAwardUserModel.getNums());
                        sbOooO00o.append('x');
                    } else {
                        sbOooO00o = o00O0O0O.OooO00o('x');
                        sbOooO00o.append(treasureBoxDrawAwardUserModel.getNums());
                    }
                    string = sbOooO00o.toString();
                }
                textView4.setText(string);
                value2.f23794OoooOO0.f50322OooOO0O.setText(R.string.Treasure_box_win);
            } else {
                ImageView imageView3 = value2.f23794OoooOO0.f50315OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivAwardNotWin");
                p254o00ooO0O.oOO00O.OooO(imageView3);
                ImageView imageView4 = value2.f23794OoooOO0.f50314OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivAwardBg");
                p254o00ooO0O.oOO00O.OooO0O0(imageView4);
                SVGAView sVGAView3 = value2.f23794OoooOO0.f50319OooO0oO;
                Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.svgaViewAward");
                p254o00ooO0O.oOO00O.OooO0O0(sVGAView3);
                TextView textView5 = value2.f23794OoooOO0.f50320OooO0oo;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvAward");
                p254o00ooO0O.oOO00O.OooO0O0(textView5);
                value2.f23794OoooOO0.f50322OooOO0O.setText(R.string.Treasure_box_nothing);
            }
        }
        TreasureBoxOpenDialog value4 = o0o00oo2.getValue();
        if (value4 != null) {
            value4.OooOO0();
        }
    }
}
