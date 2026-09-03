package p433o0OoOOo;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.OooOo00;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomProcess.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomProcess$sendPicture$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
public final class oo0O extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOO00 f46040OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(o00OOO00 o00ooo01) {
        super(1);
        this.f46040OooO0Oo = o00ooo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uri;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uri = selectImageData2.OooO0O0()) != null) {
            this.f46040OooO0Oo.getClass();
            if (!OooOo00.OooO00o(uri) && MixedRoomDataSource.OooO0o0().f23460OooO0o != null) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                o00OOO0 listener = o00OOO0.f46002OooO0Oo;
                Intrinsics.checkNotNullParameter(listener, "listener");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00OO0O0(uri, listener, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
