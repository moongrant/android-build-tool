package OooO;

import com.yallatech.support.platform.group.join.bean.GroupJoinRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends o00O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public GroupJoinRequest f7OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(@NotNull GroupJoinRequest groupJoinRequest) {
        super(groupJoinRequest);
        Intrinsics.checkNotNullParameter(groupJoinRequest, "groupJoinRequest");
        this.f7OooO0OO = groupJoinRequest;
    }
}
