package p534o0o0OOoo;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFriendRequestMessageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$5\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,266:1\n63#2,5:267\n*S KotlinDebug\n*F\n+ 1 FriendRequestMessageScreen.kt\ncom/yalla/yalla/ui/screen/message/FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$5\n*L\n109#1:267,5\n*E\n"})
public final class oO00OOOo extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53588OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(FriendRequestMessageVM friendRequestMessageVM) {
        super(1);
        this.f53588OooO0Oo = friendRequestMessageVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new oO00OOO(this.f53588OooO0Oo);
    }
}
