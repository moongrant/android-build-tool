package p419o0Oo0ooo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.GraphResponse;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends Lambda implements Function1<List<? extends RoomMemberTaskModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final j4 f46599OooO0Oo = new j4();

    public j4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends RoomMemberTaskModel> list) {
        if (!StringsKt.isBlank(GraphResponse.SUCCESS_KEY)) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(GraphResponse.SUCCESS_KEY, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
