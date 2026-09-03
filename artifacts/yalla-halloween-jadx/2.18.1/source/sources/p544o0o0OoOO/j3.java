package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44255Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f44255Oooo0o = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            CreateRoomActivity createRoomActivity = this.f44255Oooo0o;
            Objects.requireNonNull(createRoomActivity);
            Oooo0.f33130OooO00o.OooO0O0(createRoomActivity, 1.0f, 1.0f, false, false, new i3(this.f44255Oooo0o));
        }
        return Unit.INSTANCE;
    }
}
