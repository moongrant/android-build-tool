package p650o0ooo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.ui.activity.room.PacketHistoryActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58781OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(oO00OOOo oo00oooo) {
        super(1);
        this.f58781OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        this.f58781OooO0Oo.OooOO0O(false);
        int i = PacketHistoryActivity.f26159OooOo00;
        Context context = setNoDoubleClickListener.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LucklyPacket$Type type = o00Ooo.OooO0oo().OooOOo() ? LucklyPacket$Type.Gift : LucklyPacket$Type.Coin;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intent intent = new Intent(context, (Class<?>) PacketHistoryActivity.class);
        intent.putExtra("packet_type", type.getValue());
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
