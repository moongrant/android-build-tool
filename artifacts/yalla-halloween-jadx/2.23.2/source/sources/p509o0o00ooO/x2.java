package p509o0o00ooO;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o00OO0OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatGiftBlindNotifyVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatGiftBlindNotifyVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatGiftBlindNotifyVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class x2 extends q1 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f50880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f50881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f50882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f50883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50884OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50880OooO0OO = 3;
        this.f50881OooO0Oo = 2;
        this.f50883OooO0o0 = 1;
        o00OO0OO o00oo0ooOooO00o = o00OO0OO.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(o00oo0ooOooO00o, "bind(...)");
        this.f50882OooO0o = o00oo0ooOooO00o;
    }
}
