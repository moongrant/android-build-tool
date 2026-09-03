package p598o0oo00O;

import Oooo000.OooO0o;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.OooO00o;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O0OO0;
import p029Oooo0oO.oo00o;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0o;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0o0o extends Lambda implements Function4<oo00o, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f47886Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<StoreRoomChatBubbleModel> f47887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleMineVM f47888Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47889Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(OooO0OO<StoreRoomChatBubbleModel> oooO0OO, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, oO0Oo0oo oo0oo0oo, LifecycleOwner lifecycleOwner) {
        super(4);
        this.f47887Oooo0o = oooO0OO;
        this.f47888Oooo0oO = storeRoomChatBubbleMineVM;
        this.f47889Oooo0oo = oo0oo0oo;
        this.f47886Oooo = lifecycleOwner;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(oo00o oo00oVar, Integer num, oOO00O ooo00o, Integer num2) {
        long j;
        oo00o items = oo00oVar;
        int iIntValue = num.intValue();
        oOO00O composer = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer.OooO(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            StoreRoomChatBubbleModel storeRoomChatBubbleModelOooO0O0 = this.f47887Oooo0o.OooO0O0(iIntValue);
            if (storeRoomChatBubbleModelOooO0O0 != null) {
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(o00OOOO0.OooO00o.f4198Oooo0o);
                float f = 4;
                if (storeRoomChatBubbleModelOooO0O0.getSelected()) {
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    j = o0000O0.f41713OooOo0o;
                } else {
                    o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                    j = o0000O0.f41692OooO0O0;
                }
                o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(Oooo000.OooO00o(PaddingKt.OooO0o0(BorderKt.OooO0O0(o00oooo0OooO0o, f, j, o00O0O.OooO0OO(10)), f), o00O0O.OooO0OO(6)), false, false, null, new oO0Ooooo(storeRoomChatBubbleModelOooO0O0, this.f47888Oooo0oO, this.f47889Oooo0oo, this.f47886Oooo), 253);
                StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = this.f47888Oooo0oO;
                oO0Oo0oo oo0oo0oo = this.f47889Oooo0oo;
                LifecycleOwner lifecycleOwner = this.f47886Oooo;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = p028Oooo0o0.oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(OooO00o.f26575OooO0Oo);
                Function0<OooO00o> function0 = OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
                oO00000o.OooO0O0(composer, o000000VarOooO00o, OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                oO0Oo0oo oo0oo0oo2 = oO0Oo0oo.f47855OooO00o;
                oO0Oo0oo.OooO0oo(oo0oo0oo2, storeRoomChatBubbleModelOooO0O0, composer, 56);
                oO0Oo0oo.OooO(oo0oo0oo2, storeRoomChatBubbleModelOooO0O0, storeRoomChatBubbleMineVM, oo0oo0oo, lifecycleOwner, composer, 29256);
                o0O0OO0.OooO00o(composer);
            }
        }
        return Unit.INSTANCE;
    }
}
