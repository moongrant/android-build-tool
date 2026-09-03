package p598o0oo00O;

import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47807Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0OoO f47808Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f47809Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleVM f47810Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(oO0O0OoO oo0o0ooo, StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleVM storeRoomChatBubbleVM, int i) {
        super(2);
        this.f47808Oooo0o = oo0o0ooo;
        this.f47809Oooo0oO = storeRoomChatBubbleModel;
        this.f47810Oooo0oo = storeRoomChatBubbleVM;
        this.f47807Oooo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0O0OoO.OooOO0(this.f47808Oooo0o, this.f47809Oooo0oO, this.f47810Oooo0oo, ooo00o, this.f47807Oooo | 1);
        return Unit.INSTANCE;
    }
}
