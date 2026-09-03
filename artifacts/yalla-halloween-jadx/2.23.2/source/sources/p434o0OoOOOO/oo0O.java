package p434o0OoOOOO;

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
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f46992OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HeaderLayout f46993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00OO f46994OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f46995OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f46996OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46997OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(MutableState mutableState, o00OO o00oo2, PrivateChatAdapter privateChatAdapter, HeaderLayout headerLayout, UserBlackVM userBlackVM, PrivateChatVM privateChatVM) {
        super(1);
        this.f46993OooO0Oo = headerLayout;
        this.f46995OooO0o0 = mutableState;
        this.f46994OooO0o = o00oo2;
        this.f46996OooO0oO = userBlackVM;
        this.f46997OooO0oo = privateChatVM;
        this.f46992OooO = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            HeaderLayout headerLayout = this.f46993OooO0Oo;
            headerLayout.OooOo(o0O0O00.ic_toolbar_more_black, new o00OO0O0(this.f46995OooO0o0, this.f46994OooO0o, this.f46992OooO, headerLayout, this.f46996OooO0oO, this.f46997OooO0oo));
        } else {
            this.f46993OooO0Oo.OooOo(o0O0O00.icon_message_profile, new o00OO0OO(this.f46995OooO0o0, this.f46994OooO0o, this.f46997OooO0oo));
        }
        return Unit.INSTANCE;
    }
}
