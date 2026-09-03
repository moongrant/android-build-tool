package p544o0o0OoOO;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.CreateRoomVM;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.o0ooOOo;
import p516o0o0O000.o00oO0o;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44248Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f44248Oooo0o = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            CreateRoomActivity createRoomActivity = this.f44248Oooo0o;
            CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
            Objects.requireNonNull(createRoomActivity);
            Objects.requireNonNull(o0ooOOo.OooO00o());
            o000O o000o = new o000O();
            o000o.OooO0O0(createRoomActivity, R.string.uploading);
            CreateRoomVM createRoomVM = createRoomActivity.f22784Oooooo0;
            if (createRoomVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                createRoomVM = null;
            }
            createRoomVM.uploadRoomHeader(uriOooO0O0).observe(createRoomActivity, new o00oO0o(o000o, createRoomActivity, 1));
        }
        return Unit.INSTANCE;
    }
}
