package p502o0o00oOO;

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
import p641o0ooOOOO.w0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatGiftBlindNotifyVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatGiftBlindNotifyVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatGiftBlindNotifyVH\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class oO00OOO extends o0OOO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f49542OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f49543OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final w0 f49544OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f49545OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49546OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49542OooO0OO = 3;
        this.f49543OooO0Oo = 2;
        this.f49545OooO0o0 = 1;
        w0 w0VarOooO00o = w0.OooO00o(view);
        Intrinsics.checkNotNullExpressionValue(w0VarOooO00o, "bind(view)");
        this.f49544OooO0o = w0VarOooO00o;
    }
}
