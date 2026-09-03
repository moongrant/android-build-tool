package p598o0oo00O;

import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000OOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f47786Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ StoreRoomChatBubbleModel f47787Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47788Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(oO0Oo0oo oo0oo0oo, StoreRoomChatBubbleModel storeRoomChatBubbleModel, int i) {
        super(2);
        this.f47786Oooo0o = oo0oo0oo;
        this.f47787Oooo0oO = storeRoomChatBubbleModel;
        this.f47788Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0Oo0oo.OooO0oo(this.f47786Oooo0o, this.f47787Oooo0oO, ooo00o, this.f47788Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
