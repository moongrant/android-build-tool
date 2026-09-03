package p519o0o0O0oO;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.ui.activity.room.PacketHistoryActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52873OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(oO0o0000 oo0o0000) {
        super(1);
        this.f52873OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        this.f52873OooO0Oo.OooOO0O(false);
        int i = PacketHistoryActivity.f26613OooOo00;
        Context context = setNoDoubleClickListener.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        LucklyPacket$Type type = o00Oo0.OooO0oo().OooOOo() ? LucklyPacket$Type.Gift : LucklyPacket$Type.Coin;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intent intent = new Intent(context, (Class<?>) PacketHistoryActivity.class);
        intent.putExtra("packet_type", type.getValue());
        context.startActivity(intent);
        return Unit.INSTANCE;
    }
}
