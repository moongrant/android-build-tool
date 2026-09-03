package p433o0OoOOo;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomInputUIController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomInputUIController.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomInputUIController$initBottomPlaceHolder$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,137:1\n315#2:138\n329#2,4:139\n316#2:143\n*S KotlinDebug\n*F\n+ 1 RoomBottomInputUIController.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomInputUIController$initBottomPlaceHolder$1\n*L\n81#1:138\n81#1:139,4\n81#1:143\n*E\n"})
public final class o00OO000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO00O f45991OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(o00OO00O o00oo00o) {
        super(1);
        this.f45991OooO0Oo = o00oo00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        o00OO00O o00oo00o = this.f45991OooO0Oo;
        View messageInputPlaceHolder = o00oo00o.f45995OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(messageInputPlaceHolder, "messageInputPlaceHolder");
        ViewGroup.LayoutParams layoutParams = messageInputPlaceHolder.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Integer value = o00oo00o.f45993OooO0O0.getValue();
        layoutParams.height = value != null ? value.intValue() : 0;
        messageInputPlaceHolder.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }
}
