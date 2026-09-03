package p430o0OoOOO0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f45755OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HeaderLayout f45756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f45758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f45759OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45760OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(MutableState mutableState, o000OO00 o000oo01, PrivateChatAdapter privateChatAdapter, HeaderLayout headerLayout, UserBlackVM userBlackVM, PrivateChatVM privateChatVM) {
        super(1);
        this.f45756OooO0Oo = headerLayout;
        this.f45758OooO0o0 = mutableState;
        this.f45757OooO0o = o000oo01;
        this.f45759OooO0oO = userBlackVM;
        this.f45760OooO0oo = privateChatVM;
        this.f45755OooO = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            HeaderLayout headerLayout = this.f45756OooO0Oo;
            headerLayout.OooOo(oO00OOO.ic_toolbar_more_black, new o000OO0O(this.f45758OooO0o0, this.f45757OooO0o, this.f45755OooO, headerLayout, this.f45759OooO0oO, this.f45760OooO0oo));
        } else {
            this.f45756OooO0Oo.OooOo(oO00OOO.icon_message_profile, new o000O0O0(this.f45758OooO0o0, this.f45757OooO0o, this.f45760OooO0oo));
        }
        return Unit.INSTANCE;
    }
}
